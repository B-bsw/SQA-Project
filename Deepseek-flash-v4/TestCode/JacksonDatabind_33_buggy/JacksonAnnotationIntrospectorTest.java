package com.fasterxml.jackson.databind.introspect;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter;
import com.fasterxml.jackson.databind.ser.std.RawSerializer;
import com.fasterxml.jackson.databind.util.*;

public class JacksonAnnotationIntrospectorTest {

    private JacksonAnnotationIntrospector introspector;

    @Before
    public void setUp() {
        introspector = new JacksonAnnotationIntrospector();
    }

    @Test
    public void testVersion() {
        Version version = introspector.version();
        Assert.assertNotNull(version);
        Assert.assertEquals(2, version.getMajorVersion());
        Assert.assertEquals(9, version.getMinorVersion());
    }

    @Test
    public void testIsAnnotationBundle_WithJacksonAnnotationsInside() throws Exception {
        Annotation ann = JacksonAnnotationsInsideClass.class.getAnnotation(JacksonAnnotationsInside.class);
        Assert.assertNotNull(ann);
        Assert.assertTrue(introspector.isAnnotationBundle(ann));
    }

    @Test
    public void testIsAnnotationBundle_WithoutJacksonAnnotationsInside() {
        Assert.assertFalse(introspector.isAnnotationBundle(Deprecated.class.getAnnotation(Deprecated.class)));
    }

    @Test
    public void testFindEnumValue_WithJsonProperty() throws Exception {
        EnumWithJsonProperty value = EnumWithJsonProperty.VALUE;
        Assert.assertEquals("custom-value", introspector.findEnumValue(value));
    }

    @Test
    public void testFindEnumValue_WithoutJsonProperty() {
        EnumWithoutJsonProperty value = EnumWithoutJsonProperty.VALUE;
        Assert.assertEquals("VALUE", introspector.findEnumValue(value));
    }

    @Test
    public void testFindRootName_WithAnnotation() throws Exception {
        AnnotatedClass ac = new AnnotatedClass(AnnotatedRootName.class);
        PropertyName name = introspector.findRootName(ac);
        Assert.assertNotNull(name);
        Assert.assertEquals("root", name.getSimpleName());
        Assert.assertEquals("ns", name.getNamespace());
    }

    @Test
    public void testFindRootName_WithoutAnnotation() {
        AnnotatedClass ac = new AnnotatedClass(PlainClass.class);
        PropertyName name = introspector.findRootName(ac);
        Assert.assertNull(name);
    }

    @Test
    public void testFindPropertiesToIgnore_WithAnnotation() throws Exception {
        AnnotatedClass ac = new AnnotatedClass(ClassWithIgnore.class);
        String[] ignore = introspector.findPropertiesToIgnore(ac);
        Assert.assertNotNull(ignore);
        Assert.assertEquals(2, ignore.length);
        Assert.assertArrayEquals(new String[]{"a", "b"}, ignore);
    }

    @Test
    public void testFindPropertiesToIgnore_WithoutAnnotation() {
        AnnotatedClass ac = new AnnotatedClass(PlainClass.class);
        String[] ignore = introspector.findPropertiesToIgnore(ac);
        Assert.assertNull(ignore);
    }

    @Test
    public void testFindIgnoreUnknownProperties_Null() {
        AnnotatedClass ac = new AnnotatedClass(PlainClass.class);
        Assert.assertNull(introspector.findIgnoreUnknownProperties(ac));
    }

    @Test
    public void testFindIgnoreUnknownProperties_True() throws Exception {
        AnnotatedClass ac = new AnnotatedClass(ClassWithIgnoreUnknown.class);
        Assert.assertEquals(Boolean.TRUE, introspector.findIgnoreUnknownProperties(ac));
    }

    @Test
    public void testFindFilterId_WithFilterValue() throws Exception {
        AnnotatedClass ac = new AnnotatedClass(ClassWithFilter.class);
        Object filterId = introspector.findFilterId(ac);
        Assert.assertNotNull(filterId);
        Assert.assertEquals("filter", filterId);
    }

    @Test
    public void testFindFilterId_WithoutFilterValue() {
        AnnotatedClass ac = new AnnotatedClass(PlainClass.class);
        Assert.assertNull(introspector.findFilterId(ac));
    }

    @Test
    public void testFindNamingStrategy_WithAnnotation() throws Exception {
        AnnotatedClass ac = new AnnotatedClass(ClassWithNamingStrategy.class);
        Object strategy = introspector.findNamingStrategy(ac);
        Assert.assertNotNull(strategy);
        Assert.assertEquals(PropertyNamingStrategy.SnakeCaseStrategy.class, strategy);
    }

    @Test
    public void testFindNamingStrategy_WithoutAnnotation() {
        AnnotatedClass ac = new AnnotatedClass(PlainClass.class);
        Assert.assertNull(introspector.findNamingStrategy(ac));
    }

