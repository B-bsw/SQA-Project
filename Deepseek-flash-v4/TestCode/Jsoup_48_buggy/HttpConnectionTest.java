package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection.KeyVal;
import org.jsoup.helper.HttpConnection.Request;
import org.jsoup.helper.HttpConnection.Response;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.TokenQueue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

public class HttpConnectionTest {

    private static final String TEST_URL = "http://example.com";
    
    @Test
    public void testConnectString() {
        Connection conn = HttpConnection.connect(TEST_URL);
        Assert.assertNotNull(conn);
        Assert.assertEquals(TEST_URL, conn.request().url().toString());
    }

    @Test
    public void testConnectNullUrlThrowsException() {
        try {
            HttpConnection.connect((String) null);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Must supply a valid URL", e.getMessage());
        }
    }

    @Test
    public void testConnectEmptyUrlThrowsException() {
        try {
            HttpConnection.connect("");
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Must supply a valid URL", e.getMessage());
        }
    }

    @Test
    public void testConnectUrl() throws Exception {
        URL url = new URL(TEST_URL);
        Connection conn = HttpConnection.connect(url);
        Assert.assertNotNull(conn);
        Assert.assertEquals(url, conn.request().url());
    }

    @Test
    public void testEncodeUrl() throws Exception {
        Assert.assertEquals("http://example.com/path%20with%20spaces", 
            HttpConnection.ResponseTestHelper.encodeUrl("http://example.com/path with spaces"));
        Assert.assertNull(HttpConnection.ResponseTestHelper.encodeUrl(null));
        Assert.assertEquals("already encoded", HttpConnection.ResponseTestHelper.encodeUrl("already encoded"));
    }

    @Test
    public void testEncodeMimeName() throws Exception {
        Assert.assertEquals("file%22name", HttpConnection.ResponseTestHelper.encodeMimeName("file\"name"));
        Assert.assertNull(HttpConnection.ResponseTestHelper.encodeMimeName(null));
    }

    @Test
    public void testUrlString() {
        Connection conn = new HttpConnection().url(TEST_URL);
        Assert.assertNotNull(conn);
        Assert.assertEquals(TEST_URL, conn.request().url().toString());
    }

    @Test
    public void testUrlMalformed() {
        try {
            new HttpConnection().url("not a url");
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Malformed URL"));
        }
    }

    @Test
    public void testUserAgent() {
        Connection conn = new HttpConnection().userAgent("test-agent");
        Assert.assertEquals("test-agent", conn.request().header("User-Agent"));
    }

    @Test
    public void testUserAgentNullThrowsException() {
        try {
            new HttpConnection().userAgent(null);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("User agent must not be null", e.getMessage());
        }
    }

    @Test
    public void testTimeout() {
        Connection conn = new HttpConnection().timeout(5000);
        Assert.assertEquals(5000, conn.request().timeout());
    }

    @Test
    public void testMaxBodySize() {
        Connection conn = new HttpConnection().maxBodySize(1024);
        Assert.assertEquals(1024, conn.request().maxBodySize());
    }

    @Test
    public void testFollowRedirects() {
        Connection conn = new HttpConnection().followRedirects(false);
        Assert.assertFalse(conn.request().followRedirects());
    }

    @Test
    public void testReferrer() {
        Connection conn = new HttpConnection().referrer("http://referrer.com");
        Assert.assertEquals("http://referrer.com", conn.request().header("Referer"));
    }

    @Test
    public void testReferrerNullThrowsException() {
        try {
            new HttpConnection().referrer(null);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Referrer must not be null", e.getMessage());
        }
    }

    @Test
    public void testMethod() {
        Connection.Method method = Connection.Method.POST;
        Connection conn = new HttpConnection().method(method);
        Assert.assertEquals(method, conn.request().method());
    }

    @Test
    public void testIgnoreHttpErrors() {
        Connection conn = new HttpConnection().ignoreHttpErrors(true);
        Assert.assertTrue(conn.request().ignoreHttpErrors());
    }

    @Test
    public void testIgnoreContentType() {
        Connection conn = new HttpConnection().ignoreContentType(true);
        Assert.assertTrue(conn.request().ignoreContentType());
    }

    @Test
    public void testValidateTLSCertificates() {
        Connection conn = new HttpConnection().validateTLSCertificates(false);
        Assert.assertFalse(conn.request().validateTLSCertificates());
    }

