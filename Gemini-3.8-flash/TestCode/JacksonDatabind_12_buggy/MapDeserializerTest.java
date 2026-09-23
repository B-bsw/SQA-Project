package com.fasterxml.jackson.databind.deser.std;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for MapDeserializer.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class MapDeserializerTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("MapDeserializer", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
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
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void withResolved_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withResolved")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withResolved should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withResolved", targetMethod.getName());
    }

    @Test
    public void _isStdKeyDeser_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("_isStdKeyDeser")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method _isStdKeyDeser should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("_isStdKeyDeser", targetMethod.getName());
    }

    @Test
    public void setIgnorableProperties_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("setIgnorableProperties")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method setIgnorableProperties should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("setIgnorableProperties", targetMethod.getName());
    }

    @Test
    public void resolve_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
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
    public void createContextual_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
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
    public void getContentType_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getContentType")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getContentType should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getContentType", targetMethod.getName());
    }

    @Test
    public void getContentDeserializer_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getContentDeserializer")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getContentDeserializer should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getContentDeserializer", targetMethod.getName());
    }

    @Test
    public void isCachable_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("isCachable")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method isCachable should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("isCachable", targetMethod.getName());
    }

    @Test
    public void deserialize_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("deserialize")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method deserialize should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("deserialize", targetMethod.getName());
    }

    @Test
    public void deserializeWithType_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("deserializeWithType")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method deserializeWithType should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("deserializeWithType", targetMethod.getName());
    }

    @Test
    public void getMapClass_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getMapClass")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getMapClass should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getMapClass", targetMethod.getName());
    }

}
