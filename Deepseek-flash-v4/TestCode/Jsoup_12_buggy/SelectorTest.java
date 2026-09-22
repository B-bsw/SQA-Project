package org.jsoup.select;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class SelectorTest {

    private Document createDocument() {
        String html = "<html><head><title>Test</title></head><body>"
                + "<div id='main' class='content container'>"
                + "<p id='p1' class='text first'>Hello world</p>"
                + "<p id='p2' class='text'>Second paragraph</p>"
                + "<a href='http://example.com' class='link ext' title='Example'>Link</a>"
                + "<a href='http://example.org' class='link' data-info='x'>Second Link</a>"
                + "<ul id='list'>"
                + "<li class='item'>One</li>"
                + "<li class='item selected'>Two</li>"
                + "<li id='third' class='item'>Three</li>"
                + "</ul>"
                + "<span class='contains-text'>Some span text</span>"
                + "<div class='child-container'>"
                + "<div class='nested'>"
                + "<p id='nested-p'>Nested paragraph</p>"
                + "</div>"
                + "</div>"
                + "</div>"
                + "</body></html>";
        return Jsoup.parse(html);
    }

    @Test
    public void testSelectByTag() {
        Document doc = createDocument();
        Elements elements = Selector.select("p", doc);
        assertEquals(3, elements.size());
        assertEquals("p1", elements.get(0).id());
        assertEquals("p2", elements.get(1).id());
    }

    @Test
    public void testSelectById() {
        Document doc = createDocument();
        Elements elements = Selector.select("#p1", doc);
        assertEquals(1, elements.size());
        assertEquals("p1", elements.get(0).id());
    }

    @Test
    public void testSelectByClass() {
        Document doc = createDocument();
        Elements elements = Selector.select(".text", doc);
        assertEquals(2, elements.size());
        assertEquals("p1", elements.get(0).id());
        assertEquals("p2", elements.get(1).id());
    }

    @Test
    public void testSelectByAttribute() {
        Document doc = createDocument();
        Elements elements = Selector.select("a[href]", doc);
        assertEquals(2, elements.size());
        assertEquals("http://example.com", elements.get(0).attr("href"));
    }

    @Test
    public void testSelectByAttributeValue() {
        Document doc = createDocument();
        Elements elements = Selector.select("a[href^='http://example.c']", doc);
        assertEquals(1, elements.size());
        assertEquals("http://example.com", elements.get(0).attr("href"));
    }

    @Test
    public void testSelectByAttributeValueEnding() {
        Document doc = createDocument();
        Elements elements = Selector.select("a[href$='.org']", doc);
        assertEquals(1, elements.size());
        assertEquals("http://example.org", elements.get(0).attr("href"));
    }

    @Test
    public void testSelectByAttributeValueContaining() {
        Document doc = createDocument();
        Elements elements = Selector.select("a[href*='example']", doc);
        assertEquals(2, elements.size());
    }

    @Test
    public void testSelectByAttributeValueMatching() {
        Document doc = createDocument();
        Elements elements = Selector.select("a[href~=^http://example\\.com$]", doc);
        assertEquals(1, elements.size());
        assertEquals("http://example.com", elements.get(0).attr("href"));
    }

    @Test
    public void testSelectByAttributeValueNot() {
        Document doc = createDocument();
        Elements elements = Selector.select("a[href!='http://example.com']", doc);
        assertEquals(1, elements.size());
        assertEquals("http://example.org", elements.get(0).attr("href"));
    }

    @Test
    public void testSelectAllElements() {
        Document doc = createDocument();
        Elements elements = Selector.select("*", doc);
        assertTrue(elements.size() > 10);
    }

    @Test
    public void testSelectByTagDescendant() {
        Document doc = createDocument();
        Elements elements = Selector.select("div p", doc);
        assertEquals(3, elements.size());
    }

    @Test
    public void testSelectByChildCombinator() {
        Document doc = createDocument();
        Elements elements = Selector.select("div > p", doc);
        assertEquals(2, elements.size());
    }

    @Test
    public void testSelectByAdjacentSibling() {
        Document doc = createDocument();
        Elements elements = Selector.select("p + a", doc);
        assertEquals(1, elements.size());
        assertEquals("http://example.com", elements.get(0).attr("href"));
    }

    @Test
    public void testSelectByGeneralSibling() {
        Document doc = createDocument();
        Elements elements = Selector.select("p ~ a", doc);
        assertEquals(2, elements.size());
    }

    @Test
    public void testSelectByGroup() {
        Document doc = createDocument();
        Elements elements = Selector.select("p, li", doc);
        assertEquals(6, elements.size());
    }

    @Test
    public void testSelectByIndexLessThan() {
        Document doc = createDocument();
        Elements elements = Selector.select("li:lt(2)", doc);
        assertEquals(2, elements.size());
    }

    @Test
    public void testSelectByIndexGreaterThan() {
        Document doc = createDocument();
        Elements elements = Selector.select("li:gt(1)", doc);
        assertEquals(1, elements.size());
        assertEquals("third", elements.get(0).id());
    }

    @Test
    public void testSelectByIndexEquals() {
        Document doc = createDocument();
        Elements elements = Selector.select("li:eq(1)", doc);
        assertEquals(1, elements.size());
        assertEquals("second", elements.get(0).className().split(" ")[1]);
    }

    @Test
    public void testSelectHasSelector() {
        Document doc = createDocument();
        Elements elements = Selector.select("div:has(p)", doc);
        assertTrue(elements.size() >= 3);
    }

    @Test
    public void testSelectNotSelector() {
        Document doc = createDocument();
        Elements elements = Selector.select("p:not(#p1)", doc);
        assertEquals(2, elements.size());
        assertEquals("p2", elements.get(0).id());
    }

    @Test
    public void testSelectContainsSelector() {
        Document doc = createDocument();
        Elements elements = Selector.select("p:contains(Second)", doc);
        assertEquals(1, elements.size());
        assertEquals("p2", elements.get(0).id());
    }

    @Test
    public void testSelectContainsOwnSelector() {
        Document doc = createDocument();
        Elements elements = Selector.select("span:containsOwn(Some span text)", doc);
        assertEquals(1, elements.size());
        assertEquals("contains-text", elements.get(0).className());
    }

    @Test
    public void testSelectMatchesSelector() {
        Document doc = createDocument();
        Elements elements = Selector.select("p:matches(\\d)", doc);
        assertEquals(0, elements.size());
    }

    @Test
    public void testSelectMatchesOwnSelector() {
        Document doc = createDocument();
        Elements elements = Selector.select("span:matchesOwn(span text)", doc);
        assertEquals(1, elements.size());
    }

    @Test
    public void testSelectEmptyQuery() {
        Document doc = createDocument();
        try {
            Selector.select("", doc);
            fail("Expected SelectorParseException");
        } catch (Selector.SelectorParseException e) {
            assertTrue(e.getMessage().contains("must not be empty"));
        }
    }

    @Test
    public void testSelectNullQuery() {
        Document doc = createDocument();
        try {
            Selector.select(null, doc);
            fail("Expected SelectorParseException");
        } catch (Selector.SelectorParseException e) {
            assertEquals("Selector must not be null", e.getMessage());
        }
    }

    @Test
    public void testSelectWithHasEmptySubquery() {
        Document doc = createDocument();
        try {
            Selector.select("div:has()", doc);
            fail("Expected SelectorParseException");
        } catch (Selector.SelectorParseException e) {
            assertTrue(e.getMessage().contains("must not be empty"));
        }
    }

    @Test
    public void testSelectWithContainsEmptyText() {
        Document doc = createDocument();
        try {
            Selector.select("p:contains()", doc);
            fail("Expected SelectorParseException");
        } catch (Selector.SelectorParseException e) {
            assertTrue(e.getMessage().contains("must not be empty"));
        }
    }

    @Test
    public void testSelectWithMatchesEmptyRegex() {
        Document doc = createDocument();
        try {
            Selector.select("p:matches()", doc);
            fail("Expected SelectorParseException");
        } catch (Selector.SelectorParseException e) {
            assertTrue(e.getMessage().contains("must not be empty"));
        }
    }

    @Test
    public void testSelectWithNotEmptySubquery() {
        Document doc = createDocument();
        try {
            Selector.select("div:not()", doc);
            fail("Expected SelectorParseException");
        } catch (Selector.SelectorParseException e) {
            assertTrue(e.getMessage().contains("must not be empty"));
        }
    }

    @Test
    public void testSelectWithUnknownSelector() {
        Document doc = createDocument();
        try {
            Selector.select("p:unknownSelector", doc);
            fail("Expected SelectorParseException");
        } catch (Selector.SelectorParseException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testSelectWithMultipleRoots() {
        Document doc = createDocument();
        Elements roots = new Elements();
        roots.add(doc.getElementById("p1"));
        roots.add(doc.getElementById("p2"));
        Elements elements = Selector.select("p", roots);
        assertEquals(2, elements.size());
    }

    @Test
    public void testSelectWithNullRoot() {
        try {
            Selector.select("p", (Element) null);
            fail("Expected SelectorParseException");
        } catch (Selector.SelectorParseException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testSelectWithIndexOutOfRange() {
        Document doc = createDocument();
        Elements elements = Selector.select("li:lt(100)", doc);
        assertEquals(3, elements.size());
    }

    @Test
    public void testSelectWithIndexGreaterThanMax() {
        Document doc = createDocument();
        Elements elements = Selector.select("li:gt(-1)", doc);
        assertEquals(3, elements.size());
    }

    @Test
    public void testSelectWithIndexEqualsOutOfRange() {
        Document doc = createDocument();
        Elements elements = Selector.select("li:eq(100)", doc);
        assertEquals(0, elements.size());
    }

    @Test
    public void testSelectClassWithHyphen() {
        Document doc = createDocument();
        Elements elements = Selector.select(".child-container", doc);
        assertEquals(1, elements.size());
    }

    @Test
    public void testSelectNestedChildCombinator() {
        Document doc = createDocument();
        Elements elements = Selector.select("div > div > p", doc);
        assertEquals(1, elements.size());
        assertEquals("nested-p", elements.get(0).id());
    }
}