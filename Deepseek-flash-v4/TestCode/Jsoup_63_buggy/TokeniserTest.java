package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class TokeniserTest {
    private Tokeniser tokeniser;
    private CharacterReader reader;
    private ParseErrorList errors;

    @Before
    public void setUp() {
        errors = new ParseErrorList(16);
    }

    @Test
    public void testInitialState() {
        reader = new CharacterReader("");
        tokeniser = new Tokeniser(reader, errors);
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    @Test
    public void testTransition() {
        reader = new CharacterReader("");
        tokeniser = new Tokeniser(reader, errors);
        tokeniser.transition(TokeniserState.Tag);
        Assert.assertEquals(TokeniserState.Tag, tokeniser.getState());
    }

    @Test
    public void testAdvanceTransition() {
        reader = new CharacterReader("a");
        tokeniser = new Tokeniser(reader, errors);
        tokeniser.advanceTransition(TokeniserState.Tag);
        Assert.assertEquals(1, reader.pos());
        Assert.assertEquals(TokeniserState.Tag, tokeniser.getState());
    }

    @Test
    public void testReadEmptyInput() {
        reader = new CharacterReader("");
        tokeniser = new Tokeniser(reader, errors);
        Token token = tokeniser.read();
        Assert.assertNull(token);
    }

    @Test
    public void testEmitStringBuffering() {
        reader = new CharacterReader("");
        tokeniser = new Tokeniser(reader, errors);
        tokeniser.emit("abc");
        tokeniser.emit("def");
        Token token = tokeniser.read();
        Assert.assertEquals("abcdef", token.asCharacter().getData());
    }

    @Test
    public void testEmitCharArrays() {
        reader = new CharacterReader("");
        tokeniser = new Tokeniser(reader, errors);
        tokeniser.emit(new char[]{'x', 'y'});
        tokeniser.emit(new int[]{65, 66});
        Token token = tokeniser.read();
        Assert.assertEquals("xyAB", token.asCharacter().getData());
    }

    @Test
    public void testEmitTokenStartTag() {
        reader = new CharacterReader("");
        tokeniser = new Tokeniser(reader, errors);
        Token.StartTag startTag = new Token.StartTag();
        startTag.tagName = "div";
        startTag.selfClosing = true;
        tokeniser.emit(startTag);
        Assert.assertFalse(tokeniser.selfClosingFlagAcknowledged);
        Token token = tokeniser.read();
        Assert.assertEquals(Token.TokenType.StartTag, token.type);
    }

    @Test
    public void testEmitTokenEndTagWithAttributes() {
        reader = new CharacterReader("");
        tokeniser = new Tokeniser(reader, errors);
        Token.EndTag endTag = new Token.EndTag();
        endTag.tagName = "p";
        endTag.attributes = new org.jsoup.nodes.Attributes();
        tokeniser.emit(endTag);
        Assert.assertTrue(errors.hasErrors());
    }

    @Test
    public void testAppropriateEndTagName() {
        reader = new CharacterReader("");
        tokeniser = new Tokeniser(reader, errors);
        Assert.assertNull(tokeniser.appropriateEndTagName());
        Token.StartTag startTag = new Token.StartTag();
        startTag.tagName = "p";
        tokeniser.emit(startTag);
        Assert.assertEquals("p", tokeniser.appropriateEndTagName());
    }

    @Test
    public void testIsAppropriateEndTagToken() {
        reader = new CharacterReader("");
        tokeniser = new Tokeniser(reader, errors);
        tokeniser.tagPending = new Token.EndTag();
        tokeniser.tagPending.tagName = "div";
        Assert.assertFalse(tokeniser.isAppropriateEndTagToken());
        Token.StartTag startTag = new Token.StartTag();
        startTag.tagName = "div";
        tokeniser.emit(startTag);
        tokeniser.tagPending = new Token.EndTag();
        tokeniser.tagPending.tagName = "div";
        Assert.assertTrue(tokeniser.isAppropriateEndTagToken());
    }

    @Test
    public void testErrorBehavior() {
        reader = new CharacterReader("");
        tokeniser = new Tokeniser(reader, errors);
        tokeniser.error("Test error");
        Assert.assertEquals(1, errors.size());
        Assert.assertEquals("Unexpected character '' in input state [Data]", errors.get(0).getMessage());
    }

    @Test
    public void testEofError() {
        reader = new CharacterReader("");
        tokeniser = new Tokeniser(reader, errors);
        tokeniser.eofError(TokeniserState.Data);
        Assert.assertEquals(1, errors.size());
        Assert.assertTrue(errors.get(0).getMessage().contains("EOF"));
    }

    @Test
    public void testCharacterReferenceUnescape() {
        reader = new CharacterReader("&amp;");
        tokeniser = new Tokeniser(reader, errors);
        Assert.assertEquals("&", tokeniser.unescapeEntities(false));
    }

    @Test
    public void testConsumeCharacterReference_NullWhenEmpty() {
        reader = new CharacterReader("");
        tokeniser = new Tokeniser(reader, errors);
        Assert.assertNull(tokeniser.consumeCharacterReference(null, false));
    }

    @Test
    public void testConsumeCharacterReference_WithAdditionalAllowedCharacter() {
        reader = new CharacterReader("&");
        tokeniser = new Tokeniser(reader, errors);
        Assert.assertNull(tokeniser.consumeCharacterReference('&', false));
    }

    @Test
    public void testConsumeCharacterReference_WithNotCharRef() {
        reader = new CharacterReader(" ");
        tokeniser = new Tokeniser(reader, errors);
        Assert.assertNull(tokeniser.consumeCharacterReference(null, false));
    }

    @Test
    public void testConsumeCharacterReference_NumericHexValid() {
        reader = new CharacterReader("&#x41;");
        tokeniser = new Tokeniser(reader, errors);
        int[] result = tokeniser.consumeCharacterReference(null, false);
        Assert.assertNotNull(result);
        Assert.assertEquals(1, result.length);
        Assert.assertEquals(65, result[0]);
    }

    @Test
    public void testConsumeCharacterReference_NumericHexNoSemicolon() {
        reader = new CharacterReader("&#x41");
        tokeniser = new Tokeniser(reader, errors);
        int[] result = tokeniser.consumeCharacterReference(null, false);
        Assert.assertNotNull(result);
        Assert.assertEquals(65, result[0]);
        Assert.assertTrue(errors.hasErrors());
    }

    @Test
    public void testConsumeCharacterReference_NumericDecValid() {
        reader = new CharacterReader("&#65;");
        tokeniser = new Tokeniser(reader, errors);
        int[] result = tokeniser.consumeCharacterReference(null, false);
        Assert.assertNotNull(result);
        Assert.assertEquals(65, result[0]);
    }

    @Test
    public void testConsumeCharacterReference_NumericInvalidRange() {
        reader = new CharacterReader("&#x1FFFFF;");
        tokeniser = new Tokeniser(reader, errors);
        int[] result = tokeniser.consumeCharacterReference(null, false);
        Assert.assertNotNull(result);
        Assert.assertEquals(Tokeniser.replacementChar, result[0]);
        Assert.assertTrue(errors.hasErrors());
    }

    @Test
    public void testConsumeCharacterReference_NamedEntityWithoutSemicolon() {
        reader = new CharacterReader("&amp");
        tokeniser = new Tokeniser(reader, errors);
        int[] result = tokeniser.consumeCharacterReference(null, false);
        Assert.assertNotNull(result);
        Assert.assertEquals('&', result[0]);
    }

    @Test
    public void testConsumeCharacterReference_NamedEntityWithAttributeSuffix() {
        reader = new CharacterReader("&amp=");
        tokeniser = new Tokeniser(reader, errors);
        int[] result = tokeniser.consumeCharacterReference(null, false);
        Assert.assertNull(result);
        reader.rewindToMark();
    }
}