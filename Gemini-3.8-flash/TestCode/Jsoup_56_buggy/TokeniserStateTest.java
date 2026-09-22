package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

public class TokeniserStateTest {

    private Tokeniser createTokeniser(CharacterReader reader, ParseErrorList errors) {
        return new Tokeniser(reader, errors);
    }

    private Tokeniser createTokeniser(String input, ParseErrorList errors) {
        return new Tokeniser(new CharacterReader(input), errors);
    }

    private Tokeniser createTokeniser(String input) {
        return new Tokeniser(new CharacterReader(input), ParseErrorList.tracking(100));
    }

    private CharacterReader createReader(String input) {
        return new CharacterReader(input);
    }

    @Test
    public void read_givenDataWithAmpersand_shouldAdvanceTransitionToCharacterReferenceInData() {
        CharacterReader r = createReader("&");
        Tokeniser t = createTokeniser(r, ParseErrorList.tracking(10));

        TokeniserState.Data.read(t, r);

        assertEquals(TokeniserState.CharacterReferenceInData, t.getState());
    }

    @Test
    public void read_givenDataWithLessThan_shouldAdvanceTransitionToTagOpen() {
        CharacterReader r = createReader("<");
        Tokeniser t = createTokeniser(r, ParseErrorList.tracking(10));

        TokeniserState.Data.read(t, r);

        assertEquals(TokeniserState.TagOpen, t.getState());
    }

    @Test
    public void read_givenDataWithNullChar_shouldRecordErrorAndEmit() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        CharacterReader r = createReader("\u0000");
        Tokeniser t = createTokeniser(r, errors);

        TokeniserState.Data.read(t, r);

