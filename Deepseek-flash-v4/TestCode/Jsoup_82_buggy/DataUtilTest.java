package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

import static org.junit.Assert.*;

public class DataUtilTest {

    private static final String BASE_URI = "http://example.com/";
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");

    @Test
    public void loadNullInputStreamReturnsEmptyDocument() throws Exception {
        Document doc = DataUtil.load((InputStream) null, "UTF-8", BASE_URI);
        assertNotNull(doc);
        assertEquals("", doc.body().text());
    }

    @Test
    public void loadFileParsesDocument() throws Exception {
        File file = File.createTempFile("DataUtilTest", ".html");
        try {
            FileOutputStream out = new FileOutputStream(file);
            try {
                out.write("<html><body>Hello</body></html>".getBytes(UTF_8));
            } finally {
                out.close();
            }

            Document doc = DataUtil.load(file, "UTF-8", BASE_URI);
            assertEquals("Hello", doc.body().text());
        } finally {
            file.delete();
        }
    }

    @Test
    public void loadInputStreamParsesDocument() throws Exception {
        byte[] html = "<html><body>Hello</body></html>".getBytes(UTF_8);
        Document doc = DataUtil.load(new ByteArrayInputStream(html), "UTF-8", BASE_URI);
        assertEquals("Hello", doc.body().text());
    }

    @Test
    public void loadWithXmlParserUsesProvidedParser() throws Exception {
        byte[] xml = "<root><child/></root>".getBytes(UTF_8);
        Document doc = DataUtil.load(new ByteArrayInputStream(xml), "UTF-8", BASE_URI, Parser.xmlParser());
        assertEquals("root", doc.child(0).nodeName());
    }

    @Test
    public void loadDetectsCharsetFromMeta() throws Exception {
        String html = "<html><head><meta charset=\"ISO-8859-1\"></head><body>Caf\u00e9</body></html>";
        byte[] bytes = html.getBytes(ISO_8859_1);

        Document doc = DataUtil.load(new ByteArrayInputStream(bytes), null, BASE_URI);
        assertEquals("Caf\u00e9", doc.body().text());
    }

    @Test
    public void loadDetectsUtf8Bom() throws Exception {
        byte[] body = "<html><body>Hello</body></html>".getBytes(UTF_8);
        byte[] bytes = new byte[3 + body.length];
        bytes[0] = (byte) 0xEF;
        bytes[1] = (byte) 0xBB;
        bytes[2] = (byte) 0xBF;
        System.arraycopy(body, 0, bytes, 3, body.length);

        Document doc = DataUtil.load(new ByteArrayInputStream(bytes), null, BASE_URI);
        assertEquals("Hello", doc.body().text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void loadRejectsEmptyCharsetName() throws Exception {
        byte[] html = "<html></html>".getBytes(UTF_8);
        DataUtil.load(new ByteArrayInputStream(html), "", BASE_URI);
    }

    @Test
    public void readToByteBufferUnlimitedReturnsAllBytes() throws Exception {
        ByteBuffer buffer = DataUtil.readToByteBuffer(new ByteArrayInputStream("Hello".getBytes(UTF_8)), 0);
        assertEquals("Hello", readUtf8(buffer));
    }

    @Test
    public void readToByteBufferWithLimitReturnsBytesWhenBelowLimit() throws Exception {
        ByteBuffer buffer = DataUtil.readToByteBuffer(new ByteArrayInputStream("Hello".getBytes(UTF_8)), 100);
        assertEquals("Hello", readUtf8(buffer));
    }

    @Test(expected = IllegalArgumentException.class)
    public void readToByteBufferRejectsNegativeMaxSize() throws Exception {
        DataUtil.readToByteBuffer(new ByteArrayInputStream("x".getBytes(UTF_8)), -1);
    }

    @Test
    public void crossStreamsCopiesEmptyStream() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DataUtil.crossStreams(new ByteArrayInputStream(new byte[0]), out);
        assertEquals(0, out.toByteArray().length);
    }

    @Test
    public void crossStreamsCopiesSmallStream() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DataUtil.crossStreams(new ByteArrayInputStream("hello".getBytes(UTF_8)), out);
        assertEquals("hello", new String(out.toByteArray(), UTF_8));
    }

    @Test
    public void crossStreamsCopiesLargeStream() throws Exception {
        byte[] data = new byte[(64 * 1024) + 19];
        Arrays.fill(data, (byte) 'x');

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DataUtil.crossStreams(new ByteArrayInputStream(data), out);
        assertArrayEquals(data, out.toByteArray());
    }

    @Test
    public void mimeBoundaryHasExpectedLength() {
        String boundary = DataUtil.mimeBoundary();
        assertEquals(DataUtil.boundaryLength, boundary.length());
    }

    @Test
    public void charsetFromContentTypeIsParsed() {
        assertNull(DataUtil.getCharsetFromContentType(null));
        assertNull(DataUtil.getCharsetFromContentType("text/html"));
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset=invalid-charset"));
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=UTF-8"));
        assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType("text/html; charset=\"ISO-8859-1\""));
    }

    private static String readUtf8(ByteBuffer buffer) {
        byte[] bytes = new byte[buffer.remaining()];
        buffer.get(bytes);
        return new String(bytes, UTF_8);
    }
}