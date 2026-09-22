package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;

public class TokeniserTest {

    @Test
    public void read_givenSimpleCharacters_shouldEmitCharacterToken() {
        // Arrange
        CharacterReader reader = new CharacterReader("abc");
        ParseErrorList errors = ParseErrorList.noTracking();
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        // Act
        Token token = tokeniser.read();

        // Assert
        Assert.assertNotNull(token);
        Assert.assertEquals(Token.TokenType.Character, token.type);
        Assert.assertEquals("abc", ((Token.Character) token).getData());
    }

    @Test
    public void read_givenCharBufferAndPendingEmit_shouldDrainCharBufferFirst() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.noTracking();
        Tokeniser tokeniser = new Tokeniser(reader, errors);
        tokeniser.emit("buffered");
        Token.Comment comment = new Token.Comment();
        tokeniser.emit(comment);

        // Act
        Token firstToken = tokeniser.read();
        Token secondToken = tokeniser.read();

        // Assert
        Assert.assertEquals(Token.TokenType.Character, firstToken.type);
        Assert.assertEquals("buffered", ((Token.Character) firstToken).getData());
        Assert.assertSame(comment, secondToken);
    }

    @Test
    public void read_givenUnacknowledgedSelfClosingFlag_shouldLogParseError() {
        // Arrange
        CharacterReader reader = new CharacterReader("");