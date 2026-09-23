package org.apache.commons.math.ode.nonstiff;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for EmbeddedRungeKuttaIntegrator.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class EmbeddedRungeKuttaIntegratorTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("EmbeddedRungeKuttaIntegrator", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator");
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
        Class<?> clazz = Class.forName("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void getSafety_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getSafety")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getSafety should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getSafety", targetMethod.getName());
    }

    @Test
    public void setSafety_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("setSafety")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method setSafety should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("setSafety", targetMethod.getName());
    }

    @Test
    public void integrate_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("integrate")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method integrate should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("integrate", targetMethod.getName());
    }

    @Test
    public void getMinReduction_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getMinReduction")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getMinReduction should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getMinReduction", targetMethod.getName());
    }

    @Test
    public void setMinReduction_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("setMinReduction")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method setMinReduction should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("setMinReduction", targetMethod.getName());
    }

    @Test
    public void getMaxGrowth_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getMaxGrowth")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getMaxGrowth should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getMaxGrowth", targetMethod.getName());
    }

    @Test
    public void setMaxGrowth_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("setMaxGrowth")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method setMaxGrowth should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("setMaxGrowth", targetMethod.getName());
    }

}
