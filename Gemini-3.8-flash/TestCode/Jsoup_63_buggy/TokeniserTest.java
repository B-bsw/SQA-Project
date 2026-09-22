package org.jsoup.parser;

import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

public class TokeniserTest {

    @Test
    public void read_givenSelfClosingFlagNotAcknowledged_shouldAddErrorAndResetFlag() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        Token.StartTag startTag = new Token.StartTag();
        startTag.nameAttr("div", new Attributes());
        startTag.selfClosing = true;
        tokeniser.emit(startTag); // sets selfClosingFlagAcknowledged = false

        // Act
        Token token1 = tokeniser.read(); // will acknowledge and log error
        Token token2 = tokeniser.read(); // should not log another error

        // Assert
        Assert.assertEquals(Token.TokenType.StartTag, token1.type);
        Assert.assertEquals(Token.TokenType.EOF, token2.type);
        Assert.assertEquals(1, errors.size());
        Assert.assertTrue(errors.get(0).getErrorMessage().contains("Self closing flag not acknowledged"));
    }

    @Test
    public void read_givenCharsStringBuffered_shouldReturnCharacterTokenFirst() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.noTracking();
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        tokeniser.emit("hello");
        Token.Comment comment = new Token.Comment();
        tokeniser.emit(comment);

        // Act
        Token token = tokeniser.read();

        // Assert
        Assert.assertEquals(Token.TokenType.Character, token.type);
        Assert.assertEquals("hello", ((Token.Character) token).getData());

        Token nextToken = tokeniser.read();
        Assert.assertEquals(Token.TokenType.Comment, nextToken.type);
    }

    @Test
    public void read_givenMultipleCharsEmittedBeforeToken_shouldUseCharsBuilder() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.noTracking();
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        tokeniser.emit("foo");
        tokeniser.emit("bar");
        tokeniser.emit("baz");
        Token.Doctype doctype = new Token.Doctype();
        tokeniser.emit(doctype);

        // Act
        Token token = tokeniser.read();

        // Assert
        Assert.assertEquals(Token.TokenType.Character, token.type);
        Assert.assertEquals("foobarbaz", ((Token.Character) token).getData());

        Token nextToken = tokeniser.read();
        Assert.assertEquals(Token.TokenType.Doctype, nextToken.type);
    }

    @Test(expected = IllegalArgumentException.class)
    public void emit_givenEmitCalledWhileEmitPending_shouldThrowException() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.noTracking();
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        // Act
        tokeniser.emit(new Token.Comment());
        tokeniser.emit(new Token.Comment()); // should fail Validate.isFalse(isEmitPending)
    }

    @Test
    public void emit_givenEndTagWithAttributes_shouldLogError() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        Token.EndTag endTag = new Token.EndTag();
        endTag.nameAttr("div", new Attributes());
        endTag.attributes.put("class", "error");

        // Act
        tokeniser.emit(endTag);

        // Assert
        Assert.assertEquals(1, errors.size());
        Assert.assertTrue(errors.get(0).getErrorMessage().contains("Attributes incorrectly present on end tag"));
    }

    @Test
    public void emit_givenCharArrayAndIntArrayAndChar_shouldBufferStringsCorrectly() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.noTracking();
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        // Act
        tokeniser.emit(new char[]{'a', 'b'});
        tokeniser.emit(new int[]{67, 68}); // 'C', 'D'
        tokeniser.emit('e');
        tokeniser.emit(new Token.Comment());

        Token token = tokeniser.read();

        // Assert
        Assert.assertEquals(Token.TokenType.Character, token.type);
        Assert.assertEquals("abCDe", ((Token.Character) token).getData());
    }

    @Test
    public void transitionAndAdvanceTransition_shouldUpdateStateAndReader() {
        // Arrange
        CharacterReader reader = new CharacterReader("abc");
        ParseErrorList errors = ParseErrorList.noTracking();
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        // Act
        tokeniser.transition(TokeniserState.TagOpen);
        Assert.assertEquals(TokeniserState.TagOpen, tokeniser.getState());
        Assert.assertEquals('a', reader.current());

        tokeniser.advanceTransition(TokeniserState.TagName);
        Assert.assertEquals(TokeniserState.TagName, tokeniser.getState());
        Assert.assertEquals('b', reader.current());
    }

    @Test
    public void acknowledgeSelfClosingFlag_shouldSetFlagToTrue() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        Token.StartTag startTag = new Token.StartTag();
        startTag.nameAttr("img", new Attributes());
        startTag.selfClosing = true;
        tokeniser.emit(startTag);

        // Act
        tokeniser.acknowledgeSelfClosingFlag();
        tokeniser.read();

        // Assert
        Assert.assertEquals(0, errors.size());
    }

    @Test
    public void consumeCharacterReference_givenEmptyReader_shouldReturnNull() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.noTracking();
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        // Act
        int[] code = tokeniser.consumeCharacterReference(null, false);

        // Assert
        Assert.assertNull(code);
    }

    @Test
    public void consumeCharacterReference_givenAdditionalAllowedCharacter_shouldReturnNull() {
        // Arrange
        CharacterReader reader = new CharacterReader("\"test");
        ParseErrorList errors = ParseErrorList.noTracking();
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        // Act
        int[] code = tokeniser.consumeCharacterReference(Character.valueOf('"'), true);

        // Assert
        Assert.assertNull(code);
        Assert.assertEquals('"', reader.current());
    }

    @Test
    public void consumeCharacterReference_givenNotCharRefCharsSorted_shouldReturnNull() {
        // Arrange
        char[] ignoredChars = new char[]{'\t', '\n', '\r', '\f', ' ', '<', '&'};
        for (int i = 0; i < ignoredChars.length; i++) {
            CharacterReader reader = new CharacterReader(String.valueOf(ignoredChars[i]));
            ParseErrorList errors = ParseErrorList.noTracking();
            Tokeniser tokeniser = new Tokeniser(reader, errors);

            // Act
            int[] code = tokeniser.consumeCharacterReference(null, false);

            // Assert
            Assert.assertNull("Failed on char: " + (int) ignoredChars[i], code);
        }
    }

    @Test
    public void consumeCharacterReference_givenValidDecimalNumeric_shouldConsumeCorrectly() {
        // Arrange
        CharacterReader reader = new CharacterReader("#65;rest");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        // Act
        int[] code = tokeniser.consumeCharacterReference(null, false);

        // Assert
        Assert.assertNotNull(code);
        Assert.assertEquals(65, code[0]);
        Assert.assertEquals(0, errors.size());
        Assert.assertEquals("rest", reader.consumeToEnd());
    }

    @Test
    public void consumeCharacterReference_givenValidHexNumeric_shouldConsumeCorrectly() {
        // Arrange
        CharacterReader readerLower = new CharacterReader("#x41;rest");
        ParseErrorList errorsLower = ParseErrorList.tracking(10);
        Tokeniser tokeniserLower = new Tokeniser(readerLower, errorsLower);

        CharacterReader readerUpper = new CharacterReader("#X42;rest");
        ParseErrorList errorsUpper = ParseErrorList.tracking(10);
        Tokeniser tokeniserUpper = new Tokeniser(readerUpper, errorsUpper);

        // Act
        int[] codeLower = tokeniserLower.consumeCharacterReference(null, false);
        int[] codeUpper = tokeniserUpper.consumeCharacterReference(null, false);

        // Assert
        Assert.assertNotNull(codeLower);
        Assert.assertEquals(0x41, codeLower[0]);
        Assert.assertEquals(0, errorsLower.size());

        Assert.assertNotNull(codeUpper);
        Assert.assertEquals(0x42, codeUpper[0]);
        Assert.assertEquals(0, errorsUpper.size());
    }

    @Test
    public void consumeCharacterReference_givenNumericWithoutDigits_shouldErrorAndRewind() {
        // Arrange
        CharacterReader reader = new CharacterReader("#;rest");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        // Act
        int[] code = tokeniser.consumeCharacterReference(null, false);

        // Assert
        Assert.assertNull(code);
        Assert.assertEquals(1, errors.size());
        Assert.assertTrue(errors.get(0).getErrorMessage().contains("numeric reference with no numerals"));
        Assert.assertEquals("#;rest", reader.consumeToEnd());
    }

    @Test
    public void consumeCharacterReference_givenNumericMissingSemicolon_shouldAddErrorAndReturnValue() {
        // Arrange
        CharacterReader reader = new CharacterReader("#65rest");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        // Act
        int[] code = tokeniser.consumeCharacterReference(null, false);

        // Assert
        Assert.assertNotNull(code);
        Assert.assertEquals(65, code[0]);
        Assert.assertEquals(1, errors.size());
        Assert.assertTrue(errors.get(0).getErrorMessage().contains("missing semicolon"));
    }

    @Test
    public void consumeCharacterReference_givenNumericOutOfRange_shouldReturnReplacementChar() {
        // Arrange: surrogate range 0xD800, out of unicode range 0x110000
        int[] invalidValues = new int[]{0xD800, 0xDFFF, 0x110000};
        for (int i = 0; i < invalidValues.length; i++) {
            CharacterReader reader = new CharacterReader("#x" + Integer.toHexString(invalidValues[i]) + ";");
            ParseErrorList errors = ParseErrorList.tracking(10);
            Tokeniser tokeniser = new Tokeniser(reader, errors);

            // Act
            int[] code = tokeniser.consumeCharacterReference(null, false);

            // Assert
            Assert.assertNotNull(code);
            Assert.assertEquals(Tokeniser.replacementChar, code[0]);
            Assert.assertEquals(1, errors.size());
            Assert.assertTrue(errors.get(0).getErrorMessage().contains("character outside of valid range"));
        }
    }

    @Test
    public void consumeCharacterReference_givenValidNamedReferenceWithSemicolon_shouldReturnCode() {
        // Arrange
        CharacterReader reader = new CharacterReader("lt;rest");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        // Act
        int[] code = tokeniser.consumeCharacterReference(null, false);

        // Assert
        Assert.assertNotNull(code);
        Assert.assertEquals('<', code[0]);
        Assert.assertEquals(0, errors.size());
        Assert.assertEquals("rest", reader.consumeToEnd());
    }

    @Test
    public void consumeCharacterReference_givenBaseNamedReferenceWithoutSemicolon_shouldReturnCode() {
        // Arrange
        CharacterReader reader = new CharacterReader("lt rest");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        // Act
        int[] code = tokeniser.consumeCharacterReference(null, false);

        // Assert
        Assert.assertNotNull(code);
        Assert.assertEquals('<', code[0]);
        Assert.assertEquals(1, errors.size());
        Assert.assertTrue(errors.get(0).getErrorMessage().contains("missing semicolon"));
    }

    @Test
    public void consumeCharacterReference_givenUnknownNamedReferenceWithSemicolon_shouldErrorAndRewind() {
        // Arrange
        CharacterReader reader = new CharacterReader("notARealEntity;rest");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        // Act
        int[] code = tokeniser.consumeCharacterReference(null, false);

        // Assert
        Assert.assertNull(code);
        Assert.assertEquals(1, errors.size());
        Assert.assertTrue(errors.get(0).getErrorMessage().contains("invalid named referenece"));
        Assert.assertEquals("notARealEntity;rest", reader.consumeToEnd());
    }

    @Test
    public void consumeCharacterReference_givenUnknownNamedReferenceWithoutSemicolon_shouldRewindWithoutError() {
        // Arrange
        CharacterReader reader = new CharacterReader("notARealEntity rest");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        // Act
        int[] code = tokeniser.consumeCharacterReference(null, false);

        // Assert
        Assert.assertNull(code);
        Assert.assertEquals(0, errors.size());
        Assert.assertEquals("notARealEntity rest", reader.consumeToEnd());
    }

    @Test
    public void consumeCharacterReference_givenInAttributeFollowByAlphaNumOrSpecial_shouldRewindAndReturnNull() {
        // Arrange
        CharacterReader reader = new CharacterReader("lt=123");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        // Act
        int[] code = tokeniser.consumeCharacterReference(null, true);

        // Assert
        Assert.assertNull(code);
        Assert.assertEquals(0, errors.size());
        Assert.assertEquals("lt=123", reader.consumeToEnd());
    }

    @Test
    public void tagPendingAndAppropriateEndTag_shouldBehaveCorrectly() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.noTracking();
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        Assert.assertNull(tokeniser.appropriateEndTagName());
        Assert.assertFalse(tokeniser.isAppropriateEndTagToken());

        // Create StartTag
        Token.Tag startTag = tokeniser.createTagPending(true);
        startTag.nameAttr("title", new Attributes());
        tokeniser.emitTagPending();

        Assert.assertEquals("title", tokeniser.appropriateEndTagName());

        // Create EndTag matching
        Token.Tag endTag = tokeniser.createTagPending(false);
        endTag.nameAttr("TITLE", new Attributes());
        Assert.assertTrue(tokeniser.isAppropriateEndTagToken());

        // Create EndTag not matching
        endTag.nameAttr("body", new Attributes());
        Assert.assertFalse(tokeniser.isAppropriateEndTagToken());
    }

    @Test
    public void createAndEmitCommentPending_shouldEmitCommentToken() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.noTracking();
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        // Act
        tokeniser.createCommentPending();
        tokeniser.commentPending.data.append("test comment");
        tokeniser.emitCommentPending();

        Token token = tokeniser.read();

        // Assert
        Assert.assertEquals(Token.TokenType.Comment, token.type);
        Assert.assertEquals("test comment", ((Token.Comment) token).getData());
    }

    @Test
    public void createAndEmitDoctypePending_shouldEmitDoctypeToken() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.noTracking();
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        // Act
        tokeniser.createDoctypePending();
        tokeniser.doctypePending.name.append("html");
        tokeniser.emitDoctypePending();

        Token token = tokeniser.read();

        // Assert
        Assert.assertEquals(Token.TokenType.Doctype, token.type);
        Assert.assertEquals("html", ((Token.Doctype) token).getName());
    }

    @Test
    public void createTempBuffer_shouldResetDataBuffer() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.noTracking();
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        tokeniser.dataBuffer.append("initial text");
        Assert.assertTrue(tokeniser.dataBuffer.length() > 0);

        // Act
        tokeniser.createTempBuffer();

        // Assert
        Assert.assertEquals(0, tokeniser.dataBuffer.length());
    }

    @Test
    public void errorLogging_shouldRecordErrorsWhenTracking() {
        // Arrange
        CharacterReader reader = new CharacterReader("x");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        // Act
        tokeniser.error(TokeniserState.Data);
        tokeniser.eofError(TokeniserState.TagOpen);
        tokeniser.error("Custom error occurred");

        // Assert
        Assert.assertEquals(3, errors.size());
        Assert.assertTrue(errors.get(0).getErrorMessage().contains("Unexpected character"));
        Assert.assertTrue(errors.get(1).getErrorMessage().contains("Unexpectedly reached end of file"));
        Assert.assertTrue(errors.get(2).getErrorMessage().contains("Custom error occurred"));
    }

    @Test
    public void errorLogging_givenNoTracking_shouldNotRecordErrors() {
        // Arrange
        CharacterReader reader = new CharacterReader("x");
        ParseErrorList errors = ParseErrorList.noTracking();
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        // Act
        tokeniser.error(TokeniserState.Data);
        tokeniser.eofError(TokeniserState.TagOpen);
        tokeniser.error("Custom error occurred");

        // Assert
        Assert.assertEquals(0, errors.size());
    }

    @Test
    public void currentNodeInHtmlNS_shouldReturnTrue() {
        // Arrange
        CharacterReader reader = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.noTracking();
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        // Act & Assert
        Assert.assertTrue(tokeniser.currentNodeInHtmlNS());
    }

    @Test
    public void unescapeEntities_givenPlainText_shouldReturnUnchanged() {
        // Arrange
        CharacterReader reader = new CharacterReader("Hello world!");
        ParseErrorList errors = ParseErrorList.noTracking();
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        // Act
        String result = tokeniser.unescapeEntities(false);

        // Assert
        Assert.assertEquals("Hello world!", result);
    }

    @Test
    public void unescapeEntities_givenEscapedEntities_shouldDecodeCorrectly() {
        // Arrange
        CharacterReader reader = new CharacterReader("One &amp; Two &lt; Three &#65; &#x42;");
        ParseErrorList errors = ParseErrorList.noTracking();
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        // Act
        String result = tokeniser.unescapeEntities(false);

        // Assert
        Assert.assertEquals("One & Two < Three A B", result);
    }

    @Test
    public void unescapeEntities_givenInvalidEntity_shouldKeepAmpersand() {
        // Arrange
        CharacterReader reader = new CharacterReader("& &notARealEntity;");
        ParseErrorList errors = ParseErrorList.noTracking();
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        // Act
        String result = tokeniser.unescapeEntities(false);

        // Assert
        Assert.assertEquals("& &notARealEntity;", result);
    }
}