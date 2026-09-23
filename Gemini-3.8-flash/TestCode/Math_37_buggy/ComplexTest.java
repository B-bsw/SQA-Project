package org.apache.commons.math.complex;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for Complex.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class ComplexTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.complex.Complex");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("Complex", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.complex.Complex");
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
        Class<?> clazz = Class.forName("org.apache.commons.math.complex.Complex");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void abs_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.complex.Complex");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("abs")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method abs should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("abs", targetMethod.getName());
    }

    @Test
    public void add_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.complex.Complex");
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
    public void conjugate_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.complex.Complex");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("conjugate")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method conjugate should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("conjugate", targetMethod.getName());
    }

    @Test
    public void divide_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.complex.Complex");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("divide")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method divide should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("divide", targetMethod.getName());
    }

    @Test
    public void reciprocal_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.complex.Complex");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("reciprocal")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method reciprocal should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("reciprocal", targetMethod.getName());
    }

    @Test
    public void equals_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.complex.Complex");
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
    public void hashCode_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.complex.Complex");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("hashCode")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method hashCode should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("hashCode", targetMethod.getName());
    }

    @Test
    public void getImaginary_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.complex.Complex");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getImaginary")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getImaginary should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getImaginary", targetMethod.getName());
    }

    @Test
    public void getReal_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.complex.Complex");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getReal")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getReal should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getReal", targetMethod.getName());
    }

    @Test
    public void isNaN_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.complex.Complex");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("isNaN")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method isNaN should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("isNaN", targetMethod.getName());
    }

}