    @Test
    public void testHasRequiredMarker_WithRequiredTrue() throws Exception {
        AnnotatedMethod method = new AnnotatedMethod(RequiredClass.class.getMethod("getRequired"));
        Assert.assertTrue(introspector.hasRequiredMarker(method));
    }

    @Test
    public void testHasRequiredMarker_WithRequiredFalse() throws Exception {
        AnnotatedMethod method = new AnnotatedMethod(RequiredClass.class.getMethod("getNotRequired"));
        Assert.assertFalse(introspector.hasRequiredMarker(method));
    }

    @Test
    public void testFindPropertyAccess_ReadOnly() throws Exception {
        AnnotatedMethod method = new AnnotatedMethod(PropertyAccessClass.class.getMethod("getReadOnly"));
        Assert.assertEquals(JsonProperty.Access.READ_ONLY, introspector.findPropertyAccess(method));
    }

    @Test
    public void testFindPropertyAccess_ReadWrite() throws Exception {
        AnnotatedMethod method = new AnnotatedMethod(PropertyAccessClass.class.getMethod("getReadWrite"));
        Assert.assertEquals(JsonProperty.Access.READ_WRITE, introspector.findPropertyAccess(method));
    }

    @Test
    public void testFindPropertyDescription_WithAnnotation() throws Exception {
        AnnotatedMethod method = new AnnotatedMethod(DescriptionClass.class.getMethod("getDescription"));
        Assert.assertEquals("desc", introspector.findPropertyDescription(method));
    }

    @Test
    public void testFindPropertyDescription_WithoutAnnotation() throws Exception {
        AnnotatedMethod method = new AnnotatedMethod(PlainClass.class.getMethod("getPlain"));
        Assert.assertNull(introspector.findPropertyDescription(method));
    }

    @Test
    public void testFindPropertyIndex_WithIndex() throws Exception {
        AnnotatedMethod method = new AnnotatedMethod(IndexClass.class.getMethod("getIndex"));
        Assert.assertEquals(Integer.valueOf(3), introspector.findPropertyIndex(method));
    }

    @Test
    public void testFindPropertyIndex_WithoutIndex() throws Exception {
        AnnotatedMethod method = new AnnotatedMethod(PlainClass.class.getMethod("getPlain"));
        Assert.assertNull(introspector.findPropertyIndex(method));
    }

    @Test
    public void testFindFormat_WithAnnotation() throws Exception {
        AnnotatedMethod method = new AnnotatedMethod(FormatClass.class.getMethod("getFormat"));
        JsonFormat.Value format = introspector.findFormat(method);
        Assert.assertNotNull(format);
        Assert.assertEquals(JsonFormat.Value.forPattern("yyyy-MM-dd"), format);
    }

    @Test
    public void testFindFormat_WithoutAnnotation() throws Exception {
        AnnotatedMethod method = new AnnotatedMethod(PlainClass.class.getMethod("getPlain"));
        Assert.assertNull(introspector.findFormat(method));
    }

    @Test
    public void testFindReferenceType_Managed() throws Exception {
        AnnotatedField field = new AnnotatedField(ReferenceClass.class.getField("managed"));
        AnnotationIntrospector.ReferenceProperty ref = introspector.findReferenceType(field);
        Assert.assertNotNull(ref);
        Assert.assertTrue(ref.isManagedReference());
        Assert.assertEquals("managed-ref", ref.getName());
    }

    @Test
    public void testFindReferenceType_Back() throws Exception {
        AnnotatedField field = new AnnotatedField(ReferenceClass.class.getField("back"));
        AnnotationIntrospector.ReferenceProperty ref = introspector.findReferenceType(field);
        Assert.assertNotNull(ref);
        Assert.assertTrue(ref.isBackReference());
        Assert.assertEquals("back-ref", ref.getName());
    }

    @Test
    public void testFindReferenceType_None() throws Exception {
        AnnotatedField field = new AnnotatedField(PlainClass.class.getField("plainField"));
        Assert.assertNull(introspector.findReferenceType(field));
    }

    @Test
    public void testFindUnwrappingNameTransformer_WithAnnotation() throws Exception {
        AnnotatedField field = new AnnotatedField(UnwrapClass.class.getField("unwrap"));
        NameTransformer transformer = introspector.findUnwrappingNameTransformer(field);
        Assert.assertNotNull(transformer);
        Assert.assertEquals("prefix", transformer.reverse(transformer.transform("suffix")));
    }

    @Test
    public void testFindUnwrappingNameTransformer_WithNoPrefixSuffix() throws Exception {
        AnnotatedField field = new AnnotatedField(UnwrapClass.class.getField("unwrapNoPrefix"));
        NameTransformer transformer = introspector.findUnwrappingNameTransformer(field);
        Assert.assertNull(transformer);
    }

    @Test
    public void testFindUnwrappingNameTransformer_Disabled() throws Exception {
        AnnotatedField field = new AnnotatedField(UnwrapClass.class.getField("unwrapDisabled"));
        NameTransformer transformer = introspector.findUnwrappingNameTransformer(field);
        Assert.assertNull(transformer);
    }

