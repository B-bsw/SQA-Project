package com.fasterxml.jackson.databind.node;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for ObjectNode.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class ObjectNodeTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.node.ObjectNode");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("ObjectNode", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.node.ObjectNode");
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
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.node.ObjectNode");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void _at_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.node.ObjectNode");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("_at")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method _at should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("_at", targetMethod.getName());
    }

    @Test
    public void deepCopy_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.node.ObjectNode");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("deepCopy")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method deepCopy should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("deepCopy", targetMethod.getName());
    }

    @Test
    public void getNodeType_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.node.ObjectNode");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getNodeType")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getNodeType should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getNodeType", targetMethod.getName());
    }

    @Test
    public void asToken_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.node.ObjectNode");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("asToken")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method asToken should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("asToken", targetMethod.getName());
    }

    @Test
    public void size_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.node.ObjectNode");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("size")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method size should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("size", targetMethod.getName());
    }

    @Test
    public void elements_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.node.ObjectNode");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("elements")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method elements should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("elements", targetMethod.getName());
    }

    @Test
    public void get_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.node.ObjectNode");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("get")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method get should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("get", targetMethod.getName());
    }

    @Test
    public void fieldNames_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.node.ObjectNode");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("fieldNames")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method fieldNames should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("fieldNames", targetMethod.getName());
    }

    @Test
    public void path_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.node.ObjectNode");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("path")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method path should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("path", targetMethod.getName());
    }

    @Test
    public void with_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.node.ObjectNode");
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
