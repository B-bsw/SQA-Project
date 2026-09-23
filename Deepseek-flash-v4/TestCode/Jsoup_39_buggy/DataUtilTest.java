package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static org.junit.Assert.*;

public class DataUtilTest {
    private static final String SAMPLE_HTML = "<html><head><title>Test</title></head><body><p>Hello</p></body></html>";

    @Before
    public void setUp() throws Exception {
        // Setup if needed
    }

    @After
    public void tearDown() throws Exception {
        // Teardown if needed
    }

    @Test
    public void testGetCharsetFromContentType_Null() {
        assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void testGetCharsetFromContentType_Empty() {
        assertNull(DataUtil.getCharsetFromContentType(""));
    }

    @Test
    public void testGetCharsetFromContentType_NoMatch() {
        assertNull(DataUtil.getCharsetFromContentType("text/html"));
    }

    @Test
    public void testGetCharsetFromContentType_SupportedCharset() {
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=UTF-8"));
    }

    @Test
    public void testGetCharsetFromContentType_UnsupportedCharset() {
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset=UNSUPPORTED-CHARSET"));
    }

    @Test
    public void testGetCharsetFromContentType_CaseInsensitive() {
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; Charset=utf-8"));
    }

    @Test
    public void testGetCharsetFromContentType_WithWhitespace() {
        assertEquals("EUC-JP", DataUtil.getCharsetFromContentType("text/html; charset= EUC-JP "));
    }

    @Test
    public void testGetCharsetFromContentType_WithQuotes() {
        assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType("text/html; charset=\"ISO-8859-1\""));
    }

    @Test
    public void testGetCharsetFromContentType_CharsetParameterInMiddle() {
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=UTF-8; boundary=xyz"));
    }

    @Test
    public void testGetCharsetFromContentType_IllegalCharsetName() {
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset=Invalid@Charset!"));
    }

    @Test
    public void testLoadFromInputStream_ValidHtml() throws IOException {
        try (InputStream in = new ByteArrayInputStream(SAMPLE_HTML.getBytes(StandardCharsets.UTF_8))) {
            Document doc = DataUtil.load(in, "UTF-8", "http://example.com/");
            assertNotNull(doc);
            assertEquals("Test", doc.title());
        }
    }

