package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HttpConnectionTest {

    @Test
    public void connect_givenValidStringUrl_shouldInitializeConnection() throws MalformedURLException {
        String urlString = "http://example.com/test";
        Connection con = HttpConnection.connect(urlString);
        Assert.assertNotNull(con);
        Assert.assertEquals(new URL(urlString), con.request().url());
    }

    @Test
    public void connect_givenUrlWithSpaces_shouldEncodeSpaces() throws MalformedURLException {
        String urlString = "http://example.com/path with spaces";
        Connection con = HttpConnection.connect(urlString);
        Assert.assertEquals(new URL("http://example.com/path%20with%20spaces"), con.request().url());
    }

    @Test(expected = IllegalArgumentException.class)
    public void connect_givenNullStringUrl_shouldThrowIllegalArgumentException() {
        HttpConnection.connect((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void connect_givenEmptyStringUrl_shouldThrowIllegalArgumentException() {
        HttpConnection.connect("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void connect_givenMalformedStringUrl_shouldThrowIllegalArgumentException() {
        HttpConnection.connect("invalid_url_protocol");
    }

    @Test
    public void connect_givenUrlObject_shouldInitializeConnection() throws MalformedURLException {
        URL url = new URL("https://example.com/api");
        Connection con = HttpConnection.connect(url);
        Assert.assertNotNull(con);
        Assert.assertEquals(url, con.request().url());
    }

    @Test
    public void url_givenValidUrlObject_shouldUpdateUrl() throws MalformedURLException {
        Connection con = HttpConnection.connect("http://example.com");
        URL newUrl = new URL("http://example.org/updated");
        con.url(newUrl);
        Assert.assertEquals(newUrl, con.request().url());
    }

    @Test(expected = IllegalArgumentException.class)
    public void url_givenNullUrlObject_shouldThrowIllegalArgumentException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.url((URL) null);
    }

    @Test
    public void url_givenValidStringUrl_shouldUpdateUrl() throws MalformedURLException {
        Connection con = HttpConnection.connect("http://example.com");
        con.url("http://example.org/new path");
        Assert.assertEquals(new URL("http://example.org/new%20path"), con.request().url());
    }

    @Test
    public void userAgent_givenValidUserAgent_shouldSetHeader() {
        Connection con = HttpConnection.connect("http://example.com");
        con.userAgent("Mozilla/5.0 Custom");
        Assert.assertEquals("Mozilla/5.0 Custom", con.request().header("User-Agent"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void userAgent_givenNull_shouldThrowIllegalArgumentException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.userAgent(null);
    }

    @Test
    public void timeout_givenZeroOrPositiveMillis_shouldSetTimeout() {
        Connection con = HttpConnection.connect("http://example.com");
        con.timeout(0);
        Assert.assertEquals(0, con.request().timeout());
        con.timeout(5000);
        Assert.assertEquals(5000, con.request().timeout());
    }

    @Test(expected = IllegalArgumentException.class)
    public void timeout_givenNegativeMillis_shouldThrowIllegalArgumentException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.timeout(-1);
    }

    @Test
    public void maxBodySize_givenZeroOrPositiveBytes_shouldSetMaxBodySize() {
        Connection con = HttpConnection.connect("http://example.com");
        con.maxBodySize(0);
        Assert.assertEquals(0, con.request().maxBodySize());
        con.maxBodySize(2048);
        Assert.assertEquals(2048, con.request().maxBodySize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void maxBodySize_givenNegativeBytes_shouldThrowIllegalArgumentException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.maxBodySize(-10);
    }

    @Test
    public void followRedirects_givenBooleanValues_shouldUpdateSetting() {
        Connection con = HttpConnection.connect("http://example.com");
        Assert.assertTrue(con.request().followRedirects());
        con.followRedirects(false);
        Assert.assertFalse(con.request().followRedirects());
    }

    @Test
    public void referrer_givenValidReferrer_shouldSetRefererHeader() {
        Connection con = HttpConnection.connect("http://example.com");
        con.referrer("http://google.com");
        Assert.assertEquals("http://google.com", con.request().header("Referer"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void referrer_givenNull_shouldThrowIllegalArgumentException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.referrer(null);
    }

    @Test
    public void method_givenValidMethod_shouldSetRequestMethod() {
        Connection con = HttpConnection.connect("http://example.com");
        Assert.assertEquals(Connection.Method.GET, con.request().method());
        con.method(Connection.Method.POST);
        Assert.assertEquals(Connection.Method.POST, con.request().method());
    }

    @Test(expected = IllegalArgumentException.class)
    public void method_givenNullMethod_shouldThrowIllegalArgumentException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.method(null);
    }

    @Test
    public void ignoreHttpErrors_givenBooleanValues_shouldUpdateSetting() {
        Connection con = HttpConnection.connect("http://example.com");
        Assert.assertFalse(con.request().ignoreHttpErrors());
        con.ignoreHttpErrors(true);
        Assert.assertTrue(con.request().ignoreHttpErrors());
    }

    @Test
    public void ignoreContentType_givenBooleanValues_shouldUpdateSetting() {
        Connection con = HttpConnection.connect("http://example.com");
        Assert.assertFalse(con.request().ignoreContentType());
        con.ignoreContentType(true);
        Assert.assertTrue(con.request().ignoreContentType());
    }

    @Test
    public void validateTLSCertificates_givenBooleanValues_shouldUpdateSetting() {
        Connection con = HttpConnection.connect("http://example.com");
        Assert.assertTrue(con.request().validateTLSCertificates());
        con.validateTLSCertificates(false);
        Assert.assertFalse(con.request().validateTLSCertificates());
    }

    @Test
    public void data_givenKeyValueString_shouldAddKeyVal() {
        Connection con = HttpConnection.connect("http://example.com");
        con.data("username", "admin");
        Collection<Connection.KeyVal> data = con.request().data();
        Assert.assertEquals(1, data.size());
        Connection.KeyVal kv = data.iterator().next();
        Assert.assertEquals("username", kv.key());
        Assert.assertEquals("admin", kv.value());
        Assert.assertFalse(kv.hasInputStream());
    }

    @Test
    public void data_givenKeyFilenameStream_shouldAddStreamKeyVal() {
        Connection con = HttpConnection.connect("http://example.com");
        InputStream in = new ByteArrayInputStream(new byte[]{1, 2, 3});
        con.data("upload", "file.txt", in);
        Collection<Connection.KeyVal> data = con.request().data();
        Assert.assertEquals(1, data.size());
        Connection.KeyVal kv = data.iterator().next();
        Assert.assertEquals("upload", kv.key());
        Assert.assertEquals("file.txt", kv.value());
        Assert.assertTrue(kv.hasInputStream());
        Assert.assertEquals(in, kv.inputStream());
    }

    @Test
    public void data_givenDataMap_shouldAddAllEntries() {
        Connection con = HttpConnection.connect("http://example.com");
        Map<String, String> map = new HashMap<String, String>();
        map.put("key1", "val1");
        map.put("key2", "val2");
        con.data(map);
        Assert.assertEquals(2, con.request().data().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void data_givenNullDataMap_shouldThrowIllegalArgumentException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.data((Map<String, String>) null);
    }

    @Test
    public void data_givenStringArrayPairs_shouldAddPairs() {
        Connection con = HttpConnection.connect("http://example.com");
        con.data("k1", "v1", "k2", "v2");
        Assert.assertEquals(2, con.request().data().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void data_givenNullStringArray_shouldThrowIllegalArgumentException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.data((String[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void data_givenOddNumberOfStringPairs_shouldThrowIllegalArgumentException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.data("k1", "v1", "orphanKey");
    }

    @Test(expected = IllegalArgumentException.class)
    public void data_givenEmptyKeyInArray_shouldThrowIllegalArgumentException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.data("", "value");
    }

    @Test(expected = IllegalArgumentException.class)
    public void data_givenNullValueInArray_shouldThrowIllegalArgumentException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.data("key", null);
    }

    @Test
    public void data_givenKeyValCollection_shouldAddAll() {
        Connection con = HttpConnection.connect("http://example.com");
        List<Connection.KeyVal> list = new ArrayList<Connection.KeyVal>();
        list.add(HttpConnection.KeyVal.create("k1", "v1"));
        list.add(HttpConnection.KeyVal.create("k2", "v2"));
        con.data(list);
        Assert.assertEquals(2, con.request().data().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void data_givenNullKeyValCollection_shouldThrowIllegalArgumentException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.data((Collection<Connection.KeyVal>) null);
    }

    @Test
    public void header_givenValidHeaders_shouldSupportCaseInsensitiveOperations() {
        Connection con = HttpConnection.connect("http://example.com");
        con.header("Content-Type", "application/json");

        Assert.assertTrue(con.request().hasHeader("Content-Type"));
        Assert.assertTrue(con.request().hasHeader("content-type"));
        Assert.assertTrue(con.request().hasHeader("CONTENT-TYPE"));
        Assert.assertEquals("application/json", con.request().header("Content-Type"));
        Assert.assertEquals("application/json", con.request().header("content-type"));
        Assert.assertTrue(con.request().hasHeaderWithValue("Content-Type", "APPLICATION/JSON"));
        Assert.assertFalse(con.request().hasHeaderWithValue("Content-Type", "text/html"));
        Assert.assertFalse(con.request().hasHeaderWithValue("Non-Existent", "val"));

        con.header("content-type", "text/plain");
        Assert.assertEquals("text/plain", con.request().header("Content-Type"));

        con.request().removeHeader("Content-Type");
        Assert.assertFalse(con.request().hasHeader("Content-Type"));
        Assert.assertNull(con.request().header("Content-Type"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void header_givenEmptyHeaderName_shouldThrowIllegalArgumentException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.header("", "val");
    }

    @Test(expected = IllegalArgumentException.class)
    public void header_givenNullHeaderValue_shouldThrowIllegalArgumentException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.header("name", null);
    }

    @Test
    public void cookie_givenNameAndValue_shouldStoreAndRetrieveCaseSensitive() {
        Connection con = HttpConnection.connect("http://example.com");
        con.cookie("session_id", "xyz123");

        Assert.assertTrue(con.request().hasCookie("session_id"));
        Assert.assertFalse(con.request().hasCookie("other_cookie"));
        Assert.assertEquals("xyz123", con.request().cookie("session_id"));

        con.request().removeCookie("session_id");
        Assert.assertFalse(con.request().hasCookie("session_id"));
        Assert.assertNull(con.request().cookie("session_id"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void cookie_givenEmptyCookieName_shouldThrowIllegalArgumentException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.cookie("", "val");
    }

    @Test(expected = IllegalArgumentException.class)
    public void cookie_givenNullCookieValue_shouldThrowIllegalArgumentException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.cookie("name", null);
    }

    @Test
    public void cookies_givenCookieMap_shouldStoreAllCookies() {
        Connection con = HttpConnection.connect("http://example.com");
        Map<String, String> map = new HashMap<String, String>();
        map.put("c1", "v1");
        map.put("c2", "v2");
        con.cookies(map);

        Assert.assertEquals("v1", con.request().cookie("c1"));
        Assert.assertEquals("v2", con.request().cookie("c2"));
        Assert.assertEquals(2, con.request().cookies().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void cookies_givenNullCookieMap_shouldThrowIllegalArgumentException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.cookies(null);
    }

    @Test
    public void parser_givenParser_shouldSetParserInRequest() {
        Connection con = HttpConnection.connect("http://example.com");
        Parser xmlParser = Parser.xmlParser();
        con.parser(xmlParser);
        Assert.assertEquals(xmlParser, con.request().parser());
    }

    @Test
    public void postDataCharset_givenValidCharset_shouldSetCharset() {
        Connection con = HttpConnection.connect("http://example.com");
        con.postDataCharset("ISO-8859-1");
        Assert.assertEquals("ISO-8859-1", con.request().postDataCharset());
    }

    @Test(expected = IllegalCharsetNameException.class)
    public void postDataCharset_givenUnsupportedCharset_shouldThrowIllegalCharsetNameException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.postDataCharset("UNSUPPORTED_CHARSET_xyz");
    }

    @Test(expected = IllegalArgumentException.class)
    public void postDataCharset_givenNullCharset_shouldThrowIllegalArgumentException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.postDataCharset(null);
    }

    @Test
    public void requestAndResponse_givenCustomInstances_shouldSetAndGet() {
        Connection con = HttpConnection.connect("http://example.com");
        Connection.Request newReq = HttpConnection.connect("http://example.org").request();
        con.request(newReq);
        Assert.assertEquals(newReq, con.request());

        Connection.Response newRes = HttpConnection.connect("http://example.org").response();
        con.response(newRes);
        Assert.assertEquals(newRes, con.response());
    }

    @Test
    public void keyVal_createAndSetters_shouldHandleValuesCorrectly() {
        Connection.KeyVal kv = HttpConnection.KeyVal.create("key1", "val1");
        Assert.assertEquals("key1", kv.key());
        Assert.assertEquals("val1", kv.value());
        Assert.assertFalse(kv.hasInputStream());
        Assert.assertNull(kv.inputStream());
        Assert.assertEquals("key1=val1", kv.toString());

        kv.key("key2");
        kv.value("val2");
        Assert.assertEquals("key2", kv.key());
        Assert.assertEquals("val2", kv.value());

        InputStream in = new ByteArrayInputStream(new byte[]{0});
        kv.inputStream(in);
        Assert.assertTrue(kv.hasInputStream());
        Assert.assertEquals(in, kv.inputStream());
    }

    @Test(expected = IllegalArgumentException.class)
    public void keyVal_givenEmptyKey_shouldThrowIllegalArgumentException() {
        HttpConnection.KeyVal.create("", "val");
    }

    @Test(expected = IllegalArgumentException.class)
    public void keyVal_givenNullValue_shouldThrowIllegalArgumentException() {
        HttpConnection.KeyVal.create("key", null);
    }

    @Test
    public void response_stateBeforeExecution_shouldThrowWhenParsedOrExtracted() {
        Connection.Response res = HttpConnection.connect("http://example.com").response();

        try {
            res.parse();
            Assert.fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Request must be executed"));
        } catch (IOException e) {
            Assert.fail("Unexpected IOException: " + e.getMessage());
        }

        try {
            res.body();
            Assert.fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Request must be executed"));
        }

        try {
            res.bodyAsBytes();
            Assert.fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Request must be executed"));
        }
    }

    @Test
    public void response_processResponseHeaders_shouldParseHeadersAndCookies() {
        HttpConnection.Response res = new HttpConnection.Response();
        Map<String, List<String>> headers = new HashMap<String, List<String>>();

        List<String> setCookies = new ArrayList<String>();
        setCookies.add("id=1234; Path=/; HttpOnly");
        setCookies.add("theme=dark; expires=Wed, 09 Jun 2026 10:18:14 GMT");
        setCookies.add(null);
        setCookies.add("=emptyname; Path=/");
        headers.put("Set-Cookie", setCookies);

        List<String> serverHeader = new ArrayList<String>();
        serverHeader.add("Apache");
        headers.put("Server", serverHeader);

        headers.put("Empty-List-Header", new ArrayList<String>());
        headers.put(null, serverHeader);

        res.processResponseHeaders(headers);

        Assert.assertEquals("1234", res.cookie("id"));
        Assert.assertEquals("dark", res.cookie("theme"));
        Assert.assertEquals("Apache", res.header("Server"));
        Assert.assertFalse(res.hasCookie(""));
        Assert.assertFalse(res.hasHeader("Empty-List-Header"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void execute_givenNullRequest_shouldThrowIllegalArgumentException() throws IOException {
        HttpConnection.Response.execute(null);
    }

    @Test(expected = MalformedURLException.class)
    public void execute_givenUnsupportedProtocol_shouldThrowMalformedURLException() throws IOException {
        Connection.Request req = HttpConnection.connect("http://example.com").request();
        req.url(new URL("ftp://ftp.example.com/file.txt"));
        HttpConnection.Response.execute(req);
    }

    @Test(expected = MalformedURLException.class)
    public void execute_givenFileProtocol_shouldThrowMalformedURLException() throws IOException {
        Connection.Request req = HttpConnection.connect("http://example.com").request();
        req.url(new URL("file:///path/to/local/file.html"));
        HttpConnection.Response.execute(req);
    }
}