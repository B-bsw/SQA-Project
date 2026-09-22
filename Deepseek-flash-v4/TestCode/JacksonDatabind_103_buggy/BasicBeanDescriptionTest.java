package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.*;

import static org.junit.Assert.*;

public class BasicBeanDescriptionTest {

    private POJOPropertiesCollector propertyCollector;
    private MapperConfig<?> config;
    private AnnotationIntrospector introspector;
    private AnnotatedClass annotatedClass;
    private JavaType javaType;
    private BasicBeanDescription beanDescription;

    @Before
    public void setUp() throws Exception {
        config = new MapperConfig.Builder(null, null, null).build();
        introspector = new AnnotationIntrospector() {
            @Override
            public Version version() {
                return null;
            }
        };
        propertyCollector = new POJOPropertiesCollector(config, true, null, null, null, null, null);
        javaType = new JavaType(Object.class, null, null, 0, null, true);
        annotatedClass = new AnnotatedClass(Object.class, null, introspector);
        beanDescription = new BasicBeanDescription(propertyCollector, javaType, annotatedClass) {};
    }

    @Test
    public void testRemoveProperty_Found() {
        BeanPropertyDefinition prop = new BeanPropertyDefinition(null, null, null, null, null, null);
        List<BeanPropertyDefinition> props = new ArrayList<>();
        props.add(prop);
        try {
            setField(beanDescription, "_properties", props);
            assertTrue(beanDescription.removeProperty(prop.getName()));
        } catch (Exception e) {
            fail("Test failed: " + e.getMessage());
        }
    }

    @Test
    public void testRemoveProperty_NotFound() {
        List<BeanPropertyDefinition> props = new ArrayList<>();
        props.add(new BeanPropertyDefinition(null, null, null, null, null, null));
        try {
            setField(beanDescription, "_properties", props);
            assertFalse(beanDescription.removeProperty("nonExistent"));
        } catch (Exception e) {
            fail("Test failed: " + e.getMessage());
        }
    }

    @Test
    public void testAddProperty_Empty() {
        try {
            setField(beanDescription, "_properties", new ArrayList<>());
            assertFalse(beanDescription.addProperty(new BeanPropertyDefinition(null, null, null, null, null, null)));
        } catch (Exception e) {
            fail("Test failed: " + e.getMessage());
        }
    }

    @Test
    public void testHasProperty_True() {
        BeanPropertyDefinition prop = new BeanPropertyDefinition(new PropertyName("name"), null, null, null, null, null);
        List<BeanPropertyDefinition> props = new ArrayList<>();
        props.add(prop);
        try {
            setField(beanDescription, "_properties", props);
            assertTrue(beanDescription.hasProperty(new PropertyName("name")));
        } catch (Exception e) {
            fail("Test failed: " + e.getMessage());
        }
    }

    @Test
    public void testHasProperty_False() {
        BeanPropertyDefinition prop = new BeanPropertyDefinition(new PropertyName("other"), null, null, null, null, null);
        List<BeanPropertyDefinition> props = new ArrayList<>();
        props.add(prop);
        try {
            setField(beanDescription, "_properties", props);
            assertFalse(beanDescription.hasProperty(new PropertyName("name")));
        } catch (Exception e) {
            fail("Test failed: " + e.getMessage());
        }
    }

    @Test
    public void testFindProperty_Found() {
        BeanPropertyDefinition prop = new BeanPropertyDefinition(new PropertyName("name"), null, null, null, null, null);
        List<BeanPropertyDefinition> props = new ArrayList<>();
        props.add(prop);
        try {
            setField(beanDescription, "_properties", props);
            assertNotNull(beanDescription.findProperty(new PropertyName("name")));
        } catch (Exception e) {
            fail("Test failed: " + e.getMessage());
        }
    }

    @Test
    public void testFindProperty_NotFound() {
        BeanPropertyDefinition prop = new BeanPropertyDefinition(new PropertyName("other"), null, null, null, null, null);
        List<BeanPropertyDefinition> props = new ArrayList<>();
        props.add(prop);
        try {
            setField(beanDescription, "_properties", props);
            assertNull(beanDescription.findProperty(new PropertyName("name")));
        } catch (Exception e) {
            fail("Test failed: " + e.getMessage());
        }
    }

