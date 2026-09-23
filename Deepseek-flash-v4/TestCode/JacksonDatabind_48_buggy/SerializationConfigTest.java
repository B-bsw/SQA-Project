package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Before;
import org.junit.Test;

import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

import static org.junit.Assert.*;

public class SerializationConfigTest {

    private ObjectMapper mapper;
    private SerializationConfig config;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        config = mapper.getSerializationConfig();
    }

    private interface TestView {}

    @Test
    public void testSerializationFeatureRoundTrip() {
        assertFalse(config.isEnabled(SerializationFeature.INDENT_OUTPUT));

        SerializationConfig c1 = config.with(SerializationFeature.INDENT_OUTPUT);
        assertNotSame(config, c1);
        assertTrue(c1.isEnabled(SerializationFeature.INDENT_OUTPUT));
        assertSame(c1, c1.with(SerializationFeature.INDENT_OUTPUT));

        SerializationConfig c2 = c1.without(SerializationFeature.INDENT_OUTPUT);
        assertNotSame(c1, c2);
        assertFalse(c2.isEnabled(SerializationFeature.INDENT_OUTPUT));
    }

    @Test
    public void testSerializationFeatureVarargs() {
        SerializationConfig c = config.withFeatures(
                SerializationFeature.INDENT_OUTPUT,
                SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

        assertTrue(c.isEnabled(SerializationFeature.INDENT_OUTPUT));
        assertTrue(c.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS));

        SerializationConfig c2 = c.withoutFeatures(
                SerializationFeature.INDENT_OUTPUT,
                SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

        assertFalse(c2.isEnabled(SerializationFeature.INDENT_OUTPUT));
        assertFalse(c2.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS));
    }

    @Test
    public void testHasSerializationFeatures() {
        SerializationConfig c = config.with(SerializationFeature.INDENT_OUTPUT);

        int indent = SerializationFeature.INDENT_OUTPUT.getMask();
        int missing = indent
                | SerializationFeature.WRITE_ENUMS_USING_TO_STRING.getMask();

        assertTrue(c.hasSerializationFeatures(indent));
        assertFalse(c.hasSerializationFeatures(missing));
    }

    @Test
    public void testMapperFeatureToggle() {
        SerializationConfig c = config.with(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
        assertTrue(c.isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY));

        SerializationConfig c2 = c.with(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, false);
        assertFalse(c2.isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY));
    }

    @Test
    public void testWithRootName() {
        assertSame(config, config.withRootName((PropertyName) null));

        SerializationConfig c = config.withRootName(PropertyName.construct("root"));
        assertNotSame(config, c);
        assertTrue(c.useRootWrapping());

        assertSame(c, c.withRootName(PropertyName.construct("root")));

        SerializationConfig c2 = c.withRootName(null);
        assertNotNull(c2);
        assertFalse(c2.useRootWrapping());
    }

    @Test
    public void testWithView() {
        assertSame(config, config.withView(null));

        SerializationConfig c = config.withView(TestView.class);
        assertNotSame(config, c);
        assertEquals(TestView.class, c.getActiveView());
        assertSame(c, c.withView(TestView.class));
    }

    @Test
    public void testWithLocaleAndTimeZone() {
        Locale locale = Locale.FRANCE;
        assertEquals(locale, config.with(locale).getLocale());

        TimeZone tz = TimeZone.getTimeZone("GMT+02:00");
        assertEquals(tz.getID(), config.with(tz).getTimeZone().getID());
    }

    @Test
    public void testWithSubtypeResolver() {
        SubtypeResolver resolver = new StdSubtypeResolver();
        SerializationConfig c = config.with(resolver);

        assertNotSame(config, c);
        assertEquals(resolver, c.getSubtypeResolver());
        assertSame(c, c.with(c.getSubtypeResolver()));
    }

    @Test
    public void testWithTypeFactory() {
        TypeFactory tf = TypeFactory.defaultInstance();
        SerializationConfig c = config.with(tf);

        assertEquals(tf, c.getTypeFactory());
    }

    @Test
    public void testFilters() {
        FilterProvider provider = new SimpleFilterProvider();

        SerializationConfig c = config.withFilters(provider);
        assertSame(provider, c.getFilterProvider());
        assertSame(c, c.withFilters(provider));
    }

    @Test
    public void testPropertyInclusion() {
        SerializationConfig c = config.withSerializationInclusion(JsonInclude.Include.NON_NULL);

        assertEquals(JsonInclude.Include.NON_NULL, c.getSerializationInclusion());

        JsonInclude.Value same = c.getDefaultPropertyInclusion();
        assertSame(c, c.withPropertyInclusion(same));
    }

    @Test
    public void testDefaultPrettyPrinter() {
        PrettyPrinter pp = config.constructDefaultPrettyPrinter();
        assertNotNull(pp);

        SerializationConfig c = config.withDefaultPrettyPrinter(pp);
        assertSame(pp, c.getDefaultPrettyPrinter());
        assertSame(c, c.withDefaultPrettyPrinter(pp));
    }

    @Test
    public void testInitialize() throws Exception {
        StringWriter writer = new StringWriter();
        JsonGenerator generator = mapper.getFactory().createGenerator(writer);

        try {
            config.with(SerializationFeature.INDENT_OUTPUT).initialize(generator);
            assertNotNull(generator.getPrettyPrinter());
        } finally {
            generator.close();
        }
    }

    @Test
    public void testAnnotationIntrospectorDisabled() {
        assertNotNull(config.getAnnotationIntrospector());

        SerializationConfig noAnnotations = config.without(MapperFeature.USE_ANNOTATIONS);
        assertSame(AnnotationIntrospector.nopInstance(), noAnnotations.getAnnotationIntrospector());
    }

    @Test
    public void testIntrospectClassAnnotations() {
        JavaType type = mapper.getTypeFactory().constructType(String.class);

        assertNotNull(config.introspectClassAnnotations(type));
        assertNotNull(config.introspectDirectClassAnnotations(type));
    }

    @Test
    public void testWithDateFormat() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        SerializationConfig c = config.with(df);
        assertSame(df, c.getDateFormat());
        assertNotNull(config.with((DateFormat) null));
    }

    @Test
    public void testGeneratorFeatureToggle() {
        JsonGenerator.Feature feature = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;

        SerializationConfig c = config.with(feature);
        assertTrue(c.isEnabled(feature, mapper.getFactory()));
        assertSame(c, c.with(feature));

        SerializationConfig disabled = c.without(feature);
        assertFalse(disabled.isEnabled(feature, mapper.getFactory()));
    }

    @Test
    public void testDefaultPropertyMetadata() {
        assertNotNull(config.getDefaultPropertyInclusion());
    }

    @Test(expected = NullPointerException.class)
    public void testNullSerializationFeatureThrows() {
        config.with((SerializationFeature) null);
    }
}