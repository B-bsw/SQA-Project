package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CollectionTypeTest {

    private CollectionType collectionType;
    private JavaType mockElementType;
    private Class<?> rawType;
    private TypeBindings bindings;
    private JavaType superClass;
    private JavaType[] superInterfaces;

    @Before
    public void setUp() {
        mockElementType = mock(JavaType.class);
        rawType = List.class;
        bindings = mock(TypeBindings.class);
        superClass = mock(JavaType.class);
        superInterfaces = new JavaType[0];
        collectionType = new CollectionType(rawType, bindings, superClass, superInterfaces, mockElementType, null, null, false);
    }

    @Test
    public void testConstructWithBindings() {
        CollectionType result = CollectionType.construct(rawType, bindings, superClass, superInterfaces, mockElementType);
        assertNotNull(result);
        assertEquals(rawType, result.getRawClass());
        assertEquals(mockElementType, result.getContentType());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructWithNullRawType() {
        CollectionType.construct(null, bindings, superClass, superInterfaces, mockElementType);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructWithNullElementType() {
        CollectionType.construct(rawType, bindings, superClass, superInterfaces, null);
    }

    @Test
    public void testDeprecatedConstructWithRawTypeAndElementType() {
        CollectionType result = CollectionType.construct(rawType, mockElementType);
        assertNotNull(result);
        assertEquals(rawType, result.getRawClass());
        assertEquals(mockElementType, result.getContentType());
    }

    @Test
    public void testDeprecatedConstructWithNullBindings() {
        CollectionType result = CollectionType.construct(rawType, mockElementType);
        assertNotNull(result);
    }

    @Test
    public void testWithContentTypeSameReturnsThis() {
        assertSame(collectionType, collectionType.withContentType(mockElementType));
    }

    @Test
    public void testWithContentTypeDifferent() {
        JavaType newContentType = mock(JavaType.class);
        CollectionType result = collectionType.withContentType(newContentType);
        assertNotNull(result);
        assertNotSame(collectionType, result);
        assertEquals(newContentType, result.getContentType());
    }

    @Test
    public void testWithTypeHandler() {
        Object handler = new Object();
        CollectionType result = collectionType.withTypeHandler(handler);
        assertNotNull(result);
        assertNotSame(collectionType, result);
        assertEquals(handler, result.getTypeHandler());
    }

    @Test
    public void testWithContentTypeHandler() {
        Object handler = new Object();
        JavaType newType = mock(JavaType.class);
        when(mockElementType.withTypeHandler(handler)).thenReturn(newType);
        CollectionType result = collectionType.withContentTypeHandler(handler);
        assertNotNull(result);
        assertNotSame(collectionType, result);
        assertEquals(newType, result.getContentType());
    }

    @Test
    public void testWithValueHandler() {
        Object handler = new Object();
        CollectionType result = collectionType.withValueHandler(handler);
        assertNotNull(result);
        assertNotSame(collectionType, result);
        assertEquals(handler, result.getValueHandler());
    }

    @Test
    public void testWithContentValueHandler() {
        Object handler = new Object();
        JavaType newType = mock(JavaType.class);
        when(mockElementType.withValueHandler(handler)).thenReturn(newType);
        CollectionType result = collectionType.withContentValueHandler(handler);
        assertNotNull(result);
        assertNotSame(collectionType, result);
        assertEquals(newType, result.getContentType());
    }

    @Test
    public void testWithStaticTypingTrue() {
        CollectionType result = collectionType.withStaticTyping();
        assertNotNull(result);
        assertNotSame(collectionType, result);
    }

    @Test
    public void testWithStaticTypingAlreadyStatic() {
        CollectionType staticType = new CollectionType(rawType, bindings, superClass, superInterfaces, mockElementType, null, null, true);
        assertSame(staticType, staticType.withStaticTyping());
    }

    @Test
    public void testRefine() {
        Class<?> newRawType = ArrayList.class;
        TypeBindings newBindings = mock(TypeBindings.class);
        JavaType newSuperClass = mock(JavaType.class);
        JavaType[] newSuperInterfaces = new JavaType[0];
        CollectionType result = collectionType.refine(newRawType, newBindings, newSuperClass, newSuperInterfaces);
        assertNotNull(result);
        assertEquals(newRawType, result.getRawClass());
        assertEquals(mockElementType, result.getContentType());
    }

    @Test
    public void testToString() {
        String expected = "[collection type; class " + rawType.getName() + ", contains " + mockElementType + "]";
        assertEquals(expected, collectionType.toString());
    }
}