package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class DataUtilTest {

    @Test
    public void testGetCharsetFromContentTypeNull() {
        assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void testGetCharsetFromContentTypeNoMatch() {
        assertNull(DataUtil.getCharsetFromContentType("text/html"));
    }

    @Test
    public void testGetCharsetFromContentTypeValid() {
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=UTF-8"));
    }

    @Test
    public void testGetCharsetFromContentTypeQuoted() {
        assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType("text/html; charset=\"ISO-8859-1\""));
    }

    @Test
    public void testGetCharsetFromContentTypeUnsupported() {
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset=not-a-charset"));
    }

    @Test
    public void testGetCharsetFromContentTypeEmpty() {
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset="));
    }

    @Test
    public void testGetCharsetFromContentTypeSpaces() {
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType(" text/html ; charset = UTF-8 "));
    }

    @Test
    public void testMimeBoundaryLengthAndCharset() {
        String boundary = DataUtil.mimeBoundary();
        assertEquals(32, boundary.length());
        assertTrue(Pattern.matches("[-_0-9A-Za-z]{32}", boundary));
    }

    @Test
    public void testEmptyByteBuffer() {
        ByteBuffer buffer = DataUtil.emptyByteBuffer();
        assertNotNull(buffer);
        assertEquals(0, buffer.remaining());
    }

    @Test
    public void testCrossStreamsCopiesBytes() throws IOException {
        byte[] data = "hello".getBytes(StandardCharsets.UTF_8);
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DataUtil.crossStreams(in, out);
        assertArrayEquals(data, out.toByteArray());
    }

    @Test
    public void testCrossStreamsEmptyInput() throws IOException {
        byte[] data = new byte[0];
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DataUtil.crossStreams(in, out);
        assertArrayEquals(data, out.toByteArray());
    }

    @Test
    public void testReadToByteBufferUnlimited() throws IOException {
        byte[] data = "hello".getBytes(StandardCharsets.UTF_8);
        ByteBuffer buffer = DataUtil.readToByteBuffer(new ByteArrayInputStream(data), 0);
        byte[] out = new byte[buffer.remaining()];
        buffer.get(out);
        assertArrayEquals(data, out);
    }

    @Test
    public void testReadToByteBufferPackagePrivate() throws IOException {
        byte[] data = "abc".getBytes(StandardCharsets.UTF_8);
        ByteBuffer buffer = DataUtil.readToByteBuffer(new ByteArrayInputStream(data));
        byte[] out = new byte[buffer.remaining()];
        buffer.get(out);
        assertArrayEquals(data, out);
    }

    @Test
    public void testReadToByteBufferNegativeMaxSizeThrows() throws IOException {
        try {
            DataUtil.readToByteBuffer(new ByteArrayInputStream(new byte[0]), -1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("maxSize must be 0 (unlimited) or larger", e.getMessage());
        }
    }

    @Test
    public void testReadFileToByteBuffer() throws IOException {
        byte[] data = {1, 2, 3, 4, 5};
        File temp = File.createTempFile("jsoup-test", ".bin");
        temp.deleteOnExit();
        Files.write(temp.toPath(), data);
        ByteBuffer buffer = DataUtil.readFileToByteBuffer(temp);
        byte[] out = new byte[buffer.remaining()];
        buffer.get(out);
        assertArrayEquals(data, out);
    }

    @Test
    public void testLoadFromInputStreamParsesHtml() {
        String html = "<html><head><title>Title</title></head><body><p>Hello</p></body></html>";
        Document doc = DataUtil.load(
                new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8)),
                "UTF-8",
                "http://example.com/");
        assertEquals("Title", doc.title());
        assertEquals("Hello", doc.select("p").first().text());
        assertEquals("http://example.com/", doc.baseUri());
    }

    @Test
    public void testLoadFromInputStreamWithMetaCharset() {
        String html = "<html><head><meta charset=\"ISO-8859-1\"><title>café</title></head><body></body></html>";
        Document doc = DataUtil.load(
                new ByteArrayInputStream(html.getBytes(StandardCharsets.ISO_8859_1)),
                null,
                "");
        assertEquals("café", doc.title());
    }

    @Test
    public void testLoadFromFile() throws IOException {
        String html = "<html><head><title>FileTitle</title></head><body></body></html>";
        File temp = File.createTempFile("jsoup-load", ".html");
        temp.deleteOnExit();
        Files.write(temp.toPath(), html.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.load(temp, "UTF-8", "http://example.com/");
        assertEquals("FileTitle", doc.title());
    }

    @Test
    public void testLoadWithNullStreamReturnsEmptyDocument() {
        Document doc = DataUtil.load((InputStream) null, "UTF-8", "http://example.com/");
        assertNotNull(doc);
        assertEquals("http://example.com/", doc.baseUri());
        assertEquals("", doc.text());
    }

    @Test
    public void testParseInputStreamNullInputReturnsDocument() {
        Document doc = DataUtil.parseInputStream(null, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("http://example.com/", doc.baseUri());
    }

    @Test
    public void testLoadWithEmptyCharsetNameThrows() {
        try {
            DataUtil.load(
                    new ByteArrayInputStream("<html></html>".getBytes(StandardCharsets.UTF_8)),
                    "",
                    "");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Must set charset arg"));
        }
    }

    @Test
    public void testLoadWithXmlParser() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><root><item>value</item></root>";
        Document doc = DataUtil.load(
                new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8)),
                "UTF-8",
                "",
                Parser.xmlParser());
        assertEquals("root", doc.children().get(0).tagName());
    }
}