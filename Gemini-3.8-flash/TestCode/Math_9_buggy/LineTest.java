package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Automated JUnit 4 test suite for Line.
 * Compliant with Java 1.4/7 legacy enterprise environments.
 */
public class LineTest {

    @Test
    public void class_structure_shouldBeLoadableAndValid() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
        Assert.assertNotNull("Class should load successfully", clazz);
        Assert.assertEquals("Line", clazz.getSimpleName());
    }

    @Test
    public void constructor_reflection_shouldInspectConstructors() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
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
        Class<?> clazz = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Assert.assertNotNull("Methods array should not be null", declaredMethods);
        for (int i = 0; i < declaredMethods.length; i++) {
            Method m = declaredMethods[i];
            Assert.assertNotNull(m);
            Assert.assertNotNull(m.getName());
        }
    }

    @Test
    public void reset_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("reset")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method reset should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("reset", targetMethod.getName());
    }

    @Test
    public void revert_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("revert")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method revert should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("revert", targetMethod.getName());
    }

    @Test
    public void getDirection_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getDirection")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getDirection should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getDirection", targetMethod.getName());
    }

    @Test
    public void getOrigin_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getOrigin")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getOrigin should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getOrigin", targetMethod.getName());
    }

    @Test
    public void getAbscissa_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("getAbscissa")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method getAbscissa should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("getAbscissa", targetMethod.getName());
    }

    @Test
    public void pointAt_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("pointAt")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method pointAt should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("pointAt", targetMethod.getName());
    }

    @Test
    public void toSubSpace_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("toSubSpace")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method toSubSpace should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("toSubSpace", targetMethod.getName());
    }

    @Test
    public void toSpace_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("toSpace")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method toSpace should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("toSpace", targetMethod.getName());
    }

    @Test
    public void isSimilarTo_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("isSimilarTo")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method isSimilarTo should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("isSimilarTo", targetMethod.getName());
    }

    @Test
    public void contains_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("contains")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method contains should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("contains", targetMethod.getName());
    }

    @Test
    public void distance_inspection_shouldBePresentAndAccessible() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
        Method targetMethod = null;
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equals("distance")) {
                targetMethod = methods[i];
                break;
            }
        }
        Assert.assertNotNull("Method distance should be declared", targetMethod);
        targetMethod.setAccessible(true);
        Assert.assertEquals("distance", targetMethod.getName());
    }

}
