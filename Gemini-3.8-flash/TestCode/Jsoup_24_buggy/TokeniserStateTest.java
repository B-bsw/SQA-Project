package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;

public class TokeniserStateTest {

    private Tokeniser createTokeniser(CharacterReader reader) {
        ParseErrorList errors = ParseErrorList.tracking(100);
        return new Tokeniser(reader, errors);
    }

    private Tokeniser createTokeniser(String input) {
        return createTokeniser(new CharacterReader(input));
    }

    @Test
    public void read_dataAmpersand_shouldAdvanceTransitionToCharacterReferenceInData() {
        // Arrange
        CharacterReader reader = new CharacterReader("&test");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.Data.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.CharacterReferenceInData, tokeniser.getState());
        Assert.assertEquals('t', reader.current());
    }

    @Test
    public void read_dataLessThan_shouldAdvanceTransitionToTagOpen() {
        // Arrange
        CharacterReader reader = new CharacterReader("<div");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.Data.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.TagOpen, tokeniser.getState());
        Assert.assertEquals('d', reader.current());
    }

    @Test
    public void read_dataNullChar_shouldEmitReplacementAndError() {
        // Arrange
        CharacterReader reader = new CharacterReader("\u0000text");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.Data.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(1, tokeniser.getErrors().size());
        Assert.assertEquals('t', reader.current());
    }

    @Test
    public void read_dataEof_shouldEmitEofToken() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.Data.read(tokeniser, reader);

        // Assert
        Token token = tokeniser.read();
        Assert.assertTrue(token instanceof Token.EOF);
    }

    @Test
    public void read_dataDefaultText_shouldEmitData() {
        // Arrange
        CharacterReader reader = new CharacterReader("Hello World<next");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.Data.read(tokeniser, reader);

        // Assert
        Assert.assertEquals('<', reader.current());
    }

    @Test
    public void read_characterReferenceInData_shouldConsumeReferenceAndTransitionToData() {
        // Arrange
        CharacterReader reader = new CharacterReader("amp;rest");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.CharacterReferenceInData.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    @Test
    public void read_characterReferenceInDataInvalid_shouldEmitAmpersandAndTransitionToData() {
        // Arrange
        CharacterReader reader = new CharacterReader(" unknown;rest");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.CharacterReferenceInData.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    @Test
    public void read_rcdataAmpersand_shouldAdvanceToCharacterReferenceInRcdata() {
        // Arrange
        CharacterReader reader = new CharacterReader("&test");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.Rcdata.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.CharacterReferenceInRcdata, tokeniser.getState());
        Assert.assertEquals('t', reader.current());
    }

    @Test
    public void read_rcdataLessThan_shouldAdvanceToRcdataLessthanSign() {
        // Arrange
        CharacterReader reader = new CharacterReader("<test");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.Rcdata.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.RcdataLessthanSign, tokeniser.getState());
        Assert.assertEquals('t', reader.current());
    }

    @Test
    public void read_rcdataNullChar_shouldEmitReplacementCharAndAdvance() {
        // Arrange
        CharacterReader reader = new CharacterReader("\u0000test");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.Rcdata.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(1, tokeniser.getErrors().size());
        Assert.assertEquals('t', reader.current());
    }

    @Test
    public void read_rcdataEof_shouldEmitEofToken() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.Rcdata.read(tokeniser, reader);

        // Assert
        Token token = tokeniser.read();
        Assert.assertTrue(token instanceof Token.EOF);
    }

    @Test
    public void read_rcdataDefault_shouldConsumeData() {
        // Arrange
        CharacterReader reader = new CharacterReader("simple text<");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.Rcdata.read(tokeniser, reader);

        // Assert
        Assert.assertEquals('<', reader.current());
    }

    @Test
    public void read_characterReferenceInRcdata_shouldConsumeAndTransitionToRcdata() {
        // Arrange
        CharacterReader reader = new CharacterReader("lt;rest");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.CharacterReferenceInRcdata.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.Rcdata, tokeniser.getState());
    }

    @Test
    public void read_characterReferenceInRcdataInvalid_shouldEmitAmpersandAndTransitionToRcdata() {
        // Arrange
        CharacterReader reader = new CharacterReader(" notaref");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.CharacterReferenceInRcdata.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.Rcdata, tokeniser.getState());
    }

    @Test
    public void read_rawtextLessThan_shouldAdvanceToRawtextLessthanSign() {
        // Arrange
        CharacterReader reader = new CharacterReader("<text");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.Rawtext.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.RawtextLessthanSign, tokeniser.getState());
        Assert.assertEquals('t', reader.current());
    }

    @Test
    public void read_rawtextNullChar_shouldEmitReplacementChar() {
        // Arrange
        CharacterReader reader = new CharacterReader("\u0000text");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.Rawtext.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(1, tokeniser.getErrors().size());
        Assert.assertEquals('t', reader.current());
    }

    @Test
    public void read_rawtextEof_shouldEmitEofToken() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.Rawtext.read(tokeniser, reader);

        // Assert
        Token token = tokeniser.read();
        Assert.assertTrue(token instanceof Token.EOF);
    }

    @Test
    public void read_rawtextDefault_shouldConsumeData() {
        // Arrange
        CharacterReader reader = new CharacterReader("some raw data<tag");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.Rawtext.read(tokeniser, reader);

        // Assert
        Assert.assertEquals('<', reader.current());
    }

    @Test
    public void read_scriptDataLessThan_shouldAdvanceToScriptDataLessthanSign() {
        // Arrange
        CharacterReader reader = new CharacterReader("<script");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptData.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataLessthanSign, tokeniser.getState());
        Assert.assertEquals('s', reader.current());
    }

    @Test
    public void read_scriptDataNullChar_shouldEmitReplacementChar() {
        // Arrange
        CharacterReader reader = new CharacterReader("\u0000var a = 1;");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptData.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(1, tokeniser.getErrors().size());
        Assert.assertEquals('v', reader.current());
    }

    @Test
    public void read_scriptDataEof_shouldEmitEofToken() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptData.read(tokeniser, reader);

        // Assert
        Token token = tokeniser.read();
        Assert.assertTrue(token instanceof Token.EOF);
    }

    @Test
    public void read_scriptDataDefault_shouldConsumeData() {
        // Arrange
        CharacterReader reader = new CharacterReader("var x = 10;<");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptData.read(tokeniser, reader);

        // Assert
        Assert.assertEquals('<', reader.current());
    }

    @Test
    public void read_plaintextNullChar_shouldEmitReplacementChar() {
        // Arrange
        CharacterReader reader = new CharacterReader("\u0000text");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.PLAINTEXT.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(1, tokeniser.getErrors().size());
        Assert.assertEquals('t', reader.current());
    }

    @Test
    public void read_plaintextEof_shouldEmitEofToken() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.PLAINTEXT.read(tokeniser, reader);

        // Assert
        Token token = tokeniser.read();
        Assert.assertTrue(token instanceof Token.EOF);
    }

    @Test
    public void read_plaintextDefault_shouldConsumeToNullChar() {
        // Arrange
        CharacterReader reader = new CharacterReader("all plain text without null");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.PLAINTEXT.read(tokeniser, reader);

        // Assert
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_tagOpenExclamation_shouldAdvanceToMarkupDeclarationOpen() {
        // Arrange
        CharacterReader reader = new CharacterReader("!--");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.TagOpen.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.MarkupDeclarationOpen, tokeniser.getState());
        Assert.assertEquals('-', reader.current());
    }

    @Test
    public void read_tagOpenSlash_shouldAdvanceToEndTagOpen() {
        // Arrange
        CharacterReader reader = new CharacterReader("/div>");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.TagOpen.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.EndTagOpen, tokeniser.getState());
        Assert.assertEquals('d', reader.current());
    }

    @Test
    public void read_tagOpenQuestion_shouldAdvanceToBogusComment() {
        // Arrange
        CharacterReader reader = new CharacterReader("?xml?>");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.TagOpen.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.BogusComment, tokeniser.getState());
        Assert.assertEquals('x', reader.current());
    }

    @Test
    public void read_tagOpenLetter_shouldCreateTagPendingAndTransitionToTagName() {
        // Arrange
        CharacterReader reader = new CharacterReader("div>");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.TagOpen.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.TagName, tokeniser.getState());
        Assert.assertNotNull(tokeniser.tagPending);
        Assert.assertTrue(tokeniser.tagPending instanceof Token.StartTag);
    }

    @Test
    public void read_tagOpenNonLetter_shouldErrorEmitLessThanAndTransitionToData() {
        // Arrange
        CharacterReader reader = new CharacterReader("123>");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.TagOpen.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
        Assert.assertEquals(1, tokeniser.getErrors().size());
        Assert.assertEquals('1', reader.current());
    }

    @Test
    public void read_endTagOpenEmpty_shouldEofErrorEmitAndTransitionToData() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.EndTagOpen.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
        Assert.assertEquals(1, tokeniser.getErrors().size());
    }

    @Test
    public void read_endTagOpenLetter_shouldCreateEndTagPendingAndTransitionToTagName() {
        // Arrange
        CharacterReader reader = new CharacterReader("div>");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.EndTagOpen.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.TagName, tokeniser.getState());
        Assert.assertNotNull(tokeniser.tagPending);
        Assert.assertTrue(tokeniser.tagPending instanceof Token.EndTag);
    }

    @Test
    public void read_endTagOpenGreaterThan_shouldErrorAndAdvanceToData() {
        // Arrange
        CharacterReader reader = new CharacterReader(">tail");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.EndTagOpen.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
        Assert.assertEquals(1, tokeniser.getErrors().size());
        Assert.assertEquals('t', reader.current());
    }

    @Test
    public void read_endTagOpenOther_shouldErrorAndAdvanceToBogusComment() {
        // Arrange
        CharacterReader reader = new CharacterReader("@comment>");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.EndTagOpen.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.BogusComment, tokeniser.getState());
        Assert.assertEquals(1, tokeniser.getErrors().size());
        Assert.assertEquals('c', reader.current());
    }

    @Test
    public void read_tagNameWhitespace_shouldTransitionToBeforeAttributeName() {
        // Arrange
        CharacterReader reader = new CharacterReader("div attr=val>");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);

        // Act
        TokeniserState.TagName.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.BeforeAttributeName, tokeniser.getState());
        Assert.assertEquals("div", tokeniser.tagPending.tagName);
    }

    @Test
    public void read_tagNameSlash_shouldTransitionToSelfClosingStartTag() {
        // Arrange
        CharacterReader reader = new CharacterReader("img/>");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);

        // Act
        TokeniserState.TagName.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.SelfClosingStartTag, tokeniser.getState());
        Assert.assertEquals("img", tokeniser.tagPending.tagName);
    }

    @Test
    public void read_tagNameGreaterThan_shouldEmitTagAndTransitionToData() {
        // Arrange
        CharacterReader reader = new CharacterReader("p>rest");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);

        // Act
        TokeniserState.TagName.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    @Test
    public void read_tagNameNullChar_shouldAppendReplacementChar() {
        // Arrange
        CharacterReader reader = new CharacterReader("a\u0000b");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);

        // Act
        TokeniserState.TagName.read(tokeniser, reader);

        // Assert
        Assert.assertTrue(tokeniser.tagPending.tagName.indexOf("\uFFFD") >= 0);
    }

    @Test
    public void read_tagNameEof_shouldEofErrorAndTransitionToData() {
        // Arrange
        CharacterReader reader = new CharacterReader("span");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);

        // Act
        TokeniserState.TagName.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
        Assert.assertEquals(1, tokeniser.getErrors().size());
    }

    @Test
    public void read_rcdataLessthanSignSlash_shouldAdvanceToRCDATAEndTagOpen() {
        // Arrange
        CharacterReader reader = new CharacterReader("/title>");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.RcdataLessthanSign.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.RCDATAEndTagOpen, tokeniser.getState());
        Assert.assertEquals('t', reader.current());
    }

    @Test
    public void read_rcdataLessthanSignLetterNotAppropriate_shouldEmitEndTagAndTransitionToData() {
        // Arrange
        CharacterReader reader = new CharacterReader("other>rest");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.transition(TokeniserState.Rcdata);

        // Act
        TokeniserState.RcdataLessthanSign.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    @Test
    public void read_rcdataLessthanSignOther_shouldEmitLessThanAndTransitionToRcdata() {
        // Arrange
        CharacterReader reader = new CharacterReader("123");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.RcdataLessthanSign.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.Rcdata, tokeniser.getState());
    }

    @Test
    public void read_rcdataEndTagOpenLetter_shouldCreateTagPendingAndAdvanceToRCDATAEndTagName() {
        // Arrange
        CharacterReader reader = new CharacterReader("title>");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTempBuffer();

        // Act
        TokeniserState.RCDATAEndTagOpen.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.RCDATAEndTagName, tokeniser.getState());
        Assert.assertEquals('i', reader.current());
    }

    @Test
    public void read_rcdataEndTagOpenNotLetter_shouldEmitAndTransitionToRcdata() {
        // Arrange
        CharacterReader reader = new CharacterReader("123");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.RCDATAEndTagOpen.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.Rcdata, tokeniser.getState());
    }

    @Test
    public void read_rcdataEndTagNameLetter_shouldAppendAndReturn() {
        // Arrange
        CharacterReader reader = new CharacterReader("itle>");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(false);
        tokeniser.createTempBuffer();

        // Act
        TokeniserState.RCDATAEndTagName.read(tokeniser, reader);

        // Assert
        Assert.assertEquals('>', reader.current());
    }

    @Test
    public void read_rcdataEndTagNameWhitespaceAppropriate_shouldTransitionToBeforeAttributeName() {
        // Arrange
        CharacterReader reader = new CharacterReader(" ");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(false);
        tokeniser.tagPending.appendTagName("title");
        tokeniser.createTempBuffer();

        // Act
        TokeniserState.RCDATAEndTagName.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.Rcdata, tokeniser.getState());
    }

    @Test
    public void read_rcdataEndTagNameSlashAppropriate_shouldTransitionToSelfClosingStartTag() {
        // Arrange
        CharacterReader reader = new CharacterReader("/");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(false);
        tokeniser.tagPending.appendTagName("title");
        tokeniser.createTempBuffer();

        // Act
        TokeniserState.RCDATAEndTagName.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.Rcdata, tokeniser.getState());
    }

    @Test
    public void read_rcdataEndTagNameGreaterThanAppropriate_shouldEmitAndTransitionToData() {
        // Arrange
        CharacterReader reader = new CharacterReader(">");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(false);
        tokeniser.createTempBuffer();

        // Act
        TokeniserState.RCDATAEndTagName.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.Rcdata, tokeniser.getState());
    }

    @Test
    public void read_rawtextLessthanSignSlash_shouldAdvanceToRawtextEndTagOpen() {
        // Arrange
        CharacterReader reader = new CharacterReader("/style>");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.RawtextLessthanSign.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.RawtextEndTagOpen, tokeniser.getState());
        Assert.assertEquals('s', reader.current());
    }

    @Test
    public void read_rawtextLessthanSignOther_shouldEmitLessThanAndTransitionToRawtext() {
        // Arrange
        CharacterReader reader = new CharacterReader("abc");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.RawtextLessthanSign.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.Rawtext, tokeniser.getState());
    }

    @Test
    public void read_rawtextEndTagOpenLetter_shouldCreateTagPendingAndTransitionToRawtextEndTagName() {
        // Arrange
        CharacterReader reader = new CharacterReader("style>");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.RawtextEndTagOpen.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.RawtextEndTagName, tokeniser.getState());
    }

    @Test
    public void read_rawtextEndTagOpenOther_shouldEmitAndTransitionToRawtext() {
        // Arrange
        CharacterReader reader = new CharacterReader("123");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.RawtextEndTagOpen.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.Rawtext, tokeniser.getState());
    }

    @Test
    public void read_rawtextEndTagNameLetter_shouldAppendAndReturn() {
        // Arrange
        CharacterReader reader = new CharacterReader("style>");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(false);
        tokeniser.createTempBuffer();

        // Act
        TokeniserState.RawtextEndTagName.read(tokeniser, reader);

        // Assert
        Assert.assertEquals('>', reader.current());
    }

    @Test
    public void read_rawtextEndTagNameNotAppropriate_shouldEmitAndTransitionToRawtext() {
        // Arrange
        CharacterReader reader = new CharacterReader(">rest");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(false);
        tokeniser.createTempBuffer();

        // Act
        TokeniserState.RawtextEndTagName.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.Rawtext, tokeniser.getState());
    }

    @Test
    public void read_scriptDataLessthanSignSlash_shouldTransitionToScriptDataEndTagOpen() {
        // Arrange
        CharacterReader reader = new CharacterReader("/script>");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataLessthanSign.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataEndTagOpen, tokeniser.getState());
    }

    @Test
    public void read_scriptDataLessthanSignExclamation_shouldTransitionToScriptDataEscapeStart() {
        // Arrange
        CharacterReader reader = new CharacterReader("!--");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataLessthanSign.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataEscapeStart, tokeniser.getState());
    }

    @Test
    public void read_scriptDataLessthanSignOther_shouldUnconsumeAndTransitionToScriptData() {
        // Arrange
        CharacterReader reader = new CharacterReader("abc");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataLessthanSign.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptData, tokeniser.getState());
        Assert.assertEquals('a', reader.current());
    }

    @Test
    public void read_scriptDataEndTagOpenLetter_shouldCreateTagPendingAndTransitionToScriptDataEndTagName() {
        // Arrange
        CharacterReader reader = new CharacterReader("script>");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataEndTagOpen.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataEndTagName, tokeniser.getState());
    }

    @Test
    public void read_scriptDataEndTagOpenOther_shouldEmitAndTransitionToScriptData() {
        // Arrange
        CharacterReader reader = new CharacterReader("123");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataEndTagOpen.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptData, tokeniser.getState());
    }

    @Test
    public void read_scriptDataEndTagNameLetter_shouldAppendAndReturn() {
        // Arrange
        CharacterReader reader = new CharacterReader("cript>");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(false);
        tokeniser.createTempBuffer();

        // Act
        TokeniserState.ScriptDataEndTagName.read(tokeniser, reader);

        // Assert
        Assert.assertEquals('>', reader.current());
    }

    @Test
    public void read_scriptDataEndTagNameNotAppropriate_shouldEmitAndTransitionToScriptData() {
        // Arrange
        CharacterReader reader = new CharacterReader(">rest");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(false);
        tokeniser.createTempBuffer();

        // Act
        TokeniserState.ScriptDataEndTagName.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptData, tokeniser.getState());
    }

    @Test
    public void read_scriptDataEscapeStartDash_shouldAdvanceToScriptDataEscapeStartDash() {
        // Arrange
        CharacterReader reader = new CharacterReader("-rest");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataEscapeStart.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataEscapeStartDash, tokeniser.getState());
        Assert.assertEquals('r', reader.current());
    }

    @Test
    public void read_scriptDataEscapeStartOther_shouldTransitionToScriptData() {
        // Arrange
        CharacterReader reader = new CharacterReader("x");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataEscapeStart.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptData, tokeniser.getState());
    }

    @Test
    public void read_scriptDataEscapeStartDashDash_shouldAdvanceToScriptDataEscapedDashDash() {
        // Arrange
        CharacterReader reader = new CharacterReader("-rest");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataEscapeStartDash.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataEscapedDashDash, tokeniser.getState());
        Assert.assertEquals('r', reader.current());
    }

    @Test
    public void read_scriptDataEscapeStartDashOther_shouldTransitionToScriptData() {
        // Arrange
        CharacterReader reader = new CharacterReader("x");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataEscapeStartDash.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptData, tokeniser.getState());
    }

    @Test
    public void read_scriptDataEscapedEmpty_shouldEofErrorAndTransitionToData() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataEscaped.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
        Assert.assertEquals(1, tokeniser.getErrors().size());
    }

    @Test
    public void read_scriptDataEscapedDash_shouldAdvanceToScriptDataEscapedDash() {
        // Arrange
        CharacterReader reader = new CharacterReader("-text");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataEscaped.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataEscapedDash, tokeniser.getState());
        Assert.assertEquals('t', reader.current());
    }

    @Test
    public void read_scriptDataEscapedLessThan_shouldAdvanceToScriptDataEscapedLessthanSign() {
        // Arrange
        CharacterReader reader = new CharacterReader("<text");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataEscaped.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataEscapedLessthanSign, tokeniser.getState());
        Assert.assertEquals('t', reader.current());
    }

    @Test
    public void read_scriptDataEscapedNullChar_shouldErrorAndAdvance() {
        // Arrange
        CharacterReader reader = new CharacterReader("\u0000text");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataEscaped.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(1, tokeniser.getErrors().size());
        Assert.assertEquals('t', reader.current());
    }

    @Test
    public void read_scriptDataEscapedDefault_shouldConsumeData() {
        // Arrange
        CharacterReader reader = new CharacterReader("some script text-dash");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataEscaped.read(tokeniser, reader);

        // Assert
        Assert.assertEquals('-', reader.current());
    }

    @Test
    public void read_scriptDataEscapedDashEmpty_shouldEofErrorAndTransitionToData() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataEscapedDash.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
        Assert.assertEquals(1, tokeniser.getErrors().size());
    }

    @Test
    public void read_scriptDataEscapedDashDash_shouldTransitionToScriptDataEscapedDashDash() {
        // Arrange
        CharacterReader reader = new CharacterReader("-next");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataEscapedDash.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataEscapedDashDash, tokeniser.getState());
        Assert.assertEquals('n', reader.current());
    }

    @Test
    public void read_scriptDataEscapedDashLessThan_shouldTransitionToScriptDataEscapedLessthanSign() {
        // Arrange
        CharacterReader reader = new CharacterReader("<next");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataEscapedDash.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataEscapedLessthanSign, tokeniser.getState());
    }

    @Test
    public void read_scriptDataEscapedDashNull_shouldErrorAndTransitionToScriptDataEscaped() {
        // Arrange
        CharacterReader reader = new CharacterReader("\u0000next");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataEscapedDash.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataEscaped, tokeniser.getState());
        Assert.assertEquals(1, tokeniser.getErrors().size());
    }

    @Test
    public void read_scriptDataEscapedDashOther_shouldTransitionToScriptDataEscaped() {
        // Arrange
        CharacterReader reader = new CharacterReader("abc");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataEscapedDash.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataEscaped, tokeniser.getState());
        Assert.assertEquals('b', reader.current());
    }

    @Test
    public void read_scriptDataEscapedDashDashEmpty_shouldEofErrorAndTransitionToData() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataEscapedDashDash.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
        Assert.assertEquals(1, tokeniser.getErrors().size());
    }

    @Test
    public void read_scriptDataEscapedDashDashDash_shouldStayInState() {
        // Arrange
        CharacterReader reader = new CharacterReader("-next");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.transition(TokeniserState.ScriptDataEscapedDashDash);

        // Act
        TokeniserState.ScriptDataEscapedDashDash.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataEscapedDashDash, tokeniser.getState());
    }

    @Test
    public void read_scriptDataEscapedDashDashLessThan_shouldTransitionToScriptDataEscapedLessthanSign() {
        // Arrange
        CharacterReader reader = new CharacterReader("<next");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataEscapedDashDash.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataEscapedLessthanSign, tokeniser.getState());
    }

    @Test
    public void read_scriptDataEscapedDashDashGreaterThan_shouldTransitionToScriptData() {
        // Arrange
        CharacterReader reader = new CharacterReader(">next");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataEscapedDashDash.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptData, tokeniser.getState());
    }

    @Test
    public void read_scriptDataEscapedDashDashNull_shouldErrorAndTransitionToScriptDataEscaped() {
        // Arrange
        CharacterReader reader = new CharacterReader("\u0000next");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataEscapedDashDash.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataEscaped, tokeniser.getState());
        Assert.assertEquals(1, tokeniser.getErrors().size());
    }

    @Test
    public void read_scriptDataEscapedDashDashOther_shouldTransitionToScriptDataEscaped() {
        // Arrange
        CharacterReader reader = new CharacterReader("abc");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataEscapedDashDash.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataEscaped, tokeniser.getState());
    }

    @Test
    public void read_scriptDataEscapedLessthanSignLetter_shouldAdvanceToScriptDataDoubleEscapeStart() {
        // Arrange
        CharacterReader reader = new CharacterReader("script>");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataEscapedLessthanSign.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscapeStart, tokeniser.getState());
    }

    @Test
    public void read_scriptDataEscapedLessthanSignSlash_shouldAdvanceToScriptDataEscapedEndTagOpen() {
        // Arrange
        CharacterReader reader = new CharacterReader("/script>");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataEscapedLessthanSign.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataEscapedEndTagOpen, tokeniser.getState());
    }

    @Test
    public void read_scriptDataEscapedLessthanSignOther_shouldTransitionToScriptDataEscaped() {
        // Arrange
        CharacterReader reader = new CharacterReader("123");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataEscapedLessthanSign.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataEscaped, tokeniser.getState());
    }

    @Test
    public void read_scriptDataEscapedEndTagOpenLetter_shouldAdvanceToScriptDataEscapedEndTagName() {
        // Arrange
        CharacterReader reader = new CharacterReader("script>");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTempBuffer();

        // Act
        TokeniserState.ScriptDataEscapedEndTagOpen.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataEscapedEndTagName, tokeniser.getState());
    }

    @Test
    public void read_scriptDataEscapedEndTagOpenOther_shouldTransitionToScriptDataEscaped() {
        // Arrange
        CharacterReader reader = new CharacterReader("123");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataEscapedEndTagOpen.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataEscaped, tokeniser.getState());
    }

    @Test
    public void read_scriptDataEscapedEndTagNameLetter_shouldAppendAndAdvance() {
        // Arrange
        CharacterReader reader = new CharacterReader("cript>");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(false);
        tokeniser.createTempBuffer();

        // Act
        TokeniserState.ScriptDataEscapedEndTagName.read(tokeniser, reader);

        // Assert
        Assert.assertFalse(reader.isEmpty());
    }

    @Test
    public void read_scriptDataEscapedEndTagNameOther_shouldTransitionToScriptDataEscaped() {
        // Arrange
        CharacterReader reader = new CharacterReader(">rest");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(false);
        tokeniser.createTempBuffer();

        // Act
        TokeniserState.ScriptDataEscapedEndTagName.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataEscaped, tokeniser.getState());
    }

    @Test
    public void read_scriptDataDoubleEscapeStartLetter_shouldAppendAndReturn() {
        // Arrange
        CharacterReader reader = new CharacterReader("script>");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTempBuffer();

        // Act
        TokeniserState.ScriptDataDoubleEscapeStart.read(tokeniser, reader);

        // Assert
        Assert.assertEquals("script", tokeniser.dataBuffer.toString());
    }

    @Test
    public void read_scriptDataDoubleEscapeStartDelimiterScript_shouldTransitionToScriptDataDoubleEscaped() {
        // Arrange
        CharacterReader reader = new CharacterReader(" ");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTempBuffer();
        tokeniser.dataBuffer.append("script");

        // Act
        TokeniserState.ScriptDataDoubleEscapeStart.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscaped, tokeniser.getState());
    }

    @Test
    public void read_scriptDataDoubleEscapeStartDelimiterNotScript_shouldTransitionToScriptDataEscaped() {
        // Arrange
        CharacterReader reader = new CharacterReader(">");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTempBuffer();
        tokeniser.dataBuffer.append("other");

        // Act
        TokeniserState.ScriptDataDoubleEscapeStart.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataEscaped, tokeniser.getState());
    }

    @Test
    public void read_scriptDataDoubleEscapeStartOther_shouldUnconsumeAndTransitionToScriptDataEscaped() {
        // Arrange
        CharacterReader reader = new CharacterReader("123");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTempBuffer();

        // Act
        TokeniserState.ScriptDataDoubleEscapeStart.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataEscaped, tokeniser.getState());
        Assert.assertEquals('1', reader.current());
    }

    @Test
    public void read_scriptDataDoubleEscapedDash_shouldAdvanceToScriptDataDoubleEscapedDash() {
        // Arrange
        CharacterReader reader = new CharacterReader("-test");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataDoubleEscaped.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscapedDash, tokeniser.getState());
    }

    @Test
    public void read_scriptDataDoubleEscapedLessThan_shouldAdvanceToScriptDataDoubleEscapedLessthanSign() {
        // Arrange
        CharacterReader reader = new CharacterReader("<test");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataDoubleEscaped.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscapedLessthanSign, tokeniser.getState());
    }

    @Test
    public void read_scriptDataDoubleEscapedNull_shouldErrorAndAdvance() {
        // Arrange
        CharacterReader reader = new CharacterReader("\u0000test");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataDoubleEscaped.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(1, tokeniser.getErrors().size());
        Assert.assertEquals('t', reader.current());
    }

    @Test
    public void read_scriptDataDoubleEscapedEof_shouldEofErrorAndTransitionToData() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataDoubleEscaped.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
        Assert.assertEquals(1, tokeniser.getErrors().size());
    }

    @Test
    public void read_scriptDataDoubleEscapedDefault_shouldConsumeData() {
        // Arrange
        CharacterReader reader = new CharacterReader("text-dash");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataDoubleEscaped.read(tokeniser, reader);

        // Assert
        Assert.assertEquals('-', reader.current());
    }

    @Test
    public void read_scriptDataDoubleEscapedDashDash_shouldTransitionToScriptDataDoubleEscapedDashDash() {
        // Arrange
        CharacterReader reader = new CharacterReader("-test");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataDoubleEscapedDash.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscapedDashDash, tokeniser.getState());
    }

    @Test
    public void read_scriptDataDoubleEscapedDashLessThan_shouldTransitionToScriptDataDoubleEscapedLessthanSign() {
        // Arrange
        CharacterReader reader = new CharacterReader("<test");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataDoubleEscapedDash.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscapedLessthanSign, tokeniser.getState());
    }

    @Test
    public void read_scriptDataDoubleEscapedDashNull_shouldErrorAndTransitionToScriptDataDoubleEscaped() {
        // Arrange
        CharacterReader reader = new CharacterReader("\u0000test");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataDoubleEscapedDash.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscaped, tokeniser.getState());
        Assert.assertEquals(1, tokeniser.getErrors().size());
    }

    @Test
    public void read_scriptDataDoubleEscapedDashEof_shouldEofErrorAndTransitionToData() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataDoubleEscapedDash.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
        Assert.assertEquals(1, tokeniser.getErrors().size());
    }

    @Test
    public void read_scriptDataDoubleEscapedDashOther_shouldTransitionToScriptDataDoubleEscaped() {
        // Arrange
        CharacterReader reader = new CharacterReader("abc");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataDoubleEscapedDash.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscaped, tokeniser.getState());
    }

    @Test
    public void read_scriptDataDoubleEscapedDashDashDash_shouldStayInState() {
        // Arrange
        CharacterReader reader = new CharacterReader("-test");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.transition(TokeniserState.ScriptDataDoubleEscapedDashDash);

        // Act
        TokeniserState.ScriptDataDoubleEscapedDashDash.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscapedDashDash, tokeniser.getState());
    }

    @Test
    public void read_scriptDataDoubleEscapedDashDashLessThan_shouldTransitionToScriptDataDoubleEscapedLessthanSign() {
        // Arrange
        CharacterReader reader = new CharacterReader("<test");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataDoubleEscapedDashDash.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscapedLessthanSign, tokeniser.getState());
    }

    @Test
    public void read_scriptDataDoubleEscapedDashDashGreaterThan_shouldTransitionToScriptData() {
        // Arrange
        CharacterReader reader = new CharacterReader(">test");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataDoubleEscapedDashDash.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptData, tokeniser.getState());
    }

    @Test
    public void read_scriptDataDoubleEscapedDashDashNull_shouldErrorAndTransitionToScriptDataDoubleEscaped() {
        // Arrange
        CharacterReader reader = new CharacterReader("\u0000test");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataDoubleEscapedDashDash.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscaped, tokeniser.getState());
        Assert.assertEquals(1, tokeniser.getErrors().size());
    }

    @Test
    public void read_scriptDataDoubleEscapedDashDashEof_shouldEofErrorAndTransitionToData() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataDoubleEscapedDashDash.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
        Assert.assertEquals(1, tokeniser.getErrors().size());
    }

    @Test
    public void read_scriptDataDoubleEscapedDashDashOther_shouldTransitionToScriptDataDoubleEscaped() {
        // Arrange
        CharacterReader reader = new CharacterReader("abc");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataDoubleEscapedDashDash.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscaped, tokeniser.getState());
    }

    @Test
    public void read_scriptDataDoubleEscapedLessthanSignSlash_shouldAdvanceToScriptDataDoubleEscapeEnd() {
        // Arrange
        CharacterReader reader = new CharacterReader("/script>");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataDoubleEscapedLessthanSign.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscapeEnd, tokeniser.getState());
    }

    @Test
    public void read_scriptDataDoubleEscapedLessthanSignOther_shouldTransitionToScriptDataDoubleEscaped() {
        // Arrange
        CharacterReader reader = new CharacterReader("abc");
        Tokeniser tokeniser = createTokeniser(reader);

        // Act
        TokeniserState.ScriptDataDoubleEscapedLessthanSign.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscaped, tokeniser.getState());
    }

    @Test
    public void read_scriptDataDoubleEscapeEndLetter_shouldAppendAndReturn() {
        // Arrange
        CharacterReader reader = new CharacterReader("script>");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTempBuffer();

        // Act
        TokeniserState.ScriptDataDoubleEscapeEnd.read(tokeniser, reader);

        // Assert
        Assert.assertEquals("script", tokeniser.dataBuffer.toString());
    }

    @Test
    public void read_scriptDataDoubleEscapeEndDelimiterScript_shouldTransitionToScriptDataEscaped() {
        // Arrange
        CharacterReader reader = new CharacterReader(">");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTempBuffer();
        tokeniser.dataBuffer.append("script");

        // Act
        TokeniserState.ScriptDataDoubleEscapeEnd.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataEscaped, tokeniser.getState());
    }

    @Test
    public void read_scriptDataDoubleEscapeEndDelimiterNotScript_shouldTransitionToScriptDataDoubleEscaped() {
        // Arrange
        CharacterReader reader = new CharacterReader(">");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTempBuffer();
        tokeniser.dataBuffer.append("other");

        // Act
        TokeniserState.ScriptDataDoubleEscapeEnd.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscaped, tokeniser.getState());
    }

    @Test
    public void read_scriptDataDoubleEscapeEndOther_shouldUnconsumeAndTransitionToScriptDataDoubleEscaped() {
        // Arrange
        CharacterReader reader = new CharacterReader("123");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTempBuffer();

        // Act
        TokeniserState.ScriptDataDoubleEscapeEnd.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.ScriptDataDoubleEscaped, tokeniser.getState());
        Assert.assertEquals('1', reader.current());
    }

    @Test
    public void read_beforeAttributeNameWhitespace_shouldStayInState() {
        // Arrange
        CharacterReader reader = new CharacterReader(" \t\n\f");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);
        tokeniser.transition(TokeniserState.BeforeAttributeName);

        // Act
        TokeniserState.BeforeAttributeName.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.BeforeAttributeName, tokeniser.getState());
    }

    @Test
    public void read_beforeAttributeNameSlash_shouldTransitionToSelfClosingStartTag() {
        // Arrange
        CharacterReader reader = new CharacterReader("/>");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);

        // Act
        TokeniserState.BeforeAttributeName.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.SelfClosingStartTag, tokeniser.getState());
    }

    @Test
    public void read_beforeAttributeNameGreaterThan_shouldEmitTagAndTransitionToData() {
        // Arrange
        CharacterReader reader = new CharacterReader(">");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);

        // Act
        TokeniserState.BeforeAttributeName.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    @Test
    public void read_beforeAttributeNameNull_shouldErrorAndTransitionToAttributeName() {
        // Arrange
        CharacterReader reader = new CharacterReader("\u0000attr");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);

        // Act
        TokeniserState.BeforeAttributeName.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.AttributeName, tokeniser.getState());
        Assert.assertEquals(1, tokeniser.getErrors().size());
        Assert.assertEquals('\u0000', reader.current());
    }

    @Test
    public void read_beforeAttributeNameEof_shouldEofErrorAndTransitionToData() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);

        // Act
        TokeniserState.BeforeAttributeName.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
        Assert.assertEquals(1, tokeniser.getErrors().size());
    }

    @Test
    public void read_beforeAttributeNameSpecialChars_shouldErrorAndTransitionToAttributeName() {
        // Arrange
        CharacterReader reader = new CharacterReader("\"attr");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);

        // Act
        TokeniserState.BeforeAttributeName.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.AttributeName, tokeniser.getState());
        Assert.assertEquals(1, tokeniser.getErrors().size());
    }

    @Test
    public void read_beforeAttributeNameNormalChar_shouldTransitionToAttributeName() {
        // Arrange
        CharacterReader reader = new CharacterReader("attr=val");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);

        // Act
        TokeniserState.BeforeAttributeName.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.AttributeName, tokeniser.getState());
        Assert.assertEquals('a', reader.current());
    }

    @Test
    public void read_attributeNameWhitespace_shouldTransitionToAfterAttributeName() {
        // Arrange
        CharacterReader reader = new CharacterReader("class =value");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);
        tokeniser.tagPending.newAttribute();

        // Act
        TokeniserState.AttributeName.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.AfterAttributeName, tokeniser.getState());
    }

    @Test
    public void read_attributeNameSlash_shouldTransitionToSelfClosingStartTag() {
        // Arrange
        CharacterReader reader = new CharacterReader("disabled/>");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);
        tokeniser.tagPending.newAttribute();

        // Act
        TokeniserState.AttributeName.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.SelfClosingStartTag, tokeniser.getState());
    }

    @Test
    public void read_attributeNameEqual_shouldTransitionToBeforeAttributeValue() {
        // Arrange
        CharacterReader reader = new CharacterReader("id=myId");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);
        tokeniser.tagPending.newAttribute();

        // Act
        TokeniserState.AttributeName.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.BeforeAttributeValue, tokeniser.getState());
    }

    @Test
    public void read_attributeNameGreaterThan_shouldEmitTagAndTransitionToData() {
        // Arrange
        CharacterReader reader = new CharacterReader("readonly>");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);
        tokeniser.tagPending.newAttribute();

        // Act
        TokeniserState.AttributeName.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    @Test
    public void read_attributeNameEof_shouldEofErrorAndTransitionToData() {
        // Arrange
        CharacterReader reader = new CharacterReader("id");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);
        tokeniser.tagPending.newAttribute();

        // Act
        TokeniserState.AttributeName.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
        Assert.assertEquals(1, tokeniser.getErrors().size());
    }

    @Test
    public void read_afterAttributeNameWhitespace_shouldStayInState() {
        // Arrange
        CharacterReader reader = new CharacterReader("   ");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.transition(TokeniserState.AfterAttributeName);

        // Act
        TokeniserState.AfterAttributeName.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.AfterAttributeName, tokeniser.getState());
    }

    @Test
    public void read_afterAttributeNameEqual_shouldTransitionToBeforeAttributeValue() {
        // Arrange
        CharacterReader reader = new CharacterReader("=val");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);

        // Act
        TokeniserState.AfterAttributeName.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.BeforeAttributeValue, tokeniser.getState());
    }

    @Test
    public void read_afterAttributeNameSlash_shouldTransitionToSelfClosingStartTag() {
        // Arrange
        CharacterReader reader = new CharacterReader("/>");
        Tokeniser tokeniser = createTokeniser(reader);
        tokeniser.createTagPending(true);

        // Act
        TokeniserState.AfterAttributeName.read(tokeniser, reader);

        // Assert
        Assert.assertEquals(TokeniserState.SelfClosingStartTag, tokeniser.getState());
    }

    @Test
    public void read_afterAttributeNameGreaterThan_shouldEmitTagAndTransitionToData() {
        // Arrange
        CharacterReader reader = new CharacterReader(">");
        Tokeniser token