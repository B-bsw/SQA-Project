package com.fasterxml.jackson.databind;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for ObjectReader.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class ObjectReaderTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("ObjectReader", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
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
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void version_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("version")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method version should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("version", targetMethod.getName());
    }

    @Test
    public void _new_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("_new")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method _new should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("_new", targetMethod.getName());
    }

    @Test
    public void _newIterator_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("_newIterator")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method _newIterator should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("_newIterator", targetMethod.getName());
    }

    @Test
    public void _initForReading_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("_initForReading")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method _initForReading should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("_initForReading", targetMethod.getName());
    }

    @Test
    public void _initForMultiRead_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("_initForMultiRead")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method _initForMultiRead should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("_initForMultiRead", targetMethod.getName());
    }

    @Test
    public void with_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
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
    public void withFeatures_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withFeatures")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withFeatures should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withFeatures", targetMethod.getName());
    }

    @Test
    public void without_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
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

}
