package org.jsoup.nodes;

import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;

public class DocumentTypeTest {

    @Test
    public void constants_whenReferenced_shouldMatchExpectedValues() {
        // Arrange & Act & Assert
        Assert.assertEquals("PUBLIC", DocumentType.PUBLIC_KEY);
        Assert.assertEquals("SYSTEM", DocumentType.SYSTEM_KEY);
    }

    @Test
    public void nodeName_givenStandardInstance_shouldReturnDoctype() {
        // Arrange
        DocumentType documentType = new DocumentType("html", "", "", "");

        // Act
        String name = documentType.nodeName();

        // Assert
        Assert.assertEquals("#doctype", name);
    }

    @Test
    public void outerHtmlHead_givenHtml5Doctype_shouldRenderLowercaseDoctype() throws IOException {
        // Arrange
        DocumentType documentType = new DocumentType("html", "", "", "");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.syntax(Document.OutputSettings.Syntax.html);

        // Act
        documentType.outerHtmlHead(accum, 0, settings);

        // Assert
        Assert.assertEquals("<!doctype html>", accum.toString());
    }

    @Test
    public void outerHtmlHead_givenHtml5DoctypeWithNullIds_shouldRenderLowercaseDoctype() throws IOException {
        // Arrange
        DocumentType documentType = new DocumentType("html", null, null, "");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.syntax(Document.OutputSettings.Syntax.html);

        // Act
        documentType.outerHtmlHead(accum, 0, settings);

        // Assert
        Assert.assertEquals("<!doctype html>", accum.toString());
    }

    @Test
    public void outerHtmlHead_givenXmlSyntaxWithoutIds_shouldRenderUppercaseDoctype() throws IOException {
        // Arrange
        DocumentType documentType = new DocumentType("html", "", "", "");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.syntax(Document.OutputSettings.Syntax.xml);

        // Act
        documentType.outerHtmlHead(accum, 0, settings);

        // Assert
        Assert.assertEquals("<!DOCTYPE html>", accum.toString());
    }

    @Test
    public void outerHtmlHead_givenPublicIdOnly_shouldRenderPublicDoctype() throws IOException {
        // Arrange
        DocumentType documentType = new DocumentType("html", "-//W3C//DTD HTML 4.01//EN", "", "");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.syntax(Document.OutputSettings.Syntax.html);

        // Act
        documentType.outerHtmlHead(accum, 0, settings);

        // Assert
        Assert.assertEquals("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01//EN\">", accum.toString());
    }

    @Test
    public void outerHtmlHead_givenSystemIdOnly_shouldRenderSystemDoctype() throws IOException {
        // Arrange
        DocumentType documentType = new DocumentType("html", "", "http://www.w3.org/TR/html4/strict.dtd", "");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.syntax(Document.OutputSettings.Syntax.html);

        // Act
        documentType.outerHtmlHead(accum, 0, settings);

        // Assert
        Assert.assertEquals("<!DOCTYPE html \"http://www.w3.org/TR/html4/strict.dtd\">", accum.toString());
    }

    @Test
    public void outerHtmlHead_givenBothPublicAndSystemId_shouldRenderFullDoctype() throws IOException {
        // Arrange
        DocumentType documentType = new DocumentType("html", "-//W3C//DTD HTML 4.01//EN", "http://www.w3.org/TR/html4/strict.dtd", "");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.syntax(Document.OutputSettings.Syntax.html);

        // Act
        documentType.outerHtmlHead(accum, 0, settings);

        // Assert
        Assert.assertEquals("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">", accum.toString());
    }

    @Test
    public void outerHtmlHead_givenBlankNameInHtml_shouldOmitName() throws IOException {
        // Arrange
        DocumentType documentType = new DocumentType("", "", "", "");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.syntax(Document.OutputSettings.Syntax.html);

        // Act
        documentType.outerHtmlHead(accum, 0, settings);

        // Assert
        Assert.assertEquals("<!doctype>", accum.toString());
    }

    @Test
    public void outerHtmlHead_givenWhitespaceNameInXml_shouldOmitName() throws IOException {
        // Arrange
        DocumentType documentType = new DocumentType("   ", "", "", "");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.syntax(Document.OutputSettings.Syntax.xml);

        // Act
        documentType.outerHtmlHead(accum, 0, settings);

        // Assert
        Assert.assertEquals("<!DOCTYPE>", accum.toString());
    }

    @Test
    public void outerHtmlHead_givenNullNameWithPublicAndSystemIds_shouldRenderWithoutName() throws IOException {
        // Arrange
        DocumentType documentType = new DocumentType(null, "pub", "sys", "http://example.com");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings settings = new Document.OutputSettings();

        // Act
        documentType.outerHtmlHead(accum, 0, settings);

        // Assert
        Assert.assertEquals("<!DOCTYPE PUBLIC \"pub\" \"sys\">", accum.toString());
    }

    @Test
    public void outerHtmlTail_givenAnyParameters_shouldProduceNoOutput() {
        // Arrange
        DocumentType documentType = new DocumentType("html", "", "", "");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings settings = new Document.OutputSettings();

        // Act
        documentType.outerHtmlTail(accum, 0, settings);

        // Assert
        Assert.assertEquals(0, accum.length());
    }

    @Test(expected = IOException.class)
    public void outerHtmlHead_givenFailingAppendable_shouldPropagateIOException() throws IOException {
        // Arrange
        DocumentType documentType = new DocumentType("html", "", "", "");
        Appendable failingAppendable = new Appendable() {
            public Appendable append(CharSequence csq) throws IOException {
                throw new IOException("Simulated append error");
            }

            public Appendable append(CharSequence csq, int start, int end) throws IOException {
                throw new IOException("Simulated append error");
            }

            public Appendable append(char c) throws IOException {
                throw new IOException("Simulated append error");
            }
        };
        Document.OutputSettings settings = new Document.OutputSettings();

        // Act
        documentType.outerHtmlHead(failingAppendable, 0, settings);

        // Assert - handled by expected = IOException.class
    }
}