package org.apache.commons.math.linear;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for OpenMapRealVector.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class OpenMapRealVectorTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("OpenMapRealVector", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
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
        Class<?> clazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void isDefaultValue_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("isDefaultValue")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method isDefaultValue should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("isDefaultValue", targetMethod.getName());
    }

    @Test
    public void add_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("add")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method add should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("add", targetMethod.getName());
    }

    @Test
    public void append_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("append")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method append should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("append", targetMethod.getName());
    }

    @Test
    public void copy_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("copy")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method copy should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("copy", targetMethod.getName());
    }

    @Test
    public void dotProduct_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("dotProduct")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method dotProduct should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("dotProduct", targetMethod.getName());
    }

    @Test
    public void ebeDivide_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("ebeDivide")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method ebeDivide should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("ebeDivide", targetMethod.getName());
    }

}
