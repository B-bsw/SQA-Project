package org.jsoup.parser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag3 = tokeniser2.tagPending;
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.tagPending;
        org.jsoup.parser.Token.Tag tag6 = tokeniser2.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser9.getState();
        java.lang.StringBuilder stringBuilder11 = tokeniser9.dataBuffer;
        org.jsoup.parser.Token.Tag tag13 = tokeniser9.createTagPending(true);
        tokeniser2.emit((org.jsoup.parser.Token) tag13);
        java.lang.StringBuilder stringBuilder15 = tokeniser2.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader16, parseErrorList17);
        org.jsoup.parser.TokeniserState tokeniserState19 = tokeniser18.getState();
        org.jsoup.parser.Token.Comment comment20 = tokeniser18.commentPending;
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader21, parseErrorList22);
        org.jsoup.parser.TokeniserState tokeniserState24 = tokeniser23.getState();
        org.jsoup.parser.Token.Comment comment25 = tokeniser23.commentPending;
        tokeniser23.createCommentPending();
        org.jsoup.parser.Token.Comment comment27 = tokeniser23.commentPending;
        tokeniser18.commentPending = comment27;
        tokeniser2.commentPending = comment27;
        org.jsoup.parser.Token.Tag tag31 = tokeniser2.createTagPending(true);
        org.jsoup.parser.Token.Doctype doctype32 = null;
        tokeniser2.doctypePending = doctype32;
        tokeniser2.emit("");
        tokeniser2.emit('a');
        org.junit.Assert.assertNull(tag3);
        org.junit.Assert.assertNull(tag4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNull(stringBuilder11);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNull(stringBuilder15);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNull(comment20);
        org.junit.Assert.assertNotNull(tokeniserState24);
        org.junit.Assert.assertNull(comment25);
        org.junit.Assert.assertNotNull(comment27);
        org.junit.Assert.assertNotNull(tag31);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.jsoup.parser.Parser parser1 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.Parser parser3 = parser1.setTrackErrors((int) (short) -1);
        org.jsoup.nodes.Document document6 = parser1.parseInput("hi!", "");
        java.util.List<org.jsoup.parser.ParseError> parseErrorList7 = parser1.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList8 = parser1.getErrors();
        org.jsoup.nodes.Document document11 = parser1.parseInput("", "");
        org.jsoup.parser.TreeBuilder treeBuilder12 = parser1.getTreeBuilder();
        org.jsoup.parser.Parser parser13 = new org.jsoup.parser.Parser(treeBuilder12);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList14 = parser13.getErrors();
        org.jsoup.nodes.Document document17 = parser13.parseInput("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = org.jsoup.parser.Parser.parseFragment("hi!", (org.jsoup.nodes.Element) document17, "");
        org.junit.Assert.assertNotNull(parser1);
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(parseErrorList7);
        org.junit.Assert.assertNotNull(parseErrorList8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(treeBuilder12);
        org.junit.Assert.assertNull(parseErrorList14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        org.jsoup.parser.Token.Comment comment4 = tokeniser2.commentPending;
        org.jsoup.parser.TokeniserState tokeniserState5 = null;
        tokeniser2.transition(tokeniserState5);
        java.lang.StringBuilder stringBuilder7 = tokeniser2.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState8 = tokeniser2.getState();
        org.jsoup.parser.Token.Tag tag9 = tokeniser2.tagPending;
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList11);
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser12.getState();
        tokeniser2.transition(tokeniserState13);
        boolean boolean15 = tokeniser2.isAppropriateEndTagToken();
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader16, parseErrorList17);
        org.jsoup.parser.TokeniserState tokeniserState19 = tokeniser18.getState();
        java.lang.StringBuilder stringBuilder20 = null;
        tokeniser18.dataBuffer = stringBuilder20;
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader22, parseErrorList23);
        org.jsoup.parser.TokeniserState tokeniserState25 = tokeniser24.getState();
        java.lang.StringBuilder stringBuilder26 = tokeniser24.dataBuffer;
        org.jsoup.parser.Token.Tag tag28 = tokeniser24.createTagPending(true);
        tokeniser18.emit((org.jsoup.parser.Token) tag28);
        java.lang.StringBuilder stringBuilder30 = null;
        tokeniser18.dataBuffer = stringBuilder30;
        org.jsoup.parser.CharacterReader characterReader32 = null;
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader32, parseErrorList33);
        org.jsoup.parser.Token.Tag tag35 = tokeniser34.tagPending;
        org.jsoup.parser.Token.Tag tag36 = tokeniser34.tagPending;
        org.jsoup.parser.Token.Tag tag38 = tokeniser34.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader39 = null;
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader39, parseErrorList40);
        org.jsoup.parser.TokeniserState tokeniserState42 = tokeniser41.getState();
        java.lang.StringBuilder stringBuilder43 = tokeniser41.dataBuffer;
        org.jsoup.parser.Token.Tag tag45 = tokeniser41.createTagPending(true);
        tokeniser34.emit((org.jsoup.parser.Token) tag45);
        java.lang.String str47 = tokeniser34.appropriateEndTagName();
        tokeniser34.createTempBuffer();
        tokeniser34.createDoctypePending();
        tokeniser34.emit('a');
        org.jsoup.parser.Token.Doctype doctype52 = tokeniser34.doctypePending;
        tokeniser18.doctypePending = doctype52;
        tokeniser2.doctypePending = doctype52;
        org.jsoup.parser.CharacterReader characterReader55 = null;
        org.jsoup.parser.ParseErrorList parseErrorList56 = null;
        org.jsoup.parser.Tokeniser tokeniser57 = new org.jsoup.parser.Tokeniser(characterReader55, parseErrorList56);
        org.jsoup.parser.Token.Tag tag58 = tokeniser57.tagPending;
        org.jsoup.parser.Token.Tag tag59 = tokeniser57.tagPending;
        org.jsoup.parser.Token.Tag tag61 = tokeniser57.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader62 = null;
        org.jsoup.parser.ParseErrorList parseErrorList63 = null;
        org.jsoup.parser.Tokeniser tokeniser64 = new org.jsoup.parser.Tokeniser(characterReader62, parseErrorList63);
        org.jsoup.parser.TokeniserState tokeniserState65 = tokeniser64.getState();
        java.lang.StringBuilder stringBuilder66 = tokeniser64.dataBuffer;
        org.jsoup.parser.Token.Tag tag68 = tokeniser64.createTagPending(true);
        tokeniser57.emit((org.jsoup.parser.Token) tag68);
        java.lang.StringBuilder stringBuilder70 = tokeniser57.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState71 = tokeniser57.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNull(comment4);
        org.junit.Assert.assertNull(stringBuilder7);
        org.junit.Assert.assertNull(tokeniserState8);
        org.junit.Assert.assertNull(tag9);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(tokeniserState25);
        org.junit.Assert.assertNull(stringBuilder26);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNull(tag35);
        org.junit.Assert.assertNull(tag36);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(tokeniserState42);
        org.junit.Assert.assertNull(stringBuilder43);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(doctype52);
        org.junit.Assert.assertNull(tag58);
        org.junit.Assert.assertNull(tag59);
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertNotNull(tokeniserState65);
        org.junit.Assert.assertNull(stringBuilder66);
        org.junit.Assert.assertNotNull(tag68);
        org.junit.Assert.assertNull(stringBuilder70);
        org.junit.Assert.assertNotNull(tokeniserState71);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag3 = tokeniser2.tagPending;
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.tagPending;
        org.jsoup.parser.Token.Tag tag6 = tokeniser2.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser9.getState();
        java.lang.StringBuilder stringBuilder11 = tokeniser9.dataBuffer;
        org.jsoup.parser.Token.Tag tag13 = tokeniser9.createTagPending(true);
        tokeniser2.emit((org.jsoup.parser.Token) tag13);
        org.jsoup.parser.Token.Doctype doctype15 = null;
        tokeniser2.doctypePending = doctype15;
        org.jsoup.parser.Token.Doctype doctype17 = null;
        tokeniser2.doctypePending = doctype17;
        org.jsoup.parser.Token.Doctype doctype19 = tokeniser2.doctypePending;
        org.jsoup.parser.Token token20 = tokeniser2.read();
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader21, parseErrorList22);
        org.jsoup.parser.Token.Tag tag24 = tokeniser23.tagPending;
        org.jsoup.parser.Token.Tag tag25 = tokeniser23.tagPending;
        org.jsoup.parser.Token.Tag tag27 = tokeniser23.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader28, parseErrorList29);
        org.jsoup.parser.TokeniserState tokeniserState31 = tokeniser30.getState();
        java.lang.StringBuilder stringBuilder32 = tokeniser30.dataBuffer;
        org.jsoup.parser.Token.Tag tag34 = tokeniser30.createTagPending(true);
        tokeniser23.emit((org.jsoup.parser.Token) tag34);
        java.lang.String str36 = tokeniser23.appropriateEndTagName();
        tokeniser23.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.Tokeniser tokeniser40 = new org.jsoup.parser.Tokeniser(characterReader38, parseErrorList39);
        org.jsoup.parser.Token.Tag tag41 = tokeniser40.tagPending;
        org.jsoup.parser.Token.Tag tag42 = tokeniser40.tagPending;
        org.jsoup.parser.Token.Tag tag44 = tokeniser40.createTagPending(false);
        tokeniser23.tagPending = tag44;
        tokeniser23.createDoctypePending();
        java.lang.StringBuilder stringBuilder47 = tokeniser23.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder47;
        tokeniser2.emit(' ');
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag3);
        org.junit.Assert.assertNull(tag4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNull(stringBuilder11);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNull(doctype19);
        org.junit.Assert.assertNotNull(token20);
        org.junit.Assert.assertNull(tag24);
        org.junit.Assert.assertNull(tag25);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(tokeniserState31);
        org.junit.Assert.assertNull(stringBuilder32);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(tag41);
        org.junit.Assert.assertNull(tag42);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(stringBuilder47);
        org.junit.Assert.assertEquals(stringBuilder47.toString(), "");
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag3 = tokeniser2.tagPending;
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.tagPending;
        org.jsoup.parser.Token.Tag tag6 = tokeniser2.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser9.getState();
        java.lang.StringBuilder stringBuilder11 = tokeniser9.dataBuffer;
        org.jsoup.parser.Token.Tag tag13 = tokeniser9.createTagPending(true);
        tokeniser2.emit((org.jsoup.parser.Token) tag13);
        java.lang.String str15 = tokeniser2.appropriateEndTagName();
        tokeniser2.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader17, parseErrorList18);
        org.jsoup.parser.Token.Tag tag20 = tokeniser19.tagPending;
        org.jsoup.parser.Token.Tag tag21 = tokeniser19.tagPending;
        org.jsoup.parser.Token.Tag tag23 = tokeniser19.createTagPending(false);
        tokeniser2.tagPending = tag23;
        tokeniser2.createDoctypePending();
        java.lang.String str26 = tokeniser2.appropriateEndTagName();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader28, parseErrorList29);
        org.jsoup.parser.Token.Tag tag31 = tokeniser30.tagPending;
        org.jsoup.parser.Token.Tag tag32 = tokeniser30.tagPending;
        org.jsoup.parser.Token.Tag tag34 = tokeniser30.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader35, parseErrorList36);
        org.jsoup.parser.TokeniserState tokeniserState38 = tokeniser37.getState();
        java.lang.StringBuilder stringBuilder39 = tokeniser37.dataBuffer;
        org.jsoup.parser.Token.Tag tag41 = tokeniser37.createTagPending(true);
        tokeniser30.emit((org.jsoup.parser.Token) tag41);
        java.lang.String str43 = tokeniser30.appropriateEndTagName();
        tokeniser30.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader45 = null;
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        org.jsoup.parser.Tokeniser tokeniser47 = new org.jsoup.parser.Tokeniser(characterReader45, parseErrorList46);
        org.jsoup.parser.Token.Tag tag48 = tokeniser47.tagPending;
        org.jsoup.parser.Token.Tag tag49 = tokeniser47.tagPending;
        org.jsoup.parser.Token.Tag tag51 = tokeniser47.createTagPending(false);
        tokeniser30.tagPending = tag51;
        tokeniser30.createDoctypePending();
        java.lang.StringBuilder stringBuilder54 = tokeniser30.dataBuffer;
        org.jsoup.parser.Token.Doctype doctype55 = tokeniser30.doctypePending;
        boolean boolean56 = tokeniser30.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag58 = tokeniser30.createTagPending(true);
        tokeniser2.tagPending = tag58;
        org.jsoup.parser.CharacterReader characterReader60 = null;
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        org.jsoup.parser.Tokeniser tokeniser62 = new org.jsoup.parser.Tokeniser(characterReader60, parseErrorList61);
        org.jsoup.parser.TokeniserState tokeniserState63 = tokeniser62.getState();
        org.jsoup.parser.Token.Comment comment64 = null;
        tokeniser62.commentPending = comment64;
        org.jsoup.parser.Token.Tag tag66 = tokeniser62.tagPending;
        org.jsoup.parser.Token.Tag tag68 = tokeniser62.createTagPending(false);
        tokeniser2.tagPending = tag68;
        org.jsoup.parser.Token token70 = tokeniser2.read();
        tokeniser2.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader72 = null;
        org.jsoup.parser.ParseErrorList parseErrorList73 = null;
        org.jsoup.parser.Tokeniser tokeniser74 = new org.jsoup.parser.Tokeniser(characterReader72, parseErrorList73);
        org.jsoup.parser.TokeniserState tokeniserState75 = tokeniser74.getState();
        java.lang.StringBuilder stringBuilder76 = tokeniser74.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader77 = null;
        org.jsoup.parser.ParseErrorList parseErrorList78 = null;
        org.jsoup.parser.Tokeniser tokeniser79 = new org.jsoup.parser.Tokeniser(characterReader77, parseErrorList78);
        org.jsoup.parser.TokeniserState tokeniserState80 = tokeniser79.getState();
        org.jsoup.parser.Token.Comment comment81 = tokeniser79.commentPending;
        tokeniser79.createCommentPending();
        org.jsoup.parser.Token.Comment comment83 = tokeniser79.commentPending;
        tokeniser74.commentPending = comment83;
        org.jsoup.parser.CharacterReader characterReader85 = null;
        org.jsoup.parser.ParseErrorList parseErrorList86 = null;
        org.jsoup.parser.Tokeniser tokeniser87 = new org.jsoup.parser.Tokeniser(characterReader85, parseErrorList86);
        org.jsoup.parser.TokeniserState tokeniserState88 = tokeniser87.getState();
        java.lang.StringBuilder stringBuilder89 = tokeniser87.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader90 = null;
        org.jsoup.parser.ParseErrorList parseErrorList91 = null;
        org.jsoup.parser.Tokeniser tokeniser92 = new org.jsoup.parser.Tokeniser(characterReader90, parseErrorList91);
        org.jsoup.parser.TokeniserState tokeniserState93 = tokeniser92.getState();
        org.jsoup.parser.Token.Comment comment94 = tokeniser92.commentPending;
        tokeniser92.createCommentPending();
        org.jsoup.parser.Token.Comment comment96 = tokeniser92.commentPending;
        tokeniser87.commentPending = comment96;
        tokeniser74.commentPending = comment96;
        tokeniser2.commentPending = comment96;
        org.junit.Assert.assertNull(tag3);
        org.junit.Assert.assertNull(tag4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNull(stringBuilder11);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(tag20);
        org.junit.Assert.assertNull(tag21);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(tag31);
        org.junit.Assert.assertNull(tag32);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(tokeniserState38);
        org.junit.Assert.assertNull(stringBuilder39);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(tag48);
        org.junit.Assert.assertNull(tag49);
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNotNull(stringBuilder54);
        org.junit.Assert.assertEquals(stringBuilder54.toString(), "");
        org.junit.Assert.assertNotNull(doctype55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertNotNull(tokeniserState63);
        org.junit.Assert.assertNull(tag66);
        org.junit.Assert.assertNotNull(tag68);
        org.junit.Assert.assertNotNull(token70);
        org.junit.Assert.assertNotNull(tokeniserState75);
        org.junit.Assert.assertNull(stringBuilder76);
        org.junit.Assert.assertNotNull(tokeniserState80);
        org.junit.Assert.assertNull(comment81);
        org.junit.Assert.assertNotNull(comment83);
        org.junit.Assert.assertNotNull(tokeniserState88);
        org.junit.Assert.assertNull(stringBuilder89);
        org.junit.Assert.assertNotNull(tokeniserState93);
        org.junit.Assert.assertNull(comment94);
        org.junit.Assert.assertNotNull(comment96);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader5, parseErrorList6);
        org.jsoup.parser.TokeniserState tokeniserState8 = tokeniser7.getState();
        tokeniser2.transition(tokeniserState8);
        org.jsoup.parser.Token.Tag tag11 = tokeniser2.createTagPending(false);
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag3 = tokeniser2.tagPending;
        tokeniser2.emit('4');
        org.jsoup.parser.Token.Comment comment6 = tokeniser2.commentPending;
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Tag tag9 = tokeniser2.createTagPending(true);
        tokeniser2.emitDoctypePending();
        org.jsoup.parser.Token token11 = tokeniser2.read();
        tokeniser2.emit("");
        org.jsoup.parser.Token.Doctype doctype14 = tokeniser2.doctypePending;
        org.junit.Assert.assertNull(tag3);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertNotNull(doctype14);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.Parser parser2 = parser0.setTrackErrors((int) (short) -1);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList3 = parser2.getErrors();
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document7 = parser4.parseInput("", "");
        org.jsoup.parser.TreeBuilder treeBuilder8 = parser4.getTreeBuilder();
        org.jsoup.parser.Parser parser9 = parser2.setTreeBuilder(treeBuilder8);
        org.jsoup.parser.Parser parser11 = parser2.setTrackErrors((int) (byte) 10);
        boolean boolean12 = parser2.isTrackErrors();
        org.jsoup.parser.Parser parser13 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document16 = parser13.parseInput("", "");
        org.jsoup.parser.Parser parser17 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document20 = parser17.parseInput("", "");
        org.jsoup.parser.TreeBuilder treeBuilder21 = parser17.getTreeBuilder();
        org.jsoup.parser.Parser parser22 = parser13.setTreeBuilder(treeBuilder21);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList23 = parser13.getErrors();
        org.jsoup.parser.TreeBuilder treeBuilder24 = parser13.getTreeBuilder();
        org.jsoup.parser.Parser parser25 = parser2.setTreeBuilder(treeBuilder24);
        org.jsoup.parser.Parser parser26 = new org.jsoup.parser.Parser(treeBuilder24);
        org.jsoup.parser.Parser parser27 = new org.jsoup.parser.Parser(treeBuilder24);
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNull(parseErrorList3);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(treeBuilder8);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(treeBuilder21);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(parseErrorList23);
        org.junit.Assert.assertNotNull(treeBuilder24);
        org.junit.Assert.assertNotNull(parser25);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        java.lang.StringBuilder stringBuilder4 = tokeniser2.dataBuffer;
        org.jsoup.parser.Token.Tag tag6 = tokeniser2.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser9.getState();
        java.lang.StringBuilder stringBuilder11 = tokeniser9.dataBuffer;
        org.jsoup.parser.Token.Tag tag13 = tokeniser9.createTagPending(true);
        tokeniser2.emit((org.jsoup.parser.Token) tag13);
        boolean boolean15 = tokeniser2.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag16 = tokeniser2.tagPending;
        org.jsoup.parser.Token token17 = tokeniser2.read();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Tag tag19 = tokeniser2.tagPending;
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader20, parseErrorList21);
        org.jsoup.parser.TokeniserState tokeniserState23 = tokeniser22.getState();
        org.jsoup.parser.Token.Comment comment24 = tokeniser22.commentPending;
        tokeniser22.createCommentPending();
        org.jsoup.parser.Token.Comment comment26 = tokeniser22.commentPending;
        tokeniser22.createTempBuffer();
        boolean boolean28 = tokeniser22.isAppropriateEndTagToken();
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader29, parseErrorList30);
        org.jsoup.parser.Token.Tag tag32 = tokeniser31.tagPending;
        tokeniser31.emit('4');
        boolean boolean35 = tokeniser31.currentNodeInHtmlNS();
        tokeniser31.emit(' ');
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.Tokeniser tokeniser40 = new org.jsoup.parser.Tokeniser(characterReader38, parseErrorList39);
        org.jsoup.parser.Token.Tag tag41 = tokeniser40.tagPending;
        org.jsoup.parser.Token.Tag tag42 = tokeniser40.tagPending;
        org.jsoup.parser.Token.Tag tag44 = tokeniser40.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader45 = null;
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        org.jsoup.parser.Tokeniser tokeniser47 = new org.jsoup.parser.Tokeniser(characterReader45, parseErrorList46);
        org.jsoup.parser.TokeniserState tokeniserState48 = tokeniser47.getState();
        java.lang.StringBuilder stringBuilder49 = tokeniser47.dataBuffer;
        org.jsoup.parser.Token.Tag tag51 = tokeniser47.createTagPending(true);
        tokeniser40.emit((org.jsoup.parser.Token) tag51);
        java.lang.StringBuilder stringBuilder53 = tokeniser40.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader54 = null;
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        org.jsoup.parser.Tokeniser tokeniser56 = new org.jsoup.parser.Tokeniser(characterReader54, parseErrorList55);
        org.jsoup.parser.TokeniserState tokeniserState57 = tokeniser56.getState();
        org.jsoup.parser.Token.Comment comment58 = tokeniser56.commentPending;
        org.jsoup.parser.CharacterReader characterReader59 = null;
        org.jsoup.parser.ParseErrorList parseErrorList60 = null;
        org.jsoup.parser.Tokeniser tokeniser61 = new org.jsoup.parser.Tokeniser(characterReader59, parseErrorList60);
        org.jsoup.parser.TokeniserState tokeniserState62 = tokeniser61.getState();
        org.jsoup.parser.Token.Comment comment63 = tokeniser61.commentPending;
        tokeniser61.createCommentPending();
        org.jsoup.parser.Token.Comment comment65 = tokeniser61.commentPending;
        tokeniser56.commentPending = comment65;
        tokeniser40.commentPending = comment65;
        tokeniser31.commentPending = comment65;
        tokeniser22.commentPending = comment65;
        tokeniser2.emit((org.jsoup.parser.Token) comment65);
        tokeniser2.emit("hi!");
        tokeniser2.createDoctypePending();
        tokeniser2.createTempBuffer();
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNull(stringBuilder4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNull(stringBuilder11);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(token17);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(tokeniserState23);
        org.junit.Assert.assertNull(comment24);
        org.junit.Assert.assertNotNull(comment26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(tag32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(tag41);
        org.junit.Assert.assertNull(tag42);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(tokeniserState48);
        org.junit.Assert.assertNull(stringBuilder49);
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNull(stringBuilder53);
        org.junit.Assert.assertNotNull(tokeniserState57);
        org.junit.Assert.assertNull(comment58);
        org.junit.Assert.assertNotNull(tokeniserState62);
        org.junit.Assert.assertNull(comment63);
        org.junit.Assert.assertNotNull(comment65);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        java.lang.StringBuilder stringBuilder4 = tokeniser2.dataBuffer;
        org.jsoup.parser.Token.Tag tag6 = tokeniser2.createTagPending(true);
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser2.doctypePending = doctype7;
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser2.getState();
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList11);
        org.jsoup.parser.Token.Tag tag13 = tokeniser12.tagPending;
        org.jsoup.parser.Token.Tag tag14 = tokeniser12.tagPending;
        org.jsoup.parser.Token.Tag tag16 = tokeniser12.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader17, parseErrorList18);
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser19.getState();
        java.lang.StringBuilder stringBuilder21 = tokeniser19.dataBuffer;
        org.jsoup.parser.Token.Tag tag23 = tokeniser19.createTagPending(true);
        tokeniser12.emit((org.jsoup.parser.Token) tag23);
        java.lang.String str25 = tokeniser12.appropriateEndTagName();
        tokeniser12.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader27, parseErrorList28);
        org.jsoup.parser.Token.Tag tag30 = tokeniser29.tagPending;
        org.jsoup.parser.Token.Tag tag31 = tokeniser29.tagPending;
        org.jsoup.parser.Token.Tag tag33 = tokeniser29.createTagPending(false);
        tokeniser12.tagPending = tag33;
        tokeniser12.createDoctypePending();
        java.lang.StringBuilder stringBuilder36 = tokeniser12.dataBuffer;
        org.jsoup.parser.Token.Doctype doctype37 = tokeniser12.doctypePending;
        org.jsoup.parser.Token.Tag tag39 = tokeniser12.createTagPending(true);
        org.jsoup.parser.Token.Doctype doctype40 = tokeniser12.doctypePending;
        tokeniser12.createCommentPending();
        org.jsoup.parser.Token.Comment comment42 = tokeniser12.commentPending;
        org.jsoup.parser.CharacterReader characterReader43 = null;
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.Tokeniser tokeniser45 = new org.jsoup.parser.Tokeniser(characterReader43, parseErrorList44);
        org.jsoup.parser.TokeniserState tokeniserState46 = tokeniser45.getState();
        boolean boolean47 = tokeniser45.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag49 = tokeniser45.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader50 = null;
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.Tokeniser tokeniser52 = new org.jsoup.parser.Tokeniser(characterReader50, parseErrorList51);
        org.jsoup.parser.TokeniserState tokeniserState53 = tokeniser52.getState();
        java.lang.StringBuilder stringBuilder54 = tokeniser52.dataBuffer;
        org.jsoup.parser.Token.Tag tag56 = tokeniser52.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader57 = null;
        org.jsoup.parser.ParseErrorList parseErrorList58 = null;
        org.jsoup.parser.Tokeniser tokeniser59 = new org.jsoup.parser.Tokeniser(characterReader57, parseErrorList58);
        org.jsoup.parser.Token.Tag tag60 = tokeniser59.tagPending;
        org.jsoup.parser.Token.Tag tag61 = tokeniser59.tagPending;
        org.jsoup.parser.Token.Tag tag63 = tokeniser59.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader64 = null;
        org.jsoup.parser.ParseErrorList parseErrorList65 = null;
        org.jsoup.parser.Tokeniser tokeniser66 = new org.jsoup.parser.Tokeniser(characterReader64, parseErrorList65);
        org.jsoup.parser.TokeniserState tokeniserState67 = tokeniser66.getState();
        java.lang.StringBuilder stringBuilder68 = tokeniser66.dataBuffer;
        org.jsoup.parser.Token.Tag tag70 = tokeniser66.createTagPending(true);
        tokeniser59.emit((org.jsoup.parser.Token) tag70);
        java.lang.String str72 = tokeniser59.appropriateEndTagName();
        tokeniser59.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader74 = null;
        org.jsoup.parser.ParseErrorList parseErrorList75 = null;
        org.jsoup.parser.Tokeniser tokeniser76 = new org.jsoup.parser.Tokeniser(characterReader74, parseErrorList75);
        org.jsoup.parser.Token.Tag tag77 = tokeniser76.tagPending;
        org.jsoup.parser.Token.Tag tag78 = tokeniser76.tagPending;
        org.jsoup.parser.Token.Tag tag80 = tokeniser76.createTagPending(false);
        tokeniser59.tagPending = tag80;
        tokeniser59.createDoctypePending();
        java.lang.StringBuilder stringBuilder83 = tokeniser59.dataBuffer;
        org.jsoup.parser.Token.Doctype doctype84 = tokeniser59.doctypePending;
        tokeniser52.doctypePending = doctype84;
        tokeniser45.doctypePending = doctype84;
        tokeniser12.doctypePending = doctype84;
        tokeniser2.doctypePending = doctype84;
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNull(stringBuilder4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNull(tag13);
        org.junit.Assert.assertNull(tag14);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertNull(stringBuilder21);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(tag30);
        org.junit.Assert.assertNull(tag31);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(stringBuilder36);
        org.junit.Assert.assertEquals(stringBuilder36.toString(), "");
        org.junit.Assert.assertNotNull(doctype37);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(doctype40);
        org.junit.Assert.assertNotNull(comment42);
        org.junit.Assert.assertNotNull(tokeniserState46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertNotNull(tokeniserState53);
        org.junit.Assert.assertNull(stringBuilder54);
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertNull(tag60);
        org.junit.Assert.assertNull(tag61);
        org.junit.Assert.assertNotNull(tag63);
        org.junit.Assert.assertNotNull(tokeniserState67);
        org.junit.Assert.assertNull(stringBuilder68);
        org.junit.Assert.assertNotNull(tag70);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNull(tag77);
        org.junit.Assert.assertNull(tag78);
        org.junit.Assert.assertNotNull(tag80);
        org.junit.Assert.assertNotNull(stringBuilder83);
        org.junit.Assert.assertEquals(stringBuilder83.toString(), "");
        org.junit.Assert.assertNotNull(doctype84);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.Parser parser2 = parser0.setTrackErrors((int) (short) -1);
        org.jsoup.parser.Parser parser3 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document6 = parser3.parseInput("", "");
        org.jsoup.parser.TreeBuilder treeBuilder7 = parser3.getTreeBuilder();
        org.jsoup.parser.Parser parser8 = parser2.setTreeBuilder(treeBuilder7);
        org.jsoup.parser.Parser parser9 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document12 = parser9.parseInput("", "");
        org.jsoup.parser.TreeBuilder treeBuilder13 = parser9.getTreeBuilder();
        org.jsoup.parser.Parser parser14 = new org.jsoup.parser.Parser(treeBuilder13);
        org.jsoup.parser.Parser parser15 = parser2.setTreeBuilder(treeBuilder13);
        org.jsoup.parser.Parser parser17 = parser15.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser19 = parser15.setTrackErrors((int) (byte) 10);
        org.jsoup.parser.Parser parser21 = parser15.setTrackErrors((int) (short) 0);
        org.jsoup.nodes.Document document24 = parser15.parseInput("", "");
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(treeBuilder7);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(treeBuilder13);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(document24);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag3 = tokeniser2.tagPending;
        tokeniser2.emit('4');
        org.jsoup.parser.Token.Comment comment6 = tokeniser2.commentPending;
        java.lang.StringBuilder stringBuilder7 = tokeniser2.dataBuffer;
        tokeniser2.emit('a');
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList11);
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser12.getState();
        java.lang.StringBuilder stringBuilder14 = tokeniser12.dataBuffer;
        org.jsoup.parser.Token.Tag tag16 = tokeniser12.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader17, parseErrorList18);
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser19.getState();
        java.lang.StringBuilder stringBuilder21 = tokeniser19.dataBuffer;
        org.jsoup.parser.Token.Tag tag23 = tokeniser19.createTagPending(true);
        tokeniser12.emit((org.jsoup.parser.Token) tag23);
        boolean boolean25 = tokeniser12.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag26 = tokeniser12.tagPending;
        tokeniser2.tagPending = tag26;
        org.jsoup.parser.Token.Comment comment28 = tokeniser2.commentPending;
        tokeniser2.acknowledgeSelfClosingFlag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = tokeniser2.appropriateEndTagName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag3);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNull(stringBuilder7);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNull(stringBuilder14);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertNull(stringBuilder21);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNull(comment28);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag3 = tokeniser2.tagPending;
        tokeniser2.emit('4');
        org.jsoup.parser.Token.Comment comment6 = tokeniser2.commentPending;
        java.lang.StringBuilder stringBuilder7 = tokeniser2.dataBuffer;
        tokeniser2.emit('a');
        org.jsoup.parser.Token.Doctype doctype10 = tokeniser2.doctypePending;
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader11, parseErrorList12);
        org.jsoup.parser.Token.Tag tag14 = tokeniser13.tagPending;
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader15, parseErrorList16);
        org.jsoup.parser.TokeniserState tokeniserState18 = tokeniser17.getState();
        java.lang.StringBuilder stringBuilder19 = tokeniser17.dataBuffer;
        org.jsoup.parser.Token.Tag tag21 = tokeniser17.createTagPending(true);
        tokeniser13.tagPending = tag21;
        tokeniser13.createCommentPending();
        tokeniser13.emit("");
        org.jsoup.parser.Token.Tag tag26 = tokeniser13.tagPending;
        tokeniser2.tagPending = tag26;
        tokeniser2.emit("");
        tokeniser2.createCommentPending();
        tokeniser2.emitTagPending();
        org.junit.Assert.assertNull(tag3);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNull(stringBuilder7);
        org.junit.Assert.assertNull(doctype10);
        org.junit.Assert.assertNull(tag14);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNull(stringBuilder19);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(tag26);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        boolean boolean4 = tokeniser2.currentNodeInHtmlNS();
        tokeniser2.emit("");
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser2.getState();
        tokeniser2.createDoctypePending();
        tokeniser2.emit("");
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser2.getState();
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertNotNull(tokeniserState11);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag3 = tokeniser2.tagPending;
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.tagPending;
        org.jsoup.parser.Token.Tag tag6 = tokeniser2.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser9.getState();
        java.lang.StringBuilder stringBuilder11 = tokeniser9.dataBuffer;
        org.jsoup.parser.Token.Tag tag13 = tokeniser9.createTagPending(true);
        tokeniser2.emit((org.jsoup.parser.Token) tag13);
        java.lang.String str15 = tokeniser2.appropriateEndTagName();
        tokeniser2.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader17, parseErrorList18);
        org.jsoup.parser.Token.Tag tag20 = tokeniser19.tagPending;
        org.jsoup.parser.Token.Tag tag21 = tokeniser19.tagPending;
        org.jsoup.parser.Token.Tag tag23 = tokeniser19.createTagPending(false);
        tokeniser2.tagPending = tag23;
        tokeniser2.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState26 = tokeniser2.getState();
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader27, parseErrorList28);
        org.jsoup.parser.Token.Tag tag30 = tokeniser29.tagPending;
        tokeniser29.emit('4');
        boolean boolean33 = tokeniser29.currentNodeInHtmlNS();
        tokeniser29.emit(' ');
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.Tokeniser tokeniser38 = new org.jsoup.parser.Tokeniser(characterReader36, parseErrorList37);
        org.jsoup.parser.Token.Tag tag39 = tokeniser38.tagPending;
        org.jsoup.parser.Token.Tag tag40 = tokeniser38.tagPending;
        org.jsoup.parser.Token.Tag tag42 = tokeniser38.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader43 = null;
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.Tokeniser tokeniser45 = new org.jsoup.parser.Tokeniser(characterReader43, parseErrorList44);
        org.jsoup.parser.TokeniserState tokeniserState46 = tokeniser45.getState();
        java.lang.StringBuilder stringBuilder47 = tokeniser45.dataBuffer;
        org.jsoup.parser.Token.Tag tag49 = tokeniser45.createTagPending(true);
        tokeniser38.emit((org.jsoup.parser.Token) tag49);
        java.lang.StringBuilder stringBuilder51 = tokeniser38.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader52 = null;
        org.jsoup.parser.ParseErrorList parseErrorList53 = null;
        org.jsoup.parser.Tokeniser tokeniser54 = new org.jsoup.parser.Tokeniser(characterReader52, parseErrorList53);
        org.jsoup.parser.TokeniserState tokeniserState55 = tokeniser54.getState();
        org.jsoup.parser.Token.Comment comment56 = tokeniser54.commentPending;
        org.jsoup.parser.CharacterReader characterReader57 = null;
        org.jsoup.parser.ParseErrorList parseErrorList58 = null;
        org.jsoup.parser.Tokeniser tokeniser59 = new org.jsoup.parser.Tokeniser(characterReader57, parseErrorList58);
        org.jsoup.parser.TokeniserState tokeniserState60 = tokeniser59.getState();
        org.jsoup.parser.Token.Comment comment61 = tokeniser59.commentPending;
        tokeniser59.createCommentPending();
        org.jsoup.parser.Token.Comment comment63 = tokeniser59.commentPending;
        tokeniser54.commentPending = comment63;
        tokeniser38.commentPending = comment63;
        tokeniser29.commentPending = comment63;
        tokeniser2.commentPending = comment63;
        java.lang.StringBuilder stringBuilder68 = null;
        tokeniser2.dataBuffer = stringBuilder68;
        tokeniser2.createDoctypePending();
        org.junit.Assert.assertNull(tag3);
        org.junit.Assert.assertNull(tag4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNull(stringBuilder11);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(tag20);
        org.junit.Assert.assertNull(tag21);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(tokeniserState26);
        org.junit.Assert.assertNull(tag30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(tag39);
        org.junit.Assert.assertNull(tag40);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertNotNull(tokeniserState46);
        org.junit.Assert.assertNull(stringBuilder47);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertNull(stringBuilder51);
        org.junit.Assert.assertNotNull(tokeniserState55);
        org.junit.Assert.assertNull(comment56);
        org.junit.Assert.assertNotNull(tokeniserState60);
        org.junit.Assert.assertNull(comment61);
        org.junit.Assert.assertNotNull(comment63);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser2.doctypePending = doctype4;
        org.jsoup.parser.Token.Tag tag6 = tokeniser2.tagPending;
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.emit(' ');
        org.jsoup.parser.Token.Doctype doctype10 = tokeniser2.doctypePending;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader12, parseErrorList13);
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader15, parseErrorList16);
        org.jsoup.parser.TokeniserState tokeniserState18 = tokeniser17.getState();
        org.jsoup.parser.Token.Comment comment19 = tokeniser17.commentPending;
        tokeniser17.createCommentPending();
        org.jsoup.parser.Token.Comment comment21 = tokeniser17.commentPending;
        tokeniser14.commentPending = comment21;
        tokeniser14.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype24 = null;
        tokeniser14.doctypePending = doctype24;
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader26, parseErrorList27);
        org.jsoup.parser.Token.Tag tag29 = tokeniser28.tagPending;
        org.jsoup.parser.CharacterReader characterReader30 = null;
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader30, parseErrorList31);
        org.jsoup.parser.TokeniserState tokeniserState33 = tokeniser32.getState();
        java.lang.StringBuilder stringBuilder34 = tokeniser32.dataBuffer;
        org.jsoup.parser.Token.Tag tag36 = tokeniser32.createTagPending(true);
        tokeniser28.tagPending = tag36;
        tokeniser14.tagPending = tag36;
        tokeniser2.tagPending = tag36;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNull(tag6);
        org.junit.Assert.assertNull(doctype10);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNull(comment19);
        org.junit.Assert.assertNotNull(comment21);
        org.junit.Assert.assertNull(tag29);
        org.junit.Assert.assertNotNull(tokeniserState33);
        org.junit.Assert.assertNull(stringBuilder34);
        org.junit.Assert.assertNotNull(tag36);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        org.jsoup.parser.Token.Comment comment4 = tokeniser2.commentPending;
        org.jsoup.parser.TokeniserState tokeniserState5 = null;
        tokeniser2.transition(tokeniserState5);
        java.lang.StringBuilder stringBuilder7 = tokeniser2.dataBuffer;
        java.lang.StringBuilder stringBuilder8 = tokeniser2.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader9, parseErrorList10);
        org.jsoup.parser.Token.Tag tag12 = tokeniser11.tagPending;
        tokeniser11.emit('4');
        org.jsoup.parser.Token.Comment comment15 = tokeniser11.commentPending;
        java.lang.StringBuilder stringBuilder16 = tokeniser11.dataBuffer;
        tokeniser11.emit('a');
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader19, parseErrorList20);
        org.jsoup.parser.Token.Tag tag22 = tokeniser21.tagPending;
        org.jsoup.parser.Token.Tag tag23 = tokeniser21.tagPending;
        org.jsoup.parser.Token.Tag tag25 = tokeniser21.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader26, parseErrorList27);
        org.jsoup.parser.TokeniserState tokeniserState29 = tokeniser28.getState();
        java.lang.StringBuilder stringBuilder30 = tokeniser28.dataBuffer;
        org.jsoup.parser.Token.Tag tag32 = tokeniser28.createTagPending(true);
        tokeniser21.emit((org.jsoup.parser.Token) tag32);
        tokeniser21.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader35, parseErrorList36);
        org.jsoup.parser.Token.Tag tag38 = tokeniser37.tagPending;
        org.jsoup.parser.Token.Tag tag39 = tokeniser37.tagPending;
        org.jsoup.parser.Token.Tag tag41 = tokeniser37.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader42 = null;
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.parser.Tokeniser tokeniser44 = new org.jsoup.parser.Tokeniser(characterReader42, parseErrorList43);
        org.jsoup.parser.TokeniserState tokeniserState45 = tokeniser44.getState();
        java.lang.StringBuilder stringBuilder46 = tokeniser44.dataBuffer;
        org.jsoup.parser.Token.Tag tag48 = tokeniser44.createTagPending(true);
        tokeniser37.emit((org.jsoup.parser.Token) tag48);
        java.lang.String str50 = tokeniser37.appropriateEndTagName();
        tokeniser37.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader52 = null;
        org.jsoup.parser.ParseErrorList parseErrorList53 = null;
        org.jsoup.parser.Tokeniser tokeniser54 = new org.jsoup.parser.Tokeniser(characterReader52, parseErrorList53);
        org.jsoup.parser.Token.Tag tag55 = tokeniser54.tagPending;
        org.jsoup.parser.Token.Tag tag56 = tokeniser54.tagPending;
        org.jsoup.parser.Token.Tag tag58 = tokeniser54.createTagPending(false);
        tokeniser37.tagPending = tag58;
        tokeniser37.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState61 = tokeniser37.getState();
        tokeniser21.transition(tokeniserState61);
        tokeniser11.transition(tokeniserState61);
        tokeniser2.transition(tokeniserState61);
        org.jsoup.parser.Token.Doctype doctype65 = tokeniser2.doctypePending;
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNull(comment4);
        org.junit.Assert.assertNull(stringBuilder7);
        org.junit.Assert.assertNull(stringBuilder8);
        org.junit.Assert.assertNull(tag12);
        org.junit.Assert.assertNull(comment15);
        org.junit.Assert.assertNull(stringBuilder16);
        org.junit.Assert.assertNull(tag22);
        org.junit.Assert.assertNull(tag23);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(tokeniserState29);
        org.junit.Assert.assertNull(stringBuilder30);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNull(tag38);
        org.junit.Assert.assertNull(tag39);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(tokeniserState45);
        org.junit.Assert.assertNull(stringBuilder46);
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(tag55);
        org.junit.Assert.assertNull(tag56);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertNotNull(tokeniserState61);
        org.junit.Assert.assertNull(doctype65);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.Parser parser2 = parser0.setTrackErrors((int) (short) -1);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList3 = parser2.getErrors();
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document7 = parser4.parseInput("", "");
        org.jsoup.parser.TreeBuilder treeBuilder8 = parser4.getTreeBuilder();
        org.jsoup.parser.Parser parser9 = parser2.setTreeBuilder(treeBuilder8);
        org.jsoup.nodes.Document document12 = parser9.parseInput("hi!", "hi!");
        org.jsoup.parser.Parser parser14 = parser9.setTrackErrors((int) '\ufffd');
        org.jsoup.nodes.Document document17 = parser9.parseInput("", "");
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNull(parseErrorList3);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(treeBuilder8);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(document17);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag3 = tokeniser2.tagPending;
        java.lang.StringBuilder stringBuilder4 = null;
        tokeniser2.dataBuffer = stringBuilder4;
        tokeniser2.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        org.jsoup.parser.Token.Tag tag10 = tokeniser9.tagPending;
        org.jsoup.parser.Token.Tag tag11 = tokeniser9.tagPending;
        org.jsoup.parser.Token.Tag tag13 = tokeniser9.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        org.jsoup.parser.TokeniserState tokeniserState17 = tokeniser16.getState();
        java.lang.StringBuilder stringBuilder18 = tokeniser16.dataBuffer;
        org.jsoup.parser.Token.Tag tag20 = tokeniser16.createTagPending(true);
        tokeniser9.emit((org.jsoup.parser.Token) tag20);
        java.lang.String str22 = tokeniser9.appropriateEndTagName();
        tokeniser9.createTempBuffer();
        tokeniser9.createDoctypePending();
        tokeniser9.emit('a');
        java.lang.StringBuilder stringBuilder27 = tokeniser9.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder27;
        tokeniser2.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment30 = tokeniser2.commentPending;
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader31, parseErrorList32);
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.parser.Tokeniser tokeniser36 = new org.jsoup.parser.Tokeniser(characterReader34, parseErrorList35);
        org.jsoup.parser.TokeniserState tokeniserState37 = tokeniser36.getState();
        org.jsoup.parser.Token.Comment comment38 = tokeniser36.commentPending;
        tokeniser36.createCommentPending();
        org.jsoup.parser.Token.Comment comment40 = tokeniser36.commentPending;
        tokeniser33.commentPending = comment40;
        tokeniser33.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype43 = null;
        tokeniser33.doctypePending = doctype43;
        org.jsoup.parser.CharacterReader characterReader45 = null;
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        org.jsoup.parser.Tokeniser tokeniser47 = new org.jsoup.parser.Tokeniser(characterReader45, parseErrorList46);
        org.jsoup.parser.Token.Tag tag48 = tokeniser47.tagPending;
        org.jsoup.parser.CharacterReader characterReader49 = null;
        org.jsoup.parser.ParseErrorList parseErrorList50 = null;
        org.jsoup.parser.Tokeniser tokeniser51 = new org.jsoup.parser.Tokeniser(characterReader49, parseErrorList50);
        org.jsoup.parser.TokeniserState tokeniserState52 = tokeniser51.getState();
        java.lang.StringBuilder stringBuilder53 = tokeniser51.dataBuffer;
        org.jsoup.parser.Token.Tag tag55 = tokeniser51.createTagPending(true);
        tokeniser47.tagPending = tag55;
        tokeniser33.tagPending = tag55;
        tokeniser33.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader59 = null;
        org.jsoup.parser.ParseErrorList parseErrorList60 = null;
        org.jsoup.parser.Tokeniser tokeniser61 = new org.jsoup.parser.Tokeniser(characterReader59, parseErrorList60);
        org.jsoup.parser.TokeniserState tokeniserState62 = tokeniser61.getState();
        java.lang.StringBuilder stringBuilder63 = tokeniser61.dataBuffer;
        org.jsoup.parser.Token.Tag tag65 = tokeniser61.createTagPending(true);
        org.jsoup.parser.Token.Doctype doctype66 = null;
        tokeniser61.doctypePending = doctype66;
        boolean boolean68 = tokeniser61.isAppropriateEndTagToken();
        org.jsoup.parser.CharacterReader characterReader69 = null;
        org.jsoup.parser.ParseErrorList parseErrorList70 = null;
        org.jsoup.parser.Tokeniser tokeniser71 = new org.jsoup.parser.Tokeniser(characterReader69, parseErrorList70);
        org.jsoup.parser.TokeniserState tokeniserState72 = tokeniser71.getState();
        java.lang.StringBuilder stringBuilder73 = tokeniser71.dataBuffer;
        org.jsoup.parser.Token.Tag tag75 = tokeniser71.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader76 = null;
        org.jsoup.parser.ParseErrorList parseErrorList77 = null;
        org.jsoup.parser.Tokeniser tokeniser78 = new org.jsoup.parser.Tokeniser(characterReader76, parseErrorList77);
        org.jsoup.parser.TokeniserState tokeniserState79 = tokeniser78.getState();
        java.lang.StringBuilder stringBuilder80 = tokeniser78.dataBuffer;
        org.jsoup.parser.Token.Tag tag82 = tokeniser78.createTagPending(true);
        tokeniser71.emit((org.jsoup.parser.Token) tag82);
        boolean boolean84 = tokeniser71.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag85 = tokeniser71.tagPending;
        org.jsoup.parser.Token token86 = tokeniser71.read();
        tokeniser71.createDoctypePending();
        org.jsoup.parser.Token.Tag tag88 = tokeniser71.tagPending;
        tokeniser61.tagPending = tag88;
        tokeniser33.tagPending = tag88;
        tokeniser2.tagPending = tag88;
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.createCommentPending();
        org.junit.Assert.assertNull(tag3);
        org.junit.Assert.assertNull(tag10);
        org.junit.Assert.assertNull(tag11);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertNull(stringBuilder18);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertNull(comment30);
        org.junit.Assert.assertNotNull(tokeniserState37);
        org.junit.Assert.assertNull(comment38);
        org.junit.Assert.assertNotNull(comment40);
        org.junit.Assert.assertNull(tag48);
        org.junit.Assert.assertNotNull(tokeniserState52);
        org.junit.Assert.assertNull(stringBuilder53);
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertNotNull(tokeniserState62);
        org.junit.Assert.assertNull(stringBuilder63);
        org.junit.Assert.assertNotNull(tag65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(tokeniserState72);
        org.junit.Assert.assertNull(stringBuilder73);
        org.junit.Assert.assertNotNull(tag75);
        org.junit.Assert.assertNotNull(tokeniserState79);
        org.junit.Assert.assertNull(stringBuilder80);
        org.junit.Assert.assertNotNull(tag82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(tag85);
        org.junit.Assert.assertNotNull(token86);
        org.junit.Assert.assertNotNull(tag88);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        java.lang.StringBuilder stringBuilder4 = tokeniser2.dataBuffer;
        org.jsoup.parser.Token.Tag tag6 = tokeniser2.createTagPending(true);
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser2.doctypePending = doctype7;
        boolean boolean9 = tokeniser2.isAppropriateEndTagToken();
        tokeniser2.createTempBuffer();
        tokeniser2.createCommentPending();
        org.jsoup.parser.Token.Tag tag12 = null;
        tokeniser2.tagPending = tag12;
        tokeniser2.createTempBuffer();
        java.lang.StringBuilder stringBuilder15 = tokeniser2.dataBuffer;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token16 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNull(stringBuilder4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag3 = tokeniser2.tagPending;
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.tagPending;
        org.jsoup.parser.Token.Tag tag6 = tokeniser2.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser9.getState();
        java.lang.StringBuilder stringBuilder11 = tokeniser9.dataBuffer;
        org.jsoup.parser.Token.Tag tag13 = tokeniser9.createTagPending(true);
        tokeniser2.emit((org.jsoup.parser.Token) tag13);
        java.lang.String str15 = tokeniser2.appropriateEndTagName();
        org.jsoup.parser.Token token16 = tokeniser2.read();
        java.lang.String str17 = tokeniser2.appropriateEndTagName();
        org.jsoup.parser.Token.Comment comment18 = tokeniser2.commentPending;
        org.jsoup.parser.Token.Doctype doctype19 = tokeniser2.doctypePending;
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Tag tag22 = tokeniser2.createTagPending(false);
        tokeniser2.createCommentPending();
        org.junit.Assert.assertNull(tag3);
        org.junit.Assert.assertNull(tag4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNull(stringBuilder11);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(token16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(comment18);
        org.junit.Assert.assertNull(doctype19);
        org.junit.Assert.assertNotNull(tag22);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.Parser parser2 = parser0.setTrackErrors((int) (short) -1);
        org.jsoup.parser.Parser parser3 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document6 = parser3.parseInput("", "");
        org.jsoup.parser.TreeBuilder treeBuilder7 = parser3.getTreeBuilder();
        org.jsoup.parser.Parser parser8 = parser2.setTreeBuilder(treeBuilder7);
        org.jsoup.parser.Parser parser9 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document12 = parser9.parseInput("", "");
        org.jsoup.parser.TreeBuilder treeBuilder13 = parser9.getTreeBuilder();
        org.jsoup.parser.Parser parser14 = new org.jsoup.parser.Parser(treeBuilder13);
        org.jsoup.parser.Parser parser15 = parser2.setTreeBuilder(treeBuilder13);
        org.jsoup.parser.TreeBuilder treeBuilder16 = parser2.getTreeBuilder();
        org.jsoup.parser.Parser parser17 = new org.jsoup.parser.Parser(treeBuilder16);
        org.jsoup.parser.Parser parser18 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.Parser parser20 = parser18.setTrackErrors((int) (short) -1);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList21 = parser20.getErrors();
        org.jsoup.parser.Parser parser22 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document25 = parser22.parseInput("", "");
        org.jsoup.parser.TreeBuilder treeBuilder26 = parser22.getTreeBuilder();
        org.jsoup.parser.Parser parser27 = parser20.setTreeBuilder(treeBuilder26);
        org.jsoup.nodes.Document document30 = parser20.parseInput("", "");
        org.jsoup.parser.TreeBuilder treeBuilder31 = parser20.getTreeBuilder();
        org.jsoup.parser.Parser parser32 = new org.jsoup.parser.Parser(treeBuilder31);
        org.jsoup.parser.TreeBuilder treeBuilder33 = parser32.getTreeBuilder();
        org.jsoup.parser.Parser parser34 = parser17.setTreeBuilder(treeBuilder33);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList35 = parser17.getErrors();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(treeBuilder7);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(treeBuilder13);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(treeBuilder16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNull(parseErrorList21);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(treeBuilder26);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(treeBuilder31);
        org.junit.Assert.assertNotNull(treeBuilder33);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNull(parseErrorList35);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader4, parseErrorList5);
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser6.getState();
        org.jsoup.parser.Token.Comment comment8 = tokeniser6.commentPending;
        tokeniser6.createCommentPending();
        org.jsoup.parser.Token.Comment comment10 = tokeniser6.commentPending;
        tokeniser2.commentPending = comment10;
        java.lang.StringBuilder stringBuilder12 = null;
        tokeniser2.dataBuffer = stringBuilder12;
        boolean boolean14 = tokeniser2.isAppropriateEndTagToken();
        tokeniser2.emit('4');
        java.lang.StringBuilder stringBuilder17 = tokeniser2.dataBuffer;
        org.jsoup.parser.Token.Comment comment18 = tokeniser2.commentPending;
        tokeniser2.createCommentPending();
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertNull(comment8);
        org.junit.Assert.assertNotNull(comment10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(stringBuilder17);
        org.junit.Assert.assertNotNull(comment18);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag3 = tokeniser2.tagPending;
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader4, parseErrorList5);
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser6.getState();
        java.lang.StringBuilder stringBuilder8 = tokeniser6.dataBuffer;
        org.jsoup.parser.Token.Tag tag10 = tokeniser6.createTagPending(true);
        tokeniser2.tagPending = tag10;
        tokeniser2.createCommentPending();
        tokeniser2.emit("");
        org.jsoup.parser.Token.Tag tag15 = tokeniser2.tagPending;
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Tag tag17 = tokeniser2.tagPending;
        tokeniser2.createCommentPending();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = tokeniser2.appropriateEndTagName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag3);
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertNull(stringBuilder8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(tag17);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        org.jsoup.parser.Token.Comment comment4 = tokeniser2.commentPending;
        tokeniser2.createCommentPending();
        boolean boolean6 = tokeniser2.isAppropriateEndTagToken();
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList11);
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser12.getState();
        org.jsoup.parser.Token.Comment comment14 = tokeniser12.commentPending;
        tokeniser12.createCommentPending();
        org.jsoup.parser.Token.Comment comment16 = tokeniser12.commentPending;
        tokeniser9.commentPending = comment16;
        tokeniser9.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype19 = null;
        tokeniser9.doctypePending = doctype19;
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader21, parseErrorList22);
        org.jsoup.parser.Token.Tag tag24 = tokeniser23.tagPending;
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader25, parseErrorList26);
        org.jsoup.parser.TokeniserState tokeniserState28 = tokeniser27.getState();
        java.lang.StringBuilder stringBuilder29 = tokeniser27.dataBuffer;
        org.jsoup.parser.Token.Tag tag31 = tokeniser27.createTagPending(true);
        tokeniser23.tagPending = tag31;
        tokeniser9.tagPending = tag31;
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.parser.Tokeniser tokeniser36 = new org.jsoup.parser.Tokeniser(characterReader34, parseErrorList35);
        org.jsoup.parser.Token.Tag tag37 = tokeniser36.tagPending;
        org.jsoup.parser.Token.Tag tag38 = tokeniser36.tagPending;
        org.jsoup.parser.Token.Tag tag40 = tokeniser36.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader41 = null;
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        org.jsoup.parser.Tokeniser tokeniser43 = new org.jsoup.parser.Tokeniser(characterReader41, parseErrorList42);
        org.jsoup.parser.TokeniserState tokeniserState44 = tokeniser43.getState();
        java.lang.StringBuilder stringBuilder45 = tokeniser43.dataBuffer;
        org.jsoup.parser.Token.Tag tag47 = tokeniser43.createTagPending(true);
        tokeniser36.emit((org.jsoup.parser.Token) tag47);
        java.lang.String str49 = tokeniser36.appropriateEndTagName();
        tokeniser36.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader51 = null;
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        org.jsoup.parser.Tokeniser tokeniser53 = new org.jsoup.parser.Tokeniser(characterReader51, parseErrorList52);
        org.jsoup.parser.Token.Tag tag54 = tokeniser53.tagPending;
        org.jsoup.parser.Token.Tag tag55 = tokeniser53.tagPending;
        org.jsoup.parser.Token.Tag tag57 = tokeniser53.createTagPending(false);
        tokeniser36.tagPending = tag57;
        tokeniser36.createDoctypePending();
        java.lang.StringBuilder stringBuilder60 = tokeniser36.dataBuffer;
        org.jsoup.parser.Token.Doctype doctype61 = tokeniser36.doctypePending;
        org.jsoup.parser.Token.Tag tag63 = tokeniser36.createTagPending(true);
        tokeniser9.emit((org.jsoup.parser.Token) tag63);
        tokeniser2.tagPending = tag63;
        boolean boolean66 = tokeniser2.isAppropriateEndTagToken();
        tokeniser2.createCommentPending();
        tokeniser2.emitTagPending();
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNull(comment4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNull(comment14);
        org.junit.Assert.assertNotNull(comment16);
        org.junit.Assert.assertNull(tag24);
        org.junit.Assert.assertNotNull(tokeniserState28);
        org.junit.Assert.assertNull(stringBuilder29);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNull(tag37);
        org.junit.Assert.assertNull(tag38);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertNotNull(tokeniserState44);
        org.junit.Assert.assertNull(stringBuilder45);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(tag54);
        org.junit.Assert.assertNull(tag55);
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertNotNull(stringBuilder60);
        org.junit.Assert.assertEquals(stringBuilder60.toString(), "");
        org.junit.Assert.assertNotNull(doctype61);
        org.junit.Assert.assertNotNull(tag63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document3 = parser0.parseInput("", "");
        org.jsoup.parser.TreeBuilder treeBuilder4 = parser0.getTreeBuilder();
        boolean boolean5 = parser0.isTrackErrors();
        org.jsoup.parser.Parser parser6 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document9 = parser6.parseInput("", "");
        org.jsoup.parser.Parser parser10 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document13 = parser10.parseInput("", "");
        org.jsoup.parser.TreeBuilder treeBuilder14 = parser10.getTreeBuilder();
        org.jsoup.parser.Parser parser15 = parser6.setTreeBuilder(treeBuilder14);
        org.jsoup.parser.Parser parser17 = parser6.setTrackErrors(0);
        org.jsoup.parser.TreeBuilder treeBuilder18 = parser6.getTreeBuilder();
        org.jsoup.parser.Parser parser19 = new org.jsoup.parser.Parser(treeBuilder18);
        org.jsoup.parser.Parser parser20 = parser0.setTreeBuilder(treeBuilder18);
        org.jsoup.nodes.Document document23 = parser0.parseInput("", "");
        org.jsoup.parser.Parser parser24 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document27 = parser24.parseInput("", "");
        org.jsoup.parser.Parser parser28 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document31 = parser28.parseInput("", "");
        org.jsoup.parser.TreeBuilder treeBuilder32 = parser28.getTreeBuilder();
        org.jsoup.parser.Parser parser33 = parser24.setTreeBuilder(treeBuilder32);
        org.jsoup.parser.Parser parser34 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document37 = parser34.parseInput("", "");
        org.jsoup.parser.Parser parser38 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document41 = parser38.parseInput("", "");
        org.jsoup.parser.TreeBuilder treeBuilder42 = parser38.getTreeBuilder();
        org.jsoup.parser.Parser parser43 = parser34.setTreeBuilder(treeBuilder42);
        org.jsoup.parser.Parser parser44 = new org.jsoup.parser.Parser(treeBuilder42);
        org.jsoup.parser.Parser parser45 = new org.jsoup.parser.Parser(treeBuilder42);
        org.jsoup.parser.Parser parser46 = new org.jsoup.parser.Parser(treeBuilder42);
        org.jsoup.parser.Parser parser47 = parser33.setTreeBuilder(treeBuilder42);
        org.jsoup.parser.Parser parser48 = new org.jsoup.parser.Parser(treeBuilder42);
        org.jsoup.parser.Parser parser49 = parser0.setTreeBuilder(treeBuilder42);
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(treeBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(treeBuilder14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(treeBuilder18);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(treeBuilder32);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(parser38);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(treeBuilder42);
        org.junit.Assert.assertNotNull(parser43);
        org.junit.Assert.assertNotNull(parser47);
        org.junit.Assert.assertNotNull(parser49);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag3 = tokeniser2.tagPending;
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader4, parseErrorList5);
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser6.getState();
        java.lang.StringBuilder stringBuilder8 = tokeniser6.dataBuffer;
        org.jsoup.parser.Token.Tag tag10 = tokeniser6.createTagPending(true);
        tokeniser2.tagPending = tag10;
        tokeniser2.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader13, parseErrorList14);
        tokeniser15.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader17, parseErrorList18);
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser19.getState();
        org.jsoup.parser.Token.Comment comment21 = tokeniser19.commentPending;
        tokeniser19.createCommentPending();
        org.jsoup.parser.Token.Comment comment23 = tokeniser19.commentPending;
        tokeniser15.commentPending = comment23;
        tokeniser2.commentPending = comment23;
        org.jsoup.parser.Token.Tag tag27 = tokeniser2.createTagPending(false);
        tokeniser2.emit("");
        org.junit.Assert.assertNull(tag3);
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertNull(stringBuilder8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertNull(comment21);
        org.junit.Assert.assertNotNull(comment23);
        org.junit.Assert.assertNotNull(tag27);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag3 = tokeniser2.tagPending;
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.tagPending;
        org.jsoup.parser.Token.Tag tag6 = tokeniser2.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser9.getState();
        java.lang.StringBuilder stringBuilder11 = tokeniser9.dataBuffer;
        org.jsoup.parser.Token.Tag tag13 = tokeniser9.createTagPending(true);
        tokeniser2.emit((org.jsoup.parser.Token) tag13);
        org.jsoup.parser.Token token15 = tokeniser2.read();
        java.lang.String str16 = tokeniser2.appropriateEndTagName();
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader17, parseErrorList18);
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser19.getState();
        boolean boolean21 = tokeniser19.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader22, parseErrorList23);
        tokeniser24.createTempBuffer();
        tokeniser24.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag28 = tokeniser24.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader29, parseErrorList30);
        org.jsoup.parser.TokeniserState tokeniserState32 = tokeniser31.getState();
        org.jsoup.parser.Token.Comment comment33 = tokeniser31.commentPending;
        org.jsoup.parser.TokeniserState tokeniserState34 = tokeniser31.getState();
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader35, parseErrorList36);
        org.jsoup.parser.TokeniserState tokeniserState38 = tokeniser37.getState();
        java.lang.StringBuilder stringBuilder39 = tokeniser37.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader40 = null;
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.Tokeniser tokeniser42 = new org.jsoup.parser.Tokeniser(characterReader40, parseErrorList41);
        org.jsoup.parser.TokeniserState tokeniserState43 = tokeniser42.getState();
        org.jsoup.parser.Token.Comment comment44 = tokeniser42.commentPending;
        tokeniser42.createCommentPending();
        org.jsoup.parser.Token.Comment comment46 = tokeniser42.commentPending;
        tokeniser37.commentPending = comment46;
        tokeniser31.commentPending = comment46;
        tokeniser24.commentPending = comment46;
        tokeniser24.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype51 = tokeniser24.doctypePending;
        tokeniser19.doctypePending = doctype51;
        tokeniser2.doctypePending = doctype51;
        boolean boolean54 = tokeniser2.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment55 = tokeniser2.commentPending;
        org.jsoup.parser.Token.Tag tag57 = tokeniser2.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader58 = null;
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        org.jsoup.parser.Tokeniser tokeniser60 = new org.jsoup.parser.Tokeniser(characterReader58, parseErrorList59);
        org.jsoup.parser.Token.Tag tag61 = tokeniser60.tagPending;
        tokeniser60.emit('4');
        org.jsoup.parser.Token.Comment comment64 = tokeniser60.commentPending;
        org.jsoup.parser.CharacterReader characterReader65 = null;
        org.jsoup.parser.ParseErrorList parseErrorList66 = null;
        org.jsoup.parser.Tokeniser tokeniser67 = new org.jsoup.parser.Tokeniser(characterReader65, parseErrorList66);
        org.jsoup.parser.CharacterReader characterReader68 = null;
        org.jsoup.parser.ParseErrorList parseErrorList69 = null;
        org.jsoup.parser.Tokeniser tokeniser70 = new org.jsoup.parser.Tokeniser(characterReader68, parseErrorList69);
        org.jsoup.parser.Token.Tag tag71 = tokeniser70.tagPending;
        org.jsoup.parser.Token.Tag tag72 = tokeniser70.tagPending;
        org.jsoup.parser.Token.Tag tag74 = tokeniser70.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader75 = null;
        org.jsoup.parser.ParseErrorList parseErrorList76 = null;
        org.jsoup.parser.Tokeniser tokeniser77 = new org.jsoup.parser.Tokeniser(characterReader75, parseErrorList76);
        org.jsoup.parser.TokeniserState tokeniserState78 = tokeniser77.getState();
        java.lang.StringBuilder stringBuilder79 = tokeniser77.dataBuffer;
        org.jsoup.parser.Token.Tag tag81 = tokeniser77.createTagPending(true);
        tokeniser70.emit((org.jsoup.parser.Token) tag81);
        java.lang.StringBuilder stringBuilder83 = tokeniser70.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState84 = tokeniser70.getState();
        tokeniser67.transition(tokeniserState84);
        tokeniser60.transition(tokeniserState84);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag3);
        org.junit.Assert.assertNull(tag4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNull(stringBuilder11);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(token15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(tokeniserState32);
        org.junit.Assert.assertNull(comment33);
        org.junit.Assert.assertNotNull(tokeniserState34);
        org.junit.Assert.assertNotNull(tokeniserState38);
        org.junit.Assert.assertNull(stringBuilder39);
        org.junit.Assert.assertNotNull(tokeniserState43);
        org.junit.Assert.assertNull(comment44);
        org.junit.Assert.assertNotNull(comment46);
        org.junit.Assert.assertNotNull(doctype51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNull(comment55);
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertNull(tag61);
        org.junit.Assert.assertNull(comment64);
        org.junit.Assert.assertNull(tag71);
        org.junit.Assert.assertNull(tag72);
        org.junit.Assert.assertNotNull(tag74);
        org.junit.Assert.assertNotNull(tokeniserState78);
        org.junit.Assert.assertNull(stringBuilder79);
        org.junit.Assert.assertNotNull(tag81);
        org.junit.Assert.assertNull(stringBuilder83);
        org.junit.Assert.assertNotNull(tokeniserState84);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        org.jsoup.parser.Token.Comment comment4 = tokeniser2.commentPending;
        org.jsoup.parser.TokeniserState tokeniserState5 = null;
        tokeniser2.transition(tokeniserState5);
        java.lang.StringBuilder stringBuilder7 = tokeniser2.dataBuffer;
        tokeniser2.createDoctypePending();
        tokeniser2.createDoctypePending();
        tokeniser2.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader11, parseErrorList12);
        tokeniser13.acknowledgeSelfClosingFlag();
        tokeniser13.createCommentPending();
        tokeniser13.createDoctypePending();
        org.jsoup.parser.Token.Comment comment17 = tokeniser13.commentPending;
        org.jsoup.parser.TokeniserState tokeniserState18 = tokeniser13.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNull(comment4);
        org.junit.Assert.assertNull(stringBuilder7);
        org.junit.Assert.assertNotNull(comment17);
        org.junit.Assert.assertNotNull(tokeniserState18);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag3 = tokeniser2.tagPending;
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.tagPending;
        org.jsoup.parser.Token.Tag tag6 = tokeniser2.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser9.getState();
        java.lang.StringBuilder stringBuilder11 = tokeniser9.dataBuffer;
        org.jsoup.parser.Token.Tag tag13 = tokeniser9.createTagPending(true);
        tokeniser2.emit((org.jsoup.parser.Token) tag13);
        java.lang.String str15 = tokeniser2.appropriateEndTagName();
        org.jsoup.parser.Token.Tag tag16 = tokeniser2.tagPending;
        tokeniser2.emit("");
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader19, parseErrorList20);
        org.jsoup.parser.Token.Tag tag22 = tokeniser21.tagPending;
        org.jsoup.parser.Token.Tag tag23 = tokeniser21.tagPending;
        org.jsoup.parser.Token.Tag tag25 = tokeniser21.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader26, parseErrorList27);
        org.jsoup.parser.TokeniserState tokeniserState29 = tokeniser28.getState();
        java.lang.StringBuilder stringBuilder30 = tokeniser28.dataBuffer;
        org.jsoup.parser.Token.Tag tag32 = tokeniser28.createTagPending(true);
        tokeniser21.emit((org.jsoup.parser.Token) tag32);
        java.lang.String str34 = tokeniser21.appropriateEndTagName();
        tokeniser21.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.Tokeniser tokeniser38 = new org.jsoup.parser.Tokeniser(characterReader36, parseErrorList37);
        org.jsoup.parser.Token.Tag tag39 = tokeniser38.tagPending;
        org.jsoup.parser.Token.Tag tag40 = tokeniser38.tagPending;
        org.jsoup.parser.Token.Tag tag42 = tokeniser38.createTagPending(false);
        tokeniser21.tagPending = tag42;
        tokeniser21.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState45 = tokeniser21.getState();
        org.jsoup.parser.CharacterReader characterReader46 = null;
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        org.jsoup.parser.Tokeniser tokeniser48 = new org.jsoup.parser.Tokeniser(characterReader46, parseErrorList47);
        tokeniser48.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader50 = null;
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.Tokeniser tokeniser52 = new org.jsoup.parser.Tokeniser(characterReader50, parseErrorList51);
        org.jsoup.parser.TokeniserState tokeniserState53 = tokeniser52.getState();
        org.jsoup.parser.Token.Comment comment54 = tokeniser52.commentPending;
        tokeniser52.createCommentPending();
        org.jsoup.parser.Token.Comment comment56 = tokeniser52.commentPending;
        tokeniser48.commentPending = comment56;
        java.lang.StringBuilder stringBuilder58 = tokeniser48.dataBuffer;
        tokeniser21.dataBuffer = stringBuilder58;
        org.jsoup.parser.CharacterReader characterReader60 = null;
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        org.jsoup.parser.Tokeniser tokeniser62 = new org.jsoup.parser.Tokeniser(characterReader60, parseErrorList61);
        org.jsoup.parser.Token.Tag tag63 = tokeniser62.tagPending;
        org.jsoup.parser.Token.Tag tag64 = tokeniser62.tagPending;
        org.jsoup.parser.Token.Tag tag66 = tokeniser62.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader67 = null;
        org.jsoup.parser.ParseErrorList parseErrorList68 = null;
        org.jsoup.parser.Tokeniser tokeniser69 = new org.jsoup.parser.Tokeniser(characterReader67, parseErrorList68);
        org.jsoup.parser.TokeniserState tokeniserState70 = tokeniser69.getState();
        java.lang.StringBuilder stringBuilder71 = tokeniser69.dataBuffer;
        org.jsoup.parser.Token.Tag tag73 = tokeniser69.createTagPending(true);
        tokeniser62.emit((org.jsoup.parser.Token) tag73);
        java.lang.String str75 = tokeniser62.appropriateEndTagName();
        tokeniser62.createTempBuffer();
        tokeniser62.createDoctypePending();
        tokeniser62.emit('a');
        org.jsoup.parser.Token.Doctype doctype80 = tokeniser62.doctypePending;
        tokeniser21.doctypePending = doctype80;
        tokeniser2.doctypePending = doctype80;
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.emit('a');
        org.junit.Assert.assertNull(tag3);
        org.junit.Assert.assertNull(tag4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNull(stringBuilder11);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(tag22);
        org.junit.Assert.assertNull(tag23);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(tokeniserState29);
        org.junit.Assert.assertNull(stringBuilder30);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(tag39);
        org.junit.Assert.assertNull(tag40);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertNotNull(tokeniserState45);
        org.junit.Assert.assertNotNull(tokeniserState53);
        org.junit.Assert.assertNull(comment54);
        org.junit.Assert.assertNotNull(comment56);
        org.junit.Assert.assertNotNull(stringBuilder58);
        org.junit.Assert.assertEquals(stringBuilder58.toString(), "");
        org.junit.Assert.assertNull(tag63);
        org.junit.Assert.assertNull(tag64);
        org.junit.Assert.assertNotNull(tag66);
        org.junit.Assert.assertNotNull(tokeniserState70);
        org.junit.Assert.assertNull(stringBuilder71);
        org.junit.Assert.assertNotNull(tag73);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNotNull(doctype80);
    }
}

