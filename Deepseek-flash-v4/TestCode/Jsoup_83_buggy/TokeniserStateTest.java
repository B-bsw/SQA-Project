package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class TokeniserStateTest {

    @Test
    public void parsesText() {
        Document doc = Jsoup.parse("<p>Hello</p>");
        assertEquals("Hello", doc.select("p").first().text());
    }

    @Test
    public void parsesCharacterReferencesInText() {
        Document doc = Jsoup.parse("<p>&amp; &#65;</p>");
        assertEquals("& A", doc.select("p").first().text());
    }

    @Test
    public void parsesCharacterReferenceInAttribute() {
        Document doc = Jsoup.parse("<a href=\"a=1&amp;b=2\">x</a>");
        assertEquals("a=1&b=2", doc.select("a").attr("href"));
    }

    @Test
    public void parsesParagraphAutoClosure() {
        Document doc = Jsoup.parse("<p>One<p>Two");
        assertEquals(2, doc.select("p").size());
        assertEquals("One", doc.select("p").first().text());
        assertEquals("Two", doc.select("p").last().text());
    }

    @Test
    public void parsesBlockTagsInSeparateContexts() {
        Document doc = Jsoup.parse("<p>One<div>Two");
        assertEquals(1, doc.select("p").size());
        assertEquals(1, doc.select("div").size());
        assertEquals("One", doc.select("p").first().text());
        assertEquals("Two", doc.select("div").first().text());
    }

    @Test
    public void parsesQuotedAttributes() {
        Document doc = Jsoup.parse("<a href='foo' title=\"bar\">x</a>");
        assertEquals("foo", doc.select("a").attr("href"));
        assertEquals("bar", doc.select("a").attr("title"));
    }

    @Test
    public void parsesUnquotedAttributes() {
        Document doc = Jsoup.parse("<img src=foo alt=bar>");
        assertEquals("foo", doc.select("img").attr("src"));
        assertEquals("bar", doc.select("img").attr("alt"));
    }

    @Test
    public void parsesBooleanAttribute() {
        Document doc = Jsoup.parse("<input disabled>");
        assertTrue(doc.select("input").hasAttr("disabled"));
    }

    @Test
    public void parsesSelfClosingTag() {
        Document doc = Jsoup.parse("<br/>x");
        assertEquals(1, doc.select("br").size());
        assertEquals("x", doc.body().text());
    }

    @Test
    public void parsesComment() {
        Document doc = Jsoup.parse("<!-- hi -->");
        assertTrue(doc.toString().contains("<!-- hi -->"));
    }

    @Test
    public void parsesDoctype() {
        Document doc = Jsoup.parse("<!DOCTYPE html>");
        assertNotNull(doc.documentType());
    }

    @Test
    public void parsesScriptData() {
        Document doc = Jsoup.parse("<script>if(a<b){}</script>");
        assertTrue(doc.select("script").first().html().contains("if(a<b)"));
    }

    @Test
    public void parsesTextareaAsRcdata() {
        Document doc = Jsoup.parse("<textarea><b></textarea>");
        assertEquals("<b>", doc.select("textarea").first().text());
    }

    @Test
    public void parsesTitleCharacterReferences() {
        Document doc = Jsoup.parse("<title>&lt;test&gt;</title>");
        assertEquals("<test>", doc.select("title").first().text());
    }

    @Test
    public void parsesCdataInSvg() {
        Document doc = Jsoup.parse("<svg><![CDATA[x<y]]></svg>");
        assertEquals("x<y", doc.select("svg").first().text());
    }

    @Test
    public void ignoresStrayEndTag() {
        Document doc = Jsoup.parse("</p>");
        assertEquals(0, doc.select("p").size());
    }
}