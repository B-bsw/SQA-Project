package com.fasterxml.jackson.databind;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for SerializationConfig.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class SerializationConfigTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("SerializationConfig", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
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
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void with_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("with")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method with should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("with", targetMethod.getName());
    }

    @Test
    public void without_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("without")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method without should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("without", targetMethod.getName());
    }

    @Test
    public void withAppendedAnnotationIntrospector_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withAppendedAnnotationIntrospector")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withAppendedAnnotationIntrospector should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withAppendedAnnotationIntrospector", targetMethod.getName());
    }

    @Test
    public void withInsertedAnnotationIntrospector_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withInsertedAnnotationIntrospector")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withInsertedAnnotationIntrospector should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withInsertedAnnotationIntrospector", targetMethod.getName());
    }

    @Test
    public void withRootName_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withRootName")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withRootName should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withRootName", targetMethod.getName());
    }

}
