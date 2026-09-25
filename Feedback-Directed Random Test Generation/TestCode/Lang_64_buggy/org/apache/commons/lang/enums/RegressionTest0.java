package org.apache.commons.lang.enums;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum2 = org.apache.commons.lang.enums.ValuedEnum.getEnum(class0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Enum Class must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum2 = org.apache.commons.lang.enums.ValuedEnum.getEnum(class0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Enum Class must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum2 = org.apache.commons.lang.enums.ValuedEnum.getEnum(class0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Enum Class must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum2 = org.apache.commons.lang.enums.ValuedEnum.getEnum(class0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Enum Class must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum2 = org.apache.commons.lang.enums.ValuedEnum.getEnum(class0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Enum Class must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum2 = org.apache.commons.lang.enums.ValuedEnum.getEnum(class0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Enum Class must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum3 = org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Class must be a subclass of Enum");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum3 = org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Class must be a subclass of Enum");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum3 = org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Class must be a subclass of Enum");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum3 = org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Class must be a subclass of Enum");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum3 = org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Class must be a subclass of Enum");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum3 = org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Class must be a subclass of Enum");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum3 = org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Class must be a subclass of Enum");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum3 = org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Class must be a subclass of Enum");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum3 = org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Class must be a subclass of Enum");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum3 = org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Class must be a subclass of Enum");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum3 = org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Class must be a subclass of Enum");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum3 = org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Class must be a subclass of Enum");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum3 = org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Class must be a subclass of Enum");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum3 = org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Class must be a subclass of Enum");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum3 = org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Class must be a subclass of Enum");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum3 = org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Class must be a subclass of Enum");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum3 = org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Class must be a subclass of Enum");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum3 = org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Class must be a subclass of Enum");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum2 = org.apache.commons.lang.enums.ValuedEnum.getEnum(class0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Enum Class must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum3 = org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Class must be a subclass of Enum");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum2 = org.apache.commons.lang.enums.ValuedEnum.getEnum(class0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Enum Class must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum2 = org.apache.commons.lang.enums.ValuedEnum.getEnum(class0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Enum Class must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum2 = org.apache.commons.lang.enums.ValuedEnum.getEnum(class0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Enum Class must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum2 = org.apache.commons.lang.enums.ValuedEnum.getEnum(class0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Enum Class must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum2 = org.apache.commons.lang.enums.ValuedEnum.getEnum(class0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Enum Class must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum2 = org.apache.commons.lang.enums.ValuedEnum.getEnum(class0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Enum Class must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum2 = org.apache.commons.lang.enums.ValuedEnum.getEnum(class0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Enum Class must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum2 = org.apache.commons.lang.enums.ValuedEnum.getEnum(class0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Enum Class must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum2 = org.apache.commons.lang.enums.ValuedEnum.getEnum(class0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Enum Class must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum2 = org.apache.commons.lang.enums.ValuedEnum.getEnum(class0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Enum Class must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum2 = org.apache.commons.lang.enums.ValuedEnum.getEnum(class0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Enum Class must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum2 = org.apache.commons.lang.enums.ValuedEnum.getEnum(class0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Enum Class must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

