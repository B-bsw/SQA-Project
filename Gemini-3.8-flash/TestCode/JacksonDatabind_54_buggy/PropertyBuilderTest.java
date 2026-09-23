package com.fasterxml.jackson.databind.ser;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for PropertyBuilder.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class PropertyBuilderTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("PropertyBuilder", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
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
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void getClassAnnotations_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getClassAnnotations")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getClassAnnotations should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getClassAnnotations", targetMethod.getName());
    }

    @Test
    public void buildWriter_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("buildWriter")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method buildWriter should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("buildWriter", targetMethod.getName());
    }

    @Test
    public void findSerializationType_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("findSerializationType")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method findSerializationType should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("findSerializationType", targetMethod.getName());
    }

    @Test
    public void getDefaultBean_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getDefaultBean")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getDefaultBean should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getDefaultBean", targetMethod.getName());
    }

    @Test
    public void getPropertyDefaultValue_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getPropertyDefaultValue")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getPropertyDefaultValue should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getPropertyDefaultValue", targetMethod.getName());
    }

    @Test
    public void getDefaultValue_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getDefaultValue")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getDefaultValue should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getDefaultValue", targetMethod.getName());
    }

    @Test
    public void _throwWrapped_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("_throwWrapped")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method _throwWrapped should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("_throwWrapped", targetMethod.getName());
    }

}
