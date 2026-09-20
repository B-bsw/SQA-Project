package org.jsoup.parser;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Tag;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Test Suite for org.jsoup.parser.TreeBuilder
 * Target Compatibility: Java 1.4 / Java 7, JUnit 4, No external mock libraries.
 */
public class TreeBuilderTest {

    private TestableTreeBuilder treeBuilder;

    /**
     * Concrete implementation of TreeBuilder for testing purposes.
     */
    private static class TestableTreeBuilder extends TreeBuilder {
        private List<Token.TokenType> processedTokenTypes = new ArrayList<Token.TokenType>();
        private List<String> processedTagNames = new ArrayList<String>();
        private Token lastProcessedToken = null;
        private boolean processReturnValue = true;

        protected boolean process(Token token) {
            this.lastProcessedToken = token;
            this.processedTokenTypes.add(token.type);
            if (token.isStartTag()) {
                this.processedTagNames.add(token.asStartTag().name());
            } else if (token.isEndTag()) {
                this.processedTagNames.add(token.asEndTag().name());
            }
            return processReturnValue;
        }
    }

    @Before
    public void setUp() {
        treeBuilder = new TestableTreeBuilder();
    }

    // =========================================================================
    // Phase 1: Boundary & Exception Branches (initialiseParse validation)
    // =========================================================================

    @Test(expected = IllegalArgumentException.class)
    public void initialiseParse_givenNullInput_shouldThrowIllegalArgumentException() {
        // Arrange
        String input = null;
        String baseUri = "http://example.com";
        ParseErrorList errors = ParseErrorList.noTracking();

        // Act
        treeBuilder.initialiseParse(input, baseUri, errors);
    }

    @Test(expected = IllegalArgumentException.class)
    public void initialiseParse_givenNullBaseUri_shouldThrowIllegalArgumentException() {
        // Arrange
        String input = "<div></div>";
        String baseUri = null;
        ParseErrorList errors = ParseErrorList.noTracking();

        // Act
        treeBuilder.initialiseParse(input, baseUri, errors);
    }

    // =========================================================================
    // Phase 2: Happy Path & State Initialization
    // =========================================================================

    @Test
    public void initialiseParse_givenValidArguments_shouldInitializeInternalState() {
        // Arrange
        String input = "<p>Sample</p>";
        String baseUri = "http://example.com/test";
        ParseErrorList errors = ParseErrorList.tracking(10);

        // Act
        treeBuilder.initialiseParse(input, baseUri, errors);

        // Assert
        Assert.assertNotNull(treeBuilder.doc);
        Assert.assertEquals(baseUri, treeBuilder.doc.baseUri());
        Assert.assertEquals(baseUri, treeBuilder.baseUri);
        Assert.assertNotNull(treeBuilder.reader);
        Assert.assertNotNull(treeBuilder.tokeniser);
        Assert.assertNotNull(treeBuilder.stack);
        Assert.assertTrue(treeBuilder.stack.isEmpty());
        Assert.assertSame(errors, treeBuilder.errors);
    }

    @Test
    public void parse_givenTwoArguments_shouldParseWithNoTrackingErrors() {
        // Arrange
        String input = "<html><body></body></html>";
        String baseUri = "http://example.com";

        // Act
        Document resultDoc = treeBuilder.parse(input, baseUri);

        // Assert
        Assert.assertNotNull(resultDoc);
        Assert.assertSame(treeBuilder.doc, resultDoc);
        Assert.assertEquals(baseUri, resultDoc.baseUri());
        Assert.assertNotNull(treeBuilder.errors);
        Assert.assertEquals(0, treeBuilder.errors.getMaxSize());
        Assert.assertFalse(treeBuilder.processedTokenTypes.isEmpty());
    }

    @Test
    public void parse_givenThreeArgumentsWithTracking_shouldParseAndRetainErrorsList() {
        // Arrange
        String input = "<div>test</div>";
        String baseUri = "http://example.com";
        ParseErrorList errors = ParseErrorList.tracking(5);

        // Act
        Document resultDoc = treeBuilder.parse(input, baseUri, errors);

        // Assert
        Assert.assertNotNull(resultDoc);
        Assert.assertSame(treeBuilder.doc, resultDoc);
        Assert.assertSame(errors, treeBuilder.errors);
    }

    // =========================================================================
    // Phase 3: runParser Execution & EOF Handling
    // =========================================================================

    @Test
    public void runParser_givenEmptyInput_shouldProcessEofAndTerminate() {
        // Arrange
        String input = "";
        String baseUri = "http://example.com";
        treeBuilder.initialiseParse(input, baseUri, ParseErrorList.noTracking());

        // Act
        treeBuilder.runParser();

        // Assert
        Assert.assertEquals(1, treeBuilder.processedTokenTypes.size());
        Assert.assertEquals(Token.TokenType.EOF, treeBuilder.processedTokenTypes.get(0));
    }

    @Test
    public void runParser_givenHtmlInput_shouldProcessAllTokensUntilEof() {
        // Arrange
        String input = "<div>Text</div>";
        String baseUri = "http://example.com";
        treeBuilder.initialiseParse(input, baseUri, ParseErrorList.noTracking());

        // Act
        treeBuilder.runParser();

        // Assert
        int count = treeBuilder.processedTokenTypes.size();
        Assert.assertTrue(count >= 3); // StartTag, Character, EndTag, EOF
        Assert.assertEquals(Token.TokenType.EOF, treeBuilder.processedTokenTypes.get(count - 1));
    }

