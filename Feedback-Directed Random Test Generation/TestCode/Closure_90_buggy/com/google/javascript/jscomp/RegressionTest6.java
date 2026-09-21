package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("", abstractCompiler1, node2, "((((hi!))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))", abstractCompiler1, node2, "((Not declared as a type name))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((Named type with empty name component)))))))))))", abstractCompiler1, node2, "(((((((((((((((Not declared as a constructor)))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((hi!)))))))))))))))))", abstractCompiler1, node2, "((((((((((((((((((Named type with empty name component))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((Unknown class name)))))))))))))", abstractCompiler1, node2, "((((Not declared as a constructor))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((Unknown class name))))))))))", abstractCompiler1, node2, "((((((((()))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((((((((((((((())))))))))))))))))))))))))))))", abstractCompiler1, node2, "((((((((((()))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((((((((((((()))))))))))))))))))))))))))))", abstractCompiler1, node2, "(((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((Not declared as a constructor))))))))))))))))", abstractCompiler1, node2, "(((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))", abstractCompiler1, node2, "(((((((((hi!)))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((Not declared as a type name))))))))))", abstractCompiler1, node2, "((((((((Named type with empty name component))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((Not declared as a constructor))))))))))))))))))", abstractCompiler1, node2, "((((((((Named type with empty name component))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))", abstractCompiler1, node2, "((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((Named type with empty name component)))))))))))", abstractCompiler1, node2, "((()))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))", abstractCompiler1, node2, "((((((((Not declared as a type name))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((((((Not declared as a type name)))))))))))))))))))))", abstractCompiler1, node2, "((((Not declared as a type name))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((Not declared as a type name))", abstractCompiler1, node2, "(((Unknown class name)))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((hi!)))))))))))))))", abstractCompiler1, node2, "((((((((((((((((((hi!))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((((((((((())))))))))))))))))))))))))", abstractCompiler1, node2, "(((((((((((((((((((((((((((((())))))))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((((((Unknown class name))))))))))))))))))))))", abstractCompiler1, node2, "(((((((((((((((Named type with empty name component)))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))", abstractCompiler1, node2, "(((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((hi!)))))", abstractCompiler1, node2, "((((((((((((((((((((((((((()))))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((hi!))))))))))))", abstractCompiler1, node2, "((((((((Not declared as a type name))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((())))))))))))))", abstractCompiler1, node2, "((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((Not declared as a constructor))))))))))))))))", abstractCompiler1, node2, "((((((((((Not declared as a constructor))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((Named type with empty name component))))))))", abstractCompiler1, node2, "((((((((((((((((((((((((((((()))))))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((((((Unknown class name))))))))))))))))))))))", abstractCompiler1, node2, "((((((((((((Not declared as a constructor))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((Not declared as a type name)))", abstractCompiler1, node2, "(((((((((((((Not declared as a type name)))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("", abstractCompiler1, node2, "((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))))", abstractCompiler1, node2, "((((((((Named type with empty name component))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((Not declared as a type name)))))))))))", abstractCompiler1, node2, "((((((((((((((((((Not declared as a type name))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((())))))))))))", abstractCompiler1, node2, "((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))", abstractCompiler1, node2, "(((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))", abstractCompiler1, node2, "(((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(Not declared as a type name)", abstractCompiler1, node2, "((((((((((((((((((Not declared as a constructor))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((hi!))))))))))))))", abstractCompiler1, node2, "(((((((((((((((((((hi!)))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((((Not declared as a constructor))))))))))))))))))))", abstractCompiler1, node2, "((((Unknown class name))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))", abstractCompiler1, node2, "", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((Not declared as a type name))))))))))))))", abstractCompiler1, node2, "(((((((((hi!)))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((Not declared as a constructor))))))))))))))))", abstractCompiler1, node2, "((((Not declared as a type name))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))", abstractCompiler1, node2, "((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((hi!)))))))))))))))))", abstractCompiler1, node2, "(((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(Not declared as a type name)", abstractCompiler1, node2, "(hi!)", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(hi!)", abstractCompiler1, node2, "(((((((((((((((((Not declared as a type name)))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((((((((())))))))))))))))))))))))", abstractCompiler1, node2, "((((((((((((hi!))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))", abstractCompiler1, node2, "(((((((((((((Not declared as a type name)))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((Not declared as a type name))))", abstractCompiler1, node2, "(((((((((((((Not declared as a constructor)))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((Not declared as a constructor))))))))))))))))))", abstractCompiler1, node2, "((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((((((((((((()))))))))))))))))))))))))))))", abstractCompiler1, node2, "((((((((((((((((((((hi!))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((hi!)))))", abstractCompiler1, node2, "((((((((((((((((((((((((()))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))", abstractCompiler1, node2, "((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((Unknown class name)))", abstractCompiler1, node2, "((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((Not declared as a type name)))))))", abstractCompiler1, node2, "((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((Not declared as a constructor)))))))))))))))", abstractCompiler1, node2, "(((((((((((((((Unknown class name)))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((Not declared as a constructor)))", abstractCompiler1, node2, "(((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((((((Unknown class name)))))))))))))))))))))", abstractCompiler1, node2, "((((((((((((((((((Not declared as a type name))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("((((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(((((((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))))))" + "'", str1, "(((((((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))))))");
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((())))))))))))))))", abstractCompiler1, node2, "((((((((((((((((()))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((hi!))))))))))))", abstractCompiler1, node2, "", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))", abstractCompiler1, node2, "((((((((Not declared as a constructor))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((Not declared as a constructor)))))))))))))))", abstractCompiler1, node2, "((((((((((((((((((Not declared as a type name))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))" + "'", str1, "(((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))");
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("", abstractCompiler1, node2, "(((((((((((((((((((((((((((((())))))))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((Not declared as a constructor)))))))))))", abstractCompiler1, node2, "(((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((hi!))))))))))))))))))", abstractCompiler1, node2, "(((((((((((((((((((((Named type with empty name component)))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((hi!))))))))))))", abstractCompiler1, node2, "((((((((((Named type with empty name component))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((Named type with empty name component))))))))))))))", abstractCompiler1, node2, "(((((Named type with empty name component)))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))", abstractCompiler1, node2, "(((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(Not declared as a type name)", abstractCompiler1, node2, "(((((((((((((((((Unknown class name)))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))", abstractCompiler1, node2, "(((hi!)))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("Named type with empty name component", abstractCompiler1, node2, "((((((((((((Not declared as a constructor))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((Unknown class name)))))))))", abstractCompiler1, node2, "(((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((Not declared as a constructor))))))))))))))))", abstractCompiler1, node2, "((((((((hi!))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))", abstractCompiler1, node2, "(((((((((((((((((Not declared as a constructor)))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((Not declared as a constructor)))))))))))))", abstractCompiler1, node2, "(((((((((((Not declared as a constructor)))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((Not declared as a type name)))))))))))))))))", abstractCompiler1, node2, "(((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((Named type with empty name component))", abstractCompiler1, node2, "((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((Not declared as a constructor)))))))))))))))))", abstractCompiler1, node2, "((((((((((((((((hi!))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((Not declared as a type name))))))))", abstractCompiler1, node2, "(((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((Unknown class name))))))))))))))))", abstractCompiler1, node2, "((((((((((((hi!))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((())))))))))))))", abstractCompiler1, node2, "((((((((((((hi!))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((Unknown class name))))))))))))))))))", abstractCompiler1, node2, "(((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((((((((((((()))))))))))))))))))))))))))))", abstractCompiler1, node2, "((((((((Not declared as a type name))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((Not declared as a type name))))))))", abstractCompiler1, node2, "((((((((((((Unknown class name))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((Unknown class name)))))", abstractCompiler1, node2, "(((((((Named type with empty name component)))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))))", abstractCompiler1, node2, "", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((Named type with empty name component))))))))))))", abstractCompiler1, node2, "((Not declared as a type name))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((Not declared as a type name)))))))))))", abstractCompiler1, node2, "((((((((((((((((((Named type with empty name component))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((Not declared as a constructor)))))))))))))", abstractCompiler1, node2, "(((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((())))))))))))))))", abstractCompiler1, node2, "(((((((((Not declared as a constructor)))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((Named type with empty name component))))))))))))", abstractCompiler1, node2, "((((((((((((()))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((Not declared as a type name)))))))))))", abstractCompiler1, node2, "(((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((hi!))))))))))))", abstractCompiler1, node2, "((((((((((Not declared as a type name))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("((((((((((((((((((((hi!))))))))))))))))))))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(((((((((((((((((((((hi!)))))))))))))))))))))" + "'", str1, "(((((((((((((((((((((hi!)))))))))))))))))))))");
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((hi!))", abstractCompiler1, node2, "(((((((((Unknown class name)))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((Not declared as a type name)))", abstractCompiler1, node2, "(((((((((())))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((()))))", abstractCompiler1, node2, "(((hi!)))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))", abstractCompiler1, node2, "((((hi!))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((Unknown class name))))))))))))", abstractCompiler1, node2, "(((((((((((((((hi!)))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((()))))", abstractCompiler1, node2, "(((((((((((((())))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((Named type with empty name component)))))))))))))))", abstractCompiler1, node2, "(((((((((((((((((((Not declared as a constructor)))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((((Not declared as a constructor)))))))))))))))))))", abstractCompiler1, node2, "((((((((((((()))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((Named type with empty name component))))", abstractCompiler1, node2, "((((((((((((Unknown class name))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((())))))))", abstractCompiler1, node2, "(((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((((Not declared as a constructor)))))))))))))))))))", abstractCompiler1, node2, "((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((((((((((((())))))))))))))))))))))))))))", abstractCompiler1, node2, "(((((((((((((((((((Unknown class name)))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((())))", abstractCompiler1, node2, "(((((((((((((((Named type with empty name component)))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((Unknown class name)))))))))))))))", abstractCompiler1, node2, "((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((Not declared as a type name))))))))))))))", abstractCompiler1, node2, "(((((((((((((((((((((((())))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((Unknown class name)))))))))))))))))", abstractCompiler1, node2, "", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((Named type with empty name component)))))", abstractCompiler1, node2, "((((((((((((((Not declared as a type name))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(Not declared as a type name)", abstractCompiler1, node2, "((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(Unknown class name)", abstractCompiler1, node2, "(((((((((((((((((())))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((hi!))", abstractCompiler1, node2, "((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((((((Unknown class name))))))))))))))))))))))", abstractCompiler1, node2, "((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))", abstractCompiler1, node2, "((((((()))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))))))", abstractCompiler1, node2, "(Not declared as a type name)", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((Not declared as a constructor)))))", abstractCompiler1, node2, "((((((Not declared as a constructor))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((Not declared as a constructor)))))))))))))))))", abstractCompiler1, node2, "((((((((((((((Named type with empty name component))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((Not declared as a type name)))))))))))))", abstractCompiler1, node2, "((((((((((((((((((((Named type with empty name component))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((Unknown class name))))))", abstractCompiler1, node2, "((((((Unknown class name))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((((((Named type with empty name component)))))))))))))))))))))", abstractCompiler1, node2, "Not declared as a constructor", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((Not declared as a constructor)))))))))))))", abstractCompiler1, node2, "(((((((((((((((((((((((())))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((((()))))))))))))))))))))", abstractCompiler1, node2, "(((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((Not declared as a type name))", abstractCompiler1, node2, "((((((((((((((((((((((Unknown class name))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("", abstractCompiler1, node2, "(((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("(((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))" + "'", str1, "((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))");
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))", abstractCompiler1, node2, "(((((hi!)))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((hi!))))))))))))))))", abstractCompiler1, node2, "(((((((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))", abstractCompiler1, node2, "(((((((((((((((((Unknown class name)))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((hi!))", abstractCompiler1, node2, "(((((((((((((((((((Not declared as a constructor)))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))", abstractCompiler1, node2, "(((((((Named type with empty name component)))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))", abstractCompiler1, node2, "(((((((((((((((((((())))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((Named type with empty name component))))))))))", abstractCompiler1, node2, "(((((())))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((Not declared as a constructor)))", abstractCompiler1, node2, "((((((((((((Not declared as a constructor))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((((Not declared as a constructor)))))))))))))))))))", abstractCompiler1, node2, "((((((((((((((((((Not declared as a constructor))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("", abstractCompiler1, node2, "((((Not declared as a type name))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((Not declared as a constructor)))", abstractCompiler1, node2, "((((((((((((((((((((((((((()))))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((hi!))))", abstractCompiler1, node2, "(((((((((())))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((((((((Unknown class name)))))))))))))))))))))))", abstractCompiler1, node2, "(((((((((Not declared as a type name)))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((((((((((((()))))))))))))))))))))))))))))", abstractCompiler1, node2, "((((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(Not declared as a type name)", abstractCompiler1, node2, "((((((((((((((((((((Named type with empty name component))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((Unknown class name)))", abstractCompiler1, node2, "(((((())))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((hi!))))))))))))", abstractCompiler1, node2, "((((((((((((((((((Not declared as a constructor))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((Not declared as a type name))", abstractCompiler1, node2, "((hi!))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((()))))))))))))", abstractCompiler1, node2, "((((((((((Named type with empty name component))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((())))))", abstractCompiler1, node2, "(((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("Named type with empty name component", abstractCompiler1, node2, "(((((((((((((((((Not declared as a type name)))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((((Not declared as a type name))))))))))))))))))))", abstractCompiler1, node2, "Named type with empty name component", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((((((((Unknown class name)))))))))))))))))))))))", abstractCompiler1, node2, "((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((Unknown class name)))))))))))))))", abstractCompiler1, node2, "(Unknown class name)", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("(((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))" + "'", str1, "((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))");
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((()))))))))))))))))))", abstractCompiler1, node2, "(((((((((((((((Unknown class name)))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((((((Unknown class name)))))))))))))))))))))", abstractCompiler1, node2, "(((((((((((((())))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))", abstractCompiler1, node2, "((((((((((((((Unknown class name))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))" + "'", str1, "(((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))");
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((Not declared as a constructor)))", abstractCompiler1, node2, "(((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((Unknown class name))))))))))))", abstractCompiler1, node2, "(((((((((((((((((((Unknown class name)))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((Unknown class name))))))))", abstractCompiler1, node2, "((((Unknown class name))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))", abstractCompiler1, node2, "((((((((((((((((((hi!))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((Not declared as a type name)))))))))))))))", abstractCompiler1, node2, "((((((((((((Not declared as a type name))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((Not declared as a constructor)))))))))))))))", abstractCompiler1, node2, "(((((Unknown class name)))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))", abstractCompiler1, node2, "(((((((((Unknown class name)))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("()", abstractCompiler1, node2, "((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((hi!)))))))))))))))", abstractCompiler1, node2, "((((((((((((((((((((((Unknown class name))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((Not declared as a type name)))))))))))))))))", abstractCompiler1, node2, "Not declared as a type name", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(())", abstractCompiler1, node2, "(((((((((((((((((((hi!)))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((Named type with empty name component)))))))))", abstractCompiler1, node2, "(((((((((((((((((((((((Unknown class name)))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(Not declared as a type name)", abstractCompiler1, node2, "(((((((((((((((((())))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))", abstractCompiler1, node2, "((((((hi!))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((hi!))))", abstractCompiler1, node2, "((((((((((((((((((()))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((((((((((()))))))))))))))))))))))))))", abstractCompiler1, node2, "((((((((((((((((((((Named type with empty name component))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((Not declared as a type name)))))", abstractCompiler1, node2, "(((((((Not declared as a constructor)))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((Named type with empty name component))))))))))))", abstractCompiler1, node2, "(((((((((((((((Named type with empty name component)))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("(((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))" + "'", str1, "((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))");
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((((((((((())))))))))))))))))))))))))", abstractCompiler1, node2, "((((Named type with empty name component))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((hi!))))", abstractCompiler1, node2, "(((((((((((((((())))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(Unknown class name)", abstractCompiler1, node2, "((((((hi!))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))", abstractCompiler1, node2, "(((((((((((((((((((((((())))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))", abstractCompiler1, node2, "((((((((Unknown class name))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((((((((()))))))))))))))))))))))))", abstractCompiler1, node2, "((((((((((((((((Named type with empty name component))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((hi!))))))))))))", abstractCompiler1, node2, "(((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((((((((((((()))))))))))))))))))))))))))))", abstractCompiler1, node2, "(((((((((((hi!)))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))", abstractCompiler1, node2, "(((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("Not declared as a type name", abstractCompiler1, node2, "(((((((((((((((((((((((((((())))))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))", abstractCompiler1, node2, "(((((((((((((((((((((Named type with empty name component)))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("", abstractCompiler1, node2, "((((((((hi!))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))", abstractCompiler1, node2, "((((((((((((((((((Not declared as a type name))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((((((((((()))))))))))))))))))))))))))", abstractCompiler1, node2, "(((((((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(Named type with empty name component)", abstractCompiler1, node2, "((((((((((((((()))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))", abstractCompiler1, node2, "((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((hi!))))))))))))))))", abstractCompiler1, node2, "(((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((Not declared as a type name)))))))))))))))))", abstractCompiler1, node2, "(((((((((Named type with empty name component)))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((Named type with empty name component))))))))))))))", abstractCompiler1, node2, "(Not declared as a constructor)", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(Not declared as a constructor)", abstractCompiler1, node2, "((((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))" + "'", str1, "(((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))");
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(Unknown class name)", abstractCompiler1, node2, "(((((((((((((Named type with empty name component)))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))", abstractCompiler1, node2, "(((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((Unknown class name))))))", abstractCompiler1, node2, "((((((Named type with empty name component))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((Unknown class name)))", abstractCompiler1, node2, "((((((((hi!))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("(((((((((((((((((((((((Unknown class name)))))))))))))))))))))))", abstractCompiler1, node2, "((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))", abstractCompiler1, node2, "(((((((())))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))", abstractCompiler1, node2, "((((((((hi!))))))))", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

