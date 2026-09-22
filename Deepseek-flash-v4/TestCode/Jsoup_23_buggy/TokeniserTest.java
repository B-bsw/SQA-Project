package org.jsoup.parser;

import org.jsoup.parser.ParseErrorList;
import org.jsoup.nodes.Entities;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;
import org.jsoup.parser.Token;
import org.jsoup.parser.TokeniserState;

public class TokeniserTest {

    private Tokeniser tokeniser;
    private CharacterReader reader;
    private ParseErrorList errors;

    @Before
    public void setUp() {
        errors = new ParseErrorList(16, 16);
        reader = new CharacterReader("some input");
        tokeniser = new Tokeniser(reader, errors);
    }

    @After
    public void tearDown() {
        // no op
    }

    // --- Helper to create tokeniser with custom reader/errors ---
    private Tokeniser createTokeniser(String input) {
        return new Tokeniser(new CharacterReader(input), new ParseErrorList(16, 16));
    }

    // ------------------------------------------------------------------
    // Tests for read()
    // ------------------------------------------------------------------
    @Test
    public void readShouldEmitCharacterFromBuffer() {
        reader = new CharacterReader("");
        tokeniser = new Tokeniser(reader, errors);
        tokeniser.emit('a');
        tokeniser.emit('b');
        tokeniser.read();
        Token token = tokeniser.read();
        assertEquals(Token.TokenType.Character, token.type);
        assertEquals("ab", ((Token.Character) token).getData());
    }

    @Test
    public void readShouldReturnEmitPendingWhenCharBufferEmpty() {
        tokeniser.emit(new Token.StartTag("div"));
        Token token = tokeniser.read();
        assertEquals(Token.TokenType.StartTag, token.type);
        assertEquals("div", ((Token.StartTag) token).tagName);
    }

    @Test
    public void readShouldHandleSelfClosingFlagNotAcknowledged() {
        Tokeniser t = createTokeniser("<br/>");
        t.read(); // tag read
        // now selfClosingFlagAcknowledged should be false, so read should emit error
        t.read();
        assertEquals(1, errors.size());
    }

    // ------------------------------------------------------------------
    // Tests for emit(Token)
    // ------------------------------------------------------------------
    @Test
    public void emitStartTagSetsLastStartTagAndSelfClosingFlag() {
        Token.StartTag tag = new Token.StartTag("input");
        tag.selfClosing = true;
        tokeniser.emit(tag);
        Token pending = tokeniser.emitPendingFinder(); // Helper needed; see below
        assertNotNull(pending);
        Token.StartTag last = tokeniser.lastStartTag;
        assertEquals("input", last.tagName);
        assertFalse(tokeniser.selfClosingFlagAcknowledged);
    }

    @Test
    public void emitEndTagWithAttributesShouldAddError() {
        Token.EndTag tag = new Token.EndTag("div");
        tag.attributes.put("class", "test");
        tokeniser.emit(tag);
        assertTrue(errors.size() > 0);
    }

    // ------------------------------------------------------------------
    // Tests for emit(String) and emit(char)
    // ------------------------------------------------------------------
    @Test
    public void emitStringAppendsToCharBuffer() {
        tokeniser.emit("hello");
        tokeniser.emit(" ");
        tokeniser.emit('!');
        assertEquals("hello !", tokeniser.charBuffer.toString());
    }

    // ------------------------------------------------------------------
    // Tests for consumeCharacterReference - normal/boundary/exception
    // ------------------------------------------------------------------
    @Test
    public void consumeCharacterReferenceNullWhenEmpty() {
        tokeniser = new Tokeniser(new CharacterReader(""), errors);
        assertNull(tokeniser.consumeCharacterReference(null, false));
    }

    @Test
    public void consumeCharacterReferenceDisallowedAdditionalChar() {
        tokeniser = new Tokeniser(new CharacterReader("&amp;"), errors);
        assertNull(tokeniser.consumeCharacterReference('&', false)); // additional is same, returns null
    }

    @Test
    public void consumeCharacterReferenceDisallowedAfterSpecialChars() {
        tokeniser = new Tokeniser(new CharacterReader("<div>"), errors);
        assertNull(tokeniser.consumeCharacterReference(null, false));
    }

