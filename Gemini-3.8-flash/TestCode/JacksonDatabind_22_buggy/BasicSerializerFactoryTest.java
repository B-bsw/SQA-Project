package com.fasterxml.jackson.databind.ser;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for BasicSerializerFactory.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class BasicSerializerFactoryTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("BasicSerializerFactory", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
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
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void getFactoryConfig_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getFactoryConfig")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getFactoryConfig should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getFactoryConfig", targetMethod.getName());
    }

    @Test
    public void withAdditionalSerializers_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withAdditionalSerializers")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withAdditionalSerializers should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withAdditionalSerializers", targetMethod.getName());
    }

    @Test
    public void withAdditionalKeySerializers_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withAdditionalKeySerializers")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withAdditionalKeySerializers should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withAdditionalKeySerializers", targetMethod.getName());
    }

    @Test
    public void withSerializerModifier_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withSerializerModifier")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withSerializerModifier should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withSerializerModifier", targetMethod.getName());
    }

    @Test
    public void createKeySerializer_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("createKeySerializer")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method createKeySerializer should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("createKeySerializer", targetMethod.getName());
    }

    @Test
    public void createTypeSerializer_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("createTypeSerializer")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method createTypeSerializer should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("createTypeSerializer", targetMethod.getName());
    }

    @Test
    public void findSerializerByLookup_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("findSerializerByLookup")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method findSerializerByLookup should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("findSerializerByLookup", targetMethod.getName());
    }

    @Test
    public void findSerializerByAnnotations_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("findSerializerByAnnotations")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method findSerializerByAnnotations should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("findSerializerByAnnotations", targetMethod.getName());
    }

    @Test
    public void findSerializerByPrimaryType_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("findSerializerByPrimaryType")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method findSerializerByPrimaryType should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("findSerializerByPrimaryType", targetMethod.getName());
    }

    @Test
    public void findOptionalStdSerializer_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("findOptionalStdSerializer")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method findOptionalStdSerializer should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("findOptionalStdSerializer", targetMethod.getName());
    }

    @Test
    public void findSerializerByAddonType_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("findSerializerByAddonType")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method findSerializerByAddonType should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("findSerializerByAddonType", targetMethod.getName());
    }

    @Test
    public void findSerializerFromAnnotation_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("findSerializerFromAnnotation")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method findSerializerFromAnnotation should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("findSerializerFromAnnotation", targetMethod.getName());
    }

}
