package com.fasterxml.jackson.databind.jsontype.impl;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for AsPropertyTypeDeserializer.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class AsPropertyTypeDeserializerTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("AsPropertyTypeDeserializer", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer");
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
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void forProperty_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("forProperty")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method forProperty should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("forProperty", targetMethod.getName());
    }

    @Test
    public void getTypeInclusion_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getTypeInclusion")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getTypeInclusion should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getTypeInclusion", targetMethod.getName());
    }

    @Test
    public void deserializeTypedFromObject_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("deserializeTypedFromObject")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method deserializeTypedFromObject should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("deserializeTypedFromObject", targetMethod.getName());
    }

    @Test
    public void _deserializeTypedForId_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("_deserializeTypedForId")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method _deserializeTypedForId should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("_deserializeTypedForId", targetMethod.getName());
    }

    @Test
    public void _deserializeTypedUsingDefaultImpl_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("_deserializeTypedUsingDefaultImpl")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method _deserializeTypedUsingDefaultImpl should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("_deserializeTypedUsingDefaultImpl", targetMethod.getName());
    }

    @Test
    public void deserializeTypedFromAny_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("deserializeTypedFromAny")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method deserializeTypedFromAny should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("deserializeTypedFromAny", targetMethod.getName());
    }

}
