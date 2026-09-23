package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.StandardCharsets;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DataUtilTest {

    private static final String HTML_SAMPLE = "<html><head><meta charset=\"UTF-8\"></head><body>Hello</body></html>";

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testLoadFileWithCharset() throws IOException {
        File file = File.createTempFile("test", ".html");
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(HTML_SAMPLE.getBytes(StandardCharsets.UTF_8));
        }
        Document doc = DataUtil.load(file, "UTF-8", "http://example.com");
        assertNotNull(doc);
        assertEquals("Hello", doc.body().text());
        file.delete();
    }

    @Test
    public void testLoadInputStreamWithCharset() throws IOException {
        try (InputStream in = new ByteArrayInputStream(HTML_SAMPLE.getBytes(StandardCharsets.UTF_8))) {
            Document doc = DataUtil.load(in, "UTF-8", "http://example.com");
            assertNotNull(doc);
            assertEquals("Hello", doc.body().text());
        }
    }

    @Test
    public void testLoadInputStreamWithParser() throws IOException {
        try (InputStream in = new ByteArrayInputStream(HTML_SAMPLE.getBytes(StandardCharsets.UTF_8))) {
            Document doc = DataUtil.load(in, "UTF-8", "http://example.com", Parser.htmlParser());
            assertNotNull(doc);
            assertEquals("Hello", doc.body().text());
        }
    }

    @Test
    public void testLoadNullInputStream() throws IOException {
        Document doc = DataUtil.load((InputStream) null, "UTF-8", "http://example.com");
        assertNotNull(doc);
    }

    @Test
    public void testCrossStreams() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream("test data".getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DataUtil.crossStreams(in, out);
        assertEquals("test data", out.toString("UTF-8"));
    }

    @Test
    public void testCrossStreamsEmptyInput() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[0]);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DataUtil.crossStreams(in, out);
        assertEquals(0, out.size());
    }

    @Test
    public void testParseInputStreamWithNullInput() throws IOException {
        Document doc = DataUtil.parseInputStream(null, "UTF-8", "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
    }

    @Test
    public void testParseInputStreamWithoutCharset() throws IOException {
        String test = "<html><head><meta charset=\"UTF-8\"></head><body>Hello</body></html>";
        try (InputStream in = new ByteArrayInputStream(test.getBytes(StandardCharsets.UTF_8))) {
            Document doc = DataUtil.parseInputStream(in, null, "http://example.com", Parser.htmlParser());
            assertNotNull(doc);
            assertEquals("UTF-8", doc.outputSettings().charset().name());
        }
    }

    @Test
    public void testReadToByteBufferWithMaxSize() throws IOException {
        byte[] data = "hello world".getBytes(StandardCharsets.UTF_8);
        try (InputStream in = new ByteArrayInputStream(data)) {
            ByteBuffer buf = DataUtil.readToByteBuffer(in, data.length - 1);
            assertEquals(data.length - 1, buf.remaining());
            assertEquals("hello worl", new String(buf.array(), 0, buf.remaining()));
        }
    }

    @Test
    public void testReadToByteBufferUnlimited() throws IOException {
        byte[] data = "hello".getBytes(StandardCharsets.UTF_8);
        try (InputStream in = new ByteArrayInputStream(data)) {
            ByteBuffer buf = DataUtil.readToByteBuffer(in);
            assertEquals(5, buf.remaining());
        }
    }

    @Test
    public void testReadToByteBufferZeroMaxSize() throws IOException {
        byte[] data = "hello".getBytes(StandardCharsets.UTF_8);
        try (InputStream in = new ByteArrayInputStream(data)) {
            ByteBuffer buf = DataUtil.readToByteBuffer(in, 0);
            assertEquals(5, buf.remaining());
        }
    }

    @Test(expected = IOException.class)
    public void testReadToByteBufferInvalidMaxSize() throws IOException {
        try (InputStream in = new ByteArrayInputStream(new byte[1])) {
            DataUtil.readToByteBuffer(in, -1);
        }
    }

    @Test
    public void testReadFileToByteBuffer() throws IOException {
        File file = File.createTempFile("data", ".bin");
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(new byte[] { 1, 2, 3, 4 });
        }
        ByteBuffer buf = DataUtil.readFileToByteBuffer(file);
        assertEquals(4, buf.remaining());
        file.delete();
    }

    @Test
    public void testEmptyByteBuffer() {
        ByteBuffer buf = DataUtil.emptyByteBuffer();
        assertNotNull(buf);
        assertEquals(0, buf.remaining());
    }

    @Test
    public void testGetCharsetFromContentTypeWithValidCharset() {
        assertEquals("EUC-JP", DataUtil.getCharsetFromContentType("text/html; charset=EUC-JP"));
    }

    @Test
    public void testGetCharsetFromContentTypeWithCaseInsensitive() {
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=utf-8"));
    }

    @Test
    public void testGetCharsetFromContentTypeWithQuotes() {
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=\"UTF-8\""));
    }

    @Test
    public void testGetCharsetFromContentTypeNull() {
        assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void testGetCharsetFromContentTypeNoMatch() {
        assertNull(DataUtil.getCharsetFromContentType("text/html"));
    }

    @Test
    public void testGetCharsetFromContentTypeEmpty() {
        assertNull(DataUtil.getCharsetFromContentType(""));
    }

    @Test
    public void testGetCharsetFromContentTypeSupportedAfterUpperCase() {
        assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType("text/html; charset=iso-8859-1"));
    }

    @Test
    public void testMimeBoundaryLength() {
        String boundary = DataUtil.mimeBoundary();
        assertEquals(32, boundary.length());
    }

    @Test
    public void testMimeBoundaryContent() {
        String boundary = DataUtil.mimeBoundary();
        for (char c : boundary.toCharArray()) {
            assertTrue(c == '-' || c == '_' || (c >= '0' && c <= '9') ||
                (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'));
        }
    }

    @Test
    public void testReadToByteBufferTempFile() throws IOException {
        String tempDir = System.getProperty("java.io.tmpdir");
        File path = new File(tempDir + "/test_data.csv");
        try (OutputStream os = new FileOutputStream(path)) {
            os.write("data".getBytes());
        }
        assertEquals("data", new String(((ByteBuffer) DataUtil.readFileToByteBuffer(path).rewind()).array(), "UTF-8"));
    }

}