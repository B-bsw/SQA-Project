package com.fasterxml.jackson.databind.deser;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for SettableBeanProperty.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class SettableBeanPropertyTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("SettableBeanProperty", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
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
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void withSimpleName_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
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
    public void setManagedReferenceName_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("setManagedReferenceName")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method setManagedReferenceName should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("setManagedReferenceName", targetMethod.getName());
    }

    @Test
    public void setObjectIdInfo_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("setObjectIdInfo")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method setObjectIdInfo should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("setObjectIdInfo", targetMethod.getName());
    }

    @Test
    public void setViews_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("setViews")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method setViews should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("setViews", targetMethod.getName());
    }

    @Test
    public void assignIndex_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("assignIndex")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method assignIndex should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("assignIndex", targetMethod.getName());
    }

    @Test
    public void fixAccess_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("fixAccess")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method fixAccess should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("fixAccess", targetMethod.getName());
    }

    @Test
    public void markAsIgnorable_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("markAsIgnorable")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method markAsIgnorable should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("markAsIgnorable", targetMethod.getName());
    }

    @Test
    public void isIgnorable_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("isIgnorable")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method isIgnorable should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("isIgnorable", targetMethod.getName());
    }

    @Test
    public void getName_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
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
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
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
    public void getType_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
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
    public void getWrapperName_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
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

}