        assertEquals(1, errors.size());
    }

    @Test
    public void read_givenDataWithEof_shouldEmitEofToken() {
        CharacterReader r = createReader("");
        Tokeniser t = createTokeniser(r, ParseErrorList.tracking(10));

        TokeniserState.Data.read(t, r);

        Token token = t.read();
        assertNotNull(token);
        assertTrue(token.isEOF());
    }

    @Test
    public void read_givenDataWithPlainText_shouldEmitData() {
        CharacterReader r = createReader("Hello World");
        Tokeniser t = createTokeniser(r, ParseErrorList.tracking(10));

        TokeniserState.Data.read(t, r);

        Token token = t.read();
        assertNotNull(token);
        assertTrue(token.isCharacter());
        assertEquals("Hello World", ((Token.Character) token).getData());
    }

    @Test
    public void read_givenCharacterReferenceInData_shouldReadCharRefAndTransitionToData() {
        CharacterReader r = createReader("amp;tail");
        Tokeniser t = createTokeniser(r, ParseErrorList.tracking(10));

        TokeniserState.CharacterReferenceInData.read(t, r);

        assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void read_givenCharacterReferenceInDataUnresolved_shouldEmitAmpersandAndTransitionToData() {
        CharacterReader r = createReader(" notAnEntity;");
        Tokeniser t = createTokeniser(r, ParseErrorList.tracking(10));

        TokeniserState.CharacterReferenceInData.read(t, r);

        assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void read_givenRcdataWithAmpersand_shouldAdvanceTransitionToCharacterReferenceInRcdata() {
        CharacterReader r = createReader("&");
        Tokeniser t = createTokeniser(r, ParseErrorList.tracking(10));

        TokeniserState.Rcdata.read(t, r);

        assertEquals(TokeniserState.CharacterReferenceInRcdata, t.getState());
    }

    @Test
    public void read_givenRcdataWithLessThan_shouldAdvanceTransitionToRcdataLessthanSign() {
        CharacterReader r = createReader("<");
        Tokeniser t = createTokeniser(r, ParseErrorList.tracking(10));

        TokeniserState.Rcdata.read(t, r);

        assertEquals(TokeniserState.RcdataLessthanSign, t.getState());
    }

    @Test
    public void read_givenRcdataWithNullChar_shouldRecordErrorAndAdvance() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        CharacterReader r = createReader("\u0000rest");
        Tokeniser t = createTokeniser(r, errors);

        TokeniserState.Rcdata.read(t, r);

        assertEquals(1, errors.size());
    }

    @Test
    public void read_givenRcdataWithEof_shouldEmitEofToken() {
        CharacterReader r = createReader("");
        Tokeniser t = createTokeniser(r, ParseErrorList.tracking(10));

        TokeniserState.Rcdata.read(t, r);

        Token token = t.read();
        assertNotNull(token);
        assertTrue(token.isEOF());
    }

    @Test
    public void read_givenRcdataWithContent_shouldEmitData() {
        CharacterReader r = createReader("sample content<");
        Tokeniser t = createTokeniser(r, ParseErrorList.tracking(10));

        TokeniserState.Rcdata.read(t, r);

        Token token = t.read();
        assertNotNull(token);
        assertTrue(token.isCharacter());
        assertEquals("sample content", ((Token.Character) token).getData());
    }

    @Test
    public void read_givenCharacterReferenceInRcdata_shouldReadCharRefAndTransitionToRcdata() {
        CharacterReader r = createReader("lt;content");
        Tokeniser t = createTokeniser(r, ParseErrorList.tracking(10));

        TokeniserState.CharacterReferenceInRcdata.read(t, r);

        assertEquals(TokeniserState.Rcdata, t.getState());
    }

    @Test
    public void read_givenRawtextWithLessThan_shouldAdvanceTransitionToRawtextLessthanSign() {
        CharacterReader r = createReader("<");
        Tokeniser t = createTokeniser(r, ParseErrorList.tracking(10));

        TokeniserState.Rawtext.read(t, r);

        assertEquals(TokeniserState.RawtextLessthanSign, t.getState());
    }

    @Test
    public void read_givenRawtextWithNullChar_shouldRecordErrorAndAdvance() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        CharacterReader r = createReader("\u0000raw");
        Tokeniser t = createTokeniser(r, errors);

        TokeniserState.Rawtext.read(t, r);

        assertEquals(1, errors.size());
    }

    @Test
    public void read_givenRawtextWithEof_shouldEmitEofToken() {
        CharacterReader r = createReader("");
        Tokeniser t = createTokeniser(r, ParseErrorList.tracking(10));

        TokeniserState.Rawtext.read(t, r);

        Token token = t.read();
        assertNotNull(token);
        assertTrue(token.isEOF());
    }

    @Test
    public void read_givenRawtextWithData_shouldEmitData() {
        CharacterReader r = createReader("raw data<");
        Tokeniser t = createTokeniser(r, ParseErrorList.tracking(10));

        TokeniserState.Rawtext.read(t, r);

        Token token = t.read();
        assertNotNull(token);
        assertTrue(token.isCharacter());
        assertEquals("raw data", ((Token.Character) token).getData());
    }

    @Test
    public void read_givenScriptDataWithLessThan_shouldAdvanceTransitionToScriptDataLessthanSign() {
        CharacterReader r = createReader("<");
        Tokeniser t = createTokeniser(r, ParseErrorList.tracking(10));

        TokeniserState.ScriptData.read(t, r);

        assertEquals(TokeniserState.ScriptDataLessthanSign, t.getState());
    }

    @Test
    public void read_givenScriptDataWithNullChar_shouldRecordErrorAndEmitReplacement() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        CharacterReader r = createReader("\u0000var x = 1;");
        Tokeniser t = createTokeniser(r, errors);

        TokeniserState.ScriptData.read(t, r);

        assertEquals(1, errors.size());
    }

    @Test
    public void read_givenPlaintextWithNullChar_shouldRecordErrorAndEmitReplacement() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        CharacterReader r = createReader("\u0000text");
        Tokeniser t = createTokeniser(r, errors);

        TokeniserState.PLAINTEXT.read(t, r);

        assertEquals(1, errors.size());
    }

    @Test
    public void read_givenPlaintextWithEof_shouldEmitEofToken() {
        CharacterReader r = createReader("");
        Tokeniser t = createTokeniser(r, ParseErrorList.tracking(10));

        TokeniserState.PLAINTEXT.read(t, r);

        Token token = t.read();
        assertNotNull(token);
        assertTrue(token.isEOF());
    }

    @Test
    public void read_givenPlaintextWithNormalData_shouldEmitContent() {
        CharacterReader r = createReader("just plain text");
        Tokeniser t = createTokeniser(r, ParseErrorList.tracking(10));

        TokeniserState.PLAINTEXT.read(t, r);

        Token token = t.read();
        assertNotNull(token);
        assertTrue(token.isCharacter());
        assertEquals("just plain text", ((Token.Character) token).getData());
    }

    @Test
    public void read_givenTagOpenWithExclamation_shouldAdvanceTransitionToMarkupDeclarationOpen() {
        CharacterReader r = createReader("!");
        Tokeniser t = createTokeniser(r, ParseErrorList.tracking(10));

        TokeniserState.TagOpen.read(t, r);

        assertEquals(TokeniserState.MarkupDeclarationOpen, t.getState());
    }

    @Test
    public void read_givenTagOpenWithSlash_shouldAdvanceTransitionToEndTagOpen() {
        CharacterReader r = createReader("/");
        Tokeniser t = createTokeniser(r, ParseErrorList.tracking(10));

        TokeniserState.TagOpen.read(t, r);

        assertEquals(TokeniserState.EndTagOpen, t.getState());
    }

    @Test
    public void read_givenTagOpenWithQuestion_shouldAdvanceTransitionToBogusComment() {
        CharacterReader r = createReader("?");
        Tokeniser t = createTokeniser(r, ParseErrorList.tracking(10));

        TokeniserState.TagOpen.read(t, r);

        assertEquals(TokeniserState.BogusComment, t.getState());
    }

    @Test
    public void read_givenTagOpenWithLetter_shouldCreateTagPendingAndTransitionToTagName() {
        CharacterReader r = createReader("a");
        Tokeniser t = createTokeniser(r, ParseErrorList.tracking(10));

        TokeniserState.TagOpen.read(t, r);

        assertEquals(TokeniserState.TagName, t.getState());
        assertNotNull(t.tagPending);
    }

    @Test
    public void read_givenTagOpenWithNonLetter_shouldErrorEmitLessThanAndTransitionToData() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        CharacterReader r = createReader("1");
        Tokeniser t = createTokeniser(r, errors);

        TokeniserState.TagOpen.read(t, r);

        assertEquals(TokeniserState.Data, t.getState());
        assertEquals(1, errors.size());
    }

    @Test
    public void read_givenEndTagOpenWithEmptyReader_shouldEofErrorEmitAndTransitionToData() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        CharacterReader r = createReader("");
        Tokeniser t = createTokeniser(r, errors);

        TokeniserState.EndTagOpen.read(t, r);

        assertEquals(TokeniserState.Data, t.getState());
        assertEquals(1, errors.size());
    }

    @Test
    public void read_givenEndTagOpenWithLetter_shouldCreateTagPendingAndTransitionToTagName() {
        CharacterReader r = createReader("div");
        Tokeniser t = createTokeniser(r, ParseErrorList.tracking(10));

        TokeniserState.EndTagOpen.read(t, r);

        assertEquals(TokeniserState.TagName, t.getState());
        assertNotNull(t.tagPending);
    }

    @Test
    public void read_givenEndTagOpenWithGreaterThan_shouldErrorAndAdvanceTransitionToData() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        CharacterReader r = createReader(">");
        Tokeniser t = createTokeniser(r, errors);

        TokeniserState.EndTagOpen.read(t, r);

        assertEquals(TokeniserState.Data, t.getState());
        assertEquals(1, errors.size());
    }

    @Test
    public void read_givenEndTagOpenWithInvalidCharacter_shouldErrorAndAdvanceTransitionToBogusComment() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        CharacterReader r = createReader("@");
        Tokeniser t = createTokeniser(r, errors);

        TokeniserState.EndTagOpen.read(t, r);

        assertEquals(TokeniserState.BogusComment, t.getState());
        assertEquals(1, errors.size());
    }

    @Test
    public void read_givenTagNameWithWhitespace_shouldTransitionToBeforeAttributeName() {
        CharacterReader r = createReader("div ");
        Tokeniser t = createTokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true);

        TokeniserState.TagName.read(t, r);

        assertEquals(TokeniserState.BeforeAttributeName, t.getState());
    }

    @Test
    public void read_givenTagNameWithSlash_shouldTransitionToSelfClosingStartTag() {
        CharacterReader r = createReader("div/");
        Tokeniser t = createTokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true);

        TokeniserState.TagName.read(t, r);

        assertEquals(TokeniserState.SelfClosingStartTag, t.getState());
    }

    @Test
    public void read_givenTagNameWithGreaterThan_shouldEmitTagPendingAndTransitionToData() {
        CharacterReader r = createReader("div>");
        Tokeniser t = createTokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true);

        TokeniserState.TagName.read(t, r);

        assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void read_givenTagNameWithNullChar_shouldAppendReplacementChar() {
        CharacterReader r = createReader("div\u0000");
        Tokeniser t = createTokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true);

        TokeniserState.TagName.read(t, r);

        assertNotNull(t.tagPending);
    }

    @Test
    public void read_givenTagNameWithEof_shouldRecordEofErrorAndTransitionToData() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        CharacterReader r = createReader("div");
        Tokeniser t = createTokeniser(r, errors);
        t.createTagPending(true);

        TokeniserState.TagName.read(t, r);

        assertEquals(TokeniserState.Data, t.getState());
        assertEquals(1, errors.size());
    }

    @Test
    public void read_givenRcdataLessthanSignWithSlash_shouldAdvanceTransitionToRCDATAEndTagOpen() {
        CharacterReader r = createReader("/");
        Tokeniser t = createTokeniser(r, ParseErrorList.tracking(10));

        TokeniserState.RcdataLessthanSign.read(t, r);

        assertEquals(TokeniserState.RCDATAEndTagOpen, t.getState());
    }

    @Test
    public void read_givenRcdataLessthanSignWithLetterMatchingAppropriateEndTag_shouldEmitAndTransitionToData() {
        CharacterReader r = createReader("title");
        Tokeniser t = createTokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true);
        t.tagPending.appendTagName("title");
        t.emitTagPending();

        TokeniserState.RcdataLessthanSign.read(t, r);

        assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void read_givenRcdataLessthanSignWithNonMatchingLetter_shouldEmitLessThanAndTransitionToRcdata() {
        CharacterReader r = createReader("x</title>");
        Tokeniser t = createTokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true);
        t.tagPending.appendTagName("title");
        t.emitTagPending();

        TokeniserState.RcdataLessthanSign.read(t, r);

        assertEquals(TokeniserState.Rcdata, t.getState());
    }

    @Test
    public void read_givenRCDATAEndTagOpenWithLetter_shouldAppendAndAdvanceTransitionToRCDATAEndTagName() {
        CharacterReader r = createReader("t");
        Tokeniser t = createTokeniser(r, ParseErrorList.tracking(10));
        t.createTempBuffer();

        TokeniserState.RCDATAEndTagOpen.read(t, r);

        assertEquals(TokeniserState.RCDATAEndTagName, t.getState());
    }

    @Test
    public void read_givenRCDATAEndTagOpenWithNonLetter_shouldEmitAndTransitionToRcdata() {
        CharacterReader r = createReader("1");
        Tokeniser t = createTokeniser(r, ParseErrorList.tracking(10));

        TokeniserState.RCDATAEndTagOpen.read(t, r);

        assertEquals(TokeniserState.Rcdata, t.getState());
    }

    @Test
    public void read_givenRCDATAEndTagNameWithLetter_shouldAppendLetterSequence() {
        CharacterReader r = createReader("itle");
        Tokeniser t = createTokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(false);
        t.createTempBuffer();

        TokeniserState.RCDATAEndTagName.read(t, r);

        assertEquals("itle", t.dataBuffer.toString());
    }

    @Test
    public void read_givenRCDATAEndTagNameWithAppropriateEndTagAndGreaterThan_shouldEmitTagPendingAndTransitionToData() {
        CharacterReader r = createReader(">");
        Tokeniser t = createTokeniser(r, ParseErrorList.tracking(10));
        t.createTagPending(true);
        t.tagPending.appendTagName("title");
        t.emitTagPending();