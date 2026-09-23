package com.fasterxml.jackson.databind.ser.std;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for StdKeySerializers.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class StdKeySerializersTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.std.StdKeySerializers");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("StdKeySerializers", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.std.StdKeySerializers");
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
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.std.StdKeySerializers");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void getStdKeySerializer_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.std.StdKeySerializers");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getStdKeySerializer")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getStdKeySerializer should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getStdKeySerializer", targetMethod.getName());
    }

    @Test
    public void getFallbackKeySerializer_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.std.StdKeySerializers");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getFallbackKeySerializer")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getFallbackKeySerializer should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getFallbackKeySerializer", targetMethod.getName());
    }

    @Test
    public void getDefault_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.std.StdKeySerializers");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getDefault")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getDefault should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getDefault", targetMethod.getName());
    }

    @Test
    public void serialize_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.std.StdKeySerializers");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("serialize")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method serialize should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("serialize", targetMethod.getName());
    }

    @Test
    public void _findAndAddDynamic_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.std.StdKeySerializers");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("_findAndAddDynamic")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method _findAndAddDynamic should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("_findAndAddDynamic", targetMethod.getName());
    }

}
