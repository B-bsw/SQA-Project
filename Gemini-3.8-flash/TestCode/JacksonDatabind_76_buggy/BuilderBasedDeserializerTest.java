package com.fasterxml.jackson.databind.deser;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for BuilderBasedDeserializer.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class BuilderBasedDeserializerTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("BuilderBasedDeserializer", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Constructor<?>[] ctors = clazz.getDeclaredConstructors();
        Assert.assertNotNull("Constructors array should not be null", ctors);
        for (int i = 0; i < ctors.length; i++) {
            Constructor<?> c = ctors[i];
            Assert.assertNotNull(c);
            c.setAccessible(true);
        }
    }

    @Test
    public void methods_reflection_shouldInspectDeclaredMethods() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void unwrappingDeserializer_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("unwrappingDeserializer")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method unwrappingDeserializer should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("unwrappingDeserializer", targetMethod.getName());
    }

    @Test
    public void withObjectIdReader_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withObjectIdReader")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withObjectIdReader should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withObjectIdReader", targetMethod.getName());
    }

    @Test
    public void withIgnorableProperties_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withIgnorableProperties")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withIgnorableProperties should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withIgnorableProperties", targetMethod.getName());
    }

    @Test
    public void withBeanProperties_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withBeanProperties")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withBeanProperties should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withBeanProperties", targetMethod.getName());
    }

    @Test
    public void asArrayDeserializer_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("asArrayDeserializer")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method asArrayDeserializer should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("asArrayDeserializer", targetMethod.getName());
    }

    @Test
    public void finishBuild_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("finishBuild")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method finishBuild should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("finishBuild", targetMethod.getName());
    }

    @Test
    public void deserialize_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("deserialize")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method deserialize should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("deserialize", targetMethod.getName());
    }

    @Test
    public void _deserialize_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("_deserialize")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method _deserialize should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("_deserialize", targetMethod.getName());
    }

    @Test
    public void deserializeFromObject_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("deserializeFromObject")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method deserializeFromObject should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("deserializeFromObject", targetMethod.getName());
    }

    @Test
    public void _deserializeUsingPropertyBased_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("_deserializeUsingPropertyBased")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method _deserializeUsingPropertyBased should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("_deserializeUsingPropertyBased", targetMethod.getName());
    }

    @Test
    public void deserializeWithView_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("deserializeWithView")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method deserializeWithView should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("deserializeWithView", targetMethod.getName());
    }

}
