package com.fasterxml.jackson.databind.jsontype.impl;

import static org.junit.Assert.*;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.TypeFactory;

import org.junit.Before;
import org.junit.Test;

public class ClassNameIdResolverTest {

    private TypeFactory typeFactory;
    private JavaType baseType;
    private ClassNameIdResolver resolver;
    private DatabindContext context;

    @Before
    public void setUp() {
        typeFactory = TypeFactory.defaultInstance();
        baseType = typeFactory.constructType(Object.class);
        resolver = new ClassNameIdResolver(baseType, typeFactory);
        context = new TestDatabindContext(typeFactory);
    }

    @Test
    public void testGetMechanism() {
        assertEquals(JsonTypeInfo.Id.CLASS, resolver.getMechanism());
    }

    @Test
    public void testGetDescForKnownTypeIds() {
        assertEquals("class name used as type id", resolver.getDescForKnownTypeIds());
    }

    @Test
    public void testIdFromValueForSimpleClass() {
        assertEquals("java.lang.String", resolver.idFromValue("string"));
    }

    @Test
    public void testIdFromValueAndTypeUsesProvidedClass() {
        assertEquals("java.lang.Number", resolver.idFromValueAndType(42, Number.class));
    }

    @Test
    public void testIdFromValueForEnum() {
        assertEquals(TestColor.class.getName(), resolver.idFromValue(TestColor.RED));
    }

    @Test
    public void testIdFromValueForEnumSubtypeUsesSuperClass() {
        assertEquals(ComplexTestColor.class.getName(), resolver.idFromValue(ComplexTestColor.RED));
    }

    @Test
    public void testIdFromValueForEnumSet() {
        EnumSet<TestColor> colors = EnumSet.of(TestColor.RED);
        assertEquals("java.util.EnumSet<" + TestColor.class.getName() + ">",
                resolver.idFromValue(colors));
    }

    @Test
    public void testIdFromValueForEnumMap() {
        EnumMap<TestColor, Object> map = new EnumMap<TestColor, Object>(TestColor.class);
        map.put(TestColor.GREEN, "value");
        assertEquals("java.util.EnumMap<" + TestColor.class.getName() + ",java.lang.Object>",
                resolver.idFromValue(map));
    }

    @Test
    public void testIdFromValueForArraysAsList() {
        List<String> list = Arrays.asList("a", "b");
        assertEquals("java.util.ArrayList", resolver.idFromValue(list));
    }

    @Test
    public void testIdFromValueForPlainJavaUtilClass() {
        assertEquals("java.util.ArrayList", resolver.idFromValue(new ArrayList<String>()));
    }

    @Test
    public void testIdFromValueForInnerClassUsesBaseType() {
        assertEquals("java.lang.Object", resolver.idFromValue(new InnerType()));
    }

    @Test(expected = NullPointerException.class)
    public void testIdFromValueNullThrows() {
        resolver.idFromValue(null);
    }

    @Test
    public void testTypeFromIdForSimpleType() throws Exception {
        JavaType type = resolver.typeFromId(context, "java.lang.String");
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testTypeFromIdForGenericType() throws Exception {
        JavaType type = resolver.typeFromId(context, "java.util.List<java.lang.String>");
        assertEquals(List.class, type.getRawClass());
        assertEquals(String.class, type.getContentType().getRawClass());
    }

    @Test
    public void testTypeFromIdForUnknownClassReturnsNull() throws Exception {
        assertNull(resolver.typeFromId(context, "no.such.Class"));
    }

    @Test
    public void testTypeFromIdForEmptyIdReturnsNull() throws Exception {
        assertNull(resolver.typeFromId(context, ""));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTypeFromIdForMalformedGenericIdThrows() throws Exception {
        resolver.typeFromId(context, "java.util.List<");
    }

    class InnerType {
    }

    private static class TestDatabindContext extends DatabindContext {
        private final TypeFactory typeFactory;

        TestDatabindContext(TypeFactory typeFactory) {
            super(null);
            this.typeFactory = typeFactory;
        }

        public Object getAttribute(Object key) {
            return null;
        }

        public DatabindContext setAttribute(Object key, Object value) {
            return this;
        }

        public Class<?> getActiveView() {
            return null;
        }

        public Object getOwner() {
            return null;
        }

        public MapperConfig<?> getConfig() {
            return null;
        }

        public TypeFactory getTypeFactory() {
            return typeFactory;
        }
    }
}

enum TestColor {
    RED, GREEN
}

enum ComplexTestColor {
    RED {
        @Override
        public String toString() {
            return "red";
        }
    },
    GREEN;
}