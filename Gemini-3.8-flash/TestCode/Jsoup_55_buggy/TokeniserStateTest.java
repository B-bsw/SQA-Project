package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;

public class TokeniserStateTest {

    private Tokeniser createTokeniser(String input, ParseErrorList errors) {
        CharacterReader reader = new CharacterReader(input);
        return new Tokeniser(reader, errors);
    }

    private Tokeniser createTokeniser(String input) {
        return createTokeniser(input, ParseErrorList.tracking(100));
    }

    // --- Data State ---

    @Test
    public void read_dataAmpersand_shouldAdvanceToCharacterReferenceInData() {
        CharacterReader r = new CharacterReader("&test");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.Data.read(t, r);
        Assert.assertEquals(TokeniserState.CharacterReferenceInData, t.getState());
    }

    @Test
    public void read_dataLessThan_shouldAdvanceToTagOpen() {
        CharacterReader r = new CharacterReader("<div");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.Data.read(t, r);
        Assert.assertEquals(TokeniserState.TagOpen, t.getState());
    }

    @Test
    public void read_dataNullChar_shouldEmitReplacementCharAndLog() {
        CharacterReader r = new CharacterReader("\u0000text");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(r, errors);
        TokeniserState.Data.read(t, r);
        Assert.assertFalse(errors.isEmpty());
    }

    @Test
    public void read_dataEof_shouldEmitEofToken() {
        CharacterReader r = new CharacterReader("");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.Data.read(t, r);
        Token token = t.read();
        Assert.assertNotNull(token);
        Assert.assertEquals(Token.TokenType.EOF, token.type);
    }

    @Test
    public void read_dataPlainText_shouldEmitData() {
        CharacterReader r = new CharacterReader("hello world<");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.Data.read(t, r);
        Token token = t.read();
        Assert.assertNotNull(token);
        Assert.assertEquals("hello world", ((Token.Character) token).getData());
    }

    // --- CharacterReferenceInData & Rcdata State ---

    @Test
    public void read_characterReferenceInData_shouldReadRefAndTransitionToData() {
        CharacterReader r = new CharacterReader("lt;rest");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.CharacterReferenceInData.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void read_rcdataAmpersand_shouldAdvanceToCharacterReferenceInRcdata() {
        CharacterReader r = new CharacterReader("&amp;");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.Rcdata.read(t, r);
        Assert.assertEquals(TokeniserState.CharacterReferenceInRcdata, t.getState());
    }

    @Test
    public void read_rcdataLessThan_shouldAdvanceToRcdataLessthanSign() {
        CharacterReader r = new CharacterReader("</title>");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.Rcdata.read(t, r);
        Assert.assertEquals(TokeniserState.RcdataLessthanSign, t.getState());
    }

    @Test
    public void read_rcdataNullChar_shouldEmitReplacementChar() {
        CharacterReader r = new CharacterReader("\u0000content");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(r, errors);
        TokeniserState.Rcdata.read(t, r);
        Assert.assertFalse(errors.isEmpty());
    }

    @Test
    public void read_rcdataEof_shouldEmitEof() {
        CharacterReader r = new CharacterReader("");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.Rcdata.read(t, r);
        Token token = t.read();
        Assert.assertEquals(Token.TokenType.EOF, token.type);
    }

    @Test
    public void read_rcdataNormalText_shouldEmitString() {
        CharacterReader r = new CharacterReader("some rcdata&");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.Rcdata.read(t, r);
        Token token = t.read();
        Assert.assertEquals("some rcdata", ((Token.Character) token).getData());
    }

    @Test
    public void read_characterReferenceInRcdata_shouldTransitionToRcdata() {
        CharacterReader r = new CharacterReader("gt;rest");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.CharacterReferenceInRcdata.read(t, r);
        Assert.assertEquals(TokeniserState.Rcdata, t.getState());
    }

    // --- Rawtext, ScriptData, PLAINTEXT ---

    @Test
    public void read_rawtextLessThan_shouldAdvanceToRawtextLessthanSign() {
        CharacterReader r = new CharacterReader("<style>");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.Rawtext.read(t, r);
        Assert.assertEquals(TokeniserState.RawtextLessthanSign, t.getState());
    }

    @Test
    public void read_rawtextNullChar_shouldEmitReplacementAndError() {
        CharacterReader r = new CharacterReader("\u0000text");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(r, errors);
        TokeniserState.Rawtext.read(t, r);
        Assert.assertFalse(errors.isEmpty());
    }

    @Test
    public void read_rawtextEof_shouldEmitEofToken() {
        CharacterReader r = new CharacterReader("");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.Rawtext.read(t, r);
        Token token = t.read();
        Assert.assertEquals(Token.TokenType.EOF, token.type);
    }

    @Test
    public void read_rawtextNormalData_shouldEmitString() {
        CharacterReader r = new CharacterReader("style content<");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.Rawtext.read(t, r);
        Token token = t.read();
        Assert.assertEquals("style content", ((Token.Character) token).getData());
    }

    @Test
    public void read_scriptDataLessThan_shouldAdvanceToScriptDataLessthanSign() {
        CharacterReader r = new CharacterReader("</script>");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.ScriptData.read(t, r);
        Assert.assertEquals(TokeniserState.ScriptDataLessthanSign, t.getState());
    }

    @Test
    public void read_plaintextNullChar_shouldEmitReplacement() {
        CharacterReader r = new CharacterReader("\u0000more");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(r, errors);
        TokeniserState.PLAINTEXT.read(t, r);
        Assert.assertFalse(errors.isEmpty());
    }

    @Test
    public void read_plaintextEof_shouldEmitEof() {
        CharacterReader r = new CharacterReader("");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.PLAINTEXT.read(t, r);
        Token token = t.read();
        Assert.assertEquals(Token.TokenType.EOF, token.type);
    }

    @Test
    public void read_plaintextNormal_shouldEmitData() {
        CharacterReader r = new CharacterReader("plain data\u0000");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.PLAINTEXT.read(t, r);
        Token token = t.read();
        Assert.assertEquals("plain data", ((Token.Character) token).getData());
    }

    // --- TagOpen & EndTagOpen ---

    @Test
    public void read_tagOpenExclamation_shouldAdvanceToMarkupDeclarationOpen() {
        CharacterReader r = new CharacterReader("!DOCTYPE");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.TagOpen.read(t, r);
        Assert.assertEquals(TokeniserState.MarkupDeclarationOpen, t.getState());
    }

    @Test
    public void read_tagOpenSlash_shouldAdvanceToEndTagOpen() {
        CharacterReader r = new CharacterReader("/div>");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.TagOpen.read(t, r);
        Assert.assertEquals(TokeniserState.EndTagOpen, t.getState());
    }

    @Test
    public void read_tagOpenQuestionMark_shouldAdvanceToBogusComment() {
        CharacterReader r = new CharacterReader("?xml");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.TagOpen.read(t, r);
        Assert.assertEquals(TokeniserState.BogusComment, t.getState());
    }

    @Test
    public void read_tagOpenLetter_shouldTransitionToTagName() {
        CharacterReader r = new CharacterReader("div>");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.TagOpen.read(t, r);
        Assert.assertEquals(TokeniserState.TagName, t.getState());
    }

    @Test
    public void read_tagOpenNonLetter_shouldEmitLessThanAndTransitionToData() {
        CharacterReader r = new CharacterReader("@notTag");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(r, errors);
        TokeniserState.TagOpen.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
        Assert.assertFalse(errors.isEmpty());
    }

    @Test
    public void read_endTagOpenEmpty_shouldLogEofErrorAndTransitionToData() {
        CharacterReader r = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(r, errors);
        TokeniserState.EndTagOpen.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
        Assert.assertFalse(errors.isEmpty());
    }

    @Test
    public void read_endTagOpenLetter_shouldTransitionToTagName() {
        CharacterReader r = new CharacterReader("span>");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.EndTagOpen.read(t, r);
        Assert.assertEquals(TokeniserState.TagName, t.getState());
    }

    @Test
    public void read_endTagOpenGreaterThan_shouldErrorAndAdvanceToData() {
        CharacterReader r = new CharacterReader(">");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(r, errors);
        TokeniserState.EndTagOpen.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
        Assert.assertFalse(errors.isEmpty());
    }

    @Test
    public void read_endTagOpenOtherChar_shouldErrorAndAdvanceToBogusComment() {
        CharacterReader r = new CharacterReader("$invalid");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(r, errors);
        TokeniserState.EndTagOpen.read(t, r);
        Assert.assertEquals(TokeniserState.BogusComment, t.getState());
        Assert.assertFalse(errors.isEmpty());
    }

    // --- TagName ---

    @Test
    public void read_tagNameWhitespace_shouldTransitionToBeforeAttributeName() {
        CharacterReader r = new CharacterReader("b attr=val");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true);
        TokeniserState.TagName.read(t, r);
        Assert.assertEquals(TokeniserState.BeforeAttributeName, t.getState());
    }

