package org.jsoup.parser;

import org.junit.Test;
import org.junit.Before;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.*;
import org.jsoup.parser.Token.*;
import static org.junit.Assert.*;

public class HtmlTreeBuilderStateTest {
    private HtmlTreeBuilder tb;
    private Document doc;

    @Before
    public void setUp() {
        doc = new Document("");
        tb = new HtmlTreeBuilder(doc);
    }

    // ---------- Helper methods to create tokens ----------
    private Token characterToken(String data) {
        Token.Character c = new Token.Character();
        c.data(data);
        return c;
    }

    private Token commentToken(String data) {
        Token.Comment c = new Token.Comment();
        c.data(data);
        return c;
    }

    private Token doctypeToken(String name, String pubSysKey, String publicId, String systemId, boolean forceQuirks) {
        Token.Doctype d = new Token.Doctype();
        d.name(name);
        d.pubSysKey(pubSysKey);
        d.publicIdentifier(publicId);
        d.systemIdentifier(systemId);
        d.forceQuirks(forceQuirks);
        return d;
    }

    private Token startTagToken(String normalName) {
        Token.StartTag t = new Token.StartTag();
        t.normalName(normalName);
        t.name(normalName);
        return t;
    }

    private Token startTagTokenAttr(String normalName, String key, String value) {
        Token.StartTag t = new Token.StartTag();
        t.normalName(normalName);
        t.name(normalName);
        t.attributes.put(key, value);
        return t;
    }

    private Token endTagToken(String normalName) {
        Token.EndTag t = new Token.EndTag();
        t.normalName(normalName);
        t.name(normalName);
        return t;
    }

    // ---------- State: Initial ----------
    @Test
    public void testInitialWhitespace() {
        assertTrue(HtmlTreeBuilderState.Initial.process(characterToken(" "), tb));
    }

    @Test
    public void testInitialComment() {
        Token.Comment c = (Token.Comment) commentToken("test");
        assertTrue(HtmlTreeBuilderState.Initial.process(c, tb));
        // comment should be inserted
        assertNotNull(doc.childNode(0));
    }

    @Test
    public void testInitialDoctype() {
        Token.Doctype d = doctypeToken("html", null, null, null, false);
        assertTrue(HtmlTreeBuilderState.Initial.process(d, tb));
        // should have DocumentType child and transition to BeforeHtml
        assertEquals(1, doc.childNodeSize());
        // state should be BeforeHtml
        assertEquals(HtmlTreeBuilderState.BeforeHtml, tb.state());
    }

    @Test
    public void testInitialDoctypeForceQuirks() {
        Token.Doctype d = doctypeToken("html", null, null, null, true);
        assertTrue(HtmlTreeBuilderState.Initial.process(d, tb));
        assertEquals(Document.QuirksMode.quirks, doc.quirksMode());
    }

    @Test
    public void testInitialOtherToken() {
        // any token that is not whitespace/comment/doctype goes to BeforeHtml
        Token.StartTag t = startTagToken("p");
        assertTrue(HtmlTreeBuilderState.Initial.process(t, tb));
        assertEquals(HtmlTreeBuilderState.BeforeHtml, tb.state());
    }

    // ---------- State: BeforeHtml ----------
    @Test
    public void testBeforeHtmlDoctype() {
        assertFalse(HtmlTreeBuilderState.BeforeHtml.process(doctypeToken("html", null, null, null, false), tb));
    }

