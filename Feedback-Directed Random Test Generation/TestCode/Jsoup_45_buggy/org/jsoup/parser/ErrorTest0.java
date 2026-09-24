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
        htmlTreeBuilder0.popStackToClose("hi!");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.removeLastFormattingElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inListItemScope("hi!");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inScope("");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        htmlTreeBuilder0.reconstructFormattingElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("hi!");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        java.lang.String[] strArray8 = org.jsoup.parser.HtmlTreeBuilder.TagsSearchInScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(strArray8);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.removeLastFormattingElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inScope("");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        htmlTreeBuilder0.reconstructFormattingElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inSelectScope("");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.reconstructFormattingElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inListItemScope("hi!");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inButtonScope("");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray1 = org.jsoup.parser.HtmlTreeBuilder.TagsSearchInScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = htmlTreeBuilder0.inScope(strArray1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.removeLastFormattingElement();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.lastFormattingElement();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element8 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.removeLastFormattingElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = htmlTreeBuilder0.inTableScope("");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.reconstructFormattingElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.reconstructFormattingElements();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inTableScope("hi!");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("hi!");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.lastFormattingElement();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inScope("", strArray7);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.lastFormattingElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        boolean boolean8 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.lastFormattingElement();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Element element8 = htmlTreeBuilder0.getActiveFormattingElement("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.removeLastFormattingElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.removeLastFormattingElement();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.removeLastFormattingElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("hi!");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        boolean boolean8 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = htmlTreeBuilder0.inListItemScope("hi!");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.removeLastFormattingElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        boolean boolean8 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("hi!");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.lastFormattingElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inListItemScope("");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.removeLastFormattingElement();
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.insertMarkerToFormattingElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("hi!");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.removeLastFormattingElement();
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.removeLastFormattingElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inListItemScope("");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        boolean boolean2 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.removeLastFormattingElement();
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("hi!");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.removeLastFormattingElement();
        htmlTreeBuilder0.reconstructFormattingElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inButtonScope("hi!");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.removeLastFormattingElement();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getFromStack("");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("hi!");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.removeLastFormattingElement();
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.reconstructFormattingElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inTableScope("hi!");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.reconstructFormattingElements();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("hi!");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.insertMarkerToFormattingElements();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.lastFormattingElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.reconstructFormattingElements();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inListItemScope("hi!");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.insertMarkerToFormattingElements();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.lastFormattingElement();
        boolean boolean6 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.reconstructFormattingElements();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.lastFormattingElement();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element8 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.framesetOk(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = htmlTreeBuilder0.inListItemScope("hi!");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.insertMarkerToFormattingElements();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.lastFormattingElement();
        boolean boolean6 = htmlTreeBuilder0.framesetOk();
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = htmlTreeBuilder0.inSelectScope("");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.removeLastFormattingElement();
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder0.getPendingTableCharacters();
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("hi!");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.reconstructFormattingElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getFromStack("");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inScope("");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        htmlTreeBuilder0.reconstructFormattingElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inButtonScope("");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.insertMarkerToFormattingElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.insertMarkerToFormattingElements();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.lastFormattingElement();
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.removeLastFormattingElement();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.lastFormattingElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("hi!");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.lastFormattingElement();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element8 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.framesetOk(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("hi!");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.lastFormattingElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inButtonScope("hi!");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.removeLastFormattingElement();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.removeLastFormattingElement();
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        htmlTreeBuilder0.reconstructFormattingElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("hi!");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.removeLastFormattingElement();
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        boolean boolean7 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.lastFormattingElement();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Element element8 = htmlTreeBuilder0.getActiveFormattingElement("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = htmlTreeBuilder0.inButtonScope("");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.removeLastFormattingElement();
        htmlTreeBuilder0.reconstructFormattingElements();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.removeLastFormattingElement();
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        boolean boolean7 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.removeLastFormattingElement();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inButtonScope("hi!");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.lastFormattingElement();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element8 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.framesetOk(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.removeLastFormattingElement();
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inListItemScope("hi!");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.insertMarkerToFormattingElements();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.lastFormattingElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("hi!");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inListItemScope("hi!");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.insertMarkerToFormattingElements();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.lastFormattingElement();
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("hi!");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.removeLastFormattingElement();
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder0.getPendingTableCharacters();
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement8 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.lastFormattingElement();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        boolean boolean5 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.insertMarkerToFormattingElements();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.lastFormattingElement();
        htmlTreeBuilder0.markInsertionMode();
        boolean boolean7 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = htmlTreeBuilder0.inSelectScope("hi!");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.removeLastFormattingElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.reconstructFormattingElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inSelectScope("hi!");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.insertMarkerToFormattingElements();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.lastFormattingElement();
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.lastFormattingElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.removeLastFormattingElement();
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder0.getPendingTableCharacters();
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = htmlTreeBuilder0.getFromStack("");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.lastFormattingElement();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        boolean boolean8 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element9 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.insertMarkerToFormattingElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.insertMarkerToFormattingElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = htmlTreeBuilder0.getFromStack("hi!");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = htmlTreeBuilder0.inTableScope("hi!");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.reconstructFormattingElements();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inListItemScope("hi!");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.removeLastFormattingElement();
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inButtonScope("hi!");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.lastFormattingElement();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        boolean boolean8 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element9 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("hi!");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        boolean boolean8 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = htmlTreeBuilder0.inTableScope("hi!");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.removeLastFormattingElement();
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder0.getPendingTableCharacters();
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element8 = htmlTreeBuilder0.lastFormattingElement();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList9 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        boolean boolean8 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder0.originalState();
        java.lang.String str10 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = htmlTreeBuilder0.inButtonScope("hi!");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.removeLastFormattingElement();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("hi!");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.insertMarkerToFormattingElements();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.insertMarkerToFormattingElements();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.lastFormattingElement();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean9 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.insertMarkerToFormattingElements();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.lastFormattingElement();
        boolean boolean6 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inScope("");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String str1 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inSelectScope("hi!");
    }
}

