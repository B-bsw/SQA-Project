package com.fasterxml.jackson.databind.jsontype.impl;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for TypeDeserializerBase.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class TypeDeserializerBaseTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("TypeDeserializerBase", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase");
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
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void baseTypeName_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("baseTypeName")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method baseTypeName should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("baseTypeName", targetMethod.getName());
    }

    @Test
    public void getPropertyName_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getPropertyName")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getPropertyName should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getPropertyName", targetMethod.getName());
    }

    @Test
    public void getTypeIdResolver_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getTypeIdResolver")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getTypeIdResolver should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getTypeIdResolver", targetMethod.getName());
    }

    @Test
    public void getDefaultImpl_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getDefaultImpl")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getDefaultImpl should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getDefaultImpl", targetMethod.getName());
    }

    @Test
    public void toString_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("toString")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method toString should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("toString", targetMethod.getName());
    }

    @Test
    public void _findDeserializer_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("_findDeserializer")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method _findDeserializer should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("_findDeserializer", targetMethod.getName());
    }

    @Test
    public void _findDefaultImplDeserializer_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("_findDefaultImplDeserializer")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method _findDefaultImplDeserializer should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("_findDefaultImplDeserializer", targetMethod.getName());
    }

    @Test
    public void _deserializeWithNativeTypeId_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("_deserializeWithNativeTypeId")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method _deserializeWithNativeTypeId should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("_deserializeWithNativeTypeId", targetMethod.getName());
    }

    @Test
    public void _handleUnknownTypeId_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("_handleUnknownTypeId")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method _handleUnknownTypeId should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("_handleUnknownTypeId", targetMethod.getName());
    }

}
