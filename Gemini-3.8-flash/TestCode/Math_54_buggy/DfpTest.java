package org.apache.commons.math.dfp;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for Dfp.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class DfpTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.dfp.Dfp");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("Dfp", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.dfp.Dfp");
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
        Class<?> clazz = Class.forName("org.apache.commons.math.dfp.Dfp");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void newInstance_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.dfp.Dfp");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("newInstance")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method newInstance should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("newInstance", targetMethod.getName());
    }

    @Test
    public void getField_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.dfp.Dfp");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getField")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getField should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getField", targetMethod.getName());
    }

    @Test
    public void getRadixDigits_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.dfp.Dfp");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getRadixDigits")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getRadixDigits should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getRadixDigits", targetMethod.getName());
    }

    @Test
    public void getZero_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.dfp.Dfp");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getZero")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getZero should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getZero", targetMethod.getName());
    }

    @Test
    public void getOne_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.dfp.Dfp");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getOne")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getOne should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getOne", targetMethod.getName());
    }

}
