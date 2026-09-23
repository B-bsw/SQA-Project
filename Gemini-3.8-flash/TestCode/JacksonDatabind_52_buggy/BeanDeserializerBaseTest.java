package com.fasterxml.jackson.databind.deser;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for BeanDeserializerBase.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class BeanDeserializerBaseTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("BeanDeserializerBase", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
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
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void withBeanProperties_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("withBeanProperties")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method withBeanProperties should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("withBeanProperties", targetMethod.getName());
    }

    @Test
    public void resolve_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("resolve")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method resolve should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("resolve", targetMethod.getName());
    }

    @Test
    public void findConvertingDeserializer_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("findConvertingDeserializer")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method findConvertingDeserializer should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("findConvertingDeserializer", targetMethod.getName());
    }

    @Test
    public void createContextual_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("createContextual")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method createContextual should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("createContextual", targetMethod.getName());
    }

    @Test
    public void _resolveManagedReferenceProperty_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("_resolveManagedReferenceProperty")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method _resolveManagedReferenceProperty should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("_resolveManagedReferenceProperty", targetMethod.getName());
    }

    @Test
    public void _resolvedObjectIdProperty_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("_resolvedObjectIdProperty")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method _resolvedObjectIdProperty should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("_resolvedObjectIdProperty", targetMethod.getName());
    }

    @Test
    public void _resolveUnwrappedProperty_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("_resolveUnwrappedProperty")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method _resolveUnwrappedProperty should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("_resolveUnwrappedProperty", targetMethod.getName());
    }

    @Test
    public void _resolveInnerClassValuedProperty_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("_resolveInnerClassValuedProperty")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method _resolveInnerClassValuedProperty should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("_resolveInnerClassValuedProperty", targetMethod.getName());
    }

    @Test
    public void isCachable_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("isCachable")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method isCachable should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("isCachable", targetMethod.getName());
    }

    @Test
    public void handledType_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("handledType")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method handledType should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("handledType", targetMethod.getName());
    }

    @Test
    public void getObjectIdReader_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getObjectIdReader")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getObjectIdReader should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getObjectIdReader", targetMethod.getName());
    }

    @Test
    public void hasProperty_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("hasProperty")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method hasProperty should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("hasProperty", targetMethod.getName());
    }

}
