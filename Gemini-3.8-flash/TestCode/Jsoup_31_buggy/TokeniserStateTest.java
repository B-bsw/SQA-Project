package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;

public class TokeniserStateTest {

    private Tokeniser createTokeniser(String input) {
        CharacterReader reader = new CharacterReader(input);
        ParseErrorList errors = ParseErrorList.tracking(100);
        return new Tokeniser(reader, errors);
    }

    private CharacterReader createReader(String input) {
        return new CharacterReader(input);
    }

    // =========================================================================
    // 1. Data State Tests
    // =========================================================================

    @Test
    public void read_givenDataStateWithAmpersand_shouldAdvanceTransition() {
        CharacterReader reader = createReader("&abc");
        Tokeniser tokeniser = createTokeniser("&abc");
        TokeniserState.Data.read(tokeniser, reader);
        Assert.assertEquals('a', reader.current());
    }

    @Test
    public void read_givenDataStateWithLessThan_shouldAdvanceTransition() {
        CharacterReader reader = createReader("<div");
        Tokeniser tokeniser = createTokeniser("<div");
        TokeniserState.Data.read(tokeniser, reader);
        Assert.assertEquals('d', reader.current());
    }

    @Test
    public void read_givenDataStateWithNullChar_shouldEmitAndError() {
        CharacterReader reader = createReader("\u0000text");
        Tokeniser tokeniser = createTokeniser("\u0000text");
        TokeniserState.Data.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenDataStateWithEof_shouldEmitEofToken() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        TokeniserState.Data.read(tokeniser, reader);
        Token token = tokeniser.read();
        Assert.assertEquals(Token.TokenType.EOF, token.type);
    }

    @Test
    public void read_givenDataStateWithPlainText_shouldEmitData() {
        CharacterReader reader = createReader("Hello World<");
        Tokeniser tokeniser = createTokeniser("Hello World<");
        TokeniserState.Data.read(tokeniser, reader);
        Assert.assertEquals('<', reader.current());
    }

    // =========================================================================
    // 2. CharacterReferenceInData State Tests
    // =========================================================================

    @Test
    public void read_givenCharRefInDataWithValidNamedRef_shouldEmitAndTransition() {
        CharacterReader reader = createReader("amp;");
        Tokeniser tokeniser = createTokeniser("amp;");
        TokeniserState.CharacterReferenceInData.read(tokeniser, reader);
        Token token = tokeniser.read();
        Assert.assertNotNull(token);
    }

    @Test
    public void read_givenCharRefInDataWithInvalidRef_shouldEmitAmpersand() {
        CharacterReader reader = createReader(" invalid;");
        Tokeniser tokeniser = createTokeniser(" invalid;");
        TokeniserState.CharacterReferenceInData.read(tokeniser, reader);
        Token token = tokeniser.read();
        Assert.assertNotNull(token);
    }

    // =========================================================================
    // 3. Rcdata State Tests
    // =========================================================================

    @Test
    public void read_givenRcdataWithAmpersand_shouldAdvanceTransition() {
        CharacterReader reader = createReader("&ref");
        Tokeniser tokeniser = createTokeniser("&ref");
        TokeniserState.Rcdata.read(tokeniser, reader);
        Assert.assertEquals('r', reader.current());
    }

    @Test
    public void read_givenRcdataWithLessThan_shouldAdvanceTransition() {
        CharacterReader reader = createReader("</title>");
        Tokeniser tokeniser = createTokeniser("</title>");
        TokeniserState.Rcdata.read(tokeniser, reader);
        Assert.assertEquals('/', reader.current());
    }

    @Test
    public void read_givenRcdataWithNullChar_shouldEmitReplacementChar() {
        CharacterReader reader = createReader("\u0000abc");
        Tokeniser tokeniser = createTokeniser("\u0000abc");
        TokeniserState.Rcdata.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenRcdataWithEof_shouldEmitEofToken() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        TokeniserState.Rcdata.read(tokeniser, reader);
        Token token = tokeniser.read();
        Assert.assertEquals(Token.TokenType.EOF, token.type);
    }

    @Test
    public void read_givenRcdataWithDefaultText_shouldEmitData() {
        CharacterReader reader = createReader("some rcdata text&");
        Tokeniser tokeniser = createTokeniser("some rcdata text&");
        TokeniserState.Rcdata.read(tokeniser, reader);
        Assert.assertEquals('&', reader.current());
    }

    // =========================================================================
    // 4. CharacterReferenceInRcdata State Tests
    // =========================================================================

    @Test
    public void read_givenCharRefInRcdataWithValidRef_shouldEmitAndTransition() {
        CharacterReader reader = createReader("lt;");
        Tokeniser tokeniser = createTokeniser("lt;");
        TokeniserState.CharacterReferenceInRcdata.read(tokeniser, reader);
        Token token = tokeniser.read();
        Assert.assertNotNull(token);
    }

    @Test
    public void read_givenCharRefInRcdataWithNullRef_shouldEmitAmpersand() {
        CharacterReader reader = createReader(" notARef;");
        Tokeniser tokeniser = createTokeniser(" notARef;");
        TokeniserState.CharacterReferenceInRcdata.read(tokeniser, reader);
        Token token = tokeniser.read();
        Assert.assertNotNull(token);
    }

    // =========================================================================
    // 5. Rawtext State Tests
    // =========================================================================

    @Test
    public void read_givenRawtextWithLessThan_shouldAdvanceTransition() {
        CharacterReader reader = createReader("<tag");
        Tokeniser tokeniser = createTokeniser("<tag");
        TokeniserState.Rawtext.read(tokeniser, reader);
        Assert.assertEquals('t', reader.current());
    }

    @Test
    public void read_givenRawtextWithNullChar_shouldEmitReplacementChar() {
        CharacterReader reader = createReader("\u0000raw");
        Tokeniser tokeniser = createTokeniser("\u0000raw");
        TokeniserState.Rawtext.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenRawtextWithEof_shouldEmitEofToken() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        TokeniserState.Rawtext.read(tokeniser, reader);
        Token token = tokeniser.read();
        Assert.assertEquals(Token.TokenType.EOF, token.type);
    }

    @Test
    public void read_givenRawtextWithText_shouldEmitData() {
        CharacterReader reader = createReader("plain raw data<");
        Tokeniser tokeniser = createTokeniser("plain raw data<");
        TokeniserState.Rawtext.read(tokeniser, reader);
        Assert.assertEquals('<', reader.current());
    }

    // =========================================================================
    // 6. ScriptData State Tests
    // =========================================================================

    @Test
    public void read_givenScriptDataWithLessThan_shouldAdvanceTransition() {
        CharacterReader reader = createReader("<script");
        Tokeniser tokeniser = createTokeniser("<script");
        TokeniserState.ScriptData.read(tokeniser, reader);
        Assert.assertEquals('s', reader.current());
    }

    @Test
    public void read_givenScriptDataWithNullChar_shouldEmitReplacementChar() {
        CharacterReader reader = createReader("\u0000var x = 1;");
        Tokeniser tokeniser = createTokeniser("\u0000var x = 1;");
        TokeniserState.ScriptData.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenScriptDataWithEof_shouldEmitEofToken() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        TokeniserState.ScriptData.read(tokeniser, reader);
        Token token = tokeniser.read();
        Assert.assertEquals(Token.TokenType.EOF, token.type);
    }

    @Test
    public void read_givenScriptDataWithText_shouldEmitData() {
        CharacterReader reader = createReader("console.log('hi');<");
        Tokeniser tokeniser = createTokeniser("console.log('hi');<");
        TokeniserState.ScriptData.read(tokeniser, reader);
        Assert.assertEquals('<', reader.current());
    }

    // =========================================================================
    // 7. PLAINTEXT State Tests
    // =========================================================================

    @Test
    public void read_givenPLAINTEXTWithNullChar_shouldEmitReplacementChar() {
        CharacterReader reader = createReader("\u0000text");
        Tokeniser tokeniser = createTokeniser("\u0000text");
        TokeniserState.PLAINTEXT.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenPLAINTEXTWithEof_shouldEmitEofToken() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        TokeniserState.PLAINTEXT.read(tokeniser, reader);
        Token token = tokeniser.read();
        Assert.assertEquals(Token.TokenType.EOF, token.type);
    }

    @Test
    public void read_givenPLAINTEXTWithText_shouldConsumeToNullChar() {
        CharacterReader reader = createReader("plain text content\u0000");
        Tokeniser tokeniser = createTokeniser("plain text content\u0000");
        TokeniserState.PLAINTEXT.read(tokeniser, reader);
        Assert.assertEquals('\u0000', reader.current());
    }

    // =========================================================================
    // 8. TagOpen State Tests
    // =========================================================================

    @Test
    public void read_givenTagOpenWithExclamation_shouldAdvanceToMarkupDeclarationOpen() {
        CharacterReader reader = createReader("!-- comment");
        Tokeniser tokeniser = createTokeniser("!-- comment");
        TokeniserState.TagOpen.read(tokeniser, reader);
        Assert.assertEquals('-', reader.current());
    }

    @Test
    public void read_givenTagOpenWithSlash_shouldAdvanceToEndTagOpen() {
        CharacterReader reader = createReader("/div>");
        Tokeniser tokeniser = createTokeniser("/div>");
        TokeniserState.TagOpen.read(tokeniser, reader);
        Assert.assertEquals('d', reader.current());
    }

    @Test
    public void read_givenTagOpenWithQuestion_shouldAdvanceToBogusComment() {
        CharacterReader reader = createReader("?xml version='1.0'?>");
        Tokeniser tokeniser = createTokeniser("?xml version='1.0'?>");
        TokeniserState.TagOpen.read(tokeniser, reader);
        Assert.assertEquals('x', reader.current());
    }

    @Test
    public void read_givenTagOpenWithLetter_shouldCreateTagPendingAndTransition() {
        CharacterReader reader = createReader("span>");
        Tokeniser tokeniser = createTokeniser("span>");
        TokeniserState.TagOpen.read(tokeniser, reader);
        Assert.assertNotNull(tokeniser.tagPending);
    }