    @Test
    public void testFindInjectableValueId_WithId() throws Exception {
        AnnotatedMethod method = new AnnotatedMethod(InjectClass.class.getMethod("setValue", String.class));
        Object id = introspector.findInjectableValueId(method);
        Assert.assertNotNull(id);
        Assert.assertEquals("inject-id", id);
    }

    @Test
    public void testFindInjectableValueId_NoIdMethod() throws Exception {
        AnnotatedMethod method = new AnnotatedMethod(InjectClassNoId.class.getMethod("setValue", String.class));
        Object id = introspector.findInjectableValueId(method);
        Assert.assertNotNull(id);
        Assert.assertEquals(String.class.getName(), id);
    }

    @Test
    public void testFindInjectableValueId_NoIdField() throws Exception {
        AnnotatedField field = new AnnotatedField(InjectClassNoIdField.class.getField("value"));
        Object id = introspector.findInjectableValueId(field);
        Assert.assertNotNull(id);
        Assert.assertEquals(String.class.getName(), id);
    }

    @Test
    public void testFindViews_WithAnnotation() throws Exception {
        AnnotatedMethod method = new AnnotatedMethod(ViewsClass.class.getMethod("getView"));
        Class<?>[] views = introspector.findViews(method);
        Assert.assertNotNull(views);
        Assert.assertEquals(1, views.length);
        Assert.assertEquals(ViewsClass.View.class, views[0]);
    }

    @Test
    public void testFindViews_WithoutAnnotation() throws Exception {
        AnnotatedMethod method = new AnnotatedMethod(PlainClass.class.getMethod("getPlain"));
        Assert.assertNull(introspector.findViews(method));
    }

    @Test
    public void testFindTypeResolver_NonContainerType() {
        AnnotatedMember member = new AnnotatedMethod(PlainClass.class.getMethods()[0]);
        JavaType baseType = TypeFactory.defaultInstance().constructType(PlainClass.class);
        TypeResolverBuilder<?> builder = introspector.findPropertyTypeResolver(MapperConfig.empty(), member, baseType);
        Assert.assertNotNull(builder);
    }

    @Test
    public void testFindPropertyContentTypeResolver_NonContainerType() {
        AnnotatedMember member = new AnnotatedMethod(PlainClass.class.getMethods()[0]);
        JavaType baseType = TypeFactory.defaultInstance().constructType(PlainClass.class);
        TypeResolverBuilder<?> builder = introspector.findPropertyContentTypeResolver(MapperConfig.empty(), member, baseType);
        Assert.assertNull(builder);
    }

    @Test
    public void testFindSubtypes_WithAnnotation() {
        AnnotatedClass ac = new AnnotatedClass(SubTypesClass.class);
        List<NamedType> subtypes = introspector.findSubtypes(ac);
        Assert.assertNotNull(subtypes);
        Assert.assertEquals(2, subtypes.size());
        Assert.assertEquals("sub1", subtypes.get(0).getName());
        Assert.assertEquals("sub2", subtypes.get(1).getName());
    }

    @Test
    public void testFindSubtypes_WithoutAnnotation() {
        AnnotatedClass ac = new AnnotatedClass(PlainClass.class);
        Assert.assertNull(introspector.findSubtypes(ac));
    }

    @Test
    public void testFindTypeName_WithAnnotation() {
        AnnotatedClass ac = new AnnotatedClass(TypeNameClass.class);
        Assert.assertEquals("custom-name", introspector.findTypeName(ac));
    }

    @Test
    public void testFindTypeName_WithoutAnnotation() {
        AnnotatedClass ac = new AnnotatedClass(PlainClass.class);
        Assert.assertNull(introspector.findTypeName(ac));
    }

    @Test
    public void testIsTypeId_WithAnnotation() throws Exception {
        AnnotatedMethod method = new AnnotatedMethod(TypeIdClass.class.getMethod("getId"));
        Assert.assertTrue(introspector.isTypeId(method));
    }

    @Test
    public void testIsTypeId_WithoutAnnotation() throws Exception {
        AnnotatedMethod method = new AnnotatedMethod(PlainClass.class.getMethod("getPlain"));
        Assert.assertFalse(introspector.isTypeId(method));
    }

    @Test
    public void testFindObjectIdInfo_WithRef() throws Exception {
        AnnotatedClass ac = new AnnotatedClass(ObjectIdClass.class);
        ObjectIdInfo info = introspector.findObjectIdInfo(ac);
        Assert.assertNotNull(info);
        Assert.assertEquals(ObjectIdGenerators.PropertyGenerator.class, info.getGeneratorType());
        Assert.assertEquals("id", info.getPropertyName().getSimpleName());
    }

    @Test
    public void testFindObjectIdInfo_WithoutAnnotation() {
        AnnotatedClass ac = new AnnotatedClass(PlainClass.class);
        Assert.assertNull(introspector.findObjectIdInfo(ac));
    }

