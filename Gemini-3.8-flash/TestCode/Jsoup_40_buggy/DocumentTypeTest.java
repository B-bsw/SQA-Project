package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class DocumentTypeTest {

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullName_shouldThrowIllegalArgumentException() {
        // Arrange & Act
        new DocumentType(null, "publicId", "systemId", "http://example.com");
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenEmptyName_shouldThrowIllegalArgumentException() {
        // Arrange & Act
        new DocumentType("", "publicId", "systemId", "http://example.com");
    }

    @Test
    public void constructor_givenValidParameters_shouldSetAttributesCorrectly() {
        // Arrange
        String name = "html";
        String publicId = "-//W3C//DTD HTML 4.01//EN";
        String systemId = "http://www.w3.org/TR/html4/strict.dtd";
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
    public void nodeName_givenDocumentType_shouldReturnDoctypeConstant() {
        // Arrange
        DocumentType documentType = new DocumentType("html", null, null, "");

        // Act
        String actualNodeName = documentType.nodeName();

        // Assert
        Assert.assertEquals("#doctype", actualNodeName);
    }

    @Test
    public void outerHtmlHead_givenHtml5Doctype_shouldRenderSimpleDoctype() {
        // Arrange
        DocumentType documentType = new DocumentType("html", null, null, "");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document("").outputSettings();

        // Act
        documentType.outerHtmlHead(accum, 0, out);

        // Assert
        Assert.assertEquals("<!DOCTYPE html>", accum.toString());
    }

    @Test
    public void outerHtmlHead_givenPublicAndSystemIds_shouldRenderFullDoctype() {
        // Arrange
        DocumentType documentType = new DocumentType(
                "html",
                "-//W3C//DTD HTML 4.01//EN",
                "http://www.w3.org/TR/html4/strict.dtd",
                "http://example.com"
        );
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document("").outputSettings();

        // Act
        documentType.outerHtmlHead(accum, 0, out);

        // Assert
        Assert.assertEquals("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">", accum.toString());
    }

    @Test
    public void outerHtmlHead_givenOnlySystemId_shouldRenderSystemDoctype() {
        // Arrange
        DocumentType documentType = new DocumentType(
                "html",
                null,
                "http://www.ibm.com/data/dtd/v11/ibmxhtml1-transitional.dtd",
                ""
        );
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document("").outputSettings();

        // Act
        documentType.outerHtmlHead(accum, 0, out);

        // Assert
        Assert.assertEquals("<!DOCTYPE html \"http://www.ibm.com/data/dtd/v11/ibmxhtml1-transitional.dtd\">", accum.toString());
    }

    @Test
    public void outerHtmlHead_givenBlankPublicAndSystemId_shouldRenderDoctypeWithoutIds() {
        // Arrange
        DocumentType documentType = new DocumentType("html", "   ", "", "");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document("").outputSettings();

        // Act
        documentType.outerHtmlHead(accum, 0, out);

        // Assert
        Assert.assertEquals("<!DOCTYPE html>", accum.toString());
    }

    @Test
    public void outerHtmlHead_givenBlankNameAfterMutation_shouldRenderDoctypeWithoutName() {
        // Arrange
        DocumentType documentType = new DocumentType("html", "publicId", "systemId", "");
        documentType.attr("name", "");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document("").outputSettings();

        // Act
        documentType.outerHtmlHead(accum, 0, out);

        // Assert
        Assert.assertEquals("<!DOCTYPE PUBLIC \"publicId\" \"systemId\">", accum.toString());
    }

    @Test
    public void outerHtmlTail_givenAnyParameters_shouldNotModifyAccumulator() {
        // Arrange
        DocumentType documentType = new DocumentType("html", null, null, "");
        StringBuilder accum = new StringBuilder("initial");
        Document.OutputSettings out = new Document("").outputSettings();

        // Act
        documentType.outerHtmlTail(accum, 0, out);

        // Assert
        Assert.assertEquals("initial", accum.toString());
    }

    @Test
    public void outerHtml_givenDocumentType_shouldProduceCompleteHtmlOutput() {
        // Arrange
        DocumentType documentType = new DocumentType(
                "html",
                "-//W3C//DTD XHTML 1.0 Strict//EN",
                "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd",
                ""
        );

        // Act
        String html = documentType.outerHtml();

        // Assert
        Assert.assertEquals("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">", html);
    }
}