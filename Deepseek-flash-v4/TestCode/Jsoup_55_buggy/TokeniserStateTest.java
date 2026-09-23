package org.jsoup.parser;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class TokeniserStateTest {
    private Tokeniser tokeniser;
    private CharacterReader reader;
    private TokeniserState state;

    @Before
    public void setUp() {
        // Initialize with default values
        tokeniser = new Tokeniser(null, null);
        reader = new CharacterReader("");
        state = TokeniserState.Data;
    }

    @Test
    public void testDataStateReadsData() {
        TokeniserState.Data.read(tokeniser, reader);
        assertEquals("", tokeniser.getPendingData().toString());
    }

    @Test
    public void testDataStateReadsAmpersand() {
        reader = new CharacterReader("&test");
        TokeniserState.Data.read(tokeniser, reader);
        assertEquals("", tokeniser.getPendingData().toString());
        assertEquals(TokeniserState.CharacterReferenceInData, tokeniser.getCurrentState());
    }

    @Test
    public void testDataStateReadsLessThan() {
        reader = new CharacterReader("<div");
        TokeniserState.Data.read(tokeniser, reader);
        assertEquals(TokeniserState.TagOpen, tokeniser.getCurrentState());
    }

    @Test
    public void testDataStateReadsNullChar() {
        reader = new CharacterReader("\u0000test");
        TokeniserState.Data.read(tokeniser, reader);
        assertEquals("test", tokeniser.getPendingData().toString());
    }

    @Test
    public void testDataStateReadsEof() {
        reader = new CharacterReader("");
        TokeniserState.Data.read(tokeniser, reader);
        assertTrue(tokeniser.isEof());
    }

    @Test
    public void testTagOpenWithExclamation() {
        reader = new CharacterReader("!DOCTYPE");
        TokeniserState.TagOpen.read(tokeniser, reader);
        assertEquals(TokeniserState.MarkupDeclarationOpen, tokeniser.getCurrentState());
    }

    @Test
    public void testTagOpenWithSlash() {
        reader = new CharacterReader("/div");
        TokeniserState.TagOpen.read(tokeniser, reader);
        assertEquals(TokeniserState.EndTagOpen, tokeniser.getCurrentState());
    }

    @Test
    public void testTagOpenWithQuestionMark() {
        reader = new CharacterReader("?xml");
        TokeniserState.TagOpen.read(tokeniser, reader);
        assertEquals(TokeniserState.BogusComment, tokeniser.getCurrentState());
    }

    @Test
    public void testTagOpenWithLetter() {
        reader = new CharacterReader("div");
        TokeniserState.TagOpen.read(tokeniser, reader);
        assertTrue(tokeniser.isTagPending());
        assertEquals(TokeniserState.TagName, tokeniser.getCurrentState());
    }

    @Test
    public void testTagOpenWithInvalidChar() {
        reader = new CharacterReader("123");
        TokeniserState.TagOpen.read(tokeniser, reader);
        assertEquals(TokeniserState.Data, tokeniser.getCurrentState());
    }

    @Test
    public void testEndTagOpenWithEof() {
        reader = new CharacterReader("");
        TokeniserState.EndTagOpen.read(tokeniser, reader);
        assertTrue(tokeniser.isEof());
        assertTrue(tokeniser.isError());
    }

    @Test
    public void testEndTagOpenWithLetter() {
        reader = new CharacterReader("div");
        TokeniserState.EndTagOpen.read(tokeniser, reader);
        assertFalse(tokeniser.isTagPending());
        assertEquals(TokeniserState.TagName, tokeniser.getCurrentState());
    }

    @Test
    public void testEndTagOpenWithGreaterThan() {
        reader = new CharacterReader(">");
        TokeniserState.EndTagOpen.read(tokeniser, reader);
        assertEquals(TokeniserState.Data, tokeniser.getCurrentState());
    }

    @Test
    public void testEndTagOpenWithInvalidChar() {
        reader = new CharacterReader("!");
        TokeniserState.EndTagOpen.read(tokeniser, reader);
        assertTrue(tokeniser.isEof());
    }

    @Test
    public void testTagNameWithSpaces() {
        reader = new CharacterReader("div class=\"test\"");
        TokeniserState.TagName.read(tokeniser, reader);
        assertEquals("div", tokeniser.getTagPending().name());
        assertEquals(TokeniserState.BeforeAttributeName, tokeniser.getCurrentState());
    }

    @Test
    public void testTagNameWithGreaterThan() {
        reader = new CharacterReader("div>");
        TokeniserState.TagName.read(tokeniser, reader);
        assertEquals("div", tokeniser.getTagPending().name());
        assertEquals(TokeniserState.Data, tokeniser.getCurrentState());
    }

    @Test
    public void testTagNameWithNullChar() {
        reader = new CharacterReader("di\u0000v");
        TokeniserState.TagName.read(tokeniser, reader);
        assertEquals("di\u0000v", tokeniser.getTagPending().name());
    }

    @Test
    public void testTagNameWithEof() {
        reader = new CharacterReader("div");
        TokeniserState.TagName.read(tokeniser, reader);
        assertTrue(tokeniser.isEof());
    }

    @Test
    public void testCharacterReferenceInData() {
        reader = new CharacterReader("&amp;");
        TokeniserState.CharacterReferenceInData.read(tokeniser, reader);
        assertEquals(TokeniserState.Data, tokeniser.getCurrentState());
    }

    @Test
    public void testRcdataWithLessThan() {
        reader = new CharacterReader("</div>");
        TokeniserState.Rcdata.read(tokeniser, reader);
        assertEquals(TokeniserState.RcdataLessthanSign, tokeniser.getCurrentState());
    }

    @Test
    public void testRawtextWithLessThan() {
        reader = new CharacterReader("</raw>");
        TokeniserState.Rawtext.read(tokeniser, reader);
        assertEquals(TokeniserState.RawtextLessthanSign, tokeniser.getCurrentState());
    }

    @Test
    public void testScriptDataWithLessThan() {
        reader = new CharacterReader("</script>");
        TokeniserState.ScriptData.read(tokeniser, reader);
        assertEquals(TokeniserState.ScriptDataLessthanSign, tokeniser.getCurrentState());
    }

    @Test
    public void testPlaintextWithNullChar() {
        reader = new CharacterReader("\u0000");
        TokeniserState.PLAINTEXT.read(tokeniser, reader);
        assertTrue(tokeniser.isError());
    }

    @Test
    public void testRcdataLessthanSignWithSlash() {
        reader = new CharacterReader("/div");
        TokeniserState.RcdataLessthanSign.read(tokeniser, reader);
        assertEquals(TokeniserState.RCDATAEndTagOpen, tokeniser.getCurrentState());
    }

    @Test
    public void testRcdataLessthanSignWithLetter() {
        reader = new CharacterReader("div");
        tokeniser.createTempBuffer();
        TokeniserState.RcdataLessthanSign.read(tokeniser, reader);
        assertEquals(TokeniserState.RCDATAEndTagName, tokeniser.getCurrentState());
    }

    @Test
    public void testRCDATAEndTagOpen() {
        reader = new CharacterReader("div");
        TokeniserState.RCDATAEndTagOpen.read(tokeniser, reader);
        assertEquals(TokeniserState.RCDATAEndTagName, tokeniser.getCurrentState());
    }

    @Test
    public void testRCDATAEndTagNameWithLetter() {
        reader = new CharacterReader("div");
        tokeniser.dataBuffer = new StringBuilder();
        tokeniser.tagPending = new Token.Tag();
        TokeniserState.RCDATAEndTagName.read(tokeniser, reader);
        assertEquals(TokeniserState.RCDATAEndTagName, tokeniser.getCurrentState());
    }

    @Test
    public void testRawtextLessthanSign() {
        reader = new CharacterReader("/raw");
        TokeniserState.RawtextLessthanSign.read(tokeniser, reader);
        assertEquals(TokeniserState.RawtextEndTagOpen, tokeniser.getCurrentState());
    }

    @Test
    public void testScriptDataLessthanSignWithSlash() {
        reader = new CharacterReader("/script");
        TokeniserState.ScriptDataLessthanSign.read(tokeniser, reader);
        assertEquals(TokeniserState.ScriptDataEndTagOpen, tokeniser.getCurrentState());
    }

    @Test
    public void testScriptDataEscapeStartWithDash() {
        reader = new CharacterReader("-");
        TokeniserState.ScriptDataEscapeStart.read(tokeniser, reader);
        assertEquals(TokeniserState.ScriptDataEscapeStartDash, tokeniser.getCurrentState());
    }

    @Test
    public void testScriptDataEscapeStartWithOther() {
        reader = new CharacterReader("x");
        TokeniserState.ScriptDataEscapeStart.read(tokeniser, reader);
        assertEquals(TokeniserState.ScriptData, tokeniser.getCurrentState());
    }

    @Test
    public void testBeforeAttributeNameWithSlash() {
        reader = new CharacterReader("/");
        tokeniser.tagPending = new Token.Tag();
        TokeniserState.BeforeAttributeName.read(tokeniser, reader);
        assertEquals(TokeniserState.SelfClosingStartTag, tokeniser.getCurrentState());
    }

    @Test
    public void testBeforeAttributeNameWithGreaterThan() {
        reader = new CharacterReader(">");
        tokeniser.tagPending = new Token.Tag();
        TokeniserState.BeforeAttributeName.read(tokeniser, reader);
        assertEquals(TokeniserState.BeforeAttributeName, tokeniser.getCurrentState());
    }

    @Test
    public void testBeforeAttributeNameWithQuote() {
        reader = new CharacterReader("\"test\"");
        tokeniser.tagPending = new Token.Tag();
        TokeniserState.BeforeAttributeName.read(tokeniser, reader);
        assertEquals(TokeniserState.AttributeName, tokeniser.getCurrentState());
    }

    @Test
    public void testAttributeNameWithEquals() {
        reader = new CharacterReader("=");
        tokeniser.tagPending = new Token.Tag();
        tokeniser.tagPending.newAttribute();
        TokeniserState.AttributeName.read(tokeniser, reader);
        assertEquals(TokeniserState.BeforeAttributeValue, tokeniser.getCurrentState());
    }

    @Test
    public void testAttributeNameWithGreaterThan() {
        reader = new CharacterReader(">");
        tokeniser.tagPending = new Token.Tag();
        tokeniser.tagPending.newAttribute();
        TokeniserState.AttributeName.read(tokeniser, reader);
        assertEquals(TokeniserState.Data, tokeniser.getCurrentState());
    }

    @Test
    public void testAttributeNameWithSpace() {
        reader = new CharacterReader("  ");
        tokeniser.tagPending = new Token.Tag();
        tokeniser.tagPending.newAttribute();
        TokeniserState.AttributeName.read(tokeniser, reader);
        assertEquals(TokeniserState.AfterAttributeName, tokeniser.getCurrentState());
    }

    @Test
    public void testAfterAttributeNameWithSlash() {
        reader = new CharacterReader("/");
        tokeniser.tagPending = new Token.Tag();
        tokeniser.tagPending.newAttribute();
        TokeniserState.AfterAttributeName.read(tokeniser, reader);
        assertEquals(TokeniserState.SelfClosingStartTag, tokeniser.getCurrentState());
    }

    @Test
    public void testAfterAttributeNameWithEquals() {
        reader = new CharacterReader("=");
        tokeniser.tagPending = new Token.Tag();
        tokeniser.tagPending.newAttribute();
        TokeniserState.AfterAttributeName.read(tokeniser, reader);
        assertEquals(TokeniserState.BeforeAttributeValue, tokeniser.getCurrentState());
    }

    @Test
    public void testAfterAttributeNameWithGreaterThan() {
        reader = new CharacterReader(">");
        tokeniser.tagPending = new Token.Tag();
        tokeniser.tagPending.newAttribute();
        TokeniserState.AfterAttributeName.read(tokeniser, reader);
        assertEquals(TokeniserState.Data, tokeniser.getCurrentState());
    }

    @Test
    public void testAfterAttributeNameWithOther() {
        reader = new CharacterReader("=");
        tokeniser.tagPending = new Token.Tag();
        tokeniser.tagPending.newAttribute();
        TokeniserState.AfterAttributeName.read(tokeniser, reader);
        assertEquals(TokeniserState.BeforeAttributeValue, tokeniser.getCurrentState());
    }

    @Test
    public void testBeforeAttributeValueWithDoubleQuote() {
        reader = new CharacterReader("\"test\"");
        tokeniser.tagPending = new Token.Tag();
        tokeniser.tagPending.newAttribute();
        TokeniserState.BeforeAttributeValue.read(tokeniser, reader);
        assertEquals(TokeniserState.AttributeValue_doubleQuoted, tokeniser.getCurrentState());
    }

    @Test
    public void testBeforeAttributeValueWithSingleQuote() {
        reader = new CharacterReader("'test'");
        tokeniser.tagPending = new Token.Tag();
        tokeniser.tagPending.newAttribute();
        TokeniserState.BeforeAttributeValue.read(tokeniser, reader);
        assertEquals(TokeniserState.AttributeValue_singleQuoted, tokeniser.getCurrentState());
    }

    @Test
    public void testBeforeAttributeValueWithNullChar() {
        reader = new CharacterReader("test");
        tokeniser.tagPending = new Token.Tag();
        tokeniser.tagPending.newAttribute();
        TokeniserState.BeforeAttributeValue.read(tokeniser, reader);
        assertEquals(TokeniserState.AttributeValue_unquoted, tokeniser.getCurrentState());
    }

    @Test
    public void testAttributeValueDoubleQuotedWithAmp() {
        reader = new CharacterReader("&amp;");
        tokeniser.tagPending = new Token.Tag();
        tokeniser.tagPending.newAttribute();
        TokeniserState.AttributeValue_doubleQuoted.read(tokeniser, reader);
        assertEquals(TokeniserState.AttributeValue_doubleQuoted, tokeniser.getCurrentState());
    }

    @Test
    public void testAttributeValueSingleQuotedWithAmp() {
        reader = new CharacterReader("&amp;");
        tokeniser.tagPending = new Token.Tag();
        tokeniser.tagPending.newAttribute();
        TokeniserState.AttributeValue_singleQuoted.read(tokeniser, reader);
        assertEquals(TokeniserState.AttributeValue_singleQuoted, tokeniser.getCurrentState());
    }

    @Test
    public void testAfterAttributeValueQuoted() {
        reader = new CharacterReader(">");
        tokeniser.tagPending = new Token.Tag();
        tokeniser.tagPending.newAttribute();
        TokeniserState.AfterAttributeValue_quoted.read(tokeniser, reader);
        assertEquals(TokeniserState.Data, tokeniser.getCurrentState());
    }

    @Test
    public void testBogusComment() {
        reader = new CharacterReader("test>");
        TokeniserState.BogusComment.read(tokeniser, reader);
        assertEquals(TokeniserState.Data, tokeniser.getCurrentState());
    }

    @Test
    public void testMarkupDeclarationOpenWithComment() {
        reader = new CharacterReader("--test");
        TokeniserState.MarkupDeclarationOpen.read(tokeniser, reader);
        assertEquals(TokeniserState.CommentStart, tokeniser.getCurrentState());
    }

    @Test
    public void testMarkupDeclarationOpenWithDoctype() {
        reader = new CharacterReader("DOCTYPE");
        TokeniserState.MarkupDeclarationOpen.read(tokeniser, reader);
        assertEquals(TokeniserState.Doctype, tokeniser.getCurrentState());
    }

    @Test
    public void testMarkupDeclarationOpenWithCdata() {
        reader = new CharacterReader("[CDATA[");
        TokeniserState.MarkupDeclarationOpen.read(tokeniser, reader);
        assertEquals(TokeniserState.CdataSection, tokeniser.getCurrentState());
    }

    @Test
    public void testMarkupDeclarationOpenWithInvalid() {
        reader = new CharacterReader("");
        tokeniser.createCommentPending();
        TokeniserState.MarkupDeclarationOpen.read(tokeniser, reader);
        assertTrue(tokeniser.isError());
    }

    @Test
    public void testCommentStartWithDash() {
        reader = new CharacterReader("-");
        tokeniser.createCommentPending();
        TokeniserState.CommentStart.read(tokeniser, reader);
        assertEquals(TokeniserState.CommentStartDash, tokeniser.getCurrentState());
    }

    @Test
    public void testCommentStartWithGreaterThan() {
        reader = new CharacterReader(">");
        tokeniser.createCommentPending();
        TokeniserState.CommentStart.read(tokeniser, reader);
        assertEquals(TokeniserState.Data, tokeniser.getCurrentState());
    }

    @Test
    public void testCommentStartWithNullChar() {
        reader = new CharacterReader("\u0000");
        tokeniser.createCommentPending();
        TokeniserState.CommentStart.read(tokeniser, reader);
        assertTrue(tokeniser.isError());
    }

    @Test
    public void testCommentStartWithEof() {
        reader = new CharacterReader("");
        tokeniser.createCommentPending();
        TokeniserState.CommentStart.read(tokeniser, reader);
        assertTrue(tokeniser.isEof());
    }

    @Test
    public void testDoctypeWithName() {
        reader = new CharacterReader("html");
        tokeniser.createDoctypePending();
        TokeniserState.Doctype.read(tokeniser, reader);
        assertEquals("html", tokeniser.getDoctypePending().name());
    }

    @Test
    public void testDoctypeWithEof() {
        reader = new CharacterReader("");
        tokeniser.createDoctypePending();
        TokeniserState.Doctype.read(tokeniser, reader);
        assertTrue(tokeniser.isEof());
    }

    @Test
    public void testAfterDoctypeNameWithPublic() {
        reader = new CharacterReader("PUBLIC");
        tokeniser.createDoctypePending();
        TokeniserState.AfterDoctypeName.read(tokeniser, reader);
        assertEquals(TokeniserState.AfterDoctypePublicKeyword, tokeniser.getCurrentState());
    }

    @Test
    public void testAfterDoctypeNameWithSystem() {
        reader = new CharacterReader("SYSTEM");
        tokeniser.createDoctypePending();
        TokeniserState.AfterDoctypeName.read(tokeniser, reader);
        assertEquals(TokeniserState.AfterDoctypeSystemKeyword, tokeniser.getCurrentState());
    }

    @Test
    public void testAfterDoctypePublicKeywordWithDoubleQuote() {
        reader = new CharacterReader("\"test\"");
        tokeniser.createDoctypePending();
        TokeniserState.AfterDoctypePublicKeyword.read(tokeniser, reader);
        assertEquals(TokeniserState.DoctypePublicIdentifier_doubleQuoted, tokeniser.getCurrentState());
    }

    @Test
    public void testAfterDoctypeSystemKeywordWithSingleQuote() {
        reader = new CharacterReader("'test'");
        tokeniser.createDoctypePending();
        TokeniserState.AfterDoctypeSystemKeyword.read(tokeniser, reader);
        assertEquals(TokeniserState.DoctypeSystemIdentifier_singleQuoted, tokeniser.getCurrentState());
    }

    @Test
    public void testCdataSectionWithContent() {
        reader = new CharacterReader("test]]>");
        TokeniserState.CdataSection.read(tokeniser, reader);
        assertEquals(TokeniserState.Data, tokeniser.getCurrentState());
    }
}