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
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = htmlTreeBuilder0.inTableScope("");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("hi!");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(" hi!=\"\"");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getFromStack("hi!");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = htmlTreeBuilder0.inListItemScope("");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = htmlTreeBuilder0.inScope(" hi!=\"\"");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.insertStartTag(" hi!=\"\"");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.Token.Comment comment3 = new org.jsoup.parser.Token.Comment();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(comment3);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.getFromStack("");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.removeLastFormattingElement();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = htmlTreeBuilder0.inListItemScope(" hi!=\"\"");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.Token.Doctype doctype2 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token3 = doctype2.reset();
        java.lang.StringBuilder stringBuilder4 = doctype2.systemIdentifier;
        boolean boolean5 = doctype2.isForceQuirks();
        boolean boolean6 = doctype2.isDoctype();
        doctype2.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype9 = doctype2.asDoctype();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = htmlTreeBuilder0.process((org.jsoup.parser.Token) doctype2);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.lang.String[] strArray4 = org.jsoup.parser.HtmlTreeBuilder.TagSearchButton;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inScope("Doctype", strArray4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.lang.String[] strArray3 = org.jsoup.parser.HtmlTreeBuilder.TagSearchSelectScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(strArray3);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.Token.Comment comment3 = new org.jsoup.parser.Token.Comment();
        comment3.bogus = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.process((org.jsoup.parser.Token) comment3);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.insertStartTag("");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes5 = attributes2.put("hi!", "");
        org.jsoup.nodes.Attributes attributes8 = attributes5.put(" hi!=\"\"", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = xmlTreeBuilder0.processStartTag(" hi!=\"\"", attributes8);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.Comment comment1 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token2 = comment1.reset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert(comment1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        attributes5.normalize();
        org.jsoup.nodes.Attributes attributes7 = attributes5.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList8 = attributes7.asList();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = htmlTreeBuilder0.processStartTag("Doctype", attributes7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.lang.String[] strArray3 = org.jsoup.parser.HtmlTreeBuilder.TagSearchButton;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inScope(strArray3);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("hi!=\"\"");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("<!---->");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        java.lang.String[] strArray6 = org.jsoup.parser.HtmlTreeBuilder.TagSearchEndTags;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inScope(strArray6);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inListItemScope("");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        java.lang.String[] strArray5 = org.jsoup.parser.HtmlTreeBuilder.TagSearchList;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inScope(strArray5);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inTableScope("a");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.removeLastFormattingElement();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getFromStack("a ");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        attributes5.normalize();
        org.jsoup.nodes.Attributes attributes7 = attributes5.clone();
        attributes5.remove("Doctype");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        attributes10.normalize();
        org.jsoup.nodes.Attributes attributes12 = attributes10.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList13 = attributes12.asList();
        boolean boolean14 = attributes5.equals((java.lang.Object) attributes12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = htmlTreeBuilder0.processStartTag("", attributes12);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(" hi!=\"\"");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = htmlTreeBuilder0.inSelectScope("<!---->");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("Doctype");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.CData cData2 = new org.jsoup.parser.Token.CData("<!---->");
        org.jsoup.parser.Token.Character character4 = cData2.data("Doctype");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert(character4);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        java.lang.String[] strArray3 = org.jsoup.parser.HtmlTreeBuilder.TagsSearchInScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(strArray3);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.Token.Comment comment6 = new org.jsoup.parser.Token.Comment();
        boolean boolean7 = comment6.bogus;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(comment6);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inTableScope("hi!=\"\"");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.insertStartTag("");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inTableScope("hi!");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inScope("");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.CData cData3 = new org.jsoup.parser.Token.CData(" hi!=\"\"");
        org.jsoup.parser.Token.Character character5 = cData3.data("hi!=\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData3);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inListItemScope("a");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inTableScope("doctype");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        java.lang.String[] strArray7 = org.jsoup.parser.HtmlTreeBuilder.TagSearchList;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inScope("<!---->", strArray7);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Comment comment2 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder3 = comment2.data;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert(comment2);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Comment comment2 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token3 = comment2.reset();
        java.lang.String str4 = comment2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert(comment2);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag();
        endTag1.appendAttributeValue("hi!");
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes7 = attributes4.put("hi!", "");
        attributes4.removeIgnoreCase("Doctype");
        endTag1.attributes = attributes4;
        endTag1.selfClosing = false;
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes16 = attributes13.put("hi!", "");
        endTag1.attributes = attributes16;
        endTag1.appendAttributeValue("EOF");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag1);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("<!---->");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.CData cData3 = new org.jsoup.parser.Token.CData(" hi!=\"\"");
        org.jsoup.parser.Token.Character character5 = cData3.data("hi!=\"\"");
        java.lang.String str6 = cData3.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData3);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("<![CDATA[hi!=\"\"]]>");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inListItemScope("a");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        org.jsoup.parser.Token.Character character8 = cData6.data("Doctype");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(character8);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder5.parse("a ", "<![CDATA[<!---->]]>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.pushActiveFormattingElements((org.jsoup.nodes.Element) document9);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = startTag1.getAttributes();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.lang.String str5 = attributes4.toString();
        org.jsoup.parser.Token.StartTag startTag6 = startTag1.nameAttr("EOF", attributes4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = xmlTreeBuilder0.insert(startTag1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getActiveFormattingElement("hi!=\"\"");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.EndTag endTag2 = new org.jsoup.parser.Token.EndTag();
        endTag2.setEmptyAttributeValue();
        endTag2.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes9 = attributes6.put("hi!", "");
        attributes6.removeIgnoreCase("Doctype");
        endTag2.attributes = attributes6;
        boolean boolean14 = attributes6.hasKeyIgnoreCase("hi!=\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = xmlTreeBuilder0.processStartTag(" hi!=\"\"", attributes6);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.Comment comment1 = new org.jsoup.parser.Token.Comment();
        comment1.bogus = true;
        org.jsoup.parser.Token token4 = comment1.reset();
        boolean boolean5 = comment1.bogus;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert(comment1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder2 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder2.defaultSettings();
        org.jsoup.nodes.Document document6 = xmlTreeBuilder2.parse("a ", "<![CDATA[<!---->]]>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.push((org.jsoup.nodes.Element) document6);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder3 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings4 = xmlTreeBuilder3.defaultSettings();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder3.parse("a ", "<![CDATA[<!---->]]>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.pushActiveFormattingElements((org.jsoup.nodes.Element) document7);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder5.parse("a ", "<![CDATA[<!---->]]>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document9);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        org.jsoup.parser.Token.Character character8 = cData6.data("Doctype");
        java.lang.String str9 = cData6.getData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder6.parse("a ", "<![CDATA[<!---->]]>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = htmlTreeBuilder0.onStack((org.jsoup.nodes.Element) document10);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Comment comment3 = new org.jsoup.parser.Token.Comment();
        comment3.bogus = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert(comment3);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder3 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings4 = xmlTreeBuilder3.defaultSettings();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder3.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings9 = xmlTreeBuilder8.defaultSettings();
        org.jsoup.nodes.Document document12 = xmlTreeBuilder8.parse("a ", "<![CDATA[<!---->]]>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.replaceOnStack((org.jsoup.nodes.Element) document7, (org.jsoup.nodes.Element) document12);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = startTag1.getAttributes();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.lang.String str5 = attributes4.toString();
        org.jsoup.parser.Token.StartTag startTag6 = startTag1.nameAttr("EOF", attributes4);
        java.lang.String str7 = startTag1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = xmlTreeBuilder0.insert(startTag1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder2 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder2.defaultSettings();
        org.jsoup.nodes.Document document6 = xmlTreeBuilder2.parse("a ", "<![CDATA[<!---->]]>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) document6);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.CData cData3 = new org.jsoup.parser.Token.CData("<!---->");
        java.lang.String str4 = cData3.getData();
        org.jsoup.parser.Token.Character character6 = cData3.data("<![CDATA[hi!=\"\"]]>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData3);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        java.lang.String[] strArray4 = org.jsoup.parser.HtmlTreeBuilder.TagsSearchInScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inScope(strArray4);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder3 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings4 = xmlTreeBuilder3.defaultSettings();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder3.parse("a ", "<![CDATA[<!---->]]>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.isInActiveFormattingElements((org.jsoup.nodes.Element) document7);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inButtonScope("EOF");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag4 = startTag3.reset();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes9 = attributes6.put("hi!", "");
        boolean boolean11 = attributes9.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag12 = startTag3.nameAttr("a ", attributes9);
        java.lang.String str13 = startTag3.normalName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = xmlTreeBuilder0.insert(startTag3);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.removeLastFormattingElement();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.Token.Doctype doctype5 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token6 = doctype5.reset();
        java.lang.StringBuilder stringBuilder7 = doctype5.systemIdentifier;
        boolean boolean8 = doctype5.isForceQuirks();
        boolean boolean9 = doctype5.isDoctype();
        java.lang.StringBuilder stringBuilder10 = doctype5.name;
        doctype5.forceQuirks = false;
        java.lang.String str13 = doctype5.getPublicIdentifier();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = htmlTreeBuilder0.process((org.jsoup.parser.Token) doctype5);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder5.parse("a ", "<![CDATA[<!---->]]>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) document9);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean22 = htmlTreeBuilder0.removeFromStack((org.jsoup.nodes.Element) document19);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        attributes2.normalize();
        org.jsoup.nodes.Attributes attributes4 = attributes2.clone();
        boolean boolean6 = attributes2.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes10 = attributes7.put("hi!", "");
        attributes2.addAll(attributes7);
        org.jsoup.nodes.Attributes attributes14 = attributes7.put("hi!", true);
        boolean boolean16 = attributes14.hasKeyIgnoreCase(" hi!=\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = xmlTreeBuilder0.processStartTag("Doctype", attributes14);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        java.lang.String[] strArray4 = org.jsoup.parser.HtmlTreeBuilder.TagsSearchInScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inScope(strArray4);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean6 = htmlTreeBuilder5.isFragmentParsing();
        htmlTreeBuilder5.newPendingTableCharacters();
        htmlTreeBuilder5.framesetOk(false);
        htmlTreeBuilder5.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder11 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder11.setFosterInserts(false);
        org.jsoup.nodes.Document document14 = htmlTreeBuilder11.getDocument();
        org.jsoup.nodes.FormElement formElement15 = htmlTreeBuilder11.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder16.defaultSettings();
        org.jsoup.nodes.Document document20 = xmlTreeBuilder16.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder11.maybeSetBaseUri((org.jsoup.nodes.Element) document20);
        htmlTreeBuilder5.maybeSetBaseUri((org.jsoup.nodes.Element) document20);
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
        boolean boolean41 = htmlTreeBuilder5.isSpecial((org.jsoup.nodes.Element) document38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.pushActiveFormattingElements((org.jsoup.nodes.Element) document38);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = htmlTreeBuilder0.getActiveFormattingElement("<![CDATA[Doctype]]>");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder5.setFosterInserts(false);
        org.jsoup.nodes.Document document8 = htmlTreeBuilder5.getDocument();
        boolean boolean9 = htmlTreeBuilder5.isFragmentParsing();
        org.jsoup.nodes.Element element10 = htmlTreeBuilder5.getHeadElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings12 = xmlTreeBuilder11.defaultSettings();
        org.jsoup.nodes.Document document15 = xmlTreeBuilder11.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder5.setHeadElement((org.jsoup.nodes.Element) document15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.pushActiveFormattingElements((org.jsoup.nodes.Element) document15);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder6.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = htmlTreeBuilder0.inSelectScope("doctype");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.EndTag endTag5 = new org.jsoup.parser.Token.EndTag();
        endTag5.appendAttributeValue("hi!");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes11 = attributes8.put("hi!", "");
        attributes8.removeIgnoreCase("Doctype");
        endTag5.attributes = attributes8;
        endTag5.selfClosing = false;
        java.lang.String str17 = endTag5.tagName;
        endTag5.appendAttributeValue("a ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag5);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.nodes.Attributes attributes7 = endTag6.getAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.process((org.jsoup.parser.Token) endTag6);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Doctype doctype4 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token5 = doctype4.reset();
        java.lang.StringBuilder stringBuilder6 = doctype4.systemIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype4.systemIdentifier;
        java.lang.StringBuilder stringBuilder8 = doctype4.publicIdentifier;
        boolean boolean9 = doctype4.isDoctype();
        java.lang.StringBuilder stringBuilder10 = doctype4.systemIdentifier;
        java.lang.StringBuilder stringBuilder11 = doctype4.publicIdentifier;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert(doctype4);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inScope("a ");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.CData cData3 = new org.jsoup.parser.Token.CData("<!---->");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData3);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder5.setFosterInserts(false);
        org.jsoup.nodes.Document document8 = htmlTreeBuilder5.getDocument();
        org.jsoup.nodes.FormElement formElement9 = htmlTreeBuilder5.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder10.defaultSettings();
        org.jsoup.nodes.Document document14 = xmlTreeBuilder10.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder5.maybeSetBaseUri((org.jsoup.nodes.Element) document14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.push((org.jsoup.nodes.Element) document14);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder2 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder2.defaultSettings();
        org.jsoup.nodes.Document document6 = xmlTreeBuilder2.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData8 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder2.insert((org.jsoup.parser.Token.Character) cData8);
        org.jsoup.nodes.Document document12 = xmlTreeBuilder2.parse("EndTag", "EOF");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder13 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder13.setFosterInserts(false);
        boolean boolean16 = htmlTreeBuilder13.framesetOk();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder17.defaultSettings();
        org.jsoup.nodes.Document document21 = xmlTreeBuilder17.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData23 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder17.insert((org.jsoup.parser.Token.Character) cData23);
        org.jsoup.nodes.Document document27 = xmlTreeBuilder17.parse("EndTag", "EOF");
        boolean boolean28 = htmlTreeBuilder13.isSpecial((org.jsoup.nodes.Element) document27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.replaceActiveFormattingElement((org.jsoup.nodes.Element) document12, (org.jsoup.nodes.Element) document27);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inSelectScope("<![CDATA[<!---->]]>");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(false);
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getActiveFormattingElement("doctype");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.pushActiveFormattingElements((org.jsoup.nodes.Element) document52);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
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
        org.jsoup.parser.Token.EndTag endTag55 = new org.jsoup.parser.Token.EndTag();
        endTag55.appendAttributeValue("hi!");
        boolean boolean58 = endTag55.isEndTag();
        boolean boolean59 = endTag55.isEndTag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean60 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag55);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getFromStack("<![CDATA[null]]>");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.Token.CData cData2 = new org.jsoup.parser.Token.CData(" hi!=\"\"");
        org.jsoup.parser.Token.Character character4 = cData2.data("hi!=\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(character4);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = htmlTreeBuilder0.inTableScope("doctype");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder18 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder18.defaultSettings();
        org.jsoup.nodes.Document document22 = xmlTreeBuilder18.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData24 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder18.insert((org.jsoup.parser.Token.Character) cData24);
        org.jsoup.nodes.Document document28 = xmlTreeBuilder18.parse("<a   hi!=\"\">", "<![CDATA[null]]>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean29 = htmlTreeBuilder0.isInActiveFormattingElements((org.jsoup.nodes.Element) document28);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.removeLastFormattingElement();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder4.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData10 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder4.insert((org.jsoup.parser.Token.Character) cData10);
        org.jsoup.nodes.Document document14 = xmlTreeBuilder4.parse("EndTag", "EOF");
        boolean boolean15 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document14);
        java.lang.String[] strArray17 = org.jsoup.parser.HtmlTreeBuilder.TagSearchButton;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = htmlTreeBuilder0.inScope("CData", strArray17);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.insertStartTag("<!---->");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder1 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean2 = htmlTreeBuilder1.isFragmentParsing();
        htmlTreeBuilder1.newPendingTableCharacters();
        htmlTreeBuilder1.framesetOk(false);
        htmlTreeBuilder1.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder7.setFosterInserts(false);
        org.jsoup.nodes.Document document10 = htmlTreeBuilder7.getDocument();
        org.jsoup.nodes.FormElement formElement11 = htmlTreeBuilder7.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings13 = xmlTreeBuilder12.defaultSettings();
        org.jsoup.nodes.Document document16 = xmlTreeBuilder12.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder7.maybeSetBaseUri((org.jsoup.nodes.Element) document16);
        htmlTreeBuilder1.maybeSetBaseUri((org.jsoup.nodes.Element) document16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) document16);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("<![CDATA[Doctype]]>");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder5.parse("<![CDATA[<!---->]]>", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = htmlTreeBuilder0.aboveOnStack((org.jsoup.nodes.Element) document8);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.removeLastFormattingElement();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder6.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData12 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder6.insert((org.jsoup.parser.Token.Character) cData12);
        org.jsoup.nodes.Document document16 = xmlTreeBuilder6.parse("EndTag", "EOF");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) document16);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder6.setFosterInserts(false);
        org.jsoup.nodes.Document document9 = htmlTreeBuilder6.getDocument();
        boolean boolean10 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.nodes.Element element11 = htmlTreeBuilder6.getHeadElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings13 = xmlTreeBuilder12.defaultSettings();
        org.jsoup.nodes.Document document16 = xmlTreeBuilder12.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder6.setHeadElement((org.jsoup.nodes.Element) document16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = htmlTreeBuilder0.removeFromStack((org.jsoup.nodes.Element) document16);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder4.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData10 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder4.insert((org.jsoup.parser.Token.Character) cData10);
        org.jsoup.nodes.Document document14 = xmlTreeBuilder4.parse("EndTag", "EOF");
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("eof");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.Doctype doctype1 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token2 = doctype1.reset();
        java.lang.StringBuilder stringBuilder3 = doctype1.systemIdentifier;
        java.lang.StringBuilder stringBuilder4 = doctype1.systemIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype1.publicIdentifier;
        boolean boolean6 = doctype1.isDoctype();
        doctype1.forceQuirks = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert(doctype1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement5 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inButtonScope("doctype");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inTableScope("EOF");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.lang.String[] strArray5 = org.jsoup.parser.HtmlTreeBuilder.TagSearchEndTags;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inScope(strArray5);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder4.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData10 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder4.insert((org.jsoup.parser.Token.Character) cData10);
        org.jsoup.nodes.Document document14 = xmlTreeBuilder4.parse("EndTag", "EOF");
        boolean boolean15 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document14);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder16.defaultSettings();
        org.jsoup.nodes.Document document20 = xmlTreeBuilder16.parse("a ", "<![CDATA[<!---->]]>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean21 = htmlTreeBuilder0.removeFromStack((org.jsoup.nodes.Element) document20);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.Token.CData cData7 = new org.jsoup.parser.Token.CData(" hi!=\"\"");
        org.jsoup.parser.Token.Character character9 = cData7.data("hi!=\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData7);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getActiveFormattingElement("<![CDATA[EndTag]]>");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.insertStartTag("aEOF");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(false);
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag8 = startTag7.reset();
        startTag7.normalName = "hi!";
        startTag7.appendAttributeValue('a');
        startTag7.appendTagName("<!---->");
        java.lang.String str15 = startTag7.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = htmlTreeBuilder0.insertEmpty(startTag7);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean38 = htmlTreeBuilder0.inButtonScope("");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder6.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document10);
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes13 = startTag12.getAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = htmlTreeBuilder0.process((org.jsoup.parser.Token) startTag12);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = htmlTreeBuilder0.inListItemScope("<![CDATA[EndTag]]>");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement5 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder4.setFosterInserts(false);
        org.jsoup.nodes.Document document7 = htmlTreeBuilder4.getDocument();
        org.jsoup.nodes.FormElement formElement8 = htmlTreeBuilder4.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.nodes.Document document13 = xmlTreeBuilder9.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder4.maybeSetBaseUri((org.jsoup.nodes.Element) document13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) document13);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.newPendingTableCharacters();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement6 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder7.defaultSettings();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder7.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData13 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder7.insert((org.jsoup.parser.Token.Character) cData13);
        org.jsoup.nodes.Document document17 = xmlTreeBuilder7.parse("<a   hi!=\"\">", "<![CDATA[null]]>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.pushActiveFormattingElements((org.jsoup.nodes.Element) document17);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("a ");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder6.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData12 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder6.insert((org.jsoup.parser.Token.Character) cData12);
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag15 = startTag14.reset();
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes20 = attributes17.put("hi!", "");
        boolean boolean22 = attributes20.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag23 = startTag14.nameAttr("a ", attributes20);
        java.lang.String str24 = startTag14.toString();
        org.jsoup.nodes.Element element25 = xmlTreeBuilder6.insert(startTag14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean26 = htmlTreeBuilder0.removeFromStack(element25);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        java.lang.String[] strArray5 = org.jsoup.parser.HtmlTreeBuilder.TagSearchTableScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inScope("aEOF", strArray5);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.setFosterInserts(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = htmlTreeBuilder0.getFromStack("Doctype");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.Token.Comment comment2 = new org.jsoup.parser.Token.Comment();
        boolean boolean3 = comment2.bogus;
        java.lang.String str4 = comment2.getData();
        java.lang.String str5 = comment2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(comment2);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[<!---->]]>", "");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder8.parse("<![CDATA[<!---->]]>", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertOnStackAfter((org.jsoup.nodes.Element) document7, (org.jsoup.nodes.Element) document11);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder6.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = htmlTreeBuilder0.inScope("<![CDATA[hi!=\"\"]]>");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
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
        org.jsoup.parser.Token.EndTag endTag57 = new org.jsoup.parser.Token.EndTag();
        endTag57.appendAttributeValue("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean60 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag57);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.Comment comment1 = new org.jsoup.parser.Token.Comment();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert(comment1);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.lang.String[] strArray8 = org.jsoup.parser.HtmlTreeBuilder.TagSearchList;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = htmlTreeBuilder0.inScope("<<!---->>", strArray8);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        java.lang.String[] strArray4 = org.jsoup.parser.HtmlTreeBuilder.TagsSearchInScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(strArray4);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.CData cData5 = new org.jsoup.parser.Token.CData("<!---->");
        java.lang.String str6 = cData5.getData();
        org.jsoup.parser.Token.Character character8 = cData5.data("<![CDATA[hi!=\"\"]]>");
        org.jsoup.parser.Token token9 = cData5.reset();
        org.jsoup.parser.Token.Character character11 = cData5.data("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert(character11);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder5.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData11 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder5.insert((org.jsoup.parser.Token.Character) cData11);
        org.jsoup.nodes.Document document15 = xmlTreeBuilder5.parse("EndTag", "EOF");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = htmlTreeBuilder0.isInActiveFormattingElements((org.jsoup.nodes.Element) document15);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder7.setFosterInserts(false);
        boolean boolean10 = htmlTreeBuilder7.framesetOk();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings12 = xmlTreeBuilder11.defaultSettings();
        org.jsoup.nodes.Document document15 = xmlTreeBuilder11.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData17 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder11.insert((org.jsoup.parser.Token.Character) cData17);
        org.jsoup.nodes.Document document21 = xmlTreeBuilder11.parse("EndTag", "EOF");
        boolean boolean22 = htmlTreeBuilder7.isSpecial((org.jsoup.nodes.Element) document21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.push((org.jsoup.nodes.Element) document21);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder3 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings4 = xmlTreeBuilder3.defaultSettings();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder3.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData9 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder3.insert((org.jsoup.parser.Token.Character) cData9);
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag12 = startTag11.reset();
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes17 = attributes14.put("hi!", "");
        boolean boolean19 = attributes17.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag20 = startTag11.nameAttr("a ", attributes17);
        java.lang.String str21 = startTag11.toString();
        org.jsoup.nodes.Element element22 = xmlTreeBuilder3.insert(startTag11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.pushActiveFormattingElements(element22);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inSelectScope(" hi!=\"\"");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings2 = org.jsoup.parser.ParseSettings.htmlDefault;
        java.lang.String str4 = parseSettings2.normalizeAttribute("hi!");
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        attributes5.normalize();
        org.jsoup.nodes.Attributes attributes7 = attributes5.clone();
        org.jsoup.nodes.Attributes attributes8 = parseSettings2.normalizeAttributes(attributes7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = xmlTreeBuilder0.processStartTag("<!---->", attributes8);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder5.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData11 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder5.insert((org.jsoup.parser.Token.Character) cData11);
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes17 = attributes14.put("hi!", "");
        org.jsoup.nodes.Attributes attributes20 = attributes17.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor21 = attributes17.iterator();
        boolean boolean22 = xmlTreeBuilder5.processStartTag("EOF", attributes17);
        org.jsoup.parser.Token.EndTag endTag24 = new org.jsoup.parser.Token.EndTag();
        endTag24.appendAttributeValue(" hi!=\"\"");
        java.lang.String str27 = endTag24.normalName;
        endTag24.setEmptyAttributeValue();
        endTag24.appendTagName('a');
        endTag24.newAttribute();
        org.jsoup.nodes.Attributes attributes32 = endTag24.attributes;
        org.jsoup.parser.Token.Tag tag33 = endTag24.reset();
        org.jsoup.parser.Token.EndTag endTag34 = new org.jsoup.parser.Token.EndTag();
        endTag34.setEmptyAttributeValue();
        endTag34.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes38 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes41 = attributes38.put("hi!", "");
        attributes38.removeIgnoreCase("Doctype");
        endTag34.attributes = attributes38;
        java.lang.String str46 = attributes38.get(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes47 = new org.jsoup.nodes.Attributes();
        attributes47.normalize();
        org.jsoup.nodes.Attributes attributes49 = attributes47.clone();
        boolean boolean51 = attributes47.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes52 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes55 = attributes52.put("hi!", "");
        attributes47.addAll(attributes52);
        attributes38.addAll(attributes52);
        tag33.attributes = attributes38;
        boolean boolean59 = xmlTreeBuilder5.processStartTag("Doctype", attributes38);
        org.jsoup.nodes.Attributes attributes61 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes64 = attributes61.put("hi!", "");
        org.jsoup.nodes.Attributes attributes67 = attributes64.put(" hi!=\"\"", false);
        boolean boolean69 = attributes67.hasKeyIgnoreCase("Doctype");
        int int70 = attributes67.size();
        boolean boolean71 = xmlTreeBuilder5.processStartTag("EndTag", attributes67);
        org.jsoup.parser.Token.Doctype doctype72 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token73 = doctype72.reset();
        java.lang.StringBuilder stringBuilder74 = doctype72.systemIdentifier;
        java.lang.StringBuilder stringBuilder75 = doctype72.systemIdentifier;
        java.lang.StringBuilder stringBuilder76 = doctype72.publicIdentifier;
        boolean boolean77 = doctype72.isDoctype();
        doctype72.forceQuirks = false;
        xmlTreeBuilder5.insert(doctype72);
        org.jsoup.parser.Token.StartTag startTag81 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes82 = startTag81.getAttributes();
        org.jsoup.nodes.Attributes attributes84 = new org.jsoup.nodes.Attributes();
        java.lang.String str85 = attributes84.toString();
        org.jsoup.parser.Token.StartTag startTag86 = startTag81.nameAttr("EOF", attributes84);
        org.jsoup.nodes.Element element87 = xmlTreeBuilder5.insert(startTag86);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean88 = htmlTreeBuilder0.isInActiveFormattingElements(element87);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "a" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inScope("hi!", strArray6);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder4.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData10 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder4.insert((org.jsoup.parser.Token.Character) cData10);
        org.jsoup.nodes.Document document14 = xmlTreeBuilder4.parse("EndTag", "EOF");
        boolean boolean15 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document14);
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document49);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(false);
        htmlTreeBuilder0.framesetOk(true);
        java.lang.String[] strArray8 = org.jsoup.parser.HtmlTreeBuilder.TagSearchEndTags;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = htmlTreeBuilder0.inScope("CData", strArray8);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        java.lang.String str2 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.insertStartTag("<![cdata[endtag]]>");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.Token.CData cData5 = new org.jsoup.parser.Token.CData("<!---->");
        org.jsoup.parser.Token.Character character7 = cData5.data("Doctype");
        java.lang.String str8 = cData5.getData();
        java.lang.String str9 = cData5.tokenType();
        java.lang.String str10 = cData5.toString();
        org.jsoup.parser.Token.TokenType tokenType11 = org.jsoup.parser.Token.TokenType.EndTag;
        cData5.type = tokenType11;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData5);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes6 = attributes3.put("hi!", "");
        org.jsoup.nodes.Attributes attributes9 = attributes6.put(" hi!=\"\"", false);
        java.util.List<org.jsoup.nodes.Attribute> attributeList10 = attributes6.asList();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = htmlTreeBuilder0.processStartTag("CData", attributes6);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.lang.String[] strArray9 = new java.lang.String[] { "doctype", "a", " hi!=\"\" <![CDATA[null]]>", "eof" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(strArray9);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("<![CDATA[<!---->]]>", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = htmlTreeBuilder0.removeFromStack((org.jsoup.nodes.Element) document10);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.markInsertionMode();
        boolean boolean5 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.FormElement formElement6 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = htmlTreeBuilder0.getFromStack("CData");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder5.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData11 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder5.insert((org.jsoup.parser.Token.Character) cData11);
        org.jsoup.parser.Token.Comment comment13 = new org.jsoup.parser.Token.Comment();
        comment13.bogus = true;
        java.lang.String str16 = comment13.toString();
        xmlTreeBuilder5.insert(comment13);
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes22 = attributes19.put("a", true);
        boolean boolean23 = xmlTreeBuilder5.processStartTag("eof", attributes22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean24 = htmlTreeBuilder0.processStartTag("Doctype", attributes22);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder4.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData10 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder4.insert((org.jsoup.parser.Token.Character) cData10);
        org.jsoup.nodes.Document document14 = xmlTreeBuilder4.parse("EndTag", "EOF");
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document14);
        org.jsoup.parser.Token.CData cData17 = new org.jsoup.parser.Token.CData("<!---->");
        org.jsoup.parser.Token.Character character19 = cData17.data("Doctype");
        java.lang.String str20 = cData17.getData();
        java.lang.String str21 = cData17.tokenType();
        java.lang.String str22 = cData17.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData17);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean7 = htmlTreeBuilder6.isFragmentParsing();
        boolean boolean8 = htmlTreeBuilder6.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder9.setFosterInserts(false);
        boolean boolean12 = htmlTreeBuilder9.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings13 = htmlTreeBuilder9.defaultSettings();
        boolean boolean14 = htmlTreeBuilder9.framesetOk();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document18 = xmlTreeBuilder15.parse("<![CDATA[<!---->]]>", "");
        boolean boolean19 = htmlTreeBuilder9.isSpecial((org.jsoup.nodes.Element) document18);
        htmlTreeBuilder6.setHeadElement((org.jsoup.nodes.Element) document18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) document18);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.insertStartTag("EOF");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement5 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inSelectScope("CData");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder5.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document9);
        org.jsoup.nodes.FormElement formElement11 = htmlTreeBuilder0.getFormElement();
        org.jsoup.nodes.Document document12 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes4 = startTag3.getAttributes();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.lang.String str7 = attributes6.toString();
        org.jsoup.parser.Token.StartTag startTag8 = startTag3.nameAttr("EOF", attributes6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = xmlTreeBuilder0.insert(startTag3);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        java.lang.String[] strArray5 = org.jsoup.parser.HtmlTreeBuilder.TagSearchButton;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inScope(strArray5);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Token.Doctype doctype8 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token9 = doctype8.reset();
        java.lang.StringBuilder stringBuilder10 = doctype8.systemIdentifier;
        boolean boolean11 = doctype8.isForceQuirks();
        boolean boolean12 = doctype8.isDoctype();
        doctype8.forceQuirks = false;
        org.jsoup.parser.Token.TokenType tokenType15 = org.jsoup.parser.Token.TokenType.Character;
        doctype8.type = tokenType15;
        boolean boolean17 = doctype8.forceQuirks;
        org.jsoup.parser.Token token18 = doctype8.reset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = htmlTreeBuilder0.process(token18);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.FormElement formElement6 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        startTag7.finaliseTag();
        java.lang.String str9 = startTag7.normalName();
        org.jsoup.nodes.Attributes attributes10 = startTag7.getAttributes();
        startTag7.selfClosing = false;
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes17 = attributes14.put("hi!", "");
        org.jsoup.nodes.Attributes attributes20 = attributes17.put(" hi!=\"\"", false);
        boolean boolean22 = attributes20.hasKeyIgnoreCase("Doctype");
        int int23 = attributes20.size();
        org.jsoup.nodes.Attributes attributes26 = attributes20.put("hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor27 = attributes26.iterator();
        org.jsoup.parser.Token.StartTag startTag28 = startTag7.nameAttr("hi!=\"\"", attributes26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element29 = htmlTreeBuilder0.insertEmpty(startTag7);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder6.parse("<![CDATA[<!---->]]>", "");
        boolean boolean10 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document9);
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        comment11.bogus = true;
        java.lang.String str14 = comment11.getData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(comment11);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Doctype doctype2 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token3 = doctype2.reset();
        java.lang.StringBuilder stringBuilder4 = doctype2.systemIdentifier;
        boolean boolean5 = doctype2.isForceQuirks();
        boolean boolean6 = doctype2.forceQuirks;
        org.jsoup.parser.Token token7 = doctype2.reset();
        java.lang.String str8 = doctype2.tokenType();
        doctype2.forceQuirks = true;
        java.lang.StringBuilder stringBuilder11 = doctype2.publicIdentifier;
        doctype2.pubSysKey = "";
        boolean boolean14 = doctype2.isComment();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert(doctype2);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("a ");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        boolean boolean6 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = htmlTreeBuilder0.insertStartTag("<<!---->  hi!=\"\">");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        attributes6.normalize();
        org.jsoup.nodes.Attributes attributes8 = attributes6.clone();
        boolean boolean10 = attributes6.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes14 = attributes11.put("hi!", "");
        attributes6.addAll(attributes11);
        org.jsoup.nodes.Attributes attributes18 = attributes11.put("<![CDATA[<!---->]]>", true);
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes20 = startTag19.getAttributes();
        attributes11.addAll(attributes20);
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        attributes22.normalize();
        boolean boolean25 = attributes22.hasKeyIgnoreCase(" hi!=\"\"");
        java.lang.String str27 = attributes22.getIgnoreCase(" hi!=\"\"");
        int int28 = attributes22.size();
        attributes11.addAll(attributes22);
        attributes11.removeIgnoreCase("<a   hi!=\"\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean32 = htmlTreeBuilder0.processStartTag("", attributes11);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder3 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document6 = xmlTreeBuilder3.parse("<![CDATA[<!---->]]>", "");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("a<<!---->>");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
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
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder21 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings22 = htmlTreeBuilder21.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState23 = htmlTreeBuilder21.originalState();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document27 = xmlTreeBuilder24.parse("<![CDATA[<!---->]]>", "");
        htmlTreeBuilder21.setHeadElement((org.jsoup.nodes.Element) document27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertOnStackAfter((org.jsoup.nodes.Element) document19, (org.jsoup.nodes.Element) document27);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inSelectScope("<<!---->>");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = htmlTreeBuilder0.insertStartTag("<![CDATA[null]]>");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        java.lang.String[] strArray6 = org.jsoup.parser.HtmlTreeBuilder.TagSearchList;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inScope(strArray6);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder5.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = htmlTreeBuilder0.inListItemScope("</aEOF>");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inTableScope("<![CDATA[<!---->]]>");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder6.parse("<![CDATA[<!---->]]>", "");
        boolean boolean10 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.removeLastFormattingElement();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.insertStartTag(" hi!=\"Doctype\"");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
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
        java.lang.String[] strArray18 = org.jsoup.parser.HtmlTreeBuilder.TagSearchEndTags;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = htmlTreeBuilder0.inScope(strArray18);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.removeLastFormattingElement();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        java.lang.String[] strArray5 = org.jsoup.parser.HtmlTreeBuilder.TagSearchEndTags;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inScope(" hi!=\"hi!=&quot;&quot;\" a =\"hi!=&quot;&quot;\"", strArray5);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags(" hi!=\"\"");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = htmlTreeBuilder0.inSelectScope(" hi!=\"\" <![CDATA[null]]>");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.Token.EndTag endTag5 = new org.jsoup.parser.Token.EndTag();
        endTag5.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag8 = endTag5.name("");
        java.lang.String str9 = endTag5.tagName;
        boolean boolean10 = endTag5.isEndTag();
        endTag5.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag12 = new org.jsoup.parser.Token.EndTag();
        endTag12.appendAttributeValue("hi!");
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes18 = attributes15.put("hi!", "");
        attributes15.removeIgnoreCase("Doctype");
        endTag12.attributes = attributes15;
        endTag12.selfClosing = false;
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes27 = attributes24.put("hi!", "");
        endTag12.attributes = attributes27;
        endTag12.tagName = "hi!=\"\"";
        endTag12.newAttribute();
        java.lang.String str32 = endTag12.tagName;
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag34 = startTag33.reset();
        startTag33.normalName = "hi!";
        startTag33.appendAttributeValue('a');
        org.jsoup.parser.Token.EndTag endTag39 = new org.jsoup.parser.Token.EndTag();
        endTag39.appendAttributeValue(" hi!=\"\"");
        java.lang.String str42 = endTag39.normalName;
        endTag39.setEmptyAttributeValue();
        endTag39.appendTagName('a');
        boolean boolean46 = endTag39.isEndTag();
        boolean boolean47 = endTag39.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag49 = startTag48.reset();
        java.lang.String str50 = startTag48.normalName();
        int[] intArray51 = new int[] {};
        startTag48.appendAttributeValue(intArray51);
        endTag39.appendAttributeValue(intArray51);
        startTag33.appendAttributeValue(intArray51);
        endTag12.appendAttributeValue(intArray51);
        endTag5.appendAttributeValue(intArray51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean57 = htmlTreeBuilder0.process((org.jsoup.parser.Token) endTag5);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(false);
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inButtonScope("a<<!---->>");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inButtonScope("<![cdata[endtag]]>");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.parser.Token.Comment comment8 = new org.jsoup.parser.Token.Comment();
        comment8.bogus = true;
        java.lang.String str11 = comment8.toString();
        xmlTreeBuilder0.insert(comment8);
        org.jsoup.parser.Token.Doctype doctype13 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token14 = doctype13.reset();
        java.lang.StringBuilder stringBuilder15 = doctype13.systemIdentifier;
        boolean boolean16 = doctype13.isForceQuirks();
        boolean boolean17 = doctype13.isDoctype();
        doctype13.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype20 = doctype13.asDoctype();
        doctype13.pubSysKey = "";
        boolean boolean23 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype13);
        org.jsoup.parser.Token.EndTag endTag24 = new org.jsoup.parser.Token.EndTag();
        endTag24.setEmptyAttributeValue();
        endTag24.appendAttributeName('#');
        endTag24.newAttribute();
        boolean boolean29 = endTag24.isSelfClosing();
        boolean boolean30 = endTag24.isSelfClosing();
        endTag24.normalName = "<![CDATA[hi!=\"\"]]>";
        endTag24.selfClosing = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean35 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag24);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
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
        java.lang.String str18 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
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
        java.lang.String str18 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("aEOF");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
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
        java.lang.String str18 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getFromStack("a<<!---->>");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        attributes5.normalize();
        org.jsoup.nodes.Attributes attributes7 = attributes5.clone();
        attributes5.remove("Doctype");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        attributes10.normalize();
        org.jsoup.nodes.Attributes attributes12 = attributes10.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList13 = attributes12.asList();
        boolean boolean14 = attributes5.equals((java.lang.Object) attributes12);
        attributes12.removeIgnoreCase("a");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = htmlTreeBuilder0.processStartTag("a", attributes12);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inListItemScope(" hi!=\"hi!=&quot;&quot;\" a =\"hi!=&quot;&quot;\"");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getFromStack("<eof>");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
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
        org.jsoup.parser.Token.Comment comment57 = new org.jsoup.parser.Token.Comment();
        java.lang.String str58 = comment57.getData();
        java.lang.String str59 = comment57.getData();
        java.lang.StringBuilder stringBuilder60 = comment57.data;
        xmlTreeBuilder0.insert(comment57);
        org.jsoup.parser.Token.StartTag startTag62 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes63 = startTag62.getAttributes();
        org.jsoup.nodes.Attributes attributes65 = new org.jsoup.nodes.Attributes();
        java.lang.String str66 = attributes65.toString();
        org.jsoup.parser.Token.StartTag startTag67 = startTag62.nameAttr("EOF", attributes65);
        org.jsoup.nodes.Element element68 = xmlTreeBuilder0.insert(startTag67);
        org.jsoup.parser.Token.EndTag endTag69 = new org.jsoup.parser.Token.EndTag();
        endTag69.setEmptyAttributeValue();
        endTag69.appendAttributeName('#');
        endTag69.newAttribute();
        boolean boolean74 = endTag69.isSelfClosing();
        boolean boolean75 = endTag69.isSelfClosing();
        endTag69.normalName = "<![CDATA[hi!=\"\"]]>";
        endTag69.selfClosing = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean80 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag69);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(false);
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore(" hi!=\"hi!=&quot;&quot;\" a =\"hi!=&quot;&quot;\"");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder3 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document6 = xmlTreeBuilder3.parse("<![CDATA[<!---->]]>", "");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document6);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder0.state();
        org.jsoup.parser.Token.CData cData10 = new org.jsoup.parser.Token.CData("<!---->");
        java.lang.String str11 = cData10.getData();
        org.jsoup.parser.Token.Character character13 = cData10.data("<![CDATA[hi!=\"\"]]>");
        org.jsoup.parser.Token token14 = cData10.reset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData10);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder5.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList8 = htmlTreeBuilder5.getStack();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.nodes.Document document13 = xmlTreeBuilder9.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData15 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder9.insert((org.jsoup.parser.Token.Character) cData15);
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag18 = startTag17.reset();
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes23 = attributes20.put("hi!", "");
        boolean boolean25 = attributes23.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag26 = startTag17.nameAttr("a ", attributes23);
        java.lang.String str27 = startTag17.toString();
        org.jsoup.nodes.Element element28 = xmlTreeBuilder9.insert(startTag17);
        boolean boolean29 = htmlTreeBuilder5.isSpecial(element28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean30 = htmlTreeBuilder0.isInActiveFormattingElements(element28);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.nodes.Document document10 = xmlTreeBuilder0.parse("<a   hi!=\"\">", "<![CDATA[null]]>");
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
        endTag11.appendAttributeValue("EOF");
        endTag11.normalName = "hi!=\"\"";
        org.jsoup.nodes.Attributes attributes32 = new org.jsoup.nodes.Attributes();
        attributes32.normalize();
        org.jsoup.nodes.Attributes attributes34 = attributes32.clone();
        boolean boolean36 = attributes32.equals((java.lang.Object) (short) -1);
        org.jsoup.parser.Token.EndTag endTag37 = new org.jsoup.parser.Token.EndTag();
        endTag37.appendAttributeValue(" hi!=\"\"");
        java.lang.String str40 = endTag37.normalName;
        endTag37.selfClosing = true;
        boolean boolean43 = attributes32.equals((java.lang.Object) endTag37);
        org.jsoup.parser.Token.EndTag endTag44 = new org.jsoup.parser.Token.EndTag();
        endTag44.appendAttributeValue("hi!");
        boolean boolean47 = endTag44.isEndTag();
        org.jsoup.parser.Token.EndTag endTag48 = new org.jsoup.parser.Token.EndTag();
        endTag48.appendAttributeValue(" hi!=\"\"");
        java.lang.String str51 = endTag48.normalName;
        endTag48.setEmptyAttributeValue();
        endTag48.appendTagName('a');
        char[] charArray60 = new char[] { ' ', ' ', '#', ' ', 'a' };
        endTag48.appendAttributeValue(charArray60);
        endTag44.appendAttributeValue(charArray60);
        endTag37.appendAttributeValue(charArray60);
        endTag11.appendAttributeValue(charArray60);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean65 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag11);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes9 = attributes6.put("hi!", "");
        org.jsoup.nodes.Attributes attributes12 = attributes9.put(" hi!=\"\"", false);
        boolean boolean14 = attributes12.hasKeyIgnoreCase("Doctype");
        int int15 = attributes12.size();
        org.jsoup.nodes.Attributes attributes18 = attributes12.put("hi!=\"\"", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = htmlTreeBuilder0.processStartTag(" =\"</a>\"", attributes18);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags(" hi!=\"Doctype\"");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.lang.String[] strArray8 = org.jsoup.parser.HtmlTreeBuilder.TagSearchSpecial;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = htmlTreeBuilder0.inScope(strArray8);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder4.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData10 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder4.insert((org.jsoup.parser.Token.Character) cData10);
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag13 = startTag12.reset();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes18 = attributes15.put("hi!", "");
        boolean boolean20 = attributes18.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag21 = startTag12.nameAttr("a ", attributes18);
        java.lang.String str22 = startTag12.toString();
        org.jsoup.nodes.Element element23 = xmlTreeBuilder4.insert(startTag12);
        boolean boolean24 = htmlTreeBuilder0.isSpecial(element23);
        org.jsoup.parser.Token.Doctype doctype25 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token26 = doctype25.reset();
        java.lang.StringBuilder stringBuilder27 = doctype25.systemIdentifier;
        java.lang.String str28 = doctype25.getSystemIdentifier();
        org.jsoup.parser.Token.Doctype doctype29 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token30 = doctype29.reset();
        java.lang.StringBuilder stringBuilder31 = doctype29.systemIdentifier;
        boolean boolean32 = doctype29.isForceQuirks();
        doctype29.forceQuirks = false;
        org.jsoup.parser.Token.TokenType tokenType35 = org.jsoup.parser.Token.TokenType.Doctype;
        doctype29.type = tokenType35;
        doctype25.type = tokenType35;
        doctype25.forceQuirks = false;
        boolean boolean40 = doctype25.isDoctype();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean41 = htmlTreeBuilder0.process((org.jsoup.parser.Token) doctype25);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(false);
        htmlTreeBuilder0.newPendingTableCharacters();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = htmlTreeBuilder0.getFromStack("");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("</<a   hi!=\"\">>");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.insertStartTag("a<!---->");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.setFosterInserts(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = htmlTreeBuilder0.inScope("");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(false);
        htmlTreeBuilder0.framesetOk(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inScope("");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inListItemScope(" hi!");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getActiveFormattingElement("a ");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.Token.Doctype doctype3 = new org.jsoup.parser.Token.Doctype();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.process((org.jsoup.parser.Token) doctype3);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inScope("aEOF");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags(" hi!=\"\" <![CDATA[null]]>");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("<<!---->  hi!=\"\">");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        java.lang.String[] strArray6 = org.jsoup.parser.HtmlTreeBuilder.TagSearchSpecial;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(strArray6);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(" =\"</a>\"");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag();
        endTag7.appendAttributeValue(" hi!=\"\"");
        java.lang.String str10 = endTag7.normalName;
        endTag7.setEmptyAttributeValue();
        endTag7.appendTagName('a');
        endTag7.newAttribute();
        org.jsoup.nodes.Attributes attributes15 = endTag7.attributes;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = htmlTreeBuilder0.process((org.jsoup.parser.Token) endTag7);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = htmlTreeBuilder6.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder6.originalState();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document12 = xmlTreeBuilder9.parse("<![CDATA[<!---->]]>", "");
        htmlTreeBuilder6.setHeadElement((org.jsoup.nodes.Element) document12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = htmlTreeBuilder0.aboveOnStack((org.jsoup.nodes.Element) document12);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement5 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.insertStartTag("");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder4.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData10 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder4.insert((org.jsoup.parser.Token.Character) cData10);
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag13 = startTag12.reset();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes18 = attributes15.put("hi!", "");
        boolean boolean20 = attributes18.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag21 = startTag12.nameAttr("a ", attributes18);
        java.lang.String str22 = startTag12.toString();
        org.jsoup.nodes.Element element23 = xmlTreeBuilder4.insert(startTag12);
        boolean boolean24 = htmlTreeBuilder0.isSpecial(element23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags(" hi!=\"\" <![CDATA[null]]>");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.framesetOk(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inButtonScope("aeof");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        java.lang.String[] strArray3 = org.jsoup.parser.HtmlTreeBuilder.TagSearchTableScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inScope("", strArray3);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inSelectScope(" hi!=\"hi!=&quot;&quot;\" a =\"hi!=&quot;&quot;\"");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
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
        java.lang.String str18 = htmlTreeBuilder0.getBaseUri();
        boolean boolean19 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings21 = xmlTreeBuilder20.defaultSettings();
        org.jsoup.nodes.Document document24 = xmlTreeBuilder20.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData26 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder20.insert((org.jsoup.parser.Token.Character) cData26);
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag29 = startTag28.reset();
        org.jsoup.nodes.Attributes attributes31 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes34 = attributes31.put("hi!", "");
        boolean boolean36 = attributes34.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag37 = startTag28.nameAttr("a ", attributes34);
        java.lang.String str38 = startTag28.toString();
        org.jsoup.nodes.Element element39 = xmlTreeBuilder20.insert(startTag28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.removeFromActiveFormattingElements(element39);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.EndTag endTag3 = new org.jsoup.parser.Token.EndTag();
        endTag3.appendAttributeValue(" hi!=\"\"");
        java.lang.String str6 = endTag3.normalName;
        endTag3.setEmptyAttributeValue();
        endTag3.appendTagName('a');
        java.lang.String str10 = endTag3.name();
        endTag3.setEmptyAttributeValue();
        endTag3.appendAttributeName("<!---->");
        org.jsoup.parser.Token.EndTag endTag14 = new org.jsoup.parser.Token.EndTag();
        endTag14.appendAttributeValue(" hi!=\"\"");
        java.lang.String str17 = endTag14.normalName;
        endTag14.setEmptyAttributeValue();
        endTag14.appendTagName('a');
        java.lang.String str21 = endTag14.name();
        endTag14.setEmptyAttributeValue();
        boolean boolean23 = endTag14.isDoctype();
        boolean boolean24 = endTag14.isComment();
        endTag14.appendTagName("EOF");
        endTag14.newAttribute();
        org.jsoup.parser.Token.EndTag endTag28 = new org.jsoup.parser.Token.EndTag();
        endTag28.appendAttributeValue("hi!");
        org.jsoup.nodes.Attributes attributes31 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes34 = attributes31.put("hi!", "");
        attributes31.removeIgnoreCase("Doctype");
        endTag28.attributes = attributes31;
        endTag28.selfClosing = false;
        endTag28.newAttribute();
        org.jsoup.parser.Token.EndTag endTag41 = new org.jsoup.parser.Token.EndTag();
        endTag41.appendAttributeValue(" hi!=\"\"");
        java.lang.String str44 = endTag41.normalName;
        endTag41.setEmptyAttributeValue();
        endTag41.appendTagName('a');
        boolean boolean48 = endTag41.isEndTag();
        boolean boolean49 = endTag41.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag51 = startTag50.reset();
        java.lang.String str52 = startTag50.normalName();
        int[] intArray53 = new int[] {};
        startTag50.appendAttributeValue(intArray53);
        endTag41.appendAttributeValue(intArray53);
        endTag28.appendAttributeValue(intArray53);
        endTag14.appendAttributeValue(intArray53);
        endTag3.appendAttributeValue(intArray53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean59 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag3);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.markInsertionMode();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag();
        endTag6.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag9 = endTag6.name("");
        java.lang.String str10 = endTag6.tagName;
        boolean boolean11 = endTag6.isCData();
        endTag6.newAttribute();
        endTag6.appendAttributeName(" hi!=\"\" <![CDATA[<!---->]]>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = htmlTreeBuilder0.process((org.jsoup.parser.Token) endTag6);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("Doctype");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("<![CDATA[hi!=\"\"]]>");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder4.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData10 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder4.insert((org.jsoup.parser.Token.Character) cData10);
        org.jsoup.nodes.Document document14 = xmlTreeBuilder4.parse("EndTag", "EOF");
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = htmlTreeBuilder0.inListItemScope("<a   hi!=\"\">");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        java.lang.String[] strArray5 = org.jsoup.parser.HtmlTreeBuilder.TagsSearchInScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inScope(" hi!=\"Doctype\"", strArray5);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.framesetOk(true);
        java.lang.String[] strArray6 = org.jsoup.parser.HtmlTreeBuilder.TagSearchEndTags;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inScope(strArray6);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.removeLastFormattingElement();
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = htmlTreeBuilder0.inListItemScope("endtag");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder8 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder8.setFosterInserts(false);
        org.jsoup.nodes.Document document11 = htmlTreeBuilder8.getDocument();
        htmlTreeBuilder8.markInsertionMode();
        org.jsoup.nodes.Element element13 = htmlTreeBuilder8.getHeadElement();
        boolean boolean14 = htmlTreeBuilder8.isFragmentParsing();
        htmlTreeBuilder8.generateImpliedEndTags();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder16 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings17 = htmlTreeBuilder16.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState18 = htmlTreeBuilder16.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList19 = htmlTreeBuilder16.getStack();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings21 = xmlTreeBuilder20.defaultSettings();
        org.jsoup.nodes.Document document24 = xmlTreeBuilder20.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData26 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder20.insert((org.jsoup.parser.Token.Character) cData26);
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag29 = startTag28.reset();
        org.jsoup.nodes.Attributes attributes31 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes34 = attributes31.put("hi!", "");
        boolean boolean36 = attributes34.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag37 = startTag28.nameAttr("a ", attributes34);
        java.lang.String str38 = startTag28.toString();
        org.jsoup.nodes.Element element39 = xmlTreeBuilder20.insert(startTag28);
        boolean boolean40 = htmlTreeBuilder16.isSpecial(element39);
        boolean boolean41 = htmlTreeBuilder8.isSpecial(element39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean42 = htmlTreeBuilder0.removeFromStack(element39);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("EOF");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inSelectScope(" hi!=\"\" <![CDATA[null]]>");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore(" hi!=\"\" hi!=\"\"=\"\"");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder3 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document6 = xmlTreeBuilder3.parse("<![CDATA[<!---->]]>", "");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document6);
        org.jsoup.parser.Token.CData cData9 = new org.jsoup.parser.Token.CData("<!---->");
        org.jsoup.parser.Token.Character character11 = cData9.data("Doctype");
        org.jsoup.parser.Token.Character character13 = cData9.data(" a");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData9);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token6 = comment5.reset();
        org.jsoup.parser.Token token7 = comment5.reset();
        org.jsoup.parser.Token.Comment comment8 = comment5.asComment();
        java.lang.StringBuilder stringBuilder9 = comment5.data;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(comment5);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inButtonScope(" hi!=\"Doctype\"");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = htmlTreeBuilder0.inScope("EndTag");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inSelectScope("a ");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.lang.String[] strArray6 = org.jsoup.parser.HtmlTreeBuilder.TagSearchTableScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inScope(" hi!=\"\" <![CDATA[<!---->]]>", strArray6);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder7.defaultSettings();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder7.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData13 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder7.insert((org.jsoup.parser.Token.Character) cData13);
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag16 = startTag15.reset();
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes21 = attributes18.put("hi!", "");
        boolean boolean23 = attributes21.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag24 = startTag15.nameAttr("a ", attributes21);
        java.lang.String str25 = startTag15.toString();
        org.jsoup.nodes.Element element26 = xmlTreeBuilder7.insert(startTag15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) element26);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
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
        java.lang.String str18 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = htmlTreeBuilder0.state();
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes21 = startTag20.getAttributes();
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        java.lang.String str24 = attributes23.toString();
        org.jsoup.parser.Token.StartTag startTag25 = startTag20.nameAttr("EOF", attributes23);
        java.lang.String str26 = startTag20.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = htmlTreeBuilder0.insertEmpty(startTag20);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.FormElement formElement6 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token8 = doctype7.reset();
        java.lang.StringBuilder stringBuilder9 = doctype7.systemIdentifier;
        boolean boolean10 = doctype7.isForceQuirks();
        java.lang.String str11 = doctype7.getSystemIdentifier();
        boolean boolean12 = doctype7.isForceQuirks();
        java.lang.String str13 = doctype7.getPubSysKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = htmlTreeBuilder0.process((org.jsoup.parser.Token) doctype7);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
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
        java.lang.String str18 = htmlTreeBuilder0.getBaseUri();
        boolean boolean19 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings21 = xmlTreeBuilder20.defaultSettings();
        org.jsoup.nodes.Document document24 = xmlTreeBuilder20.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.Comment comment25 = new org.jsoup.parser.Token.Comment();
        boolean boolean26 = comment25.bogus;
        org.jsoup.parser.Token token27 = comment25.reset();
        boolean boolean28 = comment25.isEndTag();
        xmlTreeBuilder20.insert(comment25);
        java.lang.String str30 = comment25.getData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(comment25);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inSelectScope(" hi!");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder6.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData12 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder6.insert((org.jsoup.parser.Token.Character) cData12);
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes18 = attributes15.put("hi!", "");
        org.jsoup.nodes.Attributes attributes21 = attributes18.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor22 = attributes18.iterator();
        boolean boolean23 = xmlTreeBuilder6.processStartTag("EOF", attributes18);
        org.jsoup.nodes.Document document26 = xmlTreeBuilder6.parse("doctype", "<EOF>");
        org.jsoup.parser.Token.Comment comment27 = new org.jsoup.parser.Token.Comment();
        java.lang.String str28 = comment27.getData();
        java.lang.StringBuilder stringBuilder29 = comment27.data;
        org.jsoup.parser.Token token30 = comment27.reset();
        xmlTreeBuilder6.insert(comment27);
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag33 = startTag32.reset();
        org.jsoup.nodes.Attributes attributes35 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes38 = attributes35.put("hi!", "");
        boolean boolean40 = attributes38.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag41 = startTag32.nameAttr("a ", attributes38);
        java.lang.String str42 = startTag32.toString();
        org.jsoup.parser.Token.EndTag endTag44 = new org.jsoup.parser.Token.EndTag();
        endTag44.appendAttributeValue(" hi!=\"\"");
        org.jsoup.parser.Token.Tag tag48 = endTag44.name("a ");
        org.jsoup.nodes.Attributes attributes49 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes52 = attributes49.put("hi!", "");
        org.jsoup.nodes.Attributes attributes55 = attributes52.put(" hi!=\"\"", false);
        int int56 = attributes52.size();
        endTag44.attributes = attributes52;
        attributes52.normalize();
        org.jsoup.parser.Token.StartTag startTag59 = startTag32.nameAttr("<!---->", attributes52);
        startTag59.normalName = "<![CDATA[null]]>";
        startTag59.appendAttributeName('4');
        org.jsoup.nodes.Element element64 = xmlTreeBuilder6.insert(startTag59);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) element64);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inListItemScope("endtag");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag9 = startTag8.reset();
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes14 = attributes11.put("hi!", "");
        boolean boolean16 = attributes14.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag17 = startTag8.nameAttr("a ", attributes14);
        java.lang.String str18 = startTag8.toString();
        org.jsoup.nodes.Element element19 = xmlTreeBuilder0.insert(startTag8);
        org.jsoup.parser.Token.EndTag endTag20 = new org.jsoup.parser.Token.EndTag();
        endTag20.appendAttributeValue(" hi!=\"\"");
        java.lang.String str23 = endTag20.normalName;
        endTag20.setEmptyAttributeValue();
        endTag20.appendTagName('a');
        char[] charArray32 = new char[] { ' ', ' ', '#', ' ', 'a' };
        endTag20.appendAttributeValue(charArray32);
        endTag20.appendTagName(' ');
        java.lang.String str36 = endTag20.name();
        org.jsoup.parser.Token token37 = endTag20.reset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean38 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag20);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getActiveFormattingElement(" =\"</a>\"");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.CData cData8 = new org.jsoup.parser.Token.CData("EndTag");
        org.jsoup.parser.Token.Character character10 = cData8.data("</a>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(character10);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        boolean boolean6 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList8 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.Token.CData cData10 = new org.jsoup.parser.Token.CData("<!---->");
        java.lang.String str11 = cData10.toString();
        java.lang.String str12 = cData10.toString();
        java.lang.String str13 = cData10.toString();
        java.lang.String str14 = cData10.getData();
        org.jsoup.parser.Token token15 = cData10.reset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData10);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getFromStack(" hi!");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("endtag");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.insertStartTag("</<a   hi!=\"\">>");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
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
        java.lang.String str18 = htmlTreeBuilder0.getBaseUri();
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean56 = htmlTreeBuilder0.isInActiveFormattingElements((org.jsoup.nodes.Element) document52);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder2 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder2.defaultSettings();
        org.jsoup.nodes.Document document6 = xmlTreeBuilder2.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData8 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder2.insert((org.jsoup.parser.Token.Character) cData8);
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes14 = attributes11.put("hi!", "");
        org.jsoup.nodes.Attributes attributes17 = attributes14.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor18 = attributes14.iterator();
        boolean boolean19 = xmlTreeBuilder2.processStartTag("EOF", attributes14);
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder2.defaultSettings();
        org.jsoup.parser.Token.CData cData22 = new org.jsoup.parser.Token.CData("<!---->");
        java.lang.String str23 = cData22.getData();
        org.jsoup.parser.Token.Character character25 = cData22.data("<![CDATA[hi!=\"\"]]>");
        xmlTreeBuilder2.insert((org.jsoup.parser.Token.Character) cData22);
        org.jsoup.parser.Token.CData cData28 = new org.jsoup.parser.Token.CData("<!---->");
        org.jsoup.parser.Token.Character character30 = cData28.data("Doctype");
        java.lang.String str31 = cData28.getData();
        java.lang.String str32 = cData28.getData();
        xmlTreeBuilder2.insert((org.jsoup.parser.Token.Character) cData28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean34 = htmlTreeBuilder0.process((org.jsoup.parser.Token) cData28);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.Doctype doctype1 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token2 = doctype1.reset();
        java.lang.StringBuilder stringBuilder3 = doctype1.systemIdentifier;
        boolean boolean4 = doctype1.isForceQuirks();
        boolean boolean5 = doctype1.isDoctype();
        java.lang.String str6 = doctype1.getSystemIdentifier();
        boolean boolean7 = doctype1.isEndTag();
        boolean boolean8 = doctype1.isForceQuirks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert(doctype1);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
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
        org.jsoup.nodes.Attributes attributes56 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes59 = attributes56.put("hi!", "");
        org.jsoup.nodes.Attributes attributes62 = attributes59.put(" hi!=\"\"", false);
        boolean boolean64 = attributes62.hasKeyIgnoreCase("Doctype");
        int int65 = attributes62.size();
        boolean boolean66 = xmlTreeBuilder0.processStartTag("EndTag", attributes62);
        org.jsoup.parser.Token.Comment comment67 = new org.jsoup.parser.Token.Comment();
        java.lang.String str68 = comment67.getData();
        boolean boolean69 = comment67.isDoctype();
        xmlTreeBuilder0.insert(comment67);
        org.jsoup.parser.Token.EndTag endTag71 = new org.jsoup.parser.Token.EndTag();
        endTag71.appendAttributeValue("hi!");
        org.jsoup.nodes.Attributes attributes74 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes77 = attributes74.put("hi!", "");
        attributes74.removeIgnoreCase("Doctype");
        endTag71.attributes = attributes74;
        endTag71.selfClosing = false;
        endTag71.newAttribute();
        boolean boolean84 = endTag71.isSelfClosing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean85 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag71);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder6.parse("<![CDATA[<!---->]]>", "");
        boolean boolean10 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document9);
        htmlTreeBuilder0.framesetOk(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder5.setFosterInserts(false);
        org.jsoup.nodes.Document document8 = htmlTreeBuilder5.getDocument();
        htmlTreeBuilder5.markInsertionMode();
        org.jsoup.nodes.Element element10 = htmlTreeBuilder5.getHeadElement();
        boolean boolean11 = htmlTreeBuilder5.isFragmentParsing();
        htmlTreeBuilder5.generateImpliedEndTags();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder13 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings14 = htmlTreeBuilder13.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState15 = htmlTreeBuilder13.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList16 = htmlTreeBuilder13.getStack();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder17.defaultSettings();
        org.jsoup.nodes.Document document21 = xmlTreeBuilder17.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData23 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder17.insert((org.jsoup.parser.Token.Character) cData23);
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag26 = startTag25.reset();
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes31 = attributes28.put("hi!", "");
        boolean boolean33 = attributes31.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag34 = startTag25.nameAttr("a ", attributes31);
        java.lang.String str35 = startTag25.toString();
        org.jsoup.nodes.Element element36 = xmlTreeBuilder17.insert(startTag25);
        boolean boolean37 = htmlTreeBuilder13.isSpecial(element36);
        boolean boolean38 = htmlTreeBuilder5.isSpecial(element36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.push(element36);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.ParseSettings parseSettings5 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inSelectScope("hi!=\"hi!=&quot;&quot;\" a =\"hi!=&quot;&quot;\"");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes9 = startTag8.getAttributes();
        org.jsoup.parser.Token.Tag tag10 = startTag8.reset();
        startTag8.newAttribute();
        org.jsoup.parser.ParseSettings parseSettings15 = new org.jsoup.parser.ParseSettings(true, true);
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes19 = attributes16.put("hi!", "");
        org.jsoup.nodes.Attributes attributes22 = attributes19.put(" hi!=\"\"", false);
        boolean boolean24 = attributes22.hasKeyIgnoreCase("Doctype");
        int int25 = attributes22.size();
        org.jsoup.nodes.Attributes attributes26 = parseSettings15.normalizeAttributes(attributes22);
        org.jsoup.parser.Token.StartTag startTag27 = startTag8.nameAttr("<!---->", attributes22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.FormElement formElement29 = htmlTreeBuilder0.insertForm(startTag27, true);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder4.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData10 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder4.insert((org.jsoup.parser.Token.Character) cData10);
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag13 = startTag12.reset();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes18 = attributes15.put("hi!", "");
        boolean boolean20 = attributes18.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag21 = startTag12.nameAttr("a ", attributes18);
        java.lang.String str22 = startTag12.toString();
        org.jsoup.nodes.Element element23 = xmlTreeBuilder4.insert(startTag12);
        boolean boolean24 = htmlTreeBuilder0.isSpecial(element23);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings26 = xmlTreeBuilder25.defaultSettings();
        org.jsoup.nodes.Document document29 = xmlTreeBuilder25.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData31 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder25.insert((org.jsoup.parser.Token.Character) cData31);
        org.jsoup.nodes.Attributes attributes34 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes37 = attributes34.put("hi!", "");
        org.jsoup.nodes.Attributes attributes40 = attributes37.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor41 = attributes37.iterator();
        boolean boolean42 = xmlTreeBuilder25.processStartTag("EOF", attributes37);
        org.jsoup.parser.Token.StartTag startTag43 = new org.jsoup.parser.Token.StartTag();
        startTag43.finaliseTag();
        java.lang.String str45 = startTag43.normalName();
        org.jsoup.nodes.Attributes attributes46 = startTag43.getAttributes();
        startTag43.selfClosing = false;
        org.jsoup.nodes.Attributes attributes50 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes53 = attributes50.put("hi!", "");
        org.jsoup.nodes.Attributes attributes56 = attributes53.put(" hi!=\"\"", false);
        boolean boolean58 = attributes56.hasKeyIgnoreCase("Doctype");
        int int59 = attributes56.size();
        org.jsoup.nodes.Attributes attributes62 = attributes56.put("hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor63 = attributes62.iterator();
        org.jsoup.parser.Token.StartTag startTag64 = startTag43.nameAttr("hi!=\"\"", attributes62);
        org.jsoup.nodes.Element element65 = xmlTreeBuilder25.insert(startTag64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element66 = htmlTreeBuilder0.aboveOnStack(element65);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder6.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document10);
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder14 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings15 = htmlTreeBuilder14.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState16 = htmlTreeBuilder14.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList17 = htmlTreeBuilder14.getStack();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder18 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder18.defaultSettings();
        org.jsoup.nodes.Document document22 = xmlTreeBuilder18.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData24 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder18.insert((org.jsoup.parser.Token.Character) cData24);
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag27 = startTag26.reset();
        org.jsoup.nodes.Attributes attributes29 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes32 = attributes29.put("hi!", "");
        boolean boolean34 = attributes32.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag35 = startTag26.nameAttr("a ", attributes32);
        java.lang.String str36 = startTag26.toString();
        org.jsoup.nodes.Element element37 = xmlTreeBuilder18.insert(startTag26);
        boolean boolean38 = htmlTreeBuilder14.isSpecial(element37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.removeFromActiveFormattingElements(element37);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
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
        java.lang.String str18 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = htmlTreeBuilder0.state();
        org.jsoup.parser.ParseSettings parseSettings20 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings21 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder22 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings23 = htmlTreeBuilder22.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState24 = htmlTreeBuilder22.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList25 = htmlTreeBuilder22.getStack();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder26 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings27 = xmlTreeBuilder26.defaultSettings();
        org.jsoup.nodes.Document document30 = xmlTreeBuilder26.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData32 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder26.insert((org.jsoup.parser.Token.Character) cData32);
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag35 = startTag34.reset();
        org.jsoup.nodes.Attributes attributes37 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes40 = attributes37.put("hi!", "");
        boolean boolean42 = attributes40.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag43 = startTag34.nameAttr("a ", attributes40);
        java.lang.String str44 = startTag34.toString();
        org.jsoup.nodes.Element element45 = xmlTreeBuilder26.insert(startTag34);
        boolean boolean46 = htmlTreeBuilder22.isSpecial(element45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) element45);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder5.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.Doctype doctype10 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token11 = doctype10.reset();
        java.lang.StringBuilder stringBuilder12 = doctype10.systemIdentifier;
        java.lang.String str13 = doctype10.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder14 = doctype10.name;
        org.jsoup.parser.Token token15 = doctype10.reset();
        boolean boolean16 = doctype10.forceQuirks;
        xmlTreeBuilder5.insert(doctype10);
        org.jsoup.parser.Token.Doctype doctype18 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token19 = doctype18.reset();
        java.lang.StringBuilder stringBuilder20 = doctype18.systemIdentifier;
        boolean boolean21 = doctype18.isForceQuirks();
        doctype18.forceQuirks = true;
        java.lang.String str24 = doctype18.getName();
        xmlTreeBuilder5.insert(doctype18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean26 = htmlTreeBuilder0.process((org.jsoup.parser.Token) doctype18);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inListItemScope("<![CDATA[<!---->]]>");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.Token.CData cData5 = new org.jsoup.parser.Token.CData("<!---->");
        java.lang.String str6 = cData5.toString();
        java.lang.String str7 = cData5.toString();
        java.lang.String str8 = cData5.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData5);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.Token.CData cData7 = new org.jsoup.parser.Token.CData("EndTag");
        boolean boolean8 = cData7.isStartTag();
        boolean boolean9 = cData7.isDoctype();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData7);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.markInsertionMode();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder4.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData10 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder4.insert((org.jsoup.parser.Token.Character) cData10);
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag13 = startTag12.reset();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes18 = attributes15.put("hi!", "");
        boolean boolean20 = attributes18.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag21 = startTag12.nameAttr("a ", attributes18);
        java.lang.String str22 = startTag12.toString();
        org.jsoup.nodes.Element element23 = xmlTreeBuilder4.insert(startTag12);
        boolean boolean24 = htmlTreeBuilder0.isSpecial(element23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = htmlTreeBuilder0.getFormElement();
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getActiveFormattingElement("a ");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder6.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document10);
        java.lang.String[] strArray12 = org.jsoup.parser.HtmlTreeBuilder.TagSearchButton;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = htmlTreeBuilder0.inScope(strArray12);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder0.getDocument();
        java.lang.String[] strArray8 = org.jsoup.parser.HtmlTreeBuilder.TagSearchButton;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = htmlTreeBuilder0.inScope(strArray8);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList3 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder4.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData10 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder4.insert((org.jsoup.parser.Token.Character) cData10);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        comment12.bogus = true;
        java.lang.String str15 = comment12.toString();
        xmlTreeBuilder4.insert(comment12);
        org.jsoup.parser.Token.CData cData18 = new org.jsoup.parser.Token.CData("EndTag");
        boolean boolean19 = cData18.isStartTag();
        xmlTreeBuilder4.insert((org.jsoup.parser.Token.Character) cData18);
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag22 = startTag21.reset();
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes27 = attributes24.put("hi!", "");
        boolean boolean29 = attributes27.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag30 = startTag21.nameAttr("a ", attributes27);
        org.jsoup.nodes.Attributes attributes32 = new org.jsoup.nodes.Attributes();
        attributes32.normalize();
        org.jsoup.nodes.Attributes attributes34 = attributes32.clone();
        boolean boolean36 = attributes32.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes37 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes40 = attributes37.put("hi!", "");
        attributes32.addAll(attributes37);
        org.jsoup.nodes.Attributes attributes42 = new org.jsoup.nodes.Attributes();
        attributes42.normalize();
        org.jsoup.nodes.Attributes attributes44 = attributes42.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList45 = attributes44.asList();
        attributes32.addAll(attributes44);
        org.jsoup.parser.Token.StartTag startTag47 = startTag30.nameAttr("a", attributes32);
        boolean boolean48 = startTag30.isStartTag();
        org.jsoup.nodes.Element element49 = xmlTreeBuilder4.insert(startTag30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) element49);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder4.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData10 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder4.insert((org.jsoup.parser.Token.Character) cData10);
        org.jsoup.nodes.Document document14 = xmlTreeBuilder4.parse("EndTag", "EOF");
        boolean boolean15 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document14);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList16 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = htmlTreeBuilder0.inSelectScope("</<a   hi!=\"\">>");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder6.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData12 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder6.insert((org.jsoup.parser.Token.Character) cData12);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        comment14.bogus = true;
        java.lang.String str17 = comment14.toString();
        xmlTreeBuilder6.insert(comment14);
        org.jsoup.parser.Token.Doctype doctype19 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token20 = doctype19.reset();
        java.lang.StringBuilder stringBuilder21 = doctype19.systemIdentifier;
        boolean boolean22 = doctype19.isForceQuirks();
        boolean boolean23 = doctype19.isDoctype();
        doctype19.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype26 = doctype19.asDoctype();
        doctype19.pubSysKey = "";
        boolean boolean29 = xmlTreeBuilder6.process((org.jsoup.parser.Token) doctype19);
        org.jsoup.nodes.Document document32 = xmlTreeBuilder6.parse(" hi! eof", "<![CDATA[ a]]>");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document32);
        boolean boolean34 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings36 = xmlTreeBuilder35.defaultSettings();
        org.jsoup.nodes.Document document39 = xmlTreeBuilder35.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.Comment comment40 = new org.jsoup.parser.Token.Comment();
        boolean boolean41 = comment40.bogus;
        org.jsoup.parser.Token token42 = comment40.reset();
        boolean boolean43 = comment40.isEndTag();
        xmlTreeBuilder35.insert(comment40);
        org.jsoup.parser.Token.Comment comment45 = new org.jsoup.parser.Token.Comment();
        boolean boolean46 = comment45.bogus;
        java.lang.String str47 = comment45.getData();
        org.jsoup.parser.Token.Comment comment48 = comment45.asComment();
        xmlTreeBuilder35.insert(comment45);
        org.jsoup.nodes.Document document52 = xmlTreeBuilder35.parse("hi!", "Doctype");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("hi!=\"\"");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.insertStartTag("a<<!---->>");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement5 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inListItemScope("<![CDATA[<![CDATA[null]]>]]>");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inScope("<![CDATA[ a]]>");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
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
        org.jsoup.parser.Token.CData cData19 = new org.jsoup.parser.Token.CData("hi!");
        org.jsoup.parser.Token.Character character21 = cData19.data("eof");
        org.jsoup.parser.Token.Character character23 = character21.data("<![CDATA[null]]>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(character21);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = htmlTreeBuilder0.getFormElement();
        htmlTreeBuilder0.setFosterInserts(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder7.defaultSettings();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder7.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData13 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder7.insert((org.jsoup.parser.Token.Character) cData13);
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes19 = attributes16.put("hi!", "");
        org.jsoup.nodes.Attributes attributes22 = attributes19.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor23 = attributes19.iterator();
        boolean boolean24 = xmlTreeBuilder7.processStartTag("EOF", attributes19);
        org.jsoup.parser.Token.EndTag endTag26 = new org.jsoup.parser.Token.EndTag();
        endTag26.appendAttributeValue(" hi!=\"\"");
        java.lang.String str29 = endTag26.normalName;
        endTag26.setEmptyAttributeValue();
        endTag26.appendTagName('a');
        endTag26.newAttribute();
        org.jsoup.nodes.Attributes attributes34 = endTag26.attributes;
        org.jsoup.parser.Token.Tag tag35 = endTag26.reset();
        org.jsoup.parser.Token.EndTag endTag36 = new org.jsoup.parser.Token.EndTag();
        endTag36.setEmptyAttributeValue();
        endTag36.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes40 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes43 = attributes40.put("hi!", "");
        attributes40.removeIgnoreCase("Doctype");
        endTag36.attributes = attributes40;
        java.lang.String str48 = attributes40.get(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes49 = new org.jsoup.nodes.Attributes();
        attributes49.normalize();
        org.jsoup.nodes.Attributes attributes51 = attributes49.clone();
        boolean boolean53 = attributes49.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes54 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes57 = attributes54.put("hi!", "");
        attributes49.addAll(attributes54);
        attributes40.addAll(attributes54);
        tag35.attributes = attributes40;
        boolean boolean61 = xmlTreeBuilder7.processStartTag("Doctype", attributes40);
        org.jsoup.parser.ParseSettings parseSettings62 = xmlTreeBuilder7.defaultSettings();
        org.jsoup.parser.Token.EndTag endTag64 = new org.jsoup.parser.Token.EndTag();
        endTag64.setEmptyAttributeValue();
        endTag64.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes68 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes71 = attributes68.put("hi!", "");
        attributes68.removeIgnoreCase("Doctype");
        endTag64.attributes = attributes68;
        java.lang.String str76 = attributes68.get(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes77 = new org.jsoup.nodes.Attributes();
        attributes77.normalize();
        org.jsoup.nodes.Attributes attributes79 = attributes77.clone();
        boolean boolean81 = attributes77.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes82 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes85 = attributes82.put("hi!", "");
        attributes77.addAll(attributes82);
        attributes68.addAll(attributes82);
        java.util.Map<java.lang.String, java.lang.String> strMap88 = attributes68.dataset();
        boolean boolean89 = xmlTreeBuilder7.processStartTag("EOF", attributes68);
        org.jsoup.nodes.Document document92 = xmlTreeBuilder7.parse("<![CDATA[Doctype]]>", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) document92);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = htmlTreeBuilder0.getActiveFormattingElement(" hi!=\"hi!=&quot;&quot;\" a=\"hi!=&quot;&quot;\" a<!---->=\"eof\"");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = htmlTreeBuilder0.getFormElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags(" hi!=\"\" hi!=\"\"=\"\"");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        java.lang.String str2 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        java.lang.String[] strArray9 = new java.lang.String[] { "CData", "<![cdata[<!---->]]>", "<![cdata[</a>]]>", "<EOF>", " hi!=\"\"  a=\"<eof>\"" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(strArray9);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder4.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData10 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder4.insert((org.jsoup.parser.Token.Character) cData10);
        org.jsoup.nodes.Document document14 = xmlTreeBuilder4.parse("EndTag", "EOF");
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document14);
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder17 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder17.setFosterInserts(false);
        org.jsoup.nodes.Document document20 = htmlTreeBuilder17.getDocument();
        boolean boolean21 = htmlTreeBuilder17.isFragmentParsing();
        org.jsoup.nodes.Element element22 = htmlTreeBuilder17.getHeadElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings24 = xmlTreeBuilder23.defaultSettings();
        org.jsoup.nodes.Document document27 = xmlTreeBuilder23.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder17.setHeadElement((org.jsoup.nodes.Element) document27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document27);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.lang.String[] strArray8 = org.jsoup.parser.HtmlTreeBuilder.TagSearchButton;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = htmlTreeBuilder0.inScope("</aEOF>", strArray8);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        org.jsoup.parser.ParseSettings parseSettings7 = htmlTreeBuilder0.defaultSettings();
        java.lang.String[] strArray8 = org.jsoup.parser.HtmlTreeBuilder.TagsSearchInScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(strArray8);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        boolean boolean7 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder4.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData10 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder4.insert((org.jsoup.parser.Token.Character) cData10);
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag13 = startTag12.reset();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes18 = attributes15.put("hi!", "");
        boolean boolean20 = attributes18.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag21 = startTag12.nameAttr("a ", attributes18);
        java.lang.String str22 = startTag12.toString();
        org.jsoup.nodes.Element element23 = xmlTreeBuilder4.insert(startTag12);
        boolean boolean24 = htmlTreeBuilder0.isSpecial(element23);
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean43 = htmlTreeBuilder0.removeFromStack((org.jsoup.nodes.Element) document40);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder6.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData12 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder6.insert((org.jsoup.parser.Token.Character) cData12);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        comment14.bogus = true;
        java.lang.String str17 = comment14.toString();
        xmlTreeBuilder6.insert(comment14);
        org.jsoup.parser.Token.CData cData20 = new org.jsoup.parser.Token.CData("EndTag");
        boolean boolean21 = cData20.isStartTag();
        xmlTreeBuilder6.insert((org.jsoup.parser.Token.Character) cData20);
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag24 = startTag23.reset();
        org.jsoup.nodes.Attributes attributes26 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes29 = attributes26.put("hi!", "");
        boolean boolean31 = attributes29.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag32 = startTag23.nameAttr("a ", attributes29);
        org.jsoup.nodes.Attributes attributes34 = new org.jsoup.nodes.Attributes();
        attributes34.normalize();
        org.jsoup.nodes.Attributes attributes36 = attributes34.clone();
        boolean boolean38 = attributes34.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes39 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes42 = attributes39.put("hi!", "");
        attributes34.addAll(attributes39);
        org.jsoup.nodes.Attributes attributes44 = new org.jsoup.nodes.Attributes();
        attributes44.normalize();
        org.jsoup.nodes.Attributes attributes46 = attributes44.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList47 = attributes46.asList();
        attributes34.addAll(attributes46);
        org.jsoup.parser.Token.StartTag startTag49 = startTag32.nameAttr("a", attributes34);
        boolean boolean50 = startTag32.isStartTag();
        org.jsoup.nodes.Element element51 = xmlTreeBuilder6.insert(startTag32);
        htmlTreeBuilder0.setHeadElement(element51);
        java.util.List<java.lang.String> strList53 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder54 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder54.defaultSettings();
        org.jsoup.nodes.Document document58 = xmlTreeBuilder54.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData60 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder54.insert((org.jsoup.parser.Token.Character) cData60);
        org.jsoup.nodes.Attributes attributes63 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes66 = attributes63.put("hi!", "");
        org.jsoup.nodes.Attributes attributes69 = attributes66.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor70 = attributes66.iterator();
        boolean boolean71 = xmlTreeBuilder54.processStartTag("EOF", attributes66);
        org.jsoup.parser.Token.StartTag startTag72 = new org.jsoup.parser.Token.StartTag();
        startTag72.finaliseTag();
        java.lang.String str74 = startTag72.normalName();
        org.jsoup.nodes.Attributes attributes75 = startTag72.getAttributes();
        startTag72.selfClosing = false;
        org.jsoup.nodes.Attributes attributes79 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes82 = attributes79.put("hi!", "");
        org.jsoup.nodes.Attributes attributes85 = attributes82.put(" hi!=\"\"", false);
        boolean boolean87 = attributes85.hasKeyIgnoreCase("Doctype");
        int int88 = attributes85.size();
        org.jsoup.nodes.Attributes attributes91 = attributes85.put("hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor92 = attributes91.iterator();
        org.jsoup.parser.Token.StartTag startTag93 = startTag72.nameAttr("hi!=\"\"", attributes91);
        org.jsoup.nodes.Element element94 = xmlTreeBuilder54.insert(startTag93);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element95 = htmlTreeBuilder0.aboveOnStack(element94);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("</a >");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(false);
        java.lang.String[] strArray7 = org.jsoup.parser.HtmlTreeBuilder.TagSearchSpecial;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inScope(strArray7);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
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
        java.lang.String str18 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = htmlTreeBuilder0.getActiveFormattingElement("</aEOF>");
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        org.jsoup.nodes.Document document41 = xmlTreeBuilder37.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData43 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder37.insert((org.jsoup.parser.Token.Character) cData43);
        org.jsoup.nodes.Attributes attributes46 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes49 = attributes46.put("hi!", "");
        org.jsoup.nodes.Attributes attributes52 = attributes49.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor53 = attributes49.iterator();
        boolean boolean54 = xmlTreeBuilder37.processStartTag("EOF", attributes49);
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder37.defaultSettings();
        org.jsoup.parser.Token.CData cData57 = new org.jsoup.parser.Token.CData("<!---->");
        java.lang.String str58 = cData57.getData();
        org.jsoup.parser.Token.Character character60 = cData57.data("<![CDATA[hi!=\"\"]]>");
        xmlTreeBuilder37.insert((org.jsoup.parser.Token.Character) cData57);
        org.jsoup.parser.Token.StartTag startTag62 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag63 = startTag62.reset();
        org.jsoup.nodes.Attributes attributes65 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes68 = attributes65.put("hi!", "");
        boolean boolean70 = attributes68.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag71 = startTag62.nameAttr("a ", attributes68);
        java.lang.String str72 = startTag62.toString();
        org.jsoup.parser.Token.EndTag endTag74 = new org.jsoup.parser.Token.EndTag();
        endTag74.appendAttributeValue(" hi!=\"\"");
        org.jsoup.parser.Token.Tag tag78 = endTag74.name("a ");
        org.jsoup.nodes.Attributes attributes79 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes82 = attributes79.put("hi!", "");
        org.jsoup.nodes.Attributes attributes85 = attributes82.put(" hi!=\"\"", false);
        int int86 = attributes82.size();
        endTag74.attributes = attributes82;
        attributes82.normalize();
        org.jsoup.parser.Token.StartTag startTag89 = startTag62.nameAttr("<!---->", attributes82);
        org.jsoup.nodes.Element element90 = xmlTreeBuilder37.insert(startTag62);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean91 = htmlTreeBuilder0.onStack(element90);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.getData();
        java.lang.String str8 = comment5.toString();
        boolean boolean9 = comment5.bogus;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(comment5);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        boolean boolean7 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = htmlTreeBuilder0.removeLastFormattingElement();
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList3 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getActiveFormattingElement("hi!=\"hi!=&quot;&quot;\" a =\"hi!=&quot;&quot;\"");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder4.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData10 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder4.insert((org.jsoup.parser.Token.Character) cData10);
        org.jsoup.nodes.Document document14 = xmlTreeBuilder4.parse("EndTag", "EOF");
        boolean boolean15 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document14);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList16 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.Element element17 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("Doctype");
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inListItemScope("<![cdata[null]]>");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("<![CDATA[<![CDATA[null]]>]]>");
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement5 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder6.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData12 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder6.insert((org.jsoup.parser.Token.Character) cData12);
        org.jsoup.parser.Token.CData cData15 = new org.jsoup.parser.Token.CData("<!---->");
        org.jsoup.parser.Token.Character character17 = cData15.data("Doctype");
        java.lang.String str18 = cData15.getData();
        java.lang.String str19 = cData15.getData();
        boolean boolean20 = xmlTreeBuilder6.process((org.jsoup.parser.Token) cData15);
        org.jsoup.nodes.Document document23 = xmlTreeBuilder6.parse("=\"</a>\"", "<![cdata[</a>]]>");
        org.jsoup.nodes.Document document26 = xmlTreeBuilder6.parse("<a   hi!=\"\">", " hi!=\"\" hi!=\"\"=\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.pushActiveFormattingElements((org.jsoup.nodes.Element) document26);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        boolean boolean7 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = htmlTreeBuilder0.insertStartTag("<![cdata[null]]>");
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder5.setFosterInserts(false);
        org.jsoup.nodes.Document document8 = htmlTreeBuilder5.getDocument();
        org.jsoup.nodes.FormElement formElement9 = htmlTreeBuilder5.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder10.defaultSettings();
        org.jsoup.nodes.Document document14 = xmlTreeBuilder10.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder5.maybeSetBaseUri((org.jsoup.nodes.Element) document14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.pushActiveFormattingElements((org.jsoup.nodes.Element) document14);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags(" hi!=\"Doctype\"");
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder6.parse("<![CDATA[<!---->]]>", "");
        boolean boolean10 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder5.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData11 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder5.insert((org.jsoup.parser.Token.Character) cData11);
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes17 = attributes14.put("hi!", "");
        org.jsoup.nodes.Attributes attributes20 = attributes17.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor21 = attributes17.iterator();
        boolean boolean22 = xmlTreeBuilder5.processStartTag("EOF", attributes17);
        org.jsoup.parser.Token.EndTag endTag24 = new org.jsoup.parser.Token.EndTag();
        endTag24.appendAttributeValue(" hi!=\"\"");
        java.lang.String str27 = endTag24.normalName;
        endTag24.setEmptyAttributeValue();
        endTag24.appendTagName('a');
        endTag24.newAttribute();
        org.jsoup.nodes.Attributes attributes32 = endTag24.attributes;
        org.jsoup.parser.Token.Tag tag33 = endTag24.reset();
        org.jsoup.parser.Token.EndTag endTag34 = new org.jsoup.parser.Token.EndTag();
        endTag34.setEmptyAttributeValue();
        endTag34.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes38 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes41 = attributes38.put("hi!", "");
        attributes38.removeIgnoreCase("Doctype");
        endTag34.attributes = attributes38;
        java.lang.String str46 = attributes38.get(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes47 = new org.jsoup.nodes.Attributes();
        attributes47.normalize();
        org.jsoup.nodes.Attributes attributes49 = attributes47.clone();
        boolean boolean51 = attributes47.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes52 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes55 = attributes52.put("hi!", "");
        attributes47.addAll(attributes52);
        attributes38.addAll(attributes52);
        tag33.attributes = attributes38;
        boolean boolean59 = xmlTreeBuilder5.processStartTag("Doctype", attributes38);
        org.jsoup.parser.ParseSettings parseSettings60 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.Token.EndTag endTag62 = new org.jsoup.parser.Token.EndTag();
        endTag62.setEmptyAttributeValue();
        endTag62.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes66 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes69 = attributes66.put("hi!", "");
        attributes66.removeIgnoreCase("Doctype");
        endTag62.attributes = attributes66;
        java.lang.String str74 = attributes66.get(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes75 = new org.jsoup.nodes.Attributes();
        attributes75.normalize();
        org.jsoup.nodes.Attributes attributes77 = attributes75.clone();
        boolean boolean79 = attributes75.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes80 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes83 = attributes80.put("hi!", "");
        attributes75.addAll(attributes80);
        attributes66.addAll(attributes80);
        java.util.Map<java.lang.String, java.lang.String> strMap86 = attributes66.dataset();
        boolean boolean87 = xmlTreeBuilder5.processStartTag("EOF", attributes66);
        org.jsoup.nodes.Document document90 = xmlTreeBuilder5.parse("<![CDATA[Doctype]]>", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.push((org.jsoup.nodes.Element) document90);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inListItemScope("<![CDATA[Doctype]]>");
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inListItemScope("4");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        org.jsoup.nodes.FormElement formElement5 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag6.reset();
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes12 = attributes9.put("hi!", "");
        boolean boolean14 = attributes12.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag15 = startTag6.nameAttr("a ", attributes12);
        java.lang.String str16 = startTag6.toString();
        org.jsoup.parser.Token.EndTag endTag18 = new org.jsoup.parser.Token.EndTag();
        endTag18.appendAttributeValue(" hi!=\"\"");
        org.jsoup.parser.Token.Tag tag22 = endTag18.name("a ");
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes26 = attributes23.put("hi!", "");
        org.jsoup.nodes.Attributes attributes29 = attributes26.put(" hi!=\"\"", false);
        int int30 = attributes26.size();
        endTag18.attributes = attributes26;
        attributes26.normalize();
        org.jsoup.parser.Token.StartTag startTag33 = startTag6.nameAttr("<!---->", attributes26);
        java.lang.String str34 = startTag33.toString();
        org.jsoup.parser.Token.EndTag endTag36 = new org.jsoup.parser.Token.EndTag();
        endTag36.appendAttributeValue(" hi!=\"\"");
        java.lang.String str39 = endTag36.normalName;
        endTag36.setEmptyAttributeValue();
        endTag36.appendTagName('a');
        endTag36.newAttribute();
        org.jsoup.nodes.Attributes attributes44 = endTag36.attributes;
        org.jsoup.parser.Token.Tag tag45 = endTag36.reset();
        org.jsoup.parser.Token.EndTag endTag46 = new org.jsoup.parser.Token.EndTag();
        endTag46.setEmptyAttributeValue();
        endTag46.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes50 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes53 = attributes50.put("hi!", "");
        attributes50.removeIgnoreCase("Doctype");
        endTag46.attributes = attributes50;
        java.lang.String str58 = attributes50.get(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes59 = new org.jsoup.nodes.Attributes();
        attributes59.normalize();
        org.jsoup.nodes.Attributes attributes61 = attributes59.clone();
        boolean boolean63 = attributes59.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes64 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes67 = attributes64.put("hi!", "");
        attributes59.addAll(attributes64);
        attributes50.addAll(attributes64);
        tag45.attributes = attributes50;
        org.jsoup.parser.Token.StartTag startTag71 = startTag33.nameAttr(" hi!=\"Doctype\"", attributes50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element72 = htmlTreeBuilder0.insertEmpty(startTag33);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        java.lang.String[] strArray7 = org.jsoup.parser.HtmlTreeBuilder.TagSearchTableScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inScope(strArray7);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        org.jsoup.parser.ParseSettings parseSettings7 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Comment comment8 = new org.jsoup.parser.Token.Comment();
        boolean boolean9 = comment8.bogus;
        comment8.bogus = true;
        org.jsoup.parser.Token.TokenType tokenType12 = comment8.type;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(comment8);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.newPendingTableCharacters();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement6 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inSelectScope("<eof>");
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder6.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData12 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder6.insert((org.jsoup.parser.Token.Character) cData12);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        comment14.bogus = true;
        java.lang.String str17 = comment14.toString();
        xmlTreeBuilder6.insert(comment14);
        org.jsoup.parser.Token.Doctype doctype19 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token20 = doctype19.reset();
        java.lang.StringBuilder stringBuilder21 = doctype19.systemIdentifier;
        boolean boolean22 = doctype19.isForceQuirks();
        boolean boolean23 = doctype19.isDoctype();
        doctype19.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype26 = doctype19.asDoctype();
        doctype19.pubSysKey = "";
        boolean boolean29 = xmlTreeBuilder6.process((org.jsoup.parser.Token) doctype19);
        org.jsoup.nodes.Document document32 = xmlTreeBuilder6.parse(" hi! eof", "<![CDATA[ a]]>");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document32);
        boolean boolean34 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings36 = xmlTreeBuilder35.defaultSettings();
        org.jsoup.nodes.Document document39 = xmlTreeBuilder35.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.Comment comment40 = new org.jsoup.parser.Token.Comment();
        boolean boolean41 = comment40.bogus;
        org.jsoup.parser.Token token42 = comment40.reset();
        boolean boolean43 = comment40.isEndTag();
        xmlTreeBuilder35.insert(comment40);
        org.jsoup.parser.Token.Comment comment45 = new org.jsoup.parser.Token.Comment();
        boolean boolean46 = comment45.bogus;
        java.lang.String str47 = comment45.getData();
        org.jsoup.parser.Token.Comment comment48 = comment45.asComment();
        xmlTreeBuilder35.insert(comment45);
        org.jsoup.nodes.Document document52 = xmlTreeBuilder35.parse("hi!", "Doctype");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document52);
        java.lang.String[] strArray54 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean55 = htmlTreeBuilder0.inScope(strArray54);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        java.lang.String[] strArray6 = org.jsoup.parser.HtmlTreeBuilder.TagsSearchInScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inScope(strArray6);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = htmlTreeBuilder0.getFromStack("</</<a   hi!=\"\">>>");
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = htmlTreeBuilder6.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder6.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList9 = htmlTreeBuilder6.getStack();
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
        boolean boolean30 = htmlTreeBuilder6.isSpecial(element29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean31 = htmlTreeBuilder0.isInActiveFormattingElements(element29);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.removeLastFormattingElement();
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.removeLastFormattingElement();
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        boolean boolean6 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = htmlTreeBuilder0.inScope("CData");
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder6.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData12 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder6.insert((org.jsoup.parser.Token.Character) cData12);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        comment14.bogus = true;
        java.lang.String str17 = comment14.toString();
        xmlTreeBuilder6.insert(comment14);
        org.jsoup.parser.Token.Doctype doctype19 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token20 = doctype19.reset();
        java.lang.StringBuilder stringBuilder21 = doctype19.systemIdentifier;
        boolean boolean22 = doctype19.isForceQuirks();
        boolean boolean23 = doctype19.isDoctype();
        doctype19.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype26 = doctype19.asDoctype();
        doctype19.pubSysKey = "";
        boolean boolean29 = xmlTreeBuilder6.process((org.jsoup.parser.Token) doctype19);
        org.jsoup.nodes.Document document32 = xmlTreeBuilder6.parse(" hi! eof", "<![CDATA[ a]]>");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document32);
        boolean boolean34 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element35 = htmlTreeBuilder0.getHeadElement();
        java.lang.String[] strArray36 = org.jsoup.parser.HtmlTreeBuilder.TagSearchSelectScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean37 = htmlTreeBuilder0.inScope(strArray36);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder7.setFosterInserts(false);
        org.jsoup.nodes.Document document10 = htmlTreeBuilder7.getDocument();
        boolean boolean11 = htmlTreeBuilder7.isFragmentParsing();
        htmlTreeBuilder7.generateImpliedEndTags();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings14 = xmlTreeBuilder13.defaultSettings();
        org.jsoup.nodes.Document document17 = xmlTreeBuilder13.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData19 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder13.insert((org.jsoup.parser.Token.Character) cData19);
        org.jsoup.parser.Token.Comment comment21 = new org.jsoup.parser.Token.Comment();
        comment21.bogus = true;
        java.lang.String str24 = comment21.toString();
        xmlTreeBuilder13.insert(comment21);
        org.jsoup.parser.Token.Doctype doctype26 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token27 = doctype26.reset();
        java.lang.StringBuilder stringBuilder28 = doctype26.systemIdentifier;
        boolean boolean29 = doctype26.isForceQuirks();
        boolean boolean30 = doctype26.isDoctype();
        doctype26.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype33 = doctype26.asDoctype();
        doctype26.pubSysKey = "";
        boolean boolean36 = xmlTreeBuilder13.process((org.jsoup.parser.Token) doctype26);
        org.jsoup.nodes.Document document39 = xmlTreeBuilder13.parse(" hi! eof", "<![CDATA[ a]]>");
        htmlTreeBuilder7.setHeadElement((org.jsoup.nodes.Element) document39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean41 = htmlTreeBuilder0.removeFromStack((org.jsoup.nodes.Element) document39);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getFromStack("<![cdata[null]]>");
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inScope("CData");
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder4.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData10 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder4.insert((org.jsoup.parser.Token.Character) cData10);
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag13 = startTag12.reset();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes18 = attributes15.put("hi!", "");
        boolean boolean20 = attributes18.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag21 = startTag12.nameAttr("a ", attributes18);
        java.lang.String str22 = startTag12.toString();
        org.jsoup.nodes.Element element23 = xmlTreeBuilder4.insert(startTag12);
        boolean boolean24 = htmlTreeBuilder0.isSpecial(element23);
        org.jsoup.parser.Token.Comment comment25 = new org.jsoup.parser.Token.Comment();
        boolean boolean26 = comment25.bogus;
        comment25.bogus = true;
        boolean boolean29 = comment25.isEOF();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(comment25);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("<![cdata[<!---->]]>");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        boolean boolean7 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("<![CDATA[<!---->]]>");
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inButtonScope("<![CDATA[Doctype]]>");
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore(" hi!=\"Doctype\"");
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("StartTag");
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inButtonScope("<![cdata[<!---->]]>");
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder6.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document10);
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState14 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        org.jsoup.nodes.Document document19 = xmlTreeBuilder15.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData21 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder15.insert((org.jsoup.parser.Token.Character) cData21);
        org.jsoup.parser.Token.CData cData24 = new org.jsoup.parser.Token.CData("<!---->");
        org.jsoup.parser.Token.Character character26 = cData24.data("Doctype");
        java.lang.String str27 = cData24.getData();
        java.lang.String str28 = cData24.getData();
        boolean boolean29 = xmlTreeBuilder15.process((org.jsoup.parser.Token) cData24);
        org.jsoup.nodes.Document document32 = xmlTreeBuilder15.parse("=\"</a>\"", "<![cdata[</a>]]>");
        org.jsoup.nodes.Document document35 = xmlTreeBuilder15.parse("<a   hi!=\"\">", " hi!=\"\" hi!=\"\"=\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element36 = htmlTreeBuilder0.aboveOnStack((org.jsoup.nodes.Element) document35);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("a ");
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.Token.EndTag endTag2 = new org.jsoup.parser.Token.EndTag();
        endTag2.appendAttributeValue(" hi!=\"\"");
        java.lang.String str5 = endTag2.normalName;
        endTag2.setEmptyAttributeValue();
        endTag2.appendTagName('a');
        java.lang.String str9 = endTag2.name();
        endTag2.setEmptyAttributeValue();
        boolean boolean11 = endTag2.isDoctype();
        boolean boolean12 = endTag2.isComment();
        endTag2.tagName = "<![CDATA[Doctype]]>";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = htmlTreeBuilder0.process((org.jsoup.parser.Token) endTag2);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("</a >");
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder5.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData11 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder5.insert((org.jsoup.parser.Token.Character) cData11);
        org.jsoup.parser.Token.Comment comment13 = new org.jsoup.parser.Token.Comment();
        comment13.bogus = true;
        java.lang.String str16 = comment13.toString();
        xmlTreeBuilder5.insert(comment13);
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes22 = attributes19.put("a", true);
        boolean boolean23 = xmlTreeBuilder5.processStartTag("eof", attributes22);
        org.jsoup.nodes.Document document26 = xmlTreeBuilder5.parse("EndTag", " a");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean27 = htmlTreeBuilder0.isInActiveFormattingElements((org.jsoup.nodes.Element) document26);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        boolean boolean7 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = htmlTreeBuilder0.insertStartTag(" hi!=\"\"  a=\"<eof>\"");
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean8 = htmlTreeBuilder7.isFragmentParsing();
        boolean boolean9 = htmlTreeBuilder7.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder10 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder10.setFosterInserts(false);
        boolean boolean13 = htmlTreeBuilder10.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings14 = htmlTreeBuilder10.defaultSettings();
        boolean boolean15 = htmlTreeBuilder10.framesetOk();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document19 = xmlTreeBuilder16.parse("<![CDATA[<!---->]]>", "");
        boolean boolean20 = htmlTreeBuilder10.isSpecial((org.jsoup.nodes.Element) document19);
        htmlTreeBuilder7.setHeadElement((org.jsoup.nodes.Element) document19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.pushActiveFormattingElements((org.jsoup.nodes.Element) document19);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.newPendingTableCharacters();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement6 = htmlTreeBuilder0.getFormElement();
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.FormElement formElement6 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore(" hi! eof");
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        java.lang.String[] strArray8 = org.jsoup.parser.HtmlTreeBuilder.TagSearchTableScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = htmlTreeBuilder0.inScope("<![CDATA[null]]>", strArray8);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder6.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document10);
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState14 = htmlTreeBuilder0.originalState();
        java.util.List<java.lang.String> strList15 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        org.jsoup.parser.ParseSettings parseSettings7 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = htmlTreeBuilder0.insertStartTag("<![CDATA[null]]>");
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.framesetOk(true);
        java.lang.String[] strArray9 = org.jsoup.parser.HtmlTreeBuilder.TagSearchTableScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = htmlTreeBuilder0.inScope(strArray9);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inSelectScope("<<!---->  hi!=\"\">");
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder3 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings4 = xmlTreeBuilder3.defaultSettings();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder3.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData9 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder3.insert((org.jsoup.parser.Token.Character) cData9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder3.parse("<a   hi!=\"\">", "<![CDATA[null]]>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document13);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder1.defaultSettings();
        org.jsoup.nodes.Document document5 = xmlTreeBuilder1.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData7 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder1.insert((org.jsoup.parser.Token.Character) cData7);
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes13 = attributes10.put("hi!", "");
        org.jsoup.nodes.Attributes attributes16 = attributes13.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor17 = attributes13.iterator();
        boolean boolean18 = xmlTreeBuilder1.processStartTag("EOF", attributes13);
        org.jsoup.parser.Token.EndTag endTag20 = new org.jsoup.parser.Token.EndTag();
        endTag20.appendAttributeValue(" hi!=\"\"");
        java.lang.String str23 = endTag20.normalName;
        endTag20.setEmptyAttributeValue();
        endTag20.appendTagName('a');
        endTag20.newAttribute();
        org.jsoup.nodes.Attributes attributes28 = endTag20.attributes;
        org.jsoup.parser.Token.Tag tag29 = endTag20.reset();
        org.jsoup.parser.Token.EndTag endTag30 = new org.jsoup.parser.Token.EndTag();
        endTag30.setEmptyAttributeValue();
        endTag30.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes34 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes37 = attributes34.put("hi!", "");
        attributes34.removeIgnoreCase("Doctype");
        endTag30.attributes = attributes34;
        java.lang.String str42 = attributes34.get(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes43 = new org.jsoup.nodes.Attributes();
        attributes43.normalize();
        org.jsoup.nodes.Attributes attributes45 = attributes43.clone();
        boolean boolean47 = attributes43.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes48 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes51 = attributes48.put("hi!", "");
        attributes43.addAll(attributes48);
        attributes34.addAll(attributes48);
        tag29.attributes = attributes34;
        boolean boolean55 = xmlTreeBuilder1.processStartTag("Doctype", attributes34);
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder1.defaultSettings();
        org.jsoup.parser.Token.EndTag endTag58 = new org.jsoup.parser.Token.EndTag();
        endTag58.setEmptyAttributeValue();
        endTag58.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes62 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes65 = attributes62.put("hi!", "");
        attributes62.removeIgnoreCase("Doctype");
        endTag58.attributes = attributes62;
        java.lang.String str70 = attributes62.get(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes71 = new org.jsoup.nodes.Attributes();
        attributes71.normalize();
        org.jsoup.nodes.Attributes attributes73 = attributes71.clone();
        boolean boolean75 = attributes71.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes76 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes79 = attributes76.put("hi!", "");
        attributes71.addAll(attributes76);
        attributes62.addAll(attributes76);
        java.util.Map<java.lang.String, java.lang.String> strMap82 = attributes62.dataset();
        boolean boolean83 = xmlTreeBuilder1.processStartTag("EOF", attributes62);
        org.jsoup.parser.Token.Doctype doctype84 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token85 = doctype84.reset();
        java.lang.StringBuilder stringBuilder86 = doctype84.systemIdentifier;
        boolean boolean87 = doctype84.isForceQuirks();
        boolean boolean88 = doctype84.forceQuirks;
        java.lang.String str89 = doctype84.pubSysKey;
        boolean boolean90 = xmlTreeBuilder1.process((org.jsoup.parser.Token) doctype84);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert(doctype84);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        java.lang.String[] strArray3 = org.jsoup.parser.HtmlTreeBuilder.TagSearchTableScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inScope(strArray3);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
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
        java.lang.String str18 = htmlTreeBuilder0.getBaseUri();
        java.lang.String str19 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("");
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getActiveFormattingElement("<![cdata[</a>]]>");
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(false);
        htmlTreeBuilder0.framesetOk(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inTableScope(" hi!");
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
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
        java.lang.String str18 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = htmlTreeBuilder0.getFromStack("4");
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.CData cData8 = new org.jsoup.parser.Token.CData("<!---->");
        java.lang.String str9 = cData8.toString();
        java.lang.String str10 = cData8.toString();
        org.jsoup.parser.Token.Character character11 = cData8.asCharacter();
        org.jsoup.parser.Token token12 = cData8.reset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData8);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder4.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData10 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder4.insert((org.jsoup.parser.Token.Character) cData10);
        org.jsoup.nodes.Document document14 = xmlTreeBuilder4.parse("EndTag", "EOF");
        boolean boolean15 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document14);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList16 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.removeLastFormattingElement();
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("<![cdata[doctype]]>");
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.ParseSettings parseSettings5 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("a");
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        boolean boolean6 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder8 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder8.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder8.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList11 = htmlTreeBuilder8.getStack();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings13 = xmlTreeBuilder12.defaultSettings();
        org.jsoup.nodes.Document document16 = xmlTreeBuilder12.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData18 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder12.insert((org.jsoup.parser.Token.Character) cData18);
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag21 = startTag20.reset();
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes26 = attributes23.put("hi!", "");
        boolean boolean28 = attributes26.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag29 = startTag20.nameAttr("a ", attributes26);
        java.lang.String str30 = startTag20.toString();
        org.jsoup.nodes.Element element31 = xmlTreeBuilder12.insert(startTag20);
        boolean boolean32 = htmlTreeBuilder8.isSpecial(element31);
        boolean boolean33 = htmlTreeBuilder0.isSpecial(element31);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState34 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean36 = htmlTreeBuilder0.inScope("<![CDATA[Doctype]]>");
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.FormElement formElement6 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inScope("<!---->");
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder6.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document10);
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        java.lang.String[] strArray5 = org.jsoup.parser.HtmlTreeBuilder.TagSearchSelectScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(strArray5);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.newPendingTableCharacters();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement6 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag();
        endTag7.appendAttributeValue(" hi!=\"\"");
        java.lang.String str10 = endTag7.normalName;
        endTag7.setEmptyAttributeValue();
        endTag7.appendTagName('a');
        endTag7.newAttribute();
        endTag7.appendTagName('a');
        endTag7.finaliseTag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = htmlTreeBuilder0.process((org.jsoup.parser.Token) endTag7);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        startTag7.finaliseTag();
        java.lang.String str9 = startTag7.normalName();
        org.jsoup.nodes.Attributes attributes10 = startTag7.getAttributes();
        startTag7.selfClosing = false;
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes17 = attributes14.put("hi!", "");
        org.jsoup.nodes.Attributes attributes20 = attributes17.put(" hi!=\"\"", false);
        boolean boolean22 = attributes20.hasKeyIgnoreCase("Doctype");
        int int23 = attributes20.size();
        org.jsoup.nodes.Attributes attributes26 = attributes20.put("hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor27 = attributes26.iterator();
        org.jsoup.parser.Token.StartTag startTag28 = startTag7.nameAttr("hi!=\"\"", attributes26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element29 = htmlTreeBuilder0.insertEmpty(startTag28);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.markInsertionMode();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = htmlTreeBuilder0.inButtonScope("");
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder5.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData11 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder5.insert((org.jsoup.parser.Token.Character) cData11);
        org.jsoup.parser.Token.CData cData14 = new org.jsoup.parser.Token.CData("<!---->");
        org.jsoup.parser.Token.Character character16 = cData14.data("Doctype");
        java.lang.String str17 = cData14.getData();
        java.lang.String str18 = cData14.getData();
        boolean boolean19 = xmlTreeBuilder5.process((org.jsoup.parser.Token) cData14);
        org.jsoup.nodes.Document document22 = xmlTreeBuilder5.parse("=\"</a>\"", "<![cdata[</a>]]>");
        org.jsoup.nodes.Document document25 = xmlTreeBuilder5.parse("<a   hi!=\"\">", " hi!=\"\" hi!=\"\"=\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document25);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        org.jsoup.nodes.FormElement formElement5 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder4.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData10 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder4.insert((org.jsoup.parser.Token.Character) cData10);
        org.jsoup.nodes.Document document14 = xmlTreeBuilder4.parse("EndTag", "EOF");
        boolean boolean15 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document14);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList16 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = htmlTreeBuilder0.getActiveFormattingElement(" hi!=\"hi!=&quot;&quot;\" a =\"hi!=&quot;&quot;\"");
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getActiveFormattingElement("<![CDATA[null]]>");
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder5.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData11 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder5.insert((org.jsoup.parser.Token.Character) cData11);
        org.jsoup.parser.Token.CData cData14 = new org.jsoup.parser.Token.CData("<!---->");
        org.jsoup.parser.Token.Character character16 = cData14.data("Doctype");
        java.lang.String str17 = cData14.getData();
        java.lang.String str18 = cData14.getData();
        boolean boolean19 = xmlTreeBuilder5.process((org.jsoup.parser.Token) cData14);
        org.jsoup.nodes.Document document22 = xmlTreeBuilder5.parse("=\"</a>\"", "<![cdata[</a>]]>");
        org.jsoup.nodes.Document document25 = xmlTreeBuilder5.parse("<a   hi!=\"\">", " hi!=\"\" hi!=\"\"=\"\"");
        org.jsoup.nodes.Document document28 = xmlTreeBuilder5.parse("<a  hi!=\"\">", "hi!");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder29 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings30 = htmlTreeBuilder29.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState31 = htmlTreeBuilder29.originalState();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder32 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document35 = xmlTreeBuilder32.parse("<![CDATA[<!---->]]>", "");
        htmlTreeBuilder29.setHeadElement((org.jsoup.nodes.Element) document35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.replaceActiveFormattingElement((org.jsoup.nodes.Element) document28, (org.jsoup.nodes.Element) document35);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder3 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document6 = xmlTreeBuilder3.parse("<![CDATA[<!---->]]>", "");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document6);
        org.jsoup.parser.ParseSettings parseSettings8 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag9.reset();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes15 = attributes12.put("hi!", "");
        boolean boolean17 = attributes15.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag18 = startTag9.nameAttr("a ", attributes15);
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        attributes20.normalize();
        org.jsoup.nodes.Attributes attributes22 = attributes20.clone();
        boolean boolean24 = attributes20.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes25 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes28 = attributes25.put("hi!", "");
        attributes20.addAll(attributes25);
        org.jsoup.nodes.Attributes attributes30 = new org.jsoup.nodes.Attributes();
        attributes30.normalize();
        org.jsoup.nodes.Attributes attributes32 = attributes30.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList33 = attributes32.asList();
        attributes20.addAll(attributes32);
        org.jsoup.parser.Token.StartTag startTag35 = startTag18.nameAttr("a", attributes20);
        org.jsoup.nodes.Attributes attributes37 = new org.jsoup.nodes.Attributes();
        attributes37.normalize();
        int int39 = attributes37.size();
        org.jsoup.nodes.Attributes attributes40 = new org.jsoup.nodes.Attributes();
        attributes40.normalize();
        org.jsoup.nodes.Attributes attributes42 = attributes40.clone();
        attributes40.remove("Doctype");
        java.lang.String str46 = attributes40.getIgnoreCase("Doctype");
        attributes37.addAll(attributes40);
        org.jsoup.parser.Token.StartTag startTag48 = startTag35.nameAttr("doctype", attributes37);
        startTag48.newAttribute();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.FormElement formElement51 = htmlTreeBuilder0.insertForm(startTag48, true);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document19);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getFromStack(" hi!=\"\" doctype=\"aeof\"");
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
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
        java.lang.String str18 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = htmlTreeBuilder0.state();
        org.jsoup.parser.ParseSettings parseSettings20 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String[] strArray23 = org.jsoup.parser.HtmlTreeBuilder.TagSearchEndTags;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean24 = htmlTreeBuilder0.inScope("a<<!---->>", strArray23);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inListItemScope(" hi!=\"\"  a=\"<eof>\"");
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.setFosterInserts(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(" =\"</a>\"");
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder4.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData10 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder4.insert((org.jsoup.parser.Token.Character) cData10);
        org.jsoup.nodes.Document document14 = xmlTreeBuilder4.parse("EndTag", "EOF");
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document14);
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder4.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData10 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder4.insert((org.jsoup.parser.Token.Character) cData10);
        org.jsoup.parser.Token.CData cData13 = new org.jsoup.parser.Token.CData("<!---->");
        org.jsoup.parser.Token.Character character15 = cData13.data("Doctype");
        java.lang.String str16 = cData13.getData();
        java.lang.String str17 = cData13.getData();
        boolean boolean18 = xmlTreeBuilder4.process((org.jsoup.parser.Token) cData13);
        org.jsoup.nodes.Document document21 = xmlTreeBuilder4.parse("=\"</a>\"", "<![cdata[</a>]]>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean22 = htmlTreeBuilder0.removeFromStack((org.jsoup.nodes.Element) document21);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getActiveFormattingElement("<![CDATA[<![CDATA[hi!=\"\"]]>]]>");
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder8 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder8.setFosterInserts(false);
        boolean boolean11 = htmlTreeBuilder8.framesetOk();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings13 = xmlTreeBuilder12.defaultSettings();
        org.jsoup.nodes.Document document16 = xmlTreeBuilder12.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData18 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder12.insert((org.jsoup.parser.Token.Character) cData18);
        org.jsoup.nodes.Document document22 = xmlTreeBuilder12.parse("EndTag", "EOF");
        boolean boolean23 = htmlTreeBuilder8.isSpecial((org.jsoup.nodes.Element) document22);
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document22);
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean27 = htmlTreeBuilder0.inScope("a ");
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("<![cdata[null]]>");
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.setFosterInserts(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getActiveFormattingElement("<hi!=\"\"  hi!=\"\">");
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test471");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(false);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inListItemScope("<![cdata[null]]>");
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("<EOF>");
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inScope("<![CDATA[eof]]>");
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test475");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.originalState();
        boolean boolean8 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = htmlTreeBuilder0.inSelectScope(" hi!=\"Doctype\"");
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test476");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder0.getDocument();
        java.lang.String str8 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element9 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder10.defaultSettings();
        org.jsoup.nodes.Document document14 = xmlTreeBuilder10.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData16 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder10.insert((org.jsoup.parser.Token.Character) cData16);
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        comment18.bogus = true;
        java.lang.String str21 = comment18.toString();
        xmlTreeBuilder10.insert(comment18);
        org.jsoup.parser.Token.CData cData24 = new org.jsoup.parser.Token.CData("EndTag");
        boolean boolean25 = cData24.isStartTag();
        xmlTreeBuilder10.insert((org.jsoup.parser.Token.Character) cData24);
        org.jsoup.parser.Token.CData cData28 = new org.jsoup.parser.Token.CData("<!---->");
        java.lang.String str29 = cData28.toString();
        xmlTreeBuilder10.insert((org.jsoup.parser.Token.Character) cData28);
        org.jsoup.parser.Token.Doctype doctype31 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token32 = doctype31.reset();
        java.lang.StringBuilder stringBuilder33 = doctype31.systemIdentifier;
        java.lang.StringBuilder stringBuilder34 = doctype31.systemIdentifier;
        java.lang.StringBuilder stringBuilder35 = doctype31.publicIdentifier;
        boolean boolean36 = doctype31.isDoctype();
        java.lang.String str37 = doctype31.getName();
        xmlTreeBuilder10.insert(doctype31);
        org.jsoup.parser.Token.TokenType tokenType39 = doctype31.type;
        doctype31.forceQuirks = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean42 = htmlTreeBuilder0.process((org.jsoup.parser.Token) doctype31);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test477");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder6.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document10);
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState14 = htmlTreeBuilder0.originalState();
        java.util.List<java.lang.String> strList15 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document19 = xmlTreeBuilder16.parse("<![CDATA[<!---->]]>", "");
        org.jsoup.parser.Token.Comment comment20 = new org.jsoup.parser.Token.Comment();
        boolean boolean21 = comment20.bogus;
        comment20.bogus = true;
        boolean boolean24 = comment20.bogus;
        java.lang.String str25 = comment20.toString();
        java.lang.String str26 = comment20.getData();
        xmlTreeBuilder16.insert(comment20);
        org.jsoup.nodes.Document document30 = xmlTreeBuilder16.parse("aeof", " =\"</a>\"");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test478");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.framesetOk(true);
        java.lang.String[] strArray10 = org.jsoup.parser.HtmlTreeBuilder.TagSearchSpecial;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = htmlTreeBuilder0.inScope("</</<a   hi!=\"\">>>", strArray10);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test479");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = htmlTreeBuilder0.inTableScope("</<a   hi!=\"\">>");
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test480");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(false);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.ParseSettings parseSettings7 = org.jsoup.parser.ParseSettings.preserveCase;
        java.lang.String str9 = parseSettings7.normalizeTag("hi!");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        attributes10.normalize();
        org.jsoup.nodes.Attributes attributes12 = attributes10.clone();
        org.jsoup.nodes.Attributes attributes13 = parseSettings7.normalizeAttributes(attributes12);
        attributes13.normalize();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes18 = attributes15.put("", false);
        org.jsoup.nodes.Attributes attributes21 = attributes15.put("hi!", "hi!=\"\"");
        org.jsoup.nodes.Attributes attributes24 = attributes21.put("a ", "hi!=\"\"");
        attributes13.addAll(attributes21);
        org.jsoup.nodes.Attributes attributes26 = attributes13.clone();
        org.jsoup.nodes.Attributes attributes27 = attributes13.clone();
        org.jsoup.nodes.Attributes attributes28 = attributes13.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean29 = htmlTreeBuilder0.processStartTag("aEOF", attributes13);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test481");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test482");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList3 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags(" a");
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test483");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.insertStartTag("<![CDATA[<!---->]]>");
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test484");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList3 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder4.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        comment9.bogus = true;
        org.jsoup.parser.Token token12 = comment9.reset();
        xmlTreeBuilder4.insert(comment9);
        java.lang.String str14 = comment9.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(comment9);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test485");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inTableScope(" hi!=\"\" <![CDATA[null]]>");
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test486");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder4.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData10 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder4.insert((org.jsoup.parser.Token.Character) cData10);
        org.jsoup.nodes.Document document14 = xmlTreeBuilder4.parse("EndTag", "EOF");
        boolean boolean15 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document14);
        org.jsoup.parser.Token.CData cData17 = new org.jsoup.parser.Token.CData("<![CDATA[<!---->]]>");
        java.lang.String str18 = cData17.getData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData17);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test487");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder5.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData11 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder5.insert((org.jsoup.parser.Token.Character) cData11);
        org.jsoup.parser.Token.Comment comment13 = new org.jsoup.parser.Token.Comment();
        comment13.bogus = true;
        java.lang.String str16 = comment13.toString();
        xmlTreeBuilder5.insert(comment13);
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes22 = attributes19.put("a", true);
        boolean boolean23 = xmlTreeBuilder5.processStartTag("eof", attributes22);
        org.jsoup.nodes.Document document26 = xmlTreeBuilder5.parse("EndTag", " a");
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document26);
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag29 = startTag28.reset();
        org.jsoup.nodes.Attributes attributes31 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes34 = attributes31.put("hi!", "");
        boolean boolean36 = attributes34.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag37 = startTag28.nameAttr("a ", attributes34);
        java.lang.String str38 = startTag28.toString();
        org.jsoup.parser.Token.EndTag endTag40 = new org.jsoup.parser.Token.EndTag();
        endTag40.appendAttributeValue(" hi!=\"\"");
        org.jsoup.parser.Token.Tag tag44 = endTag40.name("a ");
        org.jsoup.nodes.Attributes attributes45 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes48 = attributes45.put("hi!", "");
        org.jsoup.nodes.Attributes attributes51 = attributes48.put(" hi!=\"\"", false);
        int int52 = attributes48.size();
        endTag40.attributes = attributes48;
        attributes48.normalize();
        org.jsoup.parser.Token.StartTag startTag55 = startTag28.nameAttr("<!---->", attributes48);
        boolean boolean56 = startTag55.isSelfClosing();
        org.jsoup.nodes.Attributes attributes57 = new org.jsoup.nodes.Attributes();
        attributes57.normalize();
        org.jsoup.nodes.Attributes attributes59 = attributes57.clone();
        attributes57.remove("Doctype");
        org.jsoup.nodes.Attributes attributes62 = new org.jsoup.nodes.Attributes();
        attributes62.normalize();
        org.jsoup.nodes.Attributes attributes64 = attributes62.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList65 = attributes64.asList();
        boolean boolean66 = attributes57.equals((java.lang.Object) attributes64);
        java.util.List<org.jsoup.nodes.Attribute> attributeList67 = attributes57.asList();
        java.lang.String str69 = attributes57.get("a");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator70 = attributes57.spliterator();
        startTag55.attributes = attributes57;
        java.lang.String str72 = startTag55.normalName;
        startTag55.appendTagName("a<!---->");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element75 = htmlTreeBuilder0.insertEmpty(startTag55);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test488");
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
        java.lang.String str18 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = htmlTreeBuilder0.originalState();
        java.util.List<java.lang.String> strList20 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag22 = startTag21.reset();
        startTag21.normalName = "hi!";
        startTag21.appendAttributeValue('a');
        org.jsoup.nodes.Attributes attributes27 = startTag21.attributes;
        org.jsoup.parser.ParseSettings parseSettings29 = org.jsoup.parser.ParseSettings.preserveCase;
        java.lang.String str31 = parseSettings29.normalizeTag("hi!");
        org.jsoup.nodes.Attributes attributes32 = new org.jsoup.nodes.Attributes();
        attributes32.normalize();
        org.jsoup.nodes.Attributes attributes34 = attributes32.clone();
        org.jsoup.nodes.Attributes attributes35 = parseSettings29.normalizeAttributes(attributes34);
        attributes35.normalize();
        org.jsoup.nodes.Attributes attributes37 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes40 = attributes37.put("", false);
        org.jsoup.nodes.Attributes attributes43 = attributes37.put("hi!", "hi!=\"\"");
        org.jsoup.nodes.Attributes attributes46 = attributes43.put("a ", "hi!=\"\"");
        attributes35.addAll(attributes43);
        org.jsoup.parser.Token.StartTag startTag48 = startTag21.nameAttr("<![CDATA[EndTag]]>", attributes43);
        org.jsoup.parser.Token.Tag tag50 = startTag21.name("EndTag");
        startTag21.tagName = "=\"</a>\"";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element53 = htmlTreeBuilder0.insertEmpty(startTag21);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test489");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test490");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag();
        endTag1.appendAttributeValue(" hi!=\"\"");
        java.lang.String str4 = endTag1.normalName;
        endTag1.setEmptyAttributeValue();
        endTag1.appendTagName('a');
        boolean boolean8 = endTag1.isEndTag();
        boolean boolean9 = endTag1.isEOF();
        boolean boolean10 = endTag1.isDoctype();
        org.jsoup.parser.Token.Tag tag12 = endTag1.name("<![CDATA[<!---->]]>");
        java.lang.String str13 = tag12.name();
        org.jsoup.parser.Token.Tag tag14 = tag12.reset();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        attributes15.normalize();
        org.jsoup.nodes.Attributes attributes17 = attributes15.clone();
        attributes15.remove("Doctype");
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        attributes20.normalize();
        org.jsoup.nodes.Attributes attributes22 = attributes20.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList23 = attributes22.asList();
        boolean boolean24 = attributes15.equals((java.lang.Object) attributes22);
        attributes22.removeIgnoreCase("a");
        org.jsoup.parser.ParseSettings parseSettings27 = org.jsoup.parser.ParseSettings.htmlDefault;
        java.lang.String str29 = parseSettings27.normalizeAttribute("hi!");
        org.jsoup.nodes.Attributes attributes30 = new org.jsoup.nodes.Attributes();
        attributes30.normalize();
        org.jsoup.nodes.Attributes attributes32 = attributes30.clone();
        org.jsoup.nodes.Attributes attributes33 = parseSettings27.normalizeAttributes(attributes32);
        attributes32.remove("hi!");
        attributes22.addAll(attributes32);
        tag12.attributes = attributes32;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean38 = xmlTreeBuilder0.process((org.jsoup.parser.Token) tag12);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test491");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test492");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.Token.CData cData8 = new org.jsoup.parser.Token.CData("hi!");
        org.jsoup.parser.Token.Character character10 = cData8.data("eof");
        org.jsoup.parser.Token.Character character12 = character10.data("<![CDATA[null]]>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(character10);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test493");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder4.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData10 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder4.insert((org.jsoup.parser.Token.Character) cData10);
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag13 = startTag12.reset();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes18 = attributes15.put("hi!", "");
        boolean boolean20 = attributes18.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag21 = startTag12.nameAttr("a ", attributes18);
        java.lang.String str22 = startTag12.toString();
        org.jsoup.nodes.Element element23 = xmlTreeBuilder4.insert(startTag12);
        boolean boolean24 = htmlTreeBuilder0.isSpecial(element23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean26 = htmlTreeBuilder0.inTableScope("<![CDATA[eof]]>");
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test494");
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
        java.lang.String str18 = htmlTreeBuilder0.getBaseUri();
        boolean boolean19 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document23 = xmlTreeBuilder20.parse("<![CDATA[<!---->]]>", "");
        org.jsoup.parser.Token.Comment comment24 = new org.jsoup.parser.Token.Comment();
        boolean boolean25 = comment24.bogus;
        comment24.bogus = true;
        boolean boolean28 = comment24.bogus;
        java.lang.String str29 = comment24.toString();
        java.lang.String str30 = comment24.getData();
        xmlTreeBuilder20.insert(comment24);
        org.jsoup.nodes.Document document34 = xmlTreeBuilder20.parse("aeof", " =\"</a>\"");
        org.jsoup.parser.Token.CData cData36 = new org.jsoup.parser.Token.CData(" hi!=\"\"");
        org.jsoup.parser.Token.Character character38 = cData36.data("hi!=\"\"");
        org.jsoup.parser.Token token39 = cData36.reset();
        java.lang.String str40 = cData36.toString();
        java.lang.String str41 = cData36.toString();
        java.lang.String str42 = cData36.getData();
        xmlTreeBuilder20.insert((org.jsoup.parser.Token.Character) cData36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData36);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test495");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test496");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getFromStack("<a  hi!=\"\">");
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test497");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        org.jsoup.parser.ParseSettings parseSettings7 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test498");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.setFosterInserts(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.removeLastFormattingElement();
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test499");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test500");
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
        java.lang.String str18 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = htmlTreeBuilder0.originalState();
        java.util.List<java.lang.String> strList20 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("<![CDATA[<![CDATA[<!---->]]>]]>");
    }
}

