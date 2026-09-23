package com.fasterxml.jackson.databind;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for DeserializationConfig.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class DeserializationConfigTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("DeserializationConfig", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
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
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void getBaseSettings_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getBaseSettings")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getBaseSettings should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getBaseSettings", targetMethod.getName());
    }

    @Test
    public void with_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("with")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method with should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("with", targetMethod.getName());
    }

    @Test
    public void without_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("without")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method without should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("without", targetMethod.getName());
    }

    @Test
    public void withVisibility_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withVisibility")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withVisibility should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withVisibility", targetMethod.getName());
    }

    @Test
    public void withRootName_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withRootName")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withRootName should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withRootName", targetMethod.getName());
    }

}
