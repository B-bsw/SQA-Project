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
    public void privateConstructor_givenReflection_shouldInstantiateSuccessfully() throws Exception {
        Constructor constructor = DataUtil.class.getDeclaredConstructor(new Class[0]);
        constructor.setAccessible(true);
        Object instance = constructor.newInstance(new Object[0]);
        Assert.assertNotNull(instance);
        Assert.assertTrue(instance instanceof DataUtil);
    }

    @Test
    public void getCharsetFromContentType_givenNullContentType_shouldReturnNull() {
        String charset = DataUtil.getCharsetFromContentType(null);
        Assert.assertNull(charset);
    }

    @Test
    public void getCharsetFromContentType_givenNoCharsetInHeader_shouldReturnNull() {
        String charset = DataUtil.getCharsetFromContentType("text/html; boundary=something");
        Assert.assertNull(charset);
    }

    @Test
    public void getCharsetFromContentType_givenStandardCharset_shouldReturnUppercasedCharset() {
        String charset = DataUtil.getCharsetFromContentType("text/html; charset=utf-8");
        Assert.assertEquals("UTF-8", charset);
    }

    @Test
    public void getCharsetFromContentType_givenQuotedCharset_shouldReturnStrippedCharset() {
        String charset = DataUtil.getCharsetFromContentType("text/html; charset=\"iso-8859-1\"");
        Assert.assertEquals("ISO-8859-1", charset);
    }

    @Test
    public void getCharsetFromContentType_givenSpacedAndMixedCase_shouldExtractCorrectly() {
        String charset = DataUtil.getCharsetFromContentType("text/html; CHARSET = \"windows-1252\" ; boundary=abc");
        Assert.assertEquals("WINDOWS-1252", charset);
    }

    @Test
    public void getCharsetFromContentType_givenEmptyCharsetValue_shouldReturnEmptyString() {
        String charset = DataUtil.getCharsetFromContentType("text/html; charset=");
        Assert.assertEquals("", charset);
    }

    @Test
    public void readToByteBuffer_givenEmptyStream_shouldReturnEmptyBuffer() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ByteBuffer buffer = DataUtil.readToByteBuffer(in);
        Assert.assertNotNull(buffer);
        Assert.assertEquals(0, buffer.remaining());
    }

    @Test
    public void readToByteBuffer_givenSmallStream_shouldReadEntireContent() throws IOException {
        byte[] expected = "Legacy Test String".getBytes("UTF-8");
        InputStream in = new ByteArrayInputStream(expected);
        ByteBuffer buffer = DataUtil.readToByteBuffer(in);

        Assert.assertEquals(expected.length, buffer.remaining());
        byte[] actual = new byte[buffer.remaining()];
        buffer.get(actual);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void readToByteBuffer_givenStreamLargerThanBufferSize_shouldReadCompletely() throws IOException {
        int largeSize = 0x20000 + 1024; // bufferSize + 1KB
        byte[] largeData = new byte[largeSize];
        for (int i = 0; i < largeSize; i++) {
            largeData[i] = (byte) (i % 127);
        }
        InputStream in = new ByteArrayInputStream(largeData);
        ByteBuffer buffer = DataUtil.readToByteBuffer(in);

        Assert.assertEquals(largeSize, buffer.remaining());
        byte[] actual = new byte[buffer.remaining()];
        buffer.get(actual);
        Assert.assertArrayEquals(largeData, actual);
    }

    @Test
    public void parseByteData_givenExplicitCharsetWithoutBOM_shouldParseDocument() {
        String html = "<html><body><p>Test</p></body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(Charset.forName("UTF-8")));

        Document doc = DataUtil.parseByteData(buffer, "UTF-8", "http://example.com", Parser.htmlParser());
        Assert.assertNotNull(doc);
        Assert.assertEquals("Test", doc.select("p").first().text());
        Assert.assertEquals("UTF-8", doc.outputSettings().charset().displayName());
    }

    @Test
    public void parseByteData_givenExplicitCharsetWithBOM_shouldStripBOMAndParse() {
        String html = "\uFEFF<html><body><p>BOM Test</p></body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(Charset.forName("UTF-8")));

        Document doc = DataUtil.parseByteData(buffer, "UTF-8", "http://example.com", Parser.htmlParser());
        Assert.assertNotNull(doc);
        Assert.assertEquals("BOM Test", doc.select("p").first().text());
    }

    @Test
    public void parseByteData_givenEmptyCharset_shouldThrowIllegalArgumentException() {
        String html = "<html><body></body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(Charset.forName("UTF-8")));

        try {
            DataUtil.parseByteData(buffer, "", "http://example.com", Parser.htmlParser());
            Assert.fail("Should have thrown IllegalArgumentException due to empty charset name");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().indexOf("Must set charset arg") != -1);
        }
    }

    @Test
    public void parseByteData_givenNullCharsetAndNoMeta_shouldDefaultToUtf8() {
        String html = "<html><head><title>Default</title></head><body>Hello</body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(Charset.forName("UTF-8")));

        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());
        Assert.assertNotNull(doc);
        Assert.assertEquals("Default", doc.title());
    }

    @Test
    public void parseByteData_givenNullCharsetAndMetaHttpEquivDifferentCharset_shouldReDecode() {
        String html = "<html><head><meta http-equiv=\"content-type\" content=\"text/html; charset=ISO-8859-1\"></head><body>ReDecode</body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(Charset.forName("ISO-8859-1")));

        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());
        Assert.assertNotNull(doc);
        Assert.assertEquals("ReDecode", doc.body().text());
        Assert.assertEquals("ISO-8859-1", doc.outputSettings().charset().displayName());
    }

    @Test
    public void parseByteData_givenNullCharsetAndMetaCharsetHtml5DifferentCharset_shouldReDecode() {
        String html = "<html><head><meta charset=\"ISO-8859-1\"></head><body>HTML5 Meta</body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(Charset.forName("ISO-8859-1")));

        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());
        Assert.assertNotNull(doc);
        Assert.assertEquals("HTML5 Meta", doc.body().text());
        Assert.assertEquals("ISO-8859-1", doc.outputSettings().charset().displayName());
    }

    @Test
    public void parseByteData_givenNullCharsetAndMetaHttpEquivUtf8_shouldNotReDecode() {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"></head><body>Already UTF-8</body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(Charset.forName("UTF-8")));

        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());
        Assert.assertNotNull(doc);
        Assert.assertEquals("Already UTF-8", doc.body().text());
    }

    @Test
    public void parseByteData_givenNullCharsetAndReDecodeWithBOM_shouldStripBOM() {
        String html = "\uFEFF<html><head><meta charset=\"ISO-8859-1\"></head><body>BOM ReDecode</body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(Charset.forName("ISO-8859-1")));

        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());
        Assert.assertNotNull(doc);
        Assert.assertEquals("BOM ReDecode", doc.body().text());
    }

    @Test
    public void parseByteData_givenNullCharsetAndMetaWithEmptyCharset_shouldNotReDecode() {
        String html = "<html><head><meta charset=\"\"></head><body>Empty Charset Meta</body></html>";
        ByteBuffer buffer = ByteBuffer.wrap(html.getBytes(Charset.forName("UTF-8")));

        Document doc = DataUtil.parseByteData(buffer, null, "http://example.com", Parser.htmlParser());
        Assert.assertNotNull(doc);
        Assert.assertEquals("Empty Charset Meta", doc.body().text());
    }

    @Test
    public void loadInputStream_givenParserParam_shouldParseDocumentCorrectly() throws IOException {
        String html = "<html><head><title>Parser Load</title></head><body></body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));

        Document doc = DataUtil.load(in, "UTF-8", "http://example.com", Parser.htmlParser());
        Assert.assertNotNull(doc);
        Assert.assertEquals("Parser Load", doc.title());
    }

    @Test
    public void loadInputStream_givenDefaultParser_shouldParseDocumentCorrectly() throws IOException {
        String html = "<html><head><title>Stream Load</title></head><body></body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));

        Document doc = DataUtil.load(in, "UTF-8", "http://example.com");
        Assert.assertNotNull(doc);
        Assert.assertEquals("Stream Load", doc.title());
    }

    @Test
    public void loadFile_givenValidFile_shouldReadAndParseDocument() throws IOException {
        File tempFile = File.createTempFile("datautil_test", ".html");
        tempFile.deleteOnExit();

        FileOutputStream out = null;
        try {
            out = new FileOutputStream(tempFile);
            out.write("<html><head><title>File Load</title></head><body>File Content</body></html>".getBytes("UTF-8"));
            out.flush();
        } finally {
            if (out != null) {
                out.close();
            }
        }

        Document doc = DataUtil.load(tempFile, "UTF-8", "http://example.com");
        Assert.assertNotNull(doc);
        Assert.assertEquals("File Load", doc.title());
        Assert.assertEquals("File Content", doc.body().text());

        tempFile.delete();
    }

    @Test(expected = IOException.class)
    public void loadFile_givenNonExistentFile_shouldThrowIOException() throws IOException {
        File nonExistent = new File("non_existent_file_" + System.currentTimeMillis() + ".html");
        DataUtil.load(nonExistent, "UTF-8", "http://example.com");
    }
}