    @Test
    public void testBeforeHtmlComment() {
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(commentToken("x"), tb));
    }

    @Test
    public void testBeforeHtmlWhitespace() {
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(characterToken("\n"), tb));
    }

    @Test
    public void testBeforeHtmlStartTagHtml() {
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(startTagToken("html"), tb));
        assertEquals(HtmlTreeBuilderState.BeforeHead, tb.state());
        // html element inserted
        assertTrue(doc.childrenSize() > 0);
    }

    @Test
    public void testBeforeHtmlEndTagPermitted() {
        // end tag "head", "body", "html", "br" triggers anythingElse
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(endTagToken("body"), tb));
        // after anythingElse, state becomes BeforeHead
        assertEquals(HtmlTreeBuilderState.BeforeHead, tb.state());
    }

    @Test
    public void testBeforeHtmlEndTagNotPermitted() {
        assertFalse(HtmlTreeBuilderState.BeforeHtml.process(endTagToken("div"), tb));
    }

    @Test
    public void testBeforeHtmlOtherStartTag() {
        // start tag other than html triggers anythingElse
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(startTagToken("div"), tb));
        assertEquals(HtmlTreeBuilderState.BeforeHead, tb.state());
    }

    // ---------- State: BeforeHead ----------
    @Test
    public void testBeforeHeadWhitespace() {
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(characterToken(" "), tb));
    }

    @Test
    public void testBeforeHeadComment() {
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(commentToken("c"), tb));
    }

    @Test
    public void testBeforeHeadDoctype() {
        assertFalse(HtmlTreeBuilderState.BeforeHead.process(doctypeToken("x", null, null, null, false), tb));
    }

    @Test
    public void testBeforeHeadStartTagHtml() {
        // should delegate to InBody.process
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(startTagToken("html"), tb));
    }

    @Test
    public void testBeforeHeadStartTagHead() {
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(startTagToken("head"), tb));
        assertNotNull(tb.getHeadElement());
        assertEquals(HtmlTreeBuilderState.InHead, tb.state());
    }

    @Test
    public void testBeforeHeadEndTagPermitted() {
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(endTagToken("head"), tb));
        // should process start "head" then process end "head"
        assertEquals(HtmlTreeBuilderState.InHead, tb.state());
    }

    @Test
    public void testBeforeHeadEndTagNotPermitted() {
        assertFalse(HtmlTreeBuilderState.BeforeHead.process(endTagToken("div"), tb));
    }

    @Test
    public void testBeforeHeadOtherStartTag() {
        // triggers default: process start tag "head" then process token again
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(startTagToken("base"), tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state());
    }

    // ---------- State: InHead ----------
    @Test
    public void testInHeadWhitespace() {
        assertTrue(HtmlTreeBuilderState.InHead.process(characterToken(" "), tb));
    }

    @Test
    public void testInHeadComment() {
        assertTrue(HtmlTreeBuilderState.InHead.process(commentToken("c"), tb));
    }

    @Test
    public void testInHeadDoctype() {
        assertFalse(HtmlTreeBuilderState.InHead.process(doctypeToken("x", null, null, null, false), tb));
    }

    @Test
    public void testInHeadStartTagHtml() {
        assertTrue(HtmlTreeBuilderState.InHead.process(startTagToken("html"), tb));
    }

    @Test
    public void testInHeadStartTagTitle() {
        // handleRcData should be called, transition to Text
        assertTrue(HtmlTreeBuilderState.InHead.process(startTagToken("title"), tb));
        assertEquals(HtmlTreeBuilderState.Text, tb.state());
    }

    @Test
    public void testInHeadStartTagScript() {
        // should transition to Text and set tokeniser state
        assertTrue(HtmlTreeBuilderState.InHead.process(startTagToken("script"), tb));
        assertEquals(HtmlTreeBuilderState.Text, tb.state());
    }

    @Test
    public void testInHeadEndTagHead() {
        assertTrue(HtmlTreeBuilderState.InHead.process(endTagToken("head"), tb));
        assertEquals(HtmlTreeBuilderState.AfterHead, tb.state());
    }

    @Test
    public void testInHeadEndTagBody() {
        // anythingElse -> process end "head" then process token
        assertTrue(HtmlTreeBuilderState.InHead.process(endTagToken("body"), tb));
        // state should change after processing
    }

    @Test
    public void testInHeadEndTagNotPermitted() {
        assertFalse(HtmlTreeBuilderState.InHead.process(endTagToken("div"), tb));
    }

    // ---------- State: Text ----------
    @Test
    public void testTextCharacter() {
        // must have a suitable context: after InHead transition
        tb.transition(HtmlTreeBuilderState.Text);
        assertTrue(HtmlTreeBuilderState.Text.process(characterToken("hello"), tb));
        // character should be inserted
    }

    @Test
    public void testTextEndTag() {
        tb.transition(HtmlTreeBuilderState.Text);
        assertTrue(HtmlTreeBuilderState.Text.process(endTagToken("title"), tb));
        // should pop and transition back to previous state (InHead)
        assertEquals(HtmlTreeBuilderState.InHead, tb.state());
    }

    @Test
    public void testTextEof() {
        tb.transition(HtmlTreeBuilderState.Text);
        // process EOF token
        Token.EOF eof = new Token.EOF();
        assertTrue(HtmlTreeBuilderState.Text.process(eof, tb));
        // state should go back to originalState (InHead)
        assertEquals(HtmlTreeBuilderState.InHead, tb.state());
    }

    // ---------- State: InBody (basic branches) ----------
    @Test
    public void testInBodyCharacterNull() {
        Token.Character c = characterToken("\u0000");
        assertFalse(HtmlTreeBuilderState.InBody.process(c, tb));
    }

    @Test
    public void testInBodyCharacterWhitespace() {
        assertTrue(HtmlTreeBuilderState.InBody.process(characterToken(" "), tb));
    }

    @Test
    public void testInBodyComment() {
        assertTrue(HtmlTreeBuilderState.InBody.process(commentToken("x"), tb));
    }

    @Test
    public void testInBodyDoctype() {
        assertFalse(HtmlTreeBuilderState.InBody.process(doctypeToken("x", null, null, null, false), tb));
    }

    @Test
    public void testInBodyStartTagAnchor() {
        // start tag "a" should insert and push to active formatting
        assertTrue(HtmlTreeBuilderState.InBody.process(startTagToken("a"), tb));
        // formatting element should be present
        assertNotNull(tb.getActiveFormattingElement("a"));
    }

    @Test
    public void testInBodyStartTagSpan() {
        assertTrue(HtmlTreeBuilderState.InBody.process(startTagToken("span"), tb));
    }

    @Test
    public void testInBodyStartTagP() {
        assertTrue(HtmlTreeBuilderState.InBody.process(startTagToken("p"), tb));
    }

    @Test
    public void testInBodyEndTagP() {
        // need a p element first
        assertTrue(HtmlTreeBuilderState.InBody.process(startTagToken("p"), tb));
        assertTrue(HtmlTreeBuilderState.InBody.process(endTagToken("p"), tb));
    }

    @Test
    public void testInBodyEndTagUnknown() {
        // anyOtherEndTag: should look for matching start tag
        assertTrue(HtmlTreeBuilderState.InBody.process(startTagToken("custom"), tb));
        assertTrue(HtmlTreeBuilderState.InBody.process(endTagToken("custom"), tb));
    }

    // ---------- State: InTable (basic) ----------
    @Test
    public void testInTableWhitespace() {
        // table context
        tb.transition(HtmlTreeBuilderState.InTable);
        // whitespace should go to InTableText
        assertTrue(HtmlTreeBuilderState.InTable.process(characterToken(" "), tb));
        assertEquals(HtmlTreeBuilderState.InTableText, tb.state());
    }

    @Test
    public void testInTableComment() {
        tb.transition(HtmlTreeBuilderState.InTable);
        assertTrue(HtmlTreeBuilderState.InTable.process(commentToken("x"), tb));
    }

    @Test
    public void testInTableDoctype() {
        tb.transition(HtmlTreeBuilderState.InTable);
        assertFalse(HtmlTreeBuilderState.InTable.process(doctypeToken("x", null, null, null, false), tb));
    }

    @Test
    public void testInTableStartTagCaption() {
        tb.transition(HtmlTreeBuilderState.InTable);
        assertTrue(HtmlTreeBuilderState.InTable.process(startTagToken("caption"), tb));
        assertEquals(HtmlTreeBuilderState.InCaption, tb.state());
    }

    @Test
    public void testInTableStartTagColgroup() {
        tb.transition(HtmlTreeBuilderState.InTable);
        assertTrue(HtmlTreeBuilderState.InTable.process(startTagToken("colgroup"), tb));
        assertEquals(HtmlTreeBuilderState.InColumnGroup, tb.state());
    }

    @Test
    public void testInTableEndTagTable() {
        tb.transition(HtmlTreeBuilderState.InTable);
        // need a table in scope
        tb.process(new Token.StartTag().name("table")); // quick way to get table on stack – but we need proper integration
        // For simplicity, we just check the error path: if not in table scope, return false
        assertFalse(HtmlTreeBuilderState.InTable.process(endTagToken("table"), tb));
    }

    // ---------- Stub for HtmlTreeBuilder (minimal) ----------
    // We extend HtmlTreeBuilder to override necessary methods for tracking
    private class MockHtmlTreeBuilder extends HtmlTreeBuilder {
        private HtmlTreeBuilderState currentState;
        private Element headElement;
        private Document doc;
        private boolean fosterInserts;
        private ArrayList<String> pendingTableCharacters = new ArrayList<String>();
        private ArrayList<Element> stack = new ArrayList<Element>();

        public MockHtmlTreeBuilder(Document doc) {
            super(doc);
            this.doc = doc;
            this.currentState = HtmlTreeBuilderState.Initial;
        }

        public HtmlTreeBuilderState state() {
            return currentState;
        }

        public void transition(HtmlTreeBuilderState state) {
            this.currentState = state;
        }

        public void insert(Token.Character c) {
            // simplified: append text node to current element or document
            TextNode text = new TextNode(c.getData(), "");
            if (!stack.isEmpty()) {
                stack.get(stack.size()-1).appendChild(text);
            } else {
                doc.appendChild(text);
            }
        }

        public void insert(Token.Comment c) {
            Comment comment = new Comment(c.getData(), "");
            if (!stack.isEmpty()) {
                stack.get(stack.size()-1).appendChild(comment);
            } else {
                doc.appendChild(comment);
            }
        }

        public void insert(Token.StartTag startTag) {
            Element el = new Element(Tag.valueOf(startTag.normalName()), "");
            // copy attributes
            for (org.jsoup.nodes.Attribute attr : startTag.attributes) {
                el.attributes().put(attr);
            }
            if (!stack.isEmpty()) {
                stack.get(stack.size()-1).appendChild(el);
            }
            stack.add(el);
        }

        public Element insertEmpty(Token.StartTag startTag) {
            Element el = new Element(Tag.valueOf(startTag.normalName()), "");
            if (!stack.isEmpty()) {
                stack.get(stack.size()-1).appendChild(el);
            }
            return el;
        }

        public void pop() {
            if (!stack.isEmpty()) stack.remove(stack.size()-1);
        }

        public Element currentElement() {
            return stack.isEmpty() ? null : stack.get(stack.size()-1);
        }

        public void push(Element el) {
            stack.add(el);
        }

        public void removeFromStack(Element el) {
            stack.remove(el);
        }

        public void pushActiveFormattingElements(Element el) {
            // simplified
        }

        public Element getActiveFormattingElement(String name) {
            return null;
        }

        public void removeFromActiveFormattingElements(Element el) {}

        public void setHeadElement(Element el) { this.headElement = el; }
        public Element getHeadElement() { return headElement; }
        public void maybeSetBaseUri(Element el) {}
        public void markInsertionMode() {}
        public void reconstructFormattingElements() {}
        public void generateImpliedEndTags() {}
        public void generateImpliedEndTags(String tag) {}

        public boolean process(Token t) {
            return currentState.process(t, this);
        }

        public boolean process(Token t, HtmlTreeBuilderState state) {
            return state.process(t, this);
        }

        public void processStartTag(String name) {
            process(startTagToken(name));
        }

        public boolean processEndTag(String name) {
            return process(endTagToken(name));
        }

        public void error(HtmlTreeBuilderState state) {
            // ignore
        }

        public Document getDocument() { return doc; }

        public String getBaseUri() { return ""; }

        public void setFormElement(Element el) {}
        public Element getFormElement() { return null; }
        public void insertForm(Token.StartTag startTag, boolean own) {}

        public void framesetOk(boolean ok) {}
        public boolean framesetOk() { return true; }

        public void setFosterInserts(boolean foster) { this.fosterInserts = foster; }
        public void newPendingTableCharacters() { pendingTableCharacters.clear(); }
        public ArrayList<String> getPendingTableCharacters() { return pendingTableCharacters; }

        public void insertMarkerToFormattingElements() {}
        public void clearFormattingElementsToLastMarker() {}

        public void resetInsertionMode() {}
        public boolean isSpecial(Element el) { return false; }
        public boolean isFragmentParsing() { return false; }
        public boolean inScope(String name) { return false; }
        public boolean inButtonScope(String name) { return false; }
        public boolean inTableScope(String name) { return false; }
        public boolean inListItemScope(String name) { return false; }
        public boolean inSelectScope(String name) { return false; }
        public boolean onStack(Element el) { return stack.contains(el); }
        public Element aboveOnStack(Element el) {
            int idx = stack.indexOf(el);
            return (idx > 0) ? stack.get(idx-1) : null;
        }

        public void replaceActiveFormattingElement(Element oldEl, Element newEl) {}
        public void replaceOnStack(Element oldEl, Element newEl) {}
        public void insertOnStackAfter(Element after, Element el) {}
        public void popStackToClose(String name) {}
        public void popStackToBefore(String name) {}
        public void clearStackToTableContext() {}
        public void clearStackToTableBodyContext() {}
        public void clearStackToTableRowContext() {}
        public ArrayList<Element> getStack() { return stack; }
        public Element getFromStack(String name) { return null; }
        public HtmlTreeBuilderState originalState() { return HtmlTreeBuilderState.Initial; }
    }

    // Override setUp to use MockHtmlTreeBuilder
    @Override
    @Before
    public void setUp() {
        doc = new Document("");
        tb = new MockHtmlTreeBuilder(doc);
    }
}