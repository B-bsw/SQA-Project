package org.jsoup.parser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        char char0 = org.jsoup.parser.Tokeniser.replacementChar;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\ufffd' + "'", char0 == '\ufffd');
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.BeforeAttributeName;
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
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDashDash;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emit('4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        org.jsoup.parser.TokeniserState tokeniserState6 = org.jsoup.parser.TokeniserState.BogusDoctype;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState6);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.Token token7 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emit(token7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token2 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDashDash;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        org.jsoup.parser.TokeniserState tokeniserState6 = org.jsoup.parser.TokeniserState.MarkupDeclarationOpen;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState6);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emit('4');
        org.jsoup.parser.TokeniserState tokeniserState5 = org.jsoup.parser.TokeniserState.AfterDoctypePublicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tokeniserState5);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        tokeniser1.emitCommentPending();
        org.jsoup.parser.Token token5 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emit(token5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        boolean boolean4 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser1.tagPending = tag5;
        org.jsoup.parser.TokeniserState tokeniserState7 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tokeniserState7);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        boolean boolean6 = tokeniser5.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag8 = tokeniser5.createTagPending(true);
        tokeniser1.tagPending = tag8;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.CommentEndDash;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        org.jsoup.parser.CharacterReader characterReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(tokeniserState3);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        org.jsoup.parser.Token.Comment comment9 = null;
        tokeniser1.commentPending = comment9;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataEndTagOpen;
        java.lang.Class<?> wildcardClass1 = tokeniserState0.getClass();
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataLessthanSign;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        tokeniser2.emit("");
        tokeniser2.emit("");
        tokeniser2.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState8 = tokeniser2.getState();
        org.jsoup.parser.CharacterReader characterReader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(tokeniserState8);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment6);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataEscapedEndTagOpen;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        tokeniser2.emit("");
        org.jsoup.parser.CharacterReader characterReader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token23 = tokeniser1.read();
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
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.MarkupDeclarationOpen;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        tokeniser2.emit("");
        tokeniser2.emit("");
        org.jsoup.parser.Token.Comment comment7 = tokeniser2.commentPending;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNull(comment7);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.createTagPending(true);
        org.jsoup.parser.Token.Comment comment5 = null;
        tokeniser1.commentPending = comment5;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char9 = tokeniser1.consumeCharacterReference((java.lang.Character) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemKeyword;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        tokeniser2.emit("");
        org.jsoup.parser.CharacterReader characterReader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
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
        org.jsoup.parser.TokeniserState tokeniserState13 = org.jsoup.parser.TokeniserState.RawtextEndTagName;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState13);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        boolean boolean4 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment5 = tokeniser1.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(comment5);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
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
        org.jsoup.parser.TokeniserState tokeniserState16 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(doctype15);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token5 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AfterAttributeValue_quoted;
        java.lang.Class<?> wildcardClass1 = tokeniserState0.getClass();
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = doctype3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char18 = tokeniser1.consumeCharacterReference((java.lang.Character) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(doctype15);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemIdentifier;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        boolean boolean3 = tokeniser2.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag5 = tokeniser2.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader6);
        boolean boolean8 = tokeniser7.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag10 = tokeniser7.createTagPending(true);
        tokeniser2.emit((org.jsoup.parser.Token) tag10);
        boolean boolean12 = tokeniser2.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscaped;
        java.lang.Class<?> wildcardClass1 = tokeniserState0.getClass();
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        boolean boolean6 = tokeniser5.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag8 = tokeniser5.createTagPending(true);
        tokeniser1.tagPending = tag8;
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser1.getState();
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.RawtextEndTagName;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState11);
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
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype8 = null;
        tokeniser1.doctypePending = doctype8;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char12 = tokeniser1.consumeCharacterReference((java.lang.Character) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
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
        org.jsoup.parser.TokeniserState tokeniserState16 = org.jsoup.parser.TokeniserState.RCDATAEndTagName;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(doctype15);
        org.junit.Assert.assertNotNull(tokeniserState16);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser1.getState();
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser1.dataBuffer = stringBuilder6;
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState10 = org.jsoup.parser.TokeniserState.PLAINTEXT;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertNotNull(tokeniserState10);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
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
        org.jsoup.parser.TokeniserState tokeniserState16 = org.jsoup.parser.TokeniserState.Comment;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(comment14);
        org.junit.Assert.assertNotNull(tokeniserState16);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.emit('\ufffd');
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
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
        org.jsoup.parser.TokeniserState tokeniserState16 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscaped;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(doctype15);
        org.junit.Assert.assertNotNull(tokeniserState16);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
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
        org.jsoup.parser.TokeniserState tokeniserState15 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedDash;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tokeniserState15);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token6 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emit('4');
        org.jsoup.parser.TokeniserState tokeniserState5 = org.jsoup.parser.TokeniserState.CommentEndBang;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tokeniserState5);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
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
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(tag29);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.Token.Doctype doctype7 = tokeniser1.doctypePending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype7);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        boolean boolean4 = tokeniser1.currentNodeInHtmlNS();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token5 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        boolean boolean6 = tokeniser5.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag8 = tokeniser5.createTagPending(true);
        tokeniser1.tagPending = tag8;
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        tokeniser12.emit("");
        org.jsoup.parser.Token.Doctype doctype15 = null;
        tokeniser12.doctypePending = doctype15;
        tokeniser12.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState18 = org.jsoup.parser.TokeniserState.BogusDoctype;
        tokeniser12.transition(tokeniserState18);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNotNull(tokeniserState18);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser1.getState();
        java.lang.Class<?> wildcardClass6 = tokeniser1.getClass();
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
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
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype18);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        org.jsoup.parser.Token.Doctype doctype6 = null;
        tokeniser1.doctypePending = doctype6;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        boolean boolean11 = tokeniser10.currentNodeInHtmlNS();
        tokeniser10.emit('4');
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
        tokeniser10.emit((org.jsoup.parser.Token) tag26);
        tokeniser1.tagPending = tag26;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char33 = tokeniser1.consumeCharacterReference((java.lang.Character) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(tag26);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        org.jsoup.parser.Token.Doctype doctype6 = null;
        tokeniser1.doctypePending = doctype6;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        boolean boolean11 = tokeniser10.currentNodeInHtmlNS();
        tokeniser10.emit('4');
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
        tokeniser10.emit((org.jsoup.parser.Token) tag26);
        tokeniser1.tagPending = tag26;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(tag26);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token4 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.CharacterReferenceInData;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        tokeniser2.emit("");
        org.jsoup.parser.Token.Doctype doctype5 = null;
        tokeniser2.doctypePending = doctype5;
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser2.doctypePending = doctype7;
        tokeniser2.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Doctype doctype10 = null;
        tokeniser2.doctypePending = doctype10;
        org.jsoup.parser.CharacterReader characterReader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype8 = null;
        tokeniser1.doctypePending = doctype8;
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype12 = null;
        tokeniser1.doctypePending = doctype12;
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
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
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        boolean boolean18 = tokeniser17.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag20 = tokeniser17.createTagPending(true);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emit((org.jsoup.parser.Token) tag20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tag20);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
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
        tokeniser16.emit("");
        tokeniser16.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser16.getState();
        org.jsoup.parser.CharacterReader characterReader21 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState14.read(tokeniser16, characterReader21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertNotNull(tokeniserState20);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(true);
        tokeniser1.emit("");
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.CommentStart;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState11);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_singleQuoted;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        boolean boolean3 = tokeniser2.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype4 = tokeniser2.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState5 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser2.transition(tokeniserState5);
        org.jsoup.parser.Token.Comment comment7 = tokeniser2.commentPending;
        java.lang.StringBuilder stringBuilder8 = tokeniser2.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(doctype4);
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertNull(comment7);
        org.junit.Assert.assertNull(stringBuilder8);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype8 = null;
        tokeniser1.doctypePending = doctype8;
        tokeniser1.emit("");
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        boolean boolean14 = tokeniser13.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        tokeniser16.emit('4');
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        boolean boolean21 = tokeniser20.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag23 = tokeniser20.createTagPending(true);
        tokeniser16.tagPending = tag23;
        tokeniser13.tagPending = tag23;
        org.jsoup.parser.TokeniserState tokeniserState26 = org.jsoup.parser.TokeniserState.CommentEndDash;
        tokeniser13.transition(tokeniserState26);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(tokeniserState26);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
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
        java.lang.Class<?> wildcardClass13 = tokeniser1.getClass();
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(comment10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataEscapeStart;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        tokeniser2.emit("");
        tokeniser2.emit("");
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Doctype doctype8 = tokeniser2.doctypePending;
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser10.getState();
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        boolean boolean14 = tokeniser13.currentNodeInHtmlNS();
        tokeniser13.createCommentPending();
        boolean boolean16 = tokeniser13.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment17 = tokeniser13.commentPending;
        tokeniser10.commentPending = comment17;
        tokeniser2.commentPending = comment17;
        org.jsoup.parser.CharacterReader characterReader20 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNull(doctype8);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(comment17);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char6 = tokeniser1.consumeCharacterReference((java.lang.Character) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        boolean boolean4 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment5 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Doctype doctype6 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser1.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(comment5);
        org.junit.Assert.assertNull(doctype6);
        org.junit.Assert.assertNotNull(tokeniserState7);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
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
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(comment8);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
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
        tokeniser1.createTempBuffer();
        java.lang.Class<?> wildcardClass30 = tokeniser1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        boolean boolean6 = tokeniser5.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag8 = tokeniser5.createTagPending(true);
        tokeniser1.tagPending = tag8;
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        tokeniser12.emit("");
        tokeniser12.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState16 = tokeniser12.getState();
        tokeniser12.createDoctypePending();
        org.jsoup.parser.Token.Tag tag19 = tokeniser12.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader20 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState10.read(tokeniser12, characterReader20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNotNull(tag19);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        boolean boolean6 = tokeniser5.currentNodeInHtmlNS();
        tokeniser5.createCommentPending();
        boolean boolean8 = tokeniser5.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag9 = null;
        tokeniser5.tagPending = tag9;
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
        tokeniser5.tagPending = tag22;
        tokeniser1.emit((org.jsoup.parser.Token) tag22);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(tag22);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.BeforeAttributeName;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        tokeniser2.emit("");
        org.jsoup.parser.Token.Doctype doctype5 = null;
        tokeniser2.doctypePending = doctype5;
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser2.doctypePending = doctype7;
        org.jsoup.parser.CharacterReader characterReader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        boolean boolean6 = tokeniser5.currentNodeInHtmlNS();
        tokeniser5.createCommentPending();
        boolean boolean8 = tokeniser5.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag9 = null;
        tokeniser5.tagPending = tag9;
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
        tokeniser5.tagPending = tag22;
        tokeniser1.emit((org.jsoup.parser.Token) tag22);
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader27);
        tokeniser28.emit('4');
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        boolean boolean33 = tokeniser32.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag35 = tokeniser32.createTagPending(true);
        tokeniser28.tagPending = tag35;
        tokeniser1.tagPending = tag35;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(tag35);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        boolean boolean6 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState7 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_singleQuoted;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tokeniserState7);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
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
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNull(stringBuilder14);
        org.junit.Assert.assertNotNull(tokeniserState15);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(true);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(tag28);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        org.jsoup.parser.Token.Doctype doctype6 = null;
        tokeniser1.doctypePending = doctype6;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        boolean boolean11 = tokeniser10.currentNodeInHtmlNS();
        tokeniser10.emit('4');
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
        tokeniser10.emit((org.jsoup.parser.Token) tag26);
        tokeniser1.tagPending = tag26;
        org.jsoup.parser.TokeniserState tokeniserState31 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_doubleQuoted;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(tokeniserState31);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(tag28);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        tokeniser5.emit("");
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
        tokeniser5.emit((org.jsoup.parser.Token) tag26);
        tokeniser1.tagPending = tag26;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char34 = tokeniser1.consumeCharacterReference((java.lang.Character) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(tag26);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser1.getState();
        tokeniser1.createDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState5);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment7 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Tag tag8 = tokeniser1.tagPending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment7);
        org.junit.Assert.assertNull(tag8);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.BetweenDoctypePublicAndSystemIdentifiers;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tokeniserState4);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(true);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState5 = org.jsoup.parser.TokeniserState.ScriptData;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState5);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
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
        tokeniser1.setTrackErrors(true);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
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
        org.jsoup.parser.TokeniserState tokeniserState10 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_singleQuoted;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(comment8);
        org.junit.Assert.assertNotNull(tokeniserState10);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
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
        tokeniser1.createTempBuffer();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(tag28);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        org.jsoup.parser.Token.Doctype doctype6 = null;
        tokeniser1.doctypePending = doctype6;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        boolean boolean11 = tokeniser10.currentNodeInHtmlNS();
        tokeniser10.emit('4');
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
        tokeniser10.emit((org.jsoup.parser.Token) tag26);
        tokeniser1.tagPending = tag26;
        org.jsoup.parser.TokeniserState tokeniserState31 = org.jsoup.parser.TokeniserState.BogusDoctype;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(tokeniserState31);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
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
        org.jsoup.parser.TokeniserState tokeniserState20 = org.jsoup.parser.TokeniserState.BogusDoctype;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype18);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(tokeniserState20);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        org.jsoup.parser.Token.Doctype doctype6 = null;
        tokeniser1.doctypePending = doctype6;
        java.lang.Class<?> wildcardClass8 = tokeniser1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
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
        tokeniser1.acknowledgeSelfClosingFlag();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(doctype15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        org.jsoup.parser.Token.Comment comment6 = null;
        tokeniser1.commentPending = comment6;
        org.jsoup.parser.Token.Tag tag8 = tokeniser1.tagPending;
        tokeniser1.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState10 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_singleQuoted;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag8);
        org.junit.Assert.assertNotNull(tokeniserState10);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        org.jsoup.parser.Token.Comment comment6 = null;
        tokeniser1.commentPending = comment6;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
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
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState9);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        boolean boolean6 = tokeniser5.currentNodeInHtmlNS();
        tokeniser5.createCommentPending();
        boolean boolean8 = tokeniser5.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag9 = null;
        tokeniser5.tagPending = tag9;
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
        tokeniser5.tagPending = tag22;
        tokeniser1.emit((org.jsoup.parser.Token) tag22);
        java.lang.StringBuilder stringBuilder27 = tokeniser1.dataBuffer;
        org.jsoup.parser.Token.Tag tag28 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader29);
        tokeniser30.emit('4');
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        boolean boolean35 = tokeniser34.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag37 = tokeniser34.createTagPending(true);
        tokeniser30.tagPending = tag37;
        org.jsoup.parser.TokeniserState tokeniserState39 = tokeniser30.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNull(stringBuilder27);
        org.junit.Assert.assertNull(tag28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertNotNull(tokeniserState39);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState7 = org.jsoup.parser.TokeniserState.BogusDoctype;
        tokeniser1.transition(tokeniserState7);
        tokeniser1.createDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState7);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        org.jsoup.parser.TokeniserState tokeniserState6 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedDash;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNotNull(tokeniserState6);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype8 = null;
        tokeniser1.doctypePending = doctype8;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        java.lang.StringBuilder stringBuilder6 = tokeniser1.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        boolean boolean9 = tokeniser8.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag11 = tokeniser8.createTagPending(true);
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.CommentEnd;
        tokeniser8.transition(tokeniserState12);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNull(stringBuilder6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tokeniserState12);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Doctype doctype7 = tokeniser1.doctypePending;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char10 = tokeniser1.consumeCharacterReference((java.lang.Character) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNull(doctype7);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
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
        java.lang.StringBuilder stringBuilder11 = tokeniser1.dataBuffer;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char14 = tokeniser1.consumeCharacterReference((java.lang.Character) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(comment8);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char16 = tokeniser1.consumeCharacterReference((java.lang.Character) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AttributeValue_doubleQuoted;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        boolean boolean3 = tokeniser2.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        boolean boolean6 = tokeniser5.currentNodeInHtmlNS();
        tokeniser5.createCommentPending();
        boolean boolean8 = tokeniser5.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment9 = tokeniser5.commentPending;
        tokeniser2.commentPending = comment9;
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser2.getState();
        org.jsoup.parser.CharacterReader characterReader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(comment9);
        org.junit.Assert.assertNotNull(tokeniserState11);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char15 = tokeniser1.consumeCharacterReference((java.lang.Character) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser1.getState();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag8 = tokeniser1.createTagPending(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token9 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser1.getState();
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser1.dataBuffer = stringBuilder6;
        org.jsoup.parser.TokeniserState tokeniserState8 = org.jsoup.parser.TokeniserState.RawtextEndTagName;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertNotNull(tokeniserState8);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser1.getState();
        boolean boolean8 = tokeniser1.currentNodeInHtmlNS();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        org.jsoup.parser.Token.Doctype doctype6 = null;
        tokeniser1.doctypePending = doctype6;
        tokeniser1.emit('\ufffd');
        tokeniser1.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.AttributeValue_unquoted;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState11);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        boolean boolean4 = tokeniser1.currentNodeInHtmlNS();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char7 = tokeniser1.consumeCharacterReference((java.lang.Character) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        tokeniser1.emit("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token9 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.Token.Doctype doctype7 = tokeniser1.doctypePending;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser9.getState();
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        boolean boolean13 = tokeniser12.currentNodeInHtmlNS();
        tokeniser12.createCommentPending();
        boolean boolean15 = tokeniser12.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment16 = tokeniser12.commentPending;
        tokeniser9.commentPending = comment16;
        tokeniser1.commentPending = comment16;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype7);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(comment16);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.PLAINTEXT;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        tokeniser2.emit("");
        org.jsoup.parser.Token.Doctype doctype5 = null;
        tokeniser2.doctypePending = doctype5;
        tokeniser2.createTempBuffer();
        tokeniser2.emit("");
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser2.getState();
        tokeniser2.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(tokeniserState10);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag9 = tokeniser6.createTagPending(true);
        tokeniser1.emit((org.jsoup.parser.Token) tag9);
        boolean boolean11 = tokeniser1.isTrackErrors();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
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
        org.jsoup.parser.TokeniserState tokeniserState13 = org.jsoup.parser.TokeniserState.CharacterReferenceInData;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tokeniserState13);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        org.jsoup.parser.Token.Tag tag6 = tokeniser1.tagPending;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token7 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNull(tag6);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        boolean boolean9 = tokeniser8.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype10 = tokeniser8.doctypePending;
        org.jsoup.parser.Token.Tag tag11 = tokeniser8.tagPending;
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        boolean boolean14 = tokeniser13.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        tokeniser16.emit('4');
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        boolean boolean21 = tokeniser20.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag23 = tokeniser20.createTagPending(true);
        tokeniser16.tagPending = tag23;
        tokeniser13.tagPending = tag23;
        org.jsoup.parser.TokeniserState tokeniserState26 = org.jsoup.parser.TokeniserState.CommentEndDash;
        tokeniser13.transition(tokeniserState26);
        tokeniser8.transition(tokeniserState26);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(doctype10);
        org.junit.Assert.assertNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(tokeniserState26);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        boolean boolean6 = tokeniser5.currentNodeInHtmlNS();
        tokeniser5.createCommentPending();
        boolean boolean8 = tokeniser5.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag9 = null;
        tokeniser5.tagPending = tag9;
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
        tokeniser5.tagPending = tag22;
        tokeniser1.emit((org.jsoup.parser.Token) tag22);
        java.lang.StringBuilder stringBuilder27 = tokeniser1.dataBuffer;
        org.jsoup.parser.Token.Tag tag28 = tokeniser1.tagPending;
        tokeniser1.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNull(stringBuilder27);
        org.junit.Assert.assertNull(tag28);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        org.jsoup.parser.TokeniserState tokeniserState6 = org.jsoup.parser.TokeniserState.Comment;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState6);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
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
        org.jsoup.parser.Token.Doctype doctype13 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState14 = org.jsoup.parser.TokeniserState.BeforeDoctypeName;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(comment10);
        org.junit.Assert.assertNull(doctype13);
        org.junit.Assert.assertNotNull(tokeniserState14);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(true);
        tokeniser1.emit("");
        tokeniser1.emit('\ufffd');
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.createTagPending(true);
        org.jsoup.parser.Token.Comment comment5 = null;
        tokeniser1.commentPending = comment5;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token7 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
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
        org.jsoup.parser.TokeniserState tokeniserState22 = org.jsoup.parser.TokeniserState.ScriptDataEndTagOpen;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(tokeniserState22);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.Token.Doctype doctype7 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState8 = org.jsoup.parser.TokeniserState.RcdataLessthanSign;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype7);
        org.junit.Assert.assertNotNull(tokeniserState8);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
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
        java.lang.Class<?> wildcardClass13 = tokeniser1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
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
        tokeniser1.acknowledgeSelfClosingFlag();
        java.lang.Class<?> wildcardClass18 = tokeniser1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(doctype15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser1.getState();
        org.jsoup.parser.TokeniserState tokeniserState6 = org.jsoup.parser.TokeniserState.Comment;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertNotNull(tokeniserState6);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
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
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        boolean boolean19 = tokeniser18.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype20 = tokeniser18.doctypePending;
        org.jsoup.parser.Token.Tag tag21 = tokeniser18.tagPending;
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
        org.jsoup.parser.TokeniserState tokeniserState36 = org.jsoup.parser.TokeniserState.CommentEndDash;
        tokeniser23.transition(tokeniserState36);
        tokeniser18.transition(tokeniserState36);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(doctype20);
        org.junit.Assert.assertNull(tag21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(tokeniserState36);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
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
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Doctype doctype7 = tokeniser1.doctypePending;
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
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNull(doctype7);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.createTagPending(true);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        boolean boolean6 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState7 = org.jsoup.parser.TokeniserState.BeforeAttributeName;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tokeniserState7);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser1.getState();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        boolean boolean9 = tokeniser8.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype10 = tokeniser8.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser8.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(doctype10);
        org.junit.Assert.assertNotNull(tokeniserState11);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
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
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
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
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        tokeniser5.emit("");
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
        tokeniser5.emit((org.jsoup.parser.Token) tag26);
        tokeniser1.tagPending = tag26;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token32 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(tag26);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.createTagPending(true);
        org.jsoup.parser.TokeniserState tokeniserState5 = org.jsoup.parser.TokeniserState.CommentEnd;
        tokeniser1.transition(tokeniserState5);
        java.lang.Class<?> wildcardClass7 = tokeniser1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser1.getState();
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser1.dataBuffer = stringBuilder6;
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        tokeniser11.emit("");
        tokeniser11.emit("");
        tokeniser11.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState17 = tokeniser11.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertNotNull(tokeniserState17);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        boolean boolean6 = tokeniser5.currentNodeInHtmlNS();
        tokeniser5.createCommentPending();
        boolean boolean8 = tokeniser5.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag9 = null;
        tokeniser5.tagPending = tag9;
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
        tokeniser5.tagPending = tag22;
        tokeniser1.emit((org.jsoup.parser.Token) tag22);
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader27);
        tokeniser28.emit('4');
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        boolean boolean33 = tokeniser32.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag35 = tokeniser32.createTagPending(true);
        tokeniser28.tagPending = tag35;
        tokeniser1.tagPending = tag35;
        org.jsoup.parser.TokeniserState tokeniserState38 = org.jsoup.parser.TokeniserState.CommentEndDash;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(tokeniserState38);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        org.jsoup.parser.Token.Doctype doctype6 = null;
        tokeniser1.doctypePending = doctype6;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        tokeniser9.emit('4');
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        boolean boolean14 = tokeniser13.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag16 = tokeniser13.createTagPending(true);
        tokeniser9.tagPending = tag16;
        org.jsoup.parser.TokeniserState tokeniserState18 = tokeniser9.getState();
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemIdentifier;
        tokeniser9.transition(tokeniserState19);
        tokeniser1.transition(tokeniserState19);
        org.jsoup.parser.TokeniserState tokeniserState22 = tokeniser1.getState();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(tokeniserState22);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = tokeniser1.isAppropriateEndTagToken();
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
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.RawtextLessthanSign;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        tokeniser2.emit('4');
        tokeniser2.createTempBuffer();
        tokeniser2.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment8 = tokeniser2.commentPending;
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        boolean boolean11 = tokeniser10.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag13 = tokeniser10.createTagPending(true);
        tokeniser2.emit((org.jsoup.parser.Token) tag13);
        tokeniser2.setTrackErrors(true);
        org.jsoup.parser.CharacterReader characterReader17 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNull(comment8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(tag13);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
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
        boolean boolean27 = tokeniser26.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag29 = tokeniser26.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader30);
        boolean boolean32 = tokeniser31.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag34 = tokeniser31.createTagPending(true);
        tokeniser26.emit((org.jsoup.parser.Token) tag34);
        boolean boolean36 = tokeniser26.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader37 = null;
        org.jsoup.parser.Tokeniser tokeniser38 = new org.jsoup.parser.Tokeniser(characterReader37);
        boolean boolean39 = tokeniser38.currentNodeInHtmlNS();
        tokeniser38.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader41 = null;
        org.jsoup.parser.Tokeniser tokeniser42 = new org.jsoup.parser.Tokeniser(characterReader41);
        tokeniser42.emit('4');
        org.jsoup.parser.CharacterReader characterReader45 = null;
        org.jsoup.parser.Tokeniser tokeniser46 = new org.jsoup.parser.Tokeniser(characterReader45);
        boolean boolean47 = tokeniser46.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag49 = tokeniser46.createTagPending(true);
        tokeniser42.tagPending = tag49;
        tokeniser38.emit((org.jsoup.parser.Token) tag49);
        tokeniser26.tagPending = tag49;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emit((org.jsoup.parser.Token) tag49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(comment21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(tag49);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        tokeniser1.emitCommentPending();
        java.lang.StringBuilder stringBuilder5 = tokeniser1.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState6 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedDash;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(stringBuilder5);
        org.junit.Assert.assertNotNull(tokeniserState6);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.acknowledgeSelfClosingFlag();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState9);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        tokeniser1.emitCommentPending();
        tokeniser1.acknowledgeSelfClosingFlag();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        boolean boolean9 = tokeniser1.currentNodeInHtmlNS();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        boolean boolean4 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader6);
        boolean boolean8 = tokeniser7.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype9 = tokeniser7.doctypePending;
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        boolean boolean12 = tokeniser11.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag14 = tokeniser11.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        boolean boolean17 = tokeniser16.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag19 = tokeniser16.createTagPending(true);
        tokeniser11.emit((org.jsoup.parser.Token) tag19);
        tokeniser7.emit((org.jsoup.parser.Token) tag19);
        tokeniser1.emit((org.jsoup.parser.Token) tag19);
        java.lang.Class<?> wildcardClass23 = tokeniser1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(doctype9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser1.doctypePending = doctype7;
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.Rcdata;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState9);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState3 = org.jsoup.parser.TokeniserState.TagName;
        tokeniser1.transition(tokeniserState3);
        org.jsoup.parser.TokeniserState tokeniserState5 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState5);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
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
        tokeniser23.createCommentPending();
        boolean boolean26 = tokeniser23.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment27 = tokeniser23.commentPending;
        org.jsoup.parser.Token.Doctype doctype28 = tokeniser23.doctypePending;
        org.jsoup.parser.CharacterReader characterReader29 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState19.read(tokeniser23, characterReader29);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(comment27);
        org.junit.Assert.assertNull(doctype28);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
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
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState8);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.BeforeDoctypeName;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        tokeniser2.emit("");
        tokeniser2.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState6 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(tokeniserState6);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.createTagPending(true);
        org.jsoup.parser.Token.Comment comment5 = null;
        tokeniser1.commentPending = comment5;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
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
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        tokeniser23.emit("");
        tokeniser23.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState27 = tokeniser23.getState();
        java.lang.StringBuilder stringBuilder28 = null;
        tokeniser23.dataBuffer = stringBuilder28;
        tokeniser23.setTrackErrors(true);
        boolean boolean32 = tokeniser23.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState33 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_singleQuoted;
        tokeniser23.transition(tokeniserState33);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype18);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertNotNull(tokeniserState27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(tokeniserState33);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        org.jsoup.parser.Token.Doctype doctype6 = null;
        tokeniser1.doctypePending = doctype6;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
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
        boolean boolean20 = tokeniser1.isTrackErrors();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        boolean boolean4 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader6);
        boolean boolean8 = tokeniser7.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype9 = tokeniser7.doctypePending;
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        boolean boolean12 = tokeniser11.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag14 = tokeniser11.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        boolean boolean17 = tokeniser16.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag19 = tokeniser16.createTagPending(true);
        tokeniser11.emit((org.jsoup.parser.Token) tag19);
        tokeniser7.emit((org.jsoup.parser.Token) tag19);
        tokeniser1.emit((org.jsoup.parser.Token) tag19);
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        tokeniser24.emit("");
        org.jsoup.parser.Token.Doctype doctype27 = null;
        tokeniser24.doctypePending = doctype27;
        org.jsoup.parser.Token.Doctype doctype29 = null;
        tokeniser24.doctypePending = doctype29;
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        tokeniser32.emit('4');
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.Tokeniser tokeniser36 = new org.jsoup.parser.Tokeniser(characterReader35);
        boolean boolean37 = tokeniser36.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag39 = tokeniser36.createTagPending(true);
        tokeniser32.tagPending = tag39;
        org.jsoup.parser.TokeniserState tokeniserState41 = tokeniser32.getState();
        org.jsoup.parser.TokeniserState tokeniserState42 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemIdentifier;
        tokeniser32.transition(tokeniserState42);
        tokeniser24.transition(tokeniserState42);
        org.jsoup.parser.TokeniserState tokeniserState45 = tokeniser24.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(doctype9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(tokeniserState41);
        org.junit.Assert.assertNotNull(tokeniserState42);
        org.junit.Assert.assertNotNull(tokeniserState45);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        org.jsoup.parser.Token.Comment comment6 = null;
        tokeniser1.commentPending = comment6;
        org.jsoup.parser.Token.Tag tag8 = tokeniser1.tagPending;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag8);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.CommentEndDash;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        boolean boolean3 = tokeniser2.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype4 = tokeniser2.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState5 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser2.transition(tokeniserState5);
        org.jsoup.parser.TokeniserState tokeniserState7 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_singleQuoted;
        tokeniser2.transition(tokeniserState7);
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(doctype4);
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertNotNull(tokeniserState7);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = tokeniser1.getState();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char5 = tokeniser1.consumeCharacterReference((java.lang.Character) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Tag tag8 = tokeniser1.tagPending;
        java.lang.StringBuilder stringBuilder9 = tokeniser1.dataBuffer;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag8);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
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
        java.lang.Class<?> wildcardClass13 = tokeniser1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
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
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        tokeniser21.emit('4');
        tokeniser21.createTempBuffer();
        tokeniser21.setTrackErrors(false);
        tokeniser21.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState28 = org.jsoup.parser.TokeniserState.TagOpen;
        tokeniser21.eofError(tokeniserState28);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(comment18);
        org.junit.Assert.assertNotNull(tokeniserState28);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
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
        org.jsoup.parser.TokeniserState tokeniserState20 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype18);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        boolean boolean10 = tokeniser9.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        tokeniser12.emit('4');
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        boolean boolean17 = tokeniser16.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag19 = tokeniser16.createTagPending(true);
        tokeniser12.tagPending = tag19;
        tokeniser9.tagPending = tag19;
        org.jsoup.parser.TokeniserState tokeniserState22 = org.jsoup.parser.TokeniserState.CommentEndDash;
        tokeniser9.transition(tokeniserState22);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(tokeniserState22);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
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
        org.jsoup.parser.TokeniserState tokeniserState13 = org.jsoup.parser.TokeniserState.AfterDoctypeName;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(tokeniserState13);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
        java.lang.Class<?> wildcardClass16 = tokeniser1.getClass();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emit('4');
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        tokeniser6.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        tokeniser10.emit('4');
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        boolean boolean15 = tokeniser14.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag17 = tokeniser14.createTagPending(true);
        tokeniser10.tagPending = tag17;
        tokeniser6.emit((org.jsoup.parser.Token) tag17);
        tokeniser1.emit((org.jsoup.parser.Token) tag17);
        tokeniser1.createCommentPending();
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
        org.jsoup.parser.Token.Doctype doctype35 = null;
        tokeniser23.doctypePending = doctype35;
        org.jsoup.parser.TokeniserState tokeniserState37 = tokeniser23.getState();
        org.jsoup.parser.TokeniserState tokeniserState38 = tokeniser23.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(tokeniserState37);
        org.junit.Assert.assertNotNull(tokeniserState38);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState8 = org.jsoup.parser.TokeniserState.TagOpen;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState8);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        boolean boolean9 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState10 = org.jsoup.parser.TokeniserState.PLAINTEXT;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tokeniserState10);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
        java.lang.Class<?> wildcardClass13 = tokeniser1.getClass();
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser1.getState();
        boolean boolean8 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag10 = tokeniser1.createTagPending(false);
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.BeforeAttributeValue;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tokeniserState11);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        boolean boolean6 = tokeniser1.currentNodeInHtmlNS();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser1.getState();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token5 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tokeniserState4);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        org.jsoup.parser.TokeniserState tokeniserState6 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_singleQuoted;
        tokeniser1.transition(tokeniserState6);
        org.jsoup.parser.TokeniserState tokeniserState8 = org.jsoup.parser.TokeniserState.ScriptDataEndTagOpen;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNotNull(tokeniserState6);
        org.junit.Assert.assertNotNull(tokeniserState8);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
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
        org.jsoup.parser.TokeniserState tokeniserState14 = org.jsoup.parser.TokeniserState.ScriptDataEscapeStart;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNotNull(tokeniserState14);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        org.jsoup.parser.Token.Comment comment6 = null;
        tokeniser1.commentPending = comment6;
        org.jsoup.parser.Token.Tag tag8 = tokeniser1.tagPending;
        tokeniser1.createCommentPending();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag8);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
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
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        boolean boolean18 = tokeniser17.currentNodeInHtmlNS();
        tokeniser17.createCommentPending();
        tokeniser17.emitCommentPending();
        java.lang.StringBuilder stringBuilder21 = null;
        tokeniser17.dataBuffer = stringBuilder21;
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        tokeniser24.emit("");
        org.jsoup.parser.Token.Doctype doctype27 = null;
        tokeniser24.doctypePending = doctype27;
        tokeniser24.createTempBuffer();
        tokeniser24.emit("");
        org.jsoup.parser.Token.Comment comment32 = null;
        tokeniser24.commentPending = comment32;
        org.jsoup.parser.Token.Tag tag35 = tokeniser24.createTagPending(false);
        tokeniser17.tagPending = tag35;
        org.jsoup.parser.TokeniserState tokeniserState37 = tokeniser17.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(tokeniserState37);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
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
        boolean boolean12 = tokeniser1.currentNodeInHtmlNS();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char15 = tokeniser1.consumeCharacterReference((java.lang.Character) '\ufffd', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token24 = tokeniser1.read();
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
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        tokeniser1.createTempBuffer();
        org.jsoup.parser.Token.Doctype doctype8 = tokeniser1.doctypePending;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype8);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
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
        org.jsoup.parser.Tokeniser tokeniser16 = null;
        org.jsoup.parser.CharacterReader characterReader17 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState15.read(tokeniser16, characterReader17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tokeniserState15);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char20 = tokeniser1.consumeCharacterReference((java.lang.Character) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
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
        org.jsoup.parser.TokeniserState tokeniserState24 = org.jsoup.parser.TokeniserState.CdataSection;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState24);
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
        org.junit.Assert.assertNotNull(tokeniserState24);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
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
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.Tokeniser tokeniser36 = new org.jsoup.parser.Tokeniser(characterReader35);
        boolean boolean37 = tokeniser36.currentNodeInHtmlNS();
        tokeniser36.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState39 = tokeniser36.getState();
        org.jsoup.parser.CharacterReader characterReader40 = null;
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader40);
        tokeniser41.emit("");
        tokeniser41.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState45 = tokeniser41.getState();
        tokeniser41.createDoctypePending();
        java.lang.StringBuilder stringBuilder47 = tokeniser41.dataBuffer;
        tokeniser36.dataBuffer = stringBuilder47;
        tokeniser1.dataBuffer = stringBuilder47;
        org.jsoup.parser.CharacterReader characterReader50 = null;
        org.jsoup.parser.Tokeniser tokeniser51 = new org.jsoup.parser.Tokeniser(characterReader50);
        org.jsoup.parser.CharacterReader characterReader52 = null;
        org.jsoup.parser.Tokeniser tokeniser53 = new org.jsoup.parser.Tokeniser(characterReader52);
        org.jsoup.parser.TokeniserState tokeniserState54 = tokeniser53.getState();
        org.jsoup.parser.CharacterReader characterReader55 = null;
        org.jsoup.parser.Tokeniser tokeniser56 = new org.jsoup.parser.Tokeniser(characterReader55);
        boolean boolean57 = tokeniser56.currentNodeInHtmlNS();
        tokeniser56.createCommentPending();
        boolean boolean59 = tokeniser56.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment60 = tokeniser56.commentPending;
        tokeniser53.commentPending = comment60;
        tokeniser51.commentPending = comment60;
        tokeniser1.commentPending = comment60;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(tokeniserState39);
        org.junit.Assert.assertNotNull(tokeniserState45);
        org.junit.Assert.assertNotNull(stringBuilder47);
        org.junit.Assert.assertEquals(stringBuilder47.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(comment60);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        tokeniser11.emit('4');
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        boolean boolean16 = tokeniser15.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag18 = tokeniser15.createTagPending(true);
        tokeniser11.tagPending = tag18;
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser11.getState();
        tokeniser11.emitTagPending();
        org.jsoup.parser.CharacterReader characterReader22 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState9.read(tokeniser11, characterReader22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(tokeniserState20);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Doctype doctype7 = tokeniser1.doctypePending;
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        tokeniser10.emit("");
        tokeniser10.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState14 = tokeniser10.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNull(doctype7);
        org.junit.Assert.assertNotNull(tokeniserState14);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
        org.junit.Assert.assertNull(doctype17);
        org.junit.Assert.assertNull(doctype18);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        tokeniser1.emitCommentPending();
        java.lang.StringBuilder stringBuilder5 = null;
        tokeniser1.dataBuffer = stringBuilder5;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        tokeniser8.emit("");
        org.jsoup.parser.Token.Doctype doctype11 = null;
        tokeniser8.doctypePending = doctype11;
        tokeniser8.createTempBuffer();
        tokeniser8.emit("");
        org.jsoup.parser.Token.Comment comment16 = null;
        tokeniser8.commentPending = comment16;
        org.jsoup.parser.Token.Tag tag19 = tokeniser8.createTagPending(false);
        tokeniser1.tagPending = tag19;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag19);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser1.getState();
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser1.dataBuffer = stringBuilder6;
        tokeniser1.setTrackErrors(true);
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        org.jsoup.parser.Token.Tag tag6 = tokeniser1.tagPending;
        org.jsoup.parser.Token.Tag tag7 = tokeniser1.tagPending;
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
        org.junit.Assert.assertNull(tag6);
        org.junit.Assert.assertNull(tag7);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
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
        org.jsoup.parser.Token.Comment comment13 = tokeniser1.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNull(comment13);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        org.jsoup.parser.Token.Doctype doctype6 = null;
        tokeniser1.doctypePending = doctype6;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        tokeniser9.emit('4');
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        boolean boolean14 = tokeniser13.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag16 = tokeniser13.createTagPending(true);
        tokeniser9.tagPending = tag16;
        org.jsoup.parser.TokeniserState tokeniserState18 = tokeniser9.getState();
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemIdentifier;
        tokeniser9.transition(tokeniserState19);
        tokeniser1.transition(tokeniserState19);
        org.jsoup.parser.TokeniserState tokeniserState22 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        tokeniser24.emit("");
        org.jsoup.parser.Token.Doctype doctype27 = null;
        tokeniser24.doctypePending = doctype27;
        tokeniser24.createTempBuffer();
        tokeniser24.emit("");
        org.jsoup.parser.Token.Comment comment32 = null;
        tokeniser24.commentPending = comment32;
        org.jsoup.parser.Token.Tag tag35 = tokeniser24.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader36);
        boolean boolean38 = tokeniser37.currentNodeInHtmlNS();
        tokeniser37.createCommentPending();
        boolean boolean40 = tokeniser37.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment41 = tokeniser37.commentPending;
        tokeniser24.commentPending = comment41;
        org.jsoup.parser.CharacterReader characterReader43 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState22.read(tokeniser24, characterReader43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(tokeniserState22);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(comment41);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(comment10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tag30);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser1.getState();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char10 = tokeniser1.consumeCharacterReference((java.lang.Character) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState7);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
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
        java.lang.StringBuilder stringBuilder11 = tokeniser1.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.AttributeName;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(comment8);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState12);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
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
        org.jsoup.parser.TokeniserState tokeniserState21 = org.jsoup.parser.TokeniserState.CommentEndDash;
        tokeniser8.transition(tokeniserState21);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(tokeniserState21);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
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
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
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
        org.jsoup.parser.TokeniserState tokeniserState18 = org.jsoup.parser.TokeniserState.AttributeValue_unquoted;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertNotNull(tokeniserState18);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser1.getState();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag8 = tokeniser1.createTagPending(false);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token4 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        org.jsoup.parser.Token.Comment comment9 = null;
        tokeniser1.commentPending = comment9;
        org.jsoup.parser.Token.Doctype doctype11 = null;
        tokeniser1.doctypePending = doctype11;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        boolean boolean6 = tokeniser5.currentNodeInHtmlNS();
        tokeniser5.createCommentPending();
        boolean boolean8 = tokeniser5.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag9 = null;
        tokeniser5.tagPending = tag9;
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
        tokeniser5.tagPending = tag22;
        tokeniser1.emit((org.jsoup.parser.Token) tag22);
        java.lang.StringBuilder stringBuilder27 = tokeniser1.dataBuffer;
        org.jsoup.parser.Token.Tag tag28 = tokeniser1.tagPending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNull(stringBuilder27);
        org.junit.Assert.assertNull(tag28);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.Token.Tag tag8 = tokeniser1.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        tokeniser10.emit("");
        org.jsoup.parser.Token.Doctype doctype13 = null;
        tokeniser10.doctypePending = doctype13;
        org.jsoup.parser.Token.Doctype doctype15 = null;
        tokeniser10.doctypePending = doctype15;
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        tokeniser18.emit('4');
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader21);
        boolean boolean23 = tokeniser22.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag25 = tokeniser22.createTagPending(true);
        tokeniser18.tagPending = tag25;
        org.jsoup.parser.TokeniserState tokeniserState27 = tokeniser18.getState();
        org.jsoup.parser.TokeniserState tokeniserState28 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemIdentifier;
        tokeniser18.transition(tokeniserState28);
        tokeniser10.transition(tokeniserState28);
        org.jsoup.parser.TokeniserState tokeniserState31 = tokeniser10.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(tokeniserState27);
        org.junit.Assert.assertNotNull(tokeniserState28);
        org.junit.Assert.assertNotNull(tokeniserState31);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        boolean boolean6 = tokeniser1.currentNodeInHtmlNS();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char9 = tokeniser1.consumeCharacterReference((java.lang.Character) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        tokeniser1.setTrackErrors(false);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        tokeniser1.emitCommentPending();
        java.lang.StringBuilder stringBuilder5 = null;
        tokeniser1.dataBuffer = stringBuilder5;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        tokeniser8.emit("");
        org.jsoup.parser.Token.Doctype doctype11 = null;
        tokeniser8.doctypePending = doctype11;
        tokeniser8.createTempBuffer();
        tokeniser8.emit("");
        org.jsoup.parser.Token.Comment comment16 = null;
        tokeniser8.commentPending = comment16;
        org.jsoup.parser.Token.Tag tag19 = tokeniser8.createTagPending(false);
        tokeniser1.tagPending = tag19;
        org.jsoup.parser.TokeniserState tokeniserState21 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        tokeniser23.emit("");
        tokeniser23.setTrackErrors(true);
        org.jsoup.parser.CharacterReader characterReader28 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState21.read(tokeniser23, characterReader28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(tokeniserState21);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token16 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
        org.jsoup.parser.Token.Doctype doctype18 = tokeniser1.doctypePending;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = doctype18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(comment14);
        org.junit.Assert.assertNull(doctype18);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.Token.Tag tag8 = tokeniser1.createTagPending(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char11 = tokeniser1.consumeCharacterReference((java.lang.Character) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        boolean boolean6 = tokeniser5.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag8 = tokeniser5.createTagPending(true);
        tokeniser1.tagPending = tag8;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char12 = tokeniser1.consumeCharacterReference((java.lang.Character) '\ufffd', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        tokeniser1.emitCommentPending();
        java.lang.StringBuilder stringBuilder5 = null;
        tokeniser1.dataBuffer = stringBuilder5;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        tokeniser8.emit("");
        org.jsoup.parser.Token.Doctype doctype11 = null;
        tokeniser8.doctypePending = doctype11;
        tokeniser8.createTempBuffer();
        tokeniser8.emit("");
        org.jsoup.parser.Token.Comment comment16 = null;
        tokeniser8.commentPending = comment16;
        org.jsoup.parser.Token.Tag tag19 = tokeniser8.createTagPending(false);
        tokeniser1.tagPending = tag19;
        org.jsoup.parser.Token.Comment comment21 = tokeniser1.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(comment21);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.BeforeDoctypePublicIdentifier;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        tokeniser2.emit('4');
        tokeniser2.createTempBuffer();
        tokeniser2.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment8 = tokeniser2.commentPending;
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        boolean boolean11 = tokeniser10.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag13 = tokeniser10.createTagPending(true);
        tokeniser2.emit((org.jsoup.parser.Token) tag13);
        org.jsoup.parser.CharacterReader characterReader15 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNull(comment8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(tag13);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        boolean boolean4 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser1.tagPending = tag5;
        tokeniser1.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
        org.jsoup.parser.TokeniserState tokeniserState60 = org.jsoup.parser.TokeniserState.AfterDoctypePublicKeyword;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(tokeniserState60);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
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
        org.jsoup.parser.Token.Doctype doctype13 = null;
        tokeniser1.doctypePending = doctype13;
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(comment10);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        boolean boolean6 = tokeniser5.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag8 = tokeniser5.createTagPending(true);
        tokeniser1.tagPending = tag8;
        org.jsoup.parser.Token.Tag tag11 = tokeniser1.createTagPending(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        org.jsoup.parser.Token.Doctype doctype6 = null;
        tokeniser1.doctypePending = doctype6;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        tokeniser9.emit('4');
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        boolean boolean14 = tokeniser13.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag16 = tokeniser13.createTagPending(true);
        tokeniser9.tagPending = tag16;
        org.jsoup.parser.TokeniserState tokeniserState18 = tokeniser9.getState();
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemIdentifier;
        tokeniser9.transition(tokeniserState19);
        tokeniser1.transition(tokeniserState19);
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        tokeniser23.emit("");
        org.jsoup.parser.Token.Doctype doctype26 = null;
        tokeniser23.doctypePending = doctype26;
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
        java.lang.StringBuilder stringBuilder39 = tokeniser29.dataBuffer;
        tokeniser23.dataBuffer = stringBuilder39;
        tokeniser1.dataBuffer = stringBuilder39;
        org.jsoup.parser.Token token42 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emit(token42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(tokeniserState30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(comment36);
        org.junit.Assert.assertNotNull(stringBuilder39);
        org.junit.Assert.assertEquals(stringBuilder39.toString(), "");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        boolean boolean4 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment5 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Doctype doctype6 = tokeniser1.doctypePending;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        boolean boolean9 = tokeniser8.currentNodeInHtmlNS();
        tokeniser8.createCommentPending();
        boolean boolean11 = tokeniser8.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment12 = tokeniser8.commentPending;
        org.jsoup.parser.Token.Doctype doctype13 = tokeniser8.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState14 = tokeniser8.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(comment5);
        org.junit.Assert.assertNull(doctype6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(comment12);
        org.junit.Assert.assertNull(doctype13);
        org.junit.Assert.assertNotNull(tokeniserState14);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        org.jsoup.parser.Token.Comment comment6 = null;
        tokeniser1.commentPending = comment6;
        tokeniser1.emit("");
        org.jsoup.parser.TokeniserState tokeniserState10 = org.jsoup.parser.TokeniserState.BeforeDoctypeName;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState10);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        boolean boolean4 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser1.tagPending = tag5;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        tokeniser8.emit('4');
        tokeniser8.createTempBuffer();
        tokeniser8.setTrackErrors(false);
        tokeniser8.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype15 = null;
        tokeniser8.doctypePending = doctype15;
        tokeniser8.emit("");
        tokeniser8.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser8.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tokeniserState20);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.Token.Comment comment9 = tokeniser1.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char12 = tokeniser1.consumeCharacterReference((java.lang.Character) '\ufffd', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment9);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
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
        tokeniser1.emit('4');
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(comment8);
        org.junit.Assert.assertNotNull(tokeniserState10);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean75 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.Token.Comment comment2 = tokeniser1.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token3 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment2);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        tokeniser1.emitCommentPending();
        java.lang.StringBuilder stringBuilder5 = null;
        tokeniser1.dataBuffer = stringBuilder5;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        tokeniser8.emit("");
        org.jsoup.parser.Token.Doctype doctype11 = null;
        tokeniser8.doctypePending = doctype11;
        tokeniser8.createTempBuffer();
        tokeniser8.emit("");
        org.jsoup.parser.Token.Comment comment16 = null;
        tokeniser8.commentPending = comment16;
        org.jsoup.parser.Token.Tag tag19 = tokeniser8.createTagPending(false);
        tokeniser1.tagPending = tag19;
        org.jsoup.parser.Token.Tag tag22 = tokeniser1.createTagPending(false);
        tokeniser1.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader25);
        boolean boolean27 = tokeniser26.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag29 = tokeniser26.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader30);
        boolean boolean32 = tokeniser31.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag34 = tokeniser31.createTagPending(true);
        tokeniser26.emit((org.jsoup.parser.Token) tag34);
        boolean boolean36 = tokeniser26.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader37 = null;
        org.jsoup.parser.Tokeniser tokeniser38 = new org.jsoup.parser.Tokeniser(characterReader37);
        boolean boolean39 = tokeniser38.currentNodeInHtmlNS();
        tokeniser38.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader41 = null;
        org.jsoup.parser.Tokeniser tokeniser42 = new org.jsoup.parser.Tokeniser(characterReader41);
        tokeniser42.emit('4');
        org.jsoup.parser.CharacterReader characterReader45 = null;
        org.jsoup.parser.Tokeniser tokeniser46 = new org.jsoup.parser.Tokeniser(characterReader45);
        boolean boolean47 = tokeniser46.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag49 = tokeniser46.createTagPending(true);
        tokeniser42.tagPending = tag49;
        tokeniser38.emit((org.jsoup.parser.Token) tag49);
        tokeniser26.tagPending = tag49;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emit((org.jsoup.parser.Token) tag49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(tag49);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDashDash;
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
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        tokeniser23.emit('4');
        tokeniser23.createTempBuffer();
        tokeniser23.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment29 = tokeniser23.commentPending;
        org.jsoup.parser.CharacterReader characterReader30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader30);
        boolean boolean32 = tokeniser31.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag34 = tokeniser31.createTagPending(true);
        tokeniser23.emit((org.jsoup.parser.Token) tag34);
        tokeniser2.emit((org.jsoup.parser.Token) tag34);
        org.jsoup.parser.CharacterReader characterReader37 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader37);
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
        org.junit.Assert.assertNull(comment29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(tag34);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        tokeniser1.emitCommentPending();
        java.lang.StringBuilder stringBuilder5 = null;
        tokeniser1.dataBuffer = stringBuilder5;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        tokeniser8.emit("");
        org.jsoup.parser.Token.Doctype doctype11 = null;
        tokeniser8.doctypePending = doctype11;
        tokeniser8.createTempBuffer();
        tokeniser8.emit("");
        org.jsoup.parser.Token.Comment comment16 = null;
        tokeniser8.commentPending = comment16;
        org.jsoup.parser.Token.Tag tag19 = tokeniser8.createTagPending(false);
        tokeniser1.tagPending = tag19;
        org.jsoup.parser.TokeniserState tokeniserState21 = tokeniser1.getState();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(tokeniserState21);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
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
        org.jsoup.parser.TokeniserState tokeniserState16 = org.jsoup.parser.TokeniserState.Doctype;
        tokeniser1.transition(tokeniserState16);
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
        tokeniser19.createTempBuffer();
        java.lang.StringBuilder stringBuilder29 = tokeniser19.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState30 = tokeniser19.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(doctype15);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(comment26);
        org.junit.Assert.assertNotNull(stringBuilder29);
        org.junit.Assert.assertEquals(stringBuilder29.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState30);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser1.getState();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag8 = tokeniser1.createTagPending(false);
        org.jsoup.parser.Token.Tag tag9 = tokeniser1.tagPending;
        tokeniser1.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_doubleQuoted;
        tokeniser1.transition(tokeniserState11);
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        tokeniser14.emit('4');
        tokeniser14.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState18 = tokeniser14.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(tokeniserState18);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
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
        org.jsoup.parser.TokeniserState tokeniserState18 = org.jsoup.parser.TokeniserState.ScriptDataEscapeStart;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(doctype15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(stringBuilder17);
        org.junit.Assert.assertNotNull(tokeniserState18);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
        java.lang.Class<?> wildcardClass40 = tokeniser1.getClass();
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(tokeniserState37);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        tokeniser8.emit('4');
        tokeniser8.createTempBuffer();
        tokeniser8.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment14 = tokeniser8.commentPending;
        org.jsoup.parser.Token.Tag tag15 = tokeniser8.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState16 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser8.transition(tokeniserState16);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNull(comment14);
        org.junit.Assert.assertNull(tag15);
        org.junit.Assert.assertNotNull(tokeniserState16);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char19 = tokeniser1.consumeCharacterReference((java.lang.Character) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
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
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(tokeniserState37);
        org.junit.Assert.assertNotNull(tokeniserState38);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        tokeniser1.createDoctypePending();
        java.lang.StringBuilder stringBuilder8 = tokeniser1.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.Data;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNull(stringBuilder8);
        org.junit.Assert.assertNotNull(tokeniserState9);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
        java.lang.StringBuilder stringBuilder35 = tokeniser1.dataBuffer;
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(comment10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNull(stringBuilder35);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
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
        java.lang.Class<?> wildcardClass25 = tag24.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNull(doctype22);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
        org.jsoup.parser.TokeniserState tokeniserState16 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        boolean boolean6 = tokeniser5.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag8 = tokeniser5.createTagPending(true);
        tokeniser1.tagPending = tag8;
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser1.getState();
        java.lang.Class<?> wildcardClass11 = tokeniserState10.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        tokeniser1.createCommentPending();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token7 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser1.getState();
        tokeniser1.acknowledgeSelfClosingFlag();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState5);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
        org.jsoup.parser.TokeniserState tokeniserState72 = tokeniser14.getState();
        org.jsoup.parser.CharacterReader characterReader73 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState11.read(tokeniser14, characterReader73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tokeniserState11);
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
        org.junit.Assert.assertNotNull(tokeniserState72);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.Token.Doctype doctype7 = tokeniser1.doctypePending;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        boolean boolean10 = tokeniser9.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser9.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser9.transition(tokeniserState12);
        org.jsoup.parser.TokeniserState tokeniserState14 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_singleQuoted;
        tokeniser9.transition(tokeniserState14);
        tokeniser9.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        tokeniser18.emit("");
        org.jsoup.parser.Token.Doctype doctype21 = null;
        tokeniser18.doctypePending = doctype21;
        org.jsoup.parser.Token.Doctype doctype23 = null;
        tokeniser18.doctypePending = doctype23;
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader25);
        tokeniser26.emit('4');
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader29);
        boolean boolean31 = tokeniser30.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag33 = tokeniser30.createTagPending(true);
        tokeniser26.tagPending = tag33;
        org.jsoup.parser.TokeniserState tokeniserState35 = tokeniser26.getState();
        org.jsoup.parser.TokeniserState tokeniserState36 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemIdentifier;
        tokeniser26.transition(tokeniserState36);
        tokeniser18.transition(tokeniserState36);
        org.jsoup.parser.TokeniserState tokeniserState39 = tokeniser18.getState();
        tokeniser9.transition(tokeniserState39);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(doctype11);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(tokeniserState35);
        org.junit.Assert.assertNotNull(tokeniserState36);
        org.junit.Assert.assertNotNull(tokeniserState39);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.TokeniserState tokeniserState7 = org.jsoup.parser.TokeniserState.CommentEndDash;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState7);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
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
        org.jsoup.parser.TokeniserState tokeniserState18 = org.jsoup.parser.TokeniserState.ScriptDataEscapedEndTagOpen;
        tokeniser1.transition(tokeniserState18);
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        org.jsoup.parser.TokeniserState tokeniserState24 = tokeniser23.getState();
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader25);
        boolean boolean27 = tokeniser26.currentNodeInHtmlNS();
        tokeniser26.createCommentPending();
        boolean boolean29 = tokeniser26.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment30 = tokeniser26.commentPending;
        tokeniser23.commentPending = comment30;
        tokeniser21.commentPending = comment30;
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        boolean boolean35 = tokeniser34.currentNodeInHtmlNS();
        tokeniser34.emit('4');
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader38);
        boolean boolean40 = tokeniser39.currentNodeInHtmlNS();
        tokeniser39.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader42 = null;
        org.jsoup.parser.Tokeniser tokeniser43 = new org.jsoup.parser.Tokeniser(characterReader42);
        tokeniser43.emit('4');
        org.jsoup.parser.CharacterReader characterReader46 = null;
        org.jsoup.parser.Tokeniser tokeniser47 = new org.jsoup.parser.Tokeniser(characterReader46);
        boolean boolean48 = tokeniser47.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag50 = tokeniser47.createTagPending(true);
        tokeniser43.tagPending = tag50;
        tokeniser39.emit((org.jsoup.parser.Token) tag50);
        tokeniser34.emit((org.jsoup.parser.Token) tag50);
        tokeniser21.tagPending = tag50;
        org.jsoup.parser.CharacterReader characterReader55 = null;
        org.jsoup.parser.Tokeniser tokeniser56 = new org.jsoup.parser.Tokeniser(characterReader55);
        tokeniser56.emit("");
        org.jsoup.parser.Token.Doctype doctype59 = null;
        tokeniser56.doctypePending = doctype59;
        tokeniser56.createTempBuffer();
        tokeniser56.emit("");
        org.jsoup.parser.Token.Comment comment64 = null;
        tokeniser56.commentPending = comment64;
        org.jsoup.parser.Token.Comment comment66 = null;
        tokeniser56.commentPending = comment66;
        org.jsoup.parser.Token.Doctype doctype68 = null;
        tokeniser56.doctypePending = doctype68;
        java.lang.StringBuilder stringBuilder70 = tokeniser56.dataBuffer;
        tokeniser21.dataBuffer = stringBuilder70;
        tokeniser1.dataBuffer = stringBuilder70;
        java.lang.Class<?> wildcardClass73 = tokeniser1.getClass();
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tokeniserState24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(comment30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertNotNull(stringBuilder70);
        org.junit.Assert.assertEquals(stringBuilder70.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
        org.jsoup.parser.TokeniserState tokeniserState18 = org.jsoup.parser.TokeniserState.ScriptDataEscapedEndTagOpen;
        tokeniser1.transition(tokeniserState18);
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        org.jsoup.parser.TokeniserState tokeniserState24 = tokeniser23.getState();
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader25);
        boolean boolean27 = tokeniser26.currentNodeInHtmlNS();
        tokeniser26.createCommentPending();
        boolean boolean29 = tokeniser26.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment30 = tokeniser26.commentPending;
        tokeniser23.commentPending = comment30;
        tokeniser21.commentPending = comment30;
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        boolean boolean35 = tokeniser34.currentNodeInHtmlNS();
        tokeniser34.emit('4');
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader38);
        boolean boolean40 = tokeniser39.currentNodeInHtmlNS();
        tokeniser39.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader42 = null;
        org.jsoup.parser.Tokeniser tokeniser43 = new org.jsoup.parser.Tokeniser(characterReader42);
        tokeniser43.emit('4');
        org.jsoup.parser.CharacterReader characterReader46 = null;
        org.jsoup.parser.Tokeniser tokeniser47 = new org.jsoup.parser.Tokeniser(characterReader46);
        boolean boolean48 = tokeniser47.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag50 = tokeniser47.createTagPending(true);
        tokeniser43.tagPending = tag50;
        tokeniser39.emit((org.jsoup.parser.Token) tag50);
        tokeniser34.emit((org.jsoup.parser.Token) tag50);
        tokeniser21.tagPending = tag50;
        org.jsoup.parser.CharacterReader characterReader55 = null;
        org.jsoup.parser.Tokeniser tokeniser56 = new org.jsoup.parser.Tokeniser(characterReader55);
        tokeniser56.emit("");
        org.jsoup.parser.Token.Doctype doctype59 = null;
        tokeniser56.doctypePending = doctype59;
        tokeniser56.createTempBuffer();
        tokeniser56.emit("");
        org.jsoup.parser.Token.Comment comment64 = null;
        tokeniser56.commentPending = comment64;
        org.jsoup.parser.Token.Comment comment66 = null;
        tokeniser56.commentPending = comment66;
        org.jsoup.parser.Token.Doctype doctype68 = null;
        tokeniser56.doctypePending = doctype68;
        java.lang.StringBuilder stringBuilder70 = tokeniser56.dataBuffer;
        tokeniser21.dataBuffer = stringBuilder70;
        tokeniser1.dataBuffer = stringBuilder70;
        tokeniser1.setTrackErrors(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token75 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tokeniserState24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(comment30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertNotNull(stringBuilder70);
        org.junit.Assert.assertEquals(stringBuilder70.toString(), "");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        tokeniser2.emit("");
        tokeniser2.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState6 = tokeniser2.getState();
        java.lang.StringBuilder stringBuilder7 = null;
        tokeniser2.dataBuffer = stringBuilder7;
        tokeniser2.setTrackErrors(true);
        boolean boolean11 = tokeniser2.isTrackErrors();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(tokeniserState6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedDash;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        tokeniser2.emit("");
        tokeniser2.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState6 = tokeniser2.getState();
        java.lang.StringBuilder stringBuilder7 = null;
        tokeniser2.dataBuffer = stringBuilder7;
        tokeniser2.setTrackErrors(true);
        boolean boolean11 = tokeniser2.isTrackErrors();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(tokeniserState6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser1.doctypePending = doctype7;
        java.lang.StringBuilder stringBuilder9 = tokeniser1.dataBuffer;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        boolean boolean6 = tokeniser5.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag8 = tokeniser5.createTagPending(true);
        tokeniser1.tagPending = tag8;
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser1.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tokeniserState10);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = tokeniser1.getState();
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        tokeniser5.emit("");
        tokeniser5.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser5.getState();
        java.lang.StringBuilder stringBuilder10 = null;
        tokeniser5.dataBuffer = stringBuilder10;
        org.jsoup.parser.TokeniserState tokeniserState12 = tokeniser5.getState();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState3.read(tokeniser5, characterReader13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState12);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(comment14);
        org.junit.Assert.assertNotNull(tokeniserState15);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        boolean boolean4 = tokeniser1.currentNodeInHtmlNS();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser1.getState();
        boolean boolean8 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag10 = tokeniser1.createTagPending(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token11 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.Token token5 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emit(token5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
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
        org.jsoup.parser.TokeniserState tokeniserState24 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState24);
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
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
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
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        boolean boolean6 = tokeniser5.currentNodeInHtmlNS();
        tokeniser5.createCommentPending();
        boolean boolean8 = tokeniser5.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag9 = null;
        tokeniser5.tagPending = tag9;
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
        tokeniser5.tagPending = tag22;
        tokeniser1.emit((org.jsoup.parser.Token) tag22);
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader27);
        tokeniser28.emit('4');
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        boolean boolean33 = tokeniser32.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag35 = tokeniser32.createTagPending(true);
        tokeniser28.tagPending = tag35;
        tokeniser1.tagPending = tag35;
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader38);
        boolean boolean40 = tokeniser39.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype41 = tokeniser39.doctypePending;
        org.jsoup.parser.Token.Tag tag42 = tokeniser39.tagPending;
        org.jsoup.parser.CharacterReader characterReader43 = null;
        org.jsoup.parser.Tokeniser tokeniser44 = new org.jsoup.parser.Tokeniser(characterReader43);
        boolean boolean45 = tokeniser44.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader46 = null;
        org.jsoup.parser.Tokeniser tokeniser47 = new org.jsoup.parser.Tokeniser(characterReader46);
        tokeniser47.emit('4');
        org.jsoup.parser.CharacterReader characterReader50 = null;
        org.jsoup.parser.Tokeniser tokeniser51 = new org.jsoup.parser.Tokeniser(characterReader50);
        boolean boolean52 = tokeniser51.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag54 = tokeniser51.createTagPending(true);
        tokeniser47.tagPending = tag54;
        tokeniser44.tagPending = tag54;
        org.jsoup.parser.TokeniserState tokeniserState57 = org.jsoup.parser.TokeniserState.CommentEndDash;
        tokeniser44.transition(tokeniserState57);
        tokeniser39.transition(tokeniserState57);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(doctype41);
        org.junit.Assert.assertNull(tag42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(tag54);
        org.junit.Assert.assertNotNull(tokeniserState57);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
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
        java.lang.StringBuilder stringBuilder37 = tokeniser11.dataBuffer;
        org.jsoup.parser.Token.Tag tag38 = tokeniser11.tagPending;
        tokeniser11.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader40 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState9.read(tokeniser11, characterReader40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNull(stringBuilder37);
        org.junit.Assert.assertNull(tag38);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.Token.Doctype doctype7 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState8 = tokeniser1.getState();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char11 = tokeniser1.consumeCharacterReference((java.lang.Character) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype7);
        org.junit.Assert.assertNotNull(tokeniserState8);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader6);
        org.jsoup.parser.TokeniserState tokeniserState8 = tokeniser7.getState();
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        boolean boolean11 = tokeniser10.currentNodeInHtmlNS();
        tokeniser10.createCommentPending();
        boolean boolean13 = tokeniser10.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment14 = tokeniser10.commentPending;
        tokeniser7.commentPending = comment14;
        tokeniser7.createTempBuffer();
        java.lang.StringBuilder stringBuilder17 = tokeniser7.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder17;
        org.jsoup.parser.Token.Doctype doctype19 = tokeniser1.doctypePending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(comment14);
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNull(doctype19);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emit('4');
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        tokeniser6.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        tokeniser10.emit('4');
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        boolean boolean15 = tokeniser14.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag17 = tokeniser14.createTagPending(true);
        tokeniser10.tagPending = tag17;
        tokeniser6.emit((org.jsoup.parser.Token) tag17);
        tokeniser1.emit((org.jsoup.parser.Token) tag17);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tag17);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
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
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
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
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        boolean boolean6 = tokeniser5.currentNodeInHtmlNS();
        tokeniser5.createCommentPending();
        boolean boolean8 = tokeniser5.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag9 = null;
        tokeniser5.tagPending = tag9;
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
        tokeniser5.tagPending = tag22;
        tokeniser1.emit((org.jsoup.parser.Token) tag22);
        java.lang.StringBuilder stringBuilder27 = tokeniser1.dataBuffer;
        tokeniser1.setTrackErrors(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char32 = tokeniser1.consumeCharacterReference((java.lang.Character) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNull(stringBuilder27);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
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
        org.jsoup.parser.TokeniserState tokeniserState13 = org.jsoup.parser.TokeniserState.AfterDoctypeName;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(tokeniserState13);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
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
        org.jsoup.parser.TokeniserState tokeniserState35 = org.jsoup.parser.TokeniserState.AfterAttributeValue_quoted;
        tokeniser1.transition(tokeniserState35);
        org.jsoup.parser.TokeniserState tokeniserState37 = org.jsoup.parser.TokeniserState.Doctype;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState37);
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
        org.junit.Assert.assertNotNull(tokeniserState35);
        org.junit.Assert.assertNotNull(tokeniserState37);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
        tokeniser22.emit("");
        tokeniser22.emit("");
        tokeniser22.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState28 = tokeniser22.getState();
        boolean boolean29 = tokeniser22.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag31 = tokeniser22.createTagPending(false);
        tokeniser1.emit((org.jsoup.parser.Token) tag31);
        tokeniser1.createCommentPending();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tokeniserState28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tag31);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
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
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        tokeniser14.emit("");
        tokeniser14.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState18 = tokeniser14.getState();
        java.lang.StringBuilder stringBuilder19 = null;
        tokeniser14.dataBuffer = stringBuilder19;
        org.jsoup.parser.TokeniserState tokeniserState21 = tokeniser14.getState();
        tokeniser14.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype23 = tokeniser14.doctypePending;
        org.jsoup.parser.CharacterReader characterReader24 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState11.read(tokeniser14, characterReader24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNull(stringBuilder8);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tokeniserState21);
        org.junit.Assert.assertNull(doctype23);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser1.doctypePending = doctype7;
        boolean boolean9 = tokeniser1.isTrackErrors();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.Token.Comment comment9 = tokeniser1.commentPending;
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        tokeniser11.emit('4');
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        boolean boolean16 = tokeniser15.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag18 = tokeniser15.createTagPending(true);
        tokeniser11.tagPending = tag18;
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser11.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(tokeniserState20);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
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
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        tokeniser12.emit('4');
        tokeniser12.createTempBuffer();
        tokeniser12.setTrackErrors(false);
        tokeniser12.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.TagOpen;
        tokeniser12.eofError(tokeniserState19);
        tokeniser12.setTrackErrors(false);
        tokeniser12.emit(' ');
        tokeniser12.createTempBuffer();
        tokeniser12.emit('\ufffd');
        org.jsoup.parser.TokeniserState tokeniserState28 = tokeniser12.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag8);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(tokeniserState28);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
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
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        tokeniser19.emit("");
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        boolean boolean24 = tokeniser23.currentNodeInHtmlNS();
        tokeniser23.createCommentPending();
        boolean boolean26 = tokeniser23.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag27 = null;
        tokeniser23.tagPending = tag27;
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader29);
        boolean boolean31 = tokeniser30.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader32);
        tokeniser33.emit('4');
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader36);
        boolean boolean38 = tokeniser37.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag40 = tokeniser37.createTagPending(true);
        tokeniser33.tagPending = tag40;
        tokeniser30.tagPending = tag40;
        tokeniser23.tagPending = tag40;
        tokeniser19.emit((org.jsoup.parser.Token) tag40);
        org.jsoup.parser.CharacterReader characterReader45 = null;
        org.jsoup.parser.Tokeniser tokeniser46 = new org.jsoup.parser.Tokeniser(characterReader45);
        tokeniser46.emit('4');
        org.jsoup.parser.CharacterReader characterReader49 = null;
        org.jsoup.parser.Tokeniser tokeniser50 = new org.jsoup.parser.Tokeniser(characterReader49);
        boolean boolean51 = tokeniser50.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag53 = tokeniser50.createTagPending(true);
        tokeniser46.tagPending = tag53;
        tokeniser19.tagPending = tag53;
        org.jsoup.parser.CharacterReader characterReader56 = null;
        org.jsoup.parser.Tokeniser tokeniser57 = new org.jsoup.parser.Tokeniser(characterReader56);
        tokeniser57.emit('4');
        tokeniser57.createTempBuffer();
        tokeniser57.setTrackErrors(false);
        tokeniser57.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState64 = org.jsoup.parser.TokeniserState.TagOpen;
        tokeniser57.eofError(tokeniserState64);
        tokeniser57.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader68 = null;
        org.jsoup.parser.Tokeniser tokeniser69 = new org.jsoup.parser.Tokeniser(characterReader68);
        tokeniser69.emit("");
        org.jsoup.parser.Token.Doctype doctype72 = null;
        tokeniser69.doctypePending = doctype72;
        tokeniser69.createTempBuffer();
        tokeniser69.emit("");
        org.jsoup.parser.Token.Comment comment77 = null;
        tokeniser69.commentPending = comment77;
        org.jsoup.parser.Token.Comment comment79 = null;
        tokeniser69.commentPending = comment79;
        org.jsoup.parser.Token.Doctype doctype81 = null;
        tokeniser69.doctypePending = doctype81;
        java.lang.StringBuilder stringBuilder83 = tokeniser69.dataBuffer;
        tokeniser57.dataBuffer = stringBuilder83;
        tokeniser19.dataBuffer = stringBuilder83;
        org.jsoup.parser.Token.Tag tag87 = tokeniser19.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader88 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState17.read(tokeniser19, characterReader88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertNotNull(tokeniserState64);
        org.junit.Assert.assertNotNull(stringBuilder83);
        org.junit.Assert.assertEquals(stringBuilder83.toString(), "");
        org.junit.Assert.assertNotNull(tag87);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        org.jsoup.parser.Token.Doctype doctype4 = tokeniser1.doctypePending;
        tokeniser1.createCommentPending();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype4);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        org.jsoup.parser.Token.Tag tag23 = tokeniser1.createTagPending(true);
        java.lang.StringBuilder stringBuilder24 = tokeniser1.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState25 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState25);
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
        org.junit.Assert.assertNull(stringBuilder24);
        org.junit.Assert.assertNotNull(tokeniserState25);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.CharacterReferenceInData;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        tokeniser2.emit("");
        org.jsoup.parser.Token.Doctype doctype5 = null;
        tokeniser2.doctypePending = doctype5;
        tokeniser2.createTempBuffer();
        tokeniser2.emit("");
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser2.commentPending = comment10;
        org.jsoup.parser.Token.Doctype doctype12 = null;
        tokeniser2.doctypePending = doctype12;
        org.jsoup.parser.CharacterReader characterReader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
        tokeniser1.emit("hi!");
        tokeniser1.createCommentPending();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(doctype15);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_singleQuoted;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tokeniserState12);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
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
        org.junit.Assert.assertNotNull(tag13);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
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
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
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
        org.jsoup.parser.TokeniserState tokeniserState24 = org.jsoup.parser.TokeniserState.Doctype;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState24);
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
        org.junit.Assert.assertNotNull(tokeniserState24);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNull(stringBuilder14);
        org.junit.Assert.assertNotNull(tag15);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token24 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype18);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertNotNull(tag23);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        tokeniser1.emitCommentPending();
        java.lang.StringBuilder stringBuilder5 = null;
        tokeniser1.dataBuffer = stringBuilder5;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        tokeniser8.emit("");
        org.jsoup.parser.Token.Doctype doctype11 = null;
        tokeniser8.doctypePending = doctype11;
        tokeniser8.createTempBuffer();
        tokeniser8.emit("");
        org.jsoup.parser.Token.Comment comment16 = null;
        tokeniser8.commentPending = comment16;
        org.jsoup.parser.Token.Tag tag19 = tokeniser8.createTagPending(false);
        tokeniser1.tagPending = tag19;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag19);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.createTagPending(true);
        org.jsoup.parser.TokeniserState tokeniserState5 = org.jsoup.parser.TokeniserState.CommentEnd;
        tokeniser1.transition(tokeniserState5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tokeniserState5);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token14 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        java.lang.Class<?> wildcardClass1 = tokeniserState0.getClass();
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
        java.lang.Class<?> wildcardClass17 = tokeniserState15.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNull(stringBuilder14);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        java.lang.StringBuilder stringBuilder6 = tokeniser1.dataBuffer;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char9 = tokeniser1.consumeCharacterReference((java.lang.Character) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNull(stringBuilder6);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        boolean boolean6 = tokeniser5.currentNodeInHtmlNS();
        tokeniser5.createCommentPending();
        boolean boolean8 = tokeniser5.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag9 = null;
        tokeniser5.tagPending = tag9;
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
        tokeniser5.tagPending = tag22;
        tokeniser1.emit((org.jsoup.parser.Token) tag22);
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader27);
        tokeniser28.emit('4');
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        boolean boolean33 = tokeniser32.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag35 = tokeniser32.createTagPending(true);
        tokeniser28.tagPending = tag35;
        tokeniser1.tagPending = tag35;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char40 = tokeniser1.consumeCharacterReference((java.lang.Character) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(tag35);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
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
        tokeniser1.createDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char27 = tokeniser1.consumeCharacterReference((java.lang.Character) ' ', false);
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
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emit('4');
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        tokeniser6.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        tokeniser10.emit('4');
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        boolean boolean15 = tokeniser14.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag17 = tokeniser14.createTagPending(true);
        tokeniser10.tagPending = tag17;
        tokeniser6.emit((org.jsoup.parser.Token) tag17);
        tokeniser1.emit((org.jsoup.parser.Token) tag17);
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype22 = tokeniser1.doctypePending;
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        boolean boolean25 = tokeniser24.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader26);
        tokeniser27.emit('4');
        org.jsoup.parser.CharacterReader characterReader30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader30);
        boolean boolean32 = tokeniser31.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag34 = tokeniser31.createTagPending(true);
        tokeniser27.tagPending = tag34;
        tokeniser24.tagPending = tag34;
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
        tokeniser38.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState52 = tokeniser38.getState();
        org.jsoup.parser.Token.Doctype doctype53 = null;
        tokeniser38.doctypePending = doctype53;
        boolean boolean55 = tokeniser38.currentNodeInHtmlNS();
        tokeniser38.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader58 = null;
        org.jsoup.parser.Tokeniser tokeniser59 = new org.jsoup.parser.Tokeniser(characterReader58);
        tokeniser59.emit('4');
        tokeniser59.createTempBuffer();
        tokeniser59.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment65 = tokeniser59.commentPending;
        org.jsoup.parser.CharacterReader characterReader66 = null;
        org.jsoup.parser.Tokeniser tokeniser67 = new org.jsoup.parser.Tokeniser(characterReader66);
        boolean boolean68 = tokeniser67.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag70 = tokeniser67.createTagPending(true);
        tokeniser59.emit((org.jsoup.parser.Token) tag70);
        tokeniser38.emit((org.jsoup.parser.Token) tag70);
        tokeniser24.emit((org.jsoup.parser.Token) tag70);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emit((org.jsoup.parser.Token) tag70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNull(doctype22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertNotNull(tokeniserState52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNull(comment65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(tag70);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        tokeniser2.emit('4');
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag9 = tokeniser6.createTagPending(true);
        tokeniser2.tagPending = tag9;
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser2.getState();
        tokeniser2.emitTagPending();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tokeniserState11);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.Token.Comment comment9 = tokeniser1.commentPending;
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        tokeniser11.emit('4');
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        boolean boolean16 = tokeniser15.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag18 = tokeniser15.createTagPending(true);
        tokeniser11.tagPending = tag18;
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser11.getState();
        org.jsoup.parser.TokeniserState tokeniserState21 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemIdentifier;
        tokeniser11.transition(tokeniserState21);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertNotNull(tokeniserState21);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char6 = tokeniser1.consumeCharacterReference((java.lang.Character) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        tokeniser6.createCommentPending();
        boolean boolean9 = tokeniser6.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment10 = tokeniser6.commentPending;
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser6.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState12 = tokeniser6.getState();
        tokeniser1.transition(tokeniserState12);
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        tokeniser15.emit("");
        org.jsoup.parser.Token.Doctype doctype18 = null;
        tokeniser15.doctypePending = doctype18;
        tokeniser15.createTempBuffer();
        tokeniser15.emit("");
        org.jsoup.parser.Token.Comment comment23 = null;
        tokeniser15.commentPending = comment23;
        org.jsoup.parser.Token.Comment comment25 = null;
        tokeniser15.commentPending = comment25;
        org.jsoup.parser.Token.Doctype doctype27 = null;
        tokeniser15.doctypePending = doctype27;
        tokeniser15.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment30 = null;
        tokeniser15.commentPending = comment30;
        org.jsoup.parser.Token.Doctype doctype32 = tokeniser15.doctypePending;
        tokeniser15.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState34 = org.jsoup.parser.TokeniserState.Comment;
        tokeniser15.transition(tokeniserState34);
        org.jsoup.parser.Token.Tag tag37 = tokeniser15.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader38 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState12.read(tokeniser15, characterReader38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(comment10);
        org.junit.Assert.assertNull(doctype11);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNull(doctype32);
        org.junit.Assert.assertNotNull(tokeniserState34);
        org.junit.Assert.assertNotNull(tag37);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        tokeniser1.emitCommentPending();
        java.lang.StringBuilder stringBuilder5 = null;
        tokeniser1.dataBuffer = stringBuilder5;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        tokeniser8.emit("");
        org.jsoup.parser.Token.Doctype doctype11 = null;
        tokeniser8.doctypePending = doctype11;
        tokeniser8.createTempBuffer();
        tokeniser8.emit("");
        org.jsoup.parser.Token.Comment comment16 = null;
        tokeniser8.commentPending = comment16;
        org.jsoup.parser.Token.Tag tag19 = tokeniser8.createTagPending(false);
        tokeniser1.tagPending = tag19;
        org.jsoup.parser.TokeniserState tokeniserState21 = tokeniser1.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(tokeniserState21);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token18 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(comment13);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
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
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        tokeniser17.emit("");
        org.jsoup.parser.Token.Doctype doctype20 = null;
        tokeniser17.doctypePending = doctype20;
        tokeniser17.createTempBuffer();
        tokeniser17.emit("");
        org.jsoup.parser.Token.Comment comment25 = null;
        tokeniser17.commentPending = comment25;
        org.jsoup.parser.Token.Comment comment27 = null;
        tokeniser17.commentPending = comment27;
        org.jsoup.parser.Token.Doctype doctype29 = null;
        tokeniser17.doctypePending = doctype29;
        tokeniser17.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment32 = null;
        tokeniser17.commentPending = comment32;
        org.jsoup.parser.Token.Doctype doctype34 = tokeniser17.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState35 = tokeniser17.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNull(stringBuilder14);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNull(doctype34);
        org.junit.Assert.assertNotNull(tokeniserState35);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
        org.jsoup.parser.TokeniserState tokeniserState96 = org.jsoup.parser.TokeniserState.Rcdata;
        tokeniser1.transition(tokeniserState96);
        tokeniser1.acknowledgeSelfClosingFlag();
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
        org.junit.Assert.assertNotNull(tokeniserState96);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        tokeniser1.emitCommentPending();
        java.lang.StringBuilder stringBuilder5 = null;
        tokeniser1.dataBuffer = stringBuilder5;
        org.jsoup.parser.Token token7 = tokeniser1.read();
        java.lang.StringBuilder stringBuilder8 = null;
        tokeniser1.dataBuffer = stringBuilder8;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        boolean boolean3 = tokeniser2.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag5 = tokeniser2.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader6);
        boolean boolean8 = tokeniser7.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag10 = tokeniser7.createTagPending(true);
        tokeniser2.emit((org.jsoup.parser.Token) tag10);
        boolean boolean12 = tokeniser2.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        boolean boolean15 = tokeniser14.currentNodeInHtmlNS();
        tokeniser14.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        tokeniser18.emit('4');
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader21);
        boolean boolean23 = tokeniser22.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag25 = tokeniser22.createTagPending(true);
        tokeniser18.tagPending = tag25;
        tokeniser14.emit((org.jsoup.parser.Token) tag25);
        tokeniser2.tagPending = tag25;
        org.jsoup.parser.Token.Tag tag29 = tokeniser2.tagPending;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader31 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(tag29);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        boolean boolean6 = tokeniser5.currentNodeInHtmlNS();
        tokeniser5.createCommentPending();
        boolean boolean8 = tokeniser5.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag9 = null;
        tokeniser5.tagPending = tag9;
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
        tokeniser5.tagPending = tag22;
        tokeniser1.emit((org.jsoup.parser.Token) tag22);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(tag22);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.Token.Doctype doctype7 = tokeniser1.doctypePending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype7);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
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
        org.jsoup.parser.TokeniserState tokeniserState15 = tokeniser1.getState();
        org.jsoup.parser.TokeniserState tokeniserState16 = tokeniser1.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertNotNull(tokeniserState16);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser1.getState();
        org.jsoup.parser.TokeniserState tokeniserState5 = org.jsoup.parser.TokeniserState.CommentEndBang;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNotNull(tokeniserState5);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
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
        org.jsoup.parser.TokeniserState tokeniserState21 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState21);
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
        org.junit.Assert.assertNotNull(tokeniserState21);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
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
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(doctype17);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
        java.lang.Class<?> wildcardClass16 = tokeniser1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNull(stringBuilder14);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.Token.Doctype doctype7 = tokeniser1.doctypePending;
        tokeniser1.emit(' ');
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype7);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser1.doctypePending = doctype7;
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        boolean boolean11 = tokeniser10.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser10.doctypePending;
        org.jsoup.parser.Token.Tag tag13 = tokeniser10.tagPending;
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        boolean boolean16 = tokeniser15.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        tokeniser18.emit('4');
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader21);
        boolean boolean23 = tokeniser22.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag25 = tokeniser22.createTagPending(true);
        tokeniser18.tagPending = tag25;
        tokeniser15.tagPending = tag25;
        org.jsoup.parser.TokeniserState tokeniserState28 = org.jsoup.parser.TokeniserState.CommentEndDash;
        tokeniser15.transition(tokeniserState28);
        tokeniser10.transition(tokeniserState28);
        org.jsoup.parser.Token.Tag tag32 = tokeniser10.createTagPending(false);
        tokeniser1.emit((org.jsoup.parser.Token) tag32);
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
        org.jsoup.parser.Token.Tag tag56 = tokeniser35.createTagPending(false);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emit((org.jsoup.parser.Token) tag56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(doctype12);
        org.junit.Assert.assertNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(tokeniserState28);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertNotNull(tag56);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.Token.Doctype doctype7 = tokeniser1.doctypePending;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char10 = tokeniser1.consumeCharacterReference((java.lang.Character) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype7);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        tokeniser8.emit("");
        org.jsoup.parser.Token.Doctype doctype11 = null;
        tokeniser8.doctypePending = doctype11;
        tokeniser8.createTempBuffer();
        tokeniser8.emit("");
        org.jsoup.parser.Token.Comment comment16 = null;
        tokeniser8.commentPending = comment16;
        org.jsoup.parser.Token.Comment comment18 = null;
        tokeniser8.commentPending = comment18;
        org.jsoup.parser.Token.Doctype doctype20 = null;
        tokeniser8.doctypePending = doctype20;
        tokeniser8.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment23 = null;
        tokeniser8.commentPending = comment23;
        org.jsoup.parser.TokeniserState tokeniserState25 = org.jsoup.parser.TokeniserState.ScriptDataEscapedEndTagOpen;
        tokeniser8.transition(tokeniserState25);
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader27);
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader29);
        org.jsoup.parser.TokeniserState tokeniserState31 = tokeniser30.getState();
        org.jsoup.parser.CharacterReader characterReader32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader32);
        boolean boolean34 = tokeniser33.currentNodeInHtmlNS();
        tokeniser33.createCommentPending();
        boolean boolean36 = tokeniser33.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment37 = tokeniser33.commentPending;
        tokeniser30.commentPending = comment37;
        tokeniser28.commentPending = comment37;
        org.jsoup.parser.CharacterReader characterReader40 = null;
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader40);
        boolean boolean42 = tokeniser41.currentNodeInHtmlNS();
        tokeniser41.emit('4');
        org.jsoup.parser.CharacterReader characterReader45 = null;
        org.jsoup.parser.Tokeniser tokeniser46 = new org.jsoup.parser.Tokeniser(characterReader45);
        boolean boolean47 = tokeniser46.currentNodeInHtmlNS();
        tokeniser46.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader49 = null;
        org.jsoup.parser.Tokeniser tokeniser50 = new org.jsoup.parser.Tokeniser(characterReader49);
        tokeniser50.emit('4');
        org.jsoup.parser.CharacterReader characterReader53 = null;
        org.jsoup.parser.Tokeniser tokeniser54 = new org.jsoup.parser.Tokeniser(characterReader53);
        boolean boolean55 = tokeniser54.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag57 = tokeniser54.createTagPending(true);
        tokeniser50.tagPending = tag57;
        tokeniser46.emit((org.jsoup.parser.Token) tag57);
        tokeniser41.emit((org.jsoup.parser.Token) tag57);
        tokeniser28.tagPending = tag57;
        org.jsoup.parser.CharacterReader characterReader62 = null;
        org.jsoup.parser.Tokeniser tokeniser63 = new org.jsoup.parser.Tokeniser(characterReader62);
        tokeniser63.emit("");
        org.jsoup.parser.Token.Doctype doctype66 = null;
        tokeniser63.doctypePending = doctype66;
        tokeniser63.createTempBuffer();
        tokeniser63.emit("");
        org.jsoup.parser.Token.Comment comment71 = null;
        tokeniser63.commentPending = comment71;
        org.jsoup.parser.Token.Comment comment73 = null;
        tokeniser63.commentPending = comment73;
        org.jsoup.parser.Token.Doctype doctype75 = null;
        tokeniser63.doctypePending = doctype75;
        java.lang.StringBuilder stringBuilder77 = tokeniser63.dataBuffer;
        tokeniser28.dataBuffer = stringBuilder77;
        tokeniser8.dataBuffer = stringBuilder77;
        org.jsoup.parser.TokeniserState tokeniserState80 = tokeniser8.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState25);
        org.junit.Assert.assertNotNull(tokeniserState31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(comment37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertNotNull(stringBuilder77);
        org.junit.Assert.assertEquals(stringBuilder77.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState80);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        tokeniser38.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState52 = tokeniser38.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertNotNull(tokeniserState52);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        tokeniser5.emit("");
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
        tokeniser5.emit((org.jsoup.parser.Token) tag26);
        tokeniser1.tagPending = tag26;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.createCommentPending();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(tag26);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser1.getState();
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser1.dataBuffer = stringBuilder6;
        org.jsoup.parser.TokeniserState tokeniserState8 = tokeniser1.getState();
        tokeniser1.createCommentPending();
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        tokeniser12.emit("");
        org.jsoup.parser.Token.Doctype doctype15 = null;
        tokeniser12.doctypePending = doctype15;
        tokeniser12.createTempBuffer();
        tokeniser12.emit("");
        org.jsoup.parser.Token.Comment comment20 = null;
        tokeniser12.commentPending = comment20;
        org.jsoup.parser.Token.Comment comment22 = null;
        tokeniser12.commentPending = comment22;
        org.jsoup.parser.Token.Doctype doctype24 = null;
        tokeniser12.doctypePending = doctype24;
        tokeniser12.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment27 = null;
        tokeniser12.commentPending = comment27;
        org.jsoup.parser.TokeniserState tokeniserState29 = org.jsoup.parser.TokeniserState.ScriptDataEscapedEndTagOpen;
        tokeniser12.transition(tokeniserState29);
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
        tokeniser32.tagPending = tag61;
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
        tokeniser32.dataBuffer = stringBuilder81;
        tokeniser12.dataBuffer = stringBuilder81;
        org.jsoup.parser.TokeniserState tokeniserState84 = tokeniser12.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNotNull(tokeniserState29);
        org.junit.Assert.assertNotNull(tokeniserState35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(comment41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertNotNull(stringBuilder81);
        org.junit.Assert.assertEquals(stringBuilder81.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState84);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        org.jsoup.parser.Token.Tag tag23 = tokeniser1.createTagPending(true);
        java.lang.StringBuilder stringBuilder24 = tokeniser1.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader25);
        tokeniser26.emit("");
        tokeniser26.emit("");
        org.jsoup.parser.Token.Tag tag31 = tokeniser26.tagPending;
        org.jsoup.parser.CharacterReader characterReader32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader32);
        tokeniser33.emit("");
        tokeniser33.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState37 = tokeniser33.getState();
        tokeniser33.createDoctypePending();
        org.jsoup.parser.Token.Tag tag40 = tokeniser33.createTagPending(false);
        tokeniser26.tagPending = tag40;
        boolean boolean42 = tokeniser26.isTrackErrors();
        org.jsoup.parser.CharacterReader characterReader43 = null;
        org.jsoup.parser.Tokeniser tokeniser44 = new org.jsoup.parser.Tokeniser(characterReader43);
        tokeniser44.emit('4');
        tokeniser44.createTempBuffer();
        tokeniser44.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment50 = tokeniser44.commentPending;
        org.jsoup.parser.Token.Tag tag51 = tokeniser44.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState52 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser44.transition(tokeniserState52);
        org.jsoup.parser.TokeniserState tokeniserState54 = tokeniser44.getState();
        tokeniser26.transition(tokeniserState54);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState54);
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
        org.junit.Assert.assertNull(stringBuilder24);
        org.junit.Assert.assertNull(tag31);
        org.junit.Assert.assertNotNull(tokeniserState37);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(comment50);
        org.junit.Assert.assertNull(tag51);
        org.junit.Assert.assertNotNull(tokeniserState52);
        org.junit.Assert.assertNotNull(tokeniserState54);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        boolean boolean6 = tokeniser5.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag8 = tokeniser5.createTagPending(true);
        tokeniser1.tagPending = tag8;
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser1.getState();
        tokeniser1.emitTagPending();
        org.jsoup.parser.TokeniserState tokeniserState12 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tokeniserState10);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
        org.jsoup.parser.TokeniserState tokeniserState15 = tokeniser1.getState();
        org.jsoup.parser.TokeniserState tokeniserState16 = tokeniser1.getState();
        org.jsoup.parser.Token.Tag tag17 = tokeniser1.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState18 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNull(tag17);
        org.junit.Assert.assertNotNull(tokeniserState18);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
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
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader24);
        tokeniser25.emit('4');
        tokeniser25.createTempBuffer();
        tokeniser25.setTrackErrors(false);
        tokeniser25.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState32 = org.jsoup.parser.TokeniserState.TagOpen;
        tokeniser25.eofError(tokeniserState32);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState32);
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
        org.junit.Assert.assertNotNull(tokeniserState32);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
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
        org.jsoup.parser.TokeniserState tokeniserState15 = org.jsoup.parser.TokeniserState.ScriptData;
        tokeniser1.transition(tokeniserState15);
        tokeniser1.setTrackErrors(false);
        java.lang.Class<?> wildcardClass19 = tokeniser1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        boolean boolean6 = tokeniser5.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag8 = tokeniser5.createTagPending(true);
        tokeniser1.tagPending = tag8;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.createDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token12 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
        org.jsoup.parser.TokeniserState tokeniserState37 = org.jsoup.parser.TokeniserState.Doctype;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(tokeniserState37);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.Comment;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        tokeniser2.emit("");
        tokeniser2.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState6 = tokeniser2.getState();
        java.lang.StringBuilder stringBuilder7 = null;
        tokeniser2.dataBuffer = stringBuilder7;
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        tokeniser2.createCommentPending();
        tokeniser2.setTrackErrors(true);
        org.jsoup.parser.CharacterReader characterReader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(tokeniserState6);
        org.junit.Assert.assertNotNull(tokeniserState9);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        boolean boolean6 = tokeniser5.currentNodeInHtmlNS();
        tokeniser5.createCommentPending();
        boolean boolean8 = tokeniser5.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag9 = null;
        tokeniser5.tagPending = tag9;
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
        tokeniser5.tagPending = tag22;
        tokeniser1.emit((org.jsoup.parser.Token) tag22);
        java.lang.StringBuilder stringBuilder27 = tokeniser1.dataBuffer;
        org.jsoup.parser.Token.Tag tag28 = tokeniser1.tagPending;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char31 = tokeniser1.consumeCharacterReference((java.lang.Character) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNull(stringBuilder27);
        org.junit.Assert.assertNull(tag28);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char23 = tokeniser1.consumeCharacterReference((java.lang.Character) '\ufffd', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        tokeniser1.createTempBuffer();
        org.jsoup.parser.Token.Doctype doctype8 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Comment comment9 = tokeniser1.commentPending;
        org.junit.Assert.assertNull(doctype8);
        org.junit.Assert.assertNull(comment9);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
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
        boolean boolean35 = tokeniser1.currentNodeInHtmlNS();
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(comment10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
        tokeniser1.createDoctypePending();
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
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.TokeniserState tokeniserState18 = org.jsoup.parser.TokeniserState.Doctype;
        tokeniser1.transition(tokeniserState18);
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        tokeniser21.emit('4');
        tokeniser21.createTempBuffer();
        tokeniser21.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader27);
        boolean boolean29 = tokeniser28.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag31 = tokeniser28.createTagPending(true);
        org.jsoup.parser.TokeniserState tokeniserState32 = org.jsoup.parser.TokeniserState.CommentEnd;
        tokeniser28.transition(tokeniserState32);
        tokeniser21.error(tokeniserState32);
        org.jsoup.parser.CharacterReader characterReader35 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState18.read(tokeniser21, characterReader35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(doctype15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(tokeniserState32);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Tag tag8 = tokeniser1.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        java.lang.Class<?> wildcardClass10 = tokeniser1.getClass();
        org.junit.Assert.assertNull(tag8);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
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
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        tokeniser14.emit('4');
        tokeniser14.createTempBuffer();
        tokeniser14.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        boolean boolean22 = tokeniser21.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag24 = tokeniser21.createTagPending(true);
        org.jsoup.parser.TokeniserState tokeniserState25 = org.jsoup.parser.TokeniserState.CommentEnd;
        tokeniser21.transition(tokeniserState25);
        tokeniser14.error(tokeniserState25);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(comment8);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(tokeniserState25);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        org.jsoup.parser.Token.Tag tag6 = tokeniser1.tagPending;
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser1.doctypePending = doctype7;
        boolean boolean9 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser1.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tokeniserState10);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser1.getState();
        boolean boolean8 = tokeniser1.currentNodeInHtmlNS();
        java.lang.StringBuilder stringBuilder9 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token11 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
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
        boolean boolean35 = tokeniser1.currentNodeInHtmlNS();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char38 = tokeniser1.consumeCharacterReference((java.lang.Character) '\ufffd', true);
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char14 = tokeniser1.consumeCharacterReference((java.lang.Character) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState9);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
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
        org.jsoup.parser.Token.Doctype doctype30 = tokeniser16.doctypePending;
        boolean boolean31 = tokeniser16.isTrackErrors();
        java.lang.StringBuilder stringBuilder32 = tokeniser16.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.Tokeniser tokeniser36 = new org.jsoup.parser.Tokeniser(characterReader35);
        org.jsoup.parser.TokeniserState tokeniserState37 = tokeniser36.getState();
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader38);
        boolean boolean40 = tokeniser39.currentNodeInHtmlNS();
        tokeniser39.createCommentPending();
        boolean boolean42 = tokeniser39.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment43 = tokeniser39.commentPending;
        tokeniser36.commentPending = comment43;
        tokeniser34.commentPending = comment43;
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
        tokeniser34.tagPending = tag63;
        org.jsoup.parser.CharacterReader characterReader68 = null;
        org.jsoup.parser.Tokeniser tokeniser69 = new org.jsoup.parser.Tokeniser(characterReader68);
        tokeniser69.emit("");
        org.jsoup.parser.Token.Doctype doctype72 = null;
        tokeniser69.doctypePending = doctype72;
        tokeniser69.createTempBuffer();
        tokeniser69.emit("");
        org.jsoup.parser.Token.Comment comment77 = null;
        tokeniser69.commentPending = comment77;
        org.jsoup.parser.Token.Comment comment79 = null;
        tokeniser69.commentPending = comment79;
        org.jsoup.parser.Token.Doctype doctype81 = null;
        tokeniser69.doctypePending = doctype81;
        java.lang.StringBuilder stringBuilder83 = tokeniser69.dataBuffer;
        tokeniser34.dataBuffer = stringBuilder83;
        tokeniser16.dataBuffer = stringBuilder83;
        org.jsoup.parser.CharacterReader characterReader86 = null;
        org.jsoup.parser.Tokeniser tokeniser87 = new org.jsoup.parser.Tokeniser(characterReader86);
        boolean boolean88 = tokeniser87.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype89 = tokeniser87.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState90 = tokeniser87.getState();
        tokeniser16.transition(tokeniserState90);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNull(doctype30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(stringBuilder32);
        org.junit.Assert.assertNotNull(tokeniserState37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(comment43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(tag63);
        org.junit.Assert.assertNotNull(stringBuilder83);
        org.junit.Assert.assertEquals(stringBuilder83.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNull(doctype89);
        org.junit.Assert.assertNotNull(tokeniserState90);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
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
        org.jsoup.parser.TokeniserState tokeniserState17 = org.jsoup.parser.TokeniserState.RawtextLessthanSign;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(tokeniserState17);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
        org.jsoup.parser.Token.Tag tag15 = tokeniser1.tagPending;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag15);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        tokeniser6.emit('4');
        tokeniser6.createTempBuffer();
        tokeniser6.setTrackErrors(false);
        tokeniser6.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState13 = org.jsoup.parser.TokeniserState.TagOpen;
        tokeniser6.eofError(tokeniserState13);
        tokeniser6.setTrackErrors(false);
        org.jsoup.parser.Token.Tag tag18 = tokeniser6.createTagPending(false);
        tokeniser1.tagPending = tag18;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNotNull(tag18);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser1.doctypePending = doctype7;
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Comment comment10 = tokeniser1.commentPending;
        java.lang.Class<?> wildcardClass11 = comment10.getClass();
        org.junit.Assert.assertNotNull(comment10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        org.jsoup.parser.Token.Comment comment6 = null;
        tokeniser1.commentPending = comment6;
        tokeniser1.emit("");
        org.jsoup.parser.Token.Comment comment10 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser1.doctypePending;
        org.junit.Assert.assertNull(comment10);
        org.junit.Assert.assertNull(doctype11);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        boolean boolean6 = tokeniser5.currentNodeInHtmlNS();
        tokeniser5.createCommentPending();
        boolean boolean8 = tokeniser5.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag9 = null;
        tokeniser5.tagPending = tag9;
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
        tokeniser5.tagPending = tag22;
        tokeniser1.emit((org.jsoup.parser.Token) tag22);
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader27);
        tokeniser28.emit('4');
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        boolean boolean33 = tokeniser32.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag35 = tokeniser32.createTagPending(true);
        tokeniser28.tagPending = tag35;
        tokeniser1.tagPending = tag35;
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader38);
        tokeniser39.emit('4');
        tokeniser39.createTempBuffer();
        tokeniser39.setTrackErrors(false);
        tokeniser39.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState46 = org.jsoup.parser.TokeniserState.TagOpen;
        tokeniser39.eofError(tokeniserState46);
        tokeniser39.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader50 = null;
        org.jsoup.parser.Tokeniser tokeniser51 = new org.jsoup.parser.Tokeniser(characterReader50);
        tokeniser51.emit("");
        org.jsoup.parser.Token.Doctype doctype54 = null;
        tokeniser51.doctypePending = doctype54;
        tokeniser51.createTempBuffer();
        tokeniser51.emit("");
        org.jsoup.parser.Token.Comment comment59 = null;
        tokeniser51.commentPending = comment59;
        org.jsoup.parser.Token.Comment comment61 = null;
        tokeniser51.commentPending = comment61;
        org.jsoup.parser.Token.Doctype doctype63 = null;
        tokeniser51.doctypePending = doctype63;
        java.lang.StringBuilder stringBuilder65 = tokeniser51.dataBuffer;
        tokeniser39.dataBuffer = stringBuilder65;
        tokeniser1.dataBuffer = stringBuilder65;
        org.jsoup.parser.CharacterReader characterReader68 = null;
        org.jsoup.parser.Tokeniser tokeniser69 = new org.jsoup.parser.Tokeniser(characterReader68);
        boolean boolean70 = tokeniser69.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag72 = tokeniser69.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader73 = null;
        org.jsoup.parser.Tokeniser tokeniser74 = new org.jsoup.parser.Tokeniser(characterReader73);
        boolean boolean75 = tokeniser74.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag77 = tokeniser74.createTagPending(true);
        tokeniser69.emit((org.jsoup.parser.Token) tag77);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emit((org.jsoup.parser.Token) tag77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(tokeniserState46);
        org.junit.Assert.assertNotNull(stringBuilder65);
        org.junit.Assert.assertEquals(stringBuilder65.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(tag72);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(tag77);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        tokeniser5.emit("");
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
        tokeniser5.emit((org.jsoup.parser.Token) tag26);
        tokeniser1.tagPending = tag26;
        org.jsoup.parser.CharacterReader characterReader32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader32);
        tokeniser33.emit('4');
        tokeniser33.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState37 = tokeniser33.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(tokeniserState37);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser1.doctypePending = doctype7;
        java.lang.StringBuilder stringBuilder9 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char13 = tokeniser1.consumeCharacterReference((java.lang.Character) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        boolean boolean14 = tokeniser13.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype15 = tokeniser13.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState16 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser13.transition(tokeniserState16);
        tokeniser13.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        boolean boolean21 = tokeniser20.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype22 = tokeniser20.doctypePending;
        org.jsoup.parser.Token.Tag tag23 = tokeniser20.tagPending;
        org.jsoup.parser.Token.Tag tag25 = tokeniser20.createTagPending(false);
        tokeniser13.tagPending = tag25;
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader27);
        tokeniser28.emit("");
        tokeniser28.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState32 = tokeniser28.getState();
        tokeniser13.transition(tokeniserState32);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(doctype15);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(doctype22);
        org.junit.Assert.assertNull(tag23);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(tokeniserState32);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        java.lang.StringBuilder stringBuilder19 = tokeniser1.dataBuffer;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(comment13);
        org.junit.Assert.assertNotNull(comment15);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNull(stringBuilder19);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.Token.Comment comment2 = tokeniser1.commentPending;
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser1.getState();
        tokeniser1.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype8 = tokeniser6.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser6.transition(tokeniserState9);
        org.jsoup.parser.Token.Comment comment11 = tokeniser6.commentPending;
        tokeniser6.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        boolean boolean15 = tokeniser14.currentNodeInHtmlNS();
        tokeniser14.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState17 = tokeniser14.getState();
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        tokeniser19.emit("");
        org.jsoup.parser.Token.Doctype doctype22 = null;
        tokeniser19.doctypePending = doctype22;
        tokeniser19.createTempBuffer();
        tokeniser19.emit("");
        org.jsoup.parser.Token.Comment comment27 = null;
        tokeniser19.commentPending = comment27;
        org.jsoup.parser.Token.Comment comment29 = null;
        tokeniser19.commentPending = comment29;
        org.jsoup.parser.Token.Doctype doctype31 = null;
        tokeniser19.doctypePending = doctype31;
        java.lang.StringBuilder stringBuilder33 = tokeniser19.dataBuffer;
        tokeniser14.dataBuffer = stringBuilder33;
        tokeniser6.dataBuffer = stringBuilder33;
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader36);
        tokeniser37.emit("");
        org.jsoup.parser.Token.Doctype doctype40 = null;
        tokeniser37.doctypePending = doctype40;
        org.jsoup.parser.Token.Doctype doctype42 = null;
        tokeniser37.doctypePending = doctype42;
        org.jsoup.parser.CharacterReader characterReader44 = null;
        org.jsoup.parser.Tokeniser tokeniser45 = new org.jsoup.parser.Tokeniser(characterReader44);
        tokeniser45.emit('4');
        org.jsoup.parser.CharacterReader characterReader48 = null;
        org.jsoup.parser.Tokeniser tokeniser49 = new org.jsoup.parser.Tokeniser(characterReader48);
        boolean boolean50 = tokeniser49.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag52 = tokeniser49.createTagPending(true);
        tokeniser45.tagPending = tag52;
        org.jsoup.parser.TokeniserState tokeniserState54 = tokeniser45.getState();
        org.jsoup.parser.TokeniserState tokeniserState55 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemIdentifier;
        tokeniser45.transition(tokeniserState55);
        tokeniser37.transition(tokeniserState55);
        org.jsoup.parser.CharacterReader characterReader58 = null;
        org.jsoup.parser.Tokeniser tokeniser59 = new org.jsoup.parser.Tokeniser(characterReader58);
        tokeniser59.emit("");
        org.jsoup.parser.Token.Doctype doctype62 = null;
        tokeniser59.doctypePending = doctype62;
        org.jsoup.parser.CharacterReader characterReader64 = null;
        org.jsoup.parser.Tokeniser tokeniser65 = new org.jsoup.parser.Tokeniser(characterReader64);
        org.jsoup.parser.TokeniserState tokeniserState66 = tokeniser65.getState();
        org.jsoup.parser.CharacterReader characterReader67 = null;
        org.jsoup.parser.Tokeniser tokeniser68 = new org.jsoup.parser.Tokeniser(characterReader67);
        boolean boolean69 = tokeniser68.currentNodeInHtmlNS();
        tokeniser68.createCommentPending();
        boolean boolean71 = tokeniser68.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment72 = tokeniser68.commentPending;
        tokeniser65.commentPending = comment72;
        tokeniser65.createTempBuffer();
        java.lang.StringBuilder stringBuilder75 = tokeniser65.dataBuffer;
        tokeniser59.dataBuffer = stringBuilder75;
        tokeniser37.dataBuffer = stringBuilder75;
        tokeniser6.dataBuffer = stringBuilder75;
        org.jsoup.parser.Token.Doctype doctype79 = null;
        tokeniser6.doctypePending = doctype79;
        org.jsoup.parser.CharacterReader characterReader81 = null;
        org.jsoup.parser.Tokeniser tokeniser82 = new org.jsoup.parser.Tokeniser(characterReader81);
        tokeniser82.emit("");
        org.jsoup.parser.Token.Doctype doctype85 = null;
        tokeniser82.doctypePending = doctype85;
        tokeniser82.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState88 = org.jsoup.parser.TokeniserState.BogusDoctype;
        tokeniser82.transition(tokeniserState88);
        org.jsoup.parser.CharacterReader characterReader90 = null;
        org.jsoup.parser.Tokeniser tokeniser91 = new org.jsoup.parser.Tokeniser(characterReader90);
        boolean boolean92 = tokeniser91.currentNodeInHtmlNS();
        tokeniser91.createCommentPending();
        boolean boolean94 = tokeniser91.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment95 = tokeniser91.commentPending;
        tokeniser82.emit((org.jsoup.parser.Token) comment95);
        tokeniser6.emit((org.jsoup.parser.Token) comment95);
        tokeniser1.commentPending = comment95;
        java.lang.StringBuilder stringBuilder99 = tokeniser1.dataBuffer;
        org.junit.Assert.assertNull(comment2);
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(doctype8);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNull(comment11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertEquals(stringBuilder33.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertNotNull(tokeniserState54);
        org.junit.Assert.assertNotNull(tokeniserState55);
        org.junit.Assert.assertNotNull(tokeniserState66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(comment72);
        org.junit.Assert.assertNotNull(stringBuilder75);
        org.junit.Assert.assertEquals(stringBuilder75.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState88);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(comment95);
        org.junit.Assert.assertNotNull(stringBuilder99);
        org.junit.Assert.assertEquals(stringBuilder99.toString(), "");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
        tokeniser19.emit('4');
        tokeniser19.createTempBuffer();
        tokeniser19.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment25 = tokeniser19.commentPending;
        org.jsoup.parser.Token.Tag tag26 = tokeniser19.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState27 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser19.transition(tokeniserState27);
        org.jsoup.parser.TokeniserState tokeniserState29 = tokeniser19.getState();
        tokeniser1.transition(tokeniserState29);
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        boolean boolean33 = tokeniser32.currentNodeInHtmlNS();
        tokeniser32.createCommentPending();
        tokeniser32.emitCommentPending();
        java.lang.StringBuilder stringBuilder36 = null;
        tokeniser32.dataBuffer = stringBuilder36;
        org.jsoup.parser.Token.Comment comment38 = tokeniser32.commentPending;
        org.jsoup.parser.CharacterReader characterReader39 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState29.read(tokeniser32, characterReader39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag6);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(comment25);
        org.junit.Assert.assertNull(tag26);
        org.junit.Assert.assertNotNull(tokeniserState27);
        org.junit.Assert.assertNotNull(tokeniserState29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(comment38);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
        tokeniser1.createTempBuffer();
        tokeniser1.emit('\ufffd');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token25 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype18);
        org.junit.Assert.assertNotNull(tokeniserState20);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser1.getState();
        java.lang.Class<?> wildcardClass8 = tokeniserState7.getClass();
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
        org.jsoup.parser.TokeniserState tokeniserState35 = tokeniser1.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(tokeniserState35);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        org.jsoup.parser.Token token35 = tokeniser1.read();
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader36);
        tokeniser37.emit("");
        org.jsoup.parser.CharacterReader characterReader40 = null;
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader40);
        boolean boolean42 = tokeniser41.currentNodeInHtmlNS();
        tokeniser41.createCommentPending();
        boolean boolean44 = tokeniser41.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag45 = null;
        tokeniser41.tagPending = tag45;
        org.jsoup.parser.CharacterReader characterReader47 = null;
        org.jsoup.parser.Tokeniser tokeniser48 = new org.jsoup.parser.Tokeniser(characterReader47);
        boolean boolean49 = tokeniser48.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader50 = null;
        org.jsoup.parser.Tokeniser tokeniser51 = new org.jsoup.parser.Tokeniser(characterReader50);
        tokeniser51.emit('4');
        org.jsoup.parser.CharacterReader characterReader54 = null;
        org.jsoup.parser.Tokeniser tokeniser55 = new org.jsoup.parser.Tokeniser(characterReader54);
        boolean boolean56 = tokeniser55.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag58 = tokeniser55.createTagPending(true);
        tokeniser51.tagPending = tag58;
        tokeniser48.tagPending = tag58;
        tokeniser41.tagPending = tag58;
        tokeniser37.emit((org.jsoup.parser.Token) tag58);
        tokeniser1.emit((org.jsoup.parser.Token) tag58);
        boolean boolean64 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader65 = null;
        org.jsoup.parser.Tokeniser tokeniser66 = new org.jsoup.parser.Tokeniser(characterReader65);
        tokeniser66.emit('4');
        tokeniser66.createTempBuffer();
        tokeniser66.setTrackErrors(false);
        tokeniser66.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState73 = org.jsoup.parser.TokeniserState.TagOpen;
        tokeniser66.eofError(tokeniserState73);
        tokeniser66.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader77 = null;
        org.jsoup.parser.Tokeniser tokeniser78 = new org.jsoup.parser.Tokeniser(characterReader77);
        tokeniser78.emit("");
        org.jsoup.parser.Token.Doctype doctype81 = null;
        tokeniser78.doctypePending = doctype81;
        tokeniser78.createTempBuffer();
        tokeniser78.emit("");
        org.jsoup.parser.Token.Comment comment86 = null;
        tokeniser78.commentPending = comment86;
        org.jsoup.parser.Token.Comment comment88 = null;
        tokeniser78.commentPending = comment88;
        org.jsoup.parser.Token.Doctype doctype90 = null;
        tokeniser78.doctypePending = doctype90;
        java.lang.StringBuilder stringBuilder92 = tokeniser78.dataBuffer;
        tokeniser66.dataBuffer = stringBuilder92;
        tokeniser1.dataBuffer = stringBuilder92;
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(token35);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(tokeniserState73);
        org.junit.Assert.assertNotNull(stringBuilder92);
        org.junit.Assert.assertEquals(stringBuilder92.toString(), "");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment7 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Tag tag8 = tokeniser1.tagPending;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment10 = tokeniser1.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token11 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment7);
        org.junit.Assert.assertNull(tag8);
        org.junit.Assert.assertNull(comment10);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
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
        boolean boolean15 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        boolean boolean18 = tokeniser17.currentNodeInHtmlNS();
        tokeniser17.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        tokeniser21.emit('4');
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader24);
        boolean boolean26 = tokeniser25.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag28 = tokeniser25.createTagPending(true);
        tokeniser21.tagPending = tag28;
        tokeniser17.emit((org.jsoup.parser.Token) tag28);
        org.jsoup.parser.Token.Doctype doctype31 = tokeniser17.doctypePending;
        boolean boolean32 = tokeniser17.isTrackErrors();
        tokeniser17.acknowledgeSelfClosingFlag();
        org.jsoup.parser.TokeniserState tokeniserState34 = org.jsoup.parser.TokeniserState.Doctype;
        tokeniser17.transition(tokeniserState34);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNull(doctype31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(tokeniserState34);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(comment17);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token10 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(comment8);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser1.getState();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag8 = tokeniser1.createTagPending(false);
        org.jsoup.parser.Token.Tag tag9 = tokeniser1.tagPending;
        tokeniser1.createCommentPending();
        tokeniser1.setTrackErrors(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token13 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser1.getState();
        boolean boolean8 = tokeniser1.currentNodeInHtmlNS();
        java.lang.StringBuilder stringBuilder9 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag11 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        boolean boolean14 = tokeniser13.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState15 = org.jsoup.parser.TokeniserState.TagName;
        tokeniser13.transition(tokeniserState15);
        tokeniser1.transition(tokeniserState15);
        java.lang.Class<?> wildcardClass18 = tokeniserState15.getClass();
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
        tokeniser1.setTrackErrors(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean60 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        tokeniser1.createCommentPending();
        tokeniser1.setTrackErrors(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = tokeniser1.isAppropriateEndTagToken();
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
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        tokeniser1.emitCommentPending();
        java.lang.StringBuilder stringBuilder5 = null;
        tokeniser1.dataBuffer = stringBuilder5;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        tokeniser8.emit("");
        org.jsoup.parser.Token.Doctype doctype11 = null;
        tokeniser8.doctypePending = doctype11;
        tokeniser8.createTempBuffer();
        tokeniser8.emit("");
        org.jsoup.parser.Token.Comment comment16 = null;
        tokeniser8.commentPending = comment16;
        org.jsoup.parser.Token.Tag tag19 = tokeniser8.createTagPending(false);
        tokeniser1.tagPending = tag19;
        org.jsoup.parser.TokeniserState tokeniserState21 = tokeniser1.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(tokeniserState21);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser1.doctypePending = doctype7;
        java.lang.StringBuilder stringBuilder9 = tokeniser1.dataBuffer;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token10 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
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
        org.jsoup.parser.TokeniserState tokeniserState15 = org.jsoup.parser.TokeniserState.ScriptData;
        tokeniser1.transition(tokeniserState15);
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        tokeniser20.emit("");
        tokeniser20.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState24 = tokeniser20.getState();
        tokeniser20.createDoctypePending();
        org.jsoup.parser.Token.Tag tag27 = tokeniser20.createTagPending(false);
        tokeniser1.tagPending = tag27;
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
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertNotNull(tokeniserState24);
        org.junit.Assert.assertNotNull(tag27);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
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
        java.lang.Class<?> wildcardClass78 = doctype74.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = tokeniser1.isAppropriateEndTagToken();
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
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser1.doctypePending = doctype7;
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Comment comment10 = tokeniser1.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comment10);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        org.jsoup.parser.Token.Doctype doctype18 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.ScriptDataEscapedLessthanSign;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(comment14);
        org.junit.Assert.assertNull(doctype18);
        org.junit.Assert.assertNotNull(tokeniserState19);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        boolean boolean13 = tokeniser12.currentNodeInHtmlNS();
        tokeniser12.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState15 = tokeniser12.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(comment8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(tokeniserState15);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
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
        tokeniser1.emit("hi!");
        java.lang.StringBuilder stringBuilder37 = tokeniser1.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader38);
        tokeniser39.emit("");
        org.jsoup.parser.Token.Doctype doctype42 = null;
        tokeniser39.doctypePending = doctype42;
        tokeniser39.createTempBuffer();
        tokeniser39.emit("");
        org.jsoup.parser.Token.Comment comment47 = null;
        tokeniser39.commentPending = comment47;
        org.jsoup.parser.Token.Tag tag50 = tokeniser39.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader51 = null;
        org.jsoup.parser.Tokeniser tokeniser52 = new org.jsoup.parser.Tokeniser(characterReader51);
        boolean boolean53 = tokeniser52.currentNodeInHtmlNS();
        tokeniser52.createCommentPending();
        boolean boolean55 = tokeniser52.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment56 = tokeniser52.commentPending;
        tokeniser39.commentPending = comment56;
        tokeniser39.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader59 = null;
        org.jsoup.parser.Tokeniser tokeniser60 = new org.jsoup.parser.Tokeniser(characterReader59);
        boolean boolean61 = tokeniser60.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag63 = tokeniser60.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader64 = null;
        org.jsoup.parser.Tokeniser tokeniser65 = new org.jsoup.parser.Tokeniser(characterReader64);
        boolean boolean66 = tokeniser65.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag68 = tokeniser65.createTagPending(true);
        tokeniser60.emit((org.jsoup.parser.Token) tag68);
        boolean boolean70 = tokeniser60.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader71 = null;
        org.jsoup.parser.Tokeniser tokeniser72 = new org.jsoup.parser.Tokeniser(characterReader71);
        org.jsoup.parser.Token.Comment comment73 = tokeniser72.commentPending;
        org.jsoup.parser.TokeniserState tokeniserState74 = tokeniser72.getState();
        tokeniser60.transition(tokeniserState74);
        tokeniser39.transition(tokeniserState74);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(stringBuilder37);
        org.junit.Assert.assertEquals(stringBuilder37.toString(), "");
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(comment56);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(tag63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(tag68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNull(comment73);
        org.junit.Assert.assertNotNull(tokeniserState74);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        tokeniser8.emit('4');
        tokeniser8.createTempBuffer();
        tokeniser8.setTrackErrors(false);
        tokeniser8.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype15 = null;
        tokeniser8.doctypePending = doctype15;
        tokeniser8.emit("");
        tokeniser8.createCommentPending();
        tokeniser8.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader21);
        tokeniser22.emit("");
        tokeniser22.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState26 = tokeniser22.getState();
        tokeniser22.createDoctypePending();
        org.jsoup.parser.Token.Tag tag29 = tokeniser22.createTagPending(false);
        org.jsoup.parser.Token.Tag tag30 = tokeniser22.tagPending;
        org.jsoup.parser.Token.Doctype doctype31 = tokeniser22.doctypePending;
        tokeniser8.doctypePending = doctype31;
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        tokeniser34.emit("");
        tokeniser34.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState38 = tokeniser34.getState();
        tokeniser34.createDoctypePending();
        org.jsoup.parser.Token.Tag tag41 = tokeniser34.createTagPending(false);
        org.jsoup.parser.Token.Tag tag42 = tokeniser34.tagPending;
        org.jsoup.parser.Token.Doctype doctype43 = tokeniser34.doctypePending;
        tokeniser8.doctypePending = doctype43;
        tokeniser1.doctypePending = doctype43;
        org.jsoup.parser.TokeniserState tokeniserState46 = tokeniser1.getState();
        java.lang.Class<?> wildcardClass47 = tokeniser1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNotNull(tokeniserState26);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(doctype31);
        org.junit.Assert.assertNotNull(tokeniserState38);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertNotNull(doctype43);
        org.junit.Assert.assertNotNull(tokeniserState46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        boolean boolean4 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment5 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Doctype doctype6 = tokeniser1.doctypePending;
        java.lang.StringBuilder stringBuilder7 = tokeniser1.dataBuffer;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(comment5);
        org.junit.Assert.assertNull(doctype6);
        org.junit.Assert.assertNull(stringBuilder7);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        java.lang.StringBuilder stringBuilder6 = tokeniser1.dataBuffer;
        org.junit.Assert.assertNull(stringBuilder6);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        org.jsoup.parser.TokeniserState tokeniserState7 = org.jsoup.parser.TokeniserState.TagOpen;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNotNull(tokeniserState7);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser1.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState5);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        tokeniser1.createCommentPending();
        tokeniser1.emit("");
        org.jsoup.parser.Token.Tag tag9 = tokeniser1.tagPending;
        java.lang.Class<?> wildcardClass10 = tokeniser1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNull(tag9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser1.getState();
        tokeniser1.createDoctypePending();
        tokeniser1.createTempBuffer();
        java.lang.Class<?> wildcardClass8 = tokeniser1.getClass();
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        org.jsoup.parser.Token.Doctype doctype6 = null;
        tokeniser1.doctypePending = doctype6;
        tokeniser1.setTrackErrors(true);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        org.jsoup.parser.TokeniserState tokeniserState6 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_singleQuoted;
        tokeniser1.transition(tokeniserState6);
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        tokeniser9.emit('4');
        tokeniser9.createTempBuffer();
        tokeniser9.setTrackErrors(false);
        tokeniser9.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState16 = org.jsoup.parser.TokeniserState.TagOpen;
        tokeniser9.eofError(tokeniserState16);
        tokeniser9.setTrackErrors(false);
        tokeniser9.emit(' ');
        org.jsoup.parser.Token.Tag tag22 = tokeniser9.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState23 = tokeniser9.getState();
        org.jsoup.parser.Token.Tag tag24 = tokeniser9.tagPending;
        org.jsoup.parser.CharacterReader characterReader25 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState6.read(tokeniser9, characterReader25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNotNull(tokeniserState6);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNull(tag22);
        org.junit.Assert.assertNotNull(tokeniserState23);
        org.junit.Assert.assertNull(tag24);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        tokeniser1.emitCommentPending();
        java.lang.StringBuilder stringBuilder5 = null;
        tokeniser1.dataBuffer = stringBuilder5;
        org.jsoup.parser.Token token7 = tokeniser1.read();
        java.lang.StringBuilder stringBuilder8 = null;
        tokeniser1.dataBuffer = stringBuilder8;
        org.jsoup.parser.TokeniserState tokeniserState10 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemKeyword;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(tokeniserState10);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        boolean boolean20 = tokeniser1.isTrackErrors();
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        tokeniser23.emit("");
        org.jsoup.parser.Token.Doctype doctype26 = null;
        tokeniser23.doctypePending = doctype26;
        org.jsoup.parser.Token.Doctype doctype28 = null;
        tokeniser23.doctypePending = doctype28;
        org.jsoup.parser.CharacterReader characterReader30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader30);
        tokeniser31.emit('4');
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader34);
        boolean boolean36 = tokeniser35.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag38 = tokeniser35.createTagPending(true);
        tokeniser31.tagPending = tag38;
        org.jsoup.parser.TokeniserState tokeniserState40 = tokeniser31.getState();
        org.jsoup.parser.TokeniserState tokeniserState41 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemIdentifier;
        tokeniser31.transition(tokeniserState41);
        tokeniser23.transition(tokeniserState41);
        org.jsoup.parser.TokeniserState tokeniserState44 = tokeniser23.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(tokeniserState40);
        org.junit.Assert.assertNotNull(tokeniserState41);
        org.junit.Assert.assertNotNull(tokeniserState44);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment7 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Tag tag8 = tokeniser1.tagPending;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        tokeniser11.emit("");
        tokeniser11.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState15 = tokeniser11.getState();
        tokeniser11.createDoctypePending();
        java.lang.StringBuilder stringBuilder17 = tokeniser11.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder17;
        org.jsoup.parser.TokeniserState tokeniserState19 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment7);
        org.junit.Assert.assertNull(tag8);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        org.jsoup.parser.Token.Tag tag6 = tokeniser1.tagPending;
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser1.doctypePending = doctype7;
        boolean boolean9 = tokeniser1.currentNodeInHtmlNS();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char12 = tokeniser1.consumeCharacterReference((java.lang.Character) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
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
        org.jsoup.parser.TokeniserState tokeniserState15 = org.jsoup.parser.TokeniserState.ScriptData;
        tokeniser1.transition(tokeniserState15);
        tokeniser1.setTrackErrors(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tokeniserState15);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
        org.jsoup.parser.Token.Tag tag23 = tokeniser1.createTagPending(true);
        java.lang.StringBuilder stringBuilder24 = tokeniser1.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState25 = org.jsoup.parser.TokeniserState.CdataSection;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState25);
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
        org.junit.Assert.assertNull(stringBuilder24);
        org.junit.Assert.assertNotNull(tokeniserState25);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        boolean boolean6 = tokeniser5.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag8 = tokeniser5.createTagPending(true);
        tokeniser1.tagPending = tag8;
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser1.getState();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token11 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tokeniserState10);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
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
        org.jsoup.parser.TokeniserState tokeniserState16 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(tokeniserState16);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader6);
        org.jsoup.parser.TokeniserState tokeniserState8 = tokeniser7.getState();
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        boolean boolean11 = tokeniser10.currentNodeInHtmlNS();
        tokeniser10.createCommentPending();
        boolean boolean13 = tokeniser10.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment14 = tokeniser10.commentPending;
        tokeniser7.commentPending = comment14;
        tokeniser7.createTempBuffer();
        java.lang.StringBuilder stringBuilder17 = tokeniser7.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder17;
        org.jsoup.parser.Token.Doctype doctype19 = tokeniser1.doctypePending;
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        tokeniser21.emit('4');
        tokeniser21.createTempBuffer();
        tokeniser21.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment27 = tokeniser21.commentPending;
        org.jsoup.parser.Token.Tag tag28 = tokeniser21.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState29 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser21.transition(tokeniserState29);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(comment14);
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNull(doctype19);
        org.junit.Assert.assertNull(comment27);
        org.junit.Assert.assertNull(tag28);
        org.junit.Assert.assertNotNull(tokeniserState29);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        boolean boolean4 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser1.tagPending = tag5;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        tokeniser8.emit("");
        org.jsoup.parser.Token.Doctype doctype11 = null;
        tokeniser8.doctypePending = doctype11;
        tokeniser8.createTempBuffer();
        tokeniser8.emit("");
        org.jsoup.parser.Token.Comment comment16 = null;
        tokeniser8.commentPending = comment16;
        org.jsoup.parser.Token.Comment comment18 = null;
        tokeniser8.commentPending = comment18;
        org.jsoup.parser.Token.Doctype doctype20 = null;
        tokeniser8.doctypePending = doctype20;
        tokeniser8.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment23 = null;
        tokeniser8.commentPending = comment23;
        org.jsoup.parser.Token.Doctype doctype25 = tokeniser8.doctypePending;
        tokeniser8.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState27 = org.jsoup.parser.TokeniserState.Comment;
        tokeniser8.transition(tokeniserState27);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(doctype25);
        org.junit.Assert.assertNotNull(tokeniserState27);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
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
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader36);
        tokeniser37.emit("");
        org.jsoup.parser.Token.Doctype doctype40 = null;
        tokeniser37.doctypePending = doctype40;
        org.jsoup.parser.Token.Doctype doctype42 = null;
        tokeniser37.doctypePending = doctype42;
        org.jsoup.parser.CharacterReader characterReader44 = null;
        org.jsoup.parser.Tokeniser tokeniser45 = new org.jsoup.parser.Tokeniser(characterReader44);
        tokeniser45.emit('4');
        org.jsoup.parser.CharacterReader characterReader48 = null;
        org.jsoup.parser.Tokeniser tokeniser49 = new org.jsoup.parser.Tokeniser(characterReader48);
        boolean boolean50 = tokeniser49.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag52 = tokeniser49.createTagPending(true);
        tokeniser45.tagPending = tag52;
        org.jsoup.parser.TokeniserState tokeniserState54 = tokeniser45.getState();
        org.jsoup.parser.TokeniserState tokeniserState55 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemIdentifier;
        tokeniser45.transition(tokeniserState55);
        tokeniser37.transition(tokeniserState55);
        org.jsoup.parser.TokeniserState tokeniserState58 = tokeniser37.getState();
        tokeniser1.transition(tokeniserState58);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(comment10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertNotNull(tokeniserState54);
        org.junit.Assert.assertNotNull(tokeniserState55);
        org.junit.Assert.assertNotNull(tokeniserState58);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.BogusDoctype;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        boolean boolean3 = tokeniser2.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype4 = tokeniser2.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState5 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser2.transition(tokeniserState5);
        org.jsoup.parser.Token.Tag tag7 = tokeniser2.tagPending;
        boolean boolean8 = tokeniser2.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(doctype4);
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char21 = tokeniser1.consumeCharacterReference((java.lang.Character) '\ufffd', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tag17);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
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
        java.lang.StringBuilder stringBuilder13 = tokeniser1.dataBuffer;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char16 = tokeniser1.consumeCharacterReference((java.lang.Character) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(stringBuilder13);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        boolean boolean6 = tokeniser5.currentNodeInHtmlNS();
        tokeniser5.createCommentPending();
        boolean boolean8 = tokeniser5.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag9 = null;
        tokeniser5.tagPending = tag9;
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
        tokeniser5.tagPending = tag22;
        tokeniser1.emit((org.jsoup.parser.Token) tag22);
        java.lang.StringBuilder stringBuilder27 = tokeniser1.dataBuffer;
        tokeniser1.setTrackErrors(true);
        tokeniser1.createDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNull(stringBuilder27);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token14 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState13);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
        org.jsoup.parser.Token.Doctype doctype18 = tokeniser1.doctypePending;
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        tokeniser20.emit("");
        org.jsoup.parser.Token.Doctype doctype23 = null;
        tokeniser20.doctypePending = doctype23;
        tokeniser20.createTempBuffer();
        tokeniser20.emit("");
        org.jsoup.parser.Token.Comment comment28 = null;
        tokeniser20.commentPending = comment28;
        org.jsoup.parser.Token.Comment comment30 = null;
        tokeniser20.commentPending = comment30;
        org.jsoup.parser.Token.Doctype doctype32 = null;
        tokeniser20.doctypePending = doctype32;
        java.lang.StringBuilder stringBuilder34 = tokeniser20.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder34;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(comment14);
        org.junit.Assert.assertNull(doctype18);
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        tokeniser1.createDoctypePending();
        java.lang.Class<?> wildcardClass26 = tokeniser1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = tokeniser1.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        tokeniser1.emitCommentPending();
        java.lang.StringBuilder stringBuilder5 = null;
        tokeniser1.dataBuffer = stringBuilder5;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        tokeniser8.emit("");
        org.jsoup.parser.Token.Doctype doctype11 = null;
        tokeniser8.doctypePending = doctype11;
        tokeniser8.createTempBuffer();
        tokeniser8.emit("");
        org.jsoup.parser.Token.Comment comment16 = null;
        tokeniser8.commentPending = comment16;
        org.jsoup.parser.Token.Tag tag19 = tokeniser8.createTagPending(false);
        tokeniser1.tagPending = tag19;
        org.jsoup.parser.TokeniserState tokeniserState21 = tokeniser1.getState();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char24 = tokeniser1.consumeCharacterReference((java.lang.Character) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(tokeniserState21);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        boolean boolean17 = tokeniser16.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        boolean boolean20 = tokeniser19.currentNodeInHtmlNS();
        tokeniser19.createCommentPending();
        boolean boolean22 = tokeniser19.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment23 = tokeniser19.commentPending;
        tokeniser16.commentPending = comment23;
        org.jsoup.parser.TokeniserState tokeniserState25 = tokeniser16.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(comment23);
        org.junit.Assert.assertNotNull(tokeniserState25);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.BeforeAttributeValue;
        java.lang.Class<?> wildcardClass1 = tokeniserState0.getClass();
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
        org.jsoup.parser.TokeniserState tokeniserState18 = org.jsoup.parser.TokeniserState.ScriptDataEscapedEndTagOpen;
        tokeniser1.transition(tokeniserState18);
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        org.jsoup.parser.TokeniserState tokeniserState24 = tokeniser23.getState();
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader25);
        boolean boolean27 = tokeniser26.currentNodeInHtmlNS();
        tokeniser26.createCommentPending();
        boolean boolean29 = tokeniser26.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment30 = tokeniser26.commentPending;
        tokeniser23.commentPending = comment30;
        tokeniser21.commentPending = comment30;
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        boolean boolean35 = tokeniser34.currentNodeInHtmlNS();
        tokeniser34.emit('4');
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader38);
        boolean boolean40 = tokeniser39.currentNodeInHtmlNS();
        tokeniser39.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader42 = null;
        org.jsoup.parser.Tokeniser tokeniser43 = new org.jsoup.parser.Tokeniser(characterReader42);
        tokeniser43.emit('4');
        org.jsoup.parser.CharacterReader characterReader46 = null;
        org.jsoup.parser.Tokeniser tokeniser47 = new org.jsoup.parser.Tokeniser(characterReader46);
        boolean boolean48 = tokeniser47.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag50 = tokeniser47.createTagPending(true);
        tokeniser43.tagPending = tag50;
        tokeniser39.emit((org.jsoup.parser.Token) tag50);
        tokeniser34.emit((org.jsoup.parser.Token) tag50);
        tokeniser21.tagPending = tag50;
        org.jsoup.parser.CharacterReader characterReader55 = null;
        org.jsoup.parser.Tokeniser tokeniser56 = new org.jsoup.parser.Tokeniser(characterReader55);
        tokeniser56.emit("");
        org.jsoup.parser.Token.Doctype doctype59 = null;
        tokeniser56.doctypePending = doctype59;
        tokeniser56.createTempBuffer();
        tokeniser56.emit("");
        org.jsoup.parser.Token.Comment comment64 = null;
        tokeniser56.commentPending = comment64;
        org.jsoup.parser.Token.Comment comment66 = null;
        tokeniser56.commentPending = comment66;
        org.jsoup.parser.Token.Doctype doctype68 = null;
        tokeniser56.doctypePending = doctype68;
        java.lang.StringBuilder stringBuilder70 = tokeniser56.dataBuffer;
        tokeniser21.dataBuffer = stringBuilder70;
        tokeniser1.dataBuffer = stringBuilder70;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tokeniserState24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(comment30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertNotNull(stringBuilder70);
        org.junit.Assert.assertEquals(stringBuilder70.toString(), "");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        tokeniser11.emit('4');
        tokeniser11.createTempBuffer();
        tokeniser11.setTrackErrors(false);
        tokeniser11.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype18 = null;
        tokeniser11.doctypePending = doctype18;
        tokeniser11.emit("");
        tokeniser11.createCommentPending();
        tokeniser11.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader24);
        tokeniser25.emit("");
        tokeniser25.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState29 = tokeniser25.getState();
        tokeniser25.createDoctypePending();
        org.jsoup.parser.Token.Tag tag32 = tokeniser25.createTagPending(false);
        org.jsoup.parser.Token.Tag tag33 = tokeniser25.tagPending;
        org.jsoup.parser.Token.Doctype doctype34 = tokeniser25.doctypePending;
        tokeniser11.doctypePending = doctype34;
        tokeniser1.doctypePending = doctype34;
        tokeniser1.emit('4');
        org.junit.Assert.assertNotNull(tokeniserState29);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(doctype34);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser1.getState();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser8.getState();
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser8.getState();
        tokeniser1.transition(tokeniserState10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char14 = tokeniser1.consumeCharacterReference((java.lang.Character) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState10);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
        org.jsoup.parser.CharacterReader characterReader61 = null;
        org.jsoup.parser.Tokeniser tokeniser62 = new org.jsoup.parser.Tokeniser(characterReader61);
        org.jsoup.parser.TokeniserState tokeniserState63 = tokeniser62.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(tokeniserState63);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        tokeniser1.emitCommentPending();
        java.lang.StringBuilder stringBuilder5 = null;
        tokeniser1.dataBuffer = stringBuilder5;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        tokeniser8.emit("");
        org.jsoup.parser.Token.Doctype doctype11 = null;
        tokeniser8.doctypePending = doctype11;
        tokeniser8.createTempBuffer();
        tokeniser8.emit("");
        org.jsoup.parser.Token.Comment comment16 = null;
        tokeniser8.commentPending = comment16;
        org.jsoup.parser.Token.Tag tag19 = tokeniser8.createTagPending(false);
        tokeniser1.tagPending = tag19;
        org.jsoup.parser.Token.Comment comment21 = tokeniser1.commentPending;
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
        tokeniser23.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState37 = tokeniser23.getState();
        org.jsoup.parser.Token.Doctype doctype38 = null;
        tokeniser23.doctypePending = doctype38;
        boolean boolean40 = tokeniser23.currentNodeInHtmlNS();
        tokeniser23.emit("hi!");
        java.lang.StringBuilder stringBuilder43 = tokeniser23.dataBuffer;
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
        tokeniser23.doctypePending = doctype71;
        tokeniser1.doctypePending = doctype71;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(comment21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(tokeniserState37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(stringBuilder43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(doctype47);
        org.junit.Assert.assertNotNull(tokeniserState48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(comment57);
        org.junit.Assert.assertNotNull(tokeniserState66);
        org.junit.Assert.assertNotNull(tag69);
        org.junit.Assert.assertNotNull(tag70);
        org.junit.Assert.assertNotNull(doctype71);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        tokeniser24.emit("");
        org.jsoup.parser.Token.Doctype doctype27 = null;
        tokeniser24.doctypePending = doctype27;
        tokeniser24.createTempBuffer();
        tokeniser24.emit("");
        boolean boolean32 = tokeniser24.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        tokeniser34.emit('4');
        org.jsoup.parser.CharacterReader characterReader37 = null;
        org.jsoup.parser.Tokeniser tokeniser38 = new org.jsoup.parser.Tokeniser(characterReader37);
        boolean boolean39 = tokeniser38.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag41 = tokeniser38.createTagPending(true);
        tokeniser34.tagPending = tag41;
        org.jsoup.parser.Token.Tag tag44 = tokeniser34.createTagPending(false);
        boolean boolean45 = tokeniser34.isTrackErrors();
        org.jsoup.parser.Token.Tag tag47 = tokeniser34.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader48 = null;
        org.jsoup.parser.Tokeniser tokeniser49 = new org.jsoup.parser.Tokeniser(characterReader48);
        tokeniser49.emit("");
        tokeniser49.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState53 = tokeniser49.getState();
        tokeniser49.createDoctypePending();
        org.jsoup.parser.Token.Tag tag56 = tokeniser49.createTagPending(false);
        org.jsoup.parser.Token.Tag tag57 = tokeniser49.tagPending;
        org.jsoup.parser.Token.Doctype doctype58 = tokeniser49.doctypePending;
        tokeniser34.doctypePending = doctype58;
        tokeniser24.doctypePending = doctype58;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emit((org.jsoup.parser.Token) doctype58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(doctype15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNotNull(tokeniserState53);
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertNotNull(doctype58);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        tokeniser1.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState8 = org.jsoup.parser.TokeniserState.TagOpen;
        tokeniser1.eofError(tokeniserState8);
        org.jsoup.parser.Token.Doctype doctype10 = tokeniser1.doctypePending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNull(doctype10);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
        tokeniser14.emit('4');
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        tokeniser18.emit("");
        tokeniser18.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState22 = tokeniser18.getState();
        tokeniser18.createDoctypePending();
        org.jsoup.parser.Token.Tag tag25 = tokeniser18.createTagPending(false);
        tokeniser14.tagPending = tag25;
        org.jsoup.parser.Token.Doctype doctype27 = tokeniser14.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState28 = org.jsoup.parser.TokeniserState.CommentStartDash;
        tokeniser14.transition(tokeniserState28);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState22);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNull(doctype27);
        org.junit.Assert.assertNotNull(tokeniserState28);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        boolean boolean15 = tokeniser14.currentNodeInHtmlNS();
        tokeniser14.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState17 = tokeniser14.getState();
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        tokeniser19.emit("");
        tokeniser19.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState23 = tokeniser19.getState();
        tokeniser19.createDoctypePending();
        java.lang.StringBuilder stringBuilder25 = tokeniser19.dataBuffer;
        tokeniser14.dataBuffer = stringBuilder25;
        tokeniser1.dataBuffer = stringBuilder25;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token28 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertNotNull(tokeniserState23);
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        boolean boolean18 = tokeniser17.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.TagName;
        tokeniser17.transition(tokeniserState19);
        tokeniser17.emit('\ufffd');
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        boolean boolean25 = tokeniser24.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag27 = tokeniser24.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader28);
        boolean boolean30 = tokeniser29.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag32 = tokeniser29.createTagPending(true);
        tokeniser24.emit((org.jsoup.parser.Token) tag32);
        tokeniser17.emit((org.jsoup.parser.Token) tag32);
        tokeniser1.tagPending = tag32;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char38 = tokeniser1.consumeCharacterReference((java.lang.Character) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(tag32);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser1.getState();
        tokeniser1.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        tokeniser10.emit("");
        tokeniser10.emit("");
        tokeniser10.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState16 = tokeniser10.getState();
        tokeniser10.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        boolean boolean20 = tokeniser19.currentNodeInHtmlNS();
        tokeniser19.createCommentPending();
        tokeniser19.emitCommentPending();
        java.lang.StringBuilder stringBuilder23 = null;
        tokeniser19.dataBuffer = stringBuilder23;
        org.jsoup.parser.Token.Comment comment25 = tokeniser19.commentPending;
        tokeniser10.commentPending = comment25;
        tokeniser1.commentPending = comment25;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(comment25);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser1.getState();
        boolean boolean8 = tokeniser1.isTrackErrors();
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        tokeniser10.emit("");
        org.jsoup.parser.Token.Doctype doctype13 = null;
        tokeniser10.doctypePending = doctype13;
        tokeniser10.createTempBuffer();
        tokeniser10.emit("");
        org.jsoup.parser.Token.Comment comment18 = null;
        tokeniser10.commentPending = comment18;
        org.jsoup.parser.Token.Tag tag21 = tokeniser10.createTagPending(true);
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
        tokeniser10.emit((org.jsoup.parser.Token) tag39);
        tokeniser10.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState46 = tokeniser10.getState();
        org.jsoup.parser.TokeniserState tokeniserState47 = org.jsoup.parser.TokeniserState.BeforeDoctypePublicIdentifier;
        tokeniser10.transition(tokeniserState47);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(tokeniserState46);
        org.junit.Assert.assertNotNull(tokeniserState47);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        tokeniser1.setTrackErrors(false);
        tokeniser1.createDoctypePending();
        tokeniser1.createCommentPending();
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(comment18);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.Tokeniser tokeniser36 = new org.jsoup.parser.Tokeniser(characterReader35);
        boolean boolean37 = tokeniser36.currentNodeInHtmlNS();
        tokeniser36.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState39 = tokeniser36.getState();
        org.jsoup.parser.CharacterReader characterReader40 = null;
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader40);
        tokeniser41.emit("");
        tokeniser41.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState45 = tokeniser41.getState();
        tokeniser41.createDoctypePending();
        java.lang.StringBuilder stringBuilder47 = tokeniser41.dataBuffer;
        tokeniser36.dataBuffer = stringBuilder47;
        tokeniser1.dataBuffer = stringBuilder47;
        org.jsoup.parser.CharacterReader characterReader50 = null;
        org.jsoup.parser.Tokeniser tokeniser51 = new org.jsoup.parser.Tokeniser(characterReader50);
        org.jsoup.parser.CharacterReader characterReader52 = null;
        org.jsoup.parser.Tokeniser tokeniser53 = new org.jsoup.parser.Tokeniser(characterReader52);
        org.jsoup.parser.TokeniserState tokeniserState54 = tokeniser53.getState();
        org.jsoup.parser.CharacterReader characterReader55 = null;
        org.jsoup.parser.Tokeniser tokeniser56 = new org.jsoup.parser.Tokeniser(characterReader55);
        boolean boolean57 = tokeniser56.currentNodeInHtmlNS();
        tokeniser56.createCommentPending();
        boolean boolean59 = tokeniser56.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment60 = tokeniser56.commentPending;
        tokeniser53.commentPending = comment60;
        tokeniser51.commentPending = comment60;
        tokeniser1.commentPending = comment60;
        java.lang.Class<?> wildcardClass64 = comment60.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(tokeniserState39);
        org.junit.Assert.assertNotNull(tokeniserState45);
        org.junit.Assert.assertNotNull(stringBuilder47);
        org.junit.Assert.assertEquals(stringBuilder47.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(comment60);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Tag tag7 = tokeniser1.tagPending;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNull(tag7);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser1.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState5);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        tokeniser5.emit("");
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
        tokeniser5.emit((org.jsoup.parser.Token) tag26);
        tokeniser1.tagPending = tag26;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.createCommentPending();
        tokeniser1.createDoctypePending();
        tokeniser1.emitTagPending();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(tag26);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.emit("");
        boolean boolean9 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token token10 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emit(token10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.Token.Doctype doctype5 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState6 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_singleQuoted;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype5);
        org.junit.Assert.assertNotNull(tokeniserState6);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
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
            java.lang.Character char92 = tokeniser1.consumeCharacterReference((java.lang.Character) 'a', true);
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
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        tokeniser1.emitCommentPending();
        java.lang.StringBuilder stringBuilder5 = null;
        tokeniser1.dataBuffer = stringBuilder5;
        org.jsoup.parser.Token token7 = tokeniser1.read();
        java.lang.StringBuilder stringBuilder8 = null;
        tokeniser1.dataBuffer = stringBuilder8;
        tokeniser1.emitCommentPending();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
        java.lang.StringBuilder stringBuilder21 = tokeniser1.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState22 = org.jsoup.parser.TokeniserState.ScriptData;
        tokeniser1.transition(tokeniserState22);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token24 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(stringBuilder21);
        org.junit.Assert.assertNotNull(tokeniserState22);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
        java.lang.StringBuilder stringBuilder57 = tokeniser1.dataBuffer;
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
        org.junit.Assert.assertNotNull(stringBuilder57);
        org.junit.Assert.assertEquals(stringBuilder57.toString(), "");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser1.getState();
        boolean boolean8 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.RawtextEndTagName;
        tokeniser1.transition(tokeniserState9);
        org.jsoup.parser.Tokeniser tokeniser11 = null;
        org.jsoup.parser.CharacterReader characterReader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState9.read(tokeniser11, characterReader12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(tokeniserState9);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AttributeValue_unquoted;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        tokeniser2.emit("");
        org.jsoup.parser.Token.Doctype doctype5 = null;
        tokeniser2.doctypePending = doctype5;
        tokeniser2.createTempBuffer();
        tokeniser2.emit("");
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser2.commentPending = comment10;
        org.jsoup.parser.Token.Comment comment12 = null;
        tokeniser2.commentPending = comment12;
        org.jsoup.parser.Token.Doctype doctype14 = null;
        tokeniser2.doctypePending = doctype14;
        tokeniser2.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment17 = null;
        tokeniser2.commentPending = comment17;
        org.jsoup.parser.Token.Doctype doctype19 = tokeniser2.doctypePending;
        org.jsoup.parser.Token.Tag tag20 = tokeniser2.tagPending;
        org.jsoup.parser.CharacterReader characterReader21 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNull(doctype19);
        org.junit.Assert.assertNull(tag20);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        org.jsoup.parser.Token.Doctype doctype6 = null;
        tokeniser1.doctypePending = doctype6;
        java.lang.StringBuilder stringBuilder8 = tokeniser1.dataBuffer;
        boolean boolean9 = tokeniser1.currentNodeInHtmlNS();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token10 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stringBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataEscapeStart;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        tokeniser2.emit("");
        org.jsoup.parser.Token.Doctype doctype5 = null;
        tokeniser2.doctypePending = doctype5;
        tokeniser2.createTempBuffer();
        tokeniser2.emit("");
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser2.commentPending = comment10;
        org.jsoup.parser.Token.Comment comment12 = null;
        tokeniser2.commentPending = comment12;
        org.jsoup.parser.Token.Doctype doctype14 = null;
        tokeniser2.doctypePending = doctype14;
        tokeniser2.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment17 = null;
        tokeniser2.commentPending = comment17;
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.ScriptDataEscapedEndTagOpen;
        tokeniser2.transition(tokeniserState19);
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
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader34);
        boolean boolean36 = tokeniser35.currentNodeInHtmlNS();
        tokeniser35.emit('4');
        org.jsoup.parser.CharacterReader characterReader39 = null;
        org.jsoup.parser.Tokeniser tokeniser40 = new org.jsoup.parser.Tokeniser(characterReader39);
        boolean boolean41 = tokeniser40.currentNodeInHtmlNS();
        tokeniser40.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader43 = null;
        org.jsoup.parser.Tokeniser tokeniser44 = new org.jsoup.parser.Tokeniser(characterReader43);
        tokeniser44.emit('4');
        org.jsoup.parser.CharacterReader characterReader47 = null;
        org.jsoup.parser.Tokeniser tokeniser48 = new org.jsoup.parser.Tokeniser(characterReader47);
        boolean boolean49 = tokeniser48.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag51 = tokeniser48.createTagPending(true);
        tokeniser44.tagPending = tag51;
        tokeniser40.emit((org.jsoup.parser.Token) tag51);
        tokeniser35.emit((org.jsoup.parser.Token) tag51);
        tokeniser22.tagPending = tag51;
        org.jsoup.parser.CharacterReader characterReader56 = null;
        org.jsoup.parser.Tokeniser tokeniser57 = new org.jsoup.parser.Tokeniser(characterReader56);
        tokeniser57.emit("");
        org.jsoup.parser.Token.Doctype doctype60 = null;
        tokeniser57.doctypePending = doctype60;
        tokeniser57.createTempBuffer();
        tokeniser57.emit("");
        org.jsoup.parser.Token.Comment comment65 = null;
        tokeniser57.commentPending = comment65;
        org.jsoup.parser.Token.Comment comment67 = null;
        tokeniser57.commentPending = comment67;
        org.jsoup.parser.Token.Doctype doctype69 = null;
        tokeniser57.doctypePending = doctype69;
        java.lang.StringBuilder stringBuilder71 = tokeniser57.dataBuffer;
        tokeniser22.dataBuffer = stringBuilder71;
        tokeniser2.dataBuffer = stringBuilder71;
        tokeniser2.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader76 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(tokeniserState25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(comment31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNotNull(stringBuilder71);
        org.junit.Assert.assertEquals(stringBuilder71.toString(), "");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tokeniserState15);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.Token.Doctype doctype7 = tokeniser1.doctypePending;
        tokeniser1.emit(' ');
        org.jsoup.parser.Token.Comment comment10 = tokeniser1.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype7);
        org.junit.Assert.assertNull(comment10);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype18);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        tokeniser1.emitCommentPending();
        org.jsoup.parser.Token.Comment comment5 = tokeniser1.commentPending;
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader6);
        tokeniser7.emit("");
        tokeniser7.emit("");
        org.jsoup.parser.Token.Tag tag12 = tokeniser7.tagPending;
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        tokeniser14.emit("");
        tokeniser14.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState18 = tokeniser14.getState();
        tokeniser14.createDoctypePending();
        org.jsoup.parser.Token.Tag tag21 = tokeniser14.createTagPending(false);
        tokeniser7.tagPending = tag21;
        boolean boolean23 = tokeniser7.isTrackErrors();
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader24);
        tokeniser25.emit('4');
        tokeniser25.createTempBuffer();
        tokeniser25.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment31 = tokeniser25.commentPending;
        org.jsoup.parser.Token.Tag tag32 = tokeniser25.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState33 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser25.transition(tokeniserState33);
        org.jsoup.parser.TokeniserState tokeniserState35 = tokeniser25.getState();
        tokeniser7.transition(tokeniserState35);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(comment5);
        org.junit.Assert.assertNull(tag12);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(comment31);
        org.junit.Assert.assertNull(tag32);
        org.junit.Assert.assertNotNull(tokeniserState33);
        org.junit.Assert.assertNotNull(tokeniserState35);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.emit("");
        org.jsoup.parser.Token.Tag tag6 = tokeniser1.tagPending;
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser1.doctypePending = doctype7;
        org.jsoup.parser.Token.Tag tag9 = tokeniser1.tagPending;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char12 = tokeniser1.consumeCharacterReference((java.lang.Character) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag6);
        org.junit.Assert.assertNull(tag9);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser1.doctypePending = doctype7;
        org.jsoup.parser.Token.Tag tag9 = tokeniser1.tagPending;
        java.lang.Class<?> wildcardClass10 = tokeniser1.getClass();
        org.junit.Assert.assertNull(tag9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser1.getState();
        tokeniser1.createCommentPending();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char9 = tokeniser1.consumeCharacterReference((java.lang.Character) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState5);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
        tokeniser1.emitCommentPending();
        tokeniser1.acknowledgeSelfClosingFlag();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(doctype10);
        org.junit.Assert.assertNull(tag11);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(tokeniserState20);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState7 = org.jsoup.parser.TokeniserState.BogusDoctype;
        tokeniser1.transition(tokeniserState7);
        tokeniser1.createDoctypePending();
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.Token.Tag tag9 = tokeniser1.tagPending;
        org.jsoup.parser.Token.Comment comment10 = tokeniser1.commentPending;
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        tokeniser12.emit("");
        tokeniser12.emit("");
        tokeniser12.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState18 = tokeniser12.getState();
        boolean boolean19 = tokeniser12.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState20 = org.jsoup.parser.TokeniserState.RawtextEndTagName;
        tokeniser12.transition(tokeniserState20);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag9);
        org.junit.Assert.assertNull(comment10);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(tokeniserState20);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char20 = tokeniser1.consumeCharacterReference((java.lang.Character) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag6);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        tokeniser1.createCommentPending();
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token10 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNotNull(tokeniserState9);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        tokeniser1.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        tokeniser1.acknowledgeSelfClosingFlag();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(comment10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tag30);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
        org.jsoup.parser.Token.Doctype doctype25 = tokeniser1.doctypePending;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNull(doctype22);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNull(doctype25);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
        tokeniser1.emitCommentPending();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
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
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser1.getState();
        tokeniser1.createCommentPending();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token7 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState5);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        org.jsoup.parser.Token.Doctype doctype4 = null;
        tokeniser1.doctypePending = doctype4;
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.Token.Tag tag9 = tokeniser1.tagPending;
        tokeniser1.emit("hi!");
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.TagOpen;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag9);
        org.junit.Assert.assertNotNull(tokeniserState12);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token18 = tokeniser1.read();
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
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.Token.Comment comment2 = tokeniser1.commentPending;
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser1.getState();
        tokeniser1.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype8 = tokeniser6.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser6.transition(tokeniserState9);
        org.jsoup.parser.Token.Comment comment11 = tokeniser6.commentPending;
        tokeniser6.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        boolean boolean15 = tokeniser14.currentNodeInHtmlNS();
        tokeniser14.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState17 = tokeniser14.getState();
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        tokeniser19.emit("");
        org.jsoup.parser.Token.Doctype doctype22 = null;
        tokeniser19.doctypePending = doctype22;
        tokeniser19.createTempBuffer();
        tokeniser19.emit("");
        org.jsoup.parser.Token.Comment comment27 = null;
        tokeniser19.commentPending = comment27;
        org.jsoup.parser.Token.Comment comment29 = null;
        tokeniser19.commentPending = comment29;
        org.jsoup.parser.Token.Doctype doctype31 = null;
        tokeniser19.doctypePending = doctype31;
        java.lang.StringBuilder stringBuilder33 = tokeniser19.dataBuffer;
        tokeniser14.dataBuffer = stringBuilder33;
        tokeniser6.dataBuffer = stringBuilder33;
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader36);
        tokeniser37.emit("");
        org.jsoup.parser.Token.Doctype doctype40 = null;
        tokeniser37.doctypePending = doctype40;
        org.jsoup.parser.Token.Doctype doctype42 = null;
        tokeniser37.doctypePending = doctype42;
        org.jsoup.parser.CharacterReader characterReader44 = null;
        org.jsoup.parser.Tokeniser tokeniser45 = new org.jsoup.parser.Tokeniser(characterReader44);
        tokeniser45.emit('4');
        org.jsoup.parser.CharacterReader characterReader48 = null;
        org.jsoup.parser.Tokeniser tokeniser49 = new org.jsoup.parser.Tokeniser(characterReader48);
        boolean boolean50 = tokeniser49.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag52 = tokeniser49.createTagPending(true);
        tokeniser45.tagPending = tag52;
        org.jsoup.parser.TokeniserState tokeniserState54 = tokeniser45.getState();
        org.jsoup.parser.TokeniserState tokeniserState55 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemIdentifier;
        tokeniser45.transition(tokeniserState55);
        tokeniser37.transition(tokeniserState55);
        org.jsoup.parser.CharacterReader characterReader58 = null;
        org.jsoup.parser.Tokeniser tokeniser59 = new org.jsoup.parser.Tokeniser(characterReader58);
        tokeniser59.emit("");
        org.jsoup.parser.Token.Doctype doctype62 = null;
        tokeniser59.doctypePending = doctype62;
        org.jsoup.parser.CharacterReader characterReader64 = null;
        org.jsoup.parser.Tokeniser tokeniser65 = new org.jsoup.parser.Tokeniser(characterReader64);
        org.jsoup.parser.TokeniserState tokeniserState66 = tokeniser65.getState();
        org.jsoup.parser.CharacterReader characterReader67 = null;
        org.jsoup.parser.Tokeniser tokeniser68 = new org.jsoup.parser.Tokeniser(characterReader67);
        boolean boolean69 = tokeniser68.currentNodeInHtmlNS();
        tokeniser68.createCommentPending();
        boolean boolean71 = tokeniser68.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment72 = tokeniser68.commentPending;
        tokeniser65.commentPending = comment72;
        tokeniser65.createTempBuffer();
        java.lang.StringBuilder stringBuilder75 = tokeniser65.dataBuffer;
        tokeniser59.dataBuffer = stringBuilder75;
        tokeniser37.dataBuffer = stringBuilder75;
        tokeniser6.dataBuffer = stringBuilder75;
        org.jsoup.parser.Token.Doctype doctype79 = null;
        tokeniser6.doctypePending = doctype79;
        org.jsoup.parser.CharacterReader characterReader81 = null;
        org.jsoup.parser.Tokeniser tokeniser82 = new org.jsoup.parser.Tokeniser(characterReader81);
        tokeniser82.emit("");
        org.jsoup.parser.Token.Doctype doctype85 = null;
        tokeniser82.doctypePending = doctype85;
        tokeniser82.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState88 = org.jsoup.parser.TokeniserState.BogusDoctype;
        tokeniser82.transition(tokeniserState88);
        org.jsoup.parser.CharacterReader characterReader90 = null;
        org.jsoup.parser.Tokeniser tokeniser91 = new org.jsoup.parser.Tokeniser(characterReader90);
        boolean boolean92 = tokeniser91.currentNodeInHtmlNS();
        tokeniser91.createCommentPending();
        boolean boolean94 = tokeniser91.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment95 = tokeniser91.commentPending;
        tokeniser82.emit((org.jsoup.parser.Token) comment95);
        tokeniser6.emit((org.jsoup.parser.Token) comment95);
        tokeniser1.commentPending = comment95;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.junit.Assert.assertNull(comment2);
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(doctype8);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNull(comment11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertEquals(stringBuilder33.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertNotNull(tokeniserState54);
        org.junit.Assert.assertNotNull(tokeniserState55);
        org.junit.Assert.assertNotNull(tokeniserState66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(comment72);
        org.junit.Assert.assertNotNull(stringBuilder75);
        org.junit.Assert.assertEquals(stringBuilder75.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState88);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(comment95);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        org.jsoup.parser.Token.Tag tag15 = tokeniser1.tagPending;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        tokeniser18.emit('4');
        tokeniser18.createTempBuffer();
        tokeniser18.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment24 = tokeniser18.commentPending;
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader25);
        boolean boolean27 = tokeniser26.currentNodeInHtmlNS();
        tokeniser26.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState29 = tokeniser26.getState();
        org.jsoup.parser.CharacterReader characterReader30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader30);
        tokeniser31.emit("");
        org.jsoup.parser.Token.Doctype doctype34 = null;
        tokeniser31.doctypePending = doctype34;
        tokeniser31.createTempBuffer();
        tokeniser31.emit("");
        org.jsoup.parser.Token.Comment comment39 = null;
        tokeniser31.commentPending = comment39;
        org.jsoup.parser.Token.Comment comment41 = null;
        tokeniser31.commentPending = comment41;
        org.jsoup.parser.Token.Doctype doctype43 = null;
        tokeniser31.doctypePending = doctype43;
        java.lang.StringBuilder stringBuilder45 = tokeniser31.dataBuffer;
        tokeniser26.dataBuffer = stringBuilder45;
        tokeniser18.dataBuffer = stringBuilder45;
        org.jsoup.parser.CharacterReader characterReader48 = null;
        org.jsoup.parser.Tokeniser tokeniser49 = new org.jsoup.parser.Tokeniser(characterReader48);
        boolean boolean50 = tokeniser49.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype51 = tokeniser49.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState52 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser49.transition(tokeniserState52);
        tokeniser49.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader55 = null;
        org.jsoup.parser.Tokeniser tokeniser56 = new org.jsoup.parser.Tokeniser(characterReader55);
        tokeniser56.emit('4');
        tokeniser56.createTempBuffer();
        tokeniser56.setTrackErrors(false);
        tokeniser56.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype63 = null;
        tokeniser56.doctypePending = doctype63;
        tokeniser56.emit("");
        tokeniser56.createCommentPending();
        tokeniser56.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader69 = null;
        org.jsoup.parser.Tokeniser tokeniser70 = new org.jsoup.parser.Tokeniser(characterReader69);
        tokeniser70.emit("");
        tokeniser70.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState74 = tokeniser70.getState();
        tokeniser70.createDoctypePending();
        org.jsoup.parser.Token.Tag tag77 = tokeniser70.createTagPending(false);
        org.jsoup.parser.Token.Tag tag78 = tokeniser70.tagPending;
        org.jsoup.parser.Token.Doctype doctype79 = tokeniser70.doctypePending;
        tokeniser56.doctypePending = doctype79;
        org.jsoup.parser.CharacterReader characterReader81 = null;
        org.jsoup.parser.Tokeniser tokeniser82 = new org.jsoup.parser.Tokeniser(characterReader81);
        tokeniser82.emit("");
        tokeniser82.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState86 = tokeniser82.getState();
        tokeniser82.createDoctypePending();
        org.jsoup.parser.Token.Tag tag89 = tokeniser82.createTagPending(false);
        org.jsoup.parser.Token.Tag tag90 = tokeniser82.tagPending;
        org.jsoup.parser.Token.Doctype doctype91 = tokeniser82.doctypePending;
        tokeniser56.doctypePending = doctype91;
        tokeniser49.doctypePending = doctype91;
        tokeniser18.doctypePending = doctype91;
        tokeniser1.doctypePending = doctype91;
        org.junit.Assert.assertNull(tag15);
        org.junit.Assert.assertNull(comment24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(tokeniserState29);
        org.junit.Assert.assertNotNull(stringBuilder45);
        org.junit.Assert.assertEquals(stringBuilder45.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(doctype51);
        org.junit.Assert.assertNotNull(tokeniserState52);
        org.junit.Assert.assertNotNull(tokeniserState74);
        org.junit.Assert.assertNotNull(tag77);
        org.junit.Assert.assertNotNull(tag78);
        org.junit.Assert.assertNotNull(doctype79);
        org.junit.Assert.assertNotNull(tokeniserState86);
        org.junit.Assert.assertNotNull(tag89);
        org.junit.Assert.assertNotNull(tag90);
        org.junit.Assert.assertNotNull(doctype91);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        tokeniser17.emit("");
        org.jsoup.parser.Token.Doctype doctype20 = null;
        tokeniser17.doctypePending = doctype20;
        tokeniser17.createTempBuffer();
        tokeniser17.emit("");
        boolean boolean25 = tokeniser17.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader26 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState15.read(tokeniser17, characterReader26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNull(tag14);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
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
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.Tokeniser tokeniser36 = new org.jsoup.parser.Tokeniser(characterReader35);
        boolean boolean37 = tokeniser36.currentNodeInHtmlNS();
        tokeniser36.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState39 = tokeniser36.getState();
        org.jsoup.parser.CharacterReader characterReader40 = null;
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader40);
        tokeniser41.emit("");
        tokeniser41.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState45 = tokeniser41.getState();
        tokeniser41.createDoctypePending();
        java.lang.StringBuilder stringBuilder47 = tokeniser41.dataBuffer;
        tokeniser36.dataBuffer = stringBuilder47;
        tokeniser1.dataBuffer = stringBuilder47;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(tokeniserState39);
        org.junit.Assert.assertNotNull(tokeniserState45);
        org.junit.Assert.assertNotNull(stringBuilder47);
        org.junit.Assert.assertEquals(stringBuilder47.toString(), "");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        boolean boolean4 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser1.tagPending = tag5;
        org.jsoup.parser.Token.Comment comment7 = null;
        tokeniser1.commentPending = comment7;
        tokeniser1.emit("");
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        boolean boolean13 = tokeniser12.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype14 = tokeniser12.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState15 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser12.transition(tokeniserState15);
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        boolean boolean19 = tokeniser18.currentNodeInHtmlNS();
        tokeniser18.createCommentPending();
        tokeniser18.emitCommentPending();
        java.lang.StringBuilder stringBuilder22 = null;
        tokeniser18.dataBuffer = stringBuilder22;
        org.jsoup.parser.Token.Comment comment24 = tokeniser18.commentPending;
        tokeniser12.commentPending = comment24;
        tokeniser12.setTrackErrors(false);
        tokeniser12.createDoctypePending();
        tokeniser12.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader30);
        tokeniser31.emit('4');
        tokeniser31.createTempBuffer();
        tokeniser31.emit('\ufffd');
        java.lang.StringBuilder stringBuilder37 = tokeniser31.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader38);
        boolean boolean40 = tokeniser39.currentNodeInHtmlNS();
        tokeniser39.createCommentPending();
        boolean boolean42 = tokeniser39.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment43 = tokeniser39.commentPending;
        tokeniser31.commentPending = comment43;
        tokeniser12.commentPending = comment43;
        org.jsoup.parser.Token.Tag tag47 = tokeniser12.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader48 = null;
        org.jsoup.parser.Tokeniser tokeniser49 = new org.jsoup.parser.Tokeniser(characterReader48);
        boolean boolean50 = tokeniser49.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader51 = null;
        org.jsoup.parser.Tokeniser tokeniser52 = new org.jsoup.parser.Tokeniser(characterReader51);
        tokeniser52.emit('4');
        org.jsoup.parser.CharacterReader characterReader55 = null;
        org.jsoup.parser.Tokeniser tokeniser56 = new org.jsoup.parser.Tokeniser(characterReader55);
        boolean boolean57 = tokeniser56.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag59 = tokeniser56.createTagPending(true);
        tokeniser52.tagPending = tag59;
        tokeniser49.tagPending = tag59;
        org.jsoup.parser.TokeniserState tokeniserState62 = org.jsoup.parser.TokeniserState.CommentEndDash;
        tokeniser49.transition(tokeniserState62);
        org.jsoup.parser.CharacterReader characterReader64 = null;
        org.jsoup.parser.Tokeniser tokeniser65 = new org.jsoup.parser.Tokeniser(characterReader64);
        boolean boolean66 = tokeniser65.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype67 = tokeniser65.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState68 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser65.transition(tokeniserState68);
        tokeniser49.transition(tokeniserState68);
        tokeniser12.eofError(tokeniserState68);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(doctype14);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(comment24);
        org.junit.Assert.assertNotNull(stringBuilder37);
        org.junit.Assert.assertEquals(stringBuilder37.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(comment43);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(tag59);
        org.junit.Assert.assertNotNull(tokeniserState62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNull(doctype67);
        org.junit.Assert.assertNotNull(tokeniserState68);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser1.getState();
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader6);
        boolean boolean8 = tokeniser7.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype9 = tokeniser7.doctypePending;
        org.jsoup.parser.Token.Tag tag10 = tokeniser7.tagPending;
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
        org.jsoup.parser.TokeniserState tokeniserState25 = org.jsoup.parser.TokeniserState.CommentEndDash;
        tokeniser12.transition(tokeniserState25);
        tokeniser7.transition(tokeniserState25);
        org.jsoup.parser.Token.Doctype doctype28 = tokeniser7.doctypePending;
        org.jsoup.parser.Token.Doctype doctype29 = tokeniser7.doctypePending;
        org.jsoup.parser.CharacterReader characterReader30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader30);
        boolean boolean32 = tokeniser31.currentNodeInHtmlNS();
        tokeniser31.createCommentPending();
        tokeniser31.emitCommentPending();
        java.lang.StringBuilder stringBuilder35 = null;
        tokeniser31.dataBuffer = stringBuilder35;
        org.jsoup.parser.Token.Comment comment37 = tokeniser31.commentPending;
        tokeniser7.commentPending = comment37;
        tokeniser7.createCommentPending();
        tokeniser7.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState41 = org.jsoup.parser.TokeniserState.AfterAttributeValue_quoted;
        tokeniser7.transition(tokeniserState41);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(doctype9);
        org.junit.Assert.assertNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(tokeniserState25);
        org.junit.Assert.assertNull(doctype28);
        org.junit.Assert.assertNull(doctype29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(comment37);
        org.junit.Assert.assertNotNull(tokeniserState41);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState11);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        tokeniser1.emitCommentPending();
        java.lang.StringBuilder stringBuilder5 = null;
        tokeniser1.dataBuffer = stringBuilder5;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        tokeniser8.emit("");
        org.jsoup.parser.Token.Doctype doctype11 = null;
        tokeniser8.doctypePending = doctype11;
        tokeniser8.createTempBuffer();
        tokeniser8.emit("");
        org.jsoup.parser.Token.Comment comment16 = null;
        tokeniser8.commentPending = comment16;
        org.jsoup.parser.Token.Tag tag19 = tokeniser8.createTagPending(false);
        tokeniser1.tagPending = tag19;
        org.jsoup.parser.Token.Tag tag22 = tokeniser1.createTagPending(false);
        tokeniser1.emit("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(tag22);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser1.getState();
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser1.dataBuffer = stringBuilder6;
        tokeniser1.setTrackErrors(true);
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        boolean boolean4 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char8 = tokeniser1.consumeCharacterReference((java.lang.Character) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag6 = tokeniser1.createTagPending(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        org.jsoup.parser.TokeniserState tokeniserState18 = org.jsoup.parser.TokeniserState.ScriptDataEscapedEndTagOpen;
        tokeniser1.transition(tokeniserState18);
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        org.jsoup.parser.TokeniserState tokeniserState24 = tokeniser23.getState();
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader25);
        boolean boolean27 = tokeniser26.currentNodeInHtmlNS();
        tokeniser26.createCommentPending();
        boolean boolean29 = tokeniser26.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment30 = tokeniser26.commentPending;
        tokeniser23.commentPending = comment30;
        tokeniser21.commentPending = comment30;
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        boolean boolean35 = tokeniser34.currentNodeInHtmlNS();
        tokeniser34.emit('4');
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader38);
        boolean boolean40 = tokeniser39.currentNodeInHtmlNS();
        tokeniser39.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader42 = null;
        org.jsoup.parser.Tokeniser tokeniser43 = new org.jsoup.parser.Tokeniser(characterReader42);
        tokeniser43.emit('4');
        org.jsoup.parser.CharacterReader characterReader46 = null;
        org.jsoup.parser.Tokeniser tokeniser47 = new org.jsoup.parser.Tokeniser(characterReader46);
        boolean boolean48 = tokeniser47.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag50 = tokeniser47.createTagPending(true);
        tokeniser43.tagPending = tag50;
        tokeniser39.emit((org.jsoup.parser.Token) tag50);
        tokeniser34.emit((org.jsoup.parser.Token) tag50);
        tokeniser21.tagPending = tag50;
        org.jsoup.parser.CharacterReader characterReader55 = null;
        org.jsoup.parser.Tokeniser tokeniser56 = new org.jsoup.parser.Tokeniser(characterReader55);
        tokeniser56.emit("");
        org.jsoup.parser.Token.Doctype doctype59 = null;
        tokeniser56.doctypePending = doctype59;
        tokeniser56.createTempBuffer();
        tokeniser56.emit("");
        org.jsoup.parser.Token.Comment comment64 = null;
        tokeniser56.commentPending = comment64;
        org.jsoup.parser.Token.Comment comment66 = null;
        tokeniser56.commentPending = comment66;
        org.jsoup.parser.Token.Doctype doctype68 = null;
        tokeniser56.doctypePending = doctype68;
        java.lang.StringBuilder stringBuilder70 = tokeniser56.dataBuffer;
        tokeniser21.dataBuffer = stringBuilder70;
        tokeniser1.dataBuffer = stringBuilder70;
        org.jsoup.parser.TokeniserState tokeniserState73 = tokeniser1.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tokeniserState24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(comment30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertNotNull(stringBuilder70);
        org.junit.Assert.assertEquals(stringBuilder70.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState73);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = tokeniser1.getState();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState4);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
        tokeniser19.emit('4');
        tokeniser19.createTempBuffer();
        tokeniser19.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment25 = tokeniser19.commentPending;
        org.jsoup.parser.Token.Tag tag26 = tokeniser19.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState27 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser19.transition(tokeniserState27);
        org.jsoup.parser.TokeniserState tokeniserState29 = tokeniser19.getState();
        tokeniser1.transition(tokeniserState29);
        java.lang.StringBuilder stringBuilder31 = tokeniser1.dataBuffer;
        org.junit.Assert.assertNull(tag6);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(comment25);
        org.junit.Assert.assertNull(tag26);
        org.junit.Assert.assertNotNull(tokeniserState27);
        org.junit.Assert.assertNotNull(tokeniserState29);
        org.junit.Assert.assertNull(stringBuilder31);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        tokeniser26.emit("");
        tokeniser26.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState32 = tokeniser26.getState();
        boolean boolean33 = tokeniser26.currentNodeInHtmlNS();
        java.lang.StringBuilder stringBuilder34 = tokeniser26.dataBuffer;
        tokeniser26.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag36 = tokeniser26.tagPending;
        org.jsoup.parser.CharacterReader characterReader37 = null;
        org.jsoup.parser.Tokeniser tokeniser38 = new org.jsoup.parser.Tokeniser(characterReader37);
        boolean boolean39 = tokeniser38.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState40 = org.jsoup.parser.TokeniserState.TagName;
        tokeniser38.transition(tokeniserState40);
        tokeniser26.transition(tokeniserState40);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState40);
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
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(tokeniserState32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
        org.junit.Assert.assertNull(tag36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(tokeniserState40);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        tokeniser1.emitCommentPending();
        java.lang.StringBuilder stringBuilder5 = null;
        tokeniser1.dataBuffer = stringBuilder5;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        tokeniser8.emit("");
        org.jsoup.parser.Token.Doctype doctype11 = null;
        tokeniser8.doctypePending = doctype11;
        tokeniser8.createTempBuffer();
        tokeniser8.emit("");
        org.jsoup.parser.Token.Comment comment16 = null;
        tokeniser8.commentPending = comment16;
        org.jsoup.parser.Token.Tag tag19 = tokeniser8.createTagPending(false);
        tokeniser1.tagPending = tag19;
        org.jsoup.parser.Token.Comment comment21 = tokeniser1.commentPending;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(comment21);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        org.jsoup.parser.Token.Doctype doctype4 = tokeniser1.doctypePending;
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader6);
        tokeniser7.emit('4');
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        boolean boolean12 = tokeniser11.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag14 = tokeniser11.createTagPending(true);
        tokeniser7.tagPending = tag14;
        tokeniser1.tagPending = tag14;
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        tokeniser18.emit("");
        tokeniser18.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState22 = tokeniser18.getState();
        java.lang.StringBuilder stringBuilder23 = null;
        tokeniser18.dataBuffer = stringBuilder23;
        tokeniser18.setTrackErrors(true);
        boolean boolean27 = tokeniser18.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState28 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_singleQuoted;
        tokeniser18.transition(tokeniserState28);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(tokeniserState22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(tokeniserState28);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        java.lang.StringBuilder stringBuilder18 = tokeniser1.dataBuffer;
        boolean boolean19 = tokeniser1.isTrackErrors();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(doctype15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(stringBuilder17);
        org.junit.Assert.assertNull(stringBuilder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        tokeniser1.transition(tokeniserState4);
        org.jsoup.parser.TokeniserState tokeniserState6 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_singleQuoted;
        tokeniser1.transition(tokeniserState6);
        tokeniser1.createDoctypePending();
        java.lang.StringBuilder stringBuilder9 = tokeniser1.dataBuffer;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNotNull(tokeniserState6);
        org.junit.Assert.assertNull(stringBuilder9);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.RawtextLessthanSign;
        java.lang.Class<?> wildcardClass1 = tokeniserState0.getClass();
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        java.lang.Class<?> wildcardClass15 = comment13.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(comment13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNull(stringBuilder14);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        tokeniser1.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState8 = org.jsoup.parser.TokeniserState.TagOpen;
        tokeniser1.eofError(tokeniserState8);
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        tokeniser11.emit("");
        tokeniser11.emit("");
        tokeniser11.createTempBuffer();
        org.jsoup.parser.Token.Tag tag18 = tokeniser11.createTagPending(true);
        tokeniser11.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader21 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState8.read(tokeniser11, characterReader21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNotNull(tag18);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
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
        org.jsoup.parser.TokeniserState tokeniserState70 = tokeniser34.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(tag63);
        org.junit.Assert.assertNotNull(tokeniserState70);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        tokeniser1.createTempBuffer();
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser1.doctypePending = doctype7;
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Comment comment10 = tokeniser1.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comment10);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        boolean boolean2 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emit('4');
        org.jsoup.parser.Token.Comment comment5 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Tag tag7 = tokeniser1.createTagPending(false);
        boolean boolean8 = tokeniser1.isTrackErrors();
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.BogusDoctype;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(tokeniserState9);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
        tokeniser1.setTrackErrors(false);
        tokeniser1.emitTagPending();
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(comment18);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
        tokeniser22.emit('4');
        tokeniser22.createTempBuffer();
        tokeniser22.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment28 = tokeniser22.commentPending;
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader29);
        boolean boolean31 = tokeniser30.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag33 = tokeniser30.createTagPending(true);
        tokeniser22.emit((org.jsoup.parser.Token) tag33);
        tokeniser1.emit((org.jsoup.parser.Token) tag33);
        tokeniser1.setTrackErrors(true);
        boolean boolean38 = tokeniser1.isTrackErrors();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(comment28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
            boolean boolean17 = tokeniser1.isAppropriateEndTagToken();
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
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit("");
        tokeniser1.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        boolean boolean7 = tokeniser6.currentNodeInHtmlNS();
        tokeniser6.createCommentPending();
        boolean boolean9 = tokeniser6.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment10 = tokeniser6.commentPending;
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser6.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState12 = tokeniser6.getState();
        tokeniser1.transition(tokeniserState12);
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        boolean boolean16 = tokeniser15.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag18 = tokeniser15.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        tokeniser20.emit('4');
        tokeniser20.createTempBuffer();
        tokeniser20.setTrackErrors(false);
        tokeniser20.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState27 = org.jsoup.parser.TokeniserState.TagOpen;
        tokeniser20.eofError(tokeniserState27);
        tokeniser20.setTrackErrors(false);
        org.jsoup.parser.Token.Tag tag32 = tokeniser20.createTagPending(false);
        tokeniser15.tagPending = tag32;
        org.jsoup.parser.TokeniserState tokeniserState34 = tokeniser15.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(comment10);
        org.junit.Assert.assertNull(doctype11);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(tokeniserState27);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNotNull(tokeniserState34);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('4');
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        boolean boolean6 = tokeniser5.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag8 = tokeniser5.createTagPending(true);
        tokeniser1.tagPending = tag8;
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser1.getState();
        tokeniser1.emitTagPending();
        org.jsoup.parser.Token.Comment comment12 = tokeniser1.commentPending;
        tokeniser1.emit("");
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
        tokeniser16.createTempBuffer();
        java.lang.StringBuilder stringBuilder26 = tokeniser16.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState27 = tokeniser16.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNull(comment12);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(comment23);
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState27);
    }
}

