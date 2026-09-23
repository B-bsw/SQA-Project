package com.fasterxml.jackson.databind.introspect;

import static org.junit.Assert.*;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.ser.std.RawSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class JacksonAnnotationIntrospectorTest {

    private JacksonAnnotationIntrospector intr;

    @Before
    public void setUp() {
        intr = new JacksonAnnotationIntrospector();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @JacksonAnnotationsInside
    @interface InsideMarker {}

    @InsideMarker
    static class InsideClass {}

    @Deprecated
    static class DeprecatedClass {}

    enum RenamedEnum {
        @JsonProperty("renamed")
        A
    }

    enum EmptyRenamedEnum {
        @JsonProperty("")
        A
    }

    enum PlainEnum {
        A
    }

    enum ExplicitEnum {
        @JsonProperty("x")
        A,
        B
    }

    @JsonIgnoreProperties({"a", "b"})
    static class IgnoreProps {}

    @JsonIgnoreProperties(value = {"a"}, allowGetters = true)
    static class IgnoreGetters {}

    @JsonIgnoreProperties(value = {"a"}, allowSetters = true)
    static class IgnoreSetters {}

    @JsonFilter("filterId")
    static class Filtered {}

    @JsonFilter("")
    static class EmptyFilter {}

    @JsonSubTypes({@JsonSubTypes.Type(value = SubType.class, name = "sub")})
    static class Poly {}

    static class SubType {}

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
    static class IdClass {}

    @JsonIdentityInfo(generator = ObjectIdGenerators.None.class, property = "x")
    static class NoIdClass {}

    @JsonInclude(JsonInclude.Include.NON_NULL)
    static class IncludeClass {}

    static class FieldHolder {
        @JsonProperty(index = 3, required = true, defaultValue = "d")
        public String indexed;

        @JsonProperty("renamed")
        public String renamed;

        @JsonProperty(access = JsonProperty.Access.READ_ONLY)
        public String access;

        @JsonProperty(defaultValue = "")
        public String emptyDefault;

        @JsonPropertyDescription("desc")
        public String described;

        @JsonView({ViewA.class, ViewB.class})
        public String viewed;

        @JsonFormat(pattern = "yyyy-MM-dd")
        public String formatted;

        @JsonInclude(JsonInclude.Include.NON_NULL)
        public String included;

        @JsonSerialize(using = MySerializer.class)
        public String serialized;

        @JsonSerialize
        public String noSerializer;

        @JsonDeserialize(using = MyDeserializer.class)
        public String deserialized;

        @JsonRawValue
        public String raw;

        @JsonGetter("getterName")
        public String getGetter() {
            return null;
        }

        @JsonSetter("setterName")
        public void setSetter(String value) {
        }
    }

    static class ViewA {}

    static class ViewB {}

    static class MySerializer extends JsonSerializer<String> {
        @Override
        public void serialize(String value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        }
    }

    static class MyDeserializer extends JsonDeserializer<String> {
        @Override
        public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }
    }

    private static class SimpleAnnotated extends Annotated {
        private final Class<?> rawType;
        private final Map<Class<?>, Annotation> annotations;

        SimpleAnnotated(Class<?> rawType, Annotation... anns) {
            this.rawType = rawType;
            annotations = new HashMap<Class<?>, Annotation>();
            for (Annotation a : anns) {
                annotations.put(a.annotationType(), a);
            }
        }

        @Override
        @SuppressWarnings("unchecked")
        public <A extends Annotation> A getAnnotation(Class<A> acls) {
            return (A) annotations.get(acls);
        }

        @Override
        public Type getGenericType() {
            return rawType;
        }

        @Override
        public Class<?> getRawType() {
            return rawType;
        }
    }

    private SimpleAnnotated annOf(Class<?> rawType, Annotation... anns) {
        return new SimpleAnnotated(rawType, anns);
    }

    private static <A extends Annotation> A fieldAnn(Class<?> cls, String name, Class<A> annClass) {
        try {
            return cls.getField(name).getAnnotation(annClass);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testVersionNotNull() {
        assertNotNull(intr.version());
    }

    @Test
    public void testSetConstructorPropertiesImpliesCreatorReturnsThis() {
        assertSame(intr, intr.setConstructorPropertiesImpliesCreator(false));
    }

    @Test
    public void testIsAnnotationBundle() {
        assertTrue(intr.isAnnotationBundle(InsideClass.class.getAnnotation(InsideMarker.class)));
        assertFalse(intr.isAnnotationBundle(DeprecatedClass.class.getAnnotation(Deprecated.class)));
    }

    @Test
    public void testFindEnumValue() {
        assertEquals("renamed", intr.findEnumValue(RenamedEnum.A));
        assertEquals("A", intr.findEnumValue(PlainEnum.A));
        assertEquals("A", intr.findEnumValue(EmptyRenamedEnum.A));
    }

    @Test
    public void testFindEnumValues() {
        String[] names = new String[] {"origA", "origB"};
        String[] result = intr.findEnumValues(ExplicitEnum.class, ExplicitEnum.values(), names);

        assertSame(names, result);
        assertEquals("x", result[0]);
        assertEquals("origB", result[1]);
    }

    @Test
    public void testFindPropertiesToIgnore() {
        SimpleAnnotated ann = annOf(IgnoreProps.class, IgnoreProps.class.getAnnotation(JsonIgnoreProperties.class));

        assertArrayEquals(new String[] {"a", "b"}, intr.findPropertiesToIgnore(ann));
        assertArrayEquals(new String[] {"a", "b"}, intr.findPropertiesToIgnore(ann, true));
        assertArrayEquals(new String[] {"a", "b"}, intr.findPropertiesToIgnore(ann, false));
    }

    @Test
    public void testFindPropertiesToIgnoreAllowGetterSetter() {
        SimpleAnnotated getter = annOf(IgnoreGetters.class, IgnoreGetters.class.getAnnotation(JsonIgnoreProperties.class));
        assertNull(intr.findPropertiesToIgnore(getter, true));
        assertArrayEquals(new String[] {"a"}, intr.findPropertiesToIgnore(getter, false));

        SimpleAnnotated setter = annOf(IgnoreSetters.class, IgnoreSetters.class.getAnnotation(JsonIgnoreProperties.class));
        assertNull(intr.findPropertiesToIgnore(setter, false));
        assertArrayEquals(new String[] {"a"}, intr.findPropertiesToIgnore(setter, true));
    }

    @Test
    public void testFindPropertiesToIgnoreNullWithoutAnnotation() {
        SimpleAnnotated ann = annOf(Object.class);
        assertNull(intr.findPropertiesToIgnore(ann));
        assertNull(intr.findPropertiesToIgnore(ann, true));
        assertNull(intr.findPropertiesToIgnore(ann, false));
    }

    @Test
    public void testFindFilterId() {
        assertEquals("filterId", intr.findFilterId(annOf(Filtered.class, Filtered.class.getAnnotation(JsonFilter.class))));
        assertNull(intr.findFilterId(annOf(EmptyFilter.class, EmptyFilter.class.getAnnotation(JsonFilter.class))));
        assertNull(intr.findFilterId(annOf(Object.class)));
    }

    @Test
    public void testFindPropertyDescription() {
        SimpleAnnotated ann = annOf(String.class, fieldAnn(FieldHolder.class, "described", JsonPropertyDescription.class));
        assertEquals("desc", intr.findPropertyDescription(ann));
        assertNull(intr.findPropertyDescription(annOf(Object.class)));
    }

    @Test
    public void testFindPropertyIndexAccessAndDefaultValue() {
        SimpleAnnotated indexed = annOf(String.class, fieldAnn(FieldHolder.class, "indexed", JsonProperty.class));
        assertEquals(Integer.valueOf(3), intr.findPropertyIndex(indexed));
        assertEquals("d", intr.findPropertyDefaultValue(indexed));

        SimpleAnnotated access = annOf(String.class, fieldAnn(FieldHolder.class, "access", JsonProperty.class));
        assertEquals(JsonProperty.Access.READ_ONLY, intr.findPropertyAccess(access));

        SimpleAnnotated emptyDefault = annOf(String.class, fieldAnn(FieldHolder.class, "emptyDefault", JsonProperty.class));
        assertNull(intr.findPropertyDefaultValue(emptyDefault));
    }

    @Test
    public void testFindViews() {
        SimpleAnnotated ann = annOf(String.class, fieldAnn(FieldHolder.class, "viewed", JsonView.class));
        assertArrayEquals(new Class<?>[] {ViewA.class, ViewB.class}, intr.findViews(ann));
        assertNull(intr.findViews(annOf(Object.class)));
    }

    @Test
    public void testFindFormat() {
        SimpleAnnotated ann = annOf(String.class, fieldAnn(FieldHolder.class, "formatted", JsonFormat.class));
        assertNotNull(intr.findFormat(ann));
        assertNull(intr.findFormat(annOf(Object.class)));
    }

    @Test
    public void testFindSerializer() {
        SimpleAnnotated serialized = annOf(String.class, fieldAnn(FieldHolder.class, "serialized", JsonSerialize.class));
        assertSame(MySerializer.class, intr.findSerializer(serialized));

        SimpleAnnotated noSerializer = annOf(String.class, fieldAnn(FieldHolder.class, "noSerializer", JsonSerialize.class));
        assertNull(intr.findSerializer(noSerializer));

        SimpleAnnotated raw = annOf(String.class, fieldAnn(FieldHolder.class, "raw", JsonRawValue.class));
        assertTrue(intr.findSerializer(raw) instanceof RawSerializer);
    }

    @Test
    public void testFindDeserializer() {
        SimpleAnnotated ann = annOf(String.class, fieldAnn(FieldHolder.class, "deserialized", JsonDeserialize.class));
        assertSame(MyDeserializer.class, intr.findDeserializer(ann));
        assertNull(intr.findDeserializer(annOf(Object.class)));
    }

    @Test
    public void testFindNameForSerialization() throws Exception {
        Method getter = FieldHolder.class.getMethod("getGetter");
        SimpleAnnotated getterAnn = annOf(String.class, getter.getAnnotation(JsonGetter.class));
        assertEquals(PropertyName.construct("getterName"), intr.findNameForSerialization(getterAnn));

        SimpleAnnotated propertyAnn = annOf(String.class, fieldAnn(FieldHolder.class, "renamed", JsonProperty.class));
        assertEquals(PropertyName.construct("renamed"), intr.findNameForSerialization(propertyAnn));

        SimpleAnnotated inferredAnn = annOf(String.class, fieldAnn(FieldHolder.class, "formatted", JsonFormat.class));
        assertSame(PropertyName.USE_DEFAULT, intr.findNameForSerialization(inferredAnn));

        assertNull(intr.findNameForSerialization(annOf(Object.class)));
    }

    @Test
    public void testFindNameForDeserialization() throws Exception {
        Method setter = FieldHolder.class.getMethod("setSetter", String.class);
        SimpleAnnotated setterAnn = annOf(String.class, setter.getAnnotation(JsonSetter.class));
        assertEquals(PropertyName.construct("setterName"), intr.findNameForDeserialization(setterAnn));

        SimpleAnnotated propertyAnn = annOf(String.class, fieldAnn(FieldHolder.class, "renamed", JsonProperty.class));
        assertEquals(PropertyName.construct("renamed"), intr.findNameForDeserialization(propertyAnn));

        SimpleAnnotated inferredAnn = annOf(String.class, fieldAnn(FieldHolder.class, "formatted", JsonFormat.class));
        assertSame(PropertyName.USE_DEFAULT, intr.findNameForDeserialization(inferredAnn));

        assertNull(intr.findNameForDeserialization(annOf(Object.class)));
    }

    @Test
    public void testFindSerializationInclusion() {
        SimpleAnnotated ann = annOf(IncludeClass.class, IncludeClass.class.getAnnotation(JsonInclude.class));
        assertEquals(JsonInclude.Include.NON_NULL,
                intr.findSerializationInclusion(ann, JsonInclude.Include.USE_DEFAULTS));

        assertEquals(JsonInclude.Include.ALWAYS,
                intr.findSerializationInclusion(annOf(Object.class), JsonInclude.Include.ALWAYS));
    }

    @Test
    public void testFindSubtypes() {
        SimpleAnnotated ann = annOf(Poly.class, Poly.class.getAnnotation(JsonSubTypes.class));
        List<NamedType> result = intr.findSubtypes(ann);

        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("sub", result.get(0).getName());
        assertSame(SubType.class, result.get(0).getType());

        assertNull(intr.findSubtypes(annOf(Object.class)));
    }

    @Test
    public void testFindObjectIdInfo() {
        SimpleAnnotated ann = annOf(IdClass.class, IdClass.class.getAnnotation(JsonIdentityInfo.class));
        ObjectIdInfo info = intr.findObjectIdInfo(ann);
        assertNotNull(info);
        assertEquals("@id", info.getProperty().getSimpleName());

        SimpleAnnotated noId = annOf(NoIdClass.class, NoIdClass.class.getAnnotation(JsonIdentityInfo.class));
        assertNull(intr.findObjectIdInfo(noId));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindPropertyContentTypeResolverRejectsNonContainerType() {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        intr.findPropertyContentTypeResolver(null, null, type);
    }
}