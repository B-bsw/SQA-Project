package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class DataUtilTest {
    private static final String UTF8 = "UTF-8";
    private static final String ISO_8859_1 = "ISO-8859-1";
    private static final String HTML_CONTENT = "<html><head><title>Test</title></head><body><p>Hello</p></body></html>";

    private File tempFile;
    private InputStream emptyStream;

    @Before
    public void setUp() throws IOException {
        tempFile = File.createTempFile("test", ".html");
        emptyStream = new ByteArrayInputStream(new byte[0]);
    }

    @After
    public void tearDown() {
        if (tempFile != null && tempFile.exists()) {
            tempFile.delete();
        }
        if (emptyStream != null) {
            try { emptyStream.close(); } catch (IOException e) { /* ignore */ }
        }
    }

    // ========== load(File, String, String) ==========

    @Test
    public void testLoadFileWithExplicitCharset() throws IOException {
        writeToFile(HTML_CONTENT, UTF8);
        Document doc = DataUtil.load(tempFile, UTF8, "http://example.com");
        assertNotNull(doc);
        assertEquals("Test", doc.title());
    }

    @Test
    public void testLoadFileWithNullCharset() throws IOException {
        writeToFile(HTML_CONTENT, UTF8);
        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertNotNull(doc);
        assertEquals("Test", doc.title());
    }

    @Test(expected = IOException.class)
    public void testLoadNonExistentFile() throws IOException {
        DataUtil.load(new File("/nonexistent/not-found.html"), UTF8, "http://example.com");
    }

    // ========== load(InputStream, String, String) ==========

    @Test
    public void testLoadInputStreamWithCharset() throws IOException {
        InputStream stream = new ByteArrayInputStream(HTML_CONTENT.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.load(stream, UTF8, "http://example.com");
        assertNotNull(doc);
        assertEquals("Test", doc.title());
    }

    @Test
    public void testLoadInputStreamWithNullCharset() throws IOException {
        InputStream stream = new ByteArrayInputStream(HTML_CONTENT.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.load(stream, null, "http://example.com");
        assertNotNull(doc);
        assertEquals("Test", doc.title());
    }

    @Test(expected = IOException.class)
    public void testLoadInputStreamClosed() throws IOException {
        InputStream closed = new ByteArrayInputStream(new byte[0]);
        closed.close();
        DataUtil.load(closed, UTF8, "http://example.com");
    }

    // ========== load(InputStream, String, String, Parser) ==========

    @Test
    public void testLoadInputStreamWithXmlParser() throws IOException {
        InputStream stream = new ByteArrayInputStream("<root/>".getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.load(stream, UTF8, "http://example.com", Parser.xmlParser());
        assertNotNull(doc);
        assertTrue(doc.documentElement().tagName().equals("root"));
    }

    @Test
    public void testLoadInputStreamWithHTMLParser() throws IOException {
        InputStream stream = new ByteArrayInputStream("<html><head><title>XML</title></head><body>ok</body></html>".getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.load(stream, UTF8, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("XML", doc.title());
    }

    @Test(expected = IOException.class)
    public void testLoadInputStreamWithParserThrowsOnBad() throws IOException {
        InputStream stream = new ByteArrayInputStream("<html><body>".getBytes(StandardCharsets.UTF_8)); // incomplete
        DataUtil.load(stream, UTF8, "http://example.com", Parser.xmlParser()); // XML parser will throw on malformed
    }

    // ========== parseByteData (package-private, tested indirectly via load) ==========

    @Test
    public void testParseByteDataWithMetaCharset() throws Exception {
        String html = "<html><head><meta http-equiv=\"content-type\" content=\"text/html; charset=ISO-8859-1\"></head><body>café</body></html>";
        ByteBuffer data = ByteBuffer.wrap(html.getBytes(StandardCharsets.ISO_8859_1));
        Document doc = invokeParseByteData(data, null, "http://example.com", Parser.htmlParser());
        assertEquals("café", doc.body().text());
    }

    @Test
    public void testParseByteDataWithHTML5MetaCharset() throws Exception {
        String html = "<html><head><meta charset=\"utf-8\"></head><body>hello</body></html>";
        ByteBuffer data = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));
        Document doc = invokeParseByteData(data, null, "http://example.com", Parser.htmlParser());
        assertEquals("hello", doc.body().text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseByteDataEmptyCharsetName() {
        ByteBuffer data = ByteBuffer.wrap("<html></html>".getBytes(StandardCharsets.UTF_8));
        invokeParseByteData(data, "", "http://example.com", Parser.htmlParser());
    }

    @Test
    public void testParseByteDataWithBOM() throws Exception {
        String html = "\uFEFF<html><head><title>BOM</title></head></html>";
        ByteBuffer data = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));
        Document doc = invokeParseByteData(data, UTF8, "http://example.com", Parser.htmlParser());
        assertEquals("BOM", doc.title());
    }

    @Test
    public void testParseByteDataNoCharsetSpecifiedUsesUTF8() throws Exception {
        String html = "<html><head><title>UTF8</title></head></html>";
        ByteBuffer data = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));
        Document doc = invokeParseByteData(data, null, "http://example.com", Parser.htmlParser());
        assertEquals("UTF8", doc.title());
    }

    // ========== readToByteBuffer ==========

    @Test
    public void testReadToByteBufferEmptyStream() throws IOException {
        InputStream stream = new ByteArrayInputStream(new byte[0]);
        ByteBuffer buffer = DataUtil.readToByteBuffer(stream);
        assertEquals(0, buffer.remaining());
    }

    @Test
    public void testReadToByteBufferLargeData() throws IOException {
        byte[] large = new byte[200000]; // > bufferSize
        for (int i = 0; i < large.length; i++) large[i] = (byte) (i % 256);
        InputStream stream = new ByteArrayInputStream(large);
        ByteBuffer buffer = DataUtil.readToByteBuffer(stream);
        assertEquals(large.length, buffer.remaining());
        for (int i = 0; i < large.length; i++) {
            assertEquals(large[i], buffer.get(i));
        }
    }

    @Test
    public void testReadToByteBufferExactlyBufferSize() throws IOException {
        byte[] exact = new byte[DataUtil.bufferSize];
        InputStream stream = new ByteArrayInputStream(exact);
        ByteBuffer buffer = DataUtil.readToByteBuffer(stream);
        assertEquals(exact.length, buffer.remaining());
    }

    @Test(expected = IOException.class)
    public void testReadToByteBufferClosedStream() throws IOException {
        InputStream closed = new ByteArrayInputStream(new byte[0]);
        closed.close();
        DataUtil.readToByteBuffer(closed);
    }

    // ========== getCharsetFromContentType ==========

    @Test
    public void testGetCharsetFromContentTypeNormal() {
        String result = DataUtil.getCharsetFromContentType("text/html; charset=EUC-JP");
        assertEquals("EUC-JP", result);
    }

    @Test
    public void testGetCharsetFromContentTypeWithQuotes() {
        String result = DataUtil.getCharsetFromContentType("text/html; charset=\"UTF-8\"");
        assertEquals("UTF-8", result);
    }

    @Test
    public void testGetCharsetFromContentTypeMixedCase() {
        String result = DataUtil.getCharsetFromContentType("text/html; charset=utf-8");
        assertEquals("UTF-8", result);
    }

    @Test
    public void testGetCharsetFromContentTypeNull() {
        assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void testGetCharsetFromContentTypeNoCharset() {
        assertNull(DataUtil.getCharsetFromContentType("text/html"));
    }

    @Test
    public void testGetCharsetFromContentTypeEmptyContentType() {
        assertNull(DataUtil.getCharsetFromContentType(""));
    }

    // ========== Private helpers ==========

    private Document invokeParseByteData(ByteBuffer data, String charsetName, String baseUri, Parser parser) {
        try {
            java.lang.reflect.Method method = DataUtil.class.getDeclaredMethod("parseByteData", ByteBuffer.class, String.class, String.class, Parser.class);
            method.setAccessible(true);
            return (Document) method.invoke(null, data, charsetName, baseUri, parser);
        } catch (Exception e) {
            if (e.getCause() instanceof RuntimeException) {
                throw (RuntimeException) e.getCause();
            }
            throw new RuntimeException(e);
        }
    }

    private void writeToFile(String content, String charset) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(tempFile)) {
            fos.write(content.getBytes(Charset.forName(charset)));
        }
    }
}