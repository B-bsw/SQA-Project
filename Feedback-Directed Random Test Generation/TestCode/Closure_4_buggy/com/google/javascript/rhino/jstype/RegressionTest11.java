package com.google.javascript.rhino.jstype;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

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
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((Not declared as a type name))))", "(((((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))))", (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((Unknown class name)))))))))))))))", "(((((((((((Unknown class name)))))))))))", (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((Unknown class name)))))))))", "((((((((((((((((((((Unknown class name))))))))))))))))))))", (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((())))))))))))", "(((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))", 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((())))))))))))))))))))))))))))", "()", (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((Named type with empty name component)))))))))))))))", "(((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))", (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((()))))))))))))))))))))))))))))", "(((((((((Not declared as a type name)))))))))", (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))", "(((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))", (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))))))", "((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))", 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))", "(((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))", (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))", "(((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))", (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))", "(Unknown class name)", (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "", "(((((((((((((((((Named type with empty name component)))))))))))))))))", 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((Not declared as a type name))))", "(((((((())))))))", (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((Not declared as a type name))))))))))", "(((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))", (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))", "(((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))", (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("(((((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))" + "'", str1, "((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))");
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((hi!))))))))))))))", "(((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))", (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(Not declared as a constructor)", "(((((((((((((((Not declared as a constructor)))))))))))))))", (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((Named type with empty name component))))))))))))))", "(((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))", (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))", "((((((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))))))", 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))", "(((((((((Not declared as a type name)))))))))", 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((Unknown class name))))))))", "((((((((Named type with empty name component))))))))", 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((hi!)))))))))))))))))))))))", "", (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((hi!)))", "(((((((((((((((((((((((((hi!)))))))))))))))))))))))))", (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((hi!))))))))))))))))))))))", "(((((())))))", (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))", "((((((((((((((((Not declared as a type name))))))))))))))))", (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((hi!)))))))))))))))))))))", "((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))", (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))))))", "((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))", (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((hi!))))))))))))", "((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))", (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))", "(((((((((((((((((((())))))))))))))))))))", (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((Not declared as a constructor))))))))))))))))))))", "((((((((((((((((((()))))))))))))))))))", (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((Named type with empty name component))))))", "(((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))", 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((()))))))))", "((((((((((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))))))))))", 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))", "(((((((Not declared as a type name)))))))", (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))))))))))", "((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))", (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))", "((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))", (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))", "(((((((((((((((((((hi!)))))))))))))))))))", (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((Not declared as a type name)))))))))", "(((((((((((((((())))))))))))))))", (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("(((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))" + "'", str1, "((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))");
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((hi!)))", "(((((((((((((((((((Not declared as a type name)))))))))))))))))))", (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((Unknown class name))))))))", "(((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))", (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))", "((((((((((((((((((((((((((()))))))))))))))))))))))))))", 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((Not declared as a constructor)))))))))))))))", "(((Unknown class name)))", (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((())))))))))))))))))))))))))))))", "((((((((((((hi!))))))))))))", (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "", "((((Named type with empty name component))))", (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((hi!))))))))))))))))))))))", "((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))", (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((()))))))))", "((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))", (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((hi!)))))))))))))))))))))", "", (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))", "(((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))", (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((Named type with empty name component))))))))))))))))))", "((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))", (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((())))))))))))))", "((((((((((((((Not declared as a constructor))))))))))))))", (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))))))", "((((((Unknown class name))))))", (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))", "((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))", (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((()))))))))))))))))))))))))))))", "(((((((((((((Not declared as a type name)))))))))))))", (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))", "((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))", (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((hi!))))))))))))))))))))))))))", "((((((((((((((((((((((hi!))))))))))))))))))))))", (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((hi!))))))))))", "((((((((((Not declared as a type name))))))))))", 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))", "((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))", (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((Named type with empty name component))))))))))", "(((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))", (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(hi!)", "(((((((((((((((((((((((((())))))))))))))))))))))))))", (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((hi!))))))))", "((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))", (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))", "((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))", (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((())))))", "(((((((((Not declared as a type name)))))))))", 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))", "((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))", 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((Named type with empty name component)))))))))))))))))))))", "((((((((((((((((((((()))))))))))))))))))))", (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "", "((((((((((((Unknown class name))))))))))))", (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))", "Unknown class name", (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))", "((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))", (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((Not declared as a type name))))))))))))))))))", "", (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))", "(((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))", (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((Not declared as a constructor)))))))))))))))))", "((((((((()))))))))", (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((hi!))))))))", "((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))", 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((hi!)))))))))))))))))", "((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))", (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((Not declared as a type name)))", "", (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))", "(((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))", 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))", "((((((((((((((((((((Not declared as a constructor))))))))))))))))))))", (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))", "((hi!))", 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))", "(((((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))))", (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((()))))))))))))", "(((((((((((((Named type with empty name component)))))))))))))", (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("(((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))" + "'", str1, "((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))");
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("(((((((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))))))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "((((((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))))))" + "'", str1, "((((((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))))))");
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((hi!)))))))))))))))))))", "(((((((((((((((((Named type with empty name component)))))))))))))))))", 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((hi!)))))))))))))))", "(((((((((((Named type with empty name component)))))))))))", (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(((((((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))))))" + "'", str1, "(((((((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))))))");
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((Named type with empty name component))))", "(((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))", (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((Named type with empty name component))))))))", "((((((((((((((((((Named type with empty name component))))))))))))))))))", (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))", "((((((((((((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))))))))))))", (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))))", "((((((Not declared as a constructor))))))", (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((Not declared as a constructor)))))))))))))))", "((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))", (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))", "(((((Named type with empty name component)))))", (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))", "((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))", (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "", "((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))", (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((Unknown class name)))))))))))))))))))", "((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))", (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((()))))))))))", "(((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))", (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((Not declared as a constructor))))))))))))))", "(((((((((((((((Unknown class name)))))))))))))))", 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((Not declared as a type name))))))", "(((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))", (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((Not declared as a constructor))))))))))))))))))", "((((((((((((((((((((((((((((()))))))))))))))))))))))))))))", (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))", "", (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((Not declared as a constructor)))))))))))))", "((((((((((((((((((((((()))))))))))))))))))))))", (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((()))))))))", "(((((((((((hi!)))))))))))", 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((hi!)))))))))))))))))))))", "((((((((hi!))))))))", (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))", "((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))", (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((Named type with empty name component)))))))", "((((((((((((((hi!))))))))))))))", 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))", "(((((((Named type with empty name component)))))))", (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "", "((((((((((((((Unknown class name))))))))))))))", (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))", "(((Not declared as a constructor)))", (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((hi!)))))))))))))", "((((((((((()))))))))))", (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((Not declared as a type name))))))))", "(((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))", 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((Named type with empty name component)))", "(Not declared as a constructor)", (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((Unknown class name))))))))))))))", "((((((((((((((((((((((Unknown class name))))))))))))))))))))))", (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((Unknown class name))))))))))))))))))", "((((((((((((((((((Not declared as a type name))))))))))))))))))", (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))", "((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))", (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((()))))))))))))))))))))))))))", "((((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))))", (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((Unknown class name)))))))))))))))))))))", "(((((((((((((((((((((((())))))))))))))))))))))))", (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))", "(((((((((((((Not declared as a type name)))))))))))))", (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))", "((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))", (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))))))", "((((((((((hi!))))))))))", 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((Unknown class name))))))))))))))))))))))", "((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))", (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((Unknown class name))))))))))))", "((((((((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))))))))", (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))", "(((hi!)))", (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))))))", "(((((((((((((((((Not declared as a type name)))))))))))))))))", 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))", "(((((((((((((())))))))))))))", 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((Named type with empty name component)))))))))))))))))))", "", (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((Named type with empty name component)))))))))))))))))))", "(((((((((((Not declared as a type name)))))))))))", 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((()))))))))))))", "(((((((((((((((Not declared as a type name)))))))))))))))", 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((Not declared as a constructor)))))))))))", "Named type with empty name component", (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))", "((((((((((()))))))))))", (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((()))", "((((((Named type with empty name component))))))", (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((()))", "(((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))", 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((()))))))))))", "((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))", (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((Unknown class name)))))))))))))))))))", "(((((((((((((((((((((hi!)))))))))))))))))))))", 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))", "((((((((((((hi!))))))))))))", (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((Not declared as a type name))))))", "(((((((((Unknown class name)))))))))", 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))))))", "(((((Not declared as a constructor)))))", 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((hi!))))", "((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))", (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))))))", "((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))", (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))))))", "((hi!))", (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "Named type with empty name component", "((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))", 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(Unknown class name)", "((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))", (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((Not declared as a constructor)))))))))))", "(((((((((hi!)))))))))", (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))", "(((((((())))))))", (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))", "(((((Not declared as a constructor)))))", (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))", "(((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))", (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))", "((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))", 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))", "(((((((((hi!)))))))))", 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))", "(((((((((((((((((((((((((((())))))))))))))))))))))))))))", 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((Unknown class name)))))))))))))))))))", "((((((((((((((((((((((((((()))))))))))))))))))))))))))", (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("((((((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))))))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(((((((((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))))))))" + "'", str1, "(((((((((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))))))))");
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((Not declared as a constructor)))))))))))))))))", "((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))", (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))", "(((())))", 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((Named type with empty name component)))", "((((((Unknown class name))))))", (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((()))))))))))))))))))))))))))", "(((((((Named type with empty name component)))))))", (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))", "(((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))", 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "()", "(((((((((((Named type with empty name component)))))))))))", 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(hi!)", "(((((((((((((Named type with empty name component)))))))))))))", (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))", "(((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))", 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((())))))))))))))))))))))))))))", "(((((((Named type with empty name component)))))))", (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))", "(((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))", 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))", "((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))", (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((()))))))))))))))))))", "((((((((Unknown class name))))))))", (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((hi!))))))))))))))))", "(((((((((((((((hi!)))))))))))))))", (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((()))))))))))))))))))))))))", "", 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((Named type with empty name component)))))))))))))))))", "(((((((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))))))", 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))", "(((((((((((((((((Not declared as a type name)))))))))))))))))", (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))", "(((((((((((((((((((((((((((())))))))))))))))))))))))))))", (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((Not declared as a constructor))))))))", "(((((((Not declared as a type name)))))))", 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))))))))))", "(((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))", 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((Unknown class name))))))))))))))))))", "(((((((((((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))))))))))", (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((()))))))))))))))))))))", "((((((((((((hi!))))))))))))", (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))))", "(((((((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))))))", (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((Named type with empty name component))", "(((((((((((())))))))))))", 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))", "(((((((((((((((((((((Not declared as a type name)))))))))))))))))))))", (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((hi!))))))))", "((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))", (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))", "(((((((((((((((Not declared as a type name)))))))))))))))", (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "", "(((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))", (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((Unknown class name))", "(((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))", (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((())))))))))))))))))", "((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))", (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((Named type with empty name component)))))))))))))", "((((((((((Unknown class name))))))))))", 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((Unknown class name)))))))))", "(((((((((((((((((((((hi!)))))))))))))))))))))", 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))", "(((((((((((((Not declared as a constructor)))))))))))))", 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((())))))", "((((((((((((((Not declared as a constructor))))))))))))))", (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((hi!)))))", "(((((((((((((((Not declared as a constructor)))))))))))))))", 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))))))", "(((((((((((((((Unknown class name)))))))))))))))", (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))", "((((((((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))))))))", (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))", "", (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((Named type with empty name component)))))))))", "((((((((((((((((((Named type with empty name component))))))))))))))))))", (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))", "((((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))))", 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((Not declared as a type name)))", "((((((Named type with empty name component))))))", (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((hi!)))))))))))))))", "((((((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))))))", (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((Not declared as a constructor))))))))))))))", "((((((((((Not declared as a constructor))))))))))", (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((())))))", "(((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))", (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))", "(((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))", 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((())))))))))))))))))))))", "(((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))", (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((())))))", "(((((((hi!)))))))", 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((()))))))))))))))))))", "((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))", (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((Named type with empty name component)))))))))", "(((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))", 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((Not declared as a type name)))))))))))))))))", "(((((((((((((((((((((((())))))))))))))))))))))))", (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))", "(((((((((((((((((((Named type with empty name component)))))))))))))))))))", (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))))))))", "(((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))", (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))", "((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))", 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((Unknown class name))))))))", "(Unknown class name)", (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))", "(((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))", (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((hi!))))))))", "((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))", (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((Not declared as a constructor))", "((((((((((((((Unknown class name))))))))))))))", (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((Named type with empty name component))))))))))", "(((Unknown class name)))", (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((()))", "(((((((((((((((((Not declared as a constructor)))))))))))))))))", 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "", "((((((((((Unknown class name))))))))))", (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((())))))", "(((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))", 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "", "((((((hi!))))))", (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))))))))))))", "((((((((((Not declared as a type name))))))))))", 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))", "((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))", (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

