package org.jsoup.parser;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import org.jsoup.nodes.DocumentType;
import java.io.StringReader;

public class TokeniserStateTest {
    private Tokeniser tokeniser;
    private CharacterReader reader;
    private TokeniserState state;

    @Before
    public void setUp() {
        tokeniser = new Tokeniser(new StringReader(""));
        reader = new CharacterReader("");
    }

    @After
    public void tearDown() {
        tokeniser = null;
        reader = null;
    }

    @Test
    public void testReadDataWithAmpersand() {
        reader = new CharacterReader("&");
        tokeniser = new Tokeniser(new StringReader("&"));
        TokeniserState.Data.read(tokeniser, reader);
        Assert.assertTrue(tokeniser.isTransitionNeeded());
    }

    @Test
    public void testReadDataWithLessThan() {
        reader = new CharacterReader("<");
        tokeniser = new Tokeniser(new StringReader("<"));
        TokeniserState.Data.read(tokeniser, reader);
        Assert.assertTrue(tokeniser.isTransitionNeeded());
    }

    @Test
    public void testReadDataWithNullChar() {
        reader = new CharacterReader("\u0000");
        tokeniser = new Tokeniser(new StringReader("\u0000"));
        TokeniserState.Data.read(tokeniser, reader);
        Assert.assertTrue(tokeniser.isTransitionNeeded());
    }

    @Test
    public void testReadDataWithEOF() {
        reader = new CharacterReader("");
        tokeniser = new Tokeniser(new StringReader(""));
        TokeniserState.Data.read(tokeniser, reader);
        Assert.assertTrue(tokeniser.isTransitionNeeded());
    }

    @Test
    public void testReadDataWithNormalContent() {
        reader = new CharacterReader("hello");
        tokeniser = new Tokeniser(new StringReader("hello"));
        TokeniserState.Data.read(tokeniser, reader);
        Assert.assertTrue(tokeniser.isTransitionNeeded());
    }

    @Test
    public void testTagOpenWithExclamation() {
        reader = new CharacterReader("!");
        tokeniser = new Tokeniser(new StringReader("!"));
        TokeniserState.TagOpen.read(tokeniser, reader);
        Assert.assertEquals(TokeniserState.MarkupDeclarationOpen, tokeniser.getCurrentState());
    }

    @Test
    public void testTagOpenWithSlash() {
        reader = new CharacterReader("/");
        tokeniser = new Tokeniser(new StringReader("/"));
        TokeniserState.TagOpen.read(tokeniser, reader);
        Assert.assertEquals(TokeniserState.EndTagOpen, tokeniser.getCurrentState());
    }

    @Test
    public void testTagOpenWithQuestionMark() {
        reader = new CharacterReader("?");
        tokeniser = new Tokeniser(new StringReader("?"));
        TokeniserState.TagOpen.read(tokeniser, reader);
        Assert.assertEquals(TokeniserState.BogusComment, tokeniser.getCurrentState());
    }

    @Test
    public void testTagOpenWithLetter() {
        reader = new CharacterReader("a");
        tokeniser = new Tokeniser(new StringReader("a"));
        TokeniserState.TagOpen.read(tokeniser, reader);
        Assert.assertTrue(tokeniser.isTagPending());
        Assert.assertEquals(TokeniserState.TagName, tokeniser.getCurrentState());
    }

    @Test
    public void testTagOpenWithInvalidChar() {
        reader = new CharacterReader("%");
        tokeniser = new Tokeniser(new StringReader("%"));
        TokeniserState.TagOpen.read(tokeniser, reader);
        Assert.assertEquals(TokeniserState.Data, tokeniser.getCurrentState());
    }

    @Test
    public void testEndTagOpenWithEOF() {
        reader = new CharacterReader("");
        tokeniser = new Tokeniser(new StringReader(""));
        TokeniserState.EndTagOpen.read(tokeniser, reader);
        Assert.assertTrue(tokeniser.hasError());
    }

    @Test
    public void testEndTagOpenWithLetter() {
        reader = new CharacterReader("a");
        tokeniser = new Tokeniser(new StringReader("a"));
        TokeniserState.EndTagOpen.read(tokeniser, reader);
        Assert.assertFalse(tokeniser.isTagPending());
    }

    @Test
    public void testEndTagOpenWithGreaterThan() {
        reader = new CharacterReader(">");
        tokeniser = new Tokeniser(new StringReader(">"));
        TokeniserState.EndTagOpen.read(tokeniser, reader);
        Assert.assertEquals(TokeniserState.Data, tokeniser.getCurrentState());
    }

    @Test
    public void testTagNameWithWhitespace() {
        reader = new CharacterReader(" \t\n\r\f ");
        tokeniser = new Tokeniser(new StringReader(" \t\n\r\f "));
        TokeniserState.TagName.read(tokeniser, reader);
        Assert.assertEquals(TokeniserState.BeforeAttributeName, tokeniser.getCurrentState());
    }

    @Test
    public void testTagNameWithSlash() {
        reader = new CharacterReader("/");
        tokeniser = new Tokeniser(new StringReader("/"));
        TokeniserState.TagName.read(tokeniser, reader);
        Assert.assertEquals(TokeniserState.SelfClosingStartTag, tokeniser.getCurrentState());
    }