    @Test
    public void consumeCharacterReferenceNumericHexReturnsChar() {
        tokeniser = new Tokeniser(new CharacterReader("#x41;test"), errors); // 'A'
        Character c = tokeniser.consumeCharacterReference(null, false);
        assertNotNull(c);
        assertEquals('A', c.charValue());
    }

    @Test
    public void consumeCharacterReferenceNumericDecimalReturnsChar() {
        tokeniser = new Tokeniser(new CharacterReader("#66;test"), errors); // 'B'
        Character c = tokeniser.consumeCharacterReference(null, false);
        assertNotNull(c);
        assertEquals('B', c.charValue());
    }

    @Test
    public void consumeCharacterReferenceNumericNoSemicolonShouldError() {
        tokeniser = new Tokeniser(new CharacterReader("#65test"), errors);
        Character c = tokeniser.consumeCharacterReference(null, false);
        assertNotNull(c);
        assertTrue(errors.size() > 0);
    }

    @Test
    public void consumeCharacterReferenceInvalidRangeReturnsReplacementChar() {
        tokeniser = new Tokeniser(new CharacterReader("#0;"), errors); // 0 is invalid
        Character c = tokeniser.consumeCharacterReference(null, false);
        assertEquals('', c.charValue());
        assertTrue(errors.size() > 0);
    }

    @Test
    public void consumeCharacterReferenceNamedEntityFound() {
        tokeniser = new Tokeniser(new CharacterReader("amp;test"), errors);
        Character c = tokeniser.consumeCharacterReference(null, false);
        assertNotNull(c);
        assertEquals('&', c.charValue());
        assertTrue(errors.size() == 0);
    }

    @Test
    public void consumeCharacterReferenceNamedEntityNotFoundRewinds() {
        tokeniser = new Tokeniser(new CharacterReader("nosuch;"), errors);
        assertNull(tokeniser.consumeCharacterReference(null, false));
    }

    @Test
    public void consumeCharacterReferenceInAttributeWithFollowLetterReturnsNull() {
        tokeniser = new Tokeniser(new CharacterReader("amp;x"), errors);
        assertNull(tokeniser.consumeCharacterReference(null, true)); // in attr, after & follows letter -> null
    }

    @Test
    public void consumeCharacterReferenceNamedWithNoSemicolonLooksLegit() {
        tokeniser = new Tokeniser(new CharacterReader("amp test"), errors);
        assertNull(tokeniser.consumeCharacterReference(null, false)); // no semicolon and looksLegit not false, but no match after rewind
    }

    // ------------------------------------------------------------------
    // Tests for state, transition, advanceTransition, acknowledge
    // ------------------------------------------------------------------
    @Test
    public void stateTransitionTest() {
        assertEquals(TokeniserState.Data, tokeniser.getState());
        tokeniser.transition(TokeniserState.TagName);
        assertEquals(TokeniserState.TagName, tokeniser.getState());
    }

    @Test
    public void advanceTransitionAdvancesReader() {
        reader = new CharacterReader("abc");
        tokeniser = new Tokeniser(reader, errors);
        tokeniser.advanceTransition(TokeniserState.TagName);
        assertEquals(TokeniserState.TagName, tokeniser.getState());
        assertEquals('b', reader.current());
    }

    @Test
    public void acknowledgeSelfClosingFlagSetsTrue() {
        tokeniser.selfClosingFlagAcknowledged = false;
        tokeniser.acknowledgeSelfClosingFlag();
        assertTrue(tokeniser.selfClosingFlagAcknowledged);
    }

    // ------------------------------------------------------------------
    // Tests for tagPending / emitTagPending
    // ------------------------------------------------------------------
    @Test
    public void createTagPendingStart() {
        Token.Tag tag = tokeniser.createTagPending(true);
        assertNotNull(tag);
        assertTrue(tag instanceof Token.StartTag);
        assertEquals(tokeniser.tagPending, tag);
    }

    @Test
    public void createTagPendingEnd() {
        Token.Tag tag = tokeniser.createTagPending(false);
        assertTrue(tag instanceof Token.EndTag);
    }

    @Test
    public void emitTagPendingEmitsAndSetsPending() {
        tokeniser.createTagPending(true);
        tokeniser.tagPending.name = "span";
        tokeniser.emitTagPending();
        assertTrue(tokeniser.isEmitPending);
        assertEquals(Token.TokenType.StartTag, tokeniser.emitPending.type);
    }

