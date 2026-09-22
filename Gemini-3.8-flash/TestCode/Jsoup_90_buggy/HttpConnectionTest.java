package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HttpConnectionTest {

    @Test
    public void connect_givenValidUrlString_shouldCreateHttpConnectionWithUrl() throws MalformedURLException {
        // Arrange
        String urlString = "http://example.com/test?a=1";

        // Act
        Connection connection = HttpConnection.connect(urlString);

        // Assert
        Assert.assertNotNull(connection);
        Assert.assertEquals(new URL(urlString), connection.request().url());
    }

    @Test
    public void connect_givenUrlWithSpaces_shouldEncodeSpaces() throws MalformedURLException {
        // Arrange
        String urlString = "http://example.com/path with spaces/test";

        // Act
        Connection connection = HttpConnection.connect(urlString);

        // Assert
        Assert.assertEquals("http://example.com/path%20with%20spaces/test", connection.request().url().toExternalForm());
    }

    @Test
    public void connect_givenValidUrlObject_shouldCreateHttpConnectionWithUrl() throws MalformedURLException {
        // Arrange
        URL url = new URL("https://example.com");

        // Act
        Connection connection = HttpConnection.connect(url);

        // Assert
        Assert.assertNotNull(connection);
        Assert.assertEquals(url, connection.request().url());
    }

    @Test(expected = IllegalArgumentException.class)
    public void url_givenEmptyString_shouldThrowIllegalArgumentException() {
        // Arrange
        Connection connection = new HttpConnection();

        // Act
        connection.url("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void url_givenNullString_shouldThrowIllegalArgumentException() {
        // Arrange
        Connection connection = new HttpConnection();

        // Act
        connection.url((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void url_givenMalformedUrlString_shouldThrowIllegalArgumentException() {
        // Arrange
        Connection connection = new HttpConnection();

        // Act
        connection.url("invalid_url_protocol://test");
    }

    @Test(expected = IllegalArgumentException.class)
    public void url_givenNullUrlObject_shouldThrowIllegalArgumentException() {
        // Arrange
        Connection connection = new HttpConnection();

        // Act
        connection.url((URL) null);
    }

    @Test
    public void proxy_givenProxyObject_shouldSetProxy() {
        // Arrange
        Connection connection = new HttpConnection();
        Proxy proxy = Proxy.NO_PROXY;

        // Act
        connection.proxy(proxy);

        // Assert
        Assert.assertEquals(proxy, connection.request().proxy());
    }

    @Test
    public void proxy_givenHostAndPort_shouldSetHttpProxy() {
        // Arrange
        Connection connection = new HttpConnection();

        // Act
        connection.proxy("localhost", 8080);

        // Assert
        Assert.assertNotNull(connection.request().proxy());
        Assert.assertEquals(Proxy.Type.HTTP, connection.request().proxy().type());
    }

    @Test
    public void userAgent_givenValidUserAgent_shouldSetHeader() {
        // Arrange
        Connection connection = new HttpConnection();
        String customUA = "CustomAgent/1.0";

        // Act
        connection.userAgent(customUA);

        // Assert
        Assert.assertEquals(customUA, connection.request().header("User-Agent"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void userAgent_givenNull_shouldThrowIllegalArgumentException() {
        // Arrange
        Connection connection = new HttpConnection();

        // Act
        connection.userAgent(null);
    }

    @Test
    public void timeout_givenPositiveMillis_shouldSetTimeout() {
        // Arrange
        Connection connection = new HttpConnection();

        // Act
        connection.timeout(5000);

        // Assert
        Assert.assertEquals(5000, connection.request().timeout());
    }

    @Test(expected = IllegalArgumentException.class)
    public void timeout_givenNegativeMillis_shouldThrowIllegalArgumentException() {
        // Arrange
        Connection connection = new HttpConnection();

        // Act
        connection.timeout(-1);
    }

    @Test
    public void maxBodySize_givenPositiveBytes_shouldSetMaxBodySize() {
        // Arrange
        Connection connection = new HttpConnection();

        // Act
        connection.maxBodySize(2048);

        // Assert
        Assert.assertEquals(2048, connection.request().maxBodySize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void maxBodySize_givenNegativeBytes_shouldThrowIllegalArgumentException() {
        // Arrange
        Connection connection = new HttpConnection();

        // Act
        connection.maxBodySize(-10);
    }

    @Test
    public void followRedirects_givenBoolean_shouldSetFollowRedirects() {
        // Arrange
        Connection connection = new HttpConnection();

        // Act
        connection.followRedirects(false);

        // Assert
        Assert.assertFalse(connection.request().followRedirects());
    }

    @Test
    public void referrer_givenValidReferrer_shouldSetRefererHeader() {
        // Arrange
        Connection connection = new HttpConnection();
        String ref = "http://referrer.com";

        // Act
        connection.referrer(ref);

        // Assert
        Assert.assertEquals(ref, connection.request().header("Referer"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void referrer_givenNullReferrer_shouldThrowIllegalArgumentException() {
        // Arrange
        Connection connection = new HttpConnection();

        // Act
        connection.referrer(null);
    }

    @Test
    public void method_givenValidMethod_shouldSetMethod() {
        // Arrange
        Connection connection = new HttpConnection();

        // Act
        connection.method(Connection.Method.POST);

        // Assert
        Assert.assertEquals(Connection.Method.POST, connection.request().method());
    }

    @Test(expected = IllegalArgumentException.class)
    public void method_givenNullMethod_shouldThrowIllegalArgumentException() {
        // Arrange
        Connection connection = new HttpConnection();

        // Act
        connection.method(null);
    }

    @Test
    public void ignoreHttpErrors_givenBoolean_shouldSetIgnoreHttpErrors() {
        // Arrange
        Connection connection = new HttpConnection();

        // Act
        connection.ignoreHttpErrors(true);

        // Assert
        Assert.assertTrue(connection.request().ignoreHttpErrors());
    }

    @Test
    public void ignoreContentType_givenBoolean_shouldSetIgnoreContentType() {
        // Arrange
        Connection connection = new HttpConnection();

        // Act
        connection.ignoreContentType(true);

        // Assert
        Assert.assertTrue(connection.request().ignoreContentType());
    }

    @Test
    public void data_givenKeyValueStrings_shouldAddKeyVal() {
        // Arrange
        Connection connection = new HttpConnection();

        // Act
        connection.data("foo", "bar");

        // Assert
        Connection.KeyVal kv = connection.data("foo");
        Assert.assertNotNull(kv);
        Assert.assertEquals("bar", kv.value());
    }

    @Test
    public void data_givenKeyFilenameInputStream_shouldAddKeyValWithStream() {
        // Arrange
        Connection connection = new HttpConnection();
        InputStream stream = new ByteArrayInputStream("test".getBytes());

        // Act
        connection.data("fileKey", "file.txt", stream);

        // Assert
        Connection.KeyVal kv = connection.data("fileKey");
        Assert.assertNotNull(kv);
        Assert.assertEquals("file.txt", kv.value());
        Assert.assertEquals(stream, kv.inputStream());
        Assert.assertTrue(kv.hasInputStream());
    }

    @Test
    public void data_givenKeyFilenameInputStreamAndContentType_shouldAddKeyValWithContentType() {
        // Arrange
        Connection connection = new HttpConnection();
        InputStream stream = new ByteArrayInputStream("content".getBytes());

        // Act
        connection.data("fileKey2", "img.png", stream, "image/png");

        // Assert
        Connection.KeyVal kv = connection.data("fileKey2");
        Assert.assertNotNull(kv);
        Assert.assertEquals("img.png", kv.value());
        Assert.assertEquals("image/png", kv.contentType());
    }

    @Test
    public void data_givenMap_shouldAddAllEntries() {
        // Arrange
        Connection connection = new HttpConnection();
        Map<String, String> map = new HashMap<String, String>();
        map.put("k1", "v1");
        map.put("k2", "v2");

        // Act
        connection.data(map);

        // Assert
        Assert.assertEquals("v1", connection.data("k1").value());
        Assert.assertEquals("v2", connection.data("k2").value());
    }

    @Test(expected = IllegalArgumentException.class)
    public void data_givenNullMap_shouldThrowIllegalArgumentException() {
        // Arrange
        Connection connection = new HttpConnection();

        // Act
        connection.data((Map<String, String>) null);
    }

    @Test
    public void data_givenVarargs_shouldAddKeyValues() {
        // Arrange
        Connection connection = new HttpConnection();

        // Act
        connection.data("param1", "val1", "param2", "val2");

        // Assert
        Assert.assertEquals("val1", connection.data("param1").value());
        Assert.assertEquals("val2", connection.data("param2").value());
    }

    @Test(expected = IllegalArgumentException.class)
    public void data_givenOddVarargs_shouldThrowIllegalArgumentException() {
        // Arrange
        Connection connection = new HttpConnection();

        // Act
        connection.data("odd1", "val1", "odd2");
    }

    @Test(expected = IllegalArgumentException.class)
    public void data_givenNullVarargs_shouldThrowIllegalArgumentException() {
        // Arrange
        Connection connection = new HttpConnection();

        // Act
        connection.data((String[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void data_givenEmptyKeyInVarargs_shouldThrowIllegalArgumentException() {
        // Arrange
        Connection connection = new HttpConnection();

        // Act
        connection.data("", "value");
    }

    @Test(expected = IllegalArgumentException.class)
    public void data_givenNullValueInVarargs_shouldThrowIllegalArgumentException() {
        // Arrange
        Connection connection = new HttpConnection();

        // Act
        connection.data("key", null);
    }

    @Test
    public void data_givenCollection_shouldAddAll() {
        // Arrange
        Connection connection = new HttpConnection();
        Collection<Connection.KeyVal> coll = new ArrayList<Connection.KeyVal>();
        coll.add(HttpConnection.KeyVal.create("colKey1", "colVal1"));
        coll.add(HttpConnection.KeyVal.create("colKey2", "colVal2"));

        // Act
        connection.data(coll);

        // Assert
        Assert.assertEquals("colVal1", connection.data("colKey1").value());
        Assert.assertEquals("colVal2", connection.data("colKey2").value());
    }

    @Test(expected = IllegalArgumentException.class)
    public void data_givenNullCollection_shouldThrowIllegalArgumentException() {
        // Arrange
        Connection connection = new HttpConnection();

        // Act
        connection.data((Collection<Connection.KeyVal>) null);
    }

    @Test
    public void data_givenNonExistentKey_shouldReturnNull() {
        // Arrange
        Connection connection = new HttpConnection();

        // Act
        Connection.KeyVal kv = connection.data("nonExistentKey");

        // Assert
        Assert.assertNull(kv);
    }

    @Test(expected = IllegalArgumentException.class)
    public void data_givenEmptyKeySearch_shouldThrowIllegalArgumentException() {
        // Arrange
        Connection connection = new HttpConnection();

        // Act
        connection.data("");
    }

    @Test
    public void sslSocketFactory_givenFactory_shouldStoreInRequest() {
        // Arrange
        Connection connection = new HttpConnection();
        SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();

        // Act
        connection.sslSocketFactory(factory);

        // Assert
        Assert.assertEquals(factory, connection.request().sslSocketFactory());
    }

    @Test
    public void requestBody_givenString_shouldSetRequestBody() {
        // Arrange
        Connection connection = new HttpConnection();
        String json = "{\"key\":\"value\"}";

        // Act
        connection.requestBody(json);

        // Assert
        Assert.assertEquals(json, connection.request().requestBody());
    }

    @Test
    public void header_givenNameAndValue_shouldSetHeader() {
        // Arrange
        Connection connection = new HttpConnection();

        // Act
        connection.header("Accept", "text/plain");

        // Assert
        Assert.assertEquals("text/plain", connection.request().header("Accept"));
    }

    @Test
    public void headers_givenMap_shouldSetAllHeaders() {
        // Arrange
        Connection connection = new HttpConnection();
        Map<String, String> map = new HashMap<String, String>();
        map.put("X-Custom-1", "V1");
        map.put("X-Custom-2", "V2");

        // Act
        connection.headers(map);

        // Assert
        Assert.assertEquals("V1", connection.request().header("X-Custom-1"));
        Assert.assertEquals("V2", connection.request().header("X-Custom-2"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void headers_givenNullMap_shouldThrowIllegalArgumentException() {
        // Arrange
        Connection connection = new HttpConnection();

        // Act
        connection.headers(null);
    }

    @Test
    public void cookie_givenNameAndValue_shouldSetCookie() {
        // Arrange
        Connection connection = new HttpConnection();

        // Act
        connection.cookie("session_id", "12345");

        // Assert
        Assert.assertEquals("12345", connection.request().cookie("session_id"));
    }

    @Test
    public void cookies_givenMap_shouldSetAllCookies() {
        // Arrange
        Connection connection = new HttpConnection();
        Map<String, String> map = new HashMap<String, String>();
        map.put("c1", "v1");
        map.put("c2", "v2");

        // Act
        connection.cookies(map);

        // Assert
        Assert.assertEquals("v1", connection.request().cookie("c1"));
        Assert.assertEquals("v2", connection.request().cookie("c2"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void cookies_givenNullMap_shouldThrowIllegalArgumentException() {
        // Arrange
        Connection connection = new HttpConnection();

        // Act
        connection.cookies(null);
    }

    @Test
    public void parser_givenCustomParser_shouldSetParser() {
        // Arrange
        Connection connection = new HttpConnection();
        Parser xmlParser = Parser.xmlParser();

        // Act
        connection.parser(xmlParser);

        // Assert
        Assert.assertEquals(xmlParser, connection.request().parser());
    }

    @Test
    public void postDataCharset_givenSupportedCharset_shouldSetCharset() {
        // Arrange
        Connection connection = new HttpConnection();

        // Act
        connection.postDataCharset("UTF-8");

        // Assert
        Assert.assertEquals("UTF-8", connection.request().postDataCharset());
    }

    @Test(expected = IllegalCharsetNameException.class)
    public void postDataCharset_givenUnsupportedCharset_shouldThrowIllegalCharsetNameException() {
        // Arrange
        Connection connection = new HttpConnection();

        // Act
        connection.postDataCharset("non-existent-charset-1234");
    }

    @Test(expected = IllegalArgumentException.class)
    public void postDataCharset_givenNullCharset_shouldThrowIllegalArgumentException() {
        // Arrange
        Connection connection = new HttpConnection();

        // Act
        connection.postDataCharset(null);
    }

    @Test
    public void requestAndResponse_givenCustomObjects_shouldSetAndGet() {
        // Arrange
        Connection connection = new HttpConnection();
        Connection.Request req = new HttpConnection.Request();
        Connection.Response res = new HttpConnection.Response();

        // Act
        connection.request(req);
        connection.response(res);

        // Assert
        Assert.assertEquals(req, connection.request());
        Assert.assertEquals(res, connection.response());
    }

    @Test
    public void baseHeaders_givenMultipleValues_shouldJoinWithComma() {
        // Arrange
        HttpConnection.Request req = new HttpConnection.Request();

        // Act
        req.addHeader("Accept", "text/html");
        req.addHeader("Accept", "application/xhtml+xml");

        // Assert
        Assert.assertEquals("text/html, application/xhtml+xml", req.header("Accept"));
        Assert.assertEquals(2, req.headers("Accept").size());
        Assert.assertTrue(req.hasHeader("accept"));
        Assert.assertTrue(req.hasHeaderWithValue("accept", "text/html"));
        Assert.assertTrue(req.hasHeaderWithValue("accept", "application/xhtml+xml"));
        Assert.assertFalse(req.hasHeaderWithValue("accept", "application/json"));
    }

    @Test
    public void baseHeaders_givenUtf8HeaderEncoding_shouldFixIsoBytesToUtf8() throws Exception {
        // Arrange
        HttpConnection.Request req = new HttpConnection.Request();
        String original = "Café";
        String isoBroken = new String(original.getBytes("UTF-8"), "ISO-8859-1");

        // Act
        req.header("Custom-Header", isoBroken);

        // Assert
        Assert.assertEquals("Café", req.header("Custom-Header"));
    }

    @Test
    public void baseHeaders_removeHeader_shouldBeCaseInsensitive() {
        // Arrange
        HttpConnection.Request req = new HttpConnection.Request();
        req.header("Custom-Header", "Value1");

        // Act
        req.removeHeader("custom-header");

        // Assert
        Assert.assertFalse(req.hasHeader("Custom-Header"));
        Assert.assertNull(req.header("Custom-Header"));
    }

    @Test
    public void baseHeaders_headersMap_shouldReturnSingleValuePerKey() {
        // Arrange
        HttpConnection.Request req = new HttpConnection.Request();
        req.addHeader("Key", "val1");
        req.addHeader("Key", "val2");

        // Act
        Map<String, String> singleMap = req.headers();

        // Assert
        Assert.assertEquals("val1", singleMap.get("Key"));
    }

    @Test
    public void baseCookies_cookieOperations_shouldSetCheckAndRemove() {
        // Arrange
        HttpConnection.Request req = new HttpConnection.Request();

        // Act
        req.cookie("name1", "val1");

        // Assert
        Assert.assertTrue(req.hasCookie("name1"));
        Assert.assertEquals("val1", req.cookie("name1"));

        // Act & Assert removal
        req.removeCookie("name1");
        Assert.assertFalse(req.hasCookie("name1"));
        Assert.assertNull(req.cookie("name1"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void baseCookie_givenEmptyName_shouldThrowIllegalArgumentException() {
        // Arrange
        HttpConnection.Request req = new HttpConnection.Request();

        // Act
        req.cookie("", "val");
    }

    @Test(expected = IllegalArgumentException.class)
    public void baseCookie_givenNullValue_shouldThrowIllegalArgumentException() {
        // Arrange
        HttpConnection.Request req = new HttpConnection.Request();

        // Act
        req.cookie("key", null);
    }

    @Test
    public void keyVal_createSimple_shouldSetKeyAndValue() {
        // Arrange & Act
        HttpConnection.KeyVal kv = HttpConnection.KeyVal.create("key1", "val1");

        // Assert
        Assert.assertEquals("key1", kv.key());
        Assert.assertEquals("val1", kv.value());
        Assert.assertFalse(kv.hasInputStream());
        Assert.assertNull(kv.inputStream());
        Assert.assertEquals("key1=val1", kv.toString());
    }

    @Test
    public void keyVal_createWithStream_shouldSetKeyFilenameAndStream() {
        // Arrange
        InputStream stream = new ByteArrayInputStream("data".getBytes());

        // Act
        HttpConnection.KeyVal kv = HttpConnection.KeyVal.create("fileKey", "file.bin", stream);
        kv.contentType("application/octet-stream");

        // Assert
        Assert.assertEquals("fileKey", kv.key());
        Assert.assertEquals("file.bin", kv.value());
        Assert.assertTrue(kv.hasInputStream());
        Assert.assertEquals(stream, kv.inputStream());
        Assert.assertEquals("application/octet-stream", kv.contentType());
    }

    @Test(expected = IllegalArgumentException.class)
    public void keyVal_givenEmptyKey_shouldThrowIllegalArgumentException() {
        // Arrange & Act
        HttpConnection.KeyVal.create("", "val");
    }

    @Test(expected = IllegalArgumentException.class)
    public void keyVal_givenNullValue_shouldThrowIllegalArgumentException() {
        // Arrange & Act
        HttpConnection.KeyVal.create("key", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void keyVal_givenEmptyContentType_shouldThrowIllegalArgumentException() {
        // Arrange
        HttpConnection.KeyVal kv = HttpConnection.KeyVal.create("key", "val");

        // Act
        kv.contentType("");
    }

    @Test
    public void processResponseHeaders_givenSetCookieHeader_shouldParseCookies() {
        // Arrange
        HttpConnection.Response res = new HttpConnection.Response();
        Map<String, List<String>> headers = new LinkedHashMap<String, List<String>>();
        List<String> cookies = new ArrayList<String>();
        cookies.add("session=abcd1234; Path=/; HttpOnly");
        cookies.add("token=xyz987; Domain=example.com");
        cookies.add("=invalid; Path=/");
        cookies.add(null);
        headers.put("Set-Cookie", cookies);
        headers.put(null, Collections.singletonList("HTTP/1.1 200 OK"));

        // Act
        res.processResponseHeaders(headers);

        // Assert
        Assert.assertEquals("abcd1234", res.cookie("session"));
        Assert.assertEquals("xyz987", res.cookie("token"));
    }

    @Test
    public void response_gettersAndSetters_shouldWorkCorrectly() {
        // Arrange
        HttpConnection.Response res = new HttpConnection.Response();

        // Act
        res.charset("UTF-8");

        // Assert
        Assert.assertEquals("UTF-8", res.charset());
        Assert.assertEquals(0, res.statusCode());
        Assert.assertNull(res.statusMessage());
        Assert.assertNull(res.contentType());
    }

    @Test(expected = IllegalArgumentException.class)
    public void responseParse_notExecuted_shouldThrowIllegalArgumentException() throws IOException {
        // Arrange
        HttpConnection.Response res = new HttpConnection.Response();

        // Act
        res.parse();
    }

    @Test(expected = IllegalArgumentException.class)
    public void responseBody_notExecuted_shouldThrowIllegalArgumentException() {
        // Arrange
        HttpConnection.Response res = new HttpConnection.Response();

        // Act
        res.body();
    }

    @Test(expected = IllegalArgumentException.class)
    public void responseBodyAsBytes_notExecuted_shouldThrowIllegalArgumentException() {
        // Arrange
        HttpConnection.Response res = new HttpConnection.Response();

        // Act
        res.bodyAsBytes();
    }

    @Test(expected = IllegalArgumentException.class)
    public void responseBufferUp_notExecuted_shouldThrowIllegalArgumentException() {
        // Arrange
        HttpConnection.Response res = new HttpConnection.Response();

        // Act
        res.bufferUp();
    }

    @Test(expected = IllegalArgumentException.class)
    public void responseBodyStream_notExecuted_shouldThrowIllegalArgumentException() {
        // Arrange
        HttpConnection.Response res = new HttpConnection.Response();

        // Act
        res.bodyStream();
    }

    @Test(expected = IllegalArgumentException.class)
    public void execute_givenNullRequest_shouldThrowIllegalArgumentException() throws IOException {
        // Act
        HttpConnection.Response.execute(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void execute_givenNullUrl_shouldThrowIllegalArgumentException() throws IOException {
        // Arrange
        HttpConnection.Request req = new HttpConnection.Request();
        req.url = null;

        // Act
        HttpConnection.Response.execute(req);
    }

    @Test(expected = MalformedURLException.class)
    public void execute_givenUnsupportedProtocol_shouldThrowMalformedURLException() throws IOException {
        // Arrange
        HttpConnection.Request req = new HttpConnection.Request();
        req.url(new URL("ftp://ftp.example.com/file.txt"));

        // Act
        HttpConnection.Response.execute(req);
    }

    @Test(expected = IllegalArgumentException.class)
    public void execute_givenGetMethodWithRequestBody_shouldThrowIllegalArgumentException() throws IOException {
        // Arrange
        HttpConnection.Request req = new HttpConnection.Request();
        req.url(new URL("http://example.com"));
        req.method(Connection.Method.GET);
        req.requestBody("some content");

        // Act
        HttpConnection.Response.execute(req);
    }

    @Test
    public void encodeUrl_givenNonAsciiAndSpaces_shouldEncodeProperly() throws Exception {
        // Arrange
        URL url = new URL("http://example.com/test space?param=hello world");

        // Act
        URL encoded = HttpConnection.encodeUrl(url);

        // Assert
        Assert.assertEquals("http://example.com/test%20space?param=hello%20world", encoded.toExternalForm());
    }

    @Test
    public void encodeUrl_givenInvalidUriChars_shouldFallbackGracefully() throws Exception {
        // Arrange
        URL url = new URL("http://example.com/test:80:80");

        // Act
        URL encoded = HttpConnection.encodeUrl(url);

        // Assert
        Assert.assertNotNull(encoded);
    }
}