package org.jsoup.helper;

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
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class DataUtilTest {

    @Test
    public void privateConstructor_givenReflection_shouldInstantiateSuccessfully() throws Exception {
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
    public void loadFile_givenValidHtmlFile_shouldParseDocument() throws IOException {
        // Arrange
        File tempFile = File.createTempFile("datautil_test", ".html");
        tempFile.deleteOnExit();
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(tempFile);
            fos.write("<html><head><title>Test File</title></head><body><p>Hello File</p></body></html>".getBytes("UTF-8"));
        } finally {
            if (fos != null) {
                fos.close();
            }
        }

        // Act
        Document doc = DataUtil.load(tempFile, "UTF-8", "http://example.com/");

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("Test File", doc.title());
        Assert.assertEquals("Hello File", doc.select("p").first().text());
        tempFile.delete();
    }

    @Test
    public void loadInputStream_givenValidHtmlStream_shouldParseDocument() throws IOException {
        // Arrange
        String html = "<html><head><title>Stream Title</title></head><body>Stream Content</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));

        // Act
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com/");

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("Stream Title", doc.title());
    }

    @Test
    public void loadInputStreamWithParser_givenXmlParser_shouldParseXmlDocument() throws IOException {
        // Arrange
        String xml = "<xml><child>Data</child></xml>";
        InputStream in = new ByteArrayInputStream(xml.getBytes("UTF-8"));

        // Act
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com/", Parser.xmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("Data", doc.select("child").first().text());
    }

    @Test
    public void crossStreams_givenSmallStream_shouldTransferAllBytes() throws IOException {
        // Arrange
        byte[] expected = "Sample data to cross streams".getBytes("UTF-8");
        InputStream in = new ByteArrayInputStream(expected);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        // Act
        DataUtil.crossStreams(in, out);

        // Assert
        Assert.assertArrayEquals(expected, out.toByteArray());
    }

    @Test
    public void crossStreams_givenStreamLargerThanBuffer_shouldTransferAllBytes() throws IOException {
        // Arrange
        int size = 0x20000 + 1024; // Exceeds internal bufferSize (0x20000)
        byte[] expected = new byte[size];
        for (int i = 0; i < size; i++) {
            expected[i] = (byte) (i % 127);
        }
        InputStream in = new ByteArrayInputStream(expected);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        // Act
        DataUtil.crossStreams(in, out);

        // Assert
        Assert.assertArrayEquals(expected, out.toByteArray());
    }

    @Test
    public void parseByteData_givenNullCharsetWithoutMeta_shouldDefaultToUtf8() {
        // Arrange
        String html = "<html><body><p>No Meta</p></body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(Charset.forName("UTF-8")));

        // Act
        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com/", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("UTF-8", doc.outputSettings().charset().displayName());
        Assert.assertEquals("No Meta", doc.select("p").first().text());
    }

    @Test
    public void parseByteData_givenNullCharsetWithHttpEquivMeta_shouldReDecodeWithNewCharset() {
        // Arrange
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"></head>"
                + "<body><p>\u00E9\u00E0\u00E8</p></body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(Charset.forName("ISO-8859-1")));

        // Act
        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com/", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("ISO-8859-1", doc.outputSettings().charset().displayName());
        Assert.assertEquals("\u00E9\u00E0\u00E8", doc.select("p").first().text());
    }

    @Test
    public void parseByteData_givenNullCharsetWithHtml5MetaCharset_shouldReDecodeWithNewCharset() {
        // Arrange
        String html = "<html><head><meta charset=\"ISO-8859-1\"></head><body><p>\u00E9</p></body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(Charset.forName("ISO-8859-1")));

        // Act
        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com/", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("ISO-8859-1", doc.outputSettings().charset().displayName());
        Assert.assertEquals("\u00E9", doc.select("p").first().text());
    }

    @Test
    public void parseByteData_givenNullCharsetWithMetaCharsetEqualsUtf8_shouldNotReDecode() {
        // Arrange
        String html = "<html><head><meta charset=\"UTF-8\"></head><body><p>Standard</p></body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(Charset.forName("UTF-8")));

        // Act
        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com/", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("UTF-8", doc.outputSettings().charset().displayName());
        Assert.assertEquals("Standard", doc.select("p").first().text());
    }

    @Test
    public void parseByteData_givenNullCharsetWithIllegalMetaCharset_shouldFallBackToUtf8() {
        // Arrange
        String html = "<html><head><meta charset=\"??illegal-charset$$\"></head><body><p>Illegal</p></body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(Charset.forName("UTF-8")));

        // Act
        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com/", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("UTF-8", doc.outputSettings().charset().displayName());
        Assert.assertEquals("Illegal", doc.select("p").first().text());
    }

    @Test
    public void parseByteData_givenNullCharsetWithUnsupportedMetaCharset_shouldFallBackToUtf8() {
        // Arrange
        String html = "<html><head><meta charset=\"unsupported_123456\"></head><body><p>Unsupported</p></body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(Charset.forName("UTF-8")));

        // Act
        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com/", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("UTF-8", doc.outputSettings().charset().displayName());
        Assert.assertEquals("Unsupported", doc.select("p").first().text());
    }

    @Test
    public void parseByteData_givenSpecifiedCharset_shouldUseSpecifiedCharset() {
        // Arrange
        String html = "<html><body><p>\u00E9\u00E0\u00E8</p></body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(Charset.forName("ISO-8859-1")));

        // Act
        Document doc = DataUtil.parseByteData(byteData, "ISO-8859-1", "http://example.com/", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("ISO-8859-1", doc.outputSettings().charset().displayName());
        Assert.assertEquals("\u00E9\u00E0\u00E8", doc.select("p").first().text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseByteData_givenEmptyCharset_shouldThrowIllegalArgumentException() {
        // Arrange
        ByteBuffer byteData = ByteBuffer.wrap("<html></html>".getBytes());

        // Act
        DataUtil.parseByteData(byteData, "", "http://example.com/", Parser.htmlParser());
    }

    @Test
    public void parseByteData_givenUtf8Bom_shouldStripBomAndParseAsUtf8() {
        // Arrange
        byte[] bom = new byte[]{(byte) 0xEF, (byte) 0xBB, (byte) 0xBF};
        byte[] content = "<html><body><p>With BOM</p></body></html>".getBytes(Charset.forName("UTF-8"));
        byte[] total = new byte[bom.length + content.length];
        System.arraycopy(bom, 0, total, 0, bom.length);
        System.arraycopy(content, 0, total, bom.length, content.length);
        ByteBuffer byteData = ByteBuffer.wrap(total);

        // Act
        Document doc = DataUtil.parseByteData(byteData, "ISO-8859-1", "http://example.com/", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("UTF-8", doc.outputSettings().charset().displayName());
        Assert.assertEquals("With BOM", doc.select("p").first().text());
    }

    @Test
    public void parseByteData_givenEmptyByteBuffer_shouldParseEmptyDocument() {
        // Arrange
        ByteBuffer byteData = DataUtil.emptyByteBuffer();

        // Act
        Document doc = DataUtil.parseByteData(byteData, "UTF-8", "http://example.com/", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("", doc.body().text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void readToByteBuffer_givenNegativeMaxSize_shouldThrowIllegalArgumentException() throws IOException {
        // Arrange
        InputStream in = new ByteArrayInputStream(new byte[10]);

        // Act
        DataUtil.readToByteBuffer(in, -1);
    }

    @Test
    public void readToByteBuffer_givenZeroMaxSize_shouldReadEntireStream() throws IOException {
        // Arrange
        byte[] expected = "Unlimited read stream data".getBytes("UTF-8");
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
    public void readToByteBuffer_givenSingleArgMethod_shouldReadEntireStream() throws IOException {
        // Arrange
        byte[] expected = "Single arg read stream".getBytes("UTF-8");
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
    public void readToByteBuffer_givenStreamLargerThanBufferSizeWithZeroMaxSize_shouldLoopAndReadFully() throws IOException {
        // Arrange
        int size = 0x20000 + 512;
        byte[] expected = new byte[size];
        for (int i = 0; i < size; i++) {
            expected[i] = (byte) (i & 0xFF);
        }
        InputStream in = new ByteArrayInputStream(expected);

        // Act
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 0);

        // Assert
        Assert.assertEquals(size, buffer.remaining());
        byte[] actual = new byte[buffer.remaining()];
        buffer.get(actual);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void readToByteBuffer_givenMaxSizeSmallerThanStream_shouldCapReadToMaxSize() throws IOException {
        // Arrange
        byte[] original = "1234567890abcdefghij".getBytes("UTF-8");
        InputStream in = new ByteArrayInputStream(original);
        int maxSize = 5;

        // Act
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, maxSize);

        // Assert
        Assert.assertEquals(maxSize, buffer.remaining());
        byte[] actual = new byte[buffer.remaining()];
        buffer.get(actual);
        Assert.assertArrayEquals("12