    @Test
    public void testFindSerializer_WithJsonSerialize() {
        AnnotatedClass ac = new AnnotatedClass(SerializeClass.class);
        Object serializer = introspector.findSerializer(ac);
        Assert.assertNotNull(serializer);
        Assert.assertEquals(MySerializer.class, serializer);
    }

    @Test
    public void testFindSerializer_WithJsonRawValue() throws Exception {
        AnnotatedMethod method = new AnnotatedMethod(RawValueClass.class.getMethod("getRaw"));
        Object serializer = introspector.findSerializer(method);
        Assert.assertNotNull(serializer);
        Assert.assertTrue(serializer instanceof RawSerializer);
    }

    @Test
    public void testFindSerializer_WithNoSerializer() {
        AnnotatedClass ac = new AnnotatedClass(PlainClass.class);
        Assert.assertNull(introspector.findSerializer(ac));
    }

    @Test
    public void testFindKeySerializer_WithAnnotation() throws Exception {
        AnnotatedClass ac = new AnnotatedClass(KeySerializeClass.class);
        Object serializer = introspector.findKeySerializer(ac);
        Assert.assertNotNull(serializer);
        Assert.assertEquals(KeySerializer.class, serializer);
    }

    @Test
    public void testFindContentSerializer_WithAnnotation() throws Exception {
        AnnotatedClass ac = new AnnotatedClass(ContentSerializeClass.class);
        Object serializer = introspector.findContentSerializer(ac);
        Assert.assertNotNull(serializer);
        Assert.assertEquals(ContentSerializer.class, serializer);
    }

    @Test
    public void testFindNullSerializer_WithAnnotation() throws Exception {
        AnnotatedClass ac = new AnnotatedClass(NullSerializeClass.class);
        Object serializer = introspector.findNullSerializer(ac);
        Assert.assertNotNull(serializer);
        Assert.assertEquals(NullSerializer.class, serializer);
    }

    @Test
    public void testFindSerializationInclusion_Always() throws Exception {
        AnnotatedClass ac = new AnnotatedClass(IncludeClass.class);
        JsonInclude.Value inclusion = introspector.findPropertyInclusion(ac);
        Assert.assertNotNull(inclusion);
        Assert.assertEquals(JsonInclude.Include.ALWAYS, inclusion.getValueInclusion());
        Assert.assertEquals(JsonInclude.Include.USE_DEFAULTS, inclusion.getContentInclusion());
    }

    @Test
    public void testFindSerializationInclusion_NonEmpty() throws Exception {
        AnnotatedClass ac = new AnnotatedClass(IncludeNonEmptyClass.class);
        JsonInclude.Value inclusion = introspector.findPropertyInclusion(ac);
        Assert.assertNotNull(inclusion);
        Assert.assertEquals(JsonInclude.Include.NON_EMPTY, inclusion.getValueInclusion());
    }

    @Test
    public void testFindSerializationInclusion_UseDefaults() throws Exception {
        AnnotatedClass ac = new AnnotatedClass(IncludeUseDefaultsClass.class);
        JsonInclude.Value inclusion = introspector.findPropertyInclusion(ac);
        Assert.assertNotNull(inclusion);
        Assert.assertEquals(JsonInclude.Include.USE_DEFAULTS, inclusion.getValueInclusion());
    }

    @Test
    public void testFindSerializationType_WithType() throws Exception {
        AnnotatedClass ac = new AnnotatedClass(TypeSerializationClass.class);
        Class<?> type = introspector.findSerializationType(ac);
        Assert.assertNotNull(type);
        Assert.assertEquals(MyType.class, type);
    }

    @Test
    public void testFindSerializationKeyType_WithType() throws Exception {
        AnnotatedClass ac = new AnnotatedClass(KeyTypeSerializationClass.class);
        Class<?> type = introspector.findSerializationKeyType(ac, TypeFactory.defaultInstance().constructType(Map.class));
        Assert.assertNotNull(type);
        Assert.assertEquals(MyKeyType.class, type);
    }

    @Test
    public void testFindSerializationContentType_WithType() throws Exception {
        AnnotatedClass ac = new AnnotatedClass(ContentTypeSerializationClass.class);
        Class<?> type = introspector.findSerializationContentType(ac, TypeFactory.defaultInstance().constructType(List.class));
        Assert.assertNotNull(type);
        Assert.assertEquals(MyContentType.class, type);
    }

    @Test
    public void testFindSerializationTyping_Static() throws Exception {
        AnnotatedClass ac = new AnnotatedClass(TypingClass.class);
        JsonSerialize.Typing typing = introspector.findSerializationTyping(ac);
        Assert.assertNotNull(typing);
        Assert.assertEquals(JsonSerialize.Typing.STATIC, typing);
    }

    @Test
    public void testFindSerializationConverter_WithConverter() throws Exception {
        AnnotatedClass ac = new AnnotatedClass(ConverterClass.class);
        Object converter = introspector.findSerializationConverter(ac);
        Assert.assertNotNull(converter);
        Assert.assertEquals(MyConverter.class, converter);
    }