    // =========================================================================
    // Phase 4: Tag Processing Helper Methods
    // =========================================================================

    @Test
    public void processStartTag_givenTagNameOnly_shouldDispatchStartTagToken() {
        // Arrange
        String tagName = "span";
        treeBuilder.processReturnValue = true;

        // Act
        boolean result = treeBuilder.processStartTag(tagName);

        // Assert
        Assert.assertTrue(result);
        Assert.assertNotNull(treeBuilder.lastProcessedToken);
        Assert.assertTrue(treeBuilder.lastProcessedToken.isStartTag());
        Assert.assertEquals(tagName, treeBuilder.lastProcessedToken.asStartTag().name());
    }

    @Test
    public void processStartTag_givenTagNameAndAttributes_shouldDispatchConfiguredStartTag() {
        // Arrange
        String tagName = "a";
        Attributes attributes = new Attributes();
        attributes.put("href", "http://example.com");
        attributes.put("target", "_blank");
        treeBuilder.processReturnValue = true;

        // Act
        boolean result = treeBuilder.processStartTag(tagName, attributes);

        // Assert
        Assert.assertTrue(result);
        Assert.assertNotNull(treeBuilder.lastProcessedToken);
        Assert.assertTrue(treeBuilder.lastProcessedToken.isStartTag());
        Token.StartTag startTag = treeBuilder.lastProcessedToken.asStartTag();
        Assert.assertEquals(tagName, startTag.name());
        Assert.assertEquals("http://example.com", startTag.attributes.get("href"));
        Assert.assertEquals("_blank", startTag.attributes.get("target"));
    }

    @Test
    public void processEndTag_givenTagName_shouldDispatchEndTagToken() {
        // Arrange
        String tagName = "div";
        treeBuilder.processReturnValue = true;

        // Act
        boolean result = treeBuilder.processEndTag(tagName);

        // Assert
        Assert.assertTrue(result);
        Assert.assertNotNull(treeBuilder.lastProcessedToken);
        Assert.assertTrue(treeBuilder.lastProcessedToken.isEndTag());
        Assert.assertEquals(tagName, treeBuilder.lastProcessedToken.asEndTag().name());
    }

    @Test
    public void processStartTag_whenProcessReturnsFalse_shouldReturnFalse() {
        // Arrange
        treeBuilder.processReturnValue = false;

        // Act
        boolean startResult = treeBuilder.processStartTag("p");
        boolean startAttrResult = treeBuilder.processStartTag("p", new Attributes());
        boolean endResult = treeBuilder.processEndTag("p");

        // Assert
        Assert.assertFalse(startResult);
        Assert.assertFalse(startAttrResult);
        Assert.assertFalse(endResult);
    }

    // =========================================================================
    // Phase 5: currentElement Edge & Boundary Cases
    // =========================================================================

    @Test
    public void currentElement_givenEmptyStack_shouldReturnNull() {
        // Arrange
        treeBuilder.initialiseParse("<p></p>", "http://example.com", ParseErrorList.noTracking());
        Assert.assertEquals(0, treeBuilder.stack.size());

        // Act
        Element current = treeBuilder.currentElement();

        // Assert
        Assert.assertNull(current);
    }

    @Test
    public void currentElement_givenSingleElementInStack_shouldReturnThatElement() {
        // Arrange
        treeBuilder.initialiseParse("<p></p>", "http://example.com", ParseErrorList.noTracking());
        Element el = new Element(Tag.valueOf("html"), "http://example.com");
        treeBuilder.stack.add(el);

        // Act
        Element current = treeBuilder.currentElement();

        // Assert
        Assert.assertNotNull(current);
        Assert.assertSame(el, current);
    }

    @Test
    public void currentElement_givenMultipleElementsInStack_shouldReturnTopElement() {
        // Arrange
        treeBuilder.initialiseParse("<p></p>", "http://example.com", ParseErrorList.noTracking());
        Element root = new Element(Tag.valueOf("html"), "http://example.com");
        Element body = new Element(Tag.valueOf("body"), "http://example.com");
        Element p = new Element(Tag.valueOf("p"), "http://example.com");

        treeBuilder.stack.add(root);
        treeBuilder.stack.add(body);
        treeBuilder.stack.add(p);

        // Act
        Element current = treeBuilder.currentElement();

        // Assert
        Assert.assertNotNull(current);
        Assert.assertSame(p, current);
    }

    @Test
    public void currentElement_afterElementPopped_shouldReturnNewTopElement() {
        // Arrange
        treeBuilder.initialiseParse("<p></p>", "http://example.com", ParseErrorList.noTracking());
        Element root = new Element(Tag.valueOf("html"), "http://example.com");
        Element body = new Element(Tag.valueOf("body"), "http://example.com");

        treeBuilder.stack.add(root);
        treeBuilder.stack.add(body);

        // Act & Assert
        Assert.assertSame(body, treeBuilder.currentElement());

        treeBuilder.stack.remove(treeBuilder.stack.size() - 1);
        Assert.assertSame(root, treeBuilder.currentElement());

        treeBuilder.stack.remove(treeBuilder.stack.size() - 1);
        Assert.assertNull(treeBuilder.currentElement());
    }
}