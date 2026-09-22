package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class DataUtilTest {
    private static final String BASE_URI = "http://example.com/";
    private ByteBuffer utf8Data;

    @Before
    public void setUp() {
        utf8Data = ByteBuffer.wrap("<html><head><meta charset=\"UTF-8\"></head><body>Test</body></html>".getBytes(StandardCharsets.UTF_8));
    }

    @After
    public void tearDown() {
        utf8Data = null;
    }

    @Test
    public void testLoadFileWithCharset() throws IOException {
        File tempFile = File.createTempFile("test", ".html");
        try (PrintWriter writer = new PrintWriter(tempFile, "UTF-8")) {
            writer.print("<html><body>Hello</body></html>");
        }
        Document doc = DataUtil.load(tempFile, "UTF-8", BASE_URI);
        assertNotNull(doc);
        assertEquals("Hello", doc.body().text());
        assertTrue(tempFile.delete());
    }

    @Test(expected = IOException.class)
    public void testLoadFileNotFound() throws IOException {
        DataUtil.load(new File("/nonexistent/file.html"), "UTF-8", BASE_URI);
    }

    @Test
    public void testLoadInputStreamWithCharset() throws IOException {
        String html = "<html><body>Stream</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.load(in, "UTF-8", BASE_URI);
        assertNotNull(doc);
        assertEquals("Stream", doc.body().text());
    }

    @Test(expected = IOException.class)
    public void testLoadInputStreamReadError() throws IOException {
        InputStream in = new InputStream() {
            @Override
            public int read() throws IOException {
                throw new IOException("read error");
            }
        };
        DataUtil.load(in, "UTF-8", BASE_URI);
    }

    @Test
    public void testLoadInputStreamWithParser() throws IOException {
        String xml = "<?xml version=\"1.0\"?><root>XML</root>";
        InputStream in = new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.load(in, null, BASE_URI, Parser.xmlParser());
        assertNotNull(doc);
        assertEquals("XML", doc.text());
    }

    @Test
    public void testParseByteDataWithExplicitCharset() {
        ByteBuffer data = ByteBuffer.wrap("<html><body>Hello</body></html>".getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.parseByteData(data, "UTF-8", BASE_URI, Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("Hello", doc.body().text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseByteDataWithEmptyCharset() {
        ByteBuffer data = ByteBuffer.wrap("<html><body>Hello</body></html>".getBytes(StandardCharsets.UTF_8));
        DataUtil.parseByteData(data, "", BASE_URI, Parser.htmlParser());
    }

    @Test
    public void testParseByteDataWithNullCharsetAndMeta() {
        String html = "<html><head><meta charset=\"ISO-8859-1\"></head><body>Latin</body></html>";
        ByteBuffer data = ByteBuffer.wrap(html.getBytes(StandardCharsets.ISO_8859_1));
        Document doc = DataUtil.parseByteData(data, null, BASE_URI, Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("Latin", doc.body().text());
    }

    @Test
    public void testParseByteDataWithNullCharsetNoMeta() {
        String html = "<html><body>No meta</body></html>";
        ByteBuffer data = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.parseByteData(data, null, BASE_URI, Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("No meta", doc.body().text());
    }

    @Test
    public void testParseByteDataWithMetaHttpEquiv() {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html;charset=ISO-8859-1\"></head><body>Latin</body></html>";
        ByteBuffer data = ByteBuffer.wrap(html.getBytes(StandardCharsets.ISO_8859_1));
        Document doc = DataUtil.parseByteData(data, null, BASE_URI, Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("Latin", doc.body().text());
    }

    @Test
    public void testParseByteDataWithBOM() {
        byte[] bom = new byte[]{(byte) 0xEF, (byte) 0xBB, (byte) 0xBF};
        byte[] content = "<html><body>BOM</body></html>".getBytes(StandardCharsets.UTF_8);
        ByteBuffer data = ByteBuffer.wrap(concatArrays(bom, content));
        Document doc = DataUtil.parseByteData(data, null, BASE_URI, Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("BOM", doc.body().text());
    }

    @Test
    public void testReadToByteBuffer() throws IOException {
        String content = "Test content for buffer reading";
        InputStream in = new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8));
        ByteBuffer buffer = DataUtil.readToByteBuffer(in);
        assertNotNull(buffer);
        assertEquals(content, new String(buffer.array(), buffer.position(), buffer.limit(), StandardCharsets.UTF_8));
    }

    @Test
    public void testReadToByteBufferEmptyStream() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ByteBuffer buffer = DataUtil.readToByteBuffer(in);
        assertNotNull(buffer);
        assertEquals(0, buffer.remaining());
    }

    @Test
    public void testReadToByteBufferLargeStream() throws IOException {
        StringBuilder contentBuilder = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            contentBuilder.append("Line ").append(i).append("\n");
        }
        String content = contentBuilder.toString();
        InputStream in = new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8));
        ByteBuffer buffer = DataUtil.readToByteBuffer(in);
        assertEquals(content, new String(buffer.array(), buffer.position(), buffer.limit(), StandardCharsets.UTF_8));
    }

    @Test
    public void testGetCharsetFromContentTypeFound() {
        assertEquals("EUC-JP", DataUtil.getCharsetFromContentType("text/html; charset=EUC-JP"));
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html;charset=UTF-8"));
        assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType("text/html; charset=ISO-8859-1"));
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=\"utf-8\""));
    }

    @Test
    public void testGetCharsetFromContentTypeNotFound() {
        assertNull(DataUtil.getCharsetFromContentType("text/html"));
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset="));
    }

    @Test
    public void testGetCharsetFromContentTypeNull() {
        assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void testLoadFileWithNullCharsetMetaDetection() throws IOException {
        File tempFile = File.createTempFile("test-meta", ".html");
        String html = "<html><head><meta charset=\"UTF-8\"></head><body>Meta detected</body></html>";
        try (PrintWriter writer = new PrintWriter(tempFile, "UTF-8")) {
            writer.print(html);
        }
        Document doc = DataUtil.load(tempFile, null, BASE_URI);
        assertNotNull(doc);
        assertEquals("Meta detected", doc.body().text());
        assertTrue(tempFile.delete());
    }

    @Test
    public void testLoadFileWithEmptyImageData() throws IOException {
        File tempFile = File.createTempFile("test-empty", ".html");
        try (PrintWriter writer = new PrintWriter(tempFile, "UTF-8")) {
            writer.print("<html><body>Empty</body></html>");
        }
        Document doc = DataUtil.load(tempFile, "UTF-8", BASE_URI);
        assertNotNull(doc);
        assertEquals("Empty", doc.body().text());
        assertTrue(tempFile.delete());
    }

    @Test
    public void testLoadFileWithImageDataAndMetaDetection() throws IOException {
        File tempFile = File.createTempFile("test-image", ".html");
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html;charset=UTF-8\"></head><body>Image</body></html>";
        try (PrintWriter writer = new PrintWriter(tempFile, "UTF-8")) {
            writer.print(html);
        }
        Document doc = DataUtil.load(tempFile, null, BASE_URI);
        assertNotNull(doc);
        assertEquals("Image", doc.body().text());
        assertTrue(tempFile.delete());
    }

    @Test
    public void testGetCharsetFromContentTypeCaseInsensitive() {
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("TEXT/HTML; CHARSET=UTF-8"));
        assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType("text/html; ChArSeT=iso-8859-1"));
    }

    private static byte[] concatArrays(byte[] first, byte[] second) {
        byte[] result = new byte[first.length + second.length];
        System.arraycopy(first, 0, result, 0, first.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }

    @Test
    public void testLoadInputStreamWithBOMAndCharset() throws IOException {
        byte[] bom = new byte[]{(byte) 0xEF, (byte) 0xBB, (byte) 0xBF};
        String html = "<html><body>BOM Test</body></html>";
        byte[] content = html.getBytes(StandardCharsets.UTF_8);
        byte[] full = concatArrays(bom, content);
        InputStream in = new ByteArrayInputStream(full);
        Document doc = DataUtil.load(in, "UTF-8", BASE_URI);
        assertNotNull(doc);
        assertEquals("BOM Test", doc.body().text());
    }

    @Test(expected = NullPointerException.class)
    public void testLoadInputStreamNullWithCharset() throws IOException {
        DataUtil.load((InputStream) null, "UTF-8", BASE_URI);
    }

    @Test(expected = NullPointerException.class)
    public void testLoadFileNullWithCharset() throws IOException {
        DataUtil.load((File) null, "UTF-8", BASE_URI);
    }
}