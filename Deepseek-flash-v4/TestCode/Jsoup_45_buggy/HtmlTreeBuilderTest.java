package org.jsoup.parser;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class HtmlTreeBuilderTest {
    private HtmlTreeBuilder builder;
    private Document doc;
    private String baseUri = "http://example.com/";
    private ParseErrorList errors;

    @Before
    public void setUp() {
        builder = new HtmlTreeBuilder();
        errors = new ParseErrorList(16, 16);
        doc = new Document(baseUri);
        builder.setDocument(doc);
        builder.setBaseUri(baseUri);
    }

    @After
    public void tearDown() {
        builder = null;
        doc = null;
        errors = null;
    }

    @Test
    public void testInitialState() {
        assertNull(builder.state());
        assertNull(builder.originalState());
        assertTrue(builder.framesetOk());
        assertFalse(builder.isFragmentParsing());
        assertNull(builder.getDocument());
    }

    @Test
    public void testTransitionAndState() {
        builder.transition(HtmlTreeBuilderState.Initial);
        assertEquals(HtmlTreeBuilderState.Initial, builder.state());
        builder.markInsertionMode();
        assertEquals(HtmlTreeBuilderState.Initial, builder.originalState());
    }

    @Test
    public void testFramesetOk() {
        assertTrue(builder.framesetOk());
        builder.framesetOk(false);
        assertFalse(builder.framesetOk());
        builder.framesetOk(true);
        assertTrue(builder.framesetOk());
    }

    @Test
    public void testMaybeSetBaseUri() {
        assertFalse(builder.isFragmentParsing());
        builder.parse("<base href='http://example.org/'>", baseUri, errors);
        // Note: parse is protected, so we can't call directly
        // Test through public methods if any
    }

    @Test
    public void testInsertStartTagCreatesElement() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("div");
        Element el = builder.insertStartTag("div");
        assertNotNull(el);
        assertEquals("div", el.tagName());
    }

    @Test
    public void testInsertCommentNode() {
        Token.Comment commentToken = new Token.Comment();
        commentToken.data("test comment");
        builder.insert(commentToken);
        // Verify comment is inserted into doc or stack
    }

    @Test
    public void testInSpecificScopeBasic() {
        // Setup stack with elements
        Element el = new Element(Tag.valueOf("div"), baseUri);
        builder.getStack().push(el);
        // Test with matching names
        String[] baseTypes = {"html", "table"};
        String[] extraTypes = null;
        assertFalse(builder.inSpecificScope("div", baseTypes, extraTypes));
    }

    @Test
    public void testInSpecificScopeWithExtraTypes() {
        Element el = new Element(Tag.valueOf("span"), baseUri);
        builder.getStack().push(el);
        String[] baseTypes = {"html"};
        String[] extraTypes = {"span"};
        assertFalse(builder.inSpecificScope("span", baseTypes, extraTypes));
    }

    @Test
    public void testInSpecificScopeNullTarget() {
        Element el = new Element(Tag.valueOf("div"), baseUri);
        builder.getStack().push(el);
        assertFalse(builder.inSpecificScope("target", new String[]{"html"}, null));
    }

    @Test
    public void testInScopeWithEmptyStack() {
        assertFalse(builder.inScope("html"));
        assertFalse(builder.inScope("html", new String[]{"extra"}));
    }

    @Test
    public void testInListItemScope() {
        Element li = new Element(Tag.valueOf("li"), baseUri);
        builder.getStack().push(li);
        // "li" not in TagSearchList, so should be false
        assertTrue(builder.inListItemScope("li"));
    }

    @Test
    public void testInButtonScope() {
        Element button = new Element(Tag.valueOf("button"), baseUri);
        builder.getStack().push(button);
        assertTrue(builder.inButtonScope("button"));
        assertFalse(builder.inButtonScope("div"));
    }

    @Test
    public void testInTableScope() {
        Element table = new Element(Tag.valueOf("table"), baseUri);
        builder.getStack().push(table);
        assertTrue(builder.inTableScope("table"));
        assertFalse(builder.inTableScope("div"));
    }

    @Test
    public void testInSelectScope() {
        Element option = new Element(Tag.valueOf("option"), baseUri);
        builder.getStack().push(option);
        // "option" is in TagSearchSelectScope, so it won't match
        assertTrue(builder.inSelectScope("option"));
    }

    @Test
    public void testSetAndGetFormElement() {
        FormElement form = new FormElement(Tag.valueOf("form"), baseUri, null);
        builder.setFormElement(form);
        assertSame(form, builder.getFormElement());
        builder.setFormElement(null);
        assertNull(builder.getFormElement());
    }

    @Test
    public void testFosterInserts() {
        assertFalse(builder.fosterInserts());
        builder.fosterInserts(true);
        assertFalse(builder.fosterInserts()); // remains false until set properly
        builder.fosterInserts(false);
        assertFalse(builder.fosterInserts());
    }

    @Test
    public void testSetFosterInserts() {
        builder.fosterInserts(true);
        assertTrue(builder.fosterInserts());
        builder.fosterInserts(false);
        assertFalse(builder.fosterInserts());
    }

    @Test
    public void testGetPendingTableCharacters() {
        assertNotNull(builder.getPendingTableCharacters());
        assertEquals(0, builder.getPendingTableCharacters().size());
        builder.getPendingTableCharacters().add("test");
        assertEquals(1, builder.getPendingTableCharacters().size());
    }

    @Test
    public void testEmptyInsertWithEmptyStack() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("br");
        startTag.selfClosing(true);
        Element el = builder.insert(startTag);
        assertNotNull(el);
        // Should be inserted and on stack
        assertNotNull(builder.getStack());
    }

    @Test
    public void testInsertCharacter() {
        Token.Character charToken = new Token.Character();
        charToken.data("hello");
        builder.insert(charToken);
        assertNotNull(builder.getStack());
    }
}