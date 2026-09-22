package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.Date;

import org.junit.Test;

public class TypeHandlerTest {

    @Test
    public void testCreateValueStringObject() throws Exception {
        Object obj = TypeHandler.createValue("str", String.class);
        assertTrue(obj instanceof String);
        assertEquals("str", obj);
    }

    @Test
    public void testCreateValueWithObjectClass() throws Exception {
        Object obj = TypeHandler.createValue("java.lang.String", new Object() {
            public Class<?> getType() { return Object.class; }
        }.getType());
        assertNotNull(obj);
    }

    @Test
    public void testCreateValueNull() throws Exception {
        Object obj = TypeHandler.createValue("test", (Class<?>) null);
        assertNull(obj);
    }

    @Test(expected = ParseException.class)
    public void testCreateValueInvalidObject() throws Exception {
        TypeHandler.createObject("non.existent.Class");
    }

    @Test
    public void testCreateValueInvalidClass() throws Exception {
        try {
            TypeHandler.createValue("not.a.number", (Class<?>) Integer.class);
            fail("Expected ParseException");
        } catch (ParseException e) {
            // expected
        }
    }

    @Test
    public void testCreateValueString() throws Exception {
        assertEquals("hello", TypeHandler.createValue("hello", (Class) String.class));
    }

    @Test
    public void testCreateValueObject() throws Exception {
        // Test by calling with Object class
        Object result = TypeHandler.createValue("java.lang.Object", Object.class);
        assertNotNull(result);
    }

    @Test
    public void testCreateValueNumber() throws Exception {
        assertEquals(Long.valueOf(10L), TypeHandler.createValue("10", (Class) Long.class));
        assertEquals(Double.valueOf(10.5), TypeHandler.createValue("10.5", (Class) Double.class));
    }

    @Test
    public void testCreateValueDate() throws Exception {
        try {
            TypeHandler.createDate("2024-01-01");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testCreateValueClass() throws Exception {
        Class<?> clazz = (Class<?>) TypeHandler.createValue("java.lang.String", (Class) Class.class);
        assertSame(String.class, clazz);
    }

    @Test
    public void testCreateValueFile() throws Exception {
        File file = (File) TypeHandler.createValue("/tmp/test.txt", (Class) File.class);
        assertNotNull(file);
        assertEquals("/tmp/test.txt", file.getPath());
    }

    @Test
    public void testCreateValueExistingFile() throws Exception {
        File file = (File) TypeHandler.createValue("/tmp/existing.txt", (Class) File.class);
        assertNotNull(file);
    }

    @Test
    public void testCreateValueFiles() throws Exception {
        try {
            TypeHandler.createFiles("/tmp/a.txt");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testCreateValueURL() throws Exception {
        URL url = (URL) TypeHandler.createValue("http://example.com", (Class) URL.class);
        assertNotNull(url);
        assertEquals("http://example.com", url.toString());
    }

    @Test(expected = ParseException.class)
    public void testCreateValueInvalidURL() throws Exception {
        TypeHandler.createValue("not a url", (Class) URL.class);
    }

    @Test
    public void testCreateObject() throws Exception {
        Object obj = TypeHandler.createObject("java.lang.String");
        assertNotNull(obj);
        assertTrue(obj instanceof String);
    }

    @Test(expected = ParseException.class)
    public void testCreateObjectNotFound() throws Exception {
        TypeHandler.createObject("does.not.Exist");
    }

    @Test
    public void testCreateNumberLong() throws Exception {
        Number num = TypeHandler.createNumber("1234");
        assertTrue(num instanceof Long);
        assertEquals(1234L, num.longValue());
    }

    @Test
    public void testCreateNumberDouble() throws Exception {
        Number num = TypeHandler.createNumber("1234.56");
        assertTrue(num instanceof Double);
        assertEquals(1234.56, num.doubleValue(), 0.0001);
    }

    @Test(expected = ParseException.class)
    public void testCreateNumberInvalid() throws Exception {
        TypeHandler.createNumber("12a34");
    }

    @Test
    public void testCreateDateMethod() throws Exception {
        try {
            TypeHandler.createDate("2024-01-01");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertEquals("Not yet implemented", e.getMessage());
        }
    }

    @Test
    public void testCreateURL() throws Exception {
        URL url = TypeHandler.createURL("http://test.com/path");
        assertNotNull(url);
        assertEquals("http://test.com/path", url.toString());
    }

    @Test(expected = ParseException.class)
    public void testCreateURLInvalid() throws Exception {
        TypeHandler.createURL("htp://invalid");
    }

    @Test
    public void testCreateFile() throws Exception {
        File file = TypeHandler.createFile("/tmp/test.txt");
        assertNotNull(file);
        assertEquals("/tmp/test.txt", file.getPath());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateFiles() throws Exception {
        TypeHandler.createFiles("/tmp/*.txt");
    }

    @Test
    public void testCreateClass() throws Exception {
        Class<?> clazz = TypeHandler.createClass("java.lang.String");
        assertSame(String.class, clazz);
    }

    @Test(expected = ParseException.class)
    public void testCreateClassNotFound() throws Exception {
        TypeHandler.createClass("no.such.Class");
    }

    @Test
    public void testCreateValueWithObjectType() throws Exception {
        Object obj = TypeHandler.createValue("java.lang.Integer", Object.class);
        assertNotNull(obj);
        assertTrue(obj instanceof String);
    }

    @Test
    public void testCreateValueWithClassType() throws Exception {
        Object obj = TypeHandler.createValue("java.lang.Long", Class.class);
        assertSame(Long.class, obj);
    }

    @Test
    public void testCreateValueWithFileType() throws Exception {
        Object obj = TypeHandler.createValue("/tmp/file.txt", File.class);
        assertNotNull(obj);
        assertTrue(obj instanceof File);
    }

    @Test
    public void testCreateValueWithURLType() throws Exception {
        Object obj = TypeHandler.createValue("http://abc.com", URL.class);
        assertNotNull(obj);
        assertTrue(obj instanceof URL);
    }

    @Test
    public void testCreateValueWithNullString() throws Exception {
        assertNull(TypeHandler.createValue(null, String.class));
    }

    @Test
    public void testCreateValueWithEmptyString() throws Exception {
        Object obj = TypeHandler.createValue("", String.class);
        assertNotNull(obj);
        assertEquals("", obj);
    }
}