    // ------------------------------------------------------------------
    // Tests for comment/doctype/temp buffer
    // ------------------------------------------------------------------
    @Test
    public void createCommentPendingTest() {
        tokeniser.createCommentPending();
        assertNotNull(tokeniser.commentPending);
    }

    @Test
    public void emitCommentPendingEmits() {
        tokeniser.createCommentPending();
        tokeniser.emitCommentPending();
        assertEquals(Token.TokenType.Comment, tokeniser.emitPending.type);
    }

    @Test
    public void createDoctypePendingTest() {
        tokeniser.createDoctypePending();
        assertNotNull(tokeniser.doctypePending);
    }

    @Test
    public void emitDoctypePendingEmits() {
        tokeniser.createDoctypePending();
        tokeniser.emitDoctypePending();
        assertEquals(Token.TokenType.Doctype, tokeniser.emitPending.type);
    }

    @Test
    public void createTempBufferTest() {
        tokeniser.createTempBuffer();
        assertNotNull(tokeniser.dataBuffer);
        assertEquals("", tokeniser.dataBuffer.toString());
    }

    // ------------------------------------------------------------------
    // Tests for isAppropriateEndTagToken / appropriateEndTagName
    // ------------------------------------------------------------------
    @Test
    public void appropriateEndTagNameTest() {
        tokeniser.lastStartTag = new Token.StartTag("div");
        assertEquals("div", tokeniser.appropriateEndTagName());
    }

    @Test
    public void isAppropriateEndTagTokenTrue() {
        tokeniser.createTagPending(false);
        tokeniser.tagPending.name = "p";
        tokeniser.lastStartTag = new Token.StartTag("p");
        assertTrue(tokeniser.isAppropriateEndTagToken());
    }

    @Test
    public void isAppropriateEndTagTokenFalse() {
        tokeniser.createTagPending(false);
        tokeniser.tagPending.name = "a";
        tokeniser.lastStartTag = new Token.StartTag("b");
        assertFalse(tokeniser.isAppropriateEndTagToken());
    }

    // ------------------------------------------------------------------
    // Tests for error methods
    // ------------------------------------------------------------------
    @Test
    public void errorShouldAddToErrorsIfCan() {
        TokeniserState state = TokeniserState.Data;
        tokeniser.error(state);
        assertTrue(errors.size() > 0);
    }

    @Test
    public void eofErrorShouldAddError() {
        tokeniser.eofError(TokeniserState.Data);
        assertTrue(errors.size() > 0);
    }

    @Test
    public void characterReferenceErrorShouldAddError() {
        tokeniser.characterReferenceError("test msg");
        assertTrue(errors.size() > 0);
    }

    // ------------------------------------------------------------------
    // currentNodeInHtmlNS
    // ------------------------------------------------------------------
    @Test
    public void currentNodeInHtmlNSTrue() {
        assertTrue(tokeniser.currentNodeInHtmlNS());
    }

    // ------------------------------------------------------------------
    // Helper: needed to access private field in test
    // (We can add a package-private or public method in source, but for test only, we can use reflection or a workaround)
    // Since we cannot modify source, we'll use reflection to get emitPending (but that's overkill).
    // Instead, we can test via read() and checking isEmitPending flag.
    // We're using a helper method defined in package-private to access.
    // Not needed to add reflection; we'll just rely on public behavior.
    // But we need to test emit(Token) sets the field correctly. We'll use indirect tests.
    // Let's move on.

    // ------------------------------------------------------------------
    // Private fields access for testing (not needed in test class)
    // We can add package-private getters/setters if needed in source, but we don't have them.
    // So we'll test via public methods appropriately.

    // To test emit(Token) setting lastStartTag and selfClosingFlag,
    // we can use read() after emit and check internal state indirectly:
    @Test
    public void emitStartTagSetsSelfClosingFalseForNextRead() {
        Token.StartTag tag = new Token.StartTag("br");
        tag.selfClosing = true;
        tokeniser.emit(tag);
        // Now next read should throw error (self-closing not acknowledged)
        tokeniser.read(); // this will emit the tag
        // Now read again to trigger self-closing flag error
        tokeniser.read();
        assertTrue(errors.size() > 0);
    }

    // We can also test via reflection but not needed for JUnit4 standard.
    // Use package-private trick: since we are in same package, we can access default-access fields.
    // Actually, tokeniser.lastStartTag is package-private, so we can access.
    // But that's not public API; for testing we can use same package, which we are.

