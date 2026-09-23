package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.util.ArrayList;
import java.util.List;

public class TreeBuilderTest {

    static class StubTokeniser extends Tokeniser {
        private List<Token> tokens = new ArrayList<Token>();
        private int index = 0;

        public StubTokeniser(CharacterReader reader, ParseErrorList errors) {
            super(reader, errors);
        }

        public void setTokens(List<Token> tokens) {
            this.tokens = tokens;
            this.index = 0;
        }

        @Override
        public Token read() {
            if (index < tokens.size()) {
                return tokens.get(index++);
            }
            return new Token.EOF();
        }
    }

    static class TestableTreeBuilder extends TreeBuilder {
        Token lastProcessedToken = null;
        int processCallCount = 0;
        boolean initialiseParseCalled = false;
        boolean runParserCalled = false;

        @Override
        protected boolean process(Token token) {
            lastProcessedToken = token;
            processCallCount++;
            return true;
        }

        @Override
        protected void initialiseParse(String input, String baseUri, ParseErrorList errors) {
            super.initialiseParse(input, baseUri, errors);
            initialiseParseCalled = true;
        }

        @Override
        protected void runParser() {
            runParserCalled = true;
            super.runParser();
        }

        public Document getDoc() { return doc; }
        public String getBaseUri() { return baseUri; }
        public CharacterReader getReader() { return reader; }
        public Tokeniser getTokeniser() { return tokeniser; }
        public ArrayList<Element> getStack() { return stack; }
        public ParseErrorList getErrors() { return errors; }
        public Token getLastProcessedToken() { return lastProcessedToken; }
        public int getProcessCallCount() { return processCallCount; }
        public boolean isInitialiseParseCalled() { return initialiseParseCalled; }
        public boolean isRunParserCalled() { return runParserCalled; }

        public void replaceTokeniser(Tokeniser newTokeniser) {
            this.tokeniser = newTokeniser;
        }
    }

    private TestableTreeBuilder builder;

    @Before
    public void setUp() {
        builder = new TestableTreeBuilder();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInitialiseParse_NullInput_ThrowsException() {
        builder.initialiseParse(null, "http://base", ParseErrorList.noTracking());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInitialiseParse_NullBaseUri_ThrowsException() {
        builder.initialiseParse("input", null, ParseErrorList.noTracking());
    }

    @Test
    public void testInitialiseParse_Success() {
        ParseErrorList errors = new ParseErrorList(16, 10);
        builder.initialiseParse("<html>", "http://base", errors);
        assertNotNull("doc", builder.getDoc());
        assertEquals("baseUri", "http://base", builder.getBaseUri());
        assertNotNull("reader", builder.getReader());
        assertNotNull("tokeniser", builder.getTokeniser());
        assertNotNull("stack", builder.getStack());
        assertTrue("stack empty", builder.getStack().isEmpty());
        assertSame("errors", errors, builder.getErrors());
    }

    @Test
    public void testCurrentElement_EmptyStack_ReturnsNull() {
        builder.initialiseParse("", "http://base", ParseErrorList.noTracking());
        assertNull("currentElement should be null", builder.currentElement());
    }

    @Test
    public void testCurrentElement_NonEmptyStack_ReturnsLastElement() {
        builder.initialiseParse("", "http://base", ParseErrorList.noTracking());
        Element div = new Element("div");
        builder.getStack().add(div);
        Element span = new Element("span");
        builder.getStack().add(span);
        assertSame("should be span", span, builder.currentElement());
    }

    @Test
    public void testProcessStartTag_ByName() {
        builder.initialiseParse("", "http://base", ParseErrorList.noTracking());
        boolean result = builder.processStartTag("div");
        assertTrue("process should return true", result);
        assertNotNull("lastProcessedToken", builder.getLastProcessedToken());
        assertEquals("type should be StartTag", Token.TokenType.StartTag, builder.getLastProcessedToken().type);
        Token.StartTag startTag = (Token.StartTag) builder.getLastProcessedToken();
        assertEquals("name", "div", startTag.name());
    }

    @Test
    public void testProcessStartTag_ByNameAndAttrs() {
        builder.initialiseParse("", "http://base", ParseErrorList.noTracking());
        Attributes attrs = new Attributes();
        attrs.add("class", "test");
        boolean result = builder.processStartTag("div", attrs);
        assertTrue(result);
        assertNotNull(builder.getLastProcessedToken());
        assertEquals(Token.TokenType.StartTag, builder.getLastProcessedToken().type);
        Token.StartTag startTag = (Token.StartTag) builder.getLastProcessedToken();
        assertEquals("name", "div", startTag.name());
        if (startTag.hasAttributes()) {
            assertEquals("class", startTag.attributes.get("class"));
        } else {
            fail("expected attributes");
        }
    }

    @Test
    public void testProcessEndTag_ByName() {
        builder.initialiseParse("", "http://base", ParseErrorList.noTracking());
        boolean result = builder.processEndTag("div");
        assertTrue(result);
        assertNotNull(builder.getLastProcessedToken());
        assertEquals(Token.TokenType.EndTag, builder.getLastProcessedToken().type);
        Token.EndTag endTag = (Token.EndTag) builder.getLastProcessedToken();
        assertEquals("name", "div", endTag.name());
    }

    @Test
    public void testRunParser_LoopsUntilEOF() {
        builder.initialiseParse("", "http://base", ParseErrorList.noTracking());
        StubTokeniser stub = new StubTokeniser(builder.getReader(), builder.getErrors());
        List<Token> tokens = new ArrayList<Token>();
        Token.StartTag start = new Token.StartTag();
        start.name("a");
        tokens.add(start);
        Token.EndTag end = new Token.EndTag();
        end.name("a");
        tokens.add(end);
        tokens.add(new Token.EOF());
        stub.setTokens(tokens);
        builder.replaceTokeniser(stub);
        builder.runParser();
        assertEquals("process should be called 3 times", 3, builder.getProcessCallCount());
    }

    @Test
    public void testParse_DelegatesToInitialiseParseAndRunParser() {
        class ParseSpy extends TestableTreeBuilder {
            @Override
            protected void initialiseParse(String input, String baseUri, ParseErrorList errors) {
                super.initialiseParse(input, baseUri, errors);
                StubTokeniser stub = new StubTokeniser(this.reader, this.errors);
                List<Token> tokens = new ArrayList<Token>();
                tokens.add(new Token.EOF());
                stub.setTokens(tokens);
                this.tokeniser = stub;
            }
        }
        ParseSpy spy = new ParseSpy();
        Document doc = spy.parse("", "http://base");
        assertNotNull("doc should not be null", doc);
        assertTrue("initialiseParse should be called", spy.isInitialiseParseCalled());
        assertTrue("runParser should be called", spy.isRunParserCalled());
        assertSame("doc should be from initialiseParse", spy.getDoc(), doc);
    }
}