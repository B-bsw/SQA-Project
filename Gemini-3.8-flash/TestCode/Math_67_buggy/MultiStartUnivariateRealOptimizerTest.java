package org.apache.commons.math.optimization;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for MultiStartUnivariateRealOptimizer.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class MultiStartUnivariateRealOptimizerTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("MultiStartUnivariateRealOptimizer", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
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
        Class<?> clazz = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void getFunctionValue_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getFunctionValue")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getFunctionValue should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getFunctionValue", targetMethod.getName());
    }

    @Test
    public void getResult_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getResult")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getResult should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getResult", targetMethod.getName());
    }

    @Test
    public void getAbsoluteAccuracy_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getAbsoluteAccuracy")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getAbsoluteAccuracy should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getAbsoluteAccuracy", targetMethod.getName());
    }

    @Test
    public void getIterationCount_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getIterationCount")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getIterationCount should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getIterationCount", targetMethod.getName());
    }

    @Test
    public void getMaximalIterationCount_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getMaximalIterationCount")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getMaximalIterationCount should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getMaximalIterationCount", targetMethod.getName());
    }

    @Test
    public void getMaxEvaluations_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getMaxEvaluations")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getMaxEvaluations should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getMaxEvaluations", targetMethod.getName());
    }

    @Test
    public void getEvaluations_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getEvaluations")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getEvaluations should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getEvaluations", targetMethod.getName());
    }

    @Test
    public void getRelativeAccuracy_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getRelativeAccuracy")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getRelativeAccuracy should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getRelativeAccuracy", targetMethod.getName());
    }

    @Test
    public void resetAbsoluteAccuracy_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("resetAbsoluteAccuracy")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method resetAbsoluteAccuracy should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("resetAbsoluteAccuracy", targetMethod.getName());
    }

    @Test
    public void resetMaximalIterationCount_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("resetMaximalIterationCount")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method resetMaximalIterationCount should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("resetMaximalIterationCount", targetMethod.getName());
    }

    @Test
    public void resetRelativeAccuracy_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("resetRelativeAccuracy")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method resetRelativeAccuracy should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("resetRelativeAccuracy", targetMethod.getName());
    }

    @Test
    public void setAbsoluteAccuracy_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("setAbsoluteAccuracy")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method setAbsoluteAccuracy should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("setAbsoluteAccuracy", targetMethod.getName());
    }

}
