package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

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
        Class<?> clazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("CMAESOptimizer", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
        Class<?> clazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
        Class<?> clazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
        Class<?> clazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
        Class<?> clazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
        Class<?> clazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    public void getSigma_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getSigma")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getSigma should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getSigma", targetMethod.getName());
    }

    @Test
    public void getPopulationSize_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getPopulationSize")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getPopulationSize should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getPopulationSize", targetMethod.getName());
    }

    @Test
    public void optimize_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    public void doOptimize_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    public void parseOptimizationData_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("parseOptimizationData")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method parseOptimizationData should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("parseOptimizationData", targetMethod.getName());
    }

    @Test
    public void compareTo_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
        Class<?> clazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
        Class<?> clazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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

}
