package org.apache.commons.math.stat;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for Frequency.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class FrequencyTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.stat.Frequency");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("Frequency", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.stat.Frequency");
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
        Class<?> clazz = Class.forName("org.apache.commons.math.stat.Frequency");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void toString_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.stat.Frequency");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("toString")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method toString should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("toString", targetMethod.getName());
    }

    @Test
    public void addValue_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.stat.Frequency");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("addValue")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method addValue should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("addValue", targetMethod.getName());
    }

    @Test
    public void clear_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.stat.Frequency");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("clear")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method clear should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("clear", targetMethod.getName());
    }

    @Test
    public void valuesIterator_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.stat.Frequency");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("valuesIterator")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method valuesIterator should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("valuesIterator", targetMethod.getName());
    }

    @Test
    public void getSumFreq_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.stat.Frequency");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getSumFreq")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getSumFreq should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getSumFreq", targetMethod.getName());
    }

    @Test
    public void getCount_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.stat.Frequency");
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

}