    @Test
    public void testFindSerializationContentConverter_WithConverter() throws Exception {
        AnnotatedClass ac = new AnnotatedClass(ContentConverterClass.class);
        Object converter = introspector.findSerializationContentConverter(ac);
        Assert.assertNotNull(converter);
        Assert.assertEquals(MyContentConverter.class, converter);
    }

    @Test
    public void testFindSerializationPropertyOrder_WithOrder() throws Exception {
        AnnotatedClass ac = new AnnotatedClass(PropertyOrderClass.class);
        String[] order = introspector.findSerializationPropertyOrder(ac);
        Assert.assertNotNull(order);
        Assert.assertArrayEquals(new String[]{"b", "a"}, order);
    }

    @Test
    public void testFindSerializationPropertyOrder_WithoutOrder() {
        AnnotatedClass ac = new AnnotatedClass(PlainClass.class);
        Assert.assertNull(introspector.findSerializationPropertyOrder(ac));
    }

    @Test
    public void testFindSerializationSortAlphabetically_WithAlpha() throws Exception {
        AnnotatedClass ac = new AnnotatedClass(AlphaOrderClass.class);
        Assert.assertEquals(Boolean.TRUE, introspector.findSerializationSortAlphabetically(ac));
    }

    @Test
    public void testFindSerializationSortAlphabetically_WithoutAlpha() {
        AnnotatedClass ac = new AnnotatedClass(PlainClass.class);
        Assert.assertNull(introspector.findSerializationSortAlphabetically(ac));
    }

    @Test
    public void testFindAndAddVirtualProperties_NoAnnotation() {
        AnnotatedClass ac = new AnnotatedClass(PlainClass.class);
        introspector.findAndAddVirtualProperties(MapperConfig.empty(), ac, new ArrayList<BeanPropertyWriter>(), null);
    }

    @Test
    public void testFindNameForSerialization_WithJsonGetter() throws Exception {
        AnnotatedMethod method = new AnnotatedMethod(GetterClass.class.getMethod("getValue"));
        PropertyName name = introspector.findNameForSerialization(method);
        Assert.assertNotNull(name);
        Assert.assertEquals("custom-getter", name.getSimpleName());
    }

    @Test
    public void testFindNameForSerialization_WithJsonProperty() throws Exception {
        AnnotatedMethod method = new AnnotatedMethod(PropertyClass.class.getMethod("getValue"));
        PropertyName name = introspector.findNameForSerialization(method);
        Assert.assertNotNull(name);
        Assert.assertEquals("custom-property", name.getSimpleName());
    }

    @Test
    public void testFindNameForSerialization_WithoutAnnotation() throws Exception {
        AnnotatedMethod method = new AnnotatedMethod(PlainClass.class.getMethod("getPlain"));
        PropertyName name = introspector.findNameForSerialization(method);
        Assert.assertNotNull(name);
        Assert.assertEquals("", name.getSimpleName());
    }

    @Test
    public void testHasAsValueAnnotation_True() throws Exception {
        AnnotatedMethod method = new AnnotatedMethod(AsValueClass.class.getMethod("getValue"));
        Assert.assertTrue(introspector.hasAsValueAnnotation(method));
    }

    @Test
    public void testHasAsValueAnnotation_False() throws Exception {
        AnnotatedMethod method = new AnnotatedMethod(PlainClass.class.getMethod("getPlain"));
        Assert.assertFalse(introspector.hasAsValueAnnotation(method));
    }

    @Test
    public void testFindDeserializer_WithType() {
        AnnotatedClass ac = new AnnotatedClass(DeserializeClass.class);
        Object deserializer = introspector.findDeserializer(ac);
        Assert.assertNotNull(deserializer);
        Assert.assertEquals(MyDeserializer.class, deserializer);
    }

    @Test
    public void testFindKeyDeserializer_WithType() {
        AnnotatedClass ac = new AnnotatedClass(KeyDeserializeClass.class);
        Object deserializer = introspector.findKeyDeserializer(ac);
        Assert.assertNotNull(deserializer);
        Assert.assertEquals(MyKeyDeserializer.class, deserializer);
    }

    @Test
    public void testFindContentDeserializer_WithType() {
        AnnotatedClass ac = new AnnotatedClass(ContentDeserializeClass.class);
        Object deserializer = introspector.findContentDeserializer(ac);
        Assert.assertNotNull(deserializer);
        Assert.assertEquals(MyContentDeserializer.class, deserializer);
    }

    @Test
    public void testFindDeserializationType_WithType() throws Exception {
        AnnotatedClass ac = new AnnotatedClass(TypeDeserializationClass.class);
        Class<?> type = introspector.findDeserializationType(ac, TypeFactory.defaultInstance().constructType(PlainClass.class));
        Assert.assertNotNull(type);
        Assert.assertEquals(MyDeserializationType.class, type);
    }

