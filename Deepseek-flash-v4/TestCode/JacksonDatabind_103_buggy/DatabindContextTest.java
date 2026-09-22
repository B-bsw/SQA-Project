package com.fasterxml.jackson.databind;

import java.lang.reflect.Type;
import java.util.Locale;
import java.util.TimeZone;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class DatabindContextTest {
    private DatabindContext context;
    private MapperConfig<?> config;

    @Before
    public void setUp() {
        config = new TestMapperConfig();
        context = new TestDatabindContext(config);
    }

    @After
    public void tearDown() {
        context = null;
        config = null;
    }

    @Test
    public void testConstructTypeWithNull() {
        assertNull(context.constructType(null));
    }

    @Test
    public void testConstructTypeWithValidType() {
        JavaType result = context.constructType(String.class);
        assertNotNull(result);
        assertEquals(String.class, result.getRawClass());
    }

    @Test
    public void testConstructSpecializedTypeSameClass() {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        JavaType result = context.constructSpecializedType(baseType, Object.class);
        assertSame(baseType, result);
    }

    @Test
    public void testConstructSpecializedTypeDifferentClass() {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        JavaType result = context.constructSpecializedType(baseType, String.class);
        assertNotNull(result);
        assertEquals(String.class, result.getRawClass());
    }

    @Test
    public void testResolveSubTypeWithGenerics() {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        JavaType result = context.resolveSubType(baseType, "java.lang.String<foo>");
        // Invalid type id should throw JsonMappingException, but with generics and not subtype it should throw
        try {
            result = context.resolveSubType(baseType, "java.util.List<java.lang.String>");
            // If no exception, check subtype compatibility
            assertTrue(result.isTypeOrSubTypeOf(baseType.getRawClass()));
        } catch (JsonMappingException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testResolveSubTypeWithValidClass() throws Exception {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Number.class);
        JavaType result = context.resolveSubType(baseType, "java.lang.Integer");
        assertNotNull(result);
        assertEquals(Integer.class, result.getRawClass());
    }

    @Test
    public void testResolveSubTypeWithInvalidClass() {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Integer.class);
        try {
            context.resolveSubType(baseType, "java.lang.String");
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testResolveSubTypeWithClassNotFound() {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        JavaType result = context.resolveSubType(baseType, "nonexistent.ClassName");
        assertNull(result);
    }

    @Test
    public void testObjectIdGeneratorInstance() throws Exception {
        // Prepare mock data
        Annotated annotated = new TestAnnotated();
        ObjectIdInfo idInfo = new ObjectIdInfo(new PropertyName("id"), ObjectIdGenerator.class, TestObjectIdGenerator.class, null);
        
        ObjectIdGenerator<?> gen = context.objectIdGeneratorInstance(annotated, idInfo);
        assertNotNull(gen);
        assertEquals(TestObjectIdGenerator.class, gen.getClass());
        assertNotNull(gen.getScope());
    }

    @Test
    public void testObjectIdResolverInstanceWithHandler() throws Exception {
        Annotated annotated = new TestAnnotated();
        ObjectIdInfo idInfo = new ObjectIdInfo(new PropertyName("id"), ObjectIdGenerator.class, TestObjectIdResolver.class, null);
        ObjectIdResolver resolver = (ObjectIdResolver) context.objectIdResolverInstance(annotated, idInfo);
        assertNotNull(resolver);
        assertTrue(resolver instanceof TestObjectIdResolver);
    }

    @Test
    public void testConverterInstanceWithNull() throws Exception {
        assertNull(context.converterInstance(null, null));
    }

    @Test
    public void testConverterInstanceWithConverterType() throws Exception {
        Converter<Object, Object> conv = context.converterInstance(new TestAnnotated(), TestConverter.class);
        assertNotNull(conv);
        assertTrue(conv instanceof TestConverter);
    }

    @Test
    public void testConverterInstanceWithClassInstance() throws Exception {
        Converter<Object, Object> conv = context.converterInstance(new TestAnnotated(), TestConverter.class);
        assertNotNull(conv);
        assertTrue(conv instanceof TestConverter);
    }

    @Test
    public void testConverterInstanceWithInvalidClassType() {
        try {
            context.converterInstance(new TestAnnotated(), String.class);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        } catch (JsonMappingException e) {
            fail("Unexpected JsonMappingException: " + e.getMessage());
        }
    }

    @Test
    public void testConverterInstanceWithNoneClass() throws Exception {
        Converter<Object, Object> conv = context.converterInstance(new TestAnnotated(), Converter.None.class);
        assertNull(conv);
    }

    @Test
    public void testReportBadDefinitionWithClass() throws Exception {
        try {
            context.reportBadDefinition(String.class, "Test error");
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertEquals("Test error", e.getOriginalMessage());
        }
    }

    @Test
    public void testReportBadDefinitionWithJavaType() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        try {
            context.reportBadDefinition(type, "Test error type");
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertEquals("Test error type", e.getOriginalMessage());
        }
    }

    @Test
    public void testFormatWithArgs() {
        String result = context.format("Value is %d and %s", 5, "test");
        assertEquals("Value is 5 and test", result);
    }

    @Test
    public void testFormatWithoutArgs() {
        String result = context.format("No args");  // package-private, but test in same package
        assertEquals("No args", result);
    }

    @Test
    public void testTruncateWithNull() {
        // _truncate is private, test via _quotedString
        assertEquals("[N/A]", context.quotedString(null));
    }

    @Test
    public void testTruncateWithShortString() {
        String shortStr = "short";
        assertEquals("\"" + shortStr + "\"", context.quotedString(shortStr));
    }

    @Test
    public void testTruncateWithLongString() {
        String longStr = "a".repeat(1000);
        String quoted = context.quotedString(longStr);
        assertTrue(quoted.length() < 1000);
        assertTrue(quoted.startsWith("\"") && quoted.endsWith("\""));
        // Check that it's truncated with "..."
        assertTrue(quoted.contains("]...["));
    }

    @Test
    public void testColonConcatWithNullExtra() {
        assertEquals("msg", context.colonConcat("msg", null));
    }

    @Test
    public void testColonConcatWithNonNullExtra() {
        assertEquals("msg: extra", context.colonConcat("msg", "extra"));
    }

    @Test
    public void testDescWithNull() {
        assertEquals("[N/A]", context.desc(null));
    }

    @Test
    public void testDescWithNonNull() {
        assertEquals("testdesc", context.desc("testdesc"));
    }

    @Test
    public void testDescWithLongString() {
        String longDesc = "b".repeat(600);
        String result = context.desc(longDesc);
        assertTrue(result.length() < 600);
        assertTrue(result.contains("]...["));
    }

    @Test
    public void testResolveSubTypeWithExceptionInFindClass() {
        // Simulate class not found
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        JavaType result = null;
        try {
            result = context.resolveSubType(baseType, "nonexistent.Class");
        } catch (JsonMappingException e) {
            fail("No exception expected for non-existent class");
        }
        assertNull(result);
    }

    @Test
    public void testResolveSubTypeWithGenericAndSupertype() {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        JavaType result = null;
        try {
            result = context.resolveSubType(baseType, "java.lang.String<generics>");
            // invalid type id should throw
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testInvalidTypeIdExceptionIsAbstract() throws Exception {
        // Verify that invalidTypeIdException is abstract by checking it can't be instantiated
        java.lang.reflect.Method method = DatabindContext.class.getDeclaredMethod("invalidTypeIdException", JavaType.class, String.class, String.class);
        assertTrue(java.lang.reflect.Modifier.isAbstract(method.getModifiers()));
    }

    @Test
    public void testObjectIdGeneratorInstanceWithHandler() throws Exception {
        // Test with custom HandlerInstantiator
        config = new TestMapperConfig();
        ((TestMapperConfig) config).setHandlerInstantiator(new TestHandlerInstantiator());
        context = new TestDatabindContext(config);
        Annotated annotated = new TestAnnotated();
        ObjectIdInfo idInfo = new ObjectIdInfo(new PropertyName("id"), ObjectIdGenerator.class, TestObjectIdGenerator.class, null);
        ObjectIdGenerator<?> gen = context.objectIdGeneratorInstance(annotated, idInfo);
        assertNotNull(gen);
        // Handler should return custom generator
        assertEquals(CustomObjectIdGenerator.class, gen.getClass());
    }

    // Helper methods and classes for testing
    private String getAttr(Object key) {
        return null;
    }

    private void setAttr(Object key, Object value) {
    }

    private DatabindContext createContext() {
        return new DatabindContext() {
            @Override
            public MapperConfig<?> getConfig() { return config; }
            @Override
            public AnnotationIntrospector getAnnotationIntrospector() { return null; }
            @Override
            public boolean isEnabled(MapperFeature feature) { return false; }
            @Override
            public boolean canOverrideAccessModifiers() { return true; }
            @Override
            public Class<?> getActiveView() { return null; }
            @Override
            public Locale getLocale() { return null; }
            @Override
            public TimeZone getTimeZone() { return null; }
            @Override
            public JsonFormat.Value getDefaultPropertyFormat(Class<?> baseType) { return null; }
            @Override
            public Object getAttribute(Object key) { return null; }
            @Override
            public DatabindContext setAttribute(Object key, Object value) { return null; }
            @Override
            protected JsonMappingException invalidTypeIdException(JavaType baseType, String typeId, String extraDesc) {
                return new JsonMappingException(null, extraDesc);
            }
            @Override
            public TypeFactory getTypeFactory() { return TypeFactory.defaultInstance(); }
            @Override
            public <T> T reportBadDefinition(JavaType type, String msg) throws JsonMappingException {
                throw new JsonMappingException(null, msg);
            }
        };
    }

    // Test helper classes
    static class TestDatabindContext extends DatabindContext {
        private final MapperConfig<?> config;

        TestDatabindContext(MapperConfig<?> config) {
            this.config = config;
        }

        @Override
        public MapperConfig<?> getConfig() { return config; }

        @Override
        public AnnotationIntrospector getAnnotationIntrospector() { return null; }

        @Override
        public boolean isEnabled(MapperFeature feature) { return false; }

        @Override
        public boolean canOverrideAccessModifiers() { return true; }

        @Override
        public Class<?> getActiveView() { return null; }

        @Override
        public Locale getLocale() { return null; }

        @Override
        public TimeZone getTimeZone() { return null; }

        @Override
        public JsonFormat.Value getDefaultPropertyFormat(Class<?> baseType) { return null; }

        @Override
        public Object getAttribute(Object key) { return null; }

        @Override
        public DatabindContext setAttribute(Object key, Object value) { return null; }

        @Override
        protected JsonMappingException invalidTypeIdException(JavaType baseType, String typeId, String extraDesc) {
            return new JsonMappingException(null, extraDesc);
        }

        @Override
        public TypeFactory getTypeFactory() { return TypeFactory.defaultInstance(); }

        @Override
        public <T> T reportBadDefinition(JavaType type, String msg) throws JsonMappingException {
            throw new JsonMappingException(null, msg);
        }
    }

    static class TestMapperConfig extends MapperConfig<TestMapperConfig> {
        private HandlerInstantiator handlerInstantiator;
        private TypeFactory typeFactory = TypeFactory.defaultInstance();

        TestMapperConfig() {
            super(null, null);
        }

        @Override
        public TestMapperConfig with(MapperFeature... features) { return null; }

        @Override
        public TestMapperConfig without(MapperFeature... features) { return null; }

        @Override
        public TestMapperConfig with(MapperFeature feature, boolean state) { return null; }

        @Override
        public boolean isEnabled(MapperFeature feature) { return false; }

        @Override
        public boolean canOverrideAccessModifiers() { return true; }

        @Override
        public Class<?> getActiveView() { return null; }

        @Override
        public HandlerInstantiator getHandlerInstantiator() { return handlerInstantiator; }

        @Override
        public TypeFactory getTypeFactory() { return typeFactory; }

        @Override
        public JavaType constructType(Type type) { return typeFactory.constructType(type); }

        @Override
        public JavaType constructSpecializedType(JavaType baseType, Class<?> subclass) {
            return typeFactory.constructSpecializedType(baseType, subclass);
        }

        void setHandlerInstantiator(HandlerInstantiator hi) {
            this.handlerInstantiator = hi;
        }
    }

    static class TestAnnotated extends Annotated {
        @Override
        public Class<?> getRawType() { return Object.class; }

        @Override
        public java.lang.reflect.AnnotatedElement getAnnotated() { return null; }

        @Override
        protected int hash() { return 0; }

        @Override
        public String getName() { return "test"; }

        @Override
        public String toString() { return "test"; }
    }

    static class TestObjectIdGenerator extends ObjectIdGenerator<String> {
        @Override
        public Class<?> getScope() { return Object.class; }

        @Override
        public ObjectIdGenerator<String> forScope(Class<?> scope) { return this; }

        @Override
        public ObjectIdGenerator<String> newForSerialization(Object context) { return this; }

        @Override
        public IdKey key(Object key) { return null; }

        @Override
        public String generateId(Object forPojo) { return "id"; }
    }

    static class TestObjectIdResolver implements ObjectIdResolver {
        @Override
        public void bindItem(JacksonPersistable.IdRef key, Object pojo) { }

        @Override
        public Object resolveId(JacksonPersistable.IdRef key) { return null; }

        @Override
        public ObjectIdResolver newForDeserialization(Object context) { return this; }

        @Override
        public boolean canUseFor(ObjectIdResolver resolverType) { return resolverType instanceof TestObjectIdResolver; }
    }

    static class TestConverter implements Converter<Object, Object> {
        @Override
        public Object convert(Object value) { return value; }

        @Override
        public JavaType getInputType(TypeFactory typeFactory) { return typeFactory.constructType(Object.class); }

        @Override
        public JavaType getOutputType(TypeFactory typeFactory) { return typeFactory.constructType(Object.class); }
    }

    static class CustomObjectIdGenerator extends TestObjectIdGenerator {
    }

    static class TestHandlerInstantiator extends HandlerInstantiator {
        @Override
        public ObjectIdGenerator<?> objectIdGeneratorInstance(MapperConfig<?> config, Annotated annotated, Class<?> implClass) {
            return new CustomObjectIdGenerator();
        }
    }
}