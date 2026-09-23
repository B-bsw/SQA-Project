package com.fasterxml.jackson.databind.jsontype.impl;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for StdTypeResolverBuilder.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class StdTypeResolverBuilderTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("StdTypeResolverBuilder", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
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
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void noTypeInfoBuilder_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("noTypeInfoBuilder")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method noTypeInfoBuilder should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("noTypeInfoBuilder", targetMethod.getName());
    }

    @Test
    public void init_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
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
    public void buildTypeSerializer_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("buildTypeSerializer")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method buildTypeSerializer should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("buildTypeSerializer", targetMethod.getName());
    }

    @Test
    public void buildTypeDeserializer_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("buildTypeDeserializer")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method buildTypeDeserializer should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("buildTypeDeserializer", targetMethod.getName());
    }

    @Test
    public void inclusion_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("inclusion")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method inclusion should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("inclusion", targetMethod.getName());
    }

    @Test
    public void typeProperty_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("typeProperty")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method typeProperty should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("typeProperty", targetMethod.getName());
    }

    @Test
    public void defaultImpl_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("defaultImpl")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method defaultImpl should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("defaultImpl", targetMethod.getName());
    }

    @Test
    public void typeIdVisibility_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("typeIdVisibility")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method typeIdVisibility should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("typeIdVisibility", targetMethod.getName());
    }

    @Test
    public void getDefaultImpl_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getDefaultImpl")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getDefaultImpl should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getDefaultImpl", targetMethod.getName());
    }

    @Test
    public void getTypeProperty_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getTypeProperty")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getTypeProperty should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getTypeProperty", targetMethod.getName());
    }

    @Test
    public void isTypeIdVisible_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("isTypeIdVisible")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method isTypeIdVisible should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("isTypeIdVisible", targetMethod.getName());
    }

    @Test
    public void idResolver_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("idResolver")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method idResolver should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("idResolver", targetMethod.getName());
    }

}
