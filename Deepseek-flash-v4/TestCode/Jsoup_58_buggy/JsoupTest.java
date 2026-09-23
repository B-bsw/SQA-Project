package org.jsoup;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.safety.Whitelist;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class JsoupTest {
    private String html;
    private String baseUri;
    private Whitelist whitelist;

    @Before
    public void setUp() {
        html = "<html><head></head><body><p>Hello</p></body></html>";
        baseUri = "http://example.com/";
        whitelist = Whitelist.basic();
    }

    @After
    public void tearDown() {
        // No-op teardown
    }

    // --- parse(String, String) ---
    @Test
    public void testParseHtmlAndBaseUri() {
        Document doc = Jsoup.parse(html, baseUri);
        assertNotNull(doc);
        assertEquals("http://example.com/", doc.baseUri());
        assertEquals("Hello", doc.body().text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseHtmlWithNullBaseUri() {
        Jsoup.parse(html, null);
    }

    @Test
    public void testParseEmptyHtml() {
        Document doc = Jsoup.parse("", "");
        assertNotNull(doc);
        assertEquals("", doc.body().text());
    }

    // --- parse(String, String, Parser) ---
    @Test
    public void testParseWithXmlParser() {
        Parser xmlParser = Parser.xmlParser();
        Document doc = Jsoup.parse("<root><child/></root>", baseUri, xmlParser);
        assertNotNull(doc);
        assertEquals("root", doc.tagName());
        assertEquals(1, doc.children().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseWithNullParser() {
        Jsoup.parse(html, baseUri, null);
    }

    // --- parse(String) ---
    @Test
    public void testParseWithoutBaseUri() {
        Document doc = Jsoup.parse(html);
        assertNotNull(doc);
        assertEquals("", doc.baseUri());
        assertEquals("<html><head></head><body><p>Hello</p></body></html>", doc.outerHtml());
    }

    @Test
    public void testParseEmptyString() {
        Document doc = Jsoup.parse("");
        assertNotNull(doc);
        assertEquals("", doc.body().text());
    }

    // --- connect(String) ---
    @Test(expected = IllegalArgumentException.class)
    public void testConnectInvalidUrl() {
        Jsoup.connect("invalid-url");
    }

    @Test
    public void testConnectValidUrl() {
        Connection connection = Jsoup.connect("http://example.com");
        assertNotNull(connection);
        assertEquals("http://example.com", connection.request().url().toExternalForm());
    }

    // --- parse(File, String, String) ---
    @Test
    public void testParseFileWithCharsetAndBaseUri() throws IOException {
        File file = File.createTempFile("test", ".html");
        try {
            java.nio.file.Files.write(file.toPath(), html.getBytes());
            Document doc = Jsoup.parse(file, "UTF-8", baseUri);
            assertNotNull(doc);
            assertEquals("Hello", doc.body().text());
        } finally {
            file.delete();
        }
    }

    @Test(expected = IOException.class)
    public void testParseNonExistentFile() throws IOException {
        File nonexistent = new File("/path/to/nonexistent.html");
        Jsoup.parse(nonexistent, "UTF-8", baseUri);
    }

    // --- parse(File, String) ---
    @Test
    public void testParseFileWithoutBaseUri() throws IOException {
        File file = File.createTempFile("test", ".html");
        try {
            java.nio.file.Files.write(file.toPath(), html.getBytes());
            Document doc = Jsoup.parse(file, "UTF-8");
            assertNotNull(doc);
            assertEquals(file.getAbsolutePath(), doc.baseUri());
        } finally {
            file.delete();
        }
    }

    // --- parse(InputStream, String, String) ---
    @Test
    public void testParseInputStreamWithCharsetAndBaseUri() throws IOException {
        InputStream in = new ByteArrayInputStream(html.getBytes());
        Document doc = Jsoup.parse(in, "UTF-8", baseUri);
        assertNotNull(doc);
        assertEquals("Hello", doc.body().text());
        in.close();
    }

    @Test(expected = IOException.class)
    public void testParseInvalidInputStream() throws IOException {
        InputStream in = new ByteArrayInputStream("invalid html".getBytes());
        Jsoup.parse(in, "UTF-8", baseUri);
        in.close();
    }

    // --- parse(InputStream, String, String, Parser) ---
    @Test
    public void testParseInputStreamWithXmlParser() throws IOException {
        InputStream in = new ByteArrayInputStream("<root><child/></root>".getBytes());
        Parser xmlParser = Parser.xmlParser();
        Document doc = Jsoup.parse(in, "UTF-8", baseUri, xmlParser);
        assertNotNull(doc);
        assertEquals("root", doc.tagName());
        in.close();
    }

    // --- parseBodyFragment(String, String) ---
    @Test
    public void testParseBodyFragmentWithBaseUri() {
        Document doc = Jsoup.parseBodyFragment("<p>Hello</p>", baseUri);
        assertNotNull(doc);
        assertEquals("Hello", doc.body().text());
        assertEquals("body", doc.body().tagName());
    }

    @Test
    public void testParseBodyFragmentWithoutBaseUri() {
        Document doc = Jsoup.parseBodyFragment("<p>Hello</p>");
        assertNotNull(doc);
        assertEquals("", doc.body().text());
    }

    @Test
    public void testParseBodyFragmentEmpty() {
        Document doc = Jsoup.parseBodyFragment("");
        assertNotNull(doc);
        assertEquals(0, doc.body().children().size());
    }

    // --- parse(URL, int) ---
    @Test
    public void testParseUrlWithTimeout() throws IOException {
        // Test with actual network would fail, so we test with local content
        // Using a local URL to avoid external dependency
        URL url = getClass().getResource("/test.html");
        if (url != null) {
            Document doc = Jsoup.parse(url, 10000);
            assertNotNull(doc);
            assertEquals("Test", doc.title());
        }
    }

    // --- clean(String, Whitelist) ---
    @Test
    public void testCleanWithWhitelist() {
        String input = "<p>Hello</p><script>alert('x')</script>";
        String cleaned = Jsoup.clean(input, whitelist);
        assertNotNull(cleaned);
        assertFalse(cleaned.contains("<script>"));
        assertTrue(cleaned.contains("<p>Hello</p>"));
    }

    @Test
    public void testCleanWithNullBaseUri() {
        String input = "<p>Hello</p>";
        String cleaned = Jsoup.clean(input, whitelist);
        assertNotNull(cleaned);
        assertEquals("<p>Hello</p>", cleaned);
    }

    @Test(expected = NullPointerException.class)
    public void testCleanWithNullWhitelist() {
        Jsoup.clean("<p>Hello</p>", null);
    }

    // --- isValid(String, Whitelist) ---
    @Test
    public void testIsValidWithValidHtml() {
        assertTrue(Jsoup.isValid("<p>Hello</p>", whitelist));
    }

    @Test
    public void testIsValidWithInvalidHtml() {
        assertFalse(Jsoup.isValid("<script>alert('x')</script>", whitelist));
    }

    @Test
    public void testIsValidWithEmptyHtml() {
        assertTrue(Jsoup.isValid("", whitelist));
    }

    @Test(expected = NullPointerException.class)
    public void testIsValidWithNullWhitelist() {
        Jsoup.isValid("<p>Hello</p>", null);
    }

    // --- clean(String, String, Whitelist, OutputSettings) ---
    @Test
    public void testCleanWithOutputSettings() {
        String input = "<p>Hello</p>";
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.prettyPrint(true);
        String cleaned = Jsoup.clean(input, baseUri, whitelist, settings);
        assertNotNull(cleaned);
        assertEquals("<p>Hello</p>", cleaned);
    }

    @Test(expected = NullPointerException.class)
    public void testCleanWithNullOutputSettings() {
        Jsoup.clean("<p>Hello</p>", baseUri, whitelist, null);
    }
}