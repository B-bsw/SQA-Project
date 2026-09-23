package com.fasterxml.jackson.databind;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for ObjectMapper.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class ObjectMapperTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("ObjectMapper", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
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
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void buildTypeDeserializer_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("buildTypeDeserializer")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method buildTypeDeserializer should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("buildTypeDeserializer", targetMethod.getName());
    }

    @Test
    public void buildTypeSerializer_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("buildTypeSerializer")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method buildTypeSerializer should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("buildTypeSerializer", targetMethod.getName());
    }

    @Test
    public void useForType_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("useForType")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method useForType should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("useForType", targetMethod.getName());
    }

    @Test
    public void copy_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("copy")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method copy should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("copy", targetMethod.getName());
    }

    @Test
    public void _checkInvalidCopy_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("_checkInvalidCopy")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method _checkInvalidCopy should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("_checkInvalidCopy", targetMethod.getName());
    }

    @Test
    public void version_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
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
    public void registerModule_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("registerModule")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method registerModule should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("registerModule", targetMethod.getName());
    }

    @Test
    public void getMapperVersion_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getMapperVersion")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getMapperVersion should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getMapperVersion", targetMethod.getName());
    }

    @Test
    public void getOwner_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getOwner")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getOwner should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getOwner", targetMethod.getName());
    }

    @Test
    public void getTypeFactory_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getTypeFactory")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getTypeFactory should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getTypeFactory", targetMethod.getName());
    }

    @Test
    public void isEnabled_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("isEnabled")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method isEnabled should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("isEnabled", targetMethod.getName());
    }

}