    @Test
    public void testDataWithStringKeyValue() {
        Connection conn = new HttpConnection().data("key1", "value1");
        Assert.assertTrue(conn.request().data().stream().anyMatch(kv -> 
            kv.key().equals("key1") && kv.value().equals("value1")));
    }

    @Test
    public void testDataWithInputStream() {
        InputStream stream = new ByteArrayInputStream(new byte[0]);
        Connection conn = new HttpConnection().data("file", "test.txt", stream);
        Assert.assertTrue(conn.request().data().stream().anyMatch(kv -> 
            kv.hasInputStream() && kv.key().equals("file") && kv.value().equals("test.txt")));
    }

    @Test
    public void testDataWithMap() {
        Map<String, String> data = new HashMap<String, String>();
        data.put("key1", "value1");
        data.put("key2", "value2");
        Connection conn = new HttpConnection().data(data);
        Assert.assertEquals(2, conn.request().data().size());
    }

    @Test
    public void testDataNullMapThrowsException() {
        try {
            new HttpConnection().data((Map<String, String>) null);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Data map must not be null", e.getMessage());
        }
    }

    @Test
    public void testDataWithVarargs() {
        Connection conn = new HttpConnection().data("key1", "value1", "key2", "value2");
        Assert.assertEquals(2, conn.request().data().size());
    }

    @Test
    public void testDataWithNullVarargsThrowsException() {
        try {
            new HttpConnection().data((String[]) null);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Data key value pairs must not be null", e.getMessage());
        }
    }

    @Test
    public void testDataWithOddVarargsThrowsException() {
        try {
            new HttpConnection().data("key1", "value1", "key2");
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Must supply an even number of key value pairs", e.getMessage());
        }
    }

    @Test
    public void testDataWithEmptyKeyThrowsException() {
        try {
            new HttpConnection().data("", "value");
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Data key must not be empty", e.getMessage());
        }
    }

    @Test
    public void testDataWithNullValueThrowsException() {
        try {
            new HttpConnection().data("key", null);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Data value must not be null", e.getMessage());
        }
    }

    @Test
    public void testDataWithCollection() {
        Collection<Connection.KeyVal> data = new ArrayList<Connection.KeyVal>();
        data.add(KeyVal.create("key1", "value1"));
        data.add(KeyVal.create("key2", "value2"));
        Connection conn = new HttpConnection().data(data);
        Assert.assertEquals(2, conn.request().data().size());
    }

    @Test
    public void testDataNullCollectionThrowsException() {
        try {
            new HttpConnection().data((Collection<Connection.KeyVal>) null);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Data collection must not be null", e.getMessage());
        }
    }

    @Test
    public void testHeader() {
        Connection conn = new HttpConnection().header("Content-Type", "text/html");
        Assert.assertEquals("text/html", conn.request().header("Content-Type"));
    }

    @Test
    public void testHeaderCaseInsensitive() {
        Connection conn = new HttpConnection().header("content-type", "text/html");
        Assert.assertEquals("text/html", conn.request().header("Content-Type"));
    }

    @Test
    public void testCookie() {
        Connection conn = new HttpConnection().cookie("name", "value");
        Assert.assertEquals("value", conn.request().cookie("name"));
    }

    @Test
    public void testCookies() {
        Map<String, String> cookies = new HashMap<String, String>();
        cookies.put("key1", "value1");
        cookies.put("key2", "value2");
        Connection conn = new HttpConnection().cookies(cookies);
        Assert.assertEquals(2, conn.request().cookies().size());
    }

    @Test
    public void testCookiesNullThrowsException() {
        try {
            new HttpConnection().cookies(null);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Cookie map must not be null", e.getMessage());
        }
    }

    @Test
    public void testParser() {
        Parser parser = Parser.htmlParser();
        Connection conn = new HttpConnection().parser(parser);
        Assert.assertEquals(parser, conn.request().parser());
    }

    @Test
    public void testKeyValCreate() {
        KeyVal kv = KeyVal.create("key", "value");
        Assert.assertEquals("key", kv.key());
        Assert.assertEquals("value", kv.value());
        Assert.assertFalse(kv.hasInputStream());
    }

