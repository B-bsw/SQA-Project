package org.jsoup.parser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

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
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag6 = tokeniser1.createTagPending(false);
        tokeniser1.createCommentPending();
        tokeniser1.emit("hi!");
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag9 = tokeniser6.createTagPending(true);
        tokeniser1.emit((org.jsoup.parser.Token) tag9);
        tokeniser1.emit(' ');
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        boolean boolean17 = tokeniser16.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype18 = tokeniser16.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser16.transition(tokeniserState19);
        org.jsoup.parser.Token.Comment comment21 = tokeniser16.commentPending;
        tokeniser16.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        boolean boolean25 = tokeniser24.currentNodeInHtmlNS();
        tokeniser24.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState27 = tokeniser24.getState();
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader28);
        tokeniser29.emit("");
        org.jsoup.parser.Token.Doctype doctype32 = null;
        tokeniser29.doctypePending = doctype32;
        tokeniser29.createTempBuffer();
        tokeniser29.emit("");
        org.jsoup.parser.Token.Comment comment37 = null;
        tokeniser29.commentPending = comment37;
        org.jsoup.parser.Token.Comment comment39 = null;
        tokeniser29.commentPending = comment39;
        org.jsoup.parser.Token.Doctype doctype41 = null;
        tokeniser29.doctypePending = doctype41;
        java.lang.StringBuilder stringBuilder43 = tokeniser29.dataBuffer;
        tokeniser24.dataBuffer = stringBuilder43;
        tokeniser16.dataBuffer = stringBuilder43;
        tokeniser1.dataBuffer = stringBuilder43;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader48 = null;
        org.jsoup.parser.Tokeniser tokeniser49 = new org.jsoup.parser.Tokeniser(characterReader48);
        tokeniser49.emit('4');
        tokeniser49.createTempBuffer();
        tokeniser49.setTrackErrors(false);
        tokeniser49.createTempBuffer();
        org.jsoup.parser.Token.Doctype doctype56 = tokeniser49.doctypePending;
        org.jsoup.parser.CharacterReader characterReader57 = null;
        org.jsoup.parser.Tokeniser tokeniser58 = new org.jsoup.parser.Tokeniser(characterReader57);
        boolean boolean59 = tokeniser58.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader60 = null;
        org.jsoup.parser.Tokeniser tokeniser61 = new org.jsoup.parser.Tokeniser(characterReader60);
        boolean boolean62 = tokeniser61.currentNodeInHtmlNS();
        tokeniser61.createCommentPending();
        boolean boolean64 = tokeniser61.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment65 = tokeniser61.commentPending;
        tokeniser58.commentPending = comment65;
        tokeniser49.commentPending = comment65;
        boolean boolean68 = tokeniser49.isTrackErrors();
        org.jsoup.parser.Token.Comment comment69 = tokeniser49.commentPending;
        tokeniser1.commentPending = comment69;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(doctype18);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNull(comment21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tokeniserState27);
        org.junit.Assert.assertNotNull(stringBuilder43);
        org.junit.Assert.assertEquals(stringBuilder43.toString(), "");
        org.junit.Assert.assertNull(doctype56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(comment65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(comment69);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        org.jsoup.parser.Token.Comment comment9 = null;
        tokeniser1.commentPending = comment9;
        org.jsoup.parser.Token.Comment comment11 = null;
        tokeniser1.commentPending = comment11;
        org.jsoup.parser.Token.Doctype doctype13 = null;
        tokeniser1.doctypePending = doctype13;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment16 = null;
        tokeniser1.commentPending = comment16;
        org.jsoup.parser.Token.Doctype doctype18 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState19 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        boolean boolean22 = tokeniser21.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag24 = tokeniser21.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader25);
        boolean boolean27 = tokeniser26.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag29 = tokeniser26.createTagPending(true);
        tokeniser21.emit((org.jsoup.parser.Token) tag29);
        boolean boolean31 = tokeniser21.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader32);
        boolean boolean34 = tokeniser33.currentNodeInHtmlNS();
        tokeniser33.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader36);
        tokeniser37.emit('4');
        org.jsoup.parser.CharacterReader characterReader40 = null;
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader40);
        boolean boolean42 = tokeniser41.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag44 = tokeniser41.createTagPending(true);
        tokeniser37.tagPending = tag44;
        tokeniser33.emit((org.jsoup.parser.Token) tag44);
        tokeniser21.tagPending = tag44;
        org.jsoup.parser.Token.Tag tag48 = tokeniser21.tagPending;
        tokeniser1.emit((org.jsoup.parser.Token) tag48);
        org.jsoup.parser.Token.Comment comment50 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Tag tag51 = tokeniser1.tagPending;
        boolean boolean52 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag54 = tokeniser1.createTagPending(true);
        org.junit.Assert.assertNull(doctype18);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertNull(comment50);
        org.junit.Assert.assertNull(tag51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(tag54);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        tokeniser10.emit("");
        tokeniser10.emit("");
        tokeniser10.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState16 = tokeniser10.getState();
        boolean boolean17 = tokeniser10.currentNodeInHtmlNS();
        java.lang.StringBuilder stringBuilder18 = tokeniser10.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder18;
        java.lang.StringBuilder stringBuilder20 = tokeniser1.dataBuffer;
        tokeniser1.emit(' ');
        org.jsoup.parser.Token.Tag tag23 = null;
        tokeniser1.tagPending = tag23;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        org.jsoup.parser.Token.Doctype doctype6 = null;
        tokeniser1.doctypePending = doctype6;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Doctype doctype9 = null;
        tokeniser1.doctypePending = doctype9;
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Tag tag12 = tokeniser1.tagPending;
        org.jsoup.parser.Token.Doctype doctype13 = tokeniser1.doctypePending;
        org.junit.Assert.assertNull(tag12);
        org.junit.Assert.assertNull(doctype13);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        tokeniser5.emit('4');
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        boolean boolean10 = tokeniser9.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag12 = tokeniser9.createTagPending(true);
        tokeniser5.tagPending = tag12;
        tokeniser1.emit((org.jsoup.parser.Token) tag12);
        tokeniser1.emit("");
        boolean boolean17 = tokeniser1.isTrackErrors();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag9 = tokeniser6.createTagPending(true);
        tokeniser1.emit((org.jsoup.parser.Token) tag9);
        boolean boolean11 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        boolean boolean14 = tokeniser13.currentNodeInHtmlNS();
        tokeniser13.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        tokeniser17.emit('4');
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        boolean boolean22 = tokeniser21.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag24 = tokeniser21.createTagPending(true);
        tokeniser17.tagPending = tag24;
        tokeniser13.emit((org.jsoup.parser.Token) tag24);
        tokeniser1.tagPending = tag24;
        org.jsoup.parser.Token.Tag tag28 = tokeniser1.tagPending;
        org.jsoup.parser.Token.Comment comment29 = tokeniser1.commentPending;
        boolean boolean30 = tokeniser1.isTrackErrors();
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        tokeniser32.emit("");
        tokeniser32.emit("");
        tokeniser32.createTempBuffer();
        org.jsoup.parser.Token.Tag tag39 = tokeniser32.createTagPending(true);
        java.lang.StringBuilder stringBuilder40 = tokeniser32.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader41 = null;
        org.jsoup.parser.Tokeniser tokeniser42 = new org.jsoup.parser.Tokeniser(characterReader41);
        tokeniser42.emit("");
        org.jsoup.parser.Token.Doctype doctype45 = null;
        tokeniser42.doctypePending = doctype45;
        tokeniser42.createTempBuffer();
        tokeniser42.emit("");
        org.jsoup.parser.Token.Comment comment50 = null;
        tokeniser42.commentPending = comment50;
        org.jsoup.parser.Token.Comment comment52 = null;
        tokeniser42.commentPending = comment52;
        org.jsoup.parser.Token.Doctype doctype54 = null;
        tokeniser42.doctypePending = doctype54;
        java.lang.StringBuilder stringBuilder56 = tokeniser42.dataBuffer;
        java.lang.StringBuilder stringBuilder57 = tokeniser42.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader58 = null;
        org.jsoup.parser.Tokeniser tokeniser59 = new org.jsoup.parser.Tokeniser(characterReader58);
        boolean boolean60 = tokeniser59.currentNodeInHtmlNS();
        tokeniser59.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader62 = null;
        org.jsoup.parser.Tokeniser tokeniser63 = new org.jsoup.parser.Tokeniser(characterReader62);
        tokeniser63.emit('4');
        org.jsoup.parser.CharacterReader characterReader66 = null;
        org.jsoup.parser.Tokeniser tokeniser67 = new org.jsoup.parser.Tokeniser(characterReader66);
        boolean boolean68 = tokeniser67.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag70 = tokeniser67.createTagPending(true);
        tokeniser63.tagPending = tag70;
        tokeniser59.emit((org.jsoup.parser.Token) tag70);
        tokeniser59.createTempBuffer();
        tokeniser59.acknowledgeSelfClosingFlag();
        tokeniser59.setTrackErrors(false);
        org.jsoup.parser.Token.Tag tag77 = tokeniser59.tagPending;
        org.jsoup.parser.Token.Tag tag79 = tokeniser59.createTagPending(true);
        tokeniser42.emit((org.jsoup.parser.Token) tag79);
        tokeniser32.tagPending = tag79;
        tokeniser1.tagPending = tag79;
        tokeniser1.emit("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char87 = tokeniser1.consumeCharacterReference((java.lang.Character) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNull(comment29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(stringBuilder40);
        org.junit.Assert.assertEquals(stringBuilder40.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder56);
        org.junit.Assert.assertEquals(stringBuilder56.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder57);
        org.junit.Assert.assertEquals(stringBuilder57.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(tag70);
        org.junit.Assert.assertNull(tag77);
        org.junit.Assert.assertNotNull(tag79);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.Token.Doctype doctype5 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState6 = tokeniser1.getState();
        org.jsoup.parser.Token.Tag tag7 = tokeniser1.tagPending;
        org.jsoup.parser.Token.Doctype doctype8 = null;
        tokeniser1.doctypePending = doctype8;
        tokeniser1.createTempBuffer();
        org.junit.Assert.assertNull(doctype5);
        org.junit.Assert.assertNotNull(tokeniserState6);
        org.junit.Assert.assertNull(tag7);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        org.jsoup.parser.Token.Doctype doctype4 = tokeniser1.doctypePending;
        tokeniser1.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        tokeniser8.emit("");
        org.jsoup.parser.Token.Doctype doctype11 = null;
        tokeniser8.doctypePending = doctype11;
        tokeniser8.createTempBuffer();
        tokeniser8.emit("");
        org.jsoup.parser.TokeniserState tokeniserState16 = tokeniser8.getState();
        tokeniser8.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        tokeniser19.emit('4');
        tokeniser19.createTempBuffer();
        tokeniser19.setTrackErrors(false);
        tokeniser19.createCommentPending();
        org.jsoup.parser.Token.Tag tag26 = tokeniser19.tagPending;
        java.lang.StringBuilder stringBuilder27 = tokeniser19.dataBuffer;
        tokeniser8.dataBuffer = stringBuilder27;
        tokeniser8.createDoctypePending();
        org.jsoup.parser.Token.Comment comment30 = tokeniser8.commentPending;
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        tokeniser32.emit("");
        org.jsoup.parser.Token.Doctype doctype35 = null;
        tokeniser32.doctypePending = doctype35;
        tokeniser32.createTempBuffer();
        tokeniser32.emit("");
        org.jsoup.parser.Token.Comment comment40 = null;
        tokeniser32.commentPending = comment40;
        org.jsoup.parser.Token.Tag tag43 = tokeniser32.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader44 = null;
        org.jsoup.parser.Tokeniser tokeniser45 = new org.jsoup.parser.Tokeniser(characterReader44);
        boolean boolean46 = tokeniser45.currentNodeInHtmlNS();
        tokeniser45.emit('4');
        org.jsoup.parser.CharacterReader characterReader49 = null;
        org.jsoup.parser.Tokeniser tokeniser50 = new org.jsoup.parser.Tokeniser(characterReader49);
        boolean boolean51 = tokeniser50.currentNodeInHtmlNS();
        tokeniser50.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader53 = null;
        org.jsoup.parser.Tokeniser tokeniser54 = new org.jsoup.parser.Tokeniser(characterReader53);
        tokeniser54.emit('4');
        org.jsoup.parser.CharacterReader characterReader57 = null;
        org.jsoup.parser.Tokeniser tokeniser58 = new org.jsoup.parser.Tokeniser(characterReader57);
        boolean boolean59 = tokeniser58.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag61 = tokeniser58.createTagPending(true);
        tokeniser54.tagPending = tag61;
        tokeniser50.emit((org.jsoup.parser.Token) tag61);
        tokeniser45.emit((org.jsoup.parser.Token) tag61);
        tokeniser32.emit((org.jsoup.parser.Token) tag61);
        org.jsoup.parser.Token token66 = tokeniser32.read();
        org.jsoup.parser.CharacterReader characterReader67 = null;
        org.jsoup.parser.Tokeniser tokeniser68 = new org.jsoup.parser.Tokeniser(characterReader67);
        tokeniser68.emit("");
        org.jsoup.parser.CharacterReader characterReader71 = null;
        org.jsoup.parser.Tokeniser tokeniser72 = new org.jsoup.parser.Tokeniser(characterReader71);
        boolean boolean73 = tokeniser72.currentNodeInHtmlNS();
        tokeniser72.createCommentPending();
        boolean boolean75 = tokeniser72.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag76 = null;
        tokeniser72.tagPending = tag76;
        org.jsoup.parser.CharacterReader characterReader78 = null;
        org.jsoup.parser.Tokeniser tokeniser79 = new org.jsoup.parser.Tokeniser(characterReader78);
        boolean boolean80 = tokeniser79.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader81 = null;
        org.jsoup.parser.Tokeniser tokeniser82 = new org.jsoup.parser.Tokeniser(characterReader81);
        tokeniser82.emit('4');
        org.jsoup.parser.CharacterReader characterReader85 = null;
        org.jsoup.parser.Tokeniser tokeniser86 = new org.jsoup.parser.Tokeniser(characterReader85);
        boolean boolean87 = tokeniser86.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag89 = tokeniser86.createTagPending(true);
        tokeniser82.tagPending = tag89;
        tokeniser79.tagPending = tag89;
        tokeniser72.tagPending = tag89;
        tokeniser68.emit((org.jsoup.parser.Token) tag89);
        tokeniser32.emit((org.jsoup.parser.Token) tag89);
        tokeniser32.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder97 = tokeniser32.dataBuffer;
        tokeniser8.dataBuffer = stringBuilder97;
        tokeniser1.dataBuffer = stringBuilder97;
        org.junit.Assert.assertNull(doctype4);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNull(tag26);
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertNull(comment30);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertNotNull(token66);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(tag89);
        org.junit.Assert.assertNotNull(stringBuilder97);
        org.junit.Assert.assertEquals(stringBuilder97.toString(), "");
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser1.getState();
        tokeniser1.createDoctypePending();
        tokeniser1.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        tokeniser10.emit('4');
        tokeniser10.createTempBuffer();
        tokeniser10.setTrackErrors(false);
        tokeniser10.createCommentPending();
        org.jsoup.parser.Token.Tag tag17 = tokeniser10.tagPending;
        org.jsoup.parser.Token.Tag tag18 = tokeniser10.tagPending;
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        tokeniser20.emit('4');
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        boolean boolean25 = tokeniser24.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag27 = tokeniser24.createTagPending(true);
        tokeniser20.tagPending = tag27;
        tokeniser20.acknowledgeSelfClosingFlag();
        org.jsoup.parser.TokeniserState tokeniserState30 = tokeniser20.getState();
        tokeniser10.eofError(tokeniserState30);
        tokeniser10.acknowledgeSelfClosingFlag();
        java.lang.StringBuilder stringBuilder33 = tokeniser10.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder33;
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertNull(tag17);
        org.junit.Assert.assertNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(tokeniserState30);
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertEquals(stringBuilder33.toString(), "");
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser1.doctypePending;
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNull(doctype11);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader3 = null;
        org.jsoup.parser.Tokeniser tokeniser4 = new org.jsoup.parser.Tokeniser(characterReader3);
        tokeniser4.emit('4');
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        boolean boolean9 = tokeniser8.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag11 = tokeniser8.createTagPending(true);
        tokeniser4.tagPending = tag11;
        tokeniser1.tagPending = tag11;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState15 = tokeniser1.getState();
        org.jsoup.parser.Token.Doctype doctype16 = null;
        tokeniser1.doctypePending = doctype16;
        org.jsoup.parser.TokeniserState tokeniserState18 = org.jsoup.parser.TokeniserState.CharacterReferenceInData;
        tokeniser1.transition(tokeniserState18);
        org.jsoup.parser.Token.Tag tag21 = tokeniser1.createTagPending(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tag21);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader3 = null;
        org.jsoup.parser.Tokeniser tokeniser4 = new org.jsoup.parser.Tokeniser(characterReader3);
        tokeniser4.emit('4');
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        boolean boolean9 = tokeniser8.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag11 = tokeniser8.createTagPending(true);
        tokeniser4.tagPending = tag11;
        tokeniser1.tagPending = tag11;
        org.jsoup.parser.TokeniserState tokeniserState14 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        boolean boolean17 = tokeniser16.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype18 = tokeniser16.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser16.transition(tokeniserState19);
        tokeniser1.transition(tokeniserState19);
        tokeniser1.emitTagPending();
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        boolean boolean25 = tokeniser24.currentNodeInHtmlNS();
        tokeniser24.createCommentPending();
        boolean boolean27 = tokeniser24.currentNodeInHtmlNS();
        tokeniser24.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader29);
        boolean boolean31 = tokeniser30.currentNodeInHtmlNS();
        tokeniser30.createCommentPending();
        tokeniser30.emitCommentPending();
        java.lang.StringBuilder stringBuilder34 = null;
        tokeniser30.dataBuffer = stringBuilder34;
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader36);
        tokeniser37.emit("");
        org.jsoup.parser.Token.Doctype doctype40 = null;
        tokeniser37.doctypePending = doctype40;
        tokeniser37.createTempBuffer();
        tokeniser37.emit("");
        org.jsoup.parser.Token.Comment comment45 = null;
        tokeniser37.commentPending = comment45;
        org.jsoup.parser.Token.Tag tag48 = tokeniser37.createTagPending(false);
        tokeniser30.tagPending = tag48;
        org.jsoup.parser.CharacterReader characterReader50 = null;
        org.jsoup.parser.Tokeniser tokeniser51 = new org.jsoup.parser.Tokeniser(characterReader50);
        tokeniser51.emit("");
        tokeniser51.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState55 = tokeniser51.getState();
        tokeniser51.createDoctypePending();
        org.jsoup.parser.Token.Tag tag58 = tokeniser51.createTagPending(false);
        org.jsoup.parser.Token.Tag tag59 = tokeniser51.tagPending;
        org.jsoup.parser.Token.Doctype doctype60 = tokeniser51.doctypePending;
        tokeniser30.doctypePending = doctype60;
        tokeniser24.doctypePending = doctype60;
        tokeniser1.doctypePending = doctype60;
        tokeniser1.setTrackErrors(false);
        tokeniser1.createDoctypePending();
        java.lang.StringBuilder stringBuilder67 = null;
        tokeniser1.dataBuffer = stringBuilder67;
        java.lang.StringBuilder stringBuilder69 = tokeniser1.dataBuffer;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(doctype18);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertNotNull(tokeniserState55);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertNotNull(tag59);
        org.junit.Assert.assertNotNull(doctype60);
        org.junit.Assert.assertNull(stringBuilder69);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.Token.Comment comment2 = tokeniser1.commentPending;
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser1.getState();
        tokeniser1.emit("hi!");
        tokeniser1.createDoctypePending();
        java.lang.StringBuilder stringBuilder7 = tokeniser1.dataBuffer;
        tokeniser1.setTrackErrors(true);
        boolean boolean10 = tokeniser1.isTrackErrors();
        org.junit.Assert.assertNull(comment2);
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNull(stringBuilder7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        org.jsoup.parser.Token.Tag tag6 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        tokeniser8.emit("");
        tokeniser8.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState12 = tokeniser8.getState();
        tokeniser8.createDoctypePending();
        org.jsoup.parser.Token.Tag tag15 = tokeniser8.createTagPending(false);
        tokeniser1.tagPending = tag15;
        boolean boolean17 = tokeniser1.isTrackErrors();
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        org.jsoup.parser.TokeniserState tokeniserState22 = tokeniser21.getState();
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        boolean boolean25 = tokeniser24.currentNodeInHtmlNS();
        tokeniser24.createCommentPending();
        boolean boolean27 = tokeniser24.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment28 = tokeniser24.commentPending;
        tokeniser21.commentPending = comment28;
        tokeniser19.commentPending = comment28;
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        boolean boolean33 = tokeniser32.currentNodeInHtmlNS();
        tokeniser32.emit('4');
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader36);
        boolean boolean38 = tokeniser37.currentNodeInHtmlNS();
        tokeniser37.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader40 = null;
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader40);
        tokeniser41.emit('4');
        org.jsoup.parser.CharacterReader characterReader44 = null;
        org.jsoup.parser.Tokeniser tokeniser45 = new org.jsoup.parser.Tokeniser(characterReader44);
        boolean boolean46 = tokeniser45.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag48 = tokeniser45.createTagPending(true);
        tokeniser41.tagPending = tag48;
        tokeniser37.emit((org.jsoup.parser.Token) tag48);
        tokeniser32.emit((org.jsoup.parser.Token) tag48);
        tokeniser19.tagPending = tag48;
        org.jsoup.parser.CharacterReader characterReader53 = null;
        org.jsoup.parser.Tokeniser tokeniser54 = new org.jsoup.parser.Tokeniser(characterReader53);
        tokeniser54.emit("");
        org.jsoup.parser.Token.Doctype doctype57 = null;
        tokeniser54.doctypePending = doctype57;
        tokeniser54.createTempBuffer();
        tokeniser54.emit("");
        org.jsoup.parser.Token.Comment comment62 = null;
        tokeniser54.commentPending = comment62;
        org.jsoup.parser.Token.Comment comment64 = null;
        tokeniser54.commentPending = comment64;
        org.jsoup.parser.Token.Doctype doctype66 = null;
        tokeniser54.doctypePending = doctype66;
        java.lang.StringBuilder stringBuilder68 = tokeniser54.dataBuffer;
        tokeniser19.dataBuffer = stringBuilder68;
        org.jsoup.parser.CharacterReader characterReader70 = null;
        org.jsoup.parser.Tokeniser tokeniser71 = new org.jsoup.parser.Tokeniser(characterReader70);
        boolean boolean72 = tokeniser71.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag74 = tokeniser71.createTagPending(true);
        tokeniser19.tagPending = tag74;
        org.jsoup.parser.TokeniserState tokeniserState76 = tokeniser19.getState();
        tokeniser1.transition(tokeniserState76);
        org.jsoup.parser.Token.Comment comment78 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Doctype doctype79 = tokeniser1.doctypePending;
        org.junit.Assert.assertNull(tag6);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(tokeniserState22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(comment28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertNotNull(stringBuilder68);
        org.junit.Assert.assertEquals(stringBuilder68.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(tag74);
        org.junit.Assert.assertNotNull(tokeniserState76);
        org.junit.Assert.assertNull(comment78);
        org.junit.Assert.assertNull(doctype79);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        tokeniser1.emitCommentPending();
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        tokeniser6.emit('4');
        tokeniser6.createTempBuffer();
        tokeniser6.setTrackErrors(false);
        tokeniser6.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState13 = org.jsoup.parser.TokeniserState.TagOpen;
        tokeniser6.eofError(tokeniserState13);
        tokeniser6.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        tokeniser18.emit("");
        org.jsoup.parser.Token.Doctype doctype21 = null;
        tokeniser18.doctypePending = doctype21;
        tokeniser18.createTempBuffer();
        tokeniser18.emit("");
        org.jsoup.parser.Token.Comment comment26 = null;
        tokeniser18.commentPending = comment26;
        org.jsoup.parser.Token.Comment comment28 = null;
        tokeniser18.commentPending = comment28;
        org.jsoup.parser.Token.Doctype doctype30 = null;
        tokeniser18.doctypePending = doctype30;
        java.lang.StringBuilder stringBuilder32 = tokeniser18.dataBuffer;
        tokeniser6.dataBuffer = stringBuilder32;
        org.jsoup.parser.Token.Tag tag35 = tokeniser6.createTagPending(false);
        tokeniser1.tagPending = tag35;
        boolean boolean37 = tokeniser1.isTrackErrors();
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader38);
        tokeniser39.emit("");
        tokeniser39.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState43 = tokeniser39.getState();
        java.lang.StringBuilder stringBuilder44 = null;
        tokeniser39.dataBuffer = stringBuilder44;
        org.jsoup.parser.TokeniserState tokeniserState46 = tokeniser39.getState();
        tokeniser39.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype48 = tokeniser39.doctypePending;
        tokeniser39.setTrackErrors(false);
        tokeniser39.createCommentPending();
        org.jsoup.parser.Token.Comment comment52 = tokeniser39.commentPending;
        org.jsoup.parser.Token.Comment comment53 = tokeniser39.commentPending;
        org.jsoup.parser.CharacterReader characterReader54 = null;
        org.jsoup.parser.Tokeniser tokeniser55 = new org.jsoup.parser.Tokeniser(characterReader54);
        tokeniser55.emit('4');
        org.jsoup.parser.CharacterReader characterReader58 = null;
        org.jsoup.parser.Tokeniser tokeniser59 = new org.jsoup.parser.Tokeniser(characterReader58);
        boolean boolean60 = tokeniser59.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag62 = tokeniser59.createTagPending(true);
        tokeniser55.tagPending = tag62;
        org.jsoup.parser.TokeniserState tokeniserState64 = tokeniser55.getState();
        tokeniser39.transition(tokeniserState64);
        tokeniser1.transition(tokeniserState64);
        org.jsoup.parser.Token.Tag tag67 = tokeniser1.tagPending;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNotNull(stringBuilder32);
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "");
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(tokeniserState43);
        org.junit.Assert.assertNotNull(tokeniserState46);
        org.junit.Assert.assertNull(doctype48);
        org.junit.Assert.assertNotNull(comment52);
        org.junit.Assert.assertNotNull(comment53);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(tag62);
        org.junit.Assert.assertNotNull(tokeniserState64);
        org.junit.Assert.assertNotNull(tag67);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        org.jsoup.parser.Token.Comment comment9 = null;
        tokeniser1.commentPending = comment9;
        org.jsoup.parser.Token.Tag tag12 = tokeniser1.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        boolean boolean15 = tokeniser14.currentNodeInHtmlNS();
        tokeniser14.emit('4');
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        boolean boolean20 = tokeniser19.currentNodeInHtmlNS();
        tokeniser19.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        tokeniser23.emit('4');
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader26);
        boolean boolean28 = tokeniser27.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag30 = tokeniser27.createTagPending(true);
        tokeniser23.tagPending = tag30;
        tokeniser19.emit((org.jsoup.parser.Token) tag30);
        tokeniser14.emit((org.jsoup.parser.Token) tag30);
        tokeniser1.emit((org.jsoup.parser.Token) tag30);
        tokeniser1.emit('#');
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.CharacterReader characterReader39 = null;
        org.jsoup.parser.Tokeniser tokeniser40 = new org.jsoup.parser.Tokeniser(characterReader39);
        tokeniser40.emit("");
        org.jsoup.parser.Token.Doctype doctype43 = null;
        tokeniser40.doctypePending = doctype43;
        tokeniser40.createTempBuffer();
        tokeniser40.emit("");
        org.jsoup.parser.Token.Comment comment48 = null;
        tokeniser40.commentPending = comment48;
        org.jsoup.parser.Token.Comment comment50 = null;
        tokeniser40.commentPending = comment50;
        org.jsoup.parser.Token.Doctype doctype52 = null;
        tokeniser40.doctypePending = doctype52;
        tokeniser40.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment55 = null;
        tokeniser40.commentPending = comment55;
        org.jsoup.parser.Token.Doctype doctype57 = tokeniser40.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState58 = tokeniser40.getState();
        tokeniser1.transition(tokeniserState58);
        boolean boolean60 = tokeniser1.currentNodeInHtmlNS();
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNull(doctype57);
        org.junit.Assert.assertNotNull(tokeniserState58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        tokeniser1.createDoctypePending();
        java.lang.StringBuilder stringBuilder8 = tokeniser1.dataBuffer;
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.ScriptDataEscapedLessthanSign;
        tokeniser1.eofError(tokeniserState11);
        org.jsoup.parser.Token.Doctype doctype13 = tokeniser1.doctypePending;
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        tokeniser15.emit("");
        org.jsoup.parser.Token.Doctype doctype18 = null;
        tokeniser15.doctypePending = doctype18;
        tokeniser15.createTempBuffer();
        tokeniser15.emit("");
        org.jsoup.parser.Token.Comment comment23 = null;
        tokeniser15.commentPending = comment23;
        org.jsoup.parser.Token.Tag tag26 = tokeniser15.createTagPending(false);
        org.jsoup.parser.TokeniserState tokeniserState27 = tokeniser15.getState();
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader28);
        tokeniser29.emit("");
        tokeniser29.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState33 = tokeniser29.getState();
        tokeniser29.createDoctypePending();
        org.jsoup.parser.Token.Tag tag36 = tokeniser29.createTagPending(false);
        org.jsoup.parser.Token.Tag tag37 = tokeniser29.tagPending;
        org.jsoup.parser.Token.Doctype doctype38 = tokeniser29.doctypePending;
        tokeniser15.emit((org.jsoup.parser.Token) doctype38);
        tokeniser1.doctypePending = doctype38;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNull(stringBuilder8);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(doctype13);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(tokeniserState27);
        org.junit.Assert.assertNotNull(tokeniserState33);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertNotNull(doctype38);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.emit('\ufffd');
        java.lang.StringBuilder stringBuilder7 = tokeniser1.dataBuffer;
        tokeniser1.emit('a');
        org.jsoup.parser.Token.Tag tag11 = tokeniser1.createTagPending(true);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        org.jsoup.parser.Token.Comment comment6 = null;
        tokeniser1.commentPending = comment6;
        org.jsoup.parser.Token.Tag tag8 = tokeniser1.tagPending;
        org.jsoup.parser.Token.Doctype doctype9 = null;
        tokeniser1.doctypePending = doctype9;
        java.lang.StringBuilder stringBuilder11 = tokeniser1.dataBuffer;
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser1.doctypePending;
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        tokeniser14.emit("");
        tokeniser14.createTempBuffer();
        org.jsoup.parser.Token.Doctype doctype18 = tokeniser14.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState19 = tokeniser14.getState();
        java.lang.StringBuilder stringBuilder20 = tokeniser14.dataBuffer;
        tokeniser14.acknowledgeSelfClosingFlag();
        tokeniser14.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        tokeniser24.emit("");
        tokeniser24.emit("");
        tokeniser24.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState30 = tokeniser24.getState();
        tokeniser24.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader32);
        tokeniser33.emit("");
        tokeniser33.emit("");
        tokeniser33.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState39 = tokeniser33.getState();
        tokeniser33.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader41 = null;
        org.jsoup.parser.Tokeniser tokeniser42 = new org.jsoup.parser.Tokeniser(characterReader41);
        boolean boolean43 = tokeniser42.currentNodeInHtmlNS();
        tokeniser42.createCommentPending();
        tokeniser42.emitCommentPending();
        java.lang.StringBuilder stringBuilder46 = null;
        tokeniser42.dataBuffer = stringBuilder46;
        org.jsoup.parser.Token.Comment comment48 = tokeniser42.commentPending;
        tokeniser33.commentPending = comment48;
        tokeniser24.commentPending = comment48;
        tokeniser14.emit((org.jsoup.parser.Token) comment48);
        tokeniser1.commentPending = comment48;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char55 = tokeniser1.consumeCharacterReference((java.lang.Character) '\ufffd', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag8);
        org.junit.Assert.assertNull(stringBuilder11);
        org.junit.Assert.assertNull(doctype12);
        org.junit.Assert.assertNull(doctype18);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState30);
        org.junit.Assert.assertNotNull(tokeniserState39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(comment48);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        org.jsoup.parser.Token.Comment comment9 = null;
        tokeniser1.commentPending = comment9;
        org.jsoup.parser.Token.Tag tag12 = tokeniser1.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        boolean boolean15 = tokeniser14.currentNodeInHtmlNS();
        tokeniser14.emit('4');
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        boolean boolean20 = tokeniser19.currentNodeInHtmlNS();
        tokeniser19.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        tokeniser23.emit('4');
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader26);
        boolean boolean28 = tokeniser27.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag30 = tokeniser27.createTagPending(true);
        tokeniser23.tagPending = tag30;
        tokeniser19.emit((org.jsoup.parser.Token) tag30);
        tokeniser14.emit((org.jsoup.parser.Token) tag30);
        tokeniser1.emit((org.jsoup.parser.Token) tag30);
        tokeniser1.setTrackErrors(true);
        tokeniser1.createCommentPending();
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tag30);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.BeforeDoctypePublicIdentifier;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        boolean boolean3 = tokeniser2.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        tokeniser5.emit('4');
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        boolean boolean10 = tokeniser9.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag12 = tokeniser9.createTagPending(true);
        tokeniser5.tagPending = tag12;
        tokeniser2.tagPending = tag12;
        tokeniser2.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState16 = tokeniser2.getState();
        org.jsoup.parser.Token.Doctype doctype17 = null;
        tokeniser2.doctypePending = doctype17;
        boolean boolean19 = tokeniser2.currentNodeInHtmlNS();
        tokeniser2.emit("hi!");
        java.lang.StringBuilder stringBuilder22 = tokeniser2.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState23 = org.jsoup.parser.TokeniserState.ScriptData;
        tokeniser2.transition(tokeniserState23);
        org.jsoup.parser.Token.Doctype doctype25 = tokeniser2.doctypePending;
        tokeniser2.emit('#');
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader28);
        org.jsoup.parser.TokeniserState tokeniserState30 = tokeniser29.getState();
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        boolean boolean33 = tokeniser32.currentNodeInHtmlNS();
        tokeniser32.createCommentPending();
        boolean boolean35 = tokeniser32.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment36 = tokeniser32.commentPending;
        tokeniser29.commentPending = comment36;
        tokeniser29.createTempBuffer();
        tokeniser29.setTrackErrors(true);
        org.jsoup.parser.Token.Tag tag41 = tokeniser29.tagPending;
        org.jsoup.parser.CharacterReader characterReader42 = null;
        org.jsoup.parser.Tokeniser tokeniser43 = new org.jsoup.parser.Tokeniser(characterReader42);
        boolean boolean44 = tokeniser43.currentNodeInHtmlNS();
        tokeniser43.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader46 = null;
        org.jsoup.parser.Tokeniser tokeniser47 = new org.jsoup.parser.Tokeniser(characterReader46);
        tokeniser47.emit('4');
        org.jsoup.parser.CharacterReader characterReader50 = null;
        org.jsoup.parser.Tokeniser tokeniser51 = new org.jsoup.parser.Tokeniser(characterReader50);
        boolean boolean52 = tokeniser51.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag54 = tokeniser51.createTagPending(true);
        tokeniser47.tagPending = tag54;
        tokeniser43.emit((org.jsoup.parser.Token) tag54);
        tokeniser29.emit((org.jsoup.parser.Token) tag54);
        tokeniser2.tagPending = tag54;
        org.jsoup.parser.CharacterReader characterReader59 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(stringBuilder22);
        org.junit.Assert.assertNotNull(tokeniserState23);
        org.junit.Assert.assertNull(doctype25);
        org.junit.Assert.assertNotNull(tokeniserState30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(comment36);
        org.junit.Assert.assertNull(tag41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(tag54);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.emit('\ufffd');
        java.lang.StringBuilder stringBuilder7 = tokeniser1.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        boolean boolean10 = tokeniser9.currentNodeInHtmlNS();
        tokeniser9.createCommentPending();
        boolean boolean12 = tokeniser9.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment13 = tokeniser9.commentPending;
        tokeniser1.commentPending = comment13;
        org.jsoup.parser.Token.Doctype doctype15 = tokeniser1.doctypePending;
        tokeniser1.emitCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState17 = org.jsoup.parser.TokeniserState.CharacterReferenceInData;
        tokeniser1.transition(tokeniserState17);
        tokeniser1.emit('\ufffd');
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(comment13);
        org.junit.Assert.assertNull(doctype15);
        org.junit.Assert.assertNotNull(tokeniserState17);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AttributeName;
        org.jsoup.parser.Tokeniser tokeniser1 = null;
        org.jsoup.parser.CharacterReader characterReader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser1, characterReader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser1.getState();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag8 = tokeniser1.createTagPending(false);
        org.jsoup.parser.Token.Tag tag9 = tokeniser1.tagPending;
        org.jsoup.parser.Token.Doctype doctype10 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag12 = tokeniser1.createTagPending(false);
        tokeniser1.emit('#');
        tokeniser1.emit('#');
        boolean boolean17 = tokeniser1.currentNodeInHtmlNS();
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(doctype10);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        org.jsoup.parser.Token.Comment comment6 = null;
        tokeniser1.commentPending = comment6;
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        tokeniser11.emit("");
        org.jsoup.parser.Token.Doctype doctype14 = null;
        tokeniser11.doctypePending = doctype14;
        tokeniser11.createTempBuffer();
        tokeniser11.emit("");
        org.jsoup.parser.Token.Comment comment19 = null;
        tokeniser11.commentPending = comment19;
        org.jsoup.parser.Token.Tag tag22 = tokeniser11.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        boolean boolean25 = tokeniser24.currentNodeInHtmlNS();
        tokeniser24.emit('4');
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader28);
        boolean boolean30 = tokeniser29.currentNodeInHtmlNS();
        tokeniser29.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader32);
        tokeniser33.emit('4');
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader36);
        boolean boolean38 = tokeniser37.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag40 = tokeniser37.createTagPending(true);
        tokeniser33.tagPending = tag40;
        tokeniser29.emit((org.jsoup.parser.Token) tag40);
        tokeniser24.emit((org.jsoup.parser.Token) tag40);
        tokeniser11.emit((org.jsoup.parser.Token) tag40);
        tokeniser11.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState47 = tokeniser11.getState();
        tokeniser1.eofError(tokeniserState47);
        org.jsoup.parser.TokeniserState tokeniserState49 = null;
        tokeniser1.transition(tokeniserState49);
        tokeniser1.acknowledgeSelfClosingFlag();
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertNotNull(tokeniserState47);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        boolean boolean6 = tokeniser5.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag8 = tokeniser5.createTagPending(true);
        tokeniser1.tagPending = tag8;
        org.jsoup.parser.Token.Tag tag11 = tokeniser1.createTagPending(false);
        org.jsoup.parser.Token.Tag tag13 = tokeniser1.createTagPending(true);
        org.jsoup.parser.TokeniserState tokeniserState14 = org.jsoup.parser.TokeniserState.AfterDoctypePublicKeyword;
        tokeniser1.transition(tokeniserState14);
        tokeniser1.emit("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(tokeniserState14);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(true);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Comment comment11 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Tag tag12 = null;
        tokeniser1.tagPending = tag12;
        boolean boolean14 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        boolean boolean17 = tokeniser16.currentNodeInHtmlNS();
        tokeniser16.createCommentPending();
        boolean boolean19 = tokeniser16.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag20 = null;
        tokeniser16.tagPending = tag20;
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        boolean boolean24 = tokeniser23.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader25);
        tokeniser26.emit('4');
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader29);
        boolean boolean31 = tokeniser30.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag33 = tokeniser30.createTagPending(true);
        tokeniser26.tagPending = tag33;
        tokeniser23.tagPending = tag33;
        tokeniser16.tagPending = tag33;
        boolean boolean37 = tokeniser16.currentNodeInHtmlNS();
        tokeniser16.createCommentPending();
        tokeniser16.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader40 = null;
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader40);
        boolean boolean42 = tokeniser41.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype43 = tokeniser41.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState44 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser41.transition(tokeniserState44);
        tokeniser41.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader47 = null;
        org.jsoup.parser.Tokeniser tokeniser48 = new org.jsoup.parser.Tokeniser(characterReader47);
        tokeniser48.emit('4');
        tokeniser48.createTempBuffer();
        tokeniser48.setTrackErrors(false);
        tokeniser48.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype55 = null;
        tokeniser48.doctypePending = doctype55;
        tokeniser48.emit("");
        tokeniser48.createCommentPending();
        tokeniser48.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader61 = null;
        org.jsoup.parser.Tokeniser tokeniser62 = new org.jsoup.parser.Tokeniser(characterReader61);
        tokeniser62.emit("");
        tokeniser62.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState66 = tokeniser62.getState();
        tokeniser62.createDoctypePending();
        org.jsoup.parser.Token.Tag tag69 = tokeniser62.createTagPending(false);
        org.jsoup.parser.Token.Tag tag70 = tokeniser62.tagPending;
        org.jsoup.parser.Token.Doctype doctype71 = tokeniser62.doctypePending;
        tokeniser48.doctypePending = doctype71;
        org.jsoup.parser.CharacterReader characterReader73 = null;
        org.jsoup.parser.Tokeniser tokeniser74 = new org.jsoup.parser.Tokeniser(characterReader73);
        tokeniser74.emit("");
        tokeniser74.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState78 = tokeniser74.getState();
        tokeniser74.createDoctypePending();
        org.jsoup.parser.Token.Tag tag81 = tokeniser74.createTagPending(false);
        org.jsoup.parser.Token.Tag tag82 = tokeniser74.tagPending;
        org.jsoup.parser.Token.Doctype doctype83 = tokeniser74.doctypePending;
        tokeniser48.doctypePending = doctype83;
        tokeniser41.doctypePending = doctype83;
        org.jsoup.parser.Token.Doctype doctype86 = tokeniser41.doctypePending;
        tokeniser16.doctypePending = doctype86;
        org.jsoup.parser.Token.Comment comment88 = tokeniser16.commentPending;
        tokeniser1.commentPending = comment88;
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Tag tag92 = tokeniser1.createTagPending(false);
        org.junit.Assert.assertNull(comment11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(doctype43);
        org.junit.Assert.assertNotNull(tokeniserState44);
        org.junit.Assert.assertNotNull(tokeniserState66);
        org.junit.Assert.assertNotNull(tag69);
        org.junit.Assert.assertNotNull(tag70);
        org.junit.Assert.assertNotNull(doctype71);
        org.junit.Assert.assertNotNull(tokeniserState78);
        org.junit.Assert.assertNotNull(tag81);
        org.junit.Assert.assertNotNull(tag82);
        org.junit.Assert.assertNotNull(doctype83);
        org.junit.Assert.assertNotNull(doctype86);
        org.junit.Assert.assertNotNull(comment88);
        org.junit.Assert.assertNotNull(tag92);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        tokeniser6.emit('4');
        tokeniser6.createTempBuffer();
        tokeniser6.setTrackErrors(false);
        tokeniser6.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype13 = null;
        tokeniser6.doctypePending = doctype13;
        tokeniser6.emit("");
        tokeniser6.createCommentPending();
        tokeniser6.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        tokeniser20.emit("");
        tokeniser20.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState24 = tokeniser20.getState();
        tokeniser20.createDoctypePending();
        org.jsoup.parser.Token.Tag tag27 = tokeniser20.createTagPending(false);
        org.jsoup.parser.Token.Tag tag28 = tokeniser20.tagPending;
        org.jsoup.parser.Token.Doctype doctype29 = tokeniser20.doctypePending;
        tokeniser6.doctypePending = doctype29;
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        tokeniser32.emit("");
        tokeniser32.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState36 = tokeniser32.getState();
        tokeniser32.createDoctypePending();
        org.jsoup.parser.Token.Tag tag39 = tokeniser32.createTagPending(false);
        org.jsoup.parser.Token.Tag tag40 = tokeniser32.tagPending;
        org.jsoup.parser.Token.Doctype doctype41 = tokeniser32.doctypePending;
        tokeniser6.doctypePending = doctype41;
        tokeniser1.doctypePending = doctype41;
        org.jsoup.parser.Token.Comment comment44 = tokeniser1.commentPending;
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.Token.Doctype doctype47 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Doctype doctype48 = tokeniser1.doctypePending;
        boolean boolean49 = tokeniser1.currentNodeInHtmlNS();
        boolean boolean50 = tokeniser1.currentNodeInHtmlNS();
        org.junit.Assert.assertNotNull(tokeniserState24);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(doctype29);
        org.junit.Assert.assertNotNull(tokeniserState36);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertNotNull(doctype41);
        org.junit.Assert.assertNull(comment44);
        org.junit.Assert.assertNotNull(doctype47);
        org.junit.Assert.assertNotNull(doctype48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype8 = null;
        tokeniser1.doctypePending = doctype8;
        tokeniser1.emit("");
        tokeniser1.createCommentPending();
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        tokeniser15.emit("");
        tokeniser15.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState19 = tokeniser15.getState();
        tokeniser15.createDoctypePending();
        org.jsoup.parser.Token.Tag tag22 = tokeniser15.createTagPending(false);
        org.jsoup.parser.Token.Tag tag23 = tokeniser15.tagPending;
        org.jsoup.parser.Token.Doctype doctype24 = tokeniser15.doctypePending;
        tokeniser1.doctypePending = doctype24;
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader26);
        tokeniser27.emit("");
        tokeniser27.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState31 = tokeniser27.getState();
        tokeniser27.createDoctypePending();
        org.jsoup.parser.Token.Tag tag34 = tokeniser27.createTagPending(false);
        org.jsoup.parser.Token.Tag tag35 = tokeniser27.tagPending;
        org.jsoup.parser.Token.Doctype doctype36 = tokeniser27.doctypePending;
        tokeniser1.doctypePending = doctype36;
        org.jsoup.parser.Token.Tag tag38 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader39 = null;
        org.jsoup.parser.Tokeniser tokeniser40 = new org.jsoup.parser.Tokeniser(characterReader39);
        tokeniser40.emit("");
        tokeniser40.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState44 = tokeniser40.getState();
        tokeniser40.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader46 = null;
        org.jsoup.parser.Tokeniser tokeniser47 = new org.jsoup.parser.Tokeniser(characterReader46);
        boolean boolean48 = tokeniser47.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype49 = tokeniser47.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState50 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser47.transition(tokeniserState50);
        org.jsoup.parser.CharacterReader characterReader52 = null;
        org.jsoup.parser.Tokeniser tokeniser53 = new org.jsoup.parser.Tokeniser(characterReader52);
        boolean boolean54 = tokeniser53.currentNodeInHtmlNS();
        tokeniser53.createCommentPending();
        tokeniser53.emitCommentPending();
        java.lang.StringBuilder stringBuilder57 = null;
        tokeniser53.dataBuffer = stringBuilder57;
        org.jsoup.parser.Token.Comment comment59 = tokeniser53.commentPending;
        tokeniser47.commentPending = comment59;
        org.jsoup.parser.Token.Comment comment61 = tokeniser47.commentPending;
        tokeniser47.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader63 = null;
        org.jsoup.parser.Tokeniser tokeniser64 = new org.jsoup.parser.Tokeniser(characterReader63);
        boolean boolean65 = tokeniser64.currentNodeInHtmlNS();
        tokeniser64.createCommentPending();
        tokeniser64.emitCommentPending();
        java.lang.StringBuilder stringBuilder68 = null;
        tokeniser64.dataBuffer = stringBuilder68;
        org.jsoup.parser.CharacterReader characterReader70 = null;
        org.jsoup.parser.Tokeniser tokeniser71 = new org.jsoup.parser.Tokeniser(characterReader70);
        tokeniser71.emit("");
        org.jsoup.parser.Token.Doctype doctype74 = null;
        tokeniser71.doctypePending = doctype74;
        tokeniser71.createTempBuffer();
        tokeniser71.emit("");
        org.jsoup.parser.Token.Comment comment79 = null;
        tokeniser71.commentPending = comment79;
        org.jsoup.parser.Token.Tag tag82 = tokeniser71.createTagPending(false);
        tokeniser64.tagPending = tag82;
        org.jsoup.parser.Token.Comment comment84 = tokeniser64.commentPending;
        tokeniser47.commentPending = comment84;
        tokeniser40.commentPending = comment84;
        tokeniser1.emit((org.jsoup.parser.Token) comment84);
        tokeniser1.createCommentPending();
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(doctype24);
        org.junit.Assert.assertNotNull(tokeniserState31);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(doctype36);
        org.junit.Assert.assertNull(tag38);
        org.junit.Assert.assertNotNull(tokeniserState44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(doctype49);
        org.junit.Assert.assertNotNull(tokeniserState50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(comment59);
        org.junit.Assert.assertNotNull(comment61);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(tag82);
        org.junit.Assert.assertNotNull(comment84);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState7 = org.jsoup.parser.TokeniserState.BogusDoctype;
        tokeniser1.transition(tokeniserState7);
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        boolean boolean11 = tokeniser10.currentNodeInHtmlNS();
        tokeniser10.createCommentPending();
        boolean boolean13 = tokeniser10.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment14 = tokeniser10.commentPending;
        tokeniser1.emit((org.jsoup.parser.Token) comment14);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(comment14);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        tokeniser6.emit("");
        org.jsoup.parser.Token.Doctype doctype9 = null;
        tokeniser6.doctypePending = doctype9;
        tokeniser6.createTempBuffer();
        tokeniser6.emit("");
        org.jsoup.parser.Token.Comment comment14 = null;
        tokeniser6.commentPending = comment14;
        org.jsoup.parser.Token.Comment comment16 = null;
        tokeniser6.commentPending = comment16;
        org.jsoup.parser.Token.Doctype doctype18 = null;
        tokeniser6.doctypePending = doctype18;
        java.lang.StringBuilder stringBuilder20 = tokeniser6.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder20;
        tokeniser1.emitDoctypePending();
        tokeniser1.createDoctypePending();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        tokeniser5.emit('4');
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        boolean boolean10 = tokeniser9.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag12 = tokeniser9.createTagPending(true);
        tokeniser5.tagPending = tag12;
        tokeniser1.emit((org.jsoup.parser.Token) tag12);
        org.jsoup.parser.Token.Doctype doctype15 = tokeniser1.doctypePending;
        boolean boolean16 = tokeniser1.isTrackErrors();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        boolean boolean20 = tokeniser19.currentNodeInHtmlNS();
        tokeniser19.createCommentPending();
        boolean boolean22 = tokeniser19.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag23 = null;
        tokeniser19.tagPending = tag23;
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader25);
        boolean boolean27 = tokeniser26.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader28);
        tokeniser29.emit('4');
        org.jsoup.parser.CharacterReader characterReader32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader32);
        boolean boolean34 = tokeniser33.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag36 = tokeniser33.createTagPending(true);
        tokeniser29.tagPending = tag36;
        tokeniser26.tagPending = tag36;
        tokeniser19.tagPending = tag36;
        org.jsoup.parser.CharacterReader characterReader40 = null;
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader40);
        tokeniser41.emit('4');
        tokeniser41.createTempBuffer();
        tokeniser41.setTrackErrors(false);
        org.jsoup.parser.Token.Doctype doctype47 = null;
        tokeniser41.doctypePending = doctype47;
        java.lang.StringBuilder stringBuilder49 = tokeniser41.dataBuffer;
        tokeniser19.dataBuffer = stringBuilder49;
        tokeniser1.dataBuffer = stringBuilder49;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(doctype15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(stringBuilder49);
        org.junit.Assert.assertEquals(stringBuilder49.toString(), "");
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        org.jsoup.parser.Token.Comment comment9 = null;
        tokeniser1.commentPending = comment9;
        org.jsoup.parser.Token.Tag tag12 = tokeniser1.createTagPending(true);
        boolean boolean13 = tokeniser1.isTrackErrors();
        tokeniser1.createDoctypePending();
        boolean boolean15 = tokeniser1.isTrackErrors();
        org.jsoup.parser.Token.Tag tag17 = tokeniser1.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        tokeniser19.emit("");
        tokeniser19.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState23 = tokeniser19.getState();
        java.lang.StringBuilder stringBuilder24 = null;
        tokeniser19.dataBuffer = stringBuilder24;
        org.jsoup.parser.TokeniserState tokeniserState26 = tokeniser19.getState();
        tokeniser19.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype28 = tokeniser19.doctypePending;
        tokeniser19.setTrackErrors(false);
        org.jsoup.parser.TokeniserState tokeniserState31 = tokeniser19.getState();
        tokeniser1.transition(tokeniserState31);
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        boolean boolean35 = tokeniser34.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype36 = tokeniser34.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState37 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser34.transition(tokeniserState37);
        org.jsoup.parser.CharacterReader characterReader39 = null;
        org.jsoup.parser.Tokeniser tokeniser40 = new org.jsoup.parser.Tokeniser(characterReader39);
        boolean boolean41 = tokeniser40.currentNodeInHtmlNS();
        tokeniser40.createCommentPending();
        tokeniser40.emitCommentPending();
        java.lang.StringBuilder stringBuilder44 = null;
        tokeniser40.dataBuffer = stringBuilder44;
        org.jsoup.parser.Token.Comment comment46 = tokeniser40.commentPending;
        tokeniser34.commentPending = comment46;
        tokeniser34.setTrackErrors(false);
        tokeniser34.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader51 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState31.read(tokeniser34, characterReader51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(tokeniserState23);
        org.junit.Assert.assertNotNull(tokeniserState26);
        org.junit.Assert.assertNull(doctype28);
        org.junit.Assert.assertNotNull(tokeniserState31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(doctype36);
        org.junit.Assert.assertNotNull(tokeniserState37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(comment46);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        tokeniser6.emit("");
        tokeniser6.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser6.getState();
        tokeniser6.createDoctypePending();
        java.lang.StringBuilder stringBuilder12 = tokeniser6.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder12;
        org.jsoup.parser.TokeniserState tokeniserState14 = tokeniser1.getState();
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.TokeniserState tokeniserState17 = tokeniser1.getState();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertNotNull(tokeniserState17);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        org.jsoup.parser.Token.Comment comment9 = null;
        tokeniser1.commentPending = comment9;
        org.jsoup.parser.Token.Comment comment11 = null;
        tokeniser1.commentPending = comment11;
        org.jsoup.parser.Token.Doctype doctype13 = null;
        tokeniser1.doctypePending = doctype13;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment16 = null;
        tokeniser1.commentPending = comment16;
        org.jsoup.parser.Token.Doctype doctype18 = tokeniser1.doctypePending;
        tokeniser1.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState20 = org.jsoup.parser.TokeniserState.Comment;
        tokeniser1.transition(tokeniserState20);
        tokeniser1.setTrackErrors(false);
        boolean boolean24 = tokeniser1.isTrackErrors();
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader25);
        tokeniser26.emit("");
        org.jsoup.parser.Token.Doctype doctype29 = null;
        tokeniser26.doctypePending = doctype29;
        tokeniser26.createTempBuffer();
        tokeniser26.emit("");
        org.jsoup.parser.Token.Comment comment34 = null;
        tokeniser26.commentPending = comment34;
        org.jsoup.parser.Token.Tag tag37 = tokeniser26.createTagPending(false);
        org.jsoup.parser.TokeniserState tokeniserState38 = tokeniser26.getState();
        org.jsoup.parser.Token.Tag tag39 = tokeniser26.tagPending;
        org.jsoup.parser.CharacterReader characterReader40 = null;
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader40);
        tokeniser41.emit("");
        tokeniser41.emit("");
        org.jsoup.parser.Token.Tag tag46 = tokeniser41.tagPending;
        org.jsoup.parser.Token.Doctype doctype47 = null;
        tokeniser41.doctypePending = doctype47;
        boolean boolean49 = tokeniser41.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState50 = tokeniser41.getState();
        tokeniser26.transition(tokeniserState50);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype18);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertNotNull(tokeniserState38);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNull(tag46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(tokeniserState50);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        tokeniser1.createCommentPending();
        tokeniser1.emit("");
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser12.getState();
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        boolean boolean16 = tokeniser15.currentNodeInHtmlNS();
        tokeniser15.createCommentPending();
        boolean boolean18 = tokeniser15.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment19 = tokeniser15.commentPending;
        tokeniser12.commentPending = comment19;
        tokeniser10.commentPending = comment19;
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        boolean boolean24 = tokeniser23.currentNodeInHtmlNS();
        tokeniser23.emit('4');
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader27);
        boolean boolean29 = tokeniser28.currentNodeInHtmlNS();
        tokeniser28.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        tokeniser32.emit('4');
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.Tokeniser tokeniser36 = new org.jsoup.parser.Tokeniser(characterReader35);
        boolean boolean37 = tokeniser36.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag39 = tokeniser36.createTagPending(true);
        tokeniser32.tagPending = tag39;
        tokeniser28.emit((org.jsoup.parser.Token) tag39);
        tokeniser23.emit((org.jsoup.parser.Token) tag39);
        tokeniser10.tagPending = tag39;
        tokeniser1.tagPending = tag39;
        tokeniser1.createCommentPending();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(comment19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(tag39);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        tokeniser1.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState8 = org.jsoup.parser.TokeniserState.TagOpen;
        tokeniser1.eofError(tokeniserState8);
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        tokeniser13.emit("");
        org.jsoup.parser.Token.Doctype doctype16 = null;
        tokeniser13.doctypePending = doctype16;
        tokeniser13.createTempBuffer();
        tokeniser13.emit("");
        org.jsoup.parser.Token.Comment comment21 = null;
        tokeniser13.commentPending = comment21;
        org.jsoup.parser.Token.Comment comment23 = null;
        tokeniser13.commentPending = comment23;
        org.jsoup.parser.Token.Doctype doctype25 = null;
        tokeniser13.doctypePending = doctype25;
        java.lang.StringBuilder stringBuilder27 = tokeniser13.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder27;
        tokeniser1.createCommentPending();
        java.lang.StringBuilder stringBuilder30 = tokeniser1.dataBuffer;
        boolean boolean31 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState32 = tokeniser1.getState();
        tokeniser1.createDoctypePending();
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(tokeniserState32);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        org.jsoup.parser.Token.Comment comment6 = null;
        tokeniser1.commentPending = comment6;
        tokeniser1.emit("");
        org.jsoup.parser.TokeniserState tokeniserState10 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDashDash;
        tokeniser1.transition(tokeniserState10);
        java.lang.StringBuilder stringBuilder12 = tokeniser1.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        tokeniser14.emit('4');
        tokeniser14.createTempBuffer();
        tokeniser14.emit('\ufffd');
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        tokeniser21.emit('4');
        tokeniser21.createTempBuffer();
        tokeniser21.setTrackErrors(false);
        org.jsoup.parser.Token.Doctype doctype27 = null;
        tokeniser21.doctypePending = doctype27;
        tokeniser21.createCommentPending();
        org.jsoup.parser.Token.Comment comment30 = tokeniser21.commentPending;
        tokeniser14.commentPending = comment30;
        boolean boolean32 = tokeniser14.currentNodeInHtmlNS();
        boolean boolean33 = tokeniser14.isTrackErrors();
        org.jsoup.parser.Token.Tag tag35 = tokeniser14.createTagPending(true);
        tokeniser1.tagPending = tag35;
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNull(stringBuilder12);
        org.junit.Assert.assertNotNull(comment30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(tag35);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        boolean boolean6 = tokeniser5.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag8 = tokeniser5.createTagPending(true);
        tokeniser1.tagPending = tag8;
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser1.getState();
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemIdentifier;
        tokeniser1.transition(tokeniserState11);
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment14 = tokeniser1.commentPending;
        org.jsoup.parser.TokeniserState tokeniserState15 = tokeniser1.getState();
        java.lang.StringBuilder stringBuilder16 = tokeniser1.dataBuffer;
        boolean boolean17 = tokeniser1.isTrackErrors();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNull(comment14);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertNull(stringBuilder16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype8 = null;
        tokeniser1.doctypePending = doctype8;
        tokeniser1.emit("");
        tokeniser1.createCommentPending();
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        tokeniser15.emit("");
        tokeniser15.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState19 = tokeniser15.getState();
        tokeniser15.createDoctypePending();
        org.jsoup.parser.Token.Tag tag22 = tokeniser15.createTagPending(false);
        org.jsoup.parser.Token.Tag tag23 = tokeniser15.tagPending;
        org.jsoup.parser.Token.Doctype doctype24 = tokeniser15.doctypePending;
        tokeniser1.doctypePending = doctype24;
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader26);
        tokeniser27.emit("");
        tokeniser27.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState31 = tokeniser27.getState();
        tokeniser27.createDoctypePending();
        org.jsoup.parser.Token.Tag tag34 = tokeniser27.createTagPending(false);
        org.jsoup.parser.Token.Tag tag35 = tokeniser27.tagPending;
        org.jsoup.parser.Token.Doctype doctype36 = tokeniser27.doctypePending;
        tokeniser1.doctypePending = doctype36;
        boolean boolean38 = tokeniser1.isTrackErrors();
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(doctype24);
        org.junit.Assert.assertNotNull(tokeniserState31);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(doctype36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader3 = null;
        org.jsoup.parser.Tokeniser tokeniser4 = new org.jsoup.parser.Tokeniser(characterReader3);
        boolean boolean5 = tokeniser4.currentNodeInHtmlNS();
        tokeniser4.createCommentPending();
        boolean boolean7 = tokeniser4.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment8 = tokeniser4.commentPending;
        tokeniser1.commentPending = comment8;
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser1.getState();
        tokeniser1.createTempBuffer();
        boolean boolean12 = tokeniser1.isTrackErrors();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        boolean boolean15 = tokeniser14.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype16 = tokeniser14.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState17 = tokeniser14.getState();
        tokeniser1.transition(tokeniserState17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(comment8);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(doctype16);
        org.junit.Assert.assertNotNull(tokeniserState17);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag9 = tokeniser6.createTagPending(true);
        tokeniser1.emit((org.jsoup.parser.Token) tag9);
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.Token.Tag tag13 = tokeniser1.tagPending;
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token token15 = tokeniser1.read();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(token15);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag9 = tokeniser6.createTagPending(true);
        tokeniser1.emit((org.jsoup.parser.Token) tag9);
        tokeniser1.emit(' ');
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.Token.Doctype doctype15 = tokeniser1.doctypePending;
        tokeniser1.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        tokeniser18.emit("");
        org.jsoup.parser.Token.Doctype doctype21 = null;
        tokeniser18.doctypePending = doctype21;
        tokeniser18.createTempBuffer();
        tokeniser18.emit("");
        org.jsoup.parser.Token.Comment comment26 = null;
        tokeniser18.commentPending = comment26;
        org.jsoup.parser.Token.Comment comment28 = null;
        tokeniser18.commentPending = comment28;
        tokeniser18.emit('#');
        org.jsoup.parser.Token.Tag tag32 = tokeniser18.tagPending;
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        boolean boolean35 = tokeniser34.currentNodeInHtmlNS();
        tokeniser34.createCommentPending();
        boolean boolean37 = tokeniser34.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment38 = tokeniser34.commentPending;
        tokeniser18.commentPending = comment38;
        tokeniser1.commentPending = comment38;
        tokeniser1.createDoctypePending();
        boolean boolean42 = tokeniser1.isTrackErrors();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(doctype15);
        org.junit.Assert.assertNull(tag32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(comment38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser1.doctypePending = doctype7;
        org.jsoup.parser.Token.Tag tag9 = tokeniser1.tagPending;
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype11 = null;
        tokeniser1.doctypePending = doctype11;
        org.jsoup.parser.Token.Tag tag14 = tokeniser1.createTagPending(true);
        boolean boolean15 = tokeniser1.currentNodeInHtmlNS();
        org.junit.Assert.assertNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser1.getState();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag8 = tokeniser1.createTagPending(false);
        org.jsoup.parser.Token.Tag tag9 = tokeniser1.tagPending;
        org.jsoup.parser.Token.Doctype doctype10 = tokeniser1.doctypePending;
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        tokeniser12.emit("");
        tokeniser12.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState16 = tokeniser12.getState();
        java.lang.StringBuilder stringBuilder17 = null;
        tokeniser12.dataBuffer = stringBuilder17;
        tokeniser12.setTrackErrors(true);
        boolean boolean21 = tokeniser12.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        boolean boolean24 = tokeniser23.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype25 = tokeniser23.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState26 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser23.transition(tokeniserState26);
        org.jsoup.parser.Token.Comment comment28 = tokeniser23.commentPending;
        tokeniser23.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader30);
        boolean boolean32 = tokeniser31.currentNodeInHtmlNS();
        tokeniser31.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState34 = tokeniser31.getState();
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.Tokeniser tokeniser36 = new org.jsoup.parser.Tokeniser(characterReader35);
        tokeniser36.emit("");
        org.jsoup.parser.Token.Doctype doctype39 = null;
        tokeniser36.doctypePending = doctype39;
        tokeniser36.createTempBuffer();
        tokeniser36.emit("");
        org.jsoup.parser.Token.Comment comment44 = null;
        tokeniser36.commentPending = comment44;
        org.jsoup.parser.Token.Comment comment46 = null;
        tokeniser36.commentPending = comment46;
        org.jsoup.parser.Token.Doctype doctype48 = null;
        tokeniser36.doctypePending = doctype48;
        java.lang.StringBuilder stringBuilder50 = tokeniser36.dataBuffer;
        tokeniser31.dataBuffer = stringBuilder50;
        tokeniser23.dataBuffer = stringBuilder50;
        tokeniser12.dataBuffer = stringBuilder50;
        tokeniser1.dataBuffer = stringBuilder50;
        org.jsoup.parser.CharacterReader characterReader55 = null;
        org.jsoup.parser.Tokeniser tokeniser56 = new org.jsoup.parser.Tokeniser(characterReader55);
        boolean boolean57 = tokeniser56.currentNodeInHtmlNS();
        tokeniser56.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState59 = tokeniser56.getState();
        org.jsoup.parser.CharacterReader characterReader60 = null;
        org.jsoup.parser.Tokeniser tokeniser61 = new org.jsoup.parser.Tokeniser(characterReader60);
        tokeniser61.emit("");
        tokeniser61.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState65 = tokeniser61.getState();
        tokeniser61.createDoctypePending();
        java.lang.StringBuilder stringBuilder67 = tokeniser61.dataBuffer;
        tokeniser56.dataBuffer = stringBuilder67;
        org.jsoup.parser.TokeniserState tokeniserState69 = tokeniser56.getState();
        tokeniser1.transition(tokeniserState69);
        tokeniser1.createDoctypePending();
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(doctype10);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(doctype25);
        org.junit.Assert.assertNotNull(tokeniserState26);
        org.junit.Assert.assertNull(comment28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(tokeniserState34);
        org.junit.Assert.assertNotNull(stringBuilder50);
        org.junit.Assert.assertEquals(stringBuilder50.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(tokeniserState59);
        org.junit.Assert.assertNotNull(tokeniserState65);
        org.junit.Assert.assertNotNull(stringBuilder67);
        org.junit.Assert.assertEquals(stringBuilder67.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState69);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader3 = null;
        org.jsoup.parser.Tokeniser tokeniser4 = new org.jsoup.parser.Tokeniser(characterReader3);
        tokeniser4.emit('4');
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        boolean boolean9 = tokeniser8.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag11 = tokeniser8.createTagPending(true);
        tokeniser4.tagPending = tag11;
        tokeniser1.tagPending = tag11;
        java.lang.StringBuilder stringBuilder14 = tokeniser1.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState15 = org.jsoup.parser.TokeniserState.ScriptDataEndTagName;
        tokeniser1.transition(tokeniserState15);
        org.jsoup.parser.Token.Tag tag17 = tokeniser1.tagPending;
        tokeniser1.createTempBuffer();
        java.lang.StringBuilder stringBuilder19 = tokeniser1.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        boolean boolean22 = tokeniser21.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype23 = tokeniser21.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState24 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser21.transition(tokeniserState24);
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader26);
        boolean boolean28 = tokeniser27.currentNodeInHtmlNS();
        tokeniser27.createCommentPending();
        tokeniser27.emitCommentPending();
        java.lang.StringBuilder stringBuilder31 = null;
        tokeniser27.dataBuffer = stringBuilder31;
        org.jsoup.parser.Token.Comment comment33 = tokeniser27.commentPending;
        tokeniser21.commentPending = comment33;
        tokeniser21.setTrackErrors(false);
        tokeniser21.createDoctypePending();
        tokeniser21.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader39 = null;
        org.jsoup.parser.Tokeniser tokeniser40 = new org.jsoup.parser.Tokeniser(characterReader39);
        tokeniser40.emit("");
        org.jsoup.parser.Token.Doctype doctype43 = null;
        tokeniser40.doctypePending = doctype43;
        org.jsoup.parser.Token.Comment comment45 = null;
        tokeniser40.commentPending = comment45;
        tokeniser40.emit("");
        org.jsoup.parser.TokeniserState tokeniserState49 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDashDash;
        tokeniser40.transition(tokeniserState49);
        tokeniser21.eofError(tokeniserState49);
        tokeniser1.transition(tokeniserState49);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char55 = tokeniser1.consumeCharacterReference((java.lang.Character) '\ufffd', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNull(stringBuilder14);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(doctype23);
        org.junit.Assert.assertNotNull(tokeniserState24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(comment33);
        org.junit.Assert.assertNotNull(tokeniserState49);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser1.getState();
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser1.dataBuffer = stringBuilder6;
        tokeniser1.setTrackErrors(true);
        boolean boolean10 = tokeniser1.isTrackErrors();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        tokeniser13.emit('4');
        tokeniser13.createTempBuffer();
        tokeniser13.setTrackErrors(false);
        tokeniser13.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState20 = org.jsoup.parser.TokeniserState.TagOpen;
        tokeniser13.eofError(tokeniserState20);
        tokeniser13.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader24);
        tokeniser25.emit("");
        org.jsoup.parser.Token.Doctype doctype28 = null;
        tokeniser25.doctypePending = doctype28;
        tokeniser25.createTempBuffer();
        tokeniser25.emit("");
        org.jsoup.parser.Token.Comment comment33 = null;
        tokeniser25.commentPending = comment33;
        org.jsoup.parser.Token.Comment comment35 = null;
        tokeniser25.commentPending = comment35;
        org.jsoup.parser.Token.Doctype doctype37 = null;
        tokeniser25.doctypePending = doctype37;
        java.lang.StringBuilder stringBuilder39 = tokeniser25.dataBuffer;
        tokeniser13.dataBuffer = stringBuilder39;
        tokeniser13.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState42 = org.jsoup.parser.TokeniserState.Rawtext;
        tokeniser13.error(tokeniserState42);
        tokeniser1.transition(tokeniserState42);
        java.lang.Class<?> wildcardClass45 = tokeniser1.getClass();
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertNotNull(stringBuilder39);
        org.junit.Assert.assertEquals(stringBuilder39.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState42);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader3 = null;
        org.jsoup.parser.Tokeniser tokeniser4 = new org.jsoup.parser.Tokeniser(characterReader3);
        tokeniser4.emit('4');
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        boolean boolean9 = tokeniser8.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag11 = tokeniser8.createTagPending(true);
        tokeniser4.tagPending = tag11;
        tokeniser1.tagPending = tag11;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState15 = tokeniser1.getState();
        org.jsoup.parser.Token.Doctype doctype16 = null;
        tokeniser1.doctypePending = doctype16;
        boolean boolean18 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader21);
        boolean boolean23 = tokeniser22.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype24 = tokeniser22.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState25 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser22.transition(tokeniserState25);
        org.jsoup.parser.Token.Comment comment27 = tokeniser22.commentPending;
        tokeniser22.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader29);
        boolean boolean31 = tokeniser30.currentNodeInHtmlNS();
        tokeniser30.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState33 = tokeniser30.getState();
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader34);
        tokeniser35.emit("");
        org.jsoup.parser.Token.Doctype doctype38 = null;
        tokeniser35.doctypePending = doctype38;
        tokeniser35.createTempBuffer();
        tokeniser35.emit("");
        org.jsoup.parser.Token.Comment comment43 = null;
        tokeniser35.commentPending = comment43;
        org.jsoup.parser.Token.Comment comment45 = null;
        tokeniser35.commentPending = comment45;
        org.jsoup.parser.Token.Doctype doctype47 = null;
        tokeniser35.doctypePending = doctype47;
        java.lang.StringBuilder stringBuilder49 = tokeniser35.dataBuffer;
        tokeniser30.dataBuffer = stringBuilder49;
        tokeniser22.dataBuffer = stringBuilder49;
        org.jsoup.parser.CharacterReader characterReader52 = null;
        org.jsoup.parser.Tokeniser tokeniser53 = new org.jsoup.parser.Tokeniser(characterReader52);
        tokeniser53.emit("");
        org.jsoup.parser.Token.Doctype doctype56 = null;
        tokeniser53.doctypePending = doctype56;
        org.jsoup.parser.Token.Doctype doctype58 = null;
        tokeniser53.doctypePending = doctype58;
        org.jsoup.parser.CharacterReader characterReader60 = null;
        org.jsoup.parser.Tokeniser tokeniser61 = new org.jsoup.parser.Tokeniser(characterReader60);
        tokeniser61.emit('4');
        org.jsoup.parser.CharacterReader characterReader64 = null;
        org.jsoup.parser.Tokeniser tokeniser65 = new org.jsoup.parser.Tokeniser(characterReader64);
        boolean boolean66 = tokeniser65.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag68 = tokeniser65.createTagPending(true);
        tokeniser61.tagPending = tag68;
        org.jsoup.parser.TokeniserState tokeniserState70 = tokeniser61.getState();
        org.jsoup.parser.TokeniserState tokeniserState71 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemIdentifier;
        tokeniser61.transition(tokeniserState71);
        tokeniser53.transition(tokeniserState71);
        org.jsoup.parser.CharacterReader characterReader74 = null;
        org.jsoup.parser.Tokeniser tokeniser75 = new org.jsoup.parser.Tokeniser(characterReader74);
        tokeniser75.emit("");
        org.jsoup.parser.Token.Doctype doctype78 = null;
        tokeniser75.doctypePending = doctype78;
        org.jsoup.parser.CharacterReader characterReader80 = null;
        org.jsoup.parser.Tokeniser tokeniser81 = new org.jsoup.parser.Tokeniser(characterReader80);
        org.jsoup.parser.TokeniserState tokeniserState82 = tokeniser81.getState();
        org.jsoup.parser.CharacterReader characterReader83 = null;
        org.jsoup.parser.Tokeniser tokeniser84 = new org.jsoup.parser.Tokeniser(characterReader83);
        boolean boolean85 = tokeniser84.currentNodeInHtmlNS();
        tokeniser84.createCommentPending();
        boolean boolean87 = tokeniser84.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment88 = tokeniser84.commentPending;
        tokeniser81.commentPending = comment88;
        tokeniser81.createTempBuffer();
        java.lang.StringBuilder stringBuilder91 = tokeniser81.dataBuffer;
        tokeniser75.dataBuffer = stringBuilder91;
        tokeniser53.dataBuffer = stringBuilder91;
        tokeniser22.dataBuffer = stringBuilder91;
        tokeniser1.dataBuffer = stringBuilder91;
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.Token.Doctype doctype98 = tokeniser1.doctypePending;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(doctype24);
        org.junit.Assert.assertNotNull(tokeniserState25);
        org.junit.Assert.assertNull(comment27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(tokeniserState33);
        org.junit.Assert.assertNotNull(stringBuilder49);
        org.junit.Assert.assertEquals(stringBuilder49.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(tag68);
        org.junit.Assert.assertNotNull(tokeniserState70);
        org.junit.Assert.assertNotNull(tokeniserState71);
        org.junit.Assert.assertNotNull(tokeniserState82);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(comment88);
        org.junit.Assert.assertNotNull(stringBuilder91);
        org.junit.Assert.assertEquals(stringBuilder91.toString(), "");
        org.junit.Assert.assertNull(doctype98);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        org.jsoup.parser.Token.Comment comment9 = null;
        tokeniser1.commentPending = comment9;
        org.jsoup.parser.Token.Tag tag12 = tokeniser1.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        boolean boolean15 = tokeniser14.currentNodeInHtmlNS();
        tokeniser14.emit('4');
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        boolean boolean20 = tokeniser19.currentNodeInHtmlNS();
        tokeniser19.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        tokeniser23.emit('4');
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader26);
        boolean boolean28 = tokeniser27.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag30 = tokeniser27.createTagPending(true);
        tokeniser23.tagPending = tag30;
        tokeniser19.emit((org.jsoup.parser.Token) tag30);
        tokeniser14.emit((org.jsoup.parser.Token) tag30);
        tokeniser1.emit((org.jsoup.parser.Token) tag30);
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState37 = tokeniser1.getState();
        org.jsoup.parser.TokeniserState tokeniserState38 = org.jsoup.parser.TokeniserState.BeforeDoctypePublicIdentifier;
        tokeniser1.transition(tokeniserState38);
        boolean boolean40 = tokeniser1.currentNodeInHtmlNS();
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(tokeniserState37);
        org.junit.Assert.assertNotNull(tokeniserState38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.Token.Comment comment2 = tokeniser1.commentPending;
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser1.getState();
        org.jsoup.parser.Token.Doctype doctype4 = tokeniser1.doctypePending;
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        tokeniser6.emit("");
        tokeniser6.emit("");
        tokeniser6.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState12 = tokeniser6.getState();
        boolean boolean13 = tokeniser6.currentNodeInHtmlNS();
        java.lang.StringBuilder stringBuilder14 = tokeniser6.dataBuffer;
        java.lang.StringBuilder stringBuilder15 = tokeniser6.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder15;
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        org.jsoup.parser.Token.Comment comment19 = tokeniser18.commentPending;
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser18.getState();
        tokeniser18.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        tokeniser23.emit('4');
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader26);
        tokeniser27.emit("");
        org.jsoup.parser.CharacterReader characterReader30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader30);
        boolean boolean32 = tokeniser31.currentNodeInHtmlNS();
        tokeniser31.createCommentPending();
        boolean boolean34 = tokeniser31.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag35 = null;
        tokeniser31.tagPending = tag35;
        org.jsoup.parser.CharacterReader characterReader37 = null;
        org.jsoup.parser.Tokeniser tokeniser38 = new org.jsoup.parser.Tokeniser(characterReader37);
        boolean boolean39 = tokeniser38.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader40 = null;
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader40);
        tokeniser41.emit('4');
        org.jsoup.parser.CharacterReader characterReader44 = null;
        org.jsoup.parser.Tokeniser tokeniser45 = new org.jsoup.parser.Tokeniser(characterReader44);
        boolean boolean46 = tokeniser45.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag48 = tokeniser45.createTagPending(true);
        tokeniser41.tagPending = tag48;
        tokeniser38.tagPending = tag48;
        tokeniser31.tagPending = tag48;
        tokeniser27.emit((org.jsoup.parser.Token) tag48);
        tokeniser23.tagPending = tag48;
        tokeniser18.emit((org.jsoup.parser.Token) tag48);
        tokeniser18.emit('a');
        tokeniser18.acknowledgeSelfClosingFlag();
        org.jsoup.parser.TokeniserState tokeniserState58 = tokeniser18.getState();
        tokeniser1.transition(tokeniserState58);
        org.junit.Assert.assertNull(comment2);
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNull(doctype4);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertNull(comment19);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertNotNull(tokeniserState58);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        org.jsoup.parser.Token.Comment comment9 = null;
        tokeniser1.commentPending = comment9;
        org.jsoup.parser.Token.Tag tag12 = tokeniser1.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        boolean boolean15 = tokeniser14.currentNodeInHtmlNS();
        tokeniser14.emit('4');
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        boolean boolean20 = tokeniser19.currentNodeInHtmlNS();
        tokeniser19.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        tokeniser23.emit('4');
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader26);
        boolean boolean28 = tokeniser27.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag30 = tokeniser27.createTagPending(true);
        tokeniser23.tagPending = tag30;
        tokeniser19.emit((org.jsoup.parser.Token) tag30);
        tokeniser14.emit((org.jsoup.parser.Token) tag30);
        tokeniser1.emit((org.jsoup.parser.Token) tag30);
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState37 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader38);
        tokeniser39.emit("");
        org.jsoup.parser.Token.Doctype doctype42 = null;
        tokeniser39.doctypePending = doctype42;
        tokeniser39.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState45 = org.jsoup.parser.TokeniserState.BogusDoctype;
        tokeniser39.transition(tokeniserState45);
        org.jsoup.parser.CharacterReader characterReader47 = null;
        org.jsoup.parser.Tokeniser tokeniser48 = new org.jsoup.parser.Tokeniser(characterReader47);
        boolean boolean49 = tokeniser48.currentNodeInHtmlNS();
        tokeniser48.createCommentPending();
        boolean boolean51 = tokeniser48.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment52 = tokeniser48.commentPending;
        tokeniser39.emit((org.jsoup.parser.Token) comment52);
        tokeniser1.commentPending = comment52;
        tokeniser1.setTrackErrors(true);
        tokeniser1.emit('#');
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(tokeniserState37);
        org.junit.Assert.assertNotNull(tokeniserState45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(comment52);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        org.jsoup.parser.Token.Comment comment9 = null;
        tokeniser1.commentPending = comment9;
        org.jsoup.parser.Token.Tag tag12 = tokeniser1.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        boolean boolean15 = tokeniser14.currentNodeInHtmlNS();
        tokeniser14.emit('4');
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        boolean boolean20 = tokeniser19.currentNodeInHtmlNS();
        tokeniser19.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        tokeniser23.emit('4');
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader26);
        boolean boolean28 = tokeniser27.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag30 = tokeniser27.createTagPending(true);
        tokeniser23.tagPending = tag30;
        tokeniser19.emit((org.jsoup.parser.Token) tag30);
        tokeniser14.emit((org.jsoup.parser.Token) tag30);
        tokeniser1.emit((org.jsoup.parser.Token) tag30);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Comment comment37 = tokeniser1.commentPending;
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNull(comment37);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.createTagPending(true);
        org.jsoup.parser.TokeniserState tokeniserState5 = org.jsoup.parser.TokeniserState.CommentEnd;
        tokeniser1.transition(tokeniserState5);
        boolean boolean7 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState8 = tokeniser1.getState();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tokeniserState8);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        org.jsoup.parser.Token.Comment comment9 = null;
        tokeniser1.commentPending = comment9;
        org.jsoup.parser.Token.Tag tag12 = tokeniser1.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        boolean boolean15 = tokeniser14.currentNodeInHtmlNS();
        tokeniser14.createCommentPending();
        boolean boolean17 = tokeniser14.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment18 = tokeniser14.commentPending;
        tokeniser1.commentPending = comment18;
        tokeniser1.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader21);
        boolean boolean23 = tokeniser22.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader24);
        tokeniser25.emit('4');
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader28);
        boolean boolean30 = tokeniser29.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag32 = tokeniser29.createTagPending(true);
        tokeniser25.tagPending = tag32;
        tokeniser22.tagPending = tag32;
        tokeniser22.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState36 = tokeniser22.getState();
        org.jsoup.parser.Token.Doctype doctype37 = null;
        tokeniser22.doctypePending = doctype37;
        org.jsoup.parser.TokeniserState tokeniserState39 = org.jsoup.parser.TokeniserState.CharacterReferenceInData;
        tokeniser22.transition(tokeniserState39);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(comment18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNotNull(tokeniserState36);
        org.junit.Assert.assertNotNull(tokeniserState39);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser1.getState();
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser1.dataBuffer = stringBuilder6;
        tokeniser1.setTrackErrors(true);
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_singleQuoted;
        tokeniser1.transition(tokeniserState11);
        org.jsoup.parser.Token.Doctype doctype13 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNull(doctype13);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        boolean boolean4 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser1.tagPending = tag5;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        boolean boolean9 = tokeniser8.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        tokeniser11.emit('4');
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        boolean boolean16 = tokeniser15.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag18 = tokeniser15.createTagPending(true);
        tokeniser11.tagPending = tag18;
        tokeniser8.tagPending = tag18;
        tokeniser1.tagPending = tag18;
        boolean boolean22 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emitCommentPending();
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader25);
        tokeniser26.emit('4');
        tokeniser26.createTempBuffer();
        tokeniser26.setTrackErrors(false);
        tokeniser26.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState33 = org.jsoup.parser.TokeniserState.TagOpen;
        tokeniser26.eofError(tokeniserState33);
        tokeniser1.transition(tokeniserState33);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(tokeniserState33);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        boolean boolean10 = tokeniser9.currentNodeInHtmlNS();
        tokeniser9.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState12 = tokeniser9.getState();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        tokeniser14.emit("");
        org.jsoup.parser.Token.Doctype doctype17 = null;
        tokeniser14.doctypePending = doctype17;
        tokeniser14.createTempBuffer();
        tokeniser14.emit("");
        org.jsoup.parser.Token.Comment comment22 = null;
        tokeniser14.commentPending = comment22;
        org.jsoup.parser.Token.Comment comment24 = null;
        tokeniser14.commentPending = comment24;
        org.jsoup.parser.Token.Doctype doctype26 = null;
        tokeniser14.doctypePending = doctype26;
        java.lang.StringBuilder stringBuilder28 = tokeniser14.dataBuffer;
        tokeniser9.dataBuffer = stringBuilder28;
        tokeniser1.dataBuffer = stringBuilder28;
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        tokeniser32.emit("");
        org.jsoup.parser.Token.Doctype doctype35 = null;
        tokeniser32.doctypePending = doctype35;
        org.jsoup.parser.Token.Doctype doctype37 = null;
        tokeniser32.doctypePending = doctype37;
        org.jsoup.parser.CharacterReader characterReader39 = null;
        org.jsoup.parser.Tokeniser tokeniser40 = new org.jsoup.parser.Tokeniser(characterReader39);
        tokeniser40.emit('4');
        org.jsoup.parser.CharacterReader characterReader43 = null;
        org.jsoup.parser.Tokeniser tokeniser44 = new org.jsoup.parser.Tokeniser(characterReader43);
        boolean boolean45 = tokeniser44.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag47 = tokeniser44.createTagPending(true);
        tokeniser40.tagPending = tag47;
        org.jsoup.parser.TokeniserState tokeniserState49 = tokeniser40.getState();
        org.jsoup.parser.TokeniserState tokeniserState50 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemIdentifier;
        tokeniser40.transition(tokeniserState50);
        tokeniser32.transition(tokeniserState50);
        org.jsoup.parser.CharacterReader characterReader53 = null;
        org.jsoup.parser.Tokeniser tokeniser54 = new org.jsoup.parser.Tokeniser(characterReader53);
        tokeniser54.emit("");
        org.jsoup.parser.Token.Doctype doctype57 = null;
        tokeniser54.doctypePending = doctype57;
        org.jsoup.parser.CharacterReader characterReader59 = null;
        org.jsoup.parser.Tokeniser tokeniser60 = new org.jsoup.parser.Tokeniser(characterReader59);
        org.jsoup.parser.TokeniserState tokeniserState61 = tokeniser60.getState();
        org.jsoup.parser.CharacterReader characterReader62 = null;
        org.jsoup.parser.Tokeniser tokeniser63 = new org.jsoup.parser.Tokeniser(characterReader62);
        boolean boolean64 = tokeniser63.currentNodeInHtmlNS();
        tokeniser63.createCommentPending();
        boolean boolean66 = tokeniser63.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment67 = tokeniser63.commentPending;
        tokeniser60.commentPending = comment67;
        tokeniser60.createTempBuffer();
        java.lang.StringBuilder stringBuilder70 = tokeniser60.dataBuffer;
        tokeniser54.dataBuffer = stringBuilder70;
        tokeniser32.dataBuffer = stringBuilder70;
        tokeniser1.dataBuffer = stringBuilder70;
        org.jsoup.parser.Token.Doctype doctype74 = null;
        tokeniser1.doctypePending = doctype74;
        org.jsoup.parser.CharacterReader characterReader76 = null;
        org.jsoup.parser.Tokeniser tokeniser77 = new org.jsoup.parser.Tokeniser(characterReader76);
        tokeniser77.emit("");
        org.jsoup.parser.Token.Doctype doctype80 = null;
        tokeniser77.doctypePending = doctype80;
        tokeniser77.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState83 = org.jsoup.parser.TokeniserState.BogusDoctype;
        tokeniser77.transition(tokeniserState83);
        org.jsoup.parser.CharacterReader characterReader85 = null;
        org.jsoup.parser.Tokeniser tokeniser86 = new org.jsoup.parser.Tokeniser(characterReader85);
        boolean boolean87 = tokeniser86.currentNodeInHtmlNS();
        tokeniser86.createCommentPending();
        boolean boolean89 = tokeniser86.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment90 = tokeniser86.commentPending;
        tokeniser77.emit((org.jsoup.parser.Token) comment90);
        tokeniser1.emit((org.jsoup.parser.Token) comment90);
        org.jsoup.parser.Token.Tag tag94 = tokeniser1.createTagPending(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNotNull(tokeniserState49);
        org.junit.Assert.assertNotNull(tokeniserState50);
        org.junit.Assert.assertNotNull(tokeniserState61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(comment67);
        org.junit.Assert.assertNotNull(stringBuilder70);
        org.junit.Assert.assertEquals(stringBuilder70.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState83);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(comment90);
        org.junit.Assert.assertNotNull(tag94);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState7 = org.jsoup.parser.TokeniserState.BogusDoctype;
        tokeniser1.transition(tokeniserState7);
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        boolean boolean11 = tokeniser10.currentNodeInHtmlNS();
        tokeniser10.createCommentPending();
        boolean boolean13 = tokeniser10.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment14 = tokeniser10.commentPending;
        tokeniser1.emit((org.jsoup.parser.Token) comment14);
        tokeniser1.emit('\ufffd');
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype19 = tokeniser1.doctypePending;
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(comment14);
        org.junit.Assert.assertNull(doctype19);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader6);
        boolean boolean8 = tokeniser7.currentNodeInHtmlNS();
        tokeniser7.createCommentPending();
        tokeniser7.emitCommentPending();
        java.lang.StringBuilder stringBuilder11 = null;
        tokeniser7.dataBuffer = stringBuilder11;
        org.jsoup.parser.Token.Comment comment13 = tokeniser7.commentPending;
        tokeniser1.commentPending = comment13;
        tokeniser1.setTrackErrors(false);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment18 = tokeniser1.commentPending;
        boolean boolean19 = tokeniser1.currentNodeInHtmlNS();
        java.lang.StringBuilder stringBuilder20 = tokeniser1.dataBuffer;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(comment13);
        org.junit.Assert.assertNotNull(comment18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(stringBuilder20);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        org.jsoup.parser.Token.Comment comment9 = null;
        tokeniser1.commentPending = comment9;
        org.jsoup.parser.Token.Comment comment11 = null;
        tokeniser1.commentPending = comment11;
        tokeniser1.emit('#');
        boolean boolean15 = tokeniser1.currentNodeInHtmlNS();
        java.lang.StringBuilder stringBuilder16 = tokeniser1.dataBuffer;
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState18 = tokeniser1.getState();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState18);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        tokeniser5.emit('4');
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        boolean boolean10 = tokeniser9.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag12 = tokeniser9.createTagPending(true);
        tokeniser5.tagPending = tag12;
        tokeniser1.emit((org.jsoup.parser.Token) tag12);
        tokeniser1.emit("");
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Tag tag19 = tokeniser1.tagPending;
        tokeniser1.createDoctypePending();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(tag19);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag9 = tokeniser6.createTagPending(true);
        tokeniser1.emit((org.jsoup.parser.Token) tag9);
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.Token.Tag tag13 = tokeniser1.tagPending;
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        boolean boolean17 = tokeniser16.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        tokeniser19.emit('4');
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        boolean boolean24 = tokeniser23.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag26 = tokeniser23.createTagPending(true);
        tokeniser19.tagPending = tag26;
        tokeniser16.tagPending = tag26;
        org.jsoup.parser.TokeniserState tokeniserState29 = tokeniser16.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(tokeniserState29);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        tokeniser1.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState8 = org.jsoup.parser.TokeniserState.TagOpen;
        tokeniser1.eofError(tokeniserState8);
        tokeniser1.setTrackErrors(false);
        tokeniser1.emit(' ');
        org.jsoup.parser.Token.Tag tag15 = tokeniser1.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        boolean boolean18 = tokeniser17.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        tokeniser20.emit('4');
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        boolean boolean25 = tokeniser24.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag27 = tokeniser24.createTagPending(true);
        tokeniser20.tagPending = tag27;
        tokeniser17.tagPending = tag27;
        tokeniser17.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        tokeniser32.emit('4');
        tokeniser32.createTempBuffer();
        tokeniser32.setTrackErrors(false);
        org.jsoup.parser.Token.Doctype doctype38 = null;
        tokeniser32.doctypePending = doctype38;
        java.lang.StringBuilder stringBuilder40 = tokeniser32.dataBuffer;
        tokeniser17.dataBuffer = stringBuilder40;
        tokeniser1.dataBuffer = stringBuilder40;
        tokeniser1.createCommentPending();
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(stringBuilder40);
        org.junit.Assert.assertEquals(stringBuilder40.toString(), "");
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment7 = tokeniser1.commentPending;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        boolean boolean10 = tokeniser9.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag12 = tokeniser9.createTagPending(true);
        tokeniser1.emit((org.jsoup.parser.Token) tag12);
        tokeniser1.emit("");
        boolean boolean16 = tokeniser1.isTrackErrors();
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        org.jsoup.parser.TokeniserState tokeniserState22 = tokeniser21.getState();
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        boolean boolean25 = tokeniser24.currentNodeInHtmlNS();
        tokeniser24.createCommentPending();
        boolean boolean27 = tokeniser24.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment28 = tokeniser24.commentPending;
        tokeniser21.commentPending = comment28;
        tokeniser19.commentPending = comment28;
        org.jsoup.parser.Token.Tag tag32 = tokeniser19.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype33 = tokeniser19.doctypePending;
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader34);
        boolean boolean36 = tokeniser35.currentNodeInHtmlNS();
        tokeniser35.createCommentPending();
        tokeniser35.emitCommentPending();
        java.lang.StringBuilder stringBuilder39 = tokeniser35.dataBuffer;
        org.jsoup.parser.Token.Comment comment40 = tokeniser35.commentPending;
        tokeniser19.commentPending = comment40;
        tokeniser19.setTrackErrors(true);
        org.jsoup.parser.CharacterReader characterReader44 = null;
        org.jsoup.parser.Tokeniser tokeniser45 = new org.jsoup.parser.Tokeniser(characterReader44);
        tokeniser45.emit("");
        tokeniser45.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader49 = null;
        org.jsoup.parser.Tokeniser tokeniser50 = new org.jsoup.parser.Tokeniser(characterReader49);
        tokeniser50.emit('4');
        tokeniser50.createTempBuffer();
        tokeniser50.setTrackErrors(false);
        tokeniser50.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype57 = null;
        tokeniser50.doctypePending = doctype57;
        tokeniser50.emit("");
        tokeniser50.createCommentPending();
        tokeniser50.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader63 = null;
        org.jsoup.parser.Tokeniser tokeniser64 = new org.jsoup.parser.Tokeniser(characterReader63);
        tokeniser64.emit("");
        tokeniser64.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState68 = tokeniser64.getState();
        tokeniser64.createDoctypePending();
        org.jsoup.parser.Token.Tag tag71 = tokeniser64.createTagPending(false);
        org.jsoup.parser.Token.Tag tag72 = tokeniser64.tagPending;
        org.jsoup.parser.Token.Doctype doctype73 = tokeniser64.doctypePending;
        tokeniser50.doctypePending = doctype73;
        org.jsoup.parser.CharacterReader characterReader75 = null;
        org.jsoup.parser.Tokeniser tokeniser76 = new org.jsoup.parser.Tokeniser(characterReader75);
        tokeniser76.emit("");
        tokeniser76.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState80 = tokeniser76.getState();
        tokeniser76.createDoctypePending();
        org.jsoup.parser.Token.Tag tag83 = tokeniser76.createTagPending(false);
        org.jsoup.parser.Token.Tag tag84 = tokeniser76.tagPending;
        org.jsoup.parser.Token.Doctype doctype85 = tokeniser76.doctypePending;
        tokeniser50.doctypePending = doctype85;
        tokeniser45.doctypePending = doctype85;
        org.jsoup.parser.Token.Comment comment88 = tokeniser45.commentPending;
        tokeniser45.emit('\ufffd');
        org.jsoup.parser.Token.Doctype doctype91 = tokeniser45.doctypePending;
        tokeniser19.doctypePending = doctype91;
        tokeniser1.doctypePending = doctype91;
        org.junit.Assert.assertNull(comment7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(tokeniserState22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(comment28);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNull(doctype33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(stringBuilder39);
        org.junit.Assert.assertNotNull(comment40);
        org.junit.Assert.assertNotNull(tokeniserState68);
        org.junit.Assert.assertNotNull(tag71);
        org.junit.Assert.assertNotNull(tag72);
        org.junit.Assert.assertNotNull(doctype73);
        org.junit.Assert.assertNotNull(tokeniserState80);
        org.junit.Assert.assertNotNull(tag83);
        org.junit.Assert.assertNotNull(tag84);
        org.junit.Assert.assertNotNull(doctype85);
        org.junit.Assert.assertNull(comment88);
        org.junit.Assert.assertNotNull(doctype91);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        tokeniser1.emitCommentPending();
        boolean boolean5 = tokeniser1.isTrackErrors();
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        boolean boolean9 = tokeniser8.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        tokeniser11.emit('4');
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        boolean boolean16 = tokeniser15.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag18 = tokeniser15.createTagPending(true);
        tokeniser11.tagPending = tag18;
        tokeniser8.tagPending = tag18;
        tokeniser8.createTempBuffer();
        java.lang.StringBuilder stringBuilder22 = tokeniser8.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder22;
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader25);
        tokeniser26.emit("");
        tokeniser26.createTempBuffer();
        org.jsoup.parser.Token.Doctype doctype30 = tokeniser26.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState31 = tokeniser26.getState();
        java.lang.StringBuilder stringBuilder32 = tokeniser26.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        boolean boolean35 = tokeniser34.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader36);
        boolean boolean38 = tokeniser37.currentNodeInHtmlNS();
        tokeniser37.createCommentPending();
        boolean boolean40 = tokeniser37.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment41 = tokeniser37.commentPending;
        tokeniser34.commentPending = comment41;
        tokeniser26.commentPending = comment41;
        tokeniser1.commentPending = comment41;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(comment6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertNull(doctype30);
        org.junit.Assert.assertNotNull(tokeniserState31);
        org.junit.Assert.assertNotNull(stringBuilder32);
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(comment41);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        org.jsoup.parser.TokeniserState tokeniserState6 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_singleQuoted;
        tokeniser1.transition(tokeniserState6);
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        tokeniser10.emit("");
        tokeniser10.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState14 = tokeniser10.getState();
        tokeniser10.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser19.getState();
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader21);
        boolean boolean23 = tokeniser22.currentNodeInHtmlNS();
        tokeniser22.createCommentPending();
        boolean boolean25 = tokeniser22.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment26 = tokeniser22.commentPending;
        tokeniser19.commentPending = comment26;
        tokeniser17.commentPending = comment26;
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader29);
        boolean boolean31 = tokeniser30.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype32 = tokeniser30.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState33 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser30.transition(tokeniserState33);
        tokeniser30.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader36);
        tokeniser37.emit('4');
        tokeniser37.createTempBuffer();
        tokeniser37.setTrackErrors(false);
        tokeniser37.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype44 = null;
        tokeniser37.doctypePending = doctype44;
        tokeniser37.emit("");
        tokeniser37.createCommentPending();
        tokeniser37.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader50 = null;
        org.jsoup.parser.Tokeniser tokeniser51 = new org.jsoup.parser.Tokeniser(characterReader50);
        tokeniser51.emit("");
        tokeniser51.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState55 = tokeniser51.getState();
        tokeniser51.createDoctypePending();
        org.jsoup.parser.Token.Tag tag58 = tokeniser51.createTagPending(false);
        org.jsoup.parser.Token.Tag tag59 = tokeniser51.tagPending;
        org.jsoup.parser.Token.Doctype doctype60 = tokeniser51.doctypePending;
        tokeniser37.doctypePending = doctype60;
        org.jsoup.parser.CharacterReader characterReader62 = null;
        org.jsoup.parser.Tokeniser tokeniser63 = new org.jsoup.parser.Tokeniser(characterReader62);
        tokeniser63.emit("");
        tokeniser63.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState67 = tokeniser63.getState();
        tokeniser63.createDoctypePending();
        org.jsoup.parser.Token.Tag tag70 = tokeniser63.createTagPending(false);
        org.jsoup.parser.Token.Tag tag71 = tokeniser63.tagPending;
        org.jsoup.parser.Token.Doctype doctype72 = tokeniser63.doctypePending;
        tokeniser37.doctypePending = doctype72;
        tokeniser30.doctypePending = doctype72;
        tokeniser17.doctypePending = doctype72;
        tokeniser10.doctypePending = doctype72;
        tokeniser1.doctypePending = doctype72;
        org.jsoup.parser.CharacterReader characterReader78 = null;
        org.jsoup.parser.Tokeniser tokeniser79 = new org.jsoup.parser.Tokeniser(characterReader78);
        tokeniser79.emit("");
        org.jsoup.parser.Token.Doctype doctype82 = null;
        tokeniser79.doctypePending = doctype82;
        tokeniser79.createTempBuffer();
        tokeniser79.emit("");
        org.jsoup.parser.TokeniserState tokeniserState87 = tokeniser79.getState();
        tokeniser79.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Doctype doctype89 = null;
        tokeniser79.doctypePending = doctype89;
        java.lang.StringBuilder stringBuilder91 = tokeniser79.dataBuffer;
        java.lang.StringBuilder stringBuilder92 = tokeniser79.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder92;
        boolean boolean94 = tokeniser1.currentNodeInHtmlNS();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNotNull(tokeniserState6);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(comment26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(doctype32);
        org.junit.Assert.assertNotNull(tokeniserState33);
        org.junit.Assert.assertNotNull(tokeniserState55);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertNotNull(tag59);
        org.junit.Assert.assertNotNull(doctype60);
        org.junit.Assert.assertNotNull(tokeniserState67);
        org.junit.Assert.assertNotNull(tag70);
        org.junit.Assert.assertNotNull(tag71);
        org.junit.Assert.assertNotNull(doctype72);
        org.junit.Assert.assertNotNull(tokeniserState87);
        org.junit.Assert.assertNotNull(stringBuilder91);
        org.junit.Assert.assertEquals(stringBuilder91.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder92);
        org.junit.Assert.assertEquals(stringBuilder92.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.createTagPending(true);
        org.jsoup.parser.Token.Comment comment5 = null;
        tokeniser1.commentPending = comment5;
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser1.doctypePending = doctype7;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype10 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag12 = tokeniser1.createTagPending(false);
        tokeniser1.emit('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(doctype10);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader3 = null;
        org.jsoup.parser.Tokeniser tokeniser4 = new org.jsoup.parser.Tokeniser(characterReader3);
        tokeniser4.emit('4');
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        boolean boolean9 = tokeniser8.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag11 = tokeniser8.createTagPending(true);
        tokeniser4.tagPending = tag11;
        tokeniser1.tagPending = tag11;
        java.lang.StringBuilder stringBuilder14 = tokeniser1.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState15 = org.jsoup.parser.TokeniserState.ScriptDataEndTagName;
        tokeniser1.transition(tokeniserState15);
        org.jsoup.parser.Token.Tag tag17 = tokeniser1.tagPending;
        tokeniser1.createTempBuffer();
        java.lang.StringBuilder stringBuilder19 = tokeniser1.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        tokeniser21.emit('4');
        tokeniser21.createTempBuffer();
        tokeniser21.setTrackErrors(false);
        tokeniser21.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype28 = null;
        tokeniser21.doctypePending = doctype28;
        tokeniser21.emit("");
        tokeniser21.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState33 = tokeniser21.getState();
        org.jsoup.parser.Token.Comment comment34 = tokeniser21.commentPending;
        org.jsoup.parser.Token.Comment comment35 = tokeniser21.commentPending;
        tokeniser1.commentPending = comment35;
        tokeniser1.createTempBuffer();
        org.jsoup.parser.Token.Tag tag38 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader39 = null;
        org.jsoup.parser.Tokeniser tokeniser40 = new org.jsoup.parser.Tokeniser(characterReader39);
        tokeniser40.emit("");
        org.jsoup.parser.Token.Doctype doctype43 = null;
        tokeniser40.doctypePending = doctype43;
        tokeniser40.createTempBuffer();
        tokeniser40.emit("");
        boolean boolean48 = tokeniser40.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader49 = null;
        org.jsoup.parser.Tokeniser tokeniser50 = new org.jsoup.parser.Tokeniser(characterReader49);
        tokeniser50.emit('4');
        org.jsoup.parser.CharacterReader characterReader53 = null;
        org.jsoup.parser.Tokeniser tokeniser54 = new org.jsoup.parser.Tokeniser(characterReader53);
        boolean boolean55 = tokeniser54.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag57 = tokeniser54.createTagPending(true);
        tokeniser50.tagPending = tag57;
        org.jsoup.parser.Token.Tag tag60 = tokeniser50.createTagPending(false);
        boolean boolean61 = tokeniser50.isTrackErrors();
        org.jsoup.parser.Token.Tag tag63 = tokeniser50.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader64 = null;
        org.jsoup.parser.Tokeniser tokeniser65 = new org.jsoup.parser.Tokeniser(characterReader64);
        tokeniser65.emit("");
        tokeniser65.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState69 = tokeniser65.getState();
        tokeniser65.createDoctypePending();
        org.jsoup.parser.Token.Tag tag72 = tokeniser65.createTagPending(false);
        org.jsoup.parser.Token.Tag tag73 = tokeniser65.tagPending;
        org.jsoup.parser.Token.Doctype doctype74 = tokeniser65.doctypePending;
        tokeniser50.doctypePending = doctype74;
        tokeniser40.doctypePending = doctype74;
        tokeniser1.doctypePending = doctype74;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNull(stringBuilder14);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState33);
        org.junit.Assert.assertNotNull(comment34);
        org.junit.Assert.assertNotNull(comment35);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertNotNull(tag60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(tag63);
        org.junit.Assert.assertNotNull(tokeniserState69);
        org.junit.Assert.assertNotNull(tag72);
        org.junit.Assert.assertNotNull(tag73);
        org.junit.Assert.assertNotNull(doctype74);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype8 = null;
        tokeniser1.doctypePending = doctype8;
        tokeniser1.emit("");
        tokeniser1.createCommentPending();
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        tokeniser15.emit("");
        tokeniser15.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState19 = tokeniser15.getState();
        tokeniser15.createDoctypePending();
        org.jsoup.parser.Token.Tag tag22 = tokeniser15.createTagPending(false);
        org.jsoup.parser.Token.Tag tag23 = tokeniser15.tagPending;
        org.jsoup.parser.Token.Doctype doctype24 = tokeniser15.doctypePending;
        tokeniser1.doctypePending = doctype24;
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader26);
        tokeniser27.emit("");
        tokeniser27.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState31 = tokeniser27.getState();
        tokeniser27.createDoctypePending();
        org.jsoup.parser.Token.Tag tag34 = tokeniser27.createTagPending(false);
        org.jsoup.parser.Token.Tag tag35 = tokeniser27.tagPending;
        org.jsoup.parser.Token.Doctype doctype36 = tokeniser27.doctypePending;
        tokeniser1.doctypePending = doctype36;
        org.jsoup.parser.Token.Tag tag38 = tokeniser1.tagPending;
        tokeniser1.createDoctypePending();
        tokeniser1.emit('a');
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(doctype24);
        org.junit.Assert.assertNotNull(tokeniserState31);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(doctype36);
        org.junit.Assert.assertNull(tag38);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        org.jsoup.parser.Token.Doctype doctype6 = null;
        tokeniser1.doctypePending = doctype6;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        boolean boolean10 = tokeniser9.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser9.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState12 = tokeniser9.getState();
        tokeniser9.createCommentPending();
        boolean boolean14 = tokeniser9.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        tokeniser16.emit("");
        tokeniser16.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser16.getState();
        java.lang.StringBuilder stringBuilder21 = null;
        tokeniser16.dataBuffer = stringBuilder21;
        tokeniser16.setTrackErrors(true);
        boolean boolean25 = tokeniser16.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState26 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_singleQuoted;
        tokeniser16.transition(tokeniserState26);
        org.jsoup.parser.Token.Doctype doctype28 = null;
        tokeniser16.doctypePending = doctype28;
        boolean boolean30 = tokeniser16.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        org.jsoup.parser.TokeniserState tokeniserState35 = tokeniser34.getState();
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader36);
        boolean boolean38 = tokeniser37.currentNodeInHtmlNS();
        tokeniser37.createCommentPending();
        boolean boolean40 = tokeniser37.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment41 = tokeniser37.commentPending;
        tokeniser34.commentPending = comment41;
        tokeniser32.commentPending = comment41;
        org.jsoup.parser.CharacterReader characterReader44 = null;
        org.jsoup.parser.Tokeniser tokeniser45 = new org.jsoup.parser.Tokeniser(characterReader44);
        boolean boolean46 = tokeniser45.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype47 = tokeniser45.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState48 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser45.transition(tokeniserState48);
        tokeniser45.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader51 = null;
        org.jsoup.parser.Tokeniser tokeniser52 = new org.jsoup.parser.Tokeniser(characterReader51);
        tokeniser52.emit('4');
        tokeniser52.createTempBuffer();
        tokeniser52.setTrackErrors(false);
        tokeniser52.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype59 = null;
        tokeniser52.doctypePending = doctype59;
        tokeniser52.emit("");
        tokeniser52.createCommentPending();
        tokeniser52.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader65 = null;
        org.jsoup.parser.Tokeniser tokeniser66 = new org.jsoup.parser.Tokeniser(characterReader65);
        tokeniser66.emit("");
        tokeniser66.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState70 = tokeniser66.getState();
        tokeniser66.createDoctypePending();
        org.jsoup.parser.Token.Tag tag73 = tokeniser66.createTagPending(false);
        org.jsoup.parser.Token.Tag tag74 = tokeniser66.tagPending;
        org.jsoup.parser.Token.Doctype doctype75 = tokeniser66.doctypePending;
        tokeniser52.doctypePending = doctype75;
        org.jsoup.parser.CharacterReader characterReader77 = null;
        org.jsoup.parser.Tokeniser tokeniser78 = new org.jsoup.parser.Tokeniser(characterReader77);
        tokeniser78.emit("");
        tokeniser78.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState82 = tokeniser78.getState();
        tokeniser78.createDoctypePending();
        org.jsoup.parser.Token.Tag tag85 = tokeniser78.createTagPending(false);
        org.jsoup.parser.Token.Tag tag86 = tokeniser78.tagPending;
        org.jsoup.parser.Token.Doctype doctype87 = tokeniser78.doctypePending;
        tokeniser52.doctypePending = doctype87;
        tokeniser45.doctypePending = doctype87;
        tokeniser32.doctypePending = doctype87;
        tokeniser16.doctypePending = doctype87;
        tokeniser9.doctypePending = doctype87;
        tokeniser1.doctypePending = doctype87;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token94 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(doctype11);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tokeniserState26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(tokeniserState35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(comment41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(doctype47);
        org.junit.Assert.assertNotNull(tokeniserState48);
        org.junit.Assert.assertNotNull(tokeniserState70);
        org.junit.Assert.assertNotNull(tag73);
        org.junit.Assert.assertNotNull(tag74);
        org.junit.Assert.assertNotNull(doctype75);
        org.junit.Assert.assertNotNull(tokeniserState82);
        org.junit.Assert.assertNotNull(tag85);
        org.junit.Assert.assertNotNull(tag86);
        org.junit.Assert.assertNotNull(doctype87);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState7 = org.jsoup.parser.TokeniserState.BogusDoctype;
        tokeniser1.transition(tokeniserState7);
        java.lang.StringBuilder stringBuilder9 = tokeniser1.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        tokeniser11.emit("");
        org.jsoup.parser.Token.Doctype doctype14 = null;
        tokeniser11.doctypePending = doctype14;
        org.jsoup.parser.Token.Doctype doctype16 = null;
        tokeniser11.doctypePending = doctype16;
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        tokeniser19.emit('4');
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        boolean boolean24 = tokeniser23.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag26 = tokeniser23.createTagPending(true);
        tokeniser19.tagPending = tag26;
        org.jsoup.parser.TokeniserState tokeniserState28 = tokeniser19.getState();
        org.jsoup.parser.TokeniserState tokeniserState29 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemIdentifier;
        tokeniser19.transition(tokeniserState29);
        tokeniser11.transition(tokeniserState29);
        org.jsoup.parser.CharacterReader characterReader32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader32);
        tokeniser33.emit("");
        org.jsoup.parser.Token.Doctype doctype36 = null;
        tokeniser33.doctypePending = doctype36;
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader38);
        org.jsoup.parser.TokeniserState tokeniserState40 = tokeniser39.getState();
        org.jsoup.parser.CharacterReader characterReader41 = null;
        org.jsoup.parser.Tokeniser tokeniser42 = new org.jsoup.parser.Tokeniser(characterReader41);
        boolean boolean43 = tokeniser42.currentNodeInHtmlNS();
        tokeniser42.createCommentPending();
        boolean boolean45 = tokeniser42.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment46 = tokeniser42.commentPending;
        tokeniser39.commentPending = comment46;
        tokeniser39.createTempBuffer();
        java.lang.StringBuilder stringBuilder49 = tokeniser39.dataBuffer;
        tokeniser33.dataBuffer = stringBuilder49;
        tokeniser11.dataBuffer = stringBuilder49;
        tokeniser1.dataBuffer = stringBuilder49;
        tokeniser1.createTempBuffer();
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(tokeniserState28);
        org.junit.Assert.assertNotNull(tokeniserState29);
        org.junit.Assert.assertNotNull(tokeniserState40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(comment46);
        org.junit.Assert.assertNotNull(stringBuilder49);
        org.junit.Assert.assertEquals(stringBuilder49.toString(), "");
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        tokeniser9.emit('4');
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        boolean boolean14 = tokeniser13.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag16 = tokeniser13.createTagPending(true);
        tokeniser9.tagPending = tag16;
        tokeniser6.tagPending = tag16;
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.CommentEndDash;
        tokeniser6.transition(tokeniserState19);
        tokeniser1.transition(tokeniserState19);
        org.jsoup.parser.Token.Doctype doctype22 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Doctype doctype23 = tokeniser1.doctypePending;
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader24);
        boolean boolean26 = tokeniser25.currentNodeInHtmlNS();
        tokeniser25.createCommentPending();
        tokeniser25.emitCommentPending();
        java.lang.StringBuilder stringBuilder29 = null;
        tokeniser25.dataBuffer = stringBuilder29;
        org.jsoup.parser.Token.Comment comment31 = tokeniser25.commentPending;
        tokeniser1.commentPending = comment31;
        java.lang.StringBuilder stringBuilder33 = tokeniser1.dataBuffer;
        boolean boolean34 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNull(doctype22);
        org.junit.Assert.assertNull(doctype23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(comment31);
        org.junit.Assert.assertNull(stringBuilder33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        org.jsoup.parser.Token.Comment comment9 = null;
        tokeniser1.commentPending = comment9;
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.BetweenDoctypePublicAndSystemIdentifiers;
        tokeniser1.transition(tokeniserState11);
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        tokeniser14.emit("");
        org.jsoup.parser.Token.Doctype doctype17 = null;
        tokeniser14.doctypePending = doctype17;
        tokeniser14.createTempBuffer();
        tokeniser14.emit("");
        org.jsoup.parser.Token.Comment comment22 = null;
        tokeniser14.commentPending = comment22;
        org.jsoup.parser.Token.Comment comment24 = null;
        tokeniser14.commentPending = comment24;
        org.jsoup.parser.Token.Doctype doctype26 = null;
        tokeniser14.doctypePending = doctype26;
        tokeniser14.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment29 = null;
        tokeniser14.commentPending = comment29;
        java.lang.StringBuilder stringBuilder31 = tokeniser14.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder31;
        tokeniser1.createDoctypePending();
        tokeniser1.emit('4');
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser1.getState();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag8 = tokeniser1.createTagPending(false);
        org.jsoup.parser.Token.Tag tag9 = tokeniser1.tagPending;
        org.jsoup.parser.Token.Doctype doctype10 = tokeniser1.doctypePending;
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        tokeniser12.emit('4');
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        tokeniser16.emit("");
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        boolean boolean21 = tokeniser20.currentNodeInHtmlNS();
        tokeniser20.createCommentPending();
        boolean boolean23 = tokeniser20.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag24 = null;
        tokeniser20.tagPending = tag24;
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader26);
        boolean boolean28 = tokeniser27.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader29);
        tokeniser30.emit('4');
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        boolean boolean35 = tokeniser34.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag37 = tokeniser34.createTagPending(true);
        tokeniser30.tagPending = tag37;
        tokeniser27.tagPending = tag37;
        tokeniser20.tagPending = tag37;
        tokeniser16.emit((org.jsoup.parser.Token) tag37);
        tokeniser12.tagPending = tag37;
        tokeniser12.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader44 = null;
        org.jsoup.parser.Tokeniser tokeniser45 = new org.jsoup.parser.Tokeniser(characterReader44);
        boolean boolean46 = tokeniser45.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype47 = tokeniser45.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState48 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser45.transition(tokeniserState48);
        org.jsoup.parser.CharacterReader characterReader50 = null;
        org.jsoup.parser.Tokeniser tokeniser51 = new org.jsoup.parser.Tokeniser(characterReader50);
        boolean boolean52 = tokeniser51.currentNodeInHtmlNS();
        tokeniser51.createCommentPending();
        tokeniser51.emitCommentPending();
        java.lang.StringBuilder stringBuilder55 = null;
        tokeniser51.dataBuffer = stringBuilder55;
        org.jsoup.parser.Token.Comment comment57 = tokeniser51.commentPending;
        tokeniser45.commentPending = comment57;
        tokeniser45.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader61 = null;
        org.jsoup.parser.Tokeniser tokeniser62 = new org.jsoup.parser.Tokeniser(characterReader61);
        tokeniser62.emit("");
        tokeniser62.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState66 = tokeniser62.getState();
        tokeniser62.createDoctypePending();
        org.jsoup.parser.Token.Tag tag69 = tokeniser62.createTagPending(false);
        org.jsoup.parser.Token.Tag tag70 = tokeniser62.tagPending;
        org.jsoup.parser.Token.Doctype doctype71 = tokeniser62.doctypePending;
        tokeniser45.doctypePending = doctype71;
        tokeniser12.doctypePending = doctype71;
        tokeniser1.doctypePending = doctype71;
        org.jsoup.parser.TokeniserState tokeniserState75 = tokeniser1.getState();
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(doctype10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(doctype47);
        org.junit.Assert.assertNotNull(tokeniserState48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(comment57);
        org.junit.Assert.assertNotNull(tokeniserState66);
        org.junit.Assert.assertNotNull(tag69);
        org.junit.Assert.assertNotNull(tag70);
        org.junit.Assert.assertNotNull(doctype71);
        org.junit.Assert.assertNotNull(tokeniserState75);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        boolean boolean6 = tokeniser5.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag8 = tokeniser5.createTagPending(true);
        tokeniser1.tagPending = tag8;
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser1.getState();
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemIdentifier;
        tokeniser1.transition(tokeniserState11);
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment14 = tokeniser1.commentPending;
        org.jsoup.parser.TokeniserState tokeniserState15 = tokeniser1.getState();
        java.lang.StringBuilder stringBuilder16 = tokeniser1.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        tokeniser18.emit("");
        org.jsoup.parser.Token.Doctype doctype21 = null;
        tokeniser18.doctypePending = doctype21;
        tokeniser18.createTempBuffer();
        tokeniser18.emit("");
        org.jsoup.parser.Token.Comment comment26 = null;
        tokeniser18.commentPending = comment26;
        org.jsoup.parser.Token.Tag tag29 = tokeniser18.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader30);
        boolean boolean32 = tokeniser31.currentNodeInHtmlNS();
        tokeniser31.emit('4');
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.Tokeniser tokeniser36 = new org.jsoup.parser.Tokeniser(characterReader35);
        boolean boolean37 = tokeniser36.currentNodeInHtmlNS();
        tokeniser36.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader39 = null;
        org.jsoup.parser.Tokeniser tokeniser40 = new org.jsoup.parser.Tokeniser(characterReader39);
        tokeniser40.emit('4');
        org.jsoup.parser.CharacterReader characterReader43 = null;
        org.jsoup.parser.Tokeniser tokeniser44 = new org.jsoup.parser.Tokeniser(characterReader43);
        boolean boolean45 = tokeniser44.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag47 = tokeniser44.createTagPending(true);
        tokeniser40.tagPending = tag47;
        tokeniser36.emit((org.jsoup.parser.Token) tag47);
        tokeniser31.emit((org.jsoup.parser.Token) tag47);
        tokeniser18.emit((org.jsoup.parser.Token) tag47);
        org.jsoup.parser.Token token52 = tokeniser18.read();
        org.jsoup.parser.Token.Tag tag53 = tokeniser18.tagPending;
        tokeniser1.emit((org.jsoup.parser.Token) tag53);
        org.jsoup.parser.TokeniserState tokeniserState55 = tokeniser1.getState();
        boolean boolean56 = tokeniser1.isTrackErrors();
        tokeniser1.createDoctypePending();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNull(comment14);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertNull(stringBuilder16);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNotNull(token52);
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertNotNull(tokeniserState55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        org.jsoup.parser.Token.Comment comment6 = null;
        tokeniser1.commentPending = comment6;
        tokeniser1.emit("");
        org.jsoup.parser.Token.Comment comment10 = tokeniser1.commentPending;
        tokeniser1.emit('#');
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        tokeniser14.emit("");
        org.jsoup.parser.Token.Doctype doctype17 = null;
        tokeniser14.doctypePending = doctype17;
        tokeniser14.createTempBuffer();
        tokeniser14.emit("");
        org.jsoup.parser.Token.Comment comment22 = null;
        tokeniser14.commentPending = comment22;
        org.jsoup.parser.Token.Comment comment24 = null;
        tokeniser14.commentPending = comment24;
        org.jsoup.parser.Token.Doctype doctype26 = null;
        tokeniser14.doctypePending = doctype26;
        tokeniser14.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment29 = null;
        tokeniser14.commentPending = comment29;
        org.jsoup.parser.Token.Doctype doctype31 = tokeniser14.doctypePending;
        tokeniser14.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag34 = tokeniser14.createTagPending(true);
        tokeniser1.tagPending = tag34;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment10);
        org.junit.Assert.assertNull(doctype31);
        org.junit.Assert.assertNotNull(tag34);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype8 = null;
        tokeniser1.doctypePending = doctype8;
        tokeniser1.emit("");
        tokeniser1.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser1.getState();
        tokeniser1.emit('a');
        tokeniser1.emitCommentPending();
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        tokeniser20.emit("");
        tokeniser20.emit("");
        tokeniser20.createTempBuffer();
        tokeniser20.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader28);
        org.jsoup.parser.Token.Comment comment30 = tokeniser29.commentPending;
        org.jsoup.parser.TokeniserState tokeniserState31 = tokeniser29.getState();
        tokeniser20.transition(tokeniserState31);
        tokeniser1.error(tokeniserState31);
        org.jsoup.parser.Token token34 = tokeniser1.read();
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNull(comment30);
        org.junit.Assert.assertNotNull(tokeniserState31);
        org.junit.Assert.assertNotNull(token34);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        tokeniser13.emit('4');
        tokeniser13.createTempBuffer();
        tokeniser13.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment19 = tokeniser13.commentPending;
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        boolean boolean22 = tokeniser21.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag24 = tokeniser21.createTagPending(true);
        tokeniser13.emit((org.jsoup.parser.Token) tag24);
        tokeniser13.emit("");
        boolean boolean28 = tokeniser13.isTrackErrors();
        org.jsoup.parser.Token.Tag tag29 = tokeniser13.tagPending;
        org.jsoup.parser.CharacterReader characterReader30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader30);
        tokeniser31.emit("");
        org.jsoup.parser.Token.Doctype doctype34 = null;
        tokeniser31.doctypePending = doctype34;
        org.jsoup.parser.Token.Comment comment36 = null;
        tokeniser31.commentPending = comment36;
        tokeniser31.emit("");
        org.jsoup.parser.Token.Comment comment40 = tokeniser31.commentPending;
        tokeniser31.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader42 = null;
        org.jsoup.parser.Tokeniser tokeniser43 = new org.jsoup.parser.Tokeniser(characterReader42);
        tokeniser43.emit("");
        tokeniser43.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState47 = tokeniser43.getState();
        tokeniser43.createDoctypePending();
        tokeniser43.setTrackErrors(true);
        org.jsoup.parser.Token.Doctype doctype51 = tokeniser43.doctypePending;
        tokeniser31.doctypePending = doctype51;
        tokeniser13.doctypePending = doctype51;
        tokeniser1.doctypePending = doctype51;
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNull(comment19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(tag29);
        org.junit.Assert.assertNull(comment40);
        org.junit.Assert.assertNotNull(tokeniserState47);
        org.junit.Assert.assertNotNull(doctype51);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        tokeniser9.emit('4');
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        boolean boolean14 = tokeniser13.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag16 = tokeniser13.createTagPending(true);
        tokeniser9.tagPending = tag16;
        tokeniser6.tagPending = tag16;
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.CommentEndDash;
        tokeniser6.transition(tokeniserState19);
        tokeniser1.transition(tokeniserState19);
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        boolean boolean24 = tokeniser23.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState25 = org.jsoup.parser.TokeniserState.TagName;
        tokeniser23.transition(tokeniserState25);
        tokeniser23.emit('\ufffd');
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader29);
        boolean boolean31 = tokeniser30.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag33 = tokeniser30.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader34);
        boolean boolean36 = tokeniser35.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag38 = tokeniser35.createTagPending(true);
        tokeniser30.emit((org.jsoup.parser.Token) tag38);
        tokeniser23.emit((org.jsoup.parser.Token) tag38);
        tokeniser1.tagPending = tag38;
        org.jsoup.parser.Token.Tag tag43 = tokeniser1.createTagPending(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(tokeniserState25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(tag43);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        tokeniser1.createCommentPending();
        tokeniser1.createDoctypePending();
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        tokeniser11.emit("");
        tokeniser11.emit("");
        tokeniser11.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState17 = tokeniser11.getState();
        tokeniser11.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        boolean boolean21 = tokeniser20.currentNodeInHtmlNS();
        tokeniser20.createCommentPending();
        tokeniser20.emitCommentPending();
        java.lang.StringBuilder stringBuilder24 = null;
        tokeniser20.dataBuffer = stringBuilder24;
        org.jsoup.parser.Token.Comment comment26 = tokeniser20.commentPending;
        tokeniser11.commentPending = comment26;
        tokeniser1.commentPending = comment26;
        org.jsoup.parser.Token.Tag tag29 = tokeniser1.tagPending;
        tokeniser1.setTrackErrors(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char34 = tokeniser1.consumeCharacterReference((java.lang.Character) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(comment26);
        org.junit.Assert.assertNull(tag29);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        boolean boolean4 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser1.tagPending = tag5;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        boolean boolean9 = tokeniser8.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        tokeniser11.emit('4');
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        boolean boolean16 = tokeniser15.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag18 = tokeniser15.createTagPending(true);
        tokeniser11.tagPending = tag18;
        tokeniser8.tagPending = tag18;
        tokeniser1.tagPending = tag18;
        boolean boolean22 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emitCommentPending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment25 = tokeniser1.commentPending;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(comment25);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser1.getState();
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser1.dataBuffer = stringBuilder6;
        tokeniser1.setTrackErrors(true);
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_singleQuoted;
        tokeniser1.transition(tokeniserState11);
        org.jsoup.parser.Token.Doctype doctype13 = null;
        tokeniser1.doctypePending = doctype13;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        boolean boolean18 = tokeniser17.currentNodeInHtmlNS();
        tokeniser17.createCommentPending();
        boolean boolean20 = tokeniser17.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag21 = null;
        tokeniser17.tagPending = tag21;
        org.jsoup.parser.Token.Comment comment23 = null;
        tokeniser17.commentPending = comment23;
        tokeniser17.emit("");
        tokeniser17.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader28);
        boolean boolean30 = tokeniser29.currentNodeInHtmlNS();
        tokeniser29.createCommentPending();
        boolean boolean32 = tokeniser29.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag33 = null;
        tokeniser29.tagPending = tag33;
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.Tokeniser tokeniser36 = new org.jsoup.parser.Tokeniser(characterReader35);
        boolean boolean37 = tokeniser36.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader38);
        tokeniser39.emit('4');
        org.jsoup.parser.CharacterReader characterReader42 = null;
        org.jsoup.parser.Tokeniser tokeniser43 = new org.jsoup.parser.Tokeniser(characterReader42);
        boolean boolean44 = tokeniser43.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag46 = tokeniser43.createTagPending(true);
        tokeniser39.tagPending = tag46;
        tokeniser36.tagPending = tag46;
        tokeniser29.tagPending = tag46;
        org.jsoup.parser.CharacterReader characterReader50 = null;
        org.jsoup.parser.Tokeniser tokeniser51 = new org.jsoup.parser.Tokeniser(characterReader50);
        tokeniser51.emit('4');
        tokeniser51.createTempBuffer();
        tokeniser51.setTrackErrors(false);
        org.jsoup.parser.Token.Doctype doctype57 = null;
        tokeniser51.doctypePending = doctype57;
        java.lang.StringBuilder stringBuilder59 = tokeniser51.dataBuffer;
        tokeniser29.dataBuffer = stringBuilder59;
        tokeniser17.dataBuffer = stringBuilder59;
        tokeniser1.dataBuffer = stringBuilder59;
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNotNull(stringBuilder59);
        org.junit.Assert.assertEquals(stringBuilder59.toString(), "");
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        boolean boolean3 = tokeniser1.isTrackErrors();
        tokeniser1.emit("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.Token.Comment comment2 = tokeniser1.commentPending;
        org.jsoup.parser.CharacterReader characterReader3 = null;
        org.jsoup.parser.Tokeniser tokeniser4 = new org.jsoup.parser.Tokeniser(characterReader3);
        tokeniser4.emit('4');
        tokeniser4.createTempBuffer();
        tokeniser4.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        tokeniser11.emit("");
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        boolean boolean16 = tokeniser15.currentNodeInHtmlNS();
        tokeniser15.createCommentPending();
        boolean boolean18 = tokeniser15.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag19 = null;
        tokeniser15.tagPending = tag19;
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader21);
        boolean boolean23 = tokeniser22.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader24);
        tokeniser25.emit('4');
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader28);
        boolean boolean30 = tokeniser29.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag32 = tokeniser29.createTagPending(true);
        tokeniser25.tagPending = tag32;
        tokeniser22.tagPending = tag32;
        tokeniser15.tagPending = tag32;
        tokeniser11.emit((org.jsoup.parser.Token) tag32);
        tokeniser4.emit((org.jsoup.parser.Token) tag32);
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader38);
        boolean boolean40 = tokeniser39.currentNodeInHtmlNS();
        tokeniser39.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState42 = tokeniser39.getState();
        org.jsoup.parser.CharacterReader characterReader43 = null;
        org.jsoup.parser.Tokeniser tokeniser44 = new org.jsoup.parser.Tokeniser(characterReader43);
        tokeniser44.emit("");
        tokeniser44.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState48 = tokeniser44.getState();
        tokeniser44.createDoctypePending();
        java.lang.StringBuilder stringBuilder50 = tokeniser44.dataBuffer;
        tokeniser39.dataBuffer = stringBuilder50;
        tokeniser4.dataBuffer = stringBuilder50;
        tokeniser1.dataBuffer = stringBuilder50;
        org.jsoup.parser.CharacterReader characterReader54 = null;
        org.jsoup.parser.Tokeniser tokeniser55 = new org.jsoup.parser.Tokeniser(characterReader54);
        boolean boolean56 = tokeniser55.currentNodeInHtmlNS();
        tokeniser55.createCommentPending();
        tokeniser55.emitCommentPending();
        boolean boolean59 = tokeniser55.isTrackErrors();
        org.jsoup.parser.Token.Comment comment60 = tokeniser55.commentPending;
        tokeniser1.commentPending = comment60;
        org.jsoup.parser.TokeniserState tokeniserState62 = org.jsoup.parser.TokeniserState.RCDATAEndTagName;
        tokeniser1.transition(tokeniserState62);
        org.junit.Assert.assertNull(comment2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(tokeniserState42);
        org.junit.Assert.assertNotNull(tokeniserState48);
        org.junit.Assert.assertNotNull(stringBuilder50);
        org.junit.Assert.assertEquals(stringBuilder50.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(comment60);
        org.junit.Assert.assertNotNull(tokeniserState62);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser1.getState();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag8 = tokeniser1.createTagPending(false);
        org.jsoup.parser.Token.Tag tag9 = tokeniser1.tagPending;
        org.jsoup.parser.Token.Doctype doctype10 = tokeniser1.doctypePending;
        tokeniser1.emit("hi!");
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(doctype10);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader6);
        boolean boolean8 = tokeniser7.currentNodeInHtmlNS();
        tokeniser7.createCommentPending();
        tokeniser7.emitCommentPending();
        java.lang.StringBuilder stringBuilder11 = null;
        tokeniser7.dataBuffer = stringBuilder11;
        org.jsoup.parser.Token.Comment comment13 = tokeniser7.commentPending;
        tokeniser1.commentPending = comment13;
        tokeniser1.setTrackErrors(false);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment18 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Doctype doctype19 = tokeniser1.doctypePending;
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Tag tag22 = tokeniser1.createTagPending(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(comment13);
        org.junit.Assert.assertNotNull(comment18);
        org.junit.Assert.assertNotNull(doctype19);
        org.junit.Assert.assertNotNull(tag22);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.Token.Comment comment2 = tokeniser1.commentPending;
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser1.getState();
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader6);
        tokeniser7.emit("");
        org.jsoup.parser.Token.Doctype doctype10 = null;
        tokeniser7.doctypePending = doctype10;
        tokeniser7.createTempBuffer();
        tokeniser7.emit("");
        org.jsoup.parser.Token.Comment comment15 = null;
        tokeniser7.commentPending = comment15;
        org.jsoup.parser.Token.Tag tag18 = tokeniser7.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        boolean boolean21 = tokeniser20.currentNodeInHtmlNS();
        tokeniser20.emit('4');
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader24);
        boolean boolean26 = tokeniser25.currentNodeInHtmlNS();
        tokeniser25.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader28);
        tokeniser29.emit('4');
        org.jsoup.parser.CharacterReader characterReader32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader32);
        boolean boolean34 = tokeniser33.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag36 = tokeniser33.createTagPending(true);
        tokeniser29.tagPending = tag36;
        tokeniser25.emit((org.jsoup.parser.Token) tag36);
        tokeniser20.emit((org.jsoup.parser.Token) tag36);
        tokeniser7.emit((org.jsoup.parser.Token) tag36);
        tokeniser7.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState43 = tokeniser7.getState();
        boolean boolean44 = tokeniser7.currentNodeInHtmlNS();
        java.lang.StringBuilder stringBuilder45 = tokeniser7.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder45;
        java.lang.StringBuilder stringBuilder47 = tokeniser1.dataBuffer;
        tokeniser1.createDoctypePending();
        org.junit.Assert.assertNull(comment2);
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(tokeniserState43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(stringBuilder45);
        org.junit.Assert.assertEquals(stringBuilder45.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder47);
        org.junit.Assert.assertEquals(stringBuilder47.toString(), "");
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader6);
        boolean boolean8 = tokeniser7.currentNodeInHtmlNS();
        tokeniser7.createCommentPending();
        tokeniser7.emitCommentPending();
        java.lang.StringBuilder stringBuilder11 = null;
        tokeniser7.dataBuffer = stringBuilder11;
        org.jsoup.parser.Token.Comment comment13 = tokeniser7.commentPending;
        tokeniser1.commentPending = comment13;
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        tokeniser18.emit("");
        tokeniser18.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState22 = tokeniser18.getState();
        tokeniser18.createDoctypePending();
        org.jsoup.parser.Token.Tag tag25 = tokeniser18.createTagPending(false);
        org.jsoup.parser.Token.Tag tag26 = tokeniser18.tagPending;
        org.jsoup.parser.Token.Doctype doctype27 = tokeniser18.doctypePending;
        tokeniser1.doctypePending = doctype27;
        org.jsoup.parser.TokeniserState tokeniserState29 = tokeniser1.getState();
        tokeniser1.createDoctypePending();
        tokeniser1.createTempBuffer();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(comment13);
        org.junit.Assert.assertNotNull(tokeniserState22);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(doctype27);
        org.junit.Assert.assertNotNull(tokeniserState29);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag12 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        tokeniser14.emit("");
        org.jsoup.parser.Token.Doctype doctype17 = null;
        tokeniser14.doctypePending = doctype17;
        tokeniser14.createTempBuffer();
        tokeniser14.emit("");
        org.jsoup.parser.TokeniserState tokeniserState22 = tokeniser14.getState();
        tokeniser14.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Doctype doctype24 = null;
        tokeniser14.doctypePending = doctype24;
        java.lang.StringBuilder stringBuilder26 = tokeniser14.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder26;
        java.lang.StringBuilder stringBuilder28 = tokeniser1.dataBuffer;
        org.jsoup.parser.Token.Comment comment29 = tokeniser1.commentPending;
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader32);
        tokeniser33.emit("");
        org.jsoup.parser.Token.Doctype doctype36 = null;
        tokeniser33.doctypePending = doctype36;
        tokeniser33.createTempBuffer();
        tokeniser33.emit("");
        org.jsoup.parser.Token.Comment comment41 = null;
        tokeniser33.commentPending = comment41;
        org.jsoup.parser.Token.Tag tag44 = tokeniser33.createTagPending(true);
        boolean boolean45 = tokeniser33.isTrackErrors();
        tokeniser33.createDoctypePending();
        boolean boolean47 = tokeniser33.currentNodeInHtmlNS();
        tokeniser33.emit("");
        java.lang.StringBuilder stringBuilder50 = tokeniser33.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder50;
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNull(tag12);
        org.junit.Assert.assertNotNull(tokeniserState22);
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertNull(comment29);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(stringBuilder50);
        org.junit.Assert.assertEquals(stringBuilder50.toString(), "");
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag5 = tokeniser1.createTagPending(true);
        tokeniser1.createTempBuffer();
        org.jsoup.parser.Token.Doctype doctype7 = tokeniser1.doctypePending;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(doctype7);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        boolean boolean6 = tokeniser5.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag8 = tokeniser5.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        boolean boolean11 = tokeniser10.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag13 = tokeniser10.createTagPending(true);
        tokeniser5.emit((org.jsoup.parser.Token) tag13);
        tokeniser1.emit((org.jsoup.parser.Token) tag13);
        java.lang.StringBuilder stringBuilder16 = tokeniser1.dataBuffer;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char19 = tokeniser1.consumeCharacterReference((java.lang.Character) '\ufffd', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNull(stringBuilder16);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        boolean boolean6 = tokeniser5.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag8 = tokeniser5.createTagPending(true);
        tokeniser1.tagPending = tag8;
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser1.getState();
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemIdentifier;
        tokeniser1.transition(tokeniserState11);
        tokeniser1.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNotNull(tokeniserState11);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader3 = null;
        org.jsoup.parser.Tokeniser tokeniser4 = new org.jsoup.parser.Tokeniser(characterReader3);
        tokeniser4.emit('4');
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        boolean boolean9 = tokeniser8.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag11 = tokeniser8.createTagPending(true);
        tokeniser4.tagPending = tag11;
        tokeniser1.tagPending = tag11;
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        tokeniser15.emit('4');
        tokeniser15.createTempBuffer();
        tokeniser15.emit('\ufffd');
        java.lang.StringBuilder stringBuilder21 = tokeniser15.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder21;
        org.jsoup.parser.Token.Tag tag23 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader24);
        boolean boolean26 = tokeniser25.currentNodeInHtmlNS();
        tokeniser25.createCommentPending();
        boolean boolean28 = tokeniser25.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag29 = null;
        tokeniser25.tagPending = tag29;
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        boolean boolean33 = tokeniser32.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader34);
        tokeniser35.emit('4');
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader38);
        boolean boolean40 = tokeniser39.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag42 = tokeniser39.createTagPending(true);
        tokeniser35.tagPending = tag42;
        tokeniser32.tagPending = tag42;
        tokeniser25.tagPending = tag42;
        boolean boolean46 = tokeniser25.currentNodeInHtmlNS();
        tokeniser25.emitCommentPending();
        tokeniser25.createCommentPending();
        tokeniser25.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader50 = null;
        org.jsoup.parser.Tokeniser tokeniser51 = new org.jsoup.parser.Tokeniser(characterReader50);
        boolean boolean52 = tokeniser51.currentNodeInHtmlNS();
        tokeniser51.createCommentPending();
        boolean boolean54 = tokeniser51.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag55 = null;
        tokeniser51.tagPending = tag55;
        org.jsoup.parser.CharacterReader characterReader57 = null;
        org.jsoup.parser.Tokeniser tokeniser58 = new org.jsoup.parser.Tokeniser(characterReader57);
        boolean boolean59 = tokeniser58.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader60 = null;
        org.jsoup.parser.Tokeniser tokeniser61 = new org.jsoup.parser.Tokeniser(characterReader60);
        tokeniser61.emit('4');
        org.jsoup.parser.CharacterReader characterReader64 = null;
        org.jsoup.parser.Tokeniser tokeniser65 = new org.jsoup.parser.Tokeniser(characterReader64);
        boolean boolean66 = tokeniser65.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag68 = tokeniser65.createTagPending(true);
        tokeniser61.tagPending = tag68;
        tokeniser58.tagPending = tag68;
        tokeniser51.tagPending = tag68;
        boolean boolean72 = tokeniser51.currentNodeInHtmlNS();
        tokeniser51.emitCommentPending();
        tokeniser51.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState75 = tokeniser51.getState();
        tokeniser25.transition(tokeniserState75);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(tag68);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(tokeniserState75);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        tokeniser10.emit("");
        tokeniser10.emit("");
        tokeniser10.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState16 = tokeniser10.getState();
        boolean boolean17 = tokeniser10.currentNodeInHtmlNS();
        java.lang.StringBuilder stringBuilder18 = tokeniser10.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder18;
        org.jsoup.parser.Token.Doctype doctype20 = null;
        tokeniser1.doctypePending = doctype20;
        tokeniser1.createTempBuffer();
        org.jsoup.parser.Token.Tag tag24 = tokeniser1.createTagPending(false);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertNotNull(tag24);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.CharacterReader characterReader2 = null;
        org.jsoup.parser.Tokeniser tokeniser3 = new org.jsoup.parser.Tokeniser(characterReader2);
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser3.getState();
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        tokeniser6.createCommentPending();
        boolean boolean9 = tokeniser6.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment10 = tokeniser6.commentPending;
        tokeniser3.commentPending = comment10;
        tokeniser1.commentPending = comment10;
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        boolean boolean15 = tokeniser14.currentNodeInHtmlNS();
        tokeniser14.emit('4');
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        boolean boolean20 = tokeniser19.currentNodeInHtmlNS();
        tokeniser19.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        tokeniser23.emit('4');
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader26);
        boolean boolean28 = tokeniser27.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag30 = tokeniser27.createTagPending(true);
        tokeniser23.tagPending = tag30;
        tokeniser19.emit((org.jsoup.parser.Token) tag30);
        tokeniser14.emit((org.jsoup.parser.Token) tag30);
        tokeniser1.tagPending = tag30;
        tokeniser1.emitCommentPending();
        tokeniser1.acknowledgeSelfClosingFlag();
        java.lang.StringBuilder stringBuilder37 = tokeniser1.dataBuffer;
        tokeniser1.createDoctypePending();
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(comment10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNull(stringBuilder37);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        org.jsoup.parser.Token.Comment comment6 = null;
        tokeniser1.commentPending = comment6;
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        tokeniser11.emit("");
        org.jsoup.parser.Token.Doctype doctype14 = null;
        tokeniser11.doctypePending = doctype14;
        tokeniser11.createTempBuffer();
        tokeniser11.emit("");
        org.jsoup.parser.Token.Comment comment19 = null;
        tokeniser11.commentPending = comment19;
        org.jsoup.parser.Token.Tag tag22 = tokeniser11.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        boolean boolean25 = tokeniser24.currentNodeInHtmlNS();
        tokeniser24.emit('4');
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader28);
        boolean boolean30 = tokeniser29.currentNodeInHtmlNS();
        tokeniser29.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader32);
        tokeniser33.emit('4');
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader36);
        boolean boolean38 = tokeniser37.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag40 = tokeniser37.createTagPending(true);
        tokeniser33.tagPending = tag40;
        tokeniser29.emit((org.jsoup.parser.Token) tag40);
        tokeniser24.emit((org.jsoup.parser.Token) tag40);
        tokeniser11.emit((org.jsoup.parser.Token) tag40);
        tokeniser11.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState47 = tokeniser11.getState();
        tokeniser1.eofError(tokeniserState47);
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader50 = null;
        org.jsoup.parser.Tokeniser tokeniser51 = new org.jsoup.parser.Tokeniser(characterReader50);
        boolean boolean52 = tokeniser51.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag54 = tokeniser51.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader55 = null;
        org.jsoup.parser.Tokeniser tokeniser56 = new org.jsoup.parser.Tokeniser(characterReader55);
        boolean boolean57 = tokeniser56.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag59 = tokeniser56.createTagPending(true);
        tokeniser51.emit((org.jsoup.parser.Token) tag59);
        tokeniser51.setTrackErrors(true);
        org.jsoup.parser.Token.Tag tag63 = tokeniser51.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState64 = tokeniser51.getState();
        tokeniser1.eofError(tokeniserState64);
        tokeniser1.emit('a');
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertNotNull(tokeniserState47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(tag54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(tag59);
        org.junit.Assert.assertNotNull(tag63);
        org.junit.Assert.assertNotNull(tokeniserState64);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.Token.Tag tag8 = tokeniser1.createTagPending(true);
        boolean boolean9 = tokeniser1.isTrackErrors();
        tokeniser1.createTempBuffer();
        tokeniser1.createCommentPending();
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        org.jsoup.parser.Token.Tag tag6 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        tokeniser8.emit("");
        tokeniser8.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState12 = tokeniser8.getState();
        tokeniser8.createDoctypePending();
        org.jsoup.parser.Token.Tag tag15 = tokeniser8.createTagPending(false);
        tokeniser1.tagPending = tag15;
        boolean boolean17 = tokeniser1.isTrackErrors();
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        tokeniser19.emit("");
        tokeniser19.createTempBuffer();
        org.jsoup.parser.Token.Doctype doctype23 = tokeniser19.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState24 = tokeniser19.getState();
        java.lang.StringBuilder stringBuilder25 = tokeniser19.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder25;
        org.jsoup.parser.TokeniserState tokeniserState27 = tokeniser1.getState();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char30 = tokeniser1.consumeCharacterReference((java.lang.Character) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag6);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(doctype23);
        org.junit.Assert.assertNotNull(tokeniserState24);
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState27);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag9 = tokeniser6.createTagPending(true);
        tokeniser1.emit((org.jsoup.parser.Token) tag9);
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.Token.Tag tag13 = tokeniser1.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState14 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        tokeniser16.emit("");
        tokeniser16.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser16.getState();
        java.lang.StringBuilder stringBuilder21 = null;
        tokeniser16.dataBuffer = stringBuilder21;
        org.jsoup.parser.TokeniserState tokeniserState23 = tokeniser16.getState();
        tokeniser16.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype25 = tokeniser16.doctypePending;
        org.jsoup.parser.Token.Tag tag26 = tokeniser16.tagPending;
        tokeniser16.emit("hi!");
        tokeniser16.setTrackErrors(true);
        tokeniser16.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader32 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState14.read(tokeniser16, characterReader32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertNotNull(tokeniserState23);
        org.junit.Assert.assertNull(doctype25);
        org.junit.Assert.assertNull(tag26);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment7 = tokeniser1.commentPending;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        boolean boolean10 = tokeniser9.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag12 = tokeniser9.createTagPending(true);
        tokeniser1.emit((org.jsoup.parser.Token) tag12);
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token token15 = tokeniser1.read();
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        tokeniser17.emit("");
        org.jsoup.parser.Token.Doctype doctype20 = null;
        tokeniser17.doctypePending = doctype20;
        tokeniser17.createTempBuffer();
        tokeniser17.emit("");
        org.jsoup.parser.Token.Comment comment25 = null;
        tokeniser17.commentPending = comment25;
        org.jsoup.parser.Token.Tag tag28 = tokeniser17.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader29);
        boolean boolean31 = tokeniser30.currentNodeInHtmlNS();
        tokeniser30.emit('4');
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader34);
        boolean boolean36 = tokeniser35.currentNodeInHtmlNS();
        tokeniser35.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader38);
        tokeniser39.emit('4');
        org.jsoup.parser.CharacterReader characterReader42 = null;
        org.jsoup.parser.Tokeniser tokeniser43 = new org.jsoup.parser.Tokeniser(characterReader42);
        boolean boolean44 = tokeniser43.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag46 = tokeniser43.createTagPending(true);
        tokeniser39.tagPending = tag46;
        tokeniser35.emit((org.jsoup.parser.Token) tag46);
        tokeniser30.emit((org.jsoup.parser.Token) tag46);
        tokeniser17.emit((org.jsoup.parser.Token) tag46);
        org.jsoup.parser.Token token51 = tokeniser17.read();
        java.lang.StringBuilder stringBuilder52 = tokeniser17.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder52;
        org.jsoup.parser.Token.Tag tag55 = tokeniser1.createTagPending(true);
        tokeniser1.setTrackErrors(true);
        org.junit.Assert.assertNull(comment7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(token15);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNotNull(token51);
        org.junit.Assert.assertNotNull(stringBuilder52);
        org.junit.Assert.assertEquals(stringBuilder52.toString(), "");
        org.junit.Assert.assertNotNull(tag55);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader3 = null;
        org.jsoup.parser.Tokeniser tokeniser4 = new org.jsoup.parser.Tokeniser(characterReader3);
        tokeniser4.emit('4');
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        boolean boolean9 = tokeniser8.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag11 = tokeniser8.createTagPending(true);
        tokeniser4.tagPending = tag11;
        tokeniser1.tagPending = tag11;
        java.lang.StringBuilder stringBuilder14 = tokeniser1.dataBuffer;
        org.jsoup.parser.Token.Tag tag15 = tokeniser1.tagPending;
        boolean boolean16 = tokeniser1.isTrackErrors();
        boolean boolean17 = tokeniser1.isTrackErrors();
        tokeniser1.createTempBuffer();
        org.jsoup.parser.Token.Comment comment19 = tokeniser1.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token20 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNull(stringBuilder14);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(comment19);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment7 = tokeniser1.commentPending;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        boolean boolean10 = tokeniser9.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag12 = tokeniser9.createTagPending(true);
        tokeniser1.emit((org.jsoup.parser.Token) tag12);
        tokeniser1.emit("");
        org.jsoup.parser.TokeniserState tokeniserState16 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        boolean boolean19 = tokeniser18.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype20 = tokeniser18.doctypePending;
        org.jsoup.parser.Token.Tag tag21 = tokeniser18.tagPending;
        org.jsoup.parser.Token.Tag tag23 = tokeniser18.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader24);
        tokeniser25.emit('4');
        tokeniser25.createTempBuffer();
        tokeniser25.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        tokeniser32.emit("");
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.Tokeniser tokeniser36 = new org.jsoup.parser.Tokeniser(characterReader35);
        boolean boolean37 = tokeniser36.currentNodeInHtmlNS();
        tokeniser36.createCommentPending();
        boolean boolean39 = tokeniser36.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag40 = null;
        tokeniser36.tagPending = tag40;
        org.jsoup.parser.CharacterReader characterReader42 = null;
        org.jsoup.parser.Tokeniser tokeniser43 = new org.jsoup.parser.Tokeniser(characterReader42);
        boolean boolean44 = tokeniser43.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader45 = null;
        org.jsoup.parser.Tokeniser tokeniser46 = new org.jsoup.parser.Tokeniser(characterReader45);
        tokeniser46.emit('4');
        org.jsoup.parser.CharacterReader characterReader49 = null;
        org.jsoup.parser.Tokeniser tokeniser50 = new org.jsoup.parser.Tokeniser(characterReader49);
        boolean boolean51 = tokeniser50.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag53 = tokeniser50.createTagPending(true);
        tokeniser46.tagPending = tag53;
        tokeniser43.tagPending = tag53;
        tokeniser36.tagPending = tag53;
        tokeniser32.emit((org.jsoup.parser.Token) tag53);
        tokeniser25.emit((org.jsoup.parser.Token) tag53);
        org.jsoup.parser.CharacterReader characterReader59 = null;
        org.jsoup.parser.Tokeniser tokeniser60 = new org.jsoup.parser.Tokeniser(characterReader59);
        boolean boolean61 = tokeniser60.currentNodeInHtmlNS();
        tokeniser60.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState63 = tokeniser60.getState();
        org.jsoup.parser.CharacterReader characterReader64 = null;
        org.jsoup.parser.Tokeniser tokeniser65 = new org.jsoup.parser.Tokeniser(characterReader64);
        tokeniser65.emit("");
        tokeniser65.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState69 = tokeniser65.getState();
        tokeniser65.createDoctypePending();
        java.lang.StringBuilder stringBuilder71 = tokeniser65.dataBuffer;
        tokeniser60.dataBuffer = stringBuilder71;
        tokeniser25.dataBuffer = stringBuilder71;
        org.jsoup.parser.CharacterReader characterReader74 = null;
        org.jsoup.parser.Tokeniser tokeniser75 = new org.jsoup.parser.Tokeniser(characterReader74);
        org.jsoup.parser.CharacterReader characterReader76 = null;
        org.jsoup.parser.Tokeniser tokeniser77 = new org.jsoup.parser.Tokeniser(characterReader76);
        org.jsoup.parser.TokeniserState tokeniserState78 = tokeniser77.getState();
        org.jsoup.parser.CharacterReader characterReader79 = null;
        org.jsoup.parser.Tokeniser tokeniser80 = new org.jsoup.parser.Tokeniser(characterReader79);
        boolean boolean81 = tokeniser80.currentNodeInHtmlNS();
        tokeniser80.createCommentPending();
        boolean boolean83 = tokeniser80.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment84 = tokeniser80.commentPending;
        tokeniser77.commentPending = comment84;
        tokeniser75.commentPending = comment84;
        tokeniser25.commentPending = comment84;
        tokeniser18.commentPending = comment84;
        tokeniser1.commentPending = comment84;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean90 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(doctype20);
        org.junit.Assert.assertNull(tag21);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(tokeniserState63);
        org.junit.Assert.assertNotNull(tokeniserState69);
        org.junit.Assert.assertNotNull(stringBuilder71);
        org.junit.Assert.assertEquals(stringBuilder71.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState78);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(comment84);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        boolean boolean10 = tokeniser9.currentNodeInHtmlNS();
        tokeniser9.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState12 = tokeniser9.getState();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        tokeniser14.emit("");
        org.jsoup.parser.Token.Doctype doctype17 = null;
        tokeniser14.doctypePending = doctype17;
        tokeniser14.createTempBuffer();
        tokeniser14.emit("");
        org.jsoup.parser.Token.Comment comment22 = null;
        tokeniser14.commentPending = comment22;
        org.jsoup.parser.Token.Comment comment24 = null;
        tokeniser14.commentPending = comment24;
        org.jsoup.parser.Token.Doctype doctype26 = null;
        tokeniser14.doctypePending = doctype26;
        java.lang.StringBuilder stringBuilder28 = tokeniser14.dataBuffer;
        tokeniser9.dataBuffer = stringBuilder28;
        tokeniser1.dataBuffer = stringBuilder28;
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        boolean boolean33 = tokeniser32.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader34);
        tokeniser35.emit('4');
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader38);
        boolean boolean40 = tokeniser39.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag42 = tokeniser39.createTagPending(true);
        tokeniser35.tagPending = tag42;
        tokeniser32.tagPending = tag42;
        org.jsoup.parser.TokeniserState tokeniserState45 = org.jsoup.parser.TokeniserState.CommentEndDash;
        tokeniser32.transition(tokeniserState45);
        org.jsoup.parser.CharacterReader characterReader47 = null;
        org.jsoup.parser.Tokeniser tokeniser48 = new org.jsoup.parser.Tokeniser(characterReader47);
        boolean boolean49 = tokeniser48.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype50 = tokeniser48.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState51 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser48.transition(tokeniserState51);
        tokeniser32.transition(tokeniserState51);
        org.jsoup.parser.CharacterReader characterReader54 = null;
        org.jsoup.parser.Tokeniser tokeniser55 = new org.jsoup.parser.Tokeniser(characterReader54);
        tokeniser55.emit("");
        org.jsoup.parser.Token.Doctype doctype58 = null;
        tokeniser55.doctypePending = doctype58;
        tokeniser55.createTempBuffer();
        tokeniser55.emit("");
        org.jsoup.parser.Token.Comment comment63 = null;
        tokeniser55.commentPending = comment63;
        org.jsoup.parser.Token.Comment comment65 = null;
        tokeniser55.commentPending = comment65;
        org.jsoup.parser.Token.Doctype doctype67 = null;
        tokeniser55.doctypePending = doctype67;
        tokeniser55.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment70 = null;
        tokeniser55.commentPending = comment70;
        org.jsoup.parser.Token.Doctype doctype72 = tokeniser55.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState73 = tokeniser55.getState();
        java.lang.StringBuilder stringBuilder74 = tokeniser55.dataBuffer;
        tokeniser32.dataBuffer = stringBuilder74;
        tokeniser1.dataBuffer = stringBuilder74;
        org.jsoup.parser.TokeniserState tokeniserState77 = tokeniser1.getState();
        org.jsoup.parser.Token.Doctype doctype78 = tokeniser1.doctypePending;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertNotNull(tokeniserState45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(doctype50);
        org.junit.Assert.assertNotNull(tokeniserState51);
        org.junit.Assert.assertNull(doctype72);
        org.junit.Assert.assertNotNull(tokeniserState73);
        org.junit.Assert.assertNotNull(stringBuilder74);
        org.junit.Assert.assertEquals(stringBuilder74.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState77);
        org.junit.Assert.assertNotNull(doctype78);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        boolean boolean10 = tokeniser9.currentNodeInHtmlNS();
        tokeniser9.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState12 = tokeniser9.getState();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        tokeniser14.emit("");
        org.jsoup.parser.Token.Doctype doctype17 = null;
        tokeniser14.doctypePending = doctype17;
        tokeniser14.createTempBuffer();
        tokeniser14.emit("");
        org.jsoup.parser.Token.Comment comment22 = null;
        tokeniser14.commentPending = comment22;
        org.jsoup.parser.Token.Comment comment24 = null;
        tokeniser14.commentPending = comment24;
        org.jsoup.parser.Token.Doctype doctype26 = null;
        tokeniser14.doctypePending = doctype26;
        java.lang.StringBuilder stringBuilder28 = tokeniser14.dataBuffer;
        tokeniser9.dataBuffer = stringBuilder28;
        tokeniser1.dataBuffer = stringBuilder28;
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        tokeniser32.emit("");
        org.jsoup.parser.Token.Doctype doctype35 = null;
        tokeniser32.doctypePending = doctype35;
        org.jsoup.parser.Token.Doctype doctype37 = null;
        tokeniser32.doctypePending = doctype37;
        org.jsoup.parser.CharacterReader characterReader39 = null;
        org.jsoup.parser.Tokeniser tokeniser40 = new org.jsoup.parser.Tokeniser(characterReader39);
        tokeniser40.emit('4');
        org.jsoup.parser.CharacterReader characterReader43 = null;
        org.jsoup.parser.Tokeniser tokeniser44 = new org.jsoup.parser.Tokeniser(characterReader43);
        boolean boolean45 = tokeniser44.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag47 = tokeniser44.createTagPending(true);
        tokeniser40.tagPending = tag47;
        org.jsoup.parser.TokeniserState tokeniserState49 = tokeniser40.getState();
        org.jsoup.parser.TokeniserState tokeniserState50 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemIdentifier;
        tokeniser40.transition(tokeniserState50);
        tokeniser32.transition(tokeniserState50);
        org.jsoup.parser.CharacterReader characterReader53 = null;
        org.jsoup.parser.Tokeniser tokeniser54 = new org.jsoup.parser.Tokeniser(characterReader53);
        tokeniser54.emit("");
        org.jsoup.parser.Token.Doctype doctype57 = null;
        tokeniser54.doctypePending = doctype57;
        org.jsoup.parser.CharacterReader characterReader59 = null;
        org.jsoup.parser.Tokeniser tokeniser60 = new org.jsoup.parser.Tokeniser(characterReader59);
        org.jsoup.parser.TokeniserState tokeniserState61 = tokeniser60.getState();
        org.jsoup.parser.CharacterReader characterReader62 = null;
        org.jsoup.parser.Tokeniser tokeniser63 = new org.jsoup.parser.Tokeniser(characterReader62);
        boolean boolean64 = tokeniser63.currentNodeInHtmlNS();
        tokeniser63.createCommentPending();
        boolean boolean66 = tokeniser63.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment67 = tokeniser63.commentPending;
        tokeniser60.commentPending = comment67;
        tokeniser60.createTempBuffer();
        java.lang.StringBuilder stringBuilder70 = tokeniser60.dataBuffer;
        tokeniser54.dataBuffer = stringBuilder70;
        tokeniser32.dataBuffer = stringBuilder70;
        tokeniser1.dataBuffer = stringBuilder70;
        org.jsoup.parser.Token.Doctype doctype74 = null;
        tokeniser1.doctypePending = doctype74;
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Comment comment77 = tokeniser1.commentPending;
        boolean boolean78 = tokeniser1.isTrackErrors();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNotNull(tokeniserState49);
        org.junit.Assert.assertNotNull(tokeniserState50);
        org.junit.Assert.assertNotNull(tokeniserState61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(comment67);
        org.junit.Assert.assertNotNull(stringBuilder70);
        org.junit.Assert.assertEquals(stringBuilder70.toString(), "");
        org.junit.Assert.assertNotNull(comment77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.createTagPending(true);
        org.jsoup.parser.Token.Comment comment5 = tokeniser1.commentPending;
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        boolean boolean9 = tokeniser8.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype10 = tokeniser8.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser8.transition(tokeniserState11);
        org.jsoup.parser.Token.Comment comment13 = tokeniser8.commentPending;
        tokeniser8.createDoctypePending();
        java.lang.StringBuilder stringBuilder15 = tokeniser8.dataBuffer;
        tokeniser8.setTrackErrors(false);
        boolean boolean18 = tokeniser8.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        boolean boolean21 = tokeniser20.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag23 = tokeniser20.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader24);
        boolean boolean26 = tokeniser25.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag28 = tokeniser25.createTagPending(true);
        tokeniser20.emit((org.jsoup.parser.Token) tag28);
        org.jsoup.parser.CharacterReader characterReader30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader30);
        org.jsoup.parser.CharacterReader characterReader32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader32);
        org.jsoup.parser.TokeniserState tokeniserState34 = tokeniser33.getState();
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.Tokeniser tokeniser36 = new org.jsoup.parser.Tokeniser(characterReader35);
        boolean boolean37 = tokeniser36.currentNodeInHtmlNS();
        tokeniser36.createCommentPending();
        boolean boolean39 = tokeniser36.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment40 = tokeniser36.commentPending;
        tokeniser33.commentPending = comment40;
        tokeniser31.commentPending = comment40;
        tokeniser20.commentPending = comment40;
        tokeniser8.emit((org.jsoup.parser.Token) comment40);
        org.jsoup.parser.CharacterReader characterReader45 = null;
        org.jsoup.parser.Tokeniser tokeniser46 = new org.jsoup.parser.Tokeniser(characterReader45);
        tokeniser46.emit('4');
        tokeniser46.createTempBuffer();
        tokeniser46.setTrackErrors(false);
        tokeniser46.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState53 = org.jsoup.parser.TokeniserState.TagOpen;
        tokeniser46.eofError(tokeniserState53);
        tokeniser46.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader57 = null;
        org.jsoup.parser.Tokeniser tokeniser58 = new org.jsoup.parser.Tokeniser(characterReader57);
        tokeniser58.emit("");
        org.jsoup.parser.Token.Doctype doctype61 = null;
        tokeniser58.doctypePending = doctype61;
        tokeniser58.createTempBuffer();
        tokeniser58.emit("");
        org.jsoup.parser.Token.Comment comment66 = null;
        tokeniser58.commentPending = comment66;
        org.jsoup.parser.Token.Comment comment68 = null;
        tokeniser58.commentPending = comment68;
        org.jsoup.parser.Token.Doctype doctype70 = null;
        tokeniser58.doctypePending = doctype70;
        java.lang.StringBuilder stringBuilder72 = tokeniser58.dataBuffer;
        tokeniser46.dataBuffer = stringBuilder72;
        tokeniser46.createCommentPending();
        java.lang.StringBuilder stringBuilder75 = tokeniser46.dataBuffer;
        tokeniser46.emit('a');
        org.jsoup.parser.CharacterReader characterReader78 = null;
        org.jsoup.parser.Tokeniser tokeniser79 = new org.jsoup.parser.Tokeniser(characterReader78);
        boolean boolean80 = tokeniser79.currentNodeInHtmlNS();
        tokeniser79.createCommentPending();
        boolean boolean82 = tokeniser79.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment83 = tokeniser79.commentPending;
        tokeniser46.commentPending = comment83;
        tokeniser8.commentPending = comment83;
        tokeniser1.commentPending = comment83;
        boolean boolean87 = tokeniser1.currentNodeInHtmlNS();
        boolean boolean88 = tokeniser1.currentNodeInHtmlNS();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(doctype10);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNull(comment13);
        org.junit.Assert.assertNull(stringBuilder15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(tokeniserState34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(comment40);
        org.junit.Assert.assertNotNull(tokeniserState53);
        org.junit.Assert.assertNotNull(stringBuilder72);
        org.junit.Assert.assertEquals(stringBuilder72.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder75);
        org.junit.Assert.assertEquals(stringBuilder75.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(comment83);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag9 = tokeniser6.createTagPending(true);
        tokeniser1.emit((org.jsoup.parser.Token) tag9);
        boolean boolean11 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        boolean boolean14 = tokeniser13.currentNodeInHtmlNS();
        tokeniser13.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        tokeniser17.emit('4');
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        boolean boolean22 = tokeniser21.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag24 = tokeniser21.createTagPending(true);
        tokeniser17.tagPending = tag24;
        tokeniser13.emit((org.jsoup.parser.Token) tag24);
        tokeniser1.tagPending = tag24;
        org.jsoup.parser.Token.Tag tag28 = tokeniser1.tagPending;
        tokeniser1.createDoctypePending();
        java.lang.StringBuilder stringBuilder30 = tokeniser1.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        tokeniser32.emit("");
        tokeniser32.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState36 = tokeniser32.getState();
        tokeniser32.createDoctypePending();
        org.jsoup.parser.Token.Tag tag39 = tokeniser32.createTagPending(false);
        org.jsoup.parser.Token.Tag tag40 = tokeniser32.tagPending;
        org.jsoup.parser.Token.Doctype doctype41 = tokeniser32.doctypePending;
        org.jsoup.parser.CharacterReader characterReader42 = null;
        org.jsoup.parser.Tokeniser tokeniser43 = new org.jsoup.parser.Tokeniser(characterReader42);
        tokeniser43.emit("");
        tokeniser43.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState47 = tokeniser43.getState();
        java.lang.StringBuilder stringBuilder48 = null;
        tokeniser43.dataBuffer = stringBuilder48;
        tokeniser43.setTrackErrors(true);
        boolean boolean52 = tokeniser43.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader53 = null;
        org.jsoup.parser.Tokeniser tokeniser54 = new org.jsoup.parser.Tokeniser(characterReader53);
        boolean boolean55 = tokeniser54.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype56 = tokeniser54.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState57 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser54.transition(tokeniserState57);
        org.jsoup.parser.Token.Comment comment59 = tokeniser54.commentPending;
        tokeniser54.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader61 = null;
        org.jsoup.parser.Tokeniser tokeniser62 = new org.jsoup.parser.Tokeniser(characterReader61);
        boolean boolean63 = tokeniser62.currentNodeInHtmlNS();
        tokeniser62.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState65 = tokeniser62.getState();
        org.jsoup.parser.CharacterReader characterReader66 = null;
        org.jsoup.parser.Tokeniser tokeniser67 = new org.jsoup.parser.Tokeniser(characterReader66);
        tokeniser67.emit("");
        org.jsoup.parser.Token.Doctype doctype70 = null;
        tokeniser67.doctypePending = doctype70;
        tokeniser67.createTempBuffer();
        tokeniser67.emit("");
        org.jsoup.parser.Token.Comment comment75 = null;
        tokeniser67.commentPending = comment75;
        org.jsoup.parser.Token.Comment comment77 = null;
        tokeniser67.commentPending = comment77;
        org.jsoup.parser.Token.Doctype doctype79 = null;
        tokeniser67.doctypePending = doctype79;
        java.lang.StringBuilder stringBuilder81 = tokeniser67.dataBuffer;
        tokeniser62.dataBuffer = stringBuilder81;
        tokeniser54.dataBuffer = stringBuilder81;
        tokeniser43.dataBuffer = stringBuilder81;
        tokeniser32.dataBuffer = stringBuilder81;
        org.jsoup.parser.Token.Comment comment86 = null;
        tokeniser32.commentPending = comment86;
        java.lang.StringBuilder stringBuilder88 = tokeniser32.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder88;
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.Token.Tag tag92 = tokeniser1.tagPending;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNull(stringBuilder30);
        org.junit.Assert.assertNotNull(tokeniserState36);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertNotNull(doctype41);
        org.junit.Assert.assertNotNull(tokeniserState47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNull(doctype56);
        org.junit.Assert.assertNotNull(tokeniserState57);
        org.junit.Assert.assertNull(comment59);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(tokeniserState65);
        org.junit.Assert.assertNotNull(stringBuilder81);
        org.junit.Assert.assertEquals(stringBuilder81.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder88);
        org.junit.Assert.assertEquals(stringBuilder88.toString(), "");
        org.junit.Assert.assertNotNull(tag92);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        boolean boolean6 = tokeniser5.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag8 = tokeniser5.createTagPending(true);
        tokeniser1.tagPending = tag8;
        org.jsoup.parser.Token.Tag tag11 = tokeniser1.createTagPending(false);
        boolean boolean12 = tokeniser1.isTrackErrors();
        org.jsoup.parser.Token.Tag tag14 = tokeniser1.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        tokeniser16.emit("");
        tokeniser16.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser16.getState();
        tokeniser16.createDoctypePending();
        org.jsoup.parser.Token.Tag tag23 = tokeniser16.createTagPending(false);
        org.jsoup.parser.Token.Tag tag24 = tokeniser16.tagPending;
        org.jsoup.parser.Token.Doctype doctype25 = tokeniser16.doctypePending;
        tokeniser1.doctypePending = doctype25;
        tokeniser1.emitDoctypePending();
        boolean boolean28 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emit(' ');
        java.lang.Class<?> wildcardClass31 = tokeniser1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(doctype25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader3 = null;
        org.jsoup.parser.Tokeniser tokeniser4 = new org.jsoup.parser.Tokeniser(characterReader3);
        tokeniser4.emit('4');
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        boolean boolean9 = tokeniser8.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag11 = tokeniser8.createTagPending(true);
        tokeniser4.tagPending = tag11;
        tokeniser1.tagPending = tag11;
        java.lang.StringBuilder stringBuilder14 = tokeniser1.dataBuffer;
        org.jsoup.parser.Token.Tag tag15 = tokeniser1.tagPending;
        boolean boolean16 = tokeniser1.isTrackErrors();
        boolean boolean17 = tokeniser1.isTrackErrors();
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        tokeniser19.emit("");
        tokeniser19.acknowledgeSelfClosingFlag();
        tokeniser19.createTempBuffer();
        java.lang.StringBuilder stringBuilder24 = tokeniser19.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder24;
        tokeniser1.createTempBuffer();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNull(stringBuilder14);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        tokeniser9.emit('4');
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        boolean boolean14 = tokeniser13.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag16 = tokeniser13.createTagPending(true);
        tokeniser9.tagPending = tag16;
        tokeniser6.tagPending = tag16;
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.CommentEndDash;
        tokeniser6.transition(tokeniserState19);
        tokeniser1.transition(tokeniserState19);
        org.jsoup.parser.Token.Doctype doctype22 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag24 = tokeniser1.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader25);
        tokeniser26.emit("");
        org.jsoup.parser.Token.Doctype doctype29 = null;
        tokeniser26.doctypePending = doctype29;
        org.jsoup.parser.Token.Doctype doctype31 = null;
        tokeniser26.doctypePending = doctype31;
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        tokeniser34.emit('4');
        org.jsoup.parser.CharacterReader characterReader37 = null;
        org.jsoup.parser.Tokeniser tokeniser38 = new org.jsoup.parser.Tokeniser(characterReader37);
        boolean boolean39 = tokeniser38.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag41 = tokeniser38.createTagPending(true);
        tokeniser34.tagPending = tag41;
        org.jsoup.parser.TokeniserState tokeniserState43 = tokeniser34.getState();
        org.jsoup.parser.TokeniserState tokeniserState44 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemIdentifier;
        tokeniser34.transition(tokeniserState44);
        tokeniser26.transition(tokeniserState44);
        org.jsoup.parser.TokeniserState tokeniserState47 = tokeniser26.getState();
        tokeniser1.transition(tokeniserState47);
        tokeniser1.emitTagPending();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNull(doctype22);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(tokeniserState43);
        org.junit.Assert.assertNotNull(tokeniserState44);
        org.junit.Assert.assertNotNull(tokeniserState47);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        boolean boolean4 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        tokeniser9.emit("");
        tokeniser9.emit("");
        org.jsoup.parser.Token.Tag tag14 = tokeniser9.tagPending;
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        tokeniser16.emit("");
        tokeniser16.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser16.getState();
        tokeniser16.createDoctypePending();
        org.jsoup.parser.Token.Tag tag23 = tokeniser16.createTagPending(false);
        tokeniser9.tagPending = tag23;
        boolean boolean25 = tokeniser9.isTrackErrors();
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader26);
        tokeniser27.emit("");
        tokeniser27.createTempBuffer();
        org.jsoup.parser.Token.Doctype doctype31 = tokeniser27.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState32 = tokeniser27.getState();
        java.lang.StringBuilder stringBuilder33 = tokeniser27.dataBuffer;
        tokeniser9.dataBuffer = stringBuilder33;
        tokeniser1.dataBuffer = stringBuilder33;
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader36);
        boolean boolean38 = tokeniser37.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag40 = tokeniser37.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader41 = null;
        org.jsoup.parser.Tokeniser tokeniser42 = new org.jsoup.parser.Tokeniser(characterReader41);
        boolean boolean43 = tokeniser42.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag45 = tokeniser42.createTagPending(true);
        tokeniser37.emit((org.jsoup.parser.Token) tag45);
        tokeniser37.emit(' ');
        org.jsoup.parser.TokeniserState tokeniserState49 = tokeniser37.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(tag14);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(doctype31);
        org.junit.Assert.assertNotNull(tokeniserState32);
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertEquals(stringBuilder33.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNotNull(tokeniserState49);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        tokeniser1.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState8 = org.jsoup.parser.TokeniserState.TagOpen;
        tokeniser1.eofError(tokeniserState8);
        org.jsoup.parser.Token.Doctype doctype10 = tokeniser1.doctypePending;
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        boolean boolean13 = tokeniser12.currentNodeInHtmlNS();
        tokeniser12.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        tokeniser16.emit('4');
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        boolean boolean21 = tokeniser20.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag23 = tokeniser20.createTagPending(true);
        tokeniser16.tagPending = tag23;
        tokeniser12.emit((org.jsoup.parser.Token) tag23);
        org.jsoup.parser.Token.Doctype doctype26 = tokeniser12.doctypePending;
        boolean boolean27 = tokeniser12.isTrackErrors();
        java.lang.StringBuilder stringBuilder28 = tokeniser12.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader29);
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        org.jsoup.parser.TokeniserState tokeniserState33 = tokeniser32.getState();
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader34);
        boolean boolean36 = tokeniser35.currentNodeInHtmlNS();
        tokeniser35.createCommentPending();
        boolean boolean38 = tokeniser35.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment39 = tokeniser35.commentPending;
        tokeniser32.commentPending = comment39;
        tokeniser30.commentPending = comment39;
        org.jsoup.parser.CharacterReader characterReader42 = null;
        org.jsoup.parser.Tokeniser tokeniser43 = new org.jsoup.parser.Tokeniser(characterReader42);
        boolean boolean44 = tokeniser43.currentNodeInHtmlNS();
        tokeniser43.emit('4');
        org.jsoup.parser.CharacterReader characterReader47 = null;
        org.jsoup.parser.Tokeniser tokeniser48 = new org.jsoup.parser.Tokeniser(characterReader47);
        boolean boolean49 = tokeniser48.currentNodeInHtmlNS();
        tokeniser48.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader51 = null;
        org.jsoup.parser.Tokeniser tokeniser52 = new org.jsoup.parser.Tokeniser(characterReader51);
        tokeniser52.emit('4');
        org.jsoup.parser.CharacterReader characterReader55 = null;
        org.jsoup.parser.Tokeniser tokeniser56 = new org.jsoup.parser.Tokeniser(characterReader55);
        boolean boolean57 = tokeniser56.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag59 = tokeniser56.createTagPending(true);
        tokeniser52.tagPending = tag59;
        tokeniser48.emit((org.jsoup.parser.Token) tag59);
        tokeniser43.emit((org.jsoup.parser.Token) tag59);
        tokeniser30.tagPending = tag59;
        org.jsoup.parser.CharacterReader characterReader64 = null;
        org.jsoup.parser.Tokeniser tokeniser65 = new org.jsoup.parser.Tokeniser(characterReader64);
        tokeniser65.emit("");
        org.jsoup.parser.Token.Doctype doctype68 = null;
        tokeniser65.doctypePending = doctype68;
        tokeniser65.createTempBuffer();
        tokeniser65.emit("");
        org.jsoup.parser.Token.Comment comment73 = null;
        tokeniser65.commentPending = comment73;
        org.jsoup.parser.Token.Comment comment75 = null;
        tokeniser65.commentPending = comment75;
        org.jsoup.parser.Token.Doctype doctype77 = null;
        tokeniser65.doctypePending = doctype77;
        java.lang.StringBuilder stringBuilder79 = tokeniser65.dataBuffer;
        tokeniser30.dataBuffer = stringBuilder79;
        tokeniser12.dataBuffer = stringBuilder79;
        org.jsoup.parser.CharacterReader characterReader82 = null;
        org.jsoup.parser.Tokeniser tokeniser83 = new org.jsoup.parser.Tokeniser(characterReader82);
        boolean boolean84 = tokeniser83.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype85 = tokeniser83.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState86 = tokeniser83.getState();
        tokeniser12.transition(tokeniserState86);
        org.jsoup.parser.Token.Tag tag88 = tokeniser12.tagPending;
        org.jsoup.parser.Token.Tag tag90 = tokeniser12.createTagPending(false);
        tokeniser1.tagPending = tag90;
        tokeniser1.emit("");
        boolean boolean94 = tokeniser1.isTrackErrors();
        tokeniser1.emit("");
        org.jsoup.parser.Token.Tag tag97 = tokeniser1.tagPending;
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNull(doctype10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNull(doctype26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(stringBuilder28);
        org.junit.Assert.assertNotNull(tokeniserState33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(comment39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(tag59);
        org.junit.Assert.assertNotNull(stringBuilder79);
        org.junit.Assert.assertEquals(stringBuilder79.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNull(doctype85);
        org.junit.Assert.assertNotNull(tokeniserState86);
        org.junit.Assert.assertNull(tag88);
        org.junit.Assert.assertNotNull(tag90);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(tag97);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        tokeniser1.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState8 = org.jsoup.parser.TokeniserState.TagOpen;
        tokeniser1.eofError(tokeniserState8);
        tokeniser1.setTrackErrors(false);
        tokeniser1.emit(' ');
        org.jsoup.parser.Token.Tag tag14 = tokeniser1.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState15 = tokeniser1.getState();
        org.jsoup.parser.Token.Tag tag16 = tokeniser1.tagPending;
        org.jsoup.parser.Token.Tag tag18 = tokeniser1.createTagPending(false);
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNull(tag14);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertNull(tag16);
        org.junit.Assert.assertNotNull(tag18);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        tokeniser5.emit('4');
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        boolean boolean10 = tokeniser9.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag12 = tokeniser9.createTagPending(true);
        tokeniser5.tagPending = tag12;
        tokeniser1.emit((org.jsoup.parser.Token) tag12);
        org.jsoup.parser.Token.Doctype doctype15 = tokeniser1.doctypePending;
        boolean boolean16 = tokeniser1.isTrackErrors();
        tokeniser1.emit('a');
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedDashDash;
        tokeniser1.transition(tokeniserState19);
        org.jsoup.parser.Token.Tag tag22 = tokeniser1.createTagPending(true);
        java.lang.StringBuilder stringBuilder23 = tokeniser1.dataBuffer;
        tokeniser1.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char27 = tokeniser1.consumeCharacterReference((java.lang.Character) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(doctype15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNull(stringBuilder23);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        tokeniser1.emitCommentPending();
        java.lang.StringBuilder stringBuilder5 = null;
        tokeniser1.dataBuffer = stringBuilder5;
        java.lang.StringBuilder stringBuilder7 = tokeniser1.dataBuffer;
        tokeniser1.emit("hi!");
        tokeniser1.emit('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(stringBuilder7);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser1.getState();
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser1.dataBuffer = stringBuilder6;
        org.jsoup.parser.TokeniserState tokeniserState8 = tokeniser1.getState();
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype10 = tokeniser1.doctypePending;
        tokeniser1.setTrackErrors(false);
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Comment comment14 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Comment comment15 = tokeniser1.commentPending;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag18 = tokeniser1.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype19 = tokeniser1.doctypePending;
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNull(doctype10);
        org.junit.Assert.assertNotNull(comment14);
        org.junit.Assert.assertNotNull(comment15);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNull(doctype19);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag9 = tokeniser6.createTagPending(true);
        tokeniser1.emit((org.jsoup.parser.Token) tag9);
        boolean boolean11 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        boolean boolean14 = tokeniser13.currentNodeInHtmlNS();
        tokeniser13.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        tokeniser17.emit('4');
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        boolean boolean22 = tokeniser21.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag24 = tokeniser21.createTagPending(true);
        tokeniser17.tagPending = tag24;
        tokeniser13.emit((org.jsoup.parser.Token) tag24);
        tokeniser1.tagPending = tag24;
        org.jsoup.parser.Token.Tag tag28 = tokeniser1.tagPending;
        org.jsoup.parser.Token.Comment comment29 = tokeniser1.commentPending;
        boolean boolean30 = tokeniser1.isTrackErrors();
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        tokeniser32.emit("");
        tokeniser32.emit("");
        tokeniser32.createTempBuffer();
        org.jsoup.parser.Token.Tag tag39 = tokeniser32.createTagPending(true);
        java.lang.StringBuilder stringBuilder40 = tokeniser32.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader41 = null;
        org.jsoup.parser.Tokeniser tokeniser42 = new org.jsoup.parser.Tokeniser(characterReader41);
        tokeniser42.emit("");
        org.jsoup.parser.Token.Doctype doctype45 = null;
        tokeniser42.doctypePending = doctype45;
        tokeniser42.createTempBuffer();
        tokeniser42.emit("");
        org.jsoup.parser.Token.Comment comment50 = null;
        tokeniser42.commentPending = comment50;
        org.jsoup.parser.Token.Comment comment52 = null;
        tokeniser42.commentPending = comment52;
        org.jsoup.parser.Token.Doctype doctype54 = null;
        tokeniser42.doctypePending = doctype54;
        java.lang.StringBuilder stringBuilder56 = tokeniser42.dataBuffer;
        java.lang.StringBuilder stringBuilder57 = tokeniser42.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader58 = null;
        org.jsoup.parser.Tokeniser tokeniser59 = new org.jsoup.parser.Tokeniser(characterReader58);
        boolean boolean60 = tokeniser59.currentNodeInHtmlNS();
        tokeniser59.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader62 = null;
        org.jsoup.parser.Tokeniser tokeniser63 = new org.jsoup.parser.Tokeniser(characterReader62);
        tokeniser63.emit('4');
        org.jsoup.parser.CharacterReader characterReader66 = null;
        org.jsoup.parser.Tokeniser tokeniser67 = new org.jsoup.parser.Tokeniser(characterReader66);
        boolean boolean68 = tokeniser67.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag70 = tokeniser67.createTagPending(true);
        tokeniser63.tagPending = tag70;
        tokeniser59.emit((org.jsoup.parser.Token) tag70);
        tokeniser59.createTempBuffer();
        tokeniser59.acknowledgeSelfClosingFlag();
        tokeniser59.setTrackErrors(false);
        org.jsoup.parser.Token.Tag tag77 = tokeniser59.tagPending;
        org.jsoup.parser.Token.Tag tag79 = tokeniser59.createTagPending(true);
        tokeniser42.emit((org.jsoup.parser.Token) tag79);
        tokeniser32.tagPending = tag79;
        tokeniser1.tagPending = tag79;
        tokeniser1.emit("");
        org.jsoup.parser.Token.Tag tag86 = tokeniser1.createTagPending(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNull(comment29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(stringBuilder40);
        org.junit.Assert.assertEquals(stringBuilder40.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder56);
        org.junit.Assert.assertEquals(stringBuilder56.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder57);
        org.junit.Assert.assertEquals(stringBuilder57.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(tag70);
        org.junit.Assert.assertNull(tag77);
        org.junit.Assert.assertNotNull(tag79);
        org.junit.Assert.assertNotNull(tag86);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype8 = null;
        tokeniser1.doctypePending = doctype8;
        tokeniser1.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        boolean boolean14 = tokeniser13.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag16 = tokeniser13.createTagPending(true);
        org.jsoup.parser.Token.Comment comment17 = null;
        tokeniser13.commentPending = comment17;
        tokeniser13.setTrackErrors(true);
        org.jsoup.parser.Token.Tag tag22 = tokeniser13.createTagPending(true);
        tokeniser1.tagPending = tag22;
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader24);
        boolean boolean26 = tokeniser25.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader27);
        tokeniser28.emit('4');
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        boolean boolean33 = tokeniser32.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag35 = tokeniser32.createTagPending(true);
        tokeniser28.tagPending = tag35;
        tokeniser25.tagPending = tag35;
        tokeniser25.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState39 = tokeniser25.getState();
        org.jsoup.parser.Token.Doctype doctype40 = null;
        tokeniser25.doctypePending = doctype40;
        org.jsoup.parser.TokeniserState tokeniserState42 = org.jsoup.parser.TokeniserState.CharacterReferenceInData;
        tokeniser25.transition(tokeniserState42);
        org.jsoup.parser.TokeniserState tokeniserState44 = tokeniser25.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(tokeniserState39);
        org.junit.Assert.assertNotNull(tokeniserState42);
        org.junit.Assert.assertNotNull(tokeniserState44);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.Token.Comment comment2 = tokeniser1.commentPending;
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser1.getState();
        tokeniser1.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        tokeniser6.emit('4');
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        tokeniser10.emit("");
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        boolean boolean15 = tokeniser14.currentNodeInHtmlNS();
        tokeniser14.createCommentPending();
        boolean boolean17 = tokeniser14.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag18 = null;
        tokeniser14.tagPending = tag18;
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        boolean boolean22 = tokeniser21.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        tokeniser24.emit('4');
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader27);
        boolean boolean29 = tokeniser28.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag31 = tokeniser28.createTagPending(true);
        tokeniser24.tagPending = tag31;
        tokeniser21.tagPending = tag31;
        tokeniser14.tagPending = tag31;
        tokeniser10.emit((org.jsoup.parser.Token) tag31);
        tokeniser6.tagPending = tag31;
        tokeniser1.emit((org.jsoup.parser.Token) tag31);
        org.jsoup.parser.Token token38 = tokeniser1.read();
        boolean boolean39 = tokeniser1.isTrackErrors();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment2);
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(token38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.createTempBuffer();
        boolean boolean12 = tokeniser1.currentNodeInHtmlNS();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        tokeniser1.createTempBuffer();
        org.jsoup.parser.Token.Doctype doctype8 = tokeniser1.doctypePending;
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        boolean boolean11 = tokeniser10.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        boolean boolean14 = tokeniser13.currentNodeInHtmlNS();
        tokeniser13.createCommentPending();
        boolean boolean16 = tokeniser13.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment17 = tokeniser13.commentPending;
        tokeniser10.commentPending = comment17;
        tokeniser1.commentPending = comment17;
        org.jsoup.parser.Token.Comment comment20 = tokeniser1.commentPending;
        tokeniser1.emit(' ');
        org.jsoup.parser.Token.Tag tag24 = tokeniser1.createTagPending(false);
        org.junit.Assert.assertNull(doctype8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(comment17);
        org.junit.Assert.assertNotNull(comment20);
        org.junit.Assert.assertNotNull(tag24);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emit('4');
        org.jsoup.parser.Token.Comment comment5 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Tag tag7 = tokeniser1.createTagPending(false);
        boolean boolean8 = tokeniser1.isTrackErrors();
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser1.getState();
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser1.getState();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNotNull(tokeniserState11);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        tokeniser1.emitCommentPending();
        java.lang.StringBuilder stringBuilder5 = null;
        tokeniser1.dataBuffer = stringBuilder5;
        org.jsoup.parser.Token.Comment comment7 = tokeniser1.commentPending;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        boolean boolean10 = tokeniser9.currentNodeInHtmlNS();
        tokeniser9.createCommentPending();
        boolean boolean12 = tokeniser9.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag13 = null;
        tokeniser9.tagPending = tag13;
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        boolean boolean17 = tokeniser16.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        tokeniser19.emit('4');
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        boolean boolean24 = tokeniser23.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag26 = tokeniser23.createTagPending(true);
        tokeniser19.tagPending = tag26;
        tokeniser16.tagPending = tag26;
        tokeniser9.tagPending = tag26;
        boolean boolean30 = tokeniser9.currentNodeInHtmlNS();
        tokeniser9.createCommentPending();
        tokeniser9.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        boolean boolean35 = tokeniser34.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype36 = tokeniser34.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState37 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser34.transition(tokeniserState37);
        tokeniser34.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader40 = null;
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader40);
        tokeniser41.emit('4');
        tokeniser41.createTempBuffer();
        tokeniser41.setTrackErrors(false);
        tokeniser41.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype48 = null;
        tokeniser41.doctypePending = doctype48;
        tokeniser41.emit("");
        tokeniser41.createCommentPending();
        tokeniser41.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader54 = null;
        org.jsoup.parser.Tokeniser tokeniser55 = new org.jsoup.parser.Tokeniser(characterReader54);
        tokeniser55.emit("");
        tokeniser55.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState59 = tokeniser55.getState();
        tokeniser55.createDoctypePending();
        org.jsoup.parser.Token.Tag tag62 = tokeniser55.createTagPending(false);
        org.jsoup.parser.Token.Tag tag63 = tokeniser55.tagPending;
        org.jsoup.parser.Token.Doctype doctype64 = tokeniser55.doctypePending;
        tokeniser41.doctypePending = doctype64;
        org.jsoup.parser.CharacterReader characterReader66 = null;
        org.jsoup.parser.Tokeniser tokeniser67 = new org.jsoup.parser.Tokeniser(characterReader66);
        tokeniser67.emit("");
        tokeniser67.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState71 = tokeniser67.getState();
        tokeniser67.createDoctypePending();
        org.jsoup.parser.Token.Tag tag74 = tokeniser67.createTagPending(false);
        org.jsoup.parser.Token.Tag tag75 = tokeniser67.tagPending;
        org.jsoup.parser.Token.Doctype doctype76 = tokeniser67.doctypePending;
        tokeniser41.doctypePending = doctype76;
        tokeniser34.doctypePending = doctype76;
        org.jsoup.parser.Token.Doctype doctype79 = tokeniser34.doctypePending;
        tokeniser9.doctypePending = doctype79;
        tokeniser1.doctypePending = doctype79;
        org.jsoup.parser.TokeniserState tokeniserState82 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(comment7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(doctype36);
        org.junit.Assert.assertNotNull(tokeniserState37);
        org.junit.Assert.assertNotNull(tokeniserState59);
        org.junit.Assert.assertNotNull(tag62);
        org.junit.Assert.assertNotNull(tag63);
        org.junit.Assert.assertNotNull(doctype64);
        org.junit.Assert.assertNotNull(tokeniserState71);
        org.junit.Assert.assertNotNull(tag74);
        org.junit.Assert.assertNotNull(tag75);
        org.junit.Assert.assertNotNull(doctype76);
        org.junit.Assert.assertNotNull(doctype79);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        boolean boolean9 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag10 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        boolean boolean13 = tokeniser12.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        tokeniser15.emit('4');
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        boolean boolean20 = tokeniser19.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag22 = tokeniser19.createTagPending(true);
        tokeniser15.tagPending = tag22;
        tokeniser12.tagPending = tag22;
        tokeniser12.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState26 = tokeniser12.getState();
        org.jsoup.parser.Token.Doctype doctype27 = null;
        tokeniser12.doctypePending = doctype27;
        boolean boolean29 = tokeniser12.currentNodeInHtmlNS();
        tokeniser12.emit("hi!");
        java.lang.StringBuilder stringBuilder32 = tokeniser12.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState33 = org.jsoup.parser.TokeniserState.ScriptData;
        tokeniser12.transition(tokeniserState33);
        tokeniser1.transition(tokeniserState33);
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.Token.Doctype doctype38 = tokeniser1.doctypePending;
        tokeniser1.emit('4');
        tokeniser1.emit("");
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(tokeniserState26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(stringBuilder32);
        org.junit.Assert.assertNotNull(tokeniserState33);
        org.junit.Assert.assertNull(doctype38);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        org.jsoup.parser.Token.Comment comment9 = null;
        tokeniser1.commentPending = comment9;
        org.jsoup.parser.Token.Comment comment11 = null;
        tokeniser1.commentPending = comment11;
        org.jsoup.parser.Token.Doctype doctype13 = null;
        tokeniser1.doctypePending = doctype13;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment16 = null;
        tokeniser1.commentPending = comment16;
        org.jsoup.parser.Token.Doctype doctype18 = tokeniser1.doctypePending;
        tokeniser1.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState20 = org.jsoup.parser.TokeniserState.Comment;
        tokeniser1.transition(tokeniserState20);
        tokeniser1.setTrackErrors(false);
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        tokeniser1.createCommentPending();
        tokeniser1.createDoctypePending();
        org.junit.Assert.assertNull(doctype18);
        org.junit.Assert.assertNotNull(tokeniserState20);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment7 = tokeniser1.commentPending;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        boolean boolean10 = tokeniser9.currentNodeInHtmlNS();
        tokeniser9.createCommentPending();
        tokeniser9.emitCommentPending();
        java.lang.StringBuilder stringBuilder13 = null;
        tokeniser9.dataBuffer = stringBuilder13;
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        tokeniser16.emit("");
        org.jsoup.parser.Token.Doctype doctype19 = null;
        tokeniser16.doctypePending = doctype19;
        tokeniser16.createTempBuffer();
        tokeniser16.emit("");
        org.jsoup.parser.Token.Comment comment24 = null;
        tokeniser16.commentPending = comment24;
        org.jsoup.parser.Token.Tag tag27 = tokeniser16.createTagPending(false);
        tokeniser9.tagPending = tag27;
        org.jsoup.parser.Token.Comment comment29 = tokeniser9.commentPending;
        org.jsoup.parser.CharacterReader characterReader30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader30);
        boolean boolean32 = tokeniser31.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        tokeniser34.emit('4');
        org.jsoup.parser.CharacterReader characterReader37 = null;
        org.jsoup.parser.Tokeniser tokeniser38 = new org.jsoup.parser.Tokeniser(characterReader37);
        boolean boolean39 = tokeniser38.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag41 = tokeniser38.createTagPending(true);
        tokeniser34.tagPending = tag41;
        tokeniser31.tagPending = tag41;
        tokeniser31.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState45 = tokeniser31.getState();
        org.jsoup.parser.Token.Doctype doctype46 = null;
        tokeniser31.doctypePending = doctype46;
        boolean boolean48 = tokeniser31.currentNodeInHtmlNS();
        tokeniser31.emit("hi!");
        java.lang.StringBuilder stringBuilder51 = tokeniser31.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader52 = null;
        org.jsoup.parser.Tokeniser tokeniser53 = new org.jsoup.parser.Tokeniser(characterReader52);
        boolean boolean54 = tokeniser53.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype55 = tokeniser53.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState56 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser53.transition(tokeniserState56);
        org.jsoup.parser.CharacterReader characterReader58 = null;
        org.jsoup.parser.Tokeniser tokeniser59 = new org.jsoup.parser.Tokeniser(characterReader58);
        boolean boolean60 = tokeniser59.currentNodeInHtmlNS();
        tokeniser59.createCommentPending();
        tokeniser59.emitCommentPending();
        java.lang.StringBuilder stringBuilder63 = null;
        tokeniser59.dataBuffer = stringBuilder63;
        org.jsoup.parser.Token.Comment comment65 = tokeniser59.commentPending;
        tokeniser53.commentPending = comment65;
        tokeniser53.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader69 = null;
        org.jsoup.parser.Tokeniser tokeniser70 = new org.jsoup.parser.Tokeniser(characterReader69);
        tokeniser70.emit("");
        tokeniser70.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState74 = tokeniser70.getState();
        tokeniser70.createDoctypePending();
        org.jsoup.parser.Token.Tag tag77 = tokeniser70.createTagPending(false);
        org.jsoup.parser.Token.Tag tag78 = tokeniser70.tagPending;
        org.jsoup.parser.Token.Doctype doctype79 = tokeniser70.doctypePending;
        tokeniser53.doctypePending = doctype79;
        tokeniser31.doctypePending = doctype79;
        tokeniser9.doctypePending = doctype79;
        tokeniser1.doctypePending = doctype79;
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.Token.Tag tag88 = tokeniser1.createTagPending(false);
        org.junit.Assert.assertNull(comment7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(comment29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(tokeniserState45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(stringBuilder51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNull(doctype55);
        org.junit.Assert.assertNotNull(tokeniserState56);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(comment65);
        org.junit.Assert.assertNotNull(tokeniserState74);
        org.junit.Assert.assertNotNull(tag77);
        org.junit.Assert.assertNotNull(tag78);
        org.junit.Assert.assertNotNull(doctype79);
        org.junit.Assert.assertNotNull(tag88);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        org.jsoup.parser.Token.Comment comment9 = null;
        tokeniser1.commentPending = comment9;
        org.jsoup.parser.Token.Tag tag12 = tokeniser1.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        boolean boolean15 = tokeniser14.currentNodeInHtmlNS();
        tokeniser14.createCommentPending();
        boolean boolean17 = tokeniser14.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment18 = tokeniser14.commentPending;
        tokeniser1.commentPending = comment18;
        tokeniser1.emit('#');
        tokeniser1.createCommentPending();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token23 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(comment18);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader3 = null;
        org.jsoup.parser.Tokeniser tokeniser4 = new org.jsoup.parser.Tokeniser(characterReader3);
        tokeniser4.emit('4');
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        boolean boolean9 = tokeniser8.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag11 = tokeniser8.createTagPending(true);
        tokeniser4.tagPending = tag11;
        tokeniser1.tagPending = tag11;
        org.jsoup.parser.TokeniserState tokeniserState14 = org.jsoup.parser.TokeniserState.CommentEndDash;
        tokeniser1.transition(tokeniserState14);
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        boolean boolean18 = tokeniser17.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype19 = tokeniser17.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState20 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser17.transition(tokeniserState20);
        tokeniser1.transition(tokeniserState20);
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        tokeniser24.emit("");
        org.jsoup.parser.Token.Doctype doctype27 = null;
        tokeniser24.doctypePending = doctype27;
        tokeniser24.createTempBuffer();
        tokeniser24.emit("");
        org.jsoup.parser.Token.Comment comment32 = null;
        tokeniser24.commentPending = comment32;
        org.jsoup.parser.Token.Comment comment34 = null;
        tokeniser24.commentPending = comment34;
        org.jsoup.parser.Token.Doctype doctype36 = null;
        tokeniser24.doctypePending = doctype36;
        tokeniser24.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment39 = null;
        tokeniser24.commentPending = comment39;
        org.jsoup.parser.Token.Doctype doctype41 = tokeniser24.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState42 = tokeniser24.getState();
        java.lang.StringBuilder stringBuilder43 = tokeniser24.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder43;
        org.jsoup.parser.Token.Doctype doctype45 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Comment comment46 = tokeniser1.commentPending;
        tokeniser1.createDoctypePending();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(doctype19);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertNull(doctype41);
        org.junit.Assert.assertNotNull(tokeniserState42);
        org.junit.Assert.assertNotNull(stringBuilder43);
        org.junit.Assert.assertEquals(stringBuilder43.toString(), "");
        org.junit.Assert.assertNull(doctype45);
        org.junit.Assert.assertNull(comment46);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.CharacterReader characterReader2 = null;
        org.jsoup.parser.Tokeniser tokeniser3 = new org.jsoup.parser.Tokeniser(characterReader2);
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser3.getState();
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        tokeniser6.createCommentPending();
        boolean boolean9 = tokeniser6.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment10 = tokeniser6.commentPending;
        tokeniser3.commentPending = comment10;
        tokeniser1.commentPending = comment10;
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        boolean boolean15 = tokeniser14.currentNodeInHtmlNS();
        tokeniser14.emit('4');
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        boolean boolean20 = tokeniser19.currentNodeInHtmlNS();
        tokeniser19.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        tokeniser23.emit('4');
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader26);
        boolean boolean28 = tokeniser27.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag30 = tokeniser27.createTagPending(true);
        tokeniser23.tagPending = tag30;
        tokeniser19.emit((org.jsoup.parser.Token) tag30);
        tokeniser14.emit((org.jsoup.parser.Token) tag30);
        tokeniser1.tagPending = tag30;
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.Tokeniser tokeniser36 = new org.jsoup.parser.Tokeniser(characterReader35);
        tokeniser36.emit("");
        org.jsoup.parser.Token.Doctype doctype39 = null;
        tokeniser36.doctypePending = doctype39;
        tokeniser36.createTempBuffer();
        tokeniser36.emit("");
        org.jsoup.parser.Token.Comment comment44 = null;
        tokeniser36.commentPending = comment44;
        org.jsoup.parser.Token.Comment comment46 = null;
        tokeniser36.commentPending = comment46;
        org.jsoup.parser.Token.Doctype doctype48 = null;
        tokeniser36.doctypePending = doctype48;
        java.lang.StringBuilder stringBuilder50 = tokeniser36.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder50;
        org.jsoup.parser.CharacterReader characterReader52 = null;
        org.jsoup.parser.Tokeniser tokeniser53 = new org.jsoup.parser.Tokeniser(characterReader52);
        boolean boolean54 = tokeniser53.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag56 = tokeniser53.createTagPending(true);
        tokeniser1.tagPending = tag56;
        tokeniser1.createCommentPending();
        boolean boolean59 = tokeniser1.isTrackErrors();
        org.jsoup.parser.CharacterReader characterReader60 = null;
        org.jsoup.parser.Tokeniser tokeniser61 = new org.jsoup.parser.Tokeniser(characterReader60);
        boolean boolean62 = tokeniser61.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader63 = null;
        org.jsoup.parser.Tokeniser tokeniser64 = new org.jsoup.parser.Tokeniser(characterReader63);
        tokeniser64.emit('4');
        org.jsoup.parser.CharacterReader characterReader67 = null;
        org.jsoup.parser.Tokeniser tokeniser68 = new org.jsoup.parser.Tokeniser(characterReader67);
        boolean boolean69 = tokeniser68.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag71 = tokeniser68.createTagPending(true);
        tokeniser64.tagPending = tag71;
        tokeniser61.tagPending = tag71;
        java.lang.StringBuilder stringBuilder74 = tokeniser61.dataBuffer;
        org.jsoup.parser.Token.Tag tag75 = tokeniser61.tagPending;
        tokeniser1.tagPending = tag75;
        tokeniser1.emitTagPending();
        java.lang.StringBuilder stringBuilder78 = tokeniser1.dataBuffer;
        org.jsoup.parser.Token.Doctype doctype79 = tokeniser1.doctypePending;
        boolean boolean80 = tokeniser1.currentNodeInHtmlNS();
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(comment10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(stringBuilder50);
        org.junit.Assert.assertEquals(stringBuilder50.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(tag71);
        org.junit.Assert.assertNull(stringBuilder74);
        org.junit.Assert.assertNotNull(tag75);
        org.junit.Assert.assertNotNull(stringBuilder78);
        org.junit.Assert.assertEquals(stringBuilder78.toString(), "");
        org.junit.Assert.assertNull(doctype79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.Token.Tag tag10 = tokeniser1.createTagPending(false);
        tokeniser1.emit('4');
        boolean boolean13 = tokeniser1.isTrackErrors();
        tokeniser1.emitTagPending();
        tokeniser1.createTempBuffer();
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        boolean boolean10 = tokeniser9.currentNodeInHtmlNS();
        tokeniser9.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState12 = tokeniser9.getState();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        tokeniser14.emit("");
        org.jsoup.parser.Token.Doctype doctype17 = null;
        tokeniser14.doctypePending = doctype17;
        tokeniser14.createTempBuffer();
        tokeniser14.emit("");
        org.jsoup.parser.Token.Comment comment22 = null;
        tokeniser14.commentPending = comment22;
        org.jsoup.parser.Token.Comment comment24 = null;
        tokeniser14.commentPending = comment24;
        org.jsoup.parser.Token.Doctype doctype26 = null;
        tokeniser14.doctypePending = doctype26;
        java.lang.StringBuilder stringBuilder28 = tokeniser14.dataBuffer;
        tokeniser9.dataBuffer = stringBuilder28;
        tokeniser1.dataBuffer = stringBuilder28;
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        tokeniser32.emit("");
        org.jsoup.parser.Token.Doctype doctype35 = null;
        tokeniser32.doctypePending = doctype35;
        org.jsoup.parser.Token.Doctype doctype37 = null;
        tokeniser32.doctypePending = doctype37;
        org.jsoup.parser.CharacterReader characterReader39 = null;
        org.jsoup.parser.Tokeniser tokeniser40 = new org.jsoup.parser.Tokeniser(characterReader39);
        tokeniser40.emit('4');
        org.jsoup.parser.CharacterReader characterReader43 = null;
        org.jsoup.parser.Tokeniser tokeniser44 = new org.jsoup.parser.Tokeniser(characterReader43);
        boolean boolean45 = tokeniser44.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag47 = tokeniser44.createTagPending(true);
        tokeniser40.tagPending = tag47;
        org.jsoup.parser.TokeniserState tokeniserState49 = tokeniser40.getState();
        org.jsoup.parser.TokeniserState tokeniserState50 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemIdentifier;
        tokeniser40.transition(tokeniserState50);
        tokeniser32.transition(tokeniserState50);
        org.jsoup.parser.CharacterReader characterReader53 = null;
        org.jsoup.parser.Tokeniser tokeniser54 = new org.jsoup.parser.Tokeniser(characterReader53);
        tokeniser54.emit("");
        org.jsoup.parser.Token.Doctype doctype57 = null;
        tokeniser54.doctypePending = doctype57;
        org.jsoup.parser.CharacterReader characterReader59 = null;
        org.jsoup.parser.Tokeniser tokeniser60 = new org.jsoup.parser.Tokeniser(characterReader59);
        org.jsoup.parser.TokeniserState tokeniserState61 = tokeniser60.getState();
        org.jsoup.parser.CharacterReader characterReader62 = null;
        org.jsoup.parser.Tokeniser tokeniser63 = new org.jsoup.parser.Tokeniser(characterReader62);
        boolean boolean64 = tokeniser63.currentNodeInHtmlNS();
        tokeniser63.createCommentPending();
        boolean boolean66 = tokeniser63.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment67 = tokeniser63.commentPending;
        tokeniser60.commentPending = comment67;
        tokeniser60.createTempBuffer();
        java.lang.StringBuilder stringBuilder70 = tokeniser60.dataBuffer;
        tokeniser54.dataBuffer = stringBuilder70;
        tokeniser32.dataBuffer = stringBuilder70;
        tokeniser1.dataBuffer = stringBuilder70;
        org.jsoup.parser.Token.Doctype doctype74 = null;
        tokeniser1.doctypePending = doctype74;
        tokeniser1.emit('a');
        boolean boolean78 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emit('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNotNull(tokeniserState49);
        org.junit.Assert.assertNotNull(tokeniserState50);
        org.junit.Assert.assertNotNull(tokeniserState61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(comment67);
        org.junit.Assert.assertNotNull(stringBuilder70);
        org.junit.Assert.assertEquals(stringBuilder70.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag9 = tokeniser6.createTagPending(true);
        tokeniser1.emit((org.jsoup.parser.Token) tag9);
        tokeniser1.emit(' ');
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        boolean boolean17 = tokeniser16.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype18 = tokeniser16.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser16.transition(tokeniserState19);
        org.jsoup.parser.Token.Comment comment21 = tokeniser16.commentPending;
        tokeniser16.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        boolean boolean25 = tokeniser24.currentNodeInHtmlNS();
        tokeniser24.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState27 = tokeniser24.getState();
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader28);
        tokeniser29.emit("");
        org.jsoup.parser.Token.Doctype doctype32 = null;
        tokeniser29.doctypePending = doctype32;
        tokeniser29.createTempBuffer();
        tokeniser29.emit("");
        org.jsoup.parser.Token.Comment comment37 = null;
        tokeniser29.commentPending = comment37;
        org.jsoup.parser.Token.Comment comment39 = null;
        tokeniser29.commentPending = comment39;
        org.jsoup.parser.Token.Doctype doctype41 = null;
        tokeniser29.doctypePending = doctype41;
        java.lang.StringBuilder stringBuilder43 = tokeniser29.dataBuffer;
        tokeniser24.dataBuffer = stringBuilder43;
        tokeniser16.dataBuffer = stringBuilder43;
        tokeniser1.dataBuffer = stringBuilder43;
        org.jsoup.parser.CharacterReader characterReader47 = null;
        org.jsoup.parser.Tokeniser tokeniser48 = new org.jsoup.parser.Tokeniser(characterReader47);
        tokeniser48.emit('4');
        tokeniser48.createTempBuffer();
        tokeniser48.setTrackErrors(false);
        org.jsoup.parser.Token.Doctype doctype54 = null;
        tokeniser48.doctypePending = doctype54;
        java.lang.StringBuilder stringBuilder56 = tokeniser48.dataBuffer;
        tokeniser48.acknowledgeSelfClosingFlag();
        tokeniser48.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader59 = null;
        org.jsoup.parser.Tokeniser tokeniser60 = new org.jsoup.parser.Tokeniser(characterReader59);
        boolean boolean61 = tokeniser60.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag63 = tokeniser60.createTagPending(true);
        tokeniser48.tagPending = tag63;
        org.jsoup.parser.CharacterReader characterReader65 = null;
        org.jsoup.parser.Tokeniser tokeniser66 = new org.jsoup.parser.Tokeniser(characterReader65);
        tokeniser66.emit("");
        tokeniser66.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState70 = tokeniser66.getState();
        tokeniser48.transition(tokeniserState70);
        tokeniser1.transition(tokeniserState70);
        org.jsoup.parser.Token.Comment comment73 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Tag tag75 = tokeniser1.createTagPending(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(doctype18);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNull(comment21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tokeniserState27);
        org.junit.Assert.assertNotNull(stringBuilder43);
        org.junit.Assert.assertEquals(stringBuilder43.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder56);
        org.junit.Assert.assertEquals(stringBuilder56.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(tag63);
        org.junit.Assert.assertNotNull(tokeniserState70);
        org.junit.Assert.assertNull(comment73);
        org.junit.Assert.assertNotNull(tag75);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        org.jsoup.parser.TokeniserState tokeniserState12 = tokeniser11.getState();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        boolean boolean15 = tokeniser14.currentNodeInHtmlNS();
        tokeniser14.createCommentPending();
        boolean boolean17 = tokeniser14.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment18 = tokeniser14.commentPending;
        tokeniser11.commentPending = comment18;
        tokeniser9.commentPending = comment18;
        org.jsoup.parser.Token.Tag tag22 = tokeniser9.createTagPending(false);
        tokeniser9.createTempBuffer();
        java.lang.StringBuilder stringBuilder24 = tokeniser9.dataBuffer;
        boolean boolean25 = tokeniser9.isTrackErrors();
        org.jsoup.parser.TokeniserState tokeniserState26 = tokeniser9.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(comment18);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tokeniserState26);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        tokeniser5.emit('4');
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        boolean boolean10 = tokeniser9.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag12 = tokeniser9.createTagPending(true);
        tokeniser5.tagPending = tag12;
        tokeniser1.emit((org.jsoup.parser.Token) tag12);
        tokeniser1.createTempBuffer();
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Doctype doctype17 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Doctype doctype18 = tokeniser1.doctypePending;
        tokeniser1.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        boolean boolean22 = tokeniser21.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag24 = tokeniser21.createTagPending(true);
        org.jsoup.parser.Token.Comment comment25 = null;
        tokeniser21.commentPending = comment25;
        org.jsoup.parser.Token.Doctype doctype27 = null;
        tokeniser21.doctypePending = doctype27;
        tokeniser21.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype30 = tokeniser21.doctypePending;
        tokeniser1.doctypePending = doctype30;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(doctype17);
        org.junit.Assert.assertNull(doctype18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(doctype30);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        org.jsoup.parser.Token.Comment comment9 = null;
        tokeniser1.commentPending = comment9;
        org.jsoup.parser.Token.Tag tag12 = tokeniser1.createTagPending(true);
        boolean boolean13 = tokeniser1.isTrackErrors();
        tokeniser1.createDoctypePending();
        boolean boolean15 = tokeniser1.isTrackErrors();
        org.jsoup.parser.Token.Tag tag17 = tokeniser1.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        boolean boolean20 = tokeniser19.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag22 = tokeniser19.createTagPending(true);
        org.jsoup.parser.Token.Comment comment23 = null;
        tokeniser19.commentPending = comment23;
        org.jsoup.parser.Token.Doctype doctype25 = null;
        tokeniser19.doctypePending = doctype25;
        tokeniser19.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype28 = tokeniser19.doctypePending;
        org.jsoup.parser.Token.Tag tag30 = tokeniser19.createTagPending(false);
        tokeniser1.emit((org.jsoup.parser.Token) tag30);
        org.jsoup.parser.TokeniserState tokeniserState32 = tokeniser1.getState();
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(doctype28);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(tokeniserState32);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser1.doctypePending = doctype7;
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Tag tag11 = tokeniser1.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        tokeniser13.emit('4');
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        boolean boolean18 = tokeniser17.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag20 = tokeniser17.createTagPending(true);
        tokeniser13.tagPending = tag20;
        org.jsoup.parser.Token.Tag tag23 = tokeniser13.createTagPending(false);
        org.jsoup.parser.Token.Tag tag25 = tokeniser13.createTagPending(true);
        org.jsoup.parser.TokeniserState tokeniserState26 = org.jsoup.parser.TokeniserState.AfterDoctypePublicKeyword;
        tokeniser13.transition(tokeniserState26);
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader28);
        boolean boolean30 = tokeniser29.currentNodeInHtmlNS();
        tokeniser29.createCommentPending();
        boolean boolean32 = tokeniser29.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment33 = tokeniser29.commentPending;
        tokeniser13.emit((org.jsoup.parser.Token) comment33);
        tokeniser1.commentPending = comment33;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token36 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(tokeniserState26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(comment33);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        boolean boolean9 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag10 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        boolean boolean13 = tokeniser12.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        tokeniser15.emit('4');
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        boolean boolean20 = tokeniser19.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag22 = tokeniser19.createTagPending(true);
        tokeniser15.tagPending = tag22;
        tokeniser12.tagPending = tag22;
        tokeniser12.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState26 = tokeniser12.getState();
        org.jsoup.parser.Token.Doctype doctype27 = null;
        tokeniser12.doctypePending = doctype27;
        boolean boolean29 = tokeniser12.currentNodeInHtmlNS();
        tokeniser12.emit("hi!");
        java.lang.StringBuilder stringBuilder32 = tokeniser12.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState33 = org.jsoup.parser.TokeniserState.ScriptData;
        tokeniser12.transition(tokeniserState33);
        tokeniser1.transition(tokeniserState33);
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.Token.Doctype doctype38 = tokeniser1.doctypePending;
        tokeniser1.emit('4');
        org.jsoup.parser.TokeniserState tokeniserState41 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(tokeniserState26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(stringBuilder32);
        org.junit.Assert.assertNotNull(tokeniserState33);
        org.junit.Assert.assertNull(doctype38);
        org.junit.Assert.assertNotNull(tokeniserState41);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.CharacterReader characterReader2 = null;
        org.jsoup.parser.Tokeniser tokeniser3 = new org.jsoup.parser.Tokeniser(characterReader2);
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser3.getState();
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        tokeniser6.createCommentPending();
        boolean boolean9 = tokeniser6.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment10 = tokeniser6.commentPending;
        tokeniser3.commentPending = comment10;
        tokeniser1.commentPending = comment10;
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        boolean boolean15 = tokeniser14.currentNodeInHtmlNS();
        tokeniser14.emit('4');
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        boolean boolean20 = tokeniser19.currentNodeInHtmlNS();
        tokeniser19.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        tokeniser23.emit('4');
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader26);
        boolean boolean28 = tokeniser27.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag30 = tokeniser27.createTagPending(true);
        tokeniser23.tagPending = tag30;
        tokeniser19.emit((org.jsoup.parser.Token) tag30);
        tokeniser14.emit((org.jsoup.parser.Token) tag30);
        tokeniser1.tagPending = tag30;
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.Tokeniser tokeniser36 = new org.jsoup.parser.Tokeniser(characterReader35);
        tokeniser36.emit("");
        org.jsoup.parser.Token.Doctype doctype39 = null;
        tokeniser36.doctypePending = doctype39;
        tokeniser36.createTempBuffer();
        tokeniser36.emit("");
        org.jsoup.parser.Token.Comment comment44 = null;
        tokeniser36.commentPending = comment44;
        org.jsoup.parser.Token.Comment comment46 = null;
        tokeniser36.commentPending = comment46;
        org.jsoup.parser.Token.Doctype doctype48 = null;
        tokeniser36.doctypePending = doctype48;
        java.lang.StringBuilder stringBuilder50 = tokeniser36.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder50;
        org.jsoup.parser.CharacterReader characterReader52 = null;
        org.jsoup.parser.Tokeniser tokeniser53 = new org.jsoup.parser.Tokeniser(characterReader52);
        boolean boolean54 = tokeniser53.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag56 = tokeniser53.createTagPending(true);
        tokeniser1.tagPending = tag56;
        org.jsoup.parser.TokeniserState tokeniserState58 = tokeniser1.getState();
        org.jsoup.parser.TokeniserState tokeniserState59 = tokeniser1.getState();
        org.jsoup.parser.Token.Comment comment60 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Tag tag61 = tokeniser1.tagPending;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag64 = tokeniser1.createTagPending(true);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState66 = tokeniser1.getState();
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(comment10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(stringBuilder50);
        org.junit.Assert.assertEquals(stringBuilder50.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertNotNull(tokeniserState58);
        org.junit.Assert.assertNotNull(tokeniserState59);
        org.junit.Assert.assertNotNull(comment60);
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertNotNull(tag64);
        org.junit.Assert.assertNotNull(tokeniserState66);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype9 = tokeniser1.doctypePending;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token10 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype9);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        tokeniser1.emitCommentPending();
        java.lang.StringBuilder stringBuilder5 = null;
        tokeniser1.dataBuffer = stringBuilder5;
        org.jsoup.parser.Token token7 = tokeniser1.read();
        org.jsoup.parser.Token.Comment comment8 = null;
        tokeniser1.commentPending = comment8;
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        org.jsoup.parser.Token.Doctype doctype6 = null;
        tokeniser1.doctypePending = doctype6;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag9 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        boolean boolean12 = tokeniser11.currentNodeInHtmlNS();
        tokeniser11.createCommentPending();
        boolean boolean14 = tokeniser11.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag15 = null;
        tokeniser11.tagPending = tag15;
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        boolean boolean19 = tokeniser18.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        tokeniser21.emit('4');
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader24);
        boolean boolean26 = tokeniser25.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag28 = tokeniser25.createTagPending(true);
        tokeniser21.tagPending = tag28;
        tokeniser18.tagPending = tag28;
        tokeniser11.tagPending = tag28;
        tokeniser1.tagPending = tag28;
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        boolean boolean35 = tokeniser34.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader36);
        tokeniser37.emit('4');
        org.jsoup.parser.CharacterReader characterReader40 = null;
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader40);
        boolean boolean42 = tokeniser41.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag44 = tokeniser41.createTagPending(true);
        tokeniser37.tagPending = tag44;
        tokeniser34.tagPending = tag44;
        tokeniser34.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState48 = tokeniser34.getState();
        org.jsoup.parser.Token.Doctype doctype49 = null;
        tokeniser34.doctypePending = doctype49;
        boolean boolean51 = tokeniser34.currentNodeInHtmlNS();
        tokeniser34.emit("hi!");
        java.lang.StringBuilder stringBuilder54 = tokeniser34.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState55 = org.jsoup.parser.TokeniserState.ScriptData;
        tokeniser34.transition(tokeniserState55);
        org.jsoup.parser.Token.Doctype doctype57 = tokeniser34.doctypePending;
        org.jsoup.parser.CharacterReader characterReader58 = null;
        org.jsoup.parser.Tokeniser tokeniser59 = new org.jsoup.parser.Tokeniser(characterReader58);
        tokeniser59.emit('4');
        tokeniser59.createTempBuffer();
        tokeniser59.setTrackErrors(false);
        org.jsoup.parser.Token.Doctype doctype65 = null;
        tokeniser59.doctypePending = doctype65;
        org.jsoup.parser.Token.Tag tag67 = tokeniser59.tagPending;
        boolean boolean68 = tokeniser59.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype69 = null;
        tokeniser59.doctypePending = doctype69;
        org.jsoup.parser.Token.Tag tag72 = tokeniser59.createTagPending(true);
        tokeniser34.tagPending = tag72;
        tokeniser1.emit((org.jsoup.parser.Token) tag72);
        org.jsoup.parser.CharacterReader characterReader75 = null;
        org.jsoup.parser.Tokeniser tokeniser76 = new org.jsoup.parser.Tokeniser(characterReader75);
        tokeniser76.emit("");
        tokeniser76.emit("");
        tokeniser76.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState82 = tokeniser76.getState();
        boolean boolean83 = tokeniser76.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag85 = tokeniser76.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader86 = null;
        org.jsoup.parser.Tokeniser tokeniser87 = new org.jsoup.parser.Tokeniser(characterReader86);
        tokeniser87.emit("");
        org.jsoup.parser.Token.Doctype doctype90 = null;
        tokeniser87.doctypePending = doctype90;
        tokeniser87.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState93 = org.jsoup.parser.TokeniserState.BogusDoctype;
        tokeniser87.transition(tokeniserState93);
        tokeniser76.transition(tokeniserState93);
        org.jsoup.parser.TokeniserState tokeniserState96 = tokeniser76.getState();
        tokeniser1.transition(tokeniserState96);
        org.junit.Assert.assertNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(tokeniserState48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(stringBuilder54);
        org.junit.Assert.assertNotNull(tokeniserState55);
        org.junit.Assert.assertNull(doctype57);
        org.junit.Assert.assertNull(tag67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(tag72);
        org.junit.Assert.assertNotNull(tokeniserState82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(tag85);
        org.junit.Assert.assertNotNull(tokeniserState93);
        org.junit.Assert.assertNotNull(tokeniserState96);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment7 = tokeniser1.commentPending;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        boolean boolean10 = tokeniser9.currentNodeInHtmlNS();
        tokeniser9.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState12 = tokeniser9.getState();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        tokeniser14.emit("");
        org.jsoup.parser.Token.Doctype doctype17 = null;
        tokeniser14.doctypePending = doctype17;
        tokeniser14.createTempBuffer();
        tokeniser14.emit("");
        org.jsoup.parser.Token.Comment comment22 = null;
        tokeniser14.commentPending = comment22;
        org.jsoup.parser.Token.Comment comment24 = null;
        tokeniser14.commentPending = comment24;
        org.jsoup.parser.Token.Doctype doctype26 = null;
        tokeniser14.doctypePending = doctype26;
        java.lang.StringBuilder stringBuilder28 = tokeniser14.dataBuffer;
        tokeniser9.dataBuffer = stringBuilder28;
        tokeniser1.dataBuffer = stringBuilder28;
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        boolean boolean33 = tokeniser32.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype34 = tokeniser32.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState35 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser32.transition(tokeniserState35);
        tokeniser32.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader38);
        tokeniser39.emit('4');
        tokeniser39.createTempBuffer();
        tokeniser39.setTrackErrors(false);
        tokeniser39.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype46 = null;
        tokeniser39.doctypePending = doctype46;
        tokeniser39.emit("");
        tokeniser39.createCommentPending();
        tokeniser39.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader52 = null;
        org.jsoup.parser.Tokeniser tokeniser53 = new org.jsoup.parser.Tokeniser(characterReader52);
        tokeniser53.emit("");
        tokeniser53.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState57 = tokeniser53.getState();
        tokeniser53.createDoctypePending();
        org.jsoup.parser.Token.Tag tag60 = tokeniser53.createTagPending(false);
        org.jsoup.parser.Token.Tag tag61 = tokeniser53.tagPending;
        org.jsoup.parser.Token.Doctype doctype62 = tokeniser53.doctypePending;
        tokeniser39.doctypePending = doctype62;
        org.jsoup.parser.CharacterReader characterReader64 = null;
        org.jsoup.parser.Tokeniser tokeniser65 = new org.jsoup.parser.Tokeniser(characterReader64);
        tokeniser65.emit("");
        tokeniser65.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState69 = tokeniser65.getState();
        tokeniser65.createDoctypePending();
        org.jsoup.parser.Token.Tag tag72 = tokeniser65.createTagPending(false);
        org.jsoup.parser.Token.Tag tag73 = tokeniser65.tagPending;
        org.jsoup.parser.Token.Doctype doctype74 = tokeniser65.doctypePending;
        tokeniser39.doctypePending = doctype74;
        tokeniser32.doctypePending = doctype74;
        tokeniser1.doctypePending = doctype74;
        tokeniser1.createDoctypePending();
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.Token token80 = tokeniser1.read();
        tokeniser1.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader83 = null;
        org.jsoup.parser.Tokeniser tokeniser84 = new org.jsoup.parser.Tokeniser(characterReader83);
        boolean boolean85 = tokeniser84.currentNodeInHtmlNS();
        tokeniser84.createCommentPending();
        tokeniser84.emitCommentPending();
        java.lang.StringBuilder stringBuilder88 = null;
        tokeniser84.dataBuffer = stringBuilder88;
        org.jsoup.parser.Token.Comment comment90 = tokeniser84.commentPending;
        tokeniser1.commentPending = comment90;
        org.junit.Assert.assertNull(comment7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(doctype34);
        org.junit.Assert.assertNotNull(tokeniserState35);
        org.junit.Assert.assertNotNull(tokeniserState57);
        org.junit.Assert.assertNotNull(tag60);
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertNotNull(doctype62);
        org.junit.Assert.assertNotNull(tokeniserState69);
        org.junit.Assert.assertNotNull(tag72);
        org.junit.Assert.assertNotNull(tag73);
        org.junit.Assert.assertNotNull(doctype74);
        org.junit.Assert.assertNotNull(token80);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(comment90);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser1.getState();
        tokeniser1.createDoctypePending();
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Tag tag10 = tokeniser1.createTagPending(true);
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        org.jsoup.parser.Token.Tag tag6 = tokeniser1.tagPending;
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser1.doctypePending = doctype7;
        boolean boolean9 = tokeniser1.isTrackErrors();
        org.jsoup.parser.Token.Comment comment10 = tokeniser1.commentPending;
        org.junit.Assert.assertNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(comment10);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        tokeniser5.emit('4');
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        boolean boolean10 = tokeniser9.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag12 = tokeniser9.createTagPending(true);
        tokeniser5.tagPending = tag12;
        tokeniser1.emit((org.jsoup.parser.Token) tag12);
        org.jsoup.parser.Token.Doctype doctype15 = tokeniser1.doctypePending;
        boolean boolean16 = tokeniser1.isTrackErrors();
        java.lang.StringBuilder stringBuilder17 = tokeniser1.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        org.jsoup.parser.TokeniserState tokeniserState22 = tokeniser21.getState();
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        boolean boolean25 = tokeniser24.currentNodeInHtmlNS();
        tokeniser24.createCommentPending();
        boolean boolean27 = tokeniser24.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment28 = tokeniser24.commentPending;
        tokeniser21.commentPending = comment28;
        tokeniser19.commentPending = comment28;
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        boolean boolean33 = tokeniser32.currentNodeInHtmlNS();
        tokeniser32.emit('4');
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader36);
        boolean boolean38 = tokeniser37.currentNodeInHtmlNS();
        tokeniser37.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader40 = null;
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader40);
        tokeniser41.emit('4');
        org.jsoup.parser.CharacterReader characterReader44 = null;
        org.jsoup.parser.Tokeniser tokeniser45 = new org.jsoup.parser.Tokeniser(characterReader44);
        boolean boolean46 = tokeniser45.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag48 = tokeniser45.createTagPending(true);
        tokeniser41.tagPending = tag48;
        tokeniser37.emit((org.jsoup.parser.Token) tag48);
        tokeniser32.emit((org.jsoup.parser.Token) tag48);
        tokeniser19.tagPending = tag48;
        org.jsoup.parser.CharacterReader characterReader53 = null;
        org.jsoup.parser.Tokeniser tokeniser54 = new org.jsoup.parser.Tokeniser(characterReader53);
        tokeniser54.emit("");
        org.jsoup.parser.Token.Doctype doctype57 = null;
        tokeniser54.doctypePending = doctype57;
        tokeniser54.createTempBuffer();
        tokeniser54.emit("");
        org.jsoup.parser.Token.Comment comment62 = null;
        tokeniser54.commentPending = comment62;
        org.jsoup.parser.Token.Comment comment64 = null;
        tokeniser54.commentPending = comment64;
        org.jsoup.parser.Token.Doctype doctype66 = null;
        tokeniser54.doctypePending = doctype66;
        java.lang.StringBuilder stringBuilder68 = tokeniser54.dataBuffer;
        tokeniser19.dataBuffer = stringBuilder68;
        tokeniser1.dataBuffer = stringBuilder68;
        org.jsoup.parser.CharacterReader characterReader71 = null;
        org.jsoup.parser.Tokeniser tokeniser72 = new org.jsoup.parser.Tokeniser(characterReader71);
        boolean boolean73 = tokeniser72.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype74 = tokeniser72.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState75 = tokeniser72.getState();
        tokeniser1.transition(tokeniserState75);
        org.jsoup.parser.Token.Tag tag77 = tokeniser1.tagPending;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag79 = tokeniser1.tagPending;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(doctype15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(stringBuilder17);
        org.junit.Assert.assertNotNull(tokeniserState22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(comment28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertNotNull(stringBuilder68);
        org.junit.Assert.assertEquals(stringBuilder68.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNull(doctype74);
        org.junit.Assert.assertNotNull(tokeniserState75);
        org.junit.Assert.assertNull(tag77);
        org.junit.Assert.assertNull(tag79);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        org.jsoup.parser.Token.Comment comment9 = null;
        tokeniser1.commentPending = comment9;
        org.jsoup.parser.Token.Comment comment11 = null;
        tokeniser1.commentPending = comment11;
        org.jsoup.parser.Token.Doctype doctype13 = null;
        tokeniser1.doctypePending = doctype13;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment16 = null;
        tokeniser1.commentPending = comment16;
        org.jsoup.parser.Token.Doctype doctype18 = tokeniser1.doctypePending;
        tokeniser1.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState20 = org.jsoup.parser.TokeniserState.Comment;
        tokeniser1.transition(tokeniserState20);
        org.jsoup.parser.Token.Tag tag23 = tokeniser1.createTagPending(false);
        tokeniser1.emitTagPending();
        org.jsoup.parser.Token.Doctype doctype25 = tokeniser1.doctypePending;
        org.junit.Assert.assertNull(doctype18);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNull(doctype25);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.Token.Tag tag7 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        boolean boolean10 = tokeniser9.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag12 = tokeniser9.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        boolean boolean15 = tokeniser14.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag17 = tokeniser14.createTagPending(true);
        tokeniser9.emit((org.jsoup.parser.Token) tag17);
        tokeniser9.emit(' ');
        org.jsoup.parser.Token.Comment comment21 = tokeniser9.commentPending;
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        tokeniser23.emit("");
        org.jsoup.parser.Token.Doctype doctype26 = null;
        tokeniser23.doctypePending = doctype26;
        tokeniser23.createTempBuffer();
        tokeniser23.emit("");
        org.jsoup.parser.Token.Comment comment31 = null;
        tokeniser23.commentPending = comment31;
        org.jsoup.parser.Token.Comment comment33 = null;
        tokeniser23.commentPending = comment33;
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.Tokeniser tokeniser36 = new org.jsoup.parser.Tokeniser(characterReader35);
        tokeniser36.emit("");
        org.jsoup.parser.Token.Doctype doctype39 = null;
        tokeniser36.doctypePending = doctype39;
        tokeniser36.createTempBuffer();
        tokeniser36.emit("");
        org.jsoup.parser.TokeniserState tokeniserState44 = tokeniser36.getState();
        tokeniser36.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Doctype doctype46 = null;
        tokeniser36.doctypePending = doctype46;
        java.lang.StringBuilder stringBuilder48 = tokeniser36.dataBuffer;
        tokeniser23.dataBuffer = stringBuilder48;
        tokeniser9.dataBuffer = stringBuilder48;
        tokeniser1.dataBuffer = stringBuilder48;
        boolean boolean52 = tokeniser1.currentNodeInHtmlNS();
        java.lang.StringBuilder stringBuilder53 = tokeniser1.dataBuffer;
        org.jsoup.parser.Token.Tag tag55 = tokeniser1.createTagPending(true);
        org.jsoup.parser.Token.Comment comment56 = tokeniser1.commentPending;
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNull(comment21);
        org.junit.Assert.assertNotNull(tokeniserState44);
        org.junit.Assert.assertNotNull(stringBuilder48);
        org.junit.Assert.assertEquals(stringBuilder48.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(stringBuilder53);
        org.junit.Assert.assertEquals(stringBuilder53.toString(), "");
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertNull(comment56);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        boolean boolean10 = tokeniser9.currentNodeInHtmlNS();
        tokeniser9.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState12 = tokeniser9.getState();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        tokeniser14.emit("");
        org.jsoup.parser.Token.Doctype doctype17 = null;
        tokeniser14.doctypePending = doctype17;
        tokeniser14.createTempBuffer();
        tokeniser14.emit("");
        org.jsoup.parser.Token.Comment comment22 = null;
        tokeniser14.commentPending = comment22;
        org.jsoup.parser.Token.Comment comment24 = null;
        tokeniser14.commentPending = comment24;
        org.jsoup.parser.Token.Doctype doctype26 = null;
        tokeniser14.doctypePending = doctype26;
        java.lang.StringBuilder stringBuilder28 = tokeniser14.dataBuffer;
        tokeniser9.dataBuffer = stringBuilder28;
        tokeniser1.dataBuffer = stringBuilder28;
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype32 = tokeniser1.doctypePending;
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        tokeniser34.emit("");
        org.jsoup.parser.Token.Doctype doctype37 = null;
        tokeniser34.doctypePending = doctype37;
        tokeniser34.createTempBuffer();
        tokeniser34.emit("");
        org.jsoup.parser.Token.Comment comment42 = null;
        tokeniser34.commentPending = comment42;
        org.jsoup.parser.Token.Tag tag45 = tokeniser34.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader46 = null;
        org.jsoup.parser.Tokeniser tokeniser47 = new org.jsoup.parser.Tokeniser(characterReader46);
        boolean boolean48 = tokeniser47.currentNodeInHtmlNS();
        tokeniser47.emit('4');
        org.jsoup.parser.CharacterReader characterReader51 = null;
        org.jsoup.parser.Tokeniser tokeniser52 = new org.jsoup.parser.Tokeniser(characterReader51);
        boolean boolean53 = tokeniser52.currentNodeInHtmlNS();
        tokeniser52.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader55 = null;
        org.jsoup.parser.Tokeniser tokeniser56 = new org.jsoup.parser.Tokeniser(characterReader55);
        tokeniser56.emit('4');
        org.jsoup.parser.CharacterReader characterReader59 = null;
        org.jsoup.parser.Tokeniser tokeniser60 = new org.jsoup.parser.Tokeniser(characterReader59);
        boolean boolean61 = tokeniser60.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag63 = tokeniser60.createTagPending(true);
        tokeniser56.tagPending = tag63;
        tokeniser52.emit((org.jsoup.parser.Token) tag63);
        tokeniser47.emit((org.jsoup.parser.Token) tag63);
        tokeniser34.emit((org.jsoup.parser.Token) tag63);
        tokeniser34.setTrackErrors(true);
        org.jsoup.parser.Token.Doctype doctype70 = tokeniser34.doctypePending;
        java.lang.StringBuilder stringBuilder71 = tokeniser34.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder71;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertNotNull(doctype32);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(tag63);
        org.junit.Assert.assertNull(doctype70);
        org.junit.Assert.assertNotNull(stringBuilder71);
        org.junit.Assert.assertEquals(stringBuilder71.toString(), "");
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        org.jsoup.parser.Token.Comment comment6 = null;
        tokeniser1.commentPending = comment6;
        tokeniser1.emit("");
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        tokeniser11.emit('4');
        tokeniser11.createTempBuffer();
        tokeniser11.setTrackErrors(false);
        tokeniser11.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState18 = org.jsoup.parser.TokeniserState.TagOpen;
        tokeniser11.eofError(tokeniserState18);
        tokeniser11.setTrackErrors(false);
        org.jsoup.parser.TokeniserState tokeniserState22 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapeStart;
        tokeniser11.error(tokeniserState22);
        tokeniser1.transition(tokeniserState22);
        org.jsoup.parser.TokeniserState tokeniserState25 = tokeniser1.getState();
        org.jsoup.parser.Token.Tag tag27 = tokeniser1.createTagPending(true);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tokeniserState22);
        org.junit.Assert.assertNotNull(tokeniserState25);
        org.junit.Assert.assertNotNull(tag27);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.Token.Doctype doctype7 = tokeniser1.doctypePending;
        tokeniser1.emit(' ');
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype7);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        org.jsoup.parser.Token.Comment comment9 = null;
        tokeniser1.commentPending = comment9;
        org.jsoup.parser.Token.Comment comment11 = null;
        tokeniser1.commentPending = comment11;
        org.jsoup.parser.Token.Doctype doctype13 = null;
        tokeniser1.doctypePending = doctype13;
        java.lang.StringBuilder stringBuilder15 = tokeniser1.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        tokeniser17.emit("");
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        boolean boolean22 = tokeniser21.currentNodeInHtmlNS();
        tokeniser21.createCommentPending();
        boolean boolean24 = tokeniser21.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag25 = null;
        tokeniser21.tagPending = tag25;
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader27);
        boolean boolean29 = tokeniser28.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader30);
        tokeniser31.emit('4');
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader34);
        boolean boolean36 = tokeniser35.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag38 = tokeniser35.createTagPending(true);
        tokeniser31.tagPending = tag38;
        tokeniser28.tagPending = tag38;
        tokeniser21.tagPending = tag38;
        tokeniser17.emit((org.jsoup.parser.Token) tag38);
        tokeniser1.emit((org.jsoup.parser.Token) tag38);
        tokeniser1.createCommentPending();
        boolean boolean45 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag47 = tokeniser1.createTagPending(true);
        org.jsoup.parser.TokeniserState tokeniserState48 = org.jsoup.parser.TokeniserState.ScriptDataEscapeStartDash;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNotNull(tokeniserState48);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        boolean boolean6 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.setTrackErrors(true);
        boolean boolean9 = tokeniser1.isTrackErrors();
        tokeniser1.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        tokeniser12.emit('4');
        tokeniser12.createTempBuffer();
        tokeniser12.setTrackErrors(false);
        tokeniser12.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.TagOpen;
        tokeniser12.eofError(tokeniserState19);
        tokeniser12.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        tokeniser24.emit("");
        org.jsoup.parser.Token.Doctype doctype27 = null;
        tokeniser24.doctypePending = doctype27;
        tokeniser24.createTempBuffer();
        tokeniser24.emit("");
        org.jsoup.parser.Token.Comment comment32 = null;
        tokeniser24.commentPending = comment32;
        org.jsoup.parser.Token.Comment comment34 = null;
        tokeniser24.commentPending = comment34;
        org.jsoup.parser.Token.Doctype doctype36 = null;
        tokeniser24.doctypePending = doctype36;
        java.lang.StringBuilder stringBuilder38 = tokeniser24.dataBuffer;
        tokeniser12.dataBuffer = stringBuilder38;
        tokeniser12.emit(' ');
        org.jsoup.parser.CharacterReader characterReader42 = null;
        org.jsoup.parser.Tokeniser tokeniser43 = new org.jsoup.parser.Tokeniser(characterReader42);
        tokeniser43.emit('4');
        tokeniser43.createTempBuffer();
        tokeniser43.setTrackErrors(false);
        tokeniser43.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState50 = org.jsoup.parser.TokeniserState.TagOpen;
        tokeniser43.eofError(tokeniserState50);
        tokeniser12.eofError(tokeniserState50);
        tokeniser1.transition(tokeniserState50);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(stringBuilder38);
        org.junit.Assert.assertEquals(stringBuilder38.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState50);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        boolean boolean10 = tokeniser9.currentNodeInHtmlNS();
        tokeniser9.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState12 = tokeniser9.getState();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        tokeniser14.emit("");
        org.jsoup.parser.Token.Doctype doctype17 = null;
        tokeniser14.doctypePending = doctype17;
        tokeniser14.createTempBuffer();
        tokeniser14.emit("");
        org.jsoup.parser.Token.Comment comment22 = null;
        tokeniser14.commentPending = comment22;
        org.jsoup.parser.Token.Comment comment24 = null;
        tokeniser14.commentPending = comment24;
        org.jsoup.parser.Token.Doctype doctype26 = null;
        tokeniser14.doctypePending = doctype26;
        java.lang.StringBuilder stringBuilder28 = tokeniser14.dataBuffer;
        tokeniser9.dataBuffer = stringBuilder28;
        tokeniser1.dataBuffer = stringBuilder28;
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        boolean boolean33 = tokeniser32.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader34);
        tokeniser35.emit('4');
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader38);
        boolean boolean40 = tokeniser39.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag42 = tokeniser39.createTagPending(true);
        tokeniser35.tagPending = tag42;
        tokeniser32.tagPending = tag42;
        org.jsoup.parser.TokeniserState tokeniserState45 = org.jsoup.parser.TokeniserState.CommentEndDash;
        tokeniser32.transition(tokeniserState45);
        org.jsoup.parser.CharacterReader characterReader47 = null;
        org.jsoup.parser.Tokeniser tokeniser48 = new org.jsoup.parser.Tokeniser(characterReader47);
        boolean boolean49 = tokeniser48.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype50 = tokeniser48.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState51 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser48.transition(tokeniserState51);
        tokeniser32.transition(tokeniserState51);
        org.jsoup.parser.CharacterReader characterReader54 = null;
        org.jsoup.parser.Tokeniser tokeniser55 = new org.jsoup.parser.Tokeniser(characterReader54);
        tokeniser55.emit("");
        org.jsoup.parser.Token.Doctype doctype58 = null;
        tokeniser55.doctypePending = doctype58;
        tokeniser55.createTempBuffer();
        tokeniser55.emit("");
        org.jsoup.parser.Token.Comment comment63 = null;
        tokeniser55.commentPending = comment63;
        org.jsoup.parser.Token.Comment comment65 = null;
        tokeniser55.commentPending = comment65;
        org.jsoup.parser.Token.Doctype doctype67 = null;
        tokeniser55.doctypePending = doctype67;
        tokeniser55.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment70 = null;
        tokeniser55.commentPending = comment70;
        org.jsoup.parser.Token.Doctype doctype72 = tokeniser55.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState73 = tokeniser55.getState();
        java.lang.StringBuilder stringBuilder74 = tokeniser55.dataBuffer;
        tokeniser32.dataBuffer = stringBuilder74;
        tokeniser1.dataBuffer = stringBuilder74;
        tokeniser1.emitDoctypePending();
        java.lang.StringBuilder stringBuilder78 = tokeniser1.dataBuffer;
        org.jsoup.parser.Token.Tag tag80 = tokeniser1.createTagPending(true);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertNotNull(tokeniserState45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(doctype50);
        org.junit.Assert.assertNotNull(tokeniserState51);
        org.junit.Assert.assertNull(doctype72);
        org.junit.Assert.assertNotNull(tokeniserState73);
        org.junit.Assert.assertNotNull(stringBuilder74);
        org.junit.Assert.assertEquals(stringBuilder74.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder78);
        org.junit.Assert.assertEquals(stringBuilder78.toString(), "");
        org.junit.Assert.assertNotNull(tag80);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment7 = tokeniser1.commentPending;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        boolean boolean10 = tokeniser9.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag12 = tokeniser9.createTagPending(true);
        tokeniser1.emit((org.jsoup.parser.Token) tag12);
        tokeniser1.emit("");
        tokeniser1.createCommentPending();
        boolean boolean17 = tokeniser1.isTrackErrors();
        org.jsoup.parser.TokeniserState tokeniserState18 = tokeniser1.getState();
        java.lang.StringBuilder stringBuilder19 = tokeniser1.dataBuffer;
        org.junit.Assert.assertNull(comment7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser1.getState();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag8 = tokeniser1.createTagPending(false);
        tokeniser1.emitTagPending();
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        boolean boolean12 = tokeniser11.currentNodeInHtmlNS();
        tokeniser11.createCommentPending();
        boolean boolean14 = tokeniser11.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment15 = tokeniser11.commentPending;
        tokeniser1.commentPending = comment15;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char19 = tokeniser1.consumeCharacterReference((java.lang.Character) '\ufffd', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(comment15);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        tokeniser1.createDoctypePending();
        java.lang.StringBuilder stringBuilder8 = tokeniser1.dataBuffer;
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser1.getState();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNull(stringBuilder8);
        org.junit.Assert.assertNotNull(tokeniserState11);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        org.jsoup.parser.Token.Comment comment9 = null;
        tokeniser1.commentPending = comment9;
        org.jsoup.parser.Token.Tag tag12 = tokeniser1.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        boolean boolean15 = tokeniser14.currentNodeInHtmlNS();
        tokeniser14.createCommentPending();
        boolean boolean17 = tokeniser14.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment18 = tokeniser14.commentPending;
        tokeniser1.commentPending = comment18;
        tokeniser1.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader21);
        boolean boolean23 = tokeniser22.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag25 = tokeniser22.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader26);
        boolean boolean28 = tokeniser27.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag30 = tokeniser27.createTagPending(true);
        tokeniser22.emit((org.jsoup.parser.Token) tag30);
        boolean boolean32 = tokeniser22.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        org.jsoup.parser.Token.Comment comment35 = tokeniser34.commentPending;
        org.jsoup.parser.TokeniserState tokeniserState36 = tokeniser34.getState();
        tokeniser22.transition(tokeniserState36);
        tokeniser1.transition(tokeniserState36);
        tokeniser1.emit('\ufffd');
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(comment18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(comment35);
        org.junit.Assert.assertNotNull(tokeniserState36);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag9 = tokeniser6.createTagPending(true);
        tokeniser1.emit((org.jsoup.parser.Token) tag9);
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        org.jsoup.parser.TokeniserState tokeniserState15 = tokeniser14.getState();
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        boolean boolean18 = tokeniser17.currentNodeInHtmlNS();
        tokeniser17.createCommentPending();
        boolean boolean20 = tokeniser17.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment21 = tokeniser17.commentPending;
        tokeniser14.commentPending = comment21;
        tokeniser12.commentPending = comment21;
        tokeniser1.commentPending = comment21;
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader25);
        tokeniser26.emit('4');
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader29);
        boolean boolean31 = tokeniser30.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag33 = tokeniser30.createTagPending(true);
        tokeniser26.tagPending = tag33;
        org.jsoup.parser.Token.Tag tag36 = tokeniser26.createTagPending(false);
        tokeniser1.tagPending = tag36;
        tokeniser1.createCommentPending();
        tokeniser1.setTrackErrors(false);
        tokeniser1.createTempBuffer();
        org.jsoup.parser.Token.Tag tag43 = tokeniser1.createTagPending(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(comment21);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(tag43);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Doctype doctype11 = null;
        tokeniser1.doctypePending = doctype11;
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        boolean boolean15 = tokeniser14.currentNodeInHtmlNS();
        tokeniser14.emit('4');
        org.jsoup.parser.Token.Comment comment18 = tokeniser14.commentPending;
        org.jsoup.parser.Token.Tag tag20 = tokeniser14.createTagPending(false);
        tokeniser1.emit((org.jsoup.parser.Token) tag20);
        org.jsoup.parser.Token.Comment comment22 = tokeniser1.commentPending;
        tokeniser1.createTempBuffer();
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(comment18);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNull(comment22);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        org.jsoup.parser.Token.Comment comment9 = null;
        tokeniser1.commentPending = comment9;
        org.jsoup.parser.Token.Tag tag12 = tokeniser1.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        boolean boolean15 = tokeniser14.currentNodeInHtmlNS();
        tokeniser14.emit('4');
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        boolean boolean20 = tokeniser19.currentNodeInHtmlNS();
        tokeniser19.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        tokeniser23.emit('4');
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader26);
        boolean boolean28 = tokeniser27.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag30 = tokeniser27.createTagPending(true);
        tokeniser23.tagPending = tag30;
        tokeniser19.emit((org.jsoup.parser.Token) tag30);
        tokeniser14.emit((org.jsoup.parser.Token) tag30);
        tokeniser1.emit((org.jsoup.parser.Token) tag30);
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState37 = tokeniser1.getState();
        tokeniser1.emit(' ');
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag41 = tokeniser1.tagPending;
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(tokeniserState37);
        org.junit.Assert.assertNotNull(tag41);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader3 = null;
        org.jsoup.parser.Tokeniser tokeniser4 = new org.jsoup.parser.Tokeniser(characterReader3);
        boolean boolean5 = tokeniser4.currentNodeInHtmlNS();
        tokeniser4.createCommentPending();
        boolean boolean7 = tokeniser4.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment8 = tokeniser4.commentPending;
        tokeniser1.commentPending = comment8;
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.Token.Tag tag13 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        boolean boolean16 = tokeniser15.currentNodeInHtmlNS();
        tokeniser15.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        tokeniser19.emit('4');
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        boolean boolean24 = tokeniser23.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag26 = tokeniser23.createTagPending(true);
        tokeniser19.tagPending = tag26;
        tokeniser15.emit((org.jsoup.parser.Token) tag26);
        tokeniser1.emit((org.jsoup.parser.Token) tag26);
        org.jsoup.parser.Token.Tag tag31 = tokeniser1.createTagPending(true);
        org.jsoup.parser.TokeniserState tokeniserState32 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        boolean boolean35 = tokeniser34.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader36);
        tokeniser37.emit('4');
        org.jsoup.parser.CharacterReader characterReader40 = null;
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader40);
        boolean boolean42 = tokeniser41.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag44 = tokeniser41.createTagPending(true);
        tokeniser37.tagPending = tag44;
        tokeniser34.tagPending = tag44;
        java.lang.StringBuilder stringBuilder47 = tokeniser34.dataBuffer;
        org.jsoup.parser.Token.Tag tag48 = tokeniser34.tagPending;
        tokeniser1.tagPending = tag48;
        org.jsoup.parser.CharacterReader characterReader50 = null;
        org.jsoup.parser.Tokeniser tokeniser51 = new org.jsoup.parser.Tokeniser(characterReader50);
        tokeniser51.emit('4');
        tokeniser51.createTempBuffer();
        tokeniser51.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment57 = tokeniser51.commentPending;
        org.jsoup.parser.CharacterReader characterReader58 = null;
        org.jsoup.parser.Tokeniser tokeniser59 = new org.jsoup.parser.Tokeniser(characterReader58);
        boolean boolean60 = tokeniser59.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag62 = tokeniser59.createTagPending(true);
        tokeniser51.emit((org.jsoup.parser.Token) tag62);
        tokeniser51.emit("");
        org.jsoup.parser.Token token66 = tokeniser51.read();
        java.lang.StringBuilder stringBuilder67 = tokeniser51.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder67;
        java.lang.Class<?> wildcardClass69 = tokeniser1.getClass();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(comment8);
        org.junit.Assert.assertNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(tokeniserState32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNull(stringBuilder47);
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertNull(comment57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(tag62);
        org.junit.Assert.assertNotNull(token66);
        org.junit.Assert.assertNotNull(stringBuilder67);
        org.junit.Assert.assertEquals(stringBuilder67.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        tokeniser9.emit('4');
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        boolean boolean14 = tokeniser13.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag16 = tokeniser13.createTagPending(true);
        tokeniser9.tagPending = tag16;
        tokeniser6.tagPending = tag16;
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.CommentEndDash;
        tokeniser6.transition(tokeniserState19);
        tokeniser1.transition(tokeniserState19);
        org.jsoup.parser.Token.Doctype doctype22 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Doctype doctype23 = tokeniser1.doctypePending;
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader24);
        boolean boolean26 = tokeniser25.currentNodeInHtmlNS();
        tokeniser25.createCommentPending();
        tokeniser25.emitCommentPending();
        java.lang.StringBuilder stringBuilder29 = null;
        tokeniser25.dataBuffer = stringBuilder29;
        org.jsoup.parser.Token.Comment comment31 = tokeniser25.commentPending;
        tokeniser1.commentPending = comment31;
        tokeniser1.createCommentPending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment35 = tokeniser1.commentPending;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.TokeniserState tokeniserState37 = org.jsoup.parser.TokeniserState.BeforeDoctypeName;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNull(doctype22);
        org.junit.Assert.assertNull(doctype23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(comment31);
        org.junit.Assert.assertNotNull(comment35);
        org.junit.Assert.assertNotNull(tokeniserState37);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader3 = null;
        org.jsoup.parser.Tokeniser tokeniser4 = new org.jsoup.parser.Tokeniser(characterReader3);
        tokeniser4.emit('4');
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        boolean boolean9 = tokeniser8.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag11 = tokeniser8.createTagPending(true);
        tokeniser4.tagPending = tag11;
        tokeniser1.tagPending = tag11;
        java.lang.StringBuilder stringBuilder14 = tokeniser1.dataBuffer;
        org.jsoup.parser.Token.Tag tag15 = tokeniser1.tagPending;
        boolean boolean16 = tokeniser1.isTrackErrors();
        boolean boolean17 = tokeniser1.isTrackErrors();
        tokeniser1.createTempBuffer();
        org.jsoup.parser.Token.Comment comment19 = tokeniser1.commentPending;
        boolean boolean20 = tokeniser1.currentNodeInHtmlNS();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNull(stringBuilder14);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(comment19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        boolean boolean10 = tokeniser9.currentNodeInHtmlNS();
        tokeniser9.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState12 = tokeniser9.getState();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        tokeniser14.emit("");
        org.jsoup.parser.Token.Doctype doctype17 = null;
        tokeniser14.doctypePending = doctype17;
        tokeniser14.createTempBuffer();
        tokeniser14.emit("");
        org.jsoup.parser.Token.Comment comment22 = null;
        tokeniser14.commentPending = comment22;
        org.jsoup.parser.Token.Comment comment24 = null;
        tokeniser14.commentPending = comment24;
        org.jsoup.parser.Token.Doctype doctype26 = null;
        tokeniser14.doctypePending = doctype26;
        java.lang.StringBuilder stringBuilder28 = tokeniser14.dataBuffer;
        tokeniser9.dataBuffer = stringBuilder28;
        tokeniser1.dataBuffer = stringBuilder28;
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        tokeniser32.emit("");
        org.jsoup.parser.Token.Doctype doctype35 = null;
        tokeniser32.doctypePending = doctype35;
        org.jsoup.parser.Token.Doctype doctype37 = null;
        tokeniser32.doctypePending = doctype37;
        org.jsoup.parser.CharacterReader characterReader39 = null;
        org.jsoup.parser.Tokeniser tokeniser40 = new org.jsoup.parser.Tokeniser(characterReader39);
        tokeniser40.emit('4');
        org.jsoup.parser.CharacterReader characterReader43 = null;
        org.jsoup.parser.Tokeniser tokeniser44 = new org.jsoup.parser.Tokeniser(characterReader43);
        boolean boolean45 = tokeniser44.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag47 = tokeniser44.createTagPending(true);
        tokeniser40.tagPending = tag47;
        org.jsoup.parser.TokeniserState tokeniserState49 = tokeniser40.getState();
        org.jsoup.parser.TokeniserState tokeniserState50 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemIdentifier;
        tokeniser40.transition(tokeniserState50);
        tokeniser32.transition(tokeniserState50);
        org.jsoup.parser.CharacterReader characterReader53 = null;
        org.jsoup.parser.Tokeniser tokeniser54 = new org.jsoup.parser.Tokeniser(characterReader53);
        tokeniser54.emit("");
        org.jsoup.parser.Token.Doctype doctype57 = null;
        tokeniser54.doctypePending = doctype57;
        org.jsoup.parser.CharacterReader characterReader59 = null;
        org.jsoup.parser.Tokeniser tokeniser60 = new org.jsoup.parser.Tokeniser(characterReader59);
        org.jsoup.parser.TokeniserState tokeniserState61 = tokeniser60.getState();
        org.jsoup.parser.CharacterReader characterReader62 = null;
        org.jsoup.parser.Tokeniser tokeniser63 = new org.jsoup.parser.Tokeniser(characterReader62);
        boolean boolean64 = tokeniser63.currentNodeInHtmlNS();
        tokeniser63.createCommentPending();
        boolean boolean66 = tokeniser63.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment67 = tokeniser63.commentPending;
        tokeniser60.commentPending = comment67;
        tokeniser60.createTempBuffer();
        java.lang.StringBuilder stringBuilder70 = tokeniser60.dataBuffer;
        tokeniser54.dataBuffer = stringBuilder70;
        tokeniser32.dataBuffer = stringBuilder70;
        tokeniser1.dataBuffer = stringBuilder70;
        org.jsoup.parser.Token.Doctype doctype74 = null;
        tokeniser1.doctypePending = doctype74;
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Comment comment77 = tokeniser1.commentPending;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag80 = tokeniser1.createTagPending(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNotNull(tokeniserState49);
        org.junit.Assert.assertNotNull(tokeniserState50);
        org.junit.Assert.assertNotNull(tokeniserState61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(comment67);
        org.junit.Assert.assertNotNull(stringBuilder70);
        org.junit.Assert.assertEquals(stringBuilder70.toString(), "");
        org.junit.Assert.assertNotNull(comment77);
        org.junit.Assert.assertNotNull(tag80);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        tokeniser1.emit("hi!");
        boolean boolean9 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createTempBuffer();
        boolean boolean11 = tokeniser1.currentNodeInHtmlNS();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader3 = null;
        org.jsoup.parser.Tokeniser tokeniser4 = new org.jsoup.parser.Tokeniser(characterReader3);
        tokeniser4.emit('4');
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        boolean boolean9 = tokeniser8.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag11 = tokeniser8.createTagPending(true);
        tokeniser4.tagPending = tag11;
        tokeniser1.tagPending = tag11;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState15 = tokeniser1.getState();
        org.jsoup.parser.Token.Doctype doctype16 = null;
        tokeniser1.doctypePending = doctype16;
        org.jsoup.parser.Token.Comment comment18 = tokeniser1.commentPending;
        tokeniser1.emitTagPending();
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        boolean boolean24 = tokeniser23.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag26 = tokeniser23.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader27);
        boolean boolean29 = tokeniser28.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag31 = tokeniser28.createTagPending(true);
        tokeniser23.emit((org.jsoup.parser.Token) tag31);
        tokeniser23.setTrackErrors(true);
        org.jsoup.parser.Token.Tag tag35 = tokeniser23.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState36 = tokeniser23.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertNull(comment18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(tokeniserState36);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader3 = null;
        org.jsoup.parser.Tokeniser tokeniser4 = new org.jsoup.parser.Tokeniser(characterReader3);
        boolean boolean5 = tokeniser4.currentNodeInHtmlNS();
        tokeniser4.createCommentPending();
        boolean boolean7 = tokeniser4.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment8 = tokeniser4.commentPending;
        tokeniser1.commentPending = comment8;
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        boolean boolean13 = tokeniser12.currentNodeInHtmlNS();
        tokeniser12.createCommentPending();
        tokeniser12.emitCommentPending();
        java.lang.StringBuilder stringBuilder16 = tokeniser12.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        tokeniser18.emit("");
        org.jsoup.parser.Token.Doctype doctype21 = null;
        tokeniser18.doctypePending = doctype21;
        tokeniser18.createTempBuffer();
        tokeniser18.emit("");
        org.jsoup.parser.Token.Comment comment26 = null;
        tokeniser18.commentPending = comment26;
        org.jsoup.parser.Token.Tag tag29 = tokeniser18.createTagPending(true);
        tokeniser12.tagPending = tag29;
        tokeniser1.tagPending = tag29;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(comment8);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(stringBuilder16);
        org.junit.Assert.assertNotNull(tag29);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        tokeniser1.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState8 = org.jsoup.parser.TokeniserState.TagOpen;
        tokeniser1.eofError(tokeniserState8);
        org.jsoup.parser.Token.Doctype doctype10 = tokeniser1.doctypePending;
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        boolean boolean13 = tokeniser12.currentNodeInHtmlNS();
        tokeniser12.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        tokeniser16.emit('4');
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        boolean boolean21 = tokeniser20.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag23 = tokeniser20.createTagPending(true);
        tokeniser16.tagPending = tag23;
        tokeniser12.emit((org.jsoup.parser.Token) tag23);
        org.jsoup.parser.Token.Doctype doctype26 = tokeniser12.doctypePending;
        boolean boolean27 = tokeniser12.isTrackErrors();
        java.lang.StringBuilder stringBuilder28 = tokeniser12.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader29);
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        org.jsoup.parser.TokeniserState tokeniserState33 = tokeniser32.getState();
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader34);
        boolean boolean36 = tokeniser35.currentNodeInHtmlNS();
        tokeniser35.createCommentPending();
        boolean boolean38 = tokeniser35.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment39 = tokeniser35.commentPending;
        tokeniser32.commentPending = comment39;
        tokeniser30.commentPending = comment39;
        org.jsoup.parser.CharacterReader characterReader42 = null;
        org.jsoup.parser.Tokeniser tokeniser43 = new org.jsoup.parser.Tokeniser(characterReader42);
        boolean boolean44 = tokeniser43.currentNodeInHtmlNS();
        tokeniser43.emit('4');
        org.jsoup.parser.CharacterReader characterReader47 = null;
        org.jsoup.parser.Tokeniser tokeniser48 = new org.jsoup.parser.Tokeniser(characterReader47);
        boolean boolean49 = tokeniser48.currentNodeInHtmlNS();
        tokeniser48.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader51 = null;
        org.jsoup.parser.Tokeniser tokeniser52 = new org.jsoup.parser.Tokeniser(characterReader51);
        tokeniser52.emit('4');
        org.jsoup.parser.CharacterReader characterReader55 = null;
        org.jsoup.parser.Tokeniser tokeniser56 = new org.jsoup.parser.Tokeniser(characterReader55);
        boolean boolean57 = tokeniser56.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag59 = tokeniser56.createTagPending(true);
        tokeniser52.tagPending = tag59;
        tokeniser48.emit((org.jsoup.parser.Token) tag59);
        tokeniser43.emit((org.jsoup.parser.Token) tag59);
        tokeniser30.tagPending = tag59;
        org.jsoup.parser.CharacterReader characterReader64 = null;
        org.jsoup.parser.Tokeniser tokeniser65 = new org.jsoup.parser.Tokeniser(characterReader64);
        tokeniser65.emit("");
        org.jsoup.parser.Token.Doctype doctype68 = null;
        tokeniser65.doctypePending = doctype68;
        tokeniser65.createTempBuffer();
        tokeniser65.emit("");
        org.jsoup.parser.Token.Comment comment73 = null;
        tokeniser65.commentPending = comment73;
        org.jsoup.parser.Token.Comment comment75 = null;
        tokeniser65.commentPending = comment75;
        org.jsoup.parser.Token.Doctype doctype77 = null;
        tokeniser65.doctypePending = doctype77;
        java.lang.StringBuilder stringBuilder79 = tokeniser65.dataBuffer;
        tokeniser30.dataBuffer = stringBuilder79;
        tokeniser12.dataBuffer = stringBuilder79;
        org.jsoup.parser.CharacterReader characterReader82 = null;
        org.jsoup.parser.Tokeniser tokeniser83 = new org.jsoup.parser.Tokeniser(characterReader82);
        boolean boolean84 = tokeniser83.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype85 = tokeniser83.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState86 = tokeniser83.getState();
        tokeniser12.transition(tokeniserState86);
        org.jsoup.parser.Token.Tag tag88 = tokeniser12.tagPending;
        org.jsoup.parser.Token.Tag tag90 = tokeniser12.createTagPending(false);
        tokeniser1.tagPending = tag90;
        tokeniser1.emit("");
        boolean boolean94 = tokeniser1.isTrackErrors();
        tokeniser1.setTrackErrors(true);
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNull(doctype10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNull(doctype26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(stringBuilder28);
        org.junit.Assert.assertNotNull(tokeniserState33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(comment39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(tag59);
        org.junit.Assert.assertNotNull(stringBuilder79);
        org.junit.Assert.assertEquals(stringBuilder79.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNull(doctype85);
        org.junit.Assert.assertNotNull(tokeniserState86);
        org.junit.Assert.assertNull(tag88);
        org.junit.Assert.assertNotNull(tag90);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        boolean boolean9 = tokeniser8.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype10 = tokeniser8.doctypePending;
        org.jsoup.parser.Token.Tag tag11 = tokeniser8.tagPending;
        org.jsoup.parser.Token.Tag tag13 = tokeniser8.createTagPending(false);
        tokeniser1.tagPending = tag13;
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        tokeniser16.emit("");
        tokeniser16.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser16.getState();
        tokeniser1.transition(tokeniserState20);
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Comment comment23 = tokeniser1.commentPending;
        tokeniser1.emit('\ufffd');
        tokeniser1.createTempBuffer();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(doctype10);
        org.junit.Assert.assertNull(tag11);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertNotNull(comment23);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        org.jsoup.parser.Token.Comment comment9 = null;
        tokeniser1.commentPending = comment9;
        org.jsoup.parser.Token.Comment comment11 = null;
        tokeniser1.commentPending = comment11;
        org.jsoup.parser.Token.Doctype doctype13 = null;
        tokeniser1.doctypePending = doctype13;
        java.lang.StringBuilder stringBuilder15 = tokeniser1.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        tokeniser17.emit("");
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        boolean boolean22 = tokeniser21.currentNodeInHtmlNS();
        tokeniser21.createCommentPending();
        boolean boolean24 = tokeniser21.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag25 = null;
        tokeniser21.tagPending = tag25;
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader27);
        boolean boolean29 = tokeniser28.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader30);
        tokeniser31.emit('4');
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader34);
        boolean boolean36 = tokeniser35.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag38 = tokeniser35.createTagPending(true);
        tokeniser31.tagPending = tag38;
        tokeniser28.tagPending = tag38;
        tokeniser21.tagPending = tag38;
        tokeniser17.emit((org.jsoup.parser.Token) tag38);
        tokeniser1.emit((org.jsoup.parser.Token) tag38);
        org.jsoup.parser.Token.Tag tag45 = tokeniser1.createTagPending(false);
        java.lang.StringBuilder stringBuilder46 = tokeniser1.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader47 = null;
        org.jsoup.parser.Tokeniser tokeniser48 = new org.jsoup.parser.Tokeniser(characterReader47);
        tokeniser48.emit("");
        org.jsoup.parser.Token.Doctype doctype51 = null;
        tokeniser48.doctypePending = doctype51;
        org.jsoup.parser.Token.Comment comment53 = null;
        tokeniser48.commentPending = comment53;
        org.jsoup.parser.Token.Tag tag55 = tokeniser48.tagPending;
        org.jsoup.parser.Token.Doctype doctype56 = null;
        tokeniser48.doctypePending = doctype56;
        org.jsoup.parser.Token.Tag tag59 = tokeniser48.createTagPending(false);
        tokeniser1.tagPending = tag59;
        boolean boolean61 = tokeniser1.isTrackErrors();
        org.jsoup.parser.Token token62 = tokeniser1.read();
        org.jsoup.parser.TokeniserState tokeniserState63 = tokeniser1.getState();
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNotNull(stringBuilder46);
        org.junit.Assert.assertEquals(stringBuilder46.toString(), "");
        org.junit.Assert.assertNull(tag55);
        org.junit.Assert.assertNotNull(tag59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(token62);
        org.junit.Assert.assertNotNull(tokeniserState63);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        org.jsoup.parser.TokeniserState tokeniserState6 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_singleQuoted;
        tokeniser1.transition(tokeniserState6);
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        tokeniser10.emit("");
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        boolean boolean15 = tokeniser14.currentNodeInHtmlNS();
        tokeniser14.createCommentPending();
        boolean boolean17 = tokeniser14.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag18 = null;
        tokeniser14.tagPending = tag18;
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        boolean boolean22 = tokeniser21.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        tokeniser24.emit('4');
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader27);
        boolean boolean29 = tokeniser28.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag31 = tokeniser28.createTagPending(true);
        tokeniser24.tagPending = tag31;
        tokeniser21.tagPending = tag31;
        tokeniser14.tagPending = tag31;
        tokeniser10.emit((org.jsoup.parser.Token) tag31);
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader36);
        tokeniser37.emit('4');
        org.jsoup.parser.CharacterReader characterReader40 = null;
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader40);
        boolean boolean42 = tokeniser41.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag44 = tokeniser41.createTagPending(true);
        tokeniser37.tagPending = tag44;
        tokeniser10.tagPending = tag44;
        org.jsoup.parser.CharacterReader characterReader47 = null;
        org.jsoup.parser.Tokeniser tokeniser48 = new org.jsoup.parser.Tokeniser(characterReader47);
        tokeniser48.emit('4');
        tokeniser48.createTempBuffer();
        tokeniser48.setTrackErrors(false);
        tokeniser48.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState55 = org.jsoup.parser.TokeniserState.TagOpen;
        tokeniser48.eofError(tokeniserState55);
        tokeniser48.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader59 = null;
        org.jsoup.parser.Tokeniser tokeniser60 = new org.jsoup.parser.Tokeniser(characterReader59);
        tokeniser60.emit("");
        org.jsoup.parser.Token.Doctype doctype63 = null;
        tokeniser60.doctypePending = doctype63;
        tokeniser60.createTempBuffer();
        tokeniser60.emit("");
        org.jsoup.parser.Token.Comment comment68 = null;
        tokeniser60.commentPending = comment68;
        org.jsoup.parser.Token.Comment comment70 = null;
        tokeniser60.commentPending = comment70;
        org.jsoup.parser.Token.Doctype doctype72 = null;
        tokeniser60.doctypePending = doctype72;
        java.lang.StringBuilder stringBuilder74 = tokeniser60.dataBuffer;
        tokeniser48.dataBuffer = stringBuilder74;
        tokeniser10.dataBuffer = stringBuilder74;
        tokeniser1.dataBuffer = stringBuilder74;
        java.lang.StringBuilder stringBuilder78 = tokeniser1.dataBuffer;
        tokeniser1.setTrackErrors(false);
        tokeniser1.acknowledgeSelfClosingFlag();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNotNull(tokeniserState6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(tokeniserState55);
        org.junit.Assert.assertNotNull(stringBuilder74);
        org.junit.Assert.assertEquals(stringBuilder74.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder78);
        org.junit.Assert.assertEquals(stringBuilder78.toString(), "");
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        tokeniser1.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState8 = org.jsoup.parser.TokeniserState.TagOpen;
        tokeniser1.eofError(tokeniserState8);
        tokeniser1.setTrackErrors(false);
        tokeniser1.emit(' ');
        tokeniser1.createTempBuffer();
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.TokeniserState tokeniserState17 = tokeniser1.getState();
        tokeniser1.createDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNotNull(tokeniserState17);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader3 = null;
        org.jsoup.parser.Tokeniser tokeniser4 = new org.jsoup.parser.Tokeniser(characterReader3);
        tokeniser4.emit('4');
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        boolean boolean9 = tokeniser8.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag11 = tokeniser8.createTagPending(true);
        tokeniser4.tagPending = tag11;
        tokeniser1.tagPending = tag11;
        org.jsoup.parser.TokeniserState tokeniserState14 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        boolean boolean17 = tokeniser16.currentNodeInHtmlNS();
        tokeniser16.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        tokeniser20.emit('4');
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        boolean boolean25 = tokeniser24.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag27 = tokeniser24.createTagPending(true);
        tokeniser20.tagPending = tag27;
        tokeniser16.emit((org.jsoup.parser.Token) tag27);
        tokeniser16.createTempBuffer();
        tokeniser16.acknowledgeSelfClosingFlag();
        tokeniser16.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState34 = org.jsoup.parser.TokeniserState.TagName;
        tokeniser16.transition(tokeniserState34);
        tokeniser1.transition(tokeniserState34);
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.acknowledgeSelfClosingFlag();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(tokeniserState34);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        tokeniser5.emit('4');
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        boolean boolean10 = tokeniser9.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag12 = tokeniser9.createTagPending(true);
        tokeniser5.tagPending = tag12;
        tokeniser1.emit((org.jsoup.parser.Token) tag12);
        tokeniser1.createTempBuffer();
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.Token.Tag tag19 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        boolean boolean22 = tokeniser21.currentNodeInHtmlNS();
        tokeniser21.createCommentPending();
        tokeniser21.emitCommentPending();
        java.lang.StringBuilder stringBuilder25 = null;
        tokeniser21.dataBuffer = stringBuilder25;
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader27);
        tokeniser28.emit("");
        org.jsoup.parser.Token.Doctype doctype31 = null;
        tokeniser28.doctypePending = doctype31;
        tokeniser28.createTempBuffer();
        tokeniser28.emit("");
        org.jsoup.parser.Token.Comment comment36 = null;
        tokeniser28.commentPending = comment36;
        org.jsoup.parser.Token.Tag tag39 = tokeniser28.createTagPending(false);
        tokeniser21.tagPending = tag39;
        org.jsoup.parser.CharacterReader characterReader41 = null;
        org.jsoup.parser.Tokeniser tokeniser42 = new org.jsoup.parser.Tokeniser(characterReader41);
        tokeniser42.emit("");
        tokeniser42.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState46 = tokeniser42.getState();
        tokeniser42.createDoctypePending();
        org.jsoup.parser.Token.Tag tag49 = tokeniser42.createTagPending(false);
        org.jsoup.parser.Token.Tag tag50 = tokeniser42.tagPending;
        org.jsoup.parser.Token.Doctype doctype51 = tokeniser42.doctypePending;
        tokeniser21.doctypePending = doctype51;
        tokeniser1.doctypePending = doctype51;
        tokeniser1.emit("hi!");
        org.jsoup.parser.TokeniserState tokeniserState56 = org.jsoup.parser.TokeniserState.ScriptDataEndTagName;
        tokeniser1.eofError(tokeniserState56);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char60 = tokeniser1.consumeCharacterReference((java.lang.Character) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(tag19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(tokeniserState46);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertNotNull(doctype51);
        org.junit.Assert.assertNotNull(tokeniserState56);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag9 = tokeniser6.createTagPending(true);
        tokeniser1.emit((org.jsoup.parser.Token) tag9);
        boolean boolean11 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        boolean boolean14 = tokeniser13.currentNodeInHtmlNS();
        tokeniser13.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        tokeniser17.emit('4');
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        boolean boolean22 = tokeniser21.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag24 = tokeniser21.createTagPending(true);
        tokeniser17.tagPending = tag24;
        tokeniser13.emit((org.jsoup.parser.Token) tag24);
        tokeniser1.tagPending = tag24;
        org.jsoup.parser.Token.Tag tag28 = tokeniser1.tagPending;
        org.jsoup.parser.Token.Tag tag29 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader30);
        tokeniser31.emit("");
        tokeniser31.acknowledgeSelfClosingFlag();
        tokeniser31.createTempBuffer();
        java.lang.StringBuilder stringBuilder36 = tokeniser31.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder36;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(stringBuilder36);
        org.junit.Assert.assertEquals(stringBuilder36.toString(), "");
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader3 = null;
        org.jsoup.parser.Tokeniser tokeniser4 = new org.jsoup.parser.Tokeniser(characterReader3);
        tokeniser4.emit('4');
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        boolean boolean9 = tokeniser8.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag11 = tokeniser8.createTagPending(true);
        tokeniser4.tagPending = tag11;
        tokeniser1.tagPending = tag11;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState15 = tokeniser1.getState();
        org.jsoup.parser.Token.Doctype doctype16 = null;
        tokeniser1.doctypePending = doctype16;
        org.jsoup.parser.TokeniserState tokeniserState18 = org.jsoup.parser.TokeniserState.CharacterReferenceInData;
        tokeniser1.transition(tokeniserState18);
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser1.getState();
        org.jsoup.parser.Token.Tag tag22 = tokeniser1.createTagPending(true);
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.Token.Comment comment25 = tokeniser1.commentPending;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNull(comment25);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser1.getState();
        boolean boolean8 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.RawtextEndTagName;
        tokeniser1.transition(tokeniserState9);
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        boolean boolean13 = tokeniser12.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag15 = tokeniser12.createTagPending(true);
        tokeniser1.emit((org.jsoup.parser.Token) tag15);
        tokeniser1.setTrackErrors(false);
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader21);
        tokeniser22.emit('4');
        tokeniser22.createTempBuffer();
        tokeniser22.setTrackErrors(false);
        tokeniser22.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState29 = org.jsoup.parser.TokeniserState.TagOpen;
        tokeniser22.eofError(tokeniserState29);
        tokeniser22.setTrackErrors(false);
        tokeniser22.emit(' ');
        tokeniser22.createTempBuffer();
        tokeniser22.emit('\ufffd');
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader38);
        boolean boolean40 = tokeniser39.currentNodeInHtmlNS();
        tokeniser39.createCommentPending();
        boolean boolean42 = tokeniser39.currentNodeInHtmlNS();
        tokeniser39.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader44 = null;
        org.jsoup.parser.Tokeniser tokeniser45 = new org.jsoup.parser.Tokeniser(characterReader44);
        boolean boolean46 = tokeniser45.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype47 = tokeniser45.doctypePending;
        org.jsoup.parser.CharacterReader characterReader48 = null;
        org.jsoup.parser.Tokeniser tokeniser49 = new org.jsoup.parser.Tokeniser(characterReader48);
        boolean boolean50 = tokeniser49.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag52 = tokeniser49.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader53 = null;
        org.jsoup.parser.Tokeniser tokeniser54 = new org.jsoup.parser.Tokeniser(characterReader53);
        boolean boolean55 = tokeniser54.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag57 = tokeniser54.createTagPending(true);
        tokeniser49.emit((org.jsoup.parser.Token) tag57);
        tokeniser45.emit((org.jsoup.parser.Token) tag57);
        tokeniser39.emit((org.jsoup.parser.Token) tag57);
        tokeniser22.tagPending = tag57;
        tokeniser22.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader63 = null;
        org.jsoup.parser.Tokeniser tokeniser64 = new org.jsoup.parser.Tokeniser(characterReader63);
        tokeniser64.emit('4');
        tokeniser64.createTempBuffer();
        tokeniser64.setTrackErrors(false);
        org.jsoup.parser.Token.Doctype doctype70 = null;
        tokeniser64.doctypePending = doctype70;
        tokeniser64.createCommentPending();
        org.jsoup.parser.Token.Comment comment73 = tokeniser64.commentPending;
        tokeniser22.commentPending = comment73;
        tokeniser1.commentPending = comment73;
        org.jsoup.parser.Token.Doctype doctype76 = tokeniser1.doctypePending;
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(tokeniserState29);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(doctype47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertNotNull(comment73);
        org.junit.Assert.assertNull(doctype76);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader6);
        boolean boolean8 = tokeniser7.currentNodeInHtmlNS();
        tokeniser7.createCommentPending();
        tokeniser7.emitCommentPending();
        java.lang.StringBuilder stringBuilder11 = null;
        tokeniser7.dataBuffer = stringBuilder11;
        org.jsoup.parser.Token.Comment comment13 = tokeniser7.commentPending;
        tokeniser1.commentPending = comment13;
        org.jsoup.parser.Token.Comment comment15 = tokeniser1.commentPending;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag18 = tokeniser1.createTagPending(false);
        org.jsoup.parser.Token.Tag tag20 = tokeniser1.createTagPending(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(comment13);
        org.junit.Assert.assertNotNull(comment15);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(tag20);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(true);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Comment comment11 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Tag tag12 = null;
        tokeniser1.tagPending = tag12;
        boolean boolean14 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        boolean boolean17 = tokeniser16.currentNodeInHtmlNS();
        tokeniser16.createCommentPending();
        boolean boolean19 = tokeniser16.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag20 = null;
        tokeniser16.tagPending = tag20;
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        boolean boolean24 = tokeniser23.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader25);
        tokeniser26.emit('4');
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader29);
        boolean boolean31 = tokeniser30.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag33 = tokeniser30.createTagPending(true);
        tokeniser26.tagPending = tag33;
        tokeniser23.tagPending = tag33;
        tokeniser16.tagPending = tag33;
        boolean boolean37 = tokeniser16.currentNodeInHtmlNS();
        tokeniser16.createCommentPending();
        tokeniser16.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader40 = null;
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader40);
        boolean boolean42 = tokeniser41.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype43 = tokeniser41.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState44 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser41.transition(tokeniserState44);
        tokeniser41.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader47 = null;
        org.jsoup.parser.Tokeniser tokeniser48 = new org.jsoup.parser.Tokeniser(characterReader47);
        tokeniser48.emit('4');
        tokeniser48.createTempBuffer();
        tokeniser48.setTrackErrors(false);
        tokeniser48.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype55 = null;
        tokeniser48.doctypePending = doctype55;
        tokeniser48.emit("");
        tokeniser48.createCommentPending();
        tokeniser48.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader61 = null;
        org.jsoup.parser.Tokeniser tokeniser62 = new org.jsoup.parser.Tokeniser(characterReader61);
        tokeniser62.emit("");
        tokeniser62.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState66 = tokeniser62.getState();
        tokeniser62.createDoctypePending();
        org.jsoup.parser.Token.Tag tag69 = tokeniser62.createTagPending(false);
        org.jsoup.parser.Token.Tag tag70 = tokeniser62.tagPending;
        org.jsoup.parser.Token.Doctype doctype71 = tokeniser62.doctypePending;
        tokeniser48.doctypePending = doctype71;
        org.jsoup.parser.CharacterReader characterReader73 = null;
        org.jsoup.parser.Tokeniser tokeniser74 = new org.jsoup.parser.Tokeniser(characterReader73);
        tokeniser74.emit("");
        tokeniser74.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState78 = tokeniser74.getState();
        tokeniser74.createDoctypePending();
        org.jsoup.parser.Token.Tag tag81 = tokeniser74.createTagPending(false);
        org.jsoup.parser.Token.Tag tag82 = tokeniser74.tagPending;
        org.jsoup.parser.Token.Doctype doctype83 = tokeniser74.doctypePending;
        tokeniser48.doctypePending = doctype83;
        tokeniser41.doctypePending = doctype83;
        org.jsoup.parser.Token.Doctype doctype86 = tokeniser41.doctypePending;
        tokeniser16.doctypePending = doctype86;
        org.jsoup.parser.Token.Comment comment88 = tokeniser16.commentPending;
        tokeniser1.commentPending = comment88;
        tokeniser1.createCommentPending();
        tokeniser1.emit("");
        org.junit.Assert.assertNull(comment11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(doctype43);
        org.junit.Assert.assertNotNull(tokeniserState44);
        org.junit.Assert.assertNotNull(tokeniserState66);
        org.junit.Assert.assertNotNull(tag69);
        org.junit.Assert.assertNotNull(tag70);
        org.junit.Assert.assertNotNull(doctype71);
        org.junit.Assert.assertNotNull(tokeniserState78);
        org.junit.Assert.assertNotNull(tag81);
        org.junit.Assert.assertNotNull(tag82);
        org.junit.Assert.assertNotNull(doctype83);
        org.junit.Assert.assertNotNull(doctype86);
        org.junit.Assert.assertNotNull(comment88);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        tokeniser1.emitCommentPending();
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        tokeniser6.emit('4');
        tokeniser6.createTempBuffer();
        tokeniser6.setTrackErrors(false);
        tokeniser6.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState13 = org.jsoup.parser.TokeniserState.TagOpen;
        tokeniser6.eofError(tokeniserState13);
        tokeniser6.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        tokeniser18.emit("");
        org.jsoup.parser.Token.Doctype doctype21 = null;
        tokeniser18.doctypePending = doctype21;
        tokeniser18.createTempBuffer();
        tokeniser18.emit("");
        org.jsoup.parser.Token.Comment comment26 = null;
        tokeniser18.commentPending = comment26;
        org.jsoup.parser.Token.Comment comment28 = null;
        tokeniser18.commentPending = comment28;
        org.jsoup.parser.Token.Doctype doctype30 = null;
        tokeniser18.doctypePending = doctype30;
        java.lang.StringBuilder stringBuilder32 = tokeniser18.dataBuffer;
        tokeniser6.dataBuffer = stringBuilder32;
        org.jsoup.parser.Token.Tag tag35 = tokeniser6.createTagPending(false);
        tokeniser1.tagPending = tag35;
        boolean boolean37 = tokeniser1.isTrackErrors();
        tokeniser1.emit("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNotNull(stringBuilder32);
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "");
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag9 = tokeniser6.createTagPending(true);
        tokeniser1.emit((org.jsoup.parser.Token) tag9);
        boolean boolean11 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        boolean boolean14 = tokeniser13.currentNodeInHtmlNS();
        tokeniser13.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        tokeniser17.emit('4');
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        boolean boolean22 = tokeniser21.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag24 = tokeniser21.createTagPending(true);
        tokeniser17.tagPending = tag24;
        tokeniser13.emit((org.jsoup.parser.Token) tag24);
        tokeniser1.tagPending = tag24;
        org.jsoup.parser.Token.Tag tag28 = tokeniser1.tagPending;
        tokeniser1.emit(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(tag28);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        boolean boolean10 = tokeniser9.currentNodeInHtmlNS();
        tokeniser9.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState12 = tokeniser9.getState();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        tokeniser14.emit("");
        org.jsoup.parser.Token.Doctype doctype17 = null;
        tokeniser14.doctypePending = doctype17;
        tokeniser14.createTempBuffer();
        tokeniser14.emit("");
        org.jsoup.parser.Token.Comment comment22 = null;
        tokeniser14.commentPending = comment22;
        org.jsoup.parser.Token.Comment comment24 = null;
        tokeniser14.commentPending = comment24;
        org.jsoup.parser.Token.Doctype doctype26 = null;
        tokeniser14.doctypePending = doctype26;
        java.lang.StringBuilder stringBuilder28 = tokeniser14.dataBuffer;
        tokeniser9.dataBuffer = stringBuilder28;
        tokeniser1.dataBuffer = stringBuilder28;
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        boolean boolean33 = tokeniser32.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader34);
        tokeniser35.emit('4');
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader38);
        boolean boolean40 = tokeniser39.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag42 = tokeniser39.createTagPending(true);
        tokeniser35.tagPending = tag42;
        tokeniser32.tagPending = tag42;
        org.jsoup.parser.TokeniserState tokeniserState45 = org.jsoup.parser.TokeniserState.CommentEndDash;
        tokeniser32.transition(tokeniserState45);
        org.jsoup.parser.CharacterReader characterReader47 = null;
        org.jsoup.parser.Tokeniser tokeniser48 = new org.jsoup.parser.Tokeniser(characterReader47);
        boolean boolean49 = tokeniser48.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype50 = tokeniser48.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState51 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser48.transition(tokeniserState51);
        tokeniser32.transition(tokeniserState51);
        org.jsoup.parser.CharacterReader characterReader54 = null;
        org.jsoup.parser.Tokeniser tokeniser55 = new org.jsoup.parser.Tokeniser(characterReader54);
        tokeniser55.emit("");
        org.jsoup.parser.Token.Doctype doctype58 = null;
        tokeniser55.doctypePending = doctype58;
        tokeniser55.createTempBuffer();
        tokeniser55.emit("");
        org.jsoup.parser.Token.Comment comment63 = null;
        tokeniser55.commentPending = comment63;
        org.jsoup.parser.Token.Comment comment65 = null;
        tokeniser55.commentPending = comment65;
        org.jsoup.parser.Token.Doctype doctype67 = null;
        tokeniser55.doctypePending = doctype67;
        tokeniser55.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment70 = null;
        tokeniser55.commentPending = comment70;
        org.jsoup.parser.Token.Doctype doctype72 = tokeniser55.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState73 = tokeniser55.getState();
        java.lang.StringBuilder stringBuilder74 = tokeniser55.dataBuffer;
        tokeniser32.dataBuffer = stringBuilder74;
        tokeniser1.dataBuffer = stringBuilder74;
        org.jsoup.parser.TokeniserState tokeniserState77 = tokeniser1.getState();
        org.jsoup.parser.Token.Tag tag78 = tokeniser1.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState79 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertNotNull(tokeniserState45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(doctype50);
        org.junit.Assert.assertNotNull(tokeniserState51);
        org.junit.Assert.assertNull(doctype72);
        org.junit.Assert.assertNotNull(tokeniserState73);
        org.junit.Assert.assertNotNull(stringBuilder74);
        org.junit.Assert.assertEquals(stringBuilder74.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState77);
        org.junit.Assert.assertNull(tag78);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag9 = tokeniser6.createTagPending(true);
        tokeniser1.emit((org.jsoup.parser.Token) tag9);
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.Token.Tag tag13 = tokeniser1.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState14 = tokeniser1.getState();
        tokeniser1.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        boolean boolean19 = tokeniser18.currentNodeInHtmlNS();
        tokeniser18.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState21 = tokeniser18.getState();
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        tokeniser23.emit("");
        tokeniser23.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState27 = tokeniser23.getState();
        tokeniser23.createDoctypePending();
        java.lang.StringBuilder stringBuilder29 = tokeniser23.dataBuffer;
        tokeniser18.dataBuffer = stringBuilder29;
        org.jsoup.parser.Token.Tag tag31 = tokeniser18.tagPending;
        org.jsoup.parser.Token.Comment comment32 = tokeniser18.commentPending;
        org.jsoup.parser.TokeniserState tokeniserState33 = tokeniser18.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(tokeniserState21);
        org.junit.Assert.assertNotNull(tokeniserState27);
        org.junit.Assert.assertNotNull(stringBuilder29);
        org.junit.Assert.assertEquals(stringBuilder29.toString(), "");
        org.junit.Assert.assertNull(tag31);
        org.junit.Assert.assertNull(comment32);
        org.junit.Assert.assertNotNull(tokeniserState33);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.Token.Tag tag8 = tokeniser1.createTagPending(true);
        boolean boolean9 = tokeniser1.isTrackErrors();
        tokeniser1.emit('#');
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        boolean boolean14 = tokeniser13.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype15 = tokeniser13.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState16 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser13.transition(tokeniserState16);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(doctype15);
        org.junit.Assert.assertNotNull(tokeniserState16);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        tokeniser8.emit("");
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        boolean boolean13 = tokeniser12.currentNodeInHtmlNS();
        tokeniser12.createCommentPending();
        boolean boolean15 = tokeniser12.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag16 = null;
        tokeniser12.tagPending = tag16;
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        boolean boolean20 = tokeniser19.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader21);
        tokeniser22.emit('4');
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader25);
        boolean boolean27 = tokeniser26.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag29 = tokeniser26.createTagPending(true);
        tokeniser22.tagPending = tag29;
        tokeniser19.tagPending = tag29;
        tokeniser12.tagPending = tag29;
        tokeniser8.emit((org.jsoup.parser.Token) tag29);
        tokeniser1.emit((org.jsoup.parser.Token) tag29);
        org.jsoup.parser.TokeniserState tokeniserState35 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader36);
        tokeniser37.emit("");
        tokeniser37.emit("");
        tokeniser37.createTempBuffer();
        org.jsoup.parser.Token.Tag tag44 = tokeniser37.createTagPending(true);
        tokeniser37.emit("hi!");
        org.jsoup.parser.Token.Tag tag48 = tokeniser37.createTagPending(false);
        tokeniser1.tagPending = tag48;
        org.jsoup.parser.TokeniserState tokeniserState50 = org.jsoup.parser.TokeniserState.ScriptDataEscapeStartDash;
        tokeniser1.eofError(tokeniserState50);
        boolean boolean52 = tokeniser1.currentNodeInHtmlNS();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(tokeniserState35);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertNotNull(tokeniserState50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader6);
        boolean boolean8 = tokeniser7.currentNodeInHtmlNS();
        tokeniser7.createCommentPending();
        tokeniser7.emitCommentPending();
        java.lang.StringBuilder stringBuilder11 = null;
        tokeniser7.dataBuffer = stringBuilder11;
        org.jsoup.parser.Token.Comment comment13 = tokeniser7.commentPending;
        tokeniser1.commentPending = comment13;
        tokeniser1.setTrackErrors(false);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        tokeniser19.emit("");
        tokeniser19.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState23 = tokeniser19.getState();
        tokeniser19.createDoctypePending();
        org.jsoup.parser.Token.Tag tag26 = tokeniser19.createTagPending(false);
        tokeniser19.emitTagPending();
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader28);
        boolean boolean30 = tokeniser29.currentNodeInHtmlNS();
        tokeniser29.createCommentPending();
        boolean boolean32 = tokeniser29.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment33 = tokeniser29.commentPending;
        tokeniser19.commentPending = comment33;
        tokeniser1.commentPending = comment33;
        tokeniser1.createTempBuffer();
        tokeniser1.createTempBuffer();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(comment13);
        org.junit.Assert.assertNotNull(tokeniserState23);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(comment33);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.setTrackErrors(true);
        java.lang.StringBuilder stringBuilder6 = tokeniser1.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser1.getState();
        org.jsoup.parser.Token.Tag tag9 = tokeniser1.createTagPending(false);
        org.junit.Assert.assertNull(stringBuilder6);
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser1.getState();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag8 = tokeniser1.createTagPending(false);
        org.jsoup.parser.Token.Tag tag9 = tokeniser1.tagPending;
        org.jsoup.parser.Token.Doctype doctype10 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag12 = tokeniser1.createTagPending(false);
        tokeniser1.emitTagPending();
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(doctype10);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.emit('\ufffd');
        java.lang.StringBuilder stringBuilder7 = tokeniser1.dataBuffer;
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype9 = tokeniser1.doctypePending;
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNull(doctype9);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment7 = tokeniser1.commentPending;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        boolean boolean10 = tokeniser9.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag12 = tokeniser9.createTagPending(true);
        tokeniser1.emit((org.jsoup.parser.Token) tag12);
        tokeniser1.emit("");
        boolean boolean16 = tokeniser1.isTrackErrors();
        boolean boolean17 = tokeniser1.isTrackErrors();
        org.jsoup.parser.Token token18 = tokeniser1.read();
        java.lang.StringBuilder stringBuilder19 = tokeniser1.dataBuffer;
        org.jsoup.parser.Token.Tag tag20 = tokeniser1.tagPending;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(token18);
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertNull(tag20);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader3 = null;
        org.jsoup.parser.Tokeniser tokeniser4 = new org.jsoup.parser.Tokeniser(characterReader3);
        tokeniser4.emit('4');
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        boolean boolean9 = tokeniser8.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag11 = tokeniser8.createTagPending(true);
        tokeniser4.tagPending = tag11;
        tokeniser1.tagPending = tag11;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState15 = tokeniser1.getState();
        org.jsoup.parser.Token.Doctype doctype16 = null;
        tokeniser1.doctypePending = doctype16;
        boolean boolean18 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emit("hi!");
        tokeniser1.setTrackErrors(true);
        java.lang.Class<?> wildcardClass23 = tokeniser1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        org.jsoup.parser.Token.Doctype doctype6 = null;
        tokeniser1.doctypePending = doctype6;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag9 = tokeniser1.tagPending;
        tokeniser1.emit("");
        org.junit.Assert.assertNull(tag9);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser1.getState();
        tokeniser1.createCommentPending();
        tokeniser1.createTempBuffer();
        tokeniser1.createDoctypePending();
        tokeniser1.emit('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser1.getState();
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.createTempBuffer();
        tokeniser1.createDoctypePending();
        org.junit.Assert.assertNotNull(tokeniserState5);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser1.doctypePending = doctype7;
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        boolean boolean12 = tokeniser11.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag14 = tokeniser11.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        boolean boolean17 = tokeniser16.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag19 = tokeniser16.createTagPending(true);
        tokeniser11.emit((org.jsoup.parser.Token) tag19);
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader21);
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        org.jsoup.parser.TokeniserState tokeniserState25 = tokeniser24.getState();
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader26);
        boolean boolean28 = tokeniser27.currentNodeInHtmlNS();
        tokeniser27.createCommentPending();
        boolean boolean30 = tokeniser27.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment31 = tokeniser27.commentPending;
        tokeniser24.commentPending = comment31;
        tokeniser22.commentPending = comment31;
        tokeniser11.commentPending = comment31;
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.Tokeniser tokeniser36 = new org.jsoup.parser.Tokeniser(characterReader35);
        tokeniser36.emit('4');
        org.jsoup.parser.CharacterReader characterReader39 = null;
        org.jsoup.parser.Tokeniser tokeniser40 = new org.jsoup.parser.Tokeniser(characterReader39);
        boolean boolean41 = tokeniser40.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag43 = tokeniser40.createTagPending(true);
        tokeniser36.tagPending = tag43;
        org.jsoup.parser.Token.Tag tag46 = tokeniser36.createTagPending(false);
        tokeniser11.tagPending = tag46;
        tokeniser1.emit((org.jsoup.parser.Token) tag46);
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.Token token51 = tokeniser1.read();
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.CharacterReader characterReader54 = null;
        org.jsoup.parser.Tokeniser tokeniser55 = new org.jsoup.parser.Tokeniser(characterReader54);
        tokeniser55.emit("");
        org.jsoup.parser.Token.Doctype doctype58 = null;
        tokeniser55.doctypePending = doctype58;
        tokeniser55.createTempBuffer();
        tokeniser55.emit("");
        org.jsoup.parser.Token.Comment comment63 = null;
        tokeniser55.commentPending = comment63;
        org.jsoup.parser.Token.Comment comment65 = null;
        tokeniser55.commentPending = comment65;
        org.jsoup.parser.Token.Doctype doctype67 = null;
        tokeniser55.doctypePending = doctype67;
        tokeniser55.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag70 = tokeniser55.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState71 = org.jsoup.parser.TokeniserState.RcdataLessthanSign;
        tokeniser55.transition(tokeniserState71);
        tokeniser1.eofError(tokeniserState71);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(tokeniserState25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(comment31);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNotNull(token51);
        org.junit.Assert.assertNull(tag70);
        org.junit.Assert.assertNotNull(tokeniserState71);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        tokeniser5.emit('4');
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        boolean boolean10 = tokeniser9.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag12 = tokeniser9.createTagPending(true);
        tokeniser5.tagPending = tag12;
        tokeniser1.emit((org.jsoup.parser.Token) tag12);
        org.jsoup.parser.Token.Doctype doctype15 = tokeniser1.doctypePending;
        boolean boolean16 = tokeniser1.isTrackErrors();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        boolean boolean20 = tokeniser19.currentNodeInHtmlNS();
        tokeniser19.createCommentPending();
        boolean boolean22 = tokeniser19.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag23 = null;
        tokeniser19.tagPending = tag23;
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader25);
        boolean boolean27 = tokeniser26.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader28);
        tokeniser29.emit('4');
        org.jsoup.parser.CharacterReader characterReader32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader32);
        boolean boolean34 = tokeniser33.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag36 = tokeniser33.createTagPending(true);
        tokeniser29.tagPending = tag36;
        tokeniser26.tagPending = tag36;
        tokeniser19.tagPending = tag36;
        org.jsoup.parser.CharacterReader characterReader40 = null;
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader40);
        tokeniser41.emit('4');
        tokeniser41.createTempBuffer();
        tokeniser41.setTrackErrors(false);
        org.jsoup.parser.Token.Doctype doctype47 = null;
        tokeniser41.doctypePending = doctype47;
        java.lang.StringBuilder stringBuilder49 = tokeniser41.dataBuffer;
        tokeniser19.dataBuffer = stringBuilder49;
        tokeniser1.dataBuffer = stringBuilder49;
        org.jsoup.parser.Token.Tag tag53 = tokeniser1.createTagPending(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(doctype15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(stringBuilder49);
        org.junit.Assert.assertEquals(stringBuilder49.toString(), "");
        org.junit.Assert.assertNotNull(tag53);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.CharacterReader characterReader2 = null;
        org.jsoup.parser.Tokeniser tokeniser3 = new org.jsoup.parser.Tokeniser(characterReader2);
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser3.getState();
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        tokeniser6.createCommentPending();
        boolean boolean9 = tokeniser6.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment10 = tokeniser6.commentPending;
        tokeniser3.commentPending = comment10;
        tokeniser1.commentPending = comment10;
        org.jsoup.parser.Token.Tag tag14 = tokeniser1.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype15 = tokeniser1.doctypePending;
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        boolean boolean18 = tokeniser17.currentNodeInHtmlNS();
        tokeniser17.createCommentPending();
        tokeniser17.emitCommentPending();
        java.lang.StringBuilder stringBuilder21 = tokeniser17.dataBuffer;
        org.jsoup.parser.Token.Comment comment22 = tokeniser17.commentPending;
        tokeniser1.commentPending = comment22;
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState26 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader27);
        tokeniser28.emit("");
        tokeniser28.emit("");
        tokeniser28.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState34 = tokeniser28.getState();
        boolean boolean35 = tokeniser28.isTrackErrors();
        tokeniser28.emit("hi!");
        org.jsoup.parser.Token.Tag tag39 = tokeniser28.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype40 = tokeniser28.doctypePending;
        java.lang.StringBuilder stringBuilder41 = tokeniser28.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder41;
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(comment10);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNull(doctype15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(stringBuilder21);
        org.junit.Assert.assertNotNull(comment22);
        org.junit.Assert.assertNotNull(tokeniserState26);
        org.junit.Assert.assertNotNull(tokeniserState34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNull(doctype40);
        org.junit.Assert.assertNotNull(stringBuilder41);
        org.junit.Assert.assertEquals(stringBuilder41.toString(), "");
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(true);
        tokeniser1.emit("");
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser1.getState();
        tokeniser1.createCommentPending();
        tokeniser1.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        tokeniser15.emit('4');
        tokeniser15.createTempBuffer();
        tokeniser15.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment21 = tokeniser15.commentPending;
        org.jsoup.parser.Token.Tag tag22 = tokeniser15.tagPending;
        tokeniser15.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader24);
        tokeniser25.emit("");
        tokeniser25.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState29 = tokeniser25.getState();
        tokeniser25.createDoctypePending();
        java.lang.StringBuilder stringBuilder31 = tokeniser25.dataBuffer;
        tokeniser15.dataBuffer = stringBuilder31;
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        boolean boolean35 = tokeniser34.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader36);
        tokeniser37.emit('4');
        org.jsoup.parser.CharacterReader characterReader40 = null;
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader40);
        boolean boolean42 = tokeniser41.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag44 = tokeniser41.createTagPending(true);
        tokeniser37.tagPending = tag44;
        tokeniser34.tagPending = tag44;
        java.lang.StringBuilder stringBuilder47 = tokeniser34.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState48 = org.jsoup.parser.TokeniserState.ScriptDataEndTagName;
        tokeniser34.transition(tokeniserState48);
        org.jsoup.parser.Token.Tag tag50 = tokeniser34.tagPending;
        tokeniser34.createTempBuffer();
        java.lang.StringBuilder stringBuilder52 = tokeniser34.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader53 = null;
        org.jsoup.parser.Tokeniser tokeniser54 = new org.jsoup.parser.Tokeniser(characterReader53);
        tokeniser54.emit('4');
        tokeniser54.createTempBuffer();
        tokeniser54.setTrackErrors(false);
        tokeniser54.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype61 = null;
        tokeniser54.doctypePending = doctype61;
        tokeniser54.emit("");
        tokeniser54.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState66 = tokeniser54.getState();
        org.jsoup.parser.Token.Comment comment67 = tokeniser54.commentPending;
        org.jsoup.parser.Token.Comment comment68 = tokeniser54.commentPending;
        tokeniser34.commentPending = comment68;
        tokeniser15.commentPending = comment68;
        tokeniser1.commentPending = comment68;
        java.lang.Class<?> wildcardClass72 = comment68.getClass();
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNull(comment21);
        org.junit.Assert.assertNull(tag22);
        org.junit.Assert.assertNotNull(tokeniserState29);
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNull(stringBuilder47);
        org.junit.Assert.assertNotNull(tokeniserState48);
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertNotNull(stringBuilder52);
        org.junit.Assert.assertEquals(stringBuilder52.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState66);
        org.junit.Assert.assertNotNull(comment67);
        org.junit.Assert.assertNotNull(comment68);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader6);
        boolean boolean8 = tokeniser7.currentNodeInHtmlNS();
        tokeniser7.createCommentPending();
        tokeniser7.emitCommentPending();
        java.lang.StringBuilder stringBuilder11 = null;
        tokeniser7.dataBuffer = stringBuilder11;
        org.jsoup.parser.Token.Comment comment13 = tokeniser7.commentPending;
        tokeniser1.commentPending = comment13;
        tokeniser1.setTrackErrors(false);
        tokeniser1.createDoctypePending();
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        tokeniser20.emit('4');
        tokeniser20.createTempBuffer();
        tokeniser20.emit('\ufffd');
        java.lang.StringBuilder stringBuilder26 = tokeniser20.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader27);
        boolean boolean29 = tokeniser28.currentNodeInHtmlNS();
        tokeniser28.createCommentPending();
        boolean boolean31 = tokeniser28.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment32 = tokeniser28.commentPending;
        tokeniser20.commentPending = comment32;
        tokeniser1.commentPending = comment32;
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.Tokeniser tokeniser36 = new org.jsoup.parser.Tokeniser(characterReader35);
        tokeniser36.emit("");
        tokeniser36.emit("");
        tokeniser36.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState42 = tokeniser36.getState();
        boolean boolean43 = tokeniser36.currentNodeInHtmlNS();
        java.lang.StringBuilder stringBuilder44 = tokeniser36.dataBuffer;
        java.lang.StringBuilder stringBuilder45 = tokeniser36.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder45;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(comment13);
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(comment32);
        org.junit.Assert.assertNotNull(tokeniserState42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(stringBuilder44);
        org.junit.Assert.assertEquals(stringBuilder44.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder45);
        org.junit.Assert.assertEquals(stringBuilder45.toString(), "");
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.CharacterReader characterReader2 = null;
        org.jsoup.parser.Tokeniser tokeniser3 = new org.jsoup.parser.Tokeniser(characterReader2);
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser3.getState();
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        tokeniser6.createCommentPending();
        boolean boolean9 = tokeniser6.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment10 = tokeniser6.commentPending;
        tokeniser3.commentPending = comment10;
        tokeniser1.commentPending = comment10;
        org.jsoup.parser.Token.Tag tag14 = tokeniser1.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype15 = tokeniser1.doctypePending;
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        boolean boolean18 = tokeniser17.currentNodeInHtmlNS();
        tokeniser17.createCommentPending();
        tokeniser17.emitCommentPending();
        java.lang.StringBuilder stringBuilder21 = tokeniser17.dataBuffer;
        org.jsoup.parser.Token.Comment comment22 = tokeniser17.commentPending;
        tokeniser1.commentPending = comment22;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token24 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(comment10);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNull(doctype15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(stringBuilder21);
        org.junit.Assert.assertNotNull(comment22);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        boolean boolean6 = tokeniser5.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag8 = tokeniser5.createTagPending(true);
        tokeniser1.tagPending = tag8;
        org.jsoup.parser.Token.Tag tag11 = tokeniser1.createTagPending(false);
        boolean boolean12 = tokeniser1.isTrackErrors();
        org.jsoup.parser.Token.Tag tag14 = tokeniser1.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        tokeniser16.emit("");
        tokeniser16.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser16.getState();
        tokeniser16.createDoctypePending();
        org.jsoup.parser.Token.Tag tag23 = tokeniser16.createTagPending(false);
        org.jsoup.parser.Token.Tag tag24 = tokeniser16.tagPending;
        org.jsoup.parser.Token.Doctype doctype25 = tokeniser16.doctypePending;
        tokeniser1.doctypePending = doctype25;
        tokeniser1.emitDoctypePending();
        boolean boolean28 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.acknowledgeSelfClosingFlag();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(doctype25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment7 = tokeniser1.commentPending;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        boolean boolean10 = tokeniser9.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag12 = tokeniser9.createTagPending(true);
        tokeniser1.emit((org.jsoup.parser.Token) tag12);
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        boolean boolean18 = tokeniser17.currentNodeInHtmlNS();
        tokeniser17.createCommentPending();
        boolean boolean20 = tokeniser17.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment21 = tokeniser17.commentPending;
        org.jsoup.parser.Token.Doctype doctype22 = tokeniser17.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState23 = tokeniser17.getState();
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader24);
        tokeniser25.emit("");
        tokeniser25.emit("");
        tokeniser25.createTempBuffer();
        org.jsoup.parser.Token.Tag tag32 = tokeniser25.createTagPending(true);
        tokeniser17.emit((org.jsoup.parser.Token) tag32);
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader34);
        boolean boolean36 = tokeniser35.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype37 = tokeniser35.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState38 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser35.transition(tokeniserState38);
        tokeniser35.createCommentPending();
        tokeniser35.emit("");
        org.jsoup.parser.CharacterReader characterReader43 = null;
        org.jsoup.parser.Tokeniser tokeniser44 = new org.jsoup.parser.Tokeniser(characterReader43);
        boolean boolean45 = tokeniser44.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag47 = tokeniser44.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader48 = null;
        org.jsoup.parser.Tokeniser tokeniser49 = new org.jsoup.parser.Tokeniser(characterReader48);
        boolean boolean50 = tokeniser49.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag52 = tokeniser49.createTagPending(true);
        tokeniser44.emit((org.jsoup.parser.Token) tag52);
        tokeniser44.setTrackErrors(true);
        org.jsoup.parser.Token.Tag tag56 = tokeniser44.tagPending;
        org.jsoup.parser.Token.Tag tag57 = tokeniser44.tagPending;
        org.jsoup.parser.CharacterReader characterReader58 = null;
        org.jsoup.parser.Tokeniser tokeniser59 = new org.jsoup.parser.Tokeniser(characterReader58);
        tokeniser59.emit("");
        org.jsoup.parser.Token.Doctype doctype62 = null;
        tokeniser59.doctypePending = doctype62;
        tokeniser59.createTempBuffer();
        tokeniser59.emit("");
        org.jsoup.parser.TokeniserState tokeniserState67 = tokeniser59.getState();
        tokeniser59.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Doctype doctype69 = null;
        tokeniser59.doctypePending = doctype69;
        java.lang.StringBuilder stringBuilder71 = tokeniser59.dataBuffer;
        java.lang.StringBuilder stringBuilder72 = tokeniser59.dataBuffer;
        tokeniser44.dataBuffer = stringBuilder72;
        tokeniser35.dataBuffer = stringBuilder72;
        tokeniser17.dataBuffer = stringBuilder72;
        org.jsoup.parser.TokeniserState tokeniserState76 = tokeniser17.getState();
        tokeniser1.transition(tokeniserState76);
        org.junit.Assert.assertNull(comment7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(comment21);
        org.junit.Assert.assertNull(doctype22);
        org.junit.Assert.assertNotNull(tokeniserState23);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(doctype37);
        org.junit.Assert.assertNotNull(tokeniserState38);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertNotNull(tokeniserState67);
        org.junit.Assert.assertNotNull(stringBuilder71);
        org.junit.Assert.assertEquals(stringBuilder71.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder72);
        org.junit.Assert.assertEquals(stringBuilder72.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState76);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        boolean boolean4 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState6 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        org.jsoup.parser.Token.Comment comment9 = tokeniser8.commentPending;
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        tokeniser11.emit('4');
        tokeniser11.createTempBuffer();
        tokeniser11.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        tokeniser18.emit("");
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader21);
        boolean boolean23 = tokeniser22.currentNodeInHtmlNS();
        tokeniser22.createCommentPending();
        boolean boolean25 = tokeniser22.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag26 = null;
        tokeniser22.tagPending = tag26;
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader28);
        boolean boolean30 = tokeniser29.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        tokeniser32.emit('4');
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.Tokeniser tokeniser36 = new org.jsoup.parser.Tokeniser(characterReader35);
        boolean boolean37 = tokeniser36.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag39 = tokeniser36.createTagPending(true);
        tokeniser32.tagPending = tag39;
        tokeniser29.tagPending = tag39;
        tokeniser22.tagPending = tag39;
        tokeniser18.emit((org.jsoup.parser.Token) tag39);
        tokeniser11.emit((org.jsoup.parser.Token) tag39);
        org.jsoup.parser.CharacterReader characterReader45 = null;
        org.jsoup.parser.Tokeniser tokeniser46 = new org.jsoup.parser.Tokeniser(characterReader45);
        boolean boolean47 = tokeniser46.currentNodeInHtmlNS();
        tokeniser46.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState49 = tokeniser46.getState();
        org.jsoup.parser.CharacterReader characterReader50 = null;
        org.jsoup.parser.Tokeniser tokeniser51 = new org.jsoup.parser.Tokeniser(characterReader50);
        tokeniser51.emit("");
        tokeniser51.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState55 = tokeniser51.getState();
        tokeniser51.createDoctypePending();
        java.lang.StringBuilder stringBuilder57 = tokeniser51.dataBuffer;
        tokeniser46.dataBuffer = stringBuilder57;
        tokeniser11.dataBuffer = stringBuilder57;
        tokeniser8.dataBuffer = stringBuilder57;
        org.jsoup.parser.CharacterReader characterReader61 = null;
        org.jsoup.parser.Tokeniser tokeniser62 = new org.jsoup.parser.Tokeniser(characterReader61);
        org.jsoup.parser.CharacterReader characterReader63 = null;
        org.jsoup.parser.Tokeniser tokeniser64 = new org.jsoup.parser.Tokeniser(characterReader63);
        org.jsoup.parser.TokeniserState tokeniserState65 = tokeniser64.getState();
        org.jsoup.parser.CharacterReader characterReader66 = null;
        org.jsoup.parser.Tokeniser tokeniser67 = new org.jsoup.parser.Tokeniser(characterReader66);
        boolean boolean68 = tokeniser67.currentNodeInHtmlNS();
        tokeniser67.createCommentPending();
        boolean boolean70 = tokeniser67.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment71 = tokeniser67.commentPending;
        tokeniser64.commentPending = comment71;
        tokeniser62.commentPending = comment71;
        org.jsoup.parser.Token.Tag tag75 = tokeniser62.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype76 = tokeniser62.doctypePending;
        org.jsoup.parser.CharacterReader characterReader77 = null;
        org.jsoup.parser.Tokeniser tokeniser78 = new org.jsoup.parser.Tokeniser(characterReader77);
        boolean boolean79 = tokeniser78.currentNodeInHtmlNS();
        tokeniser78.createCommentPending();
        tokeniser78.emitCommentPending();
        java.lang.StringBuilder stringBuilder82 = tokeniser78.dataBuffer;
        org.jsoup.parser.Token.Comment comment83 = tokeniser78.commentPending;
        tokeniser62.commentPending = comment83;
        tokeniser8.commentPending = comment83;
        tokeniser1.emit((org.jsoup.parser.Token) comment83);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tokeniserState6);
        org.junit.Assert.assertNull(comment9);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(tokeniserState49);
        org.junit.Assert.assertNotNull(tokeniserState55);
        org.junit.Assert.assertNotNull(stringBuilder57);
        org.junit.Assert.assertEquals(stringBuilder57.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(comment71);
        org.junit.Assert.assertNotNull(tag75);
        org.junit.Assert.assertNull(doctype76);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNull(stringBuilder82);
        org.junit.Assert.assertNotNull(comment83);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader6);
        boolean boolean8 = tokeniser7.currentNodeInHtmlNS();
        tokeniser7.createCommentPending();
        tokeniser7.emitCommentPending();
        java.lang.StringBuilder stringBuilder11 = null;
        tokeniser7.dataBuffer = stringBuilder11;
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        tokeniser14.emit("");
        org.jsoup.parser.Token.Doctype doctype17 = null;
        tokeniser14.doctypePending = doctype17;
        tokeniser14.createTempBuffer();
        tokeniser14.emit("");
        org.jsoup.parser.Token.Comment comment22 = null;
        tokeniser14.commentPending = comment22;
        org.jsoup.parser.Token.Tag tag25 = tokeniser14.createTagPending(false);
        tokeniser7.tagPending = tag25;
        org.jsoup.parser.Token.Comment comment27 = tokeniser7.commentPending;
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader28);
        boolean boolean30 = tokeniser29.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype31 = tokeniser29.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState32 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser29.transition(tokeniserState32);
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader34);
        boolean boolean36 = tokeniser35.currentNodeInHtmlNS();
        tokeniser35.createCommentPending();
        tokeniser35.emitCommentPending();
        java.lang.StringBuilder stringBuilder39 = null;
        tokeniser35.dataBuffer = stringBuilder39;
        org.jsoup.parser.Token.Comment comment41 = tokeniser35.commentPending;
        tokeniser29.commentPending = comment41;
        tokeniser29.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader45 = null;
        org.jsoup.parser.Tokeniser tokeniser46 = new org.jsoup.parser.Tokeniser(characterReader45);
        tokeniser46.emit("");
        tokeniser46.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState50 = tokeniser46.getState();
        tokeniser46.createDoctypePending();
        org.jsoup.parser.Token.Tag tag53 = tokeniser46.createTagPending(false);
        org.jsoup.parser.Token.Tag tag54 = tokeniser46.tagPending;
        org.jsoup.parser.Token.Doctype doctype55 = tokeniser46.doctypePending;
        tokeniser29.doctypePending = doctype55;
        tokeniser7.doctypePending = doctype55;
        tokeniser1.doctypePending = doctype55;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(comment27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(doctype31);
        org.junit.Assert.assertNotNull(tokeniserState32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(comment41);
        org.junit.Assert.assertNotNull(tokeniserState50);
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertNotNull(tag54);
        org.junit.Assert.assertNotNull(doctype55);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.CharacterReader characterReader2 = null;
        org.jsoup.parser.Tokeniser tokeniser3 = new org.jsoup.parser.Tokeniser(characterReader2);
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser3.getState();
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        tokeniser6.createCommentPending();
        boolean boolean9 = tokeniser6.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment10 = tokeniser6.commentPending;
        tokeniser3.commentPending = comment10;
        tokeniser1.commentPending = comment10;
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        boolean boolean15 = tokeniser14.currentNodeInHtmlNS();
        tokeniser14.emit('4');
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        boolean boolean20 = tokeniser19.currentNodeInHtmlNS();
        tokeniser19.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        tokeniser23.emit('4');
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader26);
        boolean boolean28 = tokeniser27.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag30 = tokeniser27.createTagPending(true);
        tokeniser23.tagPending = tag30;
        tokeniser19.emit((org.jsoup.parser.Token) tag30);
        tokeniser14.emit((org.jsoup.parser.Token) tag30);
        tokeniser1.tagPending = tag30;
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.Tokeniser tokeniser36 = new org.jsoup.parser.Tokeniser(characterReader35);
        tokeniser36.emit("");
        org.jsoup.parser.Token.Doctype doctype39 = null;
        tokeniser36.doctypePending = doctype39;
        tokeniser36.createTempBuffer();
        tokeniser36.emit("");
        org.jsoup.parser.Token.Comment comment44 = null;
        tokeniser36.commentPending = comment44;
        org.jsoup.parser.Token.Comment comment46 = null;
        tokeniser36.commentPending = comment46;
        org.jsoup.parser.Token.Doctype doctype48 = null;
        tokeniser36.doctypePending = doctype48;
        java.lang.StringBuilder stringBuilder50 = tokeniser36.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder50;
        org.jsoup.parser.CharacterReader characterReader52 = null;
        org.jsoup.parser.Tokeniser tokeniser53 = new org.jsoup.parser.Tokeniser(characterReader52);
        boolean boolean54 = tokeniser53.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag56 = tokeniser53.createTagPending(true);
        tokeniser1.tagPending = tag56;
        org.jsoup.parser.TokeniserState tokeniserState58 = tokeniser1.getState();
        org.jsoup.parser.TokeniserState tokeniserState59 = tokeniser1.getState();
        org.jsoup.parser.Token.Comment comment60 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Tag tag61 = tokeniser1.tagPending;
        tokeniser1.createCommentPending();
        tokeniser1.emit("");
        tokeniser1.emitCommentPending();
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(comment10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(stringBuilder50);
        org.junit.Assert.assertEquals(stringBuilder50.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertNotNull(tokeniserState58);
        org.junit.Assert.assertNotNull(tokeniserState59);
        org.junit.Assert.assertNotNull(comment60);
        org.junit.Assert.assertNotNull(tag61);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.setTrackErrors(true);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        tokeniser9.emit('4');
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        boolean boolean14 = tokeniser13.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag16 = tokeniser13.createTagPending(true);
        tokeniser9.tagPending = tag16;
        tokeniser6.tagPending = tag16;
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.CommentEndDash;
        tokeniser6.transition(tokeniserState19);
        tokeniser1.transition(tokeniserState19);
        org.jsoup.parser.Token.Doctype doctype22 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Doctype doctype23 = tokeniser1.doctypePending;
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader24);
        boolean boolean26 = tokeniser25.currentNodeInHtmlNS();
        tokeniser25.createCommentPending();
        tokeniser25.emitCommentPending();
        java.lang.StringBuilder stringBuilder29 = null;
        tokeniser25.dataBuffer = stringBuilder29;
        org.jsoup.parser.Token.Comment comment31 = tokeniser25.commentPending;
        tokeniser1.commentPending = comment31;
        tokeniser1.createCommentPending();
        tokeniser1.emit("");
        tokeniser1.createCommentPending();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char39 = tokeniser1.consumeCharacterReference((java.lang.Character) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNull(doctype22);
        org.junit.Assert.assertNull(doctype23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(comment31);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser1.getState();
        boolean boolean8 = tokeniser1.isTrackErrors();
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        boolean boolean11 = tokeniser10.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser10.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState13 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser10.transition(tokeniserState13);
        org.jsoup.parser.Token.Comment comment15 = tokeniser10.commentPending;
        tokeniser10.createDoctypePending();
        boolean boolean17 = tokeniser10.isTrackErrors();
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        tokeniser19.emit("");
        tokeniser19.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState23 = tokeniser19.getState();
        java.lang.StringBuilder stringBuilder24 = null;
        tokeniser19.dataBuffer = stringBuilder24;
        tokeniser19.setTrackErrors(true);
        boolean boolean28 = tokeniser19.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag30 = tokeniser19.createTagPending(false);
        tokeniser10.emit((org.jsoup.parser.Token) tag30);
        tokeniser1.tagPending = tag30;
        org.jsoup.parser.Token.Doctype doctype33 = tokeniser1.doctypePending;
        boolean boolean34 = tokeniser1.isTrackErrors();
        tokeniser1.emitTagPending();
        org.jsoup.parser.Token.Doctype doctype36 = tokeniser1.doctypePending;
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Tag tag40 = tokeniser1.createTagPending(false);
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(doctype12);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNull(comment15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(tokeniserState23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNull(doctype33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(doctype36);
        org.junit.Assert.assertNotNull(tag40);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Doctype doctype7 = tokeniser1.doctypePending;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        tokeniser9.emit("");
        org.jsoup.parser.Token.Doctype doctype12 = null;
        tokeniser9.doctypePending = doctype12;
        org.jsoup.parser.Token.Doctype doctype14 = null;
        tokeniser9.doctypePending = doctype14;
        tokeniser9.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        boolean boolean19 = tokeniser18.currentNodeInHtmlNS();
        tokeniser18.emit('4');
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        boolean boolean24 = tokeniser23.currentNodeInHtmlNS();
        tokeniser23.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader26);
        tokeniser27.emit('4');
        org.jsoup.parser.CharacterReader characterReader30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader30);
        boolean boolean32 = tokeniser31.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag34 = tokeniser31.createTagPending(true);
        tokeniser27.tagPending = tag34;
        tokeniser23.emit((org.jsoup.parser.Token) tag34);
        tokeniser18.emit((org.jsoup.parser.Token) tag34);
        tokeniser9.tagPending = tag34;
        tokeniser1.tagPending = tag34;
        java.lang.StringBuilder stringBuilder40 = tokeniser1.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader41 = null;
        org.jsoup.parser.Tokeniser tokeniser42 = new org.jsoup.parser.Tokeniser(characterReader41);
        tokeniser42.emit('4');
        tokeniser42.createTempBuffer();
        tokeniser42.setTrackErrors(false);
        org.jsoup.parser.Token.Doctype doctype48 = null;
        tokeniser42.doctypePending = doctype48;
        tokeniser42.createCommentPending();
        org.jsoup.parser.Token.Tag tag52 = tokeniser42.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader53 = null;
        org.jsoup.parser.Tokeniser tokeniser54 = new org.jsoup.parser.Tokeniser(characterReader53);
        tokeniser54.emit('4');
        org.jsoup.parser.CharacterReader characterReader57 = null;
        org.jsoup.parser.Tokeniser tokeniser58 = new org.jsoup.parser.Tokeniser(characterReader57);
        boolean boolean59 = tokeniser58.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag61 = tokeniser58.createTagPending(true);
        tokeniser54.tagPending = tag61;
        org.jsoup.parser.Token.Tag tag64 = tokeniser54.createTagPending(false);
        org.jsoup.parser.Token.Tag tag66 = tokeniser54.createTagPending(true);
        org.jsoup.parser.TokeniserState tokeniserState67 = org.jsoup.parser.TokeniserState.AfterDoctypePublicKeyword;
        tokeniser54.transition(tokeniserState67);
        org.jsoup.parser.CharacterReader characterReader69 = null;
        org.jsoup.parser.Tokeniser tokeniser70 = new org.jsoup.parser.Tokeniser(characterReader69);
        boolean boolean71 = tokeniser70.currentNodeInHtmlNS();
        tokeniser70.createCommentPending();
        boolean boolean73 = tokeniser70.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment74 = tokeniser70.commentPending;
        tokeniser54.emit((org.jsoup.parser.Token) comment74);
        tokeniser42.commentPending = comment74;
        tokeniser1.commentPending = comment74;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNull(doctype7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNull(stringBuilder40);
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertNotNull(tag64);
        org.junit.Assert.assertNotNull(tag66);
        org.junit.Assert.assertNotNull(tokeniserState67);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(comment74);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader3 = null;
        org.jsoup.parser.Tokeniser tokeniser4 = new org.jsoup.parser.Tokeniser(characterReader3);
        tokeniser4.emit('4');
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        boolean boolean9 = tokeniser8.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag11 = tokeniser8.createTagPending(true);
        tokeniser4.tagPending = tag11;
        tokeniser1.tagPending = tag11;
        java.lang.StringBuilder stringBuilder14 = tokeniser1.dataBuffer;
        org.jsoup.parser.Token.Tag tag15 = tokeniser1.tagPending;
        tokeniser1.emit(' ');
        org.jsoup.parser.Token.Comment comment18 = tokeniser1.commentPending;
        org.jsoup.parser.TokeniserState tokeniserState19 = tokeniser1.getState();
        tokeniser1.setTrackErrors(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNull(stringBuilder14);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNull(comment18);
        org.junit.Assert.assertNotNull(tokeniserState19);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        boolean boolean6 = tokeniser5.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag8 = tokeniser5.createTagPending(true);
        tokeniser1.tagPending = tag8;
        org.jsoup.parser.Token.Tag tag11 = tokeniser1.createTagPending(false);
        org.jsoup.parser.Token.Tag tag13 = tokeniser1.createTagPending(true);
        org.jsoup.parser.TokeniserState tokeniserState14 = org.jsoup.parser.TokeniserState.AfterDoctypePublicKeyword;
        tokeniser1.transition(tokeniserState14);
        org.jsoup.parser.TokeniserState tokeniserState16 = tokeniser1.getState();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertNotNull(tokeniserState16);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag9 = tokeniser6.createTagPending(true);
        tokeniser1.emit((org.jsoup.parser.Token) tag9);
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.Token.Tag tag13 = tokeniser1.tagPending;
        org.jsoup.parser.Token.Tag tag14 = tokeniser1.tagPending;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.createTempBuffer();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        tokeniser1.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState8 = org.jsoup.parser.TokeniserState.TagOpen;
        tokeniser1.eofError(tokeniserState8);
        org.jsoup.parser.Token.Doctype doctype10 = tokeniser1.doctypePending;
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        boolean boolean13 = tokeniser12.currentNodeInHtmlNS();
        tokeniser12.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        tokeniser16.emit('4');
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        boolean boolean21 = tokeniser20.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag23 = tokeniser20.createTagPending(true);
        tokeniser16.tagPending = tag23;
        tokeniser12.emit((org.jsoup.parser.Token) tag23);
        org.jsoup.parser.Token.Doctype doctype26 = tokeniser12.doctypePending;
        boolean boolean27 = tokeniser12.isTrackErrors();
        java.lang.StringBuilder stringBuilder28 = tokeniser12.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader29);
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        org.jsoup.parser.TokeniserState tokeniserState33 = tokeniser32.getState();
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader34);
        boolean boolean36 = tokeniser35.currentNodeInHtmlNS();
        tokeniser35.createCommentPending();
        boolean boolean38 = tokeniser35.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment39 = tokeniser35.commentPending;
        tokeniser32.commentPending = comment39;
        tokeniser30.commentPending = comment39;
        org.jsoup.parser.CharacterReader characterReader42 = null;
        org.jsoup.parser.Tokeniser tokeniser43 = new org.jsoup.parser.Tokeniser(characterReader42);
        boolean boolean44 = tokeniser43.currentNodeInHtmlNS();
        tokeniser43.emit('4');
        org.jsoup.parser.CharacterReader characterReader47 = null;
        org.jsoup.parser.Tokeniser tokeniser48 = new org.jsoup.parser.Tokeniser(characterReader47);
        boolean boolean49 = tokeniser48.currentNodeInHtmlNS();
        tokeniser48.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader51 = null;
        org.jsoup.parser.Tokeniser tokeniser52 = new org.jsoup.parser.Tokeniser(characterReader51);
        tokeniser52.emit('4');
        org.jsoup.parser.CharacterReader characterReader55 = null;
        org.jsoup.parser.Tokeniser tokeniser56 = new org.jsoup.parser.Tokeniser(characterReader55);
        boolean boolean57 = tokeniser56.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag59 = tokeniser56.createTagPending(true);
        tokeniser52.tagPending = tag59;
        tokeniser48.emit((org.jsoup.parser.Token) tag59);
        tokeniser43.emit((org.jsoup.parser.Token) tag59);
        tokeniser30.tagPending = tag59;
        org.jsoup.parser.CharacterReader characterReader64 = null;
        org.jsoup.parser.Tokeniser tokeniser65 = new org.jsoup.parser.Tokeniser(characterReader64);
        tokeniser65.emit("");
        org.jsoup.parser.Token.Doctype doctype68 = null;
        tokeniser65.doctypePending = doctype68;
        tokeniser65.createTempBuffer();
        tokeniser65.emit("");
        org.jsoup.parser.Token.Comment comment73 = null;
        tokeniser65.commentPending = comment73;
        org.jsoup.parser.Token.Comment comment75 = null;
        tokeniser65.commentPending = comment75;
        org.jsoup.parser.Token.Doctype doctype77 = null;
        tokeniser65.doctypePending = doctype77;
        java.lang.StringBuilder stringBuilder79 = tokeniser65.dataBuffer;
        tokeniser30.dataBuffer = stringBuilder79;
        tokeniser12.dataBuffer = stringBuilder79;
        org.jsoup.parser.CharacterReader characterReader82 = null;
        org.jsoup.parser.Tokeniser tokeniser83 = new org.jsoup.parser.Tokeniser(characterReader82);
        boolean boolean84 = tokeniser83.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype85 = tokeniser83.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState86 = tokeniser83.getState();
        tokeniser12.transition(tokeniserState86);
        org.jsoup.parser.Token.Tag tag88 = tokeniser12.tagPending;
        org.jsoup.parser.Token.Tag tag90 = tokeniser12.createTagPending(false);
        tokeniser1.tagPending = tag90;
        tokeniser1.emit("");
        java.lang.Class<?> wildcardClass94 = tokeniser1.getClass();
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNull(doctype10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNull(doctype26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(stringBuilder28);
        org.junit.Assert.assertNotNull(tokeniserState33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(comment39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(tag59);
        org.junit.Assert.assertNotNull(stringBuilder79);
        org.junit.Assert.assertEquals(stringBuilder79.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNull(doctype85);
        org.junit.Assert.assertNotNull(tokeniserState86);
        org.junit.Assert.assertNull(tag88);
        org.junit.Assert.assertNotNull(tag90);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser1.getState();
        boolean boolean8 = tokeniser1.currentNodeInHtmlNS();
        java.lang.StringBuilder stringBuilder9 = tokeniser1.dataBuffer;
        tokeniser1.emit("");
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        org.jsoup.parser.Token.Comment comment6 = null;
        tokeniser1.commentPending = comment6;
        org.jsoup.parser.Token.Tag tag8 = tokeniser1.tagPending;
        org.jsoup.parser.Token.Doctype doctype9 = null;
        tokeniser1.doctypePending = doctype9;
        org.jsoup.parser.Token.Tag tag12 = tokeniser1.createTagPending(false);
        tokeniser1.createTempBuffer();
        org.junit.Assert.assertNull(tag8);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.emit('\ufffd');
        java.lang.StringBuilder stringBuilder7 = tokeniser1.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        boolean boolean10 = tokeniser9.currentNodeInHtmlNS();
        tokeniser9.createCommentPending();
        boolean boolean12 = tokeniser9.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment13 = tokeniser9.commentPending;
        tokeniser1.commentPending = comment13;
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        boolean boolean17 = tokeniser16.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag19 = tokeniser16.createTagPending(true);
        org.jsoup.parser.Token.Comment comment20 = null;
        tokeniser16.commentPending = comment20;
        tokeniser16.setTrackErrors(true);
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader24);
        tokeniser25.emit('4');
        tokeniser25.createTempBuffer();
        tokeniser25.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment31 = tokeniser25.commentPending;
        org.jsoup.parser.Token.Tag tag32 = tokeniser25.tagPending;
        tokeniser25.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader34);
        boolean boolean36 = tokeniser35.currentNodeInHtmlNS();
        tokeniser35.createCommentPending();
        tokeniser35.emitCommentPending();
        java.lang.StringBuilder stringBuilder39 = null;
        tokeniser35.dataBuffer = stringBuilder39;
        org.jsoup.parser.CharacterReader characterReader41 = null;
        org.jsoup.parser.Tokeniser tokeniser42 = new org.jsoup.parser.Tokeniser(characterReader41);
        tokeniser42.emit("");
        org.jsoup.parser.Token.Doctype doctype45 = null;
        tokeniser42.doctypePending = doctype45;
        tokeniser42.createTempBuffer();
        tokeniser42.emit("");
        org.jsoup.parser.Token.Comment comment50 = null;
        tokeniser42.commentPending = comment50;
        org.jsoup.parser.Token.Tag tag53 = tokeniser42.createTagPending(false);
        tokeniser35.tagPending = tag53;
        org.jsoup.parser.CharacterReader characterReader55 = null;
        org.jsoup.parser.Tokeniser tokeniser56 = new org.jsoup.parser.Tokeniser(characterReader55);
        tokeniser56.emit("");
        tokeniser56.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState60 = tokeniser56.getState();
        tokeniser56.createDoctypePending();
        org.jsoup.parser.Token.Tag tag63 = tokeniser56.createTagPending(false);
        org.jsoup.parser.Token.Tag tag64 = tokeniser56.tagPending;
        org.jsoup.parser.Token.Doctype doctype65 = tokeniser56.doctypePending;
        tokeniser35.doctypePending = doctype65;
        tokeniser25.doctypePending = doctype65;
        tokeniser16.doctypePending = doctype65;
        tokeniser1.doctypePending = doctype65;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char72 = tokeniser1.consumeCharacterReference((java.lang.Character) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(comment13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNull(comment31);
        org.junit.Assert.assertNull(tag32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertNotNull(tokeniserState60);
        org.junit.Assert.assertNotNull(tag63);
        org.junit.Assert.assertNotNull(tag64);
        org.junit.Assert.assertNotNull(doctype65);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.Token.Doctype doctype7 = tokeniser1.doctypePending;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        tokeniser9.emit('4');
        tokeniser9.createTempBuffer();
        tokeniser9.setTrackErrors(false);
        tokeniser9.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState16 = org.jsoup.parser.TokeniserState.TagOpen;
        tokeniser9.eofError(tokeniserState16);
        tokeniser9.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        boolean boolean22 = tokeniser21.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        tokeniser24.emit('4');
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader27);
        boolean boolean29 = tokeniser28.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag31 = tokeniser28.createTagPending(true);
        tokeniser24.tagPending = tag31;
        tokeniser21.tagPending = tag31;
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader34);
        tokeniser35.emit('4');
        tokeniser35.createTempBuffer();
        tokeniser35.emit('\ufffd');
        java.lang.StringBuilder stringBuilder41 = tokeniser35.dataBuffer;
        tokeniser21.dataBuffer = stringBuilder41;
        tokeniser9.dataBuffer = stringBuilder41;
        org.jsoup.parser.CharacterReader characterReader44 = null;
        org.jsoup.parser.Tokeniser tokeniser45 = new org.jsoup.parser.Tokeniser(characterReader44);
        boolean boolean46 = tokeniser45.currentNodeInHtmlNS();
        tokeniser45.createCommentPending();
        boolean boolean48 = tokeniser45.currentNodeInHtmlNS();
        tokeniser45.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader50 = null;
        org.jsoup.parser.Tokeniser tokeniser51 = new org.jsoup.parser.Tokeniser(characterReader50);
        boolean boolean52 = tokeniser51.currentNodeInHtmlNS();
        tokeniser51.createCommentPending();
        tokeniser51.emitCommentPending();
        java.lang.StringBuilder stringBuilder55 = null;
        tokeniser51.dataBuffer = stringBuilder55;
        org.jsoup.parser.CharacterReader characterReader57 = null;
        org.jsoup.parser.Tokeniser tokeniser58 = new org.jsoup.parser.Tokeniser(characterReader57);
        tokeniser58.emit("");
        org.jsoup.parser.Token.Doctype doctype61 = null;
        tokeniser58.doctypePending = doctype61;
        tokeniser58.createTempBuffer();
        tokeniser58.emit("");
        org.jsoup.parser.Token.Comment comment66 = null;
        tokeniser58.commentPending = comment66;
        org.jsoup.parser.Token.Tag tag69 = tokeniser58.createTagPending(false);
        tokeniser51.tagPending = tag69;
        org.jsoup.parser.CharacterReader characterReader71 = null;
        org.jsoup.parser.Tokeniser tokeniser72 = new org.jsoup.parser.Tokeniser(characterReader71);
        tokeniser72.emit("");
        tokeniser72.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState76 = tokeniser72.getState();
        tokeniser72.createDoctypePending();
        org.jsoup.parser.Token.Tag tag79 = tokeniser72.createTagPending(false);
        org.jsoup.parser.Token.Tag tag80 = tokeniser72.tagPending;
        org.jsoup.parser.Token.Doctype doctype81 = tokeniser72.doctypePending;
        tokeniser51.doctypePending = doctype81;
        tokeniser45.doctypePending = doctype81;
        tokeniser9.doctypePending = doctype81;
        tokeniser1.emit((org.jsoup.parser.Token) doctype81);
        boolean boolean86 = tokeniser1.isTrackErrors();
        org.jsoup.parser.Token token87 = tokeniser1.read();
        org.junit.Assert.assertNull(doctype7);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(stringBuilder41);
        org.junit.Assert.assertEquals(stringBuilder41.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(tag69);
        org.junit.Assert.assertNotNull(tokeniserState76);
        org.junit.Assert.assertNotNull(tag79);
        org.junit.Assert.assertNotNull(tag80);
        org.junit.Assert.assertNotNull(doctype81);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(token87);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        org.jsoup.parser.Token.Tag tag6 = tokeniser1.tagPending;
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser1.doctypePending = doctype7;
        tokeniser1.createTempBuffer();
        org.junit.Assert.assertNull(tag6);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag9 = tokeniser6.createTagPending(true);
        tokeniser1.emit((org.jsoup.parser.Token) tag9);
        boolean boolean11 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        org.jsoup.parser.Token.Comment comment14 = tokeniser13.commentPending;
        org.jsoup.parser.TokeniserState tokeniserState15 = tokeniser13.getState();
        tokeniser1.transition(tokeniserState15);
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        tokeniser18.emit('4');
        tokeniser18.createTempBuffer();
        tokeniser18.setTrackErrors(false);
        tokeniser18.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState25 = org.jsoup.parser.TokeniserState.TagOpen;
        tokeniser18.eofError(tokeniserState25);
        tokeniser18.setTrackErrors(false);
        tokeniser18.emit(' ');
        tokeniser18.createTempBuffer();
        tokeniser18.emit('\ufffd');
        org.jsoup.parser.TokeniserState tokeniserState34 = tokeniser18.getState();
        tokeniser1.transition(tokeniserState34);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(comment14);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertNotNull(tokeniserState25);
        org.junit.Assert.assertNotNull(tokeniserState34);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        org.jsoup.parser.Token.Comment comment6 = null;
        tokeniser1.commentPending = comment6;
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.Token.Doctype doctype10 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser1.doctypePending;
        org.junit.Assert.assertNull(doctype10);
        org.junit.Assert.assertNull(doctype11);
        org.junit.Assert.assertNull(doctype12);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        tokeniser1.createCommentPending();
        tokeniser1.emit("");
        org.jsoup.parser.Token.Tag tag9 = tokeniser1.tagPending;
        org.jsoup.parser.Token.Tag tag11 = tokeniser1.createTagPending(false);
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.emitTagPending();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNull(tag9);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        org.jsoup.parser.Token.Comment comment9 = null;
        tokeniser1.commentPending = comment9;
        org.jsoup.parser.Token.Comment comment11 = null;
        tokeniser1.commentPending = comment11;
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        org.jsoup.parser.TokeniserState tokeniserState17 = tokeniser16.getState();
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        boolean boolean20 = tokeniser19.currentNodeInHtmlNS();
        tokeniser19.createCommentPending();
        boolean boolean22 = tokeniser19.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment23 = tokeniser19.commentPending;
        tokeniser16.commentPending = comment23;
        tokeniser14.commentPending = comment23;
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader26);
        boolean boolean28 = tokeniser27.currentNodeInHtmlNS();
        tokeniser27.emit('4');
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        boolean boolean33 = tokeniser32.currentNodeInHtmlNS();
        tokeniser32.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.Tokeniser tokeniser36 = new org.jsoup.parser.Tokeniser(characterReader35);
        tokeniser36.emit('4');
        org.jsoup.parser.CharacterReader characterReader39 = null;
        org.jsoup.parser.Tokeniser tokeniser40 = new org.jsoup.parser.Tokeniser(characterReader39);
        boolean boolean41 = tokeniser40.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag43 = tokeniser40.createTagPending(true);
        tokeniser36.tagPending = tag43;
        tokeniser32.emit((org.jsoup.parser.Token) tag43);
        tokeniser27.emit((org.jsoup.parser.Token) tag43);
        tokeniser14.tagPending = tag43;
        org.jsoup.parser.CharacterReader characterReader48 = null;
        org.jsoup.parser.Tokeniser tokeniser49 = new org.jsoup.parser.Tokeniser(characterReader48);
        tokeniser49.emit("");
        org.jsoup.parser.Token.Doctype doctype52 = null;
        tokeniser49.doctypePending = doctype52;
        tokeniser49.createTempBuffer();
        tokeniser49.emit("");
        org.jsoup.parser.Token.Comment comment57 = null;
        tokeniser49.commentPending = comment57;
        org.jsoup.parser.Token.Comment comment59 = null;
        tokeniser49.commentPending = comment59;
        org.jsoup.parser.Token.Doctype doctype61 = null;
        tokeniser49.doctypePending = doctype61;
        java.lang.StringBuilder stringBuilder63 = tokeniser49.dataBuffer;
        tokeniser14.dataBuffer = stringBuilder63;
        org.jsoup.parser.CharacterReader characterReader65 = null;
        org.jsoup.parser.Tokeniser tokeniser66 = new org.jsoup.parser.Tokeniser(characterReader65);
        boolean boolean67 = tokeniser66.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag69 = tokeniser66.createTagPending(true);
        tokeniser14.tagPending = tag69;
        org.jsoup.parser.TokeniserState tokeniserState71 = tokeniser14.getState();
        tokeniser1.transition(tokeniserState71);
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.Token.Doctype doctype75 = null;
        tokeniser1.doctypePending = doctype75;
        boolean boolean77 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState78 = tokeniser1.getState();
        tokeniser1.createTempBuffer();
        tokeniser1.createCommentPending();
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(comment23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertNotNull(stringBuilder63);
        org.junit.Assert.assertEquals(stringBuilder63.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(tag69);
        org.junit.Assert.assertNotNull(tokeniserState71);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(tokeniserState78);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        org.jsoup.parser.Token.Doctype doctype6 = null;
        tokeniser1.doctypePending = doctype6;
        java.lang.StringBuilder stringBuilder8 = tokeniser1.dataBuffer;
        boolean boolean9 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token11 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stringBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment7 = tokeniser1.commentPending;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        boolean boolean10 = tokeniser9.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag12 = tokeniser9.createTagPending(true);
        tokeniser1.emit((org.jsoup.parser.Token) tag12);
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token token15 = tokeniser1.read();
        tokeniser1.setTrackErrors(true);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype19 = null;
        tokeniser1.doctypePending = doctype19;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(token15);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        tokeniser1.createCommentPending();
        tokeniser1.emit('a');
        tokeniser1.acknowledgeSelfClosingFlag();
        java.lang.Class<?> wildcardClass11 = tokeniser1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        tokeniser9.emit('4');
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        boolean boolean14 = tokeniser13.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag16 = tokeniser13.createTagPending(true);
        tokeniser9.tagPending = tag16;
        tokeniser6.tagPending = tag16;
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.CommentEndDash;
        tokeniser6.transition(tokeniserState19);
        tokeniser1.transition(tokeniserState19);
        org.jsoup.parser.Token.Tag tag23 = tokeniser1.createTagPending(false);
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag26 = tokeniser1.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader27);
        boolean boolean29 = tokeniser28.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype30 = tokeniser28.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState31 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser28.transition(tokeniserState31);
        org.jsoup.parser.TokeniserState tokeniserState33 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_singleQuoted;
        tokeniser28.transition(tokeniserState33);
        org.jsoup.parser.Token.Doctype doctype35 = null;
        tokeniser28.doctypePending = doctype35;
        org.jsoup.parser.CharacterReader characterReader37 = null;
        org.jsoup.parser.Tokeniser tokeniser38 = new org.jsoup.parser.Tokeniser(characterReader37);
        tokeniser38.emit("");
        org.jsoup.parser.Token.Doctype doctype41 = null;
        tokeniser38.doctypePending = doctype41;
        tokeniser38.createTempBuffer();
        tokeniser38.emit("");
        org.jsoup.parser.Token.Comment comment46 = null;
        tokeniser38.commentPending = comment46;
        org.jsoup.parser.Token.Comment comment48 = null;
        tokeniser38.commentPending = comment48;
        org.jsoup.parser.Token.Doctype doctype50 = null;
        tokeniser38.doctypePending = doctype50;
        tokeniser38.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag53 = tokeniser38.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState54 = org.jsoup.parser.TokeniserState.RcdataLessthanSign;
        tokeniser38.transition(tokeniserState54);
        tokeniser28.transition(tokeniserState54);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(doctype30);
        org.junit.Assert.assertNotNull(tokeniserState31);
        org.junit.Assert.assertNotNull(tokeniserState33);
        org.junit.Assert.assertNull(tag53);
        org.junit.Assert.assertNotNull(tokeniserState54);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.TokeniserState tokeniserState7 = org.jsoup.parser.TokeniserState.BogusDoctype;
        tokeniser1.eofError(tokeniserState7);
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        boolean boolean11 = tokeniser10.currentNodeInHtmlNS();
        tokeniser10.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        tokeniser14.emit('4');
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        boolean boolean19 = tokeniser18.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag21 = tokeniser18.createTagPending(true);
        tokeniser14.tagPending = tag21;
        tokeniser10.emit((org.jsoup.parser.Token) tag21);
        org.jsoup.parser.TokeniserState tokeniserState24 = tokeniser10.getState();
        tokeniser1.transition(tokeniserState24);
        boolean boolean26 = tokeniser1.isTrackErrors();
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader27);
        tokeniser28.emit("");
        tokeniser28.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState32 = tokeniser28.getState();
        java.lang.StringBuilder stringBuilder33 = null;
        tokeniser28.dataBuffer = stringBuilder33;
        tokeniser28.setTrackErrors(true);
        boolean boolean37 = tokeniser28.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader38);
        boolean boolean40 = tokeniser39.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype41 = tokeniser39.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState42 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser39.transition(tokeniserState42);
        org.jsoup.parser.Token.Comment comment44 = tokeniser39.commentPending;
        tokeniser39.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader46 = null;
        org.jsoup.parser.Tokeniser tokeniser47 = new org.jsoup.parser.Tokeniser(characterReader46);
        boolean boolean48 = tokeniser47.currentNodeInHtmlNS();
        tokeniser47.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState50 = tokeniser47.getState();
        org.jsoup.parser.CharacterReader characterReader51 = null;
        org.jsoup.parser.Tokeniser tokeniser52 = new org.jsoup.parser.Tokeniser(characterReader51);
        tokeniser52.emit("");
        org.jsoup.parser.Token.Doctype doctype55 = null;
        tokeniser52.doctypePending = doctype55;
        tokeniser52.createTempBuffer();
        tokeniser52.emit("");
        org.jsoup.parser.Token.Comment comment60 = null;
        tokeniser52.commentPending = comment60;
        org.jsoup.parser.Token.Comment comment62 = null;
        tokeniser52.commentPending = comment62;
        org.jsoup.parser.Token.Doctype doctype64 = null;
        tokeniser52.doctypePending = doctype64;
        java.lang.StringBuilder stringBuilder66 = tokeniser52.dataBuffer;
        tokeniser47.dataBuffer = stringBuilder66;
        tokeniser39.dataBuffer = stringBuilder66;
        tokeniser28.dataBuffer = stringBuilder66;
        java.lang.StringBuilder stringBuilder70 = tokeniser28.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder70;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean72 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(tokeniserState24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(tokeniserState32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(doctype41);
        org.junit.Assert.assertNotNull(tokeniserState42);
        org.junit.Assert.assertNull(comment44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(tokeniserState50);
        org.junit.Assert.assertNotNull(stringBuilder66);
        org.junit.Assert.assertEquals(stringBuilder66.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder70);
        org.junit.Assert.assertEquals(stringBuilder70.toString(), "");
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        boolean boolean4 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        tokeniser6.emit("");
        org.jsoup.parser.Token.Doctype doctype9 = null;
        tokeniser6.doctypePending = doctype9;
        tokeniser6.createTempBuffer();
        tokeniser6.emit("");
        org.jsoup.parser.Token.Comment comment14 = null;
        tokeniser6.commentPending = comment14;
        org.jsoup.parser.Token.Tag tag17 = tokeniser6.createTagPending(true);
        tokeniser1.emit((org.jsoup.parser.Token) tag17);
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        tokeniser20.emit("");
        org.jsoup.parser.Token.Doctype doctype23 = null;
        tokeniser20.doctypePending = doctype23;
        tokeniser20.createTempBuffer();
        tokeniser20.emit("");
        org.jsoup.parser.TokeniserState tokeniserState28 = tokeniser20.getState();
        tokeniser20.acknowledgeSelfClosingFlag();
        tokeniser20.createCommentPending();
        tokeniser20.emitCommentPending();
        org.jsoup.parser.CharacterReader characterReader32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader32);
        tokeniser33.emit('4');
        tokeniser33.createTempBuffer();
        tokeniser33.setTrackErrors(false);
        tokeniser33.createCommentPending();
        org.jsoup.parser.Token.Tag tag40 = tokeniser33.tagPending;
        java.lang.StringBuilder stringBuilder41 = tokeniser33.dataBuffer;
        org.jsoup.parser.Token.Comment comment42 = tokeniser33.commentPending;
        tokeniser20.commentPending = comment42;
        tokeniser1.commentPending = comment42;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(tokeniserState28);
        org.junit.Assert.assertNull(tag40);
        org.junit.Assert.assertNotNull(stringBuilder41);
        org.junit.Assert.assertEquals(stringBuilder41.toString(), "");
        org.junit.Assert.assertNotNull(comment42);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader6);
        boolean boolean8 = tokeniser7.currentNodeInHtmlNS();
        tokeniser7.createCommentPending();
        tokeniser7.emitCommentPending();
        java.lang.StringBuilder stringBuilder11 = null;
        tokeniser7.dataBuffer = stringBuilder11;
        org.jsoup.parser.Token.Comment comment13 = tokeniser7.commentPending;
        tokeniser1.commentPending = comment13;
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        tokeniser18.emit("");
        tokeniser18.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState22 = tokeniser18.getState();
        tokeniser18.createDoctypePending();
        org.jsoup.parser.Token.Tag tag25 = tokeniser18.createTagPending(false);
        org.jsoup.parser.Token.Tag tag26 = tokeniser18.tagPending;
        org.jsoup.parser.Token.Doctype doctype27 = tokeniser18.doctypePending;
        tokeniser1.doctypePending = doctype27;
        tokeniser1.emitCommentPending();
        org.jsoup.parser.Token.Comment comment30 = tokeniser1.commentPending;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(comment13);
        org.junit.Assert.assertNotNull(tokeniserState22);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(doctype27);
        org.junit.Assert.assertNotNull(comment30);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        tokeniser9.emit('4');
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        boolean boolean14 = tokeniser13.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag16 = tokeniser13.createTagPending(true);
        tokeniser9.tagPending = tag16;
        tokeniser6.tagPending = tag16;
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.CommentEndDash;
        tokeniser6.transition(tokeniserState19);
        tokeniser1.transition(tokeniserState19);
        org.jsoup.parser.Token.Doctype doctype22 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Doctype doctype23 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag25 = tokeniser1.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader26);
        tokeniser27.emit('4');
        tokeniser27.createTempBuffer();
        tokeniser27.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        tokeniser34.emit("");
        org.jsoup.parser.CharacterReader characterReader37 = null;
        org.jsoup.parser.Tokeniser tokeniser38 = new org.jsoup.parser.Tokeniser(characterReader37);
        boolean boolean39 = tokeniser38.currentNodeInHtmlNS();
        tokeniser38.createCommentPending();
        boolean boolean41 = tokeniser38.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag42 = null;
        tokeniser38.tagPending = tag42;
        org.jsoup.parser.CharacterReader characterReader44 = null;
        org.jsoup.parser.Tokeniser tokeniser45 = new org.jsoup.parser.Tokeniser(characterReader44);
        boolean boolean46 = tokeniser45.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader47 = null;
        org.jsoup.parser.Tokeniser tokeniser48 = new org.jsoup.parser.Tokeniser(characterReader47);
        tokeniser48.emit('4');
        org.jsoup.parser.CharacterReader characterReader51 = null;
        org.jsoup.parser.Tokeniser tokeniser52 = new org.jsoup.parser.Tokeniser(characterReader51);
        boolean boolean53 = tokeniser52.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag55 = tokeniser52.createTagPending(true);
        tokeniser48.tagPending = tag55;
        tokeniser45.tagPending = tag55;
        tokeniser38.tagPending = tag55;
        tokeniser34.emit((org.jsoup.parser.Token) tag55);
        tokeniser27.emit((org.jsoup.parser.Token) tag55);
        org.jsoup.parser.CharacterReader characterReader61 = null;
        org.jsoup.parser.Tokeniser tokeniser62 = new org.jsoup.parser.Tokeniser(characterReader61);
        boolean boolean63 = tokeniser62.currentNodeInHtmlNS();
        tokeniser62.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState65 = tokeniser62.getState();
        org.jsoup.parser.CharacterReader characterReader66 = null;
        org.jsoup.parser.Tokeniser tokeniser67 = new org.jsoup.parser.Tokeniser(characterReader66);
        tokeniser67.emit("");
        tokeniser67.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState71 = tokeniser67.getState();
        tokeniser67.createDoctypePending();
        java.lang.StringBuilder stringBuilder73 = tokeniser67.dataBuffer;
        tokeniser62.dataBuffer = stringBuilder73;
        tokeniser27.dataBuffer = stringBuilder73;
        org.jsoup.parser.CharacterReader characterReader76 = null;
        org.jsoup.parser.Tokeniser tokeniser77 = new org.jsoup.parser.Tokeniser(characterReader76);
        org.jsoup.parser.CharacterReader characterReader78 = null;
        org.jsoup.parser.Tokeniser tokeniser79 = new org.jsoup.parser.Tokeniser(characterReader78);
        org.jsoup.parser.TokeniserState tokeniserState80 = tokeniser79.getState();
        org.jsoup.parser.CharacterReader characterReader81 = null;
        org.jsoup.parser.Tokeniser tokeniser82 = new org.jsoup.parser.Tokeniser(characterReader81);
        boolean boolean83 = tokeniser82.currentNodeInHtmlNS();
        tokeniser82.createCommentPending();
        boolean boolean85 = tokeniser82.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment86 = tokeniser82.commentPending;
        tokeniser79.commentPending = comment86;
        tokeniser77.commentPending = comment86;
        tokeniser27.commentPending = comment86;
        tokeniser1.commentPending = comment86;
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNull(doctype22);
        org.junit.Assert.assertNull(doctype23);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(tokeniserState65);
        org.junit.Assert.assertNotNull(tokeniserState71);
        org.junit.Assert.assertNotNull(stringBuilder73);
        org.junit.Assert.assertEquals(stringBuilder73.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState80);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(comment86);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        tokeniser1.setTrackErrors(true);
        tokeniser1.emit('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char10 = tokeniser1.consumeCharacterReference((java.lang.Character) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        tokeniser6.emit('4');
        tokeniser6.createTempBuffer();
        tokeniser6.setTrackErrors(false);
        tokeniser6.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype13 = null;
        tokeniser6.doctypePending = doctype13;
        tokeniser6.emit("");
        tokeniser6.createCommentPending();
        tokeniser6.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        tokeniser20.emit("");
        tokeniser20.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState24 = tokeniser20.getState();
        tokeniser20.createDoctypePending();
        org.jsoup.parser.Token.Tag tag27 = tokeniser20.createTagPending(false);
        org.jsoup.parser.Token.Tag tag28 = tokeniser20.tagPending;
        org.jsoup.parser.Token.Doctype doctype29 = tokeniser20.doctypePending;
        tokeniser6.doctypePending = doctype29;
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        tokeniser32.emit("");
        tokeniser32.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState36 = tokeniser32.getState();
        tokeniser32.createDoctypePending();
        org.jsoup.parser.Token.Tag tag39 = tokeniser32.createTagPending(false);
        org.jsoup.parser.Token.Tag tag40 = tokeniser32.tagPending;
        org.jsoup.parser.Token.Doctype doctype41 = tokeniser32.doctypePending;
        tokeniser6.doctypePending = doctype41;
        tokeniser1.doctypePending = doctype41;
        org.jsoup.parser.Token.Comment comment44 = tokeniser1.commentPending;
        tokeniser1.emit('\ufffd');
        tokeniser1.createTempBuffer();
        boolean boolean48 = tokeniser1.isTrackErrors();
        boolean boolean49 = tokeniser1.isTrackErrors();
        org.junit.Assert.assertNotNull(tokeniserState24);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(doctype29);
        org.junit.Assert.assertNotNull(tokeniserState36);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertNotNull(doctype41);
        org.junit.Assert.assertNull(comment44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.BetweenDoctypePublicAndSystemIdentifiers;
        org.jsoup.parser.Tokeniser tokeniser1 = null;
        org.jsoup.parser.CharacterReader characterReader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser1, characterReader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader3 = null;
        org.jsoup.parser.Tokeniser tokeniser4 = new org.jsoup.parser.Tokeniser(characterReader3);
        tokeniser4.emit('4');
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        boolean boolean9 = tokeniser8.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag11 = tokeniser8.createTagPending(true);
        tokeniser4.tagPending = tag11;
        tokeniser1.tagPending = tag11;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState15 = tokeniser1.getState();
        org.jsoup.parser.Token.Doctype doctype16 = null;
        tokeniser1.doctypePending = doctype16;
        boolean boolean18 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emit("hi!");
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.emit('\ufffd');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        tokeniser8.emit('4');
        tokeniser8.createTempBuffer();
        tokeniser8.setTrackErrors(false);
        org.jsoup.parser.Token.Doctype doctype14 = null;
        tokeniser8.doctypePending = doctype14;
        tokeniser8.createCommentPending();
        org.jsoup.parser.Token.Comment comment17 = tokeniser8.commentPending;
        tokeniser1.commentPending = comment17;
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        tokeniser20.emit("");
        tokeniser20.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState24 = tokeniser20.getState();
        java.lang.StringBuilder stringBuilder25 = null;
        tokeniser20.dataBuffer = stringBuilder25;
        tokeniser20.setTrackErrors(true);
        boolean boolean29 = tokeniser20.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState30 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_singleQuoted;
        tokeniser20.transition(tokeniserState30);
        org.jsoup.parser.Token.Comment comment32 = tokeniser20.commentPending;
        org.jsoup.parser.TokeniserState tokeniserState33 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser20.transition(tokeniserState33);
        tokeniser1.transition(tokeniserState33);
        org.jsoup.parser.Token.Comment comment36 = tokeniser1.commentPending;
        org.junit.Assert.assertNotNull(comment17);
        org.junit.Assert.assertNotNull(tokeniserState24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tokeniserState30);
        org.junit.Assert.assertNull(comment32);
        org.junit.Assert.assertNotNull(tokeniserState33);
        org.junit.Assert.assertNotNull(comment36);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState6 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        boolean boolean9 = tokeniser8.currentNodeInHtmlNS();
        tokeniser8.createCommentPending();
        tokeniser8.emitCommentPending();
        org.jsoup.parser.Token.Comment comment12 = tokeniser8.commentPending;
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        tokeniser14.emit("");
        tokeniser14.emit("");
        org.jsoup.parser.Token.Tag tag19 = tokeniser14.tagPending;
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        tokeniser21.emit("");
        tokeniser21.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState25 = tokeniser21.getState();
        tokeniser21.createDoctypePending();
        org.jsoup.parser.Token.Tag tag28 = tokeniser21.createTagPending(false);
        tokeniser14.tagPending = tag28;
        boolean boolean30 = tokeniser14.isTrackErrors();
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        tokeniser32.emit('4');
        tokeniser32.createTempBuffer();
        tokeniser32.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment38 = tokeniser32.commentPending;
        org.jsoup.parser.Token.Tag tag39 = tokeniser32.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState40 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser32.transition(tokeniserState40);
        org.jsoup.parser.TokeniserState tokeniserState42 = tokeniser32.getState();
        tokeniser14.transition(tokeniserState42);
        tokeniser8.transition(tokeniserState42);
        tokeniser1.transition(tokeniserState42);
        org.jsoup.parser.CharacterReader characterReader46 = null;
        org.jsoup.parser.Tokeniser tokeniser47 = new org.jsoup.parser.Tokeniser(characterReader46);
        tokeniser47.emit("");
        org.jsoup.parser.Token.Doctype doctype50 = null;
        tokeniser47.doctypePending = doctype50;
        tokeniser47.createTempBuffer();
        tokeniser47.emit("");
        org.jsoup.parser.TokeniserState tokeniserState55 = tokeniser47.getState();
        tokeniser47.acknowledgeSelfClosingFlag();
        tokeniser47.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag58 = tokeniser47.tagPending;
        org.jsoup.parser.CharacterReader characterReader59 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState42.read(tokeniser47, characterReader59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tokeniserState6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(comment12);
        org.junit.Assert.assertNull(tag19);
        org.junit.Assert.assertNotNull(tokeniserState25);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(comment38);
        org.junit.Assert.assertNull(tag39);
        org.junit.Assert.assertNotNull(tokeniserState40);
        org.junit.Assert.assertNotNull(tokeniserState42);
        org.junit.Assert.assertNotNull(tokeniserState55);
        org.junit.Assert.assertNull(tag58);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser1.getState();
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser1.dataBuffer = stringBuilder6;
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.Token.Tag tag11 = tokeniser1.createTagPending(true);
        tokeniser1.createDoctypePending();
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.emitTagPending();
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader3 = null;
        org.jsoup.parser.Tokeniser tokeniser4 = new org.jsoup.parser.Tokeniser(characterReader3);
        tokeniser4.emit('4');
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        boolean boolean9 = tokeniser8.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag11 = tokeniser8.createTagPending(true);
        tokeniser4.tagPending = tag11;
        tokeniser1.tagPending = tag11;
        org.jsoup.parser.TokeniserState tokeniserState14 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        boolean boolean17 = tokeniser16.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype18 = tokeniser16.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser16.transition(tokeniserState19);
        tokeniser1.transition(tokeniserState19);
        tokeniser1.emitTagPending();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(doctype18);
        org.junit.Assert.assertNotNull(tokeniserState19);
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        org.jsoup.parser.Token.Doctype doctype6 = null;
        tokeniser1.doctypePending = doctype6;
        java.lang.StringBuilder stringBuilder8 = tokeniser1.dataBuffer;
        boolean boolean9 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stringBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.Token.Comment comment2 = tokeniser1.commentPending;
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser1.getState();
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        tokeniser1.createTempBuffer();
        org.junit.Assert.assertNull(comment2);
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNull(comment6);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        org.jsoup.parser.Token.Doctype doctype4 = tokeniser1.doctypePending;
        tokeniser1.emit("hi!");
        tokeniser1.emit('#');
        org.jsoup.parser.Token.Comment comment9 = tokeniser1.commentPending;
        tokeniser1.acknowledgeSelfClosingFlag();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype4);
        org.junit.Assert.assertNull(comment9);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser1.getState();
        tokeniser1.createDoctypePending();
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.Token.Doctype doctype9 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Doctype doctype10 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag12 = tokeniser1.createTagPending(false);
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertNotNull(doctype9);
        org.junit.Assert.assertNotNull(doctype10);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag9 = tokeniser6.createTagPending(true);
        tokeniser1.emit((org.jsoup.parser.Token) tag9);
        boolean boolean11 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        boolean boolean14 = tokeniser13.currentNodeInHtmlNS();
        tokeniser13.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        tokeniser17.emit('4');
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        boolean boolean22 = tokeniser21.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag24 = tokeniser21.createTagPending(true);
        tokeniser17.tagPending = tag24;
        tokeniser13.emit((org.jsoup.parser.Token) tag24);
        tokeniser1.tagPending = tag24;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag29 = tokeniser1.tagPending;
        org.jsoup.parser.Token.Tag tag31 = tokeniser1.createTagPending(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(tag31);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        org.jsoup.parser.Token.Comment comment9 = null;
        tokeniser1.commentPending = comment9;
        org.jsoup.parser.Token.Comment comment11 = null;
        tokeniser1.commentPending = comment11;
        org.jsoup.parser.Token.Doctype doctype13 = null;
        tokeniser1.doctypePending = doctype13;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment16 = null;
        tokeniser1.commentPending = comment16;
        org.jsoup.parser.Token.Doctype doctype18 = tokeniser1.doctypePending;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.createCommentPending();
        org.junit.Assert.assertNull(doctype18);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag9 = tokeniser6.createTagPending(true);
        tokeniser1.emit((org.jsoup.parser.Token) tag9);
        tokeniser1.emit(' ');
        org.jsoup.parser.Token.Comment comment13 = tokeniser1.commentPending;
        tokeniser1.createDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(comment13);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        boolean boolean6 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        tokeniser10.emit("");
        tokeniser10.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState14 = tokeniser10.getState();
        tokeniser10.createDoctypePending();
        tokeniser10.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        org.jsoup.parser.TokeniserState tokeniserState21 = tokeniser20.getState();
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        boolean boolean24 = tokeniser23.currentNodeInHtmlNS();
        tokeniser23.createCommentPending();
        boolean boolean26 = tokeniser23.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment27 = tokeniser23.commentPending;
        tokeniser20.commentPending = comment27;
        tokeniser18.commentPending = comment27;
        org.jsoup.parser.Token.Tag tag31 = tokeniser18.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype32 = tokeniser18.doctypePending;
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        boolean boolean35 = tokeniser34.currentNodeInHtmlNS();
        tokeniser34.createCommentPending();
        tokeniser34.emitCommentPending();
        java.lang.StringBuilder stringBuilder38 = tokeniser34.dataBuffer;
        org.jsoup.parser.Token.Comment comment39 = tokeniser34.commentPending;
        tokeniser18.commentPending = comment39;
        tokeniser18.setTrackErrors(true);
        org.jsoup.parser.CharacterReader characterReader43 = null;
        org.jsoup.parser.Tokeniser tokeniser44 = new org.jsoup.parser.Tokeniser(characterReader43);
        tokeniser44.emit("");
        tokeniser44.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader48 = null;
        org.jsoup.parser.Tokeniser tokeniser49 = new org.jsoup.parser.Tokeniser(characterReader48);
        tokeniser49.emit('4');
        tokeniser49.createTempBuffer();
        tokeniser49.setTrackErrors(false);
        tokeniser49.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype56 = null;
        tokeniser49.doctypePending = doctype56;
        tokeniser49.emit("");
        tokeniser49.createCommentPending();
        tokeniser49.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader62 = null;
        org.jsoup.parser.Tokeniser tokeniser63 = new org.jsoup.parser.Tokeniser(characterReader62);
        tokeniser63.emit("");
        tokeniser63.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState67 = tokeniser63.getState();
        tokeniser63.createDoctypePending();
        org.jsoup.parser.Token.Tag tag70 = tokeniser63.createTagPending(false);
        org.jsoup.parser.Token.Tag tag71 = tokeniser63.tagPending;
        org.jsoup.parser.Token.Doctype doctype72 = tokeniser63.doctypePending;
        tokeniser49.doctypePending = doctype72;
        org.jsoup.parser.CharacterReader characterReader74 = null;
        org.jsoup.parser.Tokeniser tokeniser75 = new org.jsoup.parser.Tokeniser(characterReader74);
        tokeniser75.emit("");
        tokeniser75.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState79 = tokeniser75.getState();
        tokeniser75.createDoctypePending();
        org.jsoup.parser.Token.Tag tag82 = tokeniser75.createTagPending(false);
        org.jsoup.parser.Token.Tag tag83 = tokeniser75.tagPending;
        org.jsoup.parser.Token.Doctype doctype84 = tokeniser75.doctypePending;
        tokeniser49.doctypePending = doctype84;
        tokeniser44.doctypePending = doctype84;
        org.jsoup.parser.Token.Comment comment87 = tokeniser44.commentPending;
        tokeniser44.emit('\ufffd');
        org.jsoup.parser.Token.Doctype doctype90 = tokeniser44.doctypePending;
        tokeniser18.doctypePending = doctype90;
        tokeniser10.doctypePending = doctype90;
        tokeniser1.doctypePending = doctype90;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertNotNull(tokeniserState21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(comment27);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNull(doctype32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(stringBuilder38);
        org.junit.Assert.assertNotNull(comment39);
        org.junit.Assert.assertNotNull(tokeniserState67);
        org.junit.Assert.assertNotNull(tag70);
        org.junit.Assert.assertNotNull(tag71);
        org.junit.Assert.assertNotNull(doctype72);
        org.junit.Assert.assertNotNull(tokeniserState79);
        org.junit.Assert.assertNotNull(tag82);
        org.junit.Assert.assertNotNull(tag83);
        org.junit.Assert.assertNotNull(doctype84);
        org.junit.Assert.assertNull(comment87);
        org.junit.Assert.assertNotNull(doctype90);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag9 = tokeniser6.createTagPending(true);
        tokeniser1.emit((org.jsoup.parser.Token) tag9);
        boolean boolean11 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        boolean boolean14 = tokeniser13.currentNodeInHtmlNS();
        tokeniser13.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        tokeniser17.emit('4');
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        boolean boolean22 = tokeniser21.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag24 = tokeniser21.createTagPending(true);
        tokeniser17.tagPending = tag24;
        tokeniser13.emit((org.jsoup.parser.Token) tag24);
        tokeniser1.tagPending = tag24;
        org.jsoup.parser.Token.Tag tag28 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader29);
        boolean boolean31 = tokeniser30.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype32 = tokeniser30.doctypePending;
        org.jsoup.parser.Token.Tag tag33 = tokeniser30.tagPending;
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader34);
        boolean boolean36 = tokeniser35.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader37 = null;
        org.jsoup.parser.Tokeniser tokeniser38 = new org.jsoup.parser.Tokeniser(characterReader37);
        tokeniser38.emit('4');
        org.jsoup.parser.CharacterReader characterReader41 = null;
        org.jsoup.parser.Tokeniser tokeniser42 = new org.jsoup.parser.Tokeniser(characterReader41);
        boolean boolean43 = tokeniser42.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag45 = tokeniser42.createTagPending(true);
        tokeniser38.tagPending = tag45;
        tokeniser35.tagPending = tag45;
        org.jsoup.parser.TokeniserState tokeniserState48 = org.jsoup.parser.TokeniserState.CommentEndDash;
        tokeniser35.transition(tokeniserState48);
        tokeniser30.transition(tokeniserState48);
        org.jsoup.parser.CharacterReader characterReader51 = null;
        org.jsoup.parser.Tokeniser tokeniser52 = new org.jsoup.parser.Tokeniser(characterReader51);
        boolean boolean53 = tokeniser52.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader54 = null;
        org.jsoup.parser.Tokeniser tokeniser55 = new org.jsoup.parser.Tokeniser(characterReader54);
        tokeniser55.emit('4');
        org.jsoup.parser.CharacterReader characterReader58 = null;
        org.jsoup.parser.Tokeniser tokeniser59 = new org.jsoup.parser.Tokeniser(characterReader58);
        boolean boolean60 = tokeniser59.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag62 = tokeniser59.createTagPending(true);
        tokeniser55.tagPending = tag62;
        tokeniser52.tagPending = tag62;
        tokeniser52.createTempBuffer();
        java.lang.StringBuilder stringBuilder66 = tokeniser52.dataBuffer;
        tokeniser30.dataBuffer = stringBuilder66;
        tokeniser1.dataBuffer = stringBuilder66;
        org.jsoup.parser.Token.Tag tag70 = tokeniser1.createTagPending(true);
        tokeniser1.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader72 = null;
        org.jsoup.parser.Tokeniser tokeniser73 = new org.jsoup.parser.Tokeniser(characterReader72);
        tokeniser73.emit("");
        tokeniser73.emit("");
        tokeniser73.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState79 = tokeniser73.getState();
        boolean boolean80 = tokeniser73.currentNodeInHtmlNS();
        java.lang.StringBuilder stringBuilder81 = tokeniser73.dataBuffer;
        java.lang.StringBuilder stringBuilder82 = tokeniser73.dataBuffer;
        java.lang.StringBuilder stringBuilder83 = tokeniser73.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder83;
        tokeniser1.emit('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(doctype32);
        org.junit.Assert.assertNull(tag33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNotNull(tokeniserState48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(tag62);
        org.junit.Assert.assertNotNull(stringBuilder66);
        org.junit.Assert.assertEquals(stringBuilder66.toString(), "");
        org.junit.Assert.assertNotNull(tag70);
        org.junit.Assert.assertNotNull(tokeniserState79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(stringBuilder81);
        org.junit.Assert.assertEquals(stringBuilder81.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder82);
        org.junit.Assert.assertEquals(stringBuilder82.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder83);
        org.junit.Assert.assertEquals(stringBuilder83.toString(), "");
    }
}

