package org.jsoup;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.safety.Whitelist;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.net.URL;

public class JsoupTest {

    @Test
    public void constructor_invokedViaReflection_shouldInstantiateAndBePrivate() throws Exception {
        // Arrange
        Constructor constructor = Jsoup.class.getDeclaredConstructor(new Class[0]);

        // Act & Assert
        Assert.assertTrue("Constructor should be private", Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        Object instance = constructor.newInstance(new Object[0]);
        Assert.assertNotNull("Instance created via reflection should not be null", instance);
        Assert.assertTrue("Instance should be of type Jsoup", instance instanceof Jsoup);
    }

    @Test
    public void parse_givenHtmlAndBaseUri_shouldParseCorrectlyAndResolveRelativeUrls() {
        // Arrange
        String html = "<html><head><title>Jsoup Test</title></head><body><a href=\"relative/page.html\">Relative</a></body></html>";
        String baseUri = "http://example.com/sub/";

        // Act
        Document doc = Jsoup.parse(html, baseUri);

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("Jsoup Test", doc.title());
        Assert.assertEquals("http://example.com/sub/relative/page.html", doc.select("a").first().absUrl("href"));
    }

    @Test
    public void parse_givenHtmlAndBaseUriAndXmlParser_shouldParseXmlDocument() {
        // Arrange
        String xml = "<feed><entry id=\"100\"><title>Post Title</title></entry></feed>";
        String baseUri = "http://example.com/";
        Parser parser = Parser.xmlParser();

        // Act
        Document doc = Jsoup.parse(xml, baseUri, parser);

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("Post Title", doc.select("title").text());
        Assert.assertEquals("100", doc.select("entry").attr("id"));
    }

    @Test
    public void parse_givenHtmlOnly_shouldParseWithEmptyBaseUri() {
        // Arrange
        String html = "<div id=\"content\"><p>Sample Paragraph</p></div>";

        // Act
        Document doc = Jsoup.parse(html);

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("Sample Paragraph", doc.select("p").text());
        Assert.assertEquals("", doc.baseUri());
    }

    @Test
    public void parse_givenEmptyHtml_shouldReturnEmptyDocument() {
        // Arrange
        String html = "";

        // Act
        Document doc = Jsoup.parse(html);

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("", doc.body().text());
    }

    @Test
    public void connect_givenValidUrl_shouldReturnConfiguredConnection() {
        // Arrange
        String url = "http://example.com";

        // Act
        Connection connection = Jsoup.connect(url);

        // Assert
        Assert.assertNotNull("Connection should not be null", connection);
        Assert.assertEquals(url, connection.request().url().toExternalForm());
    }

    @Test(expected = IllegalArgumentException.class)
    public void connect_givenNullUrl_shouldThrowIllegalArgumentException() {
        // Act
        Jsoup.connect((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void connect_givenInvalidProtocol_shouldThrowIllegalArgumentException() {
        // Act
        Jsoup.connect("ftp://example.com");
    }

    @Test
    public void parse_givenFileAndCharsetAndBaseUri_shouldLoadAndParseFile() throws IOException {
        // Arrange
        File tempFile = File.createTempFile("jsoup-test-file", ".html");
        try {
            FileOutputStream fos = new FileOutputStream(tempFile);
            fos.write("<html><body><p>File Content</p><a href=\"page.html\">Link</a></body></html>".getBytes("UTF-8"));
            fos.close();

            String baseUri = "http://example.com/";

            // Act
            Document doc = Jsoup.parse(tempFile, "UTF-8", baseUri);

            // Assert
            Assert.assertNotNull(doc);
            Assert.assertEquals("File Content", doc.select("p").text());
            Assert.assertEquals("http://example.com/page.html", doc.select("a").first().absUrl("href"));
        } finally {
            tempFile.delete();
        }
    }

    @Test(expected = IOException.class)
    public void parse_givenNonExistentFileAndCharsetAndBaseUri_shouldThrowIOException() throws IOException {
        // Arrange
        File nonExistentFile = new File("non_existent_file_jsoup_test.html");

        // Act
        Jsoup.parse(nonExistentFile, "UTF-8", "http://example.com/");
    }

    @Test
    public void parse_givenFileAndCharset_shouldLoadAndSetBaseUriToFilePath() throws IOException {
        // Arrange
        File tempFile = File.createTempFile("jsoup-test-file-path", ".html");
        try {
            FileOutputStream fos = new FileOutputStream(tempFile);
            fos.write("<html><body><h1>Header</h1></body></html>".getBytes("UTF-8"));
            fos.close();

            // Act
            Document doc = Jsoup.parse(tempFile, "UTF-8");

            // Assert
            Assert.assertNotNull(doc);
            Assert.assertEquals("Header", doc.select("h1").text());
            Assert.assertEquals(tempFile.getAbsolutePath(), doc.baseUri());
        } finally {
            tempFile.delete();
        }
    }

    @Test(expected = IOException.class)
    public void parse_givenNonExistentFileAndCharset_shouldThrowIOException() throws IOException {
        // Arrange
        File nonExistentFile = new File("non_existent_file_path_test.html");

        // Act
        Jsoup.parse(nonExistentFile, "UTF-8");
    }

    @Test
    public void parse_givenInputStreamAndCharsetAndBaseUri_shouldParseFromStream() throws IOException {
        // Arrange
        String html = "<div class=\"wrapper\"><p>Stream Paragraph</p></div>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        String baseUri = "http://example.com/";

        // Act
        Document doc = Jsoup.parse(in, "UTF-8", baseUri);

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("Stream Paragraph", doc.select("p").text());
        Assert.assertEquals(baseUri, doc.baseUri());
    }

    @Test
    public void parse_givenInputStreamAndCharsetAndBaseUriAndParser_shouldParseXmlFromStream() throws IOException {
        // Arrange
        String xml = "<items><item>Item 1</item><item>Item 2</item></items>";
        InputStream in = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        String baseUri = "http://example.com/";
        Parser xmlParser = Parser.xmlParser();

        // Act
        Document doc = Jsoup.parse(in, "UTF-8", baseUri, xmlParser);

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals(2, doc.select("item").size());
        Assert.assertEquals("Item 1", doc.select("item").first().text());
    }

    @Test
    public void parseBodyFragment_givenBodyHtmlAndBaseUri_shouldParseFragmentAndResolveRelativeUrls() {
        // Arrange
        String bodyHtml = "<div><p>Fragment Text</p><a href=\"target.html\">Anchor</a></div>";
        String baseUri = "http://example.com/dir/";

        // Act
        Document doc = Jsoup.parseBodyFragment(bodyHtml, baseUri);

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertNotNull(doc.body());
        Assert.assertEquals("Fragment Text Anchor", doc.body().text());
        Assert.assertEquals("http://example.com/dir/target.html", doc.select("a").first().absUrl("href"));
    }

    @Test
    public void parseBodyFragment_givenBodyHtmlOnly_shouldParseFragmentWithEmptyBaseUri() {
        // Arrange
        String bodyHtml = "<p>Only Body Text</p>";

        // Act
        Document doc = Jsoup.parseBodyFragment(bodyHtml);

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertNotNull(doc.body());
        Assert.assertEquals("Only Body Text", doc.body().text());
        Assert.assertEquals("", doc.baseUri());
    }

    @Test
    public void parse_givenUrlAndTimeout_shouldThrowIOExceptionWhenConnectionFails() throws Exception {
        // Arrange
        // Pointing to a reserved loopback port to trigger connection failure without external network access
        URL url = new URL("http://127.0.0.1:1/");

        // Act & Assert
        try {
            Jsoup.parse(url, 500);
            Assert.fail("Expected IOException when connecting to an unreachable port");
        } catch (IOException e) {
            Assert.assertNotNull(e);
        }
    }

    @Test
    public void clean_givenBodyHtmlBaseUriAndWhitelist_shouldSanitizeUntrustedTagsAndPreserveSafeOnes() {
        // Arrange
        String dirtyHtml = "<p><a href=\"http://example.com/\">Safe Link</a><script>alert('xss');</script></p>";
        String baseUri = "http://example.com/";
        Whitelist whitelist = Whitelist.basic();

        // Act
        String cleanHtml = Jsoup.clean(dirtyHtml, baseUri, whitelist);

        // Assert
        Assert.assertFalse("Cleaned HTML should not contain script tag", cleanHtml.contains("<script>"));
        Assert.assertFalse("Cleaned HTML should not contain script contents", cleanHtml.contains("alert"));
        Assert.assertTrue("Cleaned HTML should retain anchor tag", cleanHtml.contains("<a href=\"http://example.com/\" rel=\"nofollow\">Safe Link</a>"));
    }

    @Test
    public void clean_givenBodyHtmlAndWhitelist_shouldSanitizeUntrustedTagsWithEmptyBaseUri() {
        // Arrange
        String dirtyHtml = "<p>Text</p><script>alert('xss');</script><style>body { color: red; }</style>";
        Whitelist whitelist = Whitelist.simpleText();

        // Act
        String cleanHtml = Jsoup.clean(dirtyHtml, whitelist);

        // Assert
        Assert.assertFalse("Cleaned HTML should not contain script tag", cleanHtml.contains("<script>"));
        Assert.assertFalse("Cleaned HTML should not contain style tag", cleanHtml.contains("<style>"));
        Assert.assertEquals("Text", cleanHtml);
    }

    @Test
    public void clean_givenBodyHtmlBaseUriWhitelistAndOutputSettings_shouldApplyCustomOutputSettings() {
        // Arrange
        String dirtyHtml = "<p>Line 1</p>\n<p>Line 2</p>";
        String baseUri = "";
        Whitelist whitelist = Whitelist.basic();
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.prettyPrint(false);

        // Act
        String cleanHtml = Jsoup.clean(dirtyHtml, baseUri, whitelist, settings);

        // Assert
        Assert.assertNotNull(cleanHtml);
        Assert.assertEquals("<p>Line 1</p><p>Line 2</p>", cleanHtml);
    }

    @Test
    public void isValid_givenSafeHtmlMatchingWhitelist_shouldReturnTrue() {
        // Arrange
        String safeHtml = "<p><a href=\"http://example.com/\" rel=\"nofollow\">Link</a></p>";
        Whitelist whitelist = Whitelist.basic();

        // Act
        boolean valid = Jsoup.isValid(safeHtml, whitelist);

        // Assert
        Assert.assertTrue("Safe HTML adhering to whitelist should be valid", valid);
    }

    @Test
    public void isValid_givenUnsafeHtmlViolatingWhitelist_shouldReturnFalse() {
        // Arrange
        String unsafeHtml = "<p>Text</p><script>alert('exploit');</script>";
        Whitelist whitelist = Whitelist.basic();

        // Act
        boolean valid = Jsoup.isValid(unsafeHtml, whitelist);

        // Assert
        Assert.assertFalse("Unsafe HTML containing disallowed tags should be invalid", valid);
    }

    @Test
    public void isValid_givenEmptyHtml_shouldReturnTrue() {
        // Arrange
        String emptyHtml = "";
        Whitelist whitelist = Whitelist.basic();

        // Act
        boolean valid = Jsoup.isValid(emptyHtml, whitelist);

        // Assert
        Assert.assertTrue("Empty HTML should be valid", valid);
    }
}