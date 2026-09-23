package com.fasterxml.jackson.databind.cfg;

import static org.junit.Assert.*;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.StdDateFormat;

public class BaseSettingsTest {

    private BaseSettings createDefaultBaseSettings() {
        return new BaseSettings(
            null, null, null, null, null, null, null, null, Locale.US, TimeZone.getTimeZone("UTC"), null);
    }

    @Test
    public void testGetDefaultValues() {
        ClassIntrospector ci = new DummyClassIntrospector();
        AnnotationIntrospector ai = new DummyAnnotationIntrospector();
        VisibilityChecker<?> vc = new DummyVisibilityChecker();
        PropertyNamingStrategy pns = PropertyNamingStrategy.SNAKE_CASE;
        TypeFactory tf = TypeFactory.defaultInstance();
        TypeResolverBuilder<?> trb = new DummyTypeResolverBuilder();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        HandlerInstantiator hi = new DummyHandlerInstantiator();
        Locale locale = Locale.GERMANY;
        TimeZone tz = TimeZone.getTimeZone("GMT");
        Base64Variant base64 = Base64Variant.STD_BASE64;

        BaseSettings settings = new BaseSettings(ci, ai, vc, pns, tf, trb, df, hi, locale, tz, base64);
        assertSame(ci, settings.getClassIntrospector());
        assertSame(ai, settings.getAnnotationIntrospector());
        assertSame(vc, settings.getVisibilityChecker());
        assertSame(pns, settings.getPropertyNamingStrategy());
        assertSame(tf, settings.getTypeFactory());
        assertSame(trb, settings.getTypeResolverBuilder());
        assertSame(df, settings.getDateFormat());
        assertSame(hi, settings.getHandlerInstantiator());
        assertSame(locale, settings.getLocale());
        assertSame(tz, settings.getTimeZone());
        assertSame(base64, settings.getDefaultBase64());
    }

    @Test
    public void testWithClassIntrospector_IdenticalReturnSelf() {
        BaseSettings original = createDefaultBaseSettings();
        assertSame(original, original.withClassIntrospector(null));
    }

    @Test
    public void testWithClassIntrospector_NewInstance() {
        BaseSettings original = createDefaultBaseSettings();
        ClassIntrospector ci = new DummyClassIntrospector();
        BaseSettings modified = original.withClassIntrospector(ci);
        assertNotNull(modified);
        assertNotSame(original, modified);
        assertSame(ci, modified.getClassIntrospector());
        assertSame(null, modified.getAnnotationIntrospector());
        assertSame(null, modified.getVisibilityChecker());
        assertSame(null, modified.getPropertyNamingStrategy());
        assertSame(null, modified.getTypeFactory());
        assertSame(null, modified.getTypeResolverBuilder());
        assertSame(null, modified.getDateFormat());
        assertSame(null, modified.getHandlerInstantiator());
        assertSame(Locale.US, modified.getLocale());
        assertSame(TimeZone.getTimeZone("UTC"), modified.getTimeZone());
        assertSame(null, modified.getDefaultBase64());
    }

    @Test
    public void testWithAnnotationIntrospector_IdenticalReturnSelf() {
        BaseSettings original = createDefaultBaseSettings();
        assertSame(original, original.withAnnotationIntrospector(null));
    }

    @Test
    public void testWithAnnotationIntrospector_NewInstance() {
        BaseSettings original = createDefaultBaseSettings();
        AnnotationIntrospector ai = new DummyAnnotationIntrospector();
        BaseSettings modified = original.withAnnotationIntrospector(ai);
        assertNotNull(modified);
        assertNotSame(original, modified);
        assertSame(ai, modified.getAnnotationIntrospector());
        assertSame(null, modified.getClassIntrospector());
        assertEquals(Locale.US, modified.getLocale());
    }

    @Test
    public void testWithInsertedAnnotationIntrospector_SameAsPair() {
        BaseSettings original = createDefaultBaseSettings();
        AnnotationIntrospector ai = new DummyAnnotationIntrospector();
        BaseSettings modified = original.withInsertedAnnotationIntrospector(ai);
        assertNotSame(original, modified);
        assertNotNull(modified.getAnnotationIntrospector());
        assertTrue(modified.getAnnotationIntrospector() instanceof AnnotationIntrospectorPair);
        AnnotationIntrospectorPair pair = (AnnotationIntrospectorPair) modified.getAnnotationIntrospector();
        assertSame(ai, pair.primary());
        assertSame(null, pair.secondary());
    }

