package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;

public class TokeniserStateTest {

    private Tokeniser createTokeniser(String html) {
        CharacterReader reader = new CharacterReader(html);
        return new Tokeniser(reader, ParseErrorList.tracking(100));
    }

    @Test
    public void data_givenAmpersand_shouldAdvanceToCharacterReferenceInData() {
        CharacterReader r = new CharacterReader("&test");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.Data.read(t, r);
        Assert.assertEquals(TokeniserState.CharacterReferenceInData, t.getState());
    }

    @Test
    public void data_givenLessThan_shouldAdvanceToTagOpen() {
        CharacterReader r = new CharacterReader("<test");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.Data.read(t, r);
        Assert.assertEquals(TokeniserState.TagOpen, t.getState());
    }

    @Test
    public void data_givenNullChar_shouldEmitReplacementAndError() {
        CharacterReader r = new CharacterReader("\u0000");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.Data.read(t, r);
        Assert.assertFalse(t.getErrors().isEmpty());
    }

    @Test
    public void data_givenEof_shouldEmitEofToken() {
        CharacterReader r = new CharacterReader("");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.Data.read(t, r);
        Token token = t.read();
        Assert.assertNotNull(token);
        Assert.assertTrue(token.isEOF());
    }

    @Test
    public void data_givenPlainText_shouldEmitData() {
        CharacterReader r = new CharacterReader("hello world<");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.Data.read(t, r);
        Token token = t.read();
        Assert.assertTrue(token.isCharacter());
        Assert.assertEquals("hello world", ((Token.Character) token).getData());
    }

    @Test
    public void characterReferenceInData_givenValidRef_shouldConsumeAndReturnToData() {
        CharacterReader r = new CharacterReader("&amp;rest");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        r.consume(); // consume '&'
        TokeniserState.CharacterReferenceInData.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void characterReferenceInData_givenInvalidRef_shouldEmitAmpersandAndReturnToData() {
        CharacterReader r = new CharacterReader("notARef;");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.CharacterReferenceInData.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void rcdata_givenAmpersand_shouldAdvanceToCharacterReferenceInRcdata() {
        CharacterReader r = new CharacterReader("&");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.Rcdata.read(t, r);
        Assert.assertEquals(TokeniserState.CharacterReferenceInRcdata, t.getState());
    }

    @Test
    public void rcdata_givenLessThan_shouldAdvanceToRcdataLessthanSign() {
        CharacterReader r = new CharacterReader("<");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.Rcdata.read(t, r);
        Assert.assertEquals(TokeniserState.RcdataLessthanSign, t.getState());
    }

    @Test
    public void rcdata_givenNullChar_shouldEmitReplacementChar() {
        CharacterReader r = new CharacterReader("\u0000");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.Rcdata.read(t, r);
        Assert.assertFalse(t.getErrors().isEmpty());
    }

    @Test
    public void rcdata_givenEof_shouldEmitEof() {
        CharacterReader r = new CharacterReader("");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.Rcdata.read(t, r);
        Token token = t.read();
        Assert.assertTrue(token.isEOF());
    }

    @Test
    public void rcdata_givenText_shouldEmitData() {
        CharacterReader r = new CharacterReader("plain rcdata<");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.Rcdata.read(t, r);
        Token token = t.read();
        Assert.assertTrue(token.isCharacter());
        Assert.assertEquals("plain rcdata", ((Token.Character) token).getData());
    }

    @Test
    public void characterReferenceInRcdata_givenRef_shouldTransitionToRcdata() {
        CharacterReader r = new CharacterReader("&lt;");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        r.consume();
        TokeniserState.CharacterReferenceInRcdata.read(t, r);
        Assert.assertEquals(TokeniserState.Rcdata, t.getState());
    }

    @Test
    public void rawtext_givenVariousInputs_shouldHandleBranches() {
        CharacterReader r1 = new CharacterReader("<");
        Tokeniser t1 = new Tokeniser(r1, ParseErrorList.tracking(10));
        TokeniserState.Rawtext.read(t1, r1);
        Assert.assertEquals(TokeniserState.RawtextLessthanSign, t1.getState());

        CharacterReader r2 = new CharacterReader("\u0000");
        Tokeniser t2 = new Tokeniser(r2, ParseErrorList.tracking(10));
        TokeniserState.Rawtext.read(t2, r2);
        Assert.assertFalse(t2.getErrors().isEmpty());

        CharacterReader r3 = new CharacterReader("");
        Tokeniser t3 = new Tokeniser(r3, ParseErrorList.tracking(10));
        TokeniserState.Rawtext.read(t3, r3);
        Assert.assertTrue(t3.read().isEOF());

        CharacterReader r4 = new CharacterReader("rawtext data<");
        Tokeniser t4 = new Tokeniser(r4, ParseErrorList.tracking(10));
        TokeniserState.Rawtext.read(t4, r4);
        Token token = t4.read();
        Assert.assertEquals("rawtext data", ((Token.Character) token).getData());
    }

    @Test
    public void scriptData_givenVariousInputs_shouldHandleBranches() {
        CharacterReader r1 = new CharacterReader("<");
        Tokeniser t1 = new Tokeniser(r1, ParseErrorList.tracking(10));
        TokeniserState.ScriptData.read(t1, r1);
        Assert.assertEquals(TokeniserState.ScriptDataLessthanSign, t1.getState());

        CharacterReader r2 = new CharacterReader("\u0000");
        Tokeniser t2 = new Tokeniser(r2, ParseErrorList.tracking(10));
        TokeniserState.ScriptData.read(t2, r2);
        Assert.assertFalse(t2.getErrors().isEmpty());

        CharacterReader r3 = new CharacterReader("");
        Tokeniser t3 = new Tokeniser(r3, ParseErrorList.tracking(10));
        TokeniserState.ScriptData.read(t3, r3);
        Assert.assertTrue(t3.read().isEOF());

        CharacterReader r4 = new CharacterReader("script content<");
        Tokeniser t4 = new Tokeniser(r4, ParseErrorList.tracking(10));
        TokeniserState.ScriptData.read(t4, r4);
        Token token = t4.read();
        Assert.assertEquals("script content", ((Token.Character) token).getData());
    }

    @Test
    public void plaintext_givenInputs_shouldHandleBranches() {
        CharacterReader r1 = new CharacterReader("\u0000");
        Tokeniser t1 = new Tokeniser(r1, ParseErrorList.tracking(10));
        TokeniserState.PLAINTEXT.read(t1, r1);
        Assert.assertFalse(t1.getErrors().isEmpty());

        CharacterReader r2 = new CharacterReader("");
        Tokeniser t2 = new Tokeniser(r2, ParseErrorList.tracking(10));
        TokeniserState.PLAINTEXT.read(t2, r2);
        Assert.assertTrue(t2.read().isEOF());

        CharacterReader r3 = new CharacterReader("plain text content");
        Tokeniser t3 = new Tokeniser(r3, ParseErrorList.tracking(10));
        TokeniserState.PLAINTEXT.read(t3, r3);
        Token token = t3.read();
        Assert.assertEquals("plain text content", ((Token.Character) token).getData());
    }

    @Test
    public void tagOpen_givenExclamation_shouldAdvanceToMarkupDeclarationOpen() {
        CharacterReader r = new CharacterReader("!");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.TagOpen.read(t, r);
        Assert.assertEquals(TokeniserState.MarkupDeclarationOpen, t.getState());
    }

    @Test
    public void tagOpen_givenSlash_shouldAdvanceToEndTagOpen() {
        CharacterReader r = new CharacterReader("/");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.TagOpen.read(t, r);
        Assert.assertEquals(TokeniserState.EndTagOpen, t.getState());
    }

    @Test
    public void tagOpen_givenQuestionMark_shouldAdvanceToBogusComment() {
        CharacterReader r = new CharacterReader("?");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.TagOpen.read(t, r);
        Assert.assertEquals(TokeniserState.BogusComment, t.getState());
    }

    @Test
    public void tagOpen_givenLetter_shouldTransitionToTagName() {
        CharacterReader r = new CharacterReader("a");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.TagOpen.read(t, r);
        Assert.assertEquals(TokeniserState.TagName, t.getState());
        Assert.assertNotNull(t.tagPending);
    }

    @Test
    public void tagOpen_givenNonLetter_shouldErrorAndTransitionToData() {
        CharacterReader r = new CharacterReader("1");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.TagOpen.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
        Assert.assertFalse(t.getErrors().isEmpty());
    }

    @Test
    public void endTagOpen_givenEmpty_shouldErrorAndTransitionToData() {
        CharacterReader r = new CharacterReader("");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.EndTagOpen.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
        Assert.assertFalse(t.getErrors().isEmpty());
    }

    @Test
    public void endTagOpen_givenLetter_shouldTransitionToTagName() {
        CharacterReader r = new CharacterReader("b");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.EndTagOpen.read(t, r);
        Assert.assertEquals(TokeniserState.TagName, t.getState());
    }

    @Test
    public void endTagOpen_givenGreaterThan_shouldErrorAndAdvanceToData() {
        CharacterReader r = new CharacterReader(">");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.EndTagOpen.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
        Assert.assertFalse(t.getErrors().isEmpty());
    }

    @Test
    public void endTagOpen_givenOther_shouldErrorAndAdvanceToBogusComment() {
        CharacterReader r = new CharacterReader("=");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.EndTagOpen.read(t, r);
        Assert.assertEquals(TokeniserState.BogusComment, t.getState());
        Assert.assertFalse(t.getErrors().isEmpty());
    }

    @Test
    public void tagName_givenWhitespace_shouldTransitionToBeforeAttributeName() {
        char[] spaces = new char[]{'\t', '\n', '\r', '\f', ' '};
        for (int i = 0; i < spaces.length; i++) {
            CharacterReader r = new CharacterReader("div" + spaces[i]);
            Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
            t.createTagPending(true);
            TokeniserState.TagName.read(t, r);
            Assert.assertEquals(TokeniserState.BeforeAttributeName, t.getState());
        }
    }

    @Test
    public void tagName_givenSlash_shouldTransitionToSelfClosingStartTag() {
        CharacterReader r = new CharacterReader("img/");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true);
        TokeniserState.TagName.read(t, r);
        Assert.assertEquals(TokeniserState.SelfClosingStartTag, t.getState());
    }

    @Test
    public void tagName_givenGreaterThan_shouldEmitTagAndTransitionToData() {
        CharacterReader r = new CharacterReader("p>");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true);
        TokeniserState.TagName.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void tagName_givenNullChar_shouldAppendReplacementChar() {
        CharacterReader r = new CharacterReader("tag\u0000");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true);
        TokeniserState.TagName.read(t, r);
        Assert.assertTrue(t.tagPending.name().indexOf("\uFFFD") >= 0);
    }

