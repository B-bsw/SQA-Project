package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class XmlDeclarationTest {
    private XmlDeclaration decl;
    private XmlDeclaration processingInstruction;

    @Before
    public void setUp() {
        decl = new XmlDeclaration("xml", "http://example.com", false);
        decl.attributes().put("version", "1.0");
        decl.attributes().put("encoding", "UTF-8");
        
        processingInstruction = new XmlDeclaration("xml-stylesheet", "http://example.com", true);
        processingInstruction.attributes().put("href", "style.css");
    }

    @Test
    public void testConstructorWithNullName() {
        try {
            new XmlDeclaration(null, "base", false);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testNodeName() {
        assertEquals("#declaration", decl.nodeName());
    }

    @Test
    public void testName() {
        assertEquals("xml", decl.name());
        assertEquals("xml-stylesheet", processingInstruction.name());
    }

    @Test
    public void testGetWholeDeclarationWithXmlAndAttributes() {
        decl.attributes().put("version", "1.0").put("encoding", "UTF-8");
        assertEquals("xml version=\"1.0\" encoding=\"UTF-8\"", decl.getWholeDeclaration());
    }

    @Test
    public void testGetWholeDeclarationWithXmlButNoAttributes() {
        XmlDeclaration simple = new XmlDeclaration("xml", "base", false);
        assertEquals("xml", simple.getWholeDeclaration());
    }

    @Test
    public void testGetWholeDeclarationWithOnlyVersion() {
        XmlDeclaration versionOnly = new XmlDeclaration("xml", "base", false);
        versionOnly.attributes().put("version", "1.1");
        assertEquals("xml version=\"1.1\"", versionOnly.getWholeDeclaration());
    }

    @Test
    public void testGetWholeDeclarationWithOnlyEncoding() {
        XmlDeclaration encodingOnly = new XmlDeclaration("xml", "base", false);
        encodingOnly.attributes().put("encoding", "ISO-8859-1");
        assertEquals("xml encoding=\"ISO-8859-1\"", encodingOnly.getWholeDeclaration());
    }

    @Test
    public void testGetWholeDeclarationWithNonXml() {
        XmlDeclaration nonXml = new XmlDeclaration("custom", "base", false);
        assertEquals("custom", nonXml.getWholeDeclaration());
    }

    @Test
    public void testOuterHtmlHeadAsProcessingInstruction() throws Exception {
        StringBuilder sb = new StringBuilder();
        processingInstruction.outerHtmlHead(sb, 0, null);
        assertEquals("<!" + processingInstruction.getWholeDeclaration() + ">", sb.toString());
    }

    @Test
    public void testOuterHtmlHeadAsDeclaration() throws Exception {
        StringBuilder sb = new StringBuilder();
        decl.outerHtmlHead(sb, 0, null);
        assertEquals("<?" + decl.getWholeDeclaration() + ">", sb.toString());
    }

    @Test
    public void testOuterHtmlHeadWithXmlAndAttributes() throws Exception {
        StringBuilder sb = new StringBuilder();
        decl.outerHtmlHead(sb, 0, null);
        assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\"?>", sb.toString());
    }

    @Test
    public void testOuterHtmlTail() throws Exception {
        StringBuilder sb = new StringBuilder();
        decl.outerHtmlTail(sb, 0, null);
        assertEquals("", sb.toString());
    }

    @Test
    public void testToString() {
        String expected = "<?" + decl.getWholeDeclaration() + ">";
        assertEquals(expected, decl.toString());
    }

    @Test
    public void testOuterHtml() throws Exception {
        String html = decl.outerHtml();
        assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\"?>", html);
    }

    @Test
    public void testGetWholeDeclarationWithNullVersionButNotNullEncoding() {
        XmlDeclaration mixed = new XmlDeclaration("xml", "base", false);
        mixed.attributes().put("encoding", "UTF-16");
        assertEquals("xml encoding=\"UTF-16\"", mixed.getWholeDeclaration());
    }

    @Test
    public void testOuterHtmlHeadWithEmptyAttributes() throws Exception {
        XmlDeclaration emptyAttr = new XmlDeclaration("xml", "base", false);
        emptyAttr.attributes().put("version", null);
        emptyAttr.attributes().put("encoding", "UTF-8");
        StringBuilder sb = new StringBuilder();
        emptyAttr.outerHtmlHead(sb, 0, null);
        assertEquals("<?xml encoding=\"UTF-8\"?>", sb.toString());
    }
}