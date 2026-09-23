package com.fasterxml.jackson.databind.deser.std;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for UntypedObjectDeserializer.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class UntypedObjectDeserializerTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("UntypedObjectDeserializer", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer");
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
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer");
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
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer");
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
    public void _findCustomDeser_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("_findCustomDeser")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method _findCustomDeser should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("_findCustomDeser", targetMethod.getName());
    }

    @Test
    public void _clearIfStdImpl_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("_clearIfStdImpl")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method _clearIfStdImpl should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("_clearIfStdImpl", targetMethod.getName());
    }

    @Test
    public void createContextual_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer");
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
    public void _withResolved_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("_withResolved")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method _withResolved should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("_withResolved", targetMethod.getName());
    }

    @Test
    public void isCachable_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer");
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
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer");
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
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer");
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
    public void mapArray_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("mapArray")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method mapArray should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("mapArray", targetMethod.getName());
    }

    @Test
    public void mapObject_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("mapObject")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method mapObject should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("mapObject", targetMethod.getName());
    }

    @Test
    public void mapArrayToArray_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("mapArrayToArray")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method mapArrayToArray should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("mapArrayToArray", targetMethod.getName());
    }

}
