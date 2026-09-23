package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Locale;

import static org.junit.Assert.*;

public class DataUtilTest {

    private static final String SAMPLE_HTML = "<html><head></head><body><p>Test</p></body></html>";

    @Before
    public void setUp() {
        // Setup if needed
    }

    @After
    public void tearDown() {
        // Cleanup if needed
    }

    @Test
    public void testLoadFromFile() throws IOException {
        File tempFile = File.createTempFile("test", ".html");
        try (FileOutputStream fos = new FileOutputStream(tempFile)) {
            fos.write(SAMPLE_HTML.getBytes(Charset.forName("UTF-8")));
        }
        Document doc = DataUtil.load(tempFile, "UTF-8", "");
        assertNotNull(doc);
        assertEquals("Test", doc.select("p").first().text());
        tempFile.delete();
    }

    @Test
    public void testLoadFromInputStream() throws IOException {
        InputStream in = new ByteArrayInputStream(SAMPLE_HTML.getBytes(Charset.forName("UTF-8")));
        Document doc = DataUtil.load(in, "UTF-8", "");
        assertNotNull(doc);
        assertEquals("Test", doc.select("p").first().text());
    }

    @Test
    public void testLoadFromInputStreamWithParser() throws IOException {
        InputStream in = new ByteArrayInputStream(SAMPLE_HTML.getBytes(Charset.forName("UTF-8")));
        Document doc = DataUtil.load(in, "UTF-8", "", Parser.xmlParser());
        assertNotNull(doc);
        // XML parser might produce different output
    }

