package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Before;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class HttpConnectionTest {
    private HttpConnection conn;
    private HttpConnection.Request req;

    @Before
    public void setUp() {
        conn = new HttpConnection();
        req = new HttpConnection.Request();
    }

    @Test
    public void testConnectStringCreatesAndUrls() {
        Connection c = HttpConnection.connect("http://example.com");
        assertNotNull(c.request().url());
        assertEquals("http://example.com", c.request().url().toExternalForm());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConnectNullStringThrows() {
        HttpConnection.connect((String) null);
    }

    @Test
    public void testConnectURLCreatesAndUrls() throws Exception {
        URL url = new URL("http://example.com");
        Connection c = HttpConnection.connect(url);
        assertSame(url, c.request().url());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConnectNullURLThrows() {
        HttpConnection.connect((URL) null);
    }

    @Test
    public void testUrlNormal() {
        conn.url("http://example.com");
        assertEquals("http://example.com", conn.request().url().toExternalForm());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUrlEmptyThrows() {
        conn.url("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUrlMalformedThrows() {
        conn.url("not a url");
    }

    @Test
    public void testEncodeUrlURL() throws Exception {
        URL in = new URL("http://example.com/path?q=hello");
        URL out = HttpConnection.encodeUrl(in);
        assertEquals(in.toExternalForm(), out.toExternalForm());
    }

    @Test
    public void testEncodeUrlNullReturnsNull() {
        assertNull(HttpConnection.encodeUrl((URL) null));
    }

    @Test
    public void testUserAgentAndReferrer() {
        conn.userAgent("UA").referrer("http://ref");
        assertEquals("UA", conn.request().header("User-Agent"));
        assertEquals("http://ref", conn.request().header("Referer"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUserAgentNullThrows() {
        conn.userAgent(null);
    }

    @Test
    public void testTimeoutAndMaxBodySize() {
        conn.timeout(5000).maxBodySize(1024);
        assertEquals(5000, conn.request().timeout());
        assertEquals(1024, conn.request().maxBodySize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTimeoutNegativeThrows() {
        conn.timeout(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxBodySizeNegativeThrows() {
        conn.maxBodySize(-1);
    }

    @Test
    public void testFollowRedirectsAndIgnoreFlags() {
        conn.followRedirects(false).ignoreHttpErrors(true).ignoreContentType(true);
        HttpConnection.Request r = (HttpConnection.Request) conn.request();
        assertFalse(r.followRedirects());
        assertTrue(r.ignoreHttpErrors());
        assertTrue(r.ignoreContentType());
    }

    @Test
    public void testMethodSetter() {
        conn.method(Connection.Method.POST);
        assertEquals(Connection.Method.POST, conn.request().method());
    }

    @Test
    public void testProxyWithHostPort() {
        conn.proxy("localhost", 8080);
        Proxy p = ((HttpConnection.Request) conn.request()).proxy();
        assertNotNull(p);
        assertEquals(Proxy.Type.HTTP, p.type());
        assertEquals(8080, ((InetSocketAddress) p.address()).getPort());
    }

    @Test
    public void testProxyWithProxyObject() {
        Proxy p = new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved("proxy", 8080));
        conn.proxy(p);
        assertSame(p, ((HttpConnection.Request) conn.request()).proxy());
    }

    @Test
    public void testDataKeyVal() {
        conn.data("a", "b");
        Collection<Connection.KeyVal> data = conn.request().data();
        assertEquals(1, data.size());
        Connection.KeyVal kv = data.iterator().next();
        assertEquals("a", kv.key());
        assertEquals("b", kv.value());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataOddArrayThrows() {
        conn.data("a", "b", "c");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataEmptyKeyThrows() {
        conn.data("", "v");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataNullValueThrows() {
        conn.data("k", null);
    }

    @Test
    public void testDataMap() {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("k1", "v1");
        map.put("k2", "v2");
        conn.data(map);
        assertEquals(2, conn.request().data().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataMapNullThrows() {
        conn.data((Map<String, String>) null);
    }

    @Test
    public void testDataCollection() {
        List<Connection.KeyVal> list = new ArrayList<>();
        list.add(HttpConnection.KeyVal.create("k", "v"));
        conn.data(list);
        assertEquals(1, conn.request().data().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataCollectionNullThrows() {
        conn.data((Collection<Connection.KeyVal>) null);
    }

    @Test
    public void testDataLookup() {
        conn.data("key", "value");
        assertNotNull(conn.data("key"));
        assertNull(conn.data("missing"));
    }

    @Test
    public void testDataWithInputStream() {
        InputStream in = new ByteArrayInputStream(new byte[]{1});
        conn.data("file", "f.txt", in);
        Connection.KeyVal kv = conn.request().data().iterator().next();
        assertTrue(kv.hasInputStream());
        assertSame(in, kv.inputStream());
    }

    @Test
    public void testDataWithInputStreamAndContentType() {
        InputStream in = new ByteArrayInputStream(new byte[]{1});
        conn.data("file", "f.txt", in, "text/plain");
        Connection.KeyVal kv = conn.request().data().iterator().next();
        assertEquals("text/plain", kv.contentType());
    }

    @Test
    public void testRequestBody() {
        conn.requestBody("body");
        assertEquals("body", conn.request().requestBody());
    }

    @Test
    public void testHeaders() {
        HttpConnection.Request r = (HttpConnection.Request) conn.request();
        r.header("X-Test", "one");
        assertEquals("one", r.header("X-Test"));
        r.addHeader("X-Test", "two");
        assertEquals("one, two", r.header("X-Test"));
        assertTrue(r.hasHeader("x-test"));
        assertTrue(r.hasHeaderWithValue("x-test", "TWO"));
        assertEquals(Arrays.asList("one", "two"), r.headers("X-Test"));
        assertEquals("one", r.headers().get("X-Test"));
        r.removeHeader("x-test");
        assertFalse(r.hasHeader("X-Test"));
        assertTrue(r.headers("X-Test").isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHeaderNullNameThrows() {
        conn.header(null, "v");
    }

    @Test
    public void testHeadersMap() {
        Map<String, String> headers = new LinkedHashMap<>();
        headers.put("A", "1");
        headers.put("B", "2");
        conn.headers(headers);
        assertEquals("1", conn.request().header("a"));
        assertEquals("2", conn.request().header("b"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHeadersMapNullThrows() {
        conn.headers(null);
    }

    @Test
    public void testCookies() {
        HttpConnection.Request r = (HttpConnection.Request) conn.request();
        r.cookie("name", "value");
        assertEquals("value", r.cookie("name"));
        assertTrue(r.hasCookie("name"));
        r.removeCookie("name");
        assertFalse(r.hasCookie("name"));
    }

    @Test
    public void testCookiesMap() {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("a", "1");
        conn.cookies(map);
        assertEquals("1", ((HttpConnection.Request) conn.request()).cookie("a"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCookiesMapNullThrows() {
        conn.cookies((Map<String, String>) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCookieNullNameThrows() {
        conn.cookie(null, "v");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCookieNullValueThrows() {
        conn.cookie("c", null);
    }

    @Test
    public void testParserSetter() {
        Parser p = Parser.xmlParser();
        conn.parser(p);
        assertSame(p, ((HttpConnection.Request) conn.request()).parser());
    }

    @Test
    public void testRequestResponseAccessors() {
        HttpConnection.Request r = new HttpConnection.Request();
        HttpConnection.Response s = new HttpConnection.Response();
        assertSame(conn, conn.request(r));
        assertSame(r, conn.request());
        assertSame(conn, conn.response(s));
        assertSame(s, conn.response());
    }

    @Test
    public void testPostDataCharset() {
        conn.postDataCharset("UTF-16");
        assertEquals("UTF-16", ((HttpConnection.Request) conn.request()).postDataCharset());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPostDataCharsetNullThrows() {
        conn.postDataCharset(null);
    }

    @Test(expected = IllegalCharsetNameException.class)
    public void testPostDataCharsetInvalidThrows() {
        conn.postDataCharset("not-a-charset");
    }

    @Test
    public void testRequestDefaults() {
        assertEquals(30000, req.timeout());
        assertEquals(1024 * 1024, req.maxBodySize());
        assertTrue(req.followRedirects());
        assertFalse(req.ignoreHttpErrors());
        assertFalse(req.ignoreContentType());
        assertNotNull(req.parser());
        assertTrue(req.data().isEmpty());
        assertNull(req.proxy());
        assertNull(req.requestBody());
        assertNull(req.sslSocketFactory());
        assertEquals("UTF-8", req.postDataCharset());
    }

    @Test
    public void testRequestTimeoutZeroAllowed() {
        req.timeout(0);
        assertEquals(0, req.timeout());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRequestTimeoutNegativeThrows() {
        req.timeout(-1);
    }

    @Test
    public void testRequestMaxBodySizeZeroAllowed() {
        req.maxBodySize(0);
        assertEquals(0, req.maxBodySize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRequestMaxBodySizeNegativeThrows() {
        req.maxBodySize(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRequestDataNullKeyValThrows() {
        req.data(null);
    }

    @Test
    public void testKeyValCreate() {
        Connection.KeyVal kv = HttpConnection.KeyVal.create("k", "v");
        assertEquals("k", kv.key());
        assertEquals("v", kv.value());
        assertEquals("k=v", kv.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testKeyValEmptyKeyThrows() {
        HttpConnection.KeyVal.create("", "v");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testKeyValNullValueThrows() {
        HttpConnection.KeyVal.create("k", null);
    }

    @Test
    public void testKeyValInputStream() {
        InputStream in = new ByteArrayInputStream(new byte[]{0});
        Connection.KeyVal kv = HttpConnection.KeyVal.create("file", "f.txt", in);
        assertTrue(kv.hasInputStream());
        assertSame(in, kv.inputStream());
        kv.contentType("text/plain");
        assertEquals("text/plain", kv.contentType());
    }

    @Test
    public void testResponseDefaults() {
        HttpConnection.Response res = new HttpConnection.Response();
        assertEquals(0, res.statusCode());
        assertNull(res.statusMessage());
        assertNull(res.charset());
        assertNull(res.contentType());
    }

    @Test
    public void testResponseCharsetSetter() {
        HttpConnection.Response res = new HttpConnection.Response();
        res.charset("UTF-16");
        assertEquals("UTF-16", res.charset());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseWithoutExecuteThrows() throws IOException {
        new HttpConnection.Response().parse();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBodyWithoutExecuteThrows() {
        new HttpConnection.Response().body();
    }

    @Test
    public void testProcessResponseHeadersCookiesAndHeaders() {
        HttpConnection.Response res = new HttpConnection.Response();
        Map<String, List<String>> headers = new LinkedHashMap<>();
        headers.put("Set-Cookie", Arrays.asList("a=1; Path=/", "b=2; Path=/"));
        headers.put("Content-Type", Arrays.asList("text/html; charset=utf-8"));
        res.processResponseHeaders(headers);
        assertEquals("1", res.cookie("a"));
        assertEquals("2", res.cookie("b"));
        assertEquals("text/html; charset=utf-8", res.header("Content-Type"));
    }

    @Test
    public void testProcessResponseHeadersSkipsNullName() {
        HttpConnection.Response res = new HttpConnection.Response();
        Map<String, List<String>> headers = new LinkedHashMap<>();
        headers.put(null, Collections.singletonList("x"));
        headers.put("X-Test", Collections.singletonList("y"));
        res.processResponseHeaders(headers);
        assertFalse(res.multiHeaders().containsKey(null));
        assertEquals("y", res.header("X-Test"));
    }

    @Test
    public void testProcessResponseHeadersWithSetCookieNullValue() {
        HttpConnection.Response res = new HttpConnection.Response();
        Map<String, List<String>> headers = new LinkedHashMap<>();
        headers.put("Set-Cookie", Collections.<String>singletonList(null));
        res.processResponseHeaders(headers);
        assertTrue(res.cookies().isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testResponseExecuteNullRequestThrows() throws IOException {
        HttpConnection.Response.execute(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testResponseExecuteRequestWithoutUrlThrows() throws IOException {
        HttpConnection.Response.execute(new HttpConnection.Request());
    }

    @Test
    public void testSslSocketFactory() {
        assertNull(((HttpConnection.Request) conn.request()).sslSocketFactory());
        SSLSocketFactory factory = SSLSocketFactory.getDefault();
        conn.sslSocketFactory(factory);
        assertSame(factory, ((HttpConnection.Request) conn.request()).sslSocketFactory());
    }
}