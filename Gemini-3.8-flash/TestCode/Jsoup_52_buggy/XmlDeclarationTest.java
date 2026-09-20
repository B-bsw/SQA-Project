package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class XmlDeclarationTest {

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullName_shouldThrowIllegalArgumentException() {
        // Arrange, Act & Assert
        new XmlDeclaration(null, "http://example.com", false);
    }

    @Test
    public void constructor_givenValidParameters_shouldInitializeCorrectly() {
        // Arrange & Act
        XmlDeclaration decl = new XmlDeclaration("xml", "http://example.com", false);

        // Assert
        Assert.assertEquals("xml", decl.name());
        Assert.assertEquals("http://example.com", decl.baseUri());
    }

    @Test
    public void nodeName_givenAnyState_shouldReturnDeclarationIdentifier() {
        // Arrange
        XmlDeclaration decl = new XmlDeclaration("xml", "http://example.com", false);

        // Act
        String actualNodeName = decl.nodeName();

        // Assert
        Assert.assertEquals("#declaration", actualNodeName);
    }

    @Test
    public void name_givenValidName_shouldReturnStoredName() {
        // Arrange
        String expectedName = "custom-decl";
        XmlDeclaration decl = new XmlDeclaration(expectedName, "http://example.com", true);

        // Act
        String actualName = decl.name();

        // Assert
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void getWholeDeclaration_givenNonXmlNameWithAttributes_shouldReturnNameOnly() {
        // Arrange
        XmlDeclaration decl = new XmlDeclaration("custom", "http://example.com", false);
        decl.attr("version", "1.0");
        decl.attr("encoding", "UTF-8");

        // Act
        String actualDecl = decl.getWholeDeclaration();

        // Assert
        Assert.assertEquals("custom", actualDecl);
    }

    @Test
    public void getWholeDeclaration_givenXmlNameWithZeroAttributes_shouldReturnXml() {
        // Arrange
        XmlDeclaration decl = new XmlDeclaration("xml", "http://example.com", false);

        // Act
        String actualDecl = decl.getWholeDeclaration();

        // Assert
        Assert.assertEquals("xml", actualDecl);
    }

    @Test
    public void getWholeDeclaration_givenXmlNameWithSingleAttribute_shouldReturnXml() {
        // Arrange
        XmlDeclaration decl = new XmlDeclaration("xml", "http://example.com", false);
        decl.attr("version", "1.0");

        // Act
        String actualDecl = decl.getWholeDeclaration();

        // Assert
        Assert.assertEquals("xml", actualDecl);
    }

    @Test
    public void getWholeDeclaration_givenXmlNameWithVersionAndEncoding_shouldReturnFormattedAttributes() {
        // Arrange
        XmlDeclaration decl = new XmlDeclaration("xml", "http://example.com", false);
        decl.attr("version", "1.0");
        decl.attr("encoding", "UTF-8");

        // Act
        String actualDecl = decl.getWholeDeclaration();

        // Assert
        Assert.assertEquals("xml version=\"1.0\" encoding=\"UTF-8\"", actualDecl);
    }

    @Test
    public void getWholeDeclaration_givenXmlNameWithVersionAndOtherAttribute_shouldAppendVersionOnly() {
        // Arrange
        XmlDeclaration decl = new XmlDeclaration("xml", "http://example.com", false);
        decl.attr("version", "1.0");
        decl.attr("standalone", "yes");

        // Act
        String actualDecl = decl.getWholeDeclaration();

        // Assert
        Assert.assertEquals("xml version=\"1.0\"", actualDecl);
    }

    @Test
    public void getWholeDeclaration_givenXmlNameWithEncodingAndOtherAttribute_shouldAppendEncodingOnly() {
        // Arrange
        XmlDeclaration decl = new XmlDeclaration("xml", "http://example.com", false);
        decl.attr("encoding", "UTF-8");
        decl.attr("standalone", "yes");

        // Act
        String actualDecl = decl.getWholeDeclaration();

        // Assert
        Assert.assertEquals("xml encoding=\"UTF-8\"", actualDecl);
    }

    @Test
    public void getWholeDeclaration_givenXmlNameWithMultipleAttributesExcludingVersionAndEncoding_shouldReturnXml() {
        // Arrange
        XmlDeclaration decl = new XmlDeclaration("xml", "http://example.com", false);
        decl.attr("standalone", "yes");
        decl.attr("other", "val");

        // Act
        String actualDecl = decl.getWholeDeclaration();

        // Assert
        Assert.assertEquals("xml", actualDecl);
    }

    @Test
    public void outerHtmlHead_givenProcessingInstructionFalse_shouldFormatWithQuestionMark() throws IOException {
        // Arrange
        XmlDeclaration decl = new XmlDeclaration("xml", "http://example.com", false);
        decl.attr("version", "1.0");
        decl.attr("encoding", "UTF-8");
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();

        // Act
        decl.outerHtmlHead(sb, 0, out);

        // Assert
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\">", sb.toString());
    }

    @Test
    public void outerHtmlHead_givenProcessingInstructionTrue_shouldFormatWithExclamationMark() throws IOException {
        // Arrange
        XmlDeclaration decl = new XmlDeclaration("xml", "http://example.com", true);
        decl.attr("version", "1.0");
        decl.attr("encoding", "UTF-8");
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();

        // Act
        decl.outerHtmlHead(sb, 0, out);

        // Assert
        Assert.assertEquals("<!xml version=\"1.0\" encoding=\"UTF-8\">", sb.toString());
    }

    @Test
    public void outerHtmlTail_givenInvocation_shouldProduceNoOutput() throws IOException {
        // Arrange
        XmlDeclaration decl = new XmlDeclaration("xml", "http://example.com", false);
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();

        // Act
        decl.outerHtmlTail(sb, 0, out);

        // Assert
        Assert.assertEquals("", sb.toString());
    }

    @Test
    public void toString_givenDeclarationNode_shouldReturnOuterHtml() {
        // Arrange
        XmlDeclaration decl = new XmlDeclaration("xml", "http://example.com", false);
        decl.attr("version", "1.0");
        decl.attr("encoding", "UTF-8");

        // Act
        String actualString = decl.toString();

        // Assert
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\">", actualString);
    }

    @Test
    public void toString_givenProcessingInstruction_shouldReturnOuterHtmlWithExclamation() {
        // Arrange
        XmlDeclaration decl = new XmlDeclaration("xml", "http://example.com", true);

        // Act
        String actualString = decl.toString();

        // Assert
        Assert.assertEquals("<!xml>", actualString);
    }
}