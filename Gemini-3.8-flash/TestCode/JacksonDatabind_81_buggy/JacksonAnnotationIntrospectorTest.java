package com.fasterxml.jackson.databind.introspect;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for JacksonAnnotationIntrospector.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class JacksonAnnotationIntrospectorTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("JacksonAnnotationIntrospector", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector");
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
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void version_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("version")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method version should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("version", targetMethod.getName());
    }

    @Test
    public void readResolve_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("readResolve")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method readResolve should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("readResolve", targetMethod.getName());
    }

    @Test
    public void setConstructorPropertiesImpliesCreator_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("setConstructorPropertiesImpliesCreator")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method setConstructorPropertiesImpliesCreator should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("setConstructorPropertiesImpliesCreator", targetMethod.getName());
    }

    @Test
    public void isAnnotationBundle_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector");
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
    public void findEnumValue_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("findEnumValue")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method findEnumValue should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("findEnumValue", targetMethod.getName());
    }

    @Test
    public void findEnumValues_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("findEnumValues")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method findEnumValues should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("findEnumValues", targetMethod.getName());
    }

    @Test
    public void findDefaultEnumValue_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("findDefaultEnumValue")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method findDefaultEnumValue should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("findDefaultEnumValue", targetMethod.getName());
    }

    @Test
    public void findRootName_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("findRootName")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method findRootName should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("findRootName", targetMethod.getName());
    }

    @Test
    public void isIgnorableType_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("isIgnorableType")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method isIgnorableType should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("isIgnorableType", targetMethod.getName());
    }

    @Test
    public void findFilterId_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("findFilterId")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method findFilterId should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("findFilterId", targetMethod.getName());
    }

    @Test
    public void findNamingStrategy_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("findNamingStrategy")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method findNamingStrategy should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("findNamingStrategy", targetMethod.getName());
    }

    @Test
    public void findClassDescription_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("findClassDescription")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method findClassDescription should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("findClassDescription", targetMethod.getName());
    }

}