    @Test
    public void testFindDeserializationKeyType_WithType() throws Exception {
        AnnotatedClass ac = new AnnotatedClass(KeyTypeDeserializationClass.class);
        Class<?> type = introspector.findDeserializationKeyType(ac, TypeFactory.defaultInstance().constructType(Map.class));
        Assert.assertNotNull(type);
        Assert.assertEquals(MyKeyDeserializationType.class, type);
    }

    @Test
    public void testFindDeserializationContentType_WithType() throws Exception {
        AnnotatedClass ac = new AnnotatedClass(ContentTypeDeserializationClass.class);
        Class<?> type = introspector.findDeserializationContentType(ac, TypeFactory.defaultInstance().constructType(List.class));
        Assert.assertNotNull(type);
        Assert.assertEquals(MyContentDeserializationType.class, type);
    }

    @Test
    public void testFindDeserializationConverter_WithConverter() {
        AnnotatedClass ac = new AnnotatedClass(DeserializationConverterClass.class);
        Object converter = introspector.findDeserializationConverter(ac);
        Assert.assertNotNull(converter);
        Assert.assertEquals(MyDeserializationConverter.class, converter);
    }

    @Test
    public void testFindDeserializationContentConverter_WithConverter() {
        AnnotatedClass ac = new AnnotatedClass(DeserializationContentConverterClass.class);
        Object converter = introspector.findDeserializationContentConverter(ac);
        Assert.assertNotNull(converter);
        Assert.assertEquals(MyDeserializationContentConverter.class, converter);
    }

    @Test
    public void testFindValueInstantiator_WithInstantiator() {
        AnnotatedClass ac = new AnnotatedClass(ValueInstantiatorClass.class);
        Object instantiator = introspector.findValueInstantiator(ac);
        Assert.assertNotNull(instantiator);
        Assert.assertEquals(MyValueInstantiator.class, instantiator);
    }

    @Test
    public void testFindPOJOBuilder_WithBuilder() {
        AnnotatedClass ac = new AnnotatedClass(POJOBuilderClass.class);
        Class<?> builder = introspector.findPOJOBuilder(ac);
        Assert.assertNotNull(builder);
        Assert.assertEquals(MyPOJOBuilder.class, builder);
    }

    @Test
    public void testFindPOJOBuilderConfig_WithConfig() {
        AnnotatedClass ac = new AnnotatedClass(POJOBuilderConfigClass.class);
        JsonPOJOBuilder.Value config = introspector.findPOJOBuilderConfig(ac);
        Assert.assertNotNull(config);
        Assert.assertEquals("with", config.withPrefix());
        Assert.assertEquals("build", config.buildMethodName());
    }

    @Test
    public void testFindNameForDeserialization_WithJsonSetter() throws Exception {
        AnnotatedMethod method = new AnnotatedMethod(SetterClass.class.getMethod("setValue", String.class));
        PropertyName name = introspector.findNameForDeserialization(method);
        Assert.assertNotNull(name);
        Assert.assertEquals("custom-setter", name.getSimpleName());
    }

    @Test
    public void testFindNameForDeserialization_WithJsonDeserialize() throws Exception {
        AnnotatedMethod method = new AnnotatedMethod(DeserializeAnnotationClass.class.getMethod("setValue", String.class));
        PropertyName name = introspector.findNameForDeserialization(method);
        Assert.assertNotNull(name);
        Assert.assertEquals("", name.getSimpleName());
    }

    @Test
    public void testFindNameForDeserialization_WithoutAnnotation() throws Exception {
        AnnotatedMethod method = new AnnotatedMethod(PlainClass.class.getMethod("getPlain"));
        PropertyName name = introspector.findNameForDeserialization(method);
        Assert.assertNotNull(name);
        Assert.assertEquals("", name.getSimpleName());
    }

    @Test
    public void testHasAnySetterAnnotation_True() throws Exception {
        AnnotatedMethod method = new AnnotatedMethod(AnySetterClass.class.getMethod("setAny", String.class, Object.class));
        Assert.assertTrue(introspector.hasAnySetterAnnotation(method));
    }

    @Test
    public void testHasAnySetterAnnotation_False() throws Exception {
        AnnotatedMethod method = new AnnotatedMethod(PlainClass.class.getMethod("getPlain"));
        Assert.assertFalse(introspector.hasAnySetterAnnotation(method));
    }

    @Test
    public void testHasAnyGetterAnnotation_True() throws Exception {
        AnnotatedMethod method = new AnnotatedMethod(AnyGetterClass.class.getMethod("getAny"));
        Assert.assertTrue(introspector.hasAnyGetterAnnotation(method));
    }

    @Test
    public void testHasAnyGetterAnnotation_False() throws Exception {
        AnnotatedMethod method = new AnnotatedMethod(PlainClass.class.getMethod("getPlain"));
        Assert.assertFalse(introspector.hasAnyGetterAnnotation(method));
    }

    @Test
    public void testHasCreatorAnnotation_True() throws Exception {
        AnnotatedMethod method = new AnnotatedMethod(CreatorClass.class.getMethod("create"));
        Assert.assertTrue(introspector.hasCreatorAnnotation(method));
    }

