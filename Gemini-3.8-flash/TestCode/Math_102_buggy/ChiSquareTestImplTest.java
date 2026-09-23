package org.apache.commons.math.stat.inference;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for ChiSquareTestImpl.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class ChiSquareTestImplTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("ChiSquareTestImpl", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
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
        Class<?> clazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void chiSquare_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("chiSquare")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method chiSquare should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("chiSquare", targetMethod.getName());
    }

    @Test
    public void chiSquareTest_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("chiSquareTest")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method chiSquareTest should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("chiSquareTest", targetMethod.getName());
    }

    @Test
    public void chiSquareDataSetsComparison_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("chiSquareDataSetsComparison")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method chiSquareDataSetsComparison should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("chiSquareDataSetsComparison", targetMethod.getName());
    }

    @Test
    public void chiSquareTestDataSetsComparison_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("chiSquareTestDataSetsComparison")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method chiSquareTestDataSetsComparison should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("chiSquareTestDataSetsComparison", targetMethod.getName());
    }

    @Test
    public void getDistributionFactory_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getDistributionFactory")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getDistributionFactory should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getDistributionFactory", targetMethod.getName());
    }

    @Test
    public void setDistribution_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("setDistribution")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method setDistribution should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("setDistribution", targetMethod.getName());
    }

}
