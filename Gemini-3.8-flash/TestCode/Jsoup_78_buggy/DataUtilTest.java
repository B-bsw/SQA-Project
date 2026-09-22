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
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class DataUtilTest {

    @Test
    public void emptyByteBuffer_whenInvoked_shouldReturnEmptyBuffer() {
        ByteBuffer buffer = DataUtil.emptyByteBuffer();
        Assert.assertNotNull(buffer);
        Assert.assertEquals(0, buffer.capacity());
        Assert.assertEquals(0, buffer.remaining());
    }

    @Test
    public void getCharsetFromContentType_givenNull_shouldReturnNull() {
        String charset = DataUtil.getCharsetFromContentType(null);
        Assert.assertNull(charset);
    }

    @Test
    public void getCharsetFromContentType_givenNoCharsetParam_shouldReturnNull() {
        String charset = DataUtil.getCharsetFromContentType("text/html");
        Assert.assertNull(charset);
    }

    @Test
    public void getCharsetFromContentType_givenStandardCharset_shouldReturnNormalizedCharset() {
        String charset = DataUtil.getCharsetFromContentType("text/html; charset=utf-8");
        Assert.assertNotNull(charset);
        Assert.assertTrue("utf-8".equalsIgnoreCase(charset));
    }

    @Test
    public void getCharsetFromContentType_givenDoubleQuotedCharset_shouldStripQuotes() {
        String charset = DataUtil.getCharsetFromContentType("text/html; charset=\"UTF-8\"");
        Assert.assertEquals("UTF-8", charset);
    }

    @Test
    public void getCharsetFromContentType_givenSingleQuotedCharset_shouldStripQuotes() {
        String charset = DataUtil.getCharsetFromContentType("text/html; charset='ISO-8859-1'");
        Assert.assertEquals("ISO-8859-1", charset);
    }

    @Test
    public void getCharsetFromContentType_givenUnsupportedCharset_shouldReturnNull() {
        String charset = DataUtil.getCharsetFromContentType("text/html; charset=unsupported_charset_xyz_123");
        Assert.assertNull(charset);
    }

    @Test
    public void getCharsetFromContentType_givenIllegalCharsetFormat_shouldReturnNull() {
        String charset = DataUtil.getCharsetFromContentType("text/html; charset=$invalid?charset^");
        Assert.assertNull(charset);
    }

    @Test
    public void getCharsetFromContentType_givenBlankCharset_shouldReturnNull() {
        String charset = DataUtil.getCharsetFromContentType("text/html; charset=   ");
        Assert.assertNull(charset);
    }

    @Test
    public void mimeBoundary_whenGenerated_shouldHaveBoundaryLengthAndValidChars() {
        String boundary = DataUtil.mimeBoundary();
        Assert.assertNotNull(boundary);
        Assert.assertEquals(DataUtil.boundaryLength, boundary.length());
        String allowed = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < boundary.length(); i++) {
            char c = boundary.charAt(i);
            Assert.assertTrue("Character " + c + " should be in allowed mime characters", allowed.indexOf(c) != -1);
        }
    }

    @Test
    public void crossStreams_givenInput_shouldWriteAllBytesToOutput() throws IOException {
        byte[] expected = "Testing crossStreams data transfer functionality".getBytes("UTF-8");
        ByteArrayInputStream in = new ByteArrayInputStream(expected);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        DataUtil.crossStreams(in, out);

        byte[] actual = out.toByteArray();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void readToByteBuffer_givenNegativeMaxSize_shouldThrowIllegalArgumentException() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[]{1, 2, 3});
        try {
            DataUtil.readToByteBuffer(in, -1);
            Assert.fail("Should throw IllegalArgumentException when maxSize < 0");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("maxSize must be 0 (unlimited) or larger"));
        }
    }

    @Test
    public void readToByteBuffer_givenUnlimitedMaxSize_shouldReadAllBytes() throws IOException {
        byte[] inputData = "Read entirely to byte buffer".getBytes("UTF-8");
        ByteArrayInputStream in = new ByteArrayInputStream(inputData);

        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 0);

        Assert.assertEquals(inputData.length, buffer.remaining());
        byte[] result = new byte[buffer.remaining()];
        buffer.get(result);
        Assert.assertArrayEquals(inputData, result);
    }

    @Test
    public void readToByteBuffer_givenSingleParam_shouldReadAllBytes() throws IOException {
        byte[] inputData = "Single param buffer read".getBytes("UTF-8");
        ByteArrayInputStream in = new ByteArrayInputStream(inputData);

        ByteBuffer buffer = DataUtil.readToByteBuffer(in);

        Assert.assertEquals(inputData.length, buffer.remaining());
    }

    @Test
    public void readToByteBuffer_givenLimitedMaxSize_shouldCapReadBytes() throws IOException {
        byte[] inputData = "Limit this reading".getBytes("UTF-8");
        ByteArrayInputStream in = new ByteArrayInputStream(inputData);

        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 5);

        Assert.assertEquals(5, buffer.remaining());
    }

    @Test
    public void readFileToByteBuffer_givenValidFile_shouldReadContentCorrectly() throws IOException {
        File tempFile = File.createTempFile("datautil_test", ".tmp");
        tempFile.deleteOnExit();

        byte[] expected = "File content to buffer test".getBytes("UTF-8");
        FileOutputStream fos = new FileOutputStream(tempFile);
        try {
            fos.write(expected);
        } finally {
            fos.close();
        }

        ByteBuffer buffer = DataUtil.readFileToByteBuffer(tempFile);
        Assert.assertEquals(expected.length, buffer.remaining());
        byte[] actual = new byte[buffer.remaining()];
        buffer.get(actual);
        Assert.assertArrayEquals(expected, actual);

        tempFile.delete();
    }

    @Test
    public void parseInputStream_givenNullInput_shouldReturnEmptyDocumentWithBaseUri() throws IOException {
        String baseUri = "http://example.com/";
        Document doc = DataUtil.parseInputStream(null, "UTF-8", baseUri, Parser.htmlParser());

        Assert.assertNotNull(doc);
        Assert.assertEquals(baseUri, doc.baseUri());
        Assert.assertEquals(0, doc.children().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseInputStream_givenEmptyCharsetName_shouldThrowIllegalArgumentException() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream("<p>test</p>".getBytes("UTF-8"));
        DataUtil.parseInputStream(in, "", "http://example.com/", Parser.htmlParser());
    }

    @Test
    public void parseInputStream_givenExplicitCharset_shouldParseSuccessfully() throws IOException {
        String html = "<html><head><title>Sample</title></head><body><p>Hello World</p></body></html>";
        ByteArrayInputStream in = new ByteArrayInputStream(html.getBytes("ISO-8859-1"));

        Document doc = DataUtil.parseInputStream(in, "ISO-8859-1", "http://example.com/", Parser.htmlParser());

        Assert.assertNotNull(doc);
        Assert.assertEquals("Sample", doc.title());
        Assert.assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void parseInputStream_givenUtf8Bom_shouldDetectCharsetAndSkipBom() throws IOException {
        byte[] bom = new byte[]{(byte) 0xEF, (byte) 0xBB, (byte) 0xBF};
        byte[] htmlBytes = "<title>BOM UTF-8</title>".getBytes("UTF-8");
        byte[] combined = new byte[bom.length + htmlBytes.length];
        System.arraycopy(bom, 0, combined, 0, bom.length);
        System.arraycopy(htmlBytes, 0, combined, bom.length, htmlBytes.length);

        ByteArrayInputStream in = new ByteArrayInputStream(combined);
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());

        Assert.assertNotNull(doc);
        Assert.assertEquals("BOM UTF-8", doc.title());
        Assert.assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test
    public void parseInputStream_givenUtf16BeBom_shouldDetectCharset() throws IOException {
        byte[] bom = new byte[]{(byte) 0xFE, (byte) 0xFF};
        byte[] htmlBytes = "<title>BOM UTF-16BE</title>".getBytes("UTF-16BE");
        byte[] combined = new byte[bom.length + htmlBytes.length];
        System.arraycopy(bom, 0, combined, 0, bom.length);
        System.arraycopy(htmlBytes, 0, combined, bom.length, htmlBytes.length);

        ByteArrayInputStream in = new ByteArrayInputStream(combined);
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());

        Assert.assertNotNull(doc);
        Assert.assertEquals("BOM UTF-16BE", doc.title());
    }

    @Test
    public void parseInputStream_givenUtf16LeBom_shouldDetectCharset() throws IOException {
        byte[] bom = new byte[]{(byte) 0xFF, (byte) 0xFE};
        byte[] htmlBytes = "<title>BOM UTF-16LE</title>".getBytes("UTF-16LE");
        byte[] combined = new byte[bom.length + htmlBytes.length];
        System.arraycopy(bom, 0, combined, 0, bom.length);
        System.arraycopy(htmlBytes, 0, combined, bom.length, htmlBytes.length);

        ByteArrayInputStream in = new ByteArrayInputStream(combined);
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());

        Assert.assertNotNull(doc);
        Assert.assertEquals("BOM UTF-16LE", doc.title());
    }

    @Test
    public void parseInputStream_givenUtf32BeBom_shouldDetectCharset() throws IOException {
        if (!Charset.isSupported("UTF-32")) {
            return;
        }
        byte[] bom = new byte[]{0x00, 0x00, (byte) 0xFE, (byte) 0xFF};
        byte[] htmlBytes = "<title>BOM UTF-32BE</title>".getBytes("UTF-32BE");
        byte[] combined = new byte[bom.length + htmlBytes.length];
        System.arraycopy(bom, 0, combined, 0, bom.length);
        System.arraycopy(htmlBytes, 0, combined, bom.length, htmlBytes.length);

        ByteArrayInputStream in = new ByteArrayInputStream(combined);
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());

        Assert.assertNotNull(doc);
        Assert.assertEquals("BOM UTF-32BE", doc.title());
    }

    @Test
    public void parseInputStream_givenUtf32LeBom_shouldDetectCharset() throws IOException {
        if (!Charset.isSupported("UTF-32")) {
            return;
        }
        byte[] bom = new byte[]{(byte) 0xFF, (byte) 0xFE, 0x00, 0x00};
        byte[] htmlBytes = "<title>BOM UTF-32LE</title>".getBytes("UTF-32LE");
        byte[] combined = new byte[bom.length + htmlBytes.length];
        System.arraycopy(bom, 0, combined, 0, bom.length);
        System.arraycopy(htmlBytes, 0, combined, bom.length, htmlBytes.length);

        ByteArrayInputStream in = new ByteArrayInputStream(combined);
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());

        Assert.assertNotNull(doc);
        Assert.assertEquals("BOM UTF-32LE", doc.title());
    }

    @Test
    public void parseInputStream_givenShortStream_shouldHandleWithoutBom() throws IOException {
        byte[] shortBytes = new byte[]{0x01, 0x02};
        ByteArrayInputStream in = new ByteArrayInputStream(shortBytes);

        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());

        Assert.assertNotNull(doc);
    }

    @Test
    public void parseInputStream_givenMetaHttpEquivCharset_shouldReDecodeWithFoundCharset() throws IOException {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"></head>"
                + "<body><p>Caf\u00e9</p></body></html>";
        ByteArrayInputStream in = new ByteArrayInputStream(html.getBytes("ISO-8859-1"));

        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());

        Assert.assertNotNull(doc);
        Assert.assertTrue(doc.text().contains("Caf\u00e9"));
        Assert.assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void parseInputStream_givenMetaCharsetHtml5_shouldReDecodeWithFoundCharset() throws IOException {
        String html = "<html><head><meta charset=\"ISO-8859-1\"></head><body><p>Test</p></body></html>";
        ByteArrayInputStream in = new ByteArrayInputStream(html.getBytes("ISO-8859-1"));

        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());

        Assert.assertNotNull(doc);
        Assert.assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void parseInputStream_givenXmlPrologEncoding_shouldReDecodeWithFoundCharset() throws IOException {
        String xml = "<?xml encoding='ISO-8859-1'?><data>content</data>";
        ByteArrayInputStream in = new ByteArrayInputStream(xml.getBytes("ISO-8859-1"));

        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.xmlParser());

        Assert.assertNotNull(doc);
        Assert.assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void parseInputStream_givenXmlPrologNonXmlName_shouldNotUseEncoding() throws IOException {
        String xml = "<?notxml encoding='ISO-8859-1'?><data>content</data>";
        ByteArrayInputStream in = new ByteArrayInputStream(xml.getBytes("UTF-8"));

        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.xmlParser());

        Assert.assertNotNull(doc);
        Assert.assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test
    public void parseInputStream_givenNonFullyReadDefaultCharset_shouldReadViaReader() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("<html><head><title>Large Document</title></head><body>");
        for (int i = 0; i < 7000; i++) {
            sb.append("<p>Filler text line ").append(i).append("</p>");
        }
        sb.append("</body></html>");

        byte[] bigData = sb.toString().getBytes("UTF-8");
        ByteArrayInputStream in = new ByteArrayInputStream(bigData);

        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());

        Assert.assertNotNull(doc);
        Assert.assertEquals("Large Document", doc.title());
        Assert.assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test
    public void parseInputStream_givenMetaCharsetMatchesDefaultUtf8_andFullyRead_shouldUseInitialDoc() throws IOException {
        String html = "<html><head><meta charset=\"UTF-8\"><title>Simple</title></head><body>Hello</body></html>";
        ByteArrayInputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));

        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());

        Assert.assertNotNull(doc);
        Assert.assertEquals("Simple", doc.title());
    }

    @Test
    public void load_givenInputStream_shouldParseDocument() throws IOException {
        String html = "<html><head><title>Stream Load</title></head><body>Content</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));

        Document doc = DataUtil.load(in, "UTF-8", "http://example.com/");

        Assert.assertNotNull(doc);
        Assert.assertEquals("Stream Load", doc.title());
    }

    @Test
    public void load_givenInputStreamAndCustomParser_shouldParseWithCustomParser() throws IOException {
        String xml = "<root><child>value</child></root>";
        InputStream in = new ByteArrayInputStream(xml.getBytes("UTF-8"));

        Document doc = DataUtil.load(in, "UTF-8", "http://example.com/", Parser.xmlParser());

        Assert.assertNotNull(doc);
        Assert.assertEquals("value", doc.select("child").text());
    }

    @Test
    public void load_givenFile_shouldParseDocument() throws IOException {
        File tempFile = File.createTempFile("datautil_load_test", ".html");
        tempFile.deleteOnExit();

        String html = "<html><head><title>File Load</title></head><body>File Content</body></html>";
        FileOutputStream fos = new FileOutputStream(tempFile);
        try {
            fos.write(html.getBytes("UTF-8"));
        } finally {
            fos.close();
        }

        Document doc = DataUtil.load(tempFile, "UTF-8", "http://example.com/");

        Assert.assertNotNull(doc);
        Assert.assertEquals("File Load", doc.title());

        tempFile.delete();
    }
}