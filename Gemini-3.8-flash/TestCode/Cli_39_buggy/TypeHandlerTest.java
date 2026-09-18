package org.apache.commons.cli;

import java.io.File;
import java.net.URL;
import java.util.Date;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test suite for {@link TypeHandler}.
 * Compatible with Java 1.4 / Java 7 and JUnit 4 without external mock libraries.
 */
public class TypeHandlerTest {

    @Test
    public void constructor_default_shouldInstantiateSuccessfully() {
        TypeHandler handler = new TypeHandler();
        Assert.assertNotNull(handler);
    }

    @Test
    public void createValue_givenObjectParamAsClass_shouldDelegateProperly() throws ParseException {
        Object result = TypeHandler.createValue("hello", (Object) PatternOptionBuilder.STRING_VALUE);
        Assert.assertEquals("hello", result);
    }

    @Test
    public void createValue_givenStringClass_shouldReturnString() throws ParseException {
        Object result = TypeHandler.createValue("testString", PatternOptionBuilder.STRING_VALUE);
        Assert.assertEquals("testString", result);
    }

    @Test
    public void createValue_givenObjectClass_shouldReturnInstantiatedObject() throws ParseException {
        Object result = TypeHandler.createValue("java.lang.String", PatternOptionBuilder.OBJECT_VALUE);
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof String);
    }

    @Test
    public void createValue_givenNumberClass_shouldReturnNumber() throws ParseException {
        Object result = TypeHandler.createValue("123", PatternOptionBuilder.NUMBER_VALUE);
        Assert.assertTrue(result instanceof Long);
        Assert.assertEquals(Long.valueOf(123), result);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void createValue_givenDateClass_shouldThrowUnsupportedOperationException() throws ParseException {
        TypeHandler.createValue("2023-01-01", PatternOptionBuilder.DATE_VALUE);
    }

    @Test
    public void createValue_givenClassClass_shouldReturnClass() throws ParseException {
        Object result = TypeHandler.createValue("java.lang.String", PatternOptionBuilder.CLASS_VALUE);
        Assert.assertEquals(String.class, result);
    }

    @Test
    public void createValue_givenFileClass_shouldReturnFile() throws ParseException {
        Object result = TypeHandler.createValue("somefile.txt", PatternOptionBuilder.FILE_VALUE);
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof File);
        Assert.assertEquals("somefile.txt", ((File) result).getName());
    }

    @Test
    public void createValue_givenExistingFileClass_shouldReturnFile() throws ParseException {
        Object result = TypeHandler.createValue("existingfile.txt", PatternOptionBuilder.EXISTING_FILE_VALUE);
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof File);
        Assert.assertEquals("existingfile.txt", ((File) result).getName());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void createValue_givenFilesClass_shouldThrowUnsupportedOperationException() throws ParseException {
        TypeHandler.createValue("files", PatternOptionBuilder.FILES_VALUE);
    }

    @Test
    public void createValue_givenUrlClass_shouldReturnUrl() throws ParseException {
        Object result = TypeHandler.createValue("http://localhost", PatternOptionBuilder.URL_VALUE);
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof URL);
        Assert.assertEquals("http://localhost", result.toString());
    }

    @Test
    public void createValue_givenUnknownClass_shouldReturnNull() throws ParseException {
        Object result = TypeHandler.createValue("test", Integer.class);
        Assert.assertNull(result);
    }

    @Test
    public void createObject_givenValidClassName_shouldInstantiateObject() throws ParseException {
        Object obj = TypeHandler.createObject("java.util.Date");
        Assert.assertNotNull(obj);
        Assert.assertTrue(obj instanceof Date);
    }

    @Test
    public void createObject_givenNonExistentClassName_shouldThrowParseException() {
        try {
            TypeHandler.createObject("com.nonexistent.Class");
            Assert.fail("Expected ParseException was not thrown");
        } catch (ParseException e) {
            Assert.assertTrue(e.getMessage().indexOf("Unable to find the class: com.nonexistent.Class") != -1);
        }
    }

    @Test
    public void createObject_givenAbstractClassOrInterface_shouldThrowParseException() {
        try {
            TypeHandler.createObject("java.util.List");
            Assert.fail("Expected ParseException was not thrown");
        } catch (ParseException e) {
            Assert.assertTrue(e.getMessage().indexOf("Unable to create an instance of: java.util.List") != -1);
        }
    }

    @Test
    public void createNumber_givenIntegerString_shouldReturnLong() throws ParseException {
        Number number = TypeHandler.createNumber("42");
        Assert.assertNotNull(number);
        Assert.assertTrue(number instanceof Long);
        Assert.assertEquals(42L, number.longValue());
    }

    @Test
    public void createNumber_givenDecimalString_shouldReturnDouble() throws ParseException {
        Number number = TypeHandler.createNumber("42.5");
        Assert.assertNotNull(number);
        Assert.assertTrue(number instanceof Double);
        Assert.assertEquals(42.5, number.doubleValue(), 0.0001);
    }

    @Test
    public void createNumber_givenNegativeIntegerString_shouldReturnLong() throws ParseException {
        Number number = TypeHandler.createNumber("-100");
        Assert.assertNotNull(number);
        Assert.assertTrue(number instanceof Long);
        Assert.assertEquals(-100L, number.longValue());
    }

    @Test
    public void createNumber_givenNegativeDecimalString_shouldReturnDouble() throws ParseException {
        Number number = TypeHandler.createNumber("-100.25");
        Assert.assertNotNull(number);
        Assert.assertTrue(number instanceof Double);
        Assert.assertEquals(-100.25, number.doubleValue(), 0.0001);
    }

    @Test
    public void createNumber_givenInvalidIntegerFormat_shouldThrowParseException() {
        try {
            TypeHandler.createNumber("not_a_number");
            Assert.fail("Expected ParseException was not thrown");
        } catch (ParseException e) {
            Assert.assertNotNull(e.getMessage());
        }
    }

    @Test
    public void createNumber_givenInvalidDecimalFormat_shouldThrowParseException() {
        try {
            TypeHandler.createNumber("12.invalid");
            Assert.fail("Expected ParseException was not thrown");
        } catch (ParseException e) {
            Assert.assertNotNull(e.getMessage());
        }
    }

    @Test
    public void createClass_givenValidClassName_shouldReturnClass() throws ParseException {
        Class<?> clazz = TypeHandler.createClass("java.lang.Integer");
        Assert.assertNotNull(clazz);
        Assert.assertEquals(Integer.class, clazz);
    }

    @Test
    public void createClass_givenInvalidClassName_shouldThrowParseException() {
        try {
            TypeHandler.createClass("org.apache.commons.cli.UnknownClass");
            Assert.fail("Expected ParseException was not thrown");
        } catch (ParseException e) {
            Assert.assertTrue(e.getMessage().indexOf("Unable to find the class: org.apache.commons.cli.UnknownClass") != -1);
        }
    }

    @Test(expected = UnsupportedOperationException.class)
    public void createDate_givenValidString_shouldThrowUnsupportedOperationException() {
        TypeHandler.createDate("2023-01-01");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void createDate_givenNull_shouldThrowUnsupportedOperationException() {
        TypeHandler.createDate(null);
    }

    @Test
    public void createURL_givenValidUrl_shouldReturnUrl() throws ParseException {
        URL url = TypeHandler.createURL("http://commons.apache.org");
        Assert.assertNotNull(url);
        Assert.assertEquals("http://commons.apache.org", url.toString());
    }

    @Test
    public void createURL_givenInvalidUrl_shouldThrowParseException() {
        try {
            TypeHandler.createURL("bad_url_format");
            Assert.fail("Expected ParseException was not thrown");
        } catch (ParseException e) {
            Assert.assertTrue(e.getMessage().indexOf("Unable to parse the URL: bad_url_format") != -1);
        }
    }

    @Test
    public void createFile_givenFilePath_shouldReturnFile() {
        File file = TypeHandler.createFile("path/to/file.txt");
        Assert.assertNotNull(file);
        Assert.assertEquals("file.txt", file.getName());
    }

    @Test
    public void createFile_givenEmptyPath_shouldReturnFile() {
        File file = TypeHandler.createFile("");
        Assert.assertNotNull(file);
        Assert.assertEquals("", file.getPath());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void createFiles_givenPath_shouldThrowUnsupportedOperationException() {
        TypeHandler.createFiles("path/to/files");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void createFiles_givenNull_shouldThrowUnsupportedOperationException() {
        TypeHandler.createFiles(null);
    }
}