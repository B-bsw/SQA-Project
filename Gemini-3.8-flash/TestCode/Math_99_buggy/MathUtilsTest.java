package org.apache.commons.math.util;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for MathUtils.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class MathUtilsTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.util.MathUtils");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("MathUtils", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.util.MathUtils");
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
        Class<?> clazz = Class.forName("org.apache.commons.math.util.MathUtils");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void addAndCheck_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.util.MathUtils");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("addAndCheck")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method addAndCheck should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("addAndCheck", targetMethod.getName());
    }

    @Test
    public void binomialCoefficient_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.util.MathUtils");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("binomialCoefficient")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method binomialCoefficient should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("binomialCoefficient", targetMethod.getName());
    }

    @Test
    public void binomialCoefficientDouble_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.util.MathUtils");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("binomialCoefficientDouble")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method binomialCoefficientDouble should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("binomialCoefficientDouble", targetMethod.getName());
    }

    @Test
    public void binomialCoefficientLog_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.util.MathUtils");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("binomialCoefficientLog")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method binomialCoefficientLog should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("binomialCoefficientLog", targetMethod.getName());
    }

    @Test
    public void cosh_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.util.MathUtils");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("cosh")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method cosh should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("cosh", targetMethod.getName());
    }

    @Test
    public void equals_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.util.MathUtils");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("equals")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method equals should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("equals", targetMethod.getName());
    }

    @Test
    public void factorial_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.util.MathUtils");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("factorial")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method factorial should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("factorial", targetMethod.getName());
    }

    @Test
    public void factorialDouble_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.util.MathUtils");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("factorialDouble")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method factorialDouble should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("factorialDouble", targetMethod.getName());
    }

    @Test
    public void factorialLog_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.util.MathUtils");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("factorialLog")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method factorialLog should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("factorialLog", targetMethod.getName());
    }

}
