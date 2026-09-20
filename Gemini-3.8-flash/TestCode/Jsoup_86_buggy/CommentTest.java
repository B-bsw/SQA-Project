package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class CommentTest {

    @Test
    public void constructor_givenData_shouldStoreValue() {
        // Arrange & Act
        Comment comment = new Comment("test comment");

        // Assert
        Assert.assertEquals("test comment", comment.getData());
    }

    @Test
    public void constructor_givenDataAndBaseUri_shouldStoreValue() {
        // Arrange & Act
        Comment comment = new Comment("test comment with baseUri", "http://example.com");

        // Assert
        Assert.assertEquals("test comment with baseUri", comment.getData());
    }

    @Test
    public void nodeName_shouldReturnCommentNodeName() {
        // Arrange
        Comment comment = new Comment("sample");

        // Act
        String name = comment.nodeName();

        // Assert
        Assert.assertEquals("#comment", name);
    }

    @Test
    public void getData_givenCommentData_shouldReturnExactContent() {
        // Arrange
        String content = "Simple content";
        Comment comment = new Comment(content);

        // Act
        String result = comment.getData();

        // Assert
        Assert.assertEquals(content, result);
    }

    @Test
    public void toString_shouldReturnFormattedOuterHtml() {
        // Arrange
        Comment comment = new Comment("hello world");

        // Act
        String result = comment.toString();

        // Assert
        Assert.assertEquals("<!--hello world-->", result);
    }

    @Test
    public void outerHtmlHead_whenPrettyPrintDisabled_shouldNotIndent() throws IOException {
        // Arrange
        Comment comment = new Comment("no indent");
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.prettyPrint(false);

        // Act
        comment.outerHtmlHead(sb, 2, settings);

        // Assert
        Assert.assertEquals("<!--no indent-->", sb.toString());
    }

    @Test
    public void outerHtmlHead_whenPrettyPrintEnabled_shouldIncludeIndentation() throws IOException {
        // Arrange
        Comment comment = new Comment("with indent");
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.prettyPrint(true);
        settings.indentAmount(4);

        // Act
        comment.outerHtmlHead(sb, 1, settings);

        // Assert
        Assert.assertEquals("\n    <!--with indent-->", sb.toString());
    }

    @Test
    public void outerHtmlHead_whenDepthIsZeroAndPrettyPrintEnabled_shouldNotPrependWhitespaceIndent() throws IOException {
        // Arrange
        Comment comment = new Comment("zero depth");
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.prettyPrint(true);

        // Act
        comment.outerHtmlHead(sb, 0, settings);

        // Assert
        Assert.assertEquals("<!--zero depth-->", sb.toString());
    }

    @Test
    public void outerHtmlTail_shouldNotAppendAnything() throws IOException {
        // Arrange
        Comment comment = new Comment("tail test");
        StringBuilder sb = new StringBuilder("existing");
        Document.OutputSettings settings = new Document.OutputSettings();

        // Act
        comment.outerHtmlTail(sb, 0, settings);

        // Assert
        Assert.assertEquals("existing", sb.toString());
    }

    @Test
    public void isXmlDeclaration_givenQuestionMarkPrefixAndLengthGreaterThanOne_shouldReturnTrue() {
        // Arrange
        Comment comment = new Comment("?xml version='1.0' encoding='UTF-8'?");

        // Act
        boolean isXml = comment.isXmlDeclaration();

        // Assert
        Assert.assertTrue(isXml);
    }

    @Test
    public void isXmlDeclaration_givenExclamationMarkPrefixAndLengthGreaterThanOne_shouldReturnTrue() {
        // Arrange
        Comment comment = new Comment("!DOCTYPE html");

        // Act
        boolean isXml = comment.isXmlDeclaration();

        // Assert
        Assert.assertTrue(isXml);
    }

    @Test
    public void isXmlDeclaration_givenNormalComment_shouldReturnFalse() {
        // Arrange
        Comment comment = new Comment("just a normal comment");

        // Act
        boolean isXml = comment.isXmlDeclaration();

        // Assert
        Assert.assertFalse(isXml);
    }

    @Test
    public void isXmlDeclaration_givenEmptyString_shouldReturnFalse() {
        // Arrange
        Comment comment = new Comment("");

        // Act
        boolean isXml = comment.isXmlDeclaration();

        // Assert
        Assert.assertFalse(isXml);
    }

    @Test
    public void isXmlDeclaration_givenSingleCharacterQuestionMark_shouldReturnFalse() {
        // Arrange
        Comment comment = new Comment("?");

        // Act
        boolean isXml = comment.isXmlDeclaration();

        // Assert
        Assert.assertFalse(isXml);
    }

    @Test
    public void isXmlDeclaration_givenSingleCharacterExclamationMark_shouldReturnFalse() {
        // Arrange
        Comment comment = new Comment("!");

        // Act
        boolean isXml = comment.isXmlDeclaration();

        // Assert
        Assert.assertFalse(isXml);
    }

    @Test
    public void isXmlDeclaration_givenPrefixNotAtBeginning_shouldReturnFalse() {
        // Arrange
        Comment comment = new Comment("a?b");

        // Act
        boolean isXml = comment.isXmlDeclaration();

        // Assert
        Assert.assertFalse(isXml);
    }

    @Test
    public void asXmlDeclaration_givenXmlProcessingInstruction_shouldParseCorrectly() {
        // Arrange
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\"?");

        // Act
        XmlDeclaration decl = comment.asXmlDeclaration();

        // Assert
        Assert.assertNotNull(decl);
        Assert.assertEquals("xml", decl.name());
        Assert.assertEquals("1.0", decl.attr("version"));
        Assert.assertEquals("UTF-8", decl.attr("encoding"));
        Assert.assertFalse(decl.isProcessingInstruction());
    }

    @Test
    public void asXmlDeclaration_givenExclamationDeclaration_shouldSetIsProcessingInstructionTrue() {
        // Arrange
        Comment comment = new Comment("!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\"");

        // Act
        XmlDeclaration decl = comment.asXmlDeclaration();

        // Assert
        Assert.assertNotNull(decl);
        Assert.assertEquals("DOCTYPE", decl.name());
        Assert.assertTrue(decl.isProcessingInstruction());
    }

    @Test
    public void asXmlDeclaration_givenNoChildNodesInParsedDocument_shouldReturnNull() {
        // Arrange
        // Passing "??" makes data.substring(1, data.length() - 1) evaluate to empty string ""
        // Resulting XML string is "<>" which parses to 0 children in XmlTreeBuilder
        Comment comment = new Comment("??");

        // Act
        XmlDeclaration decl = comment.asXmlDeclaration();

        // Assert
        Assert.assertNull(decl);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void asXmlDeclaration_givenEmptyString_shouldThrowStringIndexOutOfBoundsException() {
        // Arrange
        Comment comment = new Comment("");

        // Act
        comment.asXmlDeclaration();
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void asXmlDeclaration_givenSingleCharacter_shouldThrowStringIndexOutOfBoundsException() {
        // Arrange
        Comment comment = new Comment("?");

        // Act
        comment.asXmlDeclaration();
    }
}