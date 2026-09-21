package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("a////a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/a////a/" + "'", str1, "/a////a/");
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addList(node24, false);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/////'/\"hi!\"/'/////", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//////'/\"hi!\"/'//////" + "'", str2, "//////'/\"hi!\"/'//////");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/'/\"\\\\\"//\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\"//\\\\\"\"/'/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//'/\"\\\\\"//\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\"//\\\\\"\"/'//" + "'", str1, "//'/\"\\\\\"//\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\"//\\\\\"\"/'//");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        char[] charArray7 = new char[] { '#', '#', ' ' };
        com.google.javascript.jscomp.VariableMap variableMap8 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes9 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, true, charArray7, variableMap8);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        char[] charArray17 = new char[] { '#', '#', ' ' };
        com.google.javascript.jscomp.VariableMap variableMap18 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes19 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler12, true, charArray17, variableMap18);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler20 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        char[] charArray27 = new char[] { '#', '#', ' ' };
        com.google.javascript.jscomp.VariableMap variableMap28 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes29 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler22, true, charArray27, variableMap28);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        char[] charArray32 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap33 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes34 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler30, true, charArray32, variableMap33);
        com.google.javascript.jscomp.VariableMap variableMap35 = renamePrototypes34.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes36 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler20, false, charArray27, variableMap35);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes37 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler10, false, charArray17, variableMap35);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes38 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, false, charArray7, variableMap35);
        com.google.javascript.jscomp.VariableMap variableMap39 = renamePrototypes38.getPropertyMap();
        java.lang.Class<?> wildcardClass40 = variableMap39.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '#', ' ' });
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '#', '#', ' ' });
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '#', '#', ' ' });
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] {});
        org.junit.Assert.assertNotNull(variableMap35);
        org.junit.Assert.assertNotNull(variableMap39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"\\\"/4hi!4/\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"\\\\\"/4hi!4/\\\\\"\"'" + "'", str2, "'\"\\\\\"/4hi!4/\\\\\"\"'");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        char[] charArray7 = new char[] { '#', '#', ' ' };
        com.google.javascript.jscomp.VariableMap variableMap8 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes9 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, true, charArray7, variableMap8);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        char[] charArray18 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap19 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes20 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler16, true, charArray18, variableMap19);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        char[] charArray23 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap24 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes25 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler21, true, charArray23, variableMap24);
        com.google.javascript.jscomp.VariableMap variableMap26 = renamePrototypes25.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap27 = renamePrototypes25.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes28 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler14, true, charArray18, variableMap27);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler31 = null;
        char[] charArray36 = new char[] { '#', '#', ' ' };
        com.google.javascript.jscomp.VariableMap variableMap37 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes38 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler31, true, charArray36, variableMap37);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler39 = null;
        char[] charArray41 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap42 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes43 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler39, true, charArray41, variableMap42);
        com.google.javascript.jscomp.VariableMap variableMap44 = renamePrototypes43.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes45 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler29, false, charArray36, variableMap44);
        com.google.javascript.jscomp.VariableMap variableMap46 = renamePrototypes45.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes47 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler12, true, charArray18, variableMap46);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler48 = null;
        char[] charArray50 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap51 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes52 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler48, true, charArray50, variableMap51);
        com.google.javascript.jscomp.VariableMap variableMap53 = renamePrototypes52.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes54 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler10, true, charArray18, variableMap53);
        com.google.javascript.jscomp.VariableMap variableMap55 = renamePrototypes54.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap56 = renamePrototypes54.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes57 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, false, charArray7, variableMap56);
        com.google.javascript.jscomp.VariableMap variableMap58 = renamePrototypes57.getPropertyMap();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '#', ' ' });
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertNotNull(variableMap26);
        org.junit.Assert.assertNotNull(variableMap27);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { '#', '#', ' ' });
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] {});
        org.junit.Assert.assertNotNull(variableMap44);
        org.junit.Assert.assertNotNull(variableMap46);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] {});
        org.junit.Assert.assertNotNull(variableMap53);
        org.junit.Assert.assertNotNull(variableMap55);
        org.junit.Assert.assertNotNull(variableMap56);
        org.junit.Assert.assertNotNull(variableMap58);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"\\\"a////\\\\\\\"////\\\\\\\"//#// /hi!/ //#//\\\\\\\"////\\\\\\\"////#// /hi!/ //#//\\\\\\\"////\\\\\\\"////\\\\\\\"////\\\\\\\"////a\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"\\\\\"a////\\\\\\\\\\\\\"////\\\\\\\\\\\\\"//#// /hi!/ //#//\\\\\\\\\\\\\"////\\\\\\\\\\\\\"////#// /hi!/ //#//\\\\\\\\\\\\\"////\\\\\\\\\\\\\"////\\\\\\\\\\\\\"////\\\\\\\\\\\\\"////a\\\\\"\"'" + "'", str2, "'\"\\\\\"a////\\\\\\\\\\\\\"////\\\\\\\\\\\\\"//#// /hi!/ //#//\\\\\\\\\\\\\"////\\\\\\\\\\\\\"////#// /hi!/ //#//\\\\\\\\\\\\\"////\\\\\\\\\\\\\"////\\\\\\\\\\\\\"////\\\\\\\\\\\\\"////a\\\\\"\"'");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("a/4hi!4/\"#//#// /hi!/ //#////#// /hi!/ //#//#\"//\"a///a//a///a\"\"a///a//a///a\"\"#//#// /hi!/ //#////#// /hi!/ //#//#\"/hi!/\"a///a//a///a\"\"a///a//a///a\"\"#//#// /hi!/ //#////#// /hi!/ //#//#\"//\"#//#// /hi!/ //#////#// /hi!/ //#//#\"/4hi!4/a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/a/4hi!4/\"#//#// /hi!/ //#////#// /hi!/ //#//#\"//\"a///a//a///a\"\"a///a//a///a\"\"#//#// /hi!/ //#////#// /hi!/ //#//#\"/hi!/\"a///a//a///a\"\"a///a//a///a\"\"#//#// /hi!/ //#////#// /hi!/ //#//#\"//\"#//#// /hi!/ //#////#// /hi!/ //#//#\"/4hi!4/a/" + "'", str1, "/a/4hi!4/\"#//#// /hi!/ //#////#// /hi!/ //#//#\"//\"a///a//a///a\"\"a///a//a///a\"\"#//#// /hi!/ //#////#// /hi!/ //#//#\"/hi!/\"a///a//a///a\"\"a///a//a///a\"\"#//#// /hi!/ //#////#// /hi!/ //#//#\"//\"#//#// /hi!/ //#////#// /hi!/ //#//#\"/4hi!4/a/");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator21.addList(node26, false);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator21.addList(node29, false);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node32, false, context34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator21.addList(node36, false);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator42.addArrayList(node43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator42.addAllSiblings(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator42.addList(node47, false);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator42.addList(node50, false);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context55 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator42.addList(node53, false, context55);
        codeGenerator21.addList(node39, false, context55);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator21.addAllSiblings(node58);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context62 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator21.addList(node60, false, context62);
        codeGenerator1.addList(node18, true, context62);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator1.addArrayList(node65);
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context55 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context55.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, false);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator23.addList(node26, false, context28);
        codeGenerator2.addList(node19, false, context28);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator2.addList(node31, false);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node34, (int) (byte) 100, context36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator11.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator11.addList(node16, true, context18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator11.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator25.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        java.nio.charset.Charset charset31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30, charset31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator32.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator32.addList(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator32.addList(node40, false, context42);
        codeGenerator25.addList(node28, false, context42);
        codeGenerator11.addList(node22, true, context42);
        codeGenerator2.addList(node7, true, context42);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator2.addAllSiblings(node47);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//4hi!4//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///4hi!4///" + "'", str1, "///4hi!4///");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "/ /\"/ /hi!/ /\"/ /hi!/ /\"/ /hi!/ /\"/ /", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator23.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        java.nio.charset.Charset charset31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30, charset31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator32.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator32.addList(node38, true);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator32.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator32.addList(node43, false, context45);
        codeGenerator23.addList(node28, true, context45);
        codeGenerator2.addList(node19, true, context45);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator2.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator2.addArrayList(node51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator2.addArrayList(node53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator2.addAllSiblings(node55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator2.addList(node57);
        com.google.javascript.rhino.Node node59 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node59, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        char[] charArray6 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap7 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes8 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler4, true, charArray6, variableMap7);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        char[] charArray11 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap12 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes13 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler9, true, charArray11, variableMap12);
        com.google.javascript.jscomp.VariableMap variableMap14 = renamePrototypes13.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap15 = renamePrototypes13.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes16 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, true, charArray6, variableMap15);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        char[] charArray19 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap20 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes21 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler17, true, charArray19, variableMap20);
        com.google.javascript.jscomp.VariableMap variableMap22 = renamePrototypes21.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes23 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, true, charArray6, variableMap22);
        java.lang.Class<?> wildcardClass24 = renamePrototypes23.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNotNull(variableMap14);
        org.junit.Assert.assertNotNull(variableMap15);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertNotNull(variableMap22);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        char[] charArray13 = new char[] { '#', '#', ' ' };
        com.google.javascript.jscomp.VariableMap variableMap14 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes15 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler8, true, charArray13, variableMap14);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        char[] charArray18 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap19 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes20 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler16, true, charArray18, variableMap19);
        com.google.javascript.jscomp.VariableMap variableMap21 = renamePrototypes20.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes22 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler6, false, charArray13, variableMap21);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        char[] charArray25 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap26 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes27 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler23, true, charArray25, variableMap26);
        com.google.javascript.jscomp.VariableMap variableMap28 = renamePrototypes27.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes29 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler4, false, charArray13, variableMap28);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler32 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler34 = null;
        char[] charArray36 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap37 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes38 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler34, true, charArray36, variableMap37);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler39 = null;
        char[] charArray41 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap42 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes43 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler39, true, charArray41, variableMap42);
        com.google.javascript.jscomp.VariableMap variableMap44 = renamePrototypes43.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap45 = renamePrototypes43.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes46 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler32, true, charArray36, variableMap45);
        com.google.javascript.jscomp.VariableMap variableMap47 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes48 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler30, false, charArray36, variableMap47);
        com.google.javascript.jscomp.VariableMap variableMap49 = renamePrototypes48.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes50 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, true, charArray13, variableMap49);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler51 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler53 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler55 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler57 = null;
        char[] charArray59 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap60 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes61 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler57, true, charArray59, variableMap60);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler62 = null;
        char[] charArray64 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap65 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes66 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler62, true, charArray64, variableMap65);
        com.google.javascript.jscomp.VariableMap variableMap67 = renamePrototypes66.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap68 = renamePrototypes66.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes69 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler55, true, charArray59, variableMap68);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler70 = null;
        char[] charArray72 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap73 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes74 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler70, true, charArray72, variableMap73);
        com.google.javascript.jscomp.VariableMap variableMap75 = renamePrototypes74.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes76 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler53, true, charArray59, variableMap75);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler77 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler79 = null;
        char[] charArray84 = new char[] { '#', '#', ' ' };
        com.google.javascript.jscomp.VariableMap variableMap85 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes86 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler79, true, charArray84, variableMap85);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler87 = null;
        char[] charArray89 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap90 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes91 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler87, true, charArray89, variableMap90);
        com.google.javascript.jscomp.VariableMap variableMap92 = renamePrototypes91.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap93 = renamePrototypes91.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap94 = renamePrototypes91.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes95 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler77, true, charArray84, variableMap94);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes96 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler51, false, charArray59, variableMap94);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes97 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, false, charArray13, variableMap94);
        com.google.javascript.jscomp.VariableMap variableMap98 = renamePrototypes97.getPropertyMap();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', '#', ' ' });
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertNotNull(variableMap21);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] {});
        org.junit.Assert.assertNotNull(variableMap28);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] {});
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] {});
        org.junit.Assert.assertNotNull(variableMap44);
        org.junit.Assert.assertNotNull(variableMap45);
        org.junit.Assert.assertNotNull(variableMap49);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] {});
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertArrayEquals(charArray64, new char[] {});
        org.junit.Assert.assertNotNull(variableMap67);
        org.junit.Assert.assertNotNull(variableMap68);
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertArrayEquals(charArray72, new char[] {});
        org.junit.Assert.assertNotNull(variableMap75);
        org.junit.Assert.assertNotNull(charArray84);
        org.junit.Assert.assertArrayEquals(charArray84, new char[] { '#', '#', ' ' });
        org.junit.Assert.assertNotNull(charArray89);
        org.junit.Assert.assertArrayEquals(charArray89, new char[] {});
        org.junit.Assert.assertNotNull(variableMap92);
        org.junit.Assert.assertNotNull(variableMap93);
        org.junit.Assert.assertNotNull(variableMap94);
        org.junit.Assert.assertNotNull(variableMap98);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"\\\"/\\\\\\\"'/\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"/'\\\\\\\"/\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"\\\\\"/\\\\\\\\\\\\\"\\'/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\'\\\\\\\\\\\\\"/\\\\\"\"'" + "'", str2, "'\"\\\\\"/\\\\\\\\\\\\\"\\'/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\'\\\\\\\\\\\\\"/\\\\\"\"'");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("///\"\"///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "////\"\"////" + "'", str1, "////\"\"////");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator9.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator9.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator9.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator9.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator9.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator9.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator31.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator31.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        java.nio.charset.Charset charset41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40, charset41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator42.addList(node43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator42.addList(node45, false);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator42.addList(node48, true);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator42.addArrayList(node51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context55 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator42.addList(node53, false, context55);
        codeGenerator31.addList(node38, true, context55);
        codeGenerator9.addList(node27, false, context55);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node6, (int) ' ', context55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context55 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context55.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node12, false, context14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator26.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator26.addList(node31, false);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator26.addList(node34, false);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator26.addList(node37, false, context39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator26.addList(node41, false);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator47 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator47.addArrayList(node48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator47.addAllSiblings(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator47.addList(node52, false);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator47.addList(node55, false);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context60 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator47.addList(node58, false, context60);
        codeGenerator26.addList(node44, false, context60);
        codeGenerator1.addList(node23, false, context60);
        com.google.javascript.rhino.Node node64 = null;
        codeGenerator1.addAllSiblings(node64);
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context60 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context60.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node12, false, context14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator23.addList(node26, false, context28);
        codeGenerator1.addList(node19, true, context28);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator1.addList(node31, true);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator1.addAllSiblings(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator1.addList(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        java.nio.charset.Charset charset41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40, charset41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator42.addList(node43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator42.addList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator42.addAllSiblings(node47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer51 = null;
        java.nio.charset.Charset charset52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer51, charset52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator53.addList(node54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator53.addList(node56, false);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator53.addList(node59, true);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator53.addArrayList(node62);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context66 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator53.addList(node64, false, context66);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator53.addList(node68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator53.addList(node70, true);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer75 = null;
        java.nio.charset.Charset charset76 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator77 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer75, charset76);
        com.google.javascript.rhino.Node node78 = null;
        codeGenerator77.addList(node78);
        com.google.javascript.rhino.Node node80 = null;
        codeGenerator77.addList(node80, false);
        com.google.javascript.rhino.Node node83 = null;
        codeGenerator77.addList(node83, true);
        com.google.javascript.rhino.Node node86 = null;
        codeGenerator77.addArrayList(node86);
        com.google.javascript.rhino.Node node88 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context90 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator77.addList(node88, false, context90);
        codeGenerator53.addList(node73, true, context90);
        codeGenerator42.addList(node49, true, context90);
        codeGenerator1.addList(node38, false, context90);
        com.google.javascript.rhino.Node node95 = null;
        codeGenerator1.addList(node95);
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context66 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context66.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context90 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context90.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "##  //hi!//  ##", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
        codeGenerator2.addList(node10, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/ /\"/ /hi!/ /\"/ /hi!/ /\"/ /hi!/ /\"/ /");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11, charset12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator13.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator13.addList(node18, true, context20);
        codeGenerator2.addList(node9, false, context20);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addAllSiblings(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator28.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator28.addList(node33, false);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator28.addArrayList(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        java.nio.charset.Charset charset41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40, charset41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator42.addList(node43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator42.addList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator42.addAllSiblings(node47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer51 = null;
        java.nio.charset.Charset charset52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer51, charset52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator53.addList(node54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator53.addList(node56, false);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator53.addList(node59, true);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator53.addArrayList(node62);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context66 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator53.addList(node64, false, context66);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator53.addList(node68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator53.addList(node70, true);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer75 = null;
        java.nio.charset.Charset charset76 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator77 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer75, charset76);
        com.google.javascript.rhino.Node node78 = null;
        codeGenerator77.addList(node78);
        com.google.javascript.rhino.Node node80 = null;
        codeGenerator77.addList(node80, false);
        com.google.javascript.rhino.Node node83 = null;
        codeGenerator77.addList(node83, true);
        com.google.javascript.rhino.Node node86 = null;
        codeGenerator77.addArrayList(node86);
        com.google.javascript.rhino.Node node88 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context90 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator77.addList(node88, false, context90);
        codeGenerator53.addList(node73, true, context90);
        codeGenerator42.addList(node49, true, context90);
        codeGenerator28.addList(node38, true, context90);
        codeGenerator2.addList(node25, true, context90);
        com.google.javascript.rhino.Node node96 = null;
        codeGenerator2.addAllSiblings(node96);
        com.google.javascript.rhino.Node node98 = null;
        codeGenerator2.addArrayList(node98);
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context66 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context66.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context90 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context90.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, false);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator23.addList(node26, false, context28);
        codeGenerator2.addList(node19, false, context28);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator2.addList(node31, true);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator2.addArrayList(node34);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator2.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node29, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        char[] charArray11 = new char[] { '#', '#', ' ' };
        com.google.javascript.jscomp.VariableMap variableMap12 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes13 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler6, true, charArray11, variableMap12);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        char[] charArray21 = new char[] { '#', '#', ' ' };
        com.google.javascript.jscomp.VariableMap variableMap22 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes23 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler16, true, charArray21, variableMap22);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler24 = null;
        char[] charArray26 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap27 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes28 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler24, true, charArray26, variableMap27);
        com.google.javascript.jscomp.VariableMap variableMap29 = renamePrototypes28.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes30 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler14, false, charArray21, variableMap29);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes31 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler4, false, charArray11, variableMap29);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler32 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler34 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        char[] charArray38 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap39 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes40 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler36, true, charArray38, variableMap39);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler41 = null;
        char[] charArray43 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap44 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes45 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler41, true, charArray43, variableMap44);
        com.google.javascript.jscomp.VariableMap variableMap46 = renamePrototypes45.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap47 = renamePrototypes45.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes48 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler34, true, charArray38, variableMap47);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler49 = null;
        char[] charArray51 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap52 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes53 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler49, true, charArray51, variableMap52);
        com.google.javascript.jscomp.VariableMap variableMap54 = renamePrototypes53.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes55 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler32, true, charArray38, variableMap54);
        com.google.javascript.jscomp.VariableMap variableMap56 = renamePrototypes55.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes57 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, false, charArray11, variableMap56);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler58 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler60 = null;
        char[] charArray65 = new char[] { '#', '#', ' ' };
        com.google.javascript.jscomp.VariableMap variableMap66 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes67 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler60, true, charArray65, variableMap66);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler68 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler70 = null;
        char[] charArray75 = new char[] { '#', '#', ' ' };
        com.google.javascript.jscomp.VariableMap variableMap76 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes77 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler70, true, charArray75, variableMap76);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler78 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler80 = null;
        char[] charArray85 = new char[] { '#', '#', ' ' };
        com.google.javascript.jscomp.VariableMap variableMap86 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes87 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler80, true, charArray85, variableMap86);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler88 = null;
        char[] charArray90 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap91 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes92 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler88, true, charArray90, variableMap91);
        com.google.javascript.jscomp.VariableMap variableMap93 = renamePrototypes92.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes94 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler78, false, charArray85, variableMap93);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes95 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler68, false, charArray75, variableMap93);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes96 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler58, false, charArray65, variableMap93);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes97 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, false, charArray11, variableMap93);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '#', ' ' });
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '#', '#', ' ' });
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
        org.junit.Assert.assertNotNull(variableMap29);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] {});
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] {});
        org.junit.Assert.assertNotNull(variableMap46);
        org.junit.Assert.assertNotNull(variableMap47);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] {});
        org.junit.Assert.assertNotNull(variableMap54);
        org.junit.Assert.assertNotNull(variableMap56);
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertArrayEquals(charArray65, new char[] { '#', '#', ' ' });
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertArrayEquals(charArray75, new char[] { '#', '#', ' ' });
        org.junit.Assert.assertNotNull(charArray85);
        org.junit.Assert.assertArrayEquals(charArray85, new char[] { '#', '#', ' ' });
        org.junit.Assert.assertNotNull(charArray90);
        org.junit.Assert.assertArrayEquals(charArray90, new char[] {});
        org.junit.Assert.assertNotNull(variableMap93);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addArrayList(node18);
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, false);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator17.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator17.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator17.addList(node28, false, context30);
        codeGenerator2.addList(node13, false, context30);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator2.addArrayList(node33);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        char[] charArray4 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes6 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, true, charArray4, variableMap5);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        char[] charArray18 = new char[] { '#', '#', ' ' };
        com.google.javascript.jscomp.VariableMap variableMap19 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes20 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler13, true, charArray18, variableMap19);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        char[] charArray23 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap24 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes25 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler21, true, charArray23, variableMap24);
        com.google.javascript.jscomp.VariableMap variableMap26 = renamePrototypes25.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes27 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler11, false, charArray18, variableMap26);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler28 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        char[] charArray35 = new char[] { '#', '#', ' ' };
        com.google.javascript.jscomp.VariableMap variableMap36 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes37 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler30, true, charArray35, variableMap36);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler38 = null;
        char[] charArray40 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap41 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes42 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler38, true, charArray40, variableMap41);
        com.google.javascript.jscomp.VariableMap variableMap43 = renamePrototypes42.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap44 = renamePrototypes42.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap45 = renamePrototypes42.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes46 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler28, true, charArray35, variableMap45);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes47 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler9, false, charArray18, variableMap45);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler48 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler50 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler52 = null;
        char[] charArray54 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap55 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes56 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler52, true, charArray54, variableMap55);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler57 = null;
        char[] charArray59 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap60 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes61 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler57, true, charArray59, variableMap60);
        com.google.javascript.jscomp.VariableMap variableMap62 = renamePrototypes61.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap63 = renamePrototypes61.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes64 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler50, true, charArray54, variableMap63);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler65 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler67 = null;
        char[] charArray72 = new char[] { '#', '#', ' ' };
        com.google.javascript.jscomp.VariableMap variableMap73 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes74 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler67, true, charArray72, variableMap73);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler75 = null;
        char[] charArray77 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap78 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes79 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler75, true, charArray77, variableMap78);
        com.google.javascript.jscomp.VariableMap variableMap80 = renamePrototypes79.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes81 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler65, false, charArray72, variableMap80);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes82 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler48, false, charArray54, variableMap80);
        com.google.javascript.jscomp.VariableMap variableMap83 = renamePrototypes82.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap84 = renamePrototypes82.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes85 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler7, true, charArray18, variableMap84);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes86 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, true, charArray4, variableMap84);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '#', '#', ' ' });
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertNotNull(variableMap26);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { '#', '#', ' ' });
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] {});
        org.junit.Assert.assertNotNull(variableMap43);
        org.junit.Assert.assertNotNull(variableMap44);
        org.junit.Assert.assertNotNull(variableMap45);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] {});
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] {});
        org.junit.Assert.assertNotNull(variableMap62);
        org.junit.Assert.assertNotNull(variableMap63);
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertArrayEquals(charArray72, new char[] { '#', '#', ' ' });
        org.junit.Assert.assertNotNull(charArray77);
        org.junit.Assert.assertArrayEquals(charArray77, new char[] {});
        org.junit.Assert.assertNotNull(variableMap80);
        org.junit.Assert.assertNotNull(variableMap83);
        org.junit.Assert.assertNotNull(variableMap84);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11, charset12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator13.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator13.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator13.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator13.addList(node24, false, context26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator13.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator13.addList(node30, true);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        java.nio.charset.Charset charset36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35, charset36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator37.addList(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator37.addList(node40, false);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator37.addList(node43, true);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator37.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator37.addList(node48, false, context50);
        codeGenerator13.addList(node33, true, context50);
        codeGenerator2.addList(node9, true, context50);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator2.addAllSiblings(node54);
        com.google.javascript.rhino.Node node56 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        java.nio.charset.Charset charset13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12, charset13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator14.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator14.addList(node20, true);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator14.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator14.addList(node25, false, context27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator14.addList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator14.addList(node31, true, context33);
        codeGenerator2.addList(node10, true, context33);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator2.addList(node36, true);
        java.lang.Class<?> wildcardClass39 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator23.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        java.nio.charset.Charset charset31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30, charset31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator32.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator32.addList(node38, true);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator32.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator32.addList(node43, false, context45);
        codeGenerator23.addList(node28, true, context45);
        codeGenerator2.addList(node19, true, context45);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator2.addList(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator2.addList(node51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator2.addAllSiblings(node53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator2.addList(node55);
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"// /hi!/ //\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"// /hi!/ //\\\"/\"" + "'", str1, "\"/\\\"// /hi!/ //\\\"/\"");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("//\"hi!\"//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'//\"hi!\"//'" + "'", str2, "'//\"hi!\"//'");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("a/a/\"\"/hi!/\"\"/a/\"\\\"#/hi!/#\\\"\"/\"4hi!4\"a/\"\"/hi!/\"\"/a//\"4hi!4\"\"4hi!4\"/\"\\\"#/hi!/#\\\"\"// /hi!/ /\"4hi!4\"\"4hi!4\"/\"\\\"#/hi!/#\\\"\"///\"4hi!4\"a/\"\"/hi!/\"\"/a/\"\\\"#/hi!/#\\\"\"/a/\"\"/hi!/\"\"/a/a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a/a/\"\"/hi!/\"\"/a/\"\\\"#/hi!/#\\\"\"/\"4hi!4\"a/\"\"/hi!/\"\"/a//\"4hi!4\"\"4hi!4\"/\"\\\"#/hi!/#\\\"\"// /hi!/ /\"4hi!4\"\"4hi!4\"/\"\\\"#/hi!/#\\\"\"///\"4hi!4\"a/\"\"/hi!/\"\"/a/\"\\\"#/hi!/#\\\"\"/a/\"\"/hi!/\"\"/a/a" + "'", str1, "a/a/\"\"/hi!/\"\"/a/\"\\\"#/hi!/#\\\"\"/\"4hi!4\"a/\"\"/hi!/\"\"/a//\"4hi!4\"\"4hi!4\"/\"\\\"#/hi!/#\\\"\"// /hi!/ /\"4hi!4\"\"4hi!4\"/\"\\\"#/hi!/#\\\"\"///\"4hi!4\"a/\"\"/hi!/\"\"/a/\"\\\"#/hi!/#\\\"\"/a/\"\"/hi!/\"\"/a/a");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator20.addList(node23, false);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator20.addList(node26, true);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator20.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator20.addList(node31, false, context33);
        codeGenerator1.addList(node16, false, context33);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator1.addList(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator41 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator41.addArrayList(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator41.addAllSiblings(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator41.addList(node46, false);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator41.addList(node49, false);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context54 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator41.addList(node52, false, context54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator41.addList(node56, false);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer61 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator62 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator62.addArrayList(node63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator62.addAllSiblings(node65);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator62.addList(node67, false);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator62.addList(node70, false);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context75 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator62.addList(node73, false, context75);
        codeGenerator41.addList(node59, false, context75);
        com.google.javascript.rhino.Node node78 = null;
        codeGenerator41.addAllSiblings(node78);
        com.google.javascript.rhino.Node node80 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context82 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator41.addList(node80, false, context82);
        codeGenerator1.addList(node38, false, context82);
        com.google.javascript.rhino.Node node85 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context54 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context54.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context75 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context75.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context82 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context82.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/ \"\\\"// /hi!/ //\\\"\"'/\"\\\\\"//\\\\\"\"/'/hi!/'/\"\\\\\"//\\\\\"\"/'\"\\\"// /hi!/ //\\\"\" /");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "// \"\\\"// /hi!/ //\\\"\"'/\"\\\\\"//\\\\\"\"/'/hi!/'/\"\\\\\"//\\\\\"\"/'\"\\\"// /hi!/ //\\\"\" //" + "'", str1, "// \"\\\"// /hi!/ //\\\"\"'/\"\\\\\"//\\\\\"\"/'/hi!/'/\"\\\\\"//\\\\\"\"/'\"\\\"// /hi!/ //\\\"\" //");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/a// /hi!/ //a/", 'a', "a/# // ///hi!/// // #////////hi!///////////\"/ /hi!/ /\"/////# // ///hi!/// // #////a//a///////\"/ /hi!/ /\"/////# // ///hi!/// // #////////hi!////////# // ///hi!/// // #/a", "\"#/'//\\\"/ /hi!/ /\\\"//'4hi!4'//\\\"/ /hi!/ /\\\"//'/#\"", "\"\\\"a/4//hi!//4/a\\\"\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a/a// /hi!/ //a/a" + "'", str6, "a/a// /hi!/ //a/a");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator11.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator11.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator11.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator11.addList(node22, false, context24);
        codeGenerator2.addList(node7, true, context24);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator2.addList(node27, false);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator2.addAllSiblings(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator2.addList(node32, false);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator2.addArrayList(node35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator2.addArrayList(node37);
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, false);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator17.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator17.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator17.addList(node28, false, context30);
        codeGenerator2.addList(node13, false, context30);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("'\"/hi!/\"'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11, false);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addArrayList(node18);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"////\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "'\"a//a\"'", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator26.addList(node29, false);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator26.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator26.addArrayList(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator26.addList(node37, false, context39);
        codeGenerator2.addList(node22, true, context39);
        com.google.javascript.rhino.Node node42 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node42, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11, charset12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator13.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator13.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator13.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator13.addList(node24, false, context26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator13.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator13.addList(node30, true);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        java.nio.charset.Charset charset36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35, charset36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator37.addList(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator37.addList(node40, false);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator37.addList(node43, true);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator37.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator37.addList(node48, false, context50);
        codeGenerator13.addList(node33, true, context50);
        codeGenerator2.addList(node9, true, context50);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator2.addList(node54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator2.addAllSiblings(node56);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
        codeGenerator2.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("'\"hi!\"'", '4', "/\"/\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"/\"/", "'\"/# a//a #/\"'", "\"'\\\"/4hi!4/\\\"'\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4'\"/# a//a #/\"'/\"/\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"/\"/hi!/\"/\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"/\"/'\"/# a//a #/\"'4" + "'", str6, "4'\"/# a//a #/\"'/\"/\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"/\"/hi!/\"/\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"/\"/'\"/# a//a #/\"'4");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/'##/ /hi!/ /#\"\\\\\"/4//hi!//4/\\\\\"\"#/ /hi!/ /#//\"\\\\\"/4//hi!//4/\\\\\"\"\"\\\\\"/4//hi!//4/\\\\\"\"\"\\\\\"/4//hi!//4/\\\\\"\"#/ /hi!/ /#/hi!/\"\\\\\"/4//hi!//4/\\\\\"\"\"\\\\\"/4//hi!//4/\\\\\"\"\"\\\\\"/4//hi!//4/\\\\\"\"#/ /hi!/ /#//\"\\\\\"/4//hi!//4/\\\\\"\"#/ /hi!/ /##/ /hi!/ /##'/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//'##/ /hi!/ /#\"\\\\\"/4//hi!//4/\\\\\"\"#/ /hi!/ /#//\"\\\\\"/4//hi!//4/\\\\\"\"\"\\\\\"/4//hi!//4/\\\\\"\"\"\\\\\"/4//hi!//4/\\\\\"\"#/ /hi!/ /#/hi!/\"\\\\\"/4//hi!//4/\\\\\"\"\"\\\\\"/4//hi!//4/\\\\\"\"\"\\\\\"/4//hi!//4/\\\\\"\"#/ /hi!/ /#//\"\\\\\"/4//hi!//4/\\\\\"\"#/ /hi!/ /##/ /hi!/ /##'//" + "'", str1, "//'##/ /hi!/ /#\"\\\\\"/4//hi!//4/\\\\\"\"#/ /hi!/ /#//\"\\\\\"/4//hi!//4/\\\\\"\"\"\\\\\"/4//hi!//4/\\\\\"\"\"\\\\\"/4//hi!//4/\\\\\"\"#/ /hi!/ /#/hi!/\"\\\\\"/4//hi!//4/\\\\\"\"\"\\\\\"/4//hi!//4/\\\\\"\"\"\\\\\"/4//hi!//4/\\\\\"\"#/ /hi!/ /#//\"\\\\\"/4//hi!//4/\\\\\"\"#/ /hi!/ /##/ /hi!/ /##'//");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator23.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        java.nio.charset.Charset charset31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30, charset31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator32.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator32.addList(node38, true);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator32.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator32.addList(node43, false, context45);
        codeGenerator23.addList(node28, true, context45);
        codeGenerator2.addList(node19, true, context45);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator2.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator2.addAllSiblings(node51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        java.nio.charset.Charset charset56 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator57 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer55, charset56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator57.addList(node58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator57.addList(node60, false);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator57.addList(node63, false);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator57.addArrayList(node66);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer70 = null;
        java.nio.charset.Charset charset71 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator72 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer70, charset71);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator72.addList(node73);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator72.addList(node75, false);
        com.google.javascript.rhino.Node node78 = null;
        codeGenerator72.addList(node78, true);
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator72.addArrayList(node81);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context85 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator72.addList(node83, false, context85);
        codeGenerator57.addList(node68, false, context85);
        codeGenerator2.addList(node53, true, context85);
        com.google.javascript.rhino.Node node89 = null;
        codeGenerator2.addList(node89, false);
        com.google.javascript.rhino.Node node92 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context85 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context85.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/\"'\\\"\\\\\\\\\\\"//\\\\\\\\\\\"\\\"'\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'/\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"/'" + "'", str2, "'/\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"/'");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11, false);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, false);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        char[] charArray11 = new char[] { '#', '#', ' ' };
        com.google.javascript.jscomp.VariableMap variableMap12 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes13 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler6, true, charArray11, variableMap12);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        char[] charArray16 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap17 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes18 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler14, true, charArray16, variableMap17);
        com.google.javascript.jscomp.VariableMap variableMap19 = renamePrototypes18.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes20 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler4, false, charArray11, variableMap19);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        char[] charArray28 = new char[] { '#', '#', ' ' };
        com.google.javascript.jscomp.VariableMap variableMap29 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes30 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler23, true, charArray28, variableMap29);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler31 = null;
        char[] charArray33 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap34 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes35 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler31, true, charArray33, variableMap34);
        com.google.javascript.jscomp.VariableMap variableMap36 = renamePrototypes35.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap37 = renamePrototypes35.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap38 = renamePrototypes35.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes39 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler21, true, charArray28, variableMap38);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes40 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, false, charArray11, variableMap38);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler41 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler43 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler45 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler47 = null;
        char[] charArray49 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap50 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes51 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler47, true, charArray49, variableMap50);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler52 = null;
        char[] charArray54 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap55 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes56 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler52, true, charArray54, variableMap55);
        com.google.javascript.jscomp.VariableMap variableMap57 = renamePrototypes56.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap58 = renamePrototypes56.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes59 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler45, true, charArray49, variableMap58);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler60 = null;
        char[] charArray62 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap63 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes64 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler60, true, charArray62, variableMap63);
        com.google.javascript.jscomp.VariableMap variableMap65 = renamePrototypes64.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes66 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler43, true, charArray49, variableMap65);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler67 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler69 = null;
        char[] charArray74 = new char[] { '#', '#', ' ' };
        com.google.javascript.jscomp.VariableMap variableMap75 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes76 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler69, true, charArray74, variableMap75);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler77 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler79 = null;
        char[] charArray84 = new char[] { '#', '#', ' ' };
        com.google.javascript.jscomp.VariableMap variableMap85 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes86 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler79, true, charArray84, variableMap85);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler87 = null;
        char[] charArray89 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap90 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes91 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler87, true, charArray89, variableMap90);
        com.google.javascript.jscomp.VariableMap variableMap92 = renamePrototypes91.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes93 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler77, false, charArray84, variableMap92);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes94 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler67, false, charArray74, variableMap92);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes95 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler41, true, charArray49, variableMap92);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes96 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, true, charArray11, variableMap92);
        com.google.javascript.jscomp.VariableMap variableMap97 = renamePrototypes96.getPropertyMap();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '#', ' ' });
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertNotNull(variableMap19);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { '#', '#', ' ' });
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] {});
        org.junit.Assert.assertNotNull(variableMap36);
        org.junit.Assert.assertNotNull(variableMap37);
        org.junit.Assert.assertNotNull(variableMap38);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] {});
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] {});
        org.junit.Assert.assertNotNull(variableMap57);
        org.junit.Assert.assertNotNull(variableMap58);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] {});
        org.junit.Assert.assertNotNull(variableMap65);
        org.junit.Assert.assertNotNull(charArray74);
        org.junit.Assert.assertArrayEquals(charArray74, new char[] { '#', '#', ' ' });
        org.junit.Assert.assertNotNull(charArray84);
        org.junit.Assert.assertArrayEquals(charArray84, new char[] { '#', '#', ' ' });
        org.junit.Assert.assertNotNull(charArray89);
        org.junit.Assert.assertArrayEquals(charArray89, new char[] {});
        org.junit.Assert.assertNotNull(variableMap92);
        org.junit.Assert.assertNotNull(variableMap97);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator11.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator11.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator11.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator11.addList(node22, false, context24);
        codeGenerator2.addList(node7, true, context24);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator2.addList(node27, false);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator2.addAllSiblings(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator2.addArrayList(node32);
        java.lang.Class<?> wildcardClass34 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'\"\\\\\"\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'\\\"\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\"'\"" + "'", str1, "\"'\\\"\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\"'\"");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator11.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator11.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator11.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator11.addList(node22, false, context24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator11.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        java.nio.charset.Charset charset31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30, charset31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator32.addList(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer39 = null;
        java.nio.charset.Charset charset40 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator41 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer39, charset40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator41.addList(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator41.addList(node44, false);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator41.addList(node47, true);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator41.addArrayList(node50);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context54 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator41.addList(node52, false, context54);
        codeGenerator32.addList(node37, true, context54);
        codeGenerator11.addList(node28, true, context54);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator11.addAllSiblings(node58);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer62 = null;
        java.nio.charset.Charset charset63 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator64 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer62, charset63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator64.addList(node65);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator64.addList(node67);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator64.addAllSiblings(node69);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer73 = null;
        java.nio.charset.Charset charset74 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator75 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer73, charset74);
        com.google.javascript.rhino.Node node76 = null;
        codeGenerator75.addList(node76);
        com.google.javascript.rhino.Node node78 = null;
        codeGenerator75.addList(node78, false);
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator75.addList(node81, true);
        com.google.javascript.rhino.Node node84 = null;
        codeGenerator75.addArrayList(node84);
        com.google.javascript.rhino.Node node86 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context88 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator75.addList(node86, false, context88);
        codeGenerator64.addList(node71, true, context88);
        codeGenerator11.addList(node60, true, context88);
        codeGenerator2.addList(node7, false, context88);
        com.google.javascript.rhino.Node node93 = null;
        codeGenerator2.addList(node93);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context54 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context54.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context88 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context88.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node12, false, context14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator1.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator1.addArrayList(node25);
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11, charset12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator13.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator13.addList(node18, true, context20);
        codeGenerator2.addList(node9, false, context20);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator2.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator2.addArrayList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator2.addAllSiblings(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        java.nio.charset.Charset charset35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer34, charset35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator36.addList(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator36.addList(node39, false);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        java.nio.charset.Charset charset45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer44, charset45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator46.addList(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator46.addList(node49, false);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator46.addList(node52, true);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator46.addArrayList(node55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator46.addArrayList(node57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator46.addArrayList(node59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator46.addAllSiblings(node61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator46.addList(node63);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context67 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator46.addList(node65, true, context67);
        codeGenerator36.addList(node42, false, context67);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node32, (int) (byte) 1, context67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context67 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context67.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        char[] charArray8 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap9 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes10 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler6, true, charArray8, variableMap9);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        char[] charArray13 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap14 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes15 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler11, true, charArray13, variableMap14);
        com.google.javascript.jscomp.VariableMap variableMap16 = renamePrototypes15.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap17 = renamePrototypes15.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes18 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler4, true, charArray8, variableMap17);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        char[] charArray21 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap22 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes23 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler19, true, charArray21, variableMap22);
        com.google.javascript.jscomp.VariableMap variableMap24 = renamePrototypes23.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes25 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, true, charArray8, variableMap24);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler26 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler28 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler32 = null;
        char[] charArray34 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap35 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes36 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler32, true, charArray34, variableMap35);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler37 = null;
        char[] charArray39 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap40 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes41 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler37, true, charArray39, variableMap40);
        com.google.javascript.jscomp.VariableMap variableMap42 = renamePrototypes41.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap43 = renamePrototypes41.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes44 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler30, true, charArray34, variableMap43);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler45 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler47 = null;
        char[] charArray52 = new char[] { '#', '#', ' ' };
        com.google.javascript.jscomp.VariableMap variableMap53 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes54 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler47, true, charArray52, variableMap53);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler55 = null;
        char[] charArray57 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap58 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes59 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler55, true, charArray57, variableMap58);
        com.google.javascript.jscomp.VariableMap variableMap60 = renamePrototypes59.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes61 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler45, false, charArray52, variableMap60);
        com.google.javascript.jscomp.VariableMap variableMap62 = renamePrototypes61.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes63 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler28, true, charArray34, variableMap62);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler64 = null;
        char[] charArray66 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap67 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes68 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler64, true, charArray66, variableMap67);
        com.google.javascript.jscomp.VariableMap variableMap69 = renamePrototypes68.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap70 = renamePrototypes68.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes71 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler26, true, charArray34, variableMap70);
        com.google.javascript.jscomp.VariableMap variableMap72 = renamePrototypes71.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap73 = renamePrototypes71.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap74 = renamePrototypes71.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes75 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, true, charArray8, variableMap74);
        com.google.javascript.jscomp.VariableMap variableMap76 = renamePrototypes75.getPropertyMap();
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.rhino.Node node78 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes75.process(node77, node78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertNotNull(variableMap16);
        org.junit.Assert.assertNotNull(variableMap17);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] {});
        org.junit.Assert.assertNotNull(variableMap24);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] {});
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] {});
        org.junit.Assert.assertNotNull(variableMap42);
        org.junit.Assert.assertNotNull(variableMap43);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] { '#', '#', ' ' });
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertArrayEquals(charArray57, new char[] {});
        org.junit.Assert.assertNotNull(variableMap60);
        org.junit.Assert.assertNotNull(variableMap62);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertArrayEquals(charArray66, new char[] {});
        org.junit.Assert.assertNotNull(variableMap69);
        org.junit.Assert.assertNotNull(variableMap70);
        org.junit.Assert.assertNotNull(variableMap72);
        org.junit.Assert.assertNotNull(variableMap73);
        org.junit.Assert.assertNotNull(variableMap74);
        org.junit.Assert.assertNotNull(variableMap76);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node12, false, context14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator1.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator1.addList(node26, true);
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("'\"\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'\"\\\\\"\\\\\"\"'" + "'", str1, "'\"\\\\\"\\\\\"\"'");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\" /a/4//hi!//4/a/hi!/a/4//hi!//4/a/ \"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\" /a/4//hi!//4/a/hi!/a/4//hi!//4/a/ \"/" + "'", str2, "/\" /a/4//hi!//4/a/hi!/a/4//hi!//4/a/ \"/");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11, charset12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator13.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator13.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator13.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator13.addList(node24, false, context26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator13.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator13.addList(node30, true);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        java.nio.charset.Charset charset36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35, charset36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator37.addList(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator37.addList(node40, false);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator37.addList(node43, true);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator37.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator37.addList(node48, false, context50);
        codeGenerator13.addList(node33, true, context50);
        codeGenerator2.addList(node9, true, context50);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator2.addList(node54);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator23.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        java.nio.charset.Charset charset31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30, charset31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator32.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator32.addList(node38, true);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator32.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator32.addList(node43, false, context45);
        codeGenerator23.addList(node28, true, context45);
        codeGenerator2.addList(node19, true, context45);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator2.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator2.addAllSiblings(node51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        java.nio.charset.Charset charset56 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator57 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer55, charset56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator57.addList(node58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator57.addList(node60, false);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator57.addList(node63, false);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator57.addArrayList(node66);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer70 = null;
        java.nio.charset.Charset charset71 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator72 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer70, charset71);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator72.addList(node73);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator72.addList(node75, false);
        com.google.javascript.rhino.Node node78 = null;
        codeGenerator72.addList(node78, true);
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator72.addArrayList(node81);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context85 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator72.addList(node83, false, context85);
        codeGenerator57.addList(node68, false, context85);
        codeGenerator2.addList(node53, true, context85);
        com.google.javascript.rhino.Node node89 = null;
        codeGenerator2.addArrayList(node89);
        com.google.javascript.rhino.Node node91 = null;
        codeGenerator2.addAllSiblings(node91);
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context85 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context85.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, false);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator17.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator17.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator17.addList(node28, false, context30);
        codeGenerator2.addList(node13, false, context30);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator2.addAllSiblings(node33);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("a/a////\"////\"//#// /hi!/ //#//\"////\"////#// /hi!/ //#//\"////\"////\"////\"////a/'//\"/ /hi!/ /\"//'/a////\"////\"//#// /hi!/ //#//\"////\"////#// /hi!/ //#//\"////\"////\"////\"////a/'//\"/ /hi!/ /\"//'/a////\"////\"//#// /hi!/ //#//\"////\"////#// /hi!/ //#//\"////\"////\"////\"////aa//aa////\"////\"//#// /hi!/ //#//\"////\"////#// /hi!/ //#//\"////\"////\"////\"////a/'//\"/ /hi!/ /\"//'/a////\"////\"//#// /hi!/ //#//\"////\"////#// /hi!/ //#//\"////\"////\"////\"////a/'//\"/ /hi!/ /\"//'/a////\"////\"//#// /hi!/ //#//\"////\"////#// /hi!/ //#//\"////\"////\"////\"////a/a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"a/a////\\\"////\\\"//#// /hi!/ //#//\\\"////\\\"////#// /hi!/ //#//\\\"////\\\"////\\\"////\\\"////a/'//\\\"/ /hi!/ /\\\"//'/a////\\\"////\\\"//#// /hi!/ //#//\\\"////\\\"////#// /hi!/ //#//\\\"////\\\"////\\\"////\\\"////a/'//\\\"/ /hi!/ /\\\"//'/a////\\\"////\\\"//#// /hi!/ //#//\\\"////\\\"////#// /hi!/ //#//\\\"////\\\"////\\\"////\\\"////aa//aa////\\\"////\\\"//#// /hi!/ //#//\\\"////\\\"////#// /hi!/ //#//\\\"////\\\"////\\\"////\\\"////a/'//\\\"/ /hi!/ /\\\"//'/a////\\\"////\\\"//#// /hi!/ //#//\\\"////\\\"////#// /hi!/ //#//\\\"////\\\"////\\\"////\\\"////a/'//\\\"/ /hi!/ /\\\"//'/a////\\\"////\\\"//#// /hi!/ //#//\\\"////\\\"////#// /hi!/ //#//\\\"////\\\"////\\\"////\\\"////a/a\"" + "'", str1, "\"a/a////\\\"////\\\"//#// /hi!/ //#//\\\"////\\\"////#// /hi!/ //#//\\\"////\\\"////\\\"////\\\"////a/'//\\\"/ /hi!/ /\\\"//'/a////\\\"////\\\"//#// /hi!/ //#//\\\"////\\\"////#// /hi!/ //#//\\\"////\\\"////\\\"////\\\"////a/'//\\\"/ /hi!/ /\\\"//'/a////\\\"////\\\"//#// /hi!/ //#//\\\"////\\\"////#// /hi!/ //#//\\\"////\\\"////\\\"////\\\"////aa//aa////\\\"////\\\"//#// /hi!/ //#//\\\"////\\\"////#// /hi!/ //#//\\\"////\\\"////\\\"////\\\"////a/'//\\\"/ /hi!/ /\\\"//'/a////\\\"////\\\"//#// /hi!/ //#//\\\"////\\\"////#// /hi!/ //#//\\\"////\\\"////\\\"////\\\"////a/'//\\\"/ /hi!/ /\\\"//'/a////\\\"////\\\"//#// /hi!/ //#//\\\"////\\\"////#// /hi!/ //#//\\\"////\\\"////\\\"////\\\"////a/a\"");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node12, false, context14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator23.addList(node26, false);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator23.addList(node29, false);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator23.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator23.addAllSiblings(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator23.addList(node36, false, context38);
        codeGenerator1.addList(node19, false, context38);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator1.addArrayList(node41);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("4/\"a// /hi!/ //a\"44\"a// /hi!/ //a\"/ /hi!/ /44\"a// /hi!/ //a\"\"a// /hi!/ //a\"/4");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("///4hi!4///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "////4hi!4////" + "'", str1, "////4hi!4////");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node12, false, context14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator23.addList(node26, false, context28);
        codeGenerator1.addList(node19, true, context28);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator1.addList(node31, true);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator1.addArrayList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator1.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator1.addAllSiblings(node38);
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "///a//a///", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator20.addList(node23, false);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator20.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator20.addArrayList(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        java.nio.charset.Charset charset33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32, charset33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator34.addList(node35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator34.addList(node37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer41 = null;
        java.nio.charset.Charset charset42 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator43 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer41, charset42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator43.addList(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator43.addList(node46, false);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator43.addList(node49, true);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator43.addArrayList(node52);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context56 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator43.addList(node54, false, context56);
        codeGenerator34.addList(node39, true, context56);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator34.addAllSiblings(node59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator34.addList(node61, false);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context66 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator34.addList(node64, false, context66);
        codeGenerator20.addList(node30, false, context66);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node16, (int) (short) -1, context66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context56 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context56.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context66 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context66.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        char[] charArray7 = new char[] { '#', '#', ' ' };
        com.google.javascript.jscomp.VariableMap variableMap8 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes9 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, true, charArray7, variableMap8);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        char[] charArray19 = new char[] { '#', '#', ' ' };
        com.google.javascript.jscomp.VariableMap variableMap20 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes21 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler14, true, charArray19, variableMap20);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        char[] charArray24 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap25 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes26 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler22, true, charArray24, variableMap25);
        com.google.javascript.jscomp.VariableMap variableMap27 = renamePrototypes26.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes28 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler12, false, charArray19, variableMap27);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        char[] charArray31 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap32 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes33 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler29, true, charArray31, variableMap32);
        com.google.javascript.jscomp.VariableMap variableMap34 = renamePrototypes33.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes35 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler10, false, charArray19, variableMap34);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes36 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, false, charArray7, variableMap34);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '#', ' ' });
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '#', '#', ' ' });
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] {});
        org.junit.Assert.assertNotNull(variableMap27);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] {});
        org.junit.Assert.assertNotNull(variableMap34);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        char[] charArray8 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap9 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes10 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler6, true, charArray8, variableMap9);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        char[] charArray13 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap14 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes15 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler11, true, charArray13, variableMap14);
        com.google.javascript.jscomp.VariableMap variableMap16 = renamePrototypes15.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap17 = renamePrototypes15.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes18 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler4, true, charArray8, variableMap17);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        char[] charArray26 = new char[] { '#', '#', ' ' };
        com.google.javascript.jscomp.VariableMap variableMap27 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes28 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler21, true, charArray26, variableMap27);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        char[] charArray31 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap32 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes33 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler29, true, charArray31, variableMap32);
        com.google.javascript.jscomp.VariableMap variableMap34 = renamePrototypes33.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes35 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler19, false, charArray26, variableMap34);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes36 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, false, charArray8, variableMap34);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler37 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler39 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler41 = null;
        char[] charArray43 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap44 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes45 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler41, true, charArray43, variableMap44);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler46 = null;
        char[] charArray48 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap49 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes50 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler46, true, charArray48, variableMap49);
        com.google.javascript.jscomp.VariableMap variableMap51 = renamePrototypes50.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap52 = renamePrototypes50.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes53 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler39, true, charArray43, variableMap52);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler54 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler56 = null;
        char[] charArray61 = new char[] { '#', '#', ' ' };
        com.google.javascript.jscomp.VariableMap variableMap62 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes63 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler56, true, charArray61, variableMap62);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler64 = null;
        char[] charArray66 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap67 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes68 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler64, true, charArray66, variableMap67);
        com.google.javascript.jscomp.VariableMap variableMap69 = renamePrototypes68.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes70 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler54, false, charArray61, variableMap69);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes71 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler37, false, charArray43, variableMap69);
        com.google.javascript.jscomp.VariableMap variableMap72 = renamePrototypes71.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes73 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, false, charArray8, variableMap72);
        com.google.javascript.jscomp.VariableMap variableMap74 = renamePrototypes73.getPropertyMap();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertNotNull(variableMap16);
        org.junit.Assert.assertNotNull(variableMap17);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '#', '#', ' ' });
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] {});
        org.junit.Assert.assertNotNull(variableMap34);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] {});
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] {});
        org.junit.Assert.assertNotNull(variableMap51);
        org.junit.Assert.assertNotNull(variableMap52);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertArrayEquals(charArray61, new char[] { '#', '#', ' ' });
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertArrayEquals(charArray66, new char[] {});
        org.junit.Assert.assertNotNull(variableMap69);
        org.junit.Assert.assertNotNull(variableMap72);
        org.junit.Assert.assertNotNull(variableMap74);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator11.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator11.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator11.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator11.addList(node22, false, context24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator11.addList(node26, false);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addArrayList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator32.addAllSiblings(node35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator32.addList(node37, false);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator32.addList(node40, false);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator32.addList(node43, false, context45);
        codeGenerator11.addList(node29, false, context45);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator11.addAllSiblings(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator11.addList(node50, false, context52);
        codeGenerator2.addList(node8, false, context52);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator2.addList(node55);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer59 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator60 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator60.addList(node61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer65 = null;
        java.nio.charset.Charset charset66 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator67 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer65, charset66);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator67.addList(node68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator67.addList(node70);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator67.addAllSiblings(node72);
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer76 = null;
        java.nio.charset.Charset charset77 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator78 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer76, charset77);
        com.google.javascript.rhino.Node node79 = null;
        codeGenerator78.addList(node79);
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator78.addList(node81, false);
        com.google.javascript.rhino.Node node84 = null;
        codeGenerator78.addList(node84, true);
        com.google.javascript.rhino.Node node87 = null;
        codeGenerator78.addArrayList(node87);
        com.google.javascript.rhino.Node node89 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context91 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator78.addList(node89, false, context91);
        codeGenerator67.addList(node74, true, context91);
        codeGenerator60.addList(node63, true, context91);
        codeGenerator2.addList(node57, false, context91);
        com.google.javascript.rhino.Node node96 = null;
        codeGenerator2.addList(node96, false);
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context91 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context91.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/\"#//#// /hi!/ //#////#// /hi!/ //#//#\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node12, false, context14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator23.addList(node26, false);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator23.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator23.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator23.addList(node34, true);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator23.addList(node37, true, context39);
        codeGenerator1.addList(node19, true, context39);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator1.addArrayList(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator1.addArrayList(node44);
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/\"\\\"4hi!4\\\"\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node19, true, context21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator26.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator26.addList(node31, false);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator26.addList(node34, true, context36);
        codeGenerator2.addList(node23, true, context36);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator2.addList(node39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator2.addAllSiblings(node41);
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/ /a/4//hi!//4/a/hi!/a/4//hi!//4/a/ /", '4', "'\"\\\\\"//\\\\\"\"'", "#\"/'\\\"\\\\\\\\\\\"//\\\\\\\\\\\"\\\"'/\"/'/\"#// /hi!/ //#\"/'//4/\"a4 // 4a\"# // ///hi!/// // #\"a4 // 4a\"/44/\"a4 // 4a\"# // ///hi!/// // #\"a4 // 4a\"/4'/\"#// /hi!/ //#\"/'/hi!/4/\"a4 // 4a\"# // ///hi!/// // #\"a4 // 4a\"/44/\"a4 // 4a\"# // ///hi!/// // #\"a4 // 4a\"/4'/\"#// /hi!/ //#\"/'//'/\"#// /hi!/ //#\"/'/\"/'\\\"\\\\\\\\\\\"//\\\\\\\\\\\"\\\"'/\"#", "\"\\\"\\\\\\\"//a//a//\\\\\\\"\\\"\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4/ /a/4//hi!//4/a/hi!/a/4//hi!//4/a/ /4" + "'", str6, "4/ /a/4//hi!//4/a/hi!/a/4//hi!//4/a/ /4");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("'\"\\\\\"\\\\\\\\\\\\\"/ /hi!/ /\\\\\\\\\\\\\"\\\\\"\"'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"/ /hi!/ /\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\''" + "'", str2, "'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"/ /hi!/ /\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\''");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addAllSiblings(node19);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"a/4//hi!//4/a\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"a/4//hi!//4/a\"" + "'", str1, "\"a/4//hi!//4/a\"");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer6 = null;
        java.nio.charset.Charset charset7 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator8 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer6, charset7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator8.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator8.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator8.addList(node13, true, context15);
        codeGenerator1.addList(node4, false, context15);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addAllSiblings(node18);
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator20.addList(node23, false);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator20.addList(node26, true);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator20.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator20.addList(node31, false, context33);
        codeGenerator1.addList(node16, false, context33);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        java.nio.charset.Charset charset39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38, charset39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator40.addList(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator40.addList(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        java.nio.charset.Charset charset48 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator49 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47, charset48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator49.addList(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator49.addList(node52, false);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator49.addList(node55, true);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator49.addArrayList(node58);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context62 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator49.addList(node60, false, context62);
        codeGenerator40.addList(node45, true, context62);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator40.addAllSiblings(node65);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator40.addList(node67, false);
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context72 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator40.addList(node70, false, context72);
        codeGenerator1.addList(node36, false, context72);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator1.addAllSiblings(node75);
        com.google.javascript.rhino.Node node77 = null;
        codeGenerator1.addList(node77, true);
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context72 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context72.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator15.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator15.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator15.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator15.addList(node26, true);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator15.addList(node29, true, context31);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node11, (int) ' ', context31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, false);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node24, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/a/ /hi!/ /a/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"/a/ /hi!/ /a/\"/" + "'", str1, "/\"/a/ /hi!/ /a/\"/");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, false);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addList(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator28.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        java.nio.charset.Charset charset36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35, charset36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator37.addList(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator37.addList(node40, false);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator37.addList(node43, true);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator37.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator37.addList(node48, false, context50);
        codeGenerator28.addList(node33, true, context50);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator28.addAllSiblings(node53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator28.addList(node55, false);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context60 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator28.addList(node58, false, context60);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node24, 0, context60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context60 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context60.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
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
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator16.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        java.nio.charset.Charset charset24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23, charset24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator25.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator25.addList(node28, false);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator25.addList(node31, true);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator25.addArrayList(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator25.addList(node36, false, context38);
        codeGenerator16.addList(node21, true, context38);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator16.addAllSiblings(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator16.addList(node43, false);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator16.addList(node46, false, context48);
        codeGenerator2.addList(node12, false, context48);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator2.addList(node51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator2.addList(node53, false);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer58 = null;
        java.nio.charset.Charset charset59 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator60 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer58, charset59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator60.addList(node61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator60.addList(node63, false);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator60.addList(node66, true);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator60.addArrayList(node69);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context73 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator60.addList(node71, false, context73);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator60.addList(node75);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context79 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator60.addList(node77, true, context79);
        codeGenerator2.addList(node56, false, context79);
        com.google.javascript.rhino.Node node82 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node82, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context73 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context73.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context79 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context79.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator11.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator11.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator11.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator11.addList(node22, false, context24);
        codeGenerator2.addList(node7, true, context24);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator2.addAllSiblings(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator2.addList(node29, false);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node32, false, context34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator2.addArrayList(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator2.addAllSiblings(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator2.addList(node40, true);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator2.addArrayList(node43);
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("4a#//#// /hi!/ //#////#// /hi!/ //#//#a/\"\\\"\\\"\"a#//#// /hi!/ //#////#// /hi!/ //#//#a\"/a // a/\"//\"\\\"\\\"\"\"\\\"\\\"\"\"\\\"\\\"\"a#//#// /hi!/ //#////#// /hi!/ //#//#a\"\\\"\\\"\"\"\\\"\\\"\"\"\\\"\\\"\"a#//#// /hi!/ //#////#// /hi!/ //#//#a//\"/a // a/\"\"\\\"\\\"\"a#//#// /hi!/ //#////#// /hi!/ //#//#a/a#//#// /hi!/ //#////#// /hi!/ //#//#a4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4a#//#// /hi!/ //#////#// /hi!/ //#//#a/\"\\\"\\\"\"a#//#// /hi!/ //#////#// /hi!/ //#//#a\"/a // a/\"//\"\\\"\\\"\"\"\\\"\\\"\"\"\\\"\\\"\"a#//#// /hi!/ //#////#// /hi!/ //#//#a\"\\\"\\\"\"\"\\\"\\\"\"\"\\\"\\\"\"a#//#// /hi!/ //#////#// /hi!/ //#//#a//\"/a // a/\"\"\\\"\\\"\"a#//#// /hi!/ //#////#// /hi!/ //#//#a/a#//#// /hi!/ //#////#// /hi!/ //#//#a4" + "'", str1, "4a#//#// /hi!/ //#////#// /hi!/ //#//#a/\"\\\"\\\"\"a#//#// /hi!/ //#////#// /hi!/ //#//#a\"/a // a/\"//\"\\\"\\\"\"\"\\\"\\\"\"\"\\\"\\\"\"a#//#// /hi!/ //#////#// /hi!/ //#//#a\"\\\"\\\"\"\"\\\"\\\"\"\"\\\"\\\"\"a#//#// /hi!/ //#////#// /hi!/ //#//#a//\"/a // a/\"\"\\\"\\\"\"a#//#// /hi!/ //#////#// /hi!/ //#//#a/a#//#// /hi!/ //#////#// /hi!/ //#//#a4");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "\"//////hi!//////\"", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
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
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, true);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, false);
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
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, false);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator22.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator22.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator22.addList(node30, false, context32);
        codeGenerator15.addList(node18, false, context32);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        java.nio.charset.Charset charset38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37, charset38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator39.addList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator39.addList(node42, false);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator39.addList(node45, true);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator39.addArrayList(node48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator39.addList(node50, true);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context55 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator39.addList(node53, true, context55);
        codeGenerator15.addList(node35, false, context55);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node13, context55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context55 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context55.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator11.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator11.addList(node16, true, context18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator11.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator25.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        java.nio.charset.Charset charset31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30, charset31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator32.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator32.addList(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator32.addList(node40, false, context42);
        codeGenerator25.addList(node28, false, context42);
        codeGenerator11.addList(node22, true, context42);
        codeGenerator2.addList(node7, true, context42);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator2.addArrayList(node47);
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator20.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator20.addAllSiblings(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator31.addList(node34, false);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator31.addList(node37, true);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator31.addArrayList(node40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context44 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator31.addList(node42, false, context44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator31.addList(node46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator31.addList(node48, true);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer53 = null;
        java.nio.charset.Charset charset54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer53, charset54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator55.addList(node56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator55.addList(node58, false);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator55.addList(node61, true);
        com.google.javascript.rhino.Node node64 = null;
        codeGenerator55.addArrayList(node64);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context68 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator55.addList(node66, false, context68);
        codeGenerator31.addList(node51, true, context68);
        codeGenerator20.addList(node27, true, context68);
        codeGenerator2.addList(node16, false, context68);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator2.addList(node73);
        org.junit.Assert.assertTrue("'" + context44 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context44.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context68 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context68.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"'\\\\\\\"/4hi!4/\\\\\\\"'\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\\\"'\\\\\\\"/4hi!4/\\\\\\\"'\\\"\"/" + "'", str1, "/\"\\\"'\\\\\\\"/4hi!4/\\\\\\\"'\\\"\"/");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node12, false, context14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator23.addList(node26, false);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator23.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator23.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator23.addList(node34, true);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator23.addList(node37, true, context39);
        codeGenerator1.addList(node19, true, context39);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator1.addList(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator1.addList(node44, false);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator1.addList(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator1.addList(node49);
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "\"'\\\"  //hi!//  \\\"'\"", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("'/\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"/'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'/\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"/'" + "'", str1, "'/\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"/'");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node12, false, context14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator1.addAllSiblings(node23);
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "//\" /hi!/ \"//", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator22.addList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator22.addAllSiblings(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        java.nio.charset.Charset charset32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer31, charset32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator33.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator33.addList(node36, false);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator33.addList(node39, true);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator33.addArrayList(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator33.addList(node44, false, context46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator33.addList(node48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator33.addList(node50, true);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        java.nio.charset.Charset charset56 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator57 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer55, charset56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator57.addList(node58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator57.addList(node60, false);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator57.addList(node63, true);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator57.addArrayList(node66);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context70 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator57.addList(node68, false, context70);
        codeGenerator33.addList(node53, true, context70);
        codeGenerator22.addList(node29, true, context70);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node18, (int) (byte) 1, context70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context70 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context70.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("#//' /\\'\"\\\\\\\\\"//\\\\\\\\\"\"\\'//# a//a #//\\'\"\\\\\\\\\"//\\\\\\\\\"\"\\'/ 'a4 // 4a' /\\'\"\\\\\\\\\"//\\\\\\\\\"\"\\'//# a//a #//\\'\"\\\\\\\\\"//\\\\\\\\\"\"\\'/ '//#", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/#//' /\\'\"\\\\\\\\\"//\\\\\\\\\"\"\\'//# a//a #//\\'\"\\\\\\\\\"//\\\\\\\\\"\"\\'/ 'a4 // 4a' /\\'\"\\\\\\\\\"//\\\\\\\\\"\"\\'//# a//a #//\\'\"\\\\\\\\\"//\\\\\\\\\"\"\\'/ '//#/" + "'", str2, "/#//' /\\'\"\\\\\\\\\"//\\\\\\\\\"\"\\'//# a//a #//\\'\"\\\\\\\\\"//\\\\\\\\\"\"\\'/ 'a4 // 4a' /\\'\"\\\\\\\\\"//\\\\\\\\\"\"\\'//# a//a #//\\'\"\\\\\\\\\"//\\\\\\\\\"\"\\'/ '//#/");
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator23.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        java.nio.charset.Charset charset31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30, charset31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator32.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator32.addList(node38, true);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator32.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator32.addList(node43, false, context45);
        codeGenerator23.addList(node28, true, context45);
        codeGenerator2.addList(node19, true, context45);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator2.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator2.addList(node51);
        com.google.javascript.rhino.Node node53 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        char[] charArray9 = new char[] { '#', '#', ' ' };
        com.google.javascript.jscomp.VariableMap variableMap10 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes11 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler4, true, charArray9, variableMap10);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        char[] charArray14 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap15 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes16 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler12, true, charArray14, variableMap15);
        com.google.javascript.jscomp.VariableMap variableMap17 = renamePrototypes16.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes18 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, false, charArray9, variableMap17);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler25 = null;
        char[] charArray27 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap28 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes29 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler25, true, charArray27, variableMap28);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        char[] charArray32 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap33 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes34 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler30, true, charArray32, variableMap33);
        com.google.javascript.jscomp.VariableMap variableMap35 = renamePrototypes34.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap36 = renamePrototypes34.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes37 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler23, true, charArray27, variableMap36);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler38 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler40 = null;
        char[] charArray45 = new char[] { '#', '#', ' ' };
        com.google.javascript.jscomp.VariableMap variableMap46 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes47 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler40, true, charArray45, variableMap46);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler48 = null;
        char[] charArray50 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap51 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes52 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler48, true, charArray50, variableMap51);
        com.google.javascript.jscomp.VariableMap variableMap53 = renamePrototypes52.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes54 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler38, false, charArray45, variableMap53);
        com.google.javascript.jscomp.VariableMap variableMap55 = renamePrototypes54.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes56 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler21, true, charArray27, variableMap55);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler57 = null;
        char[] charArray59 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap60 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes61 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler57, true, charArray59, variableMap60);
        com.google.javascript.jscomp.VariableMap variableMap62 = renamePrototypes61.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes63 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler19, true, charArray27, variableMap62);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes64 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, false, charArray9, variableMap62);
        com.google.javascript.jscomp.VariableMap variableMap65 = renamePrototypes64.getPropertyMap();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '#', ' ' });
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertNotNull(variableMap17);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] {});
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] {});
        org.junit.Assert.assertNotNull(variableMap35);
        org.junit.Assert.assertNotNull(variableMap36);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { '#', '#', ' ' });
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] {});
        org.junit.Assert.assertNotNull(variableMap53);
        org.junit.Assert.assertNotNull(variableMap55);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] {});
        org.junit.Assert.assertNotNull(variableMap62);
        org.junit.Assert.assertNotNull(variableMap65);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node12, false, context14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator23.addList(node26, false, context28);
        codeGenerator1.addList(node19, true, context28);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        java.nio.charset.Charset charset33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32, charset33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator34.addList(node35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator34.addList(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator34.addArrayList(node39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator34.addList(node41, false);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator34.addAllSiblings(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator34.addAllSiblings(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer50 = null;
        java.nio.charset.Charset charset51 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator52 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer50, charset51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator52.addList(node53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator52.addList(node55, false);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator52.addAllSiblings(node58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator52.addArrayList(node60);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator52.addList(node62, true);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer67 = null;
        java.nio.charset.Charset charset68 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator69 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer67, charset68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator69.addList(node70);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator69.addList(node72);
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context76 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator69.addList(node74, true, context76);
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context80 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator69.addList(node78, false, context80);
        codeGenerator52.addList(node65, true, context80);
        codeGenerator34.addList(node48, true, context80);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node31, context80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context76 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context76.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context80 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context80.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, false);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addAllSiblings(node17);
        java.lang.Class<?> wildcardClass19 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'//\"hi!\"//'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'//\"hi!\"//'/" + "'", str2, "/'//\"hi!\"//'/");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("///\"////\"///", '#', "/ /a/4//hi!//4/a/hi!/a/4//hi!//4/a/ /", "//a///a//a///a//", "////4hi!4////", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#//// /a/4//hi!//4/a/hi!/a/4//hi!//4/a/ ////// /a/4//hi!//4/a/hi!/a/4//hi!//4/a/ ////#" + "'", str6, "#//// /a/4//hi!//4/a/hi!/a/4//hi!//4/a/ ////// /a/4//hi!//4/a/hi!/a/4//hi!//4/a/ ////#");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, true);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator23.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator23.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        java.nio.charset.Charset charset33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32, charset33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator34.addList(node35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator34.addList(node37, false);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator34.addList(node40, true);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator34.addArrayList(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context47 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator34.addList(node45, false, context47);
        codeGenerator23.addList(node30, true, context47);
        codeGenerator1.addList(node19, false, context47);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator23.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        java.nio.charset.Charset charset31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30, charset31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator32.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator32.addList(node38, true);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator32.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator32.addList(node43, false, context45);
        codeGenerator23.addList(node28, true, context45);
        codeGenerator2.addList(node19, true, context45);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator2.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator2.addAllSiblings(node51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator2.addList(node53, true);
        java.lang.Class<?> wildcardClass56 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/'\"\\'\\\\\"///a//a///\\\\\"\\'\"'/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'\"\\'\\\\\"///a//a///\\\\\"\\'\"'/" + "'", str1, "/'\"\\'\\\\\"///a//a///\\\\\"\\'\"'/");
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        java.nio.charset.Charset charset26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25, charset26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator27.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator27.addArrayList(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        java.nio.charset.Charset charset35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer34, charset35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator36.addList(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator36.addList(node39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        java.nio.charset.Charset charset44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer43, charset44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator45.addList(node46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator45.addList(node48, false);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator45.addList(node51, true);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator45.addArrayList(node54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context58 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator45.addList(node56, false, context58);
        codeGenerator36.addList(node41, true, context58);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator36.addAllSiblings(node61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator36.addList(node63, false);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context68 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator36.addList(node66, false, context68);
        codeGenerator27.addList(node32, false, context68);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node24, context68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context58 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context58.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context68 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context68.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("##  //hi!//  ##");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##  //hi!//  ##" + "'", str1, "##  //hi!//  ##");
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        char[] charArray4 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes6 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, true, charArray4, variableMap5);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        char[] charArray17 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap18 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes19 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler15, true, charArray17, variableMap18);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler20 = null;
        char[] charArray22 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap23 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes24 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler20, true, charArray22, variableMap23);
        com.google.javascript.jscomp.VariableMap variableMap25 = renamePrototypes24.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap26 = renamePrototypes24.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes27 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler13, true, charArray17, variableMap26);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler28 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        char[] charArray35 = new char[] { '#', '#', ' ' };
        com.google.javascript.jscomp.VariableMap variableMap36 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes37 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler30, true, charArray35, variableMap36);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler38 = null;
        char[] charArray40 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap41 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes42 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler38, true, charArray40, variableMap41);
        com.google.javascript.jscomp.VariableMap variableMap43 = renamePrototypes42.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes44 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler28, false, charArray35, variableMap43);
        com.google.javascript.jscomp.VariableMap variableMap45 = renamePrototypes44.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes46 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler11, true, charArray17, variableMap45);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler47 = null;
        char[] charArray49 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap50 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes51 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler47, true, charArray49, variableMap50);
        com.google.javascript.jscomp.VariableMap variableMap52 = renamePrototypes51.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes53 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler9, true, charArray17, variableMap52);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler54 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler56 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler58 = null;
        char[] charArray60 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap61 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes62 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler58, true, charArray60, variableMap61);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler63 = null;
        char[] charArray65 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap66 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes67 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler63, true, charArray65, variableMap66);
        com.google.javascript.jscomp.VariableMap variableMap68 = renamePrototypes67.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap69 = renamePrototypes67.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes70 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler56, true, charArray60, variableMap69);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler71 = null;
        char[] charArray73 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap74 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes75 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler71, true, charArray73, variableMap74);
        com.google.javascript.jscomp.VariableMap variableMap76 = renamePrototypes75.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes77 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler54, true, charArray60, variableMap76);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes78 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler7, false, charArray17, variableMap76);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes79 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, false, charArray4, variableMap76);
        com.google.javascript.jscomp.VariableMap variableMap80 = renamePrototypes79.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap81 = renamePrototypes79.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap82 = renamePrototypes79.getPropertyMap();
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.rhino.Node node84 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes79.process(node83, node84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertNotNull(variableMap25);
        org.junit.Assert.assertNotNull(variableMap26);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { '#', '#', ' ' });
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] {});
        org.junit.Assert.assertNotNull(variableMap43);
        org.junit.Assert.assertNotNull(variableMap45);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] {});
        org.junit.Assert.assertNotNull(variableMap52);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertArrayEquals(charArray60, new char[] {});
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertArrayEquals(charArray65, new char[] {});
        org.junit.Assert.assertNotNull(variableMap68);
        org.junit.Assert.assertNotNull(variableMap69);
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertArrayEquals(charArray73, new char[] {});
        org.junit.Assert.assertNotNull(variableMap76);
        org.junit.Assert.assertNotNull(variableMap80);
        org.junit.Assert.assertNotNull(variableMap81);
        org.junit.Assert.assertNotNull(variableMap82);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addAllSiblings(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addList(node21, false);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, false);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator17.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator17.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator17.addList(node28, false, context30);
        codeGenerator2.addList(node13, false, context30);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = null;
        codeGenerator2.addList(node33, false, context35);
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        char[] charArray12 = new char[] { '#', '#', ' ' };
        com.google.javascript.jscomp.VariableMap variableMap13 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes14 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler7, true, charArray12, variableMap13);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        char[] charArray17 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap18 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes19 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler15, true, charArray17, variableMap18);
        com.google.javascript.jscomp.VariableMap variableMap20 = renamePrototypes19.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes21 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler5, false, charArray12, variableMap20);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler24 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler26 = null;
        char[] charArray28 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap29 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes30 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler26, true, charArray28, variableMap29);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler31 = null;
        char[] charArray33 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap34 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes35 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler31, true, charArray33, variableMap34);
        com.google.javascript.jscomp.VariableMap variableMap36 = renamePrototypes35.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap37 = renamePrototypes35.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes38 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler24, true, charArray28, variableMap37);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler39 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler41 = null;
        char[] charArray46 = new char[] { '#', '#', ' ' };
        com.google.javascript.jscomp.VariableMap variableMap47 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes48 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler41, true, charArray46, variableMap47);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler49 = null;
        char[] charArray51 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap52 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes53 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler49, true, charArray51, variableMap52);
        com.google.javascript.jscomp.VariableMap variableMap54 = renamePrototypes53.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes55 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler39, false, charArray46, variableMap54);
        com.google.javascript.jscomp.VariableMap variableMap56 = renamePrototypes55.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes57 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler22, true, charArray28, variableMap56);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes58 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler3, false, charArray12, variableMap56);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes59 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, false, charArray2, variableMap56);
        com.google.javascript.jscomp.VariableMap variableMap60 = renamePrototypes59.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap61 = renamePrototypes59.getPropertyMap();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', '#', ' ' });
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertNotNull(variableMap20);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] {});
        org.junit.Assert.assertNotNull(variableMap36);
        org.junit.Assert.assertNotNull(variableMap37);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] { '#', '#', ' ' });
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] {});
        org.junit.Assert.assertNotNull(variableMap54);
        org.junit.Assert.assertNotNull(variableMap56);
        org.junit.Assert.assertNotNull(variableMap60);
        org.junit.Assert.assertNotNull(variableMap61);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, false);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator23.addList(node26, false, context28);
        codeGenerator2.addList(node19, false, context28);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator2.addList(node31, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("a // a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node12, false, context14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator22.addAllSiblings(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator22.addList(node27, false);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator22.addList(node30, false);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator22.addList(node33, false, context35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator22.addList(node37, false);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        java.nio.charset.Charset charset43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer42, charset43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator44.addList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator44.addList(node47, false);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator44.addList(node50, true);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator44.addArrayList(node53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator44.addList(node55, true);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context60 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator44.addList(node58, true, context60);
        codeGenerator22.addList(node40, true, context60);
        codeGenerator1.addList(node19, true, context60);
        java.lang.Class<?> wildcardClass64 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context60 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context60.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator22.addArrayList(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addArrayList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator30.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator30.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator30.addList(node38, false);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context43 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator30.addList(node41, false, context43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator30.addList(node45, false);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer50 = null;
        java.nio.charset.Charset charset51 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator52 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer50, charset51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator52.addList(node53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator52.addList(node55, false);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator52.addList(node58, false);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator52.addArrayList(node61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator52.addAllSiblings(node63);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context67 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator52.addList(node65, false, context67);
        codeGenerator30.addList(node48, false, context67);
        codeGenerator22.addList(node27, false, context67);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node18, (int) (byte) -1, context67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context67 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context67.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "///4hi!4///", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node16, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/'/\"hi!\"/'/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
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
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator16.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        java.nio.charset.Charset charset24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23, charset24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator25.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator25.addList(node28, false);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator25.addList(node31, true);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator25.addArrayList(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator25.addList(node36, false, context38);
        codeGenerator16.addList(node21, true, context38);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator16.addAllSiblings(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator16.addList(node43, false);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator16.addList(node46, false, context48);
        codeGenerator2.addList(node12, false, context48);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator2.addList(node51, false);
        com.google.javascript.rhino.Node node54 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator11.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator11.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator11.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator11.addList(node22, false, context24);
        codeGenerator2.addList(node7, true, context24);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator2.addAllSiblings(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator2.addList(node29, false);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node32, false, context34);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/'\"/\\'/\\\\\"hi!\\\\\"/\\'/\"'/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        java.nio.charset.Charset charset13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12, charset13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator14.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator23.addList(node26, false);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator23.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator23.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator23.addList(node34, false, context36);
        codeGenerator14.addList(node19, true, context36);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator14.addAllSiblings(node39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator14.addList(node41, false);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator14.addList(node44, false, context46);
        codeGenerator2.addList(node10, false, context46);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator2.addList(node49);
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/a////\"////\"//#// /hi!/ //#//\"////\"////#// /hi!/ //#//\"////\"////\"////\"////a/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/a////\"////\"//#// /hi!/ //#//\"////\"////#// /hi!/ //#//\"////\"////\"////\"////a/" + "'", str1, "/a////\"////\"//#// /hi!/ //#//\"////\"////#// /hi!/ //#//\"////\"////\"////\"////a/");
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/a/ /hi!/ /a/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/a/ /hi!/ /a/" + "'", str1, "/a/ /hi!/ /a/");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator15.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator15.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator26.addList(node29, false);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator26.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator26.addArrayList(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator26.addList(node37, false, context39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator26.addList(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator26.addList(node43, true);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer48 = null;
        java.nio.charset.Charset charset49 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator50 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer48, charset49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator50.addList(node51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator50.addList(node53, false);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator50.addList(node56, true);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator50.addArrayList(node59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context63 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator50.addList(node61, false, context63);
        codeGenerator26.addList(node46, true, context63);
        codeGenerator15.addList(node22, true, context63);
        codeGenerator1.addList(node11, true, context63);
        java.lang.Class<?> wildcardClass68 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context63 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context63.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "\"/4'\\\"////\\\"'a// /hi!/ //a/4 // 4'\\\"////\\\"'/4 // 44 // 4a// /hi!/ //ahi!4 // 44 // 4a// /hi!/ //a/4 // 4'\\\"////\\\"'/a// /hi!/ //a'\\\"////\\\"'4/\"", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("a///a//a///a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a///a//a///a" + "'", str1, "a///a//a///a");
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11, charset12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator13.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator13.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator13.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator13.addList(node24, false, context26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator13.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator13.addList(node30, true);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        java.nio.charset.Charset charset36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35, charset36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator37.addList(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator37.addList(node40, false);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator37.addList(node43, true);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator37.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator37.addList(node48, false, context50);
        codeGenerator13.addList(node33, true, context50);
        codeGenerator2.addList(node9, true, context50);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator2.addAllSiblings(node54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator2.addAllSiblings(node56);
        com.google.javascript.rhino.Node node58 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator21.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        java.nio.charset.Charset charset31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30, charset31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator32.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator32.addList(node38, true);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator32.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator32.addList(node43, false, context45);
        codeGenerator21.addList(node28, true, context45);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node18, context45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"\\\"\\\\\\\"//\\\\\\\"\\\"\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"\\\"\\\\\\\"//\\\\\\\"\\\"\"//" + "'", str2, "//\"\\\"\\\\\\\"//\\\\\\\"\\\"\"//");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11, charset12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator13.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator13.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator13.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator13.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator13.addList(node27, true, context29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator13.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator13.addList(node33, true);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator13.addList(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator13.addArrayList(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator43 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator43.addAllSiblings(node44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer48 = null;
        java.nio.charset.Charset charset49 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator50 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer48, charset49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator50.addList(node51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator50.addList(node53, false);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator50.addList(node56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context60 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator50.addList(node58, false, context60);
        codeGenerator43.addList(node46, false, context60);
        codeGenerator13.addList(node40, false, context60);
        codeGenerator2.addList(node9, false, context60);
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context60 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context60.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node12, false, context14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator22.addAllSiblings(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator22.addList(node27, false);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator22.addList(node30, false);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator22.addList(node33, false, context35);
        codeGenerator1.addList(node19, false, context35);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator1.addAllSiblings(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node40, false, context42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator1.addList(node44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer48 = null;
        java.nio.charset.Charset charset49 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator50 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer48, charset49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator50.addAllSiblings(node51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        java.nio.charset.Charset charset56 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator57 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer55, charset56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator57.addList(node58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator57.addList(node60, false);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator57.addList(node63, true);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator57.addArrayList(node66);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context70 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator57.addList(node68, false, context70);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator57.addList(node72);
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context76 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator57.addList(node74, true, context76);
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer80 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator81 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer80);
        com.google.javascript.rhino.Node node82 = null;
        codeGenerator81.addList(node82);
        com.google.javascript.rhino.Node node84 = null;
        codeGenerator81.addAllSiblings(node84);
        com.google.javascript.rhino.Node node86 = null;
        codeGenerator81.addList(node86, false);
        com.google.javascript.rhino.Node node89 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context91 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator81.addList(node89, true, context91);
        codeGenerator57.addList(node78, true, context91);
        codeGenerator50.addList(node53, true, context91);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node46, (int) (byte) 10, context91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context70 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context70.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context76 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context76.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context91 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context91.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"\\\"\\\\\\\"//\\\\\\\"\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"//\\\\\\\\\\\\\"\\\\\"\"'" + "'", str2, "'\"\\\\\"\\\\\\\\\\\\\"//\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator19.addList(node22, false);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator19.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator19.addArrayList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator19.addAllSiblings(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator19.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator19.addArrayList(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        java.nio.charset.Charset charset39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38, charset39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator40.addList(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator40.addList(node43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator40.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer49 = null;
        java.nio.charset.Charset charset50 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator51 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer49, charset50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator51.addList(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator51.addList(node54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context58 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator51.addList(node56, true, context58);
        codeGenerator40.addList(node47, false, context58);
        codeGenerator19.addList(node36, false, context58);
        codeGenerator1.addList(node15, false, context58);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context65 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator1.addList(node63, false, context65);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator1.addAllSiblings(node67);
        org.junit.Assert.assertTrue("'" + context58 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context58.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context65 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context65.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"a/\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"// /hi!/ //\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"/a\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"a/\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"// /hi!/ //\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"/a\"/" + "'", str1, "/\"a/\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"// /hi!/ //\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"/a\"/");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        char[] charArray11 = new char[] { '#', '#', ' ' };
        com.google.javascript.jscomp.VariableMap variableMap12 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes13 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler6, true, charArray11, variableMap12);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        char[] charArray16 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap17 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes18 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler14, true, charArray16, variableMap17);
        com.google.javascript.jscomp.VariableMap variableMap19 = renamePrototypes18.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes20 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler4, false, charArray11, variableMap19);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        char[] charArray28 = new char[] { '#', '#', ' ' };
        com.google.javascript.jscomp.VariableMap variableMap29 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes30 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler23, true, charArray28, variableMap29);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler31 = null;
        char[] charArray33 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap34 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes35 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler31, true, charArray33, variableMap34);
        com.google.javascript.jscomp.VariableMap variableMap36 = renamePrototypes35.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap37 = renamePrototypes35.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap38 = renamePrototypes35.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes39 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler21, true, charArray28, variableMap38);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes40 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, false, charArray11, variableMap38);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler41 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler43 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler45 = null;
        char[] charArray47 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap48 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes49 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler45, true, charArray47, variableMap48);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler50 = null;
        char[] charArray52 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap53 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes54 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler50, true, charArray52, variableMap53);
        com.google.javascript.jscomp.VariableMap variableMap55 = renamePrototypes54.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap56 = renamePrototypes54.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes57 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler43, true, charArray47, variableMap56);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler58 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler60 = null;
        char[] charArray65 = new char[] { '#', '#', ' ' };
        com.google.javascript.jscomp.VariableMap variableMap66 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes67 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler60, true, charArray65, variableMap66);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler68 = null;
        char[] charArray70 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap71 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes72 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler68, true, charArray70, variableMap71);
        com.google.javascript.jscomp.VariableMap variableMap73 = renamePrototypes72.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes74 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler58, false, charArray65, variableMap73);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes75 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler41, false, charArray47, variableMap73);
        com.google.javascript.jscomp.VariableMap variableMap76 = renamePrototypes75.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap77 = renamePrototypes75.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes78 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, true, charArray11, variableMap77);
        com.google.javascript.rhino.Node node79 = null;
        com.google.javascript.rhino.Node node80 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes78.process(node79, node80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '#', ' ' });
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertNotNull(variableMap19);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { '#', '#', ' ' });
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] {});
        org.junit.Assert.assertNotNull(variableMap36);
        org.junit.Assert.assertNotNull(variableMap37);
        org.junit.Assert.assertNotNull(variableMap38);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] {});
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] {});
        org.junit.Assert.assertNotNull(variableMap55);
        org.junit.Assert.assertNotNull(variableMap56);
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertArrayEquals(charArray65, new char[] { '#', '#', ' ' });
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertArrayEquals(charArray70, new char[] {});
        org.junit.Assert.assertNotNull(variableMap73);
        org.junit.Assert.assertNotNull(variableMap76);
        org.junit.Assert.assertNotNull(variableMap77);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
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
        codeGenerator2.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addAllSiblings(node12);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        char[] charArray7 = new char[] { '#', '#', ' ' };
        com.google.javascript.jscomp.VariableMap variableMap8 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes9 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, true, charArray7, variableMap8);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        char[] charArray12 = new char[] {};
        com.google.javascript.jscomp.VariableMap variableMap13 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes14 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler10, true, charArray12, variableMap13);
        com.google.javascript.jscomp.VariableMap variableMap15 = renamePrototypes14.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap16 = renamePrototypes14.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap17 = renamePrototypes14.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes18 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, true, charArray7, variableMap17);
        com.google.javascript.jscomp.VariableMap variableMap19 = renamePrototypes18.getPropertyMap();
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes18.process(node20, node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '#', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(variableMap15);
        org.junit.Assert.assertNotNull(variableMap16);
        org.junit.Assert.assertNotNull(variableMap17);
        org.junit.Assert.assertNotNull(variableMap19);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node19, true, context21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator26.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator26.addList(node31, false);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator26.addList(node34, true, context36);
        codeGenerator2.addList(node23, true, context36);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer41 = null;
        java.nio.charset.Charset charset42 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator43 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer41, charset42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator43.addList(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator43.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer50 = null;
        java.nio.charset.Charset charset51 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator52 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer50, charset51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator52.addList(node53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator52.addList(node55);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer59 = null;
        java.nio.charset.Charset charset60 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator61 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer59, charset60);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator61.addList(node62);
        com.google.javascript.rhino.Node node64 = null;
        codeGenerator61.addList(node64, false);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator61.addList(node67, true);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator61.addArrayList(node70);
        com.google.javascript.rhino.Node node72 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context74 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator61.addList(node72, false, context74);
        codeGenerator52.addList(node57, true, context74);
        com.google.javascript.rhino.Node node77 = null;
        codeGenerator52.addAllSiblings(node77);
        com.google.javascript.rhino.Node node79 = null;
        codeGenerator52.addList(node79, false);
        com.google.javascript.rhino.Node node82 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context84 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator52.addList(node82, false, context84);
        codeGenerator43.addList(node48, false, context84);
        codeGenerator2.addList(node39, false, context84);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"'\\\"a4 // 4a\\\"'\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context74 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context74.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context84 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context84.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"#/hi!/#\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"#/hi!/#\"" + "'", str1, "\"#/hi!/#\"");
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"'/\\\"/hi!/\\\"/'\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addAllSiblings(node23);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
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
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator16.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        java.nio.charset.Charset charset24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23, charset24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator25.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator25.addList(node28, false);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator25.addList(node31, true);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator25.addArrayList(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator25.addList(node36, false, context38);
        codeGenerator16.addList(node21, true, context38);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator16.addAllSiblings(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator16.addList(node43, false);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator16.addList(node46, false, context48);
        codeGenerator2.addList(node12, false, context48);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator2.addList(node51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator2.addAllSiblings(node53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator2.addAllSiblings(node55);
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator23.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        java.nio.charset.Charset charset31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30, charset31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator32.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator32.addList(node38, true);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator32.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator32.addList(node43, false, context45);
        codeGenerator23.addList(node28, true, context45);
        codeGenerator2.addList(node19, true, context45);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator2.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator2.addArrayList(node51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator2.addArrayList(node53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator2.addArrayList(node55);
        com.google.javascript.rhino.Node node57 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/# a//a #/", '#', "/\"\\\"\\\\\\\"//\\\\\\\"\\\"\"/", "", "'\"///\\\\\"/4//hi!//4/\\\\\"///\"'", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#/# a//a #/#" + "'", str6, "#/# a//a #/#");
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'\\'/4//\"\"//#// /hi!/ //#//\"\"//4/\\''");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'\\'/4//\"\"//#// /hi!/ //#//\"\"//4/\\''/" + "'", str1, "/'\\'/4//\"\"//#// /hi!/ //#//\"\"//4/\\''/");
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node12, false, context14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addList(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator28.addList(node31, false);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator37.addArrayList(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator37.addAllSiblings(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator37.addList(node42, false);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator37.addList(node45, false);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator37.addList(node48, false, context50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator37.addList(node52, false);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer57 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator58 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator58.addArrayList(node59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator58.addAllSiblings(node61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator58.addList(node63, false);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator58.addList(node66, false);
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context71 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator58.addList(node69, false, context71);
        codeGenerator37.addList(node55, false, context71);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator37.addAllSiblings(node74);
        com.google.javascript.rhino.Node node76 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context78 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator37.addList(node76, false, context78);
        codeGenerator28.addList(node34, false, context78);
        codeGenerator1.addList(node24, true, context78);
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context71 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context71.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context78 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context78.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, false);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator17.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator17.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator17.addList(node28, false, context30);
        codeGenerator2.addList(node13, false, context30);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator2.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node35, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/ 4//\"\"//#// /hi!/ //#//\"\"//4//a//a//4//\"\"//#// /hi!/ //#//\"\"//4 /");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/ 4//\\\"\\\"//#// /hi!/ //#//\\\"\\\"//4//a//a//4//\\\"\\\"//#// /hi!/ //#//\\\"\\\"//4 /\"" + "'", str1, "\"/ 4//\\\"\\\"//#// /hi!/ //#//\\\"\\\"//4//a//a//4//\\\"\\\"//#// /hi!/ //#//\\\"\\\"//4 /\"");
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11, false);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//\"\\\"//\\\\\\\"/hi!/\\\\\\\"//\\\"\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//\\\"\\\\\\\"//\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"//\\\\\\\"\\\"//\"" + "'", str1, "\"//\\\"\\\\\\\"//\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"//\\\\\\\"\\\"//\"");
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/\\\"//////\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"//////\\\"/\"" + "'", str1, "\"/\\\"//////\\\"/\"");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node12, false, context14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        java.nio.charset.Charset charset26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25, charset26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator27.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator27.addList(node30, false);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        java.nio.charset.Charset charset36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35, charset36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator37.addList(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator37.addList(node40, false);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator37.addList(node43, true);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator37.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator37.addArrayList(node48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator37.addArrayList(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator37.addAllSiblings(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator37.addList(node54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context58 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator37.addList(node56, true, context58);
        codeGenerator27.addList(node33, false, context58);
        codeGenerator1.addList(node23, true, context58);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer64 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator65 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer64);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator65.addList(node66);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer70 = null;
        java.nio.charset.Charset charset71 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator72 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer70, charset71);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator72.addList(node73);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator72.addList(node75);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context79 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator72.addList(node77, true, context79);
        codeGenerator65.addList(node68, false, context79);
        codeGenerator1.addList(node62, false, context79);
        java.lang.Class<?> wildcardClass83 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context58 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context58.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context79 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context79.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"//\\\"\\\\\\\"//\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"//\\\\\\\"\\\"//\"", '4', "'\"\\'\\\\\"a4 // 4a\\\\\"\\'\"'", "a/4hi!4/\"#//#// /hi!/ //#////#// /hi!/ //#//#\"//\"a///a//a///a\"\"a///a//a///a\"\"#//#// /hi!/ //#////#// /hi!/ //#//#\"/hi!/\"a///a//a///a\"\"a///a//a///a\"\"#//#// /hi!/ //#////#// /hi!/ //#//#\"//\"#//#// /hi!/ //#////#// /hi!/ //#//#\"/4hi!4/a", "\"\\\"# a//a #\\\"\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4'\"\\'\\\\\"a4 // 4a\\\\\"\\'\"'//\"\\\"# a//a #\\\"\"'\"\\'\\\\\"a4 // 4a\\\\\"\\'\"'\"\\\"# a//a #\\\"\"\"\\\"# a//a #\\\"\"\"\\\"# a//a #\\\"\"'\"\\'\\\\\"a4 // 4a\\\\\"\\'\"'//\"\\\"# a//a #\\\"\"\"\\\"# a//a #\\\"\"\"\\\"# a//a #\\\"\"\"\\\"# a//a #\\\"\"\"\\\"# a//a #\\\"\"\"\\\"# a//a #\\\"\"\"\\\"# a//a #\\\"\"'\"\\'\\\\\"a4 // 4a\\\\\"\\'\"'/hi!/\"\\\"# a//a #\\\"\"\"\\\"# a//a #\\\"\"\"\\\"# a//a #\\\"\"\"\\\"# a//a #\\\"\"\"\\\"# a//a #\\\"\"\"\\\"# a//a #\\\"\"\"\\\"# a//a #\\\"\"'\"\\'\\\\\"a4 // 4a\\\\\"\\'\"'//\"\\\"# a//a #\\\"\"\"\\\"# a//a #\\\"\"\"\\\"# a//a #\\\"\"'\"\\'\\\\\"a4 // 4a\\\\\"\\'\"'\"\\\"# a//a #\\\"\"'\"\\'\\\\\"a4 // 4a\\\\\"\\'\"'//'\"\\'\\\\\"a4 // 4a\\\\\"\\'\"'4" + "'", str6, "4'\"\\'\\\\\"a4 // 4a\\\\\"\\'\"'//\"\\\"# a//a #\\\"\"'\"\\'\\\\\"a4 // 4a\\\\\"\\'\"'\"\\\"# a//a #\\\"\"\"\\\"# a//a #\\\"\"\"\\\"# a//a #\\\"\"'\"\\'\\\\\"a4 // 4a\\\\\"\\'\"'//\"\\\"# a//a #\\\"\"\"\\\"# a//a #\\\"\"\"\\\"# a//a #\\\"\"\"\\\"# a//a #\\\"\"\"\\\"# a//a #\\\"\"\"\\\"# a//a #\\\"\"\"\\\"# a//a #\\\"\"'\"\\'\\\\\"a4 // 4a\\\\\"\\'\"'/hi!/\"\\\"# a//a #\\\"\"\"\\\"# a//a #\\\"\"\"\\\"# a//a #\\\"\"\"\\\"# a//a #\\\"\"\"\\\"# a//a #\\\"\"\"\\\"# a//a #\\\"\"\"\\\"# a//a #\\\"\"'\"\\'\\\\\"a4 // 4a\\\\\"\\'\"'//\"\\\"# a//a #\\\"\"\"\\\"# a//a #\\\"\"\"\\\"# a//a #\\\"\"'\"\\'\\\\\"a4 // 4a\\\\\"\\'\"'\"\\\"# a//a #\\\"\"'\"\\'\\\\\"a4 // 4a\\\\\"\\'\"'//'\"\\'\\\\\"a4 // 4a\\\\\"\\'\"'4");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator11.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator11.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator11.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator11.addList(node22, false, context24);
        codeGenerator2.addList(node7, true, context24);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator2.addList(node27, false);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator2.addList(node30, true);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator2.addArrayList(node33);
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "44", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node16, true, context18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addList(node22, true);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator2.addList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator2.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node29, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node19, true, context21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addList(node23);
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node19, true, context21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        java.nio.charset.Charset charset26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25, charset26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator27.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator27.addList(node30, false);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator27.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator27.addList(node35, false, context37);
        codeGenerator2.addList(node23, false, context37);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        java.nio.charset.Charset charset43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer42, charset43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator44.addList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator44.addList(node47, false);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator44.addList(node50, false);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        java.nio.charset.Charset charset56 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator57 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer55, charset56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator57.addList(node58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator57.addList(node60, false);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator57.addList(node63, true);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator57.addArrayList(node66);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context70 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator57.addList(node68, false, context70);
        codeGenerator44.addList(node53, true, context70);
        codeGenerator2.addList(node40, false, context70);
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context70 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context70.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, false);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        java.nio.charset.Charset charset23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22, charset23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator24.addList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator24.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator24.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator35.addList(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator35.addList(node38, false);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator35.addList(node41, true);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator35.addArrayList(node44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator35.addList(node46, false, context48);
        codeGenerator24.addList(node31, true, context48);
        codeGenerator17.addList(node20, true, context48);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node15, context48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"///hi!///\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"///hi!///\"/" + "'", str2, "/\"///hi!///\"/");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("#//////'/\"hi!\"/'/////44/////'/\"hi!\"/'///////44//44//44/////'/\"hi!\"/'/////hi!//44//44//44/////'/\"hi!\"/'///////44/////'/\"hi!\"/'////////'/\"hi!\"/'//////#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#//////'/\"hi!\"/'/////44/////'/\"hi!\"/'///////44//44//44/////'/\"hi!\"/'/////hi!//44//44//44/////'/\"hi!\"/'///////44/////'/\"hi!\"/'////////'/\"hi!\"/'//////#" + "'", str1, "#//////'/\"hi!\"/'/////44/////'/\"hi!\"/'///////44//44//44/////'/\"hi!\"/'/////hi!//44//44//44/////'/\"hi!\"/'///////44/////'/\"hi!\"/'////////'/\"hi!\"/'//////#");
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'/4//\"\"//#// /hi!/ //#//\"\"//4/'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'/4//\\\"\\\"//#// /hi!/ //#//\\\"\\\"//4/'\"" + "'", str1, "\"'/4//\\\"\\\"//#// /hi!/ //#//\\\"\\\"//4/'\"");
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator11.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator11.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator11.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator11.addList(node22, false, context24);
        codeGenerator2.addList(node7, true, context24);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator2.addAllSiblings(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator2.addList(node29);
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }
}