    @Test
    public void testGetClassInfo() {
        assertNotNull(beanDescription.getClassInfo());
    }

    @Test
    public void testGetObjectIdInfo_Null() {
        assertNull(beanDescription.getObjectIdInfo());
    }

    @Test
    public void testFindProperties() {
        List<BeanPropertyDefinition> props = new ArrayList<>();
        props.add(new BeanPropertyDefinition(new PropertyName("name"), null, null, null, null, null));
        try {
            setField(beanDescription, "_properties", props);
            assertEquals(1, beanDescription.findProperties().size());
        } catch (Exception e) {
            fail("Test failed: " + e.getMessage());
        }
    }

    @Test
    public void testFindJsonValueMethod_Deprecated() {
        assertNull(beanDescription.findJsonValueMethod());
    }

    @Test
    public void testFindJsonValueAccessor() {
        assertNull(beanDescription.findJsonValueAccessor());
    }

    @Test
    public void testGetIgnoredPropertyNames_Uninitialized() {
        try {
            setField(beanDescription, "_propCollector", null);
            assertNotNull(beanDescription.getIgnoredPropertyNames());
        } catch (Exception e) {
            fail("Test failed: " + e.getMessage());
        }
    }

    @Test
    public void testHasKnownClassAnnotations_Null() {
        try {
            setField(beanDescription, "_classInfo", null);
            assertFalse(beanDescription.hasKnownClassAnnotations());
        } catch (Exception e) {
            fail("Test failed: " + e.getMessage());
        }
    }

    @Test
    public void testFindDefaultViews_NullIntrospector() {
        try {
            setField(beanDescription, "_annotationIntrospector", null);
            setField(beanDescription, "_config", null);
            assertNull(beanDescription.findDefaultViews());
        } catch (Exception e) {
            fail("Test failed: " + e.getMessage());
        }
    }

    @Test
    public void testFindDefaultViews_ResolvedNotNull() {
        Class<?>[] views = new Class<?>[] {Object.class};
        try {
            setField(beanDescription, "_defaultViewsResolved", true);
            setField(beanDescription, "_defaultViews", views);
            assertArrayEquals(views, beanDescription.findDefaultViews());
        } catch (Exception e) {
            fail("Test failed: " + e.getMessage());
        }
    }

    @Test
    public void testFindSingleArgConstructor_NoMatch() {
        try {
            Class<?>[] noArgs = new Class<?>[]{};
            assertNull(beanDescription.findSingleArgConstructor(noArgs));
        } catch (Exception e) {
            fail("Test failed: " + e.getMessage());
        }
    }

    @Test
    public void testFindFactoryMethod_NoFactories() {
        try {
            setField(beanDescription, "_classInfo", new AnnotatedClass(Object.class, null, null) {
                @Override
                public List<AnnotatedMethod> getFactoryMethods() {
                    return Collections.emptyList();
                }
            });
            assertNull(beanDescription.findFactoryMethod(String.class));
        } catch (Exception e) {
            fail("Test failed: " + e.getMessage());
        }
    }

    @Test
    public void testFindDefaultConstructor_Null() {
        try {
            setField(beanDescription, "_classInfo", new AnnotatedClass(Object.class, null, null) {
                @Override
                public AnnotatedConstructor getDefaultConstructor() {
                    return null;
                }
            });
            assertNull(beanDescription.findDefaultConstructor());
        } catch (Exception e) {
            fail("Test failed: " + e.getMessage());
        }
    }

    @Test
    public void testInstantiateBean_NoDefaultConstructor() {
        try {
            setField(beanDescription, "_classInfo", new AnnotatedClass(Object.class, null, null) {
                @Override
                public AnnotatedConstructor getDefaultConstructor() {
                    return null;
                }
            });
            setField(beanDescription, "_config", new MapperConfig.Builder(null, null, null).build());
            assertNull(beanDescription.instantiateBean(true));
        } catch (Exception e) {
            fail("Test failed: " + e.getMessage());
        }
    }

    @Test
    public void testFindMethod_NullName() {
        try {
            assertNull(beanDescription.findMethod(null, null));
        } catch (Exception e) {
            fail("Test failed: " + e.getMessage());
        }
    }