    @Test
    public void testWithAppendedAnnotationIntrospector_SameAsPair() {
        BaseSettings original = createDefaultBaseSettings();
        AnnotationIntrospector ai = new DummyAnnotationIntrospector();
        BaseSettings modified = original.withAppendedAnnotationIntrospector(ai);
        assertNotSame(original, modified);
        assertNotNull(modified.getAnnotationIntrospector());
        assertTrue(modified.getAnnotationIntrospector() instanceof AnnotationIntrospectorPair);
        AnnotationIntrospectorPair pair = (AnnotationIntrospectorPair) modified.getAnnotationIntrospector();
        assertSame(null, pair.primary());
        assertSame(ai, pair.secondary());
    }

    @Test
    public void testWithVisibilityChecker_IdenticalReturnSelf() {
        BaseSettings original = createDefaultBaseSettings();
        assertSame(original, original.withVisibilityChecker(null));
    }

    @Test
    public void testWithVisibilityChecker_NewInstance() {
        BaseSettings original = createDefaultBaseSettings();
        VisibilityChecker<?> vc = new DummyVisibilityChecker();
        BaseSettings modified = original.withVisibilityChecker(vc);
        assertNotSame(original, modified);
        assertSame(vc, modified.getVisibilityChecker());
    }

    @Test
    public void testWithVisibility_NewInstance() {
        BaseSettings original = createDefaultBaseSettings();
        BaseSettings modified = original.withVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        assertNotSame(original, modified);
        assertNotNull(modified.getVisibilityChecker());
    }

    @Test
    public void testWithPropertyNamingStrategy_IdenticalReturnSelf() {
        BaseSettings original = createDefaultBaseSettings();
        assertSame(original, original.withPropertyNamingStrategy(null));
    }

    @Test
    public void testWithPropertyNamingStrategy_NewInstance() {
        BaseSettings original = createDefaultBaseSettings();
        PropertyNamingStrategy pns = PropertyNamingStrategy.SNAKE_CASE;
        BaseSettings modified = original.withPropertyNamingStrategy(pns);
        assertNotSame(original, modified);
        assertSame(pns, modified.getPropertyNamingStrategy());
    }

    @Test
    public void testWithTypeFactory_IdenticalReturnSelf() {
        BaseSettings original = createDefaultBaseSettings();
        assertSame(original, original.withTypeFactory(null));
    }

    @Test
    public void testWithTypeFactory_NewInstance() {
        BaseSettings original = createDefaultBaseSettings();
        TypeFactory tf = TypeFactory.defaultInstance();
        BaseSettings modified = original.withTypeFactory(tf);
        assertNotSame(original, modified);
        assertSame(tf, modified.getTypeFactory());
    }

    @Test
    public void testWithTypeResolverBuilder_IdenticalReturnSelf() {
        BaseSettings original = createDefaultBaseSettings();
        assertSame(original, original.withTypeResolverBuilder(null));
    }

    @Test
    public void testWithTypeResolverBuilder_NewInstance() {
        BaseSettings original = createDefaultBaseSettings();
        TypeResolverBuilder<?> trb = new DummyTypeResolverBuilder();
        BaseSettings modified = original.withTypeResolverBuilder(trb);
        assertNotSame(original, modified);
        assertSame(trb, modified.getTypeResolverBuilder());
    }

    @Test
    public void testWithDateFormat_IdenticalReturnSelf() {
        BaseSettings original = createDefaultBaseSettings();
        assertSame(original, original.withDateFormat(null));
    }

    @Test
    public void testWithDateFormat_NullSameAsNull() {
        BaseSettings original = createDefaultBaseSettings();
        assertSame(original, original.withDateFormat(null));
    }

    @Test
    public void testWithDateFormat_StdDateFormat() {
        BaseSettings original = createDefaultBaseSettings();
        StdDateFormat sdf = new StdDateFormat();
        BaseSettings modified = original.withDateFormat(sdf);
        assertNotSame(original, modified);
        assertSame(sdf, modified.getDateFormat());
    }

    @Test
    public void testWithDateFormat_NonStdDateFormat() {
        BaseSettings original = createDefaultBaseSettings();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        BaseSettings modified = original.withDateFormat(df);
        assertNotSame(original, modified);
        assertSame(df, modified.getDateFormat());
    }

    @Test
    public void testWithHandlerInstantiator_IdenticalReturnSelf() {
        BaseSettings original = createDefaultBaseSettings();
        assertSame(original, original.withHandlerInstantiator(null));
    }

