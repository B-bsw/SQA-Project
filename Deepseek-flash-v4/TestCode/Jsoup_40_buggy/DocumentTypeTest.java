package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.jsoup.parser.Tag;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

public class DocumentTypeTest {
    private Document.OutputSettings out;
    private StringBuilder accum;

    @Before
    public void setUp() {
        out = new Document.OutputSettings();
        accum = new StringBuilder();
    }

    @Test
    public void testConstructorWithValidName() {
        DocumentType dt = new DocumentType("html", "public-id", "system-id", "http://base.uri");
        assertEquals("html", dt.attr("name"));
        assertEquals("public-id", dt.attr("publicId"));
        assertEquals("system-id", dt.attr("systemId"));
        assertEquals("#doctype", dt.nodeName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNullOrEmptyName() {
        new DocumentType("", "pub", "sys", "http://base.uri");
    }

    @Test
    public void testConstructorWithNullPublicAndSystemIds() {
        DocumentType dt = new DocumentType("html", null, null, "http://base.uri");
        assertNull(dt.attr("publicId"));
        assertNull(dt.attr("systemId"));
    }

    @Test
    public void testOuterHtmlHeadWithAllFields() {
        DocumentType dt = new DocumentType("html", "PUBLIC_ID", "SYSTEM_ID", "http://base.uri");
        dt.outerHtmlHead(accum, 0, out);
        assertEquals("<!DOCTYPE html PUBLIC \"PUBLIC_ID\" \"SYSTEM_ID\">", accum.toString());
    }

    @Test
    public void testOuterHtmlHeadWithOnlyName() {
        DocumentType dt = new DocumentType("html", null, null, "http://base.uri");
        dt.outerHtmlHead(accum, 0, out);
        assertEquals("<!DOCTYPE html>", accum.toString());
    }

    @Test
    public void testOuterHtmlHeadWithEmptyStrings() {
        DocumentType dt = new DocumentType("html", "", "", "http://base.uri");
        dt.outerHtmlHead(accum, 0, out);
        assertEquals("<!DOCTYPE html>", accum.toString());
    }

    @Test
    public void testOuterHtmlTailDoesNotModifyAccum() {
        DocumentType dt = new DocumentType("html", "pub", "sys", "http://base.uri");
        String before = accum.toString();
        dt.outerHtmlTail(accum, 0, out);
        assertEquals(before, accum.toString());
    }

    @Test
    public void testOuterHtmlWithWhitespaceName() {
        DocumentType dt = new DocumentType("  ", "pub", "sys", "http://base.uri");
        dt.outerHtmlHead(accum, 0, out);
        assertEquals("<!DOCTYPE PUBLIC \"pub\" \"sys\">", accum.toString());
    }

    @Test
    public void testOuterHtmlWithNullNameButPublicId() {
        // Constructor validates non-empty name, so we need to use attr directly
        DocumentType dt = new DocumentType("html", null, null, "http://base.uri");
        dt.attr("name", null);
        dt.attr("publicId", "PUB");
        dt.outerHtmlHead(accum, 0, out);
        assertEquals("<!DOCTYPE PUBLIC \"PUB\">", accum.toString());
    }

    @Test
    public void testOuterHtmlWithNullSystemIdButPublicIdEmpty() {
        DocumentType dt = new DocumentType("html", "", "SYSTEM", "http://base.uri");
        dt.outerHtmlHead(accum, 0, out);
        assertEquals("<!DOCTYPE html \"SYSTEM\">", accum.toString());
    }

    @Test
    public void testMultipleCallsToOuterHtmlHead() {
        DocumentType dt = new DocumentType("html", "pub", "sys", "http://base.uri");
        dt.outerHtmlHead(accum, 0, out);
        String first = accum.toString();
        dt.outerHtmlHead(accum, 0, out);
        assertEquals(first + first, accum.toString());
    }

    @Test
    public void testDepthAndOutSettingsIgnored() {
        DocumentType dt = new DocumentType("x", "y", "z", "http://base.uri");
        Document.OutputSettings customOut = new Document.OutputSettings();
        customOut.prettyPrint(false);
        dt.outerHtmlHead(accum, 3, customOut);
        assertEquals("<!DOCTYPE x PUBLIC \"y\" \"z\">", accum.toString());
    }

    @Test
    public void testSpecialCharactersInFields() {
        DocumentType dt = new DocumentType("h<tml>", "pub\"lic", "sys'tem", "http://base.uri");
        dt.outerHtmlHead(accum, 0, out);
        assertEquals("<!DOCTYPE h<tml> PUBLIC \"pub\\\"lic\" \"sys'tem\">", accum.toString());
    }
}