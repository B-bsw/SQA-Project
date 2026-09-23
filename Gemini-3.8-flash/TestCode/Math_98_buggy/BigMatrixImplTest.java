package org.apache.commons.math.linear;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for BigMatrixImpl.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class BigMatrixImplTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("BigMatrixImpl", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
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
        Class<?> clazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void copy_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
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
    public void add_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
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
    public void subtract_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("subtract")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method subtract should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("subtract", targetMethod.getName());
    }

    @Test
    public void scalarAdd_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("scalarAdd")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method scalarAdd should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("scalarAdd", targetMethod.getName());
    }

    @Test
    public void scalarMultiply_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("scalarMultiply")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method scalarMultiply should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("scalarMultiply", targetMethod.getName());
    }

    @Test
    public void multiply_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("multiply")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method multiply should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("multiply", targetMethod.getName());
    }

    @Test
    public void preMultiply_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("preMultiply")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method preMultiply should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("preMultiply", targetMethod.getName());
    }

    @Test
    public void getData_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getData")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getData should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getData", targetMethod.getName());
    }

    @Test
    public void getDataAsDoubleArray_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getDataAsDoubleArray")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getDataAsDoubleArray should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getDataAsDoubleArray", targetMethod.getName());
    }

}