    @Test
    public void testWithHandlerInstantiator_NewInstance() {
        BaseSettings original = createDefaultBaseSettings();
        HandlerInstantiator hi = new DummyHandlerInstantiator();
        BaseSettings modified = original.withHandlerInstantiator(hi);
        assertNotSame(original, modified);
        assertSame(hi, modified.getHandlerInstantiator());
    }

    @Test
    public void testWithLocale_IdenticalReturnSelf() {
        BaseSettings original = createDefaultBaseSettings();
        assertSame(original, original.with(Locale.US));
    }

    @Test
    public void testWithLocale_NewInstance() {
        BaseSettings original = createDefaultBaseSettings();
        Locale loc = Locale.FRANCE;
        BaseSettings modified = original.with(loc);
        assertNotSame(original, modified);
        assertSame(loc, modified.getLocale());
    }

    @Test
    public void testWithTimeZone_NullThrowsIllegalArgument() {
        BaseSettings original = createDefaultBaseSettings();
        try {
            original.with((TimeZone) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testWithTimeZone_StdDateFormat() {
        BaseSettings original = createDefaultBaseSettings();
        TimeZone tz = TimeZone.getTimeZone("GMT+2");
        BaseSettings modified = original.with(tz);
        assertNotSame(original, modified);
        assertSame(tz, modified.getTimeZone());
    }

    @Test
    public void testWithTimeZone_NonStdDateFormat() {
        BaseSettings original = createDefaultBaseSettings();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        BaseSettings originalWithFormat = original.withDateFormat(df);
        TimeZone tz = TimeZone.getTimeZone("GMT+3");
        BaseSettings modified = originalWithFormat.with(tz);
        assertNotSame(originalWithFormat, modified);
        assertSame(tz, modified.getTimeZone());
        assertNotSame(df, modified.getDateFormat());
        assertSame(tz, modified.getDateFormat().getTimeZone());
    }

    @Test
    public void testWithBase64_IdenticalReturnSelf() {
        BaseSettings original = createDefaultBaseSettings();
        assertSame(original, original.with(Base64Variant.STD_BASE64));
    }

    @Test
    public void testWithBase64_NewInstance() {
        BaseSettings original = createDefaultBaseSettings();
        Base64Variant custom = new Base64Variant("test", "test", true, '!', 4);
        BaseSettings modified = original.with(custom);
        assertNotSame(original, modified);
        assertSame(custom, modified.getDefaultBase64());
    }

    // Dummy implementations for abstract/interface classes
    private static class DummyClassIntrospector extends ClassIntrospector {
        public DummyClassIntrospizer() { super(); }
        public DummyClassIntrospector() { super(); }
    }

    private static class DummyAnnotationIntrospector extends AnnotationIntrospector {
        private static final long serialVersionUID = 1L;
    }

    private static class DummyVisibilityChecker implements VisibilityChecker<DummyVisibilityChecker> {
        @Override
        public DummyVisibilityChecker withVisibility(PropertyAccessor acc, JsonAutoDetect.Visibility visibility) {
            return new DummyVisibilityChecker();
        }
        @Override
        public DummyVisibilityChecker with(JsonAutoDetect.Visibility v) { return new DummyVisibilityChecker(); }
        @Override
        public DummyVisibilityChecker withOverridedVisibility(JsonAutoDetect.Visibility v) { return new DummyVisibilityChecker(); }
        @Override
        public DummyVisibilityChecker withGetterVisibility(JsonAutoDetect.Visibility v) { return new DummyVisibilityChecker(); }
        @Override
        public DummyVisibilityChecker withIsGetterVisibility(JsonAutoDetect.Visibility v) { return new DummyVisibilityChecker(); }
        @Override
        public DummyVisibilityChecker withSetterVisibility(JsonAutoDetect.Visibility v) { return new DummyVisibilityChecker(); }
        @Override
        public DummyVisibilityChecker withCreatorVisibility(JsonAutoDetect.Visibility v) { return new DummyVisibilityChecker(); }
        @Override
        public DummyVisibilityChecker withFieldVisibility(JsonAutoDetect.Visibility v) { return new DummyVisibilityChecker(); }
        @Override
        public boolean isGetterVisible(com.fasterxml.jackson.databind.introspect.AnnotatedMethod m) { return false; }
        @Override
        public boolean isGetterVisible(com.fasterxml.jackson.databind.introspect.AnnotatedMethod m, Class<?> subclass) { return false; }
        @Override
        public boolean isIsGetterVisible(com.fasterxml.jackson.databind.introspect.AnnotatedMethod m) { return false; }
        @Override
        public boolean isIsGetterVisible(com.fasterxml.jackson.databind.introspect.AnnotatedMethod m, Class<?> subclass) { return false; }
        @Override
        public boolean isSetterVisible(com.fasterxml.jackson.databind.introspect.AnnotatedMethod m) { return false; }
        @Override
        public boolean isSetterVisible(com.fasterxml.jackson.databind.introspect.AnnotatedMethod m, Class<?> subclass) { return false; }
        @Override
        public boolean isCreatorVisible(com.fasterxml.jackson.databind.introspect.AnnotatedMember m) { return false; }
        @Override
        public boolean isCreatorVisible(com.fasterxml.jackson.databind.introspect.AnnotatedMember m, Class<?> subclass) { return false; }
        @Override
        public boolean isFieldVisible(com.fasterxml.jackson.databind.introspect.AnnotatedField f) { return false; }
        @Override
        public boolean isFieldVisible(com.fasterxml.jackson.databind.introspect.AnnotatedField f, Class<?> subclass) { return false; }
    }

    private static class DummyTypeResolverBuilder extends TypeResolverBuilder<DummyTypeResolverBuilder> {
        public DummyTypeResolverBuilder() { super(); }
    }

    private static class DummyHandlerInstantiator extends HandlerInstantiator {
        public DummyHandlerInstantiator() { super(); }
        // implement abstract methods minimally
        @Override
        public com.fasterxml.jackson.databind.JsonDeserializer<?> deserializerInstance(com.fasterxml.jackson.databind.DeserializationContext config, com.fasterxml.jackson.databind.introspect.Annotated annotated, Class<?> implClass) { return null; }
        @Override
        public com.fasterxml.jackson.databind.KeyDeserializer keyDeserializerInstance(com.fasterxml.jackson.databind.DeserializationContext config, com.fasterxml.jackson.databind.introspect.Annotated annotated, Class<?> implClass) { return null; }
        @Override
        public com.fasterxml.jackson.databind.JsonSerializer<?> serializerInstance(com.fasterxml.jackson.databind.SerializationConfig config, com.fasterxml.jackson.databind.introspect.Annotated annotated, Class<?> implClass) { return null; }
        @Override
        public com.fasterxml.jackson.databind.JsonDeserializer<?> deserializerInstance(com.fasterxml.jackson.databind.DeserializationConfig config, com.fasterxml.jackson.databind.introspect.Annotated annotated, Class<?> implClass) { return null; }
        @Override
        public com.fasterxml.jackson.databind.KeyDeserializer keyDeserializerInstance(com.fasterxml.jackson.databind.DeserializationConfig config, com.fasterxml.jackson.databind.introspect.Annotated annotated, Class<?> implClass) { return null; }
        @Override
        public com.fasterxml.jackson.databind.JsonSerializer<?> serializerInstance(com.fasterxml.jackson.databind.SerializationConfig config, com.fasterxml.jackson.databind.introspect.Annotated annotated, Class<?> implClass) { return null; }
        @Override
        public com.fasterxml.jackson.databind.JsonSerializer<?> serializerInstance(com.fasterxml.jackson.databind.SerializationConfig config, com.fasterxml.jackson.databind.introspect.Annotated annotated, Class<?> implClass) { return null; }
        @Override
        public com.fasterxml.jackson.databind.JsonSerializer<?> serializerInstance(com.fasterxml.jackson.databind.SerializationConfig config, com.fasterxml.jackson.databind.introspect.Annotated annotated, Class<?> implClass) { return null; }
        @Override
        public com.fasterxml.jackson.databind.JsonSerializer<?> serializerInstance(com.fasterxml.jackson.databind.SerializationConfig config, com.fasterxml.jackson.databind.introspect.Annotated annotated, Class<?> implClass) { return null; }
        @Override
        public com.fasterxml.jackson.databind.JsonSerializer<?> serializerInstance(com.fasterxml.jackson.databind.SerializationConfig config, com.fasterxml.jackson.databind.introspect.Annotated annotated, Class<?> implClass) { return null; }
        @Override
        public com.fasterxml.jackson.databind.JsonSerializer<?> serializerInstance(com.fasterxml.jackson.databind.SerializationConfig config, com.fasterxml.jackson.databind.introspect.Annotated annotated, Class<?> implClass) { return null; }
    }
}