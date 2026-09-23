package com.fasterxml.jackson.databind;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.introspect.Annotated;

public class AnnotationIntrospectorTest {

    private enum TestEnum { A, B, C }

    private static class DefaultIntrospector extends AnnotationIntrospector {
        @Override
        public Version version() {
            return Version.unknownVersion();
        }
    }

    private static class PropertyIgnoreCaptureIntrospector extends DefaultIntrospector {
        boolean forSerialization;

        @Override
        public String[] findPropertiesToIgnore(Annotated ac, boolean forSerialization) {
            this.forSerialization = forSerialization;
            return new String[] { "ignored" };
        }
    }

    @Test
    public void testNopInstanceIsSingleton() {
        AnnotationIntrospector introspector = AnnotationIntrospector.nopInstance();
        assertNotNull(introspector);
        assertSame(introspector, AnnotationIntrospector.nopInstance());
    }

    @Test
    public void testPairCombinesIntrospectors() {
        AnnotationIntrospector first = new DefaultIntrospector();
        AnnotationIntrospector second = new DefaultIntrospector();

        AnnotationIntrospector pair = AnnotationIntrospector.pair(first, second);

        assertNotNull(pair);
        Collection<AnnotationIntrospector> introspectors = pair.allIntrospectors();
        assertEquals(2, introspectors.size());
        assertTrue(introspectors.contains(first));
        assertTrue(introspectors.contains(second));
    }

    @Test
    public void testAllIntrospectors() {
        DefaultIntrospector introspector = new DefaultIntrospector();

        Collection<AnnotationIntrospector> collection = introspector.allIntrospectors();
        assertEquals(1, collection.size());
        assertSame(introspector, collection.iterator().next());

        List<AnnotationIntrospector> result = new ArrayList<AnnotationIntrospector>();
        assertSame(result, introspector.allIntrospectors(result));
        assertEquals(1, result.size());
        assertSame(introspector, result.get(0));
    }

    @Test
    public void testDefaultReturnValues() {
        AnnotationIntrospector ai = new DefaultIntrospector();

        assertFalse(ai.isAnnotationBundle(null));
        assertNull(ai.findObjectIdInfo(null));
        assertNull(ai.findObjectReferenceInfo(null, null));
        assertNull(ai.findRootName(null));
        assertNull(ai.findPropertiesToIgnore(null, true));
        assertNull(ai.findPropertiesToIgnore(null));
        assertNull(ai.findIgnoreUnknownProperties(null));
        assertNull(ai.isIgnorableType(null));
        assertNull(ai.findFilterId(null));
        assertNull(ai.findNamingStrategy(null));
        assertNull(ai.findClassDescription(null));
        assertNull(ai.findAutoDetectVisibility(null, null));
        assertNull(ai.findTypeResolver(null, null, null));
        assertNull(ai.findPropertyTypeResolver(null, null, null));
        assertNull(ai.findPropertyContentTypeResolver(null, null, null));
        assertNull(ai.findSubtypes(null));
        assertNull(ai.findTypeName(null));
        assertNull(ai.isTypeId(null));
        assertNull(ai.findReferenceType(null));
        assertNull(ai.findUnwrappingNameTransformer(null));
        assertFalse(ai.hasIgnoreMarker(null));
        assertNull(ai.findInjectableValueId(null));
        assertNull(ai.hasRequiredMarker(null));
        assertNull(ai.findViews(null));
        assertNull(ai.findFormat(null));
        assertNull(ai.findWrapperName(null));
        assertNull(ai.findPropertyDefaultValue(null));
        assertNull(ai.findPropertyDescription(null));
        assertNull(ai.findPropertyIndex(null));
        assertNull(ai.findImplicitPropertyName(null));
        assertNull(ai.findPropertyAccess(null));
        assertNull(ai.resolveSetterConflict(null, null, null));

        assertNull(ai.findSerializer(null));
        assertNull(ai.findKeySerializer(null));
        assertNull(ai.findContentSerializer(null));
        assertNull(ai.findNullSerializer(null));
        assertNull(ai.findSerializationTyping(null));
        assertNull(ai.findSerializationConverter(null));
        assertNull(ai.findSerializationContentConverter(null));

        assertEquals(JsonInclude.Include.NON_NULL,
                ai.findSerializationInclusion(null, JsonInclude.Include.NON_NULL));
        assertEquals(JsonInclude.Include.NON_NULL,
                ai.findSerializationInclusionForContent(null, JsonInclude.Include.NON_NULL));
        assertNull(ai.findSerializationPropertyOrder(null));
        assertNull(ai.findSerializationSortAlphabetically(null));
        assertNull(ai.findPropertyInclusion(null));

        assertNull(ai.findDeserializationType(null, null));
        assertNull(ai.findDeserializationKeyType(null, null));
        assertNull(ai.findDeserializationContentType(null, null));

        assertNull(ai.findValueInstantiator(null));
        assertNull(ai.findPOJOBuilder(null));
        assertNull(ai.findPOJOBuilderConfig(null));
        assertNull(ai.findNameForSerialization(null));
        assertNull(ai.findNameForDeserialization(null));

        assertFalse(ai.hasAsValueAnnotation(null));
        assertFalse(ai.hasAnySetterAnnotation(null));
        assertFalse(ai.hasAnyGetterAnnotation(null));
        assertFalse(ai.hasCreatorAnnotation(null));
        assertNull(ai.findCreatorBinding(null));
    }

    @Test
    public void testFindEnumValueUsesName() {
        AnnotationIntrospector ai = new DefaultIntrospector();
        assertEquals("A", ai.findEnumValue(TestEnum.A));
    }

    @Test
    public void testDeprecatedFindPropertiesToIgnoreDelegatesToBooleanVariant() {
        PropertyIgnoreCaptureIntrospector ai = new PropertyIgnoreCaptureIntrospector();

        String[] ignored = ai.findPropertiesToIgnore(null);

        assertNotNull(ignored);
        assertArrayEquals(new String[] { "ignored" }, ignored);
        assertTrue(ai.forSerialization);
    }

    @Test
    public void testReferenceProperty() {
        AnnotationIntrospector ai = new DefaultIntrospector();
        assertNull(ai.findReferenceType(null));
    }

    @Test
    public void testFindAndAddVirtualPropertiesIsNoOp() {
        new DefaultIntrospector().findAndAddVirtualProperties(null, null, null);
    }
}