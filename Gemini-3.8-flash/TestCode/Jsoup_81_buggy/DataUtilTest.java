package org.jsoup.helper;

import org.jsoup.UncheckedIOException;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

public class DataUtilTest {

    @Test
    public void constructor_givenPrivateConstructor_shouldBeReflectivelyCreatable() throws Exception {
        // Arrange
        Constructor constructor = DataUtil.class.getDeclaredConstructor(new Class[0]);
        constructor.setAccessible(true);

        // Act
        Object instance = constructor.newInstance(new Object[0]);

        // Assert
        Assert.assertNotNull(instance);
        Assert.assertTrue(instance instanceof DataUtil);
    }

    @Test
    public void emptyByteBuffer_givenCall_shouldReturnZeroCapacityBuffer() {
        // Act
        ByteBuffer buffer = DataUtil.emptyByteBuffer();

        // Assert
        Assert.assertNotNull(buffer);
        Assert.assertEquals(0, buffer.capacity());
        Assert.assertEquals(0, buffer.remaining());
    }

    @Test
    public void mimeBoundary_givenCall_shouldReturnValidLengthAndChars() {
        // Act
        String boundary = DataUtil.mimeBoundary();

        // Assert
        Assert.assertNotNull(boundary);
        Assert.assertEquals(DataUtil.boundaryLength, boundary.length());
        Assert.assertTrue(boundary.matches("^[a-zA-Z0-9_-]{32}$"));
    }

    @Test
    public void getCharsetFromContentType_givenNull_shouldReturnNull() {
        // Act
        String charset = DataUtil.getCharsetFromContentType(null);

        // Assert
        Assert.assertNull(charset);
    }

    @Test
    public void getCharsetFromContentType_givenEmpty_shouldReturnNull() {
        // Act
        String charset = DataUtil.getCharsetFromContentType("");

        // Assert
        Assert.assertNull(charset);
    }

    @Test
    public void getCharsetFromContentType_givenNoCharset_shouldReturnNull() {
        // Act
        String charset = DataUtil.getCharsetFromContentType("text/html; boundary=something");

        // Assert
        Assert.assertNull(charset);
    }

    @Test
    public void getCharsetFromContentType_givenUnsupportedCharset_shouldReturnNull() {
        // Act
        String charset = DataUtil.getCharsetFromContentType("text/html; charset=unsupported_charset_xyz");

        // Assert
        Assert.assertNull(charset);
    }

    @Test
    public void getCharsetFromContentType_givenIllegalCharset_shouldReturnNull() {
        // Act
        String charset = DataUtil.getCharsetFromContentType("text/html; charset=???illegal!!!");

        // Assert
        Assert.assertNull(charset);
    }

    @Test
    public void getCharsetFromContentType_givenStandardUtf8_shouldExtractCharset() {
        // Act
        String charset = DataUtil.getCharsetFromContentType("text/html; charset=UTF-8");

        // Assert
        Assert.assertEquals("UTF-8", charset);
    }

    @Test
    public void getCharsetFromContentType_givenLowerCaseUtf8_shouldExtractCharset() {
        // Act
        String charset = DataUtil.getCharsetFromContentType("text/html; charset=utf-8");

        // Assert
        Assert.assertEquals("utf-8", charset);
    }

    @Test
    public void getCharsetFromContentType_givenQuotedCharset_shouldExtractWithoutQuotes() {
        // Act
        String doubleQuoted = DataUtil.getCharsetFromContentType("text/html; charset=\"UTF-8\"; other=param");
        String singleQuoted = DataUtil.getCharsetFromContentType("text/html; charset='UTF-8'");

        // Assert
        Assert.assertEquals("UTF-8", doubleQuoted);
        Assert.assertEquals("UTF-8", singleQuoted);
    }

    @Test
    public void getCharsetFromContentType_givenWhitespaceAroundEquals_shouldExtract() {
        // Act
        String charset = DataUtil.getCharsetFromContentType("text/html; charset = UTF-8");

        // Assert
        Assert.assertEquals("UTF-8", charset);
    }

    @Test
    public void getCharsetFromContentType_givenIso88591_shouldExtract() {
        // Act
        String charset = DataUtil.getCharsetFromContentType("text/html; charset=iso-8859-1");

        // Assert
        Assert.assertEquals("iso-8859-1", charset);
    }

