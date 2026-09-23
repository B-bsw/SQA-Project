package com.fasterxml.jackson.databind.introspect;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for POJOPropertiesCollector.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class POJOPropertiesCollectorTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("POJOPropertiesCollector", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
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
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void getConfig_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getConfig")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getConfig should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getConfig", targetMethod.getName());
    }

    @Test
    public void getType_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
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
    public void getClassDef_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getClassDef")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getClassDef should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getClassDef", targetMethod.getName());
    }

    @Test
    public void getAnnotationIntrospector_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getAnnotationIntrospector")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getAnnotationIntrospector should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getAnnotationIntrospector", targetMethod.getName());
    }

    @Test
    public void getProperties_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getProperties")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getProperties should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getProperties", targetMethod.getName());
    }

    @Test
    public void getInjectables_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getInjectables")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getInjectables should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getInjectables", targetMethod.getName());
    }

    @Test
    public void getJsonValueMethod_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getJsonValueMethod")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getJsonValueMethod should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getJsonValueMethod", targetMethod.getName());
    }

    @Test
    public void getAnyGetter_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getAnyGetter")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getAnyGetter should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getAnyGetter", targetMethod.getName());
    }

    @Test
    public void getAnySetterField_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getAnySetterField")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getAnySetterField should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getAnySetterField", targetMethod.getName());
    }

    @Test
    public void getAnySetterMethod_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getAnySetterMethod")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getAnySetterMethod should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getAnySetterMethod", targetMethod.getName());
    }

    @Test
    public void getIgnoredPropertyNames_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getIgnoredPropertyNames")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getIgnoredPropertyNames should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getIgnoredPropertyNames", targetMethod.getName());
    }

    @Test
    public void getObjectIdInfo_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getObjectIdInfo")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getObjectIdInfo should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getObjectIdInfo", targetMethod.getName());
    }

}