    @Test
    public void testKeyValCreateWithStream() {
        InputStream stream = new ByteArrayInputStream(new byte[0]);
        KeyVal kv = KeyVal.create("key", "filename", stream);
        Assert.assertEquals("key", kv.key());
        Assert.assertEquals("filename", kv.value());
        Assert.assertTrue(kv.hasInputStream());
        Assert.assertEquals(stream, kv.inputStream());
    }

    @Test
    public void testKeyValKeySet() {
        KeyVal kv = KeyVal.create("key", "value");
        kv.key("newKey");
        Assert.assertEquals("newKey", kv.key());
    }

    @Test
    public void testKeyValValueSet() {
        KeyVal kv = KeyVal.create("key", "value");
        kv.value("newValue");
        Assert.assertEquals("newValue", kv.value());
    }

    @Test
    public void testKeyValInputStreamSet() {
        InputStream stream = new ByteArrayInputStream(new byte[0]);
        KeyVal kv = KeyVal.create("key", "value");
        kv.inputStream(stream);
        Assert.assertTrue(kv.hasInputStream());
        Assert.assertEquals(stream, kv.inputStream());
    }

    @Test
    public void testKeyValNullInputStreamThrowsException() {
        KeyVal kv = KeyVal.create("key", "value");
        try {
            kv.inputStream(null);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Data input stream must not be null", e.getMessage());
        }
    }

    @Test
    public void testKeyValToString() {
        KeyVal kv = KeyVal.create("key", "value");
        Assert.assertEquals("key=value", kv.toString());
    }

    @Test
    public void testRequestData() {
        Request req = new Request();
        KeyVal kv = KeyVal.create("key", "value");
        Assert.assertSame(req, req.data(kv));
        Assert.assertEquals(1, req.data().size());
        Assert.assertTrue(req.data().contains(kv));
    }

    @Test
    public void testRequestDataCollection() {
        Request req = new Request();
        KeyVal kv1 = KeyVal.create("key1", "value1");
        KeyVal kv2 = KeyVal.create("key2", "value2");
        req.data(kv1);
        req.data(kv2);
        Assert.assertEquals(2, req.data().size());
    }

    @Test
    public void testRequestMethod() {
        Request req = new Request();
        Connection.Method method = Connection.Method.POST;
        req.method(method);
        Assert.assertEquals(method, req.method());
    }

    @Test
    public void testRequestMethodNullThrowsException() {
        Request req = new Request();
        try {
            req.method(null);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Method must not be null", e.getMessage());
        }
    }

    @Test
    public void testRequestUrl() throws Exception {
        Request req = new Request();
        URL url = new URL(TEST_URL);
        req.url(url);
        Assert.assertEquals(url, req.url());
    }

    @Test
    public void testRequestUrlNullThrowsException() {
        Request req = new Request();
        try {
            req.url((URL) null);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("URL must not be null", e.getMessage());
        }
    }

    @Test
    public void testRequestHeader() {
        Request req = new Request();
        req.header("Content-Type", "text/html");
        Assert.assertEquals("text/html", req.header("Content-Type"));
    }

    @Test
    public void testRequestHeaderNullNameThrowsException() {
        Request req = new Request();
        try {
            req.header(null, "value");
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Header name must not be empty", e.getMessage());
        }
    }

    @Test
    public void testRequestHeaderEmptyNameThrowsException() {
        Request req = new Request();
        try {
            req.header("", "value");
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Header name must not be empty", e.getMessage());
        }
    }

    @Test
    public void testRequestHeaderNullValueThrowsException() {
        Request req = new Request();
        try {
            req.header("name", null);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Header value must not be null", e.getMessage());
        }
    }

    @Test
    public void testRequestHasHeader() {
        Request req = new Request();
        req.header("Content-Type", "text/html");
        Assert.assertTrue(req.hasHeader("Content-Type"));
        Assert.assertFalse(req.hasHeader("Accept"));
    }

    @Test
    public void testRequestHasHeaderCaseInsensitive() {
        Request req = new Request();
        req.header("content-type", "text/html");
        Assert.assertTrue(req.hasHeader("Content-Type"));
    }

    @Test
    public void testRequestHasHeaderWithValue() {
        Request req = new Request();
        req.header("Content-Type", "text/html");
        Assert.assertTrue(req.hasHeaderWithValue("Content-Type", "text/html"));
        Assert.assertFalse(req.hasHeaderWithValue("Content-Type", "application/json"));
    }

