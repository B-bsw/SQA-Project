package org.apache.commons.math.analysis;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for BrentSolver.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class BrentSolverTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.analysis.BrentSolver");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("BrentSolver", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.analysis.BrentSolver");
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
        Class<?> clazz = Class.forName("org.apache.commons.math.analysis.BrentSolver");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void solve_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math.analysis.BrentSolver");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("solve")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method solve should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("solve", targetMethod.getName());
    }

}
