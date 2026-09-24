package org.jsoup.nodes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        org.jsoup.select.Elements elements4 = document1.getElementsByTag("#document");
        org.jsoup.nodes.Element element6 = document1.html("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document1.siblingNodes();
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element3.childNodes();
        org.jsoup.select.Elements elements8 = element3.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element3.firstElementSibling();
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root class=\"\"></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node2 = document1.previousSibling();
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Element element4 = document1.head();
        java.lang.String str5 = document1.nodeName();
        java.lang.String str6 = document1.id();
        java.lang.String str7 = document1.nodeName();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element11 = document9.html("");
        java.lang.String str12 = element11.className();
        boolean boolean14 = element11.hasClass("hi!");
        boolean boolean16 = element11.hasAttr("#document");
        org.jsoup.nodes.Element element18 = element11.prependElement("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = element18.siblingNodes();
        org.jsoup.nodes.Element element20 = element18.empty();
        org.jsoup.nodes.Element element22 = element18.html("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element23 = element18.empty();
        org.jsoup.nodes.Element element25 = element23.before("");
        org.jsoup.select.Elements elements27 = element25.getElementsMatchingText("<html>\n <head></head>\n <body>\n </body>\n</html><<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
        boolean boolean28 = document1.equals((java.lang.Object) element25);
        java.lang.String str29 = document1.ownText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = document1.firstElementSibling();
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.html();
        java.lang.String str9 = element5.text();
        java.lang.String str10 = element5.className();
        java.lang.String str11 = element5.ownText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element5.wrap("<body></body>\n<html> \n <head></head> \n <body> \n </body>\n</html><#root #root=\"\"></#root>");
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueStarting("#root", "hi!  #document");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document1.firstElementSibling();
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Element element4 = document1.head();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.createElement(" #document");
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.select.Elements elements10 = document1.getElementsMatchingOwnText("<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element14 = document12.html("");
        java.lang.String str15 = element14.className();
        org.jsoup.nodes.Element element16 = element14.empty();
        boolean boolean18 = element16.hasClass("");
        java.lang.String str19 = element16.html();
        java.lang.String str20 = element16.text();
        org.jsoup.select.Elements elements23 = element16.getElementsByAttributeValueMatching("hi!", "hi!  #document");
        java.lang.String str25 = element16.attr("#root");
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element29 = document27.html("");
        org.jsoup.nodes.Element element31 = element29.html("#document");
        org.jsoup.nodes.Element element33 = element31.appendElement("hi!");
        org.jsoup.nodes.Element element34 = element16.appendChild((org.jsoup.nodes.Node) element33);
        org.jsoup.nodes.Element element35 = document1.prependChild((org.jsoup.nodes.Node) element16);
        java.lang.Integer int36 = document1.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements37 = document1.siblingElements();
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element6 = element3.append("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str8 = element3.absUrl("\n<<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element3.lastElementSibling();
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.appendText("hi!");
        java.lang.String str6 = element5.html();
        org.jsoup.nodes.Element element9 = element5.attr("<html>\n <head></head>\n <body></body>\n</html>", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element9.siblingNodes();
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        boolean boolean5 = element3.hasClass("#document");
        org.jsoup.select.Elements elements6 = element3.parents();
        org.jsoup.select.Elements elements9 = element3.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.html("");
        java.lang.String str14 = element13.className();
        org.jsoup.nodes.Element element15 = element3.prependChild((org.jsoup.nodes.Node) element13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element15.lastElementSibling();
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.head();
        org.jsoup.nodes.Node node5 = document1.nextSibling();
        org.jsoup.nodes.Document document6 = document1.normalise();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = document1.outputSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document1.previousElementSibling();
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element3.childNodes();
        org.jsoup.nodes.Element element9 = element3.toggleClass("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        java.lang.Integer int10 = element9.siblingIndex();
        org.jsoup.nodes.Element element12 = element9.appendText("#root <html> <head></head> <body></body> </html>");
        org.jsoup.select.Elements elements15 = element12.getElementsByAttributeValueEnding("\n<body></body>", "hi! #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element12.previousElementSibling();
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element7 = document1.prependChild((org.jsoup.nodes.Node) document6);
        java.lang.Integer int8 = document1.siblingIndex();
        java.lang.String str9 = document1.text();
        org.jsoup.select.Elements elements11 = document1.getElementsMatchingText("");
        org.jsoup.nodes.Element element13 = document1.toggleClass("\n<head></head>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = document1.lastElementSibling();
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        document1.title("#root");
        org.jsoup.nodes.Document document7 = document1.ownerDocument();
        java.lang.String str8 = document7.className();
        java.lang.String str9 = document7.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = document7.previousSibling();
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.select.Elements elements6 = element3.getElementsByIndexLessThan((int) (short) 10);
        java.lang.String str7 = element3.data();
        org.jsoup.nodes.Element element9 = element3.append("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str12 = document11.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = document11.new OutputSettings();
        java.lang.String str14 = document11.id();
        java.lang.String str15 = document11.outerHtml();
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("#document");
        java.util.Set<java.lang.String> strSet18 = document17.classNames();
        org.jsoup.nodes.Element element19 = document11.classNames(strSet18);
        org.jsoup.nodes.Element element20 = element3.classNames(strSet18);
        org.jsoup.select.Elements elements21 = element3.children();
        boolean boolean23 = element3.hasAttr("hi!");
        org.jsoup.select.Elements elements25 = element3.getElementsByIndexLessThan((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = element3.previousElementSibling();
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!  #document");
        java.lang.String str2 = document1.val();
        java.lang.String str3 = document1.title();
        java.lang.String str4 = document1.nodeName();
        org.jsoup.nodes.Element element5 = document1.body();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("hi! #document<#root>\n #document<hi!></hi!>\n</#root>");
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document document8 = element7.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document8.text("<hi!  #document></hi!  #document>");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element9 = element3.empty();
        java.lang.String str11 = element3.absUrl("#document");
        boolean boolean12 = element3.hasText();
        java.lang.String str13 = element3.html();
        java.lang.String str14 = element3.id();
        org.jsoup.select.Elements elements16 = element3.getElementsByAttributeStarting("#document");
        org.jsoup.nodes.Element element18 = element3.prependText("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements20 = element18.getElementsByIndexGreaterThan((int) 'a');
        org.jsoup.nodes.Element element22 = element18.prepend("<html> \n <head> \n  <title>#root</title> \n </head> \n <body> \n </body>\n</html>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements23 = element18.siblingElements();
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.createElement("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str4 = document1.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = document1.previousSibling();
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.appendText("hi!");
        java.lang.String str6 = element3.data();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document8.html("");
        java.lang.String str11 = element10.className();
        org.jsoup.nodes.Element element12 = element10.empty();
        java.lang.String str13 = element12.className();
        org.jsoup.nodes.Node node14 = element12.nextSibling();
        java.lang.String str15 = element12.className();
        org.jsoup.parser.Tag tag16 = element12.tag();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element19 = document18.head();
        org.jsoup.nodes.Element element20 = element12.prependChild((org.jsoup.nodes.Node) document18);
        boolean boolean21 = element3.equals((java.lang.Object) element12);
        java.util.Set<java.lang.String> strSet22 = element3.classNames();
        org.jsoup.nodes.Element element24 = element3.html("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements26 = element3.getElementsContainingOwnText("#documenthi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList27 = element3.siblingNodes();
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = document1.createElement("hi!");
        org.jsoup.nodes.Element element7 = element5.prependElement("<html>\n <head></head>\n <body>\n </body>\n</html><<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
        org.jsoup.nodes.Document document8 = element5.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements9 = element5.siblingElements();
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document1.append("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document1.childNodes();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element9 = document8.head();
        java.lang.String str10 = document8.outerHtml();
        java.lang.Integer int11 = document8.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = document8.outputSettings();
        java.lang.String str13 = document8.title();
        org.jsoup.select.Elements elements14 = document8.getAllElements();
        boolean boolean15 = document1.equals((java.lang.Object) elements14);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = document1.outputSettings();
        org.jsoup.nodes.Element element18 = document1.prepend("#document");
        org.jsoup.nodes.Element element20 = element18.prependText("#document <head></head>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList21 = element20.siblingNodes();
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        org.jsoup.nodes.Document document12 = document1.normalise();
        java.lang.String str13 = document1.nodeName();
        org.jsoup.select.Elements elements14 = document1.parents();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements15 = document1.siblingElements();
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.html();
        java.lang.String str9 = element5.text();
        java.lang.String str10 = element5.className();
        org.jsoup.select.Elements elements12 = element5.getElementsContainingText("<hi!  #document></hi!  #document>");
        org.jsoup.select.Elements elements15 = element5.getElementsByAttributeValue("<html> \n <head> \n  <title>#root</title> \n </head> \n <body> \n </body>\n</html>hi!", "<hi!  #document></hi!  #document>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements16 = element5.siblingElements();
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document1.siblingNodes();
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.outerHtml();
        java.lang.String str3 = document1.className();
        org.jsoup.nodes.Attributes attributes4 = document1.attributes();
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueMatching("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "hi!#root <html> <head></head> <body></body> </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document1.firstElementSibling();
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        boolean boolean3 = document1.isBlock();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str6 = document1.attr("hi!");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexEquals((int) (byte) 0);
        org.jsoup.nodes.Node node11 = document1.childNode(0);
        java.lang.String str12 = document1.outerHtml();
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element16 = document14.html("");
        org.jsoup.nodes.Element element18 = element16.appendText("hi!");
        java.lang.String str19 = element18.html();
        java.lang.String str20 = element18.text();
        org.jsoup.select.Elements elements22 = element18.getElementsByAttributeStarting("#root");
        org.jsoup.nodes.Element element24 = element18.prepend("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element25 = document1.appendChild((org.jsoup.nodes.Node) element18);
        org.jsoup.select.Elements elements27 = element25.getElementsMatchingText("\n<body></body>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = element25.previousElementSibling();
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.append("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements5 = document1.getElementsByClass("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements6 = document1.siblingElements();
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.Integer int5 = document1.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.outputSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements7 = document1.siblingElements();
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.jsoup.nodes.Element element5 = document1.append("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document1.childNodes();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element9 = document8.head();
        java.lang.String str10 = document8.outerHtml();
        java.lang.Integer int11 = document8.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = document8.outputSettings();
        java.lang.String str13 = document8.title();
        org.jsoup.select.Elements elements14 = document8.getAllElements();
        boolean boolean15 = document1.equals((java.lang.Object) elements14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = document1.nextElementSibling();
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = document1.createElement("hi!");
        java.util.Set<java.lang.String> strSet6 = document1.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document1.nextElementSibling();
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        java.lang.String str8 = element5.className();
        org.jsoup.parser.Tag tag9 = element5.tag();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element12 = document11.head();
        org.jsoup.nodes.Element element13 = element5.prependChild((org.jsoup.nodes.Node) document11);
        org.jsoup.nodes.Element element15 = element5.prependText("#document");
        boolean boolean17 = element5.hasClass("hi!  #document");
        org.jsoup.nodes.Element element19 = element5.addClass("hi!  #document");
        org.jsoup.nodes.Element element21 = element19.html("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element19.siblingNodes();
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.val("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element5 = element3.appendText("#document");
        org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValue("&lt;&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;&lt;/&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;", "<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = element5.dataset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements10 = element5.siblingElements();
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document1.childNodes();
        java.lang.String str8 = document1.title();
        java.lang.String str9 = document1.val();
        java.lang.String str10 = document1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document1.nextElementSibling();
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element9 = document1.head();
        java.lang.String str10 = document1.nodeName();
        org.jsoup.select.Elements elements12 = document1.getElementsMatchingOwnText("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements14 = document1.getElementsContainingOwnText("#root #document");
        org.jsoup.nodes.Element element16 = document1.toggleClass("<html>\n <head></head>\n <body>\n  #document\n </body>\n</html>");
        org.jsoup.select.Elements elements19 = element16.getElementsByAttributeValue("<html> <head> <title>#root</title> </head> <body></body> </html>", "hi! #document");
        java.lang.String str20 = element16.id();
        org.jsoup.nodes.Element element22 = element16.val("#document <head></head>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element16.nextElementSibling();
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#document");
        java.lang.String str2 = document1.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("");
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.outerHtml();
        java.lang.String str3 = document1.className();
        java.lang.String str5 = document1.absUrl("hi!");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueEnding("#root", "hi!  #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document1.firstElementSibling();
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Element element4 = document1.appendElement("#document");
        java.lang.String str5 = document1.title();
        org.jsoup.nodes.Element element7 = document1.text("<#root></#root>hi!");
        org.jsoup.nodes.Node node9 = element7.removeAttr("<#root></#root>");
        org.jsoup.nodes.Element element12 = element7.attr("<hi!></hi!>", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements15 = element12.getElementsByAttributeValueContaining("body", "hi! #document<#root>\n #document<hi!></hi!>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element12.lastElementSibling();
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element9 = element7.html("hi!#root\n<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
        org.jsoup.select.Elements elements10 = element9.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = element9.previousSibling();
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependElement("hi!");
        org.jsoup.select.Elements elements11 = element3.parents();
        org.jsoup.nodes.Element element12 = element3.empty();
        java.lang.String str13 = element12.tagName();
        org.jsoup.select.Elements elements16 = element12.getElementsByAttributeValue("&lt;&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;&lt;/&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&gt;", "body");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements17 = element12.siblingElements();
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.html();
        java.lang.String str9 = element5.text();
        org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueMatching("hi!", "hi!  #document");
        java.lang.String str14 = element5.attr("#root");
        org.jsoup.nodes.Element element16 = element5.toggleClass("");
        org.jsoup.select.Elements elements18 = element5.getElementsByIndexGreaterThan(1);
        org.jsoup.select.Elements elements20 = element5.getElementsMatchingText("#document");
        org.jsoup.nodes.Element element22 = element5.prependElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element24 = element22.after(" hi!");
        org.jsoup.nodes.Document document25 = element22.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements26 = document25.siblingElements();
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        java.lang.String str12 = document1.outerHtml();
        org.jsoup.nodes.Element element14 = document1.appendText("hi!  #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = document1.wrap("<#root class=\"\"></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        document1.setBaseUri("");
        boolean boolean11 = document1.hasAttr("");
        java.lang.String str12 = document1.baseUri();
        org.jsoup.nodes.Element element14 = document1.html("hi!  #document");
        org.jsoup.nodes.Element element16 = document1.createElement("<#root hi!  #document=\"#document\"></#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = document1.text("hi!#root");
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.jsoup.nodes.Element element14 = document7.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.nodes.Element element15 = document1.classNames((java.util.Set<java.lang.String>) strSet12);
        java.lang.String str16 = document1.className();
        org.jsoup.nodes.Document document17 = document1.ownerDocument();
        org.jsoup.nodes.Element element19 = document1.prepend("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element21 = document1.text("#root");
        org.jsoup.parser.Tag tag22 = element21.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = element21.previousSibling();
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Node node5 = document1.nextSibling();
        java.lang.String str6 = document1.data();
        java.lang.String str7 = document1.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document1.wrap("<#root> #root <html> <head></head> <body></body> </html>");
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        boolean boolean9 = element7.hasAttr("hi!  #document");
        java.lang.String str10 = element7.tagName();
        java.lang.String str11 = element7.toString();
        org.jsoup.nodes.Document document12 = element7.ownerDocument();
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element16 = document14.html("");
        boolean boolean18 = element16.hasClass("#document");
        org.jsoup.select.Elements elements19 = element16.parents();
        org.jsoup.select.Elements elements22 = element16.getElementsByAttributeValueMatching("#document", "hi!");
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element26 = document24.html("");
        java.lang.String str27 = element26.className();
        org.jsoup.nodes.Element element28 = element16.prependChild((org.jsoup.nodes.Node) element26);
        org.jsoup.nodes.Element element30 = element26.prependText("#document");
        org.jsoup.nodes.Document document32 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element34 = document32.html("");
        org.jsoup.nodes.Element element36 = element34.appendText("hi!");
        java.lang.String str37 = element36.html();
        java.lang.String str38 = element36.text();
        org.jsoup.nodes.Element element39 = element26.appendChild((org.jsoup.nodes.Node) element36);
        java.util.List<org.jsoup.nodes.Node> nodeList40 = element26.siblingNodes();
        boolean boolean41 = document12.equals((java.lang.Object) element26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList42 = document12.siblingNodes();
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = document1.toString();
        org.jsoup.select.Elements elements5 = document1.parents();
        java.lang.String str6 = document1.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = document1.previousSibling();
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements8 = element3.getElementsByAttributeValueEnding("<html>\n <head></head>\n <body></body>\n</html>", "hi!  #document");
        org.jsoup.select.Elements elements10 = element3.getElementsContainingText("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element3.nextElementSibling();
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.outputSettings();
        document1.title("hi!  #document");
        java.lang.String str6 = document1.title();
        boolean boolean7 = document1.hasText();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = document9.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.select.Elements elements19 = document9.getElementsByAttributeValueStarting("#document", "hi!  #document");
        org.jsoup.nodes.Document document20 = document9.normalise();
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element24 = document22.html("");
        org.jsoup.nodes.Element element26 = element24.html("#document");
        org.jsoup.nodes.Document document28 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element30 = document28.html("");
        java.lang.String str31 = element30.className();
        org.jsoup.nodes.Element element32 = element30.empty();
        org.jsoup.select.Elements elements34 = element30.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element36 = element30.html("hi!");
        boolean boolean38 = element36.hasAttr("hi!");
        java.util.Set<java.lang.String> strSet39 = element36.classNames();
        org.jsoup.nodes.Element element40 = element26.classNames(strSet39);
        org.jsoup.nodes.Element element41 = document9.classNames(strSet39);
        org.jsoup.nodes.Element element43 = element41.prependText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element45 = element43.prependText("#root");
        org.jsoup.nodes.Element element47 = element45.append("<#root></#root>hi!");
        java.util.Set<java.lang.String> strSet48 = element45.classNames();
        org.jsoup.nodes.Element element49 = document1.classNames(strSet48);
        java.lang.String str50 = document1.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element51 = document1.lastElementSibling();
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        org.jsoup.nodes.Node node4 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element6 = document1.toggleClass("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element6.nextElementSibling();
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        java.lang.String str8 = element5.className();
        org.jsoup.parser.Tag tag9 = element5.tag();
        java.lang.String str10 = element5.ownText();
        org.jsoup.select.Elements elements12 = element5.getElementsContainingText("#document");
        org.jsoup.select.Elements elements15 = element5.getElementsByAttributeValueContaining("#document", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements17 = element5.getElementsByAttributeStarting("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element5.firstElementSibling();
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Node node6 = document1.removeAttr("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element8 = document1.addClass("");
        org.jsoup.nodes.Element element10 = document1.val("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element11 = document1.body();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document1.firstElementSibling();
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.select.Elements elements7 = document1.getElementsByIndexGreaterThan(10);
        java.lang.String str8 = document1.className();
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueNot("hi!", "#root");
        org.jsoup.select.Elements elements12 = document1.getAllElements();
        boolean boolean13 = document1.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = document1.text("\n<<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        org.jsoup.nodes.Element element3 = document1.parent();
        org.jsoup.nodes.Element element4 = document1.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document1.previousElementSibling();
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        org.jsoup.select.Elements elements8 = element3.getElementsByAttribute("<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>");
        org.jsoup.select.Elements elements10 = element3.getElementsByAttribute("<#root></#root>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = element3.previousSibling();
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.siblingIndex();
        org.jsoup.nodes.Document document5 = document1.ownerDocument();
        boolean boolean6 = document5.isBlock();
        java.lang.String str7 = document5.tagName();
        org.jsoup.select.Elements elements9 = document5.getElementsByIndexEquals((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document5.title("hi! #document");
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html> <head></head> <body></body> </html>");
        java.lang.String str2 = document1.className();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.outputSettings();
        org.jsoup.nodes.Document document5 = org.jsoup.nodes.Document.createShell("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.parser.Tag tag6 = document5.tag();
        org.jsoup.nodes.Document document7 = document5.ownerDocument();
        boolean boolean9 = document5.hasClass("<html>\n <head></head>\n <body>\n </body>\n</html><<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node13 = document11.removeAttr("#document");
        org.jsoup.nodes.Element element15 = document11.createElement("<#root></#root>");
        org.jsoup.nodes.Element element18 = document11.attr("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>", "#root");
        java.util.Set<java.lang.String> strSet19 = document11.classNames();
        org.jsoup.nodes.Element element20 = document5.classNames(strSet19);
        org.jsoup.nodes.Element element21 = document1.prependChild((org.jsoup.nodes.Node) document5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = element21.previousSibling();
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.html("#document");
        org.jsoup.parser.Tag tag6 = element5.tag();
        org.jsoup.select.Elements elements8 = element5.getElementsByClass("hi!  #document");
        org.jsoup.select.Elements elements11 = element5.getElementsByAttributeValueEnding("<html> <head> <title>#root</title> </head> <body></body> </html>", "<html> \n <head></head> \n <body> \n </body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = element5.previousSibling();
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        document1.setBaseUri("");
        boolean boolean11 = document1.hasAttr("");
        java.lang.String str12 = document1.baseUri();
        org.jsoup.nodes.Element element14 = document1.html("hi!  #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element14.firstElementSibling();
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!  #document", "#document");
        org.jsoup.select.Elements elements6 = document1.getElementsContainingText("hi!  #document");
        java.lang.String str7 = document1.text();
        java.lang.String str9 = document1.absUrl("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element11 = document1.createElement(" #document");
        org.jsoup.select.Elements elements13 = document1.getElementsByIndexLessThan(0);
        org.jsoup.nodes.Document document14 = document1.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = document1.lastElementSibling();
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.head();
        org.jsoup.nodes.Node node5 = document1.nextSibling();
        org.jsoup.nodes.Document document6 = document1.normalise();
        org.jsoup.nodes.Element element8 = document6.prepend("<html>\n <head>\n  <title> hi!</title>\n </head>\n <body>\n  #document\n </body>\n</html>");
        org.jsoup.nodes.Element element10 = element8.getElementById("<#root></#root>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element8.nextElementSibling();
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttribute("hi!  #document");
        document1.setBaseUri("");
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element15 = document14.head();
        java.lang.String str16 = document14.outerHtml();
        java.lang.Integer int17 = document14.elementSiblingIndex();
        java.lang.String str18 = document14.nodeName();
        org.jsoup.nodes.Element element20 = document14.removeClass("");
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = document14.outputSettings();
        org.jsoup.select.Elements elements23 = document14.getElementsByAttribute("hi!  #document");
        document14.setBaseUri("");
        org.jsoup.nodes.Element element26 = document1.prependChild((org.jsoup.nodes.Node) document14);
        org.jsoup.select.Elements elements28 = document14.getElementsByIndexGreaterThan((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = document14.text("<html> \n <head></head> \n <body> \n </body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = document1.createElement("hi!");
        java.util.Set<java.lang.String> strSet6 = document1.classNames();
        org.jsoup.nodes.Element element8 = document1.appendText("#document");
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.new OutputSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document1.lastElementSibling();
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.val();
        java.lang.String[] strArray13 = new java.lang.String[] { "<#root></#root>", "<#root></#root>", "<#root hi!  #document=\"#document\"></#root>", "#document", "<#root hi!  #document=\"#document\"></#root>", "<#root hi!  #document=\"#document\"></#root>", "#document", "#root", "hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = document1.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.nodes.Element element18 = document1.prependElement("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = document1.outputSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<html>\n <head></head>\n <body></body>\n</html>#document");
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        org.jsoup.nodes.Element element8 = element5.removeClass("hi!");
        org.jsoup.nodes.Element element10 = element8.appendText("hi!");
        org.jsoup.select.Elements elements12 = element8.getElementsContainingOwnText("hi!  #document");
        org.jsoup.nodes.Node node14 = element8.removeAttr("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        boolean boolean18 = document16.hasClass("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element22 = document20.html("");
        java.lang.String str23 = element22.className();
        org.jsoup.nodes.Element element24 = element22.empty();
        org.jsoup.select.Elements elements26 = element22.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element28 = element22.html("hi!");
        boolean boolean29 = document16.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = document16.new OutputSettings();
        org.jsoup.nodes.Element element31 = element8.prependChild((org.jsoup.nodes.Node) document16);
        boolean boolean32 = element31.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element33 = element31.previousElementSibling();
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        org.jsoup.nodes.Document document12 = document1.normalise();
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element16 = document14.html("");
        org.jsoup.nodes.Element element18 = element16.html("#document");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element22 = document20.html("");
        java.lang.String str23 = element22.className();
        org.jsoup.nodes.Element element24 = element22.empty();
        org.jsoup.select.Elements elements26 = element22.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element28 = element22.html("hi!");
        boolean boolean30 = element28.hasAttr("hi!");
        java.util.Set<java.lang.String> strSet31 = element28.classNames();
        org.jsoup.nodes.Element element32 = element18.classNames(strSet31);
        org.jsoup.nodes.Element element33 = document1.classNames(strSet31);
        org.jsoup.nodes.Element element35 = element33.prependText("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.Integer int36 = element35.elementSiblingIndex();
        org.jsoup.nodes.Element element38 = element35.prependElement("<#root></#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element39 = element35.previousElementSibling();
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("");
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        document1.setBaseUri("");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document1.outputSettings();
        org.jsoup.nodes.Element element12 = document1.prependElement("#root");
        org.jsoup.select.Elements elements14 = document1.getElementsContainingOwnText("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str15 = document1.html();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = document1.new OutputSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document1.lastElementSibling();
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n <head></head>\n <body>\n  #document\n </body>\n</html>");
        org.jsoup.nodes.Node node3 = document1.removeAttr("&lt;#root&gt; #root \n<html> \n <head></head> \n <body>\n   &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;   \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements4 = document1.siblingElements();
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueStarting("#document", "hi!  #document");
        org.jsoup.nodes.Document document12 = document1.normalise();
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element16 = document14.html("");
        org.jsoup.nodes.Element element18 = element16.html("#document");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element22 = document20.html("");
        java.lang.String str23 = element22.className();
        org.jsoup.nodes.Element element24 = element22.empty();
        org.jsoup.select.Elements elements26 = element22.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element28 = element22.html("hi!");
        boolean boolean30 = element28.hasAttr("hi!");
        java.util.Set<java.lang.String> strSet31 = element28.classNames();
        org.jsoup.nodes.Element element32 = element18.classNames(strSet31);
        org.jsoup.nodes.Element element33 = document1.classNames(strSet31);
        org.jsoup.nodes.Element element35 = element33.prependText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element37 = element35.prependText("#root");
        org.jsoup.nodes.Element element39 = element37.prepend("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList40 = element37.siblingNodes();
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.removeClass("");
        org.jsoup.nodes.Element element5 = element3.toggleClass("hi!");
        org.jsoup.nodes.Document document6 = element5.ownerDocument();
        org.jsoup.nodes.Element element8 = document6.toggleClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element8.firstElementSibling();
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        boolean boolean6 = element3.hasClass("hi!");
        boolean boolean8 = element3.hasAttr("#document");
        org.jsoup.nodes.Element element10 = element3.prependElement("hi!");
        org.jsoup.nodes.Element element12 = element10.appendElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element13 = element10.parent();
        boolean boolean14 = element13.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element13.firstElementSibling();
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueContaining("#document", "hi!");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueNot("#document", "#document");
        org.jsoup.nodes.Element element11 = document1.text("#document");
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = document1.outputSettings();
        java.lang.String str13 = document1.className();
        java.lang.String str14 = document1.toString();
        org.jsoup.parser.Tag tag15 = document1.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = document1.previousElementSibling();
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document(" #document");
        org.jsoup.select.Elements elements3 = document1.getElementsByIndexLessThan(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document1.firstElementSibling();
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("");
        boolean boolean9 = element7.hasAttr("hi!  #document");
        java.lang.String str10 = element7.tagName();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document12.head();
        java.lang.String str14 = document12.outerHtml();
        java.lang.Integer int15 = document12.elementSiblingIndex();
        org.jsoup.nodes.Element element17 = document12.addClass("#document");
        boolean boolean19 = element17.hasClass("hi!");
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        org.jsoup.nodes.Element element28 = document21.classNames((java.util.Set<java.lang.String>) strSet26);
        org.jsoup.select.Elements elements31 = document21.getElementsByAttributeValueStarting("#document", "hi!  #document");
        org.jsoup.nodes.Document document32 = document21.normalise();
        org.jsoup.nodes.Document document34 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element36 = document34.html("");
        org.jsoup.nodes.Element element38 = element36.html("#document");
        org.jsoup.nodes.Document document40 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element42 = document40.html("");
        java.lang.String str43 = element42.className();
        org.jsoup.nodes.Element element44 = element42.empty();
        org.jsoup.select.Elements elements46 = element42.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element48 = element42.html("hi!");
        boolean boolean50 = element48.hasAttr("hi!");
        java.util.Set<java.lang.String> strSet51 = element48.classNames();
        org.jsoup.nodes.Element element52 = element38.classNames(strSet51);
        org.jsoup.nodes.Element element53 = document21.classNames(strSet51);
        org.jsoup.nodes.Element element54 = element17.classNames(strSet51);
        org.jsoup.nodes.Element element55 = element7.classNames(strSet51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList56 = element7.siblingNodes();
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        java.util.Set<java.lang.String> strSet7 = element6.classNames();
        java.lang.Integer int8 = element6.elementSiblingIndex();
        org.jsoup.nodes.Document document9 = element6.ownerDocument();
        boolean boolean11 = document9.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document9.text("<body></body>\n<html> \n <head></head> \n <body> \n </body>\n</html><#root #root=\"\"></#root>");
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        org.jsoup.nodes.Element element5 = element3.appendText("hi!");
        java.lang.String str6 = element3.data();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document8.html("");
        java.lang.String str11 = element10.className();
        org.jsoup.nodes.Element element12 = element10.empty();
        java.lang.String str13 = element12.className();
        org.jsoup.nodes.Node node14 = element12.nextSibling();
        java.lang.String str15 = element12.className();
        org.jsoup.parser.Tag tag16 = element12.tag();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element19 = document18.head();
        org.jsoup.nodes.Element element20 = element12.prependChild((org.jsoup.nodes.Node) document18);
        boolean boolean21 = element3.equals((java.lang.Object) element12);
        org.jsoup.select.Elements elements23 = element12.getElementsByIndexEquals((int) '4');
        org.jsoup.nodes.Element element25 = element12.prependElement("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = element12.lastElementSibling();
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.select.Elements elements6 = document1.getElementsMatchingText("");
        org.jsoup.nodes.Element element8 = document1.html("hi!  #document");
        org.jsoup.nodes.Element element11 = element8.attr("#root", "hi!");
        org.jsoup.select.Elements elements13 = element11.getElementsMatchingText("hi!#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements14 = element11.siblingElements();
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = document1.outputSettings();
        org.jsoup.select.Elements elements5 = document1.getElementsMatchingOwnText("#root");
        java.lang.String str6 = document1.outerHtml();
        org.jsoup.nodes.Element element7 = document1.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements8 = element7.siblingElements();
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.outerHtml();
        java.lang.String str3 = document1.className();
        org.jsoup.nodes.Attributes attributes4 = document1.attributes();
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueMatching("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "hi!#root <html> <head></head> <body></body> </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements8 = document1.siblingElements();
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element3.getElementsByIndexLessThan((int) (short) 100);
        java.lang.String str8 = element3.className();
        org.jsoup.nodes.Element element11 = element3.attr("hi!  #document", "<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str13 = element11.absUrl("<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element11.wrap("<hi!></hi!>");
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        boolean boolean7 = document1.isBlock();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = document1.dataset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements9 = document1.siblingElements();
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        java.util.Set<java.lang.String> strSet7 = element6.classNames();
        java.lang.Integer int8 = element6.elementSiblingIndex();
        org.jsoup.nodes.Document document9 = element6.ownerDocument();
        boolean boolean11 = document9.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = document9.previousSibling();
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.jsoup.nodes.Element element14 = document7.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.nodes.Element element15 = document1.classNames((java.util.Set<java.lang.String>) strSet12);
        java.lang.String str16 = document1.className();
        org.jsoup.nodes.Element element17 = document1.empty();
        java.lang.String str18 = document1.ownText();
        org.jsoup.select.Elements elements21 = document1.getElementsByAttributeValueContaining("hi!", "hi!  #document");
        java.lang.String str22 = document1.baseUri();
        org.jsoup.nodes.Element element24 = document1.getElementById("#documenthi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = document1.text("#document hi!");
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        java.lang.String str3 = document1.outerHtml();
        document1.title("#document");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("#document");
        java.util.Set<java.lang.String> strSet8 = document7.classNames();
        org.jsoup.nodes.Element element9 = document1.classNames(strSet8);
        document1.title("hi!  #document");
        java.util.Set<java.lang.String> strSet12 = document1.classNames();
        document1.setBaseUri("<html>\n <head></head>\n <body></body>\n</html>");
        boolean boolean15 = document1.hasText();
        org.jsoup.select.Elements elements17 = document1.getElementsByAttributeStarting("#document<#root>\n hi!\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = document1.lastElementSibling();
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.jsoup.nodes.Element element14 = document7.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.nodes.Element element15 = document1.classNames((java.util.Set<java.lang.String>) strSet12);
        java.lang.String str16 = document1.className();
        org.jsoup.nodes.Element element17 = document1.empty();
        java.lang.String str18 = document1.ownText();
        org.jsoup.select.Elements elements21 = document1.getElementsByAttributeValueContaining("hi!", "hi!  #document");
        org.jsoup.nodes.Document document22 = document1.normalise();
        org.jsoup.select.Elements elements23 = document1.parents();
        org.jsoup.select.Elements elements25 = document1.getElementsByTag("#documenthi!");
        java.lang.String str26 = document1.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = document1.lastElementSibling();
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        java.lang.String str5 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("hi!  #document", "hi!");
        boolean boolean10 = document1.hasClass("");
        boolean boolean11 = document1.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList12 = document1.siblingNodes();
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        java.lang.String str6 = element5.className();
        java.lang.String str8 = element5.absUrl("#document");
        java.lang.String str9 = element5.ownText();
        org.jsoup.nodes.Document document10 = element5.ownerDocument();
        org.jsoup.select.Elements elements13 = document10.getElementsByAttributeValue("<#root></#root>hi!", "<#root hi!  #document=\"#document\"></#root>");
        org.jsoup.parser.Tag tag14 = document10.tag();
        org.jsoup.select.Elements elements16 = document10.getElementsByIndexGreaterThan((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document10.nextElementSibling();
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("hi!");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingOwnText("#document");
        org.jsoup.select.Elements elements7 = document1.getElementsByIndexEquals(0);
        java.lang.String str8 = document1.title();
        java.lang.String str9 = document1.tagName();
        java.lang.String str11 = document1.attr("#documenthi!");
        java.lang.String str12 = document1.nodeName();
        org.jsoup.nodes.Element element14 = document1.addClass("&lt;html&gt; &lt;head&gt; &lt;title&gt;#root&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<#root></#root>");
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        java.lang.String str3 = document1.outerHtml();
        java.lang.Integer int4 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element6 = document1.addClass("#document");
        org.jsoup.nodes.Node node8 = element6.removeAttr("hi!  #document");
        org.jsoup.nodes.Node node10 = node8.removeAttr(" #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node8.siblingNodes();
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.val("<html>\n <head></head>\n <body></body>\n</html>");
        element3.setBaseUri("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements8 = element3.getElementsByAttributeValueContaining("hi!", "<html>\n <head>\n  <title>#root</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document9 = element3.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document9.wrap("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; #document &lt;/body&gt; &lt;/html&gt;#root\n<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Node node3 = document1.removeAttr("#document");
        org.jsoup.nodes.Element element4 = document1.body();
        document1.title("#root");
        org.jsoup.nodes.Document document7 = document1.ownerDocument();
        document7.title("\n<#root <html> <head></head> <body></body> </html>></#root <html> <head></head> <body></body> </html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document7.previousElementSibling();
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.html("");
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element5 = element3.empty();
        boolean boolean7 = element5.hasClass("");
        java.lang.String str8 = element5.html();
        java.lang.String str9 = element5.text();
        org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueMatching("hi!", "hi!  #document");
        java.lang.String str14 = element5.attr("#root");
        boolean boolean16 = element5.hasClass("hi!  #document");
        org.jsoup.select.Elements elements19 = element5.getElementsByAttributeValue("hi! #document<hi!></hi!>", "<html>\n <head></head>\n <body></body>\n</html><#document></#document>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element5.previousElementSibling();
    }
}

