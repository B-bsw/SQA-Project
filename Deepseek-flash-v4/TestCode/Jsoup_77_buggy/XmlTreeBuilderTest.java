import org.junit.Before;
import org.junit.Test;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.jsoup.select.Elements;
import static org.junit.Assert.*;

import java.io.StringReader;
import java.util.List;

public class XmlTreeBuilderTest {
    private XmlTreeBuilder builder;
    private String baseUri;

    @Before
    public void setUp() {
        builder = new XmlTreeBuilder();
        baseUri = "http://example.com/";
    }

    // Test defaultSettings returns preserveCase
    @Test
    public void testDefaultSettingsPreserveCase() {
        ParseSettings settings = builder.defaultSettings();
        assertNotNull(settings);
        assertTrue(settings.preserveTagCase());
        assertTrue(settings.preserveAttributeCase());
    }

    // Test parse(Reader, String) delegates to parse(Reader, String, ParseErrorList, ParseSettings)
    @Test
    public void testParseReaderBasic() {
        String xml = "<root><child/></root>";
        Document doc = builder.parse(new StringReader(xml), baseUri);
        assertNotNull(doc);
        assertEquals("<root>\n <child />\n</root>", doc.toString()); // depends on output format
        assertEquals("root", doc.child(0).tagName());
    }

    // Test parse(String, String) delegates to parse(Reader, String, ...)
    @Test
    public void testParseStringBasic() {
        String xml = "<root>text</root>";
        Document doc = builder.parse(xml, baseUri);
        assertNotNull(doc);
        assertEquals(1, doc.childNodes().size());
        Element root = doc.child(0);
        assertEquals("root", root.tagName());
        assertEquals("text", root.text());
    }

    // Test initialiseParse overrides with xml syntax
    @Test
    public void testInitialiseParseSetsXmlSyntax() {
        // Using parse to trigger initialiseParse
        String xml = "<root/>";
        Document doc = builder.parse(xml, baseUri);
        assertEquals(Document.OutputSettings.Syntax.xml, doc.outputSettings().syntax());
        // stack should have doc as first element
        assertEquals(doc, builder.stack.get(0));
    }

    // Test process with StartTag
    @Test
    public void testProcessStartTag() {
        builder.parse("<a>", baseUri);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("b");
        startTag.isSelfClosing = false;
        boolean result = builder.process(startTag);
        assertTrue(result);
        // Should insert element and add to stack
        assertEquals("b", builder.currentElement().tagName());
        assertEquals(2, builder.stack.size()); // doc + a + b? Actually after parse, stack has doc + a, then insert b
    }

    // Test process with EndTag closing an element
    @Test
    public void testProcessEndTag() {
        builder.parse("<a><b></b></a>", baseUri);
        // After parsing, stack should have doc and a? Actually after parsing closes, stack may have doc only or doc+a? Check manual
        // To isolate, create fresh parser state
        builder = new XmlTreeBuilder();
        builder.parse("<a>", baseUri);
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("a");
        boolean result = builder.process(endTag);
        assertTrue(result);
        // After closing a, stack should be back to just doc
        assertEquals(1, builder.stack.size());
        assertEquals(doc, builder.stack.get(0));
    }

    // Test process with Comment
    @Test
    public void testProcessComment() {
        builder.parse("", baseUri);
        Token.Comment comment = new Token.Comment();
        comment.data(" test ");
        boolean result = builder.process(comment);
        assertTrue(result);
        // Should insert as comment node
        assertEquals(1, doc.childNodes().size());
        assertTrue(doc.child(0) instanceof Comment);
    }

    // Test process with Character
    @Test
    public void testProcessCharacter() {
        builder.parse("", baseUri);
        Token.Character charToken = new Token.Character();
        charToken.data("hello");
        charToken.isCData = false;
        boolean result = builder.process(charToken);
        assertTrue(result);
        assertEquals("hello", ((TextNode)doc.child(0)).getWholeText());
    }

    // Test process with Doctype
    @Test
    public void testProcessDoctype() {
        builder.parse("", baseUri);
        Token.Doctype doctype = new Token.Doctype();
        doctype.name("html");
        doctype.publicIdentifier = "-//W3C//DTD XHTML 1.0 Strict//EN";
        doctype.systemIdentifier = "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd";
        boolean result = builder.process(doctype);
        assertTrue(result);
        assertTrue(doc.child(0) instanceof DocumentType);
    }

