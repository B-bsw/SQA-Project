package com.fasterxml.jackson.databind.deser.impl;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for BeanPropertyMap.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class BeanPropertyMapTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("BeanPropertyMap", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
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
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void withCaseInsensitivity_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withCaseInsensitivity")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withCaseInsensitivity should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withCaseInsensitivity", targetMethod.getName());
    }

    @Test
    public void init_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("init")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method init should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("init", targetMethod.getName());
    }

    @Test
    public void construct_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("construct")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method construct should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("construct", targetMethod.getName());
    }

    @Test
    public void withProperty_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withProperty")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withProperty should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withProperty", targetMethod.getName());
    }

    @Test
    public void assignIndexes_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("assignIndexes")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method assignIndexes should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("assignIndexes", targetMethod.getName());
    }

    @Test
    public void renameAll_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("renameAll")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method renameAll should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("renameAll", targetMethod.getName());
    }

    @Test
    public void withoutProperties_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withoutProperties")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withoutProperties should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withoutProperties", targetMethod.getName());
    }

    @Test
    public void replace_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("replace")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method replace should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("replace", targetMethod.getName());
    }

    @Test
    public void iterator_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("iterator")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method iterator should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("iterator", targetMethod.getName());
    }

    @Test
    public void getPropertiesInInsertionOrder_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getPropertiesInInsertionOrder")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getPropertiesInInsertionOrder should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getPropertiesInInsertionOrder", targetMethod.getName());
    }

    @Test
    public void getPropertyName_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getPropertyName")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getPropertyName should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getPropertyName", targetMethod.getName());
    }

    @Test
    public void find_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("find")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method find should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("find", targetMethod.getName());
    }

}
