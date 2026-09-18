package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class DocumentTypeTest {

    private DocumentType docType;

    @Before
    public void setUp() {
        docType = null;
    }

    // ---------- Constructor / normal cases ----------

    @Test
    public void testConstructorWithAllFields() {
        docType = new DocumentType("html", "publicId123", "systemId456", "http://example.com/");
        assertEquals("html", docType.attr("name"));
        assertEquals("publicId123", docType.attr("publicId"));
        assertEquals("systemId456", docType.attr("systemId"));
        assertEquals("http://example.com/", docType.baseUri());
    }

    @Test
    public void testConstructorWithNameOnly() {
        docType = new DocumentType("html", "", "", "");
        assertEquals("html", docType.attr("name"));
        assertEquals("", docType.attr("publicId"));
        assertEquals("", docType.attr("systemId"));
    }

    @Test
    public void testConstructorWithNameAndPublicIdOnly() {
        docType = new DocumentType("html", "pub-id", "", "");
        assertEquals("html", docType.attr("name"));
        assertEquals("pub-id", docType.attr("publicId"));
        assertEquals("", docType.attr("systemId"));
    }

    @Test
    public void testConstructorWithNameAndSystemIdOnly() {
        docType = new DocumentType("html", "", "sys-id", "");
        assertEquals("html", docType.attr("name"));
        assertEquals("", docType.attr("publicId"));
        assertEquals("sys-id", docType.attr("systemId"));
    }

    @Test
    public void testConstructorWithNullPublicIdAndSystemId() {
        docType = new DocumentType("html", null, null, "");
        assertEquals("html", docType.attr("name"));
        // attr() on jsoup returns "" for null values stored
        assertEquals("", docType.attr("publicId"));
        assertEquals("", docType.attr("systemId"));
    }

    // ---------- Exception path ----------

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorThrowsOnEmptyName() {
        docType = new DocumentType("", "publicId", "systemId", "baseUri");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorThrowsOnNullName() {
        docType = new DocumentType(null, "publicId", "systemId", "baseUri");
    }

    // ---------- nodeName() ----------

    @Test
    public void testNodeName() {
        docType = new DocumentType("html", "publicId", "systemId", "baseUri");
        assertEquals("#doctype", docType.nodeName());
    }

    @Test
    public void testNodeNameWithMinimalDoctype() {
        docType = new DocumentType("html", "", "", "");
        assertEquals("#doctype", docType.nodeName());
    }

    // ---------- outerHtml (exercises outerHtmlHead/outerHtmlTail branches) ----------

    @Test
    public void testOuterHtmlWithNameOnly() {
        docType = new DocumentType("html", "", "", "");
        String html = docType.outerHtml();
        assertEquals("<!DOCTYPE html>", html.trim());
    }

    @Test
    public void testOuterHtmlWithNameAndPublicId() {
        docType = new DocumentType("html", "-//W3C//DTD HTML 4.01//EN", "", "");
        String html = docType.outerHtml();
        assertEquals("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01//EN\">", html.trim());
    }

    @Test
    public void testOuterHtmlWithNameAndSystemId() {
        docType = new DocumentType("html", "", "http://www.w3.org/TR/html4/strict.dtd", "");
        String html = docType.outerHtml();
        assertEquals("<!DOCTYPE html \"http://www.w3.org/TR/html4/strict.dtd\">", html.trim());
    }

    @Test
    public void testOuterHtmlWithAllFields() {
        docType = new DocumentType("html", "-//W3C//DTD HTML 4.01//EN",
                "http://www.w3.org/TR/html4/strict.dtd", "");
        String html = docType.outerHtml();
        assertEquals(
            "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">",
            html.trim());
    }

    @Test
    public void testOuterHtmlWithBlankName() {
        // name cannot be empty per Validate, but can be a non-empty whitespace-only-like value
        // Here we test with a name that is present but publicId/systemId are blank strings
        docType = new DocumentType("html5", " ", " ", "");
        // blank publicId and systemId (whitespace) should be treated as blank and skipped
        String html = docType.outerHtml();
        assertEquals("<!DOCTYPE html5>", html.trim());
    }

    @Test
    public void testOuterHtmlTailProducesNoAdditionalOutput() {
        docType = new DocumentType("html", "", "", "");
        String html = docType.outerHtml();
        // Ensure no closing tag or extra content is appended after the doctype tag
        assertFalse(html.contains("</"));
        assertTrue(html.trim().endsWith(">"));
    }

    // ---------- baseUri handling ----------

    @Test
    public void testBaseUriIsSetCorrectly() {
        docType = new DocumentType("html", "", "", "http://example.org/");
        assertEquals("http://example.org/", docType.baseUri());
    }

    @Test
    public void testBaseUriEmptyByDefault() {
        docType = new DocumentType("html", "", "", "");
        assertEquals("", docType.baseUri());
    }
}