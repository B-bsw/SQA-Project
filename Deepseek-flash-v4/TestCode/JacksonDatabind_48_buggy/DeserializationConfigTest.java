package com.fasterxml.jackson.databind;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;

import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

public class DeserializationConfigTest {

    private ObjectMapper mapper;
    private DeserializationConfig config;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        config = mapper.getDeserializationConfig();
    }

    @Test
    public void testDefaults() {
        assertSame(JsonNodeFactory.instance, config.getNodeFactory());
        assertNull(config.getProblemHandlers());
        assertFalse(config.useRootWrapping());
        assertNotNull(config.getDefaultVisibilityChecker());
        assertNotNull(config.getAnnotationIntrospector());
    }

    @Test
    public void testDeserializationFeatureMutations() {
        DeserializationFeature feature = DeserializationFeature.UNWRAP_ROOT_VALUE;

        DeserializationConfig enabled = config.with(feature);
        assertTrue(enabled.isEnabled(feature));
        assertNotSame(config, enabled);
        assertSame(enabled, enabled.with(feature));

        DeserializationConfig disabled = enabled.without(feature);
        assertFalse(disabled.isEnabled(feature));

        int mask = feature.getMask();
        assertTrue(enabled.hasDeserializationFeatures(mask));
        assertTrue(enabled.hasSomeOfFeatures(mask));
        assertFalse(config.hasDeserializationFeatures(mask));

        DeserializationFeature second = DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY;
        DeserializationConfig multi = config.with(feature, second);
        int both = feature.getMask() | second.getMask();
        assertTrue(multi.hasDeserializationFeatures(both));

        DeserializationConfig multi2 = config.withFeatures(feature, second);
        assertTrue(multi2.hasDeserializationFeatures(both));

        DeserializationConfig clean = multi2.withoutFeatures(feature, second);
        assertFalse(clean.isEnabled(feature));
        assertFalse(clean.isEnabled(second));
    }

    @Test
    public void testMapperFeatureMutations() {
        MapperFeature feature = MapperFeature.SORT_PROPERTIES_ALPHABETICALLY;

        DeserializationConfig enabled = config.with(feature);
        assertTrue(enabled.isEnabled(feature));
        assertNotSame(config, enabled);

        assertFalse(enabled.without(feature).isEnabled(feature));
        assertFalse(enabled.with(feature, false).isEnabled(feature));
    }

    @Test
    public void testParserFeatureMutationsAndInitialize() throws Exception {
        JsonParser.Feature feature = JsonParser.Feature.ALLOW_COMMENTS;
        JsonFactory factory = new JsonFactory();

        assertFalse(config.isEnabled(feature, factory));

        DeserializationConfig enabled = config.with(feature);
        assertTrue(enabled.isEnabled(feature, factory));
        assertSame(enabled, enabled.with(feature));

        assertFalse(enabled.without(feature).isEnabled(feature, factory));

        DeserializationConfig enabledByVarargs = config.withFeatures(feature);
        assertTrue(enabledByVarargs.isEnabled(feature, factory));
        assertFalse(enabledByVarargs.withoutFeatures(feature).isEnabled(feature, factory));

        JsonParser parser = factory.createParser("{}");
        try {
            enabled.initialize(parser);
            assertTrue(parser.isEnabled(feature));
        } finally {
            parser.close();
        }
    }

    @Test
    public void testRootName() {
        PropertyName root = new PropertyName("root");

        DeserializationConfig rooted = config.withRootName(root);
        assertTrue(rooted.useRootWrapping());
        assertNotSame(config, rooted);
        assertSame(rooted, rooted.withRootName(root));

        assertSame(config, config.withRootName(null));

        DeserializationConfig unwrapped = config.with(DeserializationFeature.UNWRAP_ROOT_VALUE);
        assertTrue(unwrapped.useRootWrapping());
    }

    @Test
    public void testProblemHandlersAndNodeFactory() {
        assertSame(config, config.withNoProblemHandlers());

        DeserializationProblemHandler handler = new DeserializationProblemHandler() {};
        DeserializationConfig withHandler = config.withHandler(handler);

        assertNotNull(withHandler.getProblemHandlers());
        assertSame(handler, withHandler.getProblemHandlers().value());
        assertSame(withHandler, withHandler.withHandler(handler));
        assertNull(withHandler.withNoProblemHandlers().getProblemHandlers());

        assertNotNull(config.with(JsonNodeFactory.instance));

        JsonNodeFactory custom = new JsonNodeFactory();
        DeserializationConfig withFactory = config.with(custom);
        assertNotSame(config, withFactory);
        assertSame(custom, withFactory.getNodeFactory());
    }

    @Test
    public void testAnnotationsAndIntrospection() {
        assertNotNull(config.getAnnotationIntrospector());

        DeserializationConfig noAnnotations = config.with(MapperFeature.USE_ANNOTATIONS, false);
        assertSame(NopAnnotationIntrospector.instance, noAnnotations.getAnnotationIntrospector());

        JavaType type = config.getTypeFactory().constructType(String.class);
        assertNotNull(config.introspectClassAnnotations(type));
        assertNotNull(config.introspectDirectClassAnnotations(type));
        assertNotNull(config.introspectForCreation(type));
    }

    @Test
    public void testWithFactoryAndIntrospectors() {
        assertNotNull(config.with(config.getClassIntrospector()));
        assertNotNull(config.with(new JacksonAnnotationIntrospector()));
        assertNotNull(config.with(config.getDefaultVisibilityChecker()));
        assertNotNull(config.withVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY));

        PropertyNamingStrategy namingStrategy = new PropertyNamingStrategy() {};
        assertNotNull(config.with(namingStrategy));

        assertNotNull(config.with(config.getTypeFactory()));
        assertNotNull(config.with(DateFormat.getDateTimeInstance()));
        assertNotNull(config.with(Locale.US));
        assertNotNull(config.with(TimeZone.getDefault()));
        assertNotNull(config.with(Base64Variants.MIME_NO_LINEFEEDS));

        assertNotNull(config.withInsertedAnnotationIntrospector(new JacksonAnnotationIntrospector()));
        assertNotNull(config.withAppendedAnnotationIntrospector(new JacksonAnnotationIntrospector()));
    }
}