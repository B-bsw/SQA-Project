package com.fasterxml.jackson.databind;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for AnnotationIntrospector.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class AnnotationIntrospectorTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("AnnotationIntrospector", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector");
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
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void managed_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("managed")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method managed should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("managed", targetMethod.getName());
    }

    @Test
    public void back_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("back")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method back should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("back", targetMethod.getName());
    }

    @Test
    public void getType_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getType")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getType should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getType", targetMethod.getName());
    }

    @Test
    public void getName_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getName")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getName should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getName", targetMethod.getName());
    }

    @Test
    public void isManagedReference_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("isManagedReference")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method isManagedReference should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("isManagedReference", targetMethod.getName());
    }

    @Test
    public void isBackReference_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("isBackReference")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method isBackReference should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("isBackReference", targetMethod.getName());
    }

    @Test
    public void nopInstance_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("nopInstance")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method nopInstance should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("nopInstance", targetMethod.getName());
    }

    @Test
    public void pair_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("pair")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method pair should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("pair", targetMethod.getName());
    }

    @Test
    public void allIntrospectors_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("allIntrospectors")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method allIntrospectors should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("allIntrospectors", targetMethod.getName());
    }

    @Test
    public void isAnnotationBundle_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("isAnnotationBundle")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method isAnnotationBundle should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("isAnnotationBundle", targetMethod.getName());
    }

    @Test
    public void findObjectIdInfo_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("findObjectIdInfo")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method findObjectIdInfo should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("findObjectIdInfo", targetMethod.getName());
    }

}
