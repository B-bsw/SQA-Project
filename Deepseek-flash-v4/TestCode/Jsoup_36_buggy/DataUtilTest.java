package org.jsoup.helper;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class DataUtilTest {

    private InputStream inputStream;

    @Before
    public void setUp() {
        inputStream = null;
    }

    @After
    public void tearDown() throws IOException {
        if (inputStream != null) {
            inputStream.close();
        }
    }

    // Test readToByteBuffer with null input
    @Test(expected = NullPointerException.class)
    public void testReadToByteBufferNullInput() throws IOException {
        DataUtil.readToByteBuffer(null, 100);
    }

    // Test readToByteBuffer with negative maxSize
    @Test(expected = IllegalArgumentException.class)
    public void testReadToByteBufferNegativeMaxSize() throws IOException {
        inputStream = new ByteArrayInputStream("data".getBytes());
        DataUtil.readToByteBuffer(inputStream, -1);
    }

    // Test readToByteBuffer with zero maxSize (unlimited)
    @Test
    public void testReadToByteBufferUnlimited() throws IOException {
        byte[] content = "test data".getBytes(StandardCharsets.UTF_8);
        inputStream = new ByteArrayInputStream(content);
        ByteBuffer result = DataUtil.readToByteBuffer(inputStream, 0);
        byte[] resultBytes = new byte[result.remaining()];
        result.get(resultBytes);
        Assert.assertArrayEquals(content, resultBytes);
    }

    // Test readToByteBuffer with maxSize limiting
    @Test
    public void testReadToByteBufferWithLimit() throws IOException {
        byte[] content = "test data".getBytes(StandardCharsets.UTF_8);
        inputStream = new ByteArrayInputStream(content);
        ByteBuffer result = DataUtil.readToByteBuffer(inputStream, 4);
        byte[] resultBytes = new byte[result.remaining()];
        result.get(resultBytes);
        Assert.assertEquals("test", new String(resultBytes, StandardCharsets.UTF_8));
    }

    // Test readToByteBuffer with maxSize larger than content
    @Test
    public void testReadToByteBufferWithLargerLimit() throws IOException {
        byte[] content = "test".getBytes(StandardCharsets.UTF_8);
        inputStream = new ByteArrayInputStream(content);
        ByteBuffer result = DataUtil.readToByteBuffer(inputStream, 10);
        byte[] resultBytes = new byte[result.remaining()];
        result.get(resultBytes);
        Assert.assertArrayEquals(content, resultBytes);
    }

    // Test getCharsetFromContentType with null input
    @Test
    public void testGetCharsetFromContentTypeNull() {
        Assert.assertNull(DataUtil.getCharsetFromContentType(null));
    }

    // Test getCharsetFromContentType with valid charset
    @Test
    public void testGetCharsetFromContentTypeValid() {
        String contentType = "text/html; charset=UTF-8";
        Assert.assertEquals("UTF-8", DataUtil.getCharsetFromContentType(contentType));
    }

    // Test getCharsetFromContentType with mixed case charset
    @Test
    public void testGetCharsetFromContentTypeMixedCase() {
        String contentType = "text/html; charset=utf-8";
        Assert.assertEquals("UTF-8", DataUtil.getCharsetFromContentType(contentType));
    }

    // Test getCharsetFromContentType with no charset
    @Test
    public void testGetCharsetFromContentTypeNoCharset() {
        String contentType = "text/html";
        Assert.assertNull(DataUtil.getCharsetFromContentType(contentType));
    }

    // Test getCharsetFromContentType with unsupported charset
    @Test
    public void testGetCharsetFromContentTypeUnsupported() {
        String contentType = "text/html; charset=unknown-encoding";
        Assert.assertNull(DataUtil.getCharsetFromContentType(contentType));
    }

    // Test getCharsetFromContentType with quotes
    @Test
    public void testGetCharsetFromContentTypeWithQuotes() {
        String contentType = "text/html; charset=\"ISO-8859-1\"";
        Assert.assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType(contentType));
    }

    // Test load(InputStream) with null charsetName
    @Test
    public void testLoadWithNullCharset() throws IOException {
        String html = "<html><head><meta charset=\"UTF-8\"></head><body>test</body></html>";
        inputStream = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.load(inputStream, null, "http://example.com");
        Assert.assertNotNull(doc);
        Assert.assertEquals("test", doc.body().text());
    }

    // Test load(InputStream) with no meta charset
    @Test
    public void testLoadWithNoMetaCharset() throws IOException {
        String html = "<html><body>test</body></html>";
        inputStream = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.load(inputStream, null, "http://example.com");
        Assert.assertNotNull(doc);
        Assert.assertEquals("test", doc.body().text());
    }

    // Test load(InputStream) with explicit charset
    @Test
    public void testLoadWithExplicitCharset() throws IOException {
        String html = "<html><body>test</body></html>";
        inputStream = new ByteArrayInputStream(html.getBytes(StandardCharsets.ISO_8859_1));
        Document doc = DataUtil.load(inputStream, "ISO-8859-1", "http://example.com");
        Assert.assertNotNull(doc);
        Assert.assertEquals("test", doc.body().text());
    }

    // Test load(InputStream) with empty charset
    @Test(expected = IllegalArgumentException.class)
    public void testLoadWithEmptyCharset() throws IOException {
        String html = "<html><body>test</body></html>";
        inputStream = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8));
        DataUtil.load(inputStream, "", "http://example.com");
    }

    // Test load(InputStream) with parser argument
    @Test
    public void testLoadWithParser() throws IOException {
        String html = "<html><body>test</body></html>";
        inputStream = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.load(inputStream, "UTF-8", "http://example.com", Parser.xmlParser());
        Assert.assertNotNull(doc);
        Assert.assertTrue(doc.outputSettings().syntax().toString().equals("xml") || doc.outputSettings().syntax().toString().equals("html"));
    }

    // Test load(File) with valid file
    @Test
    public void testLoadFile() throws IOException {
        File tempFile = File.createTempFile("test", ".html");
        try (FileWriter writer = new FileWriter(tempFile)) {
            writer.write("<html><body>file test</body></html>");
        }
        Document doc = DataUtil.load(tempFile, "UTF-8", "http://example.com");
        Assert.assertNotNull(doc);
        Assert.assertEquals("file test", doc.body().text());
        tempFile.delete();
    }

    // Test load(File) with null charset
    @Test
    public void testLoadFileWithNullCharset() throws IOException {
        File tempFile = File.createTempFile("test", ".html");
        try (FileWriter writer = new FileWriter(tempFile)) {
            writer.write("<html><head><meta charset=\"UTF-8\"></head><body>meta file</body></html>");
        }
        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        Assert.assertNotNull(doc);
        Assert.assertEquals("meta file", doc.body().text());
        tempFile.delete();
    }

    // Test load(File) with non-existent file
    @Test(expected = IOException.class)
    public void testLoadNonExistentFile() throws IOException {
        File file = new File("/path/to/nonexistent/file.html");
        DataUtil.load(file, "UTF-8", "http://example.com");
    }

    // Test parseByteData with null charset and meta with http-equiv
    @Test
    public void testParseByteDataWithMetaHttpEquiv() {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"></head><body>test</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(StandardCharsets.ISO_8859_1));
        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        Assert.assertNotNull(doc);
        Assert.assertEquals("test", doc.body().text());
        Assert.assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    // Test parseByteData with BOM
    @Test
    public void testParseByteDataWithBOM() {
        byte[] bom = new byte[]{(byte) 0xEF, (byte) 0xBB, (byte) 0xBF};
        byte[] content = "<html><body>BOM test</body></html>".getBytes(StandardCharsets.UTF_8);
        byte[] all = new byte[bom.length + content.length];
        System.arraycopy(bom, 0, all, 0, bom.length);
        System.arraycopy(content, 0, all, bom.length, content.length);
        ByteBuffer byteData = ByteBuffer.wrap(all);
        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        Assert.assertNotNull(doc);
        Assert.assertEquals("BOM test", doc.body().text());
    }

    // Test parseByteData with explicit charset
    @Test
    public void testParseByteDataWithExplicitCharset() {
        String html = "<html><body>explicit charset</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.parseByteData(byteData, "UTF-8", "http://example.com", Parser.htmlParser());
        Assert.assertNotNull(doc);
        Assert.assertEquals("explicit charset", doc.body().text());
        Assert.assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    // Test parseByteData with meta charset different from default
    @Test
    public void testParseByteDataWithMetaCharsetChange() {
        String html = "<html><head><meta charset=\"ISO-8859-1\"></head><body>latin1</body></html>";
        byte[] content = html.getBytes(StandardCharsets.ISO_8859_1);
        ByteBuffer byteData = ByteBuffer.wrap(content);
        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        Assert.assertNotNull(doc);
        Assert.assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    // Test load with InputStream returning null - edge case
    @Test(expected = NullPointerException.class)
    public void testLoadNullInputStream() throws IOException {
        DataUtil.load((InputStream) null, "UTF-8", "http://example.com");
    }
}