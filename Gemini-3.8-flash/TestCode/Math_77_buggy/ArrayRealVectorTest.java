package org.apache.commons.math.linear;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for ArrayRealVector.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class ArrayRealVectorTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("ArrayRealVector", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
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
        Class<?> clazz = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
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
        Class<?> clazz = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
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
        Class<?> clazz = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
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
        Class<?> clazz = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
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
    public void mapAddToSelf_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("mapAddToSelf")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method mapAddToSelf should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("mapAddToSelf", targetMethod.getName());
    }

    @Test
    public void mapSubtractToSelf_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("mapSubtractToSelf")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method mapSubtractToSelf should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("mapSubtractToSelf", targetMethod.getName());
    }

    @Test
    public void mapMultiplyToSelf_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("mapMultiplyToSelf")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method mapMultiplyToSelf should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("mapMultiplyToSelf", targetMethod.getName());
    }

    @Test
    public void mapDivideToSelf_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("mapDivideToSelf")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method mapDivideToSelf should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("mapDivideToSelf", targetMethod.getName());
    }

    @Test
    public void mapPowToSelf_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("mapPowToSelf")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method mapPowToSelf should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("mapPowToSelf", targetMethod.getName());
    }

}