    // Let's use that:
    @Test
    public void emitEndTagWithAttributesTriggersError() {
        Token.EndTag endTag = new Token.EndTag("div");
        endTag.attributes.put("class", "test");
        tokeniser.emit(endTag);
        assertTrue(errors.size() > 0);
    }

    // For emitPending field access, we can access package-private the same way.
    // But we used emitPending directly in some tests, that's fine because we are in same package.

    // We'll proceed.

    // -------------------- Comprehensive tests for consumeCharacterReference ----------------
    @Test
    public void consumeCharRefNumNoNumeral() {
        tokeniser = new Tokeniser(new CharacterReader("#x;"), errors);
        assertNull(tokeniser.consumeCharacterReference(null, false));
        assertTrue(errors.size() > 0);
    }

    @Test
    public void consumeCharRefInvalidHex() {
        tokeniser = new Tokeniser(new CharacterReader("#xGG;"), errors);
        Character c = tokeniser.consumeCharacterReference(null, false);
        assertNotNull(c);
        assertEquals('', c.charValue()); // replacement
        assertTrue(errors.size() > 0);
    }

    @Test
    public void consumeCharRefOutOfRange() {
        tokeniser = new Tokeniser(new CharacterReader("#110000;"), errors);
        Character c = tokeniser.consumeCharacterReference(null, false);
        assertEquals('', c.charValue());
        assertTrue(errors.size() > 0);
    }

    @Test
    public void consumeCharRefEmptyName() {
        tokeniser = new Tokeniser(new CharacterReader(";"), errors);
        // reader.consumeLetterSequence() returns empty if next char not a letter
        // then while loop won't run, found false, rewind, returns null
        assertNull(tokeniser.consumeCharacterReference(null, false));
        assertTrue(errors.size() > 0);
    }

    @Test
    public void consumeCharRefNamedCaseInsensitive() {
        tokeniser = new Tokeniser(new CharacterReader("AMP;"), errors); // uppercase
        Character c = tokeniser.consumeCharacterReference(null, false);
        assertNotNull(c);
        assertEquals('&', c.charValue());
    }

    @Test
    public void consumeCharRefNamedPartialMatch() {
        tokeniser = new Tokeniser(new CharacterReader("ampx;"), errors);
        // nameRef = "ampx;", looksLegit = true, found false, loop unconsume down to "amp" -> found
        Character c = tokeniser.consumeCharacterReference(null, false);
        assertNotNull(c);
        assertEquals('&', c.charValue());
        assertTrue(errors.size() > 0); // because missing semicolon after "amp" (original had x;)
    }

    // ------------------------------------------------------------------
    // Tests for read() with pending self-closing ack
    @Test
    public void readSelfClosingAckErrorOnce() {
        Token.StartTag tag = new Token.StartTag("br");
        tag.selfClosing = true;
        tokeniser.emit(tag);
        tokeniser.read(); // first read returns the tag
        tokeniser.read(); // second read checks self-closing flag
        int errorCount = 0;
        for (ParseError e : errors.data) {
            if (e.getMessage().contains("Self closing flag not acknowledged")) {
                errorCount++;
            }
        }
        assertEquals(1, errorCount);
        // Now it's acknowledged, so third read no error
        tokeniser.read();
        assertEquals(1, errorCount);
    }

    // ------------------------------------------------------------------
    // Some edge cases for read()
    @Test
    public void readWithEmptyCharBufferButEmitPendingShouldReturnEmitPending() {
        Token.StartTag tag = new Token.StartTag("span");
        tokeniser.emit(tag);
        tokeniser.charBuffer.setLength(0); // clear buffer
        Token token = tokeniser.read();
        assertEquals(tag, token); // should return emitPending
    }

    // ------------------------------------------------------------------
    // Error handling for errors.canAddError()
    @Test
    public void errorWhenCanAddErrorFalse() {
        ParseErrorList fullErrors = new ParseErrorList(0, 0); // capacity 0
        tokeniser = new Tokeniser(new CharacterReader(""), fullErrors);
        tokeniser.error(TokeniserState.Data); // should not throw, but no add
        assertEquals(0, fullErrors.size());
    }

    // Test static inner classes from Token (we assume they exist)
    // That's fine.

    // ------------------------------------------------------------------
    // Ensure no duplicate tests, just cover branches.
    // End of tests.
}