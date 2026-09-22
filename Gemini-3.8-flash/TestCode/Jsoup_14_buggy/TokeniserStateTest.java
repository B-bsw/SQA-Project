package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;

public class TokeniserStateTest {

    private Tokeniser createTokeniser(CharacterReader reader) {
        ParseErrorList errors = ParseErrorList.tracking(100);
        return new Tokeniser(reader, errors);
    }

    private CharacterReader createReader(String input) {
        return new CharacterReader(input);
    }

    // -------------------------------------------------------------------------
    // Data State
    // -------------------------------------------------------------------------

    @Test
    public void read_dataGivenAmpersand_shouldTransitionToCharacterReferenceInData() {
        CharacterReader reader = createReader("&amp;");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.Data.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.CharacterReferenceInData, tokeniser.getState());
    }

    @Test
    public void read_dataGivenLessThanSign_shouldTransitionToTagOpen() {
        CharacterReader reader = createReader("<div");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.Data.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.TagOpen, tokeniser.getState());
    }

    @Test
    public void read_dataGivenNullChar_shouldEmitNullAndLogParseError() {
        CharacterReader reader = createReader("\u0000text");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.Data.read(tokeniser, reader);

        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_dataGivenEof_shouldEmitEofToken() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.Data.read(tokeniser, reader);

        Token token = tokeniser.read();
        Assert.assertEquals(Token.TokenType.EOF, token.type);
    }

    @Test
    public void read_dataGivenPlainText_shouldEmitCharacterToken() {
        CharacterReader reader = createReader("simple text<");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.Data.read(tokeniser, reader);

        Token token = tokeniser.read();
        Assert.assertTrue(token.isCharacter());
        Assert.assertEquals("simple text", token.asCharacter().getData());
    }

    // -------------------------------------------------------------------------
    // CharacterReferenceInData State
    // -------------------------------------------------------------------------

    @Test
    public void read_characterReferenceInDataGivenNamedEntity_shouldEmitCharacterAndTransitionToData() {
        CharacterReader reader = createReader("lt;");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.CharacterReferenceInData.read(tokeniser, reader);

        Token token = tokeniser.read();
        Assert.assertEquals("<", token.asCharacter().getData());
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    @Test
    public void read_characterReferenceInDataGivenInvalidEntity_shouldEmitAmpersandAndTransitionToData() {
        CharacterReader reader = createReader("notAnEntity;");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.CharacterReferenceInData.read(tokeniser, reader);

        Token token = tokeniser.read();
        Assert.assertEquals("&", token.asCharacter().getData());
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    // -------------------------------------------------------------------------
    // Rcdata State & CharacterReferenceInRcdata
    // -------------------------------------------------------------------------

    @Test
    public void read_rcdataGivenAmpersand_shouldTransitionToCharacterReferenceInRcdata() {
        CharacterReader reader = createReader("&amp;");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.Rcdata.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.CharacterReferenceInRcdata, tokeniser.getState());
    }

    @Test
    public void read_rcdataGivenLessThanSign_shouldTransitionToRcdataLessthanSign() {
        CharacterReader reader = createReader("</title>");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.Rcdata.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.RcdataLessthanSign, tokeniser.getState());
    }

    @Test
    public void read_rcdataGivenNullChar_shouldEmitReplacementCharAndLogParseError() {
        CharacterReader reader = createReader("\u0000");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.Rcdata.read(tokeniser, reader);

        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_rcdataGivenEof_shouldEmitEofToken() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.Rcdata.read(tokeniser, reader);

        Token token = tokeniser.read();
        Assert.assertEquals(Token.TokenType.EOF, token.type);
    }

    @Test
    public void read_rcdataGivenDataText_shouldEmitCharacterToken() {
        CharacterReader reader = createReader("Sample RCDATA<");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.Rcdata.read(tokeniser, reader);

        Token token = tokeniser.read();
        Assert.assertEquals("Sample RCDATA", token.asCharacter().getData());
    }

    @Test
    public void read_characterReferenceInRcdataGivenNamedEntity_shouldEmitCharacterAndTransitionToRcdata() {
        CharacterReader reader = createReader("gt;");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.CharacterReferenceInRcdata.read(tokeniser, reader);

        Token token = tokeniser.read();
        Assert.assertEquals(">", token.asCharacter().getData());
        Assert.assertEquals(TokeniserState.Rcdata, tokeniser.getState());
    }

    @Test
    public void read_characterReferenceInRcdataGivenInvalidEntity_shouldEmitAmpersandAndTransitionToRcdata() {
        CharacterReader reader = createReader("invalid;");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.CharacterReferenceInRcdata.read(tokeniser, reader);

        Token token = tokeniser.read();
        Assert.assertEquals("&", token.asCharacter().getData());
        Assert.assertEquals(TokeniserState.Rcdata, tokeniser.getState());
    }

    // -------------------------------------------------------------------------
    // Rawtext State
    // -------------------------------------------------------------------------

    @Test
    public void read_rawtextGivenLessThanSign_shouldTransitionToRawtextLessthanSign() {
        CharacterReader reader = createReader("</style>");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.Rawtext.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.RawtextLessthanSign, tokeniser.getState());
    }

    @Test
    public void read_rawtextGivenNullChar_shouldEmitReplacementCharAndLogParseError() {
        CharacterReader reader = createReader("\u0000");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.Rawtext.read(tokeniser, reader);

        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_rawtextGivenEof_shouldEmitEofToken() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.Rawtext.read(tokeniser, reader);

        Token token = tokeniser.read();
        Assert.assertEquals(Token.TokenType.EOF, token.type);
    }

    @Test
    public void read_rawtextGivenContent_shouldEmitCharacters() {
        CharacterReader reader = createReader("h1 { color: red; }<");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.Rawtext.read(tokeniser, reader);

        Token token = tokeniser.read();
        Assert.assertEquals("h1 { color: red; }", token.asCharacter().getData());
    }

    // -------------------------------------------------------------------------
    // ScriptData State
    // -------------------------------------------------------------------------

    @Test
    public void read_scriptDataGivenLessThanSign_shouldTransitionToScriptDataLessthanSign() {
        CharacterReader reader = createReader("</script>");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.ScriptData.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.ScriptDataLessthanSign, tokeniser.getState());
    }

    @Test
    public void read_scriptDataGivenNullChar_shouldEmitReplacementCharAndLogParseError() {
        CharacterReader reader = createReader("\u0000");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.ScriptData.read(tokeniser, reader);

        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_scriptDataGivenEof_shouldEmitEofToken() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.ScriptData.read(tokeniser, reader);

        Token token = tokeniser.read();
        Assert.assertEquals(Token.TokenType.EOF, token.type);
    }

    @Test
    public void read_scriptDataGivenCode_shouldEmitCharacters() {
        CharacterReader reader = createReader("var x = 10;<");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.ScriptData.read(tokeniser, reader);

        Token token = tokeniser.read();
        Assert.assertEquals("var x = 10;", token.asCharacter().getData());
    }

    // -------------------------------------------------------------------------
    // PLAINTEXT State
    // -------------------------------------------------------------------------

    @Test
    public void read_plaintextGivenNullChar_shouldEmitReplacementCharAndLogParseError() {
        CharacterReader reader = createReader("\u0000");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.PLAINTEXT.read(tokeniser, reader);

        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_plaintextGivenEof_shouldEmitEofToken() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.PLAINTEXT.read(tokeniser, reader);

        Token token = tokeniser.read();
        Assert.assertEquals(Token.TokenType.EOF, token.type);
    }

    @Test
    public void read_plaintextGivenContent_shouldEmitCharacters() {
        CharacterReader reader = createReader("Plain content with <tags>&entities\u0000");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.PLAINTEXT.read(tokeniser, reader);

        Token token = tokeniser.read();
        Assert.assertEquals("Plain content with <tags>&entities", token.asCharacter().getData());
    }

    // -------------------------------------------------------------------------
    // TagOpen State
    // -------------------------------------------------------------------------

    @Test
    public void read_tagOpenGivenExclamation_shouldTransitionToMarkupDeclarationOpen() {
        CharacterReader reader = createReader("!--");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.TagOpen.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.MarkupDeclarationOpen, tokeniser.getState());
    }

    @Test
    public void read_tagOpenGivenSlash_shouldTransitionToEndTagOpen() {
        CharacterReader reader = createReader("/div>");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.TagOpen.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.EndTagOpen, tokeniser.getState());
    }

    @Test
    public void read_tagOpenGivenQuestionMark_shouldTransitionToBogusComment() {
        CharacterReader reader = createReader("?xml version='1.0'?>");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.TagOpen.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.BogusComment, tokeniser.getState());
    }

    @Test
    public void read_tagOpenGivenLetter_shouldCreateTagPendingAndTransitionToTagName() {
        CharacterReader reader = createReader("span>");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.TagOpen.read(tokeniser, reader);

        Assert.assertNotNull(tokeniser.tagPending);
        Assert.assertEquals(TokeniserState.TagName, tokeniser.getState());
    }

    @Test
    public void read_tagOpenGivenInvalidChar_shouldEmitLessThanAndTransitionToData() {
        CharacterReader reader = createReader("123");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.TagOpen.read(tokeniser, reader);

        Assert.assertFalse(tokeniser.getErrors().isEmpty());
        Token token = tokeniser.read();
        Assert.assertEquals("<", token.asCharacter().getData());
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    // -------------------------------------------------------------------------
    // EndTagOpen State
    // -------------------------------------------------------------------------

    @Test
    public void read_endTagOpenGivenEmptyReader_shouldEmitLessThanSlashAndTransitionToData() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.EndTagOpen.read(tokeniser, reader);

        Assert.assertFalse(tokeniser.getErrors().isEmpty());
        Token token = tokeniser.read();
        Assert.assertEquals("</", token.asCharacter().getData());
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    @Test
    public void read_endTagOpenGivenLetter_shouldCreateTagPendingAndTransitionToTagName() {
        CharacterReader reader = createReader("div>");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.EndTagOpen.read(tokeniser, reader);

        Assert.assertNotNull(tokeniser.tagPending);
        Assert.assertEquals(TokeniserState.TagName, tokeniser.getState());
    }

    @Test
    public void read_endTagOpenGivenGreaterThan_shouldLogErrorAndAdvanceToData() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.EndTagOpen.read(tokeniser, reader);

        Assert.assertFalse(tokeniser.getErrors().isEmpty());
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    @Test
    public void read_endTagOpenGivenInvalidChar_shouldLogErrorAndAdvanceToBogusComment() {
        CharacterReader reader = createReader("!bogus>");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.EndTagOpen.read(tokeniser, reader);

        Assert.assertFalse(tokeniser.getErrors().isEmpty());
        Assert.assertEquals(TokeniserState.BogusComment, tokeniser.getState());
    }

    // -------------------------------------------------------------------------
    // TagName State
    // -------------------------------------------------------------------------

    @Test
    public void read_tagNameGivenWhitespace_shouldTransitionToBeforeAttributeName() {
        CharacterReader reader = createReader("b ");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);

        TokeniserState.TagName.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.BeforeAttributeName, tokeniser.getState());
    }

    @Test
    public void read_tagNameGivenSlash_shouldTransitionToSelfClosingStartTag() {
        CharacterReader reader = createReader("br/");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);

        TokeniserState.TagName.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.SelfClosingStartTag, tokeniser.getState());
    }

    @Test
    public void read_tagNameGivenGreaterThan_shouldEmitTagPendingAndTransitionToData() {
        CharacterReader reader = createReader("p>");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);

        TokeniserState.TagName.read(tokeniser, reader);

        Token token = tokeniser.read();
        Assert.assertTrue(token.isStartTag());
        Assert.assertEquals("p", token.asStartTag().name());
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    @Test
    public void read_tagNameGivenNullChar_shouldAppendReplacementCharacter() {
        CharacterReader reader = createReader("a\u0000");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);

        TokeniserState.TagName.read(tokeniser, reader);

        Assert.assertTrue(tokeniser.tagPending.name().indexOf("\uFFFD") != -1);
    }

    @Test
    public void read_tagNameGivenEof_shouldLogEofErrorAndTransitionToData() {
        CharacterReader reader = createReader("div");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);

        TokeniserState.TagName.read(tokeniser, reader);

        Assert.assertFalse(tokeniser.getErrors().isEmpty());
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    // -------------------------------------------------------------------------
    // RcdataLessthanSign & RCDATAEndTagOpen & RCDATAEndTagName
    // -------------------------------------------------------------------------

    @Test
    public void read_rcdataLessthanSignGivenSlash_shouldCreateTempBufferAndAdvanceToRCDATAEndTagOpen() {
        CharacterReader reader = createReader("/title>");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.RcdataLessthanSign.read(tokeniser, reader);

        Assert.assertNotNull(tokeniser.dataBuffer);
        Assert.assertEquals(TokeniserState.RCDATAEndTagOpen, tokeniser.getState());
    }

    @Test
    public void read_rcdataLessthanSignGivenNonSlash_shouldEmitLessThanAndTransitionToRcdata() {
        CharacterReader reader = createReader("other");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.RcdataLessthanSign.read(tokeniser, reader);

        Token token = tokeniser.read();
        Assert.assertEquals("<", token.asCharacter().getData());
        Assert.assertEquals(TokeniserState.Rcdata, tokeniser.getState());
    }

    @Test
    public void read_rcdataEndTagOpenGivenLetter_shouldAdvanceToRCDATAEndTagName() {
        CharacterReader reader = createReader("t");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTempBuffer();

        TokeniserState.RCDATAEndTagOpen.read(tokeniser, reader);

        Assert.assertNotNull(tokeniser.tagPending);
        Assert.assertEquals("t", tokeniser.dataBuffer.toString());
        Assert.assertEquals(TokeniserState.RCDATAEndTagName, tokeniser.getState());
    }

    @Test
    public void read_rcdataEndTagOpenGivenNonLetter_shouldEmitLessThanSlashAndTransitionToRcdata() {
        CharacterReader reader = createReader("1");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.RCDATAEndTagOpen.read(tokeniser, reader);

        Token token = tokeniser.read();
        Assert.assertEquals("</", token.asCharacter().getData());
        Assert.assertEquals(TokeniserState.Rcdata, tokeniser.getState());
    }

    @Test
    public void read_rcdataEndTagNameGivenLetters_shouldAppendSequence() {
        CharacterReader reader = createReader("itle>");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(false);
        tokeniser.createTempBuffer();

        TokeniserState.RCDATAEndTagName.read(tokeniser, reader);

        Assert.assertEquals("itle", tokeniser.dataBuffer.toString());
    }

    @Test
    public void read_rcdataEndTagNameGivenAppropriateEndTagFollowedByGreaterThan_shouldEmitAndTransitionToData() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);
        tokeniser.tagPending.appendTagName("title");
        tokeniser.emitTagPending(); // sets lastStartTag
        tokeniser.createTagPending(false);
        tokeniser.tagPending.appendTagName("title");
        tokeniser.createTempBuffer();

        TokeniserState.RCDATAEndTagName.read(tokeniser, reader);

        Token token = tokeniser.read();
        Assert.assertTrue(token.isEndTag());
        Assert.assertEquals("title", token.asEndTag().name());
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    @Test
    public void read_rcdataEndTagNameGivenInappropriateEndTagFollowedByGreaterThan_shouldEmitBufferAndTransitionToRcdata() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(false);
        tokeniser.createTempBuffer();
        tokeniser.dataBuffer.append("other");

        TokeniserState.RCDATAEndTagName.read(tokeniser, reader);

        Token token = tokeniser.read();
        Assert.assertEquals("</other", token.asCharacter().getData());
        Assert.assertEquals(TokeniserState.Rcdata, tokeniser.getState());
    }

    @Test
    public void read_rcdataEndTagNameGivenAppropriateEndTagFollowedByWhitespace_shouldTransitionToBeforeAttributeName() {
        CharacterReader reader = createReader(" ");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);
        tokeniser.tagPending.appendTagName("title");
        tokeniser.emitTagPending();
        tokeniser.createTagPending(false);
        tokeniser.tagPending.appendTagName("title");

        TokeniserState.RCDATAEndTagName.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.BeforeAttributeName, tokeniser.getState());
    }

    @Test
    public void read_rcdataEndTagNameGivenAppropriateEndTagFollowedBySlash_shouldTransitionToSelfClosingStartTag() {
        CharacterReader reader = createReader("/");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);
        tokeniser.tagPending.appendTagName("title");
        tokeniser.emitTagPending();
        tokeniser.createTagPending(false);
        tokeniser.tagPending.appendTagName("title");

        TokeniserState.RCDATAEndTagName.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.SelfClosingStartTag, tokeniser.getState());
    }

    // -------------------------------------------------------------------------
    // RawtextLessthanSign & RawtextEndTagOpen & RawtextEndTagName
    // -------------------------------------------------------------------------

    @Test
    public void read_rawtextLessthanSignGivenSlash_shouldAdvanceToRawtextEndTagOpen() {
        CharacterReader reader = createReader("/style>");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.RawtextLessthanSign.read(tokeniser, reader);

        Assert.assertNotNull(tokeniser.dataBuffer);
        Assert.assertEquals(TokeniserState.RawtextEndTagOpen, tokeniser.getState());
    }

    @Test
    public void read_rawtextLessthanSignGivenNonSlash_shouldEmitLessThanAndTransitionToRawtext() {
        CharacterReader reader = createReader("other");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.RawtextLessthanSign.read(tokeniser, reader);

        Token token = tokeniser.read();
        Assert.assertEquals("<", token.asCharacter().getData());
        Assert.assertEquals(TokeniserState.Rawtext, tokeniser.getState());
    }

    @Test
    public void read_rawtextEndTagOpenGivenLetter_shouldTransitionToRawtextEndTagName() {
        CharacterReader reader = createReader("s");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.RawtextEndTagOpen.read(tokeniser, reader);

        Assert.assertNotNull(tokeniser.tagPending);
        Assert.assertEquals(TokeniserState.RawtextEndTagName, tokeniser.getState());
    }

    @Test
    public void read_rawtextEndTagOpenGivenNonLetter_shouldEmitLessThanSlashAndTransitionToRawtext() {
        CharacterReader reader = createReader("1");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.RawtextEndTagOpen.read(tokeniser, reader);

        Token token = tokeniser.read();
        Assert.assertEquals("</", token.asCharacter().getData());
        Assert.assertEquals(TokeniserState.Rawtext, tokeniser.getState());
    }

    @Test
    public void read_rawtextEndTagNameGivenAppropriateTagFollowedByGreaterThan_shouldEmitAndTransitionToData() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);
        tokeniser.tagPending.appendTagName("style");
        tokeniser.emitTagPending();
        tokeniser.createTagPending(false);
        tokeniser.tagPending.appendTagName("style");

        TokeniserState.RawtextEndTagName.read(tokeniser, reader);

        Token token = tokeniser.read();
        Assert.assertTrue(token.isEndTag());
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    @Test
    public void read_rawtextEndTagNameGivenInappropriateTag_shouldEmitBufferAndTransitionToRawtext() {
        CharacterReader reader = createReader("x");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(false);
        tokeniser.createTempBuffer();
        tokeniser.dataBuffer.append("foo");

        TokeniserState.RawtextEndTagName.read(tokeniser, reader);

        Token token = tokeniser.read();
        Assert.assertEquals("</foo", token.asCharacter().getData());
        Assert.assertEquals(TokeniserState.Rawtext, tokeniser.getState());
    }

    // -------------------------------------------------------------------------
    // ScriptDataLessthanSign & ScriptDataEndTag
    // -------------------------------------------------------------------------

    @Test
    public void read_scriptDataLessthanSignGivenSlash_shouldTransitionToScriptDataEndTagOpen() {
        CharacterReader reader = createReader("/script>");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.ScriptDataLessthanSign.read(tokeniser, reader);

        Assert.assertNotNull(tokeniser.dataBuffer);
        Assert.assertEquals(TokeniserState.ScriptDataEndTagOpen, tokeniser.getState());
    }

    @Test
    public void read_scriptDataLessthanSignGivenExclamation_shouldEmitAndTransitionToScriptDataEscapeStart() {
        CharacterReader reader = createReader("!--");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.ScriptDataLessthanSign.read(tokeniser, reader);

        Token token = tokeniser.read();
        Assert.assertEquals("<!", token.asCharacter().getData());
        Assert.assertEquals(TokeniserState.ScriptDataEscapeStart, tokeniser.getState());
    }

    @Test
    public void read_scriptDataLessthanSignGivenOther_shouldEmitLessThanAndTransitionToScriptData() {
        CharacterReader reader = createReader("console");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.ScriptDataLessthanSign.read(tokeniser, reader);

        Token token = tokeniser.read();
        Assert.assertEquals("<", token.asCharacter().getData());
        Assert.assertEquals(TokeniserState.ScriptData, tokeniser.getState());
    }

    @Test
    public void read_scriptDataEndTagOpenGivenLetter_shouldTransitionToScriptDataEndTagName() {
        CharacterReader reader = createReader("s");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.ScriptDataEndTagOpen.read(tokeniser, reader);

        Assert.assertNotNull(tokeniser.tagPending);
        Assert.assertEquals(TokeniserState.ScriptDataEndTagName, tokeniser.getState());
    }

    @Test
    public void read_scriptDataEndTagOpenGivenNonLetter_shouldEmitLessThanSlashAndTransitionToScriptData() {
        CharacterReader reader = createReader("9");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.ScriptDataEndTagOpen.read(tokeniser, reader);

        Token token = tokeniser.read();
        Assert.assertEquals("</", token.asCharacter().getData());
        Assert.assertEquals(TokeniserState.ScriptData, tokeniser.getState());
    }

    @Test
    public void read_scriptDataEndTagNameGivenAppropriateTagFollowedByGreaterThan_shouldEmitAndTransitionToData() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);
        tokeniser.tagPending.appendTagName("script");
        tokeniser.emitTagPending();
        tokeniser.createTagPending(false);
        tokeniser.tagPending.appendTagName("script");

        TokeniserState.ScriptDataEndTagName.read(tokeniser, reader);

        Token token = tokeniser.read();
        Assert.assertTrue(token.isEndTag());
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    // -------------------------------------------------------------------------
    // ScriptData Escape Sequence States
    // -------------------------------------------------------------------------

    @Test
    public void read_scriptDataEscapeStartGivenDash_shouldAdvanceToScriptDataEscapeStartDash() {
        CharacterReader reader = createReader("-");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.ScriptDataEscapeStart.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.ScriptDataEscapeStartDash, tokeniser.getState());
    }

    @Test
    public void read_scriptDataEscapeStartGivenNonDash_shouldTransitionToScriptData() {
        CharacterReader reader = createReader("x");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.ScriptDataEscapeStart.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.ScriptData, tokeniser.getState());
    }

    @Test
    public void read_scriptDataEscapeStartDashGivenDash_shouldAdvanceToScriptDataEscapedDashDash() {
        CharacterReader reader = createReader("-");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.ScriptDataEscapeStartDash.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.ScriptDataEscapedDashDash, tokeniser.getState());
    }

    @Test
    public void read_scriptDataEscapeStartDashGivenNonDash_shouldTransitionToScriptData() {
        CharacterReader reader = createReader("x");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.ScriptDataEscapeStartDash.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.ScriptData, tokeniser.getState());
    }

    @Test
    public void read_scriptDataEscapedGivenDash_shouldAdvanceToScriptDataEscapedDash() {
        CharacterReader reader = createReader("-");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.ScriptDataEscaped.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.ScriptDataEscapedDash, tokeniser.getState());
    }

    @Test
    public void read_scriptDataEscapedGivenLessThan_shouldAdvanceToScriptDataEscapedLessthanSign() {
        CharacterReader reader = createReader("<");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.ScriptDataEscaped.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.ScriptDataEscapedLessthanSign, tokeniser.getState());
    }

    @Test
    public void read_scriptDataEscapedGivenEof_shouldLogEofErrorAndTransitionToData() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.ScriptDataEscaped.read(tokeniser, reader);

        Assert.assertFalse(tokeniser.getErrors().isEmpty());
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    @Test
    public void read_scriptDataEscapedDashGivenDash_shouldTransitionToScriptDataEscapedDashDash() {
        CharacterReader reader = createReader("-");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.ScriptDataEscapedDash.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.ScriptDataEscapedDashDash, tokeniser.getState());
    }

    @Test
    public void read_scriptDataEscapedDashDashGivenGreaterThan_shouldTransitionToScriptData() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.ScriptDataEscapedDashDash.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.ScriptData, tokeniser.getState());
    }

    @Test
    public void read_scriptDataEscapedLessthanSignGivenLetter_shouldAdvanceToScriptDataDoubleEscapeStart() {
        CharacterReader reader = createReader("s");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.ScriptDataEscapedLessthanSign.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscapeStart, tokeniser.getState());
    }

    @Test
    public void read_scriptDataEscapedLessthanSignGivenSlash_shouldAdvanceToScriptDataEscapedEndTagOpen() {
        CharacterReader reader = createReader("/script>");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.ScriptDataEscapedLessthanSign.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.ScriptDataEscapedEndTagOpen, tokeniser.getState());
    }

    @Test
    public void read_scriptDataDoubleEscapeStartGivenScriptTagMatch_shouldTransitionToScriptDataDoubleEscaped() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTempBuffer();
        tokeniser.dataBuffer.append("script");

        TokeniserState.ScriptDataDoubleEscapeStart.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscaped, tokeniser.getState());
    }

    @Test
    public void read_scriptDataDoubleEscapedGivenLessThan_shouldAdvanceToScriptDataDoubleEscapedLessthanSign() {
        CharacterReader reader = createReader("<");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.ScriptDataDoubleEscaped.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscapedLessthanSign, tokeniser.getState());
    }

    @Test
    public void read_scriptDataDoubleEscapedLessthanSignGivenSlash_shouldAdvanceToScriptDataDoubleEscapeEnd() {
        CharacterReader reader = createReader("/");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.ScriptDataDoubleEscapedLessthanSign.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscapeEnd, tokeniser.getState());
    }

    @Test
    public void read_scriptDataDoubleEscapeEndGivenScriptEnd_shouldTransitionToScriptDataEscaped() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTempBuffer();
        tokeniser.dataBuffer.append("script");

        TokeniserState.ScriptDataDoubleEscapeEnd.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.ScriptDataEscaped, tokeniser.getState());
    }

    // -------------------------------------------------------------------------
    // Attribute Processing States
    // -------------------------------------------------------------------------

    @Test
    public void read_beforeAttributeNameGivenSlash_shouldTransitionToSelfClosingStartTag() {
        CharacterReader reader = createReader("/");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);

        TokeniserState.BeforeAttributeName.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.SelfClosingStartTag, tokeniser.getState());
    }

    @Test
    public void read_beforeAttributeNameGivenGreaterThan_shouldEmitTagPendingAndTransitionToData() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);

        TokeniserState.BeforeAttributeName.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    @Test
    public void read_beforeAttributeNameGivenLetter_shouldTransitionToAttributeName() {
        CharacterReader reader = createReader("id='test'");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);

        TokeniserState.BeforeAttributeName.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.AttributeName, tokeniser.getState());
    }

    @Test
    public void read_beforeAttributeNameGivenEqualsSign_shouldLogErrorAndTransitionToAttributeName() {
        CharacterReader reader = createReader("=foo");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);

        TokeniserState.BeforeAttributeName.read(tokeniser, reader);

        Assert.assertFalse(tokeniser.getErrors().isEmpty());
        Assert.assertEquals(TokeniserState.AttributeName, tokeniser.getState());
    }

    @Test
    public void read_attributeNameGivenEqualsSign_shouldTransitionToBeforeAttributeValue() {
        CharacterReader reader = createReader("class='x'");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);
        tokeniser.tagPending.newAttribute();

        TokeniserState.AttributeName.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.BeforeAttributeValue, tokeniser.getState());
    }

    @Test
    public void read_attributeNameGivenWhitespace_shouldTransitionToAfterAttributeName() {
        CharacterReader reader = createReader("disabled ");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);
        tokeniser.tagPending.newAttribute();

        TokeniserState.AttributeName.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.AfterAttributeName, tokeniser.getState());
    }

    @Test
    public void read_afterAttributeNameGivenEqualsSign_shouldTransitionToBeforeAttributeValue() {
        CharacterReader reader = createReader("=");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);

        TokeniserState.AfterAttributeName.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.BeforeAttributeValue, tokeniser.getState());
    }

    @Test
    public void read_beforeAttributeValueGivenDoubleQuote_shouldTransitionToAttributeValueDoubleQuoted() {
        CharacterReader reader = createReader("\"val\"");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);

        TokeniserState.BeforeAttributeValue.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.AttributeValue_doubleQuoted, tokeniser.getState());
    }

    @Test
    public void read_beforeAttributeValueGivenSingleQuote_shouldTransitionToAttributeValueSingleQuoted() {
        CharacterReader reader = createReader("'val'");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);

        TokeniserState.BeforeAttributeValue.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.AttributeValue_singleQuoted, tokeniser.getState());
    }

    @Test
    public void read_beforeAttributeValueGivenUnquotedChar_shouldTransitionToAttributeValueUnquoted() {
        CharacterReader reader = createReader("val ");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);

        TokeniserState.BeforeAttributeValue.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.AttributeValue_unquoted, tokeniser.getState());
    }

    @Test
    public void read_attributeValueDoubleQuotedGivenClosingQuote_shouldTransitionToAfterAttributeValueQuoted() {
        CharacterReader reader = createReader("myValue\"");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);

        TokeniserState.AttributeValue_doubleQuoted.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.AfterAttributeValue_quoted, tokeniser.getState());
    }

    @Test
    public void read_attributeValueSingleQuotedGivenClosingQuote_shouldTransitionToAfterAttributeValueQuoted() {
        CharacterReader reader = createReader("myValue'");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);

        TokeniserState.AttributeValue_singleQuoted.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.AfterAttributeValue_quoted, tokeniser.getState());
    }

    @Test
    public void read_attributeValueUnquotedGivenWhitespace_shouldTransitionToBeforeAttributeName() {
        CharacterReader reader = createReader("unquoted ");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);

        TokeniserState.AttributeValue_unquoted.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.BeforeAttributeName, tokeniser.getState());
    }

    @Test
    public void read_attributeValueUnquotedGivenGreaterThan_shouldEmitTagPendingAndTransitionToData() {
        CharacterReader reader = createReader("unquoted>");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);

        TokeniserState.AttributeValue_unquoted.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    @Test
    public void read_afterAttributeValueQuotedGivenSlash_shouldTransitionToSelfClosingStartTag() {
        CharacterReader reader = createReader("/");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);

        TokeniserState.AfterAttributeValue_quoted.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.SelfClosingStartTag, tokeniser.getState());
    }

    @Test
    public void read_afterAttributeValueQuotedGivenGreaterThan_shouldEmitTagPendingAndTransitionToData() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);

        TokeniserState.AfterAttributeValue_quoted.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    @Test
    public void read_selfClosingStartTagGivenGreaterThan_shouldSetSelfClosingAndTransitionToData() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);

        TokeniserState.SelfClosingStartTag.read(tokeniser, reader);

        Assert.assertTrue(tokeniser.tagPending.isSelfClosing());
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    // -------------------------------------------------------------------------
    // MarkupDeclarationOpen & BogusComment & Comments
    // -------------------------------------------------------------------------

    @Test
    public void read_markupDeclarationOpenGivenDashes_shouldTransitionToCommentStart() {
        CharacterReader reader = createReader("-- comment -->");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.MarkupDeclarationOpen.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.CommentStart, tokeniser.getState());
    }

    @Test
    public void read_markupDeclarationOpenGivenDoctype_shouldTransitionToDoctype() {
        CharacterReader reader = createReader("DOCTYPE html>");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.MarkupDeclarationOpen.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.Doctype, tokeniser.getState());
    }

    @Test
    public void read_markupDeclarationOpenGivenCdata_shouldTransitionToCdataSection() {
        CharacterReader reader = createReader("[CDATA[some raw data]]>");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.MarkupDeclarationOpen.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.CdataSection, tokeniser.getState());
    }

    @Test
    public void read_markupDeclarationOpenGivenInvalidDeclaration_shouldLogErrorAndAdvanceToBogusComment() {
        CharacterReader reader = createReader("INVALID>");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.MarkupDeclarationOpen.read(tokeniser, reader);

        Assert.assertFalse(tokeniser.getErrors().isEmpty());
        Assert.assertEquals(TokeniserState.BogusComment, tokeniser.getState());
    }

    @Test
    public void read_bogusCommentGivenContent_shouldEmitCommentAndAdvanceToData() {
        CharacterReader reader = createReader("bogus comment>");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.BogusComment.read(tokeniser, reader);

        Token token = tokeniser.read();
        Assert.assertTrue(token.isComment());
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    @Test
    public void read_commentStartGivenDash_shouldTransitionToCommentStartDash() {
        CharacterReader reader = createReader("-");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createCommentPending();

        TokeniserState.CommentStart.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.CommentStartDash, tokeniser.getState());
    }

    @Test
    public void read_commentStartGivenGreaterThan_shouldLogErrorEmitAndTransitionToData() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createCommentPending();

        TokeniserState.CommentStart.read(tokeniser, reader);

        Assert.assertFalse(tokeniser.getErrors().isEmpty());
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    @Test
    public void read_commentStartGivenRegularChar_shouldAppendAndTransitionToComment() {
        CharacterReader reader = createReader("hello");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createCommentPending();

        TokeniserState.CommentStart.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.Comment, tokeniser.getState());
    }

    @Test
    public void read_commentGivenDash_shouldAdvanceToCommentEndDash() {
        CharacterReader reader = createReader("-");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createCommentPending();

        TokeniserState.Comment.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.CommentEndDash, tokeniser.getState());
    }

    @Test
    public void read_commentEndDashGivenDash_shouldTransitionToCommentEnd() {
        CharacterReader reader = createReader("-");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createCommentPending();

        TokeniserState.CommentEndDash.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.CommentEnd, tokeniser.getState());
    }

    @Test
    public void read_commentEndGivenGreaterThan_shouldEmitCommentPendingAndTransitionToData() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createCommentPending();

        TokeniserState.CommentEnd.read(tokeniser, reader);

        Token token = tokeniser.read();
        Assert.assertTrue(token.isComment());
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    @Test
    public void read_commentEndGivenBang_shouldLogErrorAndTransitionToCommentEndBang() {
        CharacterReader reader = createReader("!");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createCommentPending();

        TokeniserState.CommentEnd.read(tokeniser, reader);

        Assert.assertFalse(tokeniser.getErrors().isEmpty());
        Assert.assertEquals(TokeniserState.CommentEndBang, tokeniser.getState());
    }

    @Test
    public void read_commentEndBangGivenGreaterThan_shouldEmitCommentPendingAndTransitionToData() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createCommentPending();

        TokeniserState.CommentEndBang.read(tokeniser, reader);

        Token token = tokeniser.read();
        Assert.assertTrue(token.isComment());
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    // -------------------------------------------------------------------------
    // Doctype States
    // -------------------------------------------------------------------------

    @Test
    public void read_doctypeGivenWhitespace_shouldTransitionToBeforeDoctypeName() {
        CharacterReader reader = createReader(" ");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.Doctype.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.BeforeDoctypeName, tokeniser.getState());
    }

    @Test
    public void read_doctypeGivenEof_shouldLogEofErrorSetForceQuirksAndEmit() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.Doctype.read(tokeniser, reader);

        Assert.assertFalse(tokeniser.getErrors().isEmpty());
        Token token = tokeniser.read();
        Assert.assertTrue(token.isDoctype());
        Assert.assertTrue(token.asDoctype().isForceQuirks());
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    @Test
    public void read_beforeDoctypeNameGivenLetter_shouldCreateDoctypePendingAndTransitionToDoctypeName() {
        CharacterReader reader = createReader("html");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.BeforeDoctypeName.read(tokeniser, reader);

        Assert.assertNotNull(tokeniser.doctypePending);
        Assert.assertEquals(TokeniserState.DoctypeName, tokeniser.getState());
    }

    @Test
    public void read_doctypeNameGivenWhitespace_shouldTransitionToAfterDoctypeName() {
        CharacterReader reader = createReader(" ");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createDoctypePending();

        TokeniserState.DoctypeName.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.AfterDoctypeName, tokeniser.getState());
    }

    @Test
    public void read_doctypeNameGivenGreaterThan_shouldEmitDoctypePendingAndTransitionToData() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createDoctypePending();

        TokeniserState.DoctypeName.read(tokeniser, reader);

        Token token = tokeniser.read();
        Assert.assertTrue(token.isDoctype());
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    @Test
    public void read_afterDoctypeNameGivenPublicKeyword_shouldTransitionToAfterDoctypePublicKeyword() {
        CharacterReader reader = createReader("PUBLIC \"-//W3C//DTD HTML 4.01//EN\">");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createDoctypePending();

        TokeniserState.AfterDoctypeName.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.AfterDoctypePublicKeyword, tokeniser.getState());
    }

    @Test
    public void read_afterDoctypeNameGivenSystemKeyword_shouldTransitionToAfterDoctypeSystemKeyword() {
        CharacterReader reader = createReader("SYSTEM \"about:legacy-compat\">");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createDoctypePending();

        TokeniserState.AfterDoctypeName.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.AfterDoctypeSystemKeyword, tokeniser.getState());
    }

    @Test
    public void read_afterDoctypeNameGivenGreaterThan_shouldEmitDoctypePendingAndAdvanceToData() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createDoctypePending();

        TokeniserState.AfterDoctypeName.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    @Test
    public void read_afterDoctypeNameGivenInvalidData_shouldLogErrorAndAdvanceToBogusDoctype() {
        CharacterReader reader = createReader("GARBAGE>");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createDoctypePending();

        TokeniserState.AfterDoctypeName.read(tokeniser, reader);

        Assert.assertFalse(tokeniser.getErrors().isEmpty());
        Assert.assertTrue(tokeniser.doctypePending.isForceQuirks());
        Assert.assertEquals(TokeniserState.BogusDoctype, tokeniser.getState());
    }

    @Test
    public void read_afterDoctypePublicKeywordGivenWhitespace_shouldTransitionToBeforeDoctypePublicIdentifier() {
        CharacterReader reader = createReader(" ");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createDoctypePending();

        TokeniserState.AfterDoctypePublicKeyword.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.BeforeDoctypePublicIdentifier, tokeniser.getState());
    }

    @Test
    public void read_beforeDoctypePublicIdentifierGivenDoubleQuote_shouldTransitionToDoctypePublicIdentifierDoubleQuoted() {
        CharacterReader reader = createReader("\"");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createDoctypePending();

        TokeniserState.BeforeDoctypePublicIdentifier.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.DoctypePublicIdentifier_doubleQuoted, tokeniser.getState());
    }

    @Test
    public void read_doctypePublicIdentifierDoubleQuotedGivenClosingQuote_shouldTransitionToAfterDoctypePublicIdentifier() {
        CharacterReader reader = createReader("\"");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createDoctypePending();

        TokeniserState.DoctypePublicIdentifier_doubleQuoted.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.AfterDoctypePublicIdentifier, tokeniser.getState());
    }

    @Test
    public void read_afterDoctypePublicIdentifierGivenWhitespace_shouldTransitionToBetweenDoctypePublicAndSystemIdentifiers() {
        CharacterReader reader = createReader(" ");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createDoctypePending();

        TokeniserState.AfterDoctypePublicIdentifier.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.BetweenDoctypePublicAndSystemIdentifiers, tokeniser.getState());
    }

    @Test
    public void read_afterDoctypePublicIdentifierGivenGreaterThan_shouldEmitDoctypePendingAndTransitionToData() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createDoctypePending();

        TokeniserState.AfterDoctypePublicIdentifier.read(tokeniser, reader);

        Token token = tokeniser.read();
        Assert.assertTrue(token.isDoctype());
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    @Test
    public void read_betweenDoctypePublicAndSystemIdentifiersGivenDoubleQuote_shouldLogErrorAndTransitionToDoctypeSystemIdentifierDoubleQuoted() {
        CharacterReader reader = createReader("\"");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createDoctypePending();

        TokeniserState.BetweenDoctypePublicAndSystemIdentifiers.read(tokeniser, reader);

        Assert.assertFalse(tokeniser.getErrors().isEmpty());
        Assert.assertEquals(TokeniserState.DoctypeSystemIdentifier_doubleQuoted, tokeniser.getState());
    }

    @Test
    public void read_afterDoctypeSystemKeywordGivenWhitespace_shouldTransitionToBeforeDoctypeSystemIdentifier() {
        CharacterReader reader = createReader(" ");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createDoctypePending();

        TokeniserState.AfterDoctypeSystemKeyword.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.BeforeDoctypeSystemIdentifier, tokeniser.getState());
    }

    @Test
    public void read_beforeDoctypeSystemIdentifierGivenSingleQuote_shouldTransitionToDoctypeSystemIdentifierSingleQuoted() {
        CharacterReader reader = createReader("'");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createDoctypePending();

        TokeniserState.BeforeDoctypeSystemIdentifier.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.DoctypeSystemIdentifier_singleQuoted, tokeniser.getState());
    }

    @Test
    public void read_doctypeSystemIdentifierSingleQuotedGivenClosingQuote_shouldTransitionToAfterDoctypeSystemIdentifier() {
        CharacterReader reader = createReader("'");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createDoctypePending();

        TokeniserState.DoctypeSystemIdentifier_singleQuoted.read(tokeniser, reader);

        Assert.assertEquals(TokeniserState.AfterDoctypeSystemIdentifier, tokeniser.getState());
    }

    @Test
    public void read_afterDoctypeSystemIdentifierGivenGreaterThan_shouldEmitDoctypePendingAndTransitionToData() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createDoctypePending();

        TokeniserState.AfterDoctypeSystemIdentifier.read(tokeniser, reader);

        Token token = tokeniser.read();
        Assert.assertTrue(token.isDoctype());
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    @Test
    public void read_bogusDoctypeGivenGreaterThan_shouldEmitDoctypePendingAndTransitionToData() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createDoctypePending();

        TokeniserState.BogusDoctype.read(tokeniser, reader);

        Token token = tokeniser.read();
        Assert.assertTrue(token.isDoctype());
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    // -------------------------------------------------------------------------
    // CdataSection State
    // -------------------------------------------------------------------------

    @Test
    public void read_cdataSectionGivenClosingSequence_shouldEmitContentAndTransitionToData() {
        CharacterReader reader = createReader("raw CDATA content]]>");
        Tokeniser tokeniser = createTokeniser(reader);

        TokeniserState.CdataSection.read(tokeniser, reader);

        Token token = tokeniser.read();
        Assert.assertTrue(token.isCharacter());
        Assert.assertEquals("raw CDATA content", token.asCharacter().getData());
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
    }
}