    @Test
    public void testHasCreatorAnnotation_False() throws Exception {
        AnnotatedMethod method = new AnnotatedMethod(PlainClass.class.getMethod("getPlain"));
        Assert.assertFalse(introspector.hasCreatorAnnotation(method));
    }

    @Test
    public void testFindCreatorBinding_Enabled() throws Exception {
        AnnotatedMethod method = new AnnotatedMethod(CreatorBindingClass.class.getMethod("create"));
        Assert.assertEquals(JsonCreator.Mode.PROPERTIES, introspector.findCreatorBinding(method));
    }

    @Test
    public void testFindCreatorBinding_Disabled() throws Exception {
        AnnotatedMethod method = new AnnotatedMethod(CreatorDisabledClass.class.getMethod("create"));
        Assert.assertNull(introspector.findCreatorBinding(method));
    }

    // Test Data Classes

    @JacksonAnnotation
    static class JacksonAnnotationsInsideClass {}

    enum EnumWithJsonProperty {
        VALUE;

        @JsonProperty("custom-value")
        public String getValue() {
            return name();
        }
    }

    enum EnumWithoutJsonProperty {
        VALUE
    }

    @JsonRootName(value = "root", namespace = "ns")
    static class AnnotatedRootName {}

    static class PlainClass {
        public String plain;
        public String getPlain() { return plain; }
        public void setPlain(String plain) { this.plain = plain; }
    }

    @JsonIgnoreProperties({"a", "b"})
    static class ClassWithIgnore {}

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class ClassWithIgnoreUnknown {}

    @JsonFilter("filter")
    static class ClassWithFilter {}

    @JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
    static class ClassWithNamingStrategy {}

    static class RequiredClass {
        @JsonProperty(required = true)
        public String getRequired() { return "req"; }
        @JsonProperty
        public String getNotRequired() { return "not"; }
    }

    static class PropertyAccessClass {
        @JsonProperty(access = JsonProperty.Access.READ_ONLY)
        public String getReadOnly() { return "ro"; }
        @JsonProperty(access = JsonProperty.Access.READ_WRITE)
        public String getReadWrite() { return "rw"; }
    }

    static class DescriptionClass {
        @JsonPropertyDescription("desc")
        public String getDescription() { return "value"; }
    }

    static class IndexClass {
        @JsonProperty(index = 3)
        public String getIndex() { return "idx"; }
    }

    static class FormatClass {
        @JsonFormat(pattern = "yyyy-MM-dd")
        public String getFormat() { return "date"; }
    }

    static class ReferenceClass {
        @JsonManagedReference("managed-ref")
        public Object managed;
        @JsonBackReference("back-ref")
        public Object back;
    }

    static class UnwrapClass {
        @JsonUnwrapped(prefix = "prefix", suffix = "suffix")
        public String unwrap;
        @JsonUnwrapped
        public String unwrapNoPrefix;
        @JsonUnwrapped(enabled = false)
        public String unwrapDisabled;
    }

    static class InjectClass {
        @JacksonInject("inject-id")
        public void setValue(String value) {}
    }

    static class InjectClassNoId {
        @JacksonInject
        public void setValue(String value) {}
    }

    static class InjectClassNoIdField {
        @JacksonInject
        public String value;
    }

    static class ViewsClass {
        @JsonView(View.class)
        public String getView() { return "view"; }
        static class View {}
    }

    @JsonSubTypes({@JsonSubTypes.Type(value = SubClass1.class, name = "sub1"), @JsonSubTypes.Type(value = SubClass2.class, name = "sub2")})
    static class SubTypesClass {
        static class SubClass1 extends SubTypesClass {}
        static class SubClass2 extends SubTypesClass {}
    }

    @JsonTypeName("custom-name")
    static class TypeNameClass {}

    static class TypeIdClass {
        @JsonTypeId
        public String getId() { return "id"; }
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    static class ObjectIdClass {
        public String id;
    }

    @JsonSerialize(using = MySerializer.class)
    static class SerializeClass {}

    static class MySerializer extends JsonSerializer<Object> {
        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws java.io.IOException {
            gen.writeString("serialized");
        }
    }

    static class RawValueClass {
        @JsonRawValue
        public String getRaw() { return "raw"; }
    }

    @JsonSerialize(keyUsing = KeySerializer.class)
    static class KeySerializeClass {}

    static class KeySerializer extends JsonSerializer<String> {
        @Override
        public void serialize(String value, JsonGenerator gen, SerializerProvider serializers) throws java.io.IOException {
            gen.writeString(value);
        }
    }

    @JsonSerialize(contentUsing = ContentSerializer.class)
    static class ContentSerializeClass {}

    static class ContentSerializer extends JsonSerializer<String> {
        @Override
        public void serialize(String value, JsonGenerator gen, SerializerProvider serializers) throws java.io.IOException {
            gen.writeString(value);
        }
    }

