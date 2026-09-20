package org.jsoup;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.safety.Whitelist;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class JsoupTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    // ---------- parse(String html, String baseUri) ----------

    @Test
    public void testParseHtmlWithBaseUri_normal() {
        Document doc = Jsoup.parse("<html><head><title>Test</title></head><body><p>Hello</p></body></html>", "http://example.com/");
        assertNotNull(doc);
        assertEquals("Test", doc.title());
        assertEquals("Hello", doc.body().text());
    }

    @Test
    public void testParseHtmlWithBaseUri_emptyHtml() {
        Document doc = Jsoup.parse("", "http://example.com/");
        assertNotNull(doc);
        assertEquals("", doc.title());
    }

    @Test
    public void testParseHtmlWithBaseUri_nullHtml() {
        Document doc = Jsoup.parse((String) null, "http://example.com/");
        assertNotNull(doc);
    }

    @Test
    public void testParseHtmlWithBaseUri_relativeUrlResolution() {
        Document doc = Jsoup.parse("<a href='/path'>link</a>", "http://example.com/");
        assertEquals("http://example.com/path", doc.select("a").first().absUrl("href"));
    }

    // ---------- parse(String html, String baseUri, Parser parser) ----------

    @Test
    public void testParseWithParser_htmlParser() {
        Parser parser = Parser.htmlParser();
        Document doc = Jsoup.parse("<div>content</div>", "http://example.com/", parser);
        assertNotNull(doc);
        assertEquals("content", doc.select("div").text());
    }

    @Test
    public void testParseWithParser_xmlParser() {
        Parser parser = Parser.xmlParser();
        Document doc = Jsoup.parse("<root><child>value</child></root>", "http://example.com/", parser);
        assertNotNull(doc);
        assertEquals("value", doc.select("child").text());
    }

    @Test
    public void testParseWithParser_emptyHtml() {
        Parser parser = Parser.htmlParser();
        Document doc = Jsoup.parse("", "", parser);
        assertNotNull(doc);
    }

    // ---------- parse(String html) ----------

    @Test
    public void testParseHtmlOnly_normal() {
        Document doc = Jsoup.parse("<html><body><p>Hello World</p></body></html>");
        assertNotNull(doc);
        assertEquals("Hello World", doc.body().text());
    }

    @Test
    public void testParseHtmlOnly_empty() {
        Document doc = Jsoup.parse("");
        assertNotNull(doc);
        assertEquals("", doc.text());
    }

    @Test
    public void testParseHtmlOnly_baseHrefTag() {
        Document doc = Jsoup.parse("<html><head><base href='http://example.com/'></head><body><a href='rel'>link</a></body></html>");
        assertEquals("http://example.com/rel", doc.select("a").first().absUrl("href"));
    }

    // ---------- connect(String url) ----------

    @Test
    public void testConnect_normal() {
        Connection con = Jsoup.connect("http://example.com/");
        assertNotNull(con);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConnect_invalidProtocol() {
        Jsoup.connect("ftp://example.com/");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConnect_nullUrl() {
        Jsoup.connect(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConnect_emptyUrl() {
        Jsoup.connect("");
    }

    // ---------- parse(File in, String charsetName, String baseUri) ----------

    @Test
    public void testParseFileWithCharsetAndBaseUri_normal() throws IOException {
        File file = tempFolder.newFile("test1.html");
        writeToFile(file, "<html><head><title>FileTest</title></head><body><p>File content</p></body></html>");
        Document doc = Jsoup.parse(file, "UTF-8", "http://example.com/");
        assertNotNull(doc);
        assertEquals("FileTest", doc.title());
        assertEquals("File content", doc.body().text());
    }

    @Test
    public void testParseFileWithCharsetAndBaseUri_nullCharset() throws IOException {
        File file = tempFolder.newFile("test2.html");
        writeToFile(file, "<html><body><p>No charset given</p></body></html>");
        Document doc = Jsoup.parse(file, null, "http://example.com/");
        assertNotNull(doc);
        assertEquals("No charset given", doc.body().text());
    }

    @Test(expected = IOException.class)
    public void testParseFile