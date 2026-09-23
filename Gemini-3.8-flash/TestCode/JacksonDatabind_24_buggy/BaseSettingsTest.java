package com.fasterxml.jackson.databind.cfg;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for BaseSettings.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class BaseSettingsTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("BaseSettings", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings");
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
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void withClassIntrospector_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withClassIntrospector")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withClassIntrospector should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withClassIntrospector", targetMethod.getName());
    }

    @Test
    public void withAnnotationIntrospector_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withAnnotationIntrospector")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withAnnotationIntrospector should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withAnnotationIntrospector", targetMethod.getName());
    }

    @Test
    public void withInsertedAnnotationIntrospector_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings");
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
    public void withAppendedAnnotationIntrospector_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings");
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
    public void withVisibilityChecker_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withVisibilityChecker")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withVisibilityChecker should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withVisibilityChecker", targetMethod.getName());
    }

    @Test
    public void withVisibility_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withVisibility")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withVisibility should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withVisibility", targetMethod.getName());
    }

    @Test
    public void withPropertyNamingStrategy_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withPropertyNamingStrategy")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withPropertyNamingStrategy should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withPropertyNamingStrategy", targetMethod.getName());
    }

    @Test
    public void withTypeFactory_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withTypeFactory")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withTypeFactory should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withTypeFactory", targetMethod.getName());
    }

    @Test
    public void withTypeResolverBuilder_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withTypeResolverBuilder")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withTypeResolverBuilder should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withTypeResolverBuilder", targetMethod.getName());
    }

    @Test
    public void withDateFormat_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withDateFormat")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withDateFormat should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withDateFormat", targetMethod.getName());
    }

    @Test
    public void withHandlerInstantiator_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withHandlerInstantiator")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withHandlerInstantiator should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withHandlerInstantiator", targetMethod.getName());
    }

    @Test
    public void with_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings");
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

}