    @Test
    public void testLoadFromInputStream_NullCharset_NoMeta() throws IOException {
        String html = "<html><body>Hello</body></html>";
        try (InputStream in = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8))) {
            Document doc = DataUtil.load(in, null, "http://example.com/");
            assertNotNull(doc);
            assertEquals("Hello", doc.body().text());
        }
    }

    @Test
    public void testLoadFromInputStream_NullCharset_MetaCharset() throws IOException {
        String html = "<html><head><meta charset=\"ISO-8859-1\"></head><body><p>Hello</p></body></html>";
        try (InputStream in = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8))) {
            Document doc = DataUtil.load(in, null, "http://example.com/");
            assertNotNull(doc);
        }
    }

    @Test
    public void testLoadFromInputStream_NullCharset_MetaHttpEquiv() throws IOException {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"></head><body><p>Hello</p></body></html>";
        try (InputStream in = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8))) {
            Document doc = DataUtil.load(in, null, "http://example.com/");
            assertNotNull(doc);
        }
    }

    @Test
    public void testLoadFromInputStream_EmptyCharsetName() throws IOException {
        try (InputStream in = new ByteArrayInputStream(SAMPLE_HTML.getBytes(StandardCharsets.UTF_8))) {
            try {
                DataUtil.load(in, "", "http://example.com/");
                fail("Expected IllegalArgumentException");
            } catch (IllegalArgumentException e) {
                // expected
            }
        }
    }

    @Test
    public void testLoadFromInputStream_WithParser() throws IOException {
        try (InputStream in = new ByteArrayInputStream(SAMPLE_HTML.getBytes(StandardCharsets.UTF_8))) {
            Document doc = DataUtil.load(in, "UTF-8", "http://example.com/", Parser.xmlParser());
            assertNotNull(doc);
        }
    }

    @Test
    public void testReadToByteBuffer_EmptyStream() throws IOException {
        try (InputStream in = new ByteArrayInputStream(new byte[0])) {
            ByteBuffer buffer = DataUtil.readToByteBuffer(in);
            assertNotNull(buffer);
            assertEquals(0, buffer.remaining());
        }
    }

    @Test
    public void testReadToByteBuffer_WithContent() throws IOException {
        byte[] data = "Hello World".getBytes(StandardCharsets.UTF_8);
        try (InputStream in = new ByteArrayInputStream(data)) {
            ByteBuffer buffer = DataUtil.readToByteBuffer(in);
            assertNotNull(buffer);
            assertEquals(data.length, buffer.remaining());
            byte[] result = new byte[data.length];
            buffer.get(result);
            assertArrayEquals(data, result);
        }
    }

    @Test
    public void testReadToByteBuffer_MaxSizeZero() throws IOException {
        byte[] data = "Hello World".getBytes(StandardCharsets.UTF_8);
        try (InputStream in = new ByteArrayInputStream(data)) {
            ByteBuffer buffer = DataUtil.readToByteBuffer(in, 0);
            assertNotNull(buffer);
            assertEquals(data.length, buffer.remaining());
        }
    }

    @Test
    public void testReadToByteBuffer_MaxSizeLarger() throws IOException {
        byte[] data = "Hello".getBytes(StandardCharsets.UTF_8);
        try (InputStream in = new ByteArrayInputStream(data)) {
            ByteBuffer buffer = DataUtil.readToByteBuffer(in, 100);
            assertNotNull(buffer);
            assertEquals(data.length, buffer.remaining());
        }
    }

    @Test
    public void testReadToByteBuffer_MaxSizeSmaller() throws IOException {
        byte[] data = "Hello World".getBytes(StandardCharsets.UTF_8);
        try (InputStream in = new ByteArrayInputStream(data)) {
            ByteBuffer buffer = DataUtil.readToByteBuffer(in, 5);
            assertNotNull(buffer);
            assertEquals(5, buffer.remaining());
        }
    }

    @Test
    public void testReadToByteBuffer_NegativeMaxSize() throws IOException {
        try (InputStream in = new ByteArrayInputStream(new byte[10])) {
            try {
                DataUtil.readToByteBuffer(in, -1);
                fail("Expected IllegalArgumentException");
            } catch (IllegalArgumentException e) {
                // expected
            }
        }
    }

    @Test
    public void testLoadFromFile_NonExistentFile() {
        try {
            DataUtil.load(new java.io.File("/nonexistent/file.html"), "UTF-8", "http://example.com/");
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testParseByteData_BOMHandling() {
        String html = "\uFEFF<html><body>BOM</body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.parseByteData(buffer, "UTF-8", "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("BOM", doc.body().text());
    }

    @Test
    public void testParseByteData_DefaultCharsetEncoding() {
        String html = "<html><body>Test</body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.parseByteData(buffer, "UTF-8", "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("Test", doc.body().text());
    }

    @Test
    public void testParseByteData_NullCharsetWithMetaHttpEquiv() {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"></head><body>Test</body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("Test", doc.body().text());
    }

    @Test
    public void testParseByteData_InvalidCharsetInMeta() {
        String html = "<html><head><meta charset=\"invalid-charset-name\"></head><body>Test</body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
    }

    @Test
    public void testGetCharsetFromContentType_NoEqualSign() {
        assertNull(DataUtil.getCharsetFromContentType("charset"));
    }

    @Test
    public void testGetCharsetFromContentType_MultipleCharsets() {
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=UTF-8; charset=ISO-8859-1"));
    }

    @Test
    public void testReadToByteBuffer_ForContentTypeWithSpaces() {
        String contentType = "text/html; charset = UTF-8";
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType(contentType));
    }
}