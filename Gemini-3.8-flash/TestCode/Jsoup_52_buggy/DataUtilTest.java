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
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class DataUtilTest {

    @Test
    public void getCharsetFromContentType_givenNull_shouldReturnNull() {
        // Arrange & Act
        String charset = DataUtil.getCharsetFromContentType(null);

        // Assert
        Assert.assertNull(charset);
    }

    @Test
    public void getCharsetFromContentType_givenEmptyString_shouldReturnNull() {
        // Arrange & Act
        String charset = DataUtil.getCharsetFromContentType("");

        // Assert
        Assert.assertNull(charset);
    }

    @Test
    public void getCharsetFromContentType_givenNoCharset_shouldReturnNull() {
        // Arrange & Act
        String charset = DataUtil.getCharsetFromContentType("text/html; boundary=something");

        // Assert
        Assert.assertNull(charset);
    }

    @Test
    public void getCharsetFromContentType_givenStandardHeader_shouldReturnCharset() {
        // Arrange & Act
        String charset = DataUtil.getCharsetFromContentType("text/html; charset=utf-8");

        // Assert
        Assert.assertEquals("utf-8", charset);
    }

    @Test
    public void getCharsetFromContentType_givenUpperCaseHeader_shouldReturnCharset() {
        // Arrange & Act
        String charset = DataUtil.getCharsetFromContentType("TEXT/HTML; CHARSET=ISO-8859-1");

        // Assert
        Assert.assertEquals("ISO-8859-1", charset);
    }

    @Test
    public void getCharsetFromContentType_givenDoubleQuotedCharset_shouldStripQuotes() {
        // Arrange & Act
        String charset = DataUtil.getCharsetFromContentType("text/html; charset=\"UTF-8\"");

        // Assert
        Assert.assertEquals("UTF-8", charset);
    }

    @Test
    public void getCharsetFromContentType_givenSingleQuotedCharset_shouldStripQuotes() {
        // Arrange & Act
        String charset = DataUtil.getCharsetFromContentType("text/html; charset='UTF-8'");

        // Assert
        Assert.assertEquals("UTF-8", charset);
    }

    @Test
    public void getCharsetFromContentType_givenSpacesAroundEquals_shouldParseCorrectly() {
        // Arrange & Act
        String charset = DataUtil.getCharsetFromContentType("text/html; charset = UTF-8");

        // Assert
        Assert.assertEquals("UTF-8", charset);
    }

    @Test
    public void getCharsetFromContentType_givenSemicolonTerminated_shouldExtractProperly() {
        // Arrange & Act
        String charset = DataUtil.getCharsetFromContentType("text/html; charset=UTF-8; boundary=something");

        // Assert
        Assert.assertEquals("UTF-8", charset);
    }

    @Test
    public void getCharsetFromContentType_givenUnsupportedCharset_shouldReturnNull() {
        // Arrange & Act
        String charset = DataUtil.getCharsetFromContentType("text/html; charset=unsupported-charset-name-12345");

        // Assert
        Assert.assertNull(charset);
    }

    @Test
    public void getCharsetFromContentType_givenIllegalCharset_shouldReturnNull() {
        // Arrange & Act
        String charset = DataUtil.getCharsetFromContentType("text/html; charset=$$$illegal@@@");

        // Assert
        Assert.assertNull(charset);
    }

    @Test
    public void getCharsetFromContentType_givenLowercaseSupportedCharset_shouldResolveViaUppercaseFallback() {
        // Arrange & Act
        String charset = DataUtil.getCharsetFromContentType("text/html; charset=us-ascii");

        // Assert
        Assert.assertEquals("us-ascii", charset);
    }

    @Test
    public void emptyByteBuffer_shouldReturnEmptyBuffer() {
        // Arrange & Act
        ByteBuffer buffer = DataUtil.emptyByteBuffer();

        // Assert
        Assert.assertNotNull(buffer);
        Assert.assertEquals(0, buffer.capacity());
        Assert.assertEquals(0, buffer.remaining());
    }

    @Test
    public void mimeBoundary_shouldReturnExpectedFormatAndLength() {
        // Arrange & Act
        String boundary = DataUtil.mimeBoundary();

        // Assert
        Assert.assertNotNull(boundary);
        Assert.assertEquals(DataUtil.boundaryLength, boundary.length());
        for (int i = 0; i < boundary.length(); i++) {
            char c = boundary.charAt(i);
            boolean valid = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9') || c == '-' || c == '_';
            Assert.assertTrue("Invalid mime character: " + c, valid);
        }
    }

    @Test
    public void readToByteBuffer_givenUnlimitedStream_shouldReadAllBytes() throws IOException {
        // Arrange
        byte[] expected = "Testing readToByteBuffer unlimited stream".getBytes("UTF-8");
        ByteArrayInputStream in = new ByteArrayInputStream(expected);

        // Act
        ByteBuffer buffer = DataUtil.readToByteBuffer(in);

        // Assert
        byte[] actual = new byte[buffer.remaining()];
        buffer.get(actual);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void readToByteBuffer_givenZeroMaxSize_shouldReadAllBytes() throws IOException {
        // Arrange
        byte[] expected = "Testing readToByteBuffer with maxSize zero".getBytes("UTF-8");
        ByteArrayInputStream in = new ByteArrayInputStream(expected);

        // Act
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 0);

        // Assert
        byte[] actual = new byte[buffer.remaining()];
        buffer.get(actual);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void readToByteBuffer_givenMaxSizeSmallerThanStream_shouldCapOutput() throws IOException {
        // Arrange
        byte[] input = "0123456789ABCDEF".getBytes("UTF-8");
        ByteArrayInputStream in = new ByteArrayInputStream(input);
        int maxSize = 5;

        // Act
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, maxSize);

        // Assert
        Assert.assertEquals(maxSize, buffer.remaining());
        byte[] actual = new byte[buffer.remaining()];
        buffer.get(actual);
        Assert.assertArrayEquals("01234".getBytes("UTF-8"), actual);
    }

    @Test
    public void readToByteBuffer_givenMaxSizeEqualToStream_shouldReadAll() throws IOException {
        // Arrange
        byte[] input = "exactSize".getBytes("UTF-8");
        ByteArrayInputStream in = new ByteArrayInputStream(input);

        // Act
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, input.length);

        // Assert
        Assert.assertEquals(input.length, buffer.remaining());
        byte[] actual = new byte[buffer.remaining()];
        buffer.get(actual);
        Assert.assertArrayEquals(input, actual);
    }

    @Test
    public void readToByteBuffer_givenMaxSizeLargerThanStream_shouldReadAll() throws IOException {
        // Arrange
        byte[] input = "shortStream".getBytes("UTF-8");
        ByteArrayInputStream in = new ByteArrayInputStream(input);

        // Act
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 1000);

        // Assert
        Assert.assertEquals(input.length, buffer.remaining());
        byte[] actual = new byte[buffer.remaining()];
        buffer.get(actual);
        Assert.assertArrayEquals(input, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void readToByteBuffer_givenNegativeMaxSize_shouldThrowIllegalArgumentException() throws IOException {
        // Arrange
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[10]);

        // Act
        DataUtil.readToByteBuffer(in, -1);
    }

    @Test
    public void readFileToByteBuffer_givenValidFile_shouldReadContent() throws IOException {
        // Arrange
        File tempFile = File.createTempFile("dataUtilTest", ".tmp");
        tempFile.deleteOnExit();
        byte[] content = "Hello File to ByteBuffer".getBytes("UTF-8");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(tempFile);
            fos.write(content);
        } finally {
            if (fos != null) {
                fos.close();
            }
        }

        // Act
        ByteBuffer buffer = DataUtil.readFileToByteBuffer(tempFile);

        // Assert
        byte[] actual = new byte[buffer.remaining()];
        buffer.get(actual);
        Assert.assertArrayEquals(content, actual);
    }

    @Test(expected = IOException.class)
    public void readFileToByteBuffer_givenNonExistentFile_shouldThrowIOException() throws IOException {
        // Arrange
        File nonExistent = new File("non_existent_file_data_util_" + System.currentTimeMillis() + ".txt");

        // Act
        DataUtil.readFileToByteBuffer(nonExistent);
    }

    @Test
    public void crossStreams_givenInput_shouldWriteToOutputStream() throws IOException {
        // Arrange
        byte[] data = "Cross streams test data stream".getBytes("UTF-8");
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        // Act
        DataUtil.crossStreams(in, out);

        // Assert
        Assert.assertArrayEquals(data, out.toByteArray());
    }

    @Test
    public void parseByteData_givenNullCharsetAndNoMeta_shouldDefaultToUtf8() {
        // Arrange
        String html = "<html><body><p>Default UTF-8</p></body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(Charset.forName("UTF-8")));

        // Act
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());

        // Assert
        Assert.assertEquals("Default UTF-8", doc.select("p").text());
        Assert.assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test
    public void parseByteData_givenExplicitValidCharset_shouldParseDirectly() {
        // Arrange
        String html = "<html><body><p>Explicit Charset</p></body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(Charset.forName("ISO-8859-1")));

        // Act
        Document doc = DataUtil.parseByteData(buffer, "ISO-8859-1", "http://example.com", Parser.htmlParser());

        // Assert
        Assert.assertEquals("Explicit Charset", doc.select("p").text());
        Assert.assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseByteData_givenEmptyCharset_shouldThrowIllegalArgumentException() {
        // Arrange
        ByteBuffer buffer = ByteBuffer.wrap(new byte[10]);

        // Act
        DataUtil.parseByteData(buffer, "", "http://example.com", Parser.htmlParser());
    }

    @Test
    public void parseByteData_givenMetaHttpEquivCharset_shouldReDecode() {
        // Arrange
        String html = "<html><head><meta http-equiv=\"content-type\" content=\"text/html; charset=ISO-8859-1\"></head><body><p>Café</p></body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(Charset.forName("ISO-8859-1")));

        // Act
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());

        // Assert
        Assert.assertEquals("Café", doc.select("p").text());
        Assert.assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void parseByteData_givenMetaCharsetHtml5_shouldReDecode() {
        // Arrange
        String html = "<html><head><meta charset=\"ISO-8859-1\"></head><body><p>Crème</p></body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(Charset.forName("ISO-8859-1")));

        // Act
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());

        // Assert
        Assert.assertEquals("Crème", doc.select("p").text());
        Assert.assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void parseByteData_givenUnsupportedMetaCharset_shouldKeepDefaultUtf8() {
        // Arrange
        String html = "<html><head><meta charset=\"unsupported-charset-name\"></head><body><p>Fallback</p></body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(Charset.forName("UTF-8")));

        // Act
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());

        // Assert
        Assert.assertEquals("Fallback", doc.select("p").text());
        Assert.assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test
    public void parseByteData_givenIllegalMetaCharset_shouldCatchExceptionAndKeepDefault() {
        // Arrange
        String html = "<html><head><meta charset=\"$$$Illegal*Charset\"></head><body><p>Illegal</p></body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(Charset.forName("UTF-8")));

        // Act
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());

        // Assert
        Assert.assertEquals("Illegal", doc.select("p").text());
        Assert.assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test
    public void parseByteData_givenXmlDeclarationEncoding_shouldReDecode() {
        // Arrange
        String xml = "<?xml encoding='ISO-8859-1'?><root><node>value</node></root>";
        ByteBuffer buffer = ByteBuffer.wrap(xml.getBytes(Charset.forName("ISO-8859-1")));

        // Act
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.xmlParser());

        // Assert
        Assert.assertEquals("value", doc.select("node").text());
        Assert.assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void parseByteData_givenXmlDeclarationWithNonXmlName_shouldKeepUtf8() {
        // Arrange
        String xml = "<?something encoding='ISO-8859-1'?><root>data</root>";
        ByteBuffer buffer = ByteBuffer.wrap(xml.getBytes(Charset.forName("UTF-8")));

        // Act
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.xmlParser());

        // Assert
        Assert.assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test
    public void parseByteData_givenMetaCharsetSameAsDefaultUtf8_shouldNotReDecode() {
        // Arrange
        String html = "<html><head><meta charset=\"UTF-8\"></head><body><p>Same Charset</p></body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(Charset.forName("UTF-8")));

        // Act
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());

        // Assert
        Assert.assertEquals("Same Charset", doc.select("p").text());
        Assert.assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test
    public void parseByteData_givenUtf8Bom_shouldDetectUtf8AndAdvancePosition() {
        // Arrange
        byte[] bom = new byte[]{(byte) 0xEF, (byte) 0xBB, (byte) 0xBF};
        byte[] text = "<html><body><p>BOM UTF-8</p></body></html>".getBytes(Charset.forName("UTF-8"));
        byte[] all = new byte[bom.length + text.length];
        System.arraycopy(bom, 0, all, 0, bom.length);
        System.arraycopy(text, 0, all, bom.length, text.length);
        ByteBuffer buffer = ByteBuffer.wrap(all);

        // Act
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());

        // Assert
        Assert.assertEquals("BOM UTF-8", doc.select("p").text());
        Assert.assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test
    public void parseByteData_givenUtf16BeBom_shouldDetectUtf16() {
        // Arrange
        byte[] bom = new byte[]{(byte) 0xFE, (byte) 0xFF};
        byte[] text = "<html><body><p>BOM UTF-16BE</p></body></html>".getBytes(Charset.forName("UTF-16BE"));
        byte[] all = new byte[bom.length + text.length];
        System.arraycopy(bom, 0, all, 0, bom.length);
        System.arraycopy(text, 0, all, bom.length, text.length);
        ByteBuffer buffer = ByteBuffer.wrap(all);

        // Act
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());

        // Assert
        Assert.assertEquals("BOM UTF-16BE", doc.select("p").text());
        Assert.assertEquals("UTF-16", doc.outputSettings().charset().name());
    }

    @Test
    public void parseByteData_givenUtf16LeBom_shouldDetectUtf16() {
        // Arrange
        byte[] bom = new byte[]{(byte) 0xFF, (byte) 0xFE};
        byte[] text = "<html><body><p>BOM UTF-16LE</p></body></html>".getBytes(Charset.forName("UTF-16LE"));
        byte[] all = new byte[bom.length + text.length];
        System.arraycopy(bom, 0, all, 0, bom.length);
        System.arraycopy(text, 0, all, bom.length, text.length);
        ByteBuffer buffer = ByteBuffer.wrap(all);

        // Act
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());

        // Assert
        Assert.assertEquals("BOM UTF-16LE", doc.select("p").text());
        Assert.assertEquals("UTF-16", doc.outputSettings().charset().name());
    }

    @Test
    public void parseByteData_givenUtf32BeBom_shouldDetectUtf32() {
        // Arrange
        byte[] bom = new byte[]{0x00, 0x00, (byte) 0xFE, (byte) 0xFF};
        String charsetName = "UTF-32";
        if (!Charset.isSupported(charsetName)) {
            return;
        }
        byte[] text = "<html><body><p>BOM UTF-32BE</p></body></html>".getBytes(Charset.forName("UTF-32BE"));
        byte[] all = new byte[bom.length + text.length];
        System.arraycopy(bom, 0, all, 0, bom.length);
        System.arraycopy(text, 0, all, bom.length, text.length);
        ByteBuffer buffer = ByteBuffer.wrap(all);

        // Act
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());

        // Assert
        Assert.assertEquals("BOM UTF-32BE", doc.select("p").text());
        Assert.assertEquals("UTF-32", doc.outputSettings().charset().name());
    }

    @Test
    public void parseByteData_givenUtf32LeBom_shouldDetectUtf32() {
        // Arrange
        byte[] bom = new byte[]{(byte) 0xFF, (byte) 0xFE, 0x00, 0x00};
        String charsetName = "UTF-32";
        if (!Charset.isSupported(charsetName)) {
            return;
        }
        byte[] text = "<html><body><p>BOM UTF-32LE</p></body></html>".getBytes(Charset.forName("UTF-32LE"));
        byte[] all = new byte[bom.length + text.length];
        System.arraycopy(bom, 0, all, 0, bom.length);
        System.arraycopy(text, 0, all, bom.length, text.length);
        ByteBuffer buffer = ByteBuffer.wrap(all);

        // Act
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());

        // Assert
        Assert.assertEquals("BOM UTF-32LE", doc.select("p").text());
        Assert.assertEquals("UTF-32", doc.outputSettings().charset().name());
    }

    @Test
    public void parseByteData_givenLessThan4Bytes_shouldNotThrowException() {
        // Arrange
        byte[] shortBytes = new byte[]{'h', 'i'};
        ByteBuffer buffer = ByteBuffer.wrap(shortBytes);

        // Act
        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
    }

    @Test
    public void load_fromInputStreamWithDefaultParser_shouldParseDocument() throws IOException {
        // Arrange
        String html = "<html><body><p>Hello Stream</p></body></html>";
        ByteArrayInputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));

        // Act
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com");

        // Assert
        Assert.assertEquals("Hello Stream", doc.select("p").text());
    }

    @Test
    public void load_fromInputStreamWithCustomParser_shouldParseDocument() throws IOException {
        // Arrange
        String xml = "<root><item>Hello XML</item></root>";
        ByteArrayInputStream in = new ByteArrayInputStream(xml.getBytes("UTF-8"));

        // Act
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com", Parser.xmlParser());

        // Assert
        Assert.assertEquals("Hello XML", doc.select("item").text());
    }

    @Test
    public void load_fromFile_shouldParseDocument() throws IOException {
        // Arrange
        File tempFile = File.createTempFile("dataUtilLoadFile", ".html");
        tempFile.deleteOnExit();
        String html = "<html><body><p>Hello File</p></body></html>";
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(tempFile);
            fos.write(html.getBytes("UTF-8"));
        } finally {
            if (fos != null) {
                fos.close();
            }
        }

        // Act
        Document doc = DataUtil.load(tempFile, "UTF-8", "http://example.com");

        // Assert
        Assert.assertEquals("Hello File", doc.select("p").text());
    }
}