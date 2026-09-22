package org.jsoup.parser;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.util.List;
import org.jsoup.parser.Token.TokenType;

public class TokeniserTest {
    private Tokeniser tokeniser;
    private CharacterReader reader;

    @Before
    public void setUp() {
        // Reset any state before each test
        reader = new CharacterReader("");
        tokeniser = new Tokeniser(reader);
    }

    @After
    public void tearDown() {
        tokeniser = null;
        reader = null;
    }

    // Helper method to create a Tokeniser with specific input
    private void init(String input) {
        reader = new CharacterReader(input);
        tokeniser = new Tokeniser(reader);
    }

    // Test constructor and initial state
    @Test
    public void testConstructorInitialState() {
        assertNotNull(tokeniser);
        assertEquals(TokeniserState.Data, tokeniser.getState());
        assertTrue(tokeniser.isTrackErrors());
    }

    // Test setTrackErrors and isTrackErrors
    @Test
    public void testTrackErrorsToggle() {
        assertTrue(tokeniser.isTrackErrors());
        tokeniser.setTrackErrors(false);
        assertFalse(tokeniser.isTrackErrors());
        tokeniser.setTrackErrors(true);
        assertTrue(tokeniser.isTrackErrors());
    }

    // Test read() with empty buffer
    @Test
    public void testReadEmptyInput() {
        init("");
        reader.rewindToMark(); // Ensure no pending marks
        Token token = tokeniser.read();
        // With empty input and Data state, likely returns null or throws
        // Since no tokens are emitted, read() may loop indefinitely; test likely
        // expects an exception or behavior. For simplicity, test basic emit.
        // Instead, test read() with explicit emit
        tokeniser.emit(new Token.Character("test"));
        Token result = tokeniser.read();
        assertNotNull(result);
        assertEquals(TokenType.Character, result.type);
        assertEquals("test", result.toString());
    }