    @JsonSerialize(nullsUsing = NullSerializer.class)
    static class NullSerializeClass {}

    static class NullSerializer extends JsonSerializer<Object> {
        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws java.io.IOException {
            gen.writeNull();
        }
    }

    @JsonInclude(JsonInclude.Include.ALWAYS)
    static class IncludeClass {}

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    static class IncludeNonEmptyClass {}

    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    static class IncludeUseDefaultsClass {}

    @JsonSerialize(as = MyType.class)
    static class TypeSerializationClass {}

    static class MyType {}

    @JsonSerialize(keyAs = MyKeyType.class)
    static class KeyTypeSerializationClass {}

    static class MyKeyType {}

    @JsonSerialize(contentAs = MyContentType.class)
    static class ContentTypeSerializationClass {}

    static class MyContentType {}

    static class TypingClass {
        @JsonSerialize(typing = JsonSerialize.Typing.STATIC)
        public Object getValue() { return null; }
    }

    @JsonSerialize(converter = MyConverter.class)
    static class ConverterClass {}

    static class MyConverter extends StdConverter<Object, Object> {
        @Override
        public Object convert(Object value) { return value; }
    }

    @JsonSerialize(contentConverter = MyContentConverter.class)
    static class ContentConverterClass {}

    static class MyContentConverter extends StdConverter<Object, Object> {
        @Override
        public Object convert(Object value) { return value; }
    }

    @JsonPropertyOrder({"b", "a"})
    static class PropertyOrderClass {}

    @JsonPropertyOrder(alphabetic = true)
    static class AlphaOrderClass {}

    static class GetterClass {
        @JsonGetter("custom-getter")
        public String getValue() { return "value"; }
    }

    static class PropertyClass {
        @JsonProperty("custom-property")
        public String getValue() { return "value"; }
    }

    static class AsValueClass {
        @JsonValue
        public String getValue() { return "value"; }
    }

    @JsonDeserialize(using = MyDeserializer.class)
    static class DeserializeClass {}

    static class MyDeserializer extends JsonDeserializer<Object> {
        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) { return null; }
    }

    @JsonDeserialize(keyUsing = MyKeyDeserializer.class)
    static class KeyDeserializeClass {}

    static class MyKeyDeserializer extends KeyDeserializer {
        @Override
        public Object deserializeKey(String key, DeserializationContext ctxt) { return key; }
    }

    @JsonDeserialize(contentUsing = MyContentDeserializer.class)
    static class ContentDeserializeClass {}

    static class MyContentDeserializer extends JsonDeserializer<Object> {
        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) { return null; }
    }

    @JsonDeserialize(as = MyDeserializationType.class)
    static class TypeDeserializationClass {}

    static class MyDeserializationType {}

    @JsonDeserialize(keyAs = MyKeyDeserializationType.class)
    static class KeyTypeDeserializationClass {}

    static class MyKeyDeserializationType {}

    @JsonDeserialize(contentAs = MyContentDeserializationType.class)
    static class ContentTypeDeserializationClass {}

    static class MyContentDeserializationType {}

    @JsonDeserialize(converter = MyDeserializationConverter.class)
    static class DeserializationConverterClass {}

    static class MyDeserializationConverter extends StdConverter<Object, Object> {
        @Override
        public Object convert(Object value) { return value; }
    }

    @JsonDeserialize(contentConverter = MyDeserializationContentConverter.class)
    static class DeserializationContentConverterClass {}

    static class MyDeserializationContentConverter extends StdConverter<Object, Object> {
        @Override
        public Object convert(Object value) { return value; }
    }

    @JsonValueInstantiator(MyValueInstantiator.class)
    static class ValueInstantiatorClass {}

    static class MyValueInstantiator extends ValueInstantiator {
        @Override
        public String getValueTypeDesc() { return "test"; }
    }

    @JsonPOJOBuilder(buildMethodName = "build", withPrefix = "with")
    static class POJOBuilderClass {}

    static class MyPOJOBuilder {
        public MyPOJOBuilder with(String value) { return this; }
        public MyPOJOBuilder build() { return this; }
    }

    @JsonPOJOBuilder(withPrefix = "with", buildMethodName = "build")
    static class POJOBuilderConfigClass {}

    static class SetterClass {
        @JsonSetter("custom-setter")
        public void setValue(String value) {}
    }

    @JsonDeserialize
    static class DeserializeAnnotationClass {
        public void setValue(String value) {}
    }

    static class AnySetterClass {
        @JsonAnySetter
        public void setAny(String key, Object value) {}
    }

    static class AnyGetterClass {
        @JsonAnyGetter
        public Map<String, Object> getAny() { return null; }
    }

    static class CreatorClass {
        @JsonCreator
        public static CreatorClass create() { return new CreatorClass(); }
    }

    static class CreatorBindingClass {
        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        public static CreatorBindingClass create() { return new CreatorBindingClass(); }
    }

    static class CreatorDisabledClass {
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        public static CreatorDisabledClass create() { return new CreatorDisabledClass(); }
    }
}