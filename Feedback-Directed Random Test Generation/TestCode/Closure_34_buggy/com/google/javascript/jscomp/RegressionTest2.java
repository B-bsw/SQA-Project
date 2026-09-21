package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder15.setOutputTypes(false);
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
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineBreak(true);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setSourceMap(sourceMap6);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder3.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPrettyPrint(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("////////");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setSourceMapDetailLevel(detailLevel20);
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
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator39.addList(node56, true);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator39.addList(node59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context63 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator39.addList(node61, false, context63);
        codeGenerator18.addList(node35, true, context63);
        codeGenerator2.addList(node14, true, context63);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator2.addArrayList(node67);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator2.addAllSiblings(node69);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator2.addArrayList(node71);
        com.google.javascript.rhino.Node node73 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context63 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context63.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator39.addList(node56, true);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator39.addList(node59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context63 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator39.addList(node61, false, context63);
        codeGenerator18.addList(node35, true, context63);
        codeGenerator2.addList(node14, true, context63);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator2.addList(node67, false);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator2.addList(node70);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator2.addArrayList(node72);
        com.google.javascript.rhino.Node node74 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context63 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context63.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) (byte) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setOutputTypes(false);
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
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"///\\\"//\\\\\\\"\\\\\\\"//\\\"///\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"///\\\"//\\\\\\\"\\\\\\\"//\\\"///\"//" + "'", str2, "//\"///\\\"//\\\\\\\"\\\\\\\"//\\\"///\"//");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator39.addList(node56, true);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator39.addList(node59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context63 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator39.addList(node61, false, context63);
        codeGenerator18.addList(node35, true, context63);
        codeGenerator2.addList(node14, true, context63);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator2.addArrayList(node67);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator2.addAllSiblings(node69);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator2.addAllSiblings(node71);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator2.addList(node73, false);
        com.google.javascript.rhino.Node node76 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context63 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context63.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setPreferLineBreakAtEndOfFile(false);
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setOutputCharset(charset14);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setLineLengthThreshold((int) (byte) 10);
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
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setPreferLineBreakAtEndOfFile(true);
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
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
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
        codeGenerator2.addList(node20);
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/\\\"//////\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"//////\\\"/\"" + "'", str1, "\"/\\\"//////\\\"/\"");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineLengthThreshold((int) (byte) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineLengthThreshold((int) (short) 0);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPrettyPrint(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator2.addAllSiblings(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator2.addList(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator2.addList(node54, true);
        com.google.javascript.rhino.Node node57 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) '4');
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPreferLineBreakAtEndOfFile(false);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineBreak(true);
        com.google.javascript.jscomp.SourceMap sourceMap14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setSourceMap(sourceMap14);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setPrettyPrint(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder17.setPreferLineBreakAtEndOfFile(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = builder21.build();
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
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineBreak(true);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder7.setPrettyPrint(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setPrettyPrint(true);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder9.setSourceMapDetailLevel(detailLevel16);
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
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder11.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder11.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setPrettyPrint(true);
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
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) '4');
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineLengthThreshold((int) (short) 1);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setPreferLineBreakAtEndOfFile(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("////////");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineBreak(true);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder3.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder3.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setPrettyPrint(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineLengthThreshold((int) (byte) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineBreak(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineLengthThreshold((int) (byte) 10);
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
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setPreferLineBreakAtEndOfFile(true);
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
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
        codeGenerator2.addList(node11, false);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/\"\\\"//  //\\\"\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
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
        com.google.javascript.rhino.Node node88 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context90 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator14.addList(node88, true, context90);
        codeGenerator2.addList(node10, false, context90);
        com.google.javascript.rhino.Node node93 = null;
        codeGenerator2.addList(node93);
        com.google.javascript.rhino.Node node95 = null;
        codeGenerator2.addAllSiblings(node95);
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context75 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context75.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context85 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context85.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context90 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context90.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setLineBreak(true);
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
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"\\\"\\\\\\\"  \\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder15.setPreferLineBreakAtEndOfFile(false);
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
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"///\\\"//\\\\\\\"\\\\\\\"//\\\"///\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"///\\\"//\\\\\\\"\\\\\\\"//\\\"///\"/" + "'", str1, "/\"///\\\"//\\\\\\\"\\\\\\\"//\\\"///\"/");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setLineBreak(true);
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
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineBreak(true);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setLineLengthThreshold((int) (short) 10);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder15.setPrettyPrint(false);
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
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineLengthThreshold((int) (short) 10);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
        com.google.javascript.jscomp.SourceMap sourceMap18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setSourceMap(sourceMap18);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setLineLengthThreshold((int) (byte) 0);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder19.setTagAsStrict(false);
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
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator2.addArrayList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator2.addAllSiblings(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator2.addAllSiblings(node29);
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
        codeGenerator2.addList(node91, false);
        com.google.javascript.rhino.Node node94 = null;
        codeGenerator2.addList(node94, true);
        java.lang.Class<?> wildcardClass97 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context75 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context75.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context85 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context85.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
        com.google.javascript.jscomp.SourceMap sourceMap18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder9.setSourceMap(sourceMap18);
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
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
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
        codeGenerator2.addAllSiblings(node10);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setOutputCharset(charset8);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setTagAsStrict(true);
        java.lang.Class<?> wildcardClass10 = builder7.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
            codeGenerator2.add(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setOutputCharset(charset14);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setLineLengthThreshold((int) (short) 100);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder23.setOutputTypes(true);
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
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineLengthThreshold((int) (byte) 1);
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setOutputCharset(charset14);
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
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"/\\\"\\\\\\\"  \\\\\\\"\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"  \\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"" + "'", str1, "\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"  \\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
        codeGenerator2.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setTagAsStrict(false);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputCharset(charset8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = builder7.build();
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
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) (short) 10);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder13.setPreferLineBreakAtEndOfFile(true);
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
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
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
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder13.setOutputCharset(charset18);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setLineLengthThreshold(1);
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder19.setOutputCharset(charset22);
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
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node76);
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
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
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
            codeGenerator2.add("/  /");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer48 = null;
        java.nio.charset.Charset charset49 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator50 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer48, charset49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator50.addList(node51, true);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context56 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator50.addList(node54, false, context56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context60 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator50.addList(node58, true, context60);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node47, context60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context56 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context56.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context60 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context60.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) '4');
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPreferLineBreakAtEndOfFile(false);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder1.setLineLengthThreshold((int) (short) 10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder1.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setTagAsStrict(true);
        com.google.javascript.jscomp.SourceMap sourceMap16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setSourceMap(sourceMap16);
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
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        codeGenerator2.addArrayList(node68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator2.addList(node70, false);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator2.addList(node73);
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context61 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context61.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"/\\\"\\\\\\\"/  /\\\\\\\"\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"/  /\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"" + "'", str1, "\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"/  /\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer36 = null;
        java.nio.charset.Charset charset37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer36, charset37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator38.addList(node39, true);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context44 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator38.addList(node42, false, context44);
        codeGenerator30.addList(node34, false, context44);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator30.addArrayList(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator30.addList(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator30.addList(node51, false);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator30.addAllSiblings(node54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer58 = null;
        java.nio.charset.Charset charset59 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator60 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer58, charset59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator60.addAllSiblings(node61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator60.addAllSiblings(node63);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context67 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator60.addList(node65, false, context67);
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer71 = null;
        java.nio.charset.Charset charset72 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator73 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer71, charset72);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator73.addAllSiblings(node74);
        com.google.javascript.rhino.Node node76 = null;
        codeGenerator73.addAllSiblings(node76);
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context80 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator73.addList(node78, false, context80);
        codeGenerator60.addList(node69, false, context80);
        codeGenerator30.addList(node56, false, context80);
        codeGenerator2.addList(node26, true, context80);
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context44 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context44.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context67 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context67.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context80 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context80.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineLengthThreshold((int) (short) 10);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPrettyPrint(true);
        com.google.javascript.jscomp.SourceMap sourceMap14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setSourceMap(sourceMap14);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap sourceMap18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setSourceMap(sourceMap18);
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
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(true);
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
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
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
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
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
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) '4');
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPreferLineBreakAtEndOfFile(false);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineBreak(true);
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setOutputCharset(charset14);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/////\"//\\\"\\\"//\"/////");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/////\\\"//\\\\\\\"\\\\\\\"//\\\"/////\"" + "'", str1, "\"/////\\\"//\\\\\\\"\\\\\\\"//\\\"/////\"");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
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
        codeGenerator2.addArrayList(node78);
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
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setTagAsStrict(false);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputCharset(charset8);
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
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineLengthThreshold((int) (byte) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineLengthThreshold((int) (short) 0);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPrettyPrint(false);
        com.google.javascript.jscomp.SourceMap sourceMap10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setSourceMap(sourceMap10);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setLineLengthThreshold((int) (short) 100);
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setOutputCharset(charset20);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setOutputTypes(true);
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
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("///\"hi!\"///", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "////\"hi!\"////" + "'", str2, "////\"hi!\"////");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        codeGenerator2.addList(node23, false);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator2.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        java.nio.charset.Charset charset31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30, charset31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator32.addAllSiblings(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator32.addList(node37, false, context39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        java.nio.charset.Charset charset44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer43, charset44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator45.addAllSiblings(node46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator45.addAllSiblings(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator45.addList(node50, false, context52);
        codeGenerator32.addList(node41, false, context52);
        codeGenerator2.addList(node28, false, context52);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator2.addList(node56);
        com.google.javascript.rhino.Node node58 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineLengthThreshold((int) (byte) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setPrettyPrint(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.SourceMap sourceMap10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setSourceMap(sourceMap10);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setSourceMapDetailLevel(detailLevel12);
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
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder19.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder19.setPrettyPrint(true);
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
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"//  //\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\\\"//  //\\\"\"/" + "'", str1, "/\"\\\"//  //\\\"\"/");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
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
        codeGenerator2.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addList(node22);
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder13.setLineBreak(false);
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
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder15.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setLineLengthThreshold((int) (short) 0);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setSourceMapDetailLevel(detailLevel22);
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
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineLengthThreshold((int) (short) 10);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineLengthThreshold(0);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setPrettyPrint(false);
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
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"" + "'", str1, "\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder21.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder27 = builder21.setPreferLineBreakAtEndOfFile(false);
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
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
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
        com.google.javascript.jscomp.SourceMap sourceMap18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setSourceMap(sourceMap18);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setLineLengthThreshold((-1));
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
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setPreferLineBreakAtEndOfFile(false);
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
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
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
        codeGenerator2.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addArrayList(node23);
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
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
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
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addAllSiblings(node24);
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) (short) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setPreferLineBreakAtEndOfFile(true);
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
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
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
            codeGenerator2.add("//  //");
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
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
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
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//hi!//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "///hi!///" + "'", str2, "///hi!///");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
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
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineLengthThreshold((int) (byte) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setLineLengthThreshold((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = builder1.build();
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
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"//\\\"/\\\\\\\"\\\\\\\\\\\\\\\"  \\\\\\\\\\\\\\\"\\\\\\\"/\\\"//\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        codeGenerator2.addAllSiblings(node20);
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"//\\\"/  /\\\"//\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//\"/////  /////\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//\\\"/////  /////\\\"//\"" + "'", str1, "\"//\\\"/////  /////\\\"//\"");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
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
        com.google.javascript.jscomp.SourceMap sourceMap18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder15.setSourceMap(sourceMap18);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder15.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder15.setOutputTypes(false);
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
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineLengthThreshold((int) (byte) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineLengthThreshold((int) (short) 0);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder7.setLineBreak(true);
        java.lang.Class<?> wildcardClass14 = builder7.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineLengthThreshold((int) (short) 10);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(true);
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setOutputCharset(charset12);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setTagAsStrict(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPreferLineBreakAtEndOfFile(false);
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputCharset(charset12);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"/  /\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(false);
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
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
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
        codeGenerator2.addList(node68, false);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator2.addList(node71, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/\"hi!\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context61 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context61.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setOutputCharset(charset14);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setTagAsStrict(false);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(false);
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputCharset(charset12);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineBreak(true);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setSourceMap(sourceMap6);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder3.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("////  ////");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"////  ////\"" + "'", str1, "\"////  ////\"");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder11.setLineBreak(true);
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
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setPrettyPrint(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
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
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator39.addList(node56, true);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator39.addList(node59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context63 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator39.addList(node61, false, context63);
        codeGenerator18.addList(node35, true, context63);
        codeGenerator2.addList(node14, true, context63);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator2.addArrayList(node67);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator2.addAllSiblings(node69);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator2.addList(node71, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context63 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context63.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineLengthThreshold((-1));
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setPrettyPrint(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) (short) 1);
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
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
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
        codeGenerator2.addArrayList(node14);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("//\"\\\"\\\\\\\"  \\\\\\\"\\\"\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"//////\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"\\\"//////\\\"\"/" + "'", str2, "/\"\\\"//////\\\"\"/");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineBreak(true);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder9.setPrettyPrint(true);
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
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
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
        codeGenerator2.addList(node53);
        com.google.javascript.rhino.Node node55 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
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
        codeGenerator2.addAllSiblings(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator2.addAllSiblings(node27);
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
        codeGenerator2.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator2.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator2.addAllSiblings(node30);
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"\\\"/\\\\\\\"//  //\\\\\\\"/\\\"\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineBreak(true);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setPreferLineBreakAtEndOfFile(true);
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
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setPrettyPrint(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"\\\"///\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"///\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setPreferLineBreakAtEndOfFile(true);
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
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
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
        com.google.javascript.jscomp.CodeGenerator.Context context47 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node45, false, context47);
        com.google.javascript.rhino.Node node49 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"/" + "'", str2, "/\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"/");
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
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
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder13.setOutputCharset(charset18);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setLineLengthThreshold(1);
        com.google.javascript.jscomp.SourceMap sourceMap22 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder19.setSourceMap(sourceMap22);
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
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/////  /////\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/////  /////\"" + "'", str1, "\"/////  /////\"");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
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
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineLengthThreshold((int) (byte) 1);
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setOutputCharset(charset14);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder13.setTagAsStrict(true);
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
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator20.addList(node24, false, context26);
        codeGenerator12.addList(node16, false, context26);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator12.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator12.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        java.nio.charset.Charset charset36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35, charset36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator37.addList(node38, true);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        java.nio.charset.Charset charset44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer43, charset44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator45.addList(node46, true);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator45.addList(node49, false, context51);
        codeGenerator37.addList(node41, false, context51);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer56 = null;
        java.nio.charset.Charset charset57 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator58 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer56, charset57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator58.addList(node59, true);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer64 = null;
        java.nio.charset.Charset charset65 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator66 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer64, charset65);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator66.addList(node67, true);
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context72 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator66.addList(node70, false, context72);
        codeGenerator58.addList(node62, false, context72);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator58.addList(node75, true);
        com.google.javascript.rhino.Node node78 = null;
        codeGenerator58.addList(node78);
        com.google.javascript.rhino.Node node80 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context82 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator58.addList(node80, false, context82);
        codeGenerator37.addList(node54, true, context82);
        codeGenerator12.addList(node33, false, context82);
        codeGenerator2.addList(node8, true, context82);
        com.google.javascript.rhino.Node node87 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context72 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context72.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context82 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context82.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6, true);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addArrayList(node14);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) (byte) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineLengthThreshold((int) (byte) 100);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineLengthThreshold((int) (byte) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPrettyPrint(true);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
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
        codeGenerator2.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, false);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder27 = builder23.setPrettyPrint(true);
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
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setTagAsStrict(false);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineLengthThreshold((int) (byte) 100);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/\\\"//  //\\\"/\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"/\\\"//  //\\\"/\"/" + "'", str2, "/\"/\\\"//  //\\\"/\"/");
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder19.setLineBreak(false);
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
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/\\\"/////  /////\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"/////  /////\\\"/\"" + "'", str1, "\"/\\\"/////  /////\\\"/\"");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"//\\\"  \\\"//\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"//\\\"  \\\"//\"/" + "'", str1, "/\"//\\\"  \\\"//\"/");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setTagAsStrict(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = builder7.build();
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
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) (byte) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) '4');
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
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(false);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setPrettyPrint(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineBreak(true);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setPrettyPrint(false);
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
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        java.lang.Class<?> wildcardClass18 = builder17.getClass();
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
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineBreak(true);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setOutputTypes(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("////\"//\\\"\\\"//\"////");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setTagAsStrict(false);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(false);
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
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder17.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setOutputTypes(true);
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
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("///\"//////\"///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"///\\\"//////\\\"///\"" + "'", str1, "\"///\\\"//////\\\"///\"");
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setLineBreak(true);
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
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//\"\\\"\\\\\\\"  \\\\\\\"\\\"\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"\\\"\\\\\\\"  \\\\\\\"\\\"\"//" + "'", str1, "//\"\\\"\\\\\\\"  \\\\\\\"\\\"\"//");
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(false);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputTypes(true);
        java.lang.Class<?> wildcardClass10 = builder7.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
        codeGenerator2.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator2.addArrayList(node25);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("////  ////");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder11.setTagAsStrict(false);
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
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) '#');
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setLineLengthThreshold(500);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder17.setOutputTypes(true);
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
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
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
        codeGenerator2.addAllSiblings(node76);
        com.google.javascript.rhino.Node node78 = null;
        codeGenerator2.addList(node78);
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context72 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context72.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setTagAsStrict(false);
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
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setSourceMapDetailLevel(detailLevel6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        com.google.javascript.rhino.Node node88 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context90 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator14.addList(node88, true, context90);
        codeGenerator2.addList(node10, false, context90);
        com.google.javascript.rhino.Node node93 = null;
        codeGenerator2.addList(node93);
        com.google.javascript.rhino.Node node95 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context75 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context75.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context85 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context85.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context90 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context90.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineLengthThreshold((int) (short) 10);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPrettyPrint(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.SourceMap sourceMap10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setSourceMap(sourceMap10);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
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
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator2.addAllSiblings(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator2.addList(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator2.addList(node54, true);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator2.addArrayList(node57);
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineLengthThreshold((int) (byte) 100);
        com.google.javascript.jscomp.SourceMap sourceMap10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setSourceMap(sourceMap10);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//\"/\\\"\\\"/\"//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "///\"/\\\"\\\"/\"///" + "'", str2, "///\"/\\\"\\\"/\"///");
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder13.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setLineBreak(false);
        java.nio.charset.Charset charset24 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder23.setOutputCharset(charset24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = builder23.build();
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
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setTagAsStrict(false);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineBreak(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setOutputCharset(charset18);
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
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, false);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
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
        com.google.javascript.jscomp.SourceMap sourceMap22 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setSourceMap(sourceMap22);
        com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder21.setPrettyPrint(false);
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
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node76);
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
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
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
        codeGenerator2.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        java.lang.Class<?> wildcardClass16 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
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
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node18, true, context20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
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
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node12, context13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineLengthThreshold((int) (byte) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPrettyPrint(true);
        java.lang.Class<?> wildcardClass10 = builder9.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//\"/\\\"hi!\\\"/\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"/\\\"hi!\\\"/\"//" + "'", str1, "//\"/\\\"hi!\\\"/\"//");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
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
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator39.addList(node56, true);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator39.addList(node59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context63 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator39.addList(node61, false, context63);
        codeGenerator18.addList(node35, true, context63);
        codeGenerator2.addList(node14, true, context63);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator2.addArrayList(node67);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator2.addAllSiblings(node69);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator2.addArrayList(node71);
        com.google.javascript.rhino.Node node73 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context63 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context63.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        codeGenerator2.addList(node50, false);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator2.addList(node53, false);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator2.addArrayList(node56);
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
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
        codeGenerator2.addList(node28, true);
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setLineLengthThreshold((int) (byte) 0);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder11.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setPrettyPrint(true);
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
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, true);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, false);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder15.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder15.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setLineBreak(true);
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
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
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
        codeGenerator2.addList(node28);
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
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
        codeGenerator2.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = null;
        codeGenerator2.addList(node30, false, context32);
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder17.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder17.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder23.setTagAsStrict(false);
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
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder1.setLineLengthThreshold((int) (byte) 1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
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
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator39.addList(node56, true);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator39.addList(node59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context63 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator39.addList(node61, false, context63);
        codeGenerator18.addList(node35, true, context63);
        codeGenerator2.addList(node14, true, context63);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator2.addArrayList(node67);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator2.addAllSiblings(node69);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator2.addAllSiblings(node71);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator2.addList(node73, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context63 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context63.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setLineLengthThreshold((-1));
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setPrettyPrint(true);
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
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"/  /\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"\\\"/  /\\\"\"/" + "'", str2, "/\"\\\"/  /\\\"\"/");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setOutputTypes(true);
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
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator7 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5, charset6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator7.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addList(node16, true);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator15.addList(node19, false, context21);
        codeGenerator7.addList(node11, false, context21);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        java.nio.charset.Charset charset35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer34, charset35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator36.addList(node37, true);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator36.addList(node40, false, context42);
        codeGenerator28.addList(node32, false, context42);
        codeGenerator7.addList(node24, true, context42);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator7.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator7.addArrayList(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer52 = null;
        java.nio.charset.Charset charset53 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator54 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer52, charset53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator54.addList(node55, true);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer60 = null;
        java.nio.charset.Charset charset61 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator62 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer60, charset61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator62.addList(node63, true);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context68 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator62.addList(node66, false, context68);
        codeGenerator54.addList(node58, false, context68);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator54.addList(node71, true);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator54.addList(node74);
        com.google.javascript.rhino.Node node76 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context78 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator54.addList(node76, false, context78);
        codeGenerator7.addList(node50, false, context78);
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator7.addList(node81);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context85 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator7.addList(node83, false, context85);
        codeGenerator2.addList(node3, true, context85);
        com.google.javascript.rhino.Node node88 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context68 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context68.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context78 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context78.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context85 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context85.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        codeGenerator2.addList(node78, false);
        com.google.javascript.rhino.Node node81 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context83 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node81, true, context83);
        com.google.javascript.rhino.Node node85 = null;
        codeGenerator2.addAllSiblings(node85);
        com.google.javascript.rhino.Node node87 = null;
        codeGenerator2.addArrayList(node87);
        com.google.javascript.rhino.Node node89 = null;
        codeGenerator2.addList(node89, true);
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context63 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context63.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context73 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context73.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context83 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context83.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"//\\\"  \\\"//\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder1.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder1.setTagAsStrict(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
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
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setPrettyPrint(true);
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
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPrettyPrint(true);
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setOutputCharset(charset14);
        com.google.javascript.jscomp.SourceMap sourceMap16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setSourceMap(sourceMap16);
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
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
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
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setOutputTypes(false);
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
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) (short) 10);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setTagAsStrict(true);
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
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputTypes(false);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator39.addList(node56, true);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator39.addList(node59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context63 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator39.addList(node61, false, context63);
        codeGenerator18.addList(node35, true, context63);
        codeGenerator2.addList(node14, true, context63);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator2.addArrayList(node67);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator2.addAllSiblings(node69);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator2.addAllSiblings(node71);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator2.addList(node73);
        com.google.javascript.rhino.Node node75 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context63 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context63.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setOutputTypes(false);
        java.lang.Class<?> wildcardClass20 = builder17.getClass();
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
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineLengthThreshold((int) (short) 10);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineLengthThreshold(0);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) '4');
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
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("//\"\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"\"//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineLengthThreshold((int) (byte) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) '#');
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
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
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
        codeGenerator2.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator2.addList(node25, false);
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setLineBreak(true);
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
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"//////\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"//////\"/" + "'", str1, "/\"//////\"/");
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setLineLengthThreshold((int) (short) 100);
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
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//\"///\\\"//\\\\\\\"\\\\\\\"//\\\"///\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//\\\"///\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"///\\\"//\"" + "'", str1, "\"//\\\"///\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"///\\\"//\"");
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setLineLengthThreshold((int) (short) 100);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder17.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setLineBreak(true);
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
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
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
        java.lang.Class<?> wildcardClass29 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setLineBreak(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setLineLengthThreshold((int) (byte) 10);
        com.google.javascript.jscomp.SourceMap sourceMap12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder7.setSourceMap(sourceMap12);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
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
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder9.setOutputCharset(charset20);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder23.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder27 = builder25.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder29 = builder27.setOutputTypes(false);
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
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputTypes(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = builder7.build();
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
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder7.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setLineLengthThreshold((int) (short) 10);
        com.google.javascript.jscomp.SourceMap sourceMap18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder15.setSourceMap(sourceMap18);
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
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder13.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder23.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder27 = builder23.setPreferLineBreakAtEndOfFile(false);
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
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
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
        java.nio.charset.Charset charset26 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder27 = builder23.setOutputCharset(charset26);
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
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) '4');
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPreferLineBreakAtEndOfFile(false);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder1.setLineLengthThreshold((int) (short) 10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder1.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setTagAsStrict(true);
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
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
        codeGenerator2.addAllSiblings(node24);
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
            codeGenerator2.add("/\"/\\\"hi!\\\"/\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setTagAsStrict(true);
        com.google.javascript.jscomp.SourceMap sourceMap10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setSourceMap(sourceMap10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setPreferLineBreakAtEndOfFile(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context10 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node8, true, context10);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/\"//////\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
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
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addAllSiblings(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator26.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator26.addList(node31, false, context33);
        codeGenerator2.addList(node22, false, context33);
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/\\\"\\\\\\\"  \\\\\\\"\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"\\\\\\\"  \\\\\\\"\\\"/\"" + "'", str1, "\"/\\\"\\\\\\\"  \\\\\\\"\\\"/\"");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
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
        codeGenerator2.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator20.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator20.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator20.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator20.addAllSiblings(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator20.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer36 = null;
        java.nio.charset.Charset charset37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer36, charset37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator38.addList(node39, true);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context44 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator38.addList(node42, false, context44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator38.addList(node46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator38.addArrayList(node48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator38.addList(node50, true);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator38.addArrayList(node53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator38.addList(node55);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context59 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator38.addList(node57, true, context59);
        codeGenerator20.addList(node34, true, context59);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node17, context59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context44 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context44.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context59 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context59.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"\\\"//////\\\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"\\\"//////\\\"\"//" + "'", str1, "//\"\\\"//////\\\"\"//");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
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
        codeGenerator2.addArrayList(node89);
        com.google.javascript.rhino.Node node91 = null;
        codeGenerator2.addArrayList(node91);
        com.google.javascript.rhino.Node node93 = null;
        codeGenerator2.addArrayList(node93);
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context75 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context75.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context85 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context85.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
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
        codeGenerator2.addList(node53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator2.addList(node55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator2.addArrayList(node57);
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setTagAsStrict(false);
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
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
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
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setOutputCharset(charset18);
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setOutputCharset(charset20);
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
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
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
        codeGenerator2.addList(node91);
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context75 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context75.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context85 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context85.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
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
        codeGenerator2.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator2.addList(node47, true);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator2.addList(node50, false);
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder19.setTagAsStrict(true);
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
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10, true);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, true);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
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
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setOutputCharset(charset18);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setLineLengthThreshold((int) (short) -1);
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
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setOutputCharset(charset18);
        com.google.javascript.jscomp.SourceMap sourceMap20 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setSourceMap(sourceMap20);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder19.setOutputTypes(true);
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
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
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
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setOutputCharset(charset18);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder19.setPrettyPrint(false);
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
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineLengthThreshold((int) (byte) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineLengthThreshold((int) (short) 0);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setTagAsStrict(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setLineBreak(true);
        com.google.javascript.jscomp.SourceMap sourceMap10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setSourceMap(sourceMap10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setTagAsStrict(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) (byte) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineBreak(false);
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
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
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
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setTagAsStrict(true);
        com.google.javascript.jscomp.SourceMap sourceMap10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setSourceMap(sourceMap10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setOutputTypes(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
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
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator2.addAllSiblings(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator2.addList(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator2.addList(node54, true);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator2.addList(node57, true);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator2.addList(node60, false);
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
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
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
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
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineBreak(true);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPrettyPrint(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setTagAsStrict(true);
        com.google.javascript.jscomp.SourceMap sourceMap10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setSourceMap(sourceMap10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineBreak(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//\"\\\"/  /\\\"\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//\\\"\\\\\\\"/  /\\\\\\\"\\\"//\"" + "'", str1, "\"//\\\"\\\\\\\"/  /\\\\\\\"\\\"//\"");
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//\"/\\\"\\\"/\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//\\\"/\\\\\\\"\\\\\\\"/\\\"//\"" + "'", str1, "\"//\\\"/\\\\\\\"\\\\\\\"/\\\"//\"");
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
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
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addAllSiblings(node18);
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addList(node16, true);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator15.addList(node19, false, context21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator15.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator15.addArrayList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator15.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator15.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator15.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator15.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        java.nio.charset.Charset charset38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37, charset38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator39.addList(node40, true);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator39.addList(node43, false, context45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator39.addList(node47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer51 = null;
        java.nio.charset.Charset charset52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer51, charset52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator53.addList(node54, true);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer59 = null;
        java.nio.charset.Charset charset60 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator61 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer59, charset60);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator61.addList(node62, true);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context67 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator61.addList(node65, false, context67);
        codeGenerator53.addList(node57, false, context67);
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer72 = null;
        java.nio.charset.Charset charset73 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator74 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer72, charset73);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator74.addList(node75, true);
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer80 = null;
        java.nio.charset.Charset charset81 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator82 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer80, charset81);
        com.google.javascript.rhino.Node node83 = null;
        codeGenerator82.addList(node83, true);
        com.google.javascript.rhino.Node node86 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context88 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator82.addList(node86, false, context88);
        codeGenerator74.addList(node78, false, context88);
        codeGenerator53.addList(node70, true, context88);
        codeGenerator39.addList(node49, false, context88);
        codeGenerator15.addList(node35, false, context88);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node12, context88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context67 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context67.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context88 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context88.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
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
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setOutputCharset(charset14);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder11.setLineBreak(true);
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
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"/" + "'", str1, "/\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"/");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineBreak(true);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) (byte) 1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
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
        codeGenerator2.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node18, false, context20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addAllSiblings(node22);
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineLengthThreshold((int) 'a');
        java.lang.Class<?> wildcardClass12 = builder11.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"//\\\"hi!\\\"//\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"//\\\\\\\"hi!\\\\\\\"//\\\"\"" + "'", str1, "\"\\\"//\\\\\\\"hi!\\\\\\\"//\\\"\"");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder15.setLineBreak(false);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setSourceMapDetailLevel(detailLevel20);
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
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineLengthThreshold((int) (byte) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) '#');
        com.google.javascript.jscomp.SourceMap sourceMap16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setSourceMap(sourceMap16);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setLineBreak(false);
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder19.setOutputCharset(charset22);
        com.google.javascript.jscomp.SourceMap sourceMap24 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder19.setSourceMap(sourceMap24);
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
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
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
        com.google.javascript.jscomp.SourceMap sourceMap18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setSourceMap(sourceMap18);
        com.google.javascript.jscomp.SourceMap sourceMap20 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder17.setSourceMap(sourceMap20);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setOutputTypes(true);
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
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setPreferLineBreakAtEndOfFile(true);
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
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) (byte) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineLengthThreshold((int) (byte) 100);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
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
        codeGenerator2.addAllSiblings(node25);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("////");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"  \\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
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
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node18, true, context20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addArrayList(node22);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPrettyPrint(true);
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
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
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
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/  /");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setPrettyPrint(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = builder5.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setTagAsStrict(false);
        java.lang.Class<?> wildcardClass18 = builder17.getClass();
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
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineLengthThreshold((int) (byte) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineLengthThreshold((int) (short) 0);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineBreak(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder15.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder15.setTagAsStrict(false);
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
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder17.setTagAsStrict(false);
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
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineBreak(true);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setSourceMap(sourceMap6);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder7.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder7.setPreferLineBreakAtEndOfFile(true);
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
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder13.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder21.setPreferLineBreakAtEndOfFile(false);
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
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) ' ');
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
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
        com.google.javascript.jscomp.SourceMap sourceMap20 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setSourceMap(sourceMap20);
        com.google.javascript.jscomp.SourceMap sourceMap22 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setSourceMap(sourceMap22);
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
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineLengthThreshold((int) (byte) 10);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setLineBreak(false);
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
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineLengthThreshold((int) (byte) 1);
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setOutputCharset(charset14);
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
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder5.setTagAsStrict(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
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
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator39.addList(node56, true);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator39.addList(node59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context63 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator39.addList(node61, false, context63);
        codeGenerator18.addList(node35, true, context63);
        codeGenerator2.addList(node14, true, context63);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator2.addArrayList(node67);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator2.addAllSiblings(node69);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context73 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node71, false, context73);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator2.addAllSiblings(node75);
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context63 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context63.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context73 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context73.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
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
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator39.addList(node56, true);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator39.addList(node59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context63 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator39.addList(node61, false, context63);
        codeGenerator18.addList(node35, true, context63);
        codeGenerator2.addList(node14, true, context63);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator2.addList(node67, false);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator2.addList(node70);
        com.google.javascript.rhino.Node node72 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context63 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context63.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineLengthThreshold((int) (byte) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) '#');
        com.google.javascript.jscomp.SourceMap sourceMap16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setSourceMap(sourceMap16);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setLineBreak(false);
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder19.setOutputCharset(charset22);
        com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder19.setTagAsStrict(false);
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
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) (short) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.SourceMap sourceMap18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setSourceMap(sourceMap18);
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
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder9.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder9.setLineLengthThreshold((int) (byte) 0);
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
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"/\\\"\\\\\\\"  \\\\\\\"\\\"/\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"/\\\"\\\\\\\"  \\\\\\\"\\\"/\"//" + "'", str1, "//\"/\\\"\\\\\\\"  \\\\\\\"\\\"/\"//");
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"" + "'", str1, "\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"");
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
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
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder3.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.SourceMap sourceMap10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder3.setSourceMap(sourceMap10);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("////\"hi!\"////");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"/" + "'", str1, "/\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"/");
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setLineLengthThreshold(10);
        java.lang.Class<?> wildcardClass12 = builder11.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) (byte) 100);
        com.google.javascript.jscomp.SourceMap sourceMap16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setSourceMap(sourceMap16);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder13.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder13.setTagAsStrict(false);
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
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setOutputTypes(true);
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
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineLengthThreshold((int) (byte) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) '#');
        com.google.javascript.jscomp.SourceMap sourceMap16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setSourceMap(sourceMap16);
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
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
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
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addArrayList(node18);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/\"\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("///hi!///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "////hi!////" + "'", str1, "////hi!////");
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/\"/\\\"\\\\\\\"  \\\\\\\"\\\"/\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context61 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context61.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((-1));
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
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
            codeGenerator2.add("//\"///\\\"//\\\\\\\"\\\\\\\"//\\\"///\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.SourceMap sourceMap22 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder19.setSourceMap(sourceMap22);
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
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
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
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, true);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node19, true, context21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addList(node27, true);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator26.addList(node30, false, context32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator26.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator26.addArrayList(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator26.addList(node38, true);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator26.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator26.addList(node43, false, context45);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node23, context45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/\"/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineLengthThreshold((int) (short) 10);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setPrettyPrint(false);
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
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addAllSiblings(node10);
        java.lang.Class<?> wildcardClass12 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineBreak(true);
        com.google.javascript.jscomp.SourceMap sourceMap12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setSourceMap(sourceMap12);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18, true);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator17.addList(node21, false, context23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator17.addList(node25, true, context27);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node14, context27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
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
        codeGenerator2.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator2.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator2.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder23.setTagAsStrict(false);
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
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
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
        codeGenerator2.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator20.addList(node24, false, context26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator20.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator20.addArrayList(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator20.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator20.addArrayList(node34);
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
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator40.addList(node57, true);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator40.addList(node60);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator40.addList(node62, false);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator40.addArrayList(node65);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context69 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator40.addList(node67, true, context69);
        codeGenerator20.addList(node36, true, context69);
        codeGenerator2.addList(node16, true, context69);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator2.addArrayList(node73);
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context54 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context54.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context69 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context69.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setOutputCharset(charset18);
        com.google.javascript.jscomp.SourceMap sourceMap20 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setSourceMap(sourceMap20);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setLineLengthThreshold((int) (short) 10);
        com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder21.setLineBreak(false);
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
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10, true);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        com.google.javascript.jscomp.CodeGenerator.Context context80 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node78, true, context80);
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context72 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context72.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context80 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context80.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder17.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder17.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder23.setLineBreak(true);
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
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder3.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder3.setTagAsStrict(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
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
        codeGenerator2.addArrayList(node89);
        com.google.javascript.rhino.Node node91 = null;
        codeGenerator2.addList(node91, true);
        com.google.javascript.rhino.Node node94 = null;
        codeGenerator2.addArrayList(node94);
        com.google.javascript.rhino.Node node96 = null;
        codeGenerator2.addAllSiblings(node96);
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context75 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context75.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context85 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context85.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\"/\\\\\\\"\\\\\\\"/\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/\\\\\\\"\\\\\\\"/\\\"\"" + "'", str1, "\"\\\"/\\\\\\\"\\\\\\\"/\\\"\"");
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setLineBreak(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setOutputCharset(charset6);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder15.setOutputTypes(true);
        com.google.javascript.jscomp.SourceMap sourceMap20 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setSourceMap(sourceMap20);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setPreferLineBreakAtEndOfFile(false);
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
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
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
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/\"/\\\"\\\\\\\"  \\\\\\\"\\\"/\"/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"//" + "'", str2, "//\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"//");
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
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
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator2.addAllSiblings(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator2.addArrayList(node52);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer56 = null;
        java.nio.charset.Charset charset57 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator58 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer56, charset57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator58.addAllSiblings(node59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator58.addAllSiblings(node61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context65 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator58.addList(node63, false, context65);
        codeGenerator2.addList(node54, true, context65);
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context65 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context65.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
        codeGenerator2.addList(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator2.addList(node49, false);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator2.addAllSiblings(node52);
        com.google.javascript.rhino.Node node54 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) (short) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setPrettyPrint(false);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder13.setSourceMapDetailLevel(detailLevel18);
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
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder17.setPrettyPrint(false);
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
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/\\\"hi!\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"hi!\\\"/\"" + "'", str1, "\"/\\\"hi!\\\"/\"");
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
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
        java.lang.Class<?> wildcardClass22 = builder19.getClass();
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
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
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
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator2.addAllSiblings(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator2.addArrayList(node52);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context55 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node54, context55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context55 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context55.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder17.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder17.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder17.setPrettyPrint(false);
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
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
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
        com.google.javascript.jscomp.SourceMap sourceMap18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setSourceMap(sourceMap18);
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder17.setOutputCharset(charset20);
        com.google.javascript.jscomp.SourceMap sourceMap22 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setSourceMap(sourceMap22);
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
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
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
        codeGenerator2.addArrayList(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator2.addAllSiblings(node49);
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"" + "'", str1, "\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"");
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineLengthThreshold((int) 'a');
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setOutputTypes(false);
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
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setPrettyPrint(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
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
        codeGenerator2.addArrayList(node89);
        com.google.javascript.rhino.Node node91 = null;
        codeGenerator2.addList(node91, true);
        com.google.javascript.rhino.Node node94 = null;
        codeGenerator2.addAllSiblings(node94);
        com.google.javascript.rhino.Node node96 = null;
        codeGenerator2.addList(node96, false);
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context75 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context75.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context85 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context85.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
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
        codeGenerator2.addList(node24, false);
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
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineBreak(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"//\\\"/////  /////\\\"//\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//\\\"/////  /////\\\"//\"" + "'", str1, "\"//\\\"/////  /////\\\"//\"");
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("///\"//////\"///");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
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
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder15.setOutputCharset(charset18);
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder15.setOutputCharset(charset20);
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setOutputCharset(charset22);
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
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder9.setLineBreak(false);
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
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) '4');
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineLengthThreshold((int) (short) 1);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineLengthThreshold((int) '4');
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
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setOutputCharset(charset20);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setSourceMapDetailLevel(detailLevel22);
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
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setLineBreak(false);
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
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
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
        codeGenerator2.addList(node91, false);
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
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\"///\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"///\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"///\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"///\\\"\"" + "'", str1, "\"\\\"///\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"///\\\"\"");
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("//\"/\\\"hi!\\\"/\"//");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap sourceMap10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setSourceMap(sourceMap10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder7.setPreferLineBreakAtEndOfFile(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setPrettyPrint(true);
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
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
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
        com.google.javascript.jscomp.CodeGenerator.Context context11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node10, context11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
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
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder9.setOutputCharset(charset20);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder23.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder27 = builder25.setLineBreak(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = builder25.build();
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
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
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
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setOutputCharset(charset14);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setLineBreak(false);
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
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.SourceMap sourceMap4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setSourceMap(sourceMap4);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineLengthThreshold((int) (byte) -1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
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
        codeGenerator2.addAllSiblings(node76);
        com.google.javascript.rhino.Node node78 = null;
        codeGenerator2.addList(node78, false);
        com.google.javascript.rhino.Node node81 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node81);
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
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineLengthThreshold((int) (byte) 1);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineBreak(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) '4');
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPreferLineBreakAtEndOfFile(false);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder1.setLineBreak(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"//\\\"\\\"//\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//\\\"\\\"//\"" + "'", str1, "\"//\\\"\\\"//\"");
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
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
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setOutputCharset(charset12);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
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
        com.google.javascript.rhino.Node node85 = null;
        codeGenerator2.addList(node85, true);
        com.google.javascript.rhino.Node node88 = null;
        codeGenerator2.addArrayList(node88);
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
        org.junit.Assert.assertTrue("'" + context78 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context78.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/  /\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) (byte) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineLengthThreshold(100);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setPrettyPrint(true);
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
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder13.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setPrettyPrint(true);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder19.setSourceMapDetailLevel(detailLevel22);
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
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
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
        codeGenerator2.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder13.setPrettyPrint(true);
        com.google.javascript.jscomp.SourceMap sourceMap24 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder23.setSourceMap(sourceMap24);
        com.google.javascript.jscomp.CodePrinter.Builder builder27 = builder25.setOutputTypes(true);
        java.nio.charset.Charset charset28 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder29 = builder25.setOutputCharset(charset28);
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
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
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
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node19, false, context21);
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context10 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node8, true, context10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12);
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        java.nio.charset.Charset charset26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25, charset26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator27.addList(node28, true);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator27.addList(node31, false, context33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator27.addList(node35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator27.addArrayList(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator27.addList(node39, true);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator27.addArrayList(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator27.addList(node44, false, context46);
        codeGenerator2.addList(node23, false, context46);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator2.addList(node49);
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
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
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"///\\\"//////\\\"///\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"\\\"  \\\"\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"\\\"  \\\"\"//" + "'", str2, "//\"\\\"  \\\"\"//");
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
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
        codeGenerator2.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator20.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator20.addList(node26, true, context28);
        codeGenerator2.addList(node16, true, context28);
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setLineLengthThreshold(100);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder15.setTagAsStrict(true);
        com.google.javascript.jscomp.SourceMap sourceMap20 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder15.setSourceMap(sourceMap20);
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
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
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
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
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
        codeGenerator2.addArrayList(node78);
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
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder13.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setPrettyPrint(true);
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
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
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
        codeGenerator2.addAllSiblings(node23);
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator7 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5, charset6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator7.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addList(node16, true);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator15.addList(node19, false, context21);
        codeGenerator7.addList(node11, false, context21);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        java.nio.charset.Charset charset35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer34, charset35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator36.addList(node37, true);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator36.addList(node40, false, context42);
        codeGenerator28.addList(node32, false, context42);
        codeGenerator7.addList(node24, true, context42);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator7.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator7.addArrayList(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer52 = null;
        java.nio.charset.Charset charset53 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator54 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer52, charset53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator54.addList(node55, true);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer60 = null;
        java.nio.charset.Charset charset61 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator62 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer60, charset61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator62.addList(node63, true);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context68 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator62.addList(node66, false, context68);
        codeGenerator54.addList(node58, false, context68);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator54.addList(node71, true);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator54.addList(node74);
        com.google.javascript.rhino.Node node76 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context78 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator54.addList(node76, false, context78);
        codeGenerator7.addList(node50, false, context78);
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator7.addList(node81);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context85 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator7.addList(node83, false, context85);
        codeGenerator2.addList(node3, true, context85);
        com.google.javascript.rhino.Node node88 = null;
        codeGenerator2.addArrayList(node88);
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context68 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context68.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context78 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context78.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context85 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context85.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
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
        codeGenerator2.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator2.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator2.addArrayList(node31);
        java.lang.Class<?> wildcardClass33 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder15.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder15.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder15.setLineLengthThreshold(0);
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
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
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
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setOutputCharset(charset18);
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
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
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
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder9.setOutputCharset(charset20);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder23.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder27 = builder25.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder29 = builder27.setLineBreak(false);
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
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineLengthThreshold((int) (short) 10);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setPrettyPrint(true);
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setOutputCharset(charset14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = builder9.build();
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
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder19.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder19.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder27 = builder25.setTagAsStrict(false);
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
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setTagAsStrict(true);
        com.google.javascript.jscomp.SourceMap sourceMap10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setSourceMap(sourceMap10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPrettyPrint(true);
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
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
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
        codeGenerator2.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator2.addAllSiblings(node35);
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"////\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"////\"" + "'", str1, "\"////\"");
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) '4');
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPreferLineBreakAtEndOfFile(false);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.SourceMap sourceMap12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder1.setSourceMap(sourceMap12);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder1.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setOutputTypes(true);
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
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
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
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
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
        codeGenerator2.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator2.addArrayList(node30);
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
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
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
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator39.addList(node56, true);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator39.addList(node59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context63 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator39.addList(node61, false, context63);
        codeGenerator18.addList(node35, true, context63);
        codeGenerator2.addList(node14, true, context63);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator2.addArrayList(node67);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator2.addAllSiblings(node69);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator2.addAllSiblings(node71);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator2.addList(node73);
        com.google.javascript.rhino.Node node75 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context77 = null;
        codeGenerator2.addList(node75, true, context77);
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context63 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context63.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
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
            codeGenerator2.add("\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/\"");
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
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"\\\"  \\\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"\\\"  \\\"\"//" + "'", str1, "//\"\\\"  \\\"\"//");
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder19.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder19.setOutputTypes(true);
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
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setTagAsStrict(false);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setTagAsStrict(false);
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
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
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
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node19, false, context21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addList(node23, false);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator2.addList(node26, false);
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) (byte) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineLengthThreshold((int) (byte) 100);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setTagAsStrict(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
        codeGenerator2.addAllSiblings(node76);
        com.google.javascript.rhino.Node node78 = null;
        codeGenerator2.addList(node78, false);
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator2.addList(node81);
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context72 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context72.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
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
        codeGenerator2.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator2.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = null;
        codeGenerator2.addList(node33, false, context35);
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/\\\"/////  /////\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"/\\\"/////  /////\\\"/\"/" + "'", str1, "/\"/\\\"/////  /////\\\"/\"/");
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
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
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineBreak(true);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder3.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder3.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder15.setLineBreak(false);
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
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer7 = null;
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer7, charset8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator9.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator9.addList(node14, false, context16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addAllSiblings(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator22.addAllSiblings(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator22.addList(node27, false, context29);
        codeGenerator9.addList(node18, false, context29);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = null;
        codeGenerator9.addList(node32, false, context34);
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
        codeGenerator40.addList(node57, true, context85);
        codeGenerator9.addList(node36, false, context85);
        codeGenerator2.addList(node5, true, context85);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context54 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context54.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context75 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context75.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context85 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context85.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
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
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setOutputCharset(charset16);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setOutputTypes(false);
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
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
        com.google.javascript.jscomp.SourceMap sourceMap24 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder23.setSourceMap(sourceMap24);
        com.google.javascript.jscomp.CodePrinter.Builder builder27 = builder23.setPrettyPrint(true);
        java.nio.charset.Charset charset28 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder29 = builder27.setOutputCharset(charset28);
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
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
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
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator39.addList(node56, true);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator39.addList(node59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context63 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator39.addList(node61, false, context63);
        codeGenerator18.addList(node35, true, context63);
        codeGenerator2.addList(node14, true, context63);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator2.addArrayList(node67);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator2.addAllSiblings(node69);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator2.addArrayList(node71);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator2.addAllSiblings(node73);
        com.google.javascript.rhino.Node node75 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer77 = null;
        java.nio.charset.Charset charset78 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator79 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer77, charset78);
        com.google.javascript.rhino.Node node80 = null;
        codeGenerator79.addList(node80, true);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context85 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator79.addList(node83, false, context85);
        com.google.javascript.rhino.Node node87 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context89 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator79.addList(node87, true, context89);
        codeGenerator2.addList(node75, true, context89);
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context63 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context63.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context85 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context85.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context89 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context89.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
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
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
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
        codeGenerator2.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addAllSiblings(node23);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setSourceMap(sourceMap2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineLengthThreshold((int) (short) 10);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineLengthThreshold((int) (short) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setLineLengthThreshold((int) ' ');
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }
}

