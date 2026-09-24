package org.jsoup.parser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = htmlTreeBuilder0.parseFragment("", element2, "hi!", parseErrorList4);
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = htmlTreeBuilder0.isInActiveFormattingElements(element6);
        boolean boolean9 = htmlTreeBuilder0.inListItemScope("");
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.nodes.Document document13 = htmlTreeBuilder0.parse("", "", parseErrorList12);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder14 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element16 = null;
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = htmlTreeBuilder14.parseFragment("", element16, "hi!", parseErrorList18);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder20 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element22 = null;
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList25 = htmlTreeBuilder20.parseFragment("", element22, "hi!", parseErrorList24);
        htmlTreeBuilder20.clearStackToTableBodyContext();
        boolean boolean27 = htmlTreeBuilder20.isFragmentParsing();
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.nodes.Document document31 = htmlTreeBuilder20.parse("", "", parseErrorList30);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder32 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element34 = null;
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList37 = htmlTreeBuilder32.parseFragment("", element34, "hi!", parseErrorList36);
        org.jsoup.nodes.Element element38 = null;
        boolean boolean39 = htmlTreeBuilder32.isInActiveFormattingElements(element38);
        boolean boolean41 = htmlTreeBuilder32.inListItemScope("");
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.nodes.Document document45 = htmlTreeBuilder32.parse("", "", parseErrorList44);
        boolean boolean46 = htmlTreeBuilder20.isInActiveFormattingElements((org.jsoup.nodes.Element) document45);
        org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element> elementList47 = htmlTreeBuilder20.getStack();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder48 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element50 = null;
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList53 = htmlTreeBuilder48.parseFragment("", element50, "hi!", parseErrorList52);
        htmlTreeBuilder48.clearStackToTableBodyContext();
        boolean boolean55 = htmlTreeBuilder48.isFragmentParsing();
        org.jsoup.nodes.Element element57 = null;
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList60 = htmlTreeBuilder48.parseFragment("hi!", element57, "", parseErrorList59);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder61 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element63 = null;
        org.jsoup.parser.ParseErrorList parseErrorList65 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList66 = htmlTreeBuilder61.parseFragment("", element63, "hi!", parseErrorList65);
        htmlTreeBuilder61.clearStackToTableBodyContext();
        boolean boolean68 = htmlTreeBuilder61.isFragmentParsing();
        org.jsoup.parser.ParseErrorList parseErrorList71 = null;
        org.jsoup.nodes.Document document72 = htmlTreeBuilder61.parse("", "", parseErrorList71);
        htmlTreeBuilder48.insertInFosterParent((org.jsoup.nodes.Node) document72);
        boolean boolean74 = htmlTreeBuilder20.isInActiveFormattingElements((org.jsoup.nodes.Element) document72);
        htmlTreeBuilder14.maybeSetBaseUri((org.jsoup.nodes.Element) document72);
        htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document72);
        htmlTreeBuilder0.generateImpliedEndTags("");
        htmlTreeBuilder0.generateImpliedEndTags();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(elementList47);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(nodeList60);
        org.junit.Assert.assertNotNull(nodeList66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(document72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = htmlTreeBuilder0.parseFragment("", element2, "hi!", parseErrorList4);
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = htmlTreeBuilder0.isInActiveFormattingElements(element6);
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Element element10 = htmlTreeBuilder0.getFromStack("");
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.clearStackToTableBodyContext();
        htmlTreeBuilder0.insertMarkerToFormattingElements();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.Token.StartTag startTag17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement19 = htmlTreeBuilder0.insertForm(startTag17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState12);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = htmlTreeBuilder0.parseFragment("", element2, "hi!", parseErrorList4);
        htmlTreeBuilder0.clearStackToTableBodyContext();
        boolean boolean7 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.clearStackToTableBodyContext();
        htmlTreeBuilder0.popStackToClose("");
        org.jsoup.nodes.Element element13 = htmlTreeBuilder0.insert("hi!");
        boolean boolean15 = htmlTreeBuilder0.inSelectScope("hi!");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState8);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = htmlTreeBuilder0.parseFragment("", element2, "hi!", parseErrorList4);
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = htmlTreeBuilder0.isInActiveFormattingElements(element6);
        boolean boolean9 = htmlTreeBuilder0.inListItemScope("");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder11 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList16 = htmlTreeBuilder11.parseFragment("", element13, "hi!", parseErrorList15);
        htmlTreeBuilder11.clearStackToTableBodyContext();
        boolean boolean18 = htmlTreeBuilder11.isFragmentParsing();
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.nodes.Document document22 = htmlTreeBuilder11.parse("", "", parseErrorList21);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList25 = htmlTreeBuilder0.parseFragment("hi!", (org.jsoup.nodes.Element) document22, "", parseErrorList24);
        htmlTreeBuilder0.popStackToBefore("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = htmlTreeBuilder0.toString();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(nodeList25);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = htmlTreeBuilder0.parseFragment("", element2, "hi!", parseErrorList4);
        htmlTreeBuilder0.clearStackToTableBodyContext();
        boolean boolean7 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.nodes.Document document11 = htmlTreeBuilder0.parse("", "", parseErrorList10);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder12 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList17 = htmlTreeBuilder12.parseFragment("", element14, "hi!", parseErrorList16);
        org.jsoup.nodes.Element element18 = null;
        boolean boolean19 = htmlTreeBuilder12.isInActiveFormattingElements(element18);
        boolean boolean21 = htmlTreeBuilder12.inListItemScope("");
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.nodes.Document document25 = htmlTreeBuilder12.parse("", "", parseErrorList24);
        boolean boolean26 = htmlTreeBuilder0.isInActiveFormattingElements((org.jsoup.nodes.Element) document25);
        org.jsoup.nodes.FormElement formElement27 = null;
        htmlTreeBuilder0.setFormElement(formElement27);
        htmlTreeBuilder0.framesetOk(false);
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean34 = htmlTreeBuilder0.inSelectScope("hi!");
        htmlTreeBuilder0.reconstructFormattingElements();
        boolean boolean36 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder37 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element39 = null;
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList42 = htmlTreeBuilder37.parseFragment("", element39, "hi!", parseErrorList41);
        htmlTreeBuilder37.clearStackToTableBodyContext();
        boolean boolean44 = htmlTreeBuilder37.isFragmentParsing();
        htmlTreeBuilder37.newPendingTableCharacters();
        htmlTreeBuilder37.setFosterInserts(false);
        htmlTreeBuilder37.popStackToBefore("");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder50 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element52 = null;
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList55 = htmlTreeBuilder50.parseFragment("", element52, "hi!", parseErrorList54);
        htmlTreeBuilder50.clearStackToTableBodyContext();
        boolean boolean57 = htmlTreeBuilder50.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState58 = htmlTreeBuilder50.originalState();
        java.util.List<org.jsoup.parser.Token.Character> characterList59 = htmlTreeBuilder50.getPendingTableCharacters();
        htmlTreeBuilder50.framesetOk(false);
        htmlTreeBuilder50.setFosterInserts(true);
        org.jsoup.nodes.Element element64 = htmlTreeBuilder50.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder65 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element67 = null;
        org.jsoup.parser.ParseErrorList parseErrorList69 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList70 = htmlTreeBuilder65.parseFragment("", element67, "hi!", parseErrorList69);
        org.jsoup.nodes.Element element71 = null;
        boolean boolean72 = htmlTreeBuilder65.isInActiveFormattingElements(element71);
        org.jsoup.nodes.FormElement formElement73 = null;
        htmlTreeBuilder65.setFormElement(formElement73);
        org.jsoup.nodes.Element element75 = htmlTreeBuilder65.pop();
        boolean boolean77 = htmlTreeBuilder65.inScope("");
        org.jsoup.nodes.Document document78 = htmlTreeBuilder65.getDocument();
        htmlTreeBuilder50.insert((org.jsoup.nodes.Element) document78);
        boolean boolean80 = htmlTreeBuilder37.onStack((org.jsoup.nodes.Element) document78);
        boolean boolean81 = htmlTreeBuilder0.removeFromStack((org.jsoup.nodes.Element) document78);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(nodeList55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState58);
        org.junit.Assert.assertNotNull(characterList59);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(nodeList70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(element75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(document78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = htmlTreeBuilder0.parseFragment("", element2, "hi!", parseErrorList4);
        htmlTreeBuilder0.clearStackToTableBodyContext();
        boolean boolean7 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.nodes.Document document11 = htmlTreeBuilder0.parse("", "", parseErrorList10);
        org.jsoup.nodes.Element element13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList16 = htmlTreeBuilder0.parseFragment("", element13, "hi!", parseErrorList15);
        org.jsoup.nodes.Element element17 = null;
        boolean boolean18 = htmlTreeBuilder0.onStack(element17);
        org.jsoup.nodes.Element element19 = htmlTreeBuilder0.getHeadElement();
        java.lang.String str20 = htmlTreeBuilder0.getBaseUri();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = htmlTreeBuilder0.parseFragment("", element2, "hi!", parseErrorList4);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList11 = htmlTreeBuilder6.parseFragment("", element8, "hi!", parseErrorList10);
        htmlTreeBuilder6.clearStackToTableBodyContext();
        boolean boolean13 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.nodes.Document document17 = htmlTreeBuilder6.parse("", "", parseErrorList16);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element20 = null;
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList23 = htmlTreeBuilder18.parseFragment("", element20, "hi!", parseErrorList22);
        org.jsoup.nodes.Element element24 = null;
        boolean boolean25 = htmlTreeBuilder18.isInActiveFormattingElements(element24);
        boolean boolean27 = htmlTreeBuilder18.inListItemScope("");
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.nodes.Document document31 = htmlTreeBuilder18.parse("", "", parseErrorList30);
        boolean boolean32 = htmlTreeBuilder6.isInActiveFormattingElements((org.jsoup.nodes.Element) document31);
        org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element> elementList33 = htmlTreeBuilder6.getStack();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder34 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element36 = null;
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList39 = htmlTreeBuilder34.parseFragment("", element36, "hi!", parseErrorList38);
        htmlTreeBuilder34.clearStackToTableBodyContext();
        boolean boolean41 = htmlTreeBuilder34.isFragmentParsing();
        org.jsoup.nodes.Element element43 = null;
        org.jsoup.parser.ParseErrorList parseErrorList45 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList46 = htmlTreeBuilder34.parseFragment("hi!", element43, "", parseErrorList45);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder47 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element49 = null;
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList52 = htmlTreeBuilder47.parseFragment("", element49, "hi!", parseErrorList51);
        htmlTreeBuilder47.clearStackToTableBodyContext();
        boolean boolean54 = htmlTreeBuilder47.isFragmentParsing();
        org.jsoup.parser.ParseErrorList parseErrorList57 = null;
        org.jsoup.nodes.Document document58 = htmlTreeBuilder47.parse("", "", parseErrorList57);
        htmlTreeBuilder34.insertInFosterParent((org.jsoup.nodes.Node) document58);
        boolean boolean60 = htmlTreeBuilder6.isInActiveFormattingElements((org.jsoup.nodes.Element) document58);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document58);
        boolean boolean62 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element> elementList63 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder64 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element66 = null;
        org.jsoup.parser.ParseErrorList parseErrorList68 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList69 = htmlTreeBuilder64.parseFragment("", element66, "hi!", parseErrorList68);
        htmlTreeBuilder64.clearStackToTableContext();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder71 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element73 = null;
        org.jsoup.parser.ParseErrorList parseErrorList75 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList76 = htmlTreeBuilder71.parseFragment("", element73, "hi!", parseErrorList75);
        org.jsoup.nodes.Element element77 = null;
        boolean boolean78 = htmlTreeBuilder71.isInActiveFormattingElements(element77);
        org.jsoup.nodes.FormElement formElement79 = null;
        htmlTreeBuilder71.setFormElement(formElement79);
        org.jsoup.parser.ParseErrorList parseErrorList83 = null;
        org.jsoup.nodes.Document document84 = htmlTreeBuilder71.parse("hi!", "hi!", parseErrorList83);
        org.jsoup.parser.ParseErrorList parseErrorList87 = null;
        org.jsoup.nodes.Document document88 = htmlTreeBuilder71.parse("", "", parseErrorList87);
        htmlTreeBuilder64.pushActiveFormattingElements((org.jsoup.nodes.Element) document88);
        boolean boolean90 = htmlTreeBuilder0.isInActiveFormattingElements((org.jsoup.nodes.Element) document88);
        org.jsoup.nodes.Document document91 = htmlTreeBuilder0.getDocument();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(elementList33);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(nodeList52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(elementList63);
        org.junit.Assert.assertNotNull(nodeList69);
        org.junit.Assert.assertNotNull(nodeList76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(document84);
        org.junit.Assert.assertNotNull(document88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(document91);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = htmlTreeBuilder0.parseFragment("", element2, "hi!", parseErrorList4);
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = htmlTreeBuilder0.isInActiveFormattingElements(element6);
        boolean boolean9 = htmlTreeBuilder0.inListItemScope("");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder11 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList16 = htmlTreeBuilder11.parseFragment("", element13, "hi!", parseErrorList15);
        htmlTreeBuilder11.clearStackToTableBodyContext();
        boolean boolean18 = htmlTreeBuilder11.isFragmentParsing();
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.nodes.Document document22 = htmlTreeBuilder11.parse("", "", parseErrorList21);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList25 = htmlTreeBuilder0.parseFragment("hi!", (org.jsoup.nodes.Element) document22, "", parseErrorList24);
        htmlTreeBuilder0.popStackToBefore("");
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder31 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element33 = null;
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList36 = htmlTreeBuilder31.parseFragment("", element33, "hi!", parseErrorList35);
        org.jsoup.nodes.Element element37 = null;
        boolean boolean38 = htmlTreeBuilder31.isInActiveFormattingElements(element37);
        boolean boolean40 = htmlTreeBuilder31.inListItemScope("");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder41 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element43 = null;
        org.jsoup.parser.ParseErrorList parseErrorList45 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList46 = htmlTreeBuilder41.parseFragment("", element43, "hi!", parseErrorList45);
        org.jsoup.nodes.Element element47 = null;
        boolean boolean48 = htmlTreeBuilder41.isInActiveFormattingElements(element47);
        boolean boolean50 = htmlTreeBuilder41.inListItemScope("");
        org.jsoup.parser.ParseErrorList parseErrorList53 = null;
        org.jsoup.nodes.Document document54 = htmlTreeBuilder41.parse("", "", parseErrorList53);
        htmlTreeBuilder31.setHeadElement((org.jsoup.nodes.Element) document54);
        org.jsoup.nodes.Element element57 = htmlTreeBuilder31.insert("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList60 = htmlTreeBuilder0.parseFragment("", element57, "hi!", parseErrorList59);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder61 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element63 = null;
        org.jsoup.parser.ParseErrorList parseErrorList65 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList66 = htmlTreeBuilder61.parseFragment("", element63, "hi!", parseErrorList65);
        htmlTreeBuilder61.clearStackToTableBodyContext();
        boolean boolean68 = htmlTreeBuilder61.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState69 = htmlTreeBuilder61.originalState();
        java.util.List<org.jsoup.parser.Token.Character> characterList70 = htmlTreeBuilder61.getPendingTableCharacters();
        htmlTreeBuilder61.clearStackToTableRowContext();
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean75 = htmlTreeBuilder61.inScope(strArray74);
        htmlTreeBuilder0.popStackToClose(strArray74);
        org.jsoup.parser.ParseErrorList parseErrorList79 = null;
        org.jsoup.nodes.Document document80 = htmlTreeBuilder0.parse("", "", parseErrorList79);
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        boolean boolean82 = htmlTreeBuilder0.isFragmentParsing();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(nodeList60);
        org.junit.Assert.assertNotNull(nodeList66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState69);
        org.junit.Assert.assertNotNull(characterList70);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(document80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = htmlTreeBuilder0.parseFragment("", element2, "hi!", parseErrorList4);
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = htmlTreeBuilder0.isInActiveFormattingElements(element6);
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.resetInsertionMode();
        java.lang.String str10 = htmlTreeBuilder0.toString();
        htmlTreeBuilder0.resetInsertionMode();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = htmlTreeBuilder0.parseFragment("", element2, "hi!", parseErrorList4);
        htmlTreeBuilder0.framesetOk(false);
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.lang.String str10 = htmlTreeBuilder0.toString();
        org.jsoup.nodes.FormElement formElement11 = htmlTreeBuilder0.getFormElement();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(formElement11);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = htmlTreeBuilder0.parseFragment("", element2, "hi!", parseErrorList4);
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = htmlTreeBuilder0.isInActiveFormattingElements(element6);
        boolean boolean9 = htmlTreeBuilder0.inListItemScope("");
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean13 = htmlTreeBuilder0.inScope("hi!");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = htmlTreeBuilder0.parseFragment("", element2, "hi!", parseErrorList4);
        htmlTreeBuilder0.clearStackToTableContext();
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        boolean boolean11 = htmlTreeBuilder0.inScope(strArray10);
        boolean boolean12 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean14 = htmlTreeBuilder0.inScope("");
        org.jsoup.nodes.FormElement formElement15 = htmlTreeBuilder0.getFormElement();
        boolean boolean17 = htmlTreeBuilder0.inScope("");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(formElement15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = htmlTreeBuilder0.parseFragment("", element2, "hi!", parseErrorList4);
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = htmlTreeBuilder0.isInActiveFormattingElements(element6);
        boolean boolean9 = htmlTreeBuilder0.inListItemScope("");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder11 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList16 = htmlTreeBuilder11.parseFragment("", element13, "hi!", parseErrorList15);
        htmlTreeBuilder11.clearStackToTableBodyContext();
        boolean boolean18 = htmlTreeBuilder11.isFragmentParsing();
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.nodes.Document document22 = htmlTreeBuilder11.parse("", "", parseErrorList21);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList25 = htmlTreeBuilder0.parseFragment("hi!", (org.jsoup.nodes.Element) document22, "", parseErrorList24);
        org.jsoup.nodes.Element element27 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        htmlTreeBuilder0.resetInsertionMode();
        java.lang.String str29 = htmlTreeBuilder0.toString();
        org.jsoup.nodes.Element element31 = htmlTreeBuilder0.insert("hi!");
        boolean boolean32 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.FormElement formElement33 = htmlTreeBuilder0.getFormElement();
        org.jsoup.nodes.Element element34 = htmlTreeBuilder0.pop();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNull(element27);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(formElement33);
        org.junit.Assert.assertNotNull(element34);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = htmlTreeBuilder0.parseFragment("", element2, "hi!", parseErrorList4);
        htmlTreeBuilder0.clearStackToTableBodyContext();
        boolean boolean7 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList12 = htmlTreeBuilder0.parseFragment("hi!", element9, "", parseErrorList11);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState13 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.reconstructFormattingElements();
        htmlTreeBuilder0.insertMarkerToFormattingElements();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder17 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element19 = null;
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList22 = htmlTreeBuilder17.parseFragment("", element19, "hi!", parseErrorList21);
        htmlTreeBuilder17.clearStackToTableBodyContext();
        boolean boolean24 = htmlTreeBuilder17.isFragmentParsing();
        org.jsoup.nodes.Element element26 = null;
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList29 = htmlTreeBuilder17.parseFragment("hi!", element26, "", parseErrorList28);
        boolean boolean31 = htmlTreeBuilder17.inListItemScope("hi!");
        htmlTreeBuilder17.reconstructFormattingElements();
        java.lang.String str33 = htmlTreeBuilder17.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder34 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element36 = null;
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList39 = htmlTreeBuilder34.parseFragment("", element36, "hi!", parseErrorList38);
        org.jsoup.nodes.Element element40 = null;
        boolean boolean41 = htmlTreeBuilder34.isInActiveFormattingElements(element40);
        boolean boolean43 = htmlTreeBuilder34.inListItemScope("");
        htmlTreeBuilder34.setFosterInserts(true);
        org.jsoup.nodes.Element element46 = htmlTreeBuilder34.pop();
        htmlTreeBuilder17.insertInFosterParent((org.jsoup.nodes.Node) element46);
        htmlTreeBuilder0.pushActiveFormattingElements(element46);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(htmlTreeBuilderState13);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(element46);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = htmlTreeBuilder0.parseFragment("", element2, "hi!", parseErrorList4);
        htmlTreeBuilder0.clearStackToTableBodyContext();
        boolean boolean7 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder0.originalState();
        java.util.List<org.jsoup.parser.Token.Character> characterList9 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.clearStackToTableRowContext();
        org.jsoup.nodes.Element element12 = htmlTreeBuilder0.getFromStack("");
        boolean boolean14 = htmlTreeBuilder0.inScope("");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder15 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element17 = null;
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList20 = htmlTreeBuilder15.parseFragment("", element17, "hi!", parseErrorList19);
        org.jsoup.nodes.Element element21 = null;
        boolean boolean22 = htmlTreeBuilder15.isInActiveFormattingElements(element21);
        htmlTreeBuilder15.generateImpliedEndTags();
        org.jsoup.nodes.Element element25 = htmlTreeBuilder15.getFromStack("");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder26 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element28 = null;
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList31 = htmlTreeBuilder26.parseFragment("", element28, "hi!", parseErrorList30);
        htmlTreeBuilder26.clearStackToTableBodyContext();
        boolean boolean33 = htmlTreeBuilder26.isFragmentParsing();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.nodes.Document document37 = htmlTreeBuilder26.parse("", "", parseErrorList36);
        org.jsoup.nodes.Element element39 = null;
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList42 = htmlTreeBuilder26.parseFragment("", element39, "hi!", parseErrorList41);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState43 = htmlTreeBuilder26.state();
        htmlTreeBuilder15.transition(htmlTreeBuilderState43);
        htmlTreeBuilder0.transition(htmlTreeBuilderState43);
        htmlTreeBuilder0.clearStackToTableBodyContext();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder48 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element50 = null;
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList53 = htmlTreeBuilder48.parseFragment("", element50, "hi!", parseErrorList52);
        htmlTreeBuilder48.clearStackToTableContext();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder55 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element57 = null;
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList60 = htmlTreeBuilder55.parseFragment("", element57, "hi!", parseErrorList59);
        org.jsoup.nodes.Element element61 = null;
        boolean boolean62 = htmlTreeBuilder55.isInActiveFormattingElements(element61);
        org.jsoup.nodes.FormElement formElement63 = null;
        htmlTreeBuilder55.setFormElement(formElement63);
        org.jsoup.parser.ParseErrorList parseErrorList67 = null;
        org.jsoup.nodes.Document document68 = htmlTreeBuilder55.parse("hi!", "hi!", parseErrorList67);
        org.jsoup.parser.ParseErrorList parseErrorList71 = null;
        org.jsoup.nodes.Document document72 = htmlTreeBuilder55.parse("", "", parseErrorList71);
        htmlTreeBuilder48.pushActiveFormattingElements((org.jsoup.nodes.Element) document72);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder74 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element76 = null;
        org.jsoup.parser.ParseErrorList parseErrorList78 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList79 = htmlTreeBuilder74.parseFragment("", element76, "hi!", parseErrorList78);
        htmlTreeBuilder74.clearStackToTableBodyContext();
        boolean boolean81 = htmlTreeBuilder74.isFragmentParsing();
        org.jsoup.parser.ParseErrorList parseErrorList84 = null;
        org.jsoup.nodes.Document document85 = htmlTreeBuilder74.parse("", "", parseErrorList84);
        htmlTreeBuilder48.push((org.jsoup.nodes.Element) document85);
        org.jsoup.parser.ParseErrorList parseErrorList89 = null;
        org.jsoup.nodes.Document document90 = htmlTreeBuilder48.parse("hi!", "hi!", parseErrorList89);
        org.jsoup.parser.ParseErrorList parseErrorList92 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList93 = htmlTreeBuilder0.parseFragment("", (org.jsoup.nodes.Element) document90, "hi!", parseErrorList92);
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.resetInsertionMode();
        java.lang.String str96 = htmlTreeBuilder0.toString();
        org.jsoup.nodes.FormElement formElement97 = htmlTreeBuilder0.getFormElement();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState8);
        org.junit.Assert.assertNotNull(characterList9);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(element25);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState43);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertNotNull(nodeList60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(document68);
        org.junit.Assert.assertNotNull(document72);
        org.junit.Assert.assertNotNull(nodeList79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(document85);
        org.junit.Assert.assertNotNull(document90);
        org.junit.Assert.assertNotNull(nodeList93);
        org.junit.Assert.assertNull(formElement97);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = htmlTreeBuilder0.parseFragment("", element2, "hi!", parseErrorList4);
        htmlTreeBuilder0.framesetOk(false);
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder10 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element12 = null;
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList15 = htmlTreeBuilder10.parseFragment("", element12, "hi!", parseErrorList14);
        htmlTreeBuilder10.clearStackToTableBodyContext();
        boolean boolean17 = htmlTreeBuilder10.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState18 = htmlTreeBuilder10.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder19 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element21 = null;
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList24 = htmlTreeBuilder19.parseFragment("", element21, "hi!", parseErrorList23);
        htmlTreeBuilder19.clearStackToTableBodyContext();
        boolean boolean26 = htmlTreeBuilder19.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState27 = htmlTreeBuilder19.originalState();
        java.util.List<org.jsoup.parser.Token.Character> characterList28 = htmlTreeBuilder19.getPendingTableCharacters();
        htmlTreeBuilder19.clearStackToTableRowContext();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder30 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element32 = null;
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList35 = htmlTreeBuilder30.parseFragment("", element32, "hi!", parseErrorList34);
        htmlTreeBuilder30.clearStackToTableBodyContext();
        boolean boolean37 = htmlTreeBuilder30.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState38 = htmlTreeBuilder30.originalState();
        java.util.List<org.jsoup.parser.Token.Character> characterList39 = htmlTreeBuilder30.getPendingTableCharacters();
        htmlTreeBuilder30.clearStackToTableRowContext();
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean44 = htmlTreeBuilder30.inScope(strArray43);
        htmlTreeBuilder19.popStackToClose(strArray43);
        htmlTreeBuilder10.popStackToClose(strArray43);
        htmlTreeBuilder0.popStackToClose(strArray43);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder48 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element50 = null;
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList53 = htmlTreeBuilder48.parseFragment("", element50, "hi!", parseErrorList52);
        htmlTreeBuilder48.clearStackToTableBodyContext();
        boolean boolean55 = htmlTreeBuilder48.isFragmentParsing();
        org.jsoup.parser.ParseErrorList parseErrorList58 = null;
        org.jsoup.nodes.Document document59 = htmlTreeBuilder48.parse("", "", parseErrorList58);
        htmlTreeBuilder48.clearFormattingElementsToLastMarker();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder62 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element64 = null;
        org.jsoup.parser.ParseErrorList parseErrorList66 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList67 = htmlTreeBuilder62.parseFragment("", element64, "hi!", parseErrorList66);
        htmlTreeBuilder62.clearStackToTableBodyContext();
        boolean boolean69 = htmlTreeBuilder62.isFragmentParsing();
        org.jsoup.parser.ParseErrorList parseErrorList72 = null;
        org.jsoup.nodes.Document document73 = htmlTreeBuilder62.parse("", "", parseErrorList72);
        org.jsoup.parser.ParseErrorList parseErrorList75 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList76 = htmlTreeBuilder48.parseFragment("hi!", (org.jsoup.nodes.Element) document73, "hi!", parseErrorList75);
        boolean boolean77 = htmlTreeBuilder0.onStack((org.jsoup.nodes.Element) document73);
        htmlTreeBuilder0.clearStackToTableBodyContext();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState18);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState27);
        org.junit.Assert.assertNotNull(characterList28);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState38);
        org.junit.Assert.assertNotNull(characterList39);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(document59);
        org.junit.Assert.assertNotNull(nodeList67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(document73);
        org.junit.Assert.assertNotNull(nodeList76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = htmlTreeBuilder0.parseFragment("", element2, "hi!", parseErrorList4);
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = htmlTreeBuilder0.isInActiveFormattingElements(element6);
        boolean boolean9 = htmlTreeBuilder0.inListItemScope("");
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.nodes.Document document13 = htmlTreeBuilder0.parse("", "", parseErrorList12);
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState15 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder17 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element19 = null;
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList22 = htmlTreeBuilder17.parseFragment("", element19, "hi!", parseErrorList21);
        org.jsoup.nodes.Element element23 = null;
        boolean boolean24 = htmlTreeBuilder17.isInActiveFormattingElements(element23);
        htmlTreeBuilder17.generateImpliedEndTags();
        htmlTreeBuilder17.setFosterInserts(true);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.nodes.Document document31 = htmlTreeBuilder17.parse("", "hi!", parseErrorList30);
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList34 = htmlTreeBuilder0.parseFragment("hi!", (org.jsoup.nodes.Element) document31, "", parseErrorList33);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState15);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(nodeList34);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = htmlTreeBuilder0.parseFragment("", element2, "hi!", parseErrorList4);
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = htmlTreeBuilder0.isInActiveFormattingElements(element6);
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Element element10 = htmlTreeBuilder0.getFromStack("");
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        boolean boolean15 = htmlTreeBuilder0.inScope("");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = htmlTreeBuilder0.parseFragment("", element2, "hi!", parseErrorList4);
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = htmlTreeBuilder0.isInActiveFormattingElements(element6);
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Element element10 = htmlTreeBuilder0.getFromStack("");
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Element element15 = htmlTreeBuilder0.getActiveFormattingElement("");
        boolean boolean16 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element17 = htmlTreeBuilder0.getHeadElement();
        java.lang.Class<?> wildcardClass18 = element17.getClass();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState12);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = htmlTreeBuilder0.parseFragment("", element2, "hi!", parseErrorList4);
        htmlTreeBuilder0.clearStackToTableBodyContext();
        boolean boolean7 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.nodes.Document document11 = htmlTreeBuilder0.parse("", "", parseErrorList10);
        org.jsoup.nodes.Element element13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList16 = htmlTreeBuilder0.parseFragment("", element13, "hi!", parseErrorList15);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder17 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element19 = null;
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList22 = htmlTreeBuilder17.parseFragment("", element19, "hi!", parseErrorList21);
        htmlTreeBuilder17.clearStackToTableBodyContext();
        boolean boolean24 = htmlTreeBuilder17.isFragmentParsing();
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.nodes.Document document28 = htmlTreeBuilder17.parse("", "", parseErrorList27);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder29 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element31 = null;
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList34 = htmlTreeBuilder29.parseFragment("", element31, "hi!", parseErrorList33);
        org.jsoup.nodes.Element element35 = null;
        boolean boolean36 = htmlTreeBuilder29.isInActiveFormattingElements(element35);
        boolean boolean38 = htmlTreeBuilder29.inListItemScope("");
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.nodes.Document document42 = htmlTreeBuilder29.parse("", "", parseErrorList41);
        boolean boolean43 = htmlTreeBuilder17.isInActiveFormattingElements((org.jsoup.nodes.Element) document42);
        org.jsoup.nodes.Element element44 = null; // flaky "1) test3020(org.jsoup.parser.RegressionTest6)": htmlTreeBuilder0.aboveOnStack((org.jsoup.nodes.Element) document42);
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        org.jsoup.nodes.Document document48 = htmlTreeBuilder0.parse("hi!", "hi!", parseErrorList47);
        org.jsoup.nodes.Document document49 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.Token token50 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder51 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element53 = null;
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList56 = htmlTreeBuilder51.parseFragment("", element53, "hi!", parseErrorList55);
        org.jsoup.nodes.Element element57 = null;
        boolean boolean58 = htmlTreeBuilder51.isInActiveFormattingElements(element57);
        boolean boolean60 = htmlTreeBuilder51.inListItemScope("");
        htmlTreeBuilder51.setFosterInserts(true);
        org.jsoup.nodes.Element element64 = htmlTreeBuilder51.getActiveFormattingElement("");
        htmlTreeBuilder51.setFosterInserts(true);
        boolean boolean68 = htmlTreeBuilder51.inListItemScope("");
        java.lang.String str69 = htmlTreeBuilder51.getBaseUri();
        org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element> elementList70 = htmlTreeBuilder51.getStack();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState71 = htmlTreeBuilder51.state();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean72 = htmlTreeBuilder0.process(token50, htmlTreeBuilderState71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(element44);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(document49);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(element64);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertNotNull(elementList70);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState71);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = htmlTreeBuilder0.parseFragment("", element2, "hi!", parseErrorList4);
        htmlTreeBuilder0.clearStackToTableBodyContext();
        boolean boolean7 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.nodes.Document document11 = htmlTreeBuilder0.parse("", "", parseErrorList10);
        org.jsoup.nodes.Element element13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList16 = htmlTreeBuilder0.parseFragment("", element13, "hi!", parseErrorList15);
        htmlTreeBuilder0.generateImpliedEndTags("");
        htmlTreeBuilder0.generateImpliedEndTags("");
        htmlTreeBuilder0.popStackToClose("hi!");
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Element element26 = htmlTreeBuilder0.getActiveFormattingElement("");
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder29 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element31 = null;
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList34 = htmlTreeBuilder29.parseFragment("", element31, "hi!", parseErrorList33);
        htmlTreeBuilder29.framesetOk(false);
        htmlTreeBuilder29.markInsertionMode();
        htmlTreeBuilder29.generateImpliedEndTags();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder39 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element41 = null;
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList44 = htmlTreeBuilder39.parseFragment("", element41, "hi!", parseErrorList43);
        htmlTreeBuilder39.clearStackToTableBodyContext();
        boolean boolean46 = htmlTreeBuilder39.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState47 = htmlTreeBuilder39.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder48 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element50 = null;
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList53 = htmlTreeBuilder48.parseFragment("", element50, "hi!", parseErrorList52);
        htmlTreeBuilder48.clearStackToTableBodyContext();
        boolean boolean55 = htmlTreeBuilder48.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState56 = htmlTreeBuilder48.originalState();
        java.util.List<org.jsoup.parser.Token.Character> characterList57 = htmlTreeBuilder48.getPendingTableCharacters();
        htmlTreeBuilder48.clearStackToTableRowContext();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder59 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element61 = null;
        org.jsoup.parser.ParseErrorList parseErrorList63 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList64 = htmlTreeBuilder59.parseFragment("", element61, "hi!", parseErrorList63);
        htmlTreeBuilder59.clearStackToTableBodyContext();
        boolean boolean66 = htmlTreeBuilder59.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState67 = htmlTreeBuilder59.originalState();
        java.util.List<org.jsoup.parser.Token.Character> characterList68 = htmlTreeBuilder59.getPendingTableCharacters();
        htmlTreeBuilder59.clearStackToTableRowContext();
        java.lang.String[] strArray72 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean73 = htmlTreeBuilder59.inScope(strArray72);
        htmlTreeBuilder48.popStackToClose(strArray72);
        htmlTreeBuilder39.popStackToClose(strArray72);
        htmlTreeBuilder29.popStackToClose(strArray72);
        htmlTreeBuilder0.popStackToClose(strArray72);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element79 = htmlTreeBuilder0.insert("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNull(element26);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState47);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState56);
        org.junit.Assert.assertNotNull(characterList57);
        org.junit.Assert.assertNotNull(nodeList64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState67);
        org.junit.Assert.assertNotNull(characterList68);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = htmlTreeBuilder0.parseFragment("", element2, "hi!", parseErrorList4);
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = htmlTreeBuilder0.isInActiveFormattingElements(element6);
        boolean boolean9 = htmlTreeBuilder0.inListItemScope("");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder11 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList16 = htmlTreeBuilder11.parseFragment("", element13, "hi!", parseErrorList15);
        htmlTreeBuilder11.clearStackToTableBodyContext();
        boolean boolean18 = htmlTreeBuilder11.isFragmentParsing();
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.nodes.Document document22 = htmlTreeBuilder11.parse("", "", parseErrorList21);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList25 = htmlTreeBuilder0.parseFragment("hi!", (org.jsoup.nodes.Element) document22, "", parseErrorList24);
        org.jsoup.nodes.Element element27 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        java.lang.String[] strArray28 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNull(element27);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = htmlTreeBuilder0.parseFragment("", element2, "hi!", parseErrorList4);
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = htmlTreeBuilder0.isInActiveFormattingElements(element6);
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Element element10 = htmlTreeBuilder0.getFromStack("");
        htmlTreeBuilder0.popStackToClose("");
        htmlTreeBuilder0.reconstructFormattingElements();
        org.jsoup.parser.Token.StartTag startTag14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement16 = htmlTreeBuilder0.insertForm(startTag14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = htmlTreeBuilder0.parseFragment("", element2, "hi!", parseErrorList4);
        htmlTreeBuilder0.clearStackToTableBodyContext();
        boolean boolean7 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList12 = htmlTreeBuilder0.parseFragment("hi!", element9, "", parseErrorList11);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder13 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element15 = null;
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList18 = htmlTreeBuilder13.parseFragment("", element15, "hi!", parseErrorList17);
        htmlTreeBuilder13.clearStackToTableBodyContext();
        boolean boolean20 = htmlTreeBuilder13.isFragmentParsing();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.nodes.Document document24 = htmlTreeBuilder13.parse("", "", parseErrorList23);
        htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) document24);
        boolean boolean27 = htmlTreeBuilder0.inScope("");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState28 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder29 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element31 = null;
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList34 = htmlTreeBuilder29.parseFragment("", element31, "hi!", parseErrorList33);
        htmlTreeBuilder29.clearStackToTableBodyContext();
        boolean boolean36 = htmlTreeBuilder29.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState37 = htmlTreeBuilder29.originalState();
        java.util.List<org.jsoup.parser.Token.Character> characterList38 = htmlTreeBuilder29.getPendingTableCharacters();
        htmlTreeBuilder29.framesetOk(false);
        htmlTreeBuilder29.setFosterInserts(true);
        htmlTreeBuilder29.clearStackToTableBodyContext();
        org.jsoup.nodes.Element element44 = null;
        htmlTreeBuilder29.removeFromActiveFormattingElements(element44);
        org.jsoup.nodes.Element element47 = htmlTreeBuilder29.insert("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList50 = null;
        org.jsoup.nodes.Document document51 = htmlTreeBuilder29.parse("", "hi!", parseErrorList50);
        htmlTreeBuilder0.pushActiveFormattingElements((org.jsoup.nodes.Element) document51);
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Element element55 = htmlTreeBuilder0.insert("hi!");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState28);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState37);
        org.junit.Assert.assertNotNull(characterList38);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertNotNull(element55);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = htmlTreeBuilder0.parseFragment("", element2, "hi!", parseErrorList4);
        htmlTreeBuilder0.clearStackToTableBodyContext();
        boolean boolean7 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element11 = null;
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = htmlTreeBuilder9.parseFragment("", element11, "hi!", parseErrorList13);
        htmlTreeBuilder9.clearStackToTableBodyContext();
        boolean boolean16 = htmlTreeBuilder9.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState17 = htmlTreeBuilder9.originalState();
        java.util.List<org.jsoup.parser.Token.Character> characterList18 = htmlTreeBuilder9.getPendingTableCharacters();
        htmlTreeBuilder9.clearStackToTableRowContext();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder20 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element22 = null;
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList25 = htmlTreeBuilder20.parseFragment("", element22, "hi!", parseErrorList24);
        htmlTreeBuilder20.clearStackToTableBodyContext();
        boolean boolean27 = htmlTreeBuilder20.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState28 = htmlTreeBuilder20.originalState();
        java.util.List<org.jsoup.parser.Token.Character> characterList29 = htmlTreeBuilder20.getPendingTableCharacters();
        htmlTreeBuilder20.clearStackToTableRowContext();
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean34 = htmlTreeBuilder20.inScope(strArray33);
        htmlTreeBuilder9.popStackToClose(strArray33);
        htmlTreeBuilder0.popStackToClose(strArray33);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder37 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element39 = null;
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList42 = htmlTreeBuilder37.parseFragment("", element39, "hi!", parseErrorList41);
        htmlTreeBuilder37.clearStackToTableBodyContext();
        boolean boolean44 = htmlTreeBuilder37.isFragmentParsing();
        org.jsoup.nodes.Element element46 = null;
        org.jsoup.parser.ParseErrorList parseErrorList48 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList49 = htmlTreeBuilder37.parseFragment("hi!", element46, "", parseErrorList48);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder50 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element52 = null;
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList55 = htmlTreeBuilder50.parseFragment("", element52, "hi!", parseErrorList54);
        htmlTreeBuilder50.clearStackToTableBodyContext();
        boolean boolean57 = htmlTreeBuilder50.isFragmentParsing();
        org.jsoup.parser.ParseErrorList parseErrorList60 = null;
        org.jsoup.nodes.Document document61 = htmlTreeBuilder50.parse("", "", parseErrorList60);
        htmlTreeBuilder37.insertInFosterParent((org.jsoup.nodes.Node) document61);
        htmlTreeBuilder0.push((org.jsoup.nodes.Element) document61);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder65 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element67 = null;
        org.jsoup.parser.ParseErrorList parseErrorList69 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList70 = htmlTreeBuilder65.parseFragment("", element67, "hi!", parseErrorList69);
        htmlTreeBuilder65.clearStackToTableBodyContext();
        boolean boolean72 = htmlTreeBuilder65.isFragmentParsing();
        org.jsoup.nodes.Element element74 = null;
        org.jsoup.parser.ParseErrorList parseErrorList76 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList77 = htmlTreeBuilder65.parseFragment("hi!", element74, "", parseErrorList76);
        boolean boolean79 = htmlTreeBuilder65.inListItemScope("hi!");
        htmlTreeBuilder65.reconstructFormattingElements();
        org.jsoup.nodes.Document document81 = htmlTreeBuilder65.getDocument();
        org.jsoup.parser.ParseErrorList parseErrorList83 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList84 = htmlTreeBuilder0.parseFragment("hi!", (org.jsoup.nodes.Element) document81, "hi!", parseErrorList83);
        htmlTreeBuilder0.setFosterInserts(false);
        htmlTreeBuilder0.popStackToClose("hi!");
        org.jsoup.nodes.Element element90 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState8);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState17);
        org.junit.Assert.assertNotNull(characterList18);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState28);
        org.junit.Assert.assertNotNull(characterList29);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertNotNull(nodeList55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertNotNull(nodeList70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(nodeList77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(document81);
        org.junit.Assert.assertNotNull(nodeList84);
        org.junit.Assert.assertNull(element90);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = htmlTreeBuilder0.parseFragment("", element2, "hi!", parseErrorList4);
        htmlTreeBuilder0.clearStackToTableBodyContext();
        boolean boolean7 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.nodes.Document document11 = htmlTreeBuilder0.parse("", "", parseErrorList10);
        boolean boolean13 = htmlTreeBuilder0.inScope("hi!");
        htmlTreeBuilder0.clearStackToTableRowContext();
        java.lang.String str15 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder16 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element18 = null;
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList21 = htmlTreeBuilder16.parseFragment("", element18, "hi!", parseErrorList20);
        htmlTreeBuilder16.clearStackToTableBodyContext();
        boolean boolean23 = htmlTreeBuilder16.isFragmentParsing();
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.nodes.Document document27 = htmlTreeBuilder16.parse("", "", parseErrorList26);
        org.jsoup.nodes.Element element29 = null;
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList32 = htmlTreeBuilder16.parseFragment("", element29, "hi!", parseErrorList31);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder33 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element35 = null;
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList38 = htmlTreeBuilder33.parseFragment("", element35, "hi!", parseErrorList37);
        htmlTreeBuilder33.clearStackToTableBodyContext();
        boolean boolean40 = htmlTreeBuilder33.isFragmentParsing();
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.nodes.Document document44 = htmlTreeBuilder33.parse("", "", parseErrorList43);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder45 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element47 = null;
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList50 = htmlTreeBuilder45.parseFragment("", element47, "hi!", parseErrorList49);
        org.jsoup.nodes.Element element51 = null;
        boolean boolean52 = htmlTreeBuilder45.isInActiveFormattingElements(element51);
        boolean boolean54 = htmlTreeBuilder45.inListItemScope("");
        org.jsoup.parser.ParseErrorList parseErrorList57 = null;
        org.jsoup.nodes.Document document58 = htmlTreeBuilder45.parse("", "", parseErrorList57);
        boolean boolean59 = htmlTreeBuilder33.isInActiveFormattingElements((org.jsoup.nodes.Element) document58);
        org.jsoup.nodes.Element element60 = null; // flaky "2) test3026(org.jsoup.parser.RegressionTest6)": htmlTreeBuilder16.aboveOnStack((org.jsoup.nodes.Element) document58);
        org.jsoup.parser.ParseErrorList parseErrorList63 = null;
        org.jsoup.nodes.Document document64 = htmlTreeBuilder16.parse("hi!", "hi!", parseErrorList63);
        org.jsoup.nodes.Element element66 = htmlTreeBuilder16.getFromStack("hi!");
        org.jsoup.nodes.Element element67 = htmlTreeBuilder16.getHeadElement();
        boolean boolean68 = htmlTreeBuilder0.removeFromStack(element67);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder69 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element71 = null;
        org.jsoup.parser.ParseErrorList parseErrorList73 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList74 = htmlTreeBuilder69.parseFragment("", element71, "hi!", parseErrorList73);
        org.jsoup.nodes.Element element75 = null;
        boolean boolean76 = htmlTreeBuilder69.isInActiveFormattingElements(element75);
        boolean boolean78 = htmlTreeBuilder69.inListItemScope("");
        org.jsoup.parser.ParseErrorList parseErrorList81 = null;
        org.jsoup.nodes.Document document82 = htmlTreeBuilder69.parse("", "", parseErrorList81);
        htmlTreeBuilder69.markInsertionMode();
        org.jsoup.nodes.Element element84 = htmlTreeBuilder69.pop();
        org.jsoup.nodes.Document document85 = htmlTreeBuilder69.getDocument();
        java.lang.String str86 = htmlTreeBuilder69.toString();
        htmlTreeBuilder69.insertMarkerToFormattingElements();
        htmlTreeBuilder69.newPendingTableCharacters();
        org.jsoup.nodes.Element element89 = htmlTreeBuilder69.getHeadElement();
        htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) element89);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(element60);
        org.junit.Assert.assertNotNull(document64);
        org.junit.Assert.assertNull(element66);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(nodeList74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(document82);
        org.junit.Assert.assertNotNull(element84);
        org.junit.Assert.assertNotNull(document85);
        org.junit.Assert.assertNotNull(element89);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = htmlTreeBuilder0.parseFragment("", element2, "hi!", parseErrorList4);
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = htmlTreeBuilder0.isInActiveFormattingElements(element6);
        boolean boolean9 = htmlTreeBuilder0.inListItemScope("");
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.nodes.Element element13 = htmlTreeBuilder0.getActiveFormattingElement("");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder14 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element16 = null;
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = htmlTreeBuilder14.parseFragment("", element16, "hi!", parseErrorList18);
        htmlTreeBuilder14.clearStackToTableBodyContext();
        boolean boolean21 = htmlTreeBuilder14.isFragmentParsing();
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.nodes.Document document25 = htmlTreeBuilder14.parse("", "", parseErrorList24);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder26 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element28 = null;
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList31 = htmlTreeBuilder26.parseFragment("", element28, "hi!", parseErrorList30);
        org.jsoup.nodes.Element element32 = null;
        boolean boolean33 = htmlTreeBuilder26.isInActiveFormattingElements(element32);
        boolean boolean35 = htmlTreeBuilder26.inListItemScope("");
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.nodes.Document document39 = htmlTreeBuilder26.parse("", "", parseErrorList38);
        boolean boolean40 = htmlTreeBuilder14.isInActiveFormattingElements((org.jsoup.nodes.Element) document39);
        org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element> elementList41 = htmlTreeBuilder14.getStack();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder42 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element44 = null;
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList47 = htmlTreeBuilder42.parseFragment("", element44, "hi!", parseErrorList46);
        htmlTreeBuilder42.clearStackToTableBodyContext();
        boolean boolean49 = htmlTreeBuilder42.isFragmentParsing();
        org.jsoup.nodes.Element element51 = null;
        org.jsoup.parser.ParseErrorList parseErrorList53 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList54 = htmlTreeBuilder42.parseFragment("hi!", element51, "", parseErrorList53);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder55 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element57 = null;
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList60 = htmlTreeBuilder55.parseFragment("", element57, "hi!", parseErrorList59);
        htmlTreeBuilder55.clearStackToTableBodyContext();
        boolean boolean62 = htmlTreeBuilder55.isFragmentParsing();
        org.jsoup.parser.ParseErrorList parseErrorList65 = null;
        org.jsoup.nodes.Document document66 = htmlTreeBuilder55.parse("", "", parseErrorList65);
        htmlTreeBuilder42.insertInFosterParent((org.jsoup.nodes.Node) document66);
        boolean boolean68 = htmlTreeBuilder14.isInActiveFormattingElements((org.jsoup.nodes.Element) document66);
        java.util.List<org.jsoup.parser.Token.Character> characterList69 = htmlTreeBuilder14.getPendingTableCharacters();
        htmlTreeBuilder0.setPendingTableCharacters(characterList69);
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.resetInsertionMode();
        htmlTreeBuilder0.reconstructFormattingElements();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(elementList41);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(nodeList54);
        org.junit.Assert.assertNotNull(nodeList60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(document66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(characterList69);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = htmlTreeBuilder0.parseFragment("", element2, "hi!", parseErrorList4);
        htmlTreeBuilder0.clearStackToTableBodyContext();
        boolean boolean7 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.nodes.Document document11 = htmlTreeBuilder0.parse("", "", parseErrorList10);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder12 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList17 = htmlTreeBuilder12.parseFragment("", element14, "hi!", parseErrorList16);
        org.jsoup.nodes.Element element18 = null;
        boolean boolean19 = htmlTreeBuilder12.isInActiveFormattingElements(element18);
        boolean boolean21 = htmlTreeBuilder12.inListItemScope("");
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.nodes.Document document25 = htmlTreeBuilder12.parse("", "", parseErrorList24);
        boolean boolean26 = htmlTreeBuilder0.isInActiveFormattingElements((org.jsoup.nodes.Element) document25);
        org.jsoup.nodes.FormElement formElement27 = null;
        htmlTreeBuilder0.setFormElement(formElement27);
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.nodes.Element element31 = htmlTreeBuilder0.pop();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder32 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element34 = null;
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList37 = htmlTreeBuilder32.parseFragment("", element34, "hi!", parseErrorList36);
        org.jsoup.nodes.Element element38 = null;
        boolean boolean39 = htmlTreeBuilder32.isInActiveFormattingElements(element38);
        boolean boolean41 = htmlTreeBuilder32.inListItemScope("");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder43 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element45 = null;
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList48 = htmlTreeBuilder43.parseFragment("", element45, "hi!", parseErrorList47);
        htmlTreeBuilder43.clearStackToTableBodyContext();
        boolean boolean50 = htmlTreeBuilder43.isFragmentParsing();
        org.jsoup.parser.ParseErrorList parseErrorList53 = null;
        org.jsoup.nodes.Document document54 = htmlTreeBuilder43.parse("", "", parseErrorList53);
        org.jsoup.parser.ParseErrorList parseErrorList56 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList57 = htmlTreeBuilder32.parseFragment("hi!", (org.jsoup.nodes.Element) document54, "", parseErrorList56);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder58 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element60 = null;
        org.jsoup.parser.ParseErrorList parseErrorList62 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList63 = htmlTreeBuilder58.parseFragment("", element60, "hi!", parseErrorList62);
        org.jsoup.nodes.Element element64 = null;
        boolean boolean65 = htmlTreeBuilder58.isInActiveFormattingElements(element64);
        org.jsoup.nodes.FormElement formElement66 = null;
        htmlTreeBuilder58.setFormElement(formElement66);
        org.jsoup.nodes.Element element68 = htmlTreeBuilder58.pop();
        org.jsoup.nodes.Element element69 = null; // flaky "3) test3028(org.jsoup.parser.RegressionTest6)": htmlTreeBuilder32.aboveOnStack(element68);
        boolean boolean70 = htmlTreeBuilder0.removeFromStack(element69);
        htmlTreeBuilder0.clearStackToTableContext();
        java.lang.String str72 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element73 = htmlTreeBuilder0.getHeadElement();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNotNull(nodeList63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNull(element69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(element73);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = htmlTreeBuilder0.parseFragment("", element2, "hi!", parseErrorList4);
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = htmlTreeBuilder0.isInActiveFormattingElements(element6);
        boolean boolean9 = htmlTreeBuilder0.inListItemScope("");
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.nodes.Element element13 = htmlTreeBuilder0.getActiveFormattingElement("");
        htmlTreeBuilder0.clearStackToTableBodyContext();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState15 = htmlTreeBuilder0.state();
        boolean boolean16 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean17 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        htmlTreeBuilder0.reconstructFormattingElements();
        htmlTreeBuilder0.popStackToBefore("");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = htmlTreeBuilder0.parseFragment("", element2, "hi!", parseErrorList4);
        htmlTreeBuilder0.clearStackToTableBodyContext();
        boolean boolean7 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element11 = null;
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = htmlTreeBuilder9.parseFragment("", element11, "hi!", parseErrorList13);
        htmlTreeBuilder9.clearStackToTableBodyContext();
        boolean boolean16 = htmlTreeBuilder9.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState17 = htmlTreeBuilder9.originalState();
        java.util.List<org.jsoup.parser.Token.Character> characterList18 = htmlTreeBuilder9.getPendingTableCharacters();
        htmlTreeBuilder9.clearStackToTableRowContext();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder20 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element22 = null;
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList25 = htmlTreeBuilder20.parseFragment("", element22, "hi!", parseErrorList24);
        htmlTreeBuilder20.clearStackToTableBodyContext();
        boolean boolean27 = htmlTreeBuilder20.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState28 = htmlTreeBuilder20.originalState();
        java.util.List<org.jsoup.parser.Token.Character> characterList29 = htmlTreeBuilder20.getPendingTableCharacters();
        htmlTreeBuilder20.clearStackToTableRowContext();
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean34 = htmlTreeBuilder20.inScope(strArray33);
        htmlTreeBuilder9.popStackToClose(strArray33);
        htmlTreeBuilder0.popStackToClose(strArray33);
        org.jsoup.nodes.Document document37 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder38 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element40 = null;
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList43 = htmlTreeBuilder38.parseFragment("", element40, "hi!", parseErrorList42);
        org.jsoup.nodes.Element element44 = null;
        boolean boolean45 = htmlTreeBuilder38.isInActiveFormattingElements(element44);
        boolean boolean47 = htmlTreeBuilder38.inListItemScope("");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder49 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element51 = null;
        org.jsoup.parser.ParseErrorList parseErrorList53 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList54 = htmlTreeBuilder49.parseFragment("", element51, "hi!", parseErrorList53);
        htmlTreeBuilder49.clearStackToTableBodyContext();
        boolean boolean56 = htmlTreeBuilder49.isFragmentParsing();
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        org.jsoup.nodes.Document document60 = htmlTreeBuilder49.parse("", "", parseErrorList59);
        org.jsoup.parser.ParseErrorList parseErrorList62 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList63 = htmlTreeBuilder38.parseFragment("hi!", (org.jsoup.nodes.Element) document60, "", parseErrorList62);
        boolean boolean65 = htmlTreeBuilder38.inListItemScope("");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder66 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element68 = null;
        org.jsoup.parser.ParseErrorList parseErrorList70 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList71 = htmlTreeBuilder66.parseFragment("", element68, "hi!", parseErrorList70);
        org.jsoup.nodes.Element element72 = null;
        boolean boolean73 = htmlTreeBuilder66.isInActiveFormattingElements(element72);
        boolean boolean75 = htmlTreeBuilder66.inListItemScope("");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder77 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element79 = null;
        org.jsoup.parser.ParseErrorList parseErrorList81 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList82 = htmlTreeBuilder77.parseFragment("", element79, "hi!", parseErrorList81);
        htmlTreeBuilder77.clearStackToTableBodyContext();
        boolean boolean84 = htmlTreeBuilder77.isFragmentParsing();
        org.jsoup.parser.ParseErrorList parseErrorList87 = null;
        org.jsoup.nodes.Document document88 = htmlTreeBuilder77.parse("", "", parseErrorList87);
        org.jsoup.parser.ParseErrorList parseErrorList90 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList91 = htmlTreeBuilder66.parseFragment("hi!", (org.jsoup.nodes.Element) document88, "", parseErrorList90);
        htmlTreeBuilder38.insert((org.jsoup.nodes.Element) document88);
        boolean boolean93 = htmlTreeBuilder0.onStack((org.jsoup.nodes.Element) document88);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean95 = htmlTreeBuilder0.inScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Should not be reachable");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState8);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState17);
        org.junit.Assert.assertNotNull(characterList18);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState28);
        org.junit.Assert.assertNotNull(characterList29);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(nodeList54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertNotNull(nodeList63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(nodeList71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(nodeList82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(document88);
        org.junit.Assert.assertNotNull(nodeList91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = htmlTreeBuilder0.parseFragment("", element2, "hi!", parseErrorList4);
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = htmlTreeBuilder0.isInActiveFormattingElements(element6);
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Element element10 = htmlTreeBuilder0.getFromStack("");
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder12 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList17 = htmlTreeBuilder12.parseFragment("", element14, "hi!", parseErrorList16);
        htmlTreeBuilder12.clearStackToTableBodyContext();
        boolean boolean19 = htmlTreeBuilder12.isFragmentParsing();
        org.jsoup.nodes.Element element21 = null;
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList24 = htmlTreeBuilder12.parseFragment("hi!", element21, "", parseErrorList23);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder25 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element27 = null;
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList30 = htmlTreeBuilder25.parseFragment("", element27, "hi!", parseErrorList29);
        htmlTreeBuilder25.clearStackToTableBodyContext();
        boolean boolean32 = htmlTreeBuilder25.isFragmentParsing();
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.nodes.Document document36 = htmlTreeBuilder25.parse("", "", parseErrorList35);
        htmlTreeBuilder12.insertInFosterParent((org.jsoup.nodes.Node) document36);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder38 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element40 = null;
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList43 = htmlTreeBuilder38.parseFragment("", element40, "hi!", parseErrorList42);
        htmlTreeBuilder38.clearStackToTableBodyContext();
        boolean boolean45 = htmlTreeBuilder38.isFragmentParsing();
        org.jsoup.nodes.Element element47 = null;
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList50 = htmlTreeBuilder38.parseFragment("hi!", element47, "", parseErrorList49);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder51 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element53 = null;
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList56 = htmlTreeBuilder51.parseFragment("", element53, "hi!", parseErrorList55);
        htmlTreeBuilder51.clearStackToTableBodyContext();
        boolean boolean58 = htmlTreeBuilder51.isFragmentParsing();
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        org.jsoup.nodes.Document document62 = htmlTreeBuilder51.parse("", "", parseErrorList61);
        htmlTreeBuilder38.insertInFosterParent((org.jsoup.nodes.Node) document62);
        boolean boolean64 = htmlTreeBuilder12.isInActiveFormattingElements((org.jsoup.nodes.Element) document62);
        org.jsoup.nodes.Element element66 = htmlTreeBuilder12.getFromStack("hi!");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder67 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element69 = null;
        org.jsoup.parser.ParseErrorList parseErrorList71 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList72 = htmlTreeBuilder67.parseFragment("", element69, "hi!", parseErrorList71);
        htmlTreeBuilder67.clearStackToTableContext();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder74 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element76 = null;
        org.jsoup.parser.ParseErrorList parseErrorList78 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList79 = htmlTreeBuilder74.parseFragment("", element76, "hi!", parseErrorList78);
        org.jsoup.nodes.Element element80 = null;
        boolean boolean81 = htmlTreeBuilder74.isInActiveFormattingElements(element80);
        org.jsoup.nodes.FormElement formElement82 = null;
        htmlTreeBuilder74.setFormElement(formElement82);
        org.jsoup.parser.ParseErrorList parseErrorList86 = null;
        org.jsoup.nodes.Document document87 = htmlTreeBuilder74.parse("hi!", "hi!", parseErrorList86);
        org.jsoup.parser.ParseErrorList parseErrorList90 = null;
        org.jsoup.nodes.Document document91 = htmlTreeBuilder74.parse("", "", parseErrorList90);
        htmlTreeBuilder67.pushActiveFormattingElements((org.jsoup.nodes.Element) document91);
        htmlTreeBuilder12.pushActiveFormattingElements((org.jsoup.nodes.Element) document91);
        htmlTreeBuilder0.insert((org.jsoup.nodes.Element) document91);
        org.jsoup.nodes.Element element96 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(document62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(element66);
        org.junit.Assert.assertNotNull(nodeList72);
        org.junit.Assert.assertNotNull(nodeList79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(document87);
        org.junit.Assert.assertNotNull(document91);
        org.junit.Assert.assertNull(element96);
    }
}
