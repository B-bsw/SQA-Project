package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class TokeniserTest {

    private ParseErrorList errors;

    @Before
    public void setUp() {
        errors = ParseErrorList.tracking(100);
    }

    private Tokeniser createTokeniser(String html) {
        CharacterReader reader = new CharacterReader(html);
        return new Tokeniser(reader, errors);
    }

    @Test
    public void constructor_givenValidParameters_shouldInitializeDefaults() {
        Tokeniser tokeniser = createTokeniser("<div>");

        assertEquals(TokeniserState.Data, tokeniser.getState());
        assertTrue(tokeniser.currentNodeInHtmlNS());
        assertNull(tokeniser.dataBuffer);
        assertNull(tokeniser.tagPending);
        assertNull(tokeniser.doctypePending);
        assertNull(tokeniser.commentPending);
    }

    @Test
    public void transition_givenTargetState_shouldUpdateState() {
        Tokeniser tokeniser = createTokeniser("hello");

        tokeniser.transition(TokeniserState.TagOpen);

        assertEquals(TokeniserState.TagOpen, tokeniser.getState());
    }

    @Test
    public void advanceTransition_givenTargetState_shouldAdvanceReaderAndSetState() {
        CharacterReader reader = new CharacterReader("abc");
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        tokeniser.advanceTransition(TokeniserState.TagName);

        assertEquals(TokeniserState.TagName, tokeniser.getState());
        assertEquals('b', reader.current());
    }

    @Test
    public void createTagPending_givenStartTag_shouldCreateStartTagInstance() {
        Tokeniser tokeniser = createTokeniser("");

        Token.Tag tag = tokeniser.createTagPending(true);

        assertNotNull(tag);
        assertSame(tag, tokeniser.tagPending);
        assertEquals(Token.TokenType.StartTag, tag.type);
    }

    @Test
    public void createTagPending_givenEndTag_shouldCreateEndTagInstance() {
        Tokeniser tokeniser = createTokeniser("");

        Token.Tag tag = tokeniser.createTagPending(false);

        assertNotNull(tag);
        assertSame(tag, tokeniser.tagPending);
        assertEquals(Token.TokenType.EndTag, tag.type);
    }

    @Test
    public void emitTagPending_givenValidTag_shouldFinaliseAndEmit() {
        Tokeniser tokeniser = createTokeniser("");
        Token.Tag tag = tokeniser.createTagPending(true);
        tag.tagName = "div";

        tokeniser.emitTagPending();
        Token token = tokeniser.read();

        assertSame(tag, token);
        assertEquals(Token.TokenType.StartTag, token.type);
    }

    @Test
    public void isAppropriateEndTagToken_givenMatchingStartAndEndTags_shouldReturnTrue() {
        Tokeniser tokeniser = createTokeniser("");
        Token.StartTag startTag = (Token.StartTag) tokeniser.createTagPending(true);
        startTag.tagName = "script";
        tokeniser.emitTagPending();

        Token.Tag endTag = tokeniser.createTagPending(false);
        endTag.tagName = "script";

        assertTrue(tokeniser.isAppropriateEndTagToken());
        assertEquals("script", tokeniser.appropriateEndTagName());
    }

    @Test
    public void isAppropriateEndTagToken_givenNonMatchingTags_shouldReturnFalse() {
        Tokeniser tokeniser = createTokeniser("");
        Token.StartTag startTag = (Token.StartTag) tokeniser.createTagPending(true);
        startTag.tagName = "script";
        tokeniser.emitTagPending();

        Token.Tag endTag = tokeniser.createTagPending(false);
        endTag.tagName = "style";

        assertFalse(tokeniser.isAppropriateEndTagToken());
    }

    @Test
    public void createCommentPending_andEmitCommentPending_shouldEmitCommentToken() {
        Tokeniser tokeniser = createTokeniser("");

        tokeniser.createCommentPending();
        assertNotNull(tokeniser.commentPending);
        tokeniser.emitCommentPending();

        Token token = tokeniser.read();
        assertEquals(Token.TokenType.Comment, token.type);
        assertSame(tokeniser.commentPending, token);
    }

    @Test
    public void createDoctypePending_andEmitDoctypePending_shouldEmitDoctypeToken() {
        Tokeniser tokeniser = createTokeniser("");

        tokeniser.createDoctypePending();
        assertNotNull(tokeniser.doctypePending);
        tokeniser.emitDoctypePending();

        Token token = tokeniser.read();
        assertEquals(Token.TokenType.Doctype, token.type);
        assertSame(tokeniser.doctypePending, token);
    }

    @Test
    public void createTempBuffer_whenInvoked_shouldInstantiateDataBuffer() {
        Tokeniser tokeniser = createTokeniser("");

        tokeniser.createTempBuffer();

        assertNotNull(tokeniser.dataBuffer);
        tokeniser.dataBuffer.append("bufferContent");
        assertEquals("bufferContent", tokeniser.dataBuffer.toString());
    }

    @Test
    public void emit_givenStringAndChar_shouldBufferAndReturnCharacterTokenBeforePendingToken() {
        Tokeniser tokeniser = createTokeniser("");

        tokeniser.emit("Hello");
        tokeniser.emit(' ');
        tokeniser.emit("World");

        tokeniser.createCommentPending();
        tokeniser.emitCommentPending();

        Token charToken = tokeniser.read();
        assertEquals(Token.TokenType.Character, charToken.type);
        assertEquals("Hello World", ((Token.Character) charToken).getData());

        Token pendingToken = tokeniser.read();
        assertEquals(Token.TokenType.Comment, pendingToken.type);
    }

    @Test
    public void emit_givenPendingAlreadyPresent_shouldThrowValidationException() {
        Tokeniser tokeniser = createTokeniser("");
        tokeniser.createCommentPending();
        tokeniser.emitCommentPending();

        try {
            tokeniser.createDoctypePending();
            tokeniser.emitDoctypePending();
            fail("Expected IllegalArgumentException when emitting while another token is pending");
        } catch (IllegalArgumentException e) {
            assertEquals("There is an unread token pending!", e.getMessage());
        }
    }

    @Test
    public void emit_givenEndTagWithAttributes_shouldLogParseError() {
        Tokeniser tokeniser = createTokeniser("");
        Token.EndTag endTag = (Token.EndTag) tokeniser.createTagPending(false);
        endTag.tagName = "div";
        endTag.attributes.put("class", "notAllowed");

        tokeniser.emitTagPending();

        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("Attributes incorrectly present on end tag"));
    }

    @Test
    public void read_givenSelfClosingStartTagUnacknowledged_shouldLogParseErrorOnNextRead() {
        Tokeniser tokeniser = createTokeniser("");
        Token.StartTag startTag = (Token.StartTag) tokeniser.createTagPending(true);
        startTag.tagName = "img";
        startTag.selfClosing = true;

        tokeniser.emitTagPending();
        Token first = tokeniser.read();
        assertSame(startTag, first);
        assertEquals(0, errors.size());

        tokeniser.createCommentPending();
        tokeniser.emitCommentPending();
        tokeniser.read();

        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("Self closing flag not acknowledged"));
    }

    @Test
    public void acknowledgeSelfClosingFlag_whenInvoked_shouldPreventUnacknowledgedError() {
        Tokeniser tokeniser = createTokeniser("");
        Token.StartTag startTag = (Token.StartTag) tokeniser.createTagPending(true);
        startTag.tagName = "br";
        startTag.selfClosing = true;

        tokeniser.emitTagPending();
        tokeniser.read();
        tokeniser.acknowledgeSelfClosingFlag();

        tokeniser.createCommentPending();
        tokeniser.emitCommentPending();
        tokeniser.read();

        assertEquals(0, errors.size());
    }

    @Test
    public void error_andEofError_whenErrorsCanBeAdded_shouldAppendErrorsWithPosition() {
        Tokeniser tokeniser = createTokeniser("abc");

        tokeniser.error(TokeniserState.Data);
        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("Unexpected character 'a' in input state [Data]"));

        tokeniser.eofError(TokeniserState.TagOpen);
        assertEquals(2, errors.size());
        assertTrue(errors.get(1).getErrorMessage().contains("Unexpectedly reached end of file (EOF) in input state [TagOpen]"));
    }

    @Test
    public void error_andEofError_whenNoTracking_shouldNotFailOrAddErrors() {
        ParseErrorList noErrors = ParseErrorList.noTracking();
        CharacterReader reader = new CharacterReader("abc");
        Tokeniser tokeniser = new Tokeniser(reader, noErrors);

        tokeniser.error(TokeniserState.Data);
        tokeniser.eofError(TokeniserState.TagOpen);

        assertEquals(0, noErrors.size());
    }

    @Test
    public void consumeCharacterReference_givenEmptyReader_shouldReturnNull() {
        Tokeniser tokeniser = createTokeniser("");

        Character result = tokeniser.consumeCharacterReference(null, false);

        assertNull(result);
    }

    @Test
    public void consumeCharacterReference_givenReaderMatchesAdditionalAllowed_shouldReturnNull() {
        Tokeniser tokeniser = createTokeniser("\"content");

        Character result = tokeniser.consumeCharacterReference(Character.valueOf('"'), false);

        assertNull(result);
    }

    @Test
    public void consumeCharacterReference_givenReaderMatchesWhitespaceOrDelimiters_shouldReturnNull() {
        char[] delimiters = new char[] {'\t', '\n', '\f', ' ', '<', '&'};
        for (int i = 0; i < delimiters.length; i++) {
            Tokeniser tokeniser = createTokeniser(String.valueOf(delimiters[i]));
            Character result = tokeniser.consumeCharacterReference(null, false);
            assertNull("Failed on delimiter: " + delimiters[i], result);
        }
    }

    @Test
    public void consumeCharacterReference_givenHexNumericEntity_shouldReturnValidCharacter() {
        Tokeniser tokeniser = createTokeniser("#x41;");

        Character result = tokeniser.consumeCharacterReference(null, false);

        assertEquals(Character.valueOf('A'), result);
        assertEquals(0, errors.size());
    }

    @Test
    public void consumeCharacterReference_givenHexNumericEntityUpperCaseX_shouldReturnValidCharacter() {
        Tokeniser tokeniser = createTokeniser("#X42;");

        Character result = tokeniser.consumeCharacterReference(null, false);

        assertEquals(Character.valueOf('B'), result);
        assertEquals(0, errors.size());
    }

    @Test
    public void consumeCharacterReference_givenHexNumericMissingSemicolon_shouldReturnCharacterAndLogError() {
        Tokeniser tokeniser = createTokeniser("#x43");

        Character result = tokeniser.consumeCharacterReference(null, false);

        assertEquals(Character.valueOf('C'), result);
        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("missing semicolon"));
    }

    @Test
    public void consumeCharacterReference_givenHexNumericWithNoNumerals_shouldRewindAndReturnNull() {
        Tokeniser tokeniser = createTokeniser("#x;");

        Character result = tokeniser.consumeCharacterReference(null, false);

        assertNull(result);
        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("numeric reference with no numerals"));
    }

    @Test
    public void consumeCharacterReference_givenDecimalNumericEntity_shouldReturnValidCharacter() {
        Tokeniser tokeniser = createTokeniser("#65;");

        Character result = tokeniser.consumeCharacterReference(null, false);

        assertEquals(Character.valueOf('A'), result);
        assertEquals(0, errors.size());
    }

    @Test
    public void consumeCharacterReference_givenDecimalNumericMissingSemicolon_shouldReturnCharacterAndLogError() {
        Tokeniser tokeniser = createTokeniser("#66");

        Character result = tokeniser.consumeCharacterReference(null, false);

        assertEquals(Character.valueOf('B'), result);
        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("missing semicolon"));
    }

    @Test
    public void consumeCharacterReference_givenDecimalNumericWithNoNumerals_shouldRewindAndReturnNull() {
        Tokeniser tokeniser = createTokeniser("#;");

        Character result = tokeniser.consumeCharacterReference(null, false);

        assertNull(result);
        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("numeric reference with no numerals"));
    }

    @Test
    public void consumeCharacterReference_givenNumericOutsideValidRange_shouldReturnReplacementChar() {
        Tokeniser tokeniser = createTokeniser("#x110000;");

        Character result = tokeniser.consumeCharacterReference(null, false);

        assertEquals(Character.valueOf(Tokeniser.replacementChar), result);
        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("character outside of valid range"));
    }

    @Test
    public void consumeCharacterReference_givenNumericInSurrogateRange_shouldReturnReplacementChar() {
        Tokeniser tokeniser = createTokeniser("#xD800;");

        Character result = tokeniser.consumeCharacterReference(null, false);

        assertEquals(Character.valueOf(Tokeniser.replacementChar), result);
        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("character outside of valid range"));
    }

    @Test
    public void consumeCharacterReference_givenNumericZero_shouldReturnNullChar() {
        Tokeniser tokeniser = createTokeniser("#0;");

        Character result = tokeniser.consumeCharacterReference(null, false);

        assertEquals(Character.valueOf('\u0000'), result);
        assertEquals(0, errors.size());
    }

    @Test
    public void consumeCharacterReference_givenNamedEntityWithSemicolon_shouldReturnResolvedChar() {
        Tokeniser tokeniser = createTokeniser("lt;");

        Character result = tokeniser.consumeCharacterReference(null, false);

        assertEquals(Character.valueOf('<'), result);
        assertEquals(0, errors.size());
    }

    @Test
    public void consumeCharacterReference_givenNamedEntityWithoutSemicolon_shouldReturnResolvedCharAndLogError() {
        Tokeniser tokeniser = createTokeniser("amp");

        Character result = tokeniser.consumeCharacterReference(null, false);

        assertEquals(Character.valueOf('&'), result);
        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("missing semicolon"));
    }

    @Test
    public void consumeCharacterReference_givenUnknownNamedWithSemicolon_shouldLogErrorAndRewind() {
        Tokeniser tokeniser = createTokeniser("unknownEntity;");

        Character result = tokeniser.consumeCharacterReference(null, false);

        assertNull(result);
        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("invalid named referenece 'unknownEntity'"));
    }

    @Test
    public void consumeCharacterReference_givenUnknownNamedWithoutSemicolon_shouldRewindWithoutError() {
        Tokeniser tokeniser = createTokeniser("unknownEntity");

        Character result = tokeniser.consumeCharacterReference(null, false);

        assertNull(result);
        assertEquals(0, errors.size());
    }

    @Test
    public void consumeCharacterReference_givenNamedEntityInAttributeFollowedByDisallowedChar_shouldRewindAndReturnNull() {
        String[] followChars = new String[] {"amp=value", "ampAvalue", "amp1value", "amp-value", "amp_value"};

        for (int i = 0; i < followChars.length; i++) {
            Tokeniser tokeniser = createTokeniser(followChars[i]);
            Character result = tokeniser.consumeCharacterReference(null, true);
            assertNull("Expected null inAttribute for pattern: " + followChars[i], result);
        }
    }

    @Test
    public void consumeCharacterReference_givenNamedEntityPartialMatch_shouldUnconsumeAndMatchPrefix() {
        CharacterReader reader = new CharacterReader("ampX");
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        Character result = tokeniser.consumeCharacterReference(null, false);

        assertEquals(Character.valueOf('&'), result);
        assertEquals('X', reader.current());
        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("missing semicolon"));
    }

    @Test
    public void read_givenStandardHtmlTokens_shouldDelegateToStateAndStreamTokens() {
        CharacterReader reader = new CharacterReader("<p>Hi</p>");
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        Token startTag = tokeniser.read();
        assertEquals(Token.TokenType.StartTag, startTag.type);
        assertEquals("p", ((Token.StartTag) startTag).name());

        Token text = tokeniser.read();
        assertEquals(Token.TokenType.Character, text.type);
        assertEquals("Hi", ((Token.Character) text).getData());

        Token endTag = tokeniser.read();
        assertEquals(Token.TokenType.EndTag, endTag.type);
        assertEquals("p", ((Token.EndTag) endTag).name());

        Token eof = tokeniser.read();
        assertEquals(Token.TokenType.EOF, eof.type);
    }
}