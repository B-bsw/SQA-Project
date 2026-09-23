package com.fasterxml.jackson.databind.deser.impl;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for CreatorCollector.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class CreatorCollectorTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("CreatorCollector", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector");
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
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void constructValueInstantiator_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("constructValueInstantiator")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method constructValueInstantiator should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("constructValueInstantiator", targetMethod.getName());
    }

    @Test
    public void setDefaultCreator_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("setDefaultCreator")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method setDefaultCreator should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("setDefaultCreator", targetMethod.getName());
    }

    @Test
    public void addStringCreator_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("addStringCreator")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method addStringCreator should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("addStringCreator", targetMethod.getName());
    }

    @Test
    public void addIntCreator_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("addIntCreator")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method addIntCreator should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("addIntCreator", targetMethod.getName());
    }

    @Test
    public void addLongCreator_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("addLongCreator")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method addLongCreator should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("addLongCreator", targetMethod.getName());
    }

    @Test
    public void addDoubleCreator_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("addDoubleCreator")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method addDoubleCreator should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("addDoubleCreator", targetMethod.getName());
    }

    @Test
    public void addBooleanCreator_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("addBooleanCreator")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method addBooleanCreator should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("addBooleanCreator", targetMethod.getName());
    }

    @Test
    public void addDelegatingCreator_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("addDelegatingCreator")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method addDelegatingCreator should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("addDelegatingCreator", targetMethod.getName());
    }

    @Test
    public void addPropertyCreator_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("addPropertyCreator")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method addPropertyCreator should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("addPropertyCreator", targetMethod.getName());
    }

    @Test
    public void addIncompeteParameter_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("addIncompeteParameter")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method addIncompeteParameter should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("addIncompeteParameter", targetMethod.getName());
    }

}