    @Test
    public void testRequestRemoveHeader() {
        Request req = new Request();
        req.header("Content-Type", "text/html");
        req.removeHeader("Content-Type");
        Assert.assertFalse(req.hasHeader("Content-Type"));
    }

    @Test
    public void testRequestRemoveHeaderCaseInsensitive() {
        Request req = new Request();
        req.header("Content-Type", "text/html");
        req.removeHeader("content-type");
        Assert.assertFalse(req.hasHeader("Content-Type"));
    }

    @Test
    public void testRequestHeaders() {
        Request req = new Request();
        req.header("Content-Type", "text/html");
        Map<String, String> headers = req.headers();
        Assert.assertEquals(1, headers.size());
        Assert.assertEquals("text/html", headers.get("Content-Type"));
    }

    @Test
    public void testRequestCookie() {
        Request req = new Request();
        req.cookie("name", "value");
        Assert.assertEquals("value", req.cookie("name"));
    }

    @Test
    public void testRequestCookieNullNameThrowsException() {
        Request req = new Request();
        try {
            req.cookie(null);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Cookie name must not be empty", e.getMessage());
        }
    }

    @Test
    public void testRequestCookieNullValueThrowsException() {
        Request req = new Request();
        try {
            req.cookie("name", null);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Cookie value must not be null", e.getMessage());
        }
    }

    @Test
    public void testRequestHasCookie() {
        Request req = new Request();
        req.cookie("name", "value");
        Assert.assertTrue(req.hasCookie("name"));
        Assert.assertFalse(req.hasCookie("other"));
    }

    @Test
    public void testRequestRemoveCookie() {
        Request req = new Request();
        req.cookie("name", "value");
        req.removeCookie("name");
        Assert.assertFalse(req.hasCookie("name"));
    }

    @Test
    public void testRequestCookies() {
        Request req = new Request();
        req.cookie("name1", "value1");
        req.cookie("name2", "value2");
        Map<String, String> cookies = req.cookies();
        Assert.assertEquals(2, cookies.size());
        Assert.assertEquals("value1", cookies.get("name1"));
        Assert.assertEquals("value2", cookies.get("name2"));
    }

    @Test
    public void testRequestTimeout() {
        Request req = new Request();
        req.timeout(5000);
        Assert.assertEquals(5000, req.timeout());
    }

    @Test
    public void testRequestMaxBodySize() {
        Request req = new Request();
        req.maxBodySize(1024);
        Assert.assertEquals(1024, req.maxBodySize());
    }

    @Test
    public void testRequestFollowRedirects() {
        Request req = new Request();
        req.followRedirects(false);
        Assert.assertFalse(req.followRedirects());
    }

    @Test
    public void testRequestIgnoreHttpErrors() {
        Request req = new Request();
        req.ignoreHttpErrors(true);
        Assert.assertTrue(req.ignoreHttpErrors());
    }

    @Test
    public void testRequestIgnoreContentType() {
        Request req = new Request();
        req.ignoreContentType(true);
        Assert.assertTrue(req.ignoreContentType());
    }

    @Test
    public void testRequestValidateTLSCertificates() {
        Request req = new Request();
        req.validateTLSCertificates(false);
        Assert.assertFalse(req.validateTLSCertificates());
    }

    @Test
    public void testRequestParser() {
        Request req = new Request();
        Parser parser = Parser.htmlParser();
        req.parser(parser);
        Assert.assertEquals(parser, req.parser());
    }

    @Test
    public void testRequestPostDataCharset() {
        Request req = new Request();
        req.postDataCharset("UTF-8");
        Assert.assertEquals("UTF-8", req.postDataCharset());
    }

    @Test
    public void testRequestPostDataCharsetInvalid() {
        Request req = new Request();
        try {
            req.postDataCharset("INVALID-CHARSET");
            Assert.fail("Expected IllegalCharsetNameException");
        } catch (IllegalCharsetNameException e) {
            Assert.assertEquals("INVALID-CHARSET", e.getMessage());
        }
    }

    @Test
    public void testResponseParseWithoutExecute() {
        Response res = new Response();
        try {
            res.parse();
            Assert.fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            Assert.assertTrue(e.getMessage().contains("Request must be executed"));
        }
    }

    @Test
    public void testResponseBodyWithoutExecute() {
        Response res = new Response();
        try {
            res.body();
            Assert.fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            Assert.assertTrue(e.getMessage().contains("Request must be executed"));
        }
    }