    // Test process with EOF token does nothing
    @Test
    public void testProcessEof() {
        builder.parse("", baseUri);
        Token.EOF eof = new Token.EOF();
        boolean result = builder.process(eof);
        assertTrue(result);
        assertEquals(1, doc.childNodes().size()); // only maybe nothing
    }

    // Test process with invalid token type triggers Validate.fail (exception)
    @Test(expected = ValidationException.class)
    public void testProcessInvalidToken() {
        builder.parse("", baseUri);
        Token token = new Token() {}; // anonymous inner class
        builder.process(token);
    }

    // Test insert(StartTag) with self-closing unknown tag
    @Test
    public void testInsertStartTagSelfClosingUnknown() {
        builder.parse("", baseUri);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("selfclosingtag");
        startTag.isSelfClosing = true;
        Element el = builder.insert(startTag);
        assertNotNull(el);
        assertTrue(el.tag().isSelfClosing());
        assertEquals("selfclosingtag", el.tagName());
        // Not added to stack
        assertEquals(1, builder.stack.size());
    }

    // Test insert(StartTag) with self-closing known tag
    @Test
    public void testInsertStartTagSelfClosingKnown() {
        builder.parse("", baseUri);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("br");
        startTag.isSelfClosing = true;
        Element el = builder.insert(startTag);
        assertNotNull(el);
        assertFalse(el.tag().isSelfClosing()); // known tags should not be set self-closing per code
        // Add to stack? Actually for known tags, not set self-closing, so goes to else and adds to stack
        assertEquals(2, builder.stack.size());
    }

    // Test insert(StartTag) non-self-closing adds to stack
    @Test
    public void testInsertStartTagNotSelfClosingAddsToStack() {
        builder.parse("", baseUri);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("div");
        startTag.isSelfClosing = false;
        Element el = builder.insert(startTag);
        assertNotNull(el);
        assertEquals(2, builder.stack.size());
        assertEquals("div", ((Element)builder.stack.get(1)).tagName());
    }

    // Test insert(Comment) bogus with "!" and "?" handling
    @Test
    public void testInsertBogusCommentWithXmlDeclaration() {
        builder.parse("", baseUri);
        Token.Comment comment = new Token.Comment();
        comment.data("?xml version=\"1.0\"?");
        comment.bogus = true;
        builder.insert(comment);
        // Should insert XmlDeclaration
        assertEquals(1, doc.childNodes().size());
        assertTrue(doc.child(0) instanceof XmlDeclaration);
    }

    @Test
    public void testInsertBogusCommentWithDoctype() {
        builder.parse("", baseUri);
        Token.Comment comment = new Token.Comment();
        comment.data("!DOCTYPE html");
        comment.bogus = true;
        builder.insert(comment);
        // Should insert XmlDeclaration? Actually data starts with "!" so first branch
        assertEquals(1, doc.childNodes().size());
        assertTrue(doc.child(0) instanceof XmlDeclaration);
    }

    @Test
    public void testInsertBogusCommentInvalidLength() {
        builder.parse("", baseUri);
        Token.Comment comment = new Token.Comment();
        comment.data("a");
        comment.bogus = true;
        builder.insert(comment);
        // length not > 1, so insert as normal Comment
        assertEquals(1, doc.childNodes().size());
        assertTrue(doc.child(0) instanceof Comment);
    }

    // Test insert(Comment) non-bogus
    @Test
    public void testInsertRegularComment() {
        builder.parse("", baseUri);
        Token.Comment comment = new Token.Comment();
        comment.data("hello");
        comment.bogus = false;
        builder.insert(comment);
        assertEquals(1, doc.childNodes().size());
        assertTrue(doc.child(0) instanceof Comment);
        assertEquals("hello", ((Comment)doc.child(0)).getData());
    }

    // Test insert(Character) with CDATA
    @Test
    public void testInsertCharacterCData() {
        builder.parse("", baseUri);
        Token.Character token = new Token.Character();
        token.data("<script>");
        token.isCData = true;
        builder.insert(token);
        assertEquals(1, doc.childNodes().size());
        assertTrue(doc.child(0) instanceof CDataNode);
        assertEquals("<script>", ((CDataNode)doc.child(0)).getWholeText());
    }

