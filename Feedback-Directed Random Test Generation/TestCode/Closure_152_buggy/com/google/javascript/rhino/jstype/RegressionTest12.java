package com.google.javascript.rhino.jstype;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

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
    public void test6001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6001");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((Not declared as a constructor)))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((Named type with empty name component))))))))", node2, arrowType3, objectType4, "((((((((((((Named type with empty name component))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((())))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((Not declared as a constructor)))", node2, arrowType3, objectType4, "((((((((((((((((Not declared as a constructor))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((Unknown class name))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((Unknown class name))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((hi!)))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((Not declared as a type name))))))))))))))))))", node2, arrowType3, objectType4, "(((((((Not declared as a constructor)))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((()))))))))))))))", node2, arrowType3, objectType4, "(((Unknown class name)))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((Not declared as a type name)))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((()))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((Not declared as a constructor)))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((Not declared as a constructor)))))))))))))", node2, arrowType3, objectType4, "(((((((((())))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((Not declared as a type name)))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((Not declared as a constructor))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((Named type with empty name component))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((Unknown class name)))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((Not declared as a type name))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((hi!)))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((Not declared as a constructor)))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((Not declared as a constructor))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((hi!))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((Not declared as a type name))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((()))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((())))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((Not declared as a type name))))))", node2, arrowType3, objectType4, "(((hi!)))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((Named type with empty name component))))))))))))))", node2, arrowType3, objectType4, "(Named type with empty name component)", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((())))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((Not declared as a type name)))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((Not declared as a type name)))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((Not declared as a type name)))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((Not declared as a constructor)))))))", node2, arrowType3, objectType4, "((((((((((((((((((()))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((())))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((()))))))", node2, arrowType3, objectType4, "((Named type with empty name component))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((Unknown class name)))))))))))", node2, arrowType3, objectType4, "(((((((((((((((hi!)))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((())))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((Not declared as a constructor)))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((Not declared as a constructor))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((Not declared as a type name)))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((()))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((Unknown class name)))))", node2, arrowType3, objectType4, "(((((((((((((())))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((Not declared as a type name)))))))))))))", node2, arrowType3, objectType4, "Named type with empty name component", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((Not declared as a constructor))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((Not declared as a type name)))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((Not declared as a constructor)))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("(((((((((((((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))))))))))))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "((((((((((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))))))))))" + "'", str1, "((((((((((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))))))))))");
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((Not declared as a constructor)))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((Unknown class name)))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((()))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(((((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))))" + "'", str1, "(((((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))))");
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((())))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("((((((((((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))))))))))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(((((((((((((((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))))))))))))))" + "'", str1, "(((((((((((((((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))))))))))))))");
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "Named type with empty name component", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((()))))))))", node2, arrowType3, objectType4, "((((((((((((((((()))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "Not declared as a constructor", node2, arrowType3, objectType4, "(((((((((((((((((((((hi!)))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((Not declared as a constructor))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((Unknown class name)))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((Unknown class name))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((())))))))))))))", node2, arrowType3, objectType4, "((((((((((Named type with empty name component))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((Named type with empty name component)))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((Named type with empty name component))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((Named type with empty name component)))))))))))))))))", node2, arrowType3, objectType4, "((Unknown class name))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((Unknown class name))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("(((((((((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))))))))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "((((((((((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))))))))))" + "'", str1, "((((((((((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))))))))))");
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((Not declared as a type name)))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((hi!))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((hi!)))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((())))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("((((((((((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))))))))))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(((((((((((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))))))))))" + "'", str1, "(((((((((((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))))))))))");
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((hi!))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((Named type with empty name component)))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((Not declared as a constructor)))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((Not declared as a constructor))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "((((((((((((((((((((hi!))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((Unknown class name)))))))))))))))))))))))", node2, arrowType3, objectType4, "Not declared as a constructor", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((())))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6095");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((hi!)))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6097");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((Unknown class name))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6098");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6099");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((Named type with empty name component))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((Named type with empty name component))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6101");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((hi!))))))))))))))", node2, arrowType3, objectType4, "()", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6102");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((Not declared as a type name))", node2, arrowType3, objectType4, "(((Not declared as a constructor)))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6103");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((Named type with empty name component)))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((()))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((())))))))))))))))))", node2, arrowType3, objectType4, "((((((((Unknown class name))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6105");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6106");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((hi!))))))))))))", node2, arrowType3, objectType4, "(((((((((hi!)))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6107");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((Not declared as a type name)))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((()))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((hi!)))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6110");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((Named type with empty name component))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6111");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "()", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6112");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "(((((((Unknown class name)))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((Named type with empty name component))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6114");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((Unknown class name))))))))", node2, arrowType3, objectType4, "((((((((Unknown class name))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6116");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6117");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6118");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6119");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((Named type with empty name component)))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6120");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6121");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((hi!))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((Named type with empty name component)))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6122");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((Not declared as a constructor))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6124");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((Unknown class name))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6125");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((Named type with empty name component))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6126");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6127");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType3 = com.google.javascript.rhino.jstype.FunctionType.forInterface(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))))))))))", node2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6128");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((Unknown class name))))))", node2, arrowType3, objectType4, "((((((Not declared as a type name))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6129");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6130");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6131");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((hi!))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((Named type with empty name component)))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6132");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6133");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6135");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((Unknown class name))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6136");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((Unknown class name))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6137");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((Unknown class name))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6138");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((hi!))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6139");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((Named type with empty name component)))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6140");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6141");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((Not declared as a constructor))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6142");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((())))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6143");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6144");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((Not declared as a type name)))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((Not declared as a constructor)))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6146");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((Unknown class name))", node2, arrowType3, objectType4, "", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6147");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6148");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((Not declared as a type name))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "(Not declared as a constructor)", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6150");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((())))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6151");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((hi!))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6153");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6154");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("(((((((((((((((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))))))))))))))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "((((((((((((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))))))))))))" + "'", str1, "((((((((((((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))))))))))))");
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6155");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((hi!))))))", node2, arrowType3, objectType4, "((((((((((((((((Not declared as a constructor))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6156");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((Unknown class name))))))))", node2, arrowType3, objectType4, "((((((((((((((((Not declared as a type name))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6157");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((Not declared as a constructor)))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6158");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6159");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6160");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((hi!))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6161");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((())))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6162");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((()))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6163");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((hi!))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6164");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6165");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((Not declared as a type name)))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6166");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6167");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6168");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6169");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((())))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((Unknown class name)))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6170");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6171");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((Unknown class name))))))))))))))))))))))", node2, arrowType3, objectType4, "Not declared as a constructor", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6172");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((Not declared as a constructor))))))))))", node2, arrowType3, objectType4, "((((((((((((Not declared as a type name))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6173");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType3 = com.google.javascript.rhino.jstype.FunctionType.forInterface(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))))))))))))", node2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6174");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((Unknown class name))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6175");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((hi!)))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6176");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((Not declared as a type name)))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6177");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((Unknown class name))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6178");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "(((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6179");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6180");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "(((((((((((((((((((((())))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6181");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6182");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((hi!)))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6183");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((())))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6184");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((hi!)))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6185");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((Named type with empty name component)))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6186");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((Unknown class name)))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6187");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6188");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((hi!)))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6189");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((Not declared as a constructor))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((hi!)))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6190");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6191");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6192");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((Not declared as a type name))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6193");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((hi!)))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((Not declared as a type name))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6194");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((Named type with empty name component)))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6195");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((()))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6196");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6197");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((Unknown class name))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6198");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6199");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((hi!))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6200");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "Named type with empty name component", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6201");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((()))))", node2, arrowType3, objectType4, "(((((((((((((((hi!)))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6202");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((()))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6203");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "((((((((((((((Not declared as a constructor))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6204");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((()))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((Unknown class name))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6205");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((Unknown class name)))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6206");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6207");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((hi!))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6208");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(Named type with empty name component)", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6209");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((Not declared as a type name))))))", node2, arrowType3, objectType4, "(Named type with empty name component)", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6210");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((Not declared as a constructor)))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6211");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6212");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6213");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((Not declared as a constructor))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6214");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((Not declared as a type name))))))))))))))))", node2, arrowType3, objectType4, "", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6215");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6216");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((())))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6217");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((()))))))))", node2, arrowType3, objectType4, "(())", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6218");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6219");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6220");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6221");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6222");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "(((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6223");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((Unknown class name)))))", node2, arrowType3, objectType4, "(((((((Not declared as a constructor)))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6224");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((())))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((())))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6225");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6226");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((Unknown class name))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6227");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType3 = com.google.javascript.rhino.jstype.FunctionType.forInterface(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))", node2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6228");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((Not declared as a constructor)))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((hi!)))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6229");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType3 = com.google.javascript.rhino.jstype.FunctionType.forInterface(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))))", node2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6230");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6231");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((Not declared as a type name))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6232");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((Not declared as a constructor))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((Not declared as a constructor)))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6233");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6234");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6235");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((hi!)))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6236");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((Not declared as a type name)))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6237");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((()))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6238");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((Named type with empty name component)))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((())))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6239");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((hi!))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6240");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((Not declared as a constructor)))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6241");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((Not declared as a constructor))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((Named type with empty name component)))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6242");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6243");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6244");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(Not declared as a constructor)", node2, arrowType3, objectType4, "((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6245");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((Not declared as a type name))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((())))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6246");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((hi!))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6247");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((())))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6248");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(Not declared as a constructor)", node2, arrowType3, objectType4, "((Named type with empty name component))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6249");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((Unknown class name)))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6250");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((Named type with empty name component)))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6251");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((Not declared as a type name))))))))))))", node2, arrowType3, objectType4, "(((((((((((Named type with empty name component)))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6252");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((hi!)))))))))", node2, arrowType3, objectType4, "((((((((((Not declared as a constructor))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6253");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((())))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6254");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6255");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((()))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((Named type with empty name component)))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6256");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((Named type with empty name component)))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((Unknown class name))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6257");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((())))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6258");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((hi!)))))", node2, arrowType3, objectType4, "((Not declared as a constructor))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6259");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((Not declared as a constructor)))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6260");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((()))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6261");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6262");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((Named type with empty name component)))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6263");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((Unknown class name)))))))))", node2, arrowType3, objectType4, "", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6264");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((hi!)))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6265");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6266");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6267");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6268");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6269");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "(((((((((((((((((((((((Unknown class name)))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6270");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6271");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6272");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((())))))))))", node2, arrowType3, objectType4, "((((Not declared as a type name))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6273");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((hi!))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6274");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((Unknown class name))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6275");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((Not declared as a constructor)))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6276");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((Not declared as a constructor))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6277");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((Named type with empty name component))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6278");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((Named type with empty name component))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6279");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6280");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((())))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6281");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((Named type with empty name component)))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((Named type with empty name component)))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6282");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6283");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((Not declared as a constructor)))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6284");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((hi!)))))", node2, arrowType3, objectType4, "(((((((((((Not declared as a type name)))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6285");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((()))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6286");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6287");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((())))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6288");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((Unknown class name))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6289");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((Not declared as a type name))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6290");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((Not declared as a constructor))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6291");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((Unknown class name)))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6292");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6293");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((hi!)))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6294");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((hi!)))))))))))))))))))))", node2, arrowType3, objectType4, "", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6295");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((())))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6296");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType3 = com.google.javascript.rhino.jstype.FunctionType.forInterface(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))))))))", node2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6297");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((hi!))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6298");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6299");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6300");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((Unknown class name))))))))))))))", node2, arrowType3, objectType4, "", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6301");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6302");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((()))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6303");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6304");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((hi!))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6305");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6306");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((())))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6307");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((()))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6308");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((Named type with empty name component))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6309");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((()))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6310");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((Unknown class name))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((())))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6311");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(Not declared as a constructor)", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6312");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((Named type with empty name component))))))))))))))", node2, arrowType3, objectType4, "(((Not declared as a type name)))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6313");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((Named type with empty name component))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6314");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((hi!))))))))))))))))))))", node2, arrowType3, objectType4, "(((((Named type with empty name component)))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6315");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6316");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6317");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6318");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((())))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6319");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(Named type with empty name component)", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6320");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((Named type with empty name component)))))))))))", node2, arrowType3, objectType4, "(((((Unknown class name)))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6321");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((hi!))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6322");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((Not declared as a type name)))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((())))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6323");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((hi!)))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6324");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6325");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6326");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("(((((((((((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))))))))))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "((((((((((((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))))))))))))" + "'", str1, "((((((((((((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))))))))))))");
    }

    @Test
    public void test6327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6327");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6328");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6329");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((hi!)))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6330");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "Not declared as a constructor", node2, arrowType3, objectType4, "((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6331");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6332");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((Named type with empty name component))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6333");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6334");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((hi!)))))))))))))))))", node2, arrowType3, objectType4, "((((((((Named type with empty name component))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6335");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((Unknown class name))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6336");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((Not declared as a constructor)))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6337");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((Unknown class name)))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6338");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((Named type with empty name component)))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6339");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "Named type with empty name component", node2, arrowType3, objectType4, "((((((Not declared as a type name))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6340");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(hi!)", node2, arrowType3, objectType4, "((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6341");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((hi!)))))))))))))))))))))))", node2, arrowType3, objectType4, "", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6342");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))", node2, arrowType3, objectType4, "(((((hi!)))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6343");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((()))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((hi!)))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6344");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((Named type with empty name component)))))))))))))))))))))", node2, arrowType3, objectType4, "(((Unknown class name)))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6345");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((Not declared as a type name))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((()))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6346");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((Named type with empty name component)))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6347");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((())))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((hi!))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6348");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((Unknown class name)))))))))))))))))))))", node2, arrowType3, objectType4, "(((((Not declared as a type name)))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6349");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6350");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6351");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6352");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((Not declared as a constructor)))", node2, arrowType3, objectType4, "((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6353");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((hi!)))))))))))))", node2, arrowType3, objectType4, "(((((((((Not declared as a constructor)))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6354");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(Unknown class name)", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6355");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6356");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((Unknown class name))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6357");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((Not declared as a constructor))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6358");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((Unknown class name))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6359");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((hi!)))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((hi!)))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6360");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6361");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((())))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6362");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("(((((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "((((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))))" + "'", str1, "((((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))))");
    }

    @Test
    public void test6363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6363");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((Named type with empty name component)))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6364");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((Not declared as a type name))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6365");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((())))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6366");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((Unknown class name))", node2, arrowType3, objectType4, "((((((((((((((Not declared as a type name))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6367");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((Unknown class name)))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6368");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((Unknown class name)))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6369");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6370");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6371");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((()))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((hi!))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6372");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((Named type with empty name component)))))))))))))))))))))", node2, arrowType3, objectType4, "(((Not declared as a type name)))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6373");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((()))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6374");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((Named type with empty name component))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6375");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6376");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((hi!)))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6377");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6378");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType3 = com.google.javascript.rhino.jstype.FunctionType.forInterface(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))))))))))))", node2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6379");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((Not declared as a type name)))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6380");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((Unknown class name)))))))))))))))", node2, arrowType3, objectType4, "((((((((Not declared as a constructor))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6381");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((Not declared as a constructor))", node2, arrowType3, objectType4, "(((((((((((())))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6382");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((hi!))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6383");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((())))))))))))))))))", node2, arrowType3, objectType4, "((Not declared as a type name))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6384");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((()))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6385");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((Not declared as a constructor)))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6386");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((Not declared as a type name))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((Unknown class name)))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6387");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(Not declared as a type name)", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6388");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((Unknown class name))))))))))))", node2, arrowType3, objectType4, "(((((Not declared as a constructor)))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6389");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6390");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6391");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6392");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6393");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6394");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6395");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "Not declared as a type name", node2, arrowType3, objectType4, "()", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6396");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "Not declared as a type name", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6397");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((Not declared as a constructor)))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6398");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((hi!)))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6399");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((Unknown class name))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6400");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((Named type with empty name component))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6401");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "Unknown class name", node2, arrowType3, objectType4, "(Not declared as a constructor)", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6402");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((Unknown class name))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6403");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((Unknown class name)))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6404");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((Unknown class name)))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6405");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "Not declared as a type name", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6406");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((Unknown class name)))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6407");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6408");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "(((((Unknown class name)))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6409");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((Unknown class name))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((hi!)))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6410");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))", node2, arrowType3, objectType4, "((((()))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6411");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((())))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6412");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((Unknown class name))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6413");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6414");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((Unknown class name)))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6415");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType3 = com.google.javascript.rhino.jstype.FunctionType.forInterface(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))))))))))))))", node2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6416");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((())))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((Named type with empty name component))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6417");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((())))))", node2, arrowType3, objectType4, "(((Named type with empty name component)))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6418");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6419");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((Not declared as a constructor)))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6420");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "(((((((((((((Not declared as a constructor)))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6421");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((hi!)))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6422");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(Unknown class name)", node2, arrowType3, objectType4, "(((((((((Unknown class name)))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6423");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6424");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6425");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6426");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6427");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((()))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6428");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(hi!)", node2, arrowType3, objectType4, "((((((((((((((hi!))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6429");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((())))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6430");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((()))))))))))))))))))))))))", node2, arrowType3, objectType4, "", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6431");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6432");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((Unknown class name))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6433");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((Not declared as a constructor)))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6434");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((())))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((())))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6435");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "()", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6436");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((Unknown class name)))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6437");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6438");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((Unknown class name)))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6439");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((Unknown class name)))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6440");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((()))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((())))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6441");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((hi!)))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6442");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((Not declared as a type name)))))))))", node2, arrowType3, objectType4, "(((((((((((())))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6443");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((Named type with empty name component)))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6444");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((hi!))))", node2, arrowType3, objectType4, "((((((((((()))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6445");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6446");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((hi!))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6447");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((())))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6448");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((Not declared as a constructor))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6449");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((Unknown class name)))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6450");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((hi!))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6451");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6452");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((Not declared as a type name))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6453");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6454");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((Not declared as a type name))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6455");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6456");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6457");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((hi!)))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6458");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((Unknown class name))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6459");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((())))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6460");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6461");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((hi!)))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((())))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6462");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((Named type with empty name component))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((Named type with empty name component)))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6463");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((Named type with empty name component)))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6464");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((Not declared as a type name)))))))))", node2, arrowType3, objectType4, "(((((((((((((Not declared as a constructor)))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6465");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((()))))", node2, arrowType3, objectType4, "(((((Not declared as a constructor)))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6466");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((Not declared as a constructor)))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6467");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6468");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((Not declared as a constructor)))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((Not declared as a type name))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6469");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6470");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((Not declared as a constructor)))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6471");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((Not declared as a type name))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6472");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((Unknown class name)))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6473");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((Not declared as a constructor))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6474");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((()))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6475");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("(((((((((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))))))))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "((((((((((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))))))))))" + "'", str1, "((((((((((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))))))))))");
    }

    @Test
    public void test6476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6476");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((Unknown class name))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6477");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((Unknown class name)))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6478");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((()))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((Unknown class name))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

