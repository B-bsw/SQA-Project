package org.jsoup.parser;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

public class ParserTest {
    private static final String BASE_URI = "http://example.com/";
    private static final String SIMPLE_HTML = "<html><head><title>Title</title></head><body><p>Hello</p></body></html>";
    private static final String FRAGMENT_HTML = "<p>Fragment</p><div>Div</div>";
    private static final String EMPTY_HTML = "";
    private static final String NULL_HTML = null;
    private static final String SELF_CLOSING_HTML = "<div/>";
    private static final String COMMENT_HTML = "<!-- comment --><p>text</p>";
    private static final String CDATA_HTML = "<![CDATA[data]]><p>text</p>";
    private static final String XML_DECL_HTML = "<?xml version=\"1.0\"?><p>text</p>";
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testParseFullDocument() {
        Document doc = Parser.parse(SIMPLE_HTML, BASE_URI);
        Assert.assertNotNull(doc);
        Assert.assertEquals("Title", doc.title());
        Assert.assertEquals("Hello", doc.body().text());
        Assert.assertEquals(BASE_URI, doc.baseUri());
    }
    
    @Test
    public void testParseBodyFragment() {
        Document doc = Parser.parseBodyFragment(FRAGMENT_HTML, BASE_URI);
        Assert.assertNotNull(doc);
        Assert.assertEquals("Fragment Div", doc.body().text());
        Assert.assertEquals(2, doc.body().children().size());
    }
    
    @Test
    public void testParseEmptyString() {
        Document doc = Parser.parse(EMPTY_HTML, BASE_URI);
        Assert.assertNotNull(doc);
        Assert.assertEquals("", doc.text());
        Assert.assertEquals("", doc.title());
    }
    
    @Test(expected = NullPointerException.class)
    public void testParseNullHtml() {
        Parser.parse(NULL_HTML, BASE_URI);
    }
    
    @Test
    public void testParseNullBaseUri() {
        try {
            Parser.parse(SIMPLE_HTML, null);
            Assert.fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }
    
    @Test
    public void testParseSelfClosingTag() {
        Document doc = Parser.parse(SELF_CLOSING_HTML, BASE_URI);
        Assert.assertNotNull(doc);
        Assert.assertNotNull(doc.body());
        Assert.assertTrue(doc.body().children().isEmpty());
    }
    
    @Test
    public void testParseComment() {
        Document doc = Parser.parse(COMMENT_HTML, BASE_URI);
        Assert.assertNotNull(doc);
        Assert.assertEquals("text", doc.body().text());
    }
    
    @Test
    public void testParseCdata() {
        Document doc = Parser.parse(CDATA_HTML, BASE_URI);
        Assert.assertNotNull(doc);
        Assert.assertNotNull(doc.body());
    }
    
    @Test
    public void testParseXmlDecl() {
        Document doc = Parser.parse(XML_DECL_HTML, BASE_URI);
        Assert.assertNotNull(doc);
        Assert.assertEquals("text", doc.body().text());
    }
    
    @Test
    public void testParseTextWithSpecialChars() {
        Document doc = Parser.parse("<p>a &amp; b</p>", BASE_URI);
        Assert.assertNotNull(doc);
        Assert.assertEquals("a & b", doc.text());
    }
    
    @Test
    public void testParseNestedElements() {
        Document doc = Parser.parse("<div><span>inner</span><div>outer</div></div>", BASE_URI);
        Assert.assertNotNull(doc);
        Assert.assertEquals("inner outer", doc.body().text());
    }
    
    @Test
    public void testParseWithMultipleBranches() {
        Document doc1 = Parser.parse("<div/><p>text</p>", BASE_URI);
        Assert.assertNotNull(doc1);
        
        Document doc2 = Parser.parse("<table><tr><td>cell</td></tr></table>", BASE_URI);
        Assert.assertNotNull(doc2);
        
        Document doc3 = Parser.parse("<br>text<br>", BASE_URI);
        Assert.assertNotNull(doc3);
    }
    
    @Test
    public void testParseBodyFragmentEmpty() {
        Document doc = Parser.parseBodyFragment(EMPTY_HTML, BASE_URI);
        Assert.assertNotNull(doc);
        Assert.assertNotNull(doc.body());
    }
    
    @Test(expected = NullPointerException.class)
    public void testParseBodyFragmentNullHtml() {
        Parser.parseBodyFragment(NULL_HTML, BASE_URI);
    }
    
    @Test
    public void testParseWithUnclosedTags() {
        Document doc = Parser.parse("<div><p>text", BASE_URI);
        Assert.assertNotNull(doc);
        Assert.assertEquals("text", doc.text());
    }
    
    @Test
    public void testParseWithVoidElements() {
        Document doc = Parser.parse("<img src=\"test.jpg\" alt=\"img\"><br><hr>", BASE_URI);
        Assert.assertNotNull(doc);
        Assert.assertEquals(3, doc.body().children().size());
    }
    
    @Test
    public void testParseWithAttributeQuotes() {
        Document doc = Parser.parse("<p class='single'>text</p>", BASE_URI);
        Assert.assertNotNull(doc);
        Assert.assertEquals("text", doc.text());
        
        Document doc2 = Parser.parse("<p class=\"double\">text</p>", BASE_URI);
        Assert.assertNotNull(doc2);
        Assert.assertEquals("text", doc2.text());
    }
    
    @Test
    public void testParseTextAreaAndScriptContent() {
        Document doc = Parser.parse("<textarea><p>raw</p></textarea><script>if(a<b) {}</script>", BASE_URI);
        Assert.assertNotNull(doc);
        Assert.assertNotNull(doc.body());
    }
    
    @Test
    public void testParseBaseTagUpdatesBaseUri() {
        String html = "<base href=\"http://newbase.com/\"><p>text</p>";
        Document doc = Parser.parse(html, BASE_URI);
        Assert.assertNotNull(doc);
        Assert.assertEquals("http://newbase.com/", doc.baseUri());
    }
}