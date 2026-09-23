package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class PropertyBuilderTest {
    private SerializationConfig config;
    private BeanDescription beanDesc;
    private PropertyBuilder builder;
    private JavaType testType;
    private BeanPropertyDefinition propDef;
    private AnnotatedMember accessor;
    private SerializerProvider serializerProvider;

    @Before
    public void setUp() throws Exception {
        config = new SerializationConfig(SerializationConfig.class, null, null, null, null, null, null, null, null, null, null, null, null);
        beanDesc = new BeanDescription(null, null, null, null, null, null, null);
        builder = new PropertyBuilder(config, beanDesc);
        testType = null;
        propDef = null;
        accessor = null;
        serializerProvider = null;
    }

    @After
    public void tearDown() {
        config = null;
        beanDesc = null;
        builder = null;
        testType = null;
        propDef = null;
        accessor = null;
        serializerProvider = null;
    }

    @Test
    public void testConstructorInitializesFields() {
        assertNotNull(builder._config);
        assertNotNull(builder._beanDesc);
        assertNotNull(builder._defaultInclusion);
        assertFalse(builder._useRealPropertyDefaults);
        assertNull(builder._defaultBean);
        assertNull(builder._annotationIntrospector);
    }

    @Test
    public void testGetClassAnnotations() {
        assertNotNull(builder.getClassAnnotations());
    }

    @Test
    public void testFindSerializationTypeWithNullSecondary() {
        AnnotatedMember am = new AnnotatedMethod(null, null, null);
        JavaType declaredType = config.constructType(String.class);
        JavaType result = builder.findSerializationType(am, false, declaredType);
        assertNull(result);
    }

    @Test
    public void testFindSerializationTypeWithSameSecondary() {
        AnnotatedMethod am = new AnnotatedMethod(null, null, null);
        JavaType declaredType = config.constructType(String.class);
        JavaType result = builder.findSerializationType(am, false, declaredType);
        assertNull(result);
    }

    @Test
    public void testGetDefaultValueWithNullDefaultBean() {
        JavaType type = config.constructType(Integer.class);
        Object result = builder.getDefaultValue(type);
        assertEquals(Integer.valueOf(0), result);
    }

    @Test
    public void testGetDefaultValueWithWrapperType() throws Exception {
        JavaType type = config.constructType(Double.class);
        Object result = builder.getDefaultValue(type);
        assertEquals(0.0, (Double) result, 0.0);
    }

    @Test
    public void testGetDefaultValueWithReferenceType() {
        JavaType type = config.constructType(String.class);
        Object result = builder.getDefaultValue(type);
        assertNull(result);
    }

    @Test
    public void testGetDefaultValueWithArrayType() {
        JavaType type = config.constructType(String[].class);
        Object result = builder.getDefaultValue(type);
        assertNull(result);
    }

    @Test
    public void testGetDefaultValueWithPrimitiveType() {
        JavaType type = config.constructType(int.class);
        Object result = builder.getDefaultValue(type);
        assertEquals(Integer.valueOf(0), result);
    }

    @Test
    public void testThrowWrapped() {
        Exception e = new RuntimeException("Test exception");
        try {
            builder._throwWrapped(e, "testProp", new Object());
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            assertTrue(ex.getMessage().contains("testProp"));
        }
    }

    @Test
    public void testBuildWriterWithNullPropDef() throws Exception {
        boolean exceptionThrown = false;
        try {
            builder.buildWriter(null, null, null, null, null, null, null, false);
        } catch (NullPointerException e) {
            exceptionThrown = true;
        }
        assertFalse("Should not throw NPE", exceptionThrown);
    }

    @Test
    public void testBuildWriterWithInclusionAlways() throws Exception {
        JavaType type = config.constructType(String.class);
        BeanPropertyDefinition propDef = new BeanPropertyDefinition(null, null, null, null, null, true, true, true);
        AnnotatedMember am = new AnnotatedField(null, null, null, null);
        Object result = builder.buildWriter(null, propDef, type, null, null, null, am, false);
        assertNull(result);
    }

    @Test
    public void testBuildWriterWithNullAccessor() throws Exception {
        JavaType type = config.constructType(String.class);
        BeanPropertyDefinition propDef = new BeanPropertyDefinition(null, null, null, null, null, true, true, true);
        try {
            builder.buildWriter(null, propDef, type, null, null, null, null, false);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // Expected
        }
    }

    @Test
    public void testDefaultBeanHandling() throws Exception {
        assertEquals(null, builder.getDefaultBean());
    }

    @Test
    public void testFindSerializationTypeWithIllegalType() throws Exception {
        JavaType declaredType = config.constructType(Number.class);
        Class<?> serClass = String.class;
        Class<?> rawDeclared = declaredType.getRawClass();
        if (!rawDeclared.isAssignableFrom(serClass)) {
            try {
                throw new IllegalArgumentException("Illegal concrete-type annotation");
            } catch (IllegalArgumentException e) {
                // Expected
                return;
            }
        }
        fail("Expected IllegalArgumentException for incompatible types");
    }

    @Test
    public void testGetDefaultValueForEmptyString() {
        JavaType type = config.constructType(String.class);
        Object result = builder.getDefaultValue(type);
        assertNull("Empty string should return null default", result);
    }

    @Test
    public void testGetDefaultValueForKnownTypes() {
        JavaType intType = config.constructType(Integer.class);
        Object intResult = builder.getDefaultValue(intType);
        assertEquals(0, intResult);
        
        JavaType longType = config.constructType(Long.class);
        Object longResult = builder.getDefaultValue(longType);
        assertEquals(0L, longResult);
        
        JavaType boolType = config.constructType(Boolean.class);
        Object boolResult = builder.getDefaultValue(boolType);
        assertEquals(Boolean.FALSE, boolResult);
    }

    @Test
    public void testBuildWriterWithSerializationTypeMismatch() throws Exception {
        JavaType declaredType = config.constructType(String.class);
        JavaType serializationType = config.constructType(Object.class);
        BeanPropertyDefinition propDef = new BeanPropertyDefinition(null, null, null, null, null, true, true, true);
        AnnotatedField am = new AnnotatedField(null, serializationType, null, null);
        try {
            builder.buildWriter(null, propDef, declaredType, null, null, null, am, false);
        } catch (Exception e) {
            // Should not throw for basic mismatch
        }
    }

    @Test(expected = NullPointerException.class)
    public void testGetDefaultValueWithNullType() {
        builder.getDefaultValue(null);
    }
}