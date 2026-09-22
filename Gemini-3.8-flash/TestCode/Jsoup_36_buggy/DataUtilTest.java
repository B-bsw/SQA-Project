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
    public void constructor_privateInstantiation_shouldSucceedViaReflection() throws Exception {
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
    public void load_givenValidFileAndUtf8_shouldParseDocumentCorrectly() throws IOException {
        // Arrange
        File tempFile = File.createTempFile("datautil-test", ".html");
        tempFile.deleteOnExit();
        FileOutputStream fos = new FileOutputStream(tempFile);
        try {
            fos.write("<html><body><p>Hello Legacy</p></body></html>".getBytes("UTF-8"));
        } finally {
            fos.close();
        }

        // Act
        Document doc = DataUtil.load(tempFile, "UTF-8", "http://example.com");

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("Hello Legacy", doc.select("p").first().text());
        Assert.assertEquals("http://example.com", doc.baseUri());
        tempFile.delete();
    }

    @Test(expected = IOException.class)
    public void load_givenNonExistentFile_shouldThrowIOException() throws IOException {
        // Arrange
        File nonExistent = new File("non_existent_file_jsoup_test.html");

        // Act
        DataUtil.load(nonExistent, "UTF-8", "http://example.com");
    }

    @Test
    public void load_givenInputStream_shouldParseUsingHtmlParser() throws IOException {
        // Arrange
        String html = "<div><span id='test'>Content</span></div>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));

        // Act
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com");

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("Content", doc.getElementById("test").text());
    }

    @Test
    public void load_givenInputStreamAndCustomXmlParser_shouldParseUsingSpecifiedParser() throws IOException {
        // Arrange
        String xml = "<root><child id='1'>Text</child></root>";
        InputStream in = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        Parser xmlParser = Parser.xmlParser();

        // Act
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com", xmlParser);

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("Text", doc.select("child").first().text());
    }

    @Test
    public void parseByteData_givenExplicitCharset_shouldParseSuccessfully() {
        // Arrange
        String html = "<html><body><p>Explicit ISO</p></body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(Charset.forName("ISO-8859-1")));

        // Act
        Document doc = DataUtil.parseByteData(buffer, "ISO-8859-1", "http://example.com", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("Explicit ISO", doc.select("p").first().text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseByteData_givenEmptyCharset_shouldThrowIllegalArgumentException() {
        // Arrange
        ByteBuffer buffer = ByteBuffer.wrap("<html></html>".getBytes());

        // Act
        DataUtil.parseByteData(buffer, "", "http://example.com", Parser.htmlParser());
    }

    @Test
    public void parseByteData_givenNullCharsetWithoutMeta_shouldDefaultToUtf8() {
        // Arrange
        String html = "<html><body><span>No Meta</span></body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(Charset.forName("UTF-8")));

        // Act
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("No Meta", doc.select("span").first().text());
        Assert.assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test
    public void parseByteData_givenMetaHttpEquivIso88591_shouldReDecodeWithFoundCharset() {
        // Arrange
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"></head><body>Re-Decode</body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(Charset.forName("ISO-8859-1")));

        // Act
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
        Assert.assertEquals("Re-Decode", doc.body().text());
    }

    @Test
    public void parseByteData_givenMetaCharsetHtml5Iso88591_shouldReDecodeWithFoundCharset() {
        // Arrange
        String html = "<html><head><meta charset=\"ISO-8859-1\"></head><body>HTML5 Meta</body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(Charset.forName("ISO-8859-1")));

        // Act
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
        Assert.assertEquals("HTML5 Meta", doc.body().text());
    }

    @Test
    public void parseByteData_givenMetaCharsetMatchingDefaultUtf8_shouldNotReDecode() {
        // Arrange
        String html = "<html><head><meta charset=\"UTF-8\"></head><body>Same Charset</body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(Charset.forName("UTF-8")));

        // Act
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("UTF-8", doc.outputSettings().charset().name());
        Assert.assertEquals("Same Charset", doc.body().text());
    }

    @Test
    public void parseByteData_givenMetaHttpEquivWithEmptyOrUnsupportedCharset_shouldKeepDefault() {
        // Arrange
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=\"></head><body>Empty Charset</body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(Charset.forName("UTF-8")));

        // Act
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("UTF-8", doc.outputSettings().charset().name());
        Assert.assertEquals("Empty Charset", doc.body().text());
    }

    @Test
    public void parseByteData_givenReDecodedDocumentStartingWithBom_shouldStripBomCharacter() {
        // Arrange
        String html = "\uFEFF<html><head><meta charset=\"ISO-8859-1\"></head><body>BOM content</body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(Charset.forName("ISO-8859-1")));

        // Act
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("BOM content", doc.body().text());
    }

    @Test
    public void parseByteData_givenReDecodedDocumentStartingWithoutBom_shouldLeaveDataIntact() {
        // Arrange
        String html = "<html><head><meta charset=\"ISO-8859-1\"></head><body>No BOM</body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(Charset.forName("ISO-8859-1")));

        // Act
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("No BOM", doc.body().text());
    }

    @Test
    public void parseByteData_givenReDecodedDocumentWithEmptyString_shouldHandleGracefully() {
        // Arrange
        String html = "<meta charset=\"ISO-8859-1\">";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(Charset.forName("ISO-8859-1")));

        // Act
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
    }

    @Test
    public void readToByteBuffer_givenUnlimitedMaxSize_shouldReadAllBytes() throws IOException {
        // Arrange
        byte[] expected = "Arbitrary stream content".getBytes("UTF-8");
        InputStream in = new ByteArrayInputStream(expected);

        // Act
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 0);

        // Assert
        Assert.assertEquals(expected.length, buffer.remaining());
        byte[] actual = new byte[buffer.remaining()];
        buffer.get(actual);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void readToByteBuffer_givenSingleParamStream_shouldCallUnlimitedRead() throws IOException {
        // Arrange
        byte[] expected = "Default unlimited".getBytes("UTF-8");
        InputStream in = new ByteArrayInputStream(expected);

        // Act
        ByteBuffer buffer = DataUtil.readToByteBuffer(in);

        // Assert
        Assert.assertEquals(expected.length, buffer.remaining());
        byte[] actual = new byte[buffer.remaining()];
        buffer.get(actual);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void readToByteBuffer_givenCappedMaxSizeSmallerThanStream_shouldCapAtMaxSize() throws IOException {
        // Arrange
        byte[] fullContent = "0123456789".getBytes("UTF-8");
        InputStream in = new ByteArrayInputStream(fullContent);

        // Act
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 4);

        // Assert
        Assert.assertEquals(4, buffer.remaining());
        byte[] actual = new byte[4];
        buffer.get(actual);
        Assert.assertArrayEquals("0123".getBytes("UTF-8"), actual);
    }

    @Test
    public void readToByteBuffer_givenCappedMaxSizeLargerThanStream_shouldReadAllAvailableBytes() throws IOException {
        // Arrange
        byte[] content = "Small".getBytes("UTF-8");
        InputStream in = new ByteArrayInputStream(content);

        // Act
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 50);

        // Assert
        Assert.assertEquals(content.length, buffer.remaining());
    }

    @Test(expected = IllegalArgumentException.class)
    public void readToByteBuffer_givenNegativeMaxSize_shouldThrowIllegalArgumentException() throws IOException {
        // Arrange
        InputStream in = new ByteArrayInputStream(new byte[0]);

        // Act
        DataUtil.readToByteBuffer(in, -1);
    }

    @Test
    public void readToByteBuffer_givenLargeStreamExceedingInternalBuffer_shouldLoopAndReadEntireContent() throws IOException {
        // Arrange
        int size = 0x20000 + 1024; // bufferSize + 1KB
        byte[] largeData = new byte[size];
        for (int i = 0; i < size; i++) {
            largeData[i] = (byte) (i % 127);
        }
        InputStream in = new ByteArrayInputStream(largeData);

        // Act
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 0);

        // Assert
        Assert.assertEquals(size, buffer.remaining());
        byte[] actual = new byte[size];
        buffer.get(actual);
        Assert.assertArrayEquals(largeData, actual);