package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DocumentTypeTest {

    private Document.OutputSettings settings;

    @Before
    public void setUp() {
        settings = new Document.OutputSettings();
    }

    @Test
    public void testNodeName() {
        DocumentType doctype = new DocumentType("html", "", "", "");
        assertEquals("#doctype", doctype.nodeName());
    }

    @Test
    public void testNodeName_IndependentOfAttributes() {
        DocumentType doctype = new DocumentType("someName", "pub", "sys", "http://example.com/");
        assertEquals("#doctype", doctype.nodeName());
    }

    @Test
    public void testOuterHtmlHead_NormalCase_BothIdsPresent() {
        DocumentType doctype = new DocumentType(
                "html",
                "-//W3C//DTD XHTML 1.0 Strict//EN",
                "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd",
                "");
        StringBuilder sb = new StringBuilder();
        doctype.outerHtmlHead(sb, 0, settings);
        String result = sb.toString();
        assertTrue(result.startsWith("<!DOCTYPE html"));
        assertTrue(result.contains("PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\""));
        assertTrue(result.contains(" http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\""));
        assertTrue(result.endsWith(">"));
    }

    @Test
    public void testOuterHtmlHead_OnlyPublicId() {
        DocumentType doctype = new DocumentType(
                "html", "-//W3C//DTD HTML 4.01//EN", "", "");
        StringBuilder sb = new StringBuilder();
        doctype.outerHtmlHead(sb, 0, settings);
        String result = sb.toString();
        assertEquals("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01//EN\">", result);
    }

    @Test
    public void testOuterHtmlHead_OnlySystemId() {
        DocumentType doctype = new DocumentType(
                "html", "", "http://www.w3.org/TR/html4/strict.dtd", "");
        StringBuilder sb = new StringBuilder();
        doctype.outerHtmlHead(sb, 0, settings);
        String result = sb.toString();
        assertEquals("<!DOCTYPE html http://www.w3.org/TR/html4/strict.dtd\">", result);
    }

    @Test
    public void testOuterHtmlHead_BothEmpty() {
        DocumentType doctype = new DocumentType("html", "", "", "");
        StringBuilder sb = new StringBuilder();
        doctype.outerHtmlHead(sb, 0, settings);
        assertEquals("<!DOCTYPE html>", sb.toString());
    }

    @Test
    public void testOuterHtmlHead_BlankWhitespaceIds() {
        DocumentType doctype = new DocumentType("html", "   ", "\t\n", "");
        StringBuilder sb = new StringBuilder();
        doctype.outerHtmlHead(sb, 0, settings);
        assertEquals("<!DOCTYPE html>", sb.toString());
    }

    @Test
    public void testOuterHtmlHead_NullIdsAndName() {
        // baseUri must remain non-null; name/publicId/systemId set to null
        DocumentType doctype = new DocumentType(null, null, null, "");
        StringBuilder sb = new StringBuilder();
        doctype.outerHtmlHead(sb, 0, settings);
        assertEquals("<!DOCTYPE html>", sb.toString());
    }

    @Test
    public void testOuterHtmlTail_NoOutputAppended() {
        DocumentType doctype = new DocumentType("html", "", "", "");
        StringBuilder sb = new StringBuilder("existing-content");
        doctype.outerHtmlTail(sb, 0, settings);
        assertEquals("existing-content", sb.toString());
    }

    @Test
    public void testOuterHtmlHead_DepthIndependent() {
        DocumentType doctype = new DocumentType("html", "pub", "sys", "");
        StringBuilder sb1 = new StringBuilder();
        doctype.outerHtmlHead(sb1, 0, settings);
        StringBuilder sb2 = new StringBuilder();
        doctype.outerHtmlHead(sb2, 5, settings);
        assertEquals(sb1.toString(), sb2.toString());
    }

    @Test
    public void testOuterHtmlHead_LargeDepthValue() {
        DocumentType doctype = new DocumentType("html", "pub", "sys", "");
        StringBuilder sb = new StringBuilder();
        doctype.outerHtmlHead(sb, Integer.MAX_VALUE, settings);
        String result = sb.toString();
        assertTrue(result.contains("PUBLIC \"pub\""));
        assertTrue(result.contains(" sys\""));
    }

    @Test
    public void testConstructor_BaseUriStored() {
        DocumentType doctype = new DocumentType("html", "", "", "http://example.com/");
        assertEquals("http://example.com/", doctype.baseUri());
    }

    @Test
    public void testConstructor_EmptyBaseUriStored() {
        DocumentType doctype = new DocumentType("html", "", "", "");
        assertEquals("", doctype.baseUri());
    }

    @Test
    public void testConstructor_NullBaseUri_ThrowsException() {
        try {
            new DocumentType("html", "", "", null);
            fail("Expected an exception to be thrown due to null baseUri");
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testOuterHtmlHead_SystemIdOnly_MultipleCallsConsistent() {
        DocumentType doctype = new DocumentType("html", "", "http://example.com/dtd", "");
        StringBuilder sb1 = new StringBuilder();
        doctype.outerHtmlHead(sb1, 0, settings);
        StringBuilder sb2 = new StringBuilder();
        doctype.outerHtmlHead(sb2, 1, settings);
        assertEquals(sb1.toString(), sb2.toString());
        assertEquals("<!DOCTYPE html http://example.com/dtd\">", sb1.toString());
    }

    @Test
    public void testOuterHtmlHead_PublicIdWithSpecialCharacters() {
        DocumentType doctype = new DocumentType("html", "-//W3C//DTD & Special\"Chars//EN", "", "");
        StringBuilder sb = new StringBuilder();
        doctype.outerHtmlHead(sb, 0, settings);
        String result = sb.toString();
        assertTrue(result.contains("-//W3C//DTD & Special\"Chars//EN"));
    }
}