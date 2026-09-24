package org.jsoup.nodes;

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
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document1.text("hi!");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot(" hi!", " hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot(" hi!", " hi!");
        java.lang.Integer int11 = document1.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document1.lastElementSibling();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.select.Elements elements6 = document1.getElementsByIndexEquals(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document1.wrap("hi!");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str9 = document1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document1.lastElementSibling();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        org.jsoup.nodes.Element element13 = document1.prependText("hi!");
        org.jsoup.select.Elements elements14 = element13.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element13.firstElementSibling();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        org.jsoup.nodes.Element element13 = document1.prependText("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("hi!");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot(" hi!", " hi!");
        org.jsoup.select.Elements elements12 = document1.getElementsByIndexLessThan((int) (short) 0);
        java.lang.String str13 = document1.ownText();
        org.jsoup.nodes.Element element15 = document1.appendText("hi!");
        org.jsoup.nodes.Element element17 = document1.createElement("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element17.firstElementSibling();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot(" hi!", " hi!");
        org.jsoup.select.Elements elements12 = document1.getElementsByIndexLessThan((int) (short) 0);
        java.lang.String str13 = document1.ownText();
        org.jsoup.nodes.Element element15 = document1.appendText("hi!");
        org.jsoup.nodes.Element element17 = document1.createElement("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = document1.text("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot(" hi!", " hi!");
        org.jsoup.select.Elements elements12 = document1.getElementsByIndexLessThan((int) (byte) 1);
        java.lang.String str14 = document1.attr("head");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        org.jsoup.nodes.Element element10 = document1.appendText("hi!");
        java.lang.String str11 = document1.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document1.firstElementSibling();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element17 = document5.prependElement("#root");
        org.jsoup.nodes.Element element18 = document5.head();
        org.jsoup.nodes.Node node20 = document5.childNode((int) (short) 1);
        document5.remove();
        org.jsoup.parser.Tag tag22 = document5.tag();
        org.jsoup.nodes.Node node23 = document5.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = document5.firstElementSibling();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        org.jsoup.nodes.Element element13 = document1.prependText("hi!");
        java.util.Set<java.lang.String> strSet14 = document1.classNames();
        org.jsoup.nodes.Element element15 = document1.body();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        org.jsoup.nodes.Element element13 = document1.prependText("hi!");
        org.jsoup.nodes.Element element15 = document1.prepend("hi!");
        org.jsoup.select.Elements elements17 = document1.getElementsByIndexGreaterThan((int) (byte) 10);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList18 = document1.textNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = document1.firstElementSibling();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.select.Elements elements6 = document1.getElementsByIndexEquals(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document1.lastElementSibling();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document4 = document1.ownerDocument();
        org.jsoup.select.Elements elements6 = document1.getElementsByAttribute("#document");
        java.lang.String str7 = document1.title();
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.select.Elements elements10 = document8.getElementsByIndexEquals((int) (byte) 0);
        org.jsoup.nodes.Element element12 = document8.createElement("head");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = document8.wrap(" hi!");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot(" hi!", " hi!");
        org.jsoup.select.Elements elements12 = document1.getElementsByIndexLessThan((int) (byte) 1);
        org.jsoup.parser.Tag tag13 = document1.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = document1.text("hi!");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        org.jsoup.nodes.Element element13 = document1.prependText("hi!");
        java.util.Set<java.lang.String> strSet14 = document1.classNames();
        org.jsoup.nodes.Element element15 = document1.body();
        org.jsoup.nodes.Node node16 = document1.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document1.lastElementSibling();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        java.lang.String str12 = document1.nodeName();
        org.jsoup.nodes.Document document13 = document1.normalise();
        java.lang.String str14 = document13.baseUri();
        boolean boolean16 = document13.hasClass(" hi!");
        org.jsoup.nodes.Element element18 = document13.append("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element18.wrap("head");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        java.lang.String str12 = document1.nodeName();
        org.jsoup.nodes.Element element13 = document1.parent();
        java.lang.String str14 = document1.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = document1.text("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot(" hi!", " hi!");
        org.jsoup.select.Elements elements12 = document1.getElementsByIndexLessThan((int) (byte) 1);
        java.lang.Integer int13 = document1.elementSiblingIndex();
        java.lang.String str14 = document1.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("#document");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot(" hi!", " hi!");
        org.jsoup.select.Elements elements12 = document1.getElementsByIndexLessThan((int) (byte) 1);
        java.lang.Integer int13 = document1.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document4 = document1.ownerDocument();
        org.jsoup.select.Elements elements6 = document1.getElementsByAttribute("#document");
        java.lang.String str7 = document1.title();
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element9 = document8.head();
        java.lang.String str10 = document8.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document8.firstElementSibling();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document4 = document1.ownerDocument();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = document4.textNodes();
        org.jsoup.select.Elements elements6 = document4.parents();
        org.jsoup.select.Elements elements7 = document4.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document4.firstElementSibling();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingOwnText("");
        java.lang.String str12 = element8.attr("");
        org.jsoup.nodes.Element element14 = element8.prependText("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element14.firstElementSibling();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element9 = document1.prependText("hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document1.lastElementSibling();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = document1.firstElementSibling();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<#root class=\"hi!\">\n hi!\n</#root>");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document7 = document1.normalise();
        document1.title("");
        java.util.Set<java.lang.String> strSet10 = document1.classNames();
        org.jsoup.nodes.Element element12 = document1.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document1.firstElementSibling();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        org.jsoup.nodes.Element element13 = document1.prependText("hi!");
        org.jsoup.nodes.Element element15 = document1.prepend("hi!");
        java.util.Set<java.lang.String> strSet16 = document1.classNames();
        org.jsoup.select.Elements elements18 = document1.getElementsByAttribute("<#root></#root>\n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = document1.firstElementSibling();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        org.jsoup.nodes.Element element13 = document1.prependText("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = document1.text("#document");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document7 = document1.normalise();
        document1.title("");
        java.util.Set<java.lang.String> strSet10 = document1.classNames();
        org.jsoup.nodes.Element element12 = document1.text("");
        org.jsoup.select.Elements elements14 = document1.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.select.Elements elements16 = document1.getElementsContainingText("#root");
        java.lang.String str18 = document1.attr("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList19 = document1.dataNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = document1.wrap("<title></title>    \n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str9 = document1.toString();
        java.lang.String str11 = document1.attr("<#root></#root>\n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document1.text("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.select.Elements elements16 = document1.siblingElements();
        org.jsoup.nodes.Element element18 = document1.toggleClass("head");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = document1.wrap(" hi!");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document4 = document1.ownerDocument();
        org.jsoup.select.Elements elements6 = document1.getElementsByAttribute("#document");
        java.lang.String str7 = document1.title();
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element9 = document8.head();
        org.jsoup.nodes.Element element10 = document8.head();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document8.wrap("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document16 = document5.normalise();
        org.jsoup.nodes.Element element18 = document16.addClass("head");
        org.jsoup.nodes.Document.QuirksMode quirksMode19 = document16.quirksMode();
        java.lang.String str20 = document16.outerHtml();
        org.jsoup.nodes.Element element21 = document16.parent();
        org.jsoup.nodes.Element element22 = element21.parent();
        org.jsoup.nodes.Element element24 = element21.appendElement("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element21.firstElementSibling();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document4 = document1.ownerDocument();
        org.jsoup.select.Elements elements6 = document1.getElementsByAttribute("#document");
        java.lang.String str7 = document1.title();
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.select.Elements elements10 = document8.getElementsByIndexEquals((int) (byte) 0);
        org.jsoup.nodes.Element element12 = document8.createElement("head");
        java.lang.String str13 = element12.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element12.wrap("hi!hi!<title></title>");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root></#root>\n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = document1.lastElementSibling();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        org.jsoup.nodes.Element element13 = document1.prependText("hi!");
        org.jsoup.nodes.Element element14 = document1.nextElementSibling();
        org.jsoup.select.Elements elements15 = document1.siblingElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = document1.lastElementSibling();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        org.jsoup.nodes.Element element13 = document1.prependText("hi!");
        org.jsoup.nodes.Element element15 = document1.prepend("hi!");
        org.jsoup.select.Elements elements17 = document1.getElementsByIndexGreaterThan((int) (byte) 10);
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node20 = document19.previousSibling();
        org.jsoup.nodes.Element element21 = document19.nextElementSibling();
        java.lang.String str22 = document19.title();
        org.jsoup.nodes.Element element24 = document19.toggleClass("hi!");
        java.lang.String str25 = document19.className();
        org.jsoup.select.Elements elements28 = document19.getElementsByAttributeValueNot(" hi!", " hi!");
        org.jsoup.select.Elements elements30 = document19.getElementsByIndexLessThan((int) (short) 0);
        java.lang.String str31 = document19.ownText();
        org.jsoup.nodes.Element element33 = document19.appendText("hi!");
        org.jsoup.nodes.Element element35 = document19.createElement("#root");
        org.jsoup.nodes.Document.QuirksMode quirksMode36 = document19.quirksMode();
        org.jsoup.nodes.Document document37 = document1.quirksMode(quirksMode36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document37.title("#root");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document4 = document1.ownerDocument();
        org.jsoup.select.Elements elements6 = document1.getElementsByAttribute("#document");
        java.lang.String str7 = document1.title();
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.select.Elements elements10 = document8.getElementsByIndexEquals((int) (byte) 0);
        org.jsoup.nodes.Element element12 = document8.createElement("head");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document8.lastElementSibling();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueContaining("#root", " hi!");
        org.jsoup.nodes.Document document12 = document1.clone();
        org.jsoup.nodes.Element element14 = document12.createElement("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = document12.wrap("head");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node9 = document8.previousSibling();
        org.jsoup.nodes.Element element10 = document8.nextElementSibling();
        java.lang.String str11 = document8.title();
        org.jsoup.nodes.Element element13 = document8.toggleClass("hi!");
        org.jsoup.nodes.Element element15 = document8.toggleClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = document8.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.prettyPrint(false);
        int int19 = outputSettings18.indentAmount();
        java.nio.charset.CharsetEncoder charsetEncoder20 = outputSettings18.encoder();
        org.jsoup.nodes.Document document21 = document1.outputSettings(outputSettings18);
        org.jsoup.nodes.Element element23 = document1.getElementById("head");
        org.jsoup.nodes.Document document25 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node26 = document25.previousSibling();
        org.jsoup.nodes.Element element27 = document25.nextElementSibling();
        java.lang.String str28 = document25.title();
        org.jsoup.nodes.Element element30 = document25.toggleClass("hi!");
        org.jsoup.nodes.Element element32 = document25.toggleClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = document25.outputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings33.escapeMode();
        java.nio.charset.CharsetEncoder charsetEncoder35 = outputSettings33.encoder();
        boolean boolean36 = outputSettings33.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings33.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings33.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings38.prettyPrint(false);
        org.jsoup.nodes.Document document41 = document1.outputSettings(outputSettings40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element43 = document1.text("#root");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        org.jsoup.nodes.Element element13 = document1.prependText("hi!");
        org.jsoup.select.Elements elements14 = document1.children();
        org.jsoup.select.Elements elements16 = document1.getElementsContainingText(" hi!");
        boolean boolean18 = document1.hasClass("<#root></#root>\n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = document1.wrap("hi!hi!");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element17 = document5.prependElement("#root");
        org.jsoup.nodes.Element element18 = document5.head();
        org.jsoup.nodes.Node node20 = document5.childNode((int) (short) 1);
        document5.remove();
        org.jsoup.parser.Tag tag22 = document5.tag();
        org.jsoup.nodes.Node node23 = document5.nextSibling();
        org.jsoup.nodes.Document document24 = document5.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = document5.firstElementSibling();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Attributes attributes2 = document1.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document1.lastElementSibling();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        org.jsoup.nodes.Element element10 = document1.appendText("hi!");
        java.lang.String str11 = document1.tagName();
        org.jsoup.nodes.Element element13 = document1.html("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element15 = document1.addClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document1.text("<html><head><title></title></head><body></body></html>");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot(" hi!", " hi!");
        org.jsoup.select.Elements elements12 = document1.getElementsByIndexLessThan((int) (byte) 1);
        org.jsoup.nodes.Node node14 = document1.removeAttr("head");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node17 = document16.previousSibling();
        org.jsoup.nodes.Element element18 = document16.nextElementSibling();
        java.lang.String str19 = document16.title();
        org.jsoup.nodes.Element element21 = document16.toggleClass("hi!");
        org.jsoup.nodes.Element element23 = document16.toggleClass("");
        org.jsoup.nodes.Element element25 = document16.appendText("hi!");
        java.lang.String str26 = element25.val();
        org.jsoup.nodes.Element element27 = document1.prependChild((org.jsoup.nodes.Node) element25);
        java.lang.String str28 = element27.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element29 = element27.firstElementSibling();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document7 = document1.normalise();
        boolean boolean9 = document1.hasClass("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element11 = document1.toggleClass("head");
        org.jsoup.nodes.Document document12 = document1.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document12.firstElementSibling();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        org.jsoup.nodes.Node node9 = document1.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document1.text(" hi!");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        org.jsoup.nodes.Element element13 = document1.prependText("hi!");
        org.jsoup.nodes.Element element15 = document1.prepend("hi!");
        org.jsoup.select.Elements elements17 = document1.getElementsByIndexGreaterThan((int) (byte) 10);
        org.jsoup.nodes.Element element19 = document1.appendText("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements21 = document1.getElementsMatchingOwnText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element23 = document1.toggleClass("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element23.wrap("<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        java.lang.String str12 = document1.nodeName();
        org.jsoup.nodes.Element element13 = document1.parent();
        java.lang.String str14 = document1.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = document1.text("<#root></#root>");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.select.Elements elements5 = document1.getElementsByIndexEquals(1);
        org.jsoup.nodes.Element element7 = document1.tagName("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("#root");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        org.jsoup.nodes.Element element13 = document1.prependText("hi!");
        org.jsoup.nodes.Element element15 = document1.prepend("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList16 = document1.textNodes();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = document1.dataset();
        org.jsoup.nodes.Node node18 = document1.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = document1.lastElementSibling();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document7 = document1.normalise();
        document1.title("");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = document1.dataset();
        org.jsoup.nodes.Element element12 = document1.addClass("hi!hi!");
        org.jsoup.select.Elements elements15 = element12.getElementsByAttributeValueNot("hi!hi!", "<title></title>");
        java.lang.String str16 = element12.tagName();
        org.jsoup.select.Elements elements18 = element12.getElementsByAttribute("<html>\n <head></head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element12.firstElementSibling();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.appendElement("hi!");
        org.jsoup.nodes.Node node5 = document1.removeAttr("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Attributes attributes6 = document1.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document1.text("<#root class=\" hi!\">\n <html>\n  <head>\n   <title></title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>hi!");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document7 = document1.normalise();
        document1.title("");
        java.util.Set<java.lang.String> strSet10 = document1.classNames();
        org.jsoup.nodes.Element element12 = document1.text("");
        org.jsoup.select.Elements elements14 = document1.getElementsByIndexLessThan((int) (short) 100);
        java.lang.String str15 = document1.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = document1.lastElementSibling();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        java.lang.String str2 = document1.id();
        java.lang.String str3 = document1.data();
        org.jsoup.select.Elements elements4 = document1.parents();
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueStarting("#document", "hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document1.text("<title></title>");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document1.text("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = document1.lastElementSibling();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot(" hi!", " hi!");
        org.jsoup.select.Elements elements12 = document1.getElementsByIndexLessThan((int) (short) 0);
        java.lang.String str13 = document1.ownText();
        org.jsoup.nodes.Element element15 = document1.appendText("hi!");
        org.jsoup.nodes.Element element17 = document1.createElement("#root");
        org.jsoup.nodes.Element element19 = document1.prepend("#document");
        org.jsoup.nodes.Element element20 = document1.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = document1.firstElementSibling();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot(" hi!", " hi!");
        org.jsoup.select.Elements elements12 = document1.getElementsByIndexLessThan((int) (byte) 1);
        org.jsoup.nodes.Element element14 = document1.removeClass(" hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = document1.lastElementSibling();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document7 = document1.normalise();
        document1.title("");
        java.util.Set<java.lang.String> strSet10 = document1.classNames();
        org.jsoup.nodes.Element element12 = document1.text("");
        java.lang.String str13 = element12.val();
        org.jsoup.parser.Tag tag14 = element12.tag();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList15 = element12.dataNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element12.wrap("<#root></#root>\n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node13 = document12.previousSibling();
        org.jsoup.nodes.Element element14 = document12.nextElementSibling();
        java.lang.String str15 = document12.title();
        org.jsoup.nodes.Element element17 = document12.toggleClass("hi!");
        org.jsoup.nodes.Element element19 = document12.toggleClass("");
        org.jsoup.nodes.Element element21 = document12.appendText("hi!");
        org.jsoup.select.Elements elements23 = document12.getElementsContainingOwnText("<title></title>");
        org.jsoup.nodes.Document.QuirksMode quirksMode24 = document12.quirksMode();
        org.jsoup.nodes.Document document25 = document1.quirksMode(quirksMode24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("hi! head");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        org.jsoup.select.Elements elements13 = document1.getElementsByIndexEquals(10);
        org.jsoup.nodes.Node node14 = document1.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = document1.wrap("<#root></#root>");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        org.jsoup.nodes.Element element12 = document1.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = element12.attributes();
        org.jsoup.select.Elements elements15 = element12.getElementsMatchingText("");
        java.lang.String str16 = element12.id();
        org.jsoup.nodes.Element element18 = element12.prepend("<#root class=\"hi!\">\n hi!\n</#root>");
        java.lang.String str19 = element18.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element18.lastElementSibling();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<title></title>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document1.wrap("<html><head><title></title></head><body></body></html>");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        org.jsoup.nodes.Element element12 = document1.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = element12.attributes();
        org.jsoup.select.Elements elements15 = element12.getElementsMatchingText("");
        org.jsoup.select.Elements elements16 = element12.parents();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node19 = document18.previousSibling();
        org.jsoup.nodes.Element element20 = document18.nextElementSibling();
        java.lang.String str21 = document18.title();
        org.jsoup.nodes.Element element23 = document18.toggleClass("hi!");
        java.lang.String str24 = document18.className();
        org.jsoup.select.Elements elements27 = document18.getElementsByAttributeValueNot(" hi!", " hi!");
        org.jsoup.select.Elements elements29 = document18.getElementsByIndexLessThan((int) (byte) 1);
        org.jsoup.nodes.Document document31 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node32 = document31.previousSibling();
        org.jsoup.nodes.Element element33 = document31.nextElementSibling();
        org.jsoup.nodes.Document document35 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node36 = document35.previousSibling();
        org.jsoup.nodes.Element element37 = document35.nextElementSibling();
        java.lang.String str38 = document35.title();
        org.jsoup.nodes.Element element40 = document35.toggleClass("hi!");
        org.jsoup.nodes.Document document41 = document35.normalise();
        document35.title("");
        java.util.Set<java.lang.String> strSet44 = document35.classNames();
        org.jsoup.nodes.Element element45 = document31.prependChild((org.jsoup.nodes.Node) document35);
        org.jsoup.nodes.Element element47 = document35.prependElement("#root");
        java.lang.String str48 = element47.html();
        boolean boolean49 = document18.equals((java.lang.Object) element47);
        org.jsoup.nodes.Element element50 = element12.appendChild((org.jsoup.nodes.Node) document18);
        org.jsoup.nodes.Document document51 = element50.ownerDocument();
        boolean boolean53 = document51.hasAttr(" hi! head");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document51.title("<#root class=\"hi!\">\n hi!\n</#root>");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = element6.data();
        java.lang.String str9 = element6.absUrl("hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element6.firstElementSibling();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        org.jsoup.nodes.Element element13 = document1.prependText("hi!");
        org.jsoup.select.Elements elements15 = document1.getElementsByClass("hi!hi!<title></title>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document1.text("<#root class=\"hi!\">\n hi!\n</#root>");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.select.Elements elements6 = document1.getElementsByIndexEquals(10);
        org.jsoup.nodes.Element element7 = document1.nextElementSibling();
        org.jsoup.nodes.Element element9 = document1.toggleClass("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("hi!hi!");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        org.jsoup.nodes.Element element13 = document1.prependText("hi!");
        org.jsoup.select.Elements elements15 = document1.getElementsByClass("hi!hi!<title></title>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title(" hi! head");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        org.jsoup.nodes.Element element13 = document1.prependText("hi!");
        org.jsoup.nodes.Element element15 = document1.prepend("hi!");
        org.jsoup.select.Elements elements17 = document1.getElementsByIndexGreaterThan((int) (byte) 10);
        java.lang.String str18 = document1.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = document1.wrap("#document");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element17 = document5.prependElement("#root");
        org.jsoup.nodes.Element element18 = document5.head();
        org.jsoup.nodes.Node node20 = document5.childNode((int) (short) 1);
        document5.remove();
        java.lang.String str22 = document5.data();
        org.jsoup.select.Elements elements24 = document5.getElementsByAttribute(" hi!");
        boolean boolean26 = document5.hasAttr("hi!hi!<title></title>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = document5.wrap("<html><head><title></title></head><body></body></html>");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Attributes attributes2 = document1.attributes();
        org.jsoup.select.Elements elements4 = document1.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements5 = document1.siblingElements();
        org.jsoup.select.Elements elements6 = document1.children();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = document1.textNodes();
        org.jsoup.nodes.Element element9 = document1.append("hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document1.wrap("hi!hi!");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document4 = document1.ownerDocument();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = document4.textNodes();
        org.jsoup.select.Elements elements6 = document4.parents();
        org.jsoup.select.Elements elements7 = document4.getAllElements();
        org.jsoup.select.Elements elements10 = document4.getElementsByAttributeValueMatching("head", "head");
        org.jsoup.select.Elements elements13 = document4.getElementsByAttributeValueEnding(" hi!", "#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = document4.firstElementSibling();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document7 = document1.normalise();
        document1.title("");
        java.util.Set<java.lang.String> strSet10 = document1.classNames();
        org.jsoup.nodes.Element element12 = document1.text("");
        org.jsoup.select.Elements elements14 = document1.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node17 = document16.previousSibling();
        org.jsoup.nodes.Element element18 = document16.nextElementSibling();
        java.lang.String str19 = document16.title();
        org.jsoup.nodes.Element element21 = document16.toggleClass("hi!");
        org.jsoup.nodes.Element element23 = document16.toggleClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = document16.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings24.prettyPrint(false);
        int int27 = outputSettings26.indentAmount();
        int int28 = outputSettings26.indentAmount();
        org.jsoup.nodes.Document document30 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node31 = document30.previousSibling();
        org.jsoup.nodes.Element element32 = document30.nextElementSibling();
        java.lang.String str33 = document30.title();
        org.jsoup.nodes.Element element35 = document30.toggleClass("hi!");
        org.jsoup.nodes.Element element37 = document30.toggleClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = document30.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings38.prettyPrint(false);
        int int41 = outputSettings40.indentAmount();
        java.nio.charset.Charset charset42 = outputSettings40.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings26.charset(charset42);
        boolean boolean44 = outputSettings43.prettyPrint();
        org.jsoup.nodes.Document document45 = document1.outputSettings(outputSettings43);
        org.jsoup.nodes.Document document46 = document45.ownerDocument();
        org.jsoup.select.Elements elements49 = document46.getElementsByAttributeValueEnding("<html>\n <head></head>\n <body>\n  #root\n </body>\n</html>", "hi! hi!");
        org.jsoup.nodes.Document document51 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node52 = document51.previousSibling();
        org.jsoup.nodes.Element element53 = document51.nextElementSibling();
        java.lang.String str54 = document51.title();
        org.jsoup.nodes.Element element56 = document51.toggleClass("hi!");
        org.jsoup.nodes.Document document57 = document51.normalise();
        document51.title("");
        java.util.Set<java.lang.String> strSet60 = document51.classNames();
        org.jsoup.nodes.Element element62 = document51.text("");
        org.jsoup.select.Elements elements64 = document51.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = outputSettings65.prettyPrint(false);
        org.jsoup.nodes.Document document68 = document51.outputSettings(outputSettings67);
        java.lang.String str69 = document51.text();
        org.jsoup.nodes.Element element70 = document51.previousElementSibling();
        org.jsoup.nodes.Document.QuirksMode quirksMode71 = document51.quirksMode();
        org.jsoup.nodes.Document document72 = document46.quirksMode(quirksMode71);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element73 = document72.lastElementSibling();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        org.jsoup.nodes.Element element13 = document1.prependText("hi!");
        org.jsoup.nodes.Element element15 = document1.prepend("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList16 = document1.textNodes();
        org.jsoup.nodes.Element element18 = document1.removeClass(" hi!");
        java.lang.String str19 = element18.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element18.firstElementSibling();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        org.jsoup.nodes.Element element10 = document1.appendText("hi!");
        java.lang.String str11 = document1.tagName();
        org.jsoup.nodes.Element element13 = document1.html("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        java.lang.String str14 = document1.nodeName();
        java.lang.String str15 = document1.data();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = document1.dataset();
        org.jsoup.nodes.Element element18 = document1.prependText("head");
        int int19 = element18.siblingIndex();
        java.lang.String str20 = element18.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element18.firstElementSibling();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueContaining("#root", " hi!");
        org.jsoup.select.Elements elements13 = document1.getElementsMatchingText("<html><head><title></title></head><body></body></html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = document1.firstElementSibling();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        org.jsoup.nodes.Element element13 = document1.prependText("hi!");
        org.jsoup.select.Elements elements14 = document1.children();
        org.jsoup.select.Elements elements16 = document1.getElementsContainingText(" hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.select.Elements elements16 = document1.siblingElements();
        org.jsoup.nodes.Element element18 = document1.toggleClass("head");
        org.jsoup.nodes.Attributes attributes19 = document1.attributes();
        org.jsoup.nodes.Element element20 = document1.body();
        boolean boolean22 = document1.hasAttr("head  \n<title></title>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = document1.firstElementSibling();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        org.jsoup.nodes.Element element12 = document1.appendText("hi!");
        org.jsoup.nodes.Element element13 = document1.empty();
        org.jsoup.nodes.Element element15 = document1.appendText(" hi!");
        org.jsoup.nodes.Element element17 = document1.prependText("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = document1.text("#root");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsContainingText("");
        int int4 = document1.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = document1.outputSettings();
        org.jsoup.nodes.Element element7 = document1.appendText("#document");
        org.jsoup.nodes.Element element10 = document1.attr("<title></title>    \n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>", "");
        boolean boolean11 = element10.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element10.wrap("<head>\n <title></title>\n</head>");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.select.Elements elements18 = element15.getElementsByAttributeValueNot("#root", "head");
        org.jsoup.select.Elements elements21 = element15.getElementsByAttributeValueContaining(" hi!", "<#root></#root>\n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element15.lastElementSibling();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document4 = document1.ownerDocument();
        org.jsoup.select.Elements elements6 = document1.getElementsByAttribute("#document");
        java.lang.String str7 = document1.title();
        org.jsoup.nodes.Element element9 = document1.appendText("hi!hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document1.outputSettings();
        org.jsoup.nodes.Element element12 = document1.removeClass("<#root></#root>\n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document13 = document1.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = document13.wrap("hi!hi!");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document16 = document5.normalise();
        org.jsoup.nodes.Element element18 = document16.addClass("head");
        org.jsoup.select.Elements elements21 = document16.getElementsByAttributeValueStarting("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>", "hi!");
        org.jsoup.nodes.Element element23 = document16.createElement("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements25 = document16.getElementsMatchingOwnText("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList26 = document16.dataNodes();
        org.jsoup.nodes.Node node27 = document16.unwrap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element29 = document16.text("hi!");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element17 = document5.prependElement("#root");
        org.jsoup.nodes.Element element18 = document5.head();
        java.lang.String str19 = element18.ownText();
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node22 = document21.previousSibling();
        org.jsoup.nodes.Element element23 = document21.nextElementSibling();
        java.lang.String str24 = document21.title();
        org.jsoup.nodes.Element element26 = document21.toggleClass("hi!");
        org.jsoup.nodes.Document document27 = document21.normalise();
        document21.title("");
        java.util.Set<java.lang.String> strSet30 = document21.classNames();
        org.jsoup.nodes.Element element32 = document21.text("");
        org.jsoup.select.Elements elements34 = document21.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.select.Elements elements36 = document21.getElementsContainingText("#root");
        org.jsoup.nodes.Element element38 = document21.createElement("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        boolean boolean39 = element18.equals((java.lang.Object) document21);
        org.jsoup.nodes.Document document40 = document21.normalise();
        java.lang.String str41 = document40.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element42 = document40.lastElementSibling();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.select.Elements elements5 = document1.getElementsByIndexEquals(1);
        org.jsoup.select.Elements elements7 = document1.getElementsByIndexEquals(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document1.firstElementSibling();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        java.lang.String str12 = document1.nodeName();
        org.jsoup.nodes.Document document13 = document1.normalise();
        org.jsoup.nodes.Element element15 = document13.prepend("hi!");
        org.jsoup.nodes.Node node17 = element15.removeAttr("<head>\n <title></title>\n</head>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element15.firstElementSibling();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.outputSettings();
        org.jsoup.nodes.Document document10 = document1.clone();
        org.jsoup.nodes.Element element13 = document10.attr("<html>\n <head></head>\n <body></body>\n</html>", "head  \n<title></title>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = document10.firstElementSibling();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        org.jsoup.nodes.Element element10 = document1.appendText("hi!");
        java.lang.String str11 = document1.tagName();
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node14 = document13.previousSibling();
        org.jsoup.nodes.Element element15 = document13.nextElementSibling();
        java.lang.String str16 = document13.title();
        org.jsoup.nodes.Element element18 = document13.toggleClass("hi!");
        org.jsoup.nodes.Document document19 = document13.normalise();
        document13.title("");
        java.util.Set<java.lang.String> strSet22 = document13.classNames();
        org.jsoup.nodes.Element element24 = document13.text("");
        org.jsoup.nodes.Element element25 = document1.prependChild((org.jsoup.nodes.Node) document13);
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node28 = document27.previousSibling();
        org.jsoup.nodes.Element element29 = document27.nextElementSibling();
        org.jsoup.nodes.Document document31 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node32 = document31.previousSibling();
        org.jsoup.nodes.Element element33 = document31.nextElementSibling();
        java.lang.String str34 = document31.title();
        org.jsoup.nodes.Element element36 = document31.toggleClass("hi!");
        org.jsoup.nodes.Document document37 = document31.normalise();
        document31.title("");
        java.util.Set<java.lang.String> strSet40 = document31.classNames();
        org.jsoup.nodes.Element element41 = document27.prependChild((org.jsoup.nodes.Node) document31);
        org.jsoup.nodes.Document document42 = document31.normalise();
        org.jsoup.nodes.Element element44 = document42.addClass("head");
        org.jsoup.nodes.Document.QuirksMode quirksMode45 = document42.quirksMode();
        org.jsoup.nodes.Document document46 = document1.quirksMode(quirksMode45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element47 = document1.lastElementSibling();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = document1.textNodes();
        boolean boolean6 = document1.hasText();
        org.jsoup.nodes.Element element8 = document1.createElement("<html>\n <head>\n  <title>head</title>\n </head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element8.lastElementSibling();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document4 = document1.ownerDocument();
        org.jsoup.select.Elements elements6 = document1.getElementsByAttribute("#document");
        java.lang.String str7 = document1.title();
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.select.Elements elements10 = document8.getElementsByIndexEquals((int) (byte) 0);
        org.jsoup.nodes.Element element12 = document8.createElement("head");
        java.lang.String str14 = element12.attr("<title></title>    \n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements16 = element12.getElementsContainingText("#document");
        org.jsoup.select.Elements elements18 = element12.getElementsByAttributeStarting("<title></title>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element12.lastElementSibling();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document7 = document1.normalise();
        document1.title("");
        java.util.Set<java.lang.String> strSet10 = document1.classNames();
        org.jsoup.nodes.Element element12 = document1.text("");
        java.lang.String str13 = document1.id();
        java.lang.String str15 = document1.attr("hi!hi!");
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node18 = document17.previousSibling();
        org.jsoup.nodes.Element element19 = document17.nextElementSibling();
        java.lang.String str20 = document17.title();
        org.jsoup.nodes.Element element22 = document17.toggleClass("hi!");
        org.jsoup.nodes.Element element24 = document17.toggleClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = document17.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings25.prettyPrint(false);
        int int28 = outputSettings27.indentAmount();
        int int29 = outputSettings27.indentAmount();
        org.jsoup.nodes.Document document31 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node32 = document31.previousSibling();
        org.jsoup.nodes.Element element33 = document31.nextElementSibling();
        java.lang.String str34 = document31.title();
        org.jsoup.nodes.Element element36 = document31.toggleClass("hi!");
        org.jsoup.nodes.Element element38 = document31.toggleClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = document31.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings39.prettyPrint(false);
        int int42 = outputSettings41.indentAmount();
        java.nio.charset.Charset charset43 = outputSettings41.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings27.charset(charset43);
        org.jsoup.nodes.Document document45 = document1.outputSettings(outputSettings44);
        org.jsoup.nodes.Document document47 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node48 = document47.previousSibling();
        org.jsoup.nodes.Element element49 = document47.nextElementSibling();
        java.lang.String str50 = document47.title();
        org.jsoup.nodes.Element element52 = document47.toggleClass("hi!");
        org.jsoup.nodes.Element element54 = document47.toggleClass("");
        java.lang.String str56 = document47.absUrl("hi!");
        java.lang.String str57 = document47.html();
        org.jsoup.nodes.Element element59 = document47.prependText("hi!");
        org.jsoup.nodes.Element element61 = document47.prepend("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList62 = document47.textNodes();
        org.jsoup.nodes.Element element64 = document47.removeClass(" hi!");
        org.jsoup.nodes.Element element66 = document47.html("<title></title>");
        org.jsoup.nodes.Element element68 = document47.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element69 = document45.prependChild((org.jsoup.nodes.Node) document47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element70 = document45.lastElementSibling();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        org.jsoup.nodes.Element element13 = document1.prependText("hi!");
        org.jsoup.nodes.Element element15 = document1.prepend("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList16 = document1.textNodes();
        org.jsoup.nodes.Element element18 = document1.removeClass(" hi!");
        org.jsoup.nodes.Element element20 = document1.html("<title></title>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element20.firstElementSibling();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.nodes.Element element8 = document1.head();
        org.jsoup.nodes.Document document9 = document1.clone();
        org.jsoup.nodes.Element element11 = document9.prependText("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element11.firstElementSibling();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot(" hi!", " hi!");
        org.jsoup.select.Elements elements12 = document1.getElementsByIndexLessThan((int) (byte) 1);
        org.jsoup.nodes.Node node14 = document1.removeAttr("head");
        org.jsoup.nodes.Node node15 = document1.previousSibling();
        org.jsoup.nodes.Element element16 = document1.head();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("#root");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Attributes attributes2 = document1.attributes();
        org.jsoup.nodes.Element element4 = document1.append(" hi! head");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title(" hi! head");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot(" hi!", " hi!");
        org.jsoup.select.Elements elements12 = document1.getElementsByIndexLessThan((int) (byte) 1);
        java.lang.Integer int13 = document1.elementSiblingIndex();
        java.lang.String str14 = document1.outerHtml();
        org.jsoup.nodes.Element element16 = document1.append("#root");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = document1.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = document1.text("<#root></#root>\n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Document.QuirksMode quirksMode2 = document1.quirksMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document1.wrap("head  \n<title></title>");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot(" hi!", " hi!");
        org.jsoup.select.Elements elements12 = document1.getElementsByIndexLessThan((int) (short) 0);
        java.lang.String str13 = document1.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = document1.firstElementSibling();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Attributes attributes2 = document1.attributes();
        org.jsoup.select.Elements elements4 = document1.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements5 = document1.siblingElements();
        org.jsoup.nodes.Node node6 = document1.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document1.firstElementSibling();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.select.Elements elements5 = document1.getElementsByIndexEquals(1);
        org.jsoup.select.Elements elements6 = document1.getAllElements();
        org.jsoup.select.Elements elements8 = document1.getElementsMatchingText("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        java.lang.String str9 = document1.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document1.text("#root&lt;#root class=&quot; hi!&quot;&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;hi!");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document4 = document1.ownerDocument();
        org.jsoup.select.Elements elements6 = document1.getElementsByAttribute("#document");
        java.lang.String str7 = document1.title();
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.select.Elements elements10 = document8.getElementsByIndexEquals((int) (byte) 0);
        org.jsoup.nodes.Document document11 = document8.normalise();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = document11.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document11.lastElementSibling();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueContaining("#root", " hi!");
        org.jsoup.nodes.Element element13 = document1.tagName("hi!");
        org.jsoup.nodes.Document.QuirksMode quirksMode14 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document15 = document1.quirksMode(quirksMode14);
        org.jsoup.select.Elements elements17 = document1.getElementsByIndexEquals((int) ' ');
        java.lang.String str19 = document1.attr("#root");
        org.jsoup.select.Elements elements21 = document1.getElementsByAttributeStarting("<hi!></hi!>");
        org.jsoup.select.Elements elements24 = document1.getElementsByAttributeValueEnding("hi!", " hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = document1.wrap("hi! ");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        java.lang.String str12 = document1.nodeName();
        org.jsoup.nodes.Document document13 = document1.normalise();
        java.lang.String str14 = document13.baseUri();
        boolean boolean16 = document13.hasClass(" hi!");
        org.jsoup.nodes.Element element18 = document13.append("#root");
        org.jsoup.nodes.Element element20 = document13.addClass("<title></title>    \n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element20.lastElementSibling();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        org.jsoup.nodes.Element element13 = document1.prependText("hi!");
        org.jsoup.select.Elements elements14 = document1.children();
        org.jsoup.select.Elements elements17 = document1.getElementsByAttributeValueNot(" hi!", " hi!");
        org.jsoup.select.Elements elements19 = document1.getElementsMatchingOwnText("head");
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = document1.outputSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = document1.text("<html><head><title></title></head><body></body></html>");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.select.Elements elements5 = document1.getElementsByIndexEquals(1);
        org.jsoup.select.Elements elements6 = document1.getAllElements();
        org.jsoup.select.Elements elements8 = document1.getElementsMatchingText("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements10 = document1.getElementsByAttribute("#document");
        java.lang.String str11 = document1.outerHtml();
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node14 = document13.previousSibling();
        org.jsoup.nodes.Element element15 = document13.nextElementSibling();
        java.lang.String str16 = document13.title();
        org.jsoup.nodes.Element element18 = document13.toggleClass("hi!");
        org.jsoup.nodes.Document document19 = document13.normalise();
        org.jsoup.nodes.Attributes attributes20 = document13.attributes();
        java.util.Set<java.lang.String> strSet21 = document13.classNames();
        org.jsoup.nodes.Element element22 = document1.classNames(strSet21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = document1.firstElementSibling();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document16 = document5.normalise();
        org.jsoup.nodes.Element element18 = document16.addClass("head");
        org.jsoup.nodes.Document.QuirksMode quirksMode19 = document16.quirksMode();
        org.jsoup.select.Elements elements20 = document16.parents();
        org.jsoup.nodes.Document document21 = document16.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = document21.firstElementSibling();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot(" hi!", " hi!");
        org.jsoup.select.Elements elements12 = document1.getElementsByIndexLessThan((int) (short) 0);
        java.lang.String str13 = document1.title();
        boolean boolean15 = document1.hasAttr("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        java.lang.String str16 = document1.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = document1.text("&lt;#root class=&quot; hi!&quot;&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;head&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;\n<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        org.jsoup.nodes.Element element13 = document1.prependText("hi!");
        org.jsoup.select.Elements elements14 = document1.children();
        org.jsoup.select.Elements elements16 = document1.getElementsContainingText(" hi!");
        boolean boolean18 = document1.hasClass("<#root></#root>\n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document19 = document1.ownerDocument();
        org.jsoup.select.Elements elements20 = document19.getAllElements();
        java.util.Set<java.lang.String> strSet21 = document19.classNames();
        java.lang.String str23 = document19.attr("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>&lt;#root&gt;\n<!--#root-->   \n<title></title>");
        boolean boolean25 = document19.hasAttr("<#root class=\" hi!\">\n <html>\n  <head>\n   <title>head</title>\n  </head>\n  <body></body>\n </html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = document19.wrap("<#root></#root>\n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document4 = document1.ownerDocument();
        org.jsoup.select.Elements elements6 = document1.getElementsByAttribute("#document");
        java.lang.String str7 = document1.title();
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element10 = document1.prependElement("<html>\n <head></head>\n <body>\n  #root\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document1.lastElementSibling();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingOwnText("");
        java.lang.String str12 = element8.attr("");
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node15 = document14.previousSibling();
        org.jsoup.nodes.Element element16 = document14.nextElementSibling();
        java.lang.String str17 = document14.title();
        org.jsoup.nodes.Element element19 = document14.toggleClass("hi!");
        org.jsoup.nodes.Element element21 = document14.toggleClass("");
        java.lang.String str23 = document14.absUrl("hi!");
        java.lang.String str24 = document14.html();
        org.jsoup.nodes.Element element26 = document14.prependText("hi!");
        org.jsoup.select.Elements elements27 = document14.children();
        boolean boolean28 = element8.equals((java.lang.Object) elements27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element29 = element8.lastElementSibling();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str9 = document1.toString();
        org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueStarting(" hi!", " hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<#root class=\"hi!\">\n hi!\n</#root>");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.tagName("head");
        java.lang.String str7 = document1.toString();
        org.jsoup.nodes.Element element8 = document1.previousElementSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document1.wrap("<html>\n <head></head>\n <body>\n  #root\n </body>\n</html>");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        org.jsoup.nodes.Element element13 = document1.prependText("hi!");
        org.jsoup.nodes.Element element15 = document1.prepend("hi!");
        java.lang.String str17 = document1.absUrl(" hi!");
        org.jsoup.nodes.Element element18 = document1.empty();
        org.jsoup.select.Elements elements21 = document1.getElementsByAttributeValueContaining("hi!hi!", "<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements23 = document1.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements25 = document1.getElementsByAttribute("<html>\n <head>\n  <title>head</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element27 = document1.tagName("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("#document hi!");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        org.jsoup.nodes.Element element13 = document1.prependText("hi!");
        org.jsoup.nodes.Element element15 = document1.prepend("hi!");
        org.jsoup.nodes.Element element17 = document1.getElementById("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Document.QuirksMode quirksMode18 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document19 = document1.quirksMode(quirksMode18);
        java.lang.Integer int20 = document19.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = document19.firstElementSibling();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        java.lang.String str2 = document1.val();
        org.jsoup.nodes.Element element3 = document1.head();
        org.jsoup.nodes.Document document4 = document1.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document4.lastElementSibling();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element17 = document5.prependElement("#root");
        org.jsoup.nodes.Element element18 = document5.head();
        org.jsoup.nodes.Node node20 = document5.childNode((int) (short) 1);
        boolean boolean22 = document5.hasClass("hi!");
        org.jsoup.nodes.Element element24 = document5.before("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        boolean boolean26 = document5.hasClass("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document28 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node29 = document28.previousSibling();
        org.jsoup.nodes.Element element30 = document28.nextElementSibling();
        java.lang.String str31 = document28.title();
        org.jsoup.nodes.Element element33 = document28.toggleClass("hi!");
        org.jsoup.nodes.Element element35 = document28.toggleClass("");
        java.lang.String str37 = document28.absUrl("hi!");
        java.lang.String str38 = document28.html();
        org.jsoup.nodes.Element element40 = document28.prependText("hi!");
        org.jsoup.nodes.Element element42 = document28.prepend("hi!");
        java.lang.String str44 = document28.absUrl(" hi!");
        org.jsoup.nodes.Element element45 = document28.empty();
        org.jsoup.select.Elements elements47 = document28.getElementsByIndexGreaterThan((int) (short) 1);
        org.jsoup.nodes.Element element48 = document5.appendChild((org.jsoup.nodes.Node) document28);
        org.jsoup.nodes.Element element50 = document5.prependText("");
        org.jsoup.nodes.Element element52 = document5.createElement("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element54 = element52.wrap(" hi!");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        org.jsoup.nodes.Element element13 = document1.prependText("hi!");
        org.jsoup.nodes.Element element15 = document1.prepend("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList16 = document1.textNodes();
        org.jsoup.nodes.Element element18 = document1.removeClass(" hi!");
        org.jsoup.nodes.Element element20 = document1.appendElement("<title></title>    \n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = document1.firstElementSibling();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        org.jsoup.nodes.Element element10 = document1.appendText("hi!");
        java.lang.String str11 = document1.tagName();
        org.jsoup.nodes.Element element13 = document1.html("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element15 = element13.append("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element15.firstElementSibling();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        org.jsoup.nodes.Element element13 = document1.prependText("hi!");
        org.jsoup.nodes.Element element15 = document1.prepend("hi!");
        org.jsoup.nodes.Element element17 = document1.appendText("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element19 = document1.append(" hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = document1.text("<html><head><title></title></head><body></body></html>");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        org.jsoup.nodes.Node node9 = document1.nextSibling();
        org.jsoup.select.Elements elements11 = document1.getElementsContainingText("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document1.text("<#root class=\"hi!\">\n hi!\n</#root>");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Element element4 = document1.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document1.firstElementSibling();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot(" hi!", " hi!");
        org.jsoup.select.Elements elements12 = document1.getElementsByIndexLessThan((int) (byte) 1);
        java.lang.Integer int13 = document1.elementSiblingIndex();
        java.lang.String str14 = document1.outerHtml();
        org.jsoup.nodes.Element element16 = document1.addClass("&lt;#root class=&quot;hi!&quot;&gt; hi! \n<!--#root-->hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document1.lastElementSibling();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        org.jsoup.nodes.Element element13 = document1.prependText("hi!");
        org.jsoup.nodes.Element element15 = document1.prepend("hi!");
        org.jsoup.select.Elements elements17 = document1.getElementsByIndexGreaterThan((int) (byte) 10);
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node20 = document19.previousSibling();
        org.jsoup.nodes.Element element21 = document19.nextElementSibling();
        java.lang.String str22 = document19.title();
        org.jsoup.nodes.Element element24 = document19.toggleClass("hi!");
        java.lang.String str25 = document19.className();
        org.jsoup.select.Elements elements28 = document19.getElementsByAttributeValueNot(" hi!", " hi!");
        org.jsoup.select.Elements elements30 = document19.getElementsByIndexLessThan((int) (short) 0);
        java.lang.String str31 = document19.ownText();
        org.jsoup.nodes.Element element33 = document19.appendText("hi!");
        org.jsoup.nodes.Element element35 = document19.createElement("#root");
        org.jsoup.nodes.Document.QuirksMode quirksMode36 = document19.quirksMode();
        org.jsoup.nodes.Document document37 = document1.quirksMode(quirksMode36);
        org.jsoup.nodes.Document document38 = document37.normalise();
        java.lang.String str39 = document37.text();
        org.jsoup.nodes.Document document40 = document37.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element41 = document37.firstElementSibling();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document4 = document1.ownerDocument();
        org.jsoup.select.Elements elements6 = document1.getElementsByAttribute("#document");
        java.lang.String str7 = document1.title();
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element9 = document8.head();
        org.jsoup.nodes.Element element10 = document8.head();
        org.jsoup.parser.Tag tag11 = document8.tag();
        org.jsoup.nodes.Element element13 = document8.prepend("<hi!></hi!>");
        org.jsoup.nodes.Element element15 = element13.prependText("hi! ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element13.firstElementSibling();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node9 = document8.previousSibling();
        org.jsoup.nodes.Element element10 = document8.nextElementSibling();
        java.lang.String str11 = document8.title();
        org.jsoup.nodes.Element element13 = document8.toggleClass("hi!");
        org.jsoup.nodes.Element element15 = document8.toggleClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = document8.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.prettyPrint(false);
        int int19 = outputSettings18.indentAmount();
        java.nio.charset.CharsetEncoder charsetEncoder20 = outputSettings18.encoder();
        org.jsoup.nodes.Document document21 = document1.outputSettings(outputSettings18);
        org.jsoup.nodes.Element element23 = document1.getElementById("head");
        org.jsoup.nodes.Document document25 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node26 = document25.previousSibling();
        org.jsoup.nodes.Element element27 = document25.nextElementSibling();
        java.lang.String str28 = document25.title();
        org.jsoup.nodes.Element element30 = document25.toggleClass("hi!");
        org.jsoup.nodes.Element element32 = document25.toggleClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = document25.outputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings33.escapeMode();
        java.nio.charset.CharsetEncoder charsetEncoder35 = outputSettings33.encoder();
        boolean boolean36 = outputSettings33.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings33.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings33.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings38.prettyPrint(false);
        org.jsoup.nodes.Document document41 = document1.outputSettings(outputSettings40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element42 = document1.firstElementSibling();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element9 = document7.text("#root");
        org.jsoup.nodes.Element element11 = document7.createElement("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        java.lang.Integer int12 = element11.elementSiblingIndex();
        org.jsoup.select.Elements elements15 = element11.getElementsByAttributeValueEnding("head  \n<title></title>", "&lt;#root class=&quot;hi!&quot;&gt; hi! \n<!--#root-->hi!");
        org.jsoup.nodes.Element element17 = element11.appendText("<html>\n <head></head>\n <body>\n  #root\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element17.firstElementSibling();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document4 = document1.ownerDocument();
        org.jsoup.select.Elements elements6 = document1.getElementsByAttribute("#document");
        java.lang.String str7 = document1.title();
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.select.Elements elements10 = document8.getElementsMatchingOwnText("hi!");
        java.lang.String str11 = document8.nodeName();
        org.jsoup.select.Elements elements14 = document8.getElementsByAttributeValueMatching("<#root class=\"hi!\">\n hi!\n</#root>", "<title></title>");
        org.jsoup.nodes.Element element15 = document8.body();
        org.jsoup.select.Elements elements17 = document8.getElementsContainingOwnText("hi! head");
        org.jsoup.nodes.Element element19 = document8.createElement("hi! head");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element19.wrap("<#root></#root>\n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot(" hi!", " hi!");
        org.jsoup.select.Elements elements12 = document1.getElementsByIndexLessThan((int) (byte) 1);
        java.lang.Integer int13 = document1.elementSiblingIndex();
        java.lang.String str14 = document1.outerHtml();
        org.jsoup.nodes.Element element16 = document1.addClass("&lt;#root class=&quot;hi!&quot;&gt; hi! \n<!--#root-->hi!");
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node19 = document18.previousSibling();
        org.jsoup.nodes.Element element20 = document18.nextElementSibling();
        java.lang.String str21 = document18.title();
        org.jsoup.nodes.Element element23 = document18.toggleClass("hi!");
        org.jsoup.nodes.Element element25 = document18.toggleClass("");
        org.jsoup.select.Elements elements27 = element25.getElementsMatchingOwnText("");
        java.lang.String str29 = element25.attr("");
        org.jsoup.nodes.Element element31 = element25.prependText("");
        org.jsoup.nodes.Document document33 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node34 = document33.previousSibling();
        org.jsoup.nodes.Element element35 = document33.nextElementSibling();
        org.jsoup.nodes.Document document37 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node38 = document37.previousSibling();
        org.jsoup.nodes.Element element39 = document37.nextElementSibling();
        java.lang.String str40 = document37.title();
        org.jsoup.nodes.Element element42 = document37.toggleClass("hi!");
        org.jsoup.nodes.Document document43 = document37.normalise();
        document37.title("");
        java.util.Set<java.lang.String> strSet46 = document37.classNames();
        org.jsoup.nodes.Element element47 = document33.prependChild((org.jsoup.nodes.Node) document37);
        org.jsoup.nodes.Document document48 = document37.normalise();
        org.jsoup.nodes.Element element50 = document48.addClass("head");
        org.jsoup.nodes.Document.QuirksMode quirksMode51 = document48.quirksMode();
        java.lang.String str52 = document48.outerHtml();
        java.lang.String str53 = document48.val();
        org.jsoup.nodes.Element element54 = element25.appendChild((org.jsoup.nodes.Node) document48);
        java.lang.String str55 = element25.val();
        org.jsoup.nodes.Document document57 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node58 = document57.previousSibling();
        org.jsoup.nodes.Element element59 = document57.nextElementSibling();
        java.lang.String str60 = document57.title();
        org.jsoup.nodes.Element element62 = document57.toggleClass("hi!");
        org.jsoup.nodes.Document document63 = document57.normalise();
        document57.title("head");
        java.lang.String str66 = document57.title();
        org.jsoup.nodes.Document document68 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node69 = document68.previousSibling();
        org.jsoup.nodes.Element element70 = document68.nextElementSibling();
        java.lang.String str71 = document68.title();
        org.jsoup.nodes.Element element73 = document68.toggleClass("hi!");
        org.jsoup.nodes.Document document74 = document68.normalise();
        document68.title("");
        java.util.Set<java.lang.String> strSet77 = document68.classNames();
        org.jsoup.nodes.Element element78 = document57.classNames(strSet77);
        org.jsoup.nodes.Element element79 = document57.empty();
        java.util.Set<java.lang.String> strSet80 = document57.classNames();
        org.jsoup.nodes.Element element81 = element25.classNames(strSet80);
        org.jsoup.nodes.Element element82 = element16.classNames(strSet80);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element84 = element82.wrap("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>\n<#root></#root>");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot(" hi!", " hi!");
        org.jsoup.select.Elements elements12 = document1.getElementsByIndexLessThan((int) (byte) 1);
        java.lang.Integer int13 = document1.elementSiblingIndex();
        java.lang.String str14 = document1.outerHtml();
        org.jsoup.nodes.Element element16 = document1.append("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = document1.outputSettings();
        org.jsoup.nodes.Attributes attributes18 = document1.attributes();
        org.jsoup.select.Elements elements19 = document1.children();
        org.jsoup.nodes.Element element21 = document1.appendText("<#root class=\" hi!\">\n <html>\n  <head>\n   <title></title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>hi!");
        java.lang.String str22 = document1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>></<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>>hi!hi!&lt;html&gt; &lt;head&gt; &lt;title&gt;&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element9 = document7.text("#root");
        org.jsoup.nodes.Element element11 = document7.createElement("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element13 = document7.append("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node16 = document15.previousSibling();
        org.jsoup.nodes.Element element17 = document15.nextElementSibling();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node20 = document19.previousSibling();
        org.jsoup.nodes.Element element21 = document19.nextElementSibling();
        java.lang.String str22 = document19.title();
        org.jsoup.nodes.Element element24 = document19.toggleClass("hi!");
        org.jsoup.nodes.Document document25 = document19.normalise();
        document19.title("");
        java.util.Set<java.lang.String> strSet28 = document19.classNames();
        org.jsoup.nodes.Element element29 = document15.prependChild((org.jsoup.nodes.Node) document19);
        org.jsoup.nodes.Element element31 = document19.prependElement("#root");
        java.lang.String str32 = element31.className();
        java.lang.String str33 = element31.baseUri();
        org.jsoup.nodes.Element element35 = element31.removeClass("<title></title>    \n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements38 = element31.getElementsByAttributeValueNot(" hi!", "<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        boolean boolean39 = document7.equals((java.lang.Object) elements38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element41 = document7.wrap("hi! hi!");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document7 = document1.normalise();
        document1.title("head");
        java.lang.String str10 = document1.title();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node13 = document12.previousSibling();
        org.jsoup.nodes.Element element14 = document12.nextElementSibling();
        java.lang.String str15 = document12.title();
        org.jsoup.nodes.Element element17 = document12.toggleClass("hi!");
        org.jsoup.nodes.Document document18 = document12.normalise();
        document12.title("");
        java.util.Set<java.lang.String> strSet21 = document12.classNames();
        org.jsoup.nodes.Element element22 = document1.classNames(strSet21);
        java.lang.String str23 = document1.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = document1.wrap("&lt;head&gt; &lt;title&gt;&lt;/title&gt; &lt;/head&gt;\n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document7 = document1.normalise();
        document1.title("");
        java.util.Set<java.lang.String> strSet10 = document1.classNames();
        org.jsoup.nodes.Element element12 = document1.text("");
        java.lang.String str13 = document1.outerHtml();
        org.jsoup.nodes.Element element15 = document1.child((int) (short) 0);
        org.jsoup.nodes.Element element17 = document1.val("");
        org.jsoup.select.Elements elements19 = element17.getElementsByIndexLessThan((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element17.wrap("head  \n<title></title>");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        org.jsoup.nodes.Element element10 = document1.appendText("hi!");
        java.lang.String str11 = element10.val();
        java.lang.String str12 = element10.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element10.lastElementSibling();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element5 = document1.appendText("");
        org.jsoup.nodes.Node node7 = document1.removeAttr("hi!hi!&lt;title&gt;&lt;/title&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document1.wrap("hi! hi!");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        org.jsoup.nodes.Element element13 = document1.prependText("hi!");
        org.jsoup.nodes.Element element15 = document1.prepend("hi!");
        org.jsoup.select.Elements elements17 = document1.getElementsByIndexGreaterThan((int) (byte) 10);
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node20 = document19.previousSibling();
        org.jsoup.nodes.Element element21 = document19.nextElementSibling();
        java.lang.String str22 = document19.title();
        org.jsoup.nodes.Element element24 = document19.toggleClass("hi!");
        java.lang.String str25 = document19.className();
        org.jsoup.select.Elements elements28 = document19.getElementsByAttributeValueNot(" hi!", " hi!");
        org.jsoup.select.Elements elements30 = document19.getElementsByIndexLessThan((int) (short) 0);
        java.lang.String str31 = document19.ownText();
        org.jsoup.nodes.Element element33 = document19.appendText("hi!");
        org.jsoup.nodes.Element element35 = document19.createElement("#root");
        org.jsoup.nodes.Document.QuirksMode quirksMode36 = document19.quirksMode();
        org.jsoup.nodes.Document document37 = document1.quirksMode(quirksMode36);
        org.jsoup.select.Elements elements39 = document37.getElementsByIndexLessThan(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element40 = document37.firstElementSibling();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element17 = document5.prependElement("#root");
        org.jsoup.nodes.Element element18 = document5.head();
        org.jsoup.nodes.Node node20 = document5.childNode((int) (short) 1);
        document5.remove();
        java.lang.String str22 = document5.title();
        org.jsoup.nodes.Element element24 = document5.text("hi!");
        java.lang.String str25 = document5.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = document5.firstElementSibling();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element9 = document7.removeClass("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Attributes attributes10 = element9.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element9.wrap("hi! hi!");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document4 = document1.ownerDocument();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = document4.textNodes();
        org.jsoup.select.Elements elements6 = document4.parents();
        org.jsoup.select.Elements elements7 = document4.getAllElements();
        org.jsoup.select.Elements elements10 = document4.getElementsByAttributeValueMatching("head", "head");
        org.jsoup.select.Elements elements13 = document4.getElementsByAttributeValueNot("<html><head><title></title></head><body></body></html>", "hi!");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node16 = document15.previousSibling();
        org.jsoup.nodes.Element element17 = document15.nextElementSibling();
        java.lang.String str18 = document15.title();
        org.jsoup.nodes.Element element20 = document15.toggleClass("hi!");
        org.jsoup.nodes.Document document21 = document15.normalise();
        document15.title("head");
        java.lang.String str24 = document15.title();
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node27 = document26.previousSibling();
        org.jsoup.nodes.Element element28 = document26.nextElementSibling();
        java.lang.String str29 = document26.title();
        org.jsoup.nodes.Element element31 = document26.toggleClass("hi!");
        org.jsoup.nodes.Document document32 = document26.normalise();
        document26.title("");
        java.util.Set<java.lang.String> strSet35 = document26.classNames();
        org.jsoup.nodes.Element element36 = document15.classNames(strSet35);
        org.jsoup.nodes.Element element37 = document4.classNames(strSet35);
        org.jsoup.select.Elements elements39 = document4.getElementsByIndexGreaterThan(0);
        org.jsoup.select.Elements elements41 = document4.getElementsByClass("hi!hi!\n<#root class=\" hi!\">\n <#root></#root>\n <html>\n  <head>\n   <title></title>\n  </head>\n  <body></body>\n </html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element42 = document4.firstElementSibling();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        org.jsoup.select.Elements elements12 = document1.children();
        org.jsoup.select.Elements elements13 = document1.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = document1.wrap("<#root class=\" hi! head\">\n <html>\n  <head>\n   <title></title>\n  </head>\n  <body></body>\n </html>\n</#root>\n<#document></#document>");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueContaining("#root", " hi!");
        org.jsoup.select.Elements elements13 = document1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element15 = document1.createElement("<title></title>    \n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element17 = document1.removeClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = document1.text(" hi!");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        org.jsoup.nodes.Element element12 = document1.appendText("hi!");
        org.jsoup.nodes.Element element13 = document1.empty();
        org.jsoup.nodes.Element element15 = document1.toggleClass("");
        org.jsoup.select.Elements elements17 = element15.getElementsMatchingText("<#root class=\" hi!\">\n <html>\n  <head>\n   <title></title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>hi!");
        org.jsoup.select.Elements elements19 = element15.getElementsContainingText("<#root class=\" hi!\">\n <html>\n  <head>\n   <title>head</title>\n  </head>\n  <body></body>\n </html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element15.lastElementSibling();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        org.jsoup.nodes.Element element12 = document1.appendText("hi!");
        org.jsoup.nodes.Element element13 = document1.empty();
        java.lang.Integer int14 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document.QuirksMode quirksMode15 = document1.quirksMode();
        org.jsoup.select.Elements elements16 = document1.siblingElements();
        org.jsoup.nodes.Element element18 = document1.removeClass(" hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = document1.firstElementSibling();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot(" hi!", " hi!");
        org.jsoup.select.Elements elements12 = document1.getElementsByIndexLessThan((int) (short) 0);
        java.lang.String str13 = document1.ownText();
        org.jsoup.nodes.Element element15 = document1.appendText("hi!");
        org.jsoup.nodes.Element element17 = document1.createElement("#root");
        org.jsoup.nodes.Document.QuirksMode quirksMode18 = document1.quirksMode();
        org.jsoup.nodes.Document.QuirksMode quirksMode19 = document1.quirksMode();
        org.jsoup.nodes.Element element21 = document1.val(" hi! head");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element21.firstElementSibling();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        java.lang.String str12 = document1.nodeName();
        org.jsoup.nodes.Document document13 = document1.normalise();
        java.lang.String str14 = document13.baseUri();
        boolean boolean16 = document13.hasClass(" hi!");
        org.jsoup.nodes.Element element18 = document13.append("#root");
        org.jsoup.nodes.Element element19 = element18.empty();
        boolean boolean20 = element18.isBlock();
        org.jsoup.select.Elements elements22 = element18.getElementsMatchingText("<title></title>");
        org.jsoup.nodes.Element element25 = element18.attr("<#root class=\" hi!\">\n <html>\n  <head>\n   <title></title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>hi!", "<html><head><title></title></head><body></body></html>");
        org.jsoup.select.Elements elements27 = element18.getElementsByIndexLessThan(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = element18.firstElementSibling();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element9 = document7.toggleClass("<title></title>    \n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.jsoup.parser.Tag tag10 = document7.tag();
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("<title></title>    \n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node15 = document14.previousSibling();
        org.jsoup.nodes.Element element16 = document14.nextElementSibling();
        java.lang.String str17 = document14.title();
        org.jsoup.nodes.Element element19 = document14.toggleClass("hi!");
        org.jsoup.nodes.Element element21 = document14.toggleClass("");
        org.jsoup.select.Elements elements24 = document14.getElementsByAttributeValueContaining("#root", " hi!");
        org.jsoup.nodes.Element element26 = document14.tagName("hi!");
        org.jsoup.nodes.Document.QuirksMode quirksMode27 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document28 = document14.quirksMode(quirksMode27);
        org.jsoup.nodes.Document document29 = document12.quirksMode(quirksMode27);
        org.jsoup.nodes.Document document30 = document7.quirksMode(quirksMode27);
        org.jsoup.nodes.Element element32 = document30.addClass("hi!");
        java.lang.String str33 = document30.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element34 = document30.firstElementSibling();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document16 = document5.normalise();
        org.jsoup.nodes.Element element18 = document16.addClass("head");
        org.jsoup.select.Elements elements21 = document16.getElementsByAttributeValueStarting("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>", "hi!");
        org.jsoup.nodes.Element element23 = document16.createElement("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements25 = document16.getElementsByTag("<#root></#root>\n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        document16.remove();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = document16.wrap("head  \n<title></title>");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.nodes.Element element8 = document1.head();
        org.jsoup.nodes.Document document9 = document1.clone();
        java.lang.String str11 = document9.absUrl("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        java.lang.String str12 = document9.outerHtml();
        java.lang.Integer int13 = document9.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = document9.text("hi! head");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot(" hi!", " hi!");
        org.jsoup.select.Elements elements12 = document1.getElementsByIndexLessThan((int) (byte) 1);
        java.lang.Integer int13 = document1.elementSiblingIndex();
        java.lang.String str14 = document1.outerHtml();
        org.jsoup.nodes.Element element16 = document1.append("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element16.firstElementSibling();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document7 = document1.normalise();
        boolean boolean9 = document1.hasClass("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element11 = document1.toggleClass("head");
        org.jsoup.nodes.Document document12 = document1.clone();
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node15 = document14.previousSibling();
        org.jsoup.nodes.Element element16 = document14.nextElementSibling();
        java.lang.String str17 = document14.title();
        org.jsoup.nodes.Element element19 = document14.toggleClass("hi!");
        org.jsoup.nodes.Element element21 = document14.toggleClass("");
        org.jsoup.nodes.Element element23 = document14.appendText("hi!");
        java.lang.String str24 = document14.tagName();
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node27 = document26.previousSibling();
        org.jsoup.nodes.Element element28 = document26.nextElementSibling();
        java.lang.String str29 = document26.title();
        org.jsoup.nodes.Element element31 = document26.toggleClass("hi!");
        org.jsoup.nodes.Document document32 = document26.normalise();
        document26.title("");
        java.util.Set<java.lang.String> strSet35 = document26.classNames();
        org.jsoup.nodes.Element element37 = document26.text("");
        org.jsoup.nodes.Element element38 = document14.prependChild((org.jsoup.nodes.Node) document26);
        org.jsoup.nodes.Element element39 = document26.firstElementSibling();
        org.jsoup.select.Elements elements41 = document26.getElementsMatchingText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element42 = document1.appendChild((org.jsoup.nodes.Node) document26);
        org.jsoup.nodes.Document document44 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node45 = document44.previousSibling();
        org.jsoup.nodes.Element element46 = document44.nextElementSibling();
        java.lang.String str47 = document44.title();
        org.jsoup.nodes.Element element49 = document44.toggleClass("hi!");
        org.jsoup.nodes.Element element51 = document44.toggleClass("");
        org.jsoup.select.Elements elements53 = element51.getElementsMatchingOwnText("");
        java.lang.String str55 = element51.attr("");
        org.jsoup.nodes.Element element57 = element51.prependText("");
        java.lang.String str58 = element51.text();
        java.lang.String str59 = element51.val();
        org.jsoup.select.Elements elements62 = element51.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body></body>\n</html>", "head");
        org.jsoup.nodes.Element element63 = document1.appendChild((org.jsoup.nodes.Node) element51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element65 = element63.wrap("<#root class=\" hi!\">\n <html>\n  <head>\n   <title>head</title>\n  </head>\n  <body></body>\n </html>\n</#root>");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node6 = document5.previousSibling();
        org.jsoup.nodes.Element element7 = document5.nextElementSibling();
        java.lang.String str8 = document5.title();
        org.jsoup.nodes.Element element10 = document5.toggleClass("hi!");
        org.jsoup.nodes.Document document11 = document5.normalise();
        document5.title("");
        java.util.Set<java.lang.String> strSet14 = document5.classNames();
        org.jsoup.nodes.Element element15 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.select.Elements elements16 = document1.siblingElements();
        org.jsoup.nodes.Element element18 = document1.toggleClass("head");
        org.jsoup.nodes.Attributes attributes19 = document1.attributes();
        org.jsoup.select.Elements elements20 = document1.siblingElements();
        java.lang.String str21 = document1.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = document1.wrap(" hi!");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        org.jsoup.nodes.Document document4 = document1.ownerDocument();
        org.jsoup.select.Elements elements6 = document1.getElementsByAttribute("#document");
        java.lang.String str7 = document1.title();
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element9 = document1.parent();
        org.jsoup.nodes.Document document10 = document1.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document10.firstElementSibling();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        org.jsoup.nodes.Element element10 = document1.appendText("hi!");
        java.lang.String str11 = document1.tagName();
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node14 = document13.previousSibling();
        org.jsoup.nodes.Element element15 = document13.nextElementSibling();
        java.lang.String str16 = document13.title();
        org.jsoup.nodes.Element element18 = document13.toggleClass("hi!");
        org.jsoup.nodes.Document document19 = document13.normalise();
        document13.title("");
        java.util.Set<java.lang.String> strSet22 = document13.classNames();
        org.jsoup.nodes.Element element24 = document13.text("");
        org.jsoup.nodes.Element element25 = document1.prependChild((org.jsoup.nodes.Node) document13);
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node28 = document27.previousSibling();
        org.jsoup.nodes.Element element29 = document27.nextElementSibling();
        org.jsoup.nodes.Document document31 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node32 = document31.previousSibling();
        org.jsoup.nodes.Element element33 = document31.nextElementSibling();
        java.lang.String str34 = document31.title();
        org.jsoup.nodes.Element element36 = document31.toggleClass("hi!");
        org.jsoup.nodes.Document document37 = document31.normalise();
        document31.title("");
        java.util.Set<java.lang.String> strSet40 = document31.classNames();
        org.jsoup.nodes.Element element41 = document27.prependChild((org.jsoup.nodes.Node) document31);
        org.jsoup.nodes.Document document42 = document31.normalise();
        org.jsoup.nodes.Element element44 = document42.addClass("head");
        org.jsoup.nodes.Document.QuirksMode quirksMode45 = document42.quirksMode();
        org.jsoup.nodes.Document document46 = document1.quirksMode(quirksMode45);
        java.lang.String str47 = document1.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element48 = document1.firstElementSibling();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Attributes attributes2 = document1.attributes();
        org.jsoup.select.Elements elements4 = document1.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements5 = document1.siblingElements();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValue("#root", "hi!");
        org.jsoup.select.Elements elements10 = document1.getElementsContainingOwnText("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot(" hi!", " hi!");
        org.jsoup.select.Elements elements12 = document1.getElementsByIndexLessThan((int) (byte) 1);
        org.jsoup.nodes.Node node14 = document1.removeAttr("head");
        java.lang.String str15 = document1.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<title></title>    \n<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.select.Elements elements3 = document1.getElementsContainingOwnText("#document");
        org.jsoup.select.Elements elements5 = document1.getElementsByAttribute("hi!hi!");
        org.jsoup.nodes.Node node6 = document1.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document1.firstElementSibling();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document7 = document1.normalise();
        document1.title("");
        java.util.Set<java.lang.String> strSet10 = document1.classNames();
        org.jsoup.nodes.Element element12 = document1.text("");
        org.jsoup.select.Elements elements14 = document1.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.select.Elements elements16 = document1.getElementsContainingText("#root");
        org.jsoup.nodes.Element element18 = document1.createElement("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element20 = document1.toggleClass("hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = document1.wrap("<<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>></<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>>hi!hi!&lt;html&gt; &lt;head&gt; &lt;title&gt;&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot(" hi!", " hi!");
        org.jsoup.select.Elements elements12 = document1.getElementsByIndexLessThan((int) (byte) 1);
        java.lang.Integer int13 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element15 = document1.append("hi!\n<hi!hi!></hi!hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element15.firstElementSibling();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        java.lang.String str7 = document1.className();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot(" hi!", " hi!");
        org.jsoup.select.Elements elements12 = document1.getElementsByIndexLessThan((int) (short) 0);
        java.lang.String str13 = document1.ownText();
        org.jsoup.nodes.Element element15 = document1.appendText("hi!");
        org.jsoup.nodes.Element element17 = document1.createElement("#root");
        org.jsoup.nodes.Document.QuirksMode quirksMode18 = document1.quirksMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = document1.firstElementSibling();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Node node2 = document1.previousSibling();
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element8 = document1.toggleClass("");
        java.lang.String str10 = document1.absUrl("hi!");
        java.lang.String str11 = document1.html();
        org.jsoup.nodes.Element element13 = document1.prependText("hi!");
        org.jsoup.nodes.Element element15 = document1.prepend("hi!");
        org.jsoup.nodes.Element element17 = document1.appendText("<html>\n <head>\n  <title></title>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Document document18 = document1.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = document1.outputSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = document1.firstElementSibling();
    }
}

