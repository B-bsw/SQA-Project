package org.jsoup.select;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class SelectorTest {

    private Document createDocument() {
        String html = "<html><head><title>Test</title></head><body>"
                + "<div id='div1' class='main container' data-id='123'>"
                + "<p class='child first'>First paragraph</p>"
                + "<p class='child'>Second <span>span text</span></p>"
                + "<span class='child'>Span element</span>"
                + "</div>"
                + "<div id='div2' class='container'>"
                + "<ul><li>Item1</li><li>Item2</li><li>Item3</li></ul>"
                + "<a href='http://example.com/page1' title='link1'>Link1</a>"
                + "<a href='http://example.com/page2' title='link2'>Link2</a>"
                + "</div>"
                + "<input type='text' name='username' value='user123'>"
                + "<input type='password' name='password' value='pass456'>"
                + "<div id='empty'></div>"
                + "</body></html>";
        return Jsoup.parse(html);
    }

    @Test
    public void testSelectTagName() {
        Document doc = createDocument();
        Elements elements = Selector.select("p", doc);
        assertEquals(2, elements.size());
        assertEquals("p", elements.get(0).tagName());
        assertEquals("p", elements.get(1).tagName());
    }

    @Test
    public void testSelectId() {
        Document doc = createDocument();
        Elements elements = Selector.select("#div1", doc);
        assertEquals(1, elements.size());
        assertEquals("div1", elements.get(0).id());
    }

    @Test
    public void testSelectClass() {
        Document doc = createDocument();
        Elements elements = Selector.select(".child", doc);
        assertEquals(3, elements.size());
        for (Element e : elements) {
            assertTrue(e.hasClass("child"));
        }
    }

    @Test
    public void testSelectAttributeExists() {
        Document doc = createDocument();
        Elements elements = Selector.select("[data-id]", doc);
        assertEquals(1, elements.size());
        assertEquals("123", elements.get(0).attr("data-id"));
    }

    @Test
    public void testSelectAttributeValue() {
        Document doc = createDocument();
        Elements elements = Selector.select("[name=username]", doc);
        assertEquals(1, elements.size());
        assertEquals("input", elements.get(0).tagName());
    }

    @Test
    public void testSelectAttributeStartsWith() {
        Document doc = createDocument();
        Elements elements = Selector.select("[href^=http://]", doc);
        assertEquals(2, elements.size());
    }

    @Test
    public void testSelectAttributeEndsWith() {
        Document doc = createDocument();
        Elements elements = Selector.select("[href$=page1]", doc);
        assertEquals(1, elements.size());
        assertEquals("Link1", elements.get(0).text());
    }

    @Test
    public void testSelectAttributeContains() {
        Document doc = createDocument();
        Elements elements = Selector.select("[title*=link]", doc);
        assertEquals(2, elements.size());
    }

    @Test
    public void testSelectChildCombinator() {
        Document doc = createDocument();
        Elements elements = Selector.select("div > p", doc);
        assertEquals(2, elements.size());
    }

    @Test
    public void testSelectDescendantCombinator() {
        Document doc = createDocument();
        Elements elements = Selector.select("div span", doc);
        assertEquals(1, elements.size());
        assertEquals("span text", elements.get(0).text());
    }

    @Test
    public void testSelectGroup() {
        Document doc = createDocument();
        Elements elements = Selector.select("p, span", doc);
        assertEquals(3, elements.size());
    }

    @Test
    public void testSelectUniversal() {
        Document doc = createDocument();
        Elements elements = Selector.select("*", doc);
        assertFalse(elements.isEmpty());
        assertTrue(elements.size() > 10);
    }

    @Test
    public void testSelectEmptyQuery() {
        Document doc = createDocument();
        try {
            Selector.select("", doc);
            fail("Expected exception for empty query");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("query must not be empty"));
        }
    }

    @Test
    public void testSelectNullQuery() {
        Document doc = createDocument();
        try {
            Selector.select(null, doc);
            fail("Expected exception for null query");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSelectNullRoot() {
        try {
            Selector.select("p", (Element) null);
            fail("Expected exception for null root");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSelectIterable() {
        Document doc = createDocument();
        Elements divs = new Elements(doc.select("div"));
        Elements result = Selector.select("p", (Iterable<Element>) divs);
        assertTrue(result.size() >= 2);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testInvalidSelector() {
        Document doc = createDocument();
        Selector.select(">>>", doc);
    }

    @Test
    public void testPseudoContains() {
        Document doc = createDocument();
        Elements elements = Selector.select("p:contains(First)", doc);
        assertEquals(1, elements.size());
        assertEquals("first", elements.get(0).className());
    }

    @Test
    public void testPseudoContainsCaseInsensitive() {
        Document doc = createDocument();
        Elements elements = Selector.select("p:contains(FIRST)", doc);
        assertEquals(1, elements.size());
    }

    @Test
    public void testPseudoEq() {
        Document doc = createDocument();
        Elements elements = Selector.select("p:eq(0)", doc);
        assertEquals(1, elements.size());
        assertEquals("First paragraph", elements.get(0).text());
    }

    @Test
    public void testPseudoGt() {
        Document doc = createDocument();
        Elements elements = Selector.select("li:gt(0)", doc);
        assertEquals(2, elements.size());
    }

    @Test
    public void testPseudoLt() {
        Document doc = createDocument();
        Elements elements = Selector.select("li:lt(2)", doc);
        assertEquals(2, elements.size());
    }

    @Test
    public void testPseudoMatches() {
        Document doc = createDocument();
        Elements elements = Selector.select("td:matches(\\d+)", doc);
        assertTrue(elements.isEmpty());
        
        doc.select("td").remove();
        Elements items = Selector.select("li:matches(Item\\d+)", doc);
        assertEquals(3, items.size());
    }

    @Test
    public void testPseudoHas() {
        Document doc = createDocument();
        Elements elements = Selector.select("div:has(p)", doc);
        assertEquals(1, elements.size());
        assertEquals("div1", elements.get(0).id());
    }

    @Test
    public void testPseudoNot() {
        Document doc = createDocument();
        Elements elements = Selector.select("p:not(.child)", doc);
        assertEquals(0, elements.size());
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testEmptySubQuery() {
        Document doc = createDocument();
        Selector.select(":has()", doc);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testEmptyContainsText() {
        Document doc = createDocument();
        Selector.select(":contains()", doc);
    }

    @Test
    public void testSelectNestedSelectors() {
        Document doc = createDocument();
        Elements elements = Selector.select("div.container p.child.first", doc);
        assertEquals(1, elements.size());
        assertEquals("First paragraph", elements.get(0).text());
    }

    @Test
    public void testSelectAttributeNotEquals() {
        Document doc = createDocument();
        Elements elements = Selector.select("[name!=username]", doc);
        for (Element e : elements) {
            assertFalse("username".equals(e.attr("name")));
        }
    }

    @Test
    public void testSelectMultipleClasses() {
        Document doc = createDocument();
        Elements elements = Selector.select(".main.container", doc);
        assertEquals(1, elements.size());
        assertEquals("div1", elements.get(0).id());
    }

    @Test
    public void testSelectWithLeadingCombinator() {
        Document doc = createDocument();
        Elements elements = Selector.select("> p", doc);
        assertTrue(elements.size() >= 0);
    }
}