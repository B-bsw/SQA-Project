package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node3 = compiler1.parseTestCode("hi!");
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        com.google.javascript.rhino.Node node7 = compiler5.parseTestCode("hi!");
        compiler1.jsRoot = node7;
        com.google.javascript.jscomp.CodingConvention codingConvention9 = compiler1.defaultCodingConvention;
        compiler1.addToDebugLog("hi!");
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap12 = compiler1.getCssRenamingMap();
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        com.google.javascript.rhino.Node node16 = compiler14.parseTestCode("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = compiler14.options;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap18 = compiler14.getGlobalVarReferences();
        java.io.PrintStream printStream19 = null;
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler(printStream19);
        com.google.javascript.rhino.Node node22 = compiler20.parseTestCode("hi!");
        compiler14.prepareAst(node22);
        compiler1.externAndJsRoot = node22;
        com.google.javascript.jscomp.ScopeCreator scopeCreator25 = compiler1.getTypedScopeCreator();
        com.google.javascript.jscomp.Tracer tracer27 = compiler1.newTracer("hi!");
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initInputsByNameMap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(codingConvention9);
        org.junit.Assert.assertNull(cssRenamingMap12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(compilerOptions17);
        org.junit.Assert.assertNull(referenceMap18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(scopeCreator25);
        org.junit.Assert.assertNotNull(tracer27);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node3 = compiler1.parseTestCode("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler1.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler1.getMessages();
        compiler1.resetUniqueNameId();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler1.getErrors();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap8 = compiler1.getCssRenamingMap();
        boolean boolean9 = compiler1.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.Tracer tracer11 = compiler1.newTracer("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph12 = compiler1.getModuleGraph();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(compilerOptions4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertNull(cssRenamingMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tracer11);
        org.junit.Assert.assertNull(jSModuleGraph12);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node2 = compiler1.jsRoot;
        com.google.javascript.jscomp.SourceMap sourceMap3 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray4 = compiler1.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(sourceMap3);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node3 = compiler1.parseTestCode("hi!");
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        com.google.javascript.rhino.Node node7 = compiler5.parseTestCode("hi!");
        compiler1.jsRoot = node7;
        com.google.javascript.jscomp.CodingConvention codingConvention9 = compiler1.defaultCodingConvention;
        compiler1.addToDebugLog("hi!");
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap12 = compiler1.getCssRenamingMap();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList13 = compiler1.getExternsForTesting();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap14 = compiler1.getCssRenamingMap();
        com.google.javascript.rhino.Node node15 = compiler1.externAndJsRoot;
        com.google.javascript.jscomp.JSError jSError16 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(codingConvention9);
        org.junit.Assert.assertNull(cssRenamingMap12);
        org.junit.Assert.assertNull(compilerInputList13);
        org.junit.Assert.assertNull(cssRenamingMap14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node3 = compiler1.parseTestCode("hi!");
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        com.google.javascript.rhino.Node node7 = compiler5.parseTestCode("hi!");
        compiler1.jsRoot = node7;
        compiler1.reportCodeChange();
        com.google.javascript.rhino.Node node10 = compiler1.getRoot();
        com.google.javascript.rhino.Node node11 = compiler1.getRoot();
        boolean boolean12 = compiler1.precheck();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList13 = compiler1.getExternsForTesting();
        com.google.javascript.rhino.Node node14 = compiler1.jsRoot;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler1.getState();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(compilerInputList13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(intermediateState15);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.options;
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler5 = null;
        compiler4.removeChangeHandler(codeChangeHandler5);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList8 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList8, jSSourceFileArray7);
        com.google.javascript.jscomp.JSModule[] jSModuleArray10 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList11 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList11, jSModuleArray10);
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        com.google.javascript.rhino.Node node16 = compiler14.parseTestCode("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = compiler14.options;
        compiler4.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList8, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList11, compilerOptions17);
        compiler3.options = compilerOptions17;
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = compiler3.getOptions();
        compiler1.options = compilerOptions20;
        java.io.PrintStream printStream22 = null;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler(printStream22);
        com.google.javascript.rhino.Node node25 = compiler23.parseTestCode("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = compiler23.options;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap27 = compiler23.getGlobalVarReferences();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = compiler23.getTypeRegistry();
        com.google.javascript.rhino.Node node31 = compiler23.parseSyntheticCode("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n", "digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
        compiler1.externsRoot = node31;
        com.google.javascript.jscomp.VariableMap variableMap33 = compiler1.getPropertyMap();
        com.google.javascript.jscomp.JSModule jSModule34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray35 = compiler1.toSourceArray(jSModule34);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSModuleArray10);
        org.junit.Assert.assertArrayEquals(jSModuleArray10, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(compilerOptions17);
        org.junit.Assert.assertNotNull(compilerOptions20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(compilerOptions26);
        org.junit.Assert.assertNull(referenceMap27);
        org.junit.Assert.assertNotNull(jSTypeRegistry28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNull(variableMap33);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node3 = compiler1.parseTestCode("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler1.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler1.getMessages();
        compiler1.resetUniqueNameId();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler1.getErrors();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap8 = compiler1.getCssRenamingMap();
        java.lang.String str9 = compiler1.getAstDotGraph();
        boolean boolean10 = compiler1.precheck();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(compilerOptions4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertNull(cssRenamingMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node3 = compiler1.parseTestCode("hi!");
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList6 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList6, jSSourceFileArray5);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList9 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList9, jSSourceFileArray8);
        java.io.PrintStream printStream11 = null;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(printStream11);
        com.google.javascript.rhino.Node node14 = compiler12.parseTestCode("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler12.options;
        com.google.javascript.jscomp.Result result16 = compiler1.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList6, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList9, compilerOptions15);
        com.google.javascript.rhino.Node node17 = compiler1.getRoot();
        compiler1.addToDebugLog("");
        com.google.javascript.jscomp.Region region22 = compiler1.getSourceRegion("hi!", (int) '#');
        int int23 = compiler1.getWarningCount();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder24 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.io.PrintStream printStream26 = null;
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler(printStream26);
        com.google.javascript.rhino.Node node29 = compiler27.parseTestCode("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = compiler27.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray31 = compiler27.getMessages();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap32 = compiler27.getCssRenamingMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier33 = compiler27.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.ReverseAbstractInterpreter reverseAbstractInterpreter34 = compiler27.getReverseAbstractInterpreter();
        java.io.PrintStream printStream35 = null;
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler(printStream35);
        com.google.javascript.rhino.Node node38 = compiler36.parseTestCode("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = compiler36.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray40 = compiler36.getMessages();
        compiler36.resetUniqueNameId();
        com.google.javascript.jscomp.JSError[] jSErrorArray42 = compiler36.getErrors();
        java.io.PrintStream printStream43 = null;
        com.google.javascript.jscomp.Compiler compiler44 = new com.google.javascript.jscomp.Compiler(printStream43);
        com.google.javascript.rhino.Node node46 = compiler44.parseTestCode("hi!");
        boolean boolean47 = compiler44.hasErrors();
        java.io.PrintStream printStream48 = null;
        com.google.javascript.jscomp.Compiler compiler49 = new com.google.javascript.jscomp.Compiler(printStream48);
        com.google.javascript.rhino.Node node51 = compiler49.parseTestCode("hi!");
        java.io.PrintStream printStream52 = null;
        com.google.javascript.jscomp.Compiler compiler53 = new com.google.javascript.jscomp.Compiler(printStream52);
        com.google.javascript.rhino.Node node55 = compiler53.parseTestCode("hi!");
        compiler49.jsRoot = node55;
        java.io.PrintStream printStream57 = null;
        com.google.javascript.jscomp.Compiler compiler58 = new com.google.javascript.jscomp.Compiler(printStream57);
        com.google.javascript.rhino.Node node60 = compiler58.parseTestCode("hi!");
        compiler58.reportCodeChange();
        com.google.javascript.jscomp.TypeValidator typeValidator62 = compiler58.getTypeValidator();
        compiler58.removeInput("");
        java.io.PrintStream printStream65 = null;
        com.google.javascript.jscomp.Compiler compiler66 = new com.google.javascript.jscomp.Compiler(printStream65);
        com.google.javascript.rhino.Node node68 = compiler66.parseTestCode("hi!");
        java.io.PrintStream printStream69 = null;
        com.google.javascript.jscomp.Compiler compiler70 = new com.google.javascript.jscomp.Compiler(printStream69);
        com.google.javascript.rhino.Node node72 = compiler70.parseTestCode("hi!");
        compiler66.jsRoot = node72;
        compiler58.jsRoot = node72;
        boolean boolean75 = compiler44.areNodesEqualForInlining(node55, node72);
        compiler36.prepareAst(node72);
        java.io.PrintStream printStream77 = null;
        com.google.javascript.jscomp.Compiler compiler78 = new com.google.javascript.jscomp.Compiler(printStream77);
        com.google.javascript.jscomp.CompilerOptions compilerOptions79 = compiler78.options;
        compiler78.addToDebugLog("hi!");
        java.io.PrintStream printStream82 = null;
        com.google.javascript.jscomp.Compiler compiler83 = new com.google.javascript.jscomp.Compiler(printStream82);
        com.google.javascript.rhino.Node node85 = compiler83.parseTestCode("hi!");
        java.io.PrintStream printStream86 = null;
        com.google.javascript.jscomp.Compiler compiler87 = new com.google.javascript.jscomp.Compiler(printStream86);
        com.google.javascript.rhino.Node node89 = compiler87.parseTestCode("hi!");
        compiler83.jsRoot = node89;
        compiler78.externsRoot = node89;
        boolean boolean92 = compiler27.areNodesEqualForInlining(node72, node89);
        compiler1.toSource(codeBuilder24, (int) (short) 100, node89);
        boolean boolean94 = compiler1.acceptConstKeyword();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray5, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray8, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(compilerOptions15);
        org.junit.Assert.assertNotNull(result16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(region22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(compilerOptions30);
        org.junit.Assert.assertNotNull(jSErrorArray31);
        org.junit.Assert.assertNull(cssRenamingMap32);
        org.junit.Assert.assertNotNull(strSupplier33);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(compilerOptions39);
        org.junit.Assert.assertNotNull(jSErrorArray40);
        org.junit.Assert.assertNotNull(jSErrorArray42);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(typeValidator62);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNull(compilerOptions79);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node3 = compiler1.parseTestCode("hi!");
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        com.google.javascript.rhino.Node node7 = compiler5.parseTestCode("hi!");
        compiler1.jsRoot = node7;
        com.google.javascript.jscomp.CodingConvention codingConvention9 = compiler1.defaultCodingConvention;
        compiler1.addToDebugLog("hi!");
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap12 = compiler1.getCssRenamingMap();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList13 = compiler1.getExternsForTesting();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap14 = compiler1.getCssRenamingMap();
        com.google.javascript.jscomp.JSError[] jSErrorArray15 = compiler1.getWarnings();
        boolean boolean16 = compiler1.hasErrors();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler17 = null;
        compiler1.removeChangeHandler(codeChangeHandler17);
        com.google.javascript.jscomp.PassConfig passConfig19 = compiler1.createPassConfigInternal();
        java.lang.String str20 = compiler1.toSource();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(codingConvention9);
        org.junit.Assert.assertNull(cssRenamingMap12);
        org.junit.Assert.assertNull(compilerInputList13);
        org.junit.Assert.assertNull(cssRenamingMap14);
        org.junit.Assert.assertNotNull(jSErrorArray15);
        org.junit.Assert.assertArrayEquals(jSErrorArray15, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(passConfig19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder2 = codeBuilder0.append("hi!");
        int int3 = codeBuilder0.getColumnIndex();
        boolean boolean5 = codeBuilder0.endsWith("");
        boolean boolean7 = codeBuilder0.endsWith("");
        int int8 = codeBuilder0.getLineIndex();
        boolean boolean10 = codeBuilder0.endsWith("hi!hi!");
        int int11 = codeBuilder0.getLineIndex();
        java.lang.String str12 = codeBuilder0.toString();
        org.junit.Assert.assertNotNull(codeBuilder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node3 = compiler1.parseTestCode("hi!");
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler5 = null;
        compiler1.removeChangeHandler(codeChangeHandler5);
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler1.getErrors();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap8 = compiler1.getGlobalVarReferences();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler1.getErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler1.getErrors();
        com.google.javascript.jscomp.Tracer tracer12 = compiler1.newTracer("hi!hi!hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertNull(referenceMap8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertNotNull(jSErrorArray10);
        org.junit.Assert.assertNotNull(tracer12);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node3 = compiler1.parseTestCode("hi!");
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.TypeValidator typeValidator5 = compiler1.getTypeValidator();
        compiler1.removeInput("");
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList8 = compiler1.getInputsForTesting();
        compiler1.reportCodeChange();
        int int10 = compiler1.getWarningCount();
        com.google.javascript.jscomp.JSError jSError11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(typeValidator5);
        org.junit.Assert.assertNull(compilerInputList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node3 = compiler1.parseTestCode("hi!");
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList6 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList6, jSSourceFileArray5);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList9 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList9, jSSourceFileArray8);
        java.io.PrintStream printStream11 = null;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(printStream11);
        com.google.javascript.rhino.Node node14 = compiler12.parseTestCode("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler12.options;
        com.google.javascript.jscomp.Result result16 = compiler1.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList6, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList9, compilerOptions15);
        com.google.javascript.rhino.Node node17 = compiler1.getRoot();
        compiler1.addToDebugLog("");
        com.google.javascript.jscomp.CodingConvention codingConvention20 = compiler1.getCodingConvention();
        com.google.javascript.jscomp.Tracer tracer22 = compiler1.newTracer("hi!");
        com.google.javascript.jscomp.JSError[] jSErrorArray23 = compiler1.getWarnings();
        com.google.javascript.jscomp.JSError[] jSErrorArray24 = compiler1.getWarnings();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray5, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray8, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(compilerOptions15);
        org.junit.Assert.assertNotNull(result16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(codingConvention20);
        org.junit.Assert.assertNotNull(tracer22);
        org.junit.Assert.assertNotNull(jSErrorArray23);
        org.junit.Assert.assertArrayEquals(jSErrorArray23, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(jSErrorArray24);
        org.junit.Assert.assertArrayEquals(jSErrorArray24, new com.google.javascript.jscomp.JSError[] {});
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler1 = null;
        compiler0.removeChangeHandler(codeChangeHandler1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray3 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList4 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList4, jSSourceFileArray3);
        com.google.javascript.jscomp.JSModule[] jSModuleArray6 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList7 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList7, jSModuleArray6);
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        com.google.javascript.rhino.Node node12 = compiler10.parseTestCode("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler10.options;
        compiler0.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList4, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList7, compilerOptions13);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter16 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState17 = compiler0.getState();
        org.junit.Assert.assertNotNull(jSSourceFileArray3);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray3, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSModuleArray6);
        org.junit.Assert.assertArrayEquals(jSModuleArray6, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(jSTypeRegistry15);
        org.junit.Assert.assertNotNull(errorReporter16);
        org.junit.Assert.assertNotNull(intermediateState17);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node3 = compiler1.parseTestCode("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler1.options;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap5 = compiler1.getGlobalVarReferences();
        java.io.PrintStream printStream6 = null;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(printStream6);
        com.google.javascript.rhino.Node node9 = compiler7.parseTestCode("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler7.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler7.getMessages();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap12 = compiler7.getCssRenamingMap();
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        com.google.javascript.rhino.Node node16 = compiler14.parseTestCode("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = compiler14.options;
        compiler7.initOptions(compilerOptions17);
        compiler1.options = compilerOptions17;
        java.io.PrintStream printStream20 = null;
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler(printStream20);
        com.google.javascript.rhino.Node node22 = compiler21.jsRoot;
        com.google.javascript.jscomp.PassConfig passConfig23 = compiler21.createPassConfigInternal();
        compiler1.setPassConfig(passConfig23);
        com.google.javascript.jscomp.SourceMap sourceMap25 = compiler1.getSourceMap();
        com.google.javascript.jscomp.VariableMap variableMap26 = compiler1.getPropertyMap();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(compilerOptions4);
        org.junit.Assert.assertNull(referenceMap5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(compilerOptions10);
        org.junit.Assert.assertNotNull(jSErrorArray11);
        org.junit.Assert.assertNull(cssRenamingMap12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(compilerOptions17);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(passConfig23);
        org.junit.Assert.assertNull(sourceMap25);
        org.junit.Assert.assertNull(variableMap26);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node3 = compiler1.parseTestCode("hi!");
        boolean boolean4 = compiler1.hasErrors();
        java.io.PrintStream printStream5 = null;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(printStream5);
        com.google.javascript.rhino.Node node8 = compiler6.parseTestCode("hi!");
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        com.google.javascript.rhino.Node node12 = compiler10.parseTestCode("hi!");
        compiler6.jsRoot = node12;
        java.io.PrintStream printStream14 = null;
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler(printStream14);
        com.google.javascript.rhino.Node node17 = compiler15.parseTestCode("hi!");
        compiler15.reportCodeChange();
        com.google.javascript.jscomp.TypeValidator typeValidator19 = compiler15.getTypeValidator();
        compiler15.removeInput("");
        java.io.PrintStream printStream22 = null;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler(printStream22);
        com.google.javascript.rhino.Node node25 = compiler23.parseTestCode("hi!");
        java.io.PrintStream printStream26 = null;
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler(printStream26);
        com.google.javascript.rhino.Node node29 = compiler27.parseTestCode("hi!");
        compiler23.jsRoot = node29;
        compiler15.jsRoot = node29;
        boolean boolean32 = compiler1.areNodesEqualForInlining(node12, node29);
        com.google.javascript.jscomp.JSError[] jSErrorArray33 = compiler1.getErrors();
        com.google.javascript.jscomp.Tracer tracer35 = compiler1.newTracer("");
        compiler1.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState37 = compiler1.getState();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList38 = compiler1.getInputsForTesting();
        boolean boolean39 = compiler1.isInliningForbidden();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList40 = compiler1.getInputsInOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(typeValidator19);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(jSErrorArray33);
        org.junit.Assert.assertNotNull(tracer35);
        org.junit.Assert.assertNotNull(intermediateState37);
        org.junit.Assert.assertNull(compilerInputList38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler1 = null;
        compiler0.removeChangeHandler(codeChangeHandler1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray3 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList4 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList4, jSSourceFileArray3);
        com.google.javascript.jscomp.JSModule[] jSModuleArray6 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList7 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList7, jSModuleArray6);
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        com.google.javascript.rhino.Node node12 = compiler10.parseTestCode("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler10.options;
        compiler0.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList4, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList7, compilerOptions13);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = compiler0.getTypeRegistry();
        compiler0.parse();
        com.google.javascript.jscomp.JSError[] jSErrorArray17 = compiler0.getErrors();
        compiler0.setHasRegExpGlobalReferences(true);
        boolean boolean20 = compiler0.isIdeMode();
        int int21 = compiler0.getWarningCount();
        com.google.javascript.rhino.Node node24 = compiler0.parseSyntheticCode("hi!hi!", "");
        com.google.javascript.jscomp.CodingConvention codingConvention25 = compiler0.getCodingConvention();
        org.junit.Assert.assertNotNull(jSSourceFileArray3);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray3, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSModuleArray6);
        org.junit.Assert.assertArrayEquals(jSModuleArray6, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(jSTypeRegistry15);
        org.junit.Assert.assertNotNull(jSErrorArray17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(codingConvention25);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node3 = compiler1.parseTestCode("hi!");
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList6 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList6, jSSourceFileArray5);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList9 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList9, jSSourceFileArray8);
        java.io.PrintStream printStream11 = null;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(printStream11);
        com.google.javascript.rhino.Node node14 = compiler12.parseTestCode("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler12.options;
        com.google.javascript.jscomp.Result result16 = compiler1.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList6, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList9, compilerOptions15);
        com.google.javascript.rhino.Node node17 = compiler1.getRoot();
        com.google.javascript.jscomp.SourceMap sourceMap18 = compiler1.getSourceMap();
        compiler1.resetUniqueNameId();
        java.io.PrintStream printStream20 = null;
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler(printStream20);
        com.google.javascript.rhino.Node node22 = compiler21.jsRoot;
        com.google.javascript.jscomp.CodingConvention codingConvention23 = compiler21.defaultCodingConvention;
        compiler1.defaultCodingConvention = codingConvention23;
        java.io.PrintStream printStream25 = null;
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler(printStream25);
        com.google.javascript.rhino.Node node28 = compiler26.parseTestCode("hi!");
        java.io.PrintStream printStream29 = null;
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler(printStream29);
        com.google.javascript.rhino.Node node32 = compiler30.parseTestCode("hi!");
        compiler26.jsRoot = node32;
        com.google.javascript.jscomp.CodingConvention codingConvention34 = compiler26.defaultCodingConvention;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange35 = compiler26.recentChange;
        compiler1.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange35);
        java.lang.Exception exception38 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.throwInternalError("", exception38);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray5, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray8, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(compilerOptions15);
        org.junit.Assert.assertNotNull(result16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(sourceMap18);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(codingConvention23);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(codingConvention34);
        org.junit.Assert.assertNotNull(recentChange35);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node3 = compiler1.parseTestCode("hi!");
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        com.google.javascript.rhino.Node node7 = compiler5.parseTestCode("hi!");
        compiler1.jsRoot = node7;
        com.google.javascript.jscomp.CodingConvention codingConvention9 = compiler1.defaultCodingConvention;
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler1.getMessages();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList11 = compiler1.getExternsForTesting();
        com.google.javascript.jscomp.JsAst jsAst12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = compiler1.replaceIncrementalSourceAst(jsAst12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(codingConvention9);
        org.junit.Assert.assertNotNull(jSErrorArray10);
        org.junit.Assert.assertNull(compilerInputList11);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node3 = compiler1.parseTestCode("hi!");
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.TypeValidator typeValidator5 = compiler1.getTypeValidator();
        boolean boolean6 = compiler1.isIdeMode();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler1.getSourceMap();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(typeValidator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(sourceMap7);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node3 = compiler1.parseTestCode("hi!");
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList6 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList6, jSSourceFileArray5);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList9 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList9, jSSourceFileArray8);
        java.io.PrintStream printStream11 = null;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(printStream11);
        com.google.javascript.rhino.Node node14 = compiler12.parseTestCode("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler12.options;
        com.google.javascript.jscomp.Result result16 = compiler1.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList6, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList9, compilerOptions15);
        com.google.javascript.rhino.Node node17 = compiler1.getRoot();
        compiler1.addToDebugLog("");
        com.google.javascript.jscomp.Region region22 = compiler1.getSourceRegion("hi!", (int) '#');
        boolean boolean23 = compiler1.isInliningForbidden();
        com.google.javascript.jscomp.Region region26 = compiler1.getSourceRegion("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"SYN_BLOCK\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n", (int) '4');
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray5, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray8, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(compilerOptions15);
        org.junit.Assert.assertNotNull(result16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(region22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(region26);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node3 = compiler1.parseTestCode("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler1.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler1.getMessages();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap6 = compiler1.getCssRenamingMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = compiler1.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.Region region11 = compiler1.getSourceRegion("", (int) (short) 100);
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap12 = compiler1.getCssRenamingMap();
        com.google.javascript.jscomp.JSError[] jSErrorArray13 = compiler1.getErrors();
        java.io.PrintStream printStream14 = null;
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler(printStream14);
        com.google.javascript.rhino.Node node17 = compiler15.parseTestCode("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler15.options;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap19 = compiler15.getGlobalVarReferences();
        java.io.PrintStream printStream20 = null;
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler(printStream20);
        com.google.javascript.rhino.Node node23 = compiler21.parseTestCode("hi!");
        compiler15.prepareAst(node23);
        java.lang.String str25 = compiler1.toSource(node23);
        com.google.common.base.Supplier<java.lang.String> strSupplier26 = compiler1.getUniqueNameIdSupplier();
        compiler1.removeInput("");
        com.google.javascript.jscomp.parsing.Config config29 = compiler1.getParserConfig();
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap30 = null;
        java.io.PrintStream printStream31 = null;
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler(printStream31);
        com.google.javascript.rhino.Node node34 = compiler32.parseTestCode("hi!");
        java.io.PrintStream printStream35 = null;
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler(printStream35);
        com.google.javascript.rhino.Node node38 = compiler36.parseTestCode("hi!");
        compiler32.jsRoot = node38;
        com.google.javascript.jscomp.CodingConvention codingConvention40 = compiler32.defaultCodingConvention;
        java.io.PrintStream printStream41 = null;
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler(printStream41);
        com.google.javascript.rhino.Node node44 = compiler42.parseTestCode("hi!");
        compiler42.reportCodeChange();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray46 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList47 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList47, jSSourceFileArray46);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray49 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList50 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList50, jSSourceFileArray49);
        java.io.PrintStream printStream52 = null;
        com.google.javascript.jscomp.Compiler compiler53 = new com.google.javascript.jscomp.Compiler(printStream52);
        com.google.javascript.rhino.Node node55 = compiler53.parseTestCode("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions56 = compiler53.options;
        com.google.javascript.jscomp.Result result57 = compiler42.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList47, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList50, compilerOptions56);
        com.google.javascript.rhino.Node node58 = compiler42.getRoot();
        compiler42.addToDebugLog("");
        com.google.javascript.jscomp.CodingConvention codingConvention61 = compiler42.getCodingConvention();
        compiler32.defaultCodingConvention = codingConvention61;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker63 = compiler32.tracker;
        java.io.PrintStream printStream64 = null;
        com.google.javascript.jscomp.Compiler compiler65 = new com.google.javascript.jscomp.Compiler(printStream64);
        com.google.javascript.rhino.Node node67 = compiler65.parseTestCode("hi!");
        compiler65.reportCodeChange();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray69 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList70 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList70, jSSourceFileArray69);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray72 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList73 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList73, jSSourceFileArray72);
        java.io.PrintStream printStream75 = null;
        com.google.javascript.jscomp.Compiler compiler76 = new com.google.javascript.jscomp.Compiler(printStream75);
        com.google.javascript.rhino.Node node78 = compiler76.parseTestCode("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions79 = compiler76.options;
        com.google.javascript.jscomp.Result result80 = compiler65.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList70, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList73, compilerOptions79);
        com.google.javascript.rhino.Node node81 = compiler65.getRoot();
        compiler65.addToDebugLog("");
        com.google.javascript.jscomp.Region region86 = compiler65.getSourceRegion("hi!", (int) '#');
        com.google.javascript.jscomp.CompilerOptions compilerOptions87 = compiler65.getOptions();
        compiler32.initOptions(compilerOptions87);
        com.google.javascript.rhino.Node node90 = compiler32.parseSyntheticCode("hi!");
        // The following exception was thrown during execution in test generation
        try {
            compiler1.updateGlobalVarReferences(varMap30, node90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(compilerOptions4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertNull(cssRenamingMap6);
        org.junit.Assert.assertNotNull(strSupplier7);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
        org.junit.Assert.assertNull(region11);
        org.junit.Assert.assertNull(cssRenamingMap12);
        org.junit.Assert.assertNotNull(jSErrorArray13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(compilerOptions18);
        org.junit.Assert.assertNull(referenceMap19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strSupplier26);
        org.junit.Assert.assertNotNull(config29);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(codingConvention40);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(jSSourceFileArray46);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray46, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray49);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray49, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(compilerOptions56);
        org.junit.Assert.assertNotNull(result57);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNotNull(codingConvention61);
        org.junit.Assert.assertNull(performanceTracker63);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(jSSourceFileArray69);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray69, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray72);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray72, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(compilerOptions79);
        org.junit.Assert.assertNotNull(result80);
        org.junit.Assert.assertNull(node81);
        org.junit.Assert.assertNull(region86);
        org.junit.Assert.assertNotNull(compilerOptions87);
        org.junit.Assert.assertNotNull(node90);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler1 = null;
        compiler0.removeChangeHandler(codeChangeHandler1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray3 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList4 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList4, jSSourceFileArray3);
        com.google.javascript.jscomp.JSModule[] jSModuleArray6 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList7 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList7, jSModuleArray6);
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        com.google.javascript.rhino.Node node12 = compiler10.parseTestCode("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler10.options;
        compiler0.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList4, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList7, compilerOptions13);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = compiler0.getTypeRegistry();
        compiler0.parse();
        com.google.javascript.jscomp.JSError[] jSErrorArray17 = compiler0.getErrors();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph18 = compiler0.getModuleGraph();
        org.junit.Assert.assertNotNull(jSSourceFileArray3);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray3, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSModuleArray6);
        org.junit.Assert.assertArrayEquals(jSModuleArray6, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(jSTypeRegistry15);
        org.junit.Assert.assertNotNull(jSErrorArray17);
        org.junit.Assert.assertNull(jSModuleGraph18);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node3 = compiler1.parseTestCode("hi!");
        boolean boolean4 = compiler1.hasErrors();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler1.getCodingConvention();
        com.google.javascript.jscomp.Result result6 = compiler1.getResult();
        com.google.javascript.rhino.Node node7 = compiler1.externAndJsRoot;
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler1.getSourceMap();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertNotNull(result6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(sourceMap8);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler1 = null;
        compiler0.removeChangeHandler(codeChangeHandler1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray3 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList4 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList4, jSSourceFileArray3);
        com.google.javascript.jscomp.JSModule[] jSModuleArray6 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList7 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList7, jSModuleArray6);
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        com.google.javascript.rhino.Node node12 = compiler10.parseTestCode("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler10.options;
        compiler0.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList4, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList7, compilerOptions13);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = compiler0.getTypeRegistry();
        compiler0.parse();
        com.google.javascript.jscomp.JSError[] jSErrorArray17 = compiler0.getErrors();
        com.google.javascript.rhino.Node node19 = compiler0.parseSyntheticCode("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
        com.google.javascript.jscomp.CodingConvention codingConvention20 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker21 = null;
        compiler0.tracker = performanceTracker21;
        org.junit.Assert.assertNotNull(jSSourceFileArray3);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray3, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSModuleArray6);
        org.junit.Assert.assertArrayEquals(jSModuleArray6, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(jSTypeRegistry15);
        org.junit.Assert.assertNotNull(jSErrorArray17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(codingConvention20);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node3 = compiler1.parseTestCode("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler1.options;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap5 = compiler1.getGlobalVarReferences();
        compiler1.disableThreads();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups7 = compiler1.getDiagnosticGroups();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList8 = compiler1.getExternsForTesting();
        boolean boolean9 = compiler1.isIdeMode();
        com.google.javascript.rhino.Node node10 = compiler1.jsRoot;
        java.lang.String str11 = compiler1.toSource();
        java.io.PrintStream printStream12 = null;
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler(printStream12);
        com.google.javascript.rhino.Node node15 = compiler13.parseTestCode("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler13.options;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap17 = compiler13.getGlobalVarReferences();
        compiler13.disableThreads();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap19 = null;
        compiler13.setCssRenamingMap(cssRenamingMap19);
        compiler13.removeInput("");
        com.google.javascript.jscomp.Tracer tracer24 = compiler13.newTracer("hi!hi!hi!");
        compiler1.stopTracer(tracer24, "hi!hi!hi!");
        boolean boolean27 = compiler1.hasHaltingErrors();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(compilerOptions4);
        org.junit.Assert.assertNull(referenceMap5);
        org.junit.Assert.assertNotNull(diagnosticGroups7);
        org.junit.Assert.assertNull(compilerInputList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(compilerOptions16);
        org.junit.Assert.assertNull(referenceMap17);
        org.junit.Assert.assertNotNull(tracer24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node3 = compiler1.parseTestCode("hi!");
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        com.google.javascript.rhino.Node node7 = compiler5.parseTestCode("hi!");
        compiler1.jsRoot = node7;
        com.google.javascript.jscomp.CodingConvention codingConvention9 = compiler1.defaultCodingConvention;
        compiler1.addToDebugLog("hi!");
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap12 = compiler1.getCssRenamingMap();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList13 = compiler1.getExternsForTesting();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap14 = compiler1.getCssRenamingMap();
        java.io.PrintStream printStream15 = null;
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler(printStream15);
        com.google.javascript.rhino.Node node17 = compiler16.jsRoot;
        com.google.javascript.jscomp.CodingConvention codingConvention18 = compiler16.defaultCodingConvention;
        java.io.PrintStream printStream19 = null;
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler(printStream19);
        com.google.javascript.rhino.Node node22 = compiler20.parseTestCode("hi!");
        java.io.PrintStream printStream23 = null;
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler(printStream23);
        com.google.javascript.rhino.Node node26 = compiler24.parseTestCode("hi!");
        compiler20.jsRoot = node26;
        compiler16.externsRoot = node26;
        compiler1.jsRoot = node26;
        java.lang.String str30 = compiler1.toSource();
        com.google.javascript.rhino.Node node31 = compiler1.externAndJsRoot;
        com.google.javascript.jscomp.CodingConvention codingConvention32 = compiler1.getCodingConvention();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = compiler1.getTypeRegistry();
        java.lang.String str34 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.CodingConvention codingConvention35 = compiler1.defaultCodingConvention;
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(codingConvention9);
        org.junit.Assert.assertNull(cssRenamingMap12);
        org.junit.Assert.assertNull(compilerInputList13);
        org.junit.Assert.assertNull(cssRenamingMap14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(codingConvention18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(codingConvention32);
        org.junit.Assert.assertNotNull(jSTypeRegistry33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n" + "'", str34, "digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
        org.junit.Assert.assertNotNull(codingConvention35);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node3 = compiler1.parseTestCode("hi!");
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler5 = null;
        compiler1.removeChangeHandler(codeChangeHandler5);
        com.google.javascript.jscomp.Region region9 = compiler1.getSourceRegion("", (int) (byte) -1);
        compiler1.resetUniqueNameId();
        compiler1.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups12 = compiler1.getDiagnosticGroups();
        compiler1.disableThreads();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertNotNull(diagnosticGroups12);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node3 = compiler1.parseTestCode("hi!");
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        com.google.javascript.rhino.Node node7 = compiler5.parseTestCode("hi!");
        compiler1.jsRoot = node7;
        com.google.javascript.jscomp.CodingConvention codingConvention9 = compiler1.defaultCodingConvention;
        compiler1.addToDebugLog("hi!");
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap12 = compiler1.getCssRenamingMap();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList13 = compiler1.getExternsForTesting();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap14 = compiler1.getCssRenamingMap();
        java.io.PrintStream printStream15 = null;
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler(printStream15);
        com.google.javascript.rhino.Node node17 = compiler16.jsRoot;
        com.google.javascript.jscomp.CodingConvention codingConvention18 = compiler16.defaultCodingConvention;
        java.io.PrintStream printStream19 = null;
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler(printStream19);
        com.google.javascript.rhino.Node node22 = compiler20.parseTestCode("hi!");
        java.io.PrintStream printStream23 = null;
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler(printStream23);
        com.google.javascript.rhino.Node node26 = compiler24.parseTestCode("hi!");
        compiler20.jsRoot = node26;
        compiler16.externsRoot = node26;
        compiler1.jsRoot = node26;
        java.lang.String str30 = compiler1.toSource();
        com.google.javascript.rhino.Node node31 = compiler1.jsRoot;
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = compiler1.options;
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(codingConvention9);
        org.junit.Assert.assertNull(cssRenamingMap12);
        org.junit.Assert.assertNull(compilerInputList13);
        org.junit.Assert.assertNull(cssRenamingMap14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(codingConvention18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(compilerOptions32);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node3 = compiler1.parseTestCode("hi!");
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        com.google.javascript.rhino.Node node7 = compiler5.parseTestCode("hi!");
        compiler1.jsRoot = node7;
        com.google.javascript.jscomp.CodingConvention codingConvention9 = compiler1.defaultCodingConvention;
        java.io.PrintStream printStream10 = null;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler(printStream10);
        com.google.javascript.rhino.Node node13 = compiler11.parseTestCode("hi!");
        compiler11.reportCodeChange();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray15 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList16 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList16, jSSourceFileArray15);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray18 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList19 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList19, jSSourceFileArray18);
        java.io.PrintStream printStream21 = null;
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler(printStream21);
        com.google.javascript.rhino.Node node24 = compiler22.parseTestCode("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = compiler22.options;
        com.google.javascript.jscomp.Result result26 = compiler11.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList16, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList19, compilerOptions25);
        com.google.javascript.rhino.Node node27 = compiler11.getRoot();
        compiler11.addToDebugLog("");
        com.google.javascript.jscomp.CodingConvention codingConvention30 = compiler11.getCodingConvention();
        compiler1.defaultCodingConvention = codingConvention30;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker32 = compiler1.tracker;
        java.io.PrintStream printStream33 = null;
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler(printStream33);
        com.google.javascript.rhino.Node node36 = compiler34.parseTestCode("hi!");
        compiler34.reportCodeChange();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray38 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList39 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList39, jSSourceFileArray38);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray41 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList42 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList42, jSSourceFileArray41);
        java.io.PrintStream printStream44 = null;
        com.google.javascript.jscomp.Compiler compiler45 = new com.google.javascript.jscomp.Compiler(printStream44);
        com.google.javascript.rhino.Node node47 = compiler45.parseTestCode("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions48 = compiler45.options;
        com.google.javascript.jscomp.Result result49 = compiler34.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList39, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList42, compilerOptions48);
        com.google.javascript.rhino.Node node50 = compiler34.getRoot();
        compiler34.addToDebugLog("");
        com.google.javascript.jscomp.Region region55 = compiler34.getSourceRegion("hi!", (int) '#');
        com.google.javascript.jscomp.CompilerOptions compilerOptions56 = compiler34.getOptions();
        compiler1.initOptions(compilerOptions56);
        java.io.PrintStream printStream58 = null;
        com.google.javascript.jscomp.Compiler compiler59 = new com.google.javascript.jscomp.Compiler(printStream58);
        com.google.javascript.rhino.Node node61 = compiler59.parseTestCode("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions62 = compiler59.options;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap63 = compiler59.getGlobalVarReferences();
        compiler59.disableThreads();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups65 = compiler59.getDiagnosticGroups();
        com.google.javascript.jscomp.ReverseAbstractInterpreter reverseAbstractInterpreter66 = compiler59.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.Tracer tracer68 = compiler59.newTracer("");
        compiler1.stopTracer(tracer68, "");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder71 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder73 = codeBuilder71.append("hi!");
        java.lang.String str74 = codeBuilder71.toString();
        java.io.PrintStream printStream76 = null;
        com.google.javascript.jscomp.Compiler compiler77 = new com.google.javascript.jscomp.Compiler(printStream76);
        com.google.javascript.rhino.Node node79 = compiler77.parseTestCode("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions80 = compiler77.options;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap81 = compiler77.getGlobalVarReferences();
        com.google.javascript.jscomp.SourceMap sourceMap82 = compiler77.getSourceMap();
        com.google.javascript.rhino.Node node84 = compiler77.parseTestCode("");
        compiler1.toSource(codeBuilder71, (int) (short) 100, node84);
        int int86 = codeBuilder71.getLineIndex();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder88 = codeBuilder71.append("");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder90 = codeBuilder71.append("hi!digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\ndigraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
        int int91 = codeBuilder90.getLength();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(codingConvention9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(jSSourceFileArray15);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray15, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray18);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray18, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(compilerOptions25);
        org.junit.Assert.assertNotNull(result26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(codingConvention30);
        org.junit.Assert.assertNull(performanceTracker32);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(jSSourceFileArray38);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray38, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray41);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray41, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(compilerOptions48);
        org.junit.Assert.assertNotNull(result49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(region55);
        org.junit.Assert.assertNotNull(compilerOptions56);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(compilerOptions62);
        org.junit.Assert.assertNull(referenceMap63);
        org.junit.Assert.assertNotNull(diagnosticGroups65);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter66);
        org.junit.Assert.assertNotNull(tracer68);
        org.junit.Assert.assertNotNull(codeBuilder73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(compilerOptions80);
        org.junit.Assert.assertNull(referenceMap81);
        org.junit.Assert.assertNull(sourceMap82);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(codeBuilder88);
        org.junit.Assert.assertNotNull(codeBuilder90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 328 + "'", int91 == 328);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node3 = compiler1.parseTestCode("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler1.options;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap5 = compiler1.getGlobalVarReferences();
        compiler1.disableThreads();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups7 = compiler1.getDiagnosticGroups();
        com.google.javascript.jscomp.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.Tracer tracer10 = compiler1.newTracer("");
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList11 = compiler1.getExternsForTesting();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler1.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray13 = compiler1.getErrors();
        com.google.javascript.jscomp.TypeValidator typeValidator14 = compiler1.getTypeValidator();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(compilerOptions4);
        org.junit.Assert.assertNull(referenceMap5);
        org.junit.Assert.assertNotNull(diagnosticGroups7);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
        org.junit.Assert.assertNotNull(tracer10);
        org.junit.Assert.assertNull(compilerInputList11);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(jSErrorArray13);
        org.junit.Assert.assertNotNull(typeValidator14);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder2 = codeBuilder0.append("hi!");
        int int3 = codeBuilder0.getColumnIndex();
        boolean boolean5 = codeBuilder0.endsWith("");
        boolean boolean7 = codeBuilder0.endsWith("");
        int int8 = codeBuilder0.getLineIndex();
        boolean boolean10 = codeBuilder0.endsWith("hi!hi!");
        int int11 = codeBuilder0.getLineIndex();
        int int12 = codeBuilder0.getColumnIndex();
        org.junit.Assert.assertNotNull(codeBuilder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node3 = compiler1.parseTestCode("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler1.options;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap5 = compiler1.getGlobalVarReferences();
        java.io.PrintStream printStream6 = null;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(printStream6);
        com.google.javascript.rhino.Node node9 = compiler7.parseTestCode("hi!");
        compiler1.prepareAst(node9);
        compiler1.startPass("");
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler1.tracker = performanceTracker13;
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler1.getVariableMap();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap16 = compiler1.getFunctionalInformationMap();
        int int17 = compiler1.getErrorCount();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(compilerOptions4);
        org.junit.Assert.assertNull(referenceMap5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(variableMap15);
        org.junit.Assert.assertNull(functionInformationMap16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node3 = compiler1.parseTestCode("hi!");
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        com.google.javascript.rhino.Node node7 = compiler5.parseTestCode("hi!");
        compiler1.jsRoot = node7;
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.Tracer tracer11 = compiler1.newTracer("hi!");
        com.google.javascript.jscomp.SourceMap sourceMap12 = compiler1.getSourceMap();
        compiler1.removeTryCatchFinally();
        boolean boolean14 = compiler1.hasErrors();
        com.google.javascript.rhino.Node node15 = compiler1.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap16 = compiler1.getFunctionalInformationMap();
        com.google.javascript.rhino.Node node19 = compiler1.parseSyntheticCode("hi!", "");
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap20 = compiler1.getCssRenamingMap();
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph21 = compiler1.computeCFG();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(tracer11);
        org.junit.Assert.assertNull(sourceMap12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(functionInformationMap16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(cssRenamingMap20);
        org.junit.Assert.assertNotNull(nodeControlFlowGraph21);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node3 = compiler1.parseTestCode("hi!");
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.TypeValidator typeValidator5 = compiler1.getTypeValidator();
        compiler1.removeInput("");
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList8 = compiler1.getInputsForTesting();
        compiler1.addToDebugLog("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
        // The following exception was thrown during execution in test generation
        try {
            compiler1.rebuildInputsFromModules();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(typeValidator5);
        org.junit.Assert.assertNull(compilerInputList8);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler1 = null;
        compiler0.removeChangeHandler(codeChangeHandler1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray3 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList4 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList4, jSSourceFileArray3);
        com.google.javascript.jscomp.JSModule[] jSModuleArray6 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList7 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList7, jSModuleArray6);
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        com.google.javascript.rhino.Node node12 = compiler10.parseTestCode("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler10.options;
        compiler0.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList4, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList7, compilerOptions13);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = null;
        compiler0.tracker = performanceTracker15;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter17 = compiler0.getDefaultErrorReporter();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.VariableMap variableMap19 = compiler0.getVariableMap();
        com.google.javascript.jscomp.TypeValidator typeValidator20 = compiler0.getTypeValidator();
        compiler0.reportCodeChange();
        org.junit.Assert.assertNotNull(jSSourceFileArray3);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray3, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSModuleArray6);
        org.junit.Assert.assertArrayEquals(jSModuleArray6, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(errorReporter17);
        org.junit.Assert.assertNotNull(jSTypeRegistry18);
        org.junit.Assert.assertNull(variableMap19);
        org.junit.Assert.assertNotNull(typeValidator20);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node3 = compiler1.parseTestCode("hi!");
        boolean boolean4 = compiler1.hasErrors();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler1.getCodingConvention();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups6 = compiler1.getDiagnosticGroups();
        compiler1.setHasRegExpGlobalReferences(false);
        com.google.javascript.jscomp.CodingConvention codingConvention9 = compiler1.defaultCodingConvention;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange10 = compiler1.recentChange;
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertNotNull(diagnosticGroups6);
        org.junit.Assert.assertNotNull(codingConvention9);
        org.junit.Assert.assertNotNull(recentChange10);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node3 = compiler1.parseTestCode("hi!");
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler5 = null;
        compiler1.removeChangeHandler(codeChangeHandler5);
        com.google.javascript.jscomp.Region region9 = compiler1.getSourceRegion("", (int) (byte) -1);
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler11 = null;
        compiler10.removeChangeHandler(codeChangeHandler11);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList14 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList14, jSSourceFileArray13);
        com.google.javascript.jscomp.JSModule[] jSModuleArray16 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList17 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList17, jSModuleArray16);
        java.io.PrintStream printStream19 = null;
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler(printStream19);
        com.google.javascript.rhino.Node node22 = compiler20.parseTestCode("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = compiler20.options;
        compiler10.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList14, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList17, compilerOptions23);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = compiler10.getTypeRegistry();
        compiler10.parse();
        boolean boolean27 = compiler10.hasErrors();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList28 = compiler10.getInputsInOrder();
        java.io.PrintStream printStream29 = null;
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler(printStream29);
        com.google.javascript.rhino.Node node32 = compiler30.parseTestCode("hi!");
        compiler30.reportCodeChange();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray34 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList35 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList35, jSSourceFileArray34);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray37 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList38 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList38, jSSourceFileArray37);
        java.io.PrintStream printStream40 = null;
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler(printStream40);
        com.google.javascript.rhino.Node node43 = compiler41.parseTestCode("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions44 = compiler41.options;
        com.google.javascript.jscomp.Result result45 = compiler30.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList35, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList38, compilerOptions44);
        com.google.javascript.rhino.Node node46 = compiler30.getRoot();
        compiler30.addToDebugLog("");
        java.io.PrintStream printStream49 = null;
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler(printStream49);
        com.google.javascript.rhino.Node node52 = compiler50.parseTestCode("hi!");
        compiler50.reportCodeChange();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler54 = null;
        compiler50.removeChangeHandler(codeChangeHandler54);
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler56 = null;
        compiler50.removeChangeHandler(codeChangeHandler56);
        compiler50.removeInput("hi!");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState60 = compiler50.getState();
        compiler30.setState(intermediateState60);
        java.io.PrintStream printStream62 = null;
        com.google.javascript.jscomp.Compiler compiler63 = new com.google.javascript.jscomp.Compiler(printStream62);
        com.google.javascript.rhino.Node node65 = compiler63.parseTestCode("hi!");
        java.io.PrintStream printStream66 = null;
        com.google.javascript.jscomp.Compiler compiler67 = new com.google.javascript.jscomp.Compiler(printStream66);
        com.google.javascript.rhino.Node node69 = compiler67.parseTestCode("hi!");
        compiler63.jsRoot = node69;
        com.google.javascript.jscomp.CodingConvention codingConvention71 = compiler63.defaultCodingConvention;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange72 = compiler63.recentChange;
        compiler30.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange72);
        compiler10.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange72);
        compiler1.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange72);
        java.lang.String str76 = compiler1.getAstDotGraph();
        java.io.PrintStream printStream77 = null;
        com.google.javascript.jscomp.Compiler compiler78 = new com.google.javascript.jscomp.Compiler(printStream77);
        com.google.javascript.rhino.Node node80 = compiler78.parseTestCode("hi!");
        java.io.PrintStream printStream81 = null;
        com.google.javascript.jscomp.Compiler compiler82 = new com.google.javascript.jscomp.Compiler(printStream81);
        com.google.javascript.rhino.Node node84 = compiler82.parseTestCode("hi!");
        compiler78.jsRoot = node84;
        com.google.javascript.jscomp.CodingConvention codingConvention86 = compiler78.defaultCodingConvention;
        com.google.javascript.rhino.Node node87 = compiler78.getRoot();
        com.google.javascript.jscomp.CompilerOptions compilerOptions88 = compiler78.getOptions();
        compiler1.initOptions(compilerOptions88);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray13, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSModuleArray16);
        org.junit.Assert.assertArrayEquals(jSModuleArray16, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(compilerOptions23);
        org.junit.Assert.assertNotNull(jSTypeRegistry25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(compilerInputList28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(jSSourceFileArray34);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray34, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray37);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray37, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(compilerOptions44);
        org.junit.Assert.assertNotNull(result45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(intermediateState60);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(codingConvention71);
        org.junit.Assert.assertNotNull(recentChange72);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNotNull(codingConvention86);
        org.junit.Assert.assertNull(node87);
        org.junit.Assert.assertNotNull(compilerOptions88);
    }
}

