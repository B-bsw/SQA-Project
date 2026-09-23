package org.apache.commons.math3.optimization.direct;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for CMAESOptimizer.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class CMAESOptimizerTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("CMAESOptimizer", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
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
        Class<?> clazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void getStatisticsSigmaHistory_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getStatisticsSigmaHistory")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getStatisticsSigmaHistory should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getStatisticsSigmaHistory", targetMethod.getName());
    }

    @Test
    public void getStatisticsMeanHistory_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getStatisticsMeanHistory")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getStatisticsMeanHistory should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getStatisticsMeanHistory", targetMethod.getName());
    }

    @Test
    public void getStatisticsFitnessHistory_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getStatisticsFitnessHistory")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getStatisticsFitnessHistory should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getStatisticsFitnessHistory", targetMethod.getName());
    }

    @Test
    public void getStatisticsDHistory_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getStatisticsDHistory")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getStatisticsDHistory should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getStatisticsDHistory", targetMethod.getName());
    }

    @Test
    public void doOptimize_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("doOptimize")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method doOptimize should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("doOptimize", targetMethod.getName());
    }

    @Test
    public void compareTo_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("compareTo")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method compareTo should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("compareTo", targetMethod.getName());
    }

    @Test
    public void equals_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
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
        Class<?> clazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
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
    public void encode_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("encode")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method encode should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("encode", targetMethod.getName());
    }

    @Test
    public void repairAndDecode_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("repairAndDecode")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method repairAndDecode should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("repairAndDecode", targetMethod.getName());
    }

    @Test
    public void decode_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("decode")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method decode should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("decode", targetMethod.getName());
    }

    @Test
    public void value_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("value")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method value should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("value", targetMethod.getName());
    }

}
