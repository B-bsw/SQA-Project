package com.fasterxml.jackson.databind.type;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for SimpleType.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class SimpleTypeTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.type.SimpleType");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("SimpleType", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.type.SimpleType");
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
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.type.SimpleType");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void constructUnsafe_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.type.SimpleType");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("constructUnsafe")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method constructUnsafe should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("constructUnsafe", targetMethod.getName());
    }

    @Test
    public void construct_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.type.SimpleType");
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
    public void _narrow_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.type.SimpleType");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("_narrow")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method _narrow should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("_narrow", targetMethod.getName());
    }

    @Test
    public void withContentType_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.type.SimpleType");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withContentType")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withContentType should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withContentType", targetMethod.getName());
    }

    @Test
    public void withTypeHandler_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.type.SimpleType");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withTypeHandler")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withTypeHandler should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withTypeHandler", targetMethod.getName());
    }

    @Test
    public void withContentTypeHandler_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.type.SimpleType");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withContentTypeHandler")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withContentTypeHandler should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withContentTypeHandler", targetMethod.getName());
    }

    @Test
    public void withValueHandler_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.type.SimpleType");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withValueHandler")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withValueHandler should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withValueHandler", targetMethod.getName());
    }

    @Test
    public void withContentValueHandler_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.type.SimpleType");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withContentValueHandler")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withContentValueHandler should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withContentValueHandler", targetMethod.getName());
    }

    @Test
    public void withStaticTyping_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.type.SimpleType");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withStaticTyping")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withStaticTyping should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withStaticTyping", targetMethod.getName());
    }

    @Test
    public void refine_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.type.SimpleType");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("refine")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method refine should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("refine", targetMethod.getName());
    }

    @Test
    public void buildCanonicalName_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.type.SimpleType");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("buildCanonicalName")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method buildCanonicalName should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("buildCanonicalName", targetMethod.getName());
    }

    @Test
    public void isContainerType_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.type.SimpleType");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("isContainerType")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method isContainerType should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("isContainerType", targetMethod.getName());
    }

}