    @Test
    public void crossStreams_givenInput_shouldWriteAllBytesToOutput() throws IOException {
        // Arrange
        byte[] inputData = "Testing crossStreams transfer data".getBytes("UTF-8");
        ByteArrayInputStream in = new ByteArrayInputStream(inputData);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        // Act
        DataUtil.crossStreams(in, out);

        // Assert
        Assert.assertArrayEquals(inputData, out.toByteArray());
    }

    @Test
    public void crossStreams_givenLargeInputExceedingBuffer_shouldWriteCompletely() throws IOException {
        // Arrange
        byte[] inputData = new byte[DataUtil.bufferSize * 2 + 15];
        Arrays.fill(inputData, (byte) 'A');
        ByteArrayInputStream in = new ByteArrayInputStream(inputData);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        // Act
        DataUtil.crossStreams(in, out);

        // Assert
        Assert.assertArrayEquals(inputData, out.toByteArray());
    }

    @Test
    public void readToByteBuffer_givenNegativeMaxSize_shouldThrowIllegalArgumentException() throws IOException {
        // Arrange
        ByteArrayInputStream in = new ByteArrayInputStream("data".getBytes("UTF-8"));

        // Act & Assert
        try {
            DataUtil.readToByteBuffer(in, -1);
            Assert.fail("Expected IllegalArgumentException for negative maxSize");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("maxSize must be 0 (unlimited) or larger"));
        }
    }

    @Test
    public void readToByteBuffer_givenMaxSizeZero_shouldReadAllData() throws IOException {
        // Arrange
        byte[] data = "Hello World unlimited read".getBytes("UTF-8");
        ByteArrayInputStream in = new ByteArrayInputStream(data);

        // Act
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 0);

        // Assert
        byte[] result = new byte[buffer.remaining()];
        buffer.get(result);
        Assert.assertArrayEquals(data, result);
    }

    @Test
    public void readToByteBuffer_givenMaxSizeLimit_shouldReadUpToMaxSize() throws IOException {
        // Arrange
        byte[] data = "0123456789".getBytes("UTF-8");
        ByteArrayInputStream in = new ByteArrayInputStream(data);

        // Act
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 5);

        // Assert
        Assert.assertEquals(5, buffer.remaining());
        byte[] result = new byte[5];
        buffer.get(result);
        Assert.assertArrayEquals("01234".getBytes("UTF-8"), result);
    }

    @Test
    public void readToByteBuffer_givenOneArgMethod_shouldDefaultToUnlimited() throws IOException {
        // Arrange
        byte[] data = "Short payload".getBytes("UTF-8");
        ByteArrayInputStream in = new ByteArrayInputStream(data);

        // Act
        ByteBuffer buffer = DataUtil.readToByteBuffer(in);

        // Assert
        Assert.assertEquals(data.length, buffer.remaining());
        byte[] result = new byte[buffer.remaining()];
        buffer.get(result);
        Assert.assertArrayEquals(data, result);
    }

    @Test
    public void readFileToByteBuffer_givenValidFile_shouldReadExactContent() throws IOException {
        // Arrange
        File tempFile = File.createTempFile("datautil_test", ".tmp");
        tempFile.deleteOnExit();
        byte[] data = "File payload for readFileToByteBuffer test".getBytes("UTF-8");
        FileOutputStream fos = new FileOutputStream(tempFile);
        try {
            fos.write(data);
        } finally {
            fos.close();
        }

        // Act
        ByteBuffer buffer = DataUtil.readFileToByteBuffer(tempFile);

        // Assert
        Assert.assertEquals(data.length, buffer.remaining());
        byte[] result = new byte[buffer.remaining()];
        buffer.get(result);
        Assert.assertArrayEquals(data, result);
    }

    @Test
    public void parseInputStream_givenNullInput_shouldReturnEmptyDocumentWithBaseUri() throws IOException {
        // Act
        Document doc = DataUtil.parseInputStream(null, "UTF-8", "http://example.com/", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("http://example.com/", doc.baseUri());
        Assert.assertEquals("", doc.body().text());
    }

    @Test
    public void parseInputStream_givenEmptyCharset_shouldThrowIllegalArgumentException() throws IOException {
        // Arrange
        ByteArrayInputStream in = new ByteArrayInputStream("<p>Content</p>".getBytes("UTF-8"));

        // Act & Assert
        try {
            DataUtil.parseInputStream(in, "", "http://example.com/", Parser.htmlParser());
            Assert.fail("Expected IllegalArgumentException when charset is empty");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Must set charset arg"));
        }
    }

    @Test
    public void parseInputStream_givenExplicitCharset_shouldParseDocument() throws IOException {
        // Arrange
        String html = "<html><head><title>Test</title></head><body><p>Hello Legacy</p></body></html>";
        ByteArrayInputStream in = new ByteArrayInputStream(html.getBytes("ISO-8859-1"));

        // Act
        Document doc = DataUtil.parseInputStream(in, "ISO-8859-1", "http://example.com/", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("Test", doc.title());
        Assert.assertEquals("Hello Legacy", doc.select("p").first().text());
        Assert.assertEquals(Charset.forName("ISO-8859-1"), doc.outputSettings().charset());
    }

    @Test
    public void parseInputStream_givenUtf8Bom_shouldDetectCharsetAndSkipOffset() throws IOException {
        // Arrange: UTF-8 BOM is 0xEF, 0xBB, 0xBF
        byte[] bom = new byte[]{(byte) 0xEF, (byte) 0xBB, (byte) 0xBF};
        byte[] content = "<html><head><title>BOM Title</title></head><body>BOM Body</body></html>".getBytes("UTF-8");
        byte[] all = new byte[bom.length + content.length];
        System.arraycopy(bom, 0, all, 0, bom.length);
        System.arraycopy(content, 0, all, bom.length, content.length);
        ByteArrayInputStream in = new ByteArrayInputStream(all);

        // Act
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("BOM Title", doc.title());
        Assert.assertEquals(Charset.forName("UTF-8"), doc.outputSettings().charset());
    }

    @Test
    public void parseInputStream_givenUtf16BEBom_shouldDetectCharset() throws IOException {
        // Arrange: UTF-16 BE BOM is 0xFE, 0xFF
        byte[] bom = new byte[]{(byte) 0xFE, (byte) 0xFF};
        byte[] content = "<html><head><title>UTF16 BE</title></head><body>BE Body</body></html>".getBytes("UTF-16BE");
        byte[] all = new byte[bom.length + content.length];
        System.arraycopy(bom, 0, all, 0, bom.length);
        System.arraycopy(content, 0, all, bom.length, content.length);
        ByteArrayInputStream in = new ByteArrayInputStream(all);

        // Act
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("UTF16 BE", doc.title());
        Assert.assertEquals(Charset.forName("UTF-16"), doc.outputSettings().charset());
    }

    @Test
    public void parseInputStream_givenUtf16LEBom_shouldDetectCharset() throws IOException {
        // Arrange: UTF-16 LE BOM is 0xFF, 0xFE
        byte[] bom = new byte[]{(byte) 0xFF, (byte) 0xFE};
        byte[] content = "<html><head><title>UTF16 LE</title></head><body>LE Body</body></html>".getBytes("UTF-16LE");
        byte[] all = new byte[bom.length + content.length];
        System.arraycopy(bom, 0, all, 0, bom.length);
        System.arraycopy(content, 0, all, bom.length, content.length);
        ByteArrayInputStream in = new ByteArrayInputStream(all);

        // Act
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("UTF16 LE", doc.title());
        Assert.assertEquals(Charset.forName("UTF-16"), doc.outputSettings().charset());
    }

    @Test
    public void parseInputStream_givenMetaHttpEquivCharset_shouldDetectAndReDecode() throws IOException {
        // Arrange
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"></head><body><p>\u00E9</p></body></html>";
        byte[] data = html.getBytes("ISO-8859-1");
        ByteArrayInputStream in = new ByteArrayInputStream(data);

        // Act
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("\u00E9", doc.select("p").first().text());
        Assert.assertEquals(Charset.forName("ISO-8859-1"), doc.outputSettings().charset());
    }

    @Test
    public void parseInputStream_givenMetaHtml5Charset_shouldDetectAndReDecode() throws IOException {
        // Arrange
        String html = "<html><head><meta charset=\"ISO-8859-1\"></head><body><p>\u00E9</p></body></html>";
        byte[] data = html.getBytes("ISO-8859-1");
        ByteArrayInputStream in = new ByteArrayInputStream(data);

        // Act
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("\u00E9", doc.select("p").first().text());
        Assert.assertEquals(Charset.forName("ISO-8859-1"), doc.outputSettings().charset());
    }

    @Test
    public void parseInputStream_givenXmlDeclarationEncoding_shouldDetectAndReDecode() throws IOException {
        // Arrange
        String xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><root><item>\u00E9</item></root>";
        byte[] data = xml.getBytes("ISO-8859-1");
        ByteArrayInputStream in = new ByteArrayInputStream(data);

        // Act
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.xmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("\u00E9", doc.select("item").first().text());
        Assert.assertEquals(Charset.forName("ISO-8859-1"), doc.outputSettings().charset());
    }

    @Test
    public void parseInputStream_givenUtf8Meta_shouldKeepInitialDecodedDocument() throws IOException {
        // Arrange
        String html = "<html><head><meta charset=\"UTF-8\"><title>UTF8 Doc</title></head><body>Content</body></html>";
        ByteArrayInputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));

        // Act
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("UTF8 Doc", doc.title());
        Assert.assertEquals(Charset.forName("UTF-8"), doc.outputSettings().charset());
    }

    @Test
    public void parseInputStream_givenLargeDocumentNotFullyRead_shouldReDecodeCompleteStream() throws IOException {
        // Arrange
        StringBuilder sb = new StringBuilder();
        sb.append("<html><head><title>Large Document</title></head><body>");
        for (int i = 0; i < 6000; i++) {
            sb.append("<span>padding-text-").append(i).append("</span> ");
        }
        sb.append("<div id='target'>end-of-doc</div></body></html>");
        byte[] data = sb.toString().getBytes("UTF-8");
        ByteArrayInputStream in = new ByteArrayInputStream(data);

        // Act
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("Large Document", doc.title());
        Assert.assertEquals("end-of-doc", doc.select("#target").first().text());
    }

    @Test
    public void load_givenInputStreamAndCharsetAndBaseUri_shouldParseSuccessfully() throws IOException {
        // Arrange
        String html = "<html><head><title>Stream Load</title></head><body>Stream Body</body></html>";
        ByteArrayInputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));

        // Act
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com/");

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("Stream Load", doc.title());
    }

    @Test
    public void load_givenInputStreamAndParser_shouldParseWithSpecifiedParser() throws IOException {
        // Arrange
        String xml = "<root><child>value</child></root>";
        ByteArrayInputStream in = new ByteArrayInputStream(xml.getBytes("UTF-8"));

        // Act
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com/", Parser.xmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("value", doc.select("child").first().text());
    }

    @Test
    public void load_givenFile_shouldReadAndParseDocument() throws IOException {
        // Arrange
        File tempFile = File.createTempFile("datautil_load_file", ".html");
        tempFile.deleteOnExit();
        String html = "<html><head><title>File Load</title></head><body>From File</body></html>";
        FileOutputStream fos = new FileOutputStream(tempFile);
        try {
            fos.write(html.getBytes("UTF-8"));
        } finally {
            fos.close();
        }

        // Act
        Document doc = DataUtil.load(tempFile, "UTF-8", "http://example.com/");

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("File Load", doc.title());
        Assert.assertEquals("From File", doc.body().text());
    }

    @Test
    public void parseInputStream_givenUncheckedIOExceptionThrownByParser_shouldUnwrapAndThrowIOException() {
        // Arrange
        final IOException expectedCause = new IOException("Underlying stream failure");
        InputStream faultyIn = new InputStream() {
            public int read() throws IOException {
                throw expectedCause;
            }
        };

        // Act & Assert
        try {
            DataUtil.parseInputStream(faultyIn, "UTF-8", "http://example.com/", Parser.htmlParser());
            Assert.fail("Expected IOException to be thrown");
        } catch (IOException e) {
            Assert.assertEquals(expectedCause, e);
        }
    }
}