    @Test
    public void testFindExpectedFormat_NullIntrospector() {
        try {
            setField(beanDescription, "_annotationIntrospector", null);
            assertNull(beanDescription.findExpectedFormat(null));
        } catch (Exception e) {
            fail("Test failed: " + e.getMessage());
        }
    }

    @Test
    public void testFindDeserializationConverter_NullIntrospector() {
        try {
            setField(beanDescription, "_annotationIntrospector", null);
            assertNull(beanDescription.findDeserializationConverter());
        } catch (Exception e) {
            fail("Test failed: " + e.getMessage());
        }
    }

    @Test
    public void testFindSerializationConverter_NullIntrospector() {
        try {
            setField(beanDescription, "_annotationIntrospector", null);
            assertNull(beanDescription.findSerializationConverter());
        } catch (Exception e) {
            fail("Test failed: " + e.getMessage());
        }
    }

    @Test
    public void testFindPropertyInclusion_NullIntrospector() {
        try {
            setField(beanDescription, "_annotationIntrospector", null);
            JsonInclude.Value def = JsonInclude.Value.construct(JsonInclude.Include.ALWAYS);
            assertEquals(def, beanDescription.findPropertyInclusion(def));
        } catch (Exception e) {
            fail("Test failed: " + e.getMessage());
        }
    }

    @Test
    public void testFindAnyGetter_NullCollector() {
        try {
            setField(beanDescription, "_propCollector", null);
            assertNull(beanDescription.findAnyGetter());
        } catch (Exception e) {
            fail("Test failed: " + e.getMessage());
        }
    }

    @Test
    public void testFindAnySetterAccessor_NullCollector() {
        try {
            setField(beanDescription, "_propCollector", null);
            assertNull(beanDescription.findAnySetterAccessor());
        } catch (Exception e) {
            fail("Test failed: " + e.getMessage());
        }
    }

    @Test
    public void testFindBackReferences_NoProperties() {
        try {
            setField(beanDescription, "_propCollector", new POJOPropertiesCollector(new MapperConfig.Builder(null, null, null).build(), true, null, null, null, null, null));
            assertNull(beanDescription.findBackReferences());
        } catch (Exception e) {
            fail("Test failed: " + e.getMessage());
        }
    }

    @Test
    public void testFindBackReferenceProperties_NoBackRefs() {
        try {
            Map<String, AnnotatedMember> result = beanDescription.findBackReferenceProperties();
            assertNotNull(result);
            assertTrue(result.isEmpty());
        } catch (Exception e) {
            fail("Test failed: " + e.getMessage());
        }
    }

    @Test
    public void testGetFactoryMethods_EmptyList() {
        try {
            setField(beanDescription, "_classInfo", new AnnotatedClass(Object.class, null, null) {
                @Override
                public List<AnnotatedMethod> getFactoryMethods() {
                    return new ArrayList<>();
                }
            });
            assertNotNull(beanDescription.getFactoryMethods());
        } catch (Exception e) {
            fail("Test failed: " + e.getMessage());
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindAnyGetter_InvalidReturnType() throws Exception {
        try {
            AnnotatedMethod anyGetter = new AnnotatedMethod(null, null, null, null, null, true);
            try {
                java.lang.reflect.Method method = BasicBeanDescriptionTest.class.getMethod("someMethod");
                anyGetter = new AnnotatedMethod(method, null, null, null, null, true);
            } catch (NoSuchMethodException e) {
                fail("Test method not found");
            }
            POJOPropertiesCollector collector = new POJOPropertiesCollector(new MapperConfig.Builder(null, null, null).build(), true, null, null, null, null, null) {
                @Override
                public AnnotatedMember getAnyGetter() throws IllegalArgumentException {
                    return anyGetter;
                }
            };
            setField(beanDescription, "_propCollector", collector);
            beanDescription.findAnyGetter();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    // Helper method to set private fields for testing
    private void setField(Object target, String fieldName, Object value) throws Exception {
        java.lang.reflect.Field field = target.getClass().getSuperclass().getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(target, value);
    }

    public static String someMethod() {
        return "test";
    }
}