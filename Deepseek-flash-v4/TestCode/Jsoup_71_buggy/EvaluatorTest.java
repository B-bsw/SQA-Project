package org.jsoup.select;

import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class EvaluatorTest {

    private Element createElement(String tag, String id, String... classes) {
        Element el = new Element(tag);
        if (id != null) {
            el.attr("id", id);
        }
        for (String cls : classes) {
            el.addClass(cls);
        }
        return el;
    }

    @Test
    public void testTagMatches() {
        Evaluator.Tag tag = new Evaluator.Tag("div");
        Element el = createElement("DIV", null);
        assertTrue(tag.matches(el, el));
        assertTrue(tag.matches(el, createElement("div", null)));
        assertFalse(tag.matches(el, createElement("span", null)));
    }

    @Test
    public void testTagEndsWith() {
        Evaluator.TagEndsWith evaluator = new Evaluator.TagEndsWith("iv");
        assertTrue(evaluator.matches(null, createElement("div", null)));
        assertFalse(evaluator.matches(null, createElement("span", null)));
    }

    @Test
    public void testIdMatches() {
        Evaluator.Id evaluator = new Evaluator.Id("test");
        Element el = createElement("div", "test");
        assertTrue(evaluator.matches(el, el));
        assertFalse(evaluator.matches(null, createElement("div", "other")));
    }

    @Test
    public void testClassMatches() {
        Evaluator.Class evaluator = new Evaluator.Class("foo");
        Element el = createElement("div", null, "foo", "bar");
        assertTrue(evaluator.matches(null, el));
        assertFalse(evaluator.matches(null, createElement("div", null, "baz")));
    }

    @Test
    public void testAttributeMatches() {
        Evaluator.Attribute evaluator = new Evaluator.Attribute("href");
        Element el = createElement("a", null);
        el.attr("href", "http://example.com");
        assertTrue(evaluator.matches(null, el));
        assertFalse(evaluator.matches(null, createElement("a", null)));
    }

    @Test
    public void testAttributeStarting() {
        Evaluator.AttributeStarting evaluator = new Evaluator.AttributeStarting("data-");
        Element el = createElement("div", null);
        el.attr("data-custom", "value");
        assertTrue(evaluator.matches(null, el));
        assertFalse(evaluator.matches(null, createElement("div", null)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttributeStartingNullKey() {
        new Evaluator.AttributeStarting("");
    }

    @Test
    public void testAttributeWithValue() {
        Evaluator.AttributeWithValue evaluator = new Evaluator.AttributeWithValue("type", "text");
        Element el = createElement("input", null);
        el.attr("type", "text");
        assertTrue(evaluator.matches(null, el));
        el.attr("type", "TEXT");
        assertTrue(evaluator.matches(null, el));
        el.attr("type", "password");
        assertFalse(evaluator.matches(null, el));
    }

    @Test
    public void testAttributeWithValueNot() {
        Evaluator.AttributeWithValueNot evaluator = new Evaluator.AttributeWithValueNot("disabled", "true");
        Element el = createElement("input", null);
        el.attr("disabled", "false");
        assertTrue(evaluator.matches(null, el));
        el.attr("disabled", "true");
        assertFalse(evaluator.matches(null, el));
    }

    @Test
    public void testAttributeWithValueStarting() {
        Evaluator.AttributeWithValueStarting evaluator = new Evaluator.AttributeWithValueStarting("href", "http");
        Element el = createElement("a", null);
        el.attr("href", "https://example.com");
        assertTrue(evaluator.matches(null, el));
        el.attr("href", "ftp://example.com");
        assertFalse(evaluator.matches(null, el));
    }

    @Test
    public void testAttributeWithValueEnding() {
        Evaluator.AttributeWithValueEnding evaluator = new Evaluator.AttributeWithValueEnding("file", ".html");
        Element el = createElement("a", null);
        el.attr("file", "index.html");
        assertTrue(evaluator.matches(null, el));
        el.attr("file", "index.htm");
        assertFalse(evaluator.matches(null, el));
    }

    @Test
    public void testAttributeWithValueContaining() {
        Evaluator.AttributeWithValueContaining evaluator = new Evaluator.AttributeWithValueContaining("class", "foo");
        Element el = createElement("div", null);
        el.attr("class", "foobar");
        assertTrue(evaluator.matches(null, el));
        el.attr("class", "baz");
        assertFalse(evaluator.matches(null, el));
    }

    @Test
    public void testAttributeWithValueMatching() {
        Evaluator.AttributeWithValueMatching evaluator = new Evaluator.AttributeWithValueMatching("data-id", Pattern.compile("\\d+"));
        Element el = createElement("div", null);
        el.attr("data-id", "12345");
        assertTrue(evaluator.matches(null, el));
        el.attr("data-id", "abc");
        assertFalse(evaluator.matches(null, el));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttributeKeyPairNullKey() {
        new Evaluator.AttributeKeyPair("", "value") {};
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttributeKeyPairNullValue() {
        new Evaluator.AttributeKeyPair("key", "") {};
    }

    @Test
    public void testAllElements() {
        Evaluator.AllElements evaluator = new Evaluator.AllElements();
        assertTrue(evaluator.matches(null, createElement("div", null)));
        assertEquals("*", evaluator.toString());
    }

    @Test
    public void testIndexLessThan() {
        Evaluator.IndexLessThan evaluator = new Evaluator.IndexLessThan(1);
        Element parent = createElement("ul", null);
        Element child1 = createElement("li", null);
        Element child2 = createElement("li", null);
        parent.appendChild(child1);
        parent.appendChild(child2);
        assertTrue(evaluator.matches(parent, child1));
        assertFalse(evaluator.matches(parent, child2));
    }

    @Test
    public void testIndexGreaterThan() {
        Evaluator.IndexGreaterThan evaluator = new Evaluator.IndexGreaterThan(0);
        Element parent = createElement("ul", null);
        Element child1 = createElement("li", null);
        Element child2 = createElement("li", null);
        parent.appendChild(child1);
        parent.appendChild(child2);
        assertFalse(evaluator.matches(parent, child1));
        assertTrue(evaluator.matches(parent, child2));
    }

    @Test
    public void testIndexEquals() {
        Evaluator.IndexEquals evaluator = new Evaluator.IndexEquals(0);
        Element parent = createElement("ul", null);
        Element child1 = createElement("li", null);
        Element child2 = createElement("li", null);
        parent.appendChild(child1);
        parent.appendChild(child2);
        assertTrue(evaluator.matches(parent, child1));
        assertFalse(evaluator.matches(parent, child2));
    }

    @Test
    public void testIsLastChild() {
        Evaluator.IsLastChild evaluator = new Evaluator.IsLastChild();
        Element parent = createElement("ul", null);
        Element child1 = createElement("li", null);
        Element child2 = createElement("li", null);
        parent.appendChild(child1);
        parent.appendChild(child2);
        assertFalse(evaluator.matches(parent, child1));
        assertTrue(evaluator.matches(parent, child2));
        assertFalse(evaluator.matches(null, createElement("li", null)));
    }

    @Test
    public void testIsFirstOfType() {
        Evaluator.IsFirstOfType evaluator = new Evaluator.IsFirstOfType();
        Element parent = createElement("ul", null);
        Element child1 = createElement("li", null);
        Element child2 = createElement("li", null);
        Element child3 = createElement("span", null);
        parent.appendChild(child1);
        parent.appendChild(child2);
        parent.appendChild(child3);
        assertTrue(evaluator.matches(parent, child1));
        assertFalse(evaluator.matches(parent, child2));
        assertFalse(evaluator.matches(parent, child3));
        assertEquals(":first-of-type", evaluator.toString());
    }

    @Test
    public void testIsLastOfType() {
        Evaluator.IsLastOfType evaluator = new Evaluator.IsLastOfType();
        Element parent = createElement("ul", null);
        Element child1 = createElement("li", null);
        Element child2 = createElement("li", null);
        Element child3 = createElement("span", null);
        parent.appendChild(child1);
        parent.appendChild(child2);
        parent.appendChild(child3);
        assertFalse(evaluator.matches(parent, child1));
        assertFalse(evaluator.matches(parent, child2));
        assertTrue(evaluator.matches(parent, child3));
        assertEquals(":last-of-type", evaluator.toString());
    }

    @Test
    public void testIsNthChild() {
        Evaluator.IsNthChild evaluator = new Evaluator.IsNthChild(1, 1); // :nth-child(1n+1) = odd
        Element parent = createElement("ul", null);
        Element child1 = createElement("li", null);
        Element child2 = createElement("li", null);
        Element child3 = createElement("li", null);
        parent.appendChild(child1);
        parent.appendChild(child2);
        parent.appendChild(child3);
        assertTrue(evaluator.matches(parent, child1));
        assertFalse(evaluator.matches(parent, child2));
        assertTrue(evaluator.matches(parent, child3));
        assertEquals(":nth-child(1n+1)", evaluator.toString());
    }

    @Test
    public void testIsNthLastChild() {
        Evaluator.IsNthLastChild evaluator = new Evaluator.IsNthLastChild(0, 2); // 2nd from last
        Element parent = createElement("ul", null);
        Element child1 = createElement("li", null);
        Element child2 = createElement("li", null);
        Element child3 = createElement("li", null);
        parent.appendChild(child1);
        parent.appendChild(child2);
        parent.appendChild(child3);
        assertFalse(evaluator.matches(parent, child1));
        assertTrue(evaluator.matches(parent, child2));
        assertFalse(evaluator.matches(parent, child3));
        assertEquals(":nth-last-child(2)", evaluator.toString());
    }

    @Test
    public void testIsNthOfType() {
        Evaluator.IsNthOfType evaluator = new Evaluator.IsNthOfType(1, 0); // every element of same type
        Element parent = createElement("ul", null);
        Element child1 = createElement("li", null);
        Element child2 = createElement("span", null);
        Element child3 = createElement("li", null);
        parent.appendChild(child1);
        parent.appendChild(child2);
        parent.appendChild(child3);
        assertTrue(evaluator.matches(parent, child1));
        assertTrue(evaluator.matches(parent, child2));
        assertFalse(evaluator.matches(parent, child3));
        assertEquals(":nth-of-type(1n)", evaluator.toString());
    }

    @Test
    public void testIsNthLastOfType() {
        Evaluator.IsNthLastOfType evaluator = new Evaluator.IsNthLastOfType(0, 1);
        Element parent = createElement("ul", null);
        Element child1 = createElement("li", null);
        Element child2 = createElement("li", null);
        Element child3 = createElement("span", null);
        parent.appendChild(child1);
        parent.appendChild(child2);
        parent.appendChild(child3);
        assertTrue(evaluator.matches(parent, child3));
        assertFalse(evaluator.matches(parent, child1));
        assertEquals(":nth-last-of-type(1)", evaluator.toString());
    }

    @Test
    public void testIsOnlyChild() {
        Evaluator.IsOnlyChild evaluator = new Evaluator.IsOnlyChild();
        Element parent = createElement("ul", null);
        Element child = createElement("li", null);
        parent.appendChild(child);
        assertTrue(evaluator.matches(parent, child));
        Element child2 = createElement("li", null);
        parent.appendChild(child2);
        assertFalse(evaluator.matches(parent, child));
        assertFalse(evaluator.matches(null, createElement("li", null)));
        assertEquals(":only-child", evaluator.toString());
    }

    @Test
    public void testIsOnlyOfType() {
        Evaluator.IsOnlyOfType evaluator = new Evaluator.IsOnlyOfType();
        Element parent = createElement("ul", null);
        Element child = createElement("li", null);
        parent.appendChild(child);
        assertTrue(evaluator.matches(parent, child));
        Element child2 = createElement("li", null);
        parent.appendChild(child2);
        assertFalse(evaluator.matches(parent, child));
        assertFalse(evaluator.matches(null, createElement("li", null)));
        assertEquals(":only-of-type", evaluator.toString());
    }

    @Test
    public void testIsEmpty() {
        Evaluator.IsEmpty evaluator = new Evaluator.IsEmpty();
        Element el = createElement("div", null);
        assertTrue(evaluator.matches(null, el));
        Element child = createElement("span", null);
        el.appendChild(child);
        assertFalse(evaluator.matches(null, el));
        Element comment = new Comment("test");
        el.appendChild(comment);
        assertTrue(evaluator.matches(null, el));
        assertEquals(":empty", evaluator.toString());
    }

    @Test
    public void testContainsText() {
        Evaluator.ContainsText evaluator = new Evaluator.ContainsText("hello");
        Element el = createElement("div", null);
        el.text("Hello World");
        assertTrue(evaluator.matches(null, el));
        el.text("Goodbye");
        assertFalse(evaluator.matches(null, el));
        assertEquals(":contains(hello)", evaluator.toString());
    }

    @Test
    public void testContainsData() {
        Evaluator.ContainsData evaluator = new Evaluator.ContainsData("data");
        Element el = createElement("script", null);
        el.data("var data = 1;");
        assertTrue(evaluator.matches(null, el));
        el.data("other");
        assertFalse(evaluator.matches(null, el));
        assertEquals(":containsData(data)", evaluator.toString());
    }

    @Test
    public void testContainsOwnText() {
        Evaluator.ContainsOwnText evaluator = new Evaluator.ContainsOwnText("own");
        Element el = createElement("div", null);
        el.ownText("own text");
        assertTrue(evaluator.matches(null, el));
        el.ownText("other");
        assertFalse(evaluator.matches(null, el));
        assertEquals(":containsOwn(own)", evaluator.toString());
    }

    @Test
    public void testMatches() {
        Evaluator.Matches evaluator = new Evaluator.Matches(Pattern.compile("\\d+"));
        Element el = createElement("div", null);
        el.text("123456");
        assertTrue(evaluator.matches(null, el));
        el.text("abc");
        assertFalse(evaluator.matches(null, el));
        assertEquals(":matches(\\d+)", evaluator.toString());
    }

    @Test
    public void testMatchesOwn() {
        Evaluator.MatchesOwn evaluator = new Evaluator.MatchesOwn(Pattern.compile("^own"));
        Element el = createElement("div", null);
        el.ownText("own text");
        assertTrue(evaluator.matches(null, el));
        el.ownText("text own");
        assertFalse(evaluator.matches(null, el));
        assertEquals(":matchesOwn(^own)", evaluator.toString());
    }

    @Test
    public void testIsRoot() {
        Evaluator.IsRoot evaluator = new Evaluator.IsRoot();
        Element root = createElement("html", null);
        Document doc = new Document("");
        assertTrue(evaluator.matches(doc, root));
        Element other = createElement("div", null);
        assertFalse(evaluator.matches(doc, other));
        assertEquals(":root", evaluator.toString());
    }

    @Test
    public void testIsFirstChild() {
        Evaluator.IsFirstChild evaluator = new Evaluator.IsFirstChild();
        Element parent = createElement("ul", null);
        Element child1 = createElement("li", null);
        Element child2 = createElement("li", null);
        parent.appendChild(child1);
        parent.appendChild(child2);
        assertTrue(evaluator.matches(parent, child1));
        assertFalse(evaluator.matches(parent, child2));
        assertEquals(":first-child", evaluator.toString());
    }
}