    @Test
    public void testInsertCharacterText() {
        builder.parse("", baseUri);
        Token.Character token = new Token.Character();
        token.data("plain text");
        token.isCData = false;
        builder.insert(token);
        assertEquals(1, doc.childNodes().size());
        assertTrue(doc.child(0) instanceof TextNode);
        assertEquals("plain text", ((TextNode)doc.child(0)).getWholeText());
    }

    // Test insert(Doctype)
    @Test
    public void testInsertDoctype() {
        builder.parse("", baseUri);
        Token.Doctype d = new Token.Doctype();
        d.name("html");
        d.publicIdentifier = "-//W3C//DTD XHTML 1.0 Strict//EN";
        d.systemIdentifier = "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd";
        d.pubSysKey = "-";
        builder.insert(d);
        assertEquals(1, doc.childNodes().size());
        DocumentType dt = (DocumentType) doc.child(0);
        assertEquals("html", dt.name());
        assertEquals("PUBLIC", dt.pubSysKey());
        assertEquals("-//W3C//DTD XHTML 1.0 Strict//EN", dt.publicIdentifier());
        assertEquals("http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd", dt.systemIdentifier());
    }

    // Test popStackToClose when found
    @Test
    public void testPopStackToCloseWhenFound() throws Exception {
        builder.parse("<a><b></b></a>", baseUri);
        // After parse, stack likely has doc only? Let's manually set up
        builder = new XmlTreeBuilder();
        builder.parse("<a><b>", baseUri); // parse without closing
        // stack should have doc, a, b
        assertEquals(3, builder.stack.size());
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("b");
        builder.popStackToClose(endTag);
        // After closing b, stack should have doc and a
        assertEquals(2, builder.stack.size());
        assertEquals("a", ((Element)builder.stack.get(1)).tagName());
    }

    @Test
    public void testPopStackToCloseNotFound() {
        builder.parse("<a>", baseUri);
        int originalSize = builder.stack.size();
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("nonexistent");
        builder.popStackToClose(endTag);
        assertEquals(originalSize, builder.stack.size());
    }

    @Test
    public void testPopStackToCloseMultipleElements() {
        builder = new XmlTreeBuilder();
        builder.parse("<a><b><c></c></b>", baseUri); // may parse partially
        // stack likely: doc, a, b, c
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("b");
        builder.popStackToClose(endTag);
        // Should pop c and b, leaving doc and a
        assertEquals(2, builder.stack.size());
        assertEquals("a", ((Element)builder.stack.get(1)).tagName());
    }

    // Test parseFragment methods
    @Test
    public void testParseFragment() {
        String fragment = "<div>content</div><span>more</span>";
        ParseErrorList errors = ParseErrorList.noTracking();
        ParseSettings settings = ParseSettings.preserveCase;
        List<Node> nodes = builder.parseFragment(fragment, baseUri, errors, settings);
        assertNotNull(nodes);
        assertEquals(2, nodes.size());
        assertEquals("div", ((Element)nodes.get(0)).tagName());
        assertEquals("span", ((Element)nodes.get(1)).tagName());
    }

    // Edge case: empty fragment
    @Test
    public void testParseFragmentEmpty() {
        List<Node> nodes = builder.parseFragment("", baseUri, ParseErrorList.noTracking(), ParseSettings.preserveCase);
        assertNotNull(nodes);
        assertEquals(0, nodes.size());
    }

    // Test parse with leading/trailing whitespace
    @Test
    public void testParseWithWhitespace() {
        String xml = "  <root>  <child>text</child>  </root>  ";
        Document doc = builder.parse(xml, baseUri);
        assertEquals("root", doc.child(0).tagName());
        assertEquals("child", doc.child(0).child(0).tagName());
    }

    // Test null input for parse methods
    @Test(expected = NullPointerException.class)
    public void testParseNullReader() {
        builder.parse((Reader)null, baseUri);
    }

    @Test(expected = NullPointerException.class)
    public void testParseNullString() {
        builder.parse((String)null, baseUri);
    }

    // Test null baseUri
    @Test
    public void testParseNullBaseUri() {
        String xml = "<root/>";
        Document doc = builder.parse(xml, null);
        assertNotNull(doc);
        assertEquals("root", doc.child(0).tagName());
    }
}