package com.fasterxml.jackson.databind;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for JavaType.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class JavaTypeTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("JavaType", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.JavaType");
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
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void narrowBy_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("narrowBy")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method narrowBy should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("narrowBy", targetMethod.getName());
    }

    @Test
    public void forcedNarrowBy_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("forcedNarrowBy")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method forcedNarrowBy should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("forcedNarrowBy", targetMethod.getName());
    }

    @Test
    public void widenBy_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("widenBy")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method widenBy should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("widenBy", targetMethod.getName());
    }

    @Test
    public void _widen_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("_widen")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method _widen should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("_widen", targetMethod.getName());
    }

    @Test
    public void getRawClass_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getRawClass")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getRawClass should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getRawClass", targetMethod.getName());
    }

    @Test
    public void hasRawClass_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("hasRawClass")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method hasRawClass should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("hasRawClass", targetMethod.getName());
    }

    @Test
    public void isAbstract_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("isAbstract")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method isAbstract should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("isAbstract", targetMethod.getName());
    }

    @Test
    public void isConcrete_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.JavaType");
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

    @Test
    public void isThrowable_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("isThrowable")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method isThrowable should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("isThrowable", targetMethod.getName());
    }

    @Test
    public void isArrayType_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("isArrayType")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method isArrayType should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("isArrayType", targetMethod.getName());
    }

    @Test
    public void isEnumType_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("isEnumType")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method isEnumType should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("isEnumType", targetMethod.getName());
    }

    @Test
    public void isInterface_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("isInterface")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method isInterface should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("isInterface", targetMethod.getName());
    }

}
