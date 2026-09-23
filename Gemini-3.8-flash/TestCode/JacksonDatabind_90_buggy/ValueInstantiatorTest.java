package com.fasterxml.jackson.databind.deser;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for ValueInstantiator.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class ValueInstantiatorTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("ValueInstantiator", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator");
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
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void getValueClass_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getValueClass")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getValueClass should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getValueClass", targetMethod.getName());
    }

    @Test
    public void getValueTypeDesc_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getValueTypeDesc")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getValueTypeDesc should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getValueTypeDesc", targetMethod.getName());
    }

    @Test
    public void canInstantiate_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("canInstantiate")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method canInstantiate should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("canInstantiate", targetMethod.getName());
    }

    @Test
    public void canCreateFromString_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("canCreateFromString")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method canCreateFromString should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("canCreateFromString", targetMethod.getName());
    }

    @Test
    public void canCreateFromInt_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("canCreateFromInt")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method canCreateFromInt should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("canCreateFromInt", targetMethod.getName());
    }

    @Test
    public void canCreateFromLong_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("canCreateFromLong")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method canCreateFromLong should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("canCreateFromLong", targetMethod.getName());
    }

    @Test
    public void canCreateFromDouble_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("canCreateFromDouble")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method canCreateFromDouble should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("canCreateFromDouble", targetMethod.getName());
    }

    @Test
    public void canCreateFromBoolean_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("canCreateFromBoolean")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method canCreateFromBoolean should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("canCreateFromBoolean", targetMethod.getName());
    }

    @Test
    public void canCreateUsingDefault_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("canCreateUsingDefault")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method canCreateUsingDefault should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("canCreateUsingDefault", targetMethod.getName());
    }

    @Test
    public void canCreateUsingDelegate_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("canCreateUsingDelegate")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method canCreateUsingDelegate should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("canCreateUsingDelegate", targetMethod.getName());
    }

    @Test
    public void canCreateUsingArrayDelegate_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("canCreateUsingArrayDelegate")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method canCreateUsingArrayDelegate should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("canCreateUsingArrayDelegate", targetMethod.getName());
    }

    @Test
    public void canCreateFromObjectWith_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("canCreateFromObjectWith")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method canCreateFromObjectWith should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("canCreateFromObjectWith", targetMethod.getName());
    }

}