    @Test
    public void read_tagNameSlash_shouldTransitionToSelfClosingStartTag() {
        CharacterReader r = new CharacterReader("br/>");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true);
        TokeniserState.TagName.read(t, r);
        Assert.assertEquals(TokeniserState.SelfClosingStartTag, t.getState());
    }

    @Test
    public void read_tagNameGreaterThan_shouldEmitTagAndTransitionToData() {
        CharacterReader r = new CharacterReader("p>");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true);
        TokeniserState.TagName.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void read_tagNameNullChar_shouldAppendReplacement() {
        CharacterReader r = new CharacterReader("h1\u0000");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true);
        TokeniserState.TagName.read(t, r);
        Assert.assertTrue(t.tagPending.tagName().indexOf('\uFFFD') >= 0);
    }

    @Test
    public void read_tagNameEof_shouldLogEofErrorAndTransitionToData() {
        CharacterReader r = new CharacterReader("div");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(r, errors);
        t.createTagPending(true);
        TokeniserState.TagName.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
        Assert.assertFalse(errors.isEmpty());
    }

    // --- RcdataLessthanSign & RCDATAEndTagOpen & RCDATAEndTagName ---

    @Test
    public void read_rcdataLessthanSignSlash_shouldAdvanceToRCDATAEndTagOpen() {
        CharacterReader r = new CharacterReader("/title>");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.RcdataLessthanSign.read(t, r);
        Assert.assertEquals(TokeniserState.RCDATAEndTagOpen, t.getState());
    }

    @Test
    public void read_rcdataLessthanSignElse_shouldEmitLessThanAndTransitionToRcdata() {
        CharacterReader r = new CharacterReader("123");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.RcdataLessthanSign.read(t, r);
        Assert.assertEquals(TokeniserState.Rcdata, t.getState());
    }

    @Test
    public void read_rcdataEndTagOpenLetter_shouldAdvanceToRCDATAEndTagName() {
        CharacterReader r = new CharacterReader("title>");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.RCDATAEndTagOpen.read(t, r);
        Assert.assertEquals(TokeniserState.RCDATAEndTagName, t.getState());
    }

    @Test
    public void read_rcdataEndTagOpenNonLetter_shouldEmitAndTransitionToRcdata() {
        CharacterReader r = new CharacterReader("!notTag");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.RCDATAEndTagOpen.read(t, r);
        Assert.assertEquals(TokeniserState.Rcdata, t.getState());
    }

    @Test
    public void read_rcdataEndTagNameConsumeLetterSequence() {
        CharacterReader r = new CharacterReader("itle>");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(false);
        t.createTempBuffer();
        TokeniserState.RCDATAEndTagName.read(t, r);
        Assert.assertEquals("itle", t.dataBuffer.toString());
    }

    @Test
    public void read_rcdataEndTagNameAppropriateTag_shouldTransitionToData() {
        CharacterReader r = new CharacterReader(">");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(false);
        t.tagPending.name("title");
        t.createTempBuffer();
        t.dataBuffer.append("title");
        TokeniserState.RCDATAEndTagName.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void read_rcdataEndTagNameInappropriateTag_shouldFallbackToRcdata() {
        CharacterReader r = new CharacterReader(">text");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(false);
        t.tagPending.name("other");
        t.createTempBuffer();
        t.dataBuffer.append("other");
        TokeniserState.RCDATAEndTagName.read(t, r);
        Assert.assertEquals(TokeniserState.Rcdata, t.getState());
    }

    @Test
    public void read_rcdataEndTagNameWhitespaceAppropriate_shouldTransitionToBeforeAttributeName() {
        CharacterReader r = new CharacterReader(" attr>");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(false);
        t.tagPending.name("title");
        t.createTempBuffer();
        t.dataBuffer.append("title");
        TokeniserState.RCDATAEndTagName.read(t, r);
        Assert.assertEquals(TokeniserState.BeforeAttributeName, t.getState());
    }

    @Test
    public void read_rcdataEndTagNameSlashAppropriate_shouldTransitionToSelfClosingStartTag() {
        CharacterReader r = new CharacterReader("/>");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(false);
        t.tagPending.name("title");
        t.createTempBuffer();
        t.dataBuffer.append("title");
        TokeniserState.RCDATAEndTagName.read(t, r);
        Assert.assertEquals(TokeniserState.SelfClosingStartTag, t.getState());
    }

    // --- Rawtext states ---

    @Test
    public void read_rawtextLessthanSignSlash_shouldAdvanceToRawtextEndTagOpen() {
        CharacterReader r = new CharacterReader("/style>");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.RawtextLessthanSign.read(t, r);
        Assert.assertEquals(TokeniserState.RawtextEndTagOpen, t.getState());
    }

    @Test
    public void read_rawtextLessthanSignElse_shouldEmitLessThanAndTransitionToRawtext() {
        CharacterReader r = new CharacterReader("style>");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.RawtextLessthanSign.read(t, r);
        Assert.assertEquals(TokeniserState.Rawtext, t.getState());
    }

    @Test
    public void read_rawtextEndTagOpenLetter_shouldTransitionToRawtextEndTagName() {
        CharacterReader r = new CharacterReader("style>");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.RawtextEndTagOpen.read(t, r);
        Assert.assertEquals(TokeniserState.RawtextEndTagName, t.getState());
    }

    @Test
    public void read_rawtextEndTagOpenNonLetter_shouldEmitAndTransitionToRawtext() {
        CharacterReader r = new CharacterReader("123");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.RawtextEndTagOpen.read(t, r);
        Assert.assertEquals(TokeniserState.Rawtext, t.getState());
    }

    @Test
    public void read_rawtextEndTagNameAppropriate_shouldTransitionToData() {
        CharacterReader r = new CharacterReader(">");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(false);
        t.tagPending.name("style");
        t.createTempBuffer();
        t.dataBuffer.append("style");
        TokeniserState.RawtextEndTagName.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
    }

    // --- ScriptData & Escaped States ---

    @Test
    public void read_scriptDataLessthanSignSlash_shouldTransitionToScriptDataEndTagOpen() {
        CharacterReader r = new CharacterReader("/script>");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataLessthanSign.read(t, r);
        Assert.assertEquals(TokeniserState.ScriptDataEndTagOpen, t.getState());
    }

    @Test
    public void read_scriptDataLessthanSignExclamation_shouldTransitionToScriptDataEscapeStart() {
        CharacterReader r = new CharacterReader("!--");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataLessthanSign.read(t, r);
        Assert.assertEquals(TokeniserState.ScriptDataEscapeStart, t.getState());
    }

    @Test
    public void read_scriptDataLessthanSignDefault_shouldTransitionToScriptData() {
        CharacterReader r = new CharacterReader("var x = 1;");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataLessthanSign.read(t, r);
        Assert.assertEquals(TokeniserState.ScriptData, t.getState());
    }

    @Test
    public void read_scriptDataEscapeStartDash_shouldAdvanceToScriptDataEscapeStartDash() {
        CharacterReader r = new CharacterReader("-test");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscapeStart.read(t, r);
        Assert.assertEquals(TokeniserState.ScriptDataEscapeStartDash, t.getState());
    }

    @Test
    public void read_scriptDataEscapeStartElse_shouldTransitionToScriptData() {
        CharacterReader r = new CharacterReader("atest");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscapeStart.read(t, r);
        Assert.assertEquals(TokeniserState.ScriptData, t.getState());
    }

    @Test
    public void read_scriptDataEscapeStartDashDash_shouldAdvanceToScriptDataEscapedDashDash() {
        CharacterReader r = new CharacterReader("-test");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscapeStartDash.read(t, r);
        Assert.assertEquals(TokeniserState.ScriptDataEscapedDashDash, t.getState());
    }

    @Test
    public void read_scriptDataEscapeStartDashElse_shouldTransitionToScriptData() {
        CharacterReader r = new CharacterReader("atest");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscapeStartDash.read(t, r);
        Assert.assertEquals(TokeniserState.ScriptData, t.getState());
    }

    @Test
    public void read_scriptDataEscapedEof_shouldLogEofAndTransitionToData() {
        CharacterReader r = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(r, errors);
        TokeniserState.ScriptDataEscaped.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
        Assert.assertFalse(errors.isEmpty());
    }

    @Test
    public void read_scriptDataEscapedDash_shouldAdvanceToScriptDataEscapedDash() {
        CharacterReader r = new CharacterReader("-rest");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscaped.read(t, r);
        Assert.assertEquals(TokeniserState.ScriptDataEscapedDash, t.getState());
    }

    @Test
    public void read_scriptDataEscapedLessThan_shouldAdvanceToScriptDataEscapedLessthanSign() {
        CharacterReader r = new CharacterReader("<rest");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscaped.read(t, r);
        Assert.assertEquals(TokeniserState.ScriptDataEscapedLessthanSign, t.getState());
    }

    @Test
    public void read_scriptDataEscapedNullChar_shouldEmitReplacement() {
        CharacterReader r = new CharacterReader("\u0000rest");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(r, errors);
        TokeniserState.ScriptDataEscaped.read(t, r);
        Assert.assertFalse(errors.isEmpty());
    }

    @Test
    public void read_scriptDataEscapedDashEmpty_shouldLogEofAndTransitionToData() {
        CharacterReader r = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(r, errors);
        TokeniserState.ScriptDataEscapedDash.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
        Assert.assertFalse(errors.isEmpty());
    }

    @Test
    public void read_scriptDataEscapedDashDash_shouldTransitionToScriptDataEscapedDashDash() {
        CharacterReader r = new CharacterReader("-rest");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscapedDash.read(t, r);
        Assert.assertEquals(TokeniserState.ScriptDataEscapedDashDash, t.getState());
    }

    @Test
    public void read_scriptDataEscapedDashLessThan_shouldTransitionToScriptDataEscapedLessthanSign() {
        CharacterReader r = new CharacterReader("<rest");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscapedDash.read(t, r);
        Assert.assertEquals(TokeniserState.ScriptDataEscapedLessthanSign, t.getState());
    }

    @Test
    public void read_scriptDataEscapedDashNullChar_shouldEmitErrorAndTransition() {
        CharacterReader r = new CharacterReader("\u0000rest");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(r, errors);
        TokeniserState.ScriptDataEscapedDash.read(t, r);
        Assert.assertEquals(TokeniserState.ScriptDataEscaped, t.getState());
        Assert.assertFalse(errors.isEmpty());
    }

    @Test
    public void read_scriptDataEscapedDashDashEmpty_shouldLogEofAndTransitionToData() {
        CharacterReader r = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(r, errors);
        TokeniserState.ScriptDataEscapedDashDash.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
        Assert.assertFalse(errors.isEmpty());
    }

    @Test
    public void read_scriptDataEscapedDashDashGreaterThan_shouldTransitionToScriptData() {
        CharacterReader r = new CharacterReader(">rest");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscapedDashDash.read(t, r);
        Assert.assertEquals(TokeniserState.ScriptData, t.getState());
    }

    @Test
    public void read_scriptDataEscapedDashDashLessThan_shouldTransitionToScriptDataEscapedLessthanSign() {
        CharacterReader r = new CharacterReader("<rest");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscapedDashDash.read(t, r);
        Assert.assertEquals(TokeniserState.ScriptDataEscapedLessthanSign, t.getState());
    }

    @Test
    public void read_scriptDataEscapedDashDashNullChar_shouldEmitErrorAndTransition() {
        CharacterReader r = new CharacterReader("\u0000rest");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(r, errors);
        TokeniserState.ScriptDataEscapedDashDash.read(t, r);
        Assert.assertEquals(TokeniserState.ScriptDataEscaped, t.getState());
        Assert.assertFalse(errors.isEmpty());
    }

    @Test
    public void read_scriptDataEscapedDashDashDash_shouldEmitDash() {
        CharacterReader r = new CharacterReader("-rest");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscapedDashDash.read(t, r);
        Token token = t.read();
        Assert.assertEquals("-", ((Token.Character) token).getData());
    }

    @Test
    public void read_scriptDataEscapedLessthanSignLetter_shouldAdvanceToScriptDataDoubleEscapeStart() {
        CharacterReader r = new CharacterReader("script>");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscapedLessthanSign.read(t, r);
        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscapeStart, t.getState());
    }

    @Test
    public void read_scriptDataEscapedLessthanSignSlash_shouldAdvanceToScriptDataEscapedEndTagOpen() {
        CharacterReader r = new CharacterReader("/script>");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscapedLessthanSign.read(t, r);
        Assert.assertEquals(TokeniserState.ScriptDataEscapedEndTagOpen, t.getState());
    }

    @Test
    public void read_scriptDataEscapedLessthanSignElse_shouldTransitionToScriptDataEscaped() {
        CharacterReader r = new CharacterReader("!rest");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataEscapedLessthanSign.read(t, r);
        Assert.assertEquals(TokeniserState.ScriptDataEscaped, t.getState());
    }

    // --- ScriptDataDoubleEscaped States ---

    @Test
    public void read_scriptDataDoubleEscapedDash_shouldAdvanceToScriptDataDoubleEscapedDash() {
        CharacterReader r = new CharacterReader("-rest");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataDoubleEscaped.read(t, r);
        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscapedDash, t.getState());
    }

    @Test
    public void read_scriptDataDoubleEscapedLessThan_shouldAdvanceToScriptDataDoubleEscapedLessthanSign() {
        CharacterReader r = new CharacterReader("<rest");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataDoubleEscaped.read(t, r);
        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscapedLessthanSign, t.getState());
    }

    @Test
    public void read_scriptDataDoubleEscapedNull_shouldEmitError() {
        CharacterReader r = new CharacterReader("\u0000rest");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(r, errors);
        TokeniserState.ScriptDataDoubleEscaped.read(t, r);
        Assert.assertFalse(errors.isEmpty());
    }

    @Test
    public void read_scriptDataDoubleEscapedEof_shouldLogEofError() {
        CharacterReader r = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(r, errors);
        TokeniserState.ScriptDataDoubleEscaped.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
        Assert.assertFalse(errors.isEmpty());
    }

    @Test
    public void read_scriptDataDoubleEscapedDashDash_shouldTransitionToScriptDataDoubleEscapedDashDash() {
        CharacterReader r = new CharacterReader("-rest");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataDoubleEscapedDash.read(t, r);
        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscapedDashDash, t.getState());
    }

    @Test
    public void read_scriptDataDoubleEscapedDashGreaterThan_shouldTransitionToScriptData() {
        CharacterReader r = new CharacterReader(">rest");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataDoubleEscapedDashDash.read(t, r);
        Assert.assertEquals(TokeniserState.ScriptData, t.getState());
    }

    @Test
    public void read_scriptDataDoubleEscapedLessthanSignSlash_shouldAdvanceToScriptDataDoubleEscapeEnd() {
        CharacterReader r = new CharacterReader("/script>");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataDoubleEscapedLessthanSign.read(t, r);
        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscapeEnd, t.getState());
    }

    @Test
    public void read_scriptDataDoubleEscapedLessthanSignElse_shouldTransitionToScriptDataDoubleEscaped() {
        CharacterReader r = new CharacterReader("abc");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.ScriptDataDoubleEscapedLessthanSign.read(t, r);
        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscaped, t.getState());
    }

    // --- BeforeAttributeName, AttributeName, AfterAttributeName ---

    @Test
    public void read_beforeAttributeNameWhitespace_shouldStayInState() {
        CharacterReader r = new CharacterReader("  attr");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true);
        TokeniserState.BeforeAttributeName.read(t, r);
        Assert.assertEquals(TokeniserState.BeforeAttributeName, t.getState());
    }

    @Test
    public void read_beforeAttributeNameSlash_shouldTransitionToSelfClosingStartTag() {
        CharacterReader r = new CharacterReader("/>");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true);
        TokeniserState.BeforeAttributeName.read(t, r);
        Assert.assertEquals(TokeniserState.SelfClosingStartTag, t.getState());
    }

    @Test
    public void read_beforeAttributeNameGreaterThan_shouldEmitTagAndTransitionToData() {
        CharacterReader r = new CharacterReader(">");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true);
        TokeniserState.BeforeAttributeName.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void read_beforeAttributeNameNullChar_shouldErrorAndTransitionToAttributeName() {
        CharacterReader r = new CharacterReader("\u0000attr");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(r, errors);
        t.createTagPending(true);
        TokeniserState.BeforeAttributeName.read(t, r);
        Assert.assertEquals(TokeniserState.AttributeName, t.getState());
        Assert.assertFalse(errors.isEmpty());
    }

    @Test
    public void read_beforeAttributeNameEof_shouldLogEofAndTransitionToData() {
        CharacterReader r = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(r, errors);
        t.createTagPending(true);
        TokeniserState.BeforeAttributeName.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
        Assert.assertFalse(errors.isEmpty());
    }

    @Test
    public void read_beforeAttributeNameSpecialChars_shouldErrorAndAppendToAttributeName() {
        char[] specials = new char[]{'\"', '\'', '<', '='};
        for (int i = 0; i < specials.length; i++) {
            CharacterReader r = new CharacterReader(String.valueOf(specials[i]));
            ParseErrorList errors = ParseErrorList.tracking(10);
            Tokeniser t = new Tokeniser(r, errors);
            t.createTagPending(true);
            TokeniserState.BeforeAttributeName.read(t, r);
            Assert.assertEquals(TokeniserState.AttributeName, t.getState());
            Assert.assertFalse(errors.isEmpty());
        }
    }

    @Test
    public void read_beforeAttributeNameNormalChar_shouldTransitionToAttributeName() {
        CharacterReader r = new CharacterReader("href=");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true);
        TokeniserState.BeforeAttributeName.read(t, r);
        Assert.assertEquals(TokeniserState.AttributeName, t.getState());
    }

    @Test
    public void read_attributeNameEquals_shouldTransitionToBeforeAttributeValue() {
        CharacterReader r = new CharacterReader("=value");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true);
        t.tagPending.newAttribute();
        TokeniserState.AttributeName.read(t, r);
        Assert.assertEquals(TokeniserState.BeforeAttributeValue, t.getState());
    }

    @Test
    public void read_attributeNameWhitespace_shouldTransitionToAfterAttributeName() {
        CharacterReader r = new CharacterReader(" =value");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true);
        t.tagPending.newAttribute();
        TokeniserState.AttributeName.read(t, r);
        Assert.assertEquals(TokeniserState.AfterAttributeName, t.getState());
    }

    @Test
    public void read_attributeNameGreaterThan_shouldEmitTagAndTransitionToData() {
        CharacterReader r = new CharacterReader(">");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true);
        t.tagPending.newAttribute();
        TokeniserState.AttributeName.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void read_attributeNameQuotes_shouldErrorAndAppend() {
        char[] badChars = new char[]{'\"', '\'', '<'};
        for (int i = 0; i < badChars.length; i++) {
            CharacterReader r = new CharacterReader(String.valueOf(badChars[i]));
            ParseErrorList errors = ParseErrorList.tracking(10);
            Tokeniser t = new Tokeniser(r, errors);
            t.createTagPending(true);
            t.tagPending.newAttribute();
            TokeniserState.AttributeName.read(t, r);
            Assert.assertFalse(errors.isEmpty());
        }
    }

    @Test
    public void read_afterAttributeNameEquals_shouldTransitionToBeforeAttributeValue() {
        CharacterReader r = new CharacterReader("=\"val\"");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true);
        TokeniserState.AfterAttributeName.read(t, r);
        Assert.assertEquals(TokeniserState.BeforeAttributeValue, t.getState());
    }

    @Test
    public void read_afterAttributeNameGreaterThan_shouldEmitTagAndTransitionToData() {
        CharacterReader r = new CharacterReader(">");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true);
        TokeniserState.AfterAttributeName.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
    }

    // --- BeforeAttributeValue & Values (Double, Single, Unquoted) ---

    @Test
    public void read_beforeAttributeValueDoubleQuote_shouldTransitionToDoubleQuoted() {
        CharacterReader r = new CharacterReader("\"value\"");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true);
        TokeniserState.BeforeAttributeValue.read(t, r);
        Assert.assertEquals(TokeniserState.AttributeValue_doubleQuoted, t.getState());
    }

    @Test
    public void read_beforeAttributeValueSingleQuote_shouldTransitionToSingleQuoted() {
        CharacterReader r = new CharacterReader("'value'");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true);
        TokeniserState.BeforeAttributeValue.read(t, r);
        Assert.assertEquals(TokeniserState.AttributeValue_singleQuoted, t.getState());
    }

    @Test
    public void read_beforeAttributeValueAmpersand_shouldTransitionToUnquoted() {
        CharacterReader r = new CharacterReader("&param");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true);
        TokeniserState.BeforeAttributeValue.read(t, r);
        Assert.assertEquals(TokeniserState.AttributeValue_unquoted, t.getState());
    }

    @Test
    public void read_beforeAttributeValueSpecialChars_shouldErrorAndAppend() {
        char[] specials = new char[]{'<', '=', '`'};
        for (int i = 0; i < specials.length; i++) {
            CharacterReader r = new CharacterReader(String.valueOf(specials[i]));
            ParseErrorList errors = ParseErrorList.tracking(10);
            Tokeniser t = new Tokeniser(r, errors);
            t.createTagPending(true);
            TokeniserState.BeforeAttributeValue.read(t, r);
            Assert.assertEquals(TokeniserState.AttributeValue_unquoted, t.getState());
            Assert.assertFalse(errors.isEmpty());
        }
    }

    @Test
    public void read_attributeValueDoubleQuotedEnd_shouldTransitionToAfterQuoted() {
        CharacterReader r = new CharacterReader("test\"rest");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true);
        t.tagPending.newAttribute();
        TokeniserState.AttributeValue_doubleQuoted.read(t, r);
        Assert.assertEquals(TokeniserState.AfterAttributeValue_quoted, t.getState());
    }

    @Test
    public void read_attributeValueDoubleQuotedAmpersand_shouldConsumeCharRef() {
        CharacterReader r = new CharacterReader("&amp;rest\"");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true);
        t.tagPending.newAttribute();
        TokeniserState.AttributeValue_doubleQuoted.read(t, r);
        Assert.assertNotNull(t.tagPending);
    }

    @Test
    public void read_attributeValueDoubleQuotedEof_shouldLogEof() {
        CharacterReader r = new CharacterReader("unclosed");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(r, errors);
        t.createTagPending(true);
        t.tagPending.newAttribute();
        TokeniserState.AttributeValue_doubleQuoted.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
        Assert.assertFalse(errors.isEmpty());
    }

    @Test
    public void read_attributeValueSingleQuotedEnd_shouldTransitionToAfterQuoted() {
        CharacterReader r = new CharacterReader("test'rest");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true);
        t.tagPending.newAttribute();
        TokeniserState.AttributeValue_singleQuoted.read(t, r);
        Assert.assertEquals(TokeniserState.AfterAttributeValue_quoted, t.getState());
    }

    @Test
    public void read_attributeValueSingleQuotedAmpersand_shouldConsumeCharRef() {
        CharacterReader r = new CharacterReader("&amp;rest'");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true);
        t.tagPending.newAttribute();
        TokeniserState.AttributeValue_singleQuoted.read(t, r);
        Assert.assertNotNull(t.tagPending);
    }

    @Test
    public void read_attributeValueUnquotedGreaterThan_shouldEmitTagAndTransitionToData() {
        CharacterReader r = new CharacterReader("val>");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true);
        t.tagPending.newAttribute();
        TokeniserState.AttributeValue_unquoted.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void read_attributeValueUnquotedWhitespace_shouldTransitionToBeforeAttributeName() {
        CharacterReader r = new CharacterReader("val attr2");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true);
        t.tagPending.newAttribute();
        TokeniserState.AttributeValue_unquoted.read(t, r);
        Assert.assertEquals(TokeniserState.BeforeAttributeName, t.getState());
    }

    @Test
    public void read_afterAttributeValueQuotedSlash_shouldTransitionToSelfClosingStartTag() {
        CharacterReader r = new CharacterReader("/>");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.AfterAttributeValue_quoted.read(t, r);
        Assert.assertEquals(TokeniserState.SelfClosingStartTag, t.getState());
    }

    @Test
    public void read_afterAttributeValueQuotedGreaterThan_shouldEmitTagAndTransitionToData() {
        CharacterReader r = new CharacterReader(">");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true);
        TokeniserState.AfterAttributeValue_quoted.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void read_selfClosingStartTagGreaterThan_shouldMarkSelfClosingAndEmitTag() {
        CharacterReader r = new CharacterReader(">");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true);
        TokeniserState.SelfClosingStartTag.read(t, r);
        Assert.assertTrue(t.tagPending.selfClosing);
        Assert.assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void read_selfClosingStartTagOtherChar_shouldErrorAndTransitionToBeforeAttributeName() {
        CharacterReader r = new CharacterReader("a>");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(r, errors);
        t.createTagPending(true);
        TokeniserState.SelfClosingStartTag.read(t, r);
        Assert.assertEquals(TokeniserState.BeforeAttributeName, t.getState());
        Assert.assertFalse(errors.isEmpty());
    }

    // --- BogusComment & MarkupDeclarationOpen ---

    @Test
    public void read_bogusComment_shouldEmitCommentAndAdvanceToData() {
        CharacterReader r = new CharacterReader("?xml version='1.0'>rest");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.BogusComment.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void read_markupDeclarationOpenComment_shouldTransitionToCommentStart() {
        CharacterReader r = new CharacterReader("-- comment -->");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.MarkupDeclarationOpen.read(t, r);
        Assert.assertEquals(TokeniserState.CommentStart, t.getState());
    }

    @Test
    public void read_markupDeclarationOpenDoctype_shouldTransitionToDoctype() {
        CharacterReader r = new CharacterReader("DOCTYPE html>");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.MarkupDeclarationOpen.read(t, r);
        Assert.assertEquals(TokeniserState.Doctype, t.getState());
    }

    @Test
    public void read_markupDeclarationOpenCdata_shouldTransitionToCdataSection() {
        CharacterReader r = new CharacterReader("[CDATA[some raw data]]>");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.MarkupDeclarationOpen.read(t, r);
        Assert.assertEquals(TokeniserState.CdataSection, t.getState());
    }

    @Test
    public void read_markupDeclarationOpenBogus_shouldErrorAndAdvanceToBogusComment() {
        CharacterReader r = new CharacterReader("INVALID");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(r, errors);
        TokeniserState.MarkupDeclarationOpen.read(t, r);
        Assert.assertEquals(TokeniserState.BogusComment, t.getState());
        Assert.assertFalse(errors.isEmpty());
    }

    // --- Comments ---

    @Test
    public void read_commentStartDash_shouldTransitionToCommentStartDash() {
        CharacterReader r = new CharacterReader("-comment");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createCommentPending();
        TokeniserState.CommentStart.read(t, r);
        Assert.assertEquals(TokeniserState.CommentStartDash, t.getState());
    }

    @Test
    public void read_commentStartGreaterThan_shouldErrorEmitAndTransitionToData() {
        CharacterReader r = new CharacterReader(">");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(r, errors);
        t.createCommentPending();
        TokeniserState.CommentStart.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
        Assert.assertFalse(errors.isEmpty());
    }

    @Test
    public void read_commentStartDefault_shouldAppendAndTransitionToComment() {
        CharacterReader r = new CharacterReader("hello");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createCommentPending();
        TokeniserState.CommentStart.read(t, r);
        Assert.assertEquals(TokeniserState.Comment, t.getState());
        Assert.assertEquals("h", t.commentPending.getData());
    }

    @Test
    public void read_commentDash_shouldAdvanceToCommentEndDash() {
        CharacterReader r = new CharacterReader("-more");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createCommentPending();
        TokeniserState.Comment.read(t, r);
        Assert.assertEquals(TokeniserState.CommentEndDash, t.getState());
    }

    @Test
    public void read_commentEndDashDash_shouldTransitionToCommentEnd() {
        CharacterReader r = new CharacterReader("-more");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createCommentPending();
        TokeniserState.CommentEndDash.read(t, r);
        Assert.assertEquals(TokeniserState.CommentEnd, t.getState());
    }

    @Test
    public void read_commentEndGreaterThan_shouldEmitCommentAndTransitionToData() {
        CharacterReader r = new CharacterReader(">rest");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createCommentPending();
        TokeniserState.CommentEnd.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void read_commentEndExclamation_shouldErrorAndTransitionToCommentEndBang() {
        CharacterReader r = new CharacterReader("!rest");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(r, errors);
        t.createCommentPending();
        TokeniserState.CommentEnd.read(t, r);
        Assert.assertEquals(TokeniserState.CommentEndBang, t.getState());
        Assert.assertFalse(errors.isEmpty());
    }

    @Test
    public void read_commentEndBangDash_shouldAppendAndTransitionToCommentEndDash() {
        CharacterReader r = new CharacterReader("-rest");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createCommentPending();
        TokeniserState.CommentEndBang.read(t, r);
        Assert.assertEquals(TokeniserState.CommentEndDash, t.getState());
    }

    @Test
    public void read_commentEndBangGreaterThan_shouldEmitCommentAndTransitionToData() {
        CharacterReader r = new CharacterReader(">rest");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createCommentPending();
        TokeniserState.CommentEndBang.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
    }

    // --- Doctype ---

    @Test
    public void read_doctypeWhitespace_shouldTransitionToBeforeDoctypeName() {
        CharacterReader r = new CharacterReader(" html");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.Doctype.read(t, r);
        Assert.assertEquals(TokeniserState.BeforeDoctypeName, t.getState());
    }

    @Test
    public void read_doctypeGreaterThan_shouldErrorForceQuirksAndTransitionToData() {
        CharacterReader r = new CharacterReader(">");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(r, errors);
        TokeniserState.Doctype.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
        Assert.assertTrue(t.doctypePending.forceQuirks);
        Assert.assertFalse(errors.isEmpty());
    }

    @Test
    public void read_beforeDoctypeNameLetter_shouldTransitionToDoctypeName() {
        CharacterReader r = new CharacterReader("html");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.BeforeDoctypeName.read(t, r);
        Assert.assertEquals(TokeniserState.DoctypeName, t.getState());
    }

    @Test
    public void read_beforeDoctypeNameNull_shouldErrorAppendAndTransitionToDoctypeName() {
        CharacterReader r = new CharacterReader("\u0000html");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(r, errors);
        TokeniserState.BeforeDoctypeName.read(t, r);
        Assert.assertEquals(TokeniserState.DoctypeName, t.getState());
        Assert.assertFalse(errors.isEmpty());
    }

    @Test
    public void read_beforeDoctypeNameEof_shouldLogEofForceQuirksAndTransitionToData() {
        CharacterReader r = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(r, errors);
        TokeniserState.BeforeDoctypeName.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
        Assert.assertTrue(t.doctypePending.forceQuirks);
        Assert.assertFalse(errors.isEmpty());
    }

    @Test
    public void read_doctypeNameLetter_shouldConsumeLetterSequence() {
        CharacterReader r = new CharacterReader("tml>");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createDoctypePending();
        t.doctypePending.name.append('h');
        TokeniserState.DoctypeName.read(t, r);
        Assert.assertEquals("html", t.doctypePending.getName());
    }

    @Test
    public void read_doctypeNameGreaterThan_shouldEmitDoctypeAndTransitionToData() {
        CharacterReader r = new CharacterReader(">");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createDoctypePending();
        TokeniserState.DoctypeName.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void read_doctypeNameWhitespace_shouldTransitionToAfterDoctypeName() {
        CharacterReader r = new CharacterReader(" PUBLIC");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createDoctypePending();
        TokeniserState.DoctypeName.read(t, r);
        Assert.assertEquals(TokeniserState.AfterDoctypeName, t.getState());
    }

    @Test
    public void read_afterDoctypeNamePublic_shouldTransitionToAfterDoctypePublicKeyword() {
        CharacterReader r = new CharacterReader("PUBLIC \"-//W3C//DTD HTML 4.01//EN\"");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createDoctypePending();
        TokeniserState.AfterDoctypeName.read(t, r);
        Assert.assertEquals(TokeniserState.AfterDoctypePublicKeyword, t.getState());
    }

    @Test
    public void read_afterDoctypeNameSystem_shouldTransitionToAfterDoctypeSystemKeyword() {
        CharacterReader r = new CharacterReader("SYSTEM \"about:legacy-compat\"");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createDoctypePending();
        TokeniserState.AfterDoctypeName.read(t, r);
        Assert.assertEquals(TokeniserState.AfterDoctypeSystemKeyword, t.getState());
    }

    @Test
    public void read_afterDoctypeNameGreaterThan_shouldAdvanceToData() {
        CharacterReader r = new CharacterReader(">");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createDoctypePending();
        TokeniserState.AfterDoctypeName.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void read_afterDoctypeNameOther_shouldErrorAndAdvanceToBogusDoctype() {
        CharacterReader r = new CharacterReader("GARBAGE");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(r, errors);
        t.createDoctypePending();
        TokeniserState.AfterDoctypeName.read(t, r);
        Assert.assertEquals(TokeniserState.BogusDoctype, t.getState());
        Assert.assertTrue(t.doctypePending.forceQuirks);
        Assert.assertFalse(errors.isEmpty());
    }

    // --- Doctype Public & System Identifiers ---

    @Test
    public void read_afterDoctypePublicKeywordWhitespace_shouldTransitionToBeforeDoctypePublicIdentifier() {
        CharacterReader r = new CharacterReader(" \"publicId\"");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.AfterDoctypePublicKeyword.read(t, r);
        Assert.assertEquals(TokeniserState.BeforeDoctypePublicIdentifier, t.getState());
    }

    @Test
    public void read_beforeDoctypePublicIdentifierDoubleQuote_shouldTransitionToDoubleQuoted() {
        CharacterReader r = new CharacterReader("\"publicId\"");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.BeforeDoctypePublicIdentifier.read(t, r);
        Assert.assertEquals(TokeniserState.DoctypePublicIdentifier_doubleQuoted, t.getState());
    }

    @Test
    public void read_beforeDoctypePublicIdentifierSingleQuote_shouldTransitionToSingleQuoted() {
        CharacterReader r = new CharacterReader("'publicId'");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.BeforeDoctypePublicIdentifier.read(t, r);
        Assert.assertEquals(TokeniserState.DoctypePublicIdentifier_singleQuoted, t.getState());
    }

    @Test
    public void read_doctypePublicIdentifierDoubleQuotedEnd_shouldTransitionToAfterPublicIdentifier() {
        CharacterReader r = new CharacterReader("\"rest");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createDoctypePending();
        TokeniserState.DoctypePublicIdentifier_doubleQuoted.read(t, r);
        Assert.assertEquals(TokeniserState.AfterDoctypePublicIdentifier, t.getState());
    }

    @Test
    public void read_afterDoctypePublicIdentifierGreaterThan_shouldEmitDoctypeAndTransitionToData() {
        CharacterReader r = new CharacterReader(">");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createDoctypePending();
        TokeniserState.AfterDoctypePublicIdentifier.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void read_afterDoctypePublicIdentifierWhitespace_shouldTransitionToBetweenIdentifiers() {
        CharacterReader r = new CharacterReader(" \"systemId\"");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.AfterDoctypePublicIdentifier.read(t, r);
        Assert.assertEquals(TokeniserState.BetweenDoctypePublicAndSystemIdentifiers, t.getState());
    }

    @Test
    public void read_betweenDoctypePublicAndSystemIdentifiersDoubleQuote_shouldTransitionToSystemDoubleQuoted() {
        CharacterReader r = new CharacterReader("\"systemId\"");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.BetweenDoctypePublicAndSystemIdentifiers.read(t, r);
        Assert.assertEquals(TokeniserState.DoctypeSystemIdentifier_doubleQuoted, t.getState());
    }

    @Test
    public void read_doctypeSystemIdentifierDoubleQuotedEnd_shouldTransitionToAfterSystemIdentifier() {
        CharacterReader r = new CharacterReader("\"rest");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createDoctypePending();
        TokeniserState.DoctypeSystemIdentifier_doubleQuoted.read(t, r);
        Assert.assertEquals(TokeniserState.AfterDoctypeSystemIdentifier, t.getState());
    }

    @Test
    public void read_afterDoctypeSystemIdentifierGreaterThan_shouldEmitDoctypeAndTransitionToData() {
        CharacterReader r = new CharacterReader(">");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createDoctypePending();
        TokeniserState.AfterDoctypeSystemIdentifier.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void read_bogusDoctypeGreaterThan_shouldEmitDoctypeAndTransitionToData() {
        CharacterReader r = new CharacterReader("some garbage>");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        t.createDoctypePending();
        TokeniserState.BogusDoctype.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
    }

    // --- CdataSection ---

    @Test
    public void read_cdataSection_shouldEmitDataAndTransitionToData() {
        CharacterReader r = new CharacterReader("cdata content]]>rest");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(10));
        TokeniserState.CdataSection.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
        Token token = t.read();
        Assert.assertNotNull(token);
        Assert.assertEquals("cdata content", ((Token.Character) token).getData());
    }
}