    @Test
    public void tagName_givenEof_shouldErrorAndTransitionToData() {
        CharacterReader r = new CharacterReader("div");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true);
        TokeniserState.TagName.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
        Assert.assertFalse(t.getErrors().isEmpty());
    }

    @Test
    public void tagName_givenOtherChar_shouldAppendChar() {
        CharacterReader r = new CharacterReader("div:custom");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true);
        TokeniserState.TagName.read(t, r);
        Assert.assertTrue(t.tagPending.name().startsWith("div"));
    }

    @Test
    public void rcdataLessthanSign_givenSlash_shouldAdvanceToRCDATAEndTagOpen() {
        CharacterReader r = new CharacterReader("/title");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.RcdataLessthanSign.read(t, r);
        Assert.assertEquals(TokeniserState.RCDATAEndTagOpen, t.getState());
    }

    @Test
    public void rcdataLessthanSign_givenLetterAndAppropriateTagMissing_shouldEmitTag() {
        CharacterReader r = new CharacterReader("textarea>something");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true);
        t.tagPending.name("textarea");
        t.emitTagPending();
        TokeniserState.RcdataLessthanSign.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void rcdataLessthanSign_givenOther_shouldEmitLessThanAndTransitionToRcdata() {
        CharacterReader r = new CharacterReader("123");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.RcdataLessthanSign.read(t, r);
        Assert.assertEquals(TokeniserState.Rcdata, t.getState());
    }

    @Test
    public void rcdataEndTagOpen_givenLetter_shouldAdvanceToRCDATAEndTagName() {
        CharacterReader r = new CharacterReader("title");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.RCDATAEndTagOpen.read(t, r);
        Assert.assertEquals(TokeniserState.RCDATAEndTagName, t.getState());
    }

    @Test
    public void rcdataEndTagOpen_givenNonLetter_shouldTransitionToRcdata() {
        CharacterReader r = new CharacterReader("123");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.RCDATAEndTagOpen.read(t, r);
        Assert.assertEquals(TokeniserState.Rcdata, t.getState());
    }

    @Test
    public void rcdataEndTagName_givenLettersAndDelimiters_shouldHandleBranches() {
        CharacterReader r1 = new CharacterReader("title ");
        Tokeniser t1 = new Tokeniser(r1, ParseErrorList.tracking(10));
        t1.createTagPending(true).name("title");
        t1.emitTagPending();
        t1.createTagPending(false);
        TokeniserState.RCDATAEndTagName.read(t1, r1);
        TokeniserState.RCDATAEndTagName.read(t1, r1);
        Assert.assertEquals(TokeniserState.BeforeAttributeName, t1.getState());

        CharacterReader r2 = new CharacterReader("other ");
        Tokeniser t2 = new Tokeniser(r2, ParseErrorList.tracking(10));
        t2.createTagPending(true).name("title");
        t2.emitTagPending();
        t2.createTagPending(false);
        TokeniserState.RCDATAEndTagName.read(t2, r2);
        TokeniserState.RCDATAEndTagName.read(t2, r2);
        Assert.assertEquals(TokeniserState.Rcdata, t2.getState());

        CharacterReader r3 = new CharacterReader("title/");
        Tokeniser t3 = new Tokeniser(r3, ParseErrorList.tracking(10));
        t3.createTagPending(true).name("title");
        t3.emitTagPending();
        t3.createTagPending(false);
        TokeniserState.RCDATAEndTagName.read(t3, r3);
        TokeniserState.RCDATAEndTagName.read(t3, r3);
        Assert.assertEquals(TokeniserState.SelfClosingStartTag, t3.getState());

        CharacterReader r4 = new CharacterReader("other/");
        Tokeniser t4 = new Tokeniser(r4, ParseErrorList.tracking(10));
        t4.createTagPending(true).name("title");
        t4.emitTagPending();
        t4.createTagPending(false);
        TokeniserState.RCDATAEndTagName.read(t4, r4);
        TokeniserState.RCDATAEndTagName.read(t4, r4);
        Assert.assertEquals(TokeniserState.Rcdata, t4.getState());

        CharacterReader r5 = new CharacterReader("title>");
        Tokeniser t5 = new Tokeniser(r5, ParseErrorList.tracking(10));
        t5.createTagPending(true).name("title");
        t5.emitTagPending();
        t5.createTagPending(false);
        TokeniserState.RCDATAEndTagName.read(t5, r5);
        TokeniserState.RCDATAEndTagName.read(t5, r5);
        Assert.assertEquals(TokeniserState.Data, t5.getState());

        CharacterReader r6 = new CharacterReader("other>");
        Tokeniser t6 = new Tokeniser(r6, ParseErrorList.tracking(10));
        t6.createTagPending(true).name("title");
        t6.emitTagPending();
        t6.createTagPending(false);
        TokeniserState.RCDATAEndTagName.read(t6, r6);
        TokeniserState.RCDATAEndTagName.read(t6, r6);
        Assert.assertEquals(TokeniserState.Rcdata, t6.getState());

        CharacterReader r7 = new CharacterReader("title?");
        Tokeniser t7 = new Tokeniser(r7, ParseErrorList.tracking(10));
        t7.createTagPending(false);
        TokeniserState.RCDATAEndTagName.read(t7, r7);
        TokeniserState.RCDATAEndTagName.read(t7, r7);
        Assert.assertEquals(TokeniserState.Rcdata, t7.getState());
    }

    @Test
    public void rawtextLessthanSign_givenSlash_shouldAdvanceToRawtextEndTagOpen() {
        CharacterReader r = new CharacterReader("/style");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.RawtextLessthanSign.read(t, r);
        Assert.assertEquals(TokeniserState.RawtextEndTagOpen, t.getState());
    }

    @Test
    public void rawtextLessthanSign_givenOther_shouldTransitionToRawtext() {
        CharacterReader r = new CharacterReader("style");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.RawtextLessthanSign.read(t, r);
        Assert.assertEquals(TokeniserState.Rawtext, t.getState());
    }

    @Test
    public void rawtextEndTagOpen_givenLetter_shouldAdvanceToRawtextEndTagName() {
        CharacterReader r = new CharacterReader("style");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.RawtextEndTagOpen.read(t, r);
        Assert.assertEquals(TokeniserState.RawtextEndTagName, t.getState());
    }

    @Test
    public void rawtextEndTagOpen_givenNonLetter_shouldTransitionToRawtext() {
        CharacterReader r = new CharacterReader("123");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.RawtextEndTagOpen.read(t, r);
        Assert.assertEquals(TokeniserState.Rawtext, t.getState());
    }

    @Test
    public void rawtextEndTagName_givenAppropriateAndInappropriate_shouldHandleBranches() {
        CharacterReader r1 = new CharacterReader("style ");
        Tokeniser t1 = new Tokeniser(r1, ParseErrorList.tracking(10));
        t1.createTagPending(true).name("style");
        t1.emitTagPending();
        t1.createTagPending(false);
        TokeniserState.RawtextEndTagName.read(t1, r1);
        TokeniserState.RawtextEndTagName.read(t1, r1);
        Assert.assertEquals(TokeniserState.BeforeAttributeName, t1.getState());

        CharacterReader r2 = new CharacterReader("style/");
        Tokeniser t2 = new Tokeniser(r2, ParseErrorList.tracking(10));
        t2.createTagPending(true).name("style");
        t2.emitTagPending();
        t2.createTagPending(false);
        TokeniserState.RawtextEndTagName.read(t2, r2);
        TokeniserState.RawtextEndTagName.read(t2, r2);
        Assert.assertEquals(TokeniserState.SelfClosingStartTag, t2.getState());

        CharacterReader r3 = new CharacterReader("style>");
        Tokeniser t3 = new Tokeniser(r3, ParseErrorList.tracking(10));
        t3.createTagPending(true).name("style");
        t3.emitTagPending();
        t3.createTagPending(false);
        TokeniserState.RawtextEndTagName.read(t3, r3);
        TokeniserState.RawtextEndTagName.read(t3, r3);
        Assert.assertEquals(TokeniserState.Data, t3.getState());

        CharacterReader r4 = new CharacterReader("style?");
        Tokeniser t4 = new Tokeniser(r4, ParseErrorList.tracking(10));
        t4.createTagPending(true).name("style");
        t4.emitTagPending();
        t4.createTagPending(false);
        TokeniserState.RawtextEndTagName.read(t4, r4);
        TokeniserState.RawtextEndTagName.read(t4, r4);
        Assert.assertEquals(TokeniserState.Rawtext, t4.getState());

        CharacterReader r5 = new CharacterReader("other>");
        Tokeniser t5 = new Tokeniser(r5, ParseErrorList.tracking(10));
        t5.createTagPending(true).name("style");
        t5.emitTagPending();
        t5.createTagPending(false);
        TokeniserState.RawtextEndTagName.read(t5, r5);
        TokeniserState.RawtextEndTagName.read(t5, r5);
        Assert.assertEquals(TokeniserState.Rawtext, t5.getState());
    }

    @Test
    public void scriptDataLessthanSign_givenSlash_shouldTransitionToScriptDataEndTagOpen() {
        CharacterReader r = new CharacterReader("/script");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataLessthanSign.read(t, r);
        Assert.assertEquals(TokeniserState.ScriptDataEndTagOpen, t.getState());
    }

    @Test
    public void scriptDataLessthanSign_givenExclamation_shouldTransitionToScriptDataEscapeStart() {
        CharacterReader r = new CharacterReader("!script");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataLessthanSign.read(t, r);
        Assert.assertEquals(TokeniserState.ScriptDataEscapeStart, t.getState());
    }

    @Test
    public void scriptDataLessthanSign_givenOther_shouldTransitionToScriptData() {
        CharacterReader r = new CharacterReader("ascript");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataLessthanSign.read(t, r);
        Assert.assertEquals(TokeniserState.ScriptData, t.getState());
    }

    @Test
    public void scriptDataEndTagOpen_givenLetter_shouldAdvanceToScriptDataEndTagName() {
        CharacterReader r = new CharacterReader("script");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEndTagOpen.read(t, r);
        Assert.assertEquals(TokeniserState.ScriptDataEndTagName, t.getState());
    }

    @Test
    public void scriptDataEndTagOpen_givenNonLetter_shouldTransitionToScriptData() {
        CharacterReader r = new CharacterReader("123");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEndTagOpen.read(t, r);
        Assert.assertEquals(TokeniserState.ScriptData, t.getState());
    }

    @Test
    public void scriptDataEndTagName_givenAppropriateTag_shouldTransitionCorrectly() {
        CharacterReader r = new CharacterReader("script>");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true).name("script");
        t.emitTagPending();
        t.createTagPending(false);
        TokeniserState.ScriptDataEndTagName.read(t, r);
        TokeniserState.ScriptDataEndTagName.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void scriptDataEscapeStart_givenDash_shouldAdvanceToScriptDataEscapeStartDash() {
        CharacterReader r = new CharacterReader("-");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscapeStart.read(t, r);
        Assert.assertEquals(TokeniserState.ScriptDataEscapeStartDash, t.getState());
    }

    @Test
    public void scriptDataEscapeStart_givenOther_shouldTransitionToScriptData() {
        CharacterReader r = new CharacterReader("x");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscapeStart.read(t, r);
        Assert.assertEquals(TokeniserState.ScriptData, t.getState());
    }

    @Test
    public void scriptDataEscapeStartDash_givenDash_shouldAdvanceToScriptDataEscapedDashDash() {
        CharacterReader r = new CharacterReader("-");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscapeStartDash.read(t, r);
        Assert.assertEquals(TokeniserState.ScriptDataEscapedDashDash, t.getState());
    }

    @Test
    public void scriptDataEscapeStartDash_givenOther_shouldTransitionToScriptData() {
        CharacterReader r = new CharacterReader("x");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscapeStartDash.read(t, r);
        Assert.assertEquals(TokeniserState.ScriptData, t.getState());
    }

    @Test
    public void scriptDataEscaped_givenVariousInputs_shouldHandleBranches() {
        CharacterReader r1 = new CharacterReader("");
        Tokeniser t1 = new Tokeniser(r1, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscaped.read(t1, r1);
        Assert.assertEquals(TokeniserState.Data, t1.getState());
        Assert.assertFalse(t1.getErrors().isEmpty());

        CharacterReader r2 = new CharacterReader("-");
        Tokeniser t2 = new Tokeniser(r2, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscaped.read(t2, r2);
        Assert.assertEquals(TokeniserState.ScriptDataEscapedDash, t2.getState());

        CharacterReader r3 = new CharacterReader("<");
        Tokeniser t3 = new Tokeniser(r3, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscaped.read(t3, r3);
        Assert.assertEquals(TokeniserState.ScriptDataEscapedLessthanSign, t3.getState());

        CharacterReader r4 = new CharacterReader("\u0000");
        Tokeniser t4 = new Tokeniser(r4, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscaped.read(t4, r4);
        Assert.assertFalse(t4.getErrors().isEmpty());

        CharacterReader r5 = new CharacterReader("escaped text-");
        Tokeniser t5 = new Tokeniser(r5, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscaped.read(t5, r5);
        Token token = t5.read();
        Assert.assertEquals("escaped text", ((Token.Character) token).getData());
    }

    @Test
    public void scriptDataEscapedDash_givenVariousInputs_shouldHandleBranches() {
        CharacterReader r1 = new CharacterReader("");
        Tokeniser t1 = new Tokeniser(r1, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscapedDash.read(t1, r1);
        Assert.assertEquals(TokeniserState.Data, t1.getState());

        CharacterReader r2 = new CharacterReader("-");
        Tokeniser t2 = new Tokeniser(r2, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscapedDash.read(t2, r2);
        Assert.assertEquals(TokeniserState.ScriptDataEscapedDashDash, t2.getState());

        CharacterReader r3 = new CharacterReader("<");
        Tokeniser t3 = new Tokeniser(r3, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscapedDash.read(t3, r3);
        Assert.assertEquals(TokeniserState.ScriptDataEscapedLessthanSign, t3.getState());

        CharacterReader r4 = new CharacterReader("\u0000");
        Tokeniser t4 = new Tokeniser(r4, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscapedDash.read(t4, r4);
        Assert.assertEquals(TokeniserState.ScriptDataEscaped, t4.getState());
        Assert.assertFalse(t4.getErrors().isEmpty());

        CharacterReader r5 = new CharacterReader("x");
        Tokeniser t5 = new Tokeniser(r5, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscapedDash.read(t5, r5);
        Assert.assertEquals(TokeniserState.ScriptDataEscaped, t5.getState());
    }

    @Test
    public void scriptDataEscapedDashDash_givenVariousInputs_shouldHandleBranches() {
        CharacterReader r1 = new CharacterReader("");
        Tokeniser t1 = new Tokeniser(r1, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscapedDashDash.read(t1, r1);
        Assert.assertEquals(TokeniserState.Data, t1.getState());

        CharacterReader r2 = new CharacterReader("-");
        Tokeniser t2 = new Tokeniser(r2, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscapedDashDash.read(t2, r2);

        CharacterReader r3 = new CharacterReader("<");
        Tokeniser t3 = new Tokeniser(r3, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscapedDashDash.read(t3, r3);
        Assert.assertEquals(TokeniserState.ScriptDataEscapedLessthanSign, t3.getState());

        CharacterReader r4 = new CharacterReader(">");
        Tokeniser t4 = new Tokeniser(r4, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscapedDashDash.read(t4, r4);
        Assert.assertEquals(TokeniserState.ScriptData, t4.getState());

        CharacterReader r5 = new CharacterReader("\u0000");
        Tokeniser t5 = new Tokeniser(r5, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscapedDashDash.read(t5, r5);
        Assert.assertEquals(TokeniserState.ScriptDataEscaped, t5.getState());
        Assert.assertFalse(t5.getErrors().isEmpty());

        CharacterReader r6 = new CharacterReader("z");
        Tokeniser t6 = new Tokeniser(r6, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscapedDashDash.read(t6, r6);
        Assert.assertEquals(TokeniserState.ScriptDataEscaped, t6.getState());
    }

    @Test
    public void scriptDataEscapedLessthanSign_givenVariousInputs_shouldHandleBranches() {
        CharacterReader r1 = new CharacterReader("a");
        Tokeniser t1 = new Tokeniser(r1, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscapedLessthanSign.read(t1, r1);
        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscapeStart, t1.getState());

        CharacterReader r2 = new CharacterReader("/");
        Tokeniser t2 = new Tokeniser(r2, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscapedLessthanSign.read(t2, r2);
        Assert.assertEquals(TokeniserState.ScriptDataEscapedEndTagOpen, t2.getState());

        CharacterReader r3 = new CharacterReader("?");
        Tokeniser t3 = new Tokeniser(r3, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscapedLessthanSign.read(t3, r3);
        Assert.assertEquals(TokeniserState.ScriptDataEscaped, t3.getState());
    }

    @Test
    public void scriptDataEscapedEndTagOpen_givenLetterOrOther_shouldHandleBranches() {
        CharacterReader r1 = new CharacterReader("s");
        Tokeniser t1 = new Tokeniser(r1, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscapedEndTagOpen.read(t1, r1);
        Assert.assertEquals(TokeniserState.ScriptDataEscapedEndTagName, t1.getState());

        CharacterReader r2 = new CharacterReader("!");
        Tokeniser t2 = new Tokeniser(r2, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscapedEndTagOpen.read(t2, r2);
        Assert.assertEquals(TokeniserState.ScriptDataEscaped, t2.getState());
    }

    @Test
    public void scriptDataEscapedEndTagName_givenExecution_shouldInvokeHandleDataEndTag() {
        CharacterReader r = new CharacterReader("script>");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true).name("script");
        t.emitTagPending();
        t.createTagPending(false);
        TokeniserState.ScriptDataEscapedEndTagName.read(t, r);
        TokeniserState.ScriptDataEscapedEndTagName.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void scriptDataDoubleEscapeStart_givenScriptAndOther_shouldHandleBranches() {
        CharacterReader r1 = new CharacterReader("script ");
        Tokeniser t1 = new Tokeniser(r1, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataDoubleEscapeStart.read(t1, r1);
        TokeniserState.ScriptDataDoubleEscapeStart.read(t1, r1);
        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscaped, t1.getState());

        CharacterReader r2 = new CharacterReader("other ");
        Tokeniser t2 = new Tokeniser(r2, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataDoubleEscapeStart.read(t2, r2);
        TokeniserState.ScriptDataDoubleEscapeStart.read(t2, r2);
        Assert.assertEquals(TokeniserState.ScriptDataEscaped, t2.getState());

        CharacterReader r3 = new CharacterReader("script!");
        Tokeniser t3 = new Tokeniser(r3, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataDoubleEscapeStart.read(t3, r3);
        TokeniserState.ScriptDataDoubleEscapeStart.read(t3, r3);
        Assert.assertEquals(TokeniserState.ScriptDataEscaped, t3.getState());
    }

    @Test
    public void scriptDataDoubleEscaped_givenVariousInputs_shouldHandleBranches() {
        CharacterReader r1 = new CharacterReader("-");
        Tokeniser t1 = new Tokeniser(r1, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataDoubleEscaped.read(t1, r1);
        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscapedDash, t1.getState());

        CharacterReader r2 = new CharacterReader("<");
        Tokeniser t2 = new Tokeniser(r2, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataDoubleEscaped.read(t2, r2);
        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscapedLessthanSign, t2.getState());

        CharacterReader r3 = new CharacterReader("\u0000");
        Tokeniser t3 = new Tokeniser(r3, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataDoubleEscaped.read(t3, r3);
        Assert.assertFalse(t3.getErrors().isEmpty());

        CharacterReader r4 = new CharacterReader("");
        Tokeniser t4 = new Tokeniser(r4, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataDoubleEscaped.read(t4, r4);
        Assert.assertEquals(TokeniserState.Data, t4.getState());
        Assert.assertFalse(t4.getErrors().isEmpty());

        CharacterReader r5 = new CharacterReader("some text-");
        Tokeniser t5 = new Tokeniser(r5, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataDoubleEscaped.read(t5, r5);
        Token token = t5.read();
        Assert.assertEquals("some text", ((Token.Character) token).getData());
    }

    @Test
    public void scriptDataDoubleEscapedDash_givenVariousInputs_shouldHandleBranches() {
        CharacterReader r1 = new CharacterReader("-");
        Tokeniser t1 = new Tokeniser(r1, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataDoubleEscapedDash.read(t1, r1);
        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscapedDashDash, t1.getState());

        CharacterReader r2 = new CharacterReader("<");
        Tokeniser t2 = new Tokeniser(r2, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataDoubleEscapedDash.read(t2, r2);
        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscapedLessthanSign, t2.getState());

        CharacterReader r3 = new CharacterReader("\u0000");
        Tokeniser t3 = new Tokeniser(r3, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataDoubleEscapedDash.read(t3, r3);
        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscaped, t3.getState());
        Assert.assertFalse(t3.getErrors().isEmpty());

        CharacterReader r4 = new CharacterReader("");
        Tokeniser t4 = new Tokeniser(r4, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataDoubleEscapedDash.read(t4, r4);
        Assert.assertEquals(TokeniserState.Data, t4.getState());
        Assert.assertFalse(t4.getErrors().isEmpty());

        CharacterReader r5 = new CharacterReader("x");
        Tokeniser t5 = new Tokeniser(r5, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataDoubleEscapedDash.read(t5, r5);
        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscaped, t5.getState());
    }

    @Test
    public void scriptDataDoubleEscapedDashDash_givenVariousInputs_shouldHandleBranches() {
        CharacterReader r1 = new CharacterReader("-");
        Tokeniser t1 = new Tokeniser(r1, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataDoubleEscapedDashDash.read(t1, r1);

        CharacterReader r2 = new CharacterReader("<");
        Tokeniser t2 = new Tokeniser(r2, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataDoubleEscapedDashDash.read(t2, r2);
        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscapedLessthanSign, t2.getState());

        CharacterReader r3 = new CharacterReader(">");
        Tokeniser t3 = new Tokeniser(r3, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataDoubleEscapedDashDash.read(t3, r3);
        Assert.assertEquals(TokeniserState.ScriptData, t3.getState());

        CharacterReader r4 = new CharacterReader("\u0000");
        Tokeniser t4 = new Tokeniser(r4, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataDoubleEscapedDashDash.read(t4, r4);
        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscaped, t4.getState());
        Assert.assertFalse(t4.getErrors().isEmpty());

        CharacterReader r5 = new CharacterReader("");
        Tokeniser t5 = new Tokeniser(r5, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataDoubleEscapedDashDash.read(t5, r5);
        Assert.assertEquals(TokeniserState.Data, t5.getState());
        Assert.assertFalse(t5.getErrors().isEmpty());

        CharacterReader r6 = new CharacterReader("q");
        Tokeniser t6 = new Tokeniser(r6, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataDoubleEscapedDashDash.read(t6, r6);
        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscaped, t6.getState());
    }

    @Test
    public void scriptDataDoubleEscapedLessthanSign_givenSlashOrOther_shouldHandleBranches() {
        CharacterReader r1 = new CharacterReader("/");
        Tokeniser t1 = new Tokeniser(r1, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataDoubleEscapedLessthanSign.read(t1, r1);
        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscapeEnd, t1.getState());

        CharacterReader r2 = new CharacterReader("a");
        Tokeniser t2 = new Tokeniser(r2, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataDoubleEscapedLessthanSign.read(t2, r2);
        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscaped, t2.getState());
    }

    @Test
    public void scriptDataDoubleEscapeEnd_givenScriptOrOther_shouldHandleBranches() {
        CharacterReader r1 = new CharacterReader("script>");
        Tokeniser t1 = new Tokeniser(r1, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataDoubleEscapeEnd.read(t1, r1);
        TokeniserState.ScriptDataDoubleEscapeEnd.read(t1, r1);
        Assert.assertEquals(TokeniserState.ScriptDataEscaped, t1.getState());

        CharacterReader r2 = new CharacterReader("other>");
        Tokeniser t2 = new Tokeniser(r2, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataDoubleEscapeEnd.read(t2, r2);
        TokeniserState.ScriptDataDoubleEscapeEnd.read(t2, r2);
        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscaped, t2.getState());
    }

    @Test
    public void beforeAttributeName_givenWhitespaceSlashGreaterNullEofQuotesOther_shouldHandleAllBranches() {
        char[] spaces = new char[]{'\t', '\n', '\r', '\f', ' '};
        for (int i = 0; i < spaces.length; i++) {
            CharacterReader r = new CharacterReader(String.valueOf(spaces[i]));
            Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
            TokeniserState.BeforeAttributeName.read(t, r);
        }

        CharacterReader rSlash = new CharacterReader("/");
        Tokeniser tSlash = new Tokeniser(rSlash, ParseErrorList.tracking(10));
        TokeniserState.BeforeAttributeName.read(tSlash, rSlash);
        Assert.assertEquals(TokeniserState.SelfClosingStartTag, tSlash.getState());

        CharacterReader rGt = new CharacterReader(">");
        Tokeniser tGt = new Tokeniser(rGt, ParseErrorList.tracking(10));
        tGt.createTagPending(true);
        TokeniserState.BeforeAttributeName.read(tGt, rGt);
        Assert.assertEquals(TokeniserState.Data, tGt.getState());

        CharacterReader rNull = new CharacterReader("\u0000");
        Tokeniser tNull = new Tokeniser(rNull, ParseErrorList.tracking(10));
        tNull.createTagPending(true);
        TokeniserState.BeforeAttributeName.read(tNull, rNull);
        Assert.assertEquals(TokeniserState.AttributeName, tNull.getState());
        Assert.assertFalse(tNull.getErrors().isEmpty());

        CharacterReader rEof = new CharacterReader("");
        Tokeniser tEof = new Tokeniser(rEof, ParseErrorList.tracking(10));
        TokeniserState.BeforeAttributeName.read(tEof, rEof);
        Assert.assertEquals(TokeniserState.Data, tEof.getState());
        Assert.assertFalse(tEof.getErrors().isEmpty());

        char[] badChars = new char[]{'"', '\'', '<', '='};
        for (int j = 0; j < badChars.length; j++) {
            CharacterReader rBad = new CharacterReader(String.valueOf(badChars[j]));
            Tokeniser tBad = new Tokeniser(rBad, ParseErrorList.tracking(10));
            tBad.createTagPending(true);
            TokeniserState.BeforeAttributeName.read(tBad, rBad);
            Assert.assertEquals(TokeniserState.AttributeName, tBad.getState());
            Assert.assertFalse(tBad.getErrors().isEmpty());
        }

        CharacterReader rNorm = new CharacterReader("a");
        Tokeniser tNorm = new Tokeniser(rNorm, ParseErrorList.tracking(10));
        tNorm.createTagPending(true);
        TokeniserState.BeforeAttributeName.read(tNorm, rNorm);
        Assert.assertEquals(TokeniserState.AttributeName, tNorm.getState());
    }

    @Test
    public void attributeName_givenWhitespaceSlashEqualsGreaterNullEofQuotesOther_shouldHandleAllBranches() {
        CharacterReader rSpace = new CharacterReader("attr ");
        Tokeniser tSpace = new Tokeniser(rSpace, ParseErrorList.tracking(10));
        tSpace.createTagPending(true);
        TokeniserState.AttributeName.read(tSpace, rSpace);
        Assert.assertEquals(TokeniserState.AfterAttributeName, tSpace.getState());

        CharacterReader rSlash = new CharacterReader("attr/");
        Tokeniser tSlash = new Tokeniser(rSlash, ParseErrorList.tracking(10));
        tSlash.createTagPending(true);
        TokeniserState.AttributeName.read(tSlash, rSlash);
        Assert.assertEquals(TokeniserState.SelfClosingStartTag, tSlash.getState());

        CharacterReader rEq = new CharacterReader("attr=");
        Tokeniser tEq = new Tokeniser(rEq, ParseErrorList.tracking(10));
        tEq.createTagPending(true);
        TokeniserState.AttributeName.read(tEq, rEq);
        Assert.assertEquals(TokeniserState.BeforeAttributeValue, tEq.getState());

        CharacterReader rGt = new CharacterReader("attr>");
        Tokeniser tGt = new Tokeniser(rGt, ParseErrorList.tracking(10));
        tGt.createTagPending(true);
        TokeniserState.AttributeName.read(tGt, rGt);
        Assert.assertEquals(TokeniserState.Data, tGt.getState());

        CharacterReader rNull = new CharacterReader("attr\u0000");
        Tokeniser tNull = new Tokeniser(rNull, ParseErrorList.tracking(10));
        tNull.createTagPending(true);
        TokeniserState.AttributeName.read(tNull, rNull);
        Assert.assertFalse(tNull.getErrors().isEmpty());

        CharacterReader rEof = new CharacterReader("attr");
        Tokeniser tEof = new Tokeniser(rEof, ParseErrorList.tracking(10));
        tEof.createTagPending(true);
        TokeniserState.AttributeName.read(tEof, rEof);
        Assert.assertEquals(TokeniserState.Data, tEof.getState());
        Assert.assertFalse(tEof.getErrors().isEmpty());

        char[] bad = new char[]{'"', '\'', '<'};
        for (int i = 0; i < bad.length; i++) {
            CharacterReader rBad = new CharacterReader("attr" + bad[i]);
            Tokeniser tBad = new Tokeniser(rBad, ParseErrorList.tracking(10));
            tBad.createTagPending(true);
            TokeniserState.AttributeName.read(tBad, rBad);
            Assert.assertFalse(tBad.getErrors().isEmpty());
        }

        CharacterReader rOther = new CharacterReader("attr@");
        Tokeniser tOther = new Tokeniser(rOther, ParseErrorList.tracking(10));
        tOther.createTagPending(true);
        TokeniserState.AttributeName.read(tOther, rOther);
    }

    @Test
    public void afterAttributeName_givenWhitespaceSlashEqualsGreaterNullEofQuotesOther_shouldHandleAllBranches() {
        char[] spaces = new char[]{'\t', '\n', '\r', '\f', ' '};
        for (int i = 0; i < spaces.length; i++) {
            CharacterReader r = new CharacterReader(String.valueOf(spaces[i]));
            Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
            TokeniserState.AfterAttributeName.read(t, r);
        }

        CharacterReader rSlash = new CharacterReader("/");
        Tokeniser tSlash = new Tokeniser(rSlash, ParseErrorList.tracking(10));
        TokeniserState.AfterAttributeName.read(tSlash, rSlash);
        Assert.assertEquals(TokeniserState.SelfClosingStartTag, tSlash.getState());

        CharacterReader rEq = new CharacterReader("=");
        Tokeniser tEq = new Tokeniser(rEq, ParseErrorList.tracking(10));
        TokeniserState.AfterAttributeName.read(tEq, rEq);
        Assert.assertEquals(TokeniserState.BeforeAttributeValue, tEq.getState());

        CharacterReader rGt = new CharacterReader(">");
        Tokeniser tGt = new Tokeniser(rGt, ParseErrorList.tracking(10));
        tGt.createTagPending(true);
        TokeniserState.AfterAttributeName.read(tGt, rGt);
        Assert.assertEquals(TokeniserState.Data, tGt.getState());

        CharacterReader rNull = new CharacterReader("\u0000");
        Tokeniser tNull = new Tokeniser(rNull, ParseErrorList.tracking(10));
        tNull.createTagPending(true);
        TokeniserState.AfterAttributeName.read(tNull, rNull);
        Assert.assertEquals(TokeniserState.AttributeName, tNull.getState());
        Assert.assertFalse(tNull.getErrors().isEmpty());

        CharacterReader rEof = new CharacterReader("");
        Tokeniser tEof = new Tokeniser(rEof, ParseErrorList.tracking(10));
        TokeniserState.AfterAttributeName.read(tEof, rEof);
        Assert.assertEquals(TokeniserState.Data, tEof.getState());
        Assert.assertFalse(tEof.getErrors().isEmpty());

        char[] bad = new char[]{'"', '\'', '<'};
        for (int j = 0; j < bad.length; j++) {
            CharacterReader rBad = new CharacterReader(String.valueOf(bad[j]));
            Tokeniser tBad = new Tokeniser(rBad, ParseErrorList.tracking(10));
            tBad.createTagPending(true);
            TokeniserState.AfterAttributeName.read(tBad, rBad);
            Assert.assertEquals(TokeniserState.AttributeName, tBad.getState());
            Assert.assertFalse(tBad.getErrors().isEmpty());
        }

        CharacterReader rNorm = new CharacterReader("a");
        Tokeniser tNorm = new Tokeniser(rNorm, ParseErrorList.tracking(10));
        tNorm.createTagPending(true);
        TokeniserState.AfterAttributeName.read(tNorm, rNorm);
        Assert.assertEquals(TokeniserState.AttributeName, tNorm.getState());
    }

    @Test
    public void beforeAttributeValue_givenVariousInputs_shouldHandleAllBranches() {
        char[] spaces = new char[]{'\t', '\n', '\r', '\f', ' '};
        for (int i = 0; i < spaces.length; i++) {
            CharacterReader r = new CharacterReader(String.valueOf(spaces[i]));
            Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
            TokeniserState.BeforeAttributeValue.read(t, r);
        }

        CharacterReader rDoubleQuote = new CharacterReader("\"");
        Tokeniser tDoubleQuote = new Tokeniser(rDoubleQuote, ParseErrorList.tracking(10));
        TokeniserState.BeforeAttributeValue.read(tDoubleQuote, rDoubleQuote);
        Assert.assertEquals(TokeniserState.AttributeValue_doubleQuoted, tDoubleQuote.getState());

        CharacterReader rAmp = new CharacterReader("&");
        Tokeniser tAmp = new Tokeniser(rAmp, ParseErrorList.tracking(10));
        TokeniserState.BeforeAttributeValue.read(tAmp, rAmp);
        Assert.assertEquals(TokeniserState.AttributeValue_unquoted, tAmp.getState());

        CharacterReader rSingleQuote = new CharacterReader("'");
        Tokeniser tSingleQuote = new Tokeniser(rSingleQuote, ParseErrorList.tracking(10));
        TokeniserState.BeforeAttributeValue.read(tSingleQuote, rSingleQuote);
        Assert.assertEquals(TokeniserState.AttributeValue_singleQuoted, tSingleQuote.getState());

        CharacterReader rNull = new CharacterReader("\u0000");
        Tokeniser tNull = new Tokeniser(rNull, ParseErrorList.tracking(10));
        tNull.createTagPending(true);
        TokeniserState.BeforeAttributeValue.read(tNull, rNull);
        Assert.assertEquals(TokeniserState.AttributeValue_unquoted, tNull.getState());
        Assert.assertFalse(tNull.getErrors().isEmpty());

        CharacterReader rEof = new CharacterReader("");
        Tokeniser tEof = new Tokeniser(rEof, ParseErrorList.tracking(10));
        tEof.createTagPending(true);
        TokeniserState.BeforeAttributeValue.read(tEof, rEof);
        Assert.assertEquals(TokeniserState.Data, tEof.getState());
        Assert.assertFalse(tEof.getErrors().isEmpty());

        CharacterReader rGt = new CharacterReader(">");
        Tokeniser tGt = new Tokeniser(rGt, ParseErrorList.tracking(10));
        tGt.createTagPending(true);
        TokeniserState.BeforeAttributeValue.read(tGt, rGt);
        Assert.assertEquals(TokeniserState.Data, tGt.getState());
        Assert.assertFalse(tGt.getErrors().isEmpty());

        char[] bad = new char[]{'<', '=', '`'};
        for (int j = 0; j < bad.length; j++) {
            CharacterReader rBad = new CharacterReader(String.valueOf(bad[j]));
            Tokeniser tBad = new Tokeniser(rBad, ParseErrorList.tracking(10));
            tBad.createTagPending(true);
            TokeniserState.BeforeAttributeValue.read(tBad, rBad);
            Assert.assertEquals(TokeniserState.AttributeValue_unquoted, tBad.getState());
            Assert.assertFalse(tBad.getErrors().isEmpty());
        }

        CharacterReader rNorm = new CharacterReader("val");
        Tokeniser tNorm = new Tokeniser(rNorm, ParseErrorList.tracking(10));
        TokeniserState.BeforeAttributeValue.read(tNorm, rNorm);
        Assert.assertEquals(TokeniserState.AttributeValue_unquoted, tNorm.getState());
    }

    @Test
    public void attributeValue_doubleQuoted_givenInputs_shouldHandleAllBranches() {
        CharacterReader rQuote = new CharacterReader("value\"");
        Tokeniser tQuote = new Tokeniser(rQuote, ParseErrorList.tracking(10));
        tQuote.createTagPending(true);
        TokeniserState.AttributeValue_doubleQuoted.read(tQuote, rQuote);
        Assert.assertEquals(TokeniserState.AfterAttributeValue_quoted, tQuote.getState());

        CharacterReader rEmpty = new CharacterReader("\"");
        Tokeniser tEmpty = new Tokeniser(rEmpty, ParseErrorList.tracking(10));
        tEmpty.createTagPending(true);
        TokeniserState.AttributeValue_doubleQuoted.read(tEmpty, rEmpty);
        Assert.assertEquals(TokeniserState.AfterAttributeValue_quoted, tEmpty.getState());

        CharacterReader rAmp = new CharacterReader("&amp;\"");
        Tokeniser tAmp = new Tokeniser(rAmp, ParseErrorList.tracking(10));
        tAmp.createTagPending(true);
        TokeniserState.AttributeValue_doubleQuoted.read(tAmp, rAmp);

        CharacterReader rAmpInvalid = new CharacterReader("&notValidRef;\"");
        Tokeniser tAmpInvalid = new Tokeniser(rAmpInvalid, ParseErrorList.tracking(10));
        tAmpInvalid.createTagPending(true);
        TokeniserState.AttributeValue_doubleQuoted.read(tAmpInvalid, rAmpInvalid);

        CharacterReader rNull = new CharacterReader("\u0000\"");
        Tokeniser tNull = new Tokeniser(rNull, ParseErrorList.tracking(10));
        tNull.createTagPending(true);
        TokeniserState.AttributeValue_doubleQuoted.read(tNull, rNull);
        Assert.assertFalse(tNull.getErrors().isEmpty());

        CharacterReader rEof = new CharacterReader("");
        Tokeniser tEof = new Tokeniser(rEof, ParseErrorList.tracking(10));
        tEof.createTagPending(true);
        TokeniserState.AttributeValue_doubleQuoted.read(tEof, rEof);
        Assert.assertEquals(TokeniserState.Data, tEof.getState());
        Assert.assertFalse(tEof.getErrors().isEmpty());

        CharacterReader rOther = new CharacterReader("val1\n");
        Tokeniser tOther = new Tokeniser(rOther, ParseErrorList.tracking(10));
        tOther.createTagPending(true);
        TokeniserState.AttributeValue_doubleQuoted.read(tOther, rOther);
    }

    @Test
    public void attributeValue_singleQuoted_givenInputs_shouldHandleAllBranches() {
        CharacterReader rQuote = new CharacterReader("value'");
        Tokeniser tQuote = new Tokeniser(rQuote, ParseErrorList.tracking(10));
        tQuote.createTagPending(true);
        TokeniserState.AttributeValue_singleQuoted.read(tQuote, rQuote);
        Assert.assertEquals(TokeniserState.AfterAttributeValue_quoted, tQuote.getState());

        CharacterReader rEmpty = new CharacterReader("'");
        Tokeniser tEmpty = new Tokeniser(rEmpty, ParseErrorList.tracking(10));
        tEmpty.createTagPending(true);
        TokeniserState.AttributeValue_singleQuoted.read(tEmpty, rEmpty);
        Assert.assertEquals(TokeniserState.AfterAttributeValue_quoted, tEmpty.getState());

        CharacterReader rAmp = new CharacterReader("&amp;'");
        Tokeniser tAmp = new Tokeniser(rAmp, ParseErrorList.tracking(10));
        tAmp.createTagPending(true);
        TokeniserState.AttributeValue_singleQuoted.read(tAmp, rAmp);

        CharacterReader rAmpInvalid = new CharacterReader("&notValidRef;'");
        Tokeniser tAmpInvalid = new Tokeniser(rAmpInvalid, ParseErrorList.tracking(10));
        tAmpInvalid.createTagPending(true);
        TokeniserState.AttributeValue_singleQuoted.read(tAmpInvalid, rAmpInvalid);

        CharacterReader rNull = new CharacterReader("\u0000'");
        Tokeniser tNull = new Tokeniser(rNull, ParseErrorList.tracking(10));
        tNull.createTagPending(true);
        TokeniserState.AttributeValue_singleQuoted.read(tNull, rNull);
        Assert.assertFalse(tNull.getErrors().isEmpty());

        CharacterReader rEof = new CharacterReader("");
        Tokeniser tEof = new Tokeniser(rEof, ParseErrorList.tracking(10));
        tEof.createTagPending(true);
        TokeniserState.AttributeValue_singleQuoted.read(tEof, rEof);
        Assert.assertEquals(TokeniserState.Data, tEof.getState());
        Assert.assertFalse(tEof.getErrors().isEmpty());

        CharacterReader rOther = new CharacterReader("val1\n");
        Tokeniser tOther = new Tokeniser(rOther, ParseErrorList.tracking(10));
        tOther.createTagPending(true);
        TokeniserState.AttributeValue_singleQuoted.read(tOther, rOther);
    }

    @Test
    public void attributeValue_unquoted_givenInputs_shouldHandleAllBranches() {
        char[] spaces = new char[]{'\t', '\n', '\r', '\f', ' '};
        for (int i = 0; i < spaces.length; i++) {
            CharacterReader r = new CharacterReader("val" + spaces[i]);
            Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
            t.createTagPending(true);
            TokeniserState.AttributeValue_unquoted.read(t, r);
            Assert.assertEquals(TokeniserState.BeforeAttributeName, t.getState());
        }

        CharacterReader rAmp = new CharacterReader("&amp; ");
        Tokeniser tAmp = new Tokeniser(rAmp, ParseErrorList.tracking(10));
        tAmp.createTagPending(true);
        TokeniserState.AttributeValue_unquoted.read(tAmp, rAmp);

        CharacterReader rAmpInvalid = new CharacterReader("&notValidRef; ");
        Tokeniser tAmpInvalid = new Tokeniser(rAmpInvalid, ParseErrorList.tracking(10));
        tAmpInvalid.createTagPending(true);
        TokeniserState.AttributeValue_unquoted.read(tAmpInvalid, rAmpInvalid);

        CharacterReader rGt = new CharacterReader("val>");
        Tokeniser tGt = new Tokeniser(rGt, ParseErrorList.tracking(10));
        tGt.createTagPending(true);
        TokeniserState.AttributeValue_unquoted.read(tGt, rGt);
        Assert.assertEquals(TokeniserState.Data, tGt.getState());

        CharacterReader rNull = new CharacterReader("val\u0000");
        Tokeniser tNull = new Tokeniser(rNull, ParseErrorList.tracking(10));
        tNull.createTagPending(true);
        TokeniserState.AttributeValue_unquoted.read(tNull, rNull);
        Assert.assertFalse(tNull.getErrors().isEmpty());

        CharacterReader rEof = new CharacterReader("val");
        Tokeniser tEof = new Tokeniser(rEof, ParseErrorList.tracking(10));
        tEof.createTagPending(true);
        TokeniserState.AttributeValue_unquoted.read(tEof, rEof);
        Assert.assertEquals(TokeniserState.Data, tEof.getState());
        Assert.assertFalse(tEof.getErrors().isEmpty());

        char[] bad = new char[]{'"', '\'', '<', '=', '`'};
        for (int j = 0; j < bad.length; j++) {
            CharacterReader rBad = new CharacterReader("val" + bad[j]);
            Tokeniser tBad = new Tokeniser(rBad, ParseErrorList.tracking(10));
            tBad.createTagPending(true);
            TokeniserState.AttributeValue_unquoted.read(tBad, rBad);
            Assert.assertFalse(tBad.getErrors().isEmpty());
        }

        CharacterReader rOther = new CharacterReader("val~");
        Tokeniser tOther = new Tokeniser(rOther, ParseErrorList.tracking(10));
        tOther.createTagPending(true);
        TokeniserState.AttributeValue_unquoted.read(tOther, rOther);
    }

    @Test
    public void afterAttributeValue_quoted_givenWhitespaceSlashGreaterEofOther_shouldHandleAllBranches() {
        char[] spaces = new char[]{'\t', '\n', '\r', '\f', ' '};
        for (int i = 0; i < spaces.length; i++) {
            CharacterReader r = new CharacterReader(String.valueOf(spaces[i]));
            Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
            TokeniserState.AfterAttributeValue_quoted.read(t, r);
            Assert.assertEquals(TokeniserState.BeforeAttributeName, t.getState());
        }

        CharacterReader rSlash = new CharacterReader("/");
        Tokeniser tSlash = new Tokeniser(rSlash, ParseErrorList.tracking(10));
        TokeniserState.AfterAttributeValue_quoted.read(tSlash, rSlash);
        Assert.assertEquals(TokeniserState.SelfClosingStartTag, tSlash.getState());

        CharacterReader rGt = new CharacterReader(">");
        Tokeniser tGt = new Tokeniser(rGt, ParseErrorList.tracking(10));
        tGt.createTagPending(true);
        TokeniserState.AfterAttributeValue_quoted.read(tGt, rGt);
        Assert.assertEquals(TokeniserState.Data, tGt.getState());

        CharacterReader rEof = new CharacterReader("");
        Tokeniser tEof = new Tokeniser(rEof, ParseErrorList.tracking(10));
        TokeniserState.AfterAttributeValue_quoted.read(tEof, rEof);
        Assert.assertEquals(TokeniserState.Data, tEof.getState());
        Assert.assertFalse(tEof.getErrors().isEmpty());

        CharacterReader rOther = new CharacterReader("a");
        Tokeniser tOther = new Tokeniser(rOther, ParseErrorList.tracking(10));
        TokeniserState.AfterAttributeValue_quoted.read(tOther, rOther);
        Assert.assertEquals(TokeniserState.BeforeAttributeName, tOther.getState());
        Assert.assertFalse(tOther.getErrors().isEmpty());
    }

    @Test
    public void selfClosingStartTag_givenInputs_shouldHandleAllBranches() {
        CharacterReader rGt = new CharacterReader(">");
        Tokeniser tGt = new Tokeniser(rGt, ParseErrorList.tracking(10));
        tGt.createTagPending(true);
        TokeniserState.SelfClosingStartTag.read(tGt, rGt);
        Assert.assertEquals(TokeniserState.Data, tGt.getState());
        Assert.assertTrue(tGt.tagPending.isSelfClosing());

        CharacterReader rEof = new CharacterReader("");
        Tokeniser tEof = new Tokeniser(rEof, ParseErrorList.tracking(10));
        TokeniserState.SelfClosingStartTag.read(tEof, rEof);
        Assert.assertEquals(TokeniserState.Data, tEof.getState());
        Assert.assertFalse(tEof.getErrors().isEmpty());

        CharacterReader rOther = new CharacterReader("a");
        Tokeniser tOther = new Tokeniser(rOther, ParseErrorList.tracking(10));
        TokeniserState.SelfClosingStartTag.read(tOther, rOther);
        Assert.assertEquals(TokeniserState.BeforeAttributeName, tOther.getState());
        Assert.assertFalse(tOther.getErrors().isEmpty());
    }

    @Test
    public void bogusComment_givenInput_shouldEmitCommentAndAdvanceToData() {
        CharacterReader r = new CharacterReader("comment data>after");
        r.consume(); // simulate entering
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.BogusComment.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
        Token token = t.read();
        Assert.assertTrue(token.isComment());
    }

    @Test
    public void markupDeclarationOpen_givenDashDashDoctypeCdataOther_shouldHandleAllBranches() {
        CharacterReader rDash = new CharacterReader("--comment");
        Tokeniser tDash = new Tokeniser(rDash, ParseErrorList.tracking(10));
        TokeniserState.MarkupDeclarationOpen.read(tDash, rDash);
        Assert.assertEquals(TokeniserState.CommentStart, tDash.getState());

        CharacterReader rDoc = new CharacterReader("doctype html");
        Tokeniser tDoc = new Tokeniser(rDoc, ParseErrorList.tracking(10));
        TokeniserState.MarkupDeclarationOpen.read(tDoc, rDoc);
        Assert.assertEquals(TokeniserState.Doctype, tDoc.getState());

        CharacterReader rCdata = new CharacterReader("[CDATA[some data]]>");
        Tokeniser tCdata = new Tokeniser(rCdata, ParseErrorList.tracking(10));
        TokeniserState.MarkupDeclarationOpen.read(tCdata, rCdata);
        Assert.assertEquals(TokeniserState.CdataSection, tCdata.getState());

        CharacterReader rOther = new CharacterReader("bogus");
        Tokeniser tOther = new Tokeniser(rOther, ParseErrorList.tracking(10));
        TokeniserState.MarkupDeclarationOpen.read(tOther, rOther);
        Assert.assertEquals(TokeniserState.BogusComment, tOther.getState());
        Assert.assertFalse(tOther.getErrors().isEmpty());
    }

    @Test
    public void commentStart_givenInputs_shouldHandleAllBranches() {
        CharacterReader rDash = new CharacterReader("-");
        Tokeniser tDash = new Tokeniser(rDash, ParseErrorList.tracking(10));
        tDash.createCommentPending();
        TokeniserState.CommentStart.read(tDash, rDash);
        Assert.assertEquals(TokeniserState.CommentStartDash, tDash.getState());

        CharacterReader rNull = new CharacterReader("\u0000");
        Tokeniser tNull = new Tokeniser(rNull, ParseErrorList.tracking(10));
        tNull.createCommentPending();
        TokeniserState.CommentStart.read(tNull, rNull);
        Assert.assertEquals(TokeniserState.Comment, tNull.getState());
        Assert.assertFalse(tNull.getErrors().isEmpty());

        CharacterReader rGt = new CharacterReader(">");
        Tokeniser tGt = new Tokeniser(rGt, ParseErrorList.tracking(10));
        tGt.createCommentPending();
        TokeniserState.CommentStart.read(tGt, rGt);
        Assert.assertEquals(TokeniserState.Data, tGt.getState());
        Assert.assertFalse(tGt.getErrors().isEmpty());

        CharacterReader rEof = new CharacterReader("");
        Tokeniser tEof = new Tokeniser(rEof, ParseErrorList.tracking(10));
        tEof.createCommentPending();
        TokeniserState.CommentStart.read(tEof, rEof);
        Assert.assertEquals(TokeniserState.Data, tEof.getState());
        Assert.assertFalse(tEof.getErrors().isEmpty());

        CharacterReader rOther = new CharacterReader("a");
        Tokeniser tOther = new Tokeniser(rOther, ParseErrorList.tracking(10));
        tOther.createCommentPending();
        TokeniserState.CommentStart.read(tOther, rOther);
        Assert.assertEquals(TokeniserState.Comment, tOther.getState());
    }

    @Test
    public void commentStartDash_givenInputs_shouldHandleAllBranches() {
        CharacterReader rDash = new CharacterReader("-");
        Tokeniser tDash = new Tokeniser(rDash, ParseErrorList.tracking(10));
        tDash.createCommentPending();
        TokeniserState.CommentStartDash.read(tDash, rDash);
        Assert.assertEquals(TokeniserState.CommentStartDash, tDash.getState());

        CharacterReader rNull = new CharacterReader("\u0000");
        Tokeniser tNull = new Tokeniser(rNull, ParseErrorList.tracking(10));
        tNull.createCommentPending();
        TokeniserState.CommentStartDash.read(tNull, rNull);
        Assert.assertEquals(TokeniserState.Comment, tNull.getState());
        Assert.assertFalse(tNull.getErrors().isEmpty());

        CharacterReader rGt = new CharacterReader(">");
        Tokeniser tGt = new Tokeniser(rGt, ParseErrorList.tracking(10));
        tGt.createCommentPending();
        TokeniserState.CommentStartDash.read(tGt, rGt);
        Assert.assertEquals(TokeniserState.Data, tGt.getState());
        Assert.assertFalse(tGt.getErrors().isEmpty());

        CharacterReader rEof = new CharacterReader("");
        Tokeniser tEof = new Tokeniser(rEof, ParseErrorList.tracking(10));
        tEof.createCommentPending();
        TokeniserState.CommentStartDash.read(tEof, rEof);
        Assert.assertEquals(TokeniserState.Data, tEof.getState());
        Assert.assertFalse(tEof.getErrors().isEmpty());

        CharacterReader rOther = new CharacterReader("a");
        Tokeniser tOther = new Tokeniser(rOther, ParseErrorList.tracking(10));
        tOther.createCommentPending();
        TokeniserState.CommentStartDash.read(tOther, rOther);
        Assert.assertEquals(TokeniserState.Comment, tOther.getState());
    }

    @Test
    public void comment_givenInputs_shouldHandleAllBranches() {
        CharacterReader rDash = new CharacterReader("-");
        Tokeniser tDash = new Tokeniser(rDash, ParseErrorList.tracking(10));
        tDash.createCommentPending();
        TokeniserState.Comment.read(tDash, rDash);
        Assert.assertEquals(TokeniserState.CommentEndDash, tDash.getState());

        CharacterReader rNull = new CharacterReader("\u0000");
        Tokeniser tNull = new Tokeniser(rNull, ParseErrorList.tracking(10));
        tNull.createCommentPending();
        TokeniserState.Comment.read(tNull, rNull);
        Assert.assertFalse(tNull.getErrors().isEmpty());

        CharacterReader rEof = new CharacterReader("");
        Tokeniser tEof = new Tokeniser(rEof, ParseErrorList.tracking(10));
        tEof.createCommentPending();
        TokeniserState.Comment.read(tEof, rEof);
        Assert.assertEquals(TokeniserState.Data, tEof.getState());
        Assert.assertFalse(tEof.getErrors().isEmpty());

        CharacterReader rOther = new CharacterReader("text-");
        Tokeniser tOther = new Tokeniser(rOther, ParseErrorList.tracking(10));
        tOther.createCommentPending();
        TokeniserState.Comment.read(tOther, rOther);
        Assert.assertEquals("text", tOther.commentPending.getData());
    }

    @Test
    public void commentEndDash_givenInputs_shouldHandleAllBranches() {
        CharacterReader rDash = new CharacterReader("-");
        Tokeniser tDash = new Tokeniser(rDash, ParseErrorList.tracking(10));
        tDash.createCommentPending();
        TokeniserState.CommentEndDash.read(tDash, rDash);
        Assert.assertEquals(TokeniserState.CommentEnd, tDash.getState());

        CharacterReader rNull = new CharacterReader("\u0000");
        Tokeniser tNull = new Tokeniser(rNull, ParseErrorList.tracking(10));
        tNull.createCommentPending();
        TokeniserState.CommentEndDash.read(tNull, rNull);
        Assert.assertEquals(TokeniserState.Comment, tNull.getState());
        Assert.assertFalse(tNull.getErrors().isEmpty());

        CharacterReader rEof = new CharacterReader("");
        Tokeniser tEof = new Tokeniser(rEof, ParseErrorList.tracking(10));
        tEof.createCommentPending();
        TokeniserState.CommentEndDash.read(tEof, rEof);
        Assert.assertEquals(TokeniserState.Data, tEof.getState());
        Assert.assertFalse(tEof.getErrors().isEmpty());

        CharacterReader rOther = new CharacterReader("a");
        Tokeniser tOther = new Tokeniser(rOther, ParseErrorList.tracking(10));
        tOther.createCommentPending();
        TokeniserState.CommentEndDash.read(tOther, rOther);
        Assert.assertEquals(TokeniserState.Comment, tOther.getState());
    }

    @Test
    public void commentEnd_givenInputs_shouldHandleAllBranches() {
        CharacterReader rGt = new CharacterReader(">");
        Tokeniser tGt = new Tokeniser(rGt, ParseErrorList.tracking(10));
        tGt.createCommentPending();
        TokeniserState.CommentEnd.read(tGt, rGt);
        Assert.assertEquals(TokeniserState.Data, tGt.getState());

        CharacterReader rNull = new CharacterReader("\u0000");
        Tokeniser tNull = new Tokeniser(rNull, ParseErrorList.tracking(10));
        tNull.createCommentPending();
        TokeniserState.CommentEnd.read(tNull, rNull);
        Assert.assertEquals(TokeniserState.Comment, tNull.getState());
        Assert.assertFalse(tNull.getErrors().isEmpty());

        CharacterReader rBang = new CharacterReader("!");
        Tokeniser tBang = new Tokeniser(rBang, ParseErrorList.tracking(10));
        tBang.createCommentPending();
        TokeniserState.CommentEnd.read(tBang, rBang);
        Assert.assertEquals(TokeniserState.CommentEndBang, tBang.getState());
        Assert.assertFalse(tBang.getErrors().isEmpty());

        CharacterReader rDash = new CharacterReader("-");
        Tokeniser tDash = new Tokeniser(rDash, ParseErrorList.tracking(10));
        tDash.createCommentPending();
        TokeniserState.CommentEnd.read(tDash, rDash);
        Assert.assertFalse(tDash.getErrors().isEmpty());

        CharacterReader rEof = new CharacterReader("");
        Tokeniser tEof = new Tokeniser(rEof, ParseErrorList.tracking(10));
        tEof.createCommentPending();
        TokeniserState.CommentEnd.read(tEof, rEof);
        Assert.assertEquals(TokeniserState.Data, tEof.getState());
        Assert.assertFalse(tEof.getErrors().isEmpty());

        CharacterReader rOther = new CharacterReader("a");
        Tokeniser tOther = new Tokeniser(rOther, ParseErrorList.tracking(10));
        tOther.createCommentPending();
        TokeniserState.CommentEnd.read(tOther, rOther);
        Assert.assertEquals(TokeniserState.Comment, tOther.getState());
        Assert.assertFalse(tOther.getErrors().isEmpty());
    }

    @Test
    public void commentEndBang_givenInputs_shouldHandleAllBranches() {
        CharacterReader rDash = new CharacterReader("-");
        Tokeniser tDash = new Tokeniser(rDash, ParseErrorList.tracking(10));
        tDash.createCommentPending();
        TokeniserState.CommentEndBang.read(tDash, rDash);
        Assert.assertEquals(TokeniserState.CommentEndDash, tDash.getState());

        CharacterReader rGt = new CharacterReader(">");
        Tokeniser tGt = new Tokeniser(rGt, ParseErrorList.tracking(10));
        tGt.createCommentPending();
        TokeniserState.CommentEndBang.read(tGt, rGt);
        Assert.assertEquals(TokeniserState.Data, tGt.getState());

        CharacterReader rNull = new CharacterReader("\u0000");
        Tokeniser tNull = new Tokeniser(rNull, ParseErrorList.tracking(10));
        tNull.createCommentPending();
        TokeniserState.CommentEndBang.read(tNull, rNull);
        Assert.assertEquals(TokeniserState.Comment, tNull.getState());
        Assert.assertFalse(tNull.getErrors().isEmpty());

        CharacterReader rEof = new CharacterReader("");
        Tokeniser tEof = new Tokeniser(rEof, ParseErrorList.tracking(10));
        tEof.createCommentPending();
        TokeniserState.CommentEndBang.read(tEof, rEof);
        Assert.assertEquals(TokeniserState.Data, tEof.getState());
        Assert.assertFalse(tEof.getErrors().isEmpty());

        CharacterReader rOther = new CharacterReader("a");
        Tokeniser tOther = new Tokeniser(rOther, ParseErrorList.tracking(10));
        tOther.createCommentPending();
        TokeniserState.CommentEndBang.read(tOther, rOther);
        Assert.assertEquals(TokeniserState.Comment, tOther.getState());
    }

    @Test
    public void doctype_givenInputs_shouldHandleAllBranches() {
        char[] spaces = new char[]{'\t', '\n', '\r', '\f', ' '};
        for (int i = 0; i < spaces.length; i++) {
            CharacterReader r = new CharacterReader(String.valueOf(spaces[i]));
            Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
            TokeniserState.Doctype.read(t, r);
            Assert.assertEquals(TokeniserState.BeforeDoctypeName, t.getState());
        }

        CharacterReader rGt = new CharacterReader(">");
        Tokeniser tGt = new Tokeniser(rGt, ParseErrorList.tracking(10));
        TokeniserState.Doctype.read(tGt, rGt);
        Assert.assertEquals(TokeniserState.Data, tGt.getState());
        Assert.assertTrue(tGt.doctypePending.isForceQuirks());

        CharacterReader rEof = new CharacterReader("");
        Tokeniser tEof = new Tokeniser(rEof, ParseErrorList.tracking(10));
        TokeniserState.Doctype.read(tEof, rEof);
        Assert.assertEquals(TokeniserState.Data, tEof.getState());
        Assert.assertTrue(tEof.doctypePending.isForceQuirks());

        CharacterReader rOther = new CharacterReader("a");
        Tokeniser tOther = new Tokeniser(rOther, ParseErrorList.tracking(10));
        TokeniserState.Doctype.read(tOther, rOther);
        Assert.assertEquals(TokeniserState.BeforeDoctypeName, tOther.getState());
        Assert.assertFalse(tOther.getErrors().isEmpty());
    }

    @Test
    public void beforeDoctypeName_givenInputs_shouldHandleAllBranches() {
        CharacterReader rLetter = new CharacterReader("html");
        Tokeniser tLetter = new Tokeniser(rLetter, ParseErrorList.tracking(10));
        TokeniserState.BeforeDoctypeName.read(tLetter, rLetter);
        Assert.assertEquals(TokeniserState.DoctypeName, tLetter.getState());

        char[] spaces = new char[]{'\t', '\n', '\r', '\f', ' '};
        for (int i = 0; i < spaces.length; i++) {
            CharacterReader r = new CharacterReader(String.valueOf(spaces[i]));
            Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
            TokeniserState.BeforeDoctypeName.read(t, r);
        }

        CharacterReader rNull = new CharacterReader("\u0000");
        Tokeniser tNull = new Tokeniser(rNull, ParseErrorList.tracking(10));
        TokeniserState.BeforeDoctypeName.read(tNull, rNull);
        Assert.assertEquals(TokeniserState.DoctypeName, tNull.getState());
        Assert.assertFalse(tNull.getErrors().isEmpty());

        CharacterReader rEof = new CharacterReader("");
        Tokeniser tEof = new Tokeniser(rEof, ParseErrorList.tracking(10));
        TokeniserState.BeforeDoctypeName.read(tEof, rEof);
        Assert.assertEquals(TokeniserState.Data, tEof.getState());
        Assert.assertTrue(tEof.doctypePending.isForceQuirks());

        CharacterReader rOther = new CharacterReader("?");
        Tokeniser tOther = new Tokeniser(rOther, ParseErrorList.tracking(10));
        TokeniserState.BeforeDoctypeName.read(tOther, rOther);
        Assert.assertEquals(TokeniserState.DoctypeName, tOther.getState());
    }

    @Test
    public void doctypeName_givenInputs_shouldHandleAllBranches() {
        CharacterReader rLetter = new CharacterReader("html ");
        Tokeniser tLetter = new Tokeniser(rLetter, ParseErrorList.tracking(10));
        tLetter.createDoctypePending();
        TokeniserState.DoctypeName.read(tLetter, rLetter);
        Assert.assertEquals("html", tLetter.doctypePending.getName());

        CharacterReader rGt = new CharacterReader(">");
        Tokeniser tGt = new Tokeniser(rGt, ParseErrorList.tracking(10));
        tGt.createDoctypePending();
        TokeniserState.DoctypeName.read(tGt, rGt);
        Assert.assertEquals(TokeniserState.Data, tGt.getState());

        char[] spaces = new char[]{'\t', '\n', '\r', '\f', ' '};
        for (int i = 0; i < spaces.length; i++) {
            CharacterReader r = new CharacterReader(String.valueOf(spaces[i]));
            Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
            t.createDoctypePending();
            TokeniserState.DoctypeName.read(t, r);
            Assert.assertEquals(TokeniserState.AfterDoctypeName, t.getState());
        }

        CharacterReader rNull = new CharacterReader("\u0000");
        Tokeniser tNull = new Tokeniser(rNull, ParseErrorList.tracking(10));
        tNull.createDoctypePending();
        TokeniserState.DoctypeName.read(tNull, rNull);
        Assert.assertFalse(tNull.getErrors().isEmpty());

        CharacterReader rEof = new CharacterReader("");
        Tokeniser tEof = new Tokeniser(rEof, ParseErrorList.tracking(10));
        tEof.createDoctypePending();
        TokeniserState.DoctypeName.read(tEof, rEof);
        Assert.assertEquals(TokeniserState.Data, tEof.getState());
        Assert.assertTrue(tEof.doctypePending.isForceQuirks());

        CharacterReader rOther = new CharacterReader("-");
        Tokeniser tOther = new Tokeniser(rOther, ParseErrorList.tracking(10));
        tOther.createDoctypePending();
        TokeniserState.DoctypeName.read(tOther, rOther);
    }

    @Test
    public void afterDoctypeName_givenInputs_shouldHandleAllBranches() {
        CharacterReader rEof = new CharacterReader("");
        Tokeniser tEof = new Tokeniser(rEof, ParseErrorList.tracking(10));
        tEof.createDoctypePending();
        TokeniserState.AfterDoctypeName.read(tEof, rEof);
        Assert.assertEquals(TokeniserState.Data, tEof.getState());
        Assert.assertTrue(tEof.doctypePending.isForceQuirks());

        char[] spaces = new char[]{'\t', '\n', '\r', '\f', ' '};
        for (int i = 0; i < spaces.length; i++) {
            CharacterReader r = new CharacterReader(String.valueOf(spaces[i]));
            Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
            t.createDoctypePending();
            TokeniserState.AfterDoctypeName.read(t, r);
        }

        CharacterReader rGt = new CharacterReader(">");
        Tokeniser tGt = new Tokeniser(rGt, ParseErrorList.tracking(10));
        tGt.createDoctypePending();
        TokeniserState.AfterDoctypeName.read(tGt, rGt);
        Assert.assertEquals(TokeniserState.Data, tGt.getState());

        CharacterReader rPub = new CharacterReader("PUBLIC");
        Tokeniser tPub = new Tokeniser(rPub, ParseErrorList.tracking(10));
        tPub.createDoctypePending();
        TokeniserState.AfterDoctypeName.read(tPub, rPub);
        Assert.assertEquals(TokeniserState.AfterDoctypePublicKeyword, tPub.getState());

        CharacterReader rSys = new CharacterReader("SYSTEM");
        Tokeniser tSys = new Tokeniser(rSys, ParseErrorList.tracking(10));
        tSys.createDoctypePending();
        TokeniserState.AfterDoctypeName.read(tSys, rSys);
        Assert.assertEquals(TokeniserState.AfterDoctypeSystemKeyword, tSys.getState());

        CharacterReader rBogus = new CharacterReader("BOGUS");
        Tokeniser tBogus = new Tokeniser(rBogus, ParseErrorList.tracking(10));
        tBogus.createDoctypePending();
        TokeniserState.AfterDoctypeName.read(tBogus, rBogus);
        Assert.assertEquals(TokeniserState.BogusDoctype, tBogus.getState());
        Assert.assertTrue(tBogus.doctypePending.isForceQuirks());
    }

    @Test
    public void afterDoctypePublicKeyword_givenInputs_shouldHandleAllBranches() {
        char[] spaces = new char[]{'\t', '\n', '\r', '\f', ' '};
        for (int i = 0; i < spaces.length; i++) {
            CharacterReader r = new CharacterReader(String.valueOf(spaces[i]));
            Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
            t.createDoctypePending();
            TokeniserState.AfterDoctypePublicKeyword.read(t, r);
            Assert.assertEquals(TokeniserState.BeforeDoctypePublicIdentifier, t.getState());
        }

        CharacterReader rDq = new CharacterReader("\"");
        Tokeniser tDq = new Tokeniser(rDq, ParseErrorList.tracking(10));
        tDq.createDoctypePending();
        TokeniserState.AfterDoctypePublicKeyword.read(tDq, rDq);
        Assert.assertEquals(TokeniserState.DoctypePublicIdentifier_doubleQuoted, tDq.getState());

        CharacterReader rSq = new CharacterReader("'");
        Tokeniser tSq = new Tokeniser(rSq, ParseErrorList.tracking(10));
        tSq.createDoctypePending();
        TokeniserState.AfterDoctypePublicKeyword.read(tSq, rSq);
        Assert.assertEquals(TokeniserState.DoctypePublicIdentifier_singleQuoted, tSq.getState());

        CharacterReader rGt = new CharacterReader(">");
        Tokeniser tGt = new Tokeniser(rGt, ParseErrorList.tracking(10));
        tGt.createDoctypePending();
        TokeniserState.AfterDoctypePublicKeyword.read(tGt, rGt);
        Assert.assertEquals(TokeniserState.Data, tGt.getState());
        Assert.assertTrue(tGt.doctypePending.isForceQuirks());

        CharacterReader rEof = new CharacterReader("");
        Tokeniser tEof = new Tokeniser(rEof, ParseErrorList.tracking(10));
        tEof.createDoctypePending();
        TokeniserState.AfterDoctypePublicKeyword.read(tEof, rEof);
        Assert.assertEquals(TokeniserState.Data, tEof.getState());
        Assert.assertTrue(tEof.doctypePending.isForceQuirks());

        CharacterReader rOther = new CharacterReader("x");
        Tokeniser tOther = new Tokeniser(rOther, ParseErrorList.tracking(10));
        tOther.createDoctypePending();
        TokeniserState.AfterDoctypePublicKeyword.read(tOther, rOther);
        Assert.assertEquals(TokeniserState.BogusDoctype, tOther.getState());
        Assert.assertTrue(tOther.doctypePending.isForceQuirks());
    }

    @Test
    public void beforeDoctypePublicIdentifier_givenInputs_shouldHandleAllBranches() {
        char[] spaces = new char[]{'\t', '\n', '\r', '\f', ' '};
        for (int i = 0; i < spaces.length; i++) {
            CharacterReader r = new CharacterReader(String.valueOf(spaces[i]));
            Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
            TokeniserState.BeforeDoctypePublicIdentifier.read(t, r);
        }

        CharacterReader rDq = new CharacterReader("\"");
        Tokeniser tDq = new Tokeniser(rDq, ParseErrorList.tracking(10));
        TokeniserState.BeforeDoctypePublicIdentifier.read(tDq, rDq);
        Assert.assertEquals(TokeniserState.DoctypePublicIdentifier_doubleQuoted, tDq.getState());

        CharacterReader rSq = new CharacterReader("'");
        Tokeniser tSq = new Tokeniser(rSq, ParseErrorList.tracking(10));
        TokeniserState.BeforeDoctypePublicIdentifier.read(tSq, rSq);
        Assert.assertEquals(TokeniserState.DoctypePublicIdentifier_singleQuoted, tSq.getState());

        CharacterReader rGt = new CharacterReader(">");
        Tokeniser tGt = new Tokeniser(rGt, ParseErrorList.tracking(10));
        tGt.createDoctypePending();
        TokeniserState.BeforeDoctypePublicIdentifier.read(tGt, rGt);
        Assert.assertEquals(TokeniserState.Data, tGt.getState());
        Assert.assertTrue(tGt.doctypePending.isForceQuirks());

        CharacterReader rEof = new CharacterReader("");
        Tokeniser tEof = new Tokeniser(rEof, ParseErrorList.tracking(10));
        tEof.createDoctypePending();
        TokeniserState.BeforeDoctypePublicIdentifier.read(tEof, rEof);
        Assert.assertEquals(TokeniserState.Data, tEof.getState());
        Assert.assertTrue(tEof.doctypePending.isForceQuirks());

        CharacterReader rOther = new CharacterReader("z");
        Tokeniser tOther = new Tokeniser(rOther, ParseErrorList.tracking(10));
        tOther.createDoctypePending();
        TokeniserState.BeforeDoctypePublicIdentifier.read(tOther, rOther);
        Assert.assertEquals(TokeniserState.BogusDoctype, tOther.getState());
        Assert.assertTrue(tOther.doctypePending.isForceQuirks());
    }

    @Test
    public void doctypePublicIdentifier_doubleQuoted_givenInputs_shouldHandleAllBranches() {
        CharacterReader rDq = new CharacterReader("\"");
        Tokeniser tDq = new Tokeniser(rDq, ParseErrorList.tracking(10));
        TokeniserState.DoctypePublicIdentifier_doubleQuoted.read(tDq, rDq);
        Assert.assertEquals(TokeniserState.AfterDoctypePublicIdentifier, tDq.getState());

        CharacterReader rNull = new CharacterReader("\u0000");
        Tokeniser tNull = new Tokeniser(rNull, ParseErrorList.tracking(10));
        tNull.createDoctypePending();