    @Test
    public void testResponseBodyAsBytes() {
        Response res = new Response();
        byte[] data = "content".getBytes();
        res.byteData = ByteBuffer.wrap(data);
        byte[] result = res.bodyAsBytes();
        Assert.assertArrayEquals(data, result);
    }

    @Test
    public void testResponseBodyAsBytesNullData() {
        Response res = new Response();
        Assert.assertNull(res.bodyAsBytes());
    }

    @Test
    public void testResponseStatusMethods() {
        Response res = new Response();
        res.statusCode = 200;
        res.statusMessage = "OK";
        Assert.assertEquals(200, res.statusCode());
        Assert.assertEquals("OK", res.statusMessage());
    }

    @Test
    public void testResponseCharset() {
        Response res = new Response();
        res.charset = "UTF-8";
        Assert.assertEquals("UTF-8", res.charset());
    }

    @Test
    public void testResponseContentType() {
        Response res = new Response();
        res.contentType = "text/html";
        Assert.assertEquals("text/html", res.contentType());
    }

    @Test
    public void testResponseHasHeader() {
        Response res = new Response();
        res.header("Content-Type", "text/html");
        Assert.assertTrue(res.hasHeader("Content-Type"));
        Assert.assertFalse(res.hasHeader("Accept"));
    }

    @Test
    public void testResponseHasHeaderCaseInsensitive() {
        Response res = new Response();
        res.header("content-type", "text/html");
        Assert.assertTrue(res.hasHeader("Content-Type"));
    }

    @Test
    public void testResponseHasHeaderWithValue() {
        Response res = new Response();
        res.header("Content-Type", "text/html");
        Assert.assertTrue(res.hasHeaderWithValue("Content-Type", "text/html"));
        Assert.assertFalse(res.hasHeaderWithValue("Content-Type", "application/json"));
    }

    @Test
    public void testResponseRemoveHeader() {
        Response res = new Response();
        res.header("Content-Type", "text/html");
        res.removeHeader("Content-Type");
        Assert.assertFalse(res.hasHeader("Content-Type"));
    }

    @Test
    public void testResponseRemoveHeaderCaseInsensitive() {
        Response res = new Response();
        res.header("Content-Type", "text/html");
        res.removeHeader("content-type");
        Assert.assertFalse(res.hasHeader("Content-Type"));
    }

    @Test
    public void testResponseHeaders() {
        Response res = new Response();
        res.header("Content-Type", "text/html");
        Map<String, String> headers = res.headers();
        Assert.assertEquals(1, headers.size());
        Assert.assertEquals("text/html", headers.get("Content-Type"));
    }

    @Test
    public void testResponseHeaderNullNameThrowsException() {
        Response res = new Response();
        try {
            res.header((String) null);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Header name must not be null", e.getMessage());
        }
    }

    @Test
    public void testResponseCookie() {
        Response res = new Response();
        res.cookie("name", "value");
        Assert.assertEquals("value", res.cookie("name"));
    }

    @Test
    public void testResponseCookieNullNameThrowsException() {
        Response res = new Response();
        try {
            res.cookie(null);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Cookie name must not be empty", e.getMessage());
        }
    }

    @Test
    public void testResponseCookieNullValueThrowsException() {
        Response res = new Response();
        try {
            res.cookie("name", null);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Cookie value must not be null", e.getMessage());
        }
    }

    @Test
    public void testResponseHasCookie() {
        Response res = new Response();
        res.cookie("name", "value");
        Assert.assertTrue(res.hasCookie("name"));
        Assert.assertFalse(res.hasCookie("other"));
    }

    @Test
    public void testResponseRemoveCookie() {
        Response res = new Response();
        res.cookie("name", "value");
        res.removeCookie("name");
        Assert.assertFalse(res.hasCookie("name"));
    }

    @Test
    public void testResponseCookies() {
        Response res = new Response();
        res.cookie("name1", "value1");
        res.cookie("name2", "value2");
        Map<String, String> cookies = res.cookies();
        Assert.assertEquals(2, cookies.size());
        Assert.assertEquals("value1", cookies.get("name1"));
        Assert.assertEquals("value2", cookies.get("name2"));
    }

    @Test
    public void testResponseRequestMethods() {
        Response res = new Response();
        Assert.assertNull(res.request());
        Request req = new Request();
        res.request(req);
        Assert.assertEquals(req, res.request());
        Assert.assertNull(res.response());
        res.response((Connection.Response) res);
        Assert.assertEquals(res, res.response());
    }

