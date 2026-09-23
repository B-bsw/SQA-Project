package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TokeniserStateTest {

    private Tokeniser tokeniser;
    private TokeniserState state;
    private CharacterReader reader;

    @Before
    public void setUp() {
        tokeniser = new Tokeniser(null, null); // Assuming Tokeniser constructor takes (Reader, ParseErrorList)
        reader = new CharacterReader("");
    }

    @After
    public void tearDown() {
        tokeniser = null;
        reader = null;
    }

    @Test
    public void testDataWithAmpersand() {
        reader = new CharacterReader("&amp;");
        tokeniser = new Tokeniser(reader, null);
        TokeniserState.Data.read(tokeniser, reader);
        assertEquals(TokeniserState.CharacterReferenceInData, tokeniser.getState());
    }

    @Test
    public void testDataWithLessThan() {
        reader = new CharacterReader("<div>");
        tokeniser = new Tokeniser(reader, null);
        TokeniserState.Data.read(tokeniser, reader);
        assertEquals(TokeniserState.TagOpen, tokeniser.getState());
    }

    @Test
    public void testDataWithNullChar() {
        reader = new CharacterReader("\u0000");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.Data);
        TokeniserState.Data.read(tokeniser, reader);
        assertTrue(tokeniser.getErrorCount() > 0);
    }

    @Test
    public void testDataWithEOF() {
        reader = new CharacterReader("");
        tokeniser = new Tokeniser(reader, null);
        TokeniserState.Data.read(tokeniser, reader);
        assertNotNull(tokeniser.getEmittedToken());
        assertTrue(tokeniser.getEmittedToken() instanceof Token.EOF);
    }

    @Test
    public void testDataWithPlainText() {
        reader = new CharacterReader("hello");
        tokeniser = new Tokeniser(reader, null);
        TokeniserState.Data.read(tokeniser, reader);
        assertEquals("hello", tokeniser.getEmittedString());
    }

    @Test
    public void testCharacterReferenceInDataWithNull() {
        reader = new CharacterReader("&;");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.CharacterReferenceInData);
        TokeniserState.CharacterReferenceInData.read(tokeniser, reader);
        assertNull(tokeniser.getConsumedCharacter());
    }

    @Test
    public void testRcdataWithLessThan() {
        reader = new CharacterReader("<");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.Rcdata);
        TokeniserState.Rcdata.read(tokeniser, reader);
        assertEquals(TokeniserState.RcdataLessthanSign, tokeniser.getState());
    }

    @Test
    public void testRawtextWithLessThan() {
        reader = new CharacterReader("<");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.Rawtext);
        TokeniserState.Rawtext.read(tokeniser, reader);
        assertEquals(TokeniserState.RawtextLessthanSign, tokeniser.getState());
    }

    @Test
    public void testScriptDataWithLessThan() {
        reader = new CharacterReader("<");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.ScriptData);
        TokeniserState.ScriptData.read(tokeniser, reader);
        assertEquals(TokeniserState.ScriptDataLessthanSign, tokeniser.getState());
    }

    @Test
    public void testPlaintextWithEOF() {
        reader = new CharacterReader("");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.PLAINTEXT);
        TokeniserState.PLAINTEXT.read(tokeniser, reader);
        assertNotNull(tokeniser.getEmittedToken());
    }

    @Test
    public void testTagOpenWithBang() {
        reader = new CharacterReader("!");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.TagOpen);
        TokeniserState.TagOpen.read(tokeniser, reader);
        assertEquals(TokeniserState.MarkupDeclarationOpen, tokeniser.getState());
    }

    @Test
    public void testTagOpenWithSlash() {
        reader = new CharacterReader("/");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.TagOpen);
        TokeniserState.TagOpen.read(tokeniser, reader);
        assertEquals(TokeniserState.EndTagOpen, tokeniser.getState());
    }

    @Test
    public void testTagOpenWithQuestionMark() {
        reader = new CharacterReader("?");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.TagOpen);
        TokeniserState.TagOpen.read(tokeniser, reader);
        assertEquals(TokeniserState.BogusComment, tokeniser.getState());
    }

    @Test
    public void testTagOpenWithLetter() {
        reader = new CharacterReader("div");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.TagOpen);
        TokeniserState.TagOpen.read(tokeniser, reader);
        assertEquals(TokeniserState.TagName, tokeniser.getState());
        assertTrue(tokeniser.isTagPending());
    }

    @Test
    public void testTagOpenWithOther() {
        reader = new CharacterReader("1");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.TagOpen);
        TokeniserState.TagOpen.read(tokeniser, reader);
        assertEquals("1", tokeniser.getEmittedString());
        assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    @Test
    public void testEndTagOpenWithEOF() {
        reader = new CharacterReader("");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.EndTagOpen);
        TokeniserState.EndTagOpen.read(tokeniser, reader);
        assertEquals("</", tokeniser.getEmittedString());
        assertTrue(tokeniser.getErrorCount() > 0);
    }

    @Test
    public void testEndTagOpenWithLetter() {
        reader = new CharacterReader("div");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.EndTagOpen);
        TokeniserState.EndTagOpen.read(tokeniser, reader);
        assertFalse(tokeniser.isTagPending());
    }

    @Test
    public void testEndTagOpenWithGreaterThan() {
        reader = new CharacterReader(">");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.EndTagOpen);
        TokeniserState.EndTagOpen.read(tokeniser, reader);
        assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    @Test
    public void testTagNameWithWhitespace() {
        reader = new CharacterReader("div ");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.TagName);
        tokeniser.createTagPending(true);
        TokeniserState.TagName.read(tokeniser, reader);
        assertEquals(TokeniserState.BeforeAttributeName, tokeniser.getState());
        assertEquals("div", tokeniser.getTagPending().name());
    }

    @Test
    public void testTagNameWithSlash() {
        reader = new CharacterReader("div/");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.TagName);
        tokeniser.createTagPending(true);
        TokeniserState.TagName.read(tokeniser, reader);
        assertEquals(TokeniserState.SelfClosingStartTag, tokeniser.getState());
    }

    @Test
    public void testTagNameWithGreaterThan() {
        reader = new CharacterReader("div>");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.TagName);
        tokeniser.createTagPending(true);
        TokeniserState.TagName.read(tokeniser, reader);
        assertTrue(tokeniser.isTagEmitted());
        assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    @Test
    public void testTagNameWithNull() {
        reader = new CharacterReader("di\u0000v");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.TagName);
        tokeniser.createTagPending(true);
        TokeniserState.TagName.read(tokeniser, reader);
        assertTrue(tokeniser.getErrorCount() > 0);
        assertEquals("di\u0000v", tokeniser.getTagPending().name());
    }

    @Test
    public void testRcdataLessthanSignWithSlash() {
        reader = new CharacterReader("/");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.RcdataLessthanSign);
        TokeniserState.RcdataLessthanSign.read(tokeniser, reader);
        assertEquals(TokeniserState.RCDATAEndTagOpen, tokeniser.getState());
    }

    @Test
    public void testRcdataLessthanSignWithLetterAndNotEnd() {
        reader = new CharacterReader("abc");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.RcdataLessthanSign);
        tokeniser.setAppropriateEndTagName("div");
        TokeniserState.RcdataLessthanSign.read(tokeniser, reader);
        assertEquals("<", tokeniser.getEmittedString());
        assertEquals(TokeniserState.Rcdata, tokeniser.getState());
    }

    @Test
    public void testRCDATAEndTagOpen() {
        reader = new CharacterReader("div");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.RCDATAEndTagOpen);
        tokeniser.setAppropriateEndTagName("div");
        tokeniser.createTagPending(false);
        TokeniserState.RCDATAEndTagOpen.read(tokeniser, reader);
        assertEquals(TokeniserState.RCDATAEndTagName, tokeniser.getState());
        assertEquals("d", tokeniser.getTagPending().name());
    }

    @Test
    public void testRCDATAEndTagNameWithEOF() {
        reader = new CharacterReader("");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.RCDATAEndTagName);
        TokeniserState.RCDATAEndTagName.read(tokeniser, reader);
        assertNotNull(tokeniser.getEmittedToken());
    }

    @Test
    public void testRawtextLessthanSignWithSlash() {
        reader = new CharacterReader("/");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.RawtextLessthanSign);
        TokeniserState.RawtextLessthanSign.read(tokeniser, reader);
        assertEquals(TokeniserState.RawtextEndTagOpen, tokeniser.getState());
    }

    @Test
    public void testRawtextEndTagOpen() {
        reader = new CharacterReader("d");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.RawtextEndTagOpen);
        tokeniser.createTagPending(false);
        TokeniserState.RawtextEndTagOpen.read(tokeniser, reader);
        assertEquals(TokeniserState.RawtextEndTagName, tokeniser.getState());
    }

    @Test
    public void testScriptDataLessthanSignWithSlash() {
        reader = new CharacterReader("/");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.ScriptDataLessthanSign);
        TokeniserState.ScriptDataLessthanSign.read(tokeniser, reader);
        assertEquals(TokeniserState.ScriptDataEndTagOpen, tokeniser.getState());
    }

    @Test
    public void testScriptDataLessthanSignWithBang() {
        reader = new CharacterReader("!");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.ScriptDataLessthanSign);
        TokeniserState.ScriptDataLessthanSign.read(tokeniser, reader);
        assertEquals(TokeniserState.ScriptDataEscapeStart, tokeniser.getState());
    }

    @Test
    public void testScriptDataEndTagOpen() {
        reader = new CharacterReader("d");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.ScriptDataEndTagOpen);
        tokeniser.createTagPending(false);
        TokeniserState.ScriptDataEndTagOpen.read(tokeniser, reader);
        assertEquals(TokeniserState.ScriptDataEndTagName, tokeniser.getState());
    }

    @Test
    public void testScriptDataEscapeStartWithDash() {
        reader = new CharacterReader("-");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.ScriptDataEscapeStart);
        TokeniserState.ScriptDataEscapeStart.read(tokeniser, reader);
        assertEquals(TokeniserState.ScriptDataEscapeStartDash, tokeniser.getState());
    }

    @Test
    public void testScriptDataEscapeStartDash() {
        reader = new CharacterReader("-");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.ScriptDataEscapeStartDash);
        TokeniserState.ScriptDataEscapeStartDash.read(tokeniser, reader);
        assertEquals(TokeniserState.ScriptDataEscapedDashDash, tokeniser.getState());
    }

    @Test
    public void testBeforeAttributeNameWithSlash() {
        reader = new CharacterReader("/");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.BeforeAttributeName);
        tokeniser.createTagPending(true);
        TokeniserState.BeforeAttributeName.read(tokeniser, reader);
        assertEquals(TokeniserState.SelfClosingStartTag, tokeniser.getState());
    }

    @Test
    public void testBeforeAttributeNameWithEquals() {
        reader = new CharacterReader("=");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.BeforeAttributeName);
        tokeniser.createTagPending(true);
        TokeniserState.BeforeAttributeName.read(tokeniser, reader);
        assertEquals("=", tokeniser.getTagPending().attrName());
        assertEquals(TokeniserState.AttributeName, tokeniser.getState());
    }

    @Test
    public void testBeforeAttributeNameWithGreaterThan() {
        reader = new CharacterReader(">");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.BeforeAttributeName);
        tokeniser.createTagPending(true);
        TokeniserState.BeforeAttributeName.read(tokeniser, reader);
        assertTrue(tokeniser.isTagEmitted());
        assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    @Test
    public void testAttributeNameWithSlash() {
        reader = new CharacterReader("id/");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.AttributeName);
        tokeniser.createTagPending(true);
        TokeniserState.AttributeName.read(tokeniser, reader);
        assertEquals("id", tokeniser.getTagPending().attrName());
        assertEquals(TokeniserState.AfterAttributeName, tokeniser.getState());
    }

    @Test
    public void testAttributeNameWithEquals() {
        reader = new CharacterReader("id=");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.AttributeName);
        tokeniser.createTagPending(true);
        TokeniserState.AttributeName.read(tokeniser, reader);
        assertEquals("id", tokeniser.getTagPending().attrName());
        assertEquals(TokeniserState.BeforeAttributeValue, tokeniser.getState());
    }

    @Test
    public void testAttributeNameWithNull() {
        reader = new CharacterReader("id\u0000v");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.AttributeName);
        tokeniser.createTagPending(true);
        TokeniserState.AttributeName.read(tokeniser, reader);
        assertTrue(tokeniser.getErrorCount() > 0);
        assertEquals("id\u0000v", tokeniser.getTagPending().attrName());
    }

    @Test
    public void testAfterAttributeNameWithSlash() {
        reader = new CharacterReader("/");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.AfterAttributeName);
        tokeniser.createTagPending(true);
        TokeniserState.AfterAttributeName.read(tokeniser, reader);
        assertEquals(TokeniserState.SelfClosingStartTag, tokeniser.getState());
    }

    @Test
    public void testBeforeAttributeValueDoubleQuote() {
        reader = new CharacterReader("\"");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.BeforeAttributeValue);
        TokeniserState.BeforeAttributeValue.read(tokeniser, reader);
        assertEquals(TokeniserState.AttributeValue_doubleQuoted, tokeniser.getState());
    }

    @Test
    public void testBeforeAttributeValueSingleQuote() {
        reader = new CharacterReader("'");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.BeforeAttributeValue);
        TokeniserState.BeforeAttributeValue.read(tokeniser, reader);
        assertEquals(TokeniserState.AttributeValue_singleQuoted, tokeniser.getState());
    }

    @Test
    public void testBeforeAttributeValueUnquoted() {
        reader = new CharacterReader("value");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.BeforeAttributeValue);
        TokeniserState.BeforeAttributeValue.read(tokeniser, reader);
        assertEquals(TokeniserState.AttributeValue_unquoted, tokeniser.getState());
    }

    @Test
    public void testAttributeValueDoubleQuotedWithAmpersand() {
        reader = new CharacterReader("&amp;");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.AttributeValue_doubleQuoted);
        tokeniser.createTagPending(true);
        TokeniserState.AttributeValue_doubleQuoted.read(tokeniser, reader);
        assertEquals("&", tokeniser.getTagPending().attrValue());
    }

    @Test
    public void testAfterAttributeValueQuoted() {
        reader = new CharacterReader("");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.AfterAttributeValue_quoted);
        TokeniserState.AfterAttributeValue_quoted.read(tokeniser, reader);
        assertNotNull(tokeniser.getState());
    }

    @Test
    public void testSelfClosingStartTag() {
        reader = new CharacterReader("");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.SelfClosingStartTag);
        tokeniser.createTagPending(true);
        TokeniserState.SelfClosingStartTag.read(tokeniser, reader);
        assertTrue(tokeniser.getTagPending().isSelfClosing());
    }

    @Test
    public void testBogusComment() {
        reader = new CharacterReader("comment");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.BogusComment);
        TokeniserState.BogusComment.read(tokeniser, reader);
        assertEquals("comment", tokeniser.getCommentPending().data.toString());
    }

    @Test
    public void testMarkupDeclarationOpenWithDoctype() {
        reader = new CharacterReader("DOCTYPE");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.MarkupDeclarationOpen);
        TokeniserState.MarkupDeclarationOpen.read(tokeniser, reader);
        assertEquals(TokeniserState.Doctype, tokeniser.getState());
    }

    @Test
    public void testMarkupDeclarationOpenWithCdata() {
        reader = new CharacterReader("[CDATA[");
        tokeniser = new Tokeniser(reader, null);
        tokeniser.setState(TokeniserState.MarkupDeclarationOpen);
        TokeniserState.MarkupDeclarationOpen.read(tokeniser, reader);
        assertEquals(TokeniserState.CdataSection, tokeniser.getState());
    }
}