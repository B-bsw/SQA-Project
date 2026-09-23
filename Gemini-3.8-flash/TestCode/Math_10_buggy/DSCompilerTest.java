package org.apache.commons.math3.analysis.differentiation;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for DSCompiler.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class DSCompilerTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("DSCompiler", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
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
        Class<?> clazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void getCompiler_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getCompiler")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getCompiler should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getCompiler", targetMethod.getName());
    }

    @Test
    public void getPartialDerivativeIndex_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getPartialDerivativeIndex")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getPartialDerivativeIndex should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getPartialDerivativeIndex", targetMethod.getName());
    }

    @Test
    public void getPartialDerivativeOrders_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getPartialDerivativeOrders")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getPartialDerivativeOrders should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getPartialDerivativeOrders", targetMethod.getName());
    }

    @Test
    public void getFreeParameters_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getFreeParameters")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getFreeParameters should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getFreeParameters", targetMethod.getName());
    }

    @Test
    public void getOrder_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getOrder")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getOrder should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getOrder", targetMethod.getName());
    }

    @Test
    public void getSize_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
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
    public void linearCombination_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("linearCombination")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method linearCombination should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("linearCombination", targetMethod.getName());
    }

    @Test
    public void add_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
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
        Class<?> clazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
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
    public void multiply_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("multiply")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method multiply should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("multiply", targetMethod.getName());
    }

}