    @Test
    public void testCrossStreams() throws IOException {
        String testData = "Test content for cross stream";
        InputStream in = new ByteArrayInputStream(testData.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DataUtil.crossStreams(in, out);
        assertEquals(testData, out.toString("UTF-8"));
        assertFalse(in.available() > 0); // Ensure stream is fully read
        in.close();
        out.close();
    }

    @Test
    public void testCrossStreamsWithLargeData() throws IOException {
        // Create data larger than bufferSize (0x20000 = 131072)
        int largeSize = 150000; // Slightly larger than buffer
        byte[] largeData = new byte[largeSize];
        new Random().nextBytes(largeData);
        
        InputStream in = new ByteArrayInputStream(largeData);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DataUtil.crossStreams(in, out);
        
        assertArrayEquals(largeData, out.toByteArray());
        in.close();
        out.close();
    }

    @Test
    public void testParseByteDataWithNullCharset() {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"></head><body></body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes());
        Document doc = DataUtil.parseByteData(byteData, null, "", Parser.htmlParser());
        assertNotNull(doc);
    }

    @Test
    public void testParseByteDataWithExplicitCharset() {
        String html = "<html><body>Hello</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes());
        Document doc = DataUtil.parseByteData(byteData, "UTF-8", "", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("Hello", doc.body().text());
    }

    @Test
    public void testParseByteDataWithBOM() {
        // BOM character (U+FEFF) followed by HTML
        String html = "\ufeff<html><body>Test</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes());
        Document doc = DataUtil.parseByteData(byteData, null, "", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("Test", doc.body().text());
    }

    @Test
    public void testParseByteDataWithNoBOM() {
        String html = "<html><body>Test</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes());
        Document doc = DataUtil.parseByteData(byteData, null, "", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("Test", doc.body().text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseByteDataWithEmptyCharset() {
        String html = "<html><body>Test</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes());
        DataUtil.parseByteData(byteData, "", "", Parser.htmlParser());
    }

    @Test(expected = NullPointerException.class)
    public void testParseByteDataWithNullCharsetAndNullByteData() {
        DataUtil.parseByteData(null, null, "", Parser.htmlParser());
    }

    @Test
    public void testReadToByteBufferUnlimited() throws IOException {
        String testData = "This is a test string";
        InputStream in = new ByteArrayInputStream(testData.getBytes());
        ByteBuffer result = DataUtil.readToByteBuffer(in, 0);
        assertEquals(testData, new String(result.array(), result.arrayOffset() + result.position(), result.remaining()));
        in.close();
    }

    @Test
    public void testReadToByteBufferLimited() throws IOException {
        String testData = "This is a test string";
        InputStream in = new ByteArrayInputStream(testData.getBytes());
        ByteBuffer result = DataUtil.readToByteBuffer(in, 10);
        assertEquals(10, result.remaining());
        in.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadToByteBufferNegativeMaxSize() throws IOException {
        InputStream in = new ByteArrayInputStream("test".getBytes());
        ByteBuffer result = DataUtil.readToByteBuffer(in, -1);
    }

    @Test
    public void testReadToByteBufferEmpty() throws IOException {
        ByteBuffer result = DataUtil.readToByteBuffer(new ByteArrayInputStream(new byte[0]), 0);
        assertEquals(0, result.remaining());
    }

    @Test
    public void testReadFileToByteBuffer() throws IOException {
        File tempFile = File.createTempFile("test", ".txt");
        try (FileOutputStream fos = new FileOutputStream(tempFile)) {
            fos.write("File content".getBytes());
        }
        ByteBuffer buffer = DataUtil.readFileToByteBuffer(tempFile);
        assertEquals("File content", new String(buffer.array(), buffer.arrayOffset() + buffer.position(), buffer.remaining()));
        tempFile.delete();
    }

    @Test
    public void testReadFileToByteBufferNonExistent() {
        File nonExistent = new File("/nonexistent/path/to/file.txt");
        try {
            ByteBuffer buffer = DataUtil.readFileToByteBuffer(nonExistent);
            fail("Expected IOException");
        } catch (IOException e) {
            // Expected
        }
    }

    @Test
    public void testEmptyByteBuffer() {
        ByteBuffer empty = DataUtil.emptyByteBuffer();
        assertNotNull(empty);
        assertEquals(0, empty.remaining());
    }

    @Test
    public void testGetCharsetFromContentType() {
        String contentType = "text/html; charset=UTF-8";
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType(contentType));
    }

    @Test
    public void testGetCharsetFromContentTypeWithSingleQuotes() {
        String contentType = "text/html; charset='ISO-8859-1'";
        assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType(contentType));
    }

    @Test
    public void testGetCharsetFromContentTypeWithDoubleQuotes() {
        String contentType = "text/html; charset=\"GB2312\"";
        assertEquals("GB2312", DataUtil.getCharsetFromContentType(contentType));
    }

    @Test
    public void testGetCharsetFromContentTypeEmptyCharset() {
        String contentType = "text/html; charset=";
        assertNull(DataUtil.getCharsetFromContentType(contentType));
    }

    @Test
    public void testGetCharsetFromContentTypeNoMatch() {
        String contentType = "text/html";
        assertNull(DataUtil.getCharsetFromContentType(contentType));
    }

    @Test
    public void testGetCharsetFromContentTypeNull() {
        assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void testGetCharsetFromContentTypeUnsupportedCharset() {
        String contentType = "text/html; charset=unsupported-charset-xyz";
        assertNull(DataUtil.getCharsetFromContentType(contentType));
    }

    @Test
    public void testGetCharsetFromContentTypeInvalidCharset() {
        String contentType = "text/html; charset=" + "invalid-charset-!@#$%^&*";
        assertNull(DataUtil.getCharsetFromContentType(contentType));
    }

    @Test
    public void testMimeBoundary() {
        String boundary = DataUtil.mimeBoundary();
        assertNotNull(boundary);
        assertEquals(32, boundary.length()); // boundaryLength constant
        assertFalse(boundary.contains(" "));
    }

    @Test
    public void testMimeBoundaryRandomness() {
        String boundary1 = DataUtil.mimeBoundary();
        String boundary2 = DataUtil.mimeBoundary();
        // Extremely unlikely to be the same, but test for it
        assertNotEquals(boundary1, boundary2);
    }

    @Test
    public void testMimeBoundaryContent() {
        String boundary = DataUtil.mimeBoundary();
        // Boundary characters should only be from the defined character set
        String validChars = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < boundary.length(); i++) {
            assertTrue("Character should be valid mime boundary char: " + boundary.charAt(i),
                    validChars.indexOf(boundary.charAt(i)) != -1);
        }
    }

    @Test
    public void testParseByteDataWithMetaCharsetDetection() {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">" +
                "</head><body></body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes());
        Document doc = DataUtil.parseByteData(byteData, null, "", Parser.htmlParser());
        assertNotNull(doc);
    }

    @Test
    public void testParseByteDataWithMetaCharsetDetectionUTF16() throws IOException {
        String html = "<html><head><meta charset=\"UTF-16\"></head><body>Test</body></html>";
        Charset charset = Charset.forName("UTF-16");
        ByteBuffer byteData = charset.encode(html);
        Document doc = DataUtil.parseByteData(byteData, null, "", Parser.htmlParser());
        assertNotNull(doc);
    }

    @Test
    public void testParseByteDataWithBOMAndExplicitCharset() {
        String html = "\ufeff<html><body>Test</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes());
        Document doc = DataUtil.parseByteData(byteData, "UTF-8", "", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("Test", doc.body().text());
    }

    @Test
    public void testParseByteDataWithInvalidCharsetName() {
        String html = "<html><head><meta charset=\"" + "InvalidCharsetWithSpecialChars!@" + "\"></head><body></body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes());
        Document doc = DataUtil.parseByteData(byteData, null, "", Parser.htmlParser());
        assertNotNull(doc);
    }

    @Test
    public void testParseByteDataNoMetaFound() {
        String html = "<html><body>No meta</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes());
        Document doc = DataUtil.parseByteData(byteData, null, "", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("No meta", doc.body().text());
    }

    @Test
    public void testLoadFileWithSpacesAndSpecialChars() throws IOException {
        File tempFile = File.createTempFile("file with spaces & special", ".html");
        try (FileOutputStream fos = new FileOutputStream(tempFile)) {
            fos.write(SAMPLE_HTML.getBytes(Charset.forName("UTF-8")));
        }
        Document doc = DataUtil.load(tempFile, "UTF-8", "");
        assertNotNull(doc);
        assertEquals("Test", doc.select("p").first().text());
        tempFile.delete();
    }

    @Test
    public void testLoadEmptyFile() throws IOException {
        File tempFile = File.createTempFile("empty", ".html");
        Document doc = DataUtil.load(tempFile, "UTF-8", "");
        assertNotNull(doc);
        tempFile.delete();
    }

    @Test
    public void testLoadNonExistentFile() {
        File nonExistent = new File("/nonexistent/path/to/file.html");
        try {
            DataUtil.load(nonExistent, "UTF-8", "");
            fail("Expected IOException");
        } catch (IOException e) {
            // Expected
        }
    }
}