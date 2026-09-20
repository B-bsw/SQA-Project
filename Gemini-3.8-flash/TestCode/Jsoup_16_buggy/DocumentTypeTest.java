package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class DocumentTypeTest {

    @Test
    public void nodeName_default_shouldReturnDoctypeIdentifier() {
        // Arrange
        DocumentType documentType = new DocumentType("html", "", "", "");

        // Act
        String result = documentType.nodeName();

        // Assert
        Assert.assertEquals("#doctype", result);
    }

    @Test
    public void constructor_givenValidParameters_shouldSetAttributesCorrectly() {
        // Arrange
        String name = "html";
        String publicId = "-//W3C//DTD XHTML 1.0 Strict//EN";
        String systemId = "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd";
        String baseUri = "http://example.com";

        // Act
        DocumentType documentType = new DocumentType(name, publicId, systemId, baseUri);

        // Assert
        Assert.assertEquals(name, documentType.attr("name"));
        Assert.assertEquals(publicId, documentType.attr("publicId"));
        Assert.assertEquals(systemId, documentType.attr("systemId"));
        Assert.assertEquals(baseUri, documentType.baseUri());
    }

    @Test
    public void outerHtmlHead_givenBlankPublicIdAndBlankSystemId_shouldRenderSimpleDoctype() {
        // Arrange
        DocumentType documentType = new DocumentType("html", "", "", "");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();

        // Act
        documentType.outerHtmlHead(accum, 0, out);

        // Assert
        Assert.assertEquals("<!DOCTYPE html>", accum.toString());
    }

    @Test
    public void outerHtmlHead_givenWhitespacePublicIdAndWhitespaceSystemId_shouldRenderSimpleDoctype() {
        // Arrange
        DocumentType documentType = new DocumentType("html", "   ", " \t\n ", "");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();

        // Act
        documentType.outerHtmlHead(accum, 0, out);

        // Assert
        Assert.assertEquals("<!DOCTYPE html>", accum.toString());
    }

    @Test
    public void outerHtmlHead_givenPublicIdOnly_shouldRenderPublicDoctype() {
        // Arrange
        String publicId = "-//W3C//DTD HTML 4.01//EN";
        DocumentType documentType = new DocumentType("html", publicId, "", "");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();

        // Act
        documentType.outerHtmlHead(accum, 0, out);

        // Assert
        Assert.assertEquals("<!DOCTYPE html PUBLIC \"" + publicId + "\">", accum.toString());
    }

    @Test
    public void outerHtmlHead_givenSystemIdOnly_shouldRenderSystemDoctype() {
        // Arrange
        String systemId = "about:legacy-compat";
        DocumentType documentType = new DocumentType("html", "", systemId, "");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();

        // Act
        documentType.outerHtmlHead(accum, 0, out);

        // Assert
        Assert.assertEquals("<!DOCTYPE html " + systemId + "\">", accum.toString());
    }

    @Test
    public void outerHtmlHead_givenBothPublicIdAndSystemId_shouldRenderCompleteDoctype() {
        // Arrange
        String publicId = "-//W3C//DTD XHTML 1.0 Transitional//EN";
        String systemId = "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd";
        DocumentType documentType = new DocumentType("html", publicId, systemId, "");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();

        // Act
        documentType.outerHtmlHead(accum, 0, out);

        // Assert
        String expected = "<!DOCTYPE html PUBLIC \"" + publicId + "\" " + systemId + "\">";
        Assert.assertEquals(expected, accum.toString());
    }

    @Test
    public void outerHtmlHead_givenPrepopulatedAccumulator_shouldAppendWithoutClearing() {
        // Arrange
        DocumentType documentType = new DocumentType("html", "", "", "");
        StringBuilder accum = new StringBuilder("PREEXISTING_CONTENT");
        Document.OutputSettings out = new Document.OutputSettings();

        // Act
        documentType.outerHtmlHead(accum, 0, out);

        // Assert
        Assert.assertEquals("PREEXISTING_CONTENT<!DOCTYPE html>", accum.toString());
    }

    @Test
    public void outerHtmlTail_shouldNotModifyAccumulator() {
        // Arrange
        DocumentType documentType = new DocumentType("html", "", "", "");
        StringBuilder accum = new StringBuilder("INITIAL");
        Document.OutputSettings out = new Document.OutputSettings();

        // Act
        documentType.outerHtmlTail(accum, 0, out);

        // Assert
        Assert.assertEquals("INITIAL", accum.toString());
    }

    @Test
    public void outerHtmlTail_givenEmptyAccumulator_shouldRemainEmpty() {
        // Arrange
        DocumentType documentType = new DocumentType("html", "publicId", "systemId", "");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();

        // Act
        documentType.outerHtmlTail(accum, 5, out);

        // Assert
        Assert.assertEquals(0, accum.length());
    }

    @Test
    public void outerHtml_givenValidDocumentType_shouldProduceExpectedHtml() {
        // Arrange
        DocumentType documentType = new DocumentType("html", "PUB", "SYS", "");

        // Act
        String result = documentType.outerHtml();

        // Assert
        Assert.assertEquals("<!DOCTYPE html PUBLIC \"PUB\" SYS\">", result);
    }
}