package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

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
    public void getCharsetFromContentType_givenNull_shouldReturnNull() {
        // Arrange & Act
        String charset = DataUtil.getCharsetFromContentType(null);

        // Assert
        Assert.assertNull(charset);
    }

    @Test
    public void getCharsetFromContentType_givenNoCharsetInHeader_shouldReturnNull() {
        // Arrange & Act
        String charset = DataUtil.getCharsetFromContentType("text/html");

        // Assert
        Assert.assertNull(charset);
    }

    @Test
    public void getCharsetFromContentType_givenStandardCharset_shouldReturnExtractedCharset() {
        // Arrange & Act
        String charset = DataUtil.getCharsetFromContentType("text/html; charset=utf-8");

        // Assert
        Assert.assertEquals("utf-8", charset);
    }

    @Test
    public void getCharsetFromContentType_givenQuotedCharset_shouldReturnExtractedCharset() {
        // Arrange & Act
        String charsetDoubleQuote = DataUtil.getCharsetFromContentType("text/html; charset=\"ISO-8859-1\"");
        String charsetSingleQuote = DataUtil.getCharsetFromContentType("text/html; charset='us-ascii'");

        // Assert
        Assert.assertEquals("ISO-8859-1", charsetDoubleQuote);
        Assert.assertEquals("us-ascii", charsetSingleQuote);
    }

    @Test
    public void getCharsetFromContentType_givenEmptyCharsetValue_shouldReturnNull() {
        // Arrange & Act
        String charset = DataUtil.getCharsetFromContentType("text/html; charset=");

        // Assert
        Assert.assertNull(charset);
    }

    @Test
    public void getCharsetFromContentType_givenWhitespaceAroundCharset_shouldTrimAndReturnCharset() {
        // Arrange & Act
        String charset = DataUtil.getCharsetFromContentType("text/html; charset=  UTF-8  ");

        // Assert
        Assert.assertEquals("UTF-8", charset);
    }

    @Test
    public void getCharsetFromContentType_givenUnsupportedCharset_shouldReturnNull() {
        // Arrange & Act
        String charset = DataUtil.getCharsetFromContentType("text/html; charset=UNSUPPORTED-CHARSET-NAME-12345");

        // Assert
        Assert.assertNull(charset);
    }

    @Test
    public void getCharsetFromContentType_givenIllegalCharsetSyntax_shouldReturnNull() {
        // Arrange & Act
        String charset = DataUtil.getCharsetFromContentType("text/html; charset=???$$$###");

        // Assert
        Assert.assertNull(charset);
    }

    @Test
    public void readToByteBuffer_givenNegativeMaxSize_shouldThrowIllegalArgumentException() throws IOException {
        // Arrange
        InputStream in = new ByteArrayInputStream(new byte[]{1, 2, 3});

        // Act & Assert
        try {
            DataUtil.readToByteBuffer(in, -1);
            Assert.fail("Expected IllegalArgumentException for negative maxSize");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("maxSize must be 0 (unlimited) or larger"));
        } finally {
            in.close();
        }
    }

    @Test
    public void readToByteBuffer_givenZeroMaxSize_shouldReadEntireStream() throws IOException {
        // Arrange
        byte[] expected = "Legacy system test string content".getBytes("UTF-8");
        InputStream in = new ByteArrayInputStream(expected);

        // Act
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 0);

        // Assert
        Assert.assertEquals(expected.length, buffer.remaining());
        byte[] actual = new byte[buffer.remaining()];
        buffer.get(actual);
        Assert.assertArrayEquals(expected, actual);
        in.close();
    }

    @Test
    public void readToByteBuffer_givenConvenienceOverload_shouldReadEntireStream() throws IOException {
        // Arrange
        byte[] expected = "Default unlimited read test".getBytes("UTF-8");
        InputStream in = new ByteArrayInputStream(expected);

        // Act
        ByteBuffer buffer = DataUtil.readToByteBuffer(in);

        // Assert
        Assert.assertEquals(expected.length, buffer.remaining());
        byte[] actual = new byte[buffer.remaining()];
        buffer.get(actual);
        Assert.assertArrayEquals(expected, actual);
        in.close();
    }

    @Test
    public void readToByteBuffer_givenMaxSizeSmallerThanStream_shouldCapAtMaxSize() throws IOException {
        // Arrange
        byte[] data = "1234567890ABCDEF".getBytes("UTF-8");
        InputStream in = new ByteArrayInputStream(data);

        // Act
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 5);

        // Assert
        Assert.assertEquals(5, buffer.remaining());
        byte[] actual = new byte[5];
        buffer.get(actual);
        Assert.assertEquals("12345", new String(actual, "UTF-8"));
        in.close();
    }

    @Test
    public void readToByteBuffer_givenMaxSizeLargerThanStream_shouldReadAllAvailable() throws IOException {
        // Arrange
        byte[] data = "Short string".getBytes("UTF-8");
        InputStream in = new ByteArrayInputStream(data);

        // Act
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 100);

        // Assert
        Assert.assertEquals(data.length, buffer.remaining());
        byte[] actual = new byte[buffer.remaining()];
        buffer.get(actual);
        Assert.assertArrayEquals(data, actual);
        in.close();
    }

    @Test
    public void readToByteBuffer_givenEmptyStream_shouldReturnEmptyBuffer() throws IOException {
        // Arrange
        InputStream in = new ByteArrayInputStream(new byte[0]);

        // Act
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 10);

        // Assert
        Assert.assertEquals(0, buffer.remaining());
        in.close();
    }

    @Test
    public void parseByteData_givenExplicitCharset_shouldParseUsingSpecifiedCharset() throws IOException {
        // Arrange
        String html = "<html><head><title>Test Title</title></head><body><p>Hello Legacy</p></body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes("ISO-8859-1"));

        // Act
        Document doc = DataUtil.parseByteData(buffer, "ISO-8859-1", "http://example.com", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("Test Title", doc.title());
        Assert.assertEquals("http://example.com", doc.baseUri());
        Assert.assertEquals(Charset.forName("ISO-8859-1"), doc.outputSettings().charset());
    }

    @Test
    public void parseByteData_givenEmptyCharsetName_shouldThrowIllegalArgumentException() {
        // Arrange
        ByteBuffer buffer = ByteBuffer.wrap(new byte[0]);

        // Act & Assert
        try {
            DataUtil.parseByteData(buffer, "", "http://example.com", Parser.htmlParser());
            Assert.fail("Expected IllegalArgumentException when charset is empty string");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Must set charset arg"));
        }
    }

    @Test
    public void parseByteData_givenNullCharsetWithoutMeta_shouldFallbackToUtf8() throws IOException {
        // Arrange
        String html = "<html><head><title>No Meta Charset</title></head><body><p>Sample</p></body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes("UTF-8"));

        // Act
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("No Meta Charset", doc.title());
        Assert.assertEquals(Charset.forName("UTF-8"), doc.outputSettings().charset());
    }

    @Test
    public void parseByteData_givenNullCharsetWithMetaHttpEquiv_shouldDetectAndReDecode() throws IOException {
        // Arrange
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"><title>Iso Meta</title></head><body></body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes("ISO-8859-1"));

        // Act
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("Iso Meta", doc.title());
        Assert.assertEquals(Charset.forName("ISO-8859-1"), doc.outputSettings().charset());
    }

    @Test
    public void parseByteData_givenNullCharsetWithHtml5MetaCharset_shouldDetectAndReDecode() throws IOException {
        // Arrange
        String html = "<html><head><meta charset=\"US-ASCII\"><title>Html5 Meta</title></head><body></body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes("US-ASCII"));

        // Act
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("Html5 Meta", doc.title());
        Assert.assertEquals(Charset.forName("US-ASCII"), doc.outputSettings().charset());
    }

    @Test
    public void parseByteData_givenNullCharsetWithMetaUtf8_shouldNotReDecode() throws IOException {
        // Arrange
        String html = "<html><head><meta charset=\"UTF-8\"><title>Explicit UTF-8</title></head><body></body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes("UTF-8"));

        // Act
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("Explicit UTF-8", doc.title());
        Assert.assertEquals(Charset.forName("UTF-8"), doc.outputSettings().charset());
    }

    @Test
    public void parseByteData_givenNullCharsetWithInvalidHttpEquivAndFallbackMetaCharset_shouldUseCharsetAttr() throws IOException {
        // Arrange
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"invalid-content\" charset=\"ISO-8859-1\"><title>Fallback Charset</title></head><body></body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes("ISO-8859-1"));

        // Act
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("Fallback Charset", doc.title());
        Assert.assertEquals(Charset.forName("ISO-8859-1"), doc.outputSettings().charset());
    }

    @Test
    public void parseByteData_givenNullCharsetWithIllegalCharsetNameInMeta_shouldKeepDefaultUtf8() throws IOException {
        // Arrange
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=??$$\"><title>Illegal Meta</title></head><body></body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes("UTF-8"));

        // Act
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("Illegal Meta", doc.title());
        Assert.assertEquals(Charset.forName("UTF-8"), doc.outputSettings().charset());
    }

    @Test
    public void parseByteData_givenUtf8BomIndicator_shouldStripBomAndDecodeAsUtf8() throws IOException {
        // Arrange
        byte[] bom = new byte[]{(byte) 0xEF, (byte) 0xBB, (byte) 0xBF};
        byte[] body = "<html><head><title>BOM Title</title></head><body><p>BOM Body</p></body></html>".getBytes("UTF-8");
        byte[] combined = new byte[bom.length + body.length];
        System.arraycopy(bom, 0, combined, 0, bom.length);
        System.arraycopy(body, 0, combined, bom.length, body.length);
        ByteBuffer buffer = ByteBuffer.wrap(combined);

        // Act
        Document doc = DataUtil.parseByteData(buffer, "UTF-8", "http://example.com", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("BOM Title", doc.title());
        Assert.assertEquals(Charset.forName("UTF-8"), doc.outputSettings().charset());
    }

    @Test
    public void load_givenInputStreamAndExplicitCharset_shouldParseDocument() throws IOException {
        // Arrange
        String html = "<html><head><title>Stream Test</title></head><body>Hello Stream</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));

        // Act
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com");

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("Stream Test", doc.title());
        in.close();
    }

    @Test
    public void load_givenInputStreamAndCustomXmlParser_shouldParseWithCustomParser() throws IOException {
        // Arrange
        String xml = "<root><child id=\"1\">Value</child></root>";
        InputStream in = new ByteArrayInputStream(xml.getBytes("UTF-8"));

        // Act
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com", Parser.xmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("Value", doc.select("child").text());
        in.close();
    }

    @Test
    public void load_givenValidFile_shouldReadAndParseCorrectly() throws IOException {
        // Arrange
        File tempFile = File.createTempFile("datautil_test", ".html");
        tempFile.deleteOnExit();

        String html = "<html><head><title>File Test</title></head><body>File Body</body></html>";
        FileOutputStream out = new FileOutputStream(tempFile);
        try {
            out.write(html.getBytes("UTF-8"));
        } finally {
            out.close();
        }

        // Act
        Document doc = DataUtil.load(tempFile, "UTF-8", "http://example.com/file");

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("File Test", doc.title());
        Assert.assertEquals("http://example.com/file", doc.baseUri());
    }

    @Test(expected = IOException.class)
    public void load_givenNonExistentFile_shouldThrowIOException() throws IOException {
        // Arrange
        File nonExistent = new File("non_existent_file_" + System.currentTimeMillis() + ".html");

        // Act
        DataUtil.load(nonExistent, "UTF-8", "http://example.com");

        // Assert - handled by expected = IOException.class
    }
}