    @Test
    public void testResponseUrl() throws Exception {
        Response res = new Response();
        URL url = new URL(TEST_URL);
        res.url(url);
        Assert.assertEquals(url, res.url());
    }

    @Test
    public void testResponseMethod() {
        Response res = new Response();
        Connection.Method method = Connection.Method.POST;
        res.method(method);
        Assert.assertEquals(method, res.method());
    }

    @Test
    public void testRequestFactoryBase() {
        Base<Request> base = new Base<Request>() {
            @Override
            public Request data(Connection.KeyVal keyval) {
                return null;
            }
        };
        Assert.assertNull(base.headers());
        Assert.assertNull(base.cookies());
        Assert.assertNull(base.method());
    }

    @Test
    public void testRequestBaseHeaderCaseInsensitive() {
        Request req = new Request();
        req.header("X-Custom-Header", "value");
        Assert.assertEquals("value", req.header("x-custom-header"));
    }

    @Test
    public void testResponseSetCookies() {
        Response res = new Response();
        Map<String, String> cookies = new LinkedHashMap<String, String>();
        cookies.put("key", "value");
        res.cookies = cookies;
        Assert.assertEquals(cookies, res.cookies());
    }

    @Test
    public void testHttpConnectionConnectEmptyStringThrows() {
        try {
            HttpConnection.connect("");
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Must supply a valid URL", e.getMessage());
        }
    }

    @Test
    public void testHttpConnectionConnectWhitespaceStringThrows() {
        try {
            HttpConnection.connect("   ");
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Must supply a valid URL", e.getMessage());
        }
    }

    @Test
    public void testRequestDataDuplicateKeys() {
        Request req = new Request();
        req.data(KeyVal.create("key", "value1"));
        req.data(KeyVal.create("key", "value2"));
        Assert.assertEquals(2, req.data().size());
        Assert.assertEquals("value1", req.data().iterator().next().value());
    }

    @Test
    public void testKeyValValueWithBlanks() {
        KeyVal kv = KeyVal.create("key", " value with spaces ");
        Assert.assertEquals(" value with spaces ", kv.value());
    }

    @Test
    public void testRequestClearData() {
        Request req = new Request();
        req.data(KeyVal.create("key", "value"));
        req.data().clear();
        Assert.assertTrue(req.data().isEmpty());
    }

    @Test
    public void testRequestPostDataCharsetUTF8() {
        Request req = new Request();
        req.postDataCharset("UTF-8");
        Assert.assertEquals("UTF-8", req.postDataCharset());
    }

    @Test
    public void testRequestDefaultPostDataCharset() {
        Request req = new Request();
        Assert.assertNull(req.postDataCharset());
    }

    @Test
    public void testResponseParseThrowsUnsupportedMimeType() throws IOException {
        Response res = new Response();
        res.contentType = "application/json";
        res.statusCode = 200;
        res.executed = true;
        try {
            res.parse();
            Assert.fail("Expected UnsupportedMimeTypeException");
        } catch (UnsupportedMimeTypeException e) {
            Assert.assertEquals("application/json", e.getMimeType());
        }
    }

    @Test
    public void testResponseParseThrowsHttpStatusError() throws IOException {
        Response res = new Response();
        res.contentType = "text/html";
        res.statusCode = 404;
        res.statusMessage = "Not Found";
        res.executed = true;
        res.url = new URL(TEST_URL);
        try {
            res.parse();
            Assert.fail("Expected HttpStatusException");
        } catch (HttpStatusException e) {
            Assert.assertEquals(404, e.getStatusCode());
            Assert.assertEquals(TEST_URL, e.getUrl());
        }
    }

    @Test
    public void testResponseParseHtml() throws IOException {
        Response res = new Response();
        res.contentType = "text/html";
        res.statusCode = 200;
        res.executed = true;
        res.byteData = ByteBuffer.wrap("<html><body><p>Hello</p></body></html>".getBytes());
        res.charset = "UTF-8";
        Document doc = res.parse();
        Assert.assertNotNull(doc);
        Assert.assertEquals("Hello", doc.select("p").first().text());
    }

    @Test
    public void testResponseToString() {
        Response res = new Response();
        res.header("a", "b");
        Assert.assertNotNull(res.toString());
    }
}