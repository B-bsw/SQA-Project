package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;

public class DocumentTypeTest {

    @Test
    public void testNodeName() {
        DocumentType doctype = new DocumentType("html", "", "", "");
        assertEquals("#doctype", doctype.nodeName());
    }

    @Test
    public void testHtml5DoctypeOutput() {
        // no publicId, no systemId -> lowercase <!doctype
        DocumentType doctype = new DocumentType("html", "", "", "");
        String html = doctype.outerHtml();
        assertTrue(html.contains("<!doctype"));
        assertTrue(html.contains("html"));
        assertFalse(html.contains("PUBLIC"));
        assertFalse(html.contains("SYSTEM"));
    }

    @Test
    public void testFullDoctypeWithPublicAndSystemId() {
        DocumentType doctype = new DocumentType(
                "html",
                "-//W3C//DTD XHTML 1.0 Strict//EN",
                "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd",
                "");
        String html = doctype.outerHtml();
        assertTrue(html.contains("<!DOCTYPE"));
        assertTrue(html.contains("html"));
        assertTrue(html.contains("PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\""));
        assertTrue(html.contains("\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\""));
        assertTrue(html.endsWith(">"));
    }

    @Test
    public void testOnlyPublicIdNoSystemId() {
        DocumentType doctype = new DocumentType(
                "html",
                "-//W3C//DTD HTML 4.01//EN",
                "",
                "");
        String html = doctype.outerHtml();
        assertTrue(html.contains("<!DOCTYPE"));
        assertTrue(html.contains("PUBLIC \"-//W3C//DTD HTML 4.01//EN\""));
        assertFalse(html.contains("SYSTEM"));
    }

    @Test
    public void testOnlySystemIdNoPublicId() {
        DocumentType doctype = new DocumentType(
                "html",
                "",
                "http://www.example.com/dtd.dtd",
                "");
        String html = doctype.outerHtml();
        assertTrue(html.contains("<!DOCTYPE"));
        assertFalse(html.contains("PUBLIC"));
        assertTrue(html.contains("\"http://www.example.com/dtd.dtd\""));
    }

    @Test
    public void testNullPublicIdAndSystemId() {
        DocumentType doctype = new DocumentType("html", null, null, "");
        String html = doctype.outerHtml();
        assertTrue(html.contains("<!doctype"));
        assertFalse(html.contains("PUBLIC"));
        assertFalse(html.contains("SYSTEM"));
    }

    @Test
    public void testEmptyName() {
        DocumentType doctype = new DocumentType("", "", "", "");
        String html = doctype.outerHtml();
        // no name attr appended since has(NAME) is false
        assertFalse(html.contains(" html"));
        assertTrue(html.contains("<!doctype"));
    }

    @Test
    public void testNullName() {
        DocumentType doctype = new DocumentType(null, null, null, "");
        String html = doctype.outerHtml();
        assertTrue(html.contains("<!doctype"));
        assertTrue(html.endsWith(">"));
    }

    @Test
    public void testXmlSyntaxOutput() {
        DocumentType doctype = new DocumentType("html", "", "", "");
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.syntax(Document.OutputSettings.Syntax.xml);
        StringBuilder sb = new StringBuilder();
        try {
            doctype.outerHtmlHead(sb, 0, settings);
        } catch (Exception e) {
            fail("Should not throw exception: " + e.getMessage());
        }
        String html = sb.toString();
        // xml syntax should always use uppercase <!DOCTYPE regardless of publicId/systemId presence
        assertTrue(html.contains("<!DOCTYPE"));
    }

    @Test
    public void testHtmlSyntaxWithPublicIdForcesUppercase() {
        DocumentType doctype = new DocumentType("html", "somePublicId", "", "");
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.syntax(Document.OutputSettings.Syntax.html);
        StringBuilder sb = new StringBuilder();
        try {
            doctype.outerHtmlHead(sb, 0, settings);
        } catch (Exception e) {
            fail("Should not throw exception: " + e.getMessage());
        }
        String html = sb.toString();
        assertTrue(html.contains("<!DOCTYPE"));
        assertTrue(html.contains("PUBLIC \"somePublicId\""));
    }

    @Test
    public void testOuterHtmlTailDoesNothing() {
        DocumentType doctype = new DocumentType("html", "", "", "");
        Document.OutputSettings settings = new Document.OutputSettings();
        StringBuilder sb = new StringBuilder("PRE");
        doctype.outerHtmlTail(sb, 0, settings);
        assertEquals("PRE", sb.toString());
    }

    @Test
    public void testAttributesAreSetCorrectly() {
        DocumentType doctype = new DocumentType("html", "pubId", "sysId", "baseUri");
        assertEquals("html", doctype.attr("name"));
        assertEquals("pubId", doctype.attr("publicId"));
        assertEquals("sysId", doctype.attr("systemId"));
    }

    @Test
    public void testBaseUriPreserved() {
        DocumentType doctype = new DocumentType("html", "", "", "http://example.com/");
        assertEquals("http://example.