package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.nodes.Document;

public class DocumentTypeTest {

    @Test
    public void testNodeName() {
        DocumentType doctype = new DocumentType("html", "public", "system", "http://example.com");
        assertEquals("#doctype", doctype.nodeName());
    }

    @Test
    public void testConstructorWithNullValues() {
        DocumentType doctype = new DocumentType(null, null, null, null);
        assertEquals("#doctype", doctype.nodeName());
        assertEquals("", doctype.attr("name"));
        assertEquals("", doctype.attr("publicId"));
        assertEquals("", doctype.attr("systemId"));
    }

    @Test
    public void testOuterHtmlHeadWithAllEmptyAttributes() {
        DocumentType doctype = new DocumentType("", "", "", "http://example.com");
        assertEquals("<!DOCTYPE html>", doctype.outerHtml());
    }

    @Test
    public void testOuterHtmlHeadWithOnlyPublicId() {
        DocumentType doctype = new DocumentType("html", "PUBLIC", "", "http://example.com");
        assertEquals("<!DOCTYPE html PUBLIC \"PUBLIC\">", doctype.outerHtml());
    }

    @Test
    public void testOuterHtmlHeadWithOnlySystemId() {
        DocumentType doctype = new DocumentType("html", "", "SYSTEM", "http://example.com");
        assertEquals("<!DOCTYPE html \"SYSTEM\">", doctype.outerHtml());
    }

    @Test
    public void testOuterHtmlHeadWithBothIds() {
        DocumentType doctype = new DocumentType("html", "PUBLIC", "SYSTEM", "http://example.com");
        assertEquals("<!DOCTYPE html PUBLIC \"PUBLIC\" SYSTEM\">", doctype.outerHtml());
    }

    @Test
    public void testOuterHtmlHeadWithWhitespaceInIds() {
        DocumentType doctype = new DocumentType("html", "  ", "  ", "http://example.com");
        assertEquals("<!DOCTYPE html>", doctype.outerHtml());
    }

    @Test
    public void testOuterHtmlTailIsEmpty() {
        DocumentType doctype = new DocumentType("html", "pub", "sys", "http://example.com");
        StringBuilder accum = new StringBuilder();
        doctype.outerHtmlTail(accum, 0, null);
        assertEquals("", accum.toString());
    }

    @Test
    public void testConstructorStoresAttributes() {
        DocumentType doctype = new DocumentType("html", "pub", "sys", "http://example.com");
        assertEquals("html", doctype.attr("name"));
        assertEquals("pub", doctype.attr("publicId"));
        assertEquals("sys", doctype.attr("systemId"));
    }
}