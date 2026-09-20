package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;

public class XmlDeclarationTest {

    @Test
    public void testConstructorNormal() {
        XmlDeclaration decl = new XmlDeclaration("xml", "http://example.com/", false);
        assertEquals("xml", decl.name());
        assertEquals("#declaration", decl.nodeName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullNameThrows() {
        new XmlDeclaration(null, "http://example.com/", false);
    }

    @Test
    public void testNodeName() {
        XmlDeclaration decl = new XmlDeclaration("xml", "", true);
        assertEquals("#declaration", decl.nodeName());
    }

    @Test
    public void testNameGetter() {
        XmlDeclaration decl = new XmlDeclaration("myDecl", "", true);
        assertEquals("myDecl", decl.name());
    }

    @Test
    public void testGetWholeDeclaration_NotXmlName() {
        // decl name is not "xml", so even with multiple attributes, should return name as-is
        XmlDeclaration decl = new XmlDeclaration("foo", "", true);
        decl.attr("version", "1.0");
        decl.attr("encoding", "UTF-8");
        assertEquals("foo", decl.getWholeDeclaration());
    }

    @Test
    public void testGetWholeDeclaration_XmlName_NoAttributes() {
        // attributes.size() = 0, which is <=1, so else branch
        XmlDeclaration decl = new XmlDeclaration("xml", "", false);
        assertEquals("xml", decl.getWholeDeclaration());
    }

    @Test
    public void testGetWholeDeclaration_XmlName_OneAttribute() {
        // attributes.size() = 1, which is <=1, so else branch
        XmlDeclaration decl = new XmlDeclaration("xml", "", false);
        decl.attr("version", "1.0");
        assertEquals("xml", decl.getWholeDeclaration());
    }

    @Test
    public void testGetWholeDeclaration_XmlName_TwoAttributes_BothPresent() {
        // attributes.size() = 2, > 1, if branch, both version and encoding present
        XmlDeclaration decl = new XmlDeclaration("xml", "", false);
        decl.attr("version", "1.0");
        decl.attr("encoding", "UTF-8");
        String result = decl.getWholeDeclaration();
        assertEquals("xml version=\"1.0\" encoding=\"UTF-8\"", result);
    }

    @Test
    public void testGetWholeDeclaration_XmlName_TwoAttributes_OnlyVersion() {
        // attributes.size() = 2, > 1, version present, encoding null (encoding attr set to empty via other key)
        XmlDeclaration decl = new XmlDeclaration("xml", "", false);
        decl.attr("version", "1.0");
        decl.attr("standalone", "no");
        String result = decl.getWholeDeclaration();
        assertEquals("xml version=\"1.0\"", result);
    }

    @Test
    public void testGetWholeDeclaration_XmlName_TwoAttributes_OnlyEncoding() {
        // attributes.size() = 2, > 1, version null, encoding present
        XmlDeclaration decl = new XmlDeclaration("xml", "", false);
        decl.attr("encoding", "UTF-8");
        decl.attr("standalone", "no");
        String result = decl.getWholeDeclaration();
        assertEquals("xml encoding=\"UTF-8\"", result);
    }

    @Test
    public void testGetWholeDeclaration_XmlName_ManyAttributes() {
        // multiple loops equivalent - test with several attributes to ensure both version and encoding appended correctly
        XmlDeclaration decl = new XmlDeclaration("xml", "", false);
        decl.attr("version", "1.1");
        decl.attr("encoding", "ISO-8859-1");
        decl.attr("standalone", "yes");
        String result = decl.getWholeDeclaration();
        assertEquals("xml version=\"1.1\" encoding=\"ISO-8859-1\"", result);
    }

    @Test
    public void testOuterHtmlHead_ProcessingInstructionTrue() {
        // isProcessingInstruction = true -> should use "!"
        XmlDeclaration decl =