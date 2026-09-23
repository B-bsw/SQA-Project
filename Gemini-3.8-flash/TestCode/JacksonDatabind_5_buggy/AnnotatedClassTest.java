package com.fasterxml.jackson.databind.introspect;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for AnnotatedClass.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class AnnotatedClassTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("AnnotatedClass", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
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
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void withAnnotations_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withAnnotations")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withAnnotations should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withAnnotations", targetMethod.getName());
    }

    @Test
    public void construct_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("construct")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method construct should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("construct", targetMethod.getName());
    }

    @Test
    public void constructWithoutSuperTypes_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("constructWithoutSuperTypes")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method constructWithoutSuperTypes should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("constructWithoutSuperTypes", targetMethod.getName());
    }

    @Test
    public void getAnnotated_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getAnnotated")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getAnnotated should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getAnnotated", targetMethod.getName());
    }

    @Test
    public void getModifiers_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getModifiers")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getModifiers should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getModifiers", targetMethod.getName());
    }

    @Test
    public void getName_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getName")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getName should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getName", targetMethod.getName());
    }

    @Test
    public void getAnnotation_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getAnnotation")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getAnnotation should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getAnnotation", targetMethod.getName());
    }

    @Test
    public void getGenericType_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getGenericType")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getGenericType should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getGenericType", targetMethod.getName());
    }

    @Test
    public void getRawType_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getRawType")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getRawType should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getRawType", targetMethod.getName());
    }

    @Test
    public void annotations_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("annotations")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method annotations should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("annotations", targetMethod.getName());
    }

    @Test
    public void getAllAnnotations_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getAllAnnotations")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getAllAnnotations should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getAllAnnotations", targetMethod.getName());
    }

    @Test
    public void getAnnotations_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getAnnotations")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getAnnotations should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getAnnotations", targetMethod.getName());
    }

}
