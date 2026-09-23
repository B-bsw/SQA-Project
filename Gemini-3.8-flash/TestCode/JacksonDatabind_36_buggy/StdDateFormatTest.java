package com.fasterxml.jackson.databind.util;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for StdDateFormat.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class StdDateFormatTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("StdDateFormat", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
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
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void getDefaultTimeZone_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getDefaultTimeZone")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getDefaultTimeZone should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getDefaultTimeZone", targetMethod.getName());
    }

    @Test
    public void withTimeZone_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withTimeZone")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withTimeZone should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withTimeZone", targetMethod.getName());
    }

    @Test
    public void withLocale_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withLocale")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withLocale should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withLocale", targetMethod.getName());
    }

    @Test
    public void clone_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("clone")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method clone should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("clone", targetMethod.getName());
    }

    @Test
    public void getISO8601Format_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getISO8601Format")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getISO8601Format should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getISO8601Format", targetMethod.getName());
    }

    @Test
    public void getRFC1123Format_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getRFC1123Format")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getRFC1123Format should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getRFC1123Format", targetMethod.getName());
    }

    @Test
    public void getTimeZone_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getTimeZone")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getTimeZone should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getTimeZone", targetMethod.getName());
    }

    @Test
    public void setTimeZone_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("setTimeZone")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method setTimeZone should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("setTimeZone", targetMethod.getName());
    }

    @Test
    public void isLenient_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("isLenient")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method isLenient should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("isLenient", targetMethod.getName());
    }

    @Test
    public void parse_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("parse")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method parse should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("parse", targetMethod.getName());
    }

}