    @Test
    public void testTagNameWithGreaterThan() {
        reader = new CharacterReader(">");
        tokeniser = new Tokeniser(new StringReader(">"));
        TokeniserState.TagName.read(tokeniser, reader);
        Assert.assertNotNull(tokeniser.getCurrentState());
    }

    @Test
    public void testRcdataLessthanSignWithSlash() {
        reader = new CharacterReader("/");
        tokeniser = new Tokeniser(new StringReader("/"));
        tokeniser.createTempBuffer();
        TokeniserState.RcdataLessthanSign.read(tokeniser, reader);
        Assert.assertEquals(TokeniserState.RCDATAEndTagOpen, tokeniser.getCurrentState());
    }

    @Test
    public void testRcdataLessthanSignWithLetterAndContent() {
        reader = new CharacterReader("abc</");
        tokeniser = new Tokeniser(new StringReader("abc</"));
        tokeniser.createAppropriateEndTag();
        TokeniserState.RcdataLessthanSign.read(tokeniser, reader);
        Assert.assertNotNull(tokeniser.getCurrentState());
    }

    @Test
    public void testDoctypeWithForceQuirks() {
        reader = new CharacterReader("");
        tokeniser = new Tokeniser(new StringReader(""));
        tokeniser.createDoctypePending();
        tokeniser.doctypePending.forceQuirks = true;
        TokeniserState.Doctype.read(tokeniser, reader);
        Assert.assertTrue(tokeniser.getCurrentState() == TokeniserState.BeforeDoctypeName);
    }

    @Test
    public void testDoctypeWithEOF() {
        reader = new CharacterReader("");
        tokeniser = new Tokeniser(new StringReader(""));
        tokeniser.createDoctypePending();
        tokeniser.emitDoctypePending();
        TokeniserState.Doctype.read(tokeniser, reader);
        Assert.assertNotNull(tokeniser.getDoctypePending());
    }

    @Test
    public void testCommentWithEOF() {
        reader = new CharacterReader("");
        tokeniser = new Tokeniser(new StringReader(""));
        tokeniser.createCommentPending();
        TokeniserState.Comment.read(tokeniser, reader);
        Assert.assertNotNull(tokeniser.getCommentPending().data.toString());
    }

    @Test
    public void testCommentWithDash() {
        reader = new CharacterReader("-");
        tokeniser = new Tokeniser(new StringReader("-"));
        tokeniser.createCommentPending();
        TokeniserState.Comment.read(tokeniser, reader);
        Assert.assertNotNull(tokeniser.getCommentPending().data.toString());
    }

    @Test
    public void testCommentWithNullChar() {
        reader = new CharacterReader("\u0000");
        tokeniser = new Tokeniser(new StringReader("\u0000"));
        tokeniser.createCommentPending();
        TokeniserState.Comment.read(tokeniser, reader);
        Assert.assertNotNull(tokeniser.getCommentPending().data.toString());
    }

    @Test
    public void testCommentWithNormalChar() {
        reader = new CharacterReader("a");
        tokeniser = new Tokeniser(new StringReader("a"));
        tokeniser.createCommentPending();
        TokeniserState.Comment.read(tokeniser, reader);
        Assert.assertNotNull(tokeniser.getCommentPending().data.toString());
    }

    @Test
    public void testBeforeAttributeNameWithSlash() {
        reader = new CharacterReader("/");
        tokeniser = new Tokeniser(new StringReader("/"));
        tokeniser.tagPending = tokeniser.createTagPending(false);
        TokeniserState.BeforeAttributeName.read(tokeniser, reader);
        Assert.assertNotNull(tokeniser.getCurrentState());
    }

    @Test
    public void testAttributeValueDoubleQuotedWithNull() {
        reader = new CharacterReader("\u0000");
        tokeniser = new Tokeniser(new StringReader("\u0000"));
        tokeniser.tagPending = tokeniser.createTagPending(false);
        TokeniserState.AttributeValue_doubleQuoted.read(tokeniser, reader);
        Assert.assertNotNull(tokeniser.getCurrentState());
    }

    @Test
    public void testDoctypePublicIdentifierDoubleQuotedWithEmptyIdentifier() {
        reader = new CharacterReader("\"");
        tokeniser = new Tokeniser(new StringReader("\""));
        tokeniser.createDoctypePending();
        tokeniser.doctypePending.name.append("test");
        tokeniser.transition(TokeniserState.AfterDoctypePublicIdentifier);
        TokeniserState.DoctypePublicIdentifier_doubleQuoted.read(tokeniser, reader);
        Assert.assertEquals(TokeniserState.AfterDoctypePublicIdentifier, tokeniser.getCurrentState());
    }

    @Test
    public void testDoctypePublicIdentifierSingleQuoted() {
        reader = new CharacterReader("'");
        tokeniser = new Tokeniser(new StringReader("'"));
        tokeniser.createDoctypePending();
        tokeniser.doctypePending.name.append("test");
        TokeniserState.DoctypePublicIdentifier_singleQuoted.read(tokeniser, reader);
        Assert.assertNotNull(tokeniser.getCurrentState());
    }

    @Test
    public void testSelfClosingStartTag() {
        reader = new CharacterReader("");
        tokeniser = new Tokeniser(new StringReader(""));
        tokeniser.tagPending = tokeniser.createTagPending(false);
        TokeniserState.SelfClosingStartTag.read(tokeniser, reader);
        Assert.assertTrue(tokeniser.tagPending.selfClosing);
    }
}