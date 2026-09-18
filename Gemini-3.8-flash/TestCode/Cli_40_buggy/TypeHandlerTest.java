package org.apache.commons.cli;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Date;
import org.junit.Assert;
import org.junit.Test;

public class TypeHandlerTest
{
    @Test
    public void constructor_defaultInstantiation_shouldSucceed()
    {
        TypeHandler handler = new TypeHandler();
        Assert.assertNotNull(handler);
    }

    @Test
    public void createValue_givenObjectParam_shouldCastAndDelegate() throws ParseException
    {
        Object classObj = PatternOptionBuilder.STRING_VALUE;
        Object result = TypeHandler.createValue("testString", classObj);
        Assert.assertEquals("testString", result);
    }

    @Test
    public void createValue_givenStringValuePattern_shouldReturnString() throws ParseException
    {
        String result = TypeHandler.createValue("hello", PatternOptionBuilder.STRING_VALUE);
        Assert.assertEquals("hello", result);
    }

    @Test
    public void createValue_givenObjectValuePattern_shouldReturnObject() throws ParseException
    {
        Object result = TypeHandler.createValue("java.lang.String", PatternOptionBuilder.OBJECT_VALUE);
        Assert.assertNotNull(result);
        Assert.assertEquals("", result);
    }

    @Test
    public void createValue_givenNumberValuePattern_shouldReturnNumber() throws ParseException
    {
        Number result = TypeHandler.createValue("123.45", PatternOptionBuilder.NUMBER_VALUE);
        Assert.assertEquals(Double.valueOf(123.45), result);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void createValue_givenDateValuePattern_shouldThrowUnsupportedOperationException() throws ParseException
    {
        TypeHandler.createValue("2023-01-01", PatternOptionBuilder.DATE_VALUE);
    }

    @Test
    public void createValue_givenClassValuePattern_shouldReturnClass() throws ParseException
    {
        Class result = TypeHandler.createValue("java.lang.String", PatternOptionBuilder.CLASS_VALUE);
        Assert.assertEquals(String.class, result);
    }

    @Test
    public void createValue_givenFileValuePattern_shouldReturnFile() throws ParseException
    {
        File result = TypeHandler.createValue("somefile.txt", PatternOptionBuilder.FILE_VALUE);
        Assert.assertEquals(new File("somefile.txt"), result);
    }

    @Test
    public void createValue_givenExistingFileValuePattern_shouldReturnFileInputStream() throws ParseException, IOException
    {
        File tempFile = File.createTempFile("typehandler_test", ".tmp");
        FileInputStream fis = null;
        try
        {
            fis = TypeHandler.createValue(tempFile.getAbsolutePath(), PatternOptionBuilder.EXISTING_FILE_VALUE);
            Assert.assertNotNull(fis);
        }
        finally
        {
            if (fis != null)
            {
                fis.close();
            }
            tempFile.delete();
        }
    }

    @Test(expected = UnsupportedOperationException.class)
    public void createValue_givenFilesValuePattern_shouldThrowUnsupportedOperationException() throws ParseException
    {
        TypeHandler.createValue("somefiles", PatternOptionBuilder.FILES_VALUE);
    }

    @Test
    public void createValue_givenUrlValuePattern_shouldReturnUrl() throws ParseException
    {
        URL result = TypeHandler.createValue("http://localhost", PatternOptionBuilder.URL_VALUE);
        Assert.assertNotNull(result);
        Assert.assertEquals("http://localhost", result.toString());
    }

    @Test
    public void createValue_givenUnknownClass_shouldReturnNull() throws ParseException
    {
        Integer result = TypeHandler.createValue("123", Integer.class);
        Assert.assertNull(result);
    }

    @Test
    public void createObject_givenValidClassName_shouldInstantiateObject() throws ParseException
    {
        Object obj = TypeHandler.createObject("java.lang.String");
        Assert.assertNotNull(obj);
        Assert.assertTrue(obj instanceof String);
    }

    @Test
    public void createObject_givenNonExistingClassName_shouldThrowParseException()
    {
        String invalidClassName = "org.apache.commons.cli.NonExistingClass12345";
        try
        {
            TypeHandler.createObject(invalidClassName);
            Assert.fail("Expected ParseException when class cannot be found");
        }
        catch (ParseException e)
        {
            Assert.assertEquals("Unable to find the class: " + invalidClassName, e.getMessage());
        }
    }

    @Test
    public void createObject_givenAbstractClassName_shouldThrowParseException()
    {
        String abstractClassName = "java.lang.Number";
        try
        {
            TypeHandler.createObject(abstractClassName);
            Assert.fail("Expected ParseException when class cannot be instantiated");
        }
        catch (ParseException e)
        {
            Assert.assertTrue(e.getMessage().indexOf("Unable to create an instance of: " + abstractClassName) != -1);
        }
    }

    @Test
    public void createNumber_givenStringWithDecimalPoint_shouldReturnDouble() throws ParseException
    {
        Number num = TypeHandler.createNumber("123.456");
        Assert.assertNotNull(num);
        Assert.assertTrue(num instanceof Double);
        Assert.assertEquals(Double.valueOf(123.456), num);
    }

    @Test
    public void createNumber_givenStringWithoutDecimalPoint_shouldReturnLong() throws ParseException
    {
        Number num = TypeHandler.createNumber("123456");
        Assert.assertNotNull(num);
        Assert.assertTrue(num instanceof Long);
        Assert.assertEquals(Long.valueOf(123456L), num);
    }

    @Test
    public void createNumber_givenNegativeNumberWithoutDecimalPoint_shouldReturnLong() throws ParseException
    {
        Number num = TypeHandler.createNumber("-9876");
        Assert.assertNotNull(num);
        Assert.assertTrue(num instanceof Long);
        Assert.assertEquals(Long.valueOf(-9876L), num);
    }

    @Test
    public void createNumber_givenNegativeNumberWithDecimalPoint_shouldReturnDouble() throws ParseException
    {
        Number num = TypeHandler.createNumber("-98.76");
        Assert.assertNotNull(num);
        Assert.assertTrue(num instanceof Double);
        Assert.assertEquals(Double.valueOf(-98.76), num);
    }

    @Test
    public void createNumber_givenInvalidNumberString_shouldThrowParseException()
    {
        try
        {
            TypeHandler.createNumber("not_a_number");
            Assert.fail("Expected ParseException for non-numeric string");
        }
        catch (ParseException e)
        {
            Assert.assertNotNull(e.getMessage());
        }
    }

    @Test
    public void createNumber_givenInvalidFloatingPointString_shouldThrowParseException()
    {
        try
        {
            TypeHandler.createNumber("12.34.56");
            Assert.fail("Expected ParseException for malformed float string");
        }
        catch (ParseException e)
        {
            Assert.assertNotNull(e.getMessage());
        }
    }

    @Test
    public void createClass_givenValidClassName_shouldReturnClass() throws ParseException
    {
        Class clazz = TypeHandler.createClass("java.lang.Integer");
        Assert.assertEquals(Integer.class, clazz);
    }

    @Test
    public void createClass_givenInvalidClassName_shouldThrowParseException()
    {
        String invalidClassName = "com.invalid.ClassXYZ";
        try
        {
            TypeHandler.createClass(invalidClassName);
            Assert.fail("Expected ParseException for invalid class name");
        }
        catch (ParseException e)
        {
            Assert.assertEquals("Unable to find the class: " + invalidClassName, e.getMessage());
        }
    }

    @Test(expected = UnsupportedOperationException.class)
    public void createDate_givenAnyString_shouldThrowUnsupportedOperationException()
    {
        TypeHandler.createDate("2023-10-10");
    }

    @Test
    public void createURL_givenValidUrl_shouldReturnUrl() throws ParseException
    {
        URL url = TypeHandler.createURL("http://www.apache.org");
        Assert.assertNotNull(url);
        Assert.assertEquals("http", url.getProtocol());
        Assert.assertEquals("www.apache.org", url.getHost());
    }

    @Test
    public void createURL_givenMalformedUrl_shouldThrowParseException()
    {
        String invalidUrl = "htp://invalid url with spaces";
        try
        {
            TypeHandler.createURL(invalidUrl);
            Assert.fail("Expected ParseException for malformed URL");
        }
        catch (ParseException e)
        {
            Assert.assertEquals("Unable to parse the URL: " + invalidUrl, e.getMessage());
        }
    }

    @Test
    public void createFile_givenFilePath_shouldReturnFile()
    {
        String path = "some" + File.separator + "path" + File.separator + "file.txt";
        File file = TypeHandler.createFile(path);
        Assert.assertNotNull(file);
        Assert.assertEquals(path, file.getPath());
    }

    @Test
    public void openFile_givenExistingFile_shouldReturnOpenFileInputStream() throws ParseException, IOException
    {
        File tempFile = File.createTempFile("openfile_test", ".tmp");
        FileInputStream fis = null;
        try
        {
            fis = TypeHandler.openFile(tempFile.getAbsolutePath());
            Assert.assertNotNull(fis);
        }
        finally
        {
            if (fis != null)
            {
                fis.close();
            }
            tempFile.delete();
        }
    }

    @Test
    public void openFile_givenNonExistingFile_shouldThrowParseException()
    {
        String nonExistingPath = "non_existing_file_987654321.tmp";
        try
        {
            TypeHandler.openFile(nonExistingPath);
            Assert.fail("Expected ParseException for missing file");
        }
        catch (ParseException e)
        {
            Assert.assertEquals("Unable to find file: " + nonExistingPath, e.getMessage());
        }
    }

    @Test(expected = UnsupportedOperationException.class)
    public void createFiles_givenAnyString_shouldThrowUnsupportedOperationException()
    {
        TypeHandler.createFiles("path/to/files");
    }
}