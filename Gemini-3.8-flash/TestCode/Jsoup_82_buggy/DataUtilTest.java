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
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class DataUtilTest {

    @Test
    public void constructor_shouldBePrivate() throws Exception {
        Constructor constructor = DataUtil.class.getDeclaredConstructor(new Class[0]);
        Assert.assertTrue(java.lang.reflect.Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        Object instance = constructor.newInstance(new Object[0]);
        Assert.assertNotNull(instance);
    }

    @Test
    public void emptyByteBuffer_shouldReturnZeroCapacityBuffer() {
        ByteBuffer buffer = DataUtil.emptyByteBuffer();
        Assert.assertNotNull(buffer);
        Assert.assertEquals(0, buffer.capacity());
        Assert.assertEquals(0, buffer.remaining());
    }

    @Test
    public void mimeBoundary_shouldReturnRandomStringOfExpectedLength() {
        String boundary1 = DataUtil.mimeBoundary();
        String boundary2 = DataUtil.mimeBoundary();

        Assert.assertNotNull(boundary1);
        Assert.assertEquals(DataUtil.boundaryLength, boundary1.length());
        Assert.assertNotNull(boundary2);
        Assert.assertEquals(DataUtil.boundaryLength, boundary2.length());

        char[] chars = boundary1.toCharArray();
        String allowed = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < chars.length; i++) {
            Assert.assertTrue(allowed.indexOf(chars[i]) != -1);
        }
    }

    @Test
    public void getCharsetFromContentType_givenNull_shouldReturnNull() {
        Assert.assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void getCharsetFromContentType_givenNoCharset_shouldReturnNull() {
        Assert.assertNull(DataUtil.getCharsetFromContentType("text/html"));
        Assert.assertNull(DataUtil.getCharsetFromContentType("text/html; no-charset-here"));
    }

    @Test
    public void getCharsetFromContentType_givenValidCharsets_shouldExtractAndValidate() {
        Assert.assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=utf-8"));
        Assert.assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=\"UTF-8\""));
        Assert.assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset='utf-8'"));
        Assert.assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType("text/html; charset=ISO-8859-1; other=param"));
        Assert.assertEquals("US-ASCII", DataUtil.getCharsetFromContentType("text/plain; charset=us-ascii"));
    }

    @Test
    public void getCharsetFromContentType_givenInvalidOrUnsupportedCharset_shouldReturnNull() {
        Assert.assertNull(DataUtil.getCharsetFromContentType("text/html; charset=unsupported-charset-xyz-999"));
        Assert.assertNull(DataUtil.getCharsetFromContentType("text/html; charset=\"\""));
        Assert.assertNull(DataUtil.getCharsetFromContentType("text/html; charset=invalid/illegal?charset"));
    }

    @Test
    public void readToByteBuffer_givenNegativeMaxSize_shouldThrowIllegalArgumentException() {
        InputStream in = new ByteArrayInputStream(new byte[] { 1, 2, 3 });
        try {
            DataUtil.readToByteBuffer(in, -1);
            Assert.fail("Expected IllegalArgumentException for negative maxSize");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("maxSize must be 0 (unlimited) or larger", e.getMessage());
        } catch (IOException e) {
            Assert.fail("Unexpected IOException: " + e.getMessage());
        }
    }

    @Test
    public void readToByteBuffer_givenUnlimitedMaxSize_shouldReadAllBytes() throws IOException {
        byte[] expected = "Hello Jsoup DataUtil".getBytes("UTF-8");
        InputStream in = new ByteArrayInputStream(expected);
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 0);

        Assert.assertEquals(expected.length, buffer.remaining());
        byte[] actual = new byte[buffer.remaining()];
        buffer.get(actual);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void readToByteBuffer_givenLimitedMaxSize_shouldReadUpToMaxSize() throws IOException {
        byte[] source = "0123456789ABCDEF".getBytes("UTF-8");
        InputStream in = new ByteArrayInputStream(source);
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 5);

        Assert.assertEquals(5, buffer.remaining());
        byte[] actual = new byte[5];
        buffer.get(actual);
        Assert.assertArrayEquals("01234".getBytes("UTF-8"), actual);
    }

    @Test
    public void crossStreams_givenInput_shouldWriteEntireContentToOutput() throws IOException {
        byte[] source = new byte[DataUtil.bufferSize + 1024];
        for (int i = 0; i < source.length; i++) {
            source[i] = (byte) (i % 127);
        }

        ByteArrayInputStream in = new ByteArrayInputStream(source);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        DataUtil.crossStreams(in, out);
        byte[] result = out.toByteArray();

        Assert.assertEquals(source.length, result.length);
        Assert.assertArrayEquals(source, result);
    }

    @Test
    public void crossStreams_givenEmptyInputStream_shouldWriteNothing() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[0]);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        DataUtil.crossStreams(in, out);
        Assert.assertEquals(0, out.size());
    }

    @Test
    public void parseInputStream_givenNullInput_shouldReturnDocumentWithBaseUri() throws IOException {
        String baseUri = "http://example.com/base/";
        Document doc = DataUtil.parseInputStream(null, "UTF-8", baseUri, Parser.htmlParser());

        Assert.assertNotNull(doc);
        Assert.assertEquals(baseUri, doc.baseUri());
        Assert.assertEquals("", doc.body().text());
    }

    @Test
    public void parseInputStream_givenEmptyCharset_shouldThrowIllegalArgumentException() throws IOException {
        InputStream in = new ByteArrayInputStream("<html><body>Hello</body></html>".getBytes("UTF-8"));
        try {
            DataUtil.parseInputStream(in, "", "http://example.com", Parser.htmlParser());
            Assert.fail("Expected IllegalArgumentException when charset is empty");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().indexOf("Must set charset arg") != -1);
        }
    }

    @Test
    public void parseInputStream_givenExplicitCharset_shouldParseAndSetOutputSettings() throws IOException {
        String html = "<html><head><title>Explicit</title></head><body>Test</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("ISO-8859-1"));
        Document doc = DataUtil.parseInputStream(in, "ISO-8859-1", "http://example.com", Parser.htmlParser());

        Assert.assertNotNull(doc);
        Assert.assertEquals("Explicit", doc.title());
        Assert.assertEquals(Charset.forName("ISO-8859-1"), doc.outputSettings().charset());
    }

    @Test
    public void parseInputStream_givenMetaHttpEquivCharset_shouldDetectAndReDecode() throws IOException {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"></head><body>ReDecode</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("ISO-8859-1"));
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com", Parser.htmlParser());

        Assert.assertNotNull(doc);
        Assert.assertEquals(Charset.forName("ISO-8859-1"), doc.outputSettings().charset());
        Assert.assertTrue(doc.body().text().contains("ReDecode"));
    }

    @Test
    public void parseInputStream_givenMetaCharsetHtml5_shouldDetectAndReDecode() throws IOException {
        String html = "<html><head><meta charset=\"ISO-8859-1\"></head><body>ReDecode HTML5</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("ISO-8859-1"));
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com", Parser.htmlParser());

        Assert.assertNotNull(doc);
        Assert.assertEquals(Charset.forName("ISO-8859-1"), doc.outputSettings().charset());
        Assert.assertTrue(doc.body().text().contains("ReDecode HTML5"));
    }

    @Test
    public void parseInputStream_givenMetaCharsetMatchesDefaultUtf8_andFullyRead_shouldKeepFirstParsedDoc() throws IOException {
        String html = "<html><head><meta charset=\"utf-8\"><title>UTF8</title></head><body>Body</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com", Parser.htmlParser());

        Assert.assertNotNull(doc);
        Assert.assertEquals("UTF8", doc.title());
        Assert.assertEquals(Charset.forName("UTF-8"), doc.outputSettings().charset());
    }

    @Test
    public void parseInputStream_givenXmlDeclarationEncoding_shouldDetectAndReDecode() throws IOException {
        String xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><root><message>Content</message></root>";
        InputStream in = new ByteArrayInputStream(xml.getBytes("ISO-8859-1"));
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com", Parser.xmlParser());

        Assert.assertNotNull(doc);
        Assert.assertEquals(Charset.forName("ISO-8859-1"), doc.outputSettings().charset());
        Assert.assertEquals("Content", doc.select("message").text());
    }

    @Test
    public void parseInputStream_givenCommentXmlDeclarationEncoding_shouldDetectAndReDecode() throws IOException {
        String xml = "<!--?xml version=\"1.0\" encoding=\"ISO-8859-1\"?--><html><body>CommentDecl</body></html>";
        InputStream in = new ByteArrayInputStream(xml.getBytes("ISO-8859-1"));
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com", Parser.htmlParser());

        Assert.assertNotNull(doc);
        Assert.assertEquals(Charset.forName("ISO-8859-1"), doc.outputSettings().charset());
    }

    @Test
    public void parseInputStream_givenUtf8Bom_shouldDetectCharsetAndSkipOffset() throws IOException {
        byte[] bom = new byte[] { (byte) 0xEF, (byte) 0xBB, (byte) 0xBF };
        byte[] content = "<html><head><title>UTF-8 BOM</title></head><body>Body</body></html>".getBytes("UTF-8");
        byte[] full = new byte[bom.length + content.length];
        System.arraycopy(bom, 0, full, 0, bom.length);
        System.arraycopy(content, 0, full, bom.length, content.length);

        InputStream in = new ByteArrayInputStream(full);
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com", Parser.htmlParser());

        Assert.assertNotNull(doc);
        Assert.assertEquals("UTF-8 BOM", doc.title());
        Assert.assertEquals(Charset.forName("UTF-8"), doc.outputSettings().charset());
    }

    @Test
    public void parseInputStream_givenUtf16BeBom_shouldDetectCharset() throws IOException {
        byte[] bom = new byte[] { (byte) 0xFE, (byte) 0xFF };
        byte[] content = "<html><head><title>UTF-16BE</title></head><body>Body</body></html>".getBytes("UTF-16BE");
        byte[] full = new byte[bom.length + content.length];
        System.arraycopy(bom, 0, full, 0, bom.length);
        System.arraycopy(content, 0, full, bom.length, content.length);

        InputStream in = new ByteArrayInputStream(full);
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com", Parser.htmlParser());

        Assert.assertNotNull(doc);
        Assert.assertEquals("UTF-16BE", doc.title());
    }

    @Test
    public void parseInputStream_givenUtf16LeBom_shouldDetectCharset() throws IOException {
        byte[] bom = new byte[] { (byte) 0xFF, (byte) 0xFE };
        byte[] content = "<html><head><title>UTF-16LE</title></head><body>Body</body></html>".getBytes("UTF-16LE");
        byte[] full = new byte[bom.length + content.length];
        System.arraycopy(bom, 0, full, 0, bom.length);
        System.arraycopy(content, 0, full, bom.length, content.length);

        InputStream in = new ByteArrayInputStream(full);
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com", Parser.htmlParser());

        Assert.assertNotNull(doc);
        Assert.assertEquals("UTF-16LE", doc.title());
    }

    @Test
    public void parseInputStream_givenShortStream_shouldNotCrashBomDetection() throws IOException {
        byte[] small = new byte[] { 'a', 'b' };
        InputStream in = new ByteArrayInputStream(small);
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com", Parser.htmlParser());

        Assert.assertNotNull(doc);
        Assert.assertEquals(Charset.forName("UTF-8"), doc.outputSettings().charset());
    }

    @Test
    public void parseInputStream_givenLargeStream_shouldNotBeFullyReadOnFirstBytes() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("<html><head><title>Large</title></head><body>");
        for (int i = 0; i < 8000; i++) {
            sb.append("<p>Paragraph content ").append(i).append("</p>");
        }
        sb.append("</body></html>");

        byte[] bytes = sb.toString().getBytes("UTF-8");
        InputStream in = new ByteArrayInputStream(bytes);
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com", Parser.htmlParser());

        Assert.assertNotNull(doc);
        Assert.assertEquals("Large", doc.title());
        Assert.assertEquals(8000, doc.select("p").size());
    }

    @Test
    public void parseInputStream_givenIOExceptionInReader_shouldPropagateIOException() {
        final byte[] prefix = "<html><head><meta charset='ISO-8859-1'></head><body>".getBytes();
        InputStream faultyStream = new InputStream() {
            private int index = 0;
            private boolean markResetDone = false;

            public int read() throws IOException {
                if (index < prefix.length) {
                    return prefix[index++] & 0xFF;
                }
                if (markResetDone) {
                    throw new IOException("Simulated IO failure while parsing stream");
                }
                return -1;
            }

            public synchronized void reset() throws IOException {
                index = 0;
                markResetDone = true;
            }

            public synchronized void mark(int readlimit) {}

            public boolean markSupported() {
                return true;
            }
        };

        try {
            DataUtil.parseInputStream(faultyStream, null, "http://example.com", Parser.htmlParser());
            Assert.fail("Expected IOException during reading of stream");
        } catch (IOException e) {
            Assert.assertNotNull(e);
        }
    }

    @Test
    public void load_fromInputStreamWithCharset_shouldParseDocument() throws IOException {
        String html = "<html><head><title>Load Test</title></head><body>Stream Load</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com");

        Assert.assertNotNull(doc);
        Assert.assertEquals("Load Test", doc.title());
        Assert.assertEquals("Stream Load", doc.body().text());
    }

    @Test
    public void load_fromInputStreamWithParser_shouldUseProvidedParser() throws IOException {
        String xml = "<root><element id='1'>Text</element></root>";
        InputStream in = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com", Parser.xmlParser());

        Assert.assertNotNull(doc);
        Assert.assertEquals("Text", doc.select("element").text());
    }

    @Test
    public void load_fromFile_shouldParseDocumentSuccessfully() throws IOException {
        File tempFile = File.createTempFile("datautil_test", ".html");
        tempFile.deleteOnExit();

        OutputStream out = new FileOutputStream(tempFile);
        try {
            String content = "<html><head><title>File Load</title></head><body>Hello File</body></html>";
            out.write(content.getBytes("UTF-8"));
        } finally {
            out.close();
        }

        Document doc = DataUtil.load(tempFile, "UTF-8", "http://example.com");
        Assert.assertNotNull(doc);
        Assert.assertEquals("File Load", doc.title());
        Assert.assertEquals("Hello File", doc.body().text());

        tempFile.delete();
    }
}