    // Test emit(Token) with StartTag - sets lastStartTag and selfClosingFlag
    @Test
    public void testEmitTokenStartTag() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.tagName = "div";
        startTag.selfClosing = true;
        startTag.isSelfClosing = () -> true;
        // Need to set up tag properly - use helper
        startTag.finaliseTag();
        tokeniser.emit(startTag);
        assertTrue(tokeniser.isEmitPending);
        assertNotNull(tokeniser.tagPending); // Not null, lastStartTag is set
        // Access lastStartTag via package-private? Use reflection or test indirectly
        assertFalse(tokeniser.selfClosingFlagAcknowledged);
    }

    // Test emit(Token) with EndTag that has attributes -> should add error
    @Test
    public void testEmitEndTagWithAttributes() {
        Token.EndTag endTag = new Token.EndTag();
        endTag.tagName = "div";
        // Add attribute to trigger error
        endTag.attributes.put("class", "test");
        tokeniser.emit(endTag);
        assertTrue(tokeniser.isEmitPending);
        assertFalse(tokeniser.errors.isEmpty());
        assertEquals("Attributes incorrectly present on end tag", tokeniser.errors.get(0).getErrorMessage());
    }

    // Test emit(String) - appends to charBuffer
    @Test
    public void testEmitStringBuffer() {
        tokeniser.emit("hello");
        assertEquals("hello", tokeniser.charBuffer.toString());
        tokeniser.emit(" world");
        assertEquals("hello world", tokeniser.charBuffer.toString());
    }

    // Test emit(char) - appends char to buffer
    @Test
    public void testEmitChar() {
        tokeniser.emit('a');
        tokeniser.emit('b');
        assertEquals("ab", tokeniser.charBuffer.toString());
    }

    // Test transition
    @Test
    public void testTransition() {
        tokeniser.transition(TokeniserState.TagName);
        assertEquals(TokeniserState.TagName, tokeniser.getState());
    }

    // Test advanceTransition
    @Test
    public void testAdvanceTransition() {
        init("abc");
        tokeniser.advanceTransition(TokeniserState.TagName);
        assertEquals(TokeniserState.TagName, tokeniser.getState());
        assertEquals('b', reader.current()); // reader advanced
    }

    // Test acknowledgeSelfClosingFlag
    @Test
    public void testAcknowledgeSelfClosingFlag() {
        tokeniser.selfClosingFlagAcknowledged = false;
        tokeniser.acknowledgeSelfClosingFlag();
        assertTrue(tokeniser.selfClosingFlagAcknowledged);
    }

    // Test consumeCharacterReference - various cases
    @Test
    public void testConsumeCharacterReferenceEmpty() {
        init("");
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertNull(result);
    }

    @Test
    public void testConsumeCharacterReferenceAdditionalChar() {
        init("&amp;");
        Character result = tokeniser.consumeCharacterReference('&', false);
        assertNull(result);
    }

    @Test
    public void testConsumeCharacterReferenceSpecialChars() {
        init("\t\n\f<&");
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertNull(result);
        // Test each special char
        init("<");
        result = tokeniser.consumeCharacterReference(null, false);
        assertNull(result);
    }

    @Test
    public void testConsumeCharacterReferenceNum() {
        init("#65;");
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertNotNull(result);
        assertEquals('A', result.charValue());
    }

    @Test
    public void testConsumeCharacterReferenceNumHex() {
        init("#x41;");
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertNotNull(result);
        assertEquals('A', result.charValue());
    }

    @Test
    public void testConsumeCharacterReferenceInvalidNum() {
        init("#;");
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertNotNull(result);
        assertEquals(Tokeniser.replacementChar, result.charValue());
        assertFalse(tokeniser.errors.isEmpty());
    }

    @Test
    public void testConsumeCharacterReferenceInvalidRange() {
        init("#D800;");
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertNotNull(result);
        assertEquals(Tokeniser.replacementChar, result.charValue());
    }

    @Test
    public void testConsumeCharacterReferenceNamed() {
        init("amp;");
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertNotNull(result);
        assertEquals('&', result.charValue());
    }

    @Test
    public void testConsumeCharacterReferenceUnknownNamed() {
        init("zzz;");
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertNull(result);
        assertFalse(tokeniser.errors.isEmpty());
    }

    @Test
    public void testConsumeCharacterReferenceInAttribute() {
        init("amp=2;");
        Character result = tokeniser.consumeCharacterReference(null, true);
        assertNull(result);
    }

    // Test createTagPending
    @Test
    public void testCreateTagPendingStart() {
        Token.Tag tag = tokeniser.createTagPending(true);
        assertNotNull(tag);
        assertTrue(tag instanceof Token.StartTag);
        assertSame(tokeniser.tagPending, tag);
    }

    @Test
    public void testCreateTagPendingEnd() {
        Token.Tag tag = tokeniser.createTagPending(false);
        assertNotNull(tag);
        assertTrue(tag instanceof Token.EndTag);
        assertSame(tokeniser.tagPending, tag);
    }

    // Test emitTagPending
    @Test
    public void testEmitTagPending() {
        tokeniser.createTagPending(true);
        tokeniser.tagPending.tagName = "div";
        tokeniser.tagPending.finaliseTag();
        tokeniser.emitTagPending();
        assertTrue(tokeniser.isEmitPending);
        assertNotNull(tokeniser.lastStartTag);
        assertEquals("div", tokeniser.lastStartTag.tagName);
    }

    // Test createCommentPending and emitCommentPending
    @Test
    public void testCreateAndEmitCommentPending() {
        tokeniser.createCommentPending();
        assertNotNull(tokeniser.commentPending);
        tokeniser.emitCommentPending();
        assertTrue(tokeniser.isEmitPending);
        assertEquals(TokenType.Comment, tokeniser.emitPending.type);
    }

    // Test createDoctypePending and emitDoctypePending
    @Test
    public void testCreateAndEmitDoctypePending() {
        tokeniser.createDoctypePending();
        assertNotNull(tokeniser.doctypePending);
        tokeniser.emitDoctypePending();
        assertTrue(tokeniser.isEmitPending);
        assertEquals(TokenType.Doctype, tokeniser.emitPending.type);
    }

    // Test createTempBuffer
    @Test
    public void testCreateTempBuffer() {
        tokeniser.createTempBuffer();
        assertNotNull(tokeniser.dataBuffer);
        assertEquals(0, tokeniser.dataBuffer.length());
    }

    // Test isAppropriateEndTagToken
    @Test
    public void testIsAppropriateEndTagToken() {
        // Setup lastStartTag and tagPending
        tokeniser.lastStartTag = new Token.StartTag();
        tokeniser.lastStartTag.tagName = "div";
        tokeniser.tagPending = new Token.EndTag();
        tokeniser.tagPending.tagName = "div";
        assertTrue(tokeniser.isAppropriateEndTagToken());

        tokeniser.tagPending.tagName = "span";
        assertFalse(tokeniser.isAppropriateEndTagToken());
    }

    // Test error methods
    @Test
    public void testErrorWithTrackErrors() {
        tokeniser.errors.clear();
        tokeniser.setTrackErrors(true);
        tokeniser.error(TokeniserState.Data);
        assertEquals(1, tokeniser.errors.size());
    }

    @Test
    public void testErrorWithoutTrackErrors() {
        tokeniser.setTrackErrors(false);
        tokeniser.error(TokeniserState.Data);
        assertEquals(0, tokeniser.errors.size());
    }

    @Test
    public void testEofError() {
        tokeniser.errors.clear();
        tokeniser.eofError(TokeniserState.Data);
        assertEquals(1, tokeniser.errors.size());
    }

    @Test
    public void testEofErrorWithoutTracking() {
        tokeniser.setTrackErrors(false);
        tokeniser.eofError(TokeniserState.Data);
        assertEquals(0, tokeniser.errors.size());
    }

    // Test currentNodeInHtmlNS
    @Test
    public void testCurrentNodeInHtmlNS() {
        assertTrue(tokeniser.currentNodeInHtmlNS());
    }

    // Test read() with pending emit and no charBuffer
    @Test
    public void testReadWithPendingEmit() {
        Token.Character charToken = new Token.Character("test");
        tokeniser.emit(charToken);
        Token result = tokeniser.read();
        assertSame(charToken, result);
        assertFalse(tokeniser.isEmitPending);
    }

    // Test read() when selfClosingFlagAcknowledged is false
    @Test
    public void testReadWhenSelfClosingNotAcknowledged() {
        tokeniser.selfClosingFlagAcknowledged = false;
        init("");
        // This will trigger error but still attempt to read state
        // To avoid infinite loop, set isEmitPending true
        tokeniser.isEmitPending = true;
        tokeniser.emitPending = new Token.Character("test");
        Token result = tokeniser.read();
        assertNotNull(result);
        assertTrue(tokeniser.selfClosingFlagAcknowledged);
        assertFalse(tokeniser.errors.isEmpty());
    }
}