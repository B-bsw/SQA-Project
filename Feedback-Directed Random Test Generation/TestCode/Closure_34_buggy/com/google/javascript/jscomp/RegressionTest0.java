package com.google.javascript.jscomp;

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        com.google.javascript.jscomp.CodePrinter.Format format0 = com.google.javascript.jscomp.CodePrinter.Format.COMPACT;
        org.junit.Assert.assertTrue("'" + format0 + "' != '" + com.google.javascript.jscomp.CodePrinter.Format.COMPACT + "'", format0.equals(com.google.javascript.jscomp.CodePrinter.Format.COMPACT));
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = builder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.google.javascript.jscomp.CodePrinter.Format format0 = com.google.javascript.jscomp.CodePrinter.Format.TYPED;
        org.junit.Assert.assertTrue("'" + format0 + "' != '" + com.google.javascript.jscomp.CodePrinter.Format.TYPED + "'", format0.equals(com.google.javascript.jscomp.CodePrinter.Format.TYPED));
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.lang.String str0 = com.google.javascript.jscomp.CodePrinter.PrettyCodePrinter.INDENT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "  " + "'", str0, "  ");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6, true);
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("  ", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/  /" + "'", str2, "/  /");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node3, context4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/  /");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"  \"" + "'", str1, "\"  \"");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\"" + "'", str1, "\"\"");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node10, context11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node8, context9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"  \"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node6, false, context8);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        int int0 = com.google.javascript.jscomp.CodePrinter.DEFAULT_LINE_LENGTH_THRESHOLD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 500 + "'", int0 == 500);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"  \"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setSourceMapDetailLevel(detailLevel12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        java.lang.Class<?> wildcardClass5 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = builder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node6, false, context8);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"  \"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setSourceMapDetailLevel(detailLevel10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\"" + "'", str1, "\"\"");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setLineLengthThreshold((int) (short) 0);
        java.lang.Class<?> wildcardClass16 = builder15.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"\"/" + "'", str2, "/\"\"/");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.google.javascript.jscomp.CodePrinter codePrinter0 = new com.google.javascript.jscomp.CodePrinter();
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/  /");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/  /\"" + "'", str1, "\"/  /\"");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/  /\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"/  /\"/" + "'", str1, "/\"/  /\"/");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"  \"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"  \"/" + "'", str1, "/\"  \"/");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator31.addList(node35, false, context37);
        codeGenerator23.addList(node27, false, context37);
        codeGenerator2.addList(node19, true, context37);
        com.google.javascript.rhino.Node node41 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) (byte) 10);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setTagAsStrict(true);
        java.lang.Class<?> wildcardClass18 = builder13.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) '4');
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setSourceMapDetailLevel(detailLevel8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/  /");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/  /" + "'", str1, "/  /");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node24, false, context26);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/  /\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/  /\"" + "'", str1, "\"/  /\"");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.google.javascript.jscomp.CodePrinter.Format format0 = com.google.javascript.jscomp.CodePrinter.Format.PRETTY;
        org.junit.Assert.assertTrue("'" + format0 + "' != '" + com.google.javascript.jscomp.CodePrinter.Format.PRETTY + "'", format0.equals(com.google.javascript.jscomp.CodePrinter.Format.PRETTY));
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setLineLengthThreshold((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = builder15.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addList(node22);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\"/" + "'", str1, "/\"\"/");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addAllSiblings(node21);
        java.lang.Class<?> wildcardClass23 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/  /");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//  //" + "'", str1, "//  //");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"/  /\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"/  /\"//" + "'", str1, "//\"/  /\"//");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"  \"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"  \"//" + "'", str1, "//\"  \"//");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node24, false, context26);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("//\"/  /\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"/  /\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"/  /\"//" + "'", str2, "//\"/  /\"//");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setOutputTypes(false);
        java.lang.Class<?> wildcardClass18 = builder15.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = builder11.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//" + "'", str2, "//");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.google.javascript.jscomp.CodeGenerator.Context context0 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        java.lang.Class<?> wildcardClass1 = context0.getClass();
        org.junit.Assert.assertTrue("'" + context0 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context0.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("//\"  \"//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) (byte) 10);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setTagAsStrict(true);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setSourceMapDetailLevel(detailLevel18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "////" + "'", str2, "////");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//" + "'", str1, "//");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = builder9.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/  /");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//  //", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "///  ///" + "'", str2, "///  ///");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "////" + "'", str1, "////");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"/  /\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"/  /\\\"/\"" + "'", str1, "\"/\\\"/  /\\\"/\"");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        java.nio.charset.Charset charset26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25, charset26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator27.addList(node28, true);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator27.addList(node31, false, context33);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node24, context33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/\"/  /\"/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setSourceMapDetailLevel(detailLevel8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, true);
        java.lang.Class<?> wildcardClass22 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\"\"" + "'", str1, "\"\\\"\\\"\"");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) (byte) 1);
        java.lang.Class<?> wildcardClass6 = builder1.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) '4');
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPreferLineBreakAtEndOfFile(false);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineLengthThreshold((int) ' ');
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setSourceMapDetailLevel(detailLevel14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setSourceMapDetailLevel(detailLevel8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator31.addList(node35, false, context37);
        codeGenerator23.addList(node27, false, context37);
        codeGenerator2.addList(node19, true, context37);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator2.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator2.addArrayList(node43);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/  /");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(false);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setLineLengthThreshold(0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setPreferLineBreakAtEndOfFile(false);
        java.lang.Class<?> wildcardClass18 = builder15.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.lang.Class<?> wildcardClass8 = builder7.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setPreferLineBreakAtEndOfFile(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = builder13.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("///  ///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///  ///" + "'", str1, "///  ///");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node6, false, context8);
        java.lang.Class<?> wildcardClass10 = context8.getClass();
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"\"//" + "'", str2, "//\"\"//");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setPreferLineBreakAtEndOfFile(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = builder13.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("//");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = builder7.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node6, false, context8);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("//\"\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("//\"/  /\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) (byte) 10);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setTagAsStrict(true);
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder13.setOutputCharset(charset18);
        java.lang.Class<?> wildcardClass20 = builder19.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//\"/  /\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//\\\"/  /\\\"//\"" + "'", str1, "\"//\\\"/  /\\\"//\"");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"  \"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"  \"/" + "'", str1, "/\"  \"/");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator31.addList(node35, false, context37);
        codeGenerator23.addList(node27, false, context37);
        codeGenerator2.addList(node19, true, context37);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator2.addArrayList(node41);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16, charset17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator18.addList(node22, false, context24);
        codeGenerator10.addList(node14, false, context24);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        java.nio.charset.Charset charset38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37, charset38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator39.addList(node40, true);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator39.addList(node43, false, context45);
        codeGenerator31.addList(node35, false, context45);
        codeGenerator10.addList(node27, true, context45);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator10.addArrayList(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator10.addArrayList(node51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        java.nio.charset.Charset charset56 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator57 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer55, charset56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator57.addList(node58, true);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer63 = null;
        java.nio.charset.Charset charset64 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator65 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer63, charset64);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator65.addList(node66, true);
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context71 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator65.addList(node69, false, context71);
        codeGenerator57.addList(node61, false, context71);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator57.addList(node74, true);
        com.google.javascript.rhino.Node node77 = null;
        codeGenerator57.addList(node77);
        com.google.javascript.rhino.Node node79 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context81 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator57.addList(node79, false, context81);
        codeGenerator10.addList(node53, false, context81);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node7, context81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context71 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context71.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context81 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context81.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("///  ///");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator2.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node24, false, context26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator2.addList(node28, true);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node31, context32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addAllSiblings(node22);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/\\\"/  /\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"/  /\\\"/\"" + "'", str1, "\"/\\\"/  /\\\"/\"");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setSourceMapDetailLevel(detailLevel14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineLengthThreshold((int) (short) 10);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setOutputTypes(true);
        java.lang.Class<?> wildcardClass10 = builder9.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPreferLineBreakAtEndOfFile(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node12, context13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setTagAsStrict(false);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder1.setOutputCharset(charset10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = builder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("//\"\"//");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addList(node12, true);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addList(node20, true);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator19.addList(node23, false, context25);
        codeGenerator11.addList(node15, false, context25);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator11.addList(node28, true);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator11.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator11.addList(node33, false, context35);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node8, context35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addAllSiblings(node22);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) (byte) 10);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setTagAsStrict(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = builder17.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6, true);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context10 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node9, context10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node6, context7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator31.addList(node35, false, context37);
        codeGenerator23.addList(node27, false, context37);
        codeGenerator2.addList(node19, true, context37);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator2.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator2.addArrayList(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        java.nio.charset.Charset charset48 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator49 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47, charset48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator49.addList(node50, true);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        java.nio.charset.Charset charset56 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator57 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer55, charset56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator57.addList(node58, true);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context63 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator57.addList(node61, false, context63);
        codeGenerator49.addList(node53, false, context63);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator49.addList(node66, true);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator49.addList(node69);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context73 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator49.addList(node71, false, context73);
        codeGenerator2.addList(node45, false, context73);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context63 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context63.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context73 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context73.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setTagAsStrict(false);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setOutputCharset(charset8);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder1.setSourceMapDetailLevel(detailLevel10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node24, false, context26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator2.addList(node28, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/  /");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setPrettyPrint(true);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setSourceMapDetailLevel(detailLevel14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineBreak(true);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setSourceMap(sourceMap6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = builder7.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator31.addList(node35, false, context37);
        codeGenerator23.addList(node27, false, context37);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator23.addList(node40, true);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator23.addList(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context47 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator23.addList(node45, false, context47);
        codeGenerator2.addList(node19, true, context47);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setPreferLineBreakAtEndOfFile(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = builder17.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//\"  \"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//\\\"  \\\"//\"" + "'", str1, "\"//\\\"  \\\"//\"");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//\"\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//\\\"\\\"//\"" + "'", str1, "\"//\\\"\\\"//\"");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("///  ///");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addList(node27, true);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        java.nio.charset.Charset charset33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32, charset33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator34.addList(node35, true);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator34.addList(node38, false, context40);
        codeGenerator26.addList(node30, false, context40);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        java.nio.charset.Charset charset46 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator47 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer45, charset46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator47.addList(node48, true);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer53 = null;
        java.nio.charset.Charset charset54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer53, charset54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator55.addList(node56, true);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context61 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator55.addList(node59, false, context61);
        codeGenerator47.addList(node51, false, context61);
        codeGenerator26.addList(node43, true, context61);
        codeGenerator2.addList(node22, true, context61);
        java.lang.Class<?> wildcardClass66 = context61.getClass();
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context61 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context61.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"//\\\"\\\"//\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"//\\\"\\\"//\"/" + "'", str1, "/\"//\\\"\\\"//\"/");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) (short) 0);
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setOutputCharset(charset16);
        java.lang.Class<?> wildcardClass18 = builder13.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addAllSiblings(node21);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/\"/  /\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//  //");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//  //" + "'", str1, "//  //");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setTagAsStrict(false);
        java.lang.Class<?> wildcardClass8 = builder5.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"  \"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"  \\\"\"" + "'", str1, "\"\\\"  \\\"\"");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"\\\"\\\"\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/  /\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"/  /\"/" + "'", str2, "/\"/  /\"/");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"hi!\"" + "'", str1, "\"hi!\"");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"hi!\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"hi!\"/" + "'", str1, "/\"hi!\"/");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/  /" + "'", str1, "/  /");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineLengthThreshold((int) 'a');
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setSourceMapDetailLevel(detailLevel12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineBreak(true);
        java.lang.Class<?> wildcardClass14 = builder9.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addList(node27, true);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        java.nio.charset.Charset charset33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32, charset33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator34.addList(node35, true);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator34.addList(node38, false, context40);
        codeGenerator26.addList(node30, false, context40);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        java.nio.charset.Charset charset46 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator47 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer45, charset46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator47.addList(node48, true);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer53 = null;
        java.nio.charset.Charset charset54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer53, charset54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator55.addList(node56, true);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context61 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator55.addList(node59, false, context61);
        codeGenerator47.addList(node51, false, context61);
        codeGenerator26.addList(node43, true, context61);
        codeGenerator2.addList(node22, true, context61);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator2.addArrayList(node66);
        com.google.javascript.rhino.Node node68 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context61 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context61.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/\"\"/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setPreferLineBreakAtEndOfFile(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = builder19.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/hi!/" + "'", str1, "/hi!/");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setTagAsStrict(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = builder17.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"\\\"  \\\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(false);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setSourceMap(sourceMap6);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputCharset(charset8);
        java.lang.Class<?> wildcardClass10 = builder7.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = builder3.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineLengthThreshold((int) (byte) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineLengthThreshold((int) (short) 0);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputCharset(charset8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = builder9.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineBreak(true);
        java.lang.Class<?> wildcardClass14 = builder13.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) '4');
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setSourceMapDetailLevel(detailLevel6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator31.addList(node35, false, context37);
        codeGenerator23.addList(node27, false, context37);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator23.addList(node40, true);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator23.addList(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context47 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator23.addList(node45, false, context47);
        codeGenerator2.addList(node19, true, context47);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator2.addList(node50, true);
        com.google.javascript.rhino.Node node53 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setOutputCharset(charset12);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setPrettyPrint(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node24, false, context26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator2.addList(node28, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//\"  \"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"  \"//" + "'", str1, "//\"  \"//");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("hi!", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/hi!/" + "'", str2, "/hi!/");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator31.addList(node35, false, context37);
        codeGenerator23.addList(node27, false, context37);
        codeGenerator2.addList(node19, true, context37);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator2.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator2.addArrayList(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        java.nio.charset.Charset charset48 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator49 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47, charset48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator49.addList(node50, true);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        java.nio.charset.Charset charset56 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator57 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer55, charset56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator57.addList(node58, true);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context63 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator57.addList(node61, false, context63);
        codeGenerator49.addList(node53, false, context63);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator49.addList(node66, true);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator49.addList(node69);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context73 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator49.addList(node71, false, context73);
        codeGenerator2.addList(node45, false, context73);
        com.google.javascript.rhino.Node node76 = null;
        codeGenerator2.addList(node76);
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer79 = null;
        java.nio.charset.Charset charset80 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator81 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer79, charset80);
        com.google.javascript.rhino.Node node82 = null;
        codeGenerator81.addList(node82, true);
        com.google.javascript.rhino.Node node85 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context87 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator81.addList(node85, false, context87);
        com.google.javascript.rhino.Node node89 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context91 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator81.addList(node89, true, context91);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node78, context91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context63 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context63.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context73 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context73.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context87 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context87.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context91 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context91.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"/\\\"/  /\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/\\\\\\\"/  /\\\\\\\"/\\\"\"" + "'", str1, "\"\\\"/\\\\\\\"/  /\\\\\\\"/\\\"\"");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("///  ///", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "////  ////" + "'", str2, "////  ////");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("////");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node8, context9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setLineLengthThreshold((int) (short) 1);
        com.google.javascript.jscomp.SourceMap sourceMap16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder11.setSourceMap(sourceMap16);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder11.setTagAsStrict(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setPreferLineBreakAtEndOfFile(true);
        java.lang.Class<?> wildcardClass16 = builder15.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder13.setPrettyPrint(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(false);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setSourceMap(sourceMap6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = builder7.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        java.nio.charset.Charset charset11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10, charset11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator12.addList(node16, false, context18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        java.nio.charset.Charset charset23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22, charset23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator24.addList(node25, true);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        java.nio.charset.Charset charset31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30, charset31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addList(node33, true);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator32.addList(node36, false, context38);
        codeGenerator24.addList(node28, false, context38);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        java.nio.charset.Charset charset44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer43, charset44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator45.addList(node46, true);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer51 = null;
        java.nio.charset.Charset charset52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer51, charset52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator53.addList(node54, true);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context59 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator53.addList(node57, false, context59);
        codeGenerator45.addList(node49, false, context59);
        codeGenerator24.addList(node41, true, context59);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator24.addArrayList(node63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator24.addArrayList(node65);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer69 = null;
        java.nio.charset.Charset charset70 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator71 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer69, charset70);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator71.addList(node72, true);
        com.google.javascript.rhino.Node node75 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer77 = null;
        java.nio.charset.Charset charset78 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator79 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer77, charset78);
        com.google.javascript.rhino.Node node80 = null;
        codeGenerator79.addList(node80, true);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context85 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator79.addList(node83, false, context85);
        codeGenerator71.addList(node75, false, context85);
        com.google.javascript.rhino.Node node88 = null;
        codeGenerator71.addList(node88, true);
        com.google.javascript.rhino.Node node91 = null;
        codeGenerator71.addList(node91);
        com.google.javascript.rhino.Node node93 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context95 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator71.addList(node93, false, context95);
        codeGenerator24.addList(node67, false, context95);
        codeGenerator12.addList(node20, false, context95);
        codeGenerator2.addList(node8, true, context95);
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context59 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context59.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context85 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context85.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context95 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context95.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/\"/  /\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addArrayList(node24);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("////", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//////" + "'", str2, "//////");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        java.nio.charset.Charset charset23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22, charset23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator24.addList(node25, true);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        java.nio.charset.Charset charset31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30, charset31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addList(node33, true);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator32.addList(node36, false, context38);
        codeGenerator24.addList(node28, false, context38);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator24.addList(node41, true);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator24.addList(node44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator24.addList(node46, false, context48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator24.addList(node50, false, context52);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node21, context52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, true);
        java.lang.Class<?> wildcardClass17 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("//\"/  /\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, true);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addList(node20, true);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        java.nio.charset.Charset charset26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25, charset26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator27.addList(node28, true);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator27.addList(node31, false, context33);
        codeGenerator19.addList(node23, false, context33);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        java.nio.charset.Charset charset39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38, charset39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator40.addList(node41, true);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        java.nio.charset.Charset charset47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer46, charset47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator48.addList(node49, true);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context54 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator48.addList(node52, false, context54);
        codeGenerator40.addList(node44, false, context54);
        codeGenerator19.addList(node36, true, context54);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator19.addArrayList(node58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator19.addArrayList(node60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer64 = null;
        java.nio.charset.Charset charset65 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator66 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer64, charset65);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator66.addList(node67, true);
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer72 = null;
        java.nio.charset.Charset charset73 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator74 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer72, charset73);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator74.addList(node75, true);
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context80 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator74.addList(node78, false, context80);
        codeGenerator66.addList(node70, false, context80);
        com.google.javascript.rhino.Node node83 = null;
        codeGenerator66.addList(node83, true);
        com.google.javascript.rhino.Node node86 = null;
        codeGenerator66.addList(node86);
        com.google.javascript.rhino.Node node88 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context90 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator66.addList(node88, false, context90);
        codeGenerator19.addList(node62, false, context90);
        com.google.javascript.rhino.Node node93 = null;
        codeGenerator19.addList(node93);
        com.google.javascript.rhino.Node node95 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context97 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator19.addList(node95, false, context97);
        codeGenerator2.addList(node15, true, context97);
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context54 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context54.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context80 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context80.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context90 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context90.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context97 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context97.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/\"\"/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"\\\"  \\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) (short) 0);
        java.lang.Class<?> wildcardClass16 = builder15.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node12, context13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator31.addList(node35, false, context37);
        codeGenerator23.addList(node27, false, context37);
        codeGenerator2.addList(node19, true, context37);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node12, context13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setPrettyPrint(true);
        java.lang.Class<?> wildcardClass6 = builder3.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(false);
        java.lang.Class<?> wildcardClass12 = builder9.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/\"  \"/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator31.addList(node35, false, context37);
        codeGenerator23.addList(node27, false, context37);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator23.addList(node40, true);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator23.addList(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context47 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator23.addList(node45, false, context47);
        codeGenerator2.addList(node19, true, context47);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator2.addList(node50, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setOutputCharset(charset12);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setSourceMapDetailLevel(detailLevel14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addArrayList(node6);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(true);
        com.google.javascript.jscomp.SourceMap sourceMap10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setSourceMap(sourceMap10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"  \"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"  \"//" + "'", str2, "//\"  \"//");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"hi!\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"hi!\"//" + "'", str1, "//\"hi!\"//");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//////");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//////" + "'", str1, "//////");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineBreak(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = builder13.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) '4');
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineLengthThreshold((int) (short) 1);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setSourceMapDetailLevel(detailLevel12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//\"hi!\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///\"hi!\"///" + "'", str1, "///\"hi!\"///");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("//\"/  /\"//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addList(node27, true);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        java.nio.charset.Charset charset33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32, charset33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator34.addList(node35, true);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator34.addList(node38, false, context40);
        codeGenerator26.addList(node30, false, context40);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        java.nio.charset.Charset charset46 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator47 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer45, charset46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator47.addList(node48, true);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer53 = null;
        java.nio.charset.Charset charset54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer53, charset54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator55.addList(node56, true);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context61 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator55.addList(node59, false, context61);
        codeGenerator47.addList(node51, false, context61);
        codeGenerator26.addList(node43, true, context61);
        codeGenerator2.addList(node22, true, context61);
        com.google.javascript.rhino.Node node66 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context61 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context61.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node24, false, context26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator2.addList(node28, true);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator2.addList(node31);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("//\"hi!\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineBreak(true);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setSourceMap(sourceMap6);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputCharset(charset8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = builder9.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("///  ///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"///  ///\"" + "'", str1, "\"///  ///\"");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/hi!/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/hi!/" + "'", str1, "/hi!/");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator31.addList(node35, false, context37);
        codeGenerator23.addList(node27, false, context37);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator23.addList(node40, true);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator23.addList(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context47 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator23.addList(node45, false, context47);
        codeGenerator2.addList(node19, true, context47);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator2.addList(node50, true);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator2.addArrayList(node53);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"/  /\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("//////");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineBreak(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = builder15.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setSourceMapDetailLevel(detailLevel8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineLengthThreshold((int) (short) 10);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setTagAsStrict(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = builder11.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineLengthThreshold((int) (byte) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineLengthThreshold((int) (short) 0);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputCharset(charset8);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setSourceMapDetailLevel(detailLevel10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//\"/  /\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///\"/  /\"///" + "'", str1, "///\"/  /\"///");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("////");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.google.javascript.jscomp.CodeGenerator.Context context0 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        java.lang.Class<?> wildcardClass1 = context0.getClass();
        org.junit.Assert.assertTrue("'" + context0 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context0.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"  \"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"  \"" + "'", str1, "\"  \"");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"//\\\"\\\"//\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"" + "'", str1, "\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/\"  \"/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"\"//" + "'", str1, "//\"\"//");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"  \"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"  \"/" + "'", str2, "/\"  \"/");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, true);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"" + "'", str1, "\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(true);
        com.google.javascript.jscomp.SourceMap sourceMap10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setSourceMap(sourceMap10);
        com.google.javascript.jscomp.SourceMap sourceMap12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder7.setSourceMap(sourceMap12);
        java.lang.Class<?> wildcardClass14 = builder13.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputTypes(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = builder5.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"/  /\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/  /\\\"\"" + "'", str1, "\"\\\"/  /\\\"\"");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = builder11.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/  /", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//  //" + "'", str2, "//  //");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addList(node27, true);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        java.nio.charset.Charset charset33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32, charset33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator34.addList(node35, true);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator34.addList(node38, false, context40);
        codeGenerator26.addList(node30, false, context40);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        java.nio.charset.Charset charset46 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator47 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer45, charset46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator47.addList(node48, true);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer53 = null;
        java.nio.charset.Charset charset54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer53, charset54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator55.addList(node56, true);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context61 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator55.addList(node59, false, context61);
        codeGenerator47.addList(node51, false, context61);
        codeGenerator26.addList(node43, true, context61);
        codeGenerator2.addList(node22, true, context61);
        com.google.javascript.rhino.Node node66 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context61 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context61.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setOutputCharset(charset10);
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setOutputCharset(charset12);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder5.setTagAsStrict(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"  \\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\\\"  \\\"\"/" + "'", str1, "/\"\\\"  \\\"\"/");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineLengthThreshold((int) 'a');
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineLengthThreshold((int) ' ');
        java.lang.Class<?> wildcardClass14 = builder13.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineLengthThreshold((int) (byte) 100);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setSourceMapDetailLevel(detailLevel14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator31.addList(node35, false, context37);
        codeGenerator23.addList(node27, false, context37);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator23.addList(node40, true);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator23.addList(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context47 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator23.addList(node45, false, context47);
        codeGenerator2.addList(node19, true, context47);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator2.addList(node50, true);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator2.addArrayList(node53);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setTagAsStrict(false);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder1.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setOutputTypes(false);
        com.google.javascript.jscomp.SourceMap sourceMap14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setSourceMap(sourceMap14);
        java.lang.Class<?> wildcardClass16 = builder11.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"hi!\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"hi!\"" + "'", str1, "\"hi!\"");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addArrayList(node14);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap sourceMap16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder9.setSourceMap(sourceMap16);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setLineLengthThreshold((int) (byte) -1);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder17.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setLineBreak(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setPrettyPrint(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = builder5.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineBreak(false);
        java.lang.Class<?> wildcardClass8 = builder7.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"//\\\"\\\"//\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"" + "'", str1, "\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"\\\"  \\\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"\\\\\\\"  \\\\\\\"\\\"/\"" + "'", str1, "\"/\\\"\\\\\\\"  \\\\\\\"\\\"/\"");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addAllSiblings(node24);
        java.lang.Class<?> wildcardClass26 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addAllSiblings(node21);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addList(node27, true);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        java.nio.charset.Charset charset33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32, charset33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator34.addList(node35, true);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator34.addList(node38, false, context40);
        codeGenerator26.addList(node30, false, context40);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        java.nio.charset.Charset charset46 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator47 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer45, charset46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator47.addList(node48, true);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer53 = null;
        java.nio.charset.Charset charset54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer53, charset54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator55.addList(node56, true);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context61 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator55.addList(node59, false, context61);
        codeGenerator47.addList(node51, false, context61);
        codeGenerator26.addList(node43, true, context61);
        codeGenerator2.addList(node22, true, context61);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator2.addAllSiblings(node66);
        com.google.javascript.rhino.Node node68 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context61 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context61.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6, true);
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator31.addList(node35, false, context37);
        codeGenerator23.addList(node27, false, context37);
        codeGenerator2.addList(node19, true, context37);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator2.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator2.addArrayList(node43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator2.addList(node45, false);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator2.addAllSiblings(node48);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"//\\\"/  /\\\"//\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"//\\\"/  /\\\"//\"/" + "'", str1, "/\"//\\\"/  /\\\"//\"/");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        java.nio.charset.Charset charset13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12, charset13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator22.addList(node26, false, context28);
        codeGenerator14.addList(node18, false, context28);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator35.addList(node36, true);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer41 = null;
        java.nio.charset.Charset charset42 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator43 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer41, charset42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator43.addList(node44, true);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context49 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator43.addList(node47, false, context49);
        codeGenerator35.addList(node39, false, context49);
        codeGenerator14.addList(node31, true, context49);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator14.addArrayList(node53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator14.addArrayList(node55);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer59 = null;
        java.nio.charset.Charset charset60 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator61 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer59, charset60);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator61.addList(node62, true);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer67 = null;
        java.nio.charset.Charset charset68 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator69 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer67, charset68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator69.addList(node70, true);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context75 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator69.addList(node73, false, context75);
        codeGenerator61.addList(node65, false, context75);
        com.google.javascript.rhino.Node node78 = null;
        codeGenerator61.addList(node78, true);
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator61.addList(node81);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context85 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator61.addList(node83, false, context85);
        codeGenerator14.addList(node57, false, context85);
        codeGenerator2.addList(node10, false, context85);
        com.google.javascript.rhino.Node node89 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context75 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context75.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context85 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context85.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(false);
        com.google.javascript.jscomp.SourceMap sourceMap12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setSourceMap(sourceMap12);
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setOutputCharset(charset14);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setSourceMapDetailLevel(detailLevel16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"//\\\"/  /\\\"//\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//\\\"/  /\\\"//\"" + "'", str1, "\"//\\\"/  /\\\"//\"");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setPreferLineBreakAtEndOfFile(false);
        java.lang.Class<?> wildcardClass16 = builder9.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator31.addList(node35, false, context37);
        codeGenerator23.addList(node27, false, context37);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator23.addList(node40, true);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator23.addList(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context47 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator23.addList(node45, false, context47);
        codeGenerator2.addList(node19, true, context47);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator2.addList(node50, true);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator2.addArrayList(node53);
        com.google.javascript.rhino.Node node55 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setLineBreak(false);
        com.google.javascript.jscomp.SourceMap sourceMap16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setSourceMap(sourceMap16);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder15.setSourceMapDetailLevel(detailLevel18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"\\\"/  /\\\"\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"" + "'", str1, "\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineBreak(false);
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setOutputCharset(charset16);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineLengthThreshold((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = builder9.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setLineLengthThreshold((int) (short) 1);
        com.google.javascript.jscomp.SourceMap sourceMap16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder11.setSourceMap(sourceMap16);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setTagAsStrict(true);
        java.lang.Class<?> wildcardClass20 = builder19.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) 'a');
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setTagAsStrict(true);
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setOutputCharset(charset18);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(true);
        com.google.javascript.jscomp.SourceMap sourceMap10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setSourceMap(sourceMap10);
        com.google.javascript.jscomp.SourceMap sourceMap12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder7.setSourceMap(sourceMap12);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder7.setLineBreak(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//////");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//////\"" + "'", str1, "\"//////\"");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("////  ////");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/////  /////" + "'", str1, "/////  /////");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) '4');
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPreferLineBreakAtEndOfFile(false);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineLengthThreshold((int) ' ');
        java.lang.Class<?> wildcardClass14 = builder11.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder13.setTagAsStrict(true);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder13.setSourceMapDetailLevel(detailLevel20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setLineLengthThreshold((int) (short) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder15.setPrettyPrint(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"/  /\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        java.nio.charset.Charset charset13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12, charset13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator22.addList(node26, false, context28);
        codeGenerator14.addList(node18, false, context28);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator35.addList(node36, true);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer41 = null;
        java.nio.charset.Charset charset42 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator43 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer41, charset42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator43.addList(node44, true);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context49 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator43.addList(node47, false, context49);
        codeGenerator35.addList(node39, false, context49);
        codeGenerator14.addList(node31, true, context49);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node11, context49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) (byte) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setTagAsStrict(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setSourceMapDetailLevel(detailLevel10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"" + "'", str1, "\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setOutputCharset(charset12);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setTagAsStrict(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"/\\\\\\\"/  /\\\\\\\"/\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\\\"/\\\\\\\"/  /\\\\\\\"/\\\"\"/" + "'", str1, "/\"\\\"/\\\\\\\"/  /\\\\\\\"/\\\"\"/");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"hi!\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"hi!\\\"/\"" + "'", str1, "\"/\\\"hi!\\\"/\"");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) (byte) 10);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder13.setTagAsStrict(true);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder13.setSourceMapDetailLevel(detailLevel20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"//\\\"\\\"//\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"//\\\"\\\"//\"//" + "'", str2, "//\"//\\\"\\\"//\"//");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator31.addList(node35, false, context37);
        codeGenerator23.addList(node27, false, context37);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator23.addList(node40, true);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator23.addList(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context47 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator23.addList(node45, false, context47);
        codeGenerator2.addList(node19, true, context47);
        com.google.javascript.rhino.Node node50 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"/  /\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\\\"/  /\\\"\"/" + "'", str1, "/\"\\\"/  /\\\"\"/");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = builder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"hi!\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"hi!\"//" + "'", str2, "//\"hi!\"//");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//\"//\\\"\\\"//\"//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "///\"//\\\"\\\"//\"///" + "'", str2, "///\"//\\\"\\\"//\"///");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator31.addList(node35, false, context37);
        codeGenerator23.addList(node27, false, context37);
        codeGenerator2.addList(node19, true, context37);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator2.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator2.addArrayList(node43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator2.addList(node45, false);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator2.addAllSiblings(node48);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"//\\\"/  /\\\"//\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator31.addList(node35, false, context37);
        codeGenerator23.addList(node27, false, context37);
        codeGenerator2.addList(node19, true, context37);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator2.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator2.addArrayList(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        java.nio.charset.Charset charset48 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator49 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47, charset48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator49.addList(node50, true);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        java.nio.charset.Charset charset56 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator57 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer55, charset56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator57.addList(node58, true);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context63 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator57.addList(node61, false, context63);
        codeGenerator49.addList(node53, false, context63);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator49.addList(node66, true);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator49.addList(node69);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context73 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator49.addList(node71, false, context73);
        codeGenerator2.addList(node45, false, context73);
        com.google.javascript.rhino.Node node76 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context78 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node76, true, context78);
        com.google.javascript.rhino.Node node80 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context63 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context63.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context73 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context73.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context78 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context78.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addAllSiblings(node21);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/  /");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder5.setPreferLineBreakAtEndOfFile(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = builder15.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/\\\"/  /\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"/\\\"/  /\\\"/\"/" + "'", str1, "/\"/\\\"/  /\\\"/\"/");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setPrettyPrint(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node24, false, context26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator2.addList(node28);
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"\\\"/  /\\\"\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"\\\"/  /\\\"\"//" + "'", str2, "//\"\\\"/  /\\\"\"//");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/\"\\\"/  /\\\"\"/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"/  /\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.SourceMap sourceMap20 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setSourceMap(sourceMap20);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap sourceMap24 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder21.setSourceMap(sourceMap24);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder1.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineLengthThreshold((int) (byte) 0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"/\\\"/  /\\\"/\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"/\\\"/  /\\\"/\"/" + "'", str1, "/\"/\\\"/  /\\\"/\"/");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineLengthThreshold((int) (byte) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineLengthThreshold((int) (short) 0);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setTagAsStrict(true);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setSourceMapDetailLevel(detailLevel12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"\\\"/  /\\\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"\\\\\\\"/  /\\\\\\\"\\\"/\"" + "'", str1, "\"/\\\"\\\\\\\"/  /\\\\\\\"\\\"/\"");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder3.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) '4');
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPrettyPrint(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"/\\\"\\\\\\\"/  /\\\\\\\"\\\"/\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addList(node22, true);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator2.addArrayList(node25);
        com.google.javascript.rhino.Node node27 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"\\\"/\\\\\\\"/  /\\\\\\\"/\\\"\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator2.addList(node26);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"/\\\"hi!\\\"/\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setLineLengthThreshold((int) (short) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder17.setOutputCharset(charset20);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) (byte) 10);
        com.google.javascript.jscomp.SourceMap sourceMap16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setSourceMap(sourceMap16);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setTagAsStrict(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"hi!\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"hi!\"/" + "'", str1, "/\"hi!\"/");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/////  /////");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/////  /////" + "'", str1, "/////  /////");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node24, false, context26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator2.addList(node28, true);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator2.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator2.addArrayList(node33);
        com.google.javascript.rhino.Node node35 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        java.nio.charset.Charset charset29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28, charset29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addList(node31, true);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator30.addList(node34, false, context36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator30.addList(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator30.addArrayList(node40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        java.nio.charset.Charset charset45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer44, charset45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator46.addList(node47, true);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer52 = null;
        java.nio.charset.Charset charset53 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator54 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer52, charset53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator54.addList(node55, true);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context60 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator54.addList(node58, false, context60);
        codeGenerator46.addList(node50, false, context60);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer65 = null;
        java.nio.charset.Charset charset66 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator67 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer65, charset66);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator67.addList(node68, true);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer73 = null;
        java.nio.charset.Charset charset74 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator75 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer73, charset74);
        com.google.javascript.rhino.Node node76 = null;
        codeGenerator75.addList(node76, true);
        com.google.javascript.rhino.Node node79 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context81 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator75.addList(node79, false, context81);
        codeGenerator67.addList(node71, false, context81);
        com.google.javascript.rhino.Node node84 = null;
        codeGenerator67.addList(node84, true);
        com.google.javascript.rhino.Node node87 = null;
        codeGenerator67.addList(node87);
        com.google.javascript.rhino.Node node89 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context91 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator67.addList(node89, false, context91);
        codeGenerator46.addList(node63, true, context91);
        codeGenerator30.addList(node42, true, context91);
        codeGenerator2.addList(node26, false, context91);
        com.google.javascript.rhino.Node node96 = null;
        codeGenerator2.addList(node96, false);
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context60 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context60.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context81 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context81.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context91 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context91.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setLineLengthThreshold((int) (short) 0);
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder9.setOutputCharset(charset16);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator31.addList(node35, false, context37);
        codeGenerator23.addList(node27, false, context37);
        codeGenerator2.addList(node19, true, context37);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator2.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator2.addArrayList(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        java.nio.charset.Charset charset48 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator49 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47, charset48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator49.addList(node50, true);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        java.nio.charset.Charset charset56 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator57 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer55, charset56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator57.addList(node58, true);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context63 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator57.addList(node61, false, context63);
        codeGenerator49.addList(node53, false, context63);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator49.addList(node66, true);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator49.addList(node69);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context73 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator49.addList(node71, false, context73);
        codeGenerator2.addList(node45, false, context73);
        com.google.javascript.rhino.Node node76 = null;
        codeGenerator2.addList(node76);
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context79 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node78, context79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context63 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context63.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context73 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context73.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context79 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context79.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"  \\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"\\\"  \\\"\"/" + "'", str2, "/\"\\\"  \\\"\"/");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setPrettyPrint(false);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator31.addList(node35, false, context37);
        codeGenerator23.addList(node27, false, context37);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator23.addList(node40, true);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator23.addList(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context47 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator23.addList(node45, false, context47);
        codeGenerator2.addList(node19, true, context47);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator2.addList(node50, true);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer54 = null;
        java.nio.charset.Charset charset55 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator56 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer54, charset55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator56.addList(node57, true);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer62 = null;
        java.nio.charset.Charset charset63 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator64 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer62, charset63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator64.addList(node65, true);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context70 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator64.addList(node68, false, context70);
        codeGenerator56.addList(node60, false, context70);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator56.addList(node73, true);
        com.google.javascript.rhino.Node node76 = null;
        codeGenerator56.addList(node76);
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context80 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator56.addList(node78, false, context80);
        com.google.javascript.rhino.Node node82 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context84 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator56.addList(node82, false, context84);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node53, context84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context70 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context70.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context80 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context80.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context84 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context84.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setTagAsStrict(true);
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setOutputCharset(charset16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = builder15.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//////");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "////////" + "'", str1, "////////");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16, charset17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addList(node27, true);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator26.addList(node30, false, context32);
        codeGenerator18.addList(node22, false, context32);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        java.nio.charset.Charset charset38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37, charset38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator39.addList(node40, true);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        java.nio.charset.Charset charset46 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator47 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer45, charset46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator47.addList(node48, true);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context53 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator47.addList(node51, false, context53);
        codeGenerator39.addList(node43, false, context53);
        codeGenerator18.addList(node35, true, context53);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator18.addArrayList(node57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator18.addArrayList(node59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer63 = null;
        java.nio.charset.Charset charset64 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator65 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer63, charset64);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator65.addList(node66, true);
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer71 = null;
        java.nio.charset.Charset charset72 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator73 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer71, charset72);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator73.addList(node74, true);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context79 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator73.addList(node77, false, context79);
        codeGenerator65.addList(node69, false, context79);
        com.google.javascript.rhino.Node node82 = null;
        codeGenerator65.addList(node82, true);
        com.google.javascript.rhino.Node node85 = null;
        codeGenerator65.addList(node85);
        com.google.javascript.rhino.Node node87 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context89 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator65.addList(node87, false, context89);
        codeGenerator18.addList(node61, false, context89);
        com.google.javascript.rhino.Node node92 = null;
        codeGenerator18.addList(node92);
        com.google.javascript.rhino.Node node94 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context96 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator18.addList(node94, false, context96);
        codeGenerator2.addList(node14, false, context96);
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context79 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context79.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context89 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context89.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context96 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context96.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setLineLengthThreshold(0);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder13.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder13.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder13.setPrettyPrint(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = builder13.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//  //");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//  //\"" + "'", str1, "\"//  //\"");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("//\"\"//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"//////\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"//////\\\"\"" + "'", str1, "\"\\\"//////\\\"\"");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator31.addList(node35, false, context37);
        codeGenerator23.addList(node27, false, context37);
        codeGenerator2.addList(node19, true, context37);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator2.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator2.addList(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        java.nio.charset.Charset charset48 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator49 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47, charset48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator49.addList(node50, true);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        java.nio.charset.Charset charset56 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator57 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer55, charset56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator57.addList(node58, true);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context63 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator57.addList(node61, false, context63);
        codeGenerator49.addList(node53, false, context63);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator49.addList(node66, true);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator49.addList(node69);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator49.addList(node71, false);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator49.addArrayList(node74);
        com.google.javascript.rhino.Node node76 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context78 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator49.addList(node76, true, context78);
        codeGenerator2.addList(node45, false, context78);
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator2.addArrayList(node81);
        com.google.javascript.rhino.Node node83 = null;
        codeGenerator2.addList(node83);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context63 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context63.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context78 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context78.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"//////\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"//////\"/" + "'", str1, "/\"//////\"/");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setLineLengthThreshold(0);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setSourceMapDetailLevel(detailLevel18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder9.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder9.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setPreferLineBreakAtEndOfFile(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = builder19.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//  //");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///  ///" + "'", str1, "///  ///");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder17.setSourceMapDetailLevel(detailLevel20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setLineBreak(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = builder5.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"//////\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"//////\\\"/\"" + "'", str1, "\"/\\\"//////\\\"/\"");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder9.setLineBreak(false);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder9.setSourceMapDetailLevel(detailLevel18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"\"" + "'", str1, "\"\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"\"");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("///\"//\\\"\\\"//\"///", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "////\"//\\\"\\\"//\"////" + "'", str2, "////\"//\\\"\\\"//\"////");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("////\"//\\\"\\\"//\"////");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "////\"//\\\"\\\"//\"////" + "'", str1, "////\"//\\\"\\\"//\"////");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineBreak(true);
        java.lang.Class<?> wildcardClass12 = builder9.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) 'a');
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder15.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder19.setLineLengthThreshold((int) (byte) 100);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder15.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder15.setPreferLineBreakAtEndOfFile(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setTagAsStrict(true);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setSourceMapDetailLevel(detailLevel16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node10, true, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        java.lang.Class<?> wildcardClass16 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//\"hi!\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//\\\"hi!\\\"//\"" + "'", str1, "\"//\\\"hi!\\\"//\"");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        java.lang.Class<?> wildcardClass12 = builder9.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setLineLengthThreshold((int) (short) 0);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder9.setPreferLineBreakAtEndOfFile(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = builder17.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addList(node12, true);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addList(node20, true);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator19.addList(node23, false, context25);
        codeGenerator11.addList(node15, false, context25);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator11.addArrayList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator11.addAllSiblings(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        java.nio.charset.Charset charset35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer34, charset35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator36.addList(node37, true);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        java.nio.charset.Charset charset43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer42, charset43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator44.addList(node45, true);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator44.addList(node48, false, context50);
        codeGenerator36.addList(node40, false, context50);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        java.nio.charset.Charset charset56 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator57 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer55, charset56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator57.addList(node58, true);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer63 = null;
        java.nio.charset.Charset charset64 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator65 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer63, charset64);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator65.addList(node66, true);
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context71 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator65.addList(node69, false, context71);
        codeGenerator57.addList(node61, false, context71);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator57.addList(node74, true);
        com.google.javascript.rhino.Node node77 = null;
        codeGenerator57.addList(node77);
        com.google.javascript.rhino.Node node79 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context81 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator57.addList(node79, false, context81);
        codeGenerator36.addList(node53, true, context81);
        codeGenerator11.addList(node32, false, context81);
        codeGenerator2.addList(node7, false, context81);
        java.lang.Class<?> wildcardClass86 = context81.getClass();
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context71 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context71.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context81 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context81.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) 'a');
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setOutputCharset(charset16);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setTagAsStrict(false);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputCharset(charset8);
        java.lang.Class<?> wildcardClass10 = builder9.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) '4');
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPreferLineBreakAtEndOfFile(false);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineLengthThreshold((int) ' ');
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setOutputTypes(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"//\\\"/  /\\\"//\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"//\\\"/  /\\\"//\"/" + "'", str1, "/\"//\\\"/  /\\\"//\"/");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setPrettyPrint(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = builder17.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("///\"hi!\"///");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setOutputTypes(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//\"  \"//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "///\"  \"///" + "'", str2, "///\"  \"///");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/\\\"\\\\\\\"  \\\\\\\"\\\"/\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"/\\\"\\\\\\\"  \\\\\\\"\\\"/\"/" + "'", str2, "/\"/\\\"\\\\\\\"  \\\\\\\"\\\"/\"/");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setOutputCharset(charset12);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setLineLengthThreshold(500);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setPrettyPrint(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(false);
        com.google.javascript.jscomp.SourceMap sourceMap12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setSourceMap(sourceMap12);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder11.setOutputTypes(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator2.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator2.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator31.addList(node35, false, context37);
        codeGenerator23.addList(node27, false, context37);
        codeGenerator2.addList(node19, true, context37);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator2.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator2.addList(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        java.nio.charset.Charset charset48 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator49 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47, charset48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator49.addList(node50, true);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        java.nio.charset.Charset charset56 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator57 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer55, charset56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator57.addList(node58, true);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context63 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator57.addList(node61, false, context63);
        codeGenerator49.addList(node53, false, context63);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator49.addList(node66, true);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator49.addList(node69);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator49.addList(node71, false);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator49.addArrayList(node74);
        com.google.javascript.rhino.Node node76 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context78 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator49.addList(node76, true, context78);
        codeGenerator2.addList(node45, false, context78);
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator2.addArrayList(node81);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"\\\"/\\\\\\\"/  /\\\\\\\"/\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context63 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context63.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context78 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context78.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator2.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node29, true, context31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator2.addArrayList(node33);
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator31.addList(node35, false, context37);
        codeGenerator23.addList(node27, false, context37);
        codeGenerator2.addList(node19, true, context37);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator2.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator2.addList(node43);
        com.google.javascript.rhino.Node node45 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/\\\"hi!\\\"/\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"/\\\"hi!\\\"/\"/" + "'", str2, "/\"/\\\"hi!\\\"/\"/");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(false);
        java.lang.Class<?> wildcardClass14 = builder11.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setTagAsStrict(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = builder13.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"/" + "'", str1, "/\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"/");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.SourceMap sourceMap10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setSourceMap(sourceMap10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineBreak(false);
        java.lang.Class<?> wildcardClass14 = builder11.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) (byte) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setSourceMapDetailLevel(detailLevel8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) (short) 0);
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setOutputCharset(charset16);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setOutputTypes(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = builder17.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setLineBreak(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator31.addList(node35, false, context37);
        codeGenerator23.addList(node27, false, context37);
        codeGenerator2.addList(node19, true, context37);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator2.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator2.addList(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        java.nio.charset.Charset charset47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer46, charset47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator48.addList(node49, true);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context54 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator48.addList(node52, false, context54);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node45, context54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context54 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context54.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.SourceMap sourceMap10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setSourceMap(sourceMap10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = builder7.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setOutputCharset(charset12);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setLineLengthThreshold(500);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder17.setLineLengthThreshold(0);
        java.lang.Class<?> wildcardClass22 = builder21.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPrettyPrint(false);
        java.lang.Class<?> wildcardClass14 = builder13.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"\\\"/  /\\\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"\\\"/  /\\\"\"//" + "'", str1, "//\"\\\"/  /\\\"\"//");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("///\"/  /\"///");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addArrayList(node23);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"\\\"/\"" + "'", str1, "\"/\\\"\\\"/\"");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/////  /////");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/////  /////\"" + "'", str1, "\"/////  /////\"");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\"  \\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"  \\\"\"" + "'", str1, "\"\\\"  \\\"\"");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setLineLengthThreshold((int) (short) 1);
        com.google.javascript.jscomp.SourceMap sourceMap16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder11.setSourceMap(sourceMap16);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setLineBreak(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator2.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator31.addList(node35, false, context37);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node28, context37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setOutputTypes(true);
        com.google.javascript.jscomp.SourceMap sourceMap14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setSourceMap(sourceMap14);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setOutputTypes(false);
        com.google.javascript.jscomp.SourceMap sourceMap14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setSourceMap(sourceMap14);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("///\"//\\\"\\\"//\"///");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"//  //\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"//  //\"/" + "'", str1, "/\"//  //\"/");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setOutputTypes(false);
        com.google.javascript.jscomp.SourceMap sourceMap14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder5.setSourceMap(sourceMap14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = builder5.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) 'a');
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setTagAsStrict(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"\\\"  \\\"\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addList(node22, true);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator2.addArrayList(node25);
        com.google.javascript.rhino.Node node27 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.SourceMap sourceMap10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setSourceMap(sourceMap10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineLengthThreshold(100);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator31.addList(node35, false, context37);
        codeGenerator23.addList(node27, false, context37);
        codeGenerator2.addList(node19, true, context37);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator2.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator2.addList(node43, false);
        com.google.javascript.rhino.Node node46 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        java.nio.charset.Charset charset26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25, charset26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator27.addList(node28, true);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator35.addList(node36, true);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator35.addList(node39, false, context41);
        codeGenerator27.addList(node31, false, context41);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        java.nio.charset.Charset charset47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer46, charset47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator48.addList(node49, true);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer54 = null;
        java.nio.charset.Charset charset55 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator56 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer54, charset55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator56.addList(node57, true);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context62 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator56.addList(node60, false, context62);
        codeGenerator48.addList(node52, false, context62);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator48.addList(node65, true);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator48.addList(node68);
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context72 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator48.addList(node70, false, context72);
        codeGenerator27.addList(node44, true, context72);
        codeGenerator2.addList(node23, false, context72);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context72 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context72.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder11.setPrettyPrint(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setLineLengthThreshold(0);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setSourceMapDetailLevel(detailLevel12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("///\"//\\\"\\\"//\"///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"///\\\"//\\\\\\\"\\\\\\\"//\\\"///\"" + "'", str1, "\"///\\\"//\\\\\\\"\\\\\\\"//\\\"///\"");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"/\\\"\\\"/\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator2.addList(node25);
        com.google.javascript.rhino.Node node27 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/\\\"hi!\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"/\\\"hi!\\\"/\"/" + "'", str1, "/\"/\\\"hi!\\\"/\"/");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/\"//  //\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.SourceMap sourceMap16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder9.setSourceMap(sourceMap16);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setLineLengthThreshold((int) (short) 0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) (short) 0);
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setOutputCharset(charset16);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setTagAsStrict(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"\\\"/\\\\\\\"/  /\\\\\\\"/\\\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\\\"/\\\\\\\"/  /\\\\\\\"/\\\"\"/" + "'", str1, "/\"\\\"/\\\\\\\"/  /\\\\\\\"/\\\"\"/");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node10, true, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.SourceMap sourceMap20 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setSourceMap(sourceMap20);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder19.setLineLengthThreshold((int) (byte) -1);
        java.lang.Class<?> wildcardClass24 = builder19.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addList(node24);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"///\\\"//\\\\\\\"\\\\\\\"//\\\"///\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder13.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setTagAsStrict(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator2.addList(node26, true);
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"/\\\"/  /\\\"/\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"\"/" + "'", str1, "/\"\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"\"/");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineLengthThreshold(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = builder11.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"/\\\\\\\"/  /\\\\\\\"/\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"\\\"/\\\\\\\"/  /\\\\\\\"/\\\"\"/" + "'", str2, "/\"\\\"/\\\\\\\"/  /\\\\\\\"/\\\"\"/");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(false);
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setOutputCharset(charset14);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setLineLengthThreshold(0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//\"/  /\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"/  /\"//" + "'", str1, "//\"/  /\"//");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) (short) 0);
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setOutputCharset(charset16);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setTagAsStrict(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setPreferLineBreakAtEndOfFile(false);
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setOutputCharset(charset16);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setLineLengthThreshold((int) '#');
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18, true);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        java.nio.charset.Charset charset24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23, charset24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator25.addList(node26, true);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator25.addList(node29, false, context31);
        codeGenerator17.addList(node21, false, context31);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer36 = null;
        java.nio.charset.Charset charset37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer36, charset37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator38.addList(node39, true);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        java.nio.charset.Charset charset45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer44, charset45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator46.addList(node47, true);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator46.addList(node50, false, context52);
        codeGenerator38.addList(node42, false, context52);
        codeGenerator17.addList(node34, true, context52);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator17.addArrayList(node56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator17.addArrayList(node58);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer62 = null;
        java.nio.charset.Charset charset63 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator64 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer62, charset63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator64.addList(node65, true);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer70 = null;
        java.nio.charset.Charset charset71 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator72 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer70, charset71);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator72.addList(node73, true);
        com.google.javascript.rhino.Node node76 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context78 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator72.addList(node76, false, context78);
        codeGenerator64.addList(node68, false, context78);
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator64.addList(node81, true);
        com.google.javascript.rhino.Node node84 = null;
        codeGenerator64.addList(node84);
        com.google.javascript.rhino.Node node86 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context88 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator64.addList(node86, false, context88);
        codeGenerator17.addList(node60, false, context88);
        com.google.javascript.rhino.Node node91 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context93 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator17.addList(node91, true, context93);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node14, context93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context78 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context78.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context88 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context88.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context93 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context93.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) (byte) 10);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setTagAsStrict(true);
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setOutputCharset(charset18);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder17.setLineBreak(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) 'a');
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder15.setOutputTypes(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = builder19.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addList(node22, true);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator28.addList(node32, false, context34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator28.addList(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator28.addArrayList(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator28.addArrayList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator28.addArrayList(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        java.nio.charset.Charset charset47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer46, charset47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator48.addList(node49, true);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer54 = null;
        java.nio.charset.Charset charset55 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator56 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer54, charset55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator56.addList(node57, true);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context62 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator56.addList(node60, false, context62);
        codeGenerator48.addList(node52, false, context62);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator48.addList(node65, true);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator48.addList(node68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator48.addList(node70, false);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator48.addArrayList(node73);
        com.google.javascript.rhino.Node node75 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context77 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator48.addList(node75, true, context77);
        codeGenerator28.addList(node44, true, context77);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node25, context77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context77 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context77.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"\"/" + "'", str2, "/\"\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"\"/");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = builder13.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("//\"\\\"/  /\\\"\"//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"//////\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setOutputCharset(charset18);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.SourceMap sourceMap16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setSourceMap(sourceMap16);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder13.setLineLengthThreshold((int) 'a');
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder9.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setOutputTypes(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("///\"  \"///", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "////\"  \"////" + "'", str2, "////\"  \"////");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("///\"  \"///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///\"  \"///" + "'", str1, "///\"  \"///");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setLineLengthThreshold((int) (short) 0);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder9.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder9.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder21.setPrettyPrint(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = builder25.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  " + "'", str1, "  ");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/hi!/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineLengthThreshold((int) (byte) 1);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setSourceMapDetailLevel(detailLevel14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineLengthThreshold((int) (byte) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineLengthThreshold((int) (short) 0);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setTagAsStrict(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = builder7.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setTagAsStrict(false);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder1.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setOutputTypes(false);
        com.google.javascript.jscomp.SourceMap sourceMap14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setSourceMap(sourceMap14);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder11.setSourceMapDetailLevel(detailLevel16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setLineLengthThreshold((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = builder19.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setOutputCharset(charset12);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setPrettyPrint(true);
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder15.setOutputCharset(charset18);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineBreak(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = builder9.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/\"//\\\"/  /\\\"//\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(false);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setTagAsStrict(false);
        java.lang.Class<?> wildcardClass10 = builder9.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setLineLengthThreshold((int) (short) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder15.setTagAsStrict(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator31.addList(node35, false, context37);
        codeGenerator23.addList(node27, false, context37);
        codeGenerator2.addList(node19, true, context37);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator2.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator2.addList(node43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator2.addList(node45);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.SourceMap sourceMap20 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setSourceMap(sourceMap20);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder19.setLineLengthThreshold((int) (byte) -1);
        com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder19.setPrettyPrint(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineBreak(true);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPreferLineBreakAtEndOfFile(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = builder11.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"/\\\"\\\\\\\"  \\\\\\\"\\\"/\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"/\\\"\\\\\\\"  \\\\\\\"\\\"/\"//" + "'", str2, "//\"/\\\"\\\\\\\"  \\\\\\\"\\\"/\"//");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setTagAsStrict(true);
        com.google.javascript.jscomp.SourceMap sourceMap18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setSourceMap(sourceMap18);
        java.lang.Class<?> wildcardClass20 = builder19.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"hi!\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"hi!\"/" + "'", str2, "/\"hi!\"/");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        java.nio.charset.Charset charset13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12, charset13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator22.addList(node26, false, context28);
        codeGenerator14.addList(node18, false, context28);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator35.addList(node36, true);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer41 = null;
        java.nio.charset.Charset charset42 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator43 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer41, charset42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator43.addList(node44, true);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context49 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator43.addList(node47, false, context49);
        codeGenerator35.addList(node39, false, context49);
        codeGenerator14.addList(node31, true, context49);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator14.addArrayList(node53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator14.addArrayList(node55);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer59 = null;
        java.nio.charset.Charset charset60 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator61 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer59, charset60);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator61.addList(node62, true);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer67 = null;
        java.nio.charset.Charset charset68 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator69 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer67, charset68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator69.addList(node70, true);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context75 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator69.addList(node73, false, context75);
        codeGenerator61.addList(node65, false, context75);
        com.google.javascript.rhino.Node node78 = null;
        codeGenerator61.addList(node78, true);
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator61.addList(node81);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context85 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator61.addList(node83, false, context85);
        codeGenerator14.addList(node57, false, context85);
        codeGenerator2.addList(node10, false, context85);
        com.google.javascript.rhino.Node node89 = null;
        codeGenerator2.addList(node89);
        com.google.javascript.rhino.Node node91 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context75 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context75.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context85 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context85.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        java.nio.charset.Charset charset26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25, charset26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator27.addList(node28, true);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator35.addList(node36, true);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator35.addList(node39, false, context41);
        codeGenerator27.addList(node31, false, context41);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        java.nio.charset.Charset charset47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer46, charset47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator48.addList(node49, true);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer54 = null;
        java.nio.charset.Charset charset55 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator56 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer54, charset55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator56.addList(node57, true);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context62 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator56.addList(node60, false, context62);
        codeGenerator48.addList(node52, false, context62);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator48.addList(node65, true);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator48.addList(node68);
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context72 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator48.addList(node70, false, context72);
        codeGenerator27.addList(node44, true, context72);
        codeGenerator2.addList(node23, false, context72);
        com.google.javascript.rhino.Node node76 = null;
        codeGenerator2.addList(node76);
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context79 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node78, context79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context72 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context72.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context79 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context79.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setTagAsStrict(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        java.nio.charset.Charset charset13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12, charset13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator22.addList(node26, false, context28);
        codeGenerator14.addList(node18, false, context28);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator35.addList(node36, true);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer41 = null;
        java.nio.charset.Charset charset42 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator43 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer41, charset42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator43.addList(node44, true);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context49 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator43.addList(node47, false, context49);
        codeGenerator35.addList(node39, false, context49);
        codeGenerator14.addList(node31, true, context49);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator14.addArrayList(node53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator14.addArrayList(node55);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer59 = null;
        java.nio.charset.Charset charset60 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator61 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer59, charset60);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator61.addList(node62, true);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer67 = null;
        java.nio.charset.Charset charset68 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator69 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer67, charset68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator69.addList(node70, true);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context75 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator69.addList(node73, false, context75);
        codeGenerator61.addList(node65, false, context75);
        com.google.javascript.rhino.Node node78 = null;
        codeGenerator61.addList(node78, true);
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator61.addList(node81);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context85 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator61.addList(node83, false, context85);
        codeGenerator14.addList(node57, false, context85);
        codeGenerator2.addList(node10, false, context85);
        com.google.javascript.rhino.Node node89 = null;
        codeGenerator2.addList(node89);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context75 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context75.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context85 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context85.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("//\"/\\\"\\\\\\\"  \\\\\\\"\\\"/\"//");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(false);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setOutputTypes(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setOutputCharset(charset10);
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setOutputCharset(charset12);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setOutputTypes(true);
        java.lang.Class<?> wildcardClass16 = builder15.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator31.addList(node35, false, context37);
        codeGenerator23.addList(node27, false, context37);
        codeGenerator2.addList(node19, true, context37);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator2.addArrayList(node41);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) (byte) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = builder9.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setLineLengthThreshold((int) (short) 0);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder9.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder9.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder23.setSourceMapDetailLevel(detailLevel24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineLengthThreshold((int) (byte) 100);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setSourceMapDetailLevel(detailLevel14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator31.addList(node35, false, context37);
        codeGenerator23.addList(node27, false, context37);
        codeGenerator2.addList(node19, true, context37);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator2.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator2.addList(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        java.nio.charset.Charset charset48 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator49 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47, charset48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator49.addList(node50, true);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        java.nio.charset.Charset charset56 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator57 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer55, charset56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator57.addList(node58, true);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context63 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator57.addList(node61, false, context63);
        codeGenerator49.addList(node53, false, context63);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator49.addList(node66, true);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator49.addList(node69);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator49.addList(node71, false);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator49.addArrayList(node74);
        com.google.javascript.rhino.Node node76 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context78 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator49.addList(node76, true, context78);
        codeGenerator2.addList(node45, false, context78);
        com.google.javascript.rhino.Node node81 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context63 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context63.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context78 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context78.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"///  ///\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) 'a');
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setPrettyPrint(true);
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder17.setOutputCharset(charset20);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) '4');
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setSourceMapDetailLevel(detailLevel8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator10.addList(node14, false, context16);
        codeGenerator2.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator31.addList(node35, false, context37);
        codeGenerator23.addList(node27, false, context37);
        codeGenerator2.addList(node19, true, context37);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator2.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator2.addList(node43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator2.addList(node45);
        com.google.javascript.rhino.Node node47 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap sourceMap16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder9.setSourceMap(sourceMap16);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setLineLengthThreshold((int) (byte) -1);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder17.setPrettyPrint(false);
        com.google.javascript.jscomp.SourceMap sourceMap22 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setSourceMap(sourceMap22);
        com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder23.setOutputTypes(true);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder27 = builder25.setSourceMapDetailLevel(detailLevel26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
    }
}

