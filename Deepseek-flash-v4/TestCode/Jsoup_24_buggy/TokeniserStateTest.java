package org.jsoup.parser;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class TokeniserStateTest {

    private MockTokeniser tokeniser;
    private MockCharacterReader reader;

    @Before
    public void setUp() {
        tokeniser = new MockTokeniser();
        reader = new MockCharacterReader();
    }

    private void readState(TokeniserState state) {
        state.read(tokeniser, reader);
    }

    // ---------- Data state ----------
    @Test
    public void testDataDefault() {
        reader.setCurrent('a');
        reader.setConsumeToAnyResult("abc");
        readState(TokeniserState.Data);
        assertEquals("abc", tokeniser.getEmitted().get(0));
        assertNull(tokeniser.getNextState());
    }

    @Test
    public void testDataAmpersand() {
        reader.setCurrent('&');
        readState(TokeniserState.Data);
        assertEquals(TokeniserState.CharacterReferenceInData, tokeniser.getNextState());
    }

    @Test
    public void testDataLessThan() {
        reader.setCurrent('<');
        readState(TokeniserState.Data);
        assertEquals(TokeniserState.TagOpen, tokeniser.getNextState());
    }

    @Test
    public void testDataNullChar() {
        reader.setCurrent('\u0000');
        readState(TokeniserState.Data);
        assertTrue(tokeniser.errorCount() > 0);
        assertFalse(tokeniser.getEmitted().isEmpty());
    }

    @Test
    public void testDataEOF() {
        reader.setEmpty();
        readState(TokeniserState.Data);
        assertEquals("EOF", tokeniser.getEmitted().get(0));
    }

    // ---------- TagOpen state ----------
    @Test
    public void testTagOpenBang() {
        reader.setCurrent('!');
        readState(TokeniserState.TagOpen);
        assertEquals(TokeniserState.MarkupDeclarationOpen, tokeniser.getNextState());
    }

    @Test
    public void testTagOpenSlash() {
        reader.setCurrent('/');
        readState(TokeniserState.TagOpen);
        assertEquals(TokeniserState.EndTagOpen, tokeniser.getNextState());
    }

    @Test
    public void testTagOpenQuestion() {
        reader.setCurrent('?');
        readState(TokeniserState.TagOpen);
        assertEquals(TokeniserState.BogusComment, tokeniser.getNextState());
    }

    @Test
    public void testTagOpenLetter() {
        reader.setCurrent('a');
        reader.setLetterMatch(true);
        readState(TokeniserState.TagOpen);
        assertEquals(TokeniserState.TagName, tokeniser.getNextState());
    }

    @Test
    public void testTagOpenOther() {
        reader.setCurrent('+');
        reader.setLetterMatch(false);
        readState(TokeniserState.TagOpen);
        assertTrue(tokeniser.errorCount() > 0);
        assertEquals("<", tokeniser.getEmitted().get(0));
        assertEquals(TokeniserState.Data, tokeniser.getNextState());
    }

    // ---------- EndTagOpen state ----------
    @Test
    public void testEndTagOpenEmpty() {
        reader.setEmpty();
        readState(TokeniserState.EndTagOpen);
        assertTrue(tokeniser.errorCount() > 0);
        assertEquals("</", tokeniser.getEmitted().get(0));
        assertEquals(TokeniserState.Data, tokeniser.getNextState());
    }

    @Test
    public void testEndTagOpenLetter() {
        reader.setCurrent('a');
        reader.setLetterMatch(true);
        readState(TokeniserState.EndTagOpen);
        assertEquals(TokeniserState.TagName, tokeniser.getNextState());
    }

    @Test
    public void testEndTagOpenGreater() {
        reader.setCurrent('>');
        reader.setLetterMatch(false);
        readState(TokeniserState.EndTagOpen);
        assertTrue(tokeniser.errorCount() > 0);
        assertEquals(TokeniserState.Data, tokeniser.getNextState());
    }

    @Test
    public void testEndTagOpenOther() {
        reader.setCurrent('x');
        reader.setLetterMatch(false);
        readState(TokeniserState.EndTagOpen);
        assertTrue(tokeniser.errorCount() > 0);
        assertEquals(TokeniserState.BogusComment, tokeniser.getNextState());
    }

    // ---------- TagName state ----------
    @Test
    public void testTagNameEndWithSlash() {
        reader.setCurrent(' ');
        reader.setConsumeToAnyResult("div");
        reader.setPostConsumeChar('/');
        readState(TokeniserState.TagName);
        assertEquals(TokeniserState.SelfClosingStartTag, tokeniser.getNextState());
    }

    @Test
    public void testTagNameEndWithGreater() {
        reader.setCurrent(' ');
        reader.setConsumeToAnyResult("span");
        reader.setPostConsumeChar('>');
        readState(TokeniserState.TagName);
        assertEquals(TokeniserState.Data, tokeniser.getNextState());
    }

    @Test
    public void testTagNameEndWithWhitespace() {
        reader.setCurrent(' ');
        reader.setConsumeToAnyResult("div");
        reader.setPostConsumeChar('\t');
        readState(TokeniserState.TagName);
        assertEquals(TokeniserState.BeforeAttributeName, tokeniser.getNextState());
    }

    @Test
    public void testTagNameEOF() {
        reader.setEmpty();
        reader.setConsumeToAnyResult("div");
        reader.setPostConsumeChar(CharacterReader.EOF);
        readState(TokeniserState.TagName);
        assertTrue(tokeniser.errorCount() > 0);
        assertEquals(TokeniserState.Data, tokeniser.getNextState());
    }

    // ---------- SelfClosingStartTag state ----------
    @Test
    public void testSelfClosingGreater() {
        reader.setCurrent('>');
        readState(TokeniserState.SelfClosingStartTag);
        assertTrue(tokeniser.tagPending.selfClosing);
        assertEquals(TokeniserState.Data, tokeniser.getNextState());
    }

    @Test
    public void testSelfClosingEOF() {
        reader.setEmpty();
        readState(TokeniserState.SelfClosingStartTag);
        assertEquals(TokeniserState.Data, tokeniser.getNextState());
    }

    @Test
    public void testSelfClosingOther() {
        reader.setCurrent('a');
        readState(TokeniserState.SelfClosingStartTag);
        assertTrue(tokeniser.errorCount() > 0);
        assertEquals(TokeniserState.BeforeAttributeName, tokeniser.getNextState());
    }

    // ---------- CommentStart state ----------
    @Test
    public void testCommentStartDash() {
        reader.setCurrent('-');
        readState(TokeniserState.CommentStart);
        assertEquals(TokeniserState.CommentStartDash, tokeniser.getNextState());
    }

    @Test
    public void testCommentStartNull() {
        reader.setCurrent('\u0000');
        readState(TokeniserState.CommentStart);
        assertTrue(tokeniser.errorCount() > 0);
        assertEquals(TokeniserState.Comment, tokeniser.getNextState());
    }

    @Test
    public void testCommentStartGreater() {
        reader.setCurrent('>');
        readState(TokeniserState.CommentStart);
        assertTrue(tokeniser.errorCount() > 0);
        assertEquals(TokeniserState.Data, tokeniser.getNextState());
    }

    // ---------- CommentEnd state ----------
    @Test
    public void testCommentEndGreater() {
        reader.setCurrent('>');
        readState(TokeniserState.CommentEnd);
        assertEquals(TokeniserState.Data, tokeniser.getNextState());
    }

    @Test
    public void testCommentEndNull() {
        reader.setCurrent('\u0000');
        readState(TokeniserState.CommentEnd);
        assertTrue(tokeniser.errorCount() > 0);
        assertEquals(TokeniserState.Comment, tokeniser.getNextState());
    }

    @Test
    public void testCommentEndBang() {
        reader.setCurrent('!');
        readState(TokeniserState.CommentEnd);
        assertTrue(tokeniser.errorCount() > 0);
        assertEquals(TokeniserState.CommentEndBang, tokeniser.getNextState());
    }

    // ---------- Doctype state ----------
    @Test
    public void testDoctypeWhitespace() {
        reader.setCurrent('\t');
        readState(TokeniserState.Doctype);
        assertEquals(TokeniserState.BeforeDoctypeName, tokeniser.getNextState());
    }

    @Test
    public void testDoctypeEOF() {
        reader.setEmpty();
        readState(TokeniserState.Doctype);
        assertTrue(tokeniser.errorCount() > 0);
        assertEquals(TokeniserState.Data, tokeniser.getNextState());
    }

    @Test
    public void testDoctypeOther() {
        reader.setCurrent('X');
        readState(TokeniserState.Doctype);
        assertTrue(tokeniser.errorCount() > 0);
        assertEquals(TokeniserState.BeforeDoctypeName, tokeniser.getNextState());
    }

    // ---------- BeforeAttributeName state ----------
    @Test
    public void testBeforeAttrNameWhitespace() {
        reader.setCurrent('\t');
        readState(TokeniserState.BeforeAttributeName);
        assertNull(tokeniser.getNextState()); // stays in same state
    }

    @Test
    public void testBeforeAttrNameSlash() {
        reader.setCurrent('/');
        readState(TokeniserState.BeforeAttributeName);
        assertEquals(TokeniserState.SelfClosingStartTag, tokeniser.getNextState());
    }

    @Test
    public void testBeforeAttrNameGreater() {
        reader.setCurrent('>');
        readState(TokeniserState.BeforeAttributeName);
        assertEquals(TokeniserState.Data, tokeniser.getNextState());
    }

    @Test
    public void testBeforeAttrNameOther() {
        reader.setCurrent('x');
        readState(TokeniserState.BeforeAttributeName);
        assertEquals(TokeniserState.AttributeName, tokeniser.getNextState());
    }

    // ---------- AttributeValue_doubleQuoted state ----------
    @Test
    public void testAttrValueDoubleQuotedEnd() {
        reader.setCurrent('"');
        reader.setConsumeToAnyResult("value");
        readState(TokeniserState.AttributeValue_doubleQuoted);
        assertEquals(TokeniserState.AfterAttributeValue_quoted, tokeniser.getNextState());
    }

    // ---------- BogusComment state ----------
    @Test
    public void testBogusComment() {
        reader.setCurrent('>');
        reader.setConsumeToResult("comment text");
        readState(TokeniserState.BogusComment);
        assertEquals(TokeniserState.Data, tokeniser.getNextState());
        assertTrue(tokeniser.getEmitted().get(0).contains("Comment"));
    }

    // ---------- CdataSection state ----------
    @Test
    public void testCdataSection() {
        reader.setCurrent(']');
        reader.setConsumeToResult("some cdata");
        readState(TokeniserState.CdataSection);
        assertEquals(TokeniserState.Data, tokeniser.getNextState());
        assertTrue(tokeniser.getEmitted().get(0).contains("some cdata"));
    }

    // ------------------------------------------------------------
    // Inner mock classes (plain Java objects, no external libs)
    // ------------------------------------------------------------
    static class MockTokeniser extends Tokeniser {
        private TokeniserState nextState;
        private List<String> emitted = new ArrayList<>();
        private List<String> errors = new ArrayList<>();
        public Token.Tag tagPending = new Token.Tag();
        public Token.Comment commentPending;
        public Token.Doctype doctypePending;

        public MockTokeniser() {
            super(null, null, null);
        }

        @Override
        public void advanceTransition(TokeniserState state) { this.nextState = state; }
        @Override
        public void transition(TokeniserState state) { this.nextState = state; }
        @Override
        public void emit(String str) { emitted.add(str); }
        @Override
        public void emit(char c) { emitted.add(String.valueOf(c)); }
        @Override
        public void emit(Token token) { emitted.add(token.getClass().getSimpleName()); }
        @Override
        public void error(TokeniserState state) { errors.add(state.name()); }
        @Override
        public void eofError(TokeniserState state) { errors.add("eof:" + state.name()); }
        @Override
        public void createTagPending(boolean start) { tagPending = new Token.Tag(); }
        @Override
        public void createCommentPending() { commentPending = new Token.Comment(); }
        @Override
        public void emitTagPending() { emitted.add("Tag:" + (tagPending != null ? tagPending.toString() : "null")); }
        @Override
        public void emitCommentPending() { emitted.add("Comment:" + (commentPending != null ? commentPending.data : "null")); }
        @Override
        public void createDoctypePending() { doctypePending = new Token.Doctype(); }
        @Override
        public void emitDoctypePending() { emitted.add("Doctype:" + (doctypePending != null ? doctypePending.name : "null")); }
        @Override
        public void createTempBuffer() { }
        @Override
        public Character consumeCharacterReference(Character additionalAllowed, boolean inAttribute) { return null; }
        @Override
        public boolean isAppropriateEndTagToken() { return false; }
        @Override
        public String appropriateEndTagName() { return "script"; }

        public TokeniserState getNextState() { return nextState; }
        public List<String> getEmitted() { return emitted; }
        public int errorCount() { return errors.size(); }
    }

    static class MockCharacterReader extends CharacterReader {
        private char currentChar;
        private boolean empty;
        private boolean letterMatch;
        private String consumeToAnyResult = "";
        private String consumeToResult = "";
        private char postConsumeChar;

        public MockCharacterReader() {
            super(""); // dummy string
        }

        public void setCurrent(char c) { this.currentChar = c; this.empty = false; }
        public void setEmpty() { this.empty = true; this.currentChar = CharacterReader.EOF; }
        public void setLetterMatch(boolean b) { this.letterMatch = b; }
        public void setConsumeToAnyResult(String s) { this.consumeToAnyResult = s; }
        public void setConsumeToResult(String s) { this.consumeToResult = s; }
        public void setPostConsumeChar(char c) { this.postConsumeChar = c; }

        @Override public char current() { return empty ? CharacterReader.EOF : currentChar; }
        @Override public char consume() { return postConsumeChar; } // simplified
        @Override public boolean isEmpty() { return empty; }
        @Override public boolean matchesLetter() { return letterMatch; }
        @Override public boolean matches(char c) { return currentChar == c; }
        @Override public String consumeToAny(char... chars) { return consumeToAnyResult; }
        @Override public String consumeTo(char c) { return consumeToResult; }
        @Override public String consumeTo(String seq) { return ""; }
        @Override public void advance() { }
        @Override public void unconsume() { }
        @Override public boolean matchConsume(String seq) { return false; }
        @Override public boolean matchConsumeIgnoreCase(String seq) { return false; }
        @Override public String consumeLetterSequence() { return "x"; }
        @Override public boolean containsIgnoreCase(String seq) { return false; }
    }
}