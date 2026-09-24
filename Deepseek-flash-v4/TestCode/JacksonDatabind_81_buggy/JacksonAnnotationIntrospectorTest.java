package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.ser.RawSerializer;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.*;
import java.util.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class JacksonAnnotationIntrospectorTest {

    private JacksonAnnotationIntrospector intr;

    @Before
    public void setUp() {
        intr = new JacksonAnnotationIntrospector();
    }

    // ---------------------------------------------------------------------
    // Helper stubs
    // ---------------------------------------------------------------------

    static class TestAnnotated extends Annotated {
        protected final AnnotatedElement element;
        protected final Type type;

        TestAnnotated(AnnotatedElement element, Type type) {
            this.element = element;
            this.type = type;
        }

        @Override
        public Class<?> getRawType() {
            if (element instanceof Class) return (Class<?>) element;
            if (element instanceof Field) return ((Field) element).getType();
            if (element instanceof Method) return ((Method) element).getReturnType();
            return Object.class;
        }

        @Override
        public Type getGenericType() { return type; }

        @Override
        public Type getType() { return type; }

        @Override
        public String getName() {
            if (element instanceof Member) return ((Member) element).getName();
            if (element instanceof Class) return ((Class<?>) element).getName();
            return element.toString();
        }

        @Override
        public AnnotatedElement getAnnotated() { return element; }

        @Override
        public int getModifiers() {
            if (element instanceof Member) return ((Member) element).getModifiers();
            if (element instanceof Class) return ((Class<?>) element).getModifiers();
            return 0;
        }

        @Override
        public boolean isStatic() { return Modifier.isStatic(getModifiers()); }
        @Override
        public boolean isPublic() { return Modifier.isPublic(getModifiers()); }
        @Override
        public boolean isAbstract() { return Modifier.isAbstract(getModifiers()); }
        @Override
        public boolean isFinal() { return Modifier.isFinal(getModifiers()); }
        @Override
        public boolean isPrimitive() { return getRawType().isPrimitive(); }
        @Override
        public boolean isTypeMutation() { return false; }

        @Override
        public <A extends Annotation> A getAnnotation(Class<A> acls) {
            return element.getAnnotation(acls);
        }

        @Override
        public boolean hasAnnotation(Class<?> acls) {
            return element.isAnnotationPresent(acls);
        }

        @Override
        public boolean hasOneOf(Class<? extends Annotation>[] annoClasses) {
            for (Class<?> c : annoClasses) {
                if (element.isAnnotationPresent((Class<? extends Annotation>) c)) return true;
            }
            return false;
        }

        @Override
        public Iterable<Annotation> annotations() {
            return Collections.emptyList();
        }

        @Override
        public Collection<Annotation> getAnnotations() {
            return Collections.emptyList();
        }
    }

    static class TestAnnotatedMember extends AnnotatedMember {
        protected final AnnotatedElement element;
        protected final Type type;

        TestAnnotatedMember(AnnotatedElement element, Type type) {
            this.element = element;
            this.type = type;
        }

        @Override
        public Class<?> getRawType() {
            if (element instanceof Class) return (Class<?>) element;
            if (element instanceof Field) return ((Field) element).getType();
            if (element instanceof Method) return ((Method) element).getReturnType();
            return Object.class;
        }

        @Override
        public Type getGenericType() { return type; }
        @Override
        public Type getType() { return type; }

        @Override
        public String getName() {
            if (element instanceof Member) return ((Member) element).getName();
            if (element instanceof Class) return ((Class<?>) element).getName();
            return element.toString();
        }

        @Override
        public AnnotatedElement getAnnotated() { return element; }

        @Override
        public int getModifiers() {
            if (element instanceof Member) return ((Member) element).getModifiers();
            if (element instanceof Class) return ((Class<?>) element).getModifiers();
            return 0;
        }

        @Override
        public boolean isStatic() { return Modifier.isStatic(getModifiers()); }
        @Override
        public boolean isPublic() { return Modifier.isPublic(getModifiers()); }
        @Override
        public boolean isAbstract() { return Modifier.isAbstract(getModifiers()); }
        @Override
        public boolean isFinal() { return Modifier.isFinal(getModifiers()); }
        @Override
        public boolean isPrimitive() { return getRawType().isPrimitive(); }
        @Override
        public boolean isTypeMutation() { return false; }

        @Override
        public <A extends Annotation> A getAnnotation(Class<A> acls) {
            return element.getAnnotation(acls);
        }

        @Override
        public boolean hasAnnotation(Class<?> acls) {
            return element.isAnnotationPresent(acls);
        }

        @Override
        public boolean hasOneOf(Class<? extends Annotation>[] annoClasses) {
            for (Class<?> c : annoClasses) {
                if (element.isAnnotationPresent((Class<? extends Annotation>) c)) return true;
            }
            return false;
        }

        @Override
        public Member getMember() {
            return (element instanceof Member) ? (Member) element : null;
        }

        @Override
        public Object getValue(Object pojo) throws IllegalArgumentException {
            if (element instanceof Field) {
                try { return ((Field) element).get(pojo); }
                catch (IllegalAccessException e) { throw new IllegalArgumentException(e); }
            }
            return null;
        }

        @Override
        public void setValue(Object pojo, Object value) throws IllegalArgumentException {
            if (element instanceof Field) {
                try { ((Field) element).set(pojo, value); }
                catch (IllegalAccessException e) { throw new IllegalArgumentException(e); }
            }
        }

        @Override
        public Iterable<Annotation> annotations() {
            return Collections.emptyList();
        }

        @Override
        public Collection<Annotation> getAnnotations() {
            return Collections.emptyList();
        }
    }

    static class TestAnnotatedMethod extends AnnotatedMethod {
        private final Method method;

        TestAnnotatedMethod(Method method) {
            super();
            this.method = method;
        }

        @Override public Method getMember() { return method; }
        @Override public int getParameterCount() { return method.getParameterCount(); }
        @Override public Class<?> getRawParameterType(int index) { return method.getParameterTypes()[index]; }
        @Override public Type getGenericParameterType(int index) { return method.getGenericParameterTypes()[index]; }
        @Override public Class<?> getRawType() { return method.getReturnType(); }
        @Override public Type getGenericType() { return method.getGenericReturnType(); }
        @Override public Type getType() { return method.getGenericReturnType(); }

        @Override
        public String getName() { return method.getName(); }

        @Override
        public AnnotatedElement getAnnotated() { return method; }

        @Override
        public int getModifiers() { return method.getModifiers(); }
        @Override public boolean isStatic() { return Modifier.isStatic(method.getModifiers()); }
        @Override public boolean isPublic() { return Modifier.isPublic(method.getModifiers()); }
        @Override public boolean isAbstract() { return Modifier.isAbstract(method.getModifiers()); }
        @Override public boolean isFinal() { return Modifier.isFinal(method.getModifiers()); }
        @Override public boolean isPrimitive() { return method.getReturnType().isPrimitive(); }
        @Override public boolean isTypeMutation() { return false; }

        @Override
        public <A extends Annotation> A getAnnotation(Class<A> acls) {
            return method.getAnnotation(acls);
        }

        @Override
        public boolean hasAnnotation(Class<?> acls) {
            return method.isAnnotationPresent(acls);
        }

        @Override
        public boolean hasOneOf(Class<? extends Annotation>[] annoClasses) {
            for (Class<?> c : annoClasses) {
                if (method.isAnnotationPresent((Class<? extends Annotation>) c)) return true;
            }
            return false;
        }

        @Override
        public Object getValue(Object pojo) throws IllegalArgumentException {
            try { return method.invoke(pojo); }
            catch (Exception e) { throw new IllegalArgumentException(e); }
        }

        @Override
        public void setValue(Object pojo, Object value) throws IllegalArgumentException {
            try { method.invoke(pojo, value); }
            catch (Exception e) { throw new IllegalArgumentException(e); }
        }

        @Override
        public Iterable<Annotation> annotations() {
            return Collections.emptyList();
        }

        @Override
        public Collection<Annotation> getAnnotations() {
            return Collections.emptyList();
        }
    }

    // ----- annotations and fixture classes -----

    @JacksonAnnotationsInside
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    static @interface BundleAnno {}

    @BundleAnno
    static class BundleAnnoHolder {}

    static class TestView {}

    @JsonRootName("root")
    static class RootNoNs {}

    @JsonRootName(value = "root", namespace = "ns")
    static class RootWithNs {}

    @JsonRootName(value = "root", namespace = "")
    static class RootEmptyNs {}

    @JsonIgnoreType
    static class IgnoreType {}

    @JsonIgnoreProperties({"a", "b"})
    static class IgnoreProps {}

    @JsonFilter("filter")
    static class FilterClass {}

    @JsonFilter("")
    static class FilterEmpty {}

    static class MyNamingStrategy extends PropertyNamingStrategy {
        private static final long serialVersionUID = 1L;
    }

    @JsonNaming(MyNamingStrategy.class)
    static class NamingClass {}

    @JsonClassDescription("desc")
    static class DescribedClass {}

    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    static class AutoDetectClass {}

    @JsonPropertyOrder(value = {"b", "a"}, alphabetic = true)
    static class OrderClass {}

    @JsonSubTypes({@JsonSubTypes.Type(value = Sub1.class, name = "s1")})
    static class SuperType {}
    static class Sub1 extends SuperType {}

    @JsonTypeName("typename")
    static class TypeNameClass {}

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
    static class IdentityClass {}

    @JsonIdentityReference(alwaysAsId = true)
    static class IdentityRefClass {}

    @JsonDeserialize(builder = MyBuilder.class)
    static class BuilderClass {}
    static class MyBuilder {}

    @JsonPOJOBuilder(buildMethodName = "create", withPrefix = "with")
    static class POJOBuilderClass {}

    static enum EnumWithJsonProp {
        @JsonProperty("alpha") A,
        @JsonProperty("") B,
        C
    }

    static enum EnumWithDefault {
        @JsonEnumDefaultValue A,
        B
    }

    static class Setters {
        public void setInt(int v) {}
        public void setIntObj(Integer v) {}
        public void setString(String s) {}
        public void setObject(Object o) {}
        public void setLongObj(Long v) {}
    }

    static class FixtureFields {
        @JsonProperty(value = "prop", index = 2, defaultValue = "dv", required = true, access = JsonProperty.Access.READ_WRITE)
        @JsonPropertyDescription("desc")
        @JsonAlias({"a", "b"})
        @JsonFormat(pattern = "yyyy")
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonView(TestView.class)
        @JsonMerge(OptBoolean.TRUE)
        @JsonIgnoreProperties("ignore")
        @JsonTypeId
        public String annotatedField;

        @JsonManagedReference("managed")
        public String managedRef;

        @JsonBackReference("back")
        public String backRef;

        @JsonUnwrapped(prefix = "pre", suffix = "suf")
        public String unwrap;

        @JacksonInject("injectId")
        public String injectWithId;

        @JacksonInject
        public String injectNoId;

        @JsonIgnore(true)
        public String ignoredField;

        @JsonRawValue(true)
        public String raw;

        @JsonSerialize(using = MySerializer.class, keyUsing = MyKeySerializer.class,
                contentUsing = MyContentSerializer.class, nullsUsing = MyNullSerializer.class,
                typing = JsonSerialize.Typing.STATIC,
                converter = MyConverter.class, contentConverter = MyContentConverter.class)
        public String serializerField;

        @JsonDeserialize(using = MyDeserializer.class, keyUsing = MyKeyDeserializer.class,
                contentUsing = MyContentDeserializer.class,
                converter = MyConverter.class, contentConverter = MyContentConverter.class)
        public String deserializerField;

        @JsonSerialize(using = MySerializer.class)
        public String serUsingField;

        @JsonFormat(pattern = "yyyy")
        public String formatField;

        @JsonMerge(OptBoolean.FALSE)
        public String mergeFalseField;

        @JsonSetter(nulls = Nulls.SKIP)
        public String setterInfoField;
    }

    static class FixtureMethods {
        @JsonAnyGetter
        public Map<String, Object> anyGetter() { return null; }

        @JsonAnySetter
        public void anySetter(String key, Object value) {}

        @JsonValue
        public String value() { return null; }

        @JsonCreator
        public static FixtureMethods create() { return null; }

        @JsonGetter("getFoo")
        public String getFoo() { return null; }

        @JsonSetter("setFoo")
        public void setFoo(String s) {}
    }

    static class MySerializer extends JsonSerializer<Object> {
        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {}
    }

    static class MyKeySerializer extends JsonSerializer<Object> {
        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {}
    }

    static class MyContentSerializer extends JsonSerializer<Object> {
        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {}
    }

    static class MyNullSerializer extends JsonSerializer<Object> {
        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {}
    }

    static class MyDeserializer extends JsonDeserializer<Object> {
        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
    }

    static class MyKeyDeserializer extends KeyDeserializer {
        @Override
        public Object deserializeKey(String key, DeserializationContext ctxt) { return null; }
    }

    static class MyContentDeserializer extends JsonDeserializer<Object> {
        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
    }

    static class MyConverter implements Converter<Object, Object> {
        @Override
        public Object convert(Object value) { return value; }
        @Override
        public JavaType getInputType(TypeFactory typeFactory) { return typeFactory.constructType(Object.class); }
        @Override
        public JavaType getOutputType(TypeFactory typeFactory) { return typeFactory.constructType(Object.class); }
    }

    static class MyContentConverter implements Converter<Object, Object> {
        @Override
        public Object convert(Object value) { return value; }
        @Override
        public JavaType getInputType(TypeFactory typeFactory) { return typeFactory.constructType(Object.class); }
        @Override
        public JavaType getOutputType(TypeFactory typeFactory) { return typeFactory.constructType(Object.class); }
    }

    // ---------------------------------------------------------------------
    // Helpers
    // ---------------------------------------------------------------------

    private Field field(String name) throws Exception {
        Field f = FixtureFields.class.getDeclaredField(name);
        f.setAccessible(true);
        return f;
    }

    private TestAnnotatedMember member(String name) throws Exception {
        Field f = field(name);
        return new TestAnnotatedMember(f, f.getGenericType());
    }

    private TestAnnotatedMember method(Class<?> cls, String name, Class<?>... params) throws Exception {
        Method m = cls.getDeclaredMethod(name, params);
        m.setAccessible(true);
        return new TestAnnotatedMember(m, m.getGenericReturnType());
    }

    private TestAnnotated classAnn(Class<?> cls) {
        return new TestAnnotated(cls, cls);
    }

    private AnnotatedClass ac(Class<?> cls) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.getDeserializationConfig().introspectClassAnnotations(
                mapper.getTypeFactory().constructType(cls));
    }

    // ---------------------------------------------------------------------
    // Tests
    // ---------------------------------------------------------------------

    @Test
    public void testVersion() {
        assertNotNull(intr.version());
    }

    @Test
    public void testSetConstructorPropertiesImpliesCreator() {
        assertSame(intr, intr.setConstructorPropertiesImpliesCreator(false));
    }

    @Test
    public void testIsAnnotationBundle() {
        Annotation bundle = BundleAnnoHolder.class.getAnnotation(BundleAnno.class);
        assertNotNull(bundle);
        assertTrue(intr.isAnnotationBundle(bundle));
        assertFalse(intr.isAnnotationBundle(FilterClass.class.getAnnotation(JsonFilter.class)));
    }

    @Test
    public void testFindEnumValue() {
        assertEquals("alpha", intr.findEnumValue(EnumWithJsonProp.A));
        assertEquals("B", intr.findEnumValue(EnumWithJsonProp.B));
        assertEquals("C", intr.findEnumValue(EnumWithJsonProp.C));
    }

    @Test
    public void testFindEnumValues() {
        EnumWithJsonProp[] values = EnumWithJsonProp.values();
        String[] names = new String[] {"A", "B", "C"};
        String[] result = intr.findEnumValues(EnumWithJsonProp.class, values, names);
        assertArrayEquals(new String[] {"alpha", "B", "C"}, result);
    }

    @Test
    public void testFindDefaultEnumValue() {
        assertEquals(EnumWithDefault.A,
                intr.findDefaultEnumValue((Class<Enum<?>>) (Class<?>) EnumWithDefault.class));
    }

    @Test
    public void testFindRootName() {
        assertEquals(PropertyName.construct("root"), intr.findRootName(ac(RootNoNs.class)));
        assertEquals(PropertyName.construct("root", "ns"), intr.findRootName(ac(RootWithNs.class)));
        assertEquals(PropertyName.construct("root"), intr.findRootName(ac(RootEmptyNs.class)));
    }

    @Test
    public void testFindPropertyIgnorals() {
        JsonIgnoreProperties.Value v = intr.findPropertyIgnorals(classAnn(IgnoreProps.class));
        assertTrue(v.getIgnored().contains("a"));
        assertTrue(v.getIgnored().contains("b"));
    }

    @Test
    public void testIsIgnorableType() {
        assertTrue(intr.isIgnorableType(ac(IgnoreType.class)));
        assertNull(intr.isIgnorableType(ac(RootNoNs.class)));
    }

    @Test
    public void testFindFilterId() {
        assertEquals("filter", intr.findFilterId(classAnn(FilterClass.class)));
        assertNull(intr.findFilterId(classAnn(FilterEmpty.class)));
    }

    @Test
    public void testFindNamingStrategy() {
        assertEquals(MyNamingStrategy.class, intr.findNamingStrategy(ac(NamingClass.class)));
    }

    @Test
    public void testFindClassDescription() {
        assertEquals("desc", intr.findClassDescription(ac(DescribedClass.class)));
    }

    @Test
    public void testFindAutoDetectVisibility() {
        VisibilityChecker<?> checker = VisibilityChecker.Std.defaultInstance();
        assertNotNull(intr.findAutoDetectVisibility(ac(AutoDetectClass.class), checker));
        assertSame(checker, intr.findAutoDetectVisibility(ac(RootNoNs.class), checker));
    }

    @Test
    public void testFindImplicitPropertyName() throws Exception {
        assertNull(intr.findImplicitPropertyName(member("annotatedField")));
    }

    @Test
    public void testFindPropertyAliases() throws Exception {
        List<PropertyName> aliases = intr.findPropertyAliases(member("annotatedField"));
        assertNotNull(aliases);
        assertEquals(2, aliases.size());
        assertEquals("a", aliases.get(0).getSimpleName());
        assertNull(intr.findPropertyAliases(member("ignoredField")));
    }

    @Test
    public void testHasIgnoreMarker() throws Exception {
        assertTrue(intr.hasIgnoreMarker(member("ignoredField")));
        assertFalse(intr.hasIgnoreMarker(member("annotatedField")));
    }

    @Test
    public void testFindPropertyAnnotations() throws Exception {
        assertTrue(intr.hasRequiredMarker(member("annotatedField")));
        assertEquals(JsonProperty.Access.READ_WRITE, intr.findPropertyAccess(member("annotatedField")));
        assertEquals("desc", intr.findPropertyDescription(member("annotatedField")));
        assertEquals(Integer.valueOf(2), intr.findPropertyIndex(member("annotatedField")));
        assertEquals("dv", intr.findPropertyDefaultValue(member("annotatedField")));
    }

    @Test
    public void testFindFormat() throws Exception {
        JsonFormat.Value v = intr.findFormat(member("annotatedField"));
        assertNotNull(v);
        assertEquals("yyyy", v.getPattern());
    }

    @Test
    public void testFindReferenceType() throws Exception {
        AnnotationIntrospector.ReferenceProperty ref = intr.findReferenceType(member("managedRef"));
        assertNotNull(ref);
        assertTrue(ref.isManaged());
        assertEquals("managed", ref.getName());

        ref = intr.findReferenceType(member("backRef"));
        assertNotNull(ref);
        assertTrue(ref.isBack());
        assertEquals("back", ref.getName());
    }

    @Test
    public void testFindUnwrappingNameTransformer() throws Exception {
        NameTransformer trans = intr.findUnwrappingNameTransformer(member("unwrap"));
        assertNotNull(trans);
    }

    @Test
    public void testFindInjectableValue() throws Exception {
        JacksonInject.Value v = intr.findInjectableValue(member("injectWithId"));
        assertNotNull(v);
        assertEquals("injectId", v.getId());

        v = intr.findInjectableValue(member("injectNoId"));
        assertNotNull(v);
        assertEquals("java.lang.String", v.getId());
    }

    @Test
    public void testFindViews() throws Exception {
        Class<?>[] views = intr.findViews(member("annotatedField"));
        assertNotNull(views);
        assertArrayEquals(new Class<?>[] {TestView.class}, views);
    }

    @Test
    public void testFindSubtypes() {
        List<NamedType> types = intr.findSubtypes(classAnn(SuperType.class));
        assertNotNull(types);
        assertEquals(1, types.size());
        assertEquals("s1", types.get(0).getName());
        assertEquals(Sub1.class, types.get(0).getType());
    }

    @Test
    public void testFindTypeName() {
        assertEquals("typename", intr.findTypeName(ac(TypeNameClass.class)));
    }

    @Test
    public void testIsTypeId() throws Exception {
        assertTrue(intr.isTypeId(member("annotatedField")));
        assertNull(intr.isTypeId(member("ignoredField")));
    }

    @Test
    public void testFindObjectIdInfo() {
        ObjectIdInfo info = intr.findObjectIdInfo(classAnn(IdentityClass.class));
        assertNotNull(info);
        assertEquals("@id", info.getPropertyName().getSimpleName());
    }

    @Test
    public void testFindObjectReferenceInfo() {
        ObjectIdInfo info = intr.findObjectReferenceInfo(classAnn(IdentityRefClass.class), null);
        assertNotNull(info);
        assertTrue(info.getAlwaysAsId());
    }

    @Test
    public void testFindSerializer() throws Exception {
        Object ser = intr.findSerializer(member("serUsingField"));
        assertEquals(MySerializer.class, ser);

        ser = intr.findSerializer(member("raw"));
        assertTrue(ser instanceof RawSerializer);

        assertNull(intr.findSerializer(classAnn(RootNoNs.class)));
    }

    @Test
    public void testFindKeyContentNullSerializer() throws Exception {
        assertEquals(MyKeySerializer.class, intr.findKeySerializer(member("serializerField")));
        assertEquals(MyContentSerializer.class, intr.findContentSerializer(member("serializerField")));
        assertEquals(MyNullSerializer.class, intr.findNullSerializer(member("serializerField")));
    }

    @Test
    public void testFindPropertyInclusion() throws Exception {
        JsonInclude.Value v = intr.findPropertyInclusion(member("annotatedField"));
        assertNotNull(v);
        assertEquals(JsonInclude.Include.NON_NULL, v.getValueInclusion());
    }

    @Test
    public void testFindSerializationTypingAndConverters() throws Exception {
        assertEquals(JsonSerialize.Typing.STATIC, intr.findSerializationTyping(member("serializerField")));
        assertEquals(MyConverter.class, intr.findSerializationConverter(member("serializerField")));
        assertEquals(MyContentConverter.class, intr.findSerializationContentConverter(member("serializerField")));
    }

    @Test
    public void testFindDeserializer() throws Exception {
        assertEquals(MyDeserializer.class, intr.findDeserializer(member("deserializerField")));
        assertEquals(MyKeyDeserializer.class, intr.findKeyDeserializer(member("deserializerField")));
        assertEquals(MyContentDeserializer.class, intr.findContentDeserializer(member("deserializerField")));
    }

    @Test
    public void testFindDeserializationConverters() throws Exception {
        assertEquals(MyConverter.class, intr.findDeserializationConverter(member("deserializerField")));
        assertEquals(MyContentConverter.class, intr.findDeserializationContentConverter(member("deserializerField")));
    }

    @Test
    public void testFindNameForSerializationAndDeserialization() throws Exception {
        assertEquals(PropertyName.construct("getFoo"),
                intr.findNameForSerialization(method(FixtureMethods.class, "getFoo")));
        assertEquals(PropertyName.USE_DEFAULT, intr.findNameForSerialization(member("formatField")));
        assertEquals(PropertyName.construct("setFoo"),
                intr.findNameForDeserialization(method(FixtureMethods.class, "setFoo", String.class)));
        assertEquals(PropertyName.construct("prop"),
                intr.findNameForDeserialization(member("annotatedField")));
    }

    @Test
    public void testHasAsValueAnyGetterAnySetter() throws Exception {
        assertTrue(intr.hasAsValue(method(FixtureMethods.class, "value")));
        assertTrue(intr.hasAnyGetter(method(FixtureMethods.class, "anyGetter")));
        assertTrue(intr.hasAnySetter(method(FixtureMethods.class, "anySetter", String.class, Object.class)));
    }

    @Test
    public void testFindMergeInfo() throws Exception {
        assertEquals(Boolean.TRUE, intr.findMergeInfo(member("annotatedField")));
        assertEquals(Boolean.FALSE, intr.findMergeInfo(member("mergeFalseField")));
    }

    @Test
    public void testFindSetterInfo() throws Exception {
        assertNotNull(intr.findSetterInfo(member("setterInfoField")));
    }

    @Test
    public void testFindCreatorAnnotationAndBinding() throws Exception {
        TestAnnotatedMember creator = method(FixtureMethods.class, "create");
        assertTrue(intr.hasCreatorAnnotation(creator));
        assertEquals(JsonCreator.Mode.DEFAULT, intr.findCreatorBinding(creator));
        MapperConfig<?> config = new ObjectMapper().getDeserializationConfig();
        assertEquals(JsonCreator.Mode.DEFAULT, intr.findCreatorAnnotation(config, creator));
    }

    @Test
    public void testFindPOJOBuilder() {
        assertEquals(MyBuilder.class, intr.findPOJOBuilder(ac(BuilderClass.class)));
    }

    @Test
    public void testFindPOJOBuilderConfig() {
        JsonPOJOBuilder.Value v = intr.findPOJOBuilderConfig(ac(POJOBuilderClass.class));
        assertNotNull(v);
        assertEquals("create", v.buildMethodName);
        assertEquals("with", v.withPrefix);
    }

    @Test
    public void testFindSerializationPropertyOrderAndSort() {
        assertArrayEquals(new String[] {"b", "a"}, intr.findSerializationPropertyOrder(ac(OrderClass.class)));
        assertEquals(Boolean.TRUE, intr.findSerializationSortAlphabetically(ac(OrderClass.class)));
    }

    @Test
    public void testResolveSetterConflict() throws Exception {
        TestAnnotatedMethod intSetter = new TestAnnotatedMethod(Setters.class.getDeclaredMethod("setInt", int.class));
        TestAnnotatedMethod objSetter = new TestAnnotatedMethod(Setters.class.getDeclaredMethod("setIntObj", Integer.class));
        assertSame(intSetter, intr.resolveSetterConflict(null, intSetter, objSetter));
        assertSame(objSetter, intr.resolveSetterConflict(null, objSetter, intSetter));

        TestAnnotatedMethod strSetter = new TestAnnotatedMethod(Setters.class.getDeclaredMethod("setString", String.class));
        TestAnnotatedMethod obj2Setter = new TestAnnotatedMethod(Setters.class.getDeclaredMethod("setObject", Object.class));
        assertSame(strSetter, intr.resolveSetterConflict(null, obj2Setter, strSetter));

        TestAnnotatedMethod longSetter = new TestAnnotatedMethod(Setters.class.getDeclaredMethod("setLongObj", Long.class));
        assertNull(intr.resolveSetterConflict(null, objSetter, longSetter));
    }

    @Test
    public void testRefineSerializationAndDeserializationTypeNoAnnotations() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType base = mapper.getTypeFactory().constructType(String.class);
        JavaType result = intr.refineSerializationType(mapper.getSerializationConfig(), classAnn(RootNoNs.class), base);
        assertSame(base, result);
        result = intr.refineDeserializationType(mapper.getDeserializationConfig(), classAnn(RootNoNs.class), base);
        assertSame(base, result);
    }

    @Test
    public void testFindAndAddVirtualPropertiesNoAppend() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        List<BeanPropertyWriter> props = new ArrayList<BeanPropertyWriter>();
        intr.findAndAddVirtualProperties(mapper.getSerializationConfig(), ac(RootNoNs.class), props);
        assertTrue(props.isEmpty());
    }

    @Test
    public void testFindPropertyContentTypeResolverRejectsNonContainer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType stringType = mapper.getTypeFactory().constructType(String.class);
        try {
            intr.findPropertyContentTypeResolver(mapper.getDeserializationConfig(), classAnn(RootNoNs.class), stringType);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }
}