    @Test
    public void read_givenTagOpenWithNonLetter_shouldErrorAndEmitLessThan() {
        CharacterReader reader = createReader("123>");
        Tokeniser tokeniser = createTokeniser("123>");
        TokeniserState.TagOpen.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    // =========================================================================
    // 9. EndTagOpen State Tests
    // =========================================================================

    @Test
    public void read_givenEndTagOpenWithEmptyReader_shouldEofErrorAndEmit() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        TokeniserState.EndTagOpen.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenEndTagOpenWithLetter_shouldCreateTagPending() {
        CharacterReader reader = createReader("div>");
        Tokeniser tokeniser = createTokeniser("div>");
        TokeniserState.EndTagOpen.read(tokeniser, reader);
        Assert.assertNotNull(tokeniser.tagPending);
    }

    @Test
    public void read_givenEndTagOpenWithGreaterThan_shouldErrorAndAdvance() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(">");
        TokeniserState.EndTagOpen.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenEndTagOpenWithNonLetterNonGt_shouldErrorAndAdvanceToBogusComment() {
        CharacterReader reader = createReader("123>");
        Tokeniser tokeniser = createTokeniser("123>");
        TokeniserState.EndTagOpen.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    // =========================================================================
    // 10. TagName State Tests
    // =========================================================================

    @Test
    public void read_givenTagNameWithWhitespace_shouldTransitionToBeforeAttributeName() {
        CharacterReader reader = createReader("div class='test'>");
        Tokeniser tokeniser = createTokeniser("div class='test'>");
        tokeniser.createTagPending(true);
        TokeniserState.TagName.read(tokeniser, reader);
        Assert.assertEquals('c', reader.current());
    }

    @Test
    public void read_givenTagNameWithSlash_shouldTransitionToSelfClosing() {
        CharacterReader reader = createReader("img/>");
        Tokeniser tokeniser = createTokeniser("img/>");
        tokeniser.createTagPending(true);
        TokeniserState.TagName.read(tokeniser, reader);
        Assert.assertEquals('>', reader.current());
    }

    @Test
    public void read_givenTagNameWithGreaterThan_shouldEmitTagPending() {
        CharacterReader reader = createReader("b>");
        Tokeniser tokeniser = createTokeniser("b>");
        tokeniser.createTagPending(true);
        TokeniserState.TagName.read(tokeniser, reader);
        Token token = tokeniser.read();
        Assert.assertNotNull(token);
    }

    @Test
    public void read_givenTagNameWithNullChar_shouldAppendReplacement() {
        CharacterReader reader = createReader("tag\u0000rem");
        Tokeniser tokeniser = createTokeniser("tag\u0000rem");
        tokeniser.createTagPending(true);
        TokeniserState.TagName.read(tokeniser, reader);
        Assert.assertEquals('r', reader.current());
    }

    @Test
    public void read_givenTagNameWithEof_shouldEofError() {
        CharacterReader reader = createReader("tag");
        Tokeniser tokeniser = createTokeniser("tag");
        tokeniser.createTagPending(true);
        TokeniserState.TagName.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    // =========================================================================
    // 11. RcdataLessthanSign State Tests
    // =========================================================================

    @Test
    public void read_givenRcdataLessthanSignWithSlash_shouldAdvanceToRCDATAEndTagOpen() {
        CharacterReader reader = createReader("/title>");
        Tokeniser tokeniser = createTokeniser("/title>");
        TokeniserState.RcdataLessthanSign.read(tokeniser, reader);
        Assert.assertEquals('t', reader.current());
    }

    @Test
    public void read_givenRcdataLessthanSignWithLetterAndNotEndTag_shouldEmitEndTag() {
        CharacterReader reader = createReader("textarea>something");
        Tokeniser tokeniser = createTokeniser("textarea>something");
        TokeniserState.RcdataLessthanSign.read(tokeniser, reader);
        Assert.assertEquals('t', reader.current());
    }

    @Test
    public void read_givenRcdataLessthanSignWithOtherChar_shouldEmitLessThan() {
        CharacterReader reader = createReader("123");
        Tokeniser tokeniser = createTokeniser("123");
        TokeniserState.RcdataLessthanSign.read(tokeniser, reader);
        Assert.assertEquals('1', reader.current());
    }

    // =========================================================================
    // 12. RCDATAEndTagOpen State Tests
    // =========================================================================

    @Test
    public void read_givenRCDATAEndTagOpenWithLetter_shouldCreateTagAndAdvance() {
        CharacterReader reader = createReader("title>");
        Tokeniser tokeniser = createTokeniser("title>");
        TokeniserState.RCDATAEndTagOpen.read(tokeniser, reader);
        Assert.assertEquals('i', reader.current());
    }

    @Test
    public void read_givenRCDATAEndTagOpenWithNonLetter_shouldEmitSlashAndTransition() {
        CharacterReader reader = createReader("123");
        Tokeniser tokeniser = createTokeniser("123");
        TokeniserState.RCDATAEndTagOpen.read(tokeniser, reader);
        Assert.assertEquals('1', reader.current());
    }

    // =========================================================================
    // 13. RCDATAEndTagName State Tests
    // =========================================================================

    @Test
    public void read_givenRCDATAEndTagNameWithLetter_shouldConsumeSequence() {
        CharacterReader reader = createReader("itle>");
        Tokeniser tokeniser = createTokeniser("itle>");
        tokeniser.createTagPending(false);
        TokeniserState.RCDATAEndTagName.read(tokeniser, reader);
        Assert.assertEquals('>', reader.current());
    }

    @Test
    public void read_givenRCDATAEndTagNameWithWhitespaceAppropriate_shouldTransition() {
        CharacterReader reader = createReader(" >");
        Tokeniser tokeniser = createTokeniser(" >");
        tokeniser.createTagPending(false);
        TokeniserState.RCDATAEndTagName.read(tokeniser, reader);
        Assert.assertEquals('>', reader.current());
    }

    @Test
    public void read_givenRCDATAEndTagNameWithSlashAppropriate_shouldTransition() {
        CharacterReader reader = createReader("/>");
        Tokeniser tokeniser = createTokeniser("/>");
        tokeniser.createTagPending(false);
        TokeniserState.RCDATAEndTagName.read(tokeniser, reader);
        Assert.assertEquals('>', reader.current());
    }

    @Test
    public void read_givenRCDATAEndTagNameWithGreaterThanAppropriate_shouldEmitTag() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(">");
        tokeniser.createTagPending(false);
        TokeniserState.RCDATAEndTagName.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenRCDATAEndTagNameWithAnythingElse_shouldEmitBuffer() {
        CharacterReader reader = createReader("?");
        Tokeniser tokeniser = createTokeniser("?");
        tokeniser.createTagPending(false);
        TokeniserState.RCDATAEndTagName.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    // =========================================================================
    // 14. RawtextLessthanSign State Tests
    // =========================================================================

    @Test
    public void read_givenRawtextLessthanSignWithSlash_shouldAdvance() {
        CharacterReader reader = createReader("/style>");
        Tokeniser tokeniser = createTokeniser("/style>");
        TokeniserState.RawtextLessthanSign.read(tokeniser, reader);
        Assert.assertEquals('s', reader.current());
    }

    @Test
    public void read_givenRawtextLessthanSignWithoutSlash_shouldEmitLessThan() {
        CharacterReader reader = createReader("style>");
        Tokeniser tokeniser = createTokeniser("style>");
        TokeniserState.RawtextLessthanSign.read(tokeniser, reader);
        Assert.assertEquals('s', reader.current());
    }

    // =========================================================================
    // 15. RawtextEndTagOpen State Tests
    // =========================================================================

    @Test
    public void read_givenRawtextEndTagOpenWithLetter_shouldCreateTag() {
        CharacterReader reader = createReader("style>");
        Tokeniser tokeniser = createTokeniser("style>");
        TokeniserState.RawtextEndTagOpen.read(tokeniser, reader);
        Assert.assertNotNull(tokeniser.tagPending);
    }

    @Test
    public void read_givenRawtextEndTagOpenWithoutLetter_shouldEmitSlash() {
        CharacterReader reader = createReader("!>");
        Tokeniser tokeniser = createTokeniser("!>");
        TokeniserState.RawtextEndTagOpen.read(tokeniser, reader);
        Assert.assertEquals('!', reader.current());
    }

    // =========================================================================
    // 16. RawtextEndTagName State Tests
    // =========================================================================

    @Test
    public void read_givenRawtextEndTagNameWithLetters_shouldConsumeSequence() {
        CharacterReader reader = createReader("tyle>");
        Tokeniser tokeniser = createTokeniser("tyle>");
        tokeniser.createTagPending(false);
        TokeniserState.RawtextEndTagName.read(tokeniser, reader);
        Assert.assertEquals('>', reader.current());
    }

    @Test
    public void read_givenRawtextEndTagNameWithWhitespace_shouldTransition() {
        CharacterReader reader = createReader(" >");
        Tokeniser tokeniser = createTokeniser(" >");
        tokeniser.createTagPending(false);
        TokeniserState.RawtextEndTagName.read(tokeniser, reader);
        Assert.assertEquals('>', reader.current());
    }

    @Test
    public void read_givenRawtextEndTagNameWithSlash_shouldTransition() {
        CharacterReader reader = createReader("/>");
        Tokeniser tokeniser = createTokeniser("/>");
        tokeniser.createTagPending(false);
        TokeniserState.RawtextEndTagName.read(tokeniser, reader);
        Assert.assertEquals('>', reader.current());
    }

    @Test
    public void read_givenRawtextEndTagNameWithGreaterThan_shouldEmitTag() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(">");
        tokeniser.createTagPending(false);
        TokeniserState.RawtextEndTagName.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenRawtextEndTagNameWithOtherChar_shouldAppendAndEmitBuffer() {
        CharacterReader reader = createReader("@");
        Tokeniser tokeniser = createTokeniser("@");
        tokeniser.createTagPending(false);
        TokeniserState.RawtextEndTagName.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    // =========================================================================
    // 17. ScriptDataLessthanSign State Tests
    // =========================================================================

    @Test
    public void read_givenScriptDataLessthanSignWithSlash_shouldTransitionToEndTag() {
        CharacterReader reader = createReader("/script>");
        Tokeniser tokeniser = createTokeniser("/script>");
        TokeniserState.ScriptDataLessthanSign.read(tokeniser, reader);
        Assert.assertEquals('s', reader.current());
    }

    @Test
    public void read_givenScriptDataLessthanSignWithExclamation_shouldTransitionToEscape() {
        CharacterReader reader = createReader("!--script-->");
        Tokeniser tokeniser = createTokeniser("!--script-->");
        TokeniserState.ScriptDataLessthanSign.read(tokeniser, reader);
        Assert.assertEquals('-', reader.current());
    }

    @Test
    public void read_givenScriptDataLessthanSignWithOther_shouldUnconsumeAndTransition() {
        CharacterReader reader = createReader("var x = 1;");
        Tokeniser tokeniser = createTokeniser("var x = 1;");
        TokeniserState.ScriptDataLessthanSign.read(tokeniser, reader);
        Assert.assertEquals('v', reader.current());
    }

    // =========================================================================
    // 18. ScriptDataEndTagOpen State Tests
    // =========================================================================

    @Test
    public void read_givenScriptDataEndTagOpenWithLetter_shouldCreateTag() {
        CharacterReader reader = createReader("script>");
        Tokeniser tokeniser = createTokeniser("script>");
        TokeniserState.ScriptDataEndTagOpen.read(tokeniser, reader);
        Assert.assertNotNull(tokeniser.tagPending);
    }

    @Test
    public void read_givenScriptDataEndTagOpenWithoutLetter_shouldEmitSlash() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(">");
        TokeniserState.ScriptDataEndTagOpen.read(tokeniser, reader);
        Assert.assertEquals('>', reader.current());
    }

    // =========================================================================
    // 19. ScriptDataEndTagName State Tests
    // =========================================================================

    @Test
    public void read_givenScriptDataEndTagNameWithLetter_shouldConsumeSequence() {
        CharacterReader reader = createReader("cript>");
        Tokeniser tokeniser = createTokeniser("cript>");
        tokeniser.createTagPending(false);
        TokeniserState.ScriptDataEndTagName.read(tokeniser, reader);
        Assert.assertEquals('>', reader.current());
    }

    @Test
    public void read_givenScriptDataEndTagNameWithWhitespace_shouldTransition() {
        CharacterReader reader = createReader(" >");
        Tokeniser tokeniser = createTokeniser(" >");
        tokeniser.createTagPending(false);
        TokeniserState.ScriptDataEndTagName.read(tokeniser, reader);
        Assert.assertEquals('>', reader.current());
    }

    @Test
    public void read_givenScriptDataEndTagNameWithSlash_shouldTransition() {
        CharacterReader reader = createReader("/>");
        Tokeniser tokeniser = createTokeniser("/>");
        tokeniser.createTagPending(false);
        TokeniserState.ScriptDataEndTagName.read(tokeniser, reader);
        Assert.assertEquals('>', reader.current());
    }

    @Test
    public void read_givenScriptDataEndTagNameWithGreaterThan_shouldEmitTag() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(">");
        tokeniser.createTagPending(false);
        TokeniserState.ScriptDataEndTagName.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenScriptDataEndTagNameWithOtherChar_shouldEmitBuffer() {
        CharacterReader reader = createReader("@");
        Tokeniser tokeniser = createTokeniser("@");
        tokeniser.createTagPending(false);
        TokeniserState.ScriptDataEndTagName.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    // =========================================================================
    // 20-21. ScriptDataEscapeStart & Dash State Tests
    // =========================================================================

    @Test
    public void read_givenScriptDataEscapeStartWithDash_shouldAdvance() {
        CharacterReader reader = createReader("--");
        Tokeniser tokeniser = createTokeniser("--");
        TokeniserState.ScriptDataEscapeStart.read(tokeniser, reader);
        Assert.assertEquals('-', reader.current());
    }

    @Test
    public void read_givenScriptDataEscapeStartWithoutDash_shouldTransitionToScriptData() {
        CharacterReader reader = createReader("abc");
        Tokeniser tokeniser = createTokeniser("abc");
        TokeniserState.ScriptDataEscapeStart.read(tokeniser, reader);
        Assert.assertEquals('a', reader.current());
    }

    @Test
    public void read_givenScriptDataEscapeStartDashWithDash_shouldAdvance() {
        CharacterReader reader = createReader("-");
        Tokeniser tokeniser = createTokeniser("-");
        TokeniserState.ScriptDataEscapeStartDash.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenScriptDataEscapeStartDashWithoutDash_shouldTransition() {
        CharacterReader reader = createReader("x");
        Tokeniser tokeniser = createTokeniser("x");
        TokeniserState.ScriptDataEscapeStartDash.read(tokeniser, reader);
        Assert.assertEquals('x', reader.current());
    }

    // =========================================================================
    // 22. ScriptDataEscaped State Tests
    // =========================================================================

    @Test
    public void read_givenScriptDataEscapedWithEmpty_shouldEofError() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        TokeniserState.ScriptDataEscaped.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenScriptDataEscapedWithDash_shouldAdvance() {
        CharacterReader reader = createReader("-");
        Tokeniser tokeniser = createTokeniser("-");
        TokeniserState.ScriptDataEscaped.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenScriptDataEscapedWithLessThan_shouldAdvance() {
        CharacterReader reader = createReader("<");
        Tokeniser tokeniser = createTokeniser("<");
        TokeniserState.ScriptDataEscaped.read(tokeniser, reader);
        Assert.assertEquals('<', reader.current());
    }

    @Test
    public void read_givenScriptDataEscapedWithNullChar_shouldEmitReplacementChar() {
        CharacterReader reader = createReader("\u0000");
        Tokeniser tokeniser = createTokeniser("\u0000");
        TokeniserState.ScriptDataEscaped.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenScriptDataEscapedWithText_shouldEmitData() {
        CharacterReader reader = createReader("text-");
        Tokeniser tokeniser = createTokeniser("text-");
        TokeniserState.ScriptDataEscaped.read(tokeniser, reader);
        Assert.assertEquals('-', reader.current());
    }

    // =========================================================================
    // 23. ScriptDataEscapedDash State Tests
    // =========================================================================

    @Test
    public void read_givenScriptDataEscapedDashWithEmpty_shouldEofError() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        TokeniserState.ScriptDataEscapedDash.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenScriptDataEscapedDashWithDash_shouldEmitDash() {
        CharacterReader reader = createReader("-");
        Tokeniser tokeniser = createTokeniser("-");
        TokeniserState.ScriptDataEscapedDash.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenScriptDataEscapedDashWithLessThan_shouldTransition() {
        CharacterReader reader = createReader("<");
        Tokeniser tokeniser = createTokeniser("<");
        TokeniserState.ScriptDataEscapedDash.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenScriptDataEscapedDashWithNullChar_shouldEmitReplacementChar() {
        CharacterReader reader = createReader("\u0000");
        Tokeniser tokeniser = createTokeniser("\u0000");
        TokeniserState.ScriptDataEscapedDash.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenScriptDataEscapedDashWithOtherChar_shouldEmitChar() {
        CharacterReader reader = createReader("x");
        Tokeniser tokeniser = createTokeniser("x");
        TokeniserState.ScriptDataEscapedDash.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    // =========================================================================
    // 24. ScriptDataEscapedDashDash State Tests
    // =========================================================================

    @Test
    public void read_givenScriptDataEscapedDashDashWithEmpty_shouldEofError() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        TokeniserState.ScriptDataEscapedDashDash.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenScriptDataEscapedDashDashWithDash_shouldEmitDash() {
        CharacterReader reader = createReader("-");
        Tokeniser tokeniser = createTokeniser("-");
        TokeniserState.ScriptDataEscapedDashDash.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenScriptDataEscapedDashDashWithLessThan_shouldTransition() {
        CharacterReader reader = createReader("<");
        Tokeniser tokeniser = createTokeniser("<");
        TokeniserState.ScriptDataEscapedDashDash.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenScriptDataEscapedDashDashWithGreaterThan_shouldEmitGt() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(">");
        TokeniserState.ScriptDataEscapedDashDash.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenScriptDataEscapedDashDashWithNullChar_shouldEmitReplacementChar() {
        CharacterReader reader = createReader("\u0000");
        Tokeniser tokeniser = createTokeniser("\u0000");
        TokeniserState.ScriptDataEscapedDashDash.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenScriptDataEscapedDashDashWithOther_shouldEmitChar() {
        CharacterReader reader = createReader("z");
        Tokeniser tokeniser = createTokeniser("z");
        TokeniserState.ScriptDataEscapedDashDash.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    // =========================================================================
    // 25. ScriptDataEscapedLessthanSign State Tests
    // =========================================================================

    @Test
    public void read_givenScriptDataEscapedLessthanSignWithLetter_shouldAdvance() {
        CharacterReader reader = createReader("script");
        Tokeniser tokeniser = createTokeniser("script");
        TokeniserState.ScriptDataEscapedLessthanSign.read(tokeniser, reader);
        Assert.assertEquals('c', reader.current());
    }

    @Test
    public void read_givenScriptDataEscapedLessthanSignWithSlash_shouldAdvance() {
        CharacterReader reader = createReader("/script");
        Tokeniser tokeniser = createTokeniser("/script");
        TokeniserState.ScriptDataEscapedLessthanSign.read(tokeniser, reader);
        Assert.assertEquals('s', reader.current());
    }

    @Test
    public void read_givenScriptDataEscapedLessthanSignWithOther_shouldEmitLessThan() {
        CharacterReader reader = createReader("!other");
        Tokeniser tokeniser = createTokeniser("!other");
        TokeniserState.ScriptDataEscapedLessthanSign.read(tokeniser, reader);
        Assert.assertEquals('!', reader.current());
    }

    // =========================================================================
    // 26-27. ScriptDataEscapedEndTagOpen & EndTagName State Tests
    // =========================================================================

    @Test
    public void read_givenScriptDataEscapedEndTagOpenWithLetter_shouldAdvance() {
        CharacterReader reader = createReader("script>");
        Tokeniser tokeniser = createTokeniser("script>");
        TokeniserState.ScriptDataEscapedEndTagOpen.read(tokeniser, reader);
        Assert.assertEquals('c', reader.current());
    }

    @Test
    public void read_givenScriptDataEscapedEndTagOpenWithNonLetter_shouldEmitSlash() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(">");
        TokeniserState.ScriptDataEscapedEndTagOpen.read(tokeniser, reader);
        Assert.assertEquals('>', reader.current());
    }

    @Test
    public void read_givenScriptDataEscapedEndTagNameWithLetter_shouldConsumeSequence() {
        CharacterReader reader = createReader("cript>");
        Tokeniser tokeniser = createTokeniser("cript>");
        tokeniser.createTagPending(false);
        TokeniserState.ScriptDataEscapedEndTagName.read(tokeniser, reader);
        Assert.assertEquals('>', reader.current());
    }

    @Test
    public void read_givenScriptDataEscapedEndTagNameWithWhitespace_shouldTransition() {
        CharacterReader reader = createReader(" >");
        Tokeniser tokeniser = createTokeniser(" >");
        tokeniser.createTagPending(false);
        TokeniserState.ScriptDataEscapedEndTagName.read(tokeniser, reader);
        Assert.assertEquals('>', reader.current());
    }

    @Test
    public void read_givenScriptDataEscapedEndTagNameWithSlash_shouldTransition() {
        CharacterReader reader = createReader("/>");
        Tokeniser tokeniser = createTokeniser("/>");
        tokeniser.createTagPending(false);
        TokeniserState.ScriptDataEscapedEndTagName.read(tokeniser, reader);
        Assert.assertEquals('>', reader.current());
    }

    @Test
    public void read_givenScriptDataEscapedEndTagNameWithGt_shouldEmitTag() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(">");
        tokeniser.createTagPending(false);
        TokeniserState.ScriptDataEscapedEndTagName.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenScriptDataEscapedEndTagNameWithOther_shouldEmitBuffer() {
        CharacterReader reader = createReader("@");
        Tokeniser tokeniser = createTokeniser("@");
        tokeniser.createTagPending(false);
        TokeniserState.ScriptDataEscapedEndTagName.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    // =========================================================================
    // 28. ScriptDataDoubleEscapeStart State Tests
    // =========================================================================

    @Test
    public void read_givenScriptDataDoubleEscapeStartWithLetter_shouldConsumeSequence() {
        CharacterReader reader = createReader("script>");
        Tokeniser tokeniser = createTokeniser("script>");
        TokeniserState.ScriptDataDoubleEscapeStart.read(tokeniser, reader);
        Assert.assertEquals('>', reader.current());
    }

    @Test
    public void read_givenScriptDataDoubleEscapeStartWithScriptAndGt_shouldTransitionDoubleEscaped() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(">");
        tokeniser.createTempBuffer();
        tokeniser.dataBuffer.append("script");
        TokeniserState.ScriptDataDoubleEscapeStart.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenScriptDataDoubleEscapeStartWithOtherBufferAndGt_shouldTransitionEscaped() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(">");
        tokeniser.createTempBuffer();
        tokeniser.dataBuffer.append("notscript");
        TokeniserState.ScriptDataDoubleEscapeStart.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenScriptDataDoubleEscapeStartWithUnconsumedOther_shouldUnconsume() {
        CharacterReader reader = createReader("?");
        Tokeniser tokeniser = createTokeniser("?");
        TokeniserState.ScriptDataDoubleEscapeStart.read(tokeniser, reader);
        Assert.assertEquals('?', reader.current());
    }

    // =========================================================================
    // 29-33. ScriptDataDoubleEscaped Series State Tests
    // =========================================================================

    @Test
    public void read_givenScriptDataDoubleEscapedWithDash_shouldAdvance() {
        CharacterReader reader = createReader("-");
        Tokeniser tokeniser = createTokeniser("-");
        TokeniserState.ScriptDataDoubleEscaped.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenScriptDataDoubleEscapedWithLessThan_shouldAdvance() {
        CharacterReader reader = createReader("<");
        Tokeniser tokeniser = createTokeniser("<");
        TokeniserState.ScriptDataDoubleEscaped.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenScriptDataDoubleEscapedWithNullChar_shouldEmitReplacementChar() {
        CharacterReader reader = createReader("\u0000");
        Tokeniser tokeniser = createTokeniser("\u0000");
        TokeniserState.ScriptDataDoubleEscaped.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenScriptDataDoubleEscapedWithEof_shouldEofError() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        TokeniserState.ScriptDataDoubleEscaped.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenScriptDataDoubleEscapedWithText_shouldEmitData() {
        CharacterReader reader = createReader("some content-");
        Tokeniser tokeniser = createTokeniser("some content-");
        TokeniserState.ScriptDataDoubleEscaped.read(tokeniser, reader);
        Assert.assertEquals('-', reader.current());
    }

    @Test
    public void read_givenScriptDataDoubleEscapedDashWithDash_shouldTransition() {
        CharacterReader reader = createReader("-");
        Tokeniser tokeniser = createTokeniser("-");
        TokeniserState.ScriptDataDoubleEscapedDash.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenScriptDataDoubleEscapedDashWithLessThan_shouldTransition() {
        CharacterReader reader = createReader("<");
        Tokeniser tokeniser = createTokeniser("<");
        TokeniserState.ScriptDataDoubleEscapedDash.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenScriptDataDoubleEscapedDashWithNullChar_shouldError() {
        CharacterReader reader = createReader("\u0000");
        Tokeniser tokeniser = createTokeniser("\u0000");
        TokeniserState.ScriptDataDoubleEscapedDash.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenScriptDataDoubleEscapedDashWithEof_shouldEofError() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        TokeniserState.ScriptDataDoubleEscapedDash.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenScriptDataDoubleEscapedDashWithOther_shouldEmitChar() {
        CharacterReader reader = createReader("a");
        Tokeniser tokeniser = createTokeniser("a");
        TokeniserState.ScriptDataDoubleEscapedDash.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenScriptDataDoubleEscapedDashDashWithDash_shouldEmitDash() {
        CharacterReader reader = createReader("-");
        Tokeniser tokeniser = createTokeniser("-");
        TokeniserState.ScriptDataDoubleEscapedDashDash.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenScriptDataDoubleEscapedDashDashWithLessThan_shouldTransition() {
        CharacterReader reader = createReader("<");
        Tokeniser tokeniser = createTokeniser("<");
        TokeniserState.ScriptDataDoubleEscapedDashDash.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenScriptDataDoubleEscapedDashDashWithGt_shouldTransition() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(">");
        TokeniserState.ScriptDataDoubleEscapedDashDash.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenScriptDataDoubleEscapedDashDashWithNullChar_shouldError() {
        CharacterReader reader = createReader("\u0000");
        Tokeniser tokeniser = createTokeniser("\u0000");
        TokeniserState.ScriptDataDoubleEscapedDashDash.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenScriptDataDoubleEscapedDashDashWithEof_shouldEofError() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        TokeniserState.ScriptDataDoubleEscapedDashDash.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenScriptDataDoubleEscapedDashDashWithOther_shouldEmitChar() {
        CharacterReader reader = createReader("b");
        Tokeniser tokeniser = createTokeniser("b");
        TokeniserState.ScriptDataDoubleEscapedDashDash.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenScriptDataDoubleEscapedLessthanSignWithSlash_shouldAdvance() {
        CharacterReader reader = createReader("/script");
        Tokeniser tokeniser = createTokeniser("/script");
        TokeniserState.ScriptDataDoubleEscapedLessthanSign.read(tokeniser, reader);
        Assert.assertEquals('s', reader.current());
    }

    @Test
    public void read_givenScriptDataDoubleEscapedLessthanSignWithoutSlash_shouldTransition() {
        CharacterReader reader = createReader("script");
        Tokeniser tokeniser = createTokeniser("script");
        TokeniserState.ScriptDataDoubleEscapedLessthanSign.read(tokeniser, reader);
        Assert.assertEquals('s', reader.current());
    }

    @Test
    public void read_givenScriptDataDoubleEscapeEndWithLetters_shouldConsumeSequence() {
        CharacterReader reader = createReader("script>");
        Tokeniser tokeniser = createTokeniser("script>");
        tokeniser.createTempBuffer();
        TokeniserState.ScriptDataDoubleEscapeEnd.read(tokeniser, reader);
        Assert.assertEquals('>', reader.current());
    }

    @Test
    public void read_givenScriptDataDoubleEscapeEndWithScriptAndGt_shouldTransitionEscaped() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(">");
        tokeniser.createTempBuffer();
        tokeniser.dataBuffer.append("script");
        TokeniserState.ScriptDataDoubleEscapeEnd.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenScriptDataDoubleEscapeEndWithOtherAndGt_shouldTransitionDoubleEscaped() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(">");
        tokeniser.createTempBuffer();
        tokeniser.dataBuffer.append("other");
        TokeniserState.ScriptDataDoubleEscapeEnd.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenScriptDataDoubleEscapeEndWithUnconsumedOther_shouldUnconsume() {
        CharacterReader reader = createReader("?");
        Tokeniser tokeniser = createTokeniser("?");
        TokeniserState.ScriptDataDoubleEscapeEnd.read(tokeniser, reader);
        Assert.assertEquals('?', reader.current());
    }

    // =========================================================================
    // 34. BeforeAttributeName State Tests
    // =========================================================================

    @Test
    public void read_givenBeforeAttributeNameWithWhitespace_shouldConsumeWhitespace() {
        CharacterReader reader = createReader("  class='test'");
        Tokeniser tokeniser = createTokeniser("  class='test'");
        tokeniser.createTagPending(true);
        TokeniserState.BeforeAttributeName.read(tokeniser, reader);
        Assert.assertEquals(' ', reader.current());
    }

    @Test
    public void read_givenBeforeAttributeNameWithSlash_shouldTransition() {
        CharacterReader reader = createReader("/>");
        Tokeniser tokeniser = createTokeniser("/>");
        tokeniser.createTagPending(true);
        TokeniserState.BeforeAttributeName.read(tokeniser, reader);
        Assert.assertEquals('>', reader.current());
    }

    @Test
    public void read_givenBeforeAttributeNameWithGt_shouldEmitTag() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(">");
        tokeniser.createTagPending(true);
        TokeniserState.BeforeAttributeName.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenBeforeAttributeNameWithNullChar_shouldErrorAndUnconsume() {
        CharacterReader reader = createReader("\u0000attr");
        Tokeniser tokeniser = createTokeniser("\u0000attr");
        tokeniser.createTagPending(true);
        TokeniserState.BeforeAttributeName.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenBeforeAttributeNameWithEof_shouldEofError() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        tokeniser.createTagPending(true);
        TokeniserState.BeforeAttributeName.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenBeforeAttributeNameWithQuotesOrEquals_shouldErrorAndAppend() {
        CharacterReader reader = createReader("\"attr");
        Tokeniser tokeniser = createTokeniser("\"attr");
        tokeniser.createTagPending(true);
        TokeniserState.BeforeAttributeName.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenBeforeAttributeNameWithStandardAttribute_shouldUnconsumeAndTransition() {
        CharacterReader reader = createReader("class='test'");
        Tokeniser tokeniser = createTokeniser("class='test'");
        tokeniser.createTagPending(true);
        TokeniserState.BeforeAttributeName.read(tokeniser, reader);
        Assert.assertEquals('c', reader.current());
    }

    // =========================================================================
    // 35. AttributeName State Tests
    // =========================================================================

    @Test
    public void read_givenAttributeNameWithWhitespace_shouldTransitionToAfter() {
        CharacterReader reader = createReader("class = 'test'");
        Tokeniser tokeniser = createTokeniser("class = 'test'");
        tokeniser.createTagPending(true);
        tokeniser.tagPending.newAttribute();
        TokeniserState.AttributeName.read(tokeniser, reader);
        Assert.assertEquals('=', reader.current());
    }

    @Test
    public void read_givenAttributeNameWithSlash_shouldTransitionToSelfClosing() {
        CharacterReader reader = createReader("disabled/>");
        Tokeniser tokeniser = createTokeniser("disabled/>");
        tokeniser.createTagPending(true);
        tokeniser.tagPending.newAttribute();
        TokeniserState.AttributeName.read(tokeniser, reader);
        Assert.assertEquals('>', reader.current());
    }

    @Test
    public void read_givenAttributeNameWithEquals_shouldTransitionToBeforeValue() {
        CharacterReader reader = createReader("id=val");
        Tokeniser tokeniser = createTokeniser("id=val");
        tokeniser.createTagPending(true);
        tokeniser.tagPending.newAttribute();
        TokeniserState.AttributeName.read(tokeniser, reader);
        Assert.assertEquals('v', reader.current());
    }

    @Test
    public void read_givenAttributeNameWithGt_shouldEmitTag() {
        CharacterReader reader = createReader("hidden>");
        Tokeniser tokeniser = createTokeniser("hidden>");
        tokeniser.createTagPending(true);
        tokeniser.tagPending.newAttribute();
        TokeniserState.AttributeName.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenAttributeNameWithNullChar_shouldErrorAndAppendReplacement() {
        CharacterReader reader = createReader("attr\u0000");
        Tokeniser tokeniser = createTokeniser("attr\u0000");
        tokeniser.createTagPending(true);
        tokeniser.tagPending.newAttribute();
        TokeniserState.AttributeName.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenAttributeNameWithEof_shouldEofError() {
        CharacterReader reader = createReader("attr");
        Tokeniser tokeniser = createTokeniser("attr");
        tokeniser.createTagPending(true);
        tokeniser.tagPending.newAttribute();
        TokeniserState.AttributeName.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenAttributeNameWithQuotesOrLessThan_shouldErrorAndAppend() {
        CharacterReader reader = createReader("attr\"extra");
        Tokeniser tokeniser = createTokeniser("attr\"extra");
        tokeniser.createTagPending(true);
        tokeniser.tagPending.newAttribute();
        TokeniserState.AttributeName.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    // =========================================================================
    // 36. AfterAttributeName State Tests
    // =========================================================================

    @Test
    public void read_givenAfterAttributeNameWithWhitespace_shouldIgnore() {
        CharacterReader reader = createReader("  =");
        Tokeniser tokeniser = createTokeniser("  =");
        tokeniser.createTagPending(true);
        TokeniserState.AfterAttributeName.read(tokeniser, reader);
        Assert.assertEquals(' ', reader.current());
    }

    @Test
    public void read_givenAfterAttributeNameWithSlash_shouldTransition() {
        CharacterReader reader = createReader("/>");
        Tokeniser tokeniser = createTokeniser("/>");
        tokeniser.createTagPending(true);
        TokeniserState.AfterAttributeName.read(tokeniser, reader);
        Assert.assertEquals('>', reader.current());
    }

    @Test
    public void read_givenAfterAttributeNameWithEquals_shouldTransition() {
        CharacterReader reader = createReader("=value");
        Tokeniser tokeniser = createTokeniser("=value");
        tokeniser.createTagPending(true);
        TokeniserState.AfterAttributeName.read(tokeniser, reader);
        Assert.assertEquals('v', reader.current());
    }

    @Test
    public void read_givenAfterAttributeNameWithGt_shouldEmitTag() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(">");
        tokeniser.createTagPending(true);
        TokeniserState.AfterAttributeName.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenAfterAttributeNameWithNullChar_shouldError() {
        CharacterReader reader = createReader("\u0000");
        Tokeniser tokeniser = createTokeniser("\u0000");
        tokeniser.createTagPending(true);
        TokeniserState.AfterAttributeName.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenAfterAttributeNameWithEof_shouldEofError() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        tokeniser.createTagPending(true);
        TokeniserState.AfterAttributeName.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenAfterAttributeNameWithQuotesOrLessThan_shouldError() {
        CharacterReader reader = createReader("\"newAttr");
        Tokeniser tokeniser = createTokeniser("\"newAttr");
        tokeniser.createTagPending(true);
        TokeniserState.AfterAttributeName.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenAfterAttributeNameWithDefault_shouldNewAttributeAndUnconsume() {
        CharacterReader reader = createReader("name='val'");
        Tokeniser tokeniser = createTokeniser("name='val'");
        tokeniser.createTagPending(true);
        TokeniserState.AfterAttributeName.read(tokeniser, reader);
        Assert.assertEquals('n', reader.current());
    }

    // =========================================================================
    // 37. BeforeAttributeValue State Tests
    // =========================================================================

    @Test
    public void read_givenBeforeAttributeValueWithWhitespace_shouldIgnore() {
        CharacterReader reader = createReader("  'val'");
        Tokeniser tokeniser = createTokeniser("  'val'");
        TokeniserState.BeforeAttributeValue.read(tokeniser, reader);
        Assert.assertEquals(' ', reader.current());
    }

    @Test
    public void read_givenBeforeAttributeValueWithDoubleQuote_shouldTransition() {
        CharacterReader reader = createReader("\"val\"");
        Tokeniser tokeniser = createTokeniser("\"val\"");
        TokeniserState.BeforeAttributeValue.read(tokeniser, reader);
        Assert.assertEquals('v', reader.current());
    }

    @Test
    public void read_givenBeforeAttributeValueWithAmpersand_shouldUnconsumeAndTransition() {
        CharacterReader reader = createReader("&amp;");
        Tokeniser tokeniser = createTokeniser("&amp;");
        TokeniserState.BeforeAttributeValue.read(tokeniser, reader);
        Assert.assertEquals('&', reader.current());
    }

    @Test
    public void read_givenBeforeAttributeValueWithSingleQuote_shouldTransition() {
        CharacterReader reader = createReader("'val'");
        Tokeniser tokeniser = createTokeniser("'val'");
        TokeniserState.BeforeAttributeValue.read(tokeniser, reader);
        Assert.assertEquals('v', reader.current());
    }

    @Test
    public void read_givenBeforeAttributeValueWithNullChar_shouldError() {
        CharacterReader reader = createReader("\u0000");
        Tokeniser tokeniser = createTokeniser("\u0000");
        tokeniser.createTagPending(true);
        TokeniserState.BeforeAttributeValue.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenBeforeAttributeValueWithEof_shouldEofError() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        TokeniserState.BeforeAttributeValue.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenBeforeAttributeValueWithGt_shouldErrorAndEmit() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(">");
        tokeniser.createTagPending(true);
        TokeniserState.BeforeAttributeValue.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenBeforeAttributeValueWithDisallowedChars_shouldError() {
        CharacterReader reader = createReader("<val");
        Tokeniser tokeniser = createTokeniser("<val");
        tokeniser.createTagPending(true);
        TokeniserState.BeforeAttributeValue.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenBeforeAttributeValueWithDefault_shouldUnconsume() {
        CharacterReader reader = createReader("unquotedVal");
        Tokeniser tokeniser = createTokeniser("unquotedVal");
        tokeniser.createTagPending(true);
        TokeniserState.BeforeAttributeValue.read(tokeniser, reader);
        Assert.assertEquals('u', reader.current());
    }

    // =========================================================================
    // 38. AttributeValue_doubleQuoted State Tests
    // =========================================================================

    @Test
    public void read_givenAttributeValueDoubleQuotedWithClosingQuote_shouldTransition() {
        CharacterReader reader = createReader("val\"rest");
        Tokeniser tokeniser = createTokeniser("val\"rest");
        tokeniser.createTagPending(true);
        TokeniserState.AttributeValue_doubleQuoted.read(tokeniser, reader);
        Assert.assertEquals('r', reader.current());
    }

    @Test
    public void read_givenAttributeValueDoubleQuotedWithAmpersand_shouldResolveReference() {
        CharacterReader reader = createReader("val&amp;");
        Tokeniser tokeniser = createTokeniser("val&amp;");
        tokeniser.createTagPending(true);
        TokeniserState.AttributeValue_doubleQuoted.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenAttributeValueDoubleQuotedWithNullChar_shouldError() {
        CharacterReader reader = createReader("val\u0000");
        Tokeniser tokeniser = createTokeniser("val\u0000");
        tokeniser.createTagPending(true);
        TokeniserState.AttributeValue_doubleQuoted.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenAttributeValueDoubleQuotedWithEof_shouldEofError() {
        CharacterReader reader = createReader("val");
        Tokeniser tokeniser = createTokeniser("val");
        tokeniser.createTagPending(true);
        TokeniserState.AttributeValue_doubleQuoted.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    // =========================================================================
    // 39. AttributeValue_singleQuoted State Tests
    // =========================================================================

    @Test
    public void read_givenAttributeValueSingleQuotedWithClosingQuote_shouldTransition() {
        CharacterReader reader = createReader("val'rest");
        Tokeniser tokeniser = createTokeniser("val'rest");
        tokeniser.createTagPending(true);
        TokeniserState.AttributeValue_singleQuoted.read(tokeniser, reader);
        Assert.assertEquals('r', reader.current());
    }

    @Test
    public void read_givenAttributeValueSingleQuotedWithAmpersand_shouldResolveReference() {
        CharacterReader reader = createReader("val&amp;");
        Tokeniser tokeniser = createTokeniser("val&amp;");
        tokeniser.createTagPending(true);
        TokeniserState.AttributeValue_singleQuoted.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenAttributeValueSingleQuotedWithNullChar_shouldError() {
        CharacterReader reader = createReader("val\u0000");
        Tokeniser tokeniser = createTokeniser("val\u0000");
        tokeniser.createTagPending(true);
        TokeniserState.AttributeValue_singleQuoted.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenAttributeValueSingleQuotedWithEof_shouldEofError() {
        CharacterReader reader = createReader("val");
        Tokeniser tokeniser = createTokeniser("val");
        tokeniser.createTagPending(true);
        TokeniserState.AttributeValue_singleQuoted.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    // =========================================================================
    // 40. AttributeValue_unquoted State Tests
    // =========================================================================

    @Test
    public void read_givenAttributeValueUnquotedWithWhitespace_shouldTransition() {
        CharacterReader reader = createReader("val class='x'");
        Tokeniser tokeniser = createTokeniser("val class='x'");
        tokeniser.createTagPending(true);
        TokeniserState.AttributeValue_unquoted.read(tokeniser, reader);
        Assert.assertEquals('c', reader.current());
    }

    @Test
    public void read_givenAttributeValueUnquotedWithAmpersand_shouldResolveRef() {
        CharacterReader reader = createReader("val&amp;");
        Tokeniser tokeniser = createTokeniser("val&amp;");
        tokeniser.createTagPending(true);
        TokeniserState.AttributeValue_unquoted.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenAttributeValueUnquotedWithGt_shouldEmitTag() {
        CharacterReader reader = createReader("val>");
        Tokeniser tokeniser = createTokeniser("val>");
        tokeniser.createTagPending(true);
        TokeniserState.AttributeValue_unquoted.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenAttributeValueUnquotedWithNullChar_shouldError() {
        CharacterReader reader = createReader("val\u0000");
        Tokeniser tokeniser = createTokeniser("val\u0000");
        tokeniser.createTagPending(true);
        TokeniserState.AttributeValue_unquoted.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenAttributeValueUnquotedWithEof_shouldEofError() {
        CharacterReader reader = createReader("val");
        Tokeniser tokeniser = createTokeniser("val");
        tokeniser.createTagPending(true);
        TokeniserState.AttributeValue_unquoted.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenAttributeValueUnquotedWithDisallowedChars_shouldError() {
        CharacterReader reader = createReader("val<other");
        Tokeniser tokeniser = createTokeniser("val<other");
        tokeniser.createTagPending(true);
        TokeniserState.AttributeValue_unquoted.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    // =========================================================================
    // 41. AfterAttributeValue_quoted State Tests
    // =========================================================================

    @Test
    public void read_givenAfterAttributeValueQuotedWithWhitespace_shouldTransition() {
        CharacterReader reader = createReader(" class");
        Tokeniser tokeniser = createTokeniser(" class");
        TokeniserState.AfterAttributeValue_quoted.read(tokeniser, reader);
        Assert.assertEquals('c', reader.current());
    }

    @Test
    public void read_givenAfterAttributeValueQuotedWithSlash_shouldTransition() {
        CharacterReader reader = createReader("/>");
        Tokeniser tokeniser = createTokeniser("/>");
        TokeniserState.AfterAttributeValue_quoted.read(tokeniser, reader);
        Assert.assertEquals('>', reader.current());
    }

    @Test
    public void read_givenAfterAttributeValueQuotedWithGt_shouldEmitTag() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(">");
        tokeniser.createTagPending(true);
        TokeniserState.AfterAttributeValue_quoted.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenAfterAttributeValueQuotedWithEof_shouldEofError() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        TokeniserState.AfterAttributeValue_quoted.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenAfterAttributeValueQuotedWithDefault_shouldErrorAndUnconsume() {
        CharacterReader reader = createReader("x");
        Tokeniser tokeniser = createTokeniser("x");
        TokeniserState.AfterAttributeValue_quoted.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
        Assert.assertEquals('x', reader.current());
    }

    // =========================================================================
    // 42. SelfClosingStartTag State Tests
    // =========================================================================

    @Test
    public void read_givenSelfClosingStartTagWithGt_shouldAcknowledgeAndEmit() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(">");
        tokeniser.createTagPending(true);
        TokeniserState.SelfClosingStartTag.read(tokeniser, reader);
        Assert.assertTrue(tokeniser.tagPending.selfClosing);
    }

    @Test
    public void read_givenSelfClosingStartTagWithEof_shouldEofError() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        TokeniserState.SelfClosingStartTag.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenSelfClosingStartTagWithOther_shouldErrorAndTransition() {
        CharacterReader reader = createReader("x");
        Tokeniser tokeniser = createTokeniser("x");
        TokeniserState.SelfClosingStartTag.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    // =========================================================================
    // 43. BogusComment State Tests
    // =========================================================================

    @Test
    public void read_givenBogusComment_shouldEmitCommentAndTransition() {
        CharacterReader reader = createReader("comment data>after");
        Tokeniser tokeniser = createTokeniser("comment data>after");
        TokeniserState.BogusComment.read(tokeniser, reader);
        Assert.assertEquals('a', reader.current());
    }

    // =========================================================================
    // 44. MarkupDeclarationOpen State Tests
    // =========================================================================

    @Test
    public void read_givenMarkupDeclarationOpenWithDashes_shouldTransitionToCommentStart() {
        CharacterReader reader = createReader("-- comment -->");
        Tokeniser tokeniser = createTokeniser("-- comment -->");
        TokeniserState.MarkupDeclarationOpen.read(tokeniser, reader);
        Assert.assertEquals(' ', reader.current());
    }

    @Test
    public void read_givenMarkupDeclarationOpenWithDoctype_shouldTransitionToDoctype() {
        CharacterReader reader = createReader("DOCTYPE html>");
        Tokeniser tokeniser = createTokeniser("DOCTYPE html>");
        TokeniserState.MarkupDeclarationOpen.read(tokeniser, reader);
        Assert.assertEquals(' ', reader.current());
    }

    @Test
    public void read_givenMarkupDeclarationOpenWithCdata_shouldTransitionToCdata() {
        CharacterReader reader = createReader("[CDATA[raw cdata]]>");
        Tokeniser tokeniser = createTokeniser("[CDATA[raw cdata]]>");
        TokeniserState.MarkupDeclarationOpen.read(tokeniser, reader);
        Assert.assertEquals('r', reader.current());
    }

    @Test
    public void read_givenMarkupDeclarationOpenWithBogus_shouldErrorAndAdvance() {
        CharacterReader reader = createReader("INVALID>");
        Tokeniser tokeniser = createTokeniser("INVALID>");
        TokeniserState.MarkupDeclarationOpen.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    // =========================================================================
    // 45. CommentStart State Tests
    // =========================================================================

    @Test
    public void read_givenCommentStartWithDash_shouldTransitionToCommentStartDash() {
        CharacterReader reader = createReader("-data");
        Tokeniser tokeniser = createTokeniser("-data");
        tokeniser.createCommentPending();
        TokeniserState.CommentStart.read(tokeniser, reader);
        Assert.assertEquals('d', reader.current());
    }

    @Test
    public void read_givenCommentStartWithNullChar_shouldErrorAndAppendReplacement() {
        CharacterReader reader = createReader("\u0000data");
        Tokeniser tokeniser = createTokeniser("\u0000data");
        tokeniser.createCommentPending();
        TokeniserState.CommentStart.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenCommentStartWithGt_shouldErrorAndEmit() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(">");
        tokeniser.createCommentPending();
        TokeniserState.CommentStart.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenCommentStartWithEof_shouldEofError() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        tokeniser.createCommentPending();
        TokeniserState.CommentStart.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenCommentStartWithDefault_shouldAppendChar() {
        CharacterReader reader = createReader("abc");
        Tokeniser tokeniser = createTokeniser("abc");
        tokeniser.createCommentPending();
        TokeniserState.CommentStart.read(tokeniser, reader);
        Assert.assertEquals('b', reader.current());
    }

    // =========================================================================
    // 46. CommentStartDash State Tests
    // =========================================================================

    @Test
    public void read_givenCommentStartDashWithDash_shouldTransition() {
        CharacterReader reader = createReader("-data");
        Tokeniser tokeniser = createTokeniser("-data");
        tokeniser.createCommentPending();
        TokeniserState.CommentStartDash.read(tokeniser, reader);
        Assert.assertEquals('d', reader.current());
    }

    @Test
    public void read_givenCommentStartDashWithNullChar_shouldError() {
        CharacterReader reader = createReader("\u0000data");
        Tokeniser tokeniser = createTokeniser("\u0000data");
        tokeniser.createCommentPending();
        TokeniserState.CommentStartDash.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenCommentStartDashWithGt_shouldErrorAndEmit() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(">");
        tokeniser.createCommentPending();
        TokeniserState.CommentStartDash.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenCommentStartDashWithEof_shouldEofError() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        tokeniser.createCommentPending();
        TokeniserState.CommentStartDash.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenCommentStartDashWithDefault_shouldAppendChar() {
        CharacterReader reader = createReader("xyz");
        Tokeniser tokeniser = createTokeniser("xyz");
        tokeniser.createCommentPending();
        TokeniserState.CommentStartDash.read(tokeniser, reader);
        Assert.assertEquals('y', reader.current());
    }

    // =========================================================================
    // 47. Comment State Tests
    // =========================================================================

    @Test
    public void read_givenCommentWithDash_shouldAdvanceTransition() {
        CharacterReader reader = createReader("-rest");
        Tokeniser tokeniser = createTokeniser("-rest");
        tokeniser.createCommentPending();
        TokeniserState.Comment.read(tokeniser, reader);
        Assert.assertEquals('r', reader.current());
    }

    @Test
    public void read_givenCommentWithNullChar_shouldError() {
        CharacterReader reader = createReader("\u0000rest");
        Tokeniser tokeniser = createTokeniser("\u0000rest");
        tokeniser.createCommentPending();
        TokeniserState.Comment.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenCommentWithEof_shouldEofError() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        tokeniser.createCommentPending();
        TokeniserState.Comment.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenCommentWithText_shouldConsumeToDash() {
        CharacterReader reader = createReader("hello world-after");
        Tokeniser tokeniser = createTokeniser("hello world-after");
        tokeniser.createCommentPending();
        TokeniserState.Comment.read(tokeniser, reader);
        Assert.assertEquals('-', reader.current());
    }

    // =========================================================================
    // 48. CommentEndDash State Tests
    // =========================================================================

    @Test
    public void read_givenCommentEndDashWithDash_shouldTransitionToCommentEnd() {
        CharacterReader reader = createReader("->");
        Tokeniser tokeniser = createTokeniser("->");
        tokeniser.createCommentPending();
        TokeniserState.CommentEndDash.read(tokeniser, reader);
        Assert.assertEquals('>', reader.current());
    }

    @Test
    public void read_givenCommentEndDashWithNullChar_shouldError() {
        CharacterReader reader = createReader("\u0000");
        Tokeniser tokeniser = createTokeniser("\u0000");
        tokeniser.createCommentPending();
        TokeniserState.CommentEndDash.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenCommentEndDashWithEof_shouldEofError() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        tokeniser.createCommentPending();
        TokeniserState.CommentEndDash.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenCommentEndDashWithDefault_shouldAppend() {
        CharacterReader reader = createReader("x");
        Tokeniser tokeniser = createTokeniser("x");
        tokeniser.createCommentPending();
        TokeniserState.CommentEndDash.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    // =========================================================================
    // 49. CommentEnd State Tests
    // =========================================================================

    @Test
    public void read_givenCommentEndWithGt_shouldEmitComment() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(">");
        tokeniser.createCommentPending();
        TokeniserState.CommentEnd.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenCommentEndWithNullChar_shouldError() {
        CharacterReader reader = createReader("\u0000");
        Tokeniser tokeniser = createTokeniser("\u0000");
        tokeniser.createCommentPending();
        TokeniserState.CommentEnd.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenCommentEndWithBang_shouldTransitionToCommentEndBang() {
        CharacterReader reader = createReader("!");
        Tokeniser tokeniser = createTokeniser("!");
        tokeniser.createCommentPending();
        TokeniserState.CommentEnd.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenCommentEndWithDash_shouldErrorAndAppend() {
        CharacterReader reader = createReader("-");
        Tokeniser tokeniser = createTokeniser("-");
        tokeniser.createCommentPending();
        TokeniserState.CommentEnd.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenCommentEndWithEof_shouldEofError() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        tokeniser.createCommentPending();
        TokeniserState.CommentEnd.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenCommentEndWithDefault_shouldErrorAndAppend() {
        CharacterReader reader = createReader("a");
        Tokeniser tokeniser = createTokeniser("a");
        tokeniser.createCommentPending();
        TokeniserState.CommentEnd.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    // =========================================================================
    // 50. CommentEndBang State Tests
    // =========================================================================

    @Test
    public void read_givenCommentEndBangWithDash_shouldTransitionToCommentEndDash() {
        CharacterReader reader = createReader("->");
        Tokeniser tokeniser = createTokeniser("->");
        tokeniser.createCommentPending();
        TokeniserState.CommentEndBang.read(tokeniser, reader);
        Assert.assertEquals('>', reader.current());
    }

    @Test
    public void read_givenCommentEndBangWithGt_shouldEmitComment() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(">");
        tokeniser.createCommentPending();
        TokeniserState.CommentEndBang.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenCommentEndBangWithNullChar_shouldError() {
        CharacterReader reader = createReader("\u0000");
        Tokeniser tokeniser = createTokeniser("\u0000");
        tokeniser.createCommentPending();
        TokeniserState.CommentEndBang.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenCommentEndBangWithEof_shouldEofError() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        tokeniser.createCommentPending();
        TokeniserState.CommentEndBang.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenCommentEndBangWithDefault_shouldAppendAndTransition() {
        CharacterReader reader = createReader("x");
        Tokeniser tokeniser = createTokeniser("x");
        tokeniser.createCommentPending();
        TokeniserState.CommentEndBang.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    // =========================================================================
    // 51. Doctype State Tests
    // =========================================================================

    @Test
    public void read_givenDoctypeWithWhitespace_shouldTransitionToBeforeDoctypeName() {
        CharacterReader reader = createReader(" html>");
        Tokeniser tokeniser = createTokeniser(" html>");
        TokeniserState.Doctype.read(tokeniser, reader);
        Assert.assertEquals('h', reader.current());
    }

    @Test
    public void read_givenDoctypeWithEof_shouldEofErrorAndForceQuirks() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        TokeniserState.Doctype.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
        Assert.assertTrue(tokeniser.doctypePending.forceQuirks);
    }

    @Test
    public void read_givenDoctypeWithDefault_shouldErrorAndTransition() {
        CharacterReader reader = createReader("html>");
        Tokeniser tokeniser = createTokeniser("html>");
        TokeniserState.Doctype.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
        Assert.assertEquals('t', reader.current());
    }

    // =========================================================================
    // 52. BeforeDoctypeName State Tests
    // =========================================================================

    @Test
    public void read_givenBeforeDoctypeNameWithLetter_shouldCreateDoctypePending() {
        CharacterReader reader = createReader("html>");
        Tokeniser tokeniser = createTokeniser("html>");
        TokeniserState.BeforeDoctypeName.read(tokeniser, reader);
        Assert.assertNotNull(tokeniser.doctypePending);
    }

    @Test
    public void read_givenBeforeDoctypeNameWithWhitespace_shouldConsumeWhitespace() {
        CharacterReader reader = createReader("  html");
        Tokeniser tokeniser = createTokeniser("  html");
        TokeniserState.BeforeDoctypeName.read(tokeniser, reader);
        Assert.assertEquals(' ', reader.current());
    }

    @Test
    public void read_givenBeforeDoctypeNameWithNullChar_shouldErrorAndAppendReplacement() {
        CharacterReader reader = createReader("\u0000");
        Tokeniser tokeniser = createTokeniser("\u0000");
        TokeniserState.BeforeDoctypeName.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenBeforeDoctypeNameWithEof_shouldEofErrorAndForceQuirks() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        TokeniserState.BeforeDoctypeName.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
        Assert.assertTrue(tokeniser.doctypePending.forceQuirks);
    }

    @Test
    public void read_givenBeforeDoctypeNameWithDefaultChar_shouldAppendChar() {
        CharacterReader reader = createReader("123");
        Tokeniser tokeniser = createTokeniser("123");
        TokeniserState.BeforeDoctypeName.read(tokeniser, reader);
        Assert.assertNotNull(tokeniser.doctypePending);
    }

    // =========================================================================
    // 53. DoctypeName State Tests
    // =========================================================================

    @Test
    public void read_givenDoctypeNameWithLetters_shouldConsumeSequence() {
        CharacterReader reader = createReader("tml>");
        Tokeniser tokeniser = createTokeniser("tml>");
        tokeniser.createDoctypePending();
        TokeniserState.DoctypeName.read(tokeniser, reader);
        Assert.assertEquals('>', reader.current());
    }

    @Test
    public void read_givenDoctypeNameWithGt_shouldEmitDoctype() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(">");
        tokeniser.createDoctypePending();
        TokeniserState.DoctypeName.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenDoctypeNameWithWhitespace_shouldTransitionToAfter() {
        CharacterReader reader = createReader(" >");
        Tokeniser tokeniser = createTokeniser(" >");
        tokeniser.createDoctypePending();
        TokeniserState.DoctypeName.read(tokeniser, reader);
        Assert.assertEquals('>', reader.current());
    }

    @Test
    public void read_givenDoctypeNameWithNullChar_shouldError() {
        CharacterReader reader = createReader("\u0000");
        Tokeniser tokeniser = createTokeniser("\u0000");
        tokeniser.createDoctypePending();
        TokeniserState.DoctypeName.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenDoctypeNameWithEof_shouldEofError() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        tokeniser.createDoctypePending();
        TokeniserState.DoctypeName.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
        Assert.assertTrue(tokeniser.doctypePending.forceQuirks);
    }

    @Test
    public void read_givenDoctypeNameWithDefault_shouldAppendChar() {
        CharacterReader reader = createReader("1");
        Tokeniser tokeniser = createTokeniser("1");
        tokeniser.createDoctypePending();
        TokeniserState.DoctypeName.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    // =========================================================================
    // 54. AfterDoctypeName State Tests
    // =========================================================================

    @Test
    public void read_givenAfterDoctypeNameWithEmpty_shouldEofError() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        tokeniser.createDoctypePending();
        TokeniserState.AfterDoctypeName.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
        Assert.assertTrue(tokeniser.doctypePending.forceQuirks);
    }

    @Test
    public void read_givenAfterDoctypeNameWithWhitespace_shouldAdvance() {
        CharacterReader reader = createReader(" >");
        Tokeniser tokeniser = createTokeniser(" >");
        tokeniser.createDoctypePending();
        TokeniserState.AfterDoctypeName.read(tokeniser, reader);
        Assert.assertEquals('>', reader.current());
    }

    @Test
    public void read_givenAfterDoctypeNameWithGt_shouldEmitDoctype() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(">");
        tokeniser.createDoctypePending();
        TokeniserState.AfterDoctypeName.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenAfterDoctypeNameWithPublic_shouldTransition() {
        CharacterReader reader = createReader("PUBLIC \"-//W3C//DTD HTML 4.01//EN\">");
        Tokeniser tokeniser = createTokeniser("PUBLIC \"-//W3C//DTD HTML 4.01//EN\">");
        tokeniser.createDoctypePending();
        TokeniserState.AfterDoctypeName.read(tokeniser, reader);
        Assert.assertEquals(' ', reader.current());
    }

    @Test
    public void read_givenAfterDoctypeNameWithSystem_shouldTransition() {
        CharacterReader reader = createReader("SYSTEM \"about:legacy-compat\">");
        Tokeniser tokeniser = createTokeniser("SYSTEM \"about:legacy-compat\">");
        tokeniser.createDoctypePending();
        TokeniserState.AfterDoctypeName.read(tokeniser, reader);
        Assert.assertEquals(' ', reader.current());
    }

    @Test
    public void read_givenAfterDoctypeNameWithInvalid_shouldErrorAndBogus() {
        CharacterReader reader = createReader("BOGUS>");
        Tokeniser tokeniser = createTokeniser("BOGUS>");
        tokeniser.createDoctypePending();
        TokeniserState.AfterDoctypeName.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
        Assert.assertTrue(tokeniser.doctypePending.forceQuirks);
    }

    // =========================================================================
    // 55-58. DoctypePublicIdentifier Series State Tests
    // =========================================================================

    @Test
    public void read_givenAfterDoctypePublicKeywordWithWhitespace_shouldTransition() {
        CharacterReader reader = createReader(" \"pubId\"");
        Tokeniser tokeniser = createTokeniser(" \"pubId\"");
        TokeniserState.AfterDoctypePublicKeyword.read(tokeniser, reader);
        Assert.assertEquals('\"', reader.current());
    }

    @Test
    public void read_givenAfterDoctypePublicKeywordWithDoubleQuote_shouldError() {
        CharacterReader reader = createReader("\"pubId\"");
        Tokeniser tokeniser = createTokeniser("\"pubId\"");
        TokeniserState.AfterDoctypePublicKeyword.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenAfterDoctypePublicKeywordWithSingleQuote_shouldError() {
        CharacterReader reader = createReader("'pubId'");
        Tokeniser tokeniser = createTokeniser("'pubId'");
        TokeniserState.AfterDoctypePublicKeyword.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenAfterDoctypePublicKeywordWithGt_shouldErrorAndEmit() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(">");
        tokeniser.createDoctypePending();
        TokeniserState.AfterDoctypePublicKeyword.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
        Assert.assertTrue(tokeniser.doctypePending.forceQuirks);
    }

    @Test
    public void read_givenAfterDoctypePublicKeywordWithEof_shouldEofError() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        tokeniser.createDoctypePending();
        TokeniserState.AfterDoctypePublicKeyword.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
        Assert.assertTrue(tokeniser.doctypePending.forceQuirks);
    }

    @Test
    public void read_givenAfterDoctypePublicKeywordWithDefault_shouldErrorAndBogus() {
        CharacterReader reader = createReader("x");
        Tokeniser tokeniser = createTokeniser("x");
        tokeniser.createDoctypePending();
        TokeniserState.AfterDoctypePublicKeyword.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenBeforeDoctypePublicIdentifierWithWhitespace_shouldIgnore() {
        CharacterReader reader = createReader(" \"pubId\"");
        Tokeniser tokeniser = createTokeniser(" \"pubId\"");
        TokeniserState.BeforeDoctypePublicIdentifier.read(tokeniser, reader);
        Assert.assertEquals('\"', reader.current());
    }

    @Test
    public void read_givenBeforeDoctypePublicIdentifierWithDoubleQuote_shouldTransition() {
        CharacterReader reader = createReader("\"pubId\"");
        Tokeniser tokeniser = createTokeniser("\"pubId\"");
        TokeniserState.BeforeDoctypePublicIdentifier.read(tokeniser, reader);
        Assert.assertEquals('p', reader.current());
    }

    @Test
    public void read_givenBeforeDoctypePublicIdentifierWithSingleQuote_shouldTransition() {
        CharacterReader reader = createReader("'pubId'");
        Tokeniser tokeniser = createTokeniser("'pubId'");
        TokeniserState.BeforeDoctypePublicIdentifier.read(tokeniser, reader);
        Assert.assertEquals('p', reader.current());
    }

    @Test
    public void read_givenBeforeDoctypePublicIdentifierWithGt_shouldError() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(">");
        tokeniser.createDoctypePending();
        TokeniserState.BeforeDoctypePublicIdentifier.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenBeforeDoctypePublicIdentifierWithEof_shouldEofError() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        tokeniser.createDoctypePending();
        TokeniserState.BeforeDoctypePublicIdentifier.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenBeforeDoctypePublicIdentifierWithDefault_shouldError() {
        CharacterReader reader = createReader("bogus");
        Tokeniser tokeniser = createTokeniser("bogus");
        tokeniser.createDoctypePending();
        TokeniserState.BeforeDoctypePublicIdentifier.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenDoctypePublicIdentifierDoubleQuotedWithClosingQuote_shouldTransition() {
        CharacterReader reader = createReader("\" >");
        Tokeniser tokeniser = createTokeniser("\" >");
        tokeniser.createDoctypePending();
        TokeniserState.DoctypePublicIdentifier_doubleQuoted.read(tokeniser, reader);
        Assert.assertEquals(' ', reader.current());
    }

    @Test
    public void read_givenDoctypePublicIdentifierDoubleQuotedWithNullChar_shouldError() {
        CharacterReader reader = createReader("\u0000");
        Tokeniser tokeniser = createTokeniser("\u0000");
        tokeniser.createDoctypePending();
        TokeniserState.DoctypePublicIdentifier_doubleQuoted.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenDoctypePublicIdentifierDoubleQuotedWithGt_shouldError() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(">");
        tokeniser.createDoctypePending();
        TokeniserState.DoctypePublicIdentifier_doubleQuoted.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
        Assert.assertTrue(tokeniser.doctypePending.forceQuirks);
    }

    @Test
    public void read_givenDoctypePublicIdentifierDoubleQuotedWithEof_shouldEofError() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        tokeniser.createDoctypePending();
        TokeniserState.DoctypePublicIdentifier_doubleQuoted.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenDoctypePublicIdentifierDoubleQuotedWithDefault_shouldAppend() {
        CharacterReader reader = createReader("abc");
        Tokeniser tokeniser = createTokeniser("abc");
        tokeniser.createDoctypePending();
        TokeniserState.DoctypePublicIdentifier_doubleQuoted.read(tokeniser, reader);
        Assert.assertEquals('b', reader.current());
    }

    @Test
    public void read_givenDoctypePublicIdentifierSingleQuotedWithClosingQuote_shouldTransition() {
        CharacterReader reader = createReader("' >");
        Tokeniser tokeniser = createTokeniser("' >");
        tokeniser.createDoctypePending();
        TokeniserState.DoctypePublicIdentifier_singleQuoted.read(tokeniser, reader);
        Assert.assertEquals(' ', reader.current());
    }

    @Test
    public void read_givenDoctypePublicIdentifierSingleQuotedWithNullChar_shouldError() {
        CharacterReader reader = createReader("\u0000");
        Tokeniser tokeniser = createTokeniser("\u0000");
        tokeniser.createDoctypePending();
        TokeniserState.DoctypePublicIdentifier_singleQuoted.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenDoctypePublicIdentifierSingleQuotedWithGt_shouldError() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(">");
        tokeniser.createDoctypePending();
        TokeniserState.DoctypePublicIdentifier_singleQuoted.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenDoctypePublicIdentifierSingleQuotedWithEof_shouldEofError() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        tokeniser.createDoctypePending();
        TokeniserState.DoctypePublicIdentifier_singleQuoted.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenDoctypePublicIdentifierSingleQuotedWithDefault_shouldAppend() {
        CharacterReader reader = createReader("x");
        Tokeniser tokeniser = createTokeniser("x");
        tokeniser.createDoctypePending();
        TokeniserState.DoctypePublicIdentifier_singleQuoted.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    // =========================================================================
    // 59-60. AfterDoctypePublicIdentifier & Between Public And System
    // =========================================================================

    @Test
    public void read_givenAfterDoctypePublicIdentifierWithWhitespace_shouldTransition() {
        CharacterReader reader = createReader(" \"sysId\"");
        Tokeniser tokeniser = createTokeniser(" \"sysId\"");
        tokeniser.createDoctypePending();
        TokeniserState.AfterDoctypePublicIdentifier.read(tokeniser, reader);
        Assert.assertEquals('\"', reader.current());
    }

    @Test
    public void read_givenAfterDoctypePublicIdentifierWithGt_shouldEmit() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(">");
        tokeniser.createDoctypePending();
        TokeniserState.AfterDoctypePublicIdentifier.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenAfterDoctypePublicIdentifierWithDoubleQuote_shouldError() {
        CharacterReader reader = createReader("\"sysId\"");
        Tokeniser tokeniser = createTokeniser("\"sysId\"");
        tokeniser.createDoctypePending();
        TokeniserState.AfterDoctypePublicIdentifier.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenAfterDoctypePublicIdentifierWithSingleQuote_shouldError() {
        CharacterReader reader = createReader("'sysId'");
        Tokeniser tokeniser = createTokeniser("'sysId'");
        tokeniser.createDoctypePending();
        TokeniserState.AfterDoctypePublicIdentifier.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenAfterDoctypePublicIdentifierWithEof_shouldEofError() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        tokeniser.createDoctypePending();
        TokeniserState.AfterDoctypePublicIdentifier.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenAfterDoctypePublicIdentifierWithDefault_shouldError() {
        CharacterReader reader = createReader("bogus");
        Tokeniser tokeniser = createTokeniser("bogus");
        tokeniser.createDoctypePending();
        TokeniserState.AfterDoctypePublicIdentifier.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenBetweenPublicAndSystemWithWhitespace_shouldIgnore() {
        CharacterReader reader = createReader("  \"sysId\"");
        Tokeniser tokeniser = createTokeniser("  \"sysId\"");
        TokeniserState.BetweenDoctypePublicAndSystemIdentifiers.read(tokeniser, reader);
        Assert.assertEquals(' ', reader.current());
    }

    @Test
    public void read_givenBetweenPublicAndSystemWithGt_shouldEmit() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(">");
        tokeniser.createDoctypePending();
        TokeniserState.BetweenDoctypePublicAndSystemIdentifiers.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenBetweenPublicAndSystemWithDoubleQuote_shouldError() {
        CharacterReader reader = createReader("\"sysId\"");
        Tokeniser tokeniser = createTokeniser("\"sysId\"");
        TokeniserState.BetweenDoctypePublicAndSystemIdentifiers.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenBetweenPublicAndSystemWithSingleQuote_shouldError() {
        CharacterReader reader = createReader("'sysId'");
        Tokeniser tokeniser = createTokeniser("'sysId'");
        TokeniserState.BetweenDoctypePublicAndSystemIdentifiers.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenBetweenPublicAndSystemWithEof_shouldEofError() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        tokeniser.createDoctypePending();
        TokeniserState.BetweenDoctypePublicAndSystemIdentifiers.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenBetweenPublicAndSystemWithDefault_shouldError() {
        CharacterReader reader = createReader("bogus");
        Tokeniser tokeniser = createTokeniser("bogus");
        tokeniser.createDoctypePending();
        TokeniserState.BetweenDoctypePublicAndSystemIdentifiers.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    // =========================================================================
    // 61-65. DoctypeSystemIdentifier Series State Tests
    // =========================================================================

    @Test
    public void read_givenAfterDoctypeSystemKeywordWithWhitespace_shouldTransition() {
        CharacterReader reader = createReader(" \"sysId\"");
        Tokeniser tokeniser = createTokeniser(" \"sysId\"");
        TokeniserState.AfterDoctypeSystemKeyword.read(tokeniser, reader);
        Assert.assertEquals('\"', reader.current());
    }

    @Test
    public void read_givenAfterDoctypeSystemKeywordWithGt_shouldError() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(">");
        tokeniser.createDoctypePending();
        TokeniserState.AfterDoctypeSystemKeyword.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenAfterDoctypeSystemKeywordWithDoubleQuote_shouldError() {
        CharacterReader reader = createReader("\"sysId\"");
        Tokeniser tokeniser = createTokeniser("\"sysId\"");
        TokeniserState.AfterDoctypeSystemKeyword.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenAfterDoctypeSystemKeywordWithSingleQuote_shouldError() {
        CharacterReader reader = createReader("'sysId'");
        Tokeniser tokeniser = createTokeniser("'sysId'");
        TokeniserState.AfterDoctypeSystemKeyword.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenAfterDoctypeSystemKeywordWithEof_shouldEofError() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        tokeniser.createDoctypePending();
        TokeniserState.AfterDoctypeSystemKeyword.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenAfterDoctypeSystemKeywordWithDefault_shouldErrorAndEmit() {
        CharacterReader reader = createReader("bogus");
        Tokeniser tokeniser = createTokeniser("bogus");
        tokeniser.createDoctypePending();
        TokeniserState.AfterDoctypeSystemKeyword.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenBeforeDoctypeSystemIdentifierWithWhitespace_shouldIgnore() {
        CharacterReader reader = createReader(" \"sysId\"");
        Tokeniser tokeniser = createTokeniser(" \"sysId\"");
        TokeniserState.BeforeDoctypeSystemIdentifier.read(tokeniser, reader);
        Assert.assertEquals('\"', reader.current());
    }

    @Test
    public void read_givenBeforeDoctypeSystemIdentifierWithDoubleQuote_shouldTransition() {
        CharacterReader reader = createReader("\"sysId\"");
        Tokeniser tokeniser = createTokeniser("\"sysId\"");
        TokeniserState.BeforeDoctypeSystemIdentifier.read(tokeniser, reader);
        Assert.assertEquals('s', reader.current());
    }

    @Test
    public void read_givenBeforeDoctypeSystemIdentifierWithSingleQuote_shouldTransition() {
        CharacterReader reader = createReader("'sysId'");
        Tokeniser tokeniser = createTokeniser("'sysId'");
        TokeniserState.BeforeDoctypeSystemIdentifier.read(tokeniser, reader);
        Assert.assertEquals('s', reader.current());
    }

    @Test
    public void read_givenBeforeDoctypeSystemIdentifierWithGt_shouldError() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(">");
        tokeniser.createDoctypePending();
        TokeniserState.BeforeDoctypeSystemIdentifier.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenBeforeDoctypeSystemIdentifierWithEof_shouldEofError() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        tokeniser.createDoctypePending();
        TokeniserState.BeforeDoctypeSystemIdentifier.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenBeforeDoctypeSystemIdentifierWithDefault_shouldError() {
        CharacterReader reader = createReader("bogus");
        Tokeniser tokeniser = createTokeniser("bogus");
        tokeniser.createDoctypePending();
        TokeniserState.BeforeDoctypeSystemIdentifier.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenDoctypeSystemIdentifierDoubleQuotedWithClosingQuote_shouldTransition() {
        CharacterReader reader = createReader("\" >");
        Tokeniser tokeniser = createTokeniser("\" >");
        TokeniserState.DoctypeSystemIdentifier_doubleQuoted.read(tokeniser, reader);
        Assert.assertEquals(' ', reader.current());
    }

    @Test
    public void read_givenDoctypeSystemIdentifierDoubleQuotedWithNullChar_shouldError() {
        CharacterReader reader = createReader("\u0000");
        Tokeniser tokeniser = createTokeniser("\u0000");
        tokeniser.createDoctypePending();
        TokeniserState.DoctypeSystemIdentifier_doubleQuoted.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenDoctypeSystemIdentifierDoubleQuotedWithGt_shouldError() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(">");
        tokeniser.createDoctypePending();
        TokeniserState.DoctypeSystemIdentifier_doubleQuoted.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenDoctypeSystemIdentifierDoubleQuotedWithEof_shouldEofError() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        tokeniser.createDoctypePending();
        TokeniserState.DoctypeSystemIdentifier_doubleQuoted.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenDoctypeSystemIdentifierDoubleQuotedWithDefault_shouldAppend() {
        CharacterReader reader = createReader("x");
        Tokeniser tokeniser = createTokeniser("x");
        tokeniser.createDoctypePending();
        TokeniserState.DoctypeSystemIdentifier_doubleQuoted.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenDoctypeSystemIdentifierSingleQuotedWithClosingQuote_shouldTransition() {
        CharacterReader reader = createReader("' >");
        Tokeniser tokeniser = createTokeniser("' >");
        TokeniserState.DoctypeSystemIdentifier_singleQuoted.read(tokeniser, reader);
        Assert.assertEquals(' ', reader.current());
    }

    @Test
    public void read_givenDoctypeSystemIdentifierSingleQuotedWithNullChar_shouldError() {
        CharacterReader reader = createReader("\u0000");
        Tokeniser tokeniser = createTokeniser("\u0000");
        tokeniser.createDoctypePending();
        TokeniserState.DoctypeSystemIdentifier_singleQuoted.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenDoctypeSystemIdentifierSingleQuotedWithGt_shouldError() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(">");
        tokeniser.createDoctypePending();
        TokeniserState.DoctypeSystemIdentifier_singleQuoted.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenDoctypeSystemIdentifierSingleQuotedWithEof_shouldEofError() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        tokeniser.createDoctypePending();
        TokeniserState.DoctypeSystemIdentifier_singleQuoted.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenDoctypeSystemIdentifierSingleQuotedWithDefault_shouldAppend() {
        CharacterReader reader = createReader("y");
        Tokeniser tokeniser = createTokeniser("y");
        tokeniser.createDoctypePending();
        TokeniserState.DoctypeSystemIdentifier_singleQuoted.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenAfterDoctypeSystemIdentifierWithWhitespace_shouldIgnore() {
        CharacterReader reader = createReader(" >");
        Tokeniser tokeniser = createTokeniser(" >");
        tokeniser.createDoctypePending();
        TokeniserState.AfterDoctypeSystemIdentifier.read(tokeniser, reader);
        Assert.assertEquals('>', reader.current());
    }

    @Test
    public void read_givenAfterDoctypeSystemIdentifierWithGt_shouldEmit() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(">");
        tokeniser.createDoctypePending();
        TokeniserState.AfterDoctypeSystemIdentifier.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenAfterDoctypeSystemIdentifierWithEof_shouldEofError() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        tokeniser.createDoctypePending();
        TokeniserState.AfterDoctypeSystemIdentifier.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    @Test
    public void read_givenAfterDoctypeSystemIdentifierWithDefault_shouldError() {
        CharacterReader reader = createReader("bogus");
        Tokeniser tokeniser = createTokeniser("bogus");
        tokeniser.createDoctypePending();
        TokeniserState.AfterDoctypeSystemIdentifier.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.getErrors().isEmpty());
    }

    // =========================================================================
    // 66. BogusDoctype State Tests
    // =========================================================================

    @Test
    public void read_givenBogusDoctypeWithGt_shouldEmitAndTransition() {
        CharacterReader reader = createReader(">");
        Tokeniser tokeniser = createTokeniser(">");
        tokeniser.createDoctypePending();
        TokeniserState.BogusDoctype.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenBogusDoctypeWithEof_shouldEmitAndTransition() {
        CharacterReader reader = createReader("");
        Tokeniser tokeniser = createTokeniser("");
        tokeniser.createDoctypePending();
        TokeniserState.BogusDoctype.read(tokeniser, reader);
        Assert.assertTrue(reader.isEmpty());
    }

    @Test
    public void read_givenBogusDoctypeWithDefault_shouldConsumeAndContinue() {
        CharacterReader reader = createReader("chars>");
        Tokeniser tokeniser = createTokeniser("chars>");
        tokeniser.createDoctypePending();
        TokeniserState.BogusDoctype.read(tokeniser, reader);
        Assert.assertEquals('h', reader.current());
    }

    // =========================================================================
    // 67. CdataSection State Tests
    // =========================================================================

    @Test
    public void read_givenCdataSection_shouldConsumeAndTransition() {
        CharacterReader reader = createReader("some <cdata> content]]>after");
        Tokeniser tokeniser = createTokeniser("some <cdata> content]]>after");
        TokeniserState.CdataSection.read(tokeniser, reader);
        Assert.assertEquals('a', reader.current());
    }

    // =========================================================================
    // Enum Values & ValueOf Verification
    // =========================================================================

    @Test
    public void enumMethods_givenTokeniserState_shouldSupportValuesAndValueOf() {
        TokeniserState[] states = TokeniserState.values();
        Assert.assertNotNull(states);
        Assert.assertTrue(states.length >= 67);

        TokeniserState dataState = TokeniserState.valueOf("Data");
        Assert.assertEquals(TokeniserState.Data, dataState);
    }
}