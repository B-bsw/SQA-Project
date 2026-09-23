package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.StringWriter;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Document.OutputSettings.Syntax;

public class DocumentTypeTest {
    
    private DocumentType doctype;
    private DocumentType html5Doctype;
    private DocumentType fullDoctype;
    private static final String BASE_URI = "http://example.com";
    
    @Before
    public void setUp() {
        html5Doctype = new DocumentType("html", "", "", BASE_URI);
        fullDoctype = new DocumentType("HTML", "PUBLIC_ID", "SYSTEM_ID", BASE_URI);
    }
    
    @After
    public void tearDown() {
        doctype = null;
        html5Doctype = null;
        fullDoctype = null;
    }
    
    @Test
    public void testNodeName() {
        doctype = new DocumentType("html", "", "", BASE_URI);
        assertEquals("#doctype", doctype.nodeName());
    }
    
    @Test
    public void testOuterHtmlHeadHtml5Doctype() throws IOException {
        StringWriter writer = new StringWriter();
        OutputSettings out = new OutputSettings();
        out.syntax(Syntax.html);
        html5Doctype.outerHtmlHead(writer, 0, out);
        assertEquals("<!doctype html>", writer.toString());
    }
    
    @Test
    public void testOuterHtmlHeadFullDoctypeHtmlSyntax() throws IOException {
        StringWriter writer = new StringWriter();
        OutputSettings out = new OutputSettings();
        out.syntax(Syntax.html);
        fullDoctype.outerHtmlHead(writer, 0, out);
        assertEquals("<!DOCTYPE HTML PUBLIC \"PUBLIC_ID\" \"SYSTEM_ID\">", writer.toString());
    }
    
    @Test
    public void testOuterHtmlHeadFullDoctypeXmlSyntax() throws IOException {
        StringWriter writer = new StringWriter();
        OutputSettings out = new OutputSettings();
        out.syntax(Syntax.xml);
        fullDoctype.outerHtmlHead(writer, 0, out);
        assertEquals("<!DOCTYPE HTML PUBLIC \"PUBLIC_ID\" \"SYSTEM_ID\">", writer.toString());
    }
    
    @Test
    public void testOuterHtmlHeadPartialDoctype() throws IOException {
        DocumentType partial = new DocumentType("html", "PUBLIC_ID", "", BASE_URI);
        StringWriter writer = new StringWriter();
        OutputSettings out = new OutputSettings();
        out.syntax(Syntax.html);
        partial.outerHtmlHead(writer, 0, out);
        assertEquals("<!DOCTYPE html PUBLIC \"PUBLIC_ID\">", writer.toString());
    }
    
    @Test
    public void testOuterHtmlHeadXmlHtml5Doctype() throws IOException {
        StringWriter writer = new StringWriter();
        OutputSettings out = new OutputSettings();
        out.syntax(Syntax.xml);
        html5Doctype.outerHtmlHead(writer, 0, out);
        assertEquals("<!DOCTYPE html>", writer.toString());
    }
    
    @Test
    public void testOuterHtmlHeadNullAttributes() throws IOException {
        DocumentType nullDoctype = new DocumentType(null, null, null, BASE_URI);
        StringWriter writer = new StringWriter();
        OutputSettings out = new OutputSettings();
        out.syntax(Syntax.html);
        nullDoctype.outerHtmlHead(writer, 0, out);
        assertEquals("<!doctype>", writer.toString());
    }
    
    @Test
    public void testOuterHtmlHeadWithNameOnly() throws IOException {
        DocumentType nameOnly = new DocumentType("html", "", "", BASE_URI);
        StringWriter writer = new StringWriter();
        OutputSettings out = new OutputSettings();
        out.syntax(Syntax.html);
        nameOnly.outerHtmlHead(writer, 0, out);
        assertEquals("<!doctype html>", writer.toString());
    }
    
    @Test
    public void testOuterHtmlTail() {
        StringWriter writer = new StringWriter();
        OutputSettings out = new OutputSettings();
        try {
            fullDoctype.outerHtmlTail(writer, 0, out);
            assertEquals("", writer.toString());
        } catch (IOException e) {
            fail("Should not throw IOException");
        }
    }
    
    @Test
    public void testConstructorSetsAttributes() {
        DocumentType dt = new DocumentType("name", "pub", "sys", BASE_URI);
        assertEquals("name", dt.attr("name"));
        assertEquals("pub", dt.attr("publicId"));
        assertEquals("sys", dt.attr("systemId"));
    }
    
    @Test
    public void testOuterHtmlHeadWithEmptyStrings() throws IOException {
        DocumentType emptyDoctype = new DocumentType("", "", "", BASE_URI);
        StringWriter writer = new StringWriter();
        OutputSettings out = new OutputSettings();
        out.syntax(Syntax.html);
        emptyDoctype.outerHtmlHead(writer, 0, out);
        assertEquals("<!doctype>", writer.toString());
    }
    
    @Test
    public void testOuterHtmlHeadWithWhitespaceOnly() throws IOException {
        DocumentType whitespaceDoctype = new DocumentType("   ", "   ", "   ", BASE_URI);
        StringWriter writer = new StringWriter();
        OutputSettings out = new OutputSettings();
        out.syntax(Syntax.html);
        whitespaceDoctype.outerHtmlHead(writer, 0, out);
        assertEquals("<!doctype>", writer.toString());
    }
}