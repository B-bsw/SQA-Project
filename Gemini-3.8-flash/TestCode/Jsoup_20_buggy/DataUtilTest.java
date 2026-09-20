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
import java.nio.charset.UnsupportedCharsetException;

public class DataUtilTest {

    @Test
    public void constructor_privateAccess_shouldBeInstantiableViaReflection() throws Exception {
        Constructor<DataUtil> constructor = DataUtil.class.getDeclaredConstructor(new Class<?>[0]);
        constructor.setAccessible(true);
        DataUtil instance = constructor.newInstance(new Object[0]);
        Assert.assertNotNull(instance);
    }

    @Test
    public void getCharsetFromContentType_givenNullContentType_shouldReturnNull() {
        // Arrange
        String contentType = null;

        // Act
        String charset = DataUtil.getCharsetFromContentType(contentType);

        // Assert
        Assert.assertNull(charset);
    }

    @Test
    public void getCharsetFromContentType_givenContentTypeWithoutCharset_shouldReturnNull() {
        // Arrange
        String contentType = "text/html";

        // Act
        String charset = DataUtil.getCharsetFromContentType(contentType);

        // Assert
        Assert.assertNull(charset);
    }

    @Test
    public void getCharsetFromContentType_givenStandardCharset_shouldReturnUppercaseCharset() {
        // Arrange
        String contentType = "text/html; charset=utf-8";

        // Act
        String charset = DataUtil.getCharsetFromContentType(contentType);

        // Assert
        Assert.assertEquals("UTF-8", charset);
    }

    @Test
    public void getCharsetFromContentType_givenQuotedCharset_shouldReturnStrippedCharset() {
        // Arrange
        String contentType = "text/html; charset=\"iso-8859-1\"";

        // Act
        String charset = DataUtil.getCharsetFromContentType(contentType);

        // Assert
        Assert.assertEquals("ISO-8859-1", charset);
    }

    @Test
    public void getCharsetFromContentType_givenSpacedAndParametricContentType_shouldReturnCorrectCharset() {
        // Arrange
        String contentType = "text/html; charset = \"Shift_JIS\" ; boundary=something";

        // Act
        String charset = DataUtil.getCharsetFromContentType(contentType);

        // Assert
        Assert.assertEquals("SHIFT_JIS", charset);
    }

    @Test
    public void getCharsetFromContentType_givenNoQuoteWithSemicolon_shouldReturnCorrectCharset() {
        // Arrange
        String contentType = "text/html; charset=gb2312; other=val";

        // Act
        String charset = DataUtil.getCharsetFromContentType(contentType);

        // Assert
        Assert.assertEquals("GB2312", charset);
    }

    @Test
    public void getCharsetFromContentType_givenEmptyCharsetValue_shouldReturnEmptyString() {
        // Arrange
        String contentType = "text/html; charset=";

        // Act
        String charset = DataUtil.getCharsetFromContentType(contentType);

        // Assert
        Assert.assertEquals("", charset);
    }

    @Test
    public void readToByteBuffer_givenEmptyStream_shouldReturnEmptyBuffer() throws IOException {
        // Arrange
        InputStream in = new ByteArrayInputStream(new byte[0]);

        // Act
        ByteBuffer buffer = DataUtil.readToByteBuffer(in);

        // Assert
        Assert.assertNotNull(buffer);
        Assert.assertEquals(0, buffer.remaining());
    }

    @Test
    public void readToByteBuffer_givenSmallStream_shouldReadAllBytes() throws IOException {
        // Arrange
        byte[] expectedData = "Hello World".getBytes(Charset.forName("UTF-8"));
        InputStream in = new ByteArrayInputStream(expectedData);

        // Act
        ByteBuffer buffer = DataUtil.readToByteBuffer(in);

        // Assert
        Assert.assertNotNull(buffer);
        Assert.assertEquals(expectedData.length, buffer.remaining());
        byte[] actualData = new byte[buffer.remaining()];
        buffer.get(actualData);
        Assert.assertArrayEquals(expectedData, actualData);
    }

    @Test
    public void readToByteBuffer_givenStreamLargerThanBufferSize_shouldReadAllBytesAcrossLoops() throws IOException {
        // Arrange: 0x20000 = 131072 bytes. Create 150000 bytes.
        int testSize = 150000;
        byte[] largeData = new byte[testSize];
        for (int i = 0; i < testSize; i++) {
            largeData[i] = (byte) (i % 127);
        }
        InputStream in = new ByteArrayInputStream(largeData);

        // Act
        ByteBuffer buffer = DataUtil.readToByteBuffer(in);

        // Assert
        Assert.assertNotNull(buffer);
        Assert.assertEquals(testSize, buffer.remaining());
        byte[] actualData = new byte[buffer.remaining()];
        buffer.get(actualData);
        Assert.assertArrayEquals(largeData, actualData);
    }

    @Test(expected = IOException.class)
    public void readToByteBuffer_givenFailingStream_shouldThrowIOException() throws IOException {
        // Arrange
        InputStream failingStream = new InputStream() {
            @Override
            public int read() throws IOException {
                throw new IOException("Stream read failed");
            }

            @Override
            public int read(byte[] b, int off, int len) throws IOException {
                throw new IOException("Stream read failed");
            }
        };

        // Act
        DataUtil.readToByteBuffer(failingStream);
    }

    @Test
    public void parseByteData_givenNullCharsetWithoutMeta_shouldDefaultToUtf8() {
        // Arrange
        String html = "<html><head><title>Default UTF-8</title></head><body>Test</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(Charset.forName("UTF-8")));

        // Act
        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("Default UTF-8", doc.title());
        Assert.assertEquals("UTF-8", doc.outputSettings().charset().displayName());
    }

    @Test
    public void parseByteData_givenNullCharsetWithHttpEquivMeta_shouldRedecodeAndSetCharset() {
        // Arrange
        String originalText = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\"><title>H\u00e9llo</title></head><body>Body</body></html>";
        byte[] bytes = originalText.getBytes(Charset.forName("ISO-8859-1"));
        ByteBuffer byteData = ByteBuffer.wrap(bytes);

        // Act
        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("H\u00e9llo", doc.title());
        Assert.assertEquals("ISO-8859-1", doc.outputSettings().charset().displayName());
    }

    @Test
    public void parseByteData_givenNullCharsetWithHtml5MetaCharset_shouldRedecodeAndSetCharset() {
        // Arrange
        String originalText = "<html><head><meta charset=\"iso-8859-1\"><title>H\u00e9llo</title></head><body>Body</body></html>";
        byte[] bytes = originalText.getBytes(Charset.forName("ISO-8859-1"));
        ByteBuffer byteData = ByteBuffer.wrap(bytes);

        // Act
        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("H\u00e9llo", doc.title());
        Assert.assertEquals("ISO-8859-1", doc.outputSettings().charset().displayName());
    }

    @Test
    public void parseByteData_givenNullCharsetWithMetaMatchingDefaultCharset_shouldNotRedecode() {
        // Arrange
        String html = "<html><head><meta charset=\"UTF-8\"><title>UTF-8 Title</title></head><body>Body</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(Charset.forName("UTF-8")));

        // Act
        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("UTF-8 Title", doc.title());
        Assert.assertEquals("UTF-8", doc.outputSettings().charset().displayName());
    }

    @Test
    public void parseByteData_givenNullCharsetWithEmptyMetaCharset_shouldKeepInitialDoc() {
        // Arrange
        String html = "<html><head><meta charset=\"\"><title>Empty Meta Charset</title></head><body>Body</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(Charset.forName("UTF-8")));

        // Act
        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("Empty Meta Charset", doc.title());
    }

    @Test
    public void parseByteData_givenNullCharsetWithHttpEquivWithoutCharsetInContent_shouldKeepInitialDoc() {
        // Arrange
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html\"><title>No Charset</title></head><body>Body</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(Charset.forName("UTF-8")));

        // Act
        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("No Charset", doc.title());
    }

    @Test
    public void parseByteData_givenExplicitValidCharset_shouldDecodeDirectly() {
        // Arrange
        String originalText = "<html><head><title>H\u00e9llo Direct</title></head><body>Body</body></html>";
        byte[] bytes = originalText.getBytes(Charset.forName("ISO-8859-1"));
        ByteBuffer byteData = ByteBuffer.wrap(bytes);

        // Act
        Document doc = DataUtil.parseByteData(byteData, "ISO-8859-1", "http://example.com", Parser.htmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("H\u00e9llo Direct", doc.title());
        Assert.assertEquals("ISO-8859-1", doc.outputSettings().charset().displayName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseByteData_givenEmptyExplicitCharset_shouldThrowIllegalArgumentException() {
        // Arrange
        ByteBuffer byteData = ByteBuffer.wrap("<html><body></body></html>".getBytes(Charset.forName("UTF-8")));

        // Act
        DataUtil.parseByteData(byteData, "", "http://example.com", Parser.htmlParser());
    }

    @Test(expected = UnsupportedCharsetException.class)
    public void parseByteData_givenUnsupportedExplicitCharset_shouldThrowUnsupportedCharsetException() {
        // Arrange
        ByteBuffer byteData = ByteBuffer.wrap("<html><body></body></html>".getBytes(Charset.forName("UTF-8")));

        // Act
        DataUtil.parseByteData(byteData, "NON_EXISTENT_CHARSET_XYZ", "http://example.com", Parser.htmlParser());
    }

    @Test
    public void loadInputStream_givenValidStreamWithNullCharset_shouldParseSuccessfully() throws IOException {
        // Arrange
        String html = "<html><head><title>Stream Test</title></head><body>Content</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes(Charset.forName("UTF-8")));

        // Act
        Document doc = DataUtil.load(in, null, "http://example.com");

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("Stream Test", doc.title());
    }

    @Test
    public void loadInputStream_givenValidStreamWithExplicitCharset_shouldParseSuccessfully() throws IOException {
        // Arrange
        String html = "<html><head><title>Stream UTF-8</title></head><body>Content</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes(Charset.forName("UTF-8")));

        // Act
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com");

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("Stream UTF-8", doc.title());
        Assert.assertEquals("UTF-8", doc.outputSettings().charset().displayName());
    }

    @Test
    public void loadInputStreamWithParser_givenXmlParser_shouldParseAsXmlDocument() throws IOException {
        // Arrange
        String xml = "<xml><tag id=\"1\">Value</tag></xml>";
        InputStream in = new ByteArrayInputStream(xml.getBytes(Charset.forName("UTF-8")));

        // Act
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com", Parser.xmlParser());

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("Value", doc.select("tag").text());
        Assert.assertEquals("1", doc.select("tag").attr("id"));
    }

    @Test
    public void loadFile_givenExistingFile_shouldParseSuccessfully() throws IOException {
        // Arrange
        File tempFile = File.createTempFile("datautil_test", ".html");
        tempFile.deleteOnExit();
        String html = "<html><head><title>File Test</title></head><body>File Content</body></html>";
        FileOutputStream out = new FileOutputStream(tempFile);
        try {
            out.write(html.getBytes(Charset.forName("UTF-8")));
        } finally {
            out.close();
        }

        // Act
        Document doc = DataUtil.load(tempFile, "UTF-8", "http://example.com");

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("File Test", doc.title());
        Assert.assertEquals("File Content", doc.body().text());
    }

    @Test(expected = IOException.class)
    public void loadFile_givenNonExistentFile_shouldThrowIOException() throws IOException {
        // Arrange
        File nonExistentFile = new File("non_existent_file_path_12345.html");

        // Act
        DataUtil.load(nonExistentFile, "UTF-8", "http://example.com");
    }
}