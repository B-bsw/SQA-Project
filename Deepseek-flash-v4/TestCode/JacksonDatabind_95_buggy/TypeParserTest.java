package com.fasterxml.jackson.databind.type;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.JavaType;

public class TypeParserTest {

    private TypeParser parser;

    @Before
    public void setUp() {
        parser = new TypeParser(TypeFactory.defaultInstance());
    }

    @After
    public void tearDown() {
        parser = null;
    }

    @Test
    public void testWithFactoryReturnsSameInstanceForSameFactory() {
        TypeFactory factory = TypeFactory.defaultInstance();
        TypeParser current = new TypeParser(factory);
        assertSame(current, current.withFactory(factory));
    }

    @Test
    public void testWithFactoryReturnsNewInstanceForDifferentFactory() {
        TypeParser current = new TypeParser(TypeFactory.defaultInstance());
        TypeParser newParser = current.withFactory(new TypeFactory());
        assertNotNull(newParser);
        assertNotSame(current, newParser);
    }

    @Test
    public void testParseSimpleType() {
        JavaType type = parser.parse("java.lang.String");
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
        assertEquals(0, type.containedTypeCount());
    }

    @Test
    public void testParseSingleGenericParameter() {
        JavaType type = parser.parse("java.util.List<java.lang.String>");
        assertNotNull(type);
        assertEquals(List.class, type.getRawClass());
        assertTrue(type.isContainerType());
        assertEquals(1, type.containedTypeCount());
        assertEquals(String.class, type.containedType(0).getRawClass());
    }

    @Test
    public void testParseMultipleGenericParameters() {
        JavaType type = parser.parse("java.util.Map<java.lang.String,java.lang.Integer>");
        assertNotNull(type);
        assertEquals(Map.class, type.getRawClass());
        assertEquals(2, type.containedTypeCount());
        assertEquals(String.class, type.containedType(0).getRawClass());
        assertEquals(Integer.class, type.containedType(1).getRawClass());
    }

    @Test
    public void testParseNestedGeneric() {
        JavaType type = parser.parse("java.util.Map<java.lang.String,java.util.List<java.lang.Long>>");
        assertNotNull(type);
        assertEquals(Map.class, type.getRawClass());
        JavaType listType = type.containedType(1);
        assertEquals(List.class, listType.getRawClass());
        assertEquals(Long.class, listType.containedType(0).getRawClass());
    }

    @Test
    public void testParseEmptyStringFails() {
        try {
            parser.parse("");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            assertTrue(ex.getMessage().contains("Unexpected end-of-string"));
        }
    }

    @Test(expected = NullPointerException.class)
    public void testParseNullThrowsNpe() {
        parser.parse(null);
    }

    @Test
    public void testParseExtraTokensAfterCompleteTypeFails() {
        try {
            parser.parse("java.lang.String,");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            assertTrue(ex.getMessage().contains("Unexpected tokens after complete type"));
        }
    }

    @Test
    public void testParseUnknownClassFails() {
        try {
            parser.parse("no.such.Class");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            assertTrue(ex.getMessage().contains("Can not locate class"));
        }
    }

    @Test
    public void testParseMissingClosingAngleFails() {
        try {
            parser.parse("java.util.List<java.lang.String");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            assertTrue(ex.getMessage().contains("Unexpected end-of-string"));
        }
    }

    @Test
    public void testParseUnexpectedTokenFails() {
        try {
            parser.parse("java.util.List<java.util.Map<java.lang.String,java.lang.Integer><java.lang.String>>");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            assertTrue(ex.getMessage().contains("Unexpected token '<'"));
        }
    }

    @Test
    public void testParseTypesWithNoInputFails() {
        try {
            parser.parseTypes(new MyTokenizer(""));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            assertTrue(ex.getMessage().contains("Unexpected end-of-string"));
        }
    }
}