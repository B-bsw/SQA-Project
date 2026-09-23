package com.fasterxml.jackson.databind.introspect;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for POJOPropertyBuilder.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class POJOPropertyBuilderTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("POJOPropertyBuilder", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
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
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void withName_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withName")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withName should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withName", targetMethod.getName());
    }

    @Test
    public void withSimpleName_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withSimpleName")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withSimpleName should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withSimpleName", targetMethod.getName());
    }

    @Test
    public void compareTo_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("compareTo")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method compareTo should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("compareTo", targetMethod.getName());
    }

    @Test
    public void getName_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
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
    public void getFullName_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getFullName")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getFullName should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getFullName", targetMethod.getName());
    }

    @Test
    public void hasName_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("hasName")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method hasName should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("hasName", targetMethod.getName());
    }

    @Test
    public void getInternalName_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getInternalName")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getInternalName should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getInternalName", targetMethod.getName());
    }

    @Test
    public void getWrapperName_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getWrapperName")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getWrapperName should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getWrapperName", targetMethod.getName());
    }

    @Test
    public void withMember_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withMember")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withMember should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withMember", targetMethod.getName());
    }

    @Test
    public void isExplicitlyIncluded_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("isExplicitlyIncluded")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method isExplicitlyIncluded should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("isExplicitlyIncluded", targetMethod.getName());
    }

    @Test
    public void isExplicitlyNamed_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("isExplicitlyNamed")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method isExplicitlyNamed should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("isExplicitlyNamed", targetMethod.getName());
    }

    @Test
    public void hasGetter_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("hasGetter")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method hasGetter should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("hasGetter", targetMethod.getName());
    }

}
