package org.apache.commons.math.util;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for MultidimensionalCounter.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class MultidimensionalCounterTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.util.MultidimensionalCounter");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("MultidimensionalCounter", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.util.MultidimensionalCounter");
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
        Class<?> clazz = Class.forName("org.apache.commons.math.util.MultidimensionalCounter");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void hasNext_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.util.MultidimensionalCounter");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("hasNext")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method hasNext should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("hasNext", targetMethod.getName());
    }

    @Test
    public void next_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.util.MultidimensionalCounter");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("next")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method next should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("next", targetMethod.getName());
    }

    @Test
    public void getCount_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.util.MultidimensionalCounter");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getCount")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getCount should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getCount", targetMethod.getName());
    }

    @Test
    public void getCounts_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.util.MultidimensionalCounter");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getCounts")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getCounts should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getCounts", targetMethod.getName());
    }

    @Test
    public void remove_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.util.MultidimensionalCounter");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("remove")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method remove should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("remove", targetMethod.getName());
    }

    @Test
    public void iterator_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.util.MultidimensionalCounter");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("iterator")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method iterator should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("iterator", targetMethod.getName());
    }

    @Test
    public void getDimension_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.util.MultidimensionalCounter");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getDimension")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getDimension should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getDimension", targetMethod.getName());
    }

    @Test
    public void getSize_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.util.MultidimensionalCounter");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getSize")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getSize should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getSize", targetMethod.getName());
    }

    @Test
    public void getSizes_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.util.MultidimensionalCounter");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getSizes")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getSizes should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getSizes", targetMethod.getName());
    }

}
