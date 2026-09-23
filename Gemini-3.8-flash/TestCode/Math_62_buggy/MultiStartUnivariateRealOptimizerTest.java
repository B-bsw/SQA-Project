package org.apache.commons.math.optimization.univariate;

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
        Class<?> clazz = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("MultiStartUnivariateRealOptimizer", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
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
        Class<?> clazz = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void setConvergenceChecker_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("setConvergenceChecker")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method setConvergenceChecker should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("setConvergenceChecker", targetMethod.getName());
    }

    @Test
    public void getConvergenceChecker_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getConvergenceChecker")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getConvergenceChecker should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getConvergenceChecker", targetMethod.getName());
    }

    @Test
    public void getMaxEvaluations_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
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
        Class<?> clazz = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
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
    public void setMaxEvaluations_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("setMaxEvaluations")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method setMaxEvaluations should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("setMaxEvaluations", targetMethod.getName());
    }

    @Test
    public void getOptima_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getOptima")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getOptima should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getOptima", targetMethod.getName());
    }

    @Test
    public void optimize_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("optimize")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method optimize should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("optimize", targetMethod.getName());
    }

    @Test
    public void compare_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("compare")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method compare should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("compare", targetMethod.getName());
    }

}
