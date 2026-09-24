package org.jsoup.nodes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1001");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.outerHtml();
        java.util.Set<java.lang.String> strSet3 = document1.classNames();
        org.jsoup.nodes.Element element5 = document1.appendText("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        java.lang.String str6 = document1.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element9 = element7.appendText("hi!");
        org.jsoup.select.Elements elements11 = element7.getElementsByIndexGreaterThan(100);
        org.jsoup.nodes.Element element14 = element7.attr("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>", "hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.select.Elements elements16 = element14.getElementsByClass("<#root>");
        java.lang.String str17 = element14.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList18 = element14.siblingNodes();
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.title();
        java.lang.String str8 = document1.nodeName();
        org.jsoup.select.Elements elements9 = document1.getAllElements();
        java.lang.String str10 = document1.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document1.nextElementSibling();
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.nodeName();
        org.jsoup.nodes.Element element9 = document1.append("#document");
        org.jsoup.nodes.Element element10 = document1.head();
        org.jsoup.nodes.Element element12 = document1.createElement("<#root>\nhi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = element12.nextSibling();
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        boolean boolean4 = document1.hasClass("");
        java.lang.Integer int5 = document1.elementSiblingIndex();
        java.lang.String str6 = document1.outerHtml();
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueEnding("#root", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = document1.attr("#documenthi!", "<#document hi!>\n</#document hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title(" <#root> hi!");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str6 = document1.html();
        java.lang.String str7 = document1.className();
        java.util.Set<java.lang.String> strSet8 = document1.classNames();
        org.jsoup.nodes.Element element10 = document1.appendText("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>&lt;#root&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element10.lastElementSibling();
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = element3.nextSibling();
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        java.util.Set<java.lang.String> strSet8 = element7.classNames();
        org.jsoup.nodes.Element element10 = element7.removeClass("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        element10.setBaseUri("hi! <html> <head> </head> <body> </body> </html>");
        org.jsoup.nodes.Attributes attributes13 = element10.attributes();
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements16 = document15.children();
        org.jsoup.select.Elements elements18 = document15.getElementsByAttribute("#root");
        org.jsoup.select.Elements elements21 = document15.getElementsByAttributeValueEnding("#document", "#document");
        org.jsoup.nodes.Element element23 = document15.val("hi!");
        org.jsoup.nodes.Document document25 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element27 = document25.appendText("");
        org.jsoup.nodes.Document document29 = new org.jsoup.nodes.Document("");
        java.lang.String str30 = document29.baseUri();
        java.lang.String str31 = document29.outerHtml();
        org.jsoup.nodes.Document document33 = new org.jsoup.nodes.Document("");
        java.lang.String str34 = document33.baseUri();
        org.jsoup.nodes.Element element35 = document29.appendChild((org.jsoup.nodes.Node) document33);
        boolean boolean36 = element27.equals((java.lang.Object) document33);
        org.jsoup.select.Elements elements38 = document33.getElementsByIndexLessThan((int) ' ');
        boolean boolean39 = element23.equals((java.lang.Object) document33);
        org.jsoup.nodes.Document document41 = new org.jsoup.nodes.Document("");
        java.lang.String str42 = document41.baseUri();
        org.jsoup.select.Elements elements44 = document41.getElementsByAttribute("hi!");
        java.lang.String str45 = document41.html();
        org.jsoup.nodes.Element element47 = document41.val("");
        org.jsoup.nodes.Element element49 = document41.prependElement("#root");
        org.jsoup.select.Elements elements51 = element49.getElementsByIndexLessThan((int) '4');
        java.lang.String str52 = element49.tagName();
        org.jsoup.nodes.Document document54 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element56 = document54.appendText("");
        org.jsoup.nodes.Element element57 = document54.body();
        java.lang.String str58 = document54.title();
        java.lang.String str59 = document54.nodeName();
        org.jsoup.nodes.Element element61 = document54.prependText("hi!");
        org.jsoup.nodes.Element element62 = document54.head();
        boolean boolean64 = document54.equals((java.lang.Object) "hi!hi!");
        org.jsoup.nodes.Element element65 = document54.parent();
        boolean boolean66 = element49.equals((java.lang.Object) document54);
        document33.replaceWith((org.jsoup.nodes.Node) element49);
        boolean boolean68 = element10.equals((java.lang.Object) element49);
        java.lang.String str69 = element10.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element70 = element10.firstElementSibling();
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("#document");
        org.jsoup.nodes.Attributes attributes4 = document1.attributes();
        org.jsoup.nodes.Document document5 = document1.normalise();
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValue("#root", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document5.nextElementSibling();
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document8.appendText("");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        java.lang.String str14 = document12.outerHtml();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document16.baseUri();
        org.jsoup.nodes.Element element18 = document12.appendChild((org.jsoup.nodes.Node) document16);
        boolean boolean19 = element10.equals((java.lang.Object) document16);
        org.jsoup.select.Elements elements21 = document16.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element23 = document16.appendElement("hi!");
        org.jsoup.nodes.Element element25 = element23.prependElement("hi!");
        boolean boolean26 = document1.equals((java.lang.Object) element25);
        java.lang.String str28 = document1.absUrl("<#root>\n</#root>");
        org.jsoup.select.Elements elements30 = document1.getElementsByAttribute("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        boolean boolean32 = document1.hasAttr("#root");
        org.jsoup.select.Elements elements34 = document1.getElementsByIndexEquals((int) '#');
        org.jsoup.nodes.Element element35 = document1.body();
        org.jsoup.select.Elements elements36 = document1.children();
        org.jsoup.nodes.Element element37 = document1.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element38 = document1.lastElementSibling();
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Document document6 = document1.normalise();
        org.jsoup.nodes.Element element8 = document1.html("<html>\n<head>\n <title></title>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element8.siblingNodes();
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.appendText("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        document1.title("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = document1.previousSibling();
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<#root>\n</#root><#root>\n</#root>");
        org.jsoup.nodes.Element element3 = document1.toggleClass("&lt;hi!&gt; &lt;/hi!&gt;");
        org.jsoup.nodes.Element element5 = document1.val("hi!\n<html>\n<head>\n <title>&lt;#root&gt;\nhi!\n&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;#root&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n&lt;/#root&gt;hi!\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;</title>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.prepend("#documenthi!");
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueEnding("<#root> hi!", "<#root class=\" hi!\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\" value=\" &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements11 = document1.siblingElements();
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexLessThan((int) ' ');
        java.lang.String str15 = document9.nodeName();
        org.jsoup.nodes.Element element16 = document9.body();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document9.title(" hi! <html> <head> </head> <body> </body> </html>");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.baseUri();
        java.lang.String str7 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element11 = document5.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean12 = element3.equals((java.lang.Object) document9);
        org.jsoup.nodes.Element element14 = element3.wrap("hi!");
        org.jsoup.nodes.Attributes attributes15 = element3.attributes();
        org.jsoup.nodes.Element element17 = element3.appendElement("#root");
        org.jsoup.nodes.Node node19 = element3.childNode(1);
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        java.lang.String str22 = document21.baseUri();
        org.jsoup.select.Elements elements24 = document21.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element26 = document21.getElementById("hi!");
        org.jsoup.nodes.Element element27 = element3.appendChild((org.jsoup.nodes.Node) document21);
        org.jsoup.nodes.Element element29 = document21.append("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element31 = document21.text("<html> \n<head> \n</head> \n<body>\n  hi!   #document\n</body>\n</html>");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.tagName();
        java.lang.String str6 = document1.attr("hi!");
        org.jsoup.nodes.Element element8 = document1.prepend("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document1.wrap("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>hi!");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.baseUri();
        org.jsoup.parser.Tag tag8 = document1.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document1.previousElementSibling();
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.append("hi!");
        org.jsoup.nodes.Element element5 = document1.removeClass("");
        org.jsoup.nodes.Element element7 = element5.toggleClass("#root");
        org.jsoup.select.Elements elements9 = element5.getElementsByTag("#root");
        java.lang.String str10 = element5.baseUri();
        element5.setBaseUri("#document hi!");
        org.jsoup.select.Elements elements14 = element5.getElementsByClass("hi!\n<html>\n<head>\n <title>#root</title>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element5.appendElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList17 = element5.siblingNodes();
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        java.lang.String str8 = document1.id();
        org.jsoup.nodes.Element element10 = document1.removeClass("<#root>\n</#root>");
        java.lang.String str12 = element10.absUrl("hi!");
        java.lang.String str13 = element10.className();
        boolean boolean15 = element10.hasAttr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements16 = element10.siblingElements();
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.appendText("");
        java.lang.String str4 = element3.text();
        org.jsoup.select.Elements elements6 = element3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements8 = element3.getElementsByIndexEquals(10);
        org.jsoup.select.Elements elements10 = element3.getElementsByTag("<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        java.lang.String str11 = element3.toString();
        org.jsoup.select.Elements elements14 = element3.getElementsByAttributeValueStarting("hi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>", " #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = element3.previousSibling();
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        java.lang.String str9 = element6.html();
        org.jsoup.nodes.Element element11 = element6.appendText("<#root>\n</#root>\n<html>\n<head>\n <title>&lt;#root&gt;\n&lt;/#root&gt;</title>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.appendElement("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements14 = element11.siblingElements();
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        java.lang.String str6 = document1.outerHtml();
        boolean boolean7 = document1.hasText();
        org.jsoup.select.Elements elements9 = document1.getElementsByClass("#document");
        org.jsoup.nodes.Element element11 = document1.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements13 = document1.getElementsByIndexLessThan((int) '4');
        org.jsoup.nodes.Attributes attributes14 = document1.attributes();
        org.jsoup.nodes.Element element16 = document1.addClass("\n<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\">\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Element element18 = document1.prepend("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = document1.previousElementSibling();
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        boolean boolean5 = document1.hasClass("hi!");
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.title();
        java.lang.String str8 = document1.nodeName();
        org.jsoup.select.Elements elements9 = document1.getAllElements();
        java.lang.String str10 = document1.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document1.text("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&amp;lt;#root&amp;gt;<#root>\nhi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<#root>\n</#root>\n</#root>");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("#root");
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueEnding("#document", "#document");
        org.jsoup.parser.Tag tag8 = document1.tag();
        java.lang.String str9 = document1.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        org.jsoup.nodes.Element element8 = element6.removeClass("");
        org.jsoup.nodes.Element element10 = element6.removeClass("#root");
        org.jsoup.select.Elements elements13 = element6.getElementsByAttributeValue("#document", "hi!");
        org.jsoup.select.Elements elements16 = element6.getElementsByAttributeValueNot("#document", "#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element6.nextElementSibling();
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Element element6 = document1.appendElement("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element8 = document1.prepend("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str9 = document1.nodeName();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.appendText("");
        java.lang.String str14 = document11.title();
        org.jsoup.nodes.Node node16 = document11.removeAttr("hi!");
        java.util.Set<java.lang.String> strSet17 = document11.classNames();
        java.util.Set<java.lang.String> strSet18 = document11.classNames();
        org.jsoup.nodes.Element element19 = document1.classNames(strSet18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element19.firstElementSibling();
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        document1.title("#root");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = document1.parent();
        org.jsoup.nodes.Element element10 = document1.append("hi!hi!");
        org.jsoup.nodes.Node node12 = document1.childNode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements13 = document1.siblingElements();
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document1.val("");
        document1.setBaseUri("");
        java.lang.String str9 = document1.val();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document1.childNodes();
        org.jsoup.select.Elements elements13 = document1.getElementsByAttributeValueEnding("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>", "#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document1.siblingNodes();
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element5 = document1.appendElement("<#root>\n  hi!\n </#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>");
        java.lang.String str7 = document1.absUrl("hi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element9 = document1.createElement("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document&lt;#root&gt; &lt;/#root&gt;\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document1.previousElementSibling();
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexEquals((int) '#');
        boolean boolean10 = document1.hasAttr("#root");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.baseUri();
        org.jsoup.select.Elements elements15 = document12.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element17 = document12.val("");
        org.jsoup.nodes.Element element19 = element17.removeClass("");
        element17.setBaseUri("hi!");
        java.util.Set<java.lang.String> strSet22 = element17.classNames();
        org.jsoup.nodes.Element element23 = document1.classNames(strSet22);
        boolean boolean24 = document1.isBlock();
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        boolean boolean28 = document26.hasClass("hi!");
        boolean boolean30 = document26.hasClass("hi!");
        java.lang.String str31 = document26.outerHtml();
        boolean boolean32 = document26.hasText();
        org.jsoup.nodes.Document document34 = new org.jsoup.nodes.Document("");
        java.lang.String str35 = document34.baseUri();
        org.jsoup.select.Elements elements37 = document34.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element39 = document34.val("");
        org.jsoup.nodes.Element element41 = element39.removeClass("");
        org.jsoup.nodes.Element element43 = element39.removeClass("#root");
        java.util.Set<java.lang.String> strSet44 = element39.classNames();
        org.jsoup.nodes.Element element45 = document26.classNames(strSet44);
        org.jsoup.nodes.Element element47 = document26.appendElement("#document");
        java.lang.String str48 = document26.id();
        org.jsoup.nodes.Document document50 = new org.jsoup.nodes.Document("");
        java.lang.String str51 = document50.baseUri();
        org.jsoup.select.Elements elements53 = document50.getElementsByAttribute("hi!");
        java.lang.String str54 = document50.html();
        org.jsoup.nodes.Element element56 = document50.val("");
        org.jsoup.nodes.Element element58 = document50.prependElement("#root");
        org.jsoup.nodes.Element element60 = element58.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element62 = element60.html("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        element62.remove();
        org.jsoup.nodes.Element element65 = element62.removeClass("#root");
        boolean boolean66 = document26.equals((java.lang.Object) "#root");
        org.jsoup.nodes.Element element67 = document1.appendChild((org.jsoup.nodes.Node) document26);
        org.jsoup.select.Elements elements69 = document1.getElementsByClass("<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>\n<html> \n <head> \n </head> \n <body>  \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element71 = document1.text("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.nodes.Element element4 = document1.val("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document6.hasClass("hi!");
        boolean boolean10 = document6.hasClass("hi!");
        org.jsoup.nodes.Element element11 = document6.head();
        boolean boolean12 = document1.equals((java.lang.Object) document6);
        org.jsoup.nodes.Element element13 = document6.body();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document6.title("hi!hi!");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        java.lang.String str7 = document1.attr("");
        java.lang.String str8 = document1.id();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        java.lang.String str11 = document10.baseUri();
        org.jsoup.select.Elements elements13 = document10.getElementsByAttribute("hi!");
        java.lang.String str14 = document10.html();
        java.lang.String str15 = document10.outerHtml();
        org.jsoup.select.Elements elements17 = document10.getElementsByTag("#document");
        java.lang.String str18 = document10.title();
        org.jsoup.nodes.Element element19 = document10.parent();
        org.jsoup.nodes.Element element20 = document1.prependChild((org.jsoup.nodes.Node) document10);
        org.jsoup.select.Elements elements22 = element20.getElementsByTag("<#root> </#root> <html> <head> <title>&lt;#root&gt; &lt;/#root&gt;</title> </head> <body> #document </body> </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element20.firstElementSibling();
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.prependText("hi!");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.select.Elements elements6 = document1.getElementsByIndexLessThan((int) (short) -1);
        java.lang.String str7 = document1.className();
        org.jsoup.nodes.Element element9 = document1.prependText("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document1.createElement("<#root> </#root> <html> <head> <title>&lt;#root&gt; &lt;/#root&gt;</title> </head> <body> #document </body> </html>");
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element15 = document13.prependText("hi!");
        java.lang.String str16 = document13.nodeName();
        org.jsoup.select.Elements elements18 = document13.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Node node20 = document13.removeAttr("#root");
        org.jsoup.select.Elements elements23 = document13.getElementsByAttributeValueNot("<#root>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "\n<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\">\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Element element24 = document13.body();
        boolean boolean25 = document1.equals((java.lang.Object) document13);
        org.jsoup.select.Elements elements27 = document1.getElementsByIndexGreaterThan((int) ' ');
        java.util.List<org.jsoup.nodes.Node> nodeList28 = document1.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = document1.wrap("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document1.hasClass("hi!");
        java.lang.String str4 = document1.className();
        org.jsoup.nodes.Element element6 = document1.html("");
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element9 = document1.html("hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element11 = element9.toggleClass("\n<#root <html>\n<head>\n</head>\n<body>\n</body>\n</html>=\"\">\n<html> \n <head> \n </head> \n <body>  \n </body>\n</html>hi!\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element9.previousElementSibling();
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        java.lang.String str3 = document1.outerHtml();
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        java.lang.String str7 = document6.baseUri();
        org.jsoup.select.Elements elements9 = document6.getElementsByAttribute("hi!");
        java.lang.String str10 = document6.html();
        java.lang.String str12 = document6.attr("");
        java.lang.String str13 = document6.id();
        org.jsoup.nodes.Element element14 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element16 = document1.prependElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements17 = document1.children();
        java.lang.String str19 = document1.absUrl("hi! <html> <head> </head> <body> </body> </html>");
        org.jsoup.nodes.Element element21 = document1.html("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Element element23 = element21.removeClass("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Element element25 = element23.html("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element28 = element23.attr("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\" #document\">\n#document&lt;#root&gt; &lt;/#root&gt;\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList29 = element28.siblingNodes();
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#document");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals((int) ' ');
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        java.lang.String str7 = document6.baseUri();
        org.jsoup.select.Elements elements9 = document6.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element11 = document6.val("");
        org.jsoup.nodes.Element element13 = element11.removeClass("");
        org.jsoup.select.Elements elements15 = element11.getElementsByTag("<hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n#document\n</hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Element element17 = element11.toggleClass("");
        org.jsoup.nodes.Element element19 = element17.prependText("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element21 = element19.html("hi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>");
        boolean boolean22 = document1.equals((java.lang.Object) "hi!\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = document1.text("<#root>\n<#root>\n</#root>\n<html>\n <head>\n </head>\n <body>\n  #document\n </body>\n</html>\n</#root>");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.baseUri();
        org.jsoup.select.Elements elements4 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = document1.html();
        org.jsoup.nodes.Element element7 = document1.prependText("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element10 = document8.wrap("#root");
        org.jsoup.nodes.Element element12 = document8.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str13 = document8.data();
        org.jsoup.nodes.Attributes attributes14 = document8.attributes();
        org.jsoup.nodes.Element element15 = document8.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements16 = document8.siblingElements();
    }
}

