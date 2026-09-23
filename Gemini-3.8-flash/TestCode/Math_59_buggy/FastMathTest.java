package org.apache.commons.math.util;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for FastMath.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class FastMathTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.util.FastMath");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("FastMath", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.util.FastMath");
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
        Class<?> clazz = Class.forName("org.apache.commons.math.util.FastMath");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void sqrt_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.util.FastMath");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("sqrt")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method sqrt should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("sqrt", targetMethod.getName());
    }

    @Test
    public void cosh_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.util.FastMath");
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
    public void sinh_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.util.FastMath");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("sinh")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method sinh should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("sinh", targetMethod.getName());
    }

    @Test
    public void tanh_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.util.FastMath");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("tanh")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method tanh should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("tanh", targetMethod.getName());
    }

    @Test
    public void acosh_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.util.FastMath");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("acosh")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method acosh should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("acosh", targetMethod.getName());
    }

    @Test
    public void asinh_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.util.FastMath");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("asinh")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method asinh should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("asinh", targetMethod.getName());
    }

    @Test
    public void atanh_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.util.FastMath");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("atanh")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method atanh should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("atanh", targetMethod.getName());
    }

    @Test
    public void signum_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.util.FastMath");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("signum")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method signum should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("signum", targetMethod.getName());
    }

    @Test
    public void nextUp_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.util.FastMath");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("nextUp")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method nextUp should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("nextUp", targetMethod.getName());
    }

    @Test
    public void random_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.util.FastMath");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("random")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method random should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("random", targetMethod.getName());
    }

    @Test
    public void exp_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.util.FastMath");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("exp")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method exp should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("exp", targetMethod.getName());
    }

    @Test
    public void expm1_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.util.FastMath");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("expm1")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method expm1 should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("expm1", targetMethod.getName());
    }

}
