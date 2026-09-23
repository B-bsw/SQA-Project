package com.fasterxml.jackson.databind.util;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for ClassUtil.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class ClassUtilTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("ClassUtil", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
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
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void emptyIterator_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("emptyIterator")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method emptyIterator should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("emptyIterator", targetMethod.getName());
    }

    @Test
    public void findSuperTypes_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("findSuperTypes")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method findSuperTypes should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("findSuperTypes", targetMethod.getName());
    }

    @Test
    public void findRawSuperTypes_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("findRawSuperTypes")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method findRawSuperTypes should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("findRawSuperTypes", targetMethod.getName());
    }

    @Test
    public void findSuperClasses_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("findSuperClasses")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method findSuperClasses should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("findSuperClasses", targetMethod.getName());
    }

    @Test
    public void canBeABeanType_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("canBeABeanType")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method canBeABeanType should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("canBeABeanType", targetMethod.getName());
    }

    @Test
    public void isLocalType_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("isLocalType")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method isLocalType should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("isLocalType", targetMethod.getName());
    }

    @Test
    public void getOuterClass_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getOuterClass")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getOuterClass should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getOuterClass", targetMethod.getName());
    }

    @Test
    public void isProxyType_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("isProxyType")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method isProxyType should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("isProxyType", targetMethod.getName());
    }

    @Test
    public void isConcrete_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("isConcrete")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method isConcrete should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("isConcrete", targetMethod.getName());
    }

}
