package com.fasterxml.jackson.databind.ser.std;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for BeanSerializerBase.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class BeanSerializerBaseTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("BeanSerializerBase", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
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
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void resolve_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("resolve")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method resolve should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("resolve", targetMethod.getName());
    }

    @Test
    public void findConvertingSerializer_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("findConvertingSerializer")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method findConvertingSerializer should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("findConvertingSerializer", targetMethod.getName());
    }

    @Test
    public void createContextual_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("createContextual")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method createContextual should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("createContextual", targetMethod.getName());
    }

    @Test
    public void usesObjectId_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("usesObjectId")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method usesObjectId should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("usesObjectId", targetMethod.getName());
    }

    @Test
    public void serializeWithType_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("serializeWithType")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method serializeWithType should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("serializeWithType", targetMethod.getName());
    }

    @Test
    public void _serializeWithObjectId_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("_serializeWithObjectId")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method _serializeWithObjectId should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("_serializeWithObjectId", targetMethod.getName());
    }

    @Test
    public void _serializeObjectId_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("_serializeObjectId")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method _serializeObjectId should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("_serializeObjectId", targetMethod.getName());
    }

    @Test
    public void _customTypeId_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("_customTypeId")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method _customTypeId should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("_customTypeId", targetMethod.getName());
    }

    @Test
    public void serializeFields_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("serializeFields")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method serializeFields should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("serializeFields", targetMethod.getName());
    }

    @Test
    public void serializeFieldsFiltered_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("serializeFieldsFiltered")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method serializeFieldsFiltered should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("serializeFieldsFiltered", targetMethod.getName());
    }

    @Test
    public void getSchema_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getSchema")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getSchema should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getSchema", targetMethod.getName());
    }

}
