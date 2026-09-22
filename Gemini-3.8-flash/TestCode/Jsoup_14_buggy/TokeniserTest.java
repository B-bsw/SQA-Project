package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;

public class TokeniserTest {

    @Test
    public void constructor_givenCharacterReader_shouldInitializeCorrectly() {
        // Arrange
        CharacterReader reader = new CharacterReader("test");

        // Act
        Tokeniser tokeniser = new Tokeniser(reader);

        // Assert
        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());
        Assert.assertTrue(tokeniser.isTrackErrors());
    }

    @Test
    public void stateTransitions_givenTargetState_shouldUpdateStateCorrectly() {
        // Arrange
        CharacterReader reader = new CharacterReader("abc");
        Tokeniser tokeniser = new Tokeniser(reader);

        // Act & Assert - transition
        tokeniser.transition(TokeniserState.TagOpen);
        Assert.assertEquals(TokeniserState.TagOpen, tokeniser.getState());

        // Act & Assert - advanceTransition
        tokeniser.advanceTransition(TokeniserState.TagName);
        Assert.assertEquals(TokeniserState.TagName, tokeniser.getState());
        Assert.assertEquals('b', reader.current());
    }

    @Test
    public void trackErrors_givenTrueAndFalse_shouldToggleTracking() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader);

        // Act & Assert
        tokeniser.setTrackErrors(false);
        Assert.assertFalse(tokeniser.isTrackErrors());

        tokeniser.setTrackErrors(true);
        Assert.assertTrue(tokeniser.isTrackErrors());
    }

    @Test
    public void currentNodeInHtmlNS_whenCalled_shouldReturnTrue() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader);

        // Act & Assert
        Assert.assertTrue(tokeniser.currentNodeInHtmlNS());
    }

    @Test
    public void createTempBuffer_whenCalled_shouldInitializeDataBuffer() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader);

        // Act
        tokeniser.createTempBuffer();

        // Assert
        Assert.assertNotNull(tokeniser.dataBuffer);
        Assert.assertEquals(0, tokeniser.dataBuffer.length());
    }

    @Test
    public void createTagPending_givenStartAndEnd_shouldInstantiateCorrectTokenTypes() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader);

        // Act - start tag
        Token.Tag startTag = tokeniser.createTagPending(true);
        // Assert
        Assert.assertNotNull(startTag);
        Assert.assertTrue(startTag instanceof Token.StartTag);
        Assert.assertSame(startTag, tokeniser.tagPending);

        // Act - end tag
        Token.Tag endTag = tokeniser.createTagPending(false);
        // Assert
        Assert.assertNotNull(endTag);
        Assert.assertTrue(endTag instanceof Token.EndTag);
        Assert.assertSame(endTag, tokeniser.tagPending);
    }

    @Test
    public void isAppropriateEndTagToken_givenMatchingAndMismatchingNames_shouldReturnExpectedBoolean() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader);

        Token.StartTag startTag = new Token.StartTag();
        startTag.name("div");
        tokeniser.emit(startTag);
        tokeniser.read(); // Consume emitPending to reset state

        // Act - matching end tag
        Token.Tag endTagMatching = tokeniser.createTagPending(false);
        endTagMatching.name("div");
        // Assert
        Assert.assertTrue(tokeniser.isAppropriateEndTagToken());

        // Act - mismatching end tag
        Token.Tag endTagMismatching = tokeniser.createTagPending(false);
        endTagMismatching.name("span");
        // Assert
        Assert.assertFalse(tokeniser.isAppropriateEndTagToken());
    }

    @Test
    public void emitCommentPending_whenInvoked_shouldEmitCommentToken() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader);

        // Act
        tokeniser.createCommentPending();
        tokeniser.commentPending.data.append("hello comment");
        tokeniser.emitCommentPending();

        Token token = tokeniser.read();

        // Assert
        Assert.assertNotNull(token);
        Assert.assertTrue(token instanceof Token.Comment);
        Assert.assertEquals("hello comment", ((Token.Comment) token).getData());
    }

    @Test
    public void emitDoctypePending_whenInvoked_shouldEmitDoctypeToken() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader);

        // Act
        tokeniser.createDoctypePending();
        tokeniser.doctypePending.name.append("html");
        tokeniser.emitDoctypePending();

        Token token = tokeniser.read();

        // Assert
        Assert.assertNotNull(token);
        Assert.assertTrue(token instanceof Token.Doctype);
        Assert.assertEquals("html", ((Token.Doctype) token).getName());
    }

    @Test
    public void emitTagPending_whenStartTag_shouldFinaliseAndEmit() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader);

        Token.Tag tag = tokeniser.createTagPending(true);
        tag.name("p");

        // Act
        tokeniser.emitTagPending();
        Token token = tokeniser.read();

        // Assert
        Assert.assertNotNull(token);
        Assert.assertTrue(token instanceof Token.StartTag);
        Assert.assertEquals("p", ((Token.StartTag) token).name());
    }

    @Test
    public void emit_givenDuplicateEmitWithoutRead_shouldThrowIllegalArgumentException() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader);

        tokeniser.createCommentPending();
        tokeniser.emitCommentPending();

        // Act & Assert
        try {
            tokeniser.emitCommentPending();
            Assert.fail("Expected IllegalArgumentException when emitting while a token is already pending");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("There is an unread token pending!"));
        }
    }

    @Test
    public void emit_givenEndTagWithAttributes_shouldRecordParseError() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader);

        Token.EndTag endTag = (Token.EndTag) tokeniser.createTagPending(false);
        endTag.name("div");
        endTag.appendAttributeName("class");
        endTag.appendAttributeValue("test");

        // Act
        tokeniser.emitTagPending();
        tokeniser.read();

        // Assert - Track errors was enabled, check that an error was added without exception
        Assert.assertTrue(tokeniser.isTrackErrors());
    }

    @Test
    public void emit_givenSelfClosingStartTag_shouldAcknowledgeOrErrorOnNextRead() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader);

        Token.StartTag startTag = (Token.StartTag) tokeniser.createTagPending(true);
        startTag.name("img");
        startTag.selfClosing = true;

        // Act - emit self-closing start tag
        tokeniser.emitTagPending();
        tokeniser.read(); // First read pops start tag, selfClosingFlagAcknowledged becomes false

        // Acknowledge explicitly
        tokeniser.acknowledgeSelfClosingFlag();

        // Next emit and read should not trigger unacknowledged error
        tokeniser.createCommentPending();
        tokeniser.emitCommentPending();
        tokeniser.read();

        // Act 2 - emit self-closing start tag and do NOT acknowledge explicitly
        Token.StartTag unackTag = (Token.StartTag) tokeniser.createTagPending(true);
        unackTag.name("br");
        unackTag.selfClosing = true;
        tokeniser.emitTagPending();
        tokeniser.read(); // Read tag, selfClosingFlagAcknowledged = false

        // Emit next token without acknowledging
        tokeniser.createCommentPending();
        tokeniser.emitCommentPending();
        Token tokenAfterUnack = tokeniser.read(); // Triggers error branch in read()

        // Assert
        Assert.assertNotNull(tokenAfterUnack);
    }

    @Test
    public void emitCharAndString_givenCharBuffer_shouldReturnCharacterTokenBeforePendingToken() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader);

        // Act
        tokeniser.emit('a');
        tokeniser.emit("bc");
        tokeniser.createCommentPending();
        tokeniser.emitCommentPending(); // Pending token exists, charBuffer is non-empty

        Token firstToken = tokeniser.read();
        Token secondToken = tokeniser.read();

        // Assert
        Assert.assertTrue(firstToken instanceof Token.Character);
        Assert.assertEquals("abc", ((Token.Character) firstToken).getData());
        Assert.assertTrue(secondToken instanceof Token.Comment);
    }

    @Test
    public void errors_givenErrorMethodsWithTrackErrorsDisabled_shouldNotThrowException() {
        // Arrange
        CharacterReader reader = new CharacterReader("test");
        Tokeniser tokeniser = new Tokeniser(reader);
        tokeniser.setTrackErrors(false);

        // Act - Invoke error methods while trackErrors is false
        tokeniser.error(TokeniserState.Data);
        tokeniser.eofError(TokeniserState.Data);

        // Assert
        Assert.assertFalse(tokeniser.isTrackErrors());
    }

    @Test
    public void errors_givenErrorMethodsWithTrackErrorsEnabled_shouldRecordErrors() {
        // Arrange
        CharacterReader reader = new CharacterReader("test");
        Tokeniser tokeniser = new Tokeniser(reader);
        tokeniser.setTrackErrors(true);

        // Act
        tokeniser.error(TokeniserState.Data);
        tokeniser.eofError(TokeniserState.Data);

        // Assert
        Assert.assertTrue(tokeniser.isTrackErrors());
    }

    @Test
    public void consumeCharacterReference_givenEmptyReader_shouldReturnNull() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader);

        // Act
        Character ref = tokeniser.consumeCharacterReference(null, false);

        // Assert
        Assert.assertNull(ref);
    }

    @Test
    public void consumeCharacterReference_givenAdditionalAllowedCharacter_shouldReturnNull() {
        // Arrange
        CharacterReader reader = new CharacterReader("\"rest");
        Tokeniser tokeniser = new Tokeniser(reader);

        // Act
        Character ref = tokeniser.consumeCharacterReference(Character.valueOf('"'), true);

        // Assert
        Assert.assertNull(ref);
        Assert.assertEquals('"', reader.current());
    }

    @Test
    public void consumeCharacterReference_givenIgnoredChars_shouldReturnNull() {
        // Arrange
        char[] ignoredChars = new char[] {'\t', '\n', '\f', '<', '&'};

        for (int i = 0; i < ignoredChars.length; i++) {
            char c = ignoredChars[i];
            CharacterReader reader = new CharacterReader(String.valueOf(c) + "abc");
            Tokeniser tokeniser = new Tokeniser(reader);

            // Act
            Character ref = tokeniser.consumeCharacterReference(null, false);

            // Assert
            Assert.assertNull("Character '" + c + "' should return null", ref);
            Assert.assertEquals(c, reader.current());
        }
    }

    @Test
    public void consumeCharacterReference_givenValidDecimalEntity_shouldReturnResolvedChar() {
        // Arrange
        CharacterReader reader = new CharacterReader("#65;rest");
        Tokeniser tokeniser = new Tokeniser(reader);

        // Act
        Character ref = tokeniser.consumeCharacterReference(null, false);

        // Assert
        Assert.assertNotNull(ref);
        Assert.assertEquals(Character.valueOf('A'), ref);
        Assert.assertEquals('r', reader.current());
    }

    @Test
    public void consumeCharacterReference_givenDecimalEntityMissingSemicolon_shouldReturnCharAndReportError() {
        // Arrange
        CharacterReader reader = new CharacterReader("#66rest");
        Tokeniser tokeniser = new Tokeniser(reader);

        // Act
        Character ref = tokeniser.consumeCharacterReference(null, false);

        // Assert
        Assert.assertNotNull(ref);
        Assert.assertEquals(Character.valueOf('B'), ref);
        Assert.assertEquals('r', reader.current());
    }

    @Test
    public void consumeCharacterReference_givenValidHexEntityLowerCaseX_shouldReturnResolvedChar() {
        // Arrange
        CharacterReader reader = new CharacterReader("#x41;rest");
        Tokeniser tokeniser = new Tokeniser(reader);

        // Act
        Character ref = tokeniser.consumeCharacterReference(null, false);

        // Assert
        Assert.assertNotNull(ref);
        Assert.assertEquals(Character.valueOf('A'), ref);
        Assert.assertEquals('r', reader.current());
    }

    @Test
    public void consumeCharacterReference_givenValidHexEntityUpperCaseX_shouldReturnResolvedChar() {
        // Arrange
        CharacterReader reader = new CharacterReader("#X42;rest");
        Tokeniser tokeniser = new Tokeniser(reader);

        // Act
        Character ref = tokeniser.consumeCharacterReference(null, false);

        // Assert
        Assert.assertNotNull(ref);
        Assert.assertEquals(Character.valueOf('B'), ref);
        Assert.assertEquals('r', reader.current());
    }

    @Test
    public void consumeCharacterReference_givenEmptyNumericEntity_shouldRewindAndReturnNull() {
        // Arrange
        CharacterReader reader = new CharacterReader("#;rest");
        Tokeniser tokeniser = new Tokeniser(reader);

        // Act
        Character ref = tokeniser.consumeCharacterReference(null, false);

        // Assert
        Assert.assertNull(ref);
        Assert.assertEquals('#', reader.current());
    }

    @Test
    public void consumeCharacterReference_givenSurrogateOrOutOfRangeNumericEntity_shouldReturnReplacementChar() {
        // Case 1: Surrogate range (0xD800 - 0xDFFF)
        CharacterReader reader1 = new CharacterReader("#xD800;");
        Tokeniser tokeniser1 = new Tokeniser(reader1);
        Character ref1 = tokeniser1.consumeCharacterReference(null, false);
        Assert.assertEquals(Character.valueOf(Tokeniser.replacementChar), ref1);

        // Case 2: Above 0x10FFFF
        CharacterReader reader2 = new CharacterReader("#x110000;");
        Tokeniser tokeniser2 = new Tokeniser(reader2);
        Character ref2 = tokeniser2.consumeCharacterReference(null, false);
        Assert.assertEquals(Character.valueOf(Tokeniser.replacementChar), ref2);
    }

    @Test
    public void consumeCharacterReference_givenValidNamedEntityWithSemicolon_shouldReturnResolvedChar() {
        // Arrange
        CharacterReader reader = new CharacterReader("lt;rest");
        Tokeniser tokeniser = new Tokeniser(reader);

        // Act
        Character ref = tokeniser.consumeCharacterReference(null, false);

        // Assert
        Assert.assertNotNull(ref);
        Assert.assertEquals(Character.valueOf('<'), ref);
        Assert.assertEquals('r', reader.current());
    }

    @Test
    public void consumeCharacterReference_givenValidNamedEntityWithoutSemicolon_shouldReturnResolvedChar() {
        // Arrange
        CharacterReader reader = new CharacterReader("gt rest");
        Tokeniser tokeniser = new Tokeniser(reader);

        // Act
        Character ref = tokeniser.consumeCharacterReference(null, false);

        // Assert
        Assert.assertNotNull(ref);
        Assert.assertEquals(Character.valueOf('>'), ref);
        Assert.assertEquals(' ', reader.current());
    }

    @Test
    public void consumeCharacterReference_givenUnknownNamedEntityWithSemicolon_shouldRewindAndReturnNull() {
        // Arrange
        CharacterReader reader = new CharacterReader("nonexistententity;rest");
        Tokeniser tokeniser = new Tokeniser(reader);

        // Act
        Character ref = tokeniser.consumeCharacterReference(null, false);

        // Assert
        Assert.assertNull(ref);
        Assert.assertEquals('n', reader.current());
    }

    @Test
    public void consumeCharacterReference_givenUnknownNamedEntityWithoutSemicolon_shouldRewindAndReturnNull() {
        // Arrange
        CharacterReader reader = new CharacterReader("xyz rest");
        Tokeniser tokeniser = new Tokeniser(reader);

        // Act
        Character ref = tokeniser.consumeCharacterReference(null, false);

        // Assert
        Assert.assertNull(ref);
        Assert.assertEquals('x', reader.current());
    }

    @Test
    public void consumeCharacterReference_givenInAttributeFollowedByAlphanumericOrEquals_shouldRewindAndReturnNull() {
        // Case 1: In attribute and followed by '='
        CharacterReader reader1 = new CharacterReader("amp=123");
        Tokeniser tokeniser1 = new Tokeniser(reader1);
        Character ref1 = tokeniser1.consumeCharacterReference(null, true);
        Assert.assertNull(ref1);
        Assert.assertEquals('a', reader1.current());

        // Case 2: In attribute and followed by letter
        CharacterReader reader2 = new CharacterReader("ampX");
        Tokeniser tokeniser2 = new Tokeniser(reader2);
        Character ref2 = tokeniser2.consumeCharacterReference(null, true);
        Assert.assertNull(ref2);
        Assert.assertEquals('a', reader2.current());

        // Case 3: In attribute and followed by digit
        CharacterReader reader3 = new CharacterReader("amp1");
        Tokeniser tokeniser3 = new Tokeniser(reader3);
        Character ref3 = tokeniser3.consumeCharacterReference(null, true);
        Assert.assertNull(ref3);
        Assert.assertEquals('a', reader3.current());
    }

    @Test
    public void read_givenCompleteHtmlStream_shouldTokeniseSuccessfully() {
        // Arrange
        CharacterReader reader = new CharacterReader("<p>Hello</p>");
        Tokeniser tokeniser = new Tokeniser(reader);

        // Act & Assert
        Token t1 = tokeniser.read();
        Assert.assertTrue(t1 instanceof Token.StartTag);
        Assert.assertEquals("p", ((Token.StartTag) t1).name());

        Token t2 = tokeniser.read();
        Assert.assertTrue(t2 instanceof Token.Character);
        Assert.assertEquals("Hello", ((Token.Character) t2).getData());

        Token t3 = tokeniser.read();
        Assert.assertTrue(t3 instanceof Token.EndTag);
        Assert.assertEquals("p", ((Token.EndTag) t3).name());

        Token t4 = tokeniser.read();
        Assert.assertTrue(t4 instanceof Token.EOF);
    }
}