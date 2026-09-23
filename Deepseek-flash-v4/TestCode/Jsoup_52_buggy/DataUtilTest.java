package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class DataUtilTest {
    @Test
    public void testGetCharsetFromContentType() {
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=UTF-8"));
        assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType("text/html; charset=\"iso-8859-1\""));
        assertEquals("UTF-16", DataUtil.getCharsetFromContentType("charset=utf-16"));
        assertNull(DataUtil.getCharsetFromContentType(null));
        assertNull(DataUtil.getCharsetFromContentType("text/html"));
        assertNull(DataUtil.getCharsetFromContentType("charset=invalid_charset_name"));
    }

    @Test
    public void testParseByteDataNullCharsetWithMetaCharset() {
        String html = "<html><head><meta charset=\"ISO-8859-1\"></head><body></body></html>";
        ByteBuffer data = ByteBuffer.wrap(html.getBytes(StandardCharsets.ISO_8859_1));
        Document doc = DataUtil.parseByteData(data, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteDataWithCharset() {
        String html = "<html><body>test</body></html>";
        ByteBuffer data = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.parseByteData(data, "UTF-8", "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteDataWithBomUtf8() {
        byte[] bom = {(byte) 0xEF, (byte) 0xBB, (byte) 0xBF};
        String html = "<html><body>test</body></html>";
        byte[] data = new byte[bom.length + html.getBytes(StandardCharsets.UTF_8).length];
        System.arraycopy(bom, 0, data, 0, bom.length);
        System.arraycopy(html.getBytes(StandardCharsets.UTF_8), 0, data, bom.length, html.getBytes(StandardCharsets.UTF_8).length);
        ByteBuffer buffer = ByteBuffer.wrap(data);
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
    }

    @Test
    public void testParseByteDataNullCharsetNoMeta() {
        String html = "<html><body>test</body></html>";
        ByteBuffer data = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.parseByteData(data, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
    }

    @Test
    public void testParseByteDataCharsetNotFound() {
        String html = "<html><head><meta charset=\"UTF-16\"></head><body>test</body></html>";
        ByteBuffer data = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.parseByteData(data, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
    }

    @Test
    public void testReadToByteBufferZeroMax() throws IOException {
        String content = "test content";
        ByteArrayInputStream in = new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8));
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 0);
        assertNotNull(buffer);
        assertEquals(content, new String(buffer.array(), StandardCharsets.UTF_8));
    }

    @Test
    public void testReadToByteBufferMaxSize() throws IOException {
        String content = "test content";
        ByteArrayInputStream in = new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8));
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 5);
        assertNotNull(buffer);
        assertEquals("test ", new String(buffer.array(), 0, buffer.limit(), StandardCharsets.UTF_8));
    }

    @Test
    public void testReadToByteBufferEmpty() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[0]);
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 0);
        assertNotNull(buffer);
        assertEquals(0, buffer.limit());
    }

    @Test
    public void testEmptyByteBuffer() {
        ByteBuffer buffer = DataUtil.emptyByteBuffer();
        assertNotNull(buffer);
        assertEquals(0, buffer.capacity());
    }

    @Test
    public void testMimeBoundary() {
        String boundary = DataUtil.mimeBoundary();
        assertNotNull(boundary);
        assertTrue(boundary.length() > 0);
    }

    @Test
    public void testLoadInputStream() throws IOException {
        String html = "<html><body>test</body></html>";
        ByteArrayInputStream in = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com");
        assertNotNull(doc);
    }

    @Test
    public void testLoadInputStreamWithParser() throws IOException {
        String html = "<html><body>test</body></html>";
        ByteArrayInputStream in = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
    }

    @Test(expected = IOException.class)
    public void testReadFileToByteBufferInvalidFile() throws IOException {
        DataUtil.readFileToByteBuffer(new java.io.File("non_existent_file.html"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadToByteBufferNegativeMax() throws IOException {
        DataUtil.readToByteBuffer(new ByteArrayInputStream("test".getBytes()), -1);
    }
}