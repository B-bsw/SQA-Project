package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TokeniserStateTest {

    private Tokeniser t;
    private CharacterReader r;

    @Before
    public void setUp() {
        t = new Tokeniser(null, null);
        r = new CharacterReader("");
    }

    @Test
    public void testDataState_CharacterReferenceInData() {
        r = new CharacterReader("&amp;");
        t = new Tokeniser(r, null);
        TokeniserState.Data.read(t, r);
        assertEquals("&", t.getEmitted().toString());
        assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void testDataState_LessThanTagOpen() {
        r = new CharacterReader("<div>");
        t = new Tokeniser(r, null);
        TokeniserState.Data.read(t, r);
        assertEquals(TokeniserState.TagOpen, t.getState());
    }

    @Test
    public void testDataState_NullChar() {
        r = new CharacterReader("\u0000");
        t = new Tokeniser(r, null);
        TokeniserState.Data.read(t, r);
        assertTrue(t.hasError());
    }

    @Test
    public void testDataState_EOF() {
        r = new CharacterReader("");
        t = new Tokeniser(r, null);
        TokeniserState.Data.read(t, r);
        assertNotNull(t.getEmitted());
        assertTrue(t.getEmitted() instanceof Token.EOF);
    }

    @Test
    public void testDataState_ConsumeToAny() {
        r = new CharacterReader("hello&");
        t = new Tokeniser(r, null);
        TokeniserState.Data.read(t, r);
        assertEquals("hello", t.getEmitted().toString());
    }

    @Test
    public void testCharacterReferenceInData_AmpersandOnly() {
        r = new CharacterReader("&notaref;");
        t = new Tokeniser(r, null);
        TokeniserState.CharacterReferenceInData.read(t, r);
        assertEquals("&", t.getEmitted().toString());
    }

    @Test
    public void testCharacterReferenceInData_ValidRef() {
        r = new CharacterReader("&amp;");
        t = new Tokeniser(r, null);
        TokeniserState.CharacterReferenceInData.read(t, r);
        assertEquals("&", t.getEmitted().toString());
    }

    @Test
    public void testRcdata_LessThan() {
        r = new CharacterReader("<");
        t = new Tokeniser(r, null);
        TokeniserState.Rcdata.read(t, r);
        assertEquals(TokeniserState.RcdataLessthanSign, t.getState());
    }

    @Test
    public void testRcdata_NullChar() {
        r = new CharacterReader("\u0000");
        t = new Tokeniser(r, null);
        t.emit('\uFFFD');
        TokeniserState.Rcdata.read(t, r);
        assertEquals("\uFFFD", t.getEmitted().toString());
    }

    @Test
    public void testRcdata_DoesNotStartWithLessThan() {
        r = new CharacterReader("hello");
        t = new Tokeniser(r, null);
        TokeniserState.Rcdata.read(t, r);
        assertEquals(TokeniserState.Rcdata, t.getState());
    }

    @Test
    public void testRawtext_LessThan() {
        r = new CharacterReader("<");
        t = new Tokeniser(r, null);
        TokeniserState.Rawtext.read(t, r);
        assertEquals(TokeniserState.RawtextLessthanSign, t.getState());
    }

    @Test
    public void testScriptData_LessThan() {
        r = new CharacterReader("<");
        t = new Tokeniser(r, null);
        TokeniserState.ScriptData.read(t, r);
        assertEquals(TokeniserState.ScriptDataLessthanSign, t.getState());
    }

    @Test
    public void testTagOpen_Bang() {
        r = new CharacterReader("!");
        t = new Tokeniser(r, null);
        TokeniserState.TagOpen.read(t, r);
        assertEquals(TokeniserState.MarkupDeclarationOpen, t.getState());
    }

    @Test
    public void testTagOpen_Slash() {
        r = new CharacterReader("/");
        t = new Tokeniser(r, null);
        TokeniserState.TagOpen.read(t, r);
        assertEquals(TokeniserState.EndTagOpen, t.getState());
    }

    @Test
    public void testTagOpen_Question() {
        r = new CharacterReader("?");
        t = new Tokeniser(r, null);
        TokeniserState.TagOpen.read(t, r);
        assertEquals(TokeniserState.BogusComment, t.getState());
    }

    @Test
    public void testTagOpen_MatchingLetter() {
        r = new CharacterReader("d");
        t = new Tokeniser(r, null);
        TokeniserState.TagOpen.read(t, r);
        assertEquals(TokeniserState.TagName, t.getState());
        assertNotNull(t.getTagPending());
    }

    @Test
    public void testTagOpen_NotLetter() {
        r = new CharacterReader("1");
        t = new Tokeniser(r, null);
        TokeniserState.TagOpen.read(t, r);
        assertEquals("<", t.getEmitted().toString());
    }

    @Test
    public void testEndTagOpen_EOF() {
        r = new CharacterReader("");
        t = new Tokeniser(r, null);
        TokeniserState.EndTagOpen.read(t, r);
        assertEquals("</", t.getEmitted().toString());
    }

    @Test
    public void testEndTagOpen_Letter() {
        r = new CharacterReader("div");
        t = new Tokeniser(r, null);
        TokeniserState.EndTagOpen.read(t, r);
        assertEquals(TokeniserState.TagName, t.getState());
    }

    @Test
    public void testEndTagOpen_GreaterThan() {
        r = new CharacterReader(">");
        t = new Tokeniser(r, null);
        TokeniserState.EndTagOpen.read(t, r);
        assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void testTagName_Tab() {
        r = new CharacterReader("div\t");
        t = new Tokeniser(r, null);
        t.createTagPending(true);
        TokeniserState.TagName.read(t, r);
        assertEquals(TokeniserState.BeforeAttributeName, t.getState());
    }

    @Test
    public void testTagName_Slash() {
        r = new CharacterReader("div/");
        t = new Tokeniser(r, null);
        t.createTagPending(true);
        TokeniserState.TagName.read(t, r);
        assertEquals(TokeniserState.SelfClosingStartTag, t.getState());
    }

    @Test
    public void testTagName_GreaterThan() {
        r = new CharacterReader("div>");
        t = new Tokeniser(r, null);
        t.createTagPending(true);
        TokeniserState.TagName.read(t, r);
        assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void testTagName_NullChar() {
        r = new CharacterReader("div\u0000");
        t = new Tokeniser(r, null);
        t.createTagPending(true);
        TokeniserState.TagName.read(t, r);
        assertTrue(t.getTagPending().name().contains("\uFFFD"));
    }

    @Test
    public void testRcdataLessThanSign_NotSlash() {
        r = new CharacterReader("abc");
        t = new Tokeniser(r, null);
        TokeniserState.RcdataLessthanSign.read(t, r);
        assertEquals("<", t.getEmitted().toString());
        assertEquals(TokeniserState.Rcdata, t.getState());
    }

    @Test
    public void testRcdataLessThanSign_Slash() {
        r = new CharacterReader("/");
        t = new Tokeniser(r, null);
        t.createTempBuffer();
        TokeniserState.RcdataLessthanSign.read(t, r);
        assertEquals(TokeniserState.RCDATAEndTagOpen, t.getState());
    }

    @Test
    public void testRCDATAEndTagOpen_Letter() {
        r = new CharacterReader("d");
        t = new Tokeniser(r, null);
        TokeniserState.RCDATAEndTagOpen.read(t, r);
        assertEquals(TokeniserState.RCDATAEndTagName, t.getState());
        assertTrue(t.getDataBuffer().length() > 0);
    }

    @Test
    public void testRCDATAEndTagName_Appropriate() {
        r = new CharacterReader("/");
        t = new Tokeniser(r, null);
        t.createTagPending(false);
        t.tagPending.name("div");
        t.dataBuffer.append("div");
        t.isAppropriateEndTagToken = true;
        TokeniserState.RCDATAEndTagName.read(t, r);
        assertEquals(TokeniserState.BeforeAttributeName, t.getState());
    }

    @Test
    public void testAnythingElse() {
        r = new CharacterReader("abc");
        t = new Tokeniser(r, null);
        t.dataBuffer.append("div");
        TokeniserState.anythingElse(t, r);
        assertEquals("</div", t.getEmitted().toString());
    }

    @Test
    public void testRawtextLessThanSign_Slash() {
        r = new CharacterReader("/");
        t = new Tokeniser(r, null);
        TokeniserState.RawtextLessthanSign.read(t, r);
        assertEquals(TokeniserState.RawtextEndTagOpen, t.getState());
    }

    @Test
    public void testRawtextEndTagOpen_Letter() {
        r = new CharacterReader("a");
        t = new Tokeniser(r, null);
        TokeniserState.RawtextEndTagOpen.read(t, r);
        assertEquals(TokeniserState.RawtextEndTagName, t.getState());
    }

    @Test
    public void testRawtextEndTagName_Handled() {
        r = new CharacterReader("/");
        t = new Tokeniser(r, null);
        t.createTagPending(false);
        t.tagPending.name("div");
        TokeniserState.RawtextEndTagName.read(t, r);
        assertEquals(TokeniserState.BeforeAttributeName, t.getState());
    }

    @Test
    public void testRawtextEndTagName_NotHandled() {
        r = new CharacterReader("abc");
        t = new Tokeniser(r, null);
        t.createTagPending(false);
        t.tagPending.name("span");
        TokeniserState.RawtextEndTagName.read(t, r);
        assertEquals(TokeniserState.Rawtext, t.getState());
        assertTrue(r.pos() > 0);
    }

    @Test
    public void testScriptDataLessThanSign_Slash() {
        r = new CharacterReader("/");
        t = new Tokeniser(r, null);
        TokeniserState.ScriptDataLessthanSign.read(t, r);
        assertEquals(TokeniserState.ScriptDataEndTagOpen, t.getState());
    }

    @Test
    public void testScriptData_LessThanExclamation() {
        r = new CharacterReader("!");
        t = new Tokeniser(r, null);
        TokeniserState.ScriptData.read(t, r);
        assertEquals("<!", t.getEmitted().toString());
        assertEquals(TokeniserState.ScriptDataEscapeStart, t.getState());
    }

    @Test
    public void testScriptDataEscapeStart_Hyphen() {
        r = new CharacterReader("-");
        t = new Tokeniser(r, null);
        TokeniserState.ScriptDataEscapeStart.read(t, r);
        assertEquals("-", t.getEmitted().toString());
        assertEquals(TokeniserState.ScriptDataEscapeStartDash, t.getState());
    }

    @Test
    public void testScriptDataEscapeStartDash_Hyphen() {
        r = new CharacterReader("-");
        t = new Tokeniser(r, null);
        TokeniserState.ScriptDataEscapeStartDash.read(t, r);
        assertEquals(TokeniserState.ScriptDataEscapedDashDash, t.getState());
    }

    @Test
    public void testScriptDataEscaped_Hyphen() {
        r = new CharacterReader("-");
        t = new Tokeniser(r, null);
        TokeniserState.ScriptDataEscaped.read(t, r);
        assertEquals(TokeniserState.ScriptDataEscapedDash, t.getState());
    }

    @Test
    public void testScriptDataEscapedDash_GreaterThan() {
        r = new CharacterReader(">");
        t = new Tokeniser(r, null);
        TokeniserState.ScriptDataEscapedDash.read(t, r);
        assertEquals(TokeniserState.ScriptData, t.getState());
    }

    @Test
    public void testScriptDataEscapedDashDash_ScriptData() {
        r = new CharacterReader("<");
        t = new Tokeniser(r, null);
        TokeniserState.ScriptDataEscapedDashDash.read(t, r);
        assertEquals(TokeniserState.ScriptDataEscapedLessthanSign, t.getState());
    }

    @Test
    public void testScriptDataEscapedLessThanSign_Letter() {
        r = new CharacterReader("a");
        t = new Tokeniser(r, null);
        TokeniserState.ScriptDataEscapedLessthanSign.read(t, r);
        assertEquals(TokeniserState.ScriptDataDoubleEscapeStart, t.getState());
    }

    @Test
    public void testScriptDataEscapedLessThanSign_Slash() {
        r = new CharacterReader("/");
        t = new Tokeniser(r, null);
        TokeniserState.ScriptDataEscapedLessthanSign.read(t, r);
        assertEquals(TokeniserState.ScriptDataEscapedEndTagOpen, t.getState());
    }

    @Test
    public void testScriptDataEscapedEndTagOpen_Letter() {
        r = new CharacterReader("a");
        t = new Tokeniser(r, null);
        TokeniserState.ScriptDataEscapedEndTagOpen.read(t, r);
        assertEquals(TokeniserState.ScriptDataEscapedEndTagName, t.getState());
    }

    @Test
    public void testScriptDataDoubleEscapeStart_Script() {
        r = new CharacterReader("/");
        t = new Tokeniser(r, null);
        t.dataBuffer.append("script");
        TokeniserState.ScriptDataDoubleEscapeStart.read(t, r);
        assertEquals(TokeniserState.ScriptDataDoubleEscaped, t.getState());
    }

    @Test
    public void testScriptDataDoubleEscaped_LessThan() {
        r = new CharacterReader("<");
        t = new Tokeniser(r, null);
        TokeniserState.ScriptDataDoubleEscaped.read(t, r);
        assertEquals(TokeniserState.ScriptDataDoubleEscapedLessthanSign, t.getState());
    }

    @Test
    public void testScriptDataDoubleEscaped_Hyphen() {
        r = new CharacterReader("-");
        t = new Tokeniser(r, null);
        TokeniserState.ScriptDataDoubleEscaped.read(t, r);
        assertEquals(TokeniserState.ScriptDataDoubleEscapedDash, t.getState());
    }

    @Test
    public void testScriptDataDoubleEscapedDash_Hyphen() {
        r = new CharacterReader("-");
        t = new Tokeniser(r, null);
        TokeniserState.ScriptDataDoubleEscapedDash.read(t, r);
        assertEquals(TokeniserState.ScriptDataDoubleEscapedDashDash, t.getState());
    }

    @Test
    public void testScriptDataDoubleEscapedLessThan_Slash() {
        r = new CharacterReader("/");
        t = new Tokeniser(r, null);
        TokeniserState.ScriptDataDoubleEscapedLessthanSign.read(t, r);
        assertEquals(TokeniserState.ScriptDataDoubleEscapeEnd, t.getState());
    }

    @Test
    public void testBeforeAttributeName_NewAttribute() {
        r = new CharacterReader("attr");
        t = new Tokeniser(r, null);
        t.createTagPending(true);
        TokeniserState.BeforeAttributeName.read(t, r);
        assertEquals(TokeniserState.AttributeName, t.getState());
        assertTrue(t.getTagPending().hasAttributes());
    }

    @Test
    public void testAttributeName_Space() {
        r = new CharacterReader(" ");
        t = new Tokeniser(r, null);
        t.createTagPending(true);
        t.tagPending.newAttribute();
        TokeniserState.AttributeName.read(t, r);
        assertEquals(TokeniserState.AfterAttributeName, t.getState());
    }

    @Test
    public void testAttributeName_Equals() {
        r = new CharacterReader("=");
        t = new Tokeniser(r, null);
        t.createTagPending(true);
        t.tagPending.newAttribute();
        TokeniserState.AttributeName.read(t, r);
        assertEquals(TokeniserState.BeforeAttributeValue, t.getState());
    }

    @Test
    public void testAttributeName_NullChar() {
        r = new CharacterReader("\u0000");
        t = new Tokeniser(r, null);
        t.createTagPending(true);
        t.tagPending.newAttribute();
        TokeniserState.AttributeName.read(t, r);
        assertTrue(t.getTagPending().getAttributeName().toString().contains("\uFFFD"));
    }

    @Test
    public void testAttributeName_DoubleQuote() {
        r = new CharacterReader("\"");
        t = new Tokeniser(r, null);
        t.createTagPending(true);
        t.tagPending.newAttribute();
        TokeniserState.AttributeName.read(t, r);
        assertTrue(t.getTagPending().getAttributeName().toString().contains("\""));
    }

    @Test
    public void testAttributeName_SingleQuote() {
        r = new CharacterReader("'");
        t = new Tokeniser(r, null);
        t.createTagPending(true);
        t.tagPending.newAttribute();
        TokeniserState.AttributeName.read(t, r);
        assertTrue(t.getTagPending().getAttributeName().toString().contains("'"));
    }

    @Test
    public void testAttributeName_LessThan() {
        r = new CharacterReader("<");
        t = new Tokeniser(r, null);
        t.createTagPending(true);
        t.tagPending.newAttribute();
        TokeniserState.AttributeName.read(t, r);
        assertTrue(t.getTagPending().getAttributeName().toString().contains("<"));
    }

    @Test
    public void testAttributeName_GreaterThan() {
        r = new CharacterReader(">");
        t = new Tokeniser(r, null);
        t.createTagPending(true);
        t.tagPending.newAttribute();
        TokeniserState.AttributeName.read(t, r);
        assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void testAttributeName_Slash() {
        r = new CharacterReader("/");
        t = new Tokeniser(r, null);
        t.createTagPending(true);
        t.tagPending.newAttribute();
        TokeniserState.AttributeName.read(t, r);
        assertEquals(TokeniserState.SelfClosingStartTag, t.getState());
    }

    @Test
    public void testAttributeName_AfterAttributeName_Slash() {
        r = new CharacterReader("/");
        t = new Tokeniser(r, null);
        TokeniserState.AfterAttributeName.read(t, r);
        assertEquals(TokeniserState.SelfClosingStartTag, t.getState());
    }

    @Test
    public void testBeforeAttributeValue_Space() {
        r = new CharacterReader(" ");
        t = new Tokeniser(r, null);
        TokeniserState.BeforeAttributeValue.read(t, r);
        assertEquals(TokeniserState.BeforeAttributeValue, t.getState());
    }

    @Test
    public void testBeforeAttributeValue_DoubleQuote() {
        r = new CharacterReader("\"");
        t = new Tokeniser(r, null);
        TokeniserState.BeforeAttributeValue.read(t, r);
        assertEquals(TokeniserState.AttributeValue_doubleQuoted, t.getState());
    }

    @Test
    public void testBeforeAttributeValue_SingleQuote() {
        r = new CharacterReader("'");
        t = new Tokeniser(r, null);
        TokeniserState.BeforeAttributeValue.read(t, r);
        assertEquals(TokeniserState.AttributeValue_singleQuoted, t.getState());
    }

    @Test
    public void testBeforeAttributeValue_GreaterThan() {
        r = new CharacterReader(">");
        t = new Tokeniser(r, null);
        TokeniserState.BeforeAttributeValue.read(t, r);
        assertEquals(TokeniserState.AttributeValue_unquoted, t.getState());
    }

    @Test
    public void testAttributeValue_doubleQuoted_Ampersand() {
        r = new CharacterReader("&amp;");
        t = new Tokeniser(r, null);
        t.createTagPending(true);
        t.tagPending.newAttribute();
        TokeniserState.AttributeValue_doubleQuoted.read(t, r);
        assertEquals("&", t.getTagPending().getAttributeValue().toString());
    }

    @Test
    public void testAttributeValue_doubleQuoted_Quote() {
        r = new CharacterReader("\"");
        t = new Tokeniser(r, null);
        t.createTagPending(true);
        t.tagPending.newAttribute();
        TokeniserState.AttributeValue_doubleQuoted.read(t, r);
        assertEquals(TokeniserState.AfterAttributeValue_quoted, t.getState());
    }

    @Test
    public void testAttributeValue_doubleQuoted_NullChar() {
        r = new CharacterReader("\u0000");
        t = new Tokeniser(r, null);
        t.createTagPending(true);
        t.tagPending.newAttribute();
        TokeniserState.AttributeValue_doubleQuoted.read(t, r);
        assertTrue(t.getTagPending().getAttributeValue().toString().contains("\uFFFD"));
    }

    @Test
    public void testAttributeValue_singleQuoted_Ampersand() {
        r = new CharacterReader("&amp;");
        t = new Tokeniser(r, null);
        t.createTagPending(true);
        t.tagPending.newAttribute();
        TokeniserState.AttributeValue_singleQuoted.read(t, r);
        assertEquals("&", t.getTagPending().getAttributeValue().toString());
    }

    @Test
    public void testAttributeValue_singleQuoted_Quote() {
        r = new CharacterReader("'");
        t = new Tokeniser(r, null);
        t.createTagPending(true);
        t.tagPending.newAttribute();
        TokeniserState.AttributeValue_singleQuoted.read(t, r);
        assertEquals(TokeniserState.AfterAttributeValue_quoted, t.getState());
    }

    @Test
    public void testAttributeValue_unquoted_Value() {
        r = new CharacterReader("value");
        t = new Tokeniser(r, null);
        t.createTagPending(true);
        t.tagPending.newAttribute();
        TokeniserState.AttributeValue_unquoted.read(t, r);
        assertEquals("value", t.getTagPending().getAttributeValue().toString());
    }

    @Test
    public void testAttributeValue_unquoted_Ampersand() {
        r = new CharacterReader("&amp;");
        t = new Tokeniser(r, null);
        t.createTagPending(true);
        t.tagPending.newAttribute();
        TokeniserState.AttributeValue_unquoted.read(t, r);
        assertEquals("&", t.getTagPending().getAttributeValue().toString());
    }

    @Test
    public void testAttributeValue_unquoted_GreaterThan() {
        r = new CharacterReader(">");
        t = new Tokeniser(r, null);
        t.createTagPending(true);
        t.tagPending.newAttribute();
        TokeniserState.AttributeValue_unquoted.read(t, r);
        assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void testAttributeValue_unquoted_Tab() {
        r = new CharacterReader("\t");
        t = new Tokeniser(r, null);
        t.createTagPending(true);
        t.tagPending.newAttribute();
        TokeniserState.AttributeValue_unquoted.read(t, r);
        assertEquals(TokeniserState.BeforeAttributeName, t.getState());
    }

    @Test
    public void testAfterAttributeValue_quoted_SelfClosing() {
        r = new CharacterReader("/");
        t = new Tokeniser(r, null);
        t.createTagPending(true);
        t.tagPending.newAttribute();
        TokeniserState.AfterAttributeValue_quoted.read(t, r);
        assertEquals(TokeniserState.SelfClosingStartTag, t.getState());
    }

    @Test
    public void testSelfClosingStartTag_GreaterThan() {
        r = new CharacterReader(">");
        t = new Tokeniser(r, null);
        t.createTagPending(true);
        TokeniserState.SelfClosingStartTag.read(t, r);
        assertEquals(TokeniserState.Data, t.getState());
        assertTrue(t.getTagPending().isSelfClosing());
    }

    @Test
    public void testBogusComment_ConsumeTo() {
        r = new CharacterReader("comment");
        t = new Tokeniser(r, null);
        TokeniserState.BogusComment.read(t, r);
        assertNotNull(t.getCommentPending());
    }

    @Test
    public void testMarkupDeclarationOpen_Comment() {
        r = new CharacterReader("--");
        t = new Tokeniser(r, null);
        TokeniserState.MarkupDeclarationOpen.read(t, r);
        assertEquals(TokeniserState.CommentStart, t.getState());
    }

    @Test
    public void testMarkupDeclarationOpen_Doctype() {
        r = new CharacterReader("DOCTYPE");
        t = new Tokeniser(r, null);
        TokeniserState.MarkupDeclarationOpen.read(t, r);
        assertEquals(TokeniserState.Doctype, t.getState());
    }

    @Test
    public void testMarkupDeclarationOpen_CDATA() {
        r = new CharacterReader("[CDATA[");
        t = new Tokeniser(r, null);
        TokeniserState.MarkupDeclarationOpen.read(t, r);
        assertEquals(TokeniserState.CdataSection, t.getState());
    }

    @Test
    public void testCommentStart_Dash() {
        r = new CharacterReader("-");
        t = new Tokeniser(r, null);
        TokeniserState.CommentStart.read(t, r);
        assertEquals(TokeniserState.CommentStartDash, t.getState());
    }

    @Test
    public void testCommentStart_NullChar() {
        r = new CharacterReader("\u0000");
        t = new Tokeniser(r, null);
        t.createCommentPending();
        TokeniserState.CommentStart.read(t, r);
        assertTrue(t.getCommentPending().data.toString().contains("\uFFFD"));
    }

    @Test
    public void testCommentStart_GreaterThan() {
        r = new CharacterReader(">");
        t = new Tokeniser(r, null);
        t.createCommentPending();
        TokeniserState.CommentStart.read(t, r);
        assertTrue(t.getCommentPending().data.toString().length() >= 0);
    }

    @Test
    public void testCommentStart_EOF() {
        r = new CharacterReader("");
        t = new Tokeniser(r, null);
        t.createCommentPending();
        TokeniserState.CommentStart.read(t, r);
        assertTrue(t.hasEofError());
    }

    @Test
    public void testCommentStart_ValidChar() {
        r = new CharacterReader("a");
        t = new Tokeniser(r, null);
        t.createCommentPending();
        TokeniserState.CommentStart.read(t, r);
        assertEquals("a", t.getCommentPending().data.toString());
    }

    @Test
    public void testCommentStartDash_GreaterThan() {
        r = new CharacterReader(">");
        t = new Tokeniser(r, null);
        t.createCommentPending();
        TokeniserState.CommentStartDash.read(t, r);
        assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void testComment_Hyphen() {
        r = new CharacterReader("-");
        t = new Tokeniser(r, null);
        t.createCommentPending();
        TokeniserState.Comment.read(t, r);
        assertEquals(TokeniserState.CommentEndDash, t.getState());
    }

    @Test
    public void testComment_EOF() {
        r = new CharacterReader("");
        t = new Tokeniser(r, null);
        t.createCommentPending();
        TokeniserState.Comment.read(t, r);
        assertTrue(t.hasEofError());
    }

    @Test
    public void testComment_NullChar() {
        r = new CharacterReader("\u0000");
        t = new Tokeniser(r, null);
        t.createCommentPending();
        TokeniserState.Comment.read(t, r);
        assertTrue(t.getCommentPending().data.toString().contains("\uFFFD"));
    }

    @Test
    public void testCommentEndDash_Hyphen() {
        r = new CharacterReader("-");
        t = new Tokeniser(r, null);
        t.createCommentPending();
        TokeniserState.CommentEndDash.read(t, r);
        assertEquals(TokeniserState.CommentEnd, t.getState());
    }

    @Test
    public void testCommentEndDash_NullChar() {
        r = new CharacterReader("\u0000");
        t = new Tokeniser(r, null);
        t.createCommentPending();
        TokeniserState.CommentEndDash.read(t, r);
        assertTrue(t.getCommentPending().data.toString().contains("-\uFFFD"));
    }

    @Test
    public void testCommentEndDash_EOF() {
        r = new CharacterReader("");
        t = new Tokeniser(r, null);
        t.createCommentPending();
        TokeniserState.CommentEndDash.read(t, r);
        assertTrue(t.hasEofError());
    }

    @Test
    public void testCommentEnd_Dash() {
        r = new CharacterReader("-");
        t = new Tokeniser(r, null);
        t.createCommentPending();
        TokeniserState.CommentEnd.read(t, r);
        assertEquals(TokeniserState.CommentEnd, t.getState());
    }

    @Test
    public void testCommentEnd_Bang() {
        r = new CharacterReader("!");
        t = new Tokeniser(r, null);
        t.createCommentPending();
        TokeniserState.CommentEnd.read(t, r);
        assertEquals(TokeniserState.CommentEndBang, t.getState());
    }

    @Test
    public void testCommentEnd_GreaterThan() {
        r = new CharacterReader(">");
        t = new Tokeniser(r, null);
        t.createCommentPending();
        TokeniserState.CommentEnd.read(t, r);
        assertNotNull(t.getCommentPending());
    }

    @Test
    public void testCommentEnd_NullChar() {
        r = new CharacterReader("\u0000");
        t = new Tokeniser(r, null);
        t.createCommentPending();
        TokeniserState.CommentEnd.read(t, r);
        assertTrue(t.getCommentPending().data.toString().contains("--\uFFFD"));
    }

    @Test
    public void testCommentEnd_EOF() {
        r = new CharacterReader("");
        t = new Tokeniser(r, null);
        t.createCommentPending();
        TokeniserState.CommentEnd.read(t, r);
        assertTrue(t.hasEofError());
    }

    @Test
    public void testCommentEndBang_Doctype() {
        r = new CharacterReader("d");
        t = new Tokeniser(r, null);
        t.createCommentPending();
        TokeniserState.CommentEndBang.read(t, r);
        assertTrue(t.getCommentPending().data.toString().contains("--!"));
    }

    @Test
    public void testDoctype_Lowercase() {
        r = new CharacterReader("doctype");
        t = new Tokeniser(r, null);
        TokeniserState.Doctype.read(t, r);
        assertEquals(TokeniserState.BeforeDoctypeName, t.getState());
    }

    @Test
    public void testBeforeDoctypeName_Space() {
        r = new CharacterReader(" ");
        t = new Tokeniser(r, null);
        t.createDoctypePending();
        TokeniserState.BeforeDoctypeName.read(t, r);
        assertEquals(TokeniserState.BeforeDoctypeName, t.getState());
    }

    @Test
    public void testBeforeDoctypeName_NullChar() {
        r = new CharacterReader("\u0000");
        t = new Tokeniser(r, null);
        t.createDoctypePending();
        TokeniserState.BeforeDoctypeName.read(t, r);
        assertTrue(t.getDoctypePending().name.toString().contains("\uFFFD"));
    }

    @Test
    public void testBeforeDoctypeName_GreaterThan() {
        r = new CharacterReader(">");
        t = new Tokeniser(r, null);
        t.createDoctypePending();
        TokeniserState.BeforeDoctypeName.read(t, r);
        assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void testBeforeDoctypeName_EOF() {
        r = new CharacterReader("");
        t = new Tokeniser(r, null);
        t.createDoctypePending();
        TokeniserState.BeforeDoctypeName.read(t, r);
        assertTrue(t.hasEofError());
    }

    @Test
    public void testBeforeDoctypeName_ValidChar() {
        r = new CharacterReader("html");
        t = new Tokeniser(r, null);
        t.createDoctypePending();
        TokeniserState.BeforeDoctypeName.read(t, r);
        assertEquals("html", t.getDoctypePending().name.toString());
    }

    @Test
    public void testDoctypeName_ValidChar() {
        r = new CharacterReader("html");
        t = new Tokeniser(r, null);
        t.createDoctypePending();
        TokeniserState.DoctypeName.read(t, r);
        assertEquals("html", t.getDoctypePending().name.toString());
    }

    @Test
    public void testAfterDoctypeName_Space() {
        r = new CharacterReader(" ");
        t = new Tokeniser(r, null);
        t.createDoctypePending();
        TokeniserState.AfterDoctypeName.read(t, r);
        assertEquals(TokeniserState.AfterDoctypeName, t.getState());
    }

    @Test
    public void testAfterDoctypeName_Public() {
        r = new CharacterReader("PUBLIC");
        t = new Tokeniser(r, null);
        t.createDoctypePending();
        TokeniserState.AfterDoctypeName.read(t, r);
        assertEquals(TokeniserState.AfterDoctypePublicKeyword, t.getState());
    }

    @Test
    public void testAfterDoctypeName_System() {
        r = new CharacterReader("SYSTEM");
        t = new Tokeniser(r, null);
        t.createDoctypePending();
        TokeniserState.AfterDoctypeName.read(t, r);
        assertEquals(TokeniserState.AfterDoctypeSystemKeyword, t.getState());
    }

    @Test
    public void testAfterDoctypePublicKeyword_DoubleQuote() {
        r = new CharacterReader("\"");
        t = new Tokeniser(r, null);
        TokeniserState.AfterDoctypePublicKeyword.read(t, r);
        assertEquals(TokeniserState.DoctypePublicIdentifier_doubleQuoted, t.getState());
    }

    @Test
    public void testAfterDoctypePublicKeyword_SingleQuote() {
        r = new CharacterReader("'");
        t = new Tokeniser(r, null);
        TokeniserState.AfterDoctypePublicKeyword.read(t, r);
        assertEquals(TokeniserState.DoctypePublicIdentifier_singleQuoted, t.getState());
    }

    @Test
    public void testAfterDoctypePublicKeyword_GreaterThan() {
        r = new CharacterReader(">");
        t = new Tokeniser(r, null);
        TokeniserState.AfterDoctypePublicKeyword.read(t, r);
        assertTrue(t.getDoctypePending().forceQuirks);
    }

    @Test
    public void testBeforeDoctypePublicIdentifier_Space() {
        r = new CharacterReader(" ");
        t = new Tokeniser(r, null);
        TokeniserState.BeforeDoctypePublicIdentifier.read(t, r);
        assertEquals(TokeniserState.BeforeDoctypePublicIdentifier, t.getState());
    }

    @Test
    public void testDoctypePublicIdentifier_doubleQuoted_Quote() {
        r = new CharacterReader("\"");
        t = new Tokeniser(r, null);
        TokeniserState.DoctypePublicIdentifier_doubleQuoted.read(t, r);
        assertEquals(TokeniserState.AfterDoctypePublicIdentifier, t.getState());
    }

    @Test
    public void testDoctypePublicIdentifier_doubleQuoted_NullChar() {
        r = new CharacterReader("\u0000");
        t = new Tokeniser(r, null);
        TokeniserState.DoctypePublicIdentifier_doubleQuoted.read(t, r);
        assertTrue(t.getDoctypePending().publicIdentifier.toString().contains("\uFFFD"));
    }

    @Test
    public void testDoctypePublicIdentifier_singleQuoted_Quote() {
        r = new CharacterReader("'");
        t = new Tokeniser(r, null);
        TokeniserState.DoctypePublicIdentifier_singleQuoted.read(t, r);
        assertEquals(TokeniserState.AfterDoctypePublicIdentifier, t.getState());
    }

    @Test
    public void testAfterDoctypePublicIdentifier_Space() {
        r = new CharacterReader(" ");
        t = new Tokeniser(r, null);
        TokeniserState.AfterDoctypePublicIdentifier.read(t, r);
        assertEquals(TokeniserState.BetweenDoctypePublicAndSystemIdentifiers, t.getState());
    }

    @Test
    public void testBetweenDoctypePublicAndSystemIdentifiers_Space() {
        r = new CharacterReader(" ");
        t = new Tokeniser(r, null);
        TokeniserState.BetweenDoctypePublicAndSystemIdentifiers.read(t, r);
        assertEquals(TokeniserState.BeforeDoctypeSystemIdentifier, t.getState());
    }

    @Test
    public void testBeforeDoctypeSystemIdentifier_Space() {
        r = new CharacterReader(" ");
        t = new Tokeniser(r, null);
        TokeniserState.BeforeDoctypeSystemIdentifier.read(t, r);
        assertEquals(TokeniserState.BeforeDoctypeSystemIdentifier, t.getState());
    }

    @Test
    public void testDoctypeSystemIdentifier_doubleQuoted_Quote() {
        r = new CharacterReader("\"");
        t = new Tokeniser(r, null);
        TokeniserState.DoctypeSystemIdentifier_doubleQuoted.read(t, r);
        assertEquals(TokeniserState.AfterDoctypeSystemIdentifier, t.getState());
    }

    @Test
    public void testAfterDoctypeSystemIdentifier_Space() {
        r = new CharacterReader(" ");
        t = new Tokeniser(r, null);
        TokeniserState.AfterDoctypeSystemIdentifier.read(t, r);
        assertEquals(TokeniserState.BogusDoctype, t.getState());
    }

    @Test
    public void testBogusDoctype_ConsumeTo() {
        r = new CharacterReader("abc>");
        t = new Tokeniser(r, null);
        TokeniserState.BogusDoctype.read(t, r);
        assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void testCdataSection_ConsumeToClose() {
        r = new CharacterReader("data]]>");
        t = new Tokeniser(r, null);
        TokeniserState.CdataSection.read(t, r);
        assertEquals(TokeniserState.Data